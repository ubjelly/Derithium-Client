
final class ClickMaskNode extends Node {

   int anInt2202;
   static js5Worker cacheIndex12;
   int clickMask;
   static int anInt2208 = -1;
   static int[] anIntArray2209 = new int[]{2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1};
   static jString aClass94_2210 = jString.createJString("white:");;
   static int anInt2211 = -1;
   static int anInt2212 = 0;
   static int[] anIntArray2213 = new int[]{16776960, 16711680, '\uff00', '\uffff', 16711935, 16777215};
   static jString aClass94_2214 = jString.createJString("white:");;


   static final void method90(int var0) {
      try {
         if(HDToolkit.openGLEnabled) {
            if(!Class3_Sub13_Sub34.aBoolean3416) {
               GroundTile[][][] var1 = Class75_Sub2.groundTiles;
               if(var0 != 1) {
                  aClass94_2214 = (jString)null;
               }

               for(int var2 = 0; var2 < var1.length; ++var2) {
                  GroundTile[][] var3 = var1[var2];

                  for(int var4 = 0; ~var3.length < ~var4; ++var4) {
                     for(int var5 = 0; var3[var4].length > var5; ++var5) {
                        GroundTile var6 = var3[var4][var5];
                        if(var6 != null) {
                           HDModel var7;
                           if(var6.aClass12_2230 != null && var6.aClass12_2230.aClass140_320 instanceof HDModel) {
                              var7 = (HDModel)var6.aClass12_2230.aClass140_320;
                              if(~(var6.aClass12_2230.aLong328 & Long.MIN_VALUE) == -1L) {
                                 var7.method1920(false, true, true, true, false, true, true);
                              } else {
                                 var7.method1920(true, true, true, true, true, true, true);
                              }
                           }

                           if(null != var6.aClass19_2233) {
                              if(var6.aClass19_2233.aClass140_429 instanceof HDModel) {
                                 var7 = (HDModel)var6.aClass19_2233.aClass140_429;
                                 if(0L == (var6.aClass19_2233.aLong428 & Long.MIN_VALUE)) {
                                    var7.method1920(false, true, true, true, false, true, true);
                                 } else {
                                    var7.method1920(true, true, true, true, true, true, true);
                                 }
                              }

                              if(var6.aClass19_2233.aClass140_423 instanceof HDModel) {
                                 var7 = (HDModel)var6.aClass19_2233.aClass140_423;
                                 if(-1L != ~(Long.MIN_VALUE & var6.aClass19_2233.aLong428)) {
                                    var7.method1920(true, true, true, true, true, true, true);
                                 } else {
                                    var7.method1920(false, true, true, true, false, true, true);
                                 }
                              }
                           }

                           if(var6.aClass70_2234 != null) {
                              if(var6.aClass70_2234.aClass140_1049 instanceof HDModel) {
                                 var7 = (HDModel)var6.aClass70_2234.aClass140_1049;
                                 if(-1L != ~(var6.aClass70_2234.aLong1048 & Long.MIN_VALUE)) {
                                    var7.method1920(true, true, true, true, true, true, true);
                                 } else {
                                    var7.method1920(false, true, true, true, false, true, true);
                                 }
                              }

                              if(var6.aClass70_2234.aClass140_1052 instanceof HDModel) {
                                 var7 = (HDModel)var6.aClass70_2234.aClass140_1052;
                                 if(~(Long.MIN_VALUE & var6.aClass70_2234.aLong1048) != -1L) {
                                    var7.method1920(true, true, true, true, true, true, true);
                                 } else {
                                    var7.method1920(false, true, true, true, false, true, true);
                                 }
                              }
                           }

                           for(int var10 = 0; ~var10 > ~var6.anInt2223; ++var10) {
                              if(var6.aClass25Array2221[var10].aClass140_479 instanceof HDModel) {
                                 HDModel var8 = (HDModel)var6.aClass25Array2221[var10].aClass140_479;
                                 if(-1L == ~(Long.MIN_VALUE & var6.aClass25Array2221[var10].aLong498)) {
                                    var8.method1920(false, true, true, true, false, true, true);
                                 } else {
                                    var8.method1920(true, true, true, true, true, true, true);
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               Class3_Sub13_Sub34.aBoolean3416 = true;
            }
         }
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "bf.D(" + var0 + ')');
      }
   }

   public static void method91(byte var0) {
      try {
         anIntArray2213 = null;
         if(var0 <= 110) {
            method90(-74);
         }

         cacheIndex12 = null;
         anIntArray2209 = null;
         aClass94_2210 = null;
         aClass94_2214 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "bf.P(" + var0 + ')');
      }
   }

   final boolean method92(int var1) {
	   return 0 != (this.clickMask >> 1 + var1 & 1);
   }

   final boolean method93(int var1) {
      try {
         return var1 != 572878952?true:0 != (572878952 & this.clickMask) >> 29;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "bf.S(" + var1 + ')');
      }
   }

   final int method94() {
	   return this.clickMask >> 18 & 7;
   }

   final boolean method95(int var1) {
      try {
         if(var1 != -13081) {
            anInt2212 = 71;
         }

         return ~(1 & this.clickMask) != -1;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "bf.Q(" + var1 + ')');
      }
   }

   final boolean method96(int var1) {
      try {
         return var1 != -2063688673?false:(this.clickMask >> 31 & 1) != 0;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "bf.T(" + var1 + ')');
      }
   }

   final boolean method97(int var1) {
      try {
         return var1 != -20710?true:0 != (1 & this.clickMask >> 22);
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "bf.R(" + var1 + ')');
      }
   }

   ClickMaskNode(int var1, int var2) {
      try {
         this.anInt2202 = var2;
         this.clickMask = var1;
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "bf.<init>(" + var1 + ',' + var2 + ')');
      }
   }

   final boolean method98(boolean var1) {
      try {
         if(var1) {
            anIntArray2209 = (int[])null;
         }

         return -1 != ~(this.clickMask >> 21 & 1);
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "bf.E(" + var1 + ')');
      }
   }

   final boolean method99() {
	   return -1 != ~((1738913629 & this.clickMask) >> 30);
   }

   final boolean method100(byte var1) {
      try {
         return var1 != -9?true:(this.clickMask & 455226656) >> 28 != 0;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "bf.O(" + var1 + ')');
      }
   }

   final int method101() {
	   return ClientScript.method630(this.clickMask);
   }

}
