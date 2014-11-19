
final class Class115 {

   static Class86[][] aClass86ArrayArray1581 = new Class86[13][13];
   static jString aClass94_1583 = jString.createJString("Ok");


   public static void method1712() {
         aClass86ArrayArray1581 = (Class86[][])null;
         aClass94_1583 = null;
   }

   static final void method1713(byte var0) {
      try {
         if(var0 > -45) {
            aClass86ArrayArray1581 = (Class86[][])((Class86[][])null);
         }

         while(true) {
            Class3_Sub5 var1 = (Class3_Sub5)IntegerNode.aClass61_2468.popFront();
            if(var1 == null) {
               return;
            }

            Object var2;
            int var3;
            if(0 > var1.anInt2273) {
               var3 = -var1.anInt2273 - 1;
               if(~var3 != ~ClickMaskNode.anInt2211) {
                  var2 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var3];
               } else {
                  var2 = TextureLoader.selfPlayer;
               }
            } else {
               var3 = var1.anInt2273 - 1;
               var2 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var3];
            }

            if(var2 != null) {
               ObjectDefinition var20 = ObjectDefinition.list(var1.anInt2270);
               if(~Class26.plane > -4) {
                  ;
               }

               int var4;
               int var5;
               if(~var1.anInt2284 != -2 && ~var1.anInt2284 != -4) {
                  var4 = var20.sizeX;
                  var5 = var20.sizeY;
               } else {
                  var5 = var20.sizeX;
                  var4 = var20.sizeY;
               }

               int var7 = (var4 - -1 >> 1) + var1.anInt2271;
               int var6 = (var4 >> 1) + var1.anInt2271;
               int var8 = (var5 >> 1) + var1.anInt2282;
               int var9 = (var5 + 1 >> 1) + var1.anInt2282;
               int[][] var10 = Class44.anIntArrayArrayArray723[Class26.plane];
               int var11 = var10[var7][var9] + var10[var6][var9] + (var10[var6][var8] - -var10[var7][var8]) >> 2;
               SceneGraphNode var12 = null;
               int var13 = Class75.anIntArray1107[var1.anInt2278];
               if(-1 == ~var13) {
                  Class70 var14 = Class154.method2147(Class26.plane, var1.anInt2271, var1.anInt2282);
                  if(var14 != null) {
                     var12 = var14.aClass140_1049;
                  }
               } else if(~var13 != -2) {
                  if(2 == var13) {
                     Class25 var23 = Class75.method1336(Class26.plane, var1.anInt2271, var1.anInt2282);
                     if(null != var23) {
                        var12 = var23.aClass140_479;
                     }
                  } else if(var13 == 3) {
                     Class12 var24 = Buffer.method784(Class26.plane, var1.anInt2271, var1.anInt2282);
                     if(null != var24) {
                        var12 = var24.aClass140_320;
                     }
                  }
               } else {
                  Class19 var21 = Class44.method1068(Class26.plane, var1.anInt2271, var1.anInt2282);
                  if(null != var21) {
                     var12 = var21.aClass140_429;
                  }
               }

               if(null != var12) {
                  Queue.method881(Class26.plane, var1.anInt2282, 0, var1.anInt2271, var1.anInt2283 - -1, -1, var13, 0, var1.anInt2266 - -1);
                  ((Entity)var2).anInt2778 = var1.anInt2283 + Class44.loopCycle;
                  ((Entity)var2).anInt2833 = 64 * var5 + var1.anInt2282 * 128;
                  ((Entity)var2).anInt2782 = var4 * 64 + 128 * var1.anInt2271;
                  ((Entity)var2).anObject2796 = var12;
                  int var22 = var1.anInt2268;
                  ((Entity)var2).anInt2812 = var11;
                  ((Entity)var2).anInt2797 = Class44.loopCycle + var1.anInt2266;
                  int var15 = var1.anInt2272;
                  int var16 = var1.anInt2277;
                  int var17 = var1.anInt2279;
                  int var18;
                  if(var22 > var15) {
                     var18 = var22;
                     var22 = var15;
                     var15 = var18;
                  }

                  ((Entity)var2).anInt2818 = var1.anInt2271 + var15;
                  if(~var16 < ~var17) {
                     var18 = var16;
                     var16 = var17;
                     var17 = var18;
                  }

                  ((Entity)var2).anInt2777 = var1.anInt2282 + var16;
                  ((Entity)var2).anInt2817 = var17 + var1.anInt2282;
                  ((Entity)var2).anInt2788 = var1.anInt2271 - -var22;
               }
            }
         }
      } catch (RuntimeException var19) {
         throw Class44.method1067(var19, "ph.A(" + var0 + ')');
      }
   }

   static final void method1714(byte var0) {
      try {
         KeyboardHandler.aClass93_1911.clearSoftReference();
         if(var0 != -6) {
            method1712();
         }

         Class80.aClass93_1131.clearSoftReference();
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ph.C(" + var0 + ')');
      }
   }

}
