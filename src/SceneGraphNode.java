
abstract class SceneGraphNode {

   static AbstractIndexedSprite[] aClass109Array1831;
  // static jString aClass94_1832 = jString.createJString("::setparticles");
   static int[] anIntArray1833 = new int[14];
   static jInterface[][] interfaceCache;
   static int[] anIntArray1835 = new int[100];
   static jInterface[] aClass11Array1836;
   static boolean aBoolean1837 = false;
   static int[] anIntArray1838;
   static LDSprite[] aClass3_Sub28_Sub16_Sub2Array1839;


	static final void method1859(double var0) {
		if (Class70.aDouble1050 != var0) {
			for (int var3 = 0; 256 > var3; ++var3) {
				int var4 = (int) (255.0D * Math.pow((double) var3 / 255.0D, var0));
				PacketBuffer.anIntArray3804[var3] = ~var4 < -256 ? 255 : var4;
			}
			Class70.aDouble1050 = var0;
		}
	}

   public static void method1860(int var0) {
      try {
         aClass109Array1831 = null;
         aClass11Array1836 = null;
         interfaceCache = (jInterface[][])null;
         if(var0 != 0) {
            method1860(-87);
         }

         aClass3_Sub28_Sub16_Sub2Array1839 = null;
         anIntArray1835 = null;
        // aClass94_1832 = null;
         anIntArray1833 = null;
         anIntArray1838 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "th.HC(" + var0 + ')');
      }
   }

   SceneGraphNode method1861(int var1, int var2, int var3) {
      try {
         return this;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "th.JB(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void method1862(boolean replaceCanvas, int var1, int var3, int var4) {
         Class53.aLong866 = 0L;
         int var5 = Class83.getDisplayMode();
         if(~var1 == -4 || 3 == var5) {
            replaceCanvas = true;
         }

         if(Signlink.osName.startsWith("mac") && -1 > ~var1) {
            replaceCanvas = true;
         }

         boolean var6 = false;
         if(var5 > 0 != ~var1 < -1) {
            var6 = true;
         }

         if(replaceCanvas && -1 > ~var1) {
            var6 = true;
         }

         BufferedRequest.method598(replaceCanvas, var1, var6, var5, var3, var4);
   }

   static final int method1863(int var0, int var1, byte var2, int var3, int var4, int var5, int var6) {
      try {
         int var7;
         if(~(1 & var5) == -2) {
            var7 = var0;
            var0 = var3;
            var3 = var7;
         }

         var7 = 121 % ((var2 - 75) / 50);
         var1 &= 3;
         return ~var1 == -1?var6:(1 != var1?(~var1 != -3?var4:-var3 + 1 + -var6 + 7):-var4 + 7 + -var0 - -1);
      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "th.JC(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   static final void method1864(boolean var0, byte var1, js5 var2, LDFont var3, js5 var4) {
      try {
         Class139.aBoolean1827 = var0;
         StringNode.cacheIndex7 = var4;
         int var6 = -127 / ((var1 - -87) / 32);
         //Class97.aClass153_1370 = var2;
         //int var5 = Class97.aClass153_1370.method2121(0) - 1;
         //Class3_Sub13_Sub23.anInt3287 = Class97.aClass153_1370.method2142(var5, (byte)101) + var5 * 256;
         RuntimeException_Sub1.aClass94Array2119 = new jString[]{null, null, null, null, Class140_Sub3.aClass94_2744};
         Buffer.aClass94Array2596 = new jString[]{null, null, Class3_Sub13_Sub33.aClass94_3397, null, null};
         Class3_Sub13_Sub37.aClass3_Sub28_Sub17_Sub1_3440 = var3;
      } catch (RuntimeException var7) {
         throw Class44.method1067(var7, "th.FC(" + var0 + ',' + var1 + ',' + (var2 != null?"{...}":"null") + ',' + (var3 != null?"{...}":"null") + ',' + (var4 != null?"{...}":"null") + ')');
      }
   }

   boolean method1865() {
      try {
         return false;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "th.AB()");
      }
   }

   void method1866(SceneGraphNode var1, int var2, int var3, int var4, boolean var5) {}

   abstract void method1867(int var1, int var2, int var3, int var4, int var5);

   abstract void render(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, int var11, ParticleEngine var12);

   static final void method1869(byte var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = var2 - var3;
         int var7 = var4 + -var5;
         if(var7 == 0) {
            if(-1 != ~var6) {
               Class3_Sub13_Sub16.method244(2, var3, var5, var2, var1);
            }

         } else if(0 != var6) {
            if(0 > var6) {
               var6 = -var6;
            }

            if(var7 < 0) {
               var7 = -var7;
            }

            int var8 = -102 / ((-53 - var0) / 38);
            boolean var9 = ~var7 > ~var6;
            int var10;
            int var11;
            if(var9) {
               var10 = var5;
               var5 = var3;
               var11 = var4;
               var3 = var10;
               var4 = var2;
               var2 = var11;
            }

            if(var4 < var5) {
               var10 = var5;
               var5 = var4;
               var4 = var10;
               var11 = var3;
               var3 = var2;
               var2 = var11;
            }

            var10 = var3;
            var11 = var4 - var5;
            int var12 = var2 + -var3;
            int var13 = -(var11 >> 1);
            int var14 = var2 <= var3?-1:1;
            if(~var12 > -1) {
               var12 = -var12;
            }

            int var15;
            if(!var9) {
               for(var15 = var5; var15 <= var4; ++var15) {
                  var13 += var12;
                  Class38.anIntArrayArray663[var10][var15] = var1;
                  if(var13 > 0) {
                     var10 += var14;
                     var13 -= var11;
                  }
               }
            } else {
               for(var15 = var5; var4 >= var15; ++var15) {
                  Class38.anIntArrayArray663[var15][var10] = var1;
                  var13 += var12;
                  if(-1 > ~var13) {
                     var10 += var14;
                     var13 -= var11;
                  }
               }
            }

         } else {
            Class3_Sub13_Sub32.method320(var1, var3, var4, (byte)-107, var5);
         }
      } catch (RuntimeException var16) {
         throw Class44.method1067(var16, "th.IC(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   static final void method1870(boolean var0) {
      try {
         Class101.aClass3_Sub24_Sub4_1421.method505((byte)-128);
         Class10.anInt154 = 1;
         if(!var0) {
            Class101.aClass153_1423 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "th.GC(" + var0 + ')');
      }
   }

   abstract int method1871();

}
