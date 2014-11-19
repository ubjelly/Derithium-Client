import java.awt.Canvas;
import java.io.UnsupportedEncodingException;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLDrawableFactory;
import javax.media.opengl.glu.GLU;

final class HDToolkit {

   private static String vendor;
   private static String renderer;
   private static float aFloat1787;
   private static boolean aBoolean1788 = false;
   static int maxTextureUnits;
   static boolean isBigEndianOrder;
   static int anInt1791 = 0;
   private static int anInt1792 = 0;
   private static int anInt1793 = 0;
   private static float aFloat1794 = 0.0F;
   private static float aFloat1795;
   private static boolean lightingEnabled = true;
   private static float aFloat1797 = 0.0F;
   static boolean aBoolean1798 = true;
   private static boolean aBoolean1799 = false;
   private static GLContext glContext;
   private static float aFloat1801 = 0.09765625F;
   static boolean aBoolean1802;
   private static int texture = -1;
   static GL gl;
   private static boolean aBoolean1805 = true;
   private static int maxTextureImageUnits;
   static boolean openGLEnabled = false;
   private static float[] aFloatArray1808 = new float[16];
   static boolean aBoolean1809;
   static int anInt1810;
   static int canvasHeight;
   private static int anInt1812;
   static boolean isBufferAnObject;
   private static int maxTextureCoords;
   private static GLDrawable glDrawable;
   private static boolean fogEnabled = true;
   static boolean aBoolean1817;
   static boolean aBoolean1818;
   private static jString aClass94_1819 = jString.createJString("radeon");
   static int canvasWidth;
   static boolean aBoolean1821;


   private static final jString method1820(String var0) {
	   byte[] var1;
	   try {
		   var1 = var0.getBytes("ISO-8859-1");
	   } catch (UnsupportedEncodingException var3) {
		   var1 = var0.getBytes();
	   }
	   	
	   return Class3_Sub13_Sub3.bufferToString(var1, 0, var1.length);
   }

   static final void method1821(int var0, int var1, int var2, int var3) {
	   //System.out.println("method1821 toolkit");
	   method1844(0, 0, canvasWidth, canvasHeight, var0, var1, 0.0F, 0.0F, var2, var3);
   }

	static final void initSpriteStuff() {//FIXME
		//System.out.println("method1822 toolkit");
		Class3_Sub28_Sub4.method551(0, 0);
		method1836();
		method1856(1);
		method1847(1);
		toggleLighting(false);
		method1831(false);
		toggleFog(false);
		method1823();
	}

	static final void method1823() {
		if (aBoolean1788) {
			gl.glMatrixMode(5890);
			gl.glLoadIdentity();
			gl.glMatrixMode(5888);
			aBoolean1788 = false;
		}
	}

   static final void initFontStuff() {
      Class3_Sub28_Sub4.method551(0, 0);
      method1836();
      method1856(0);
      method1847(0);
      toggleLighting(false);
      method1831(false);
      toggleFog(false);
      method1823();
   }

   static final void method1825(float var0, float var1) {
		//System.out.println("method1825 toolkit");
      if(!aBoolean1799) {
         if(var0 != aFloat1797 || var1 != aFloat1794) {
            aFloat1797 = var0;
            aFloat1794 = var1;
            if(var1 != 0.0F) {
               float var2 = var0 / (var1 + var0);
               float var3 = var2 * var2;
               float var4 = -aFloat1795 * (1.0F - var2) * (1.0F - var2) / var1;
               aFloatArray1808[10] = aFloat1787 + var4;
               aFloatArray1808[14] = aFloat1795 * var3;
            } else {
               aFloatArray1808[10] = aFloat1787;
               aFloatArray1808[14] = aFloat1795;
            }

            gl.glMatrixMode(5889);
            gl.glLoadMatrixf(aFloatArray1808, 0);
            gl.glMatrixMode(5888);
         }
      }
   }

   static final void method1826() {
		//System.out.println("method1826 toolkit");
      try {
         glDrawable.swapBuffers();
      } catch (Exception var1) {
         ;
      }

   }

   static final void toggleFog(boolean var0) {
      if(var0 != fogEnabled) {
         if(var0) {
            gl.glEnable(2912);
         } else {
            gl.glDisable(2912);
         }
         fogEnabled = var0;
      }
   }

   static final void initSpriteStuff2() {//FIXME
	   //System.out.println("method1828 toolkit");
      Class3_Sub28_Sub4.method551(0, 0);
      method1836();
      method1856(0);
      method1847(0);
      toggleLighting(false);
      method1831(false);
      toggleFog(false);
      method1823();
   }

   private static final void method1829() {
	   //System.out.println("method1829 toolkit");
      aBoolean1799 = false;
      gl.glDisable(3553);
      texture = -1;
      gl.glTexEnvi(8960, 8704, '\u8570');
      gl.glTexEnvi(8960, '\u8571', 8448);
      anInt1793 = 0;
      gl.glTexEnvi(8960, '\u8572', 8448);
      anInt1792 = 0;
      gl.glEnable(2896);
      gl.glEnable(2912);
      gl.glEnable(2929);
      lightingEnabled = true;
      aBoolean1805 = true;
      fogEnabled = true;
      Class44.method1073(97);
      gl.glActiveTexture('\u84c1');
      gl.glTexEnvi(8960, 8704, '\u8570');
      gl.glTexEnvi(8960, '\u8571', 8448);
      gl.glTexEnvi(8960, '\u8572', 8448);
      gl.glActiveTexture('\u84c0');
      gl.setSwapInterval(0);
      gl.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      gl.glShadeModel(7425);
      gl.glClearDepth(1.0D);
      gl.glDepthFunc(515);
      enableDepthBuffer();
      gl.glMatrixMode(5890);
      gl.glLoadIdentity();
      gl.glPolygonMode(1028, 6914);
      gl.glEnable(2884);
      gl.glCullFace(1029);
      gl.glEnable(3042);
      gl.glBlendFunc(770, 771);
      gl.glEnable(3008);
      gl.glAlphaFunc(516, 0.0F);
      gl.glEnableClientState('\u8074');
      gl.glEnableClientState('\u8075');
      aBoolean1798 = true;
      gl.glEnableClientState('\u8076');
      gl.glEnableClientState('\u8078');
      gl.glMatrixMode(5888);
      gl.glLoadIdentity();
      AtmosphereManager.method1511();
      LightManager.method1275();
   }

   static final void enableDepthBuffer() {
	   gl.glDepthMask(true);
   }

   static final void method1831(boolean var0) {
	   //System.out.println("method1831 toolkit"+var0);
	   if(var0 != aBoolean1805) {
		   if(var0) {
			   gl.glEnable(2929);
		   } else {
			   gl.glDisable(2929);
		   }
		   aBoolean1805 = var0;
	   }
   }

   static final void method1832(float var0) {
      method1825(3000.0F, var0 * 1.5F);
   }

   static final void method1833() {
      int[] var0 = new int[2];
      gl.glGetIntegerv(3073, var0, 0);
      gl.glGetIntegerv(3074, var0, 1);
      gl.glDrawBuffer(1026);
      gl.glReadBuffer(1024);
      bindTexture(-1);
      gl.glPushAttrib(8192);
      gl.glDisable(2912);
      gl.glDisable(3042);
      gl.glDisable(2929);
      gl.glDisable(3008);
      gl.glRasterPos2i(0, 0);
      gl.glCopyPixels(0, 0, canvasWidth, canvasHeight, 6144);
      gl.glPopAttrib();
      gl.glDrawBuffer(var0[0]);
      gl.glReadBuffer(var0[1]);
   }

   static final void method1834(Canvas var0) {
      try {
         if(!var0.isDisplayable()) {
            return;
         }

         GLDrawableFactory var1 = GLDrawableFactory.getFactory();
         GLDrawable var2 = var1.getGLDrawable(var0, (GLCapabilities)null, (GLCapabilitiesChooser)null);
         var2.setRealized(true);
         GLContext var3 = var2.createContext((GLContext)null);
         var3.makeCurrent();
         var3.release();
         var3.destroy();
         var2.setRealized(false);
      } catch (Throwable var4) {
         ;
      }

   }

   static final void init2dStuff() {
      Class3_Sub28_Sub4.method551(0, 0);
      method1836();
      bindTexture(-1);
      toggleLighting(false);
      method1831(false);
      toggleFog(false);
      method1823();
   }

   private static final void method1836() {
	   if(!aBoolean1799) {
		   //System.out.println("here");
		   gl.glMatrixMode(5889);
		   gl.glLoadIdentity();
		   gl.glOrtho(0.0D, (double)canvasWidth, 0.0D, (double)canvasHeight, -1.0D, 1.0D);
		   gl.glViewport(0, 0, canvasWidth, canvasHeight);
		   gl.glMatrixMode(5888);
		   gl.glLoadIdentity();
		   aBoolean1799 = true;
	   }
   }

   static final void toggleLighting(boolean var0) {
      if(var0 != lightingEnabled) {
         if(var0) {
            gl.glEnable(2896);
         } else {
            gl.glDisable(2896);
         }
         lightingEnabled = var0;
      }
   }

   public static void method1838() {
      aClass94_1819 = null;
      renderer = null;
      vendor = null;
      gl = null;
      glDrawable = null;
      glContext = null;
      aFloatArray1808 = null;
   }

   static final float method1839() {
      return aFloat1794;
   }

   private static final int getParams() {
      int var0 = 0;
      vendor = gl.glGetString(7936);
      renderer = gl.glGetString(7937);
      System.out.println(renderer);
      String var1 = vendor.toLowerCase();
      if(var1.indexOf("microsoft") != -1) {
         var0 |= 1;
      }

      if(var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
         var0 |= 1;
      }

      String version = gl.glGetString(7938);
      String[] var3 = version.split("[. ]");
      if(var3.length >= 2) {
         try {
            int var4 = Integer.parseInt(var3[0]);
            int var5 = Integer.parseInt(var3[1]);
            anInt1812 = var4 * 10 + var5;
         } catch (NumberFormatException var11) {
            var0 |= 4;
         }
      } else {
         var0 |= 4;
      }

      if(anInt1812 < 12) {
         var0 |= 2;
      }

      if(!gl.isExtensionAvailable("GL_ARB_multitexture")) {
         var0 |= 8;
      }

      if(!gl.isExtensionAvailable("GL_ARB_texture_env_combine")) {
         var0 |= 32;
      }

      int[] params = new int[1];
      gl.glGetIntegerv(34018, params, 0);
      maxTextureUnits = params[0];
      gl.glGetIntegerv(34929, params, 0);
      maxTextureCoords = params[0];
      gl.glGetIntegerv(34930, params, 0);
      maxTextureImageUnits = params[0];
      if(maxTextureUnits < 2 || maxTextureCoords < 2 || maxTextureImageUnits < 2) {
         var0 |= 16;
      }

      if(var0 != 0) {
         return var0;
      } else {
         isBigEndianOrder = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
         isBufferAnObject = gl.isExtensionAvailable("GL_ARB_vertex_buffer_object");
         aBoolean1809 = gl.isExtensionAvailable("GL_ARB_multisample");
         aBoolean1821 = gl.isExtensionAvailable("GL_ARB_texture_cube_map");
         aBoolean1818 = gl.isExtensionAvailable("GL_ARB_vertex_program");
         aBoolean1802 = gl.isExtensionAvailable("GL_EXT_texture3D");
         jString var13 = method1820(renderer).toLowerCase();
         if(var13.method1551(aClass94_1819) != -1) {
            int var6 = 0;
            jString[] var7 = var13.method1565(32, 40, 47).method1567(32);

            for(int var8 = 0; var8 < var7.length; ++var8) {
               jString var9 = var7[var8];
               if(var9.getLength() >= 4 && var9.substring(4, 0).method1543(106)) {
                  var6 = var9.substring(4, 0).method1552((byte)-113);
                  break;
               }
            }

            if(var6 >= 7000 && var6 <= 7999) {
               isBufferAnObject = false;
            }

            if(var6 >= 7000 && var6 <= 9250) {
               aBoolean1802 = false;
            }

            aBoolean1817 = isBufferAnObject;
         }

         if(isBufferAnObject) {
            try {
               int[] var14 = new int[1];
               gl.glGenBuffersARB(1, var14, 0);
            } catch (Throwable var10) {
               return -4;
            }
         }

         return 0;
      }
   }

   static final void method1841() {
      gl.glClear(256);
   }

   static final void close() {
      if(gl != null) {
         try {
            Class101.method1609();
         } catch (Throwable var4) {
            ;
         }

         gl = null;
      }

      if(glContext != null) {
         Class31.method988();

         try {
            if(GLContext.getCurrent() == glContext) {
               glContext.release();
            }
         } catch (Throwable var3) {
            ;
         }

         try {
            glContext.destroy();
         } catch (Throwable var2) {
            ;
         }

         glContext = null;
      }

      if(glDrawable != null) {
         try {
            glDrawable.setRealized(false);
         } catch (Throwable var1) {
            ;
         }

         glDrawable = null;
      }

      LightManager.method1273();
      openGLEnabled = false;
   }

   static final void method1843(float var0, float var1, float var2) {
      gl.glMatrixMode(5890);
      if(aBoolean1788) {
         gl.glLoadIdentity();
      }

      gl.glTranslatef(var0, var1, var2);
      gl.glMatrixMode(5888);
      aBoolean1788 = true;
   }

   static final void method1844(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, int var8, int var9) {
      int var10 = (var0 - var4 << 8) / var8;
      int var11 = (var0 + var2 - var4 << 8) / var8;
      int var12 = (var1 - var5 << 8) / var9;
      int var13 = (var1 + var3 - var5 << 8) / var9;
      gl.glMatrixMode(5889);
      gl.glLoadIdentity();
      method1848((float)var10 * aFloat1801, (float)var11 * aFloat1801, (float)(-var13) * aFloat1801, (float)(-var12) * aFloat1801, 50.0F, 3584.0F);
      gl.glViewport(var0, canvasHeight - var1 - var3, var2, var3);
      gl.glMatrixMode(5888);
      gl.glLoadIdentity();
      gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      if(var6 != 0.0F) {
         gl.glRotatef(var6, 1.0F, 0.0F, 0.0F);
      }

      if(var7 != 0.0F) {
         gl.glRotatef(var7, 0.0F, 1.0F, 0.0F);
      }

      aBoolean1799 = false;
      Class139.anInt1824 = var10;
      Class145.anInt1898 = var11;
      Class1.anInt55 = var12;
      Class86.anInt1195 = var13;
   }

   private static final void method1845(boolean var0) {
	   if(var0 != aBoolean1798) {
		   if(var0) {
			   gl.glEnableClientState(32885);
 	       } else {
 	    	   gl.glDisableClientState(32885);
 	       }
		   
		   aBoolean1798 = var0;
	   }
   }

   static final void method1846() {
      if(DisplayModeInformation.aBoolean1441) {
         toggleLighting(true);
         method1845(true);
      } else {
         toggleLighting(false);
         method1845(false);
      }

   }

   static final void method1847(int var0) {
	   if(var0 != anInt1792) {
		   if(var0 == 0) {
			   gl.glTexEnvi(8960, 34162, 8448);
		   }
		   
		   if(var0 == 1) {
			   gl.glTexEnvi(8960, 34162, 7681);
		   }

		   if(var0 == 2) {
			   gl.glTexEnvi(8960, 34162, 260);
		   }

		   anInt1792 = var0;
	   }
   }

   private static final void method1848(float var0, float var1, float var2, float var3, float var4, float var5) {
      float var6 = var4 * 2.0F;
      aFloatArray1808[0] = var6 / (var1 - var0);
      aFloatArray1808[1] = 0.0F;
      aFloatArray1808[2] = 0.0F;
      aFloatArray1808[3] = 0.0F;
      aFloatArray1808[4] = 0.0F;
      aFloatArray1808[5] = var6 / (var3 - var2);
      aFloatArray1808[6] = 0.0F;
      aFloatArray1808[7] = 0.0F;
      aFloatArray1808[8] = (var1 + var0) / (var1 - var0);
      aFloatArray1808[9] = (var3 + var2) / (var3 - var2);
      aFloatArray1808[10] = aFloat1787 = -(var5 + var4) / (var5 - var4);
      aFloatArray1808[11] = -1.0F;
      aFloatArray1808[12] = 0.0F;
      aFloatArray1808[13] = 0.0F;
      aFloatArray1808[14] = aFloat1795 = -(var6 * var5) / (var5 - var4);
      aFloatArray1808[15] = 0.0F;
      gl.glLoadMatrixf(aFloatArray1808, 0);
      aFloat1797 = 0.0F;
      aFloat1794 = 0.0F;
   }

   static final void method1849(int color) {
      gl.glClearColor((float)(color >> 16 & 255) / 255.0F, (float)(color >> 8 & 255) / 255.0F, (float)(color & 255) / 255.0F, 0.0F);
      gl.glClear(16640);
      gl.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
   }

   static final void bindTexture(int t) {
      if(t != texture) {
         if(t != -1) {
            if(texture == -1) {
               gl.glEnable(3553);
            }

            gl.glBindTexture(3553, t);
         } else {
            gl.glDisable(3553);
         }

         texture = t;
      }
   }

   static final void disableDepthBuffer() {
      gl.glDepthMask(false);
   }

   static final float method1852() {
      return aFloat1797;
   }

   static final int startToolkit(Canvas canvas, int samples) {
      try {
         if(!canvas.isDisplayable()) {
            return -1;
         } else {
            GLCapabilities capabilities = new GLCapabilities();
            samples = 4;
            if(samples > 0) {
               capabilities.setSampleBuffers(true);
               capabilities.setNumSamples(samples);
            }

            GLDrawableFactory var3 = GLDrawableFactory.getFactory();
            glDrawable = var3.getGLDrawable(canvas, capabilities, (GLCapabilitiesChooser)null);
            glDrawable.setRealized(true);
            int var4 = 0;

            int var5;
            while(true) {
               glContext = glDrawable.createContext((GLContext)null);

               try {
                  var5 = glContext.makeCurrent();
                  if(var5 != 0) {
                     break;
                  }
               } catch (Exception var8) {
            	   var8.printStackTrace();
                  ;
               }

               if(var4++ > 5) {
                  return -2;
               }

               Class3_Sub13_Sub34.sleep(1000L);
            }

            gl = glContext.getGL();
            new GLU();
            openGLEnabled = true;
            canvasWidth = canvas.getSize().width;
            canvasHeight = canvas.getSize().height;
            var5 = getParams();
            if(var5 != 0) {
               close();
               return var5;
            } else {
               method1857();
               method1829();
               gl.glClear(16384);
               var4 = 0;

               while(true) {
                  try {
                     glDrawable.swapBuffers();
                     break;
                  } catch (Exception var7) {
                	  var7.printStackTrace();
                     if(var4++ > 5) {
                        close();
                        return -3;
                     }

                     Class3_Sub13_Sub34.sleep(100L);
                  }
               }

               gl.glClear(16384);
               return 0;
            }
         }
      } catch (Throwable var9) {
    	  var9.printStackTrace();
         close();
         return -5;
      }
   }

   static final void method1854(int var0, int var1) {
      canvasWidth = var0;
      canvasHeight = var1;
      aBoolean1799 = false;
   }

   static final void method1855(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = -var0;
      int var7 = canvasWidth - var0;
      int var8 = -var1;
      int var9 = canvasHeight - var1;
      gl.glMatrixMode(5889);
      gl.glLoadIdentity();
      float var10 = (float)var2 / 512.0F;
      float var11 = var10 * (256.0F / (float)var4);
      float var12 = var10 * (256.0F / (float)var5);
      gl.glOrtho((double)((float)var6 * var11), (double)((float)var7 * var11), (double)((float)(-var9) * var12), (double)((float)(-var8) * var12), (double)(50 - var3), (double)(3584 - var3));
      gl.glViewport(0, 0, canvasWidth, canvasHeight);
      gl.glMatrixMode(5888);
      gl.glLoadIdentity();
      gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      aBoolean1799 = false;
   }

   static final void method1856(int var0) {
      if(var0 != anInt1793) {
         if(var0 == 0) {
            gl.glTexEnvi(8960, '\u8571', 8448);
         }

         if(var0 == 1) {
            gl.glTexEnvi(8960, '\u8571', 7681);
         }

         if(var0 == 2) {
            gl.glTexEnvi(8960, '\u8571', 260);
         }

         if(var0 == 3) {
            gl.glTexEnvi(8960, '\u8571', '\u84e7');
         }

         if(var0 == 4) {
            gl.glTexEnvi(8960, '\u8571', '\u8574');
         }

         if(var0 == 5) {
            gl.glTexEnvi(8960, '\u8571', '\u8575');
         }

         anInt1793 = var0;
      }
   }

   private static final void method1857() {
      int[] var0 = new int[1];
      gl.glGenTextures(1, var0, 0);
      anInt1810 = var0[0];
      gl.glBindTexture(3553, anInt1810);
      gl.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[]{-1}));
      LightManager.method1276();
      Class3_Sub24_Sub3.method468(6);
   }

}
