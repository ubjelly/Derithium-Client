
final class Class67 implements Runnable {

   static Class93 aClass93_1013 = new Class93(100);
   static byte[][][] aByteArrayArrayArray1014;
   boolean aBoolean1015 = true;
   Object anObject1016 = new Object();
   static jInterface aClass11_1017;
   int anInt1018 = 0;
   int[] anIntArray1019 = new int[500];
   int[] anIntArray1020 = new int[500];


   public static void method1257(int var0) {
      try {
         if(var0 == 25951) {
            aClass11_1017 = null;
            aByteArrayArrayArray1014 = (byte[][][])null;
            aClass93_1013 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "jd.B(" + var0 + ')');
      }
   }

   public final void run() {
      try {
         for(; this.aBoolean1015; Class3_Sub13_Sub34.sleep(50L)) {
            Object var1 = this.anObject1016;
            synchronized(var1) {
               if(-501 < ~this.anInt1018) {
                  this.anIntArray1020[this.anInt1018] = PlainTile.anInt1676;
                  this.anIntArray1019[this.anInt1018] = Hashtable.anInt1709;
                  ++this.anInt1018;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "jd.run()");
      }
   }

   static final int method1258(byte var0) {
      try {
         Class136.anInt1780 = 0;
         if(var0 != -53) {
            method1258((byte)-35);
         }

         return Class3_Sub13_Sub17.method251(-1);
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "jd.D(" + var0 + ')');
      }
   }

   static final void method1259(int var0, byte var1) {
      try {
         if(var1 > 12) {
            InterfaceChangeNode var2 = Class3_Sub24_Sub3.putInterfaceChange(12, var0);
            var2.a();
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "jd.A(" + var0 + ',' + var1 + ')');
      }
   }

   static final void method1260(int var1, jInterface[] var2) {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            jInterface var4 = var2[var3];
            if(null != var4 && ~var4.parent == ~var1 && (!var4.scriptedInterface || !jInterface.isComponentHidden(var4))) {
               if(-1 == ~var4.type) {
                  if(!var4.scriptedInterface && jInterface.isComponentHidden(var4) && var4 != Class107.aClass11_1453) {
                     continue;
                  }

                  method1260(var4.uid, var2);
                  if(var4.aClass11Array262 != null) {
                     method1260(var4.uid, var4.aClass11Array262);
                  }

                  OverridedInterface var5 = (OverridedInterface)Class3_Sub13_Sub17.aClass130_3208.get((long)var4.uid);
                  if(var5 != null) {
                     PlayerAppearance.method1160(var5.uid);
                  }
               }

               if(var4.type == 6) {
                  int var6;
                  if(0 != ~var4.disabledAnim || ~var4.enabledAnim != 0) {
                     boolean var9 = InvType.method609(var4);
                     if(var9) {
                        var6 = var4.enabledAnim;
                     } else {
                        var6 = var4.disabledAnim;
                     }

                     if(var6 != -1) {
                        AnimationDefinition var7 = AnimationDefinition.list(var6, false);
                        if(null != var7) {
                           for(var4.anInt267 += DisplayModeInformation.anInt1446; ~var4.anInt267 < ~var7.cycles[var4.anInt283]; Class20.refreshInterface(var4)) {
                              var4.anInt267 -= var7.cycles[var4.anInt283];
                              ++var4.anInt283;
                              if(var7.frames.length <= var4.anInt283) {
                                 var4.anInt283 -= var7.anInt1865;
                                 if(~var4.anInt283 > -1 || var7.frames.length <= var4.anInt283) {
                                    var4.anInt283 = 0;
                                 }
                              }

                              var4.anInt260 = var4.anInt283 + 1;
                              if(var7.frames.length <= var4.anInt260) {
                                 var4.anInt260 -= var7.anInt1865;
                                 if(~var4.anInt260 > -1 || var7.frames.length <= var4.anInt260) {
                                    var4.anInt260 = -1;
                                 }
                              }
                           }
                        }
                     }
                  }

                  if(0 != var4.rotationModifier && !var4.scriptedInterface) {
                     int var10 = var4.rotationModifier >> 16;
                     var10 *= DisplayModeInformation.anInt1446;
                     var6 = var4.rotationModifier << 16 >> 16;
                     var4.rotateX = 2047 & var10 + var4.rotateX;
                     var6 *= DisplayModeInformation.anInt1446;
                     var4.rotateY = var4.rotateY - -var6 & 2047;
                     Class20.refreshInterface(var4);
                  }
               }
            }
         }
   }

   static final jString method1261(int var0, int var1, jString[] var2, int var3) {
      try {
         int var4 = 0;

         for(int var5 = 0; var1 > var5; ++var5) {
            if(null == var2[var0 - -var5]) {
               var2[var5 + var0] = Class3_Sub13_Sub27.aClass94_3339;
            }

            var4 += var2[var5 + var0].pos;
         }

         byte[] var10 = new byte[var4];
         int var6 = 0;

         for(int var7 = 0; var1 > var7; ++var7) {
            jString var8 = var2[var7 + var0];
            ArrayUtils.arrayCopy(var8.buf, 0, var10, var6, var8.pos);
            var6 += var8.pos;
         }

         jString var11 = new jString();
         var11.pos = var4;
         if(var3 != 2774) {
            method1262(83, 28);
         }

         var11.buf = var10;
         return var11;
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "jd.C(" + var0 + ',' + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

   static final int method1262(int var0, int var1) {
      try {
         if(var0 < 20) {
            method1262(15, 87);
         }

         return var1 & 127;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "jd.F(" + var0 + ',' + var1 + ')');
      }
   }

}
