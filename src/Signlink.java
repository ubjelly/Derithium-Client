import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;

public class Signlink implements Runnable {

   public static String javaVersion;
   public FileOnDisk[] aClass122Array1197;
   public FileOnDisk aClass122_1198 = null;
   public EventQueue eventQueue;
   private Thread aThread1200;
   private boolean aBoolean1201 = false;
   public static String osName;
   private SignlinkNode aClass64_1203 = null;
   public static String publicParentPath;
   public FileOnDisk aClass122_1204 = null;
   public static String osNameRaw;
   private MouseImp aSensor1206;
   public FileOnDisk aClass122_1207 = null;
   private FullscreenImp fullscreenImpl;
   private static String homeDir;
   public static String osVersionRaw;
   private static Hashtable aHashtable1211 = new Hashtable(16);
   static String aString1212;
   private SignlinkNode aClass64_1213 = null;
   public static int anInt1214 = 1;
   static int anInt1215;
   public static String javaVendor;
   private Interface1 anInterface1_1217;
   public static String osArchRaw;
   public Applet thisApplet = null;
   public static Method cycleRootMethod;
   static volatile long aLong1221 = 0L;

   public final void method1431(int var1) {
      if(var1 != 0) {
         this.method1442((Class)null, 99);
      }

      aLong1221 = TimeUtil.currentTimeMillis() - -5000L;
   }

   public final boolean fullscreenImpExist() {
      return this.fullscreenImpl != null;
   }

   public final SignlinkNode getPreferences(String var1) {
      return this.method1435(12, 0, var1, 0);
   }

   public final SignlinkNode method1434(int[] var1, int var2, int var3, Component var4, Point var5, int var6) {
      return var2 != 10000?null:this.method1435(17, var6, new Object[]{var4, var1, var5}, var3);
   }

   private final SignlinkNode method1435(int var1, int var2, Object var3, int var4) {
      SignlinkNode var6 = new SignlinkNode();
      var6.anInt980 = var2;
      var6.integerData = var4;
      var6.type = var1;
      var6.objectData = var3;
      synchronized(this) {
    	  if(this.aClass64_1203 != null) {
    		  this.aClass64_1203.prev = var6;
    		  this.aClass64_1203 = var6;
    	  } else {
    		  this.aClass64_1203 = this.aClass64_1213 = var6;
    	  }

    	  this.notify();
    	  return var6;
      }
   }

   public final SignlinkNode revertBackToResizable(Frame var1) {
      return this.method1435(7, 0, var1, 0);
   }

   public final SignlinkNode method1437(int var1, int var2, Component var3, int var4) {
      if(var1 != 14) {
         return null;
      } else {
         Point var5 = var3.getLocationOnScreen();
         return this.method1435(14, var4 - -var5.y, (Object)null, var5.x + var2);
      }
   }

   private static final FileOnDisk method1438(boolean var0, String var1) {
      if(var0) {
         method1438(true, (String)null);
      }

      String[] var2 = new String[]{"c:/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", homeDir, "/tmp/", ""};

      for(int var3 = 0; var2.length > var3; ++var3) {
         String var4 = var2[var3];
         if(var4.length() <= 0 || (new File(var4)).exists()) {
            try {
               FileOnDisk var5 = new FileOnDisk(new File(var4, "jagex_" + var1 + "_preferences.dat"), "rw");
               return var5;
            } catch (Exception var6) {
               ;
            }
         }
      }

      return null;
   }

   public final SignlinkNode method1439(boolean var1, URL var2) {
      if(var1) {
         this.aClass122_1204 = null;
      }

      return this.method1435(4, 0, var2, 0);
   }

   public final SignlinkNode method1440(boolean var1, int var2, Component var3) {
      int var4 = 34 % ((-10 - var2) / 52);
      return this.method1435(15, 0, var3, var1?1:0);
   }

   public final SignlinkNode startConnection(String var2, int var3) {
      return this.method1435(1, 0, var2, var3);
   }

   public final SignlinkNode method1442(Class var1, int var2) {
      return var2 != 0?null:this.method1435(11, 0, var1, 0);
   }

   public final SignlinkNode method1443(Class var1, Class[] var2, int var3, String var4) {
      if(var3 > -7) {
         homeDir = null;
      }

      return this.method1435(8, 0, new Object[]{var1, var4, var2}, 0);
   }

   public final void run() {
      while(true) {
         SignlinkNode var1;
         synchronized(this) {
            while(true) {
               if(this.aBoolean1201) {
                  return;
               }

               if(this.aClass64_1213 != null) {
                  var1 = this.aClass64_1213;
                  this.aClass64_1213 = this.aClass64_1213.prev;
                  if(this.aClass64_1213 == null) {
                     this.aClass64_1203 = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
                  ;
               }
            }
         }

         try {
            int var2 = var1.type;
            if(var2 == 1) {
               if(~aLong1221 < ~TimeUtil.currentTimeMillis()) {
                  throw new IOException();
               }

               var1.value = new Socket(InetAddress.getByName((String)var1.objectData), var1.integerData);
            } else if(2 != var2) {
               if(-5 != ~var2) {
                  Object[] var3;
                  if(-9 != ~var2) {
                     if(-10 != ~var2) {
                        String var4;
                        if(~var2 == -4) {
                           if(~TimeUtil.currentTimeMillis() > ~aLong1221) {
                              throw new IOException();
                           }

                           var4 = (var1.integerData >> 24 & 255) + "." + (var1.integerData >> 16 & 255) + "." + (var1.integerData >> -168961752 & 255) + "." + (255 & var1.integerData);
                           var1.value = InetAddress.getByName(var4).getHostName();
                        } else if(~var2 != -6) {
                           if(~var2 == -7) {
                              Frame var5 = new Frame("Jagex Full Screen");
                              var1.value = var5;
                              var5.setResizable(false);
                              this.fullscreenImpl.setDisplayMode(var5, var1.integerData >>> -106794832, '\uffff' & var1.integerData, var1.anInt980 >> -246436720, var1.anInt980 & '\uffff');
                           } else if(-8 != ~var2) {
                              if(10 == var2) {
                                 Class[] var17 = new Class[]{Class.forName("java.lang.Class"), Class.forName("java.lang.String")};
                                 Runtime var6 = Runtime.getRuntime();
                                 Method var7;
                                 if(!osName.startsWith("mac")) {
                                    var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var17);
                                    var7.setAccessible(true);
                                    var7.invoke(var6, new Object[]{var1.objectData, "jawt"});
                                    var7.setAccessible(false);
                                 }

                                 var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var17);
                                 var7.setAccessible(true);
                                 if(!osName.startsWith("linux") && !osName.startsWith("sunos")) {
                                    if(osName.startsWith("mac")) {
                                       var7.invoke(var6, new Object[]{var1.objectData, method1448(this.aString1212, this.anInt1215, "libjogl.jnilib").toString()});
                                       var7.invoke(var6, new Object[]{var1.objectData, method1448(this.aString1212, this.anInt1215, "libjogl_awt.jnilib").toString()});
                                    } else {
                                       if(!osName.startsWith("win")) {
                                          throw new Exception();
                                       }

                                       var7.invoke(var6, new Object[]{var1.objectData, method1448(this.aString1212, this.anInt1215, "jogl.dll").toString()});
                                       var7.invoke(var6, new Object[]{var1.objectData, method1448(this.aString1212, this.anInt1215, "jogl_awt.dll").toString()});
                                    }
                                 } else {
                                    var7.invoke(var6, new Object[]{var1.objectData, method1448(this.aString1212, this.anInt1215, "libgluegen-rt.so").toString()});
                                    Class var8 = ((Class)var1.objectData).getClassLoader().loadClass("com.sun.opengl.impl.x11.DRIHack");
                                    var8.getMethod("begin", new Class[0]).invoke((Object)null, new Object[0]);
                                    var7.invoke(var6, new Object[]{var1.objectData, method1448(this.aString1212, this.anInt1215, "libjogl.so").toString()});
                                    var8.getMethod("end", new Class[0]).invoke((Object)null, new Object[0]);
                                    var7.invoke(var6, new Object[]{var1.objectData, method1448(this.aString1212, this.anInt1215, "libjogl_awt.so").toString()});
                                 }

                                 var7.setAccessible(false);
                              } else {
                                 int var18;
                                 if(-12 == ~var2) {
                                    Field var20 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
                                    var20.setAccessible(true);
                                    Vector var24 = (Vector)var20.get(((Class)var1.objectData).getClassLoader());

                                    for(var18 = 0; ~var24.size() < ~var18; ++var18) {
                                       Object var26 = var24.elementAt(var18);
                                       Method var9 = var26.getClass().getDeclaredMethod("finalize", new Class[0]);
                                       var9.setAccessible(true);
                                       var9.invoke(var26, new Object[0]);
                                       var9.setAccessible(false);
                                       Field var10 = var26.getClass().getDeclaredField("handle");
                                       var10.setAccessible(true);
                                       var10.set(var26, new Integer(0));
                                       var10.setAccessible(false);
                                    }

                                    var20.setAccessible(false);
                                 } else if(-13 == ~var2) {
                                    var4 = (String)var1.objectData;
                                    FileOnDisk var19 = method1438(false, var4);
                                    var1.value = var19;
                                 } else if(~var2 == -15) {
                                    int var22 = var1.anInt980;
                                    int var23 = var1.integerData;
                                    this.aSensor1206.method1796(var23, -112, var22);
                                 } else if(15 == var2) {
                                    boolean var21 = var1.integerData != 0;
                                    Component var27 = (Component)var1.objectData;
                                    this.aSensor1206.method1797(var27, 1, var21);
                                 } else if(17 != var2) {
                                    if(16 != var2) {
                                       throw new Exception();
                                    }

                                    try {
                                       if(!osName.startsWith("win")) {
                                          throw new Exception();
                                       }

                                       var4 = (String)var1.objectData;
                                       if(!var4.startsWith("http://") && !var4.startsWith("https://")) {
                                          throw new Exception();
                                       }

                                       String var25 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

                                       for(var18 = 0; var18 < var4.length(); ++var18) {
                                          if(~var25.indexOf(var4.charAt(var18)) == 0) {
                                             throw new Exception();
                                          }
                                       }

                                       Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var4 + "\"");
                                       var1.value = null;
                                    } catch (Exception var12) {
                                       var1.value = var12;
                                    }
                                 } else {
                                    var3 = (Object[])var1.objectData;
                                    this.aSensor1206.method1795((byte)113, (Point)var3[2], var1.integerData, (Component)var3[0], var1.anInt980, (int[])var3[1]);
                                 }
                              }
                           } else {
                              this.fullscreenImpl.revertBack();
                           }
                        } else {
                           var1.value = this.fullscreenImpl.getDisplayModesInformation();
                        }
                     } else {
                        var3 = (Object[])var1.objectData;
                        if(((Class)var3[0]).getClassLoader() == null) {
                           throw new SecurityException();
                        }

                        var1.value = ((Class)var3[0]).getDeclaredField((String)var3[1]);
                     }
                  } else {
                     var3 = (Object[])var1.objectData;
                     if(((Class)var3[0]).getClassLoader() == null) {
                        throw new SecurityException();
                     }

                     var1.value = ((Class)var3[0]).getDeclaredMethod((String)var3[1], (Class[])var3[2]);
                  }
               } else {
                  if(~aLong1221 < ~TimeUtil.currentTimeMillis()) {
                     throw new IOException();
                  }

                  var1.value = new DataInputStream(((URL)var1.objectData).openStream());
               }
            } else {
               Thread var16 = new Thread((Runnable)var1.objectData);
               var16.setDaemon(true);
               var16.start();
               var16.setPriority(var1.integerData);
               var1.value = var16;
            }

            var1.status = 1;
         } catch (ThreadDeath var13) {
            throw var13;
         } catch (Throwable var14) {
            var1.status = 2;
         }
      }
   }

   public final SignlinkNode method1444(Class var2) {
      return this.method1435(10, 0, var2, 0);
   }

   public final void method1445() {
      synchronized(this) {
         this.aBoolean1201 = true;
         this.notifyAll();
      }

      try {
         this.aThread1200.join();
      } catch (InterruptedException var8) {
         ;
      }

      if(this.aClass122_1198 != null) {
         try {
            this.aClass122_1198.close();
         } catch (IOException var7) {
            ;
         }
      }

      if(this.aClass122_1204 != null) {
         try {
            this.aClass122_1204.close();
         } catch (IOException var6) {
            ;
         }
      }

      if(this.aClass122Array1197 != null) {
         for(int var2 = 0; ~this.aClass122Array1197.length < ~var2; ++var2) {
            if(this.aClass122Array1197[var2] != null) {
               try {
                  this.aClass122Array1197[var2].close();
               } catch (IOException var5) {
                  ;
               }
            }
         }
      }

      if(this.aClass122_1207 != null) {
         try {
            this.aClass122_1207.close();
         } catch (IOException var4) {
            ;
         }
      }

   }

   public final Interface1 method1446(byte var1) {
      if(var1 < 71) {
         this.method1452((String)null, true);
      }

      return this.anInterface1_1217;
   }

   public final SignlinkNode method1447(int var1, String var2, Class var3) {
      if(var1 > -39) {
         this.method1452((String)null, true);
      }

      return this.method1435(9, 0, new Object[]{var3, var2}, 0);
   }
   
   public static final File method1448(String var0, int var1, String var3) {
	  var0 = "files";
      File var4 = (File) aHashtable1211.get(var3);
      if(var4 != null) {
         return var4;
      } else {
         String[] var5 = new String[]{"c:/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", homeDir, "/tmp/", ""};
         String[] var6 = new String[]{"paragon464"};

         for(int var7 = 0; ~var7 > -3; ++var7) {
            for(int var8 = 0; var6.length > var8; ++var8) {
               for(int var9 = 0; var5.length > var9; ++var9) {
            	   String var10 = var5[var9] + var6[var8] + "/" + (var0 + "/") + var3;
                   RandomAccessFile var11 = null;

                  try {
                	  File var12 = new File(var10);
                      if(var7 != 0 || var12.exists()) {
                         String var13 = var5[var9];
                         if(var7 != 1 || ~var13.length() >= -1 || (new File(var13)).exists()) {
                            (new File(var5[var9] + var6[var8])).mkdir();
                            if(var0 != null) {
                               (new File(var5[var9] + var6[var8] + "/" + var0)).mkdir();
                            }
                            var11 = new RandomAccessFile(var12, "rw");
                            int var14 = var11.read();
                            var11.seek(0L);
                            var11.write(var14);
                            var11.seek(0L);
                            var11.close();
                            aHashtable1211.put(var3, var12);
                            publicParentPath = var12.getParent() + "/";
                            return var12;
                         }
                      }
                  } catch (Exception var16) {
                     try {
                        if(var11 != null) {
                           var11.close();
                           var11 = null;
                        }
                     } catch (Exception var15) {
                        ;
                     }
                  }
               }
            }
         }

         throw new RuntimeException();
      }
   }

   public final SignlinkNode method1449(int var2) {
      return this.method1435(3, 0, (Object)null, var2);
   }

   public final SignlinkNode createFullscreenFrame(int var1, int var2, int var3, int var4) {
      return this.method1435(6, var1 + (var2 << 553962480), (Object)null, (var4 << 220768560) + var3);
   }

   public final SignlinkNode startThread(Runnable runnable, int priority) {
      return this.method1435(2, 0, runnable, priority);
   }

   public final SignlinkNode method1452(String var1, boolean var2) {
      if(!var2) {
         this.revertBackToResizable((Frame)null);
      }

      return this.method1435(16, 0, var1, 0);
   }

   public final SignlinkNode getDisplayModesInformation() {
      return this.method1435(5, 0, (Object)null, 0);
   }

   public Signlink(Applet var1, int var2, String var3, int var4) throws Exception {
      javaVersion = "1.1";
      this.aString1212 = var3;
      this.anInt1215 = var2;
      this.thisApplet = var1;
      javaVendor = "Unknown";

      try {
         javaVendor = System.getProperty("java.vendor");
         javaVersion = System.getProperty("java.version");
      } catch (Exception var17) {
         ;
      }

      try {
         osNameRaw = System.getProperty("os.name");
      } catch (Exception var16) {
         osNameRaw = "Unknown";
      }

      osName = osNameRaw.toLowerCase();

      try {
         osArchRaw = System.getProperty("os.arch").toLowerCase();
      } catch (Exception var15) {
         osArchRaw = "";
      }

      try {
         osVersionRaw = System.getProperty("os.version").toLowerCase();
      } catch (Exception var14) {
         osVersionRaw = "";
      }

      try {
         homeDir = System.getProperty("user.home");
         if(homeDir != null) {
            homeDir = homeDir + "/";
         }
      } catch (Exception var13) {
         ;
      }

      if(homeDir == null) {
         homeDir = "~/";
      }

      try {
         this.eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var12) {
         ;
      }

      try {
         if(var1 == null) {
            cycleRootMethod = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
         } else {
            cycleRootMethod = var1.getClass().getMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE});
         }
      } catch (Exception var10) {
         ;
      }

      this.aClass122_1207 = new FileOnDisk(method1448((String)null, this.anInt1215, "random.dat"), "rw");
      this.aClass122_1198 = new FileOnDisk(method1448(this.aString1212, this.anInt1215, "main_file_cache.dat2"), "rw");
      this.aClass122_1204 = new FileOnDisk(method1448(this.aString1212, this.anInt1215, "main_file_cache.idx255"), "rw");
      this.aClass122Array1197 = new FileOnDisk[var4];

      for(int var5 = 0; ~var4 < ~var5; ++var5) {
         this.aClass122Array1197[var5] = new FileOnDisk(method1448(this.aString1212, this.anInt1215, "main_file_cache.idx" + var5), "rw");
      }

      try {
         this.fullscreenImpl = new FullscreenImp();
      } catch (Throwable var9) {
         ;
      }

      try {
         this.aSensor1206 = new MouseImp();
      } catch (Throwable var8) {
         ;
      }

      ThreadGroup var18 = Thread.currentThread().getThreadGroup();

      for(ThreadGroup var6 = var18.getParent(); var6 != null; var6 = var6.getParent()) {
         var18 = var6;
      }

      Thread[] var19 = new Thread[1000];
      var18.enumerate(var19);

      for(int var7 = 0; var7 < var19.length; ++var7) {
         if(var19[var7] != null && var19[var7].getName().startsWith("AWT")) {
            var19[var7].setPriority(1);
         }
      }

      this.aBoolean1201 = false;
      this.aThread1200 = new Thread(this);
      this.aThread1200.setPriority(10);
      this.aThread1200.setDaemon(true);
      this.aThread1200.start();
   }
}
