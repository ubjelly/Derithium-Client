
final class Class3_Sub21 extends Node {

   static Class155 aClass155_2491;
   int anInt2492;
   static volatile int anInt2493 = -1;
   int anInt2494;
   int anInt2495;
   int anInt2497;
   static jString aClass94_2498 = jString.createJString("(U (X");


   final boolean method393(byte var1, int var2, int var3) {
      try {
         if(var1 != -45) {
            method394(6);
         }

         return var3 >= this.anInt2492 && ~this.anInt2495 <= ~var3 && this.anInt2494 <= var2 && var2 <= this.anInt2497;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "lh.D(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void method394(int var0) {
	   Class3_Sub13_Sub23.anInt3285 = var0;
	   IntegerNode.method383(3);
	   IntegerNode.method383(4);
   }

   static final void method395(ShapedTile var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var0.anIntArray627.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var0.anIntArray627[var9] - MillisTimer.anInt2697;
         var11 = var0.anIntArray615[var9] - EnumType.anInt3657;
         var12 = var0.anIntArray618[var9] - Class3_Sub13_Sub30.anInt3363;
         var13 = var12 * var3 + var10 * var4 >> 16;
         var12 = var12 * var4 - var10 * var3 >> 16;
         var10 = var13;
         var13 = var11 * var2 - var12 * var1 >> 16;
         var12 = var11 * var1 + var12 * var2 >> 16;
         if(var12 < 50) {
            return;
         }

         if(var0.anIntArray616 != null) {
            ShapedTile.anIntArray614[var9] = var10;
            ShapedTile.anIntArray630[var9] = var13;
            ShapedTile.anIntArray628[var9] = var12;
         }

         ShapedTile.anIntArray623[var9] = Rasterizer.anInt846 + (var10 << 9) / var12;
         ShapedTile.anIntArray622[var9] = Rasterizer.anInt835 + (var13 << 9) / var12;
      }

      Rasterizer.alpha = 0;
      var8 = var0.anIntArray624.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var0.anIntArray624[var9];
         var11 = var0.anIntArray617[var9];
         var12 = var0.anIntArray613[var9];
         var13 = ShapedTile.anIntArray623[var10];
         int var14 = ShapedTile.anIntArray623[var11];
         int var15 = ShapedTile.anIntArray623[var12];
         int var16 = ShapedTile.anIntArray622[var10];
         int var17 = ShapedTile.anIntArray622[var11];
         int var18 = ShapedTile.anIntArray622[var12];
         if((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            if(Class3_Sub13_Sub21.aBoolean3261 && Class3_Sub13_Sub4.method185(Class49.anInt819 + Rasterizer.anInt846, Class3_Sub13_Sub23_Sub1.anInt4039 + Rasterizer.anInt835, var16, var17, var18, var13, var14, var15)) {
               Class27.anInt515 = var5;
               Js5CacheWorker.anInt999 = var6;
            }

            if(!HDToolkit.openGLEnabled && !var7) {
               Rasterizer.aBoolean849 = false;
               if(var13 < 0 || var14 < 0 || var15 < 0 || var13 > Rasterizer.anInt847 || var14 > Rasterizer.anInt847 || var15 > Rasterizer.anInt847) {
                  Rasterizer.aBoolean849 = true;
               }

               if(var0.anIntArray616 != null && var0.anIntArray616[var9] != -1) {
                  if(Class3_Sub13_Sub22.aBoolean3275) {
                     if(var0.aBoolean629) {
                        Rasterizer.method1135(var16, var17, var18, var13, var14, var15, var0.anIntArray625[var9], var0.anIntArray632[var9], var0.anIntArray631[var9], ShapedTile.anIntArray614[0], ShapedTile.anIntArray614[1], ShapedTile.anIntArray614[3], ShapedTile.anIntArray630[0], ShapedTile.anIntArray630[1], ShapedTile.anIntArray630[3], ShapedTile.anIntArray628[0], ShapedTile.anIntArray628[1], ShapedTile.anIntArray628[3], var0.anIntArray616[var9]);
                     } else {
                        Rasterizer.method1135(var16, var17, var18, var13, var14, var15, var0.anIntArray625[var9], var0.anIntArray632[var9], var0.anIntArray631[var9], ShapedTile.anIntArray614[var10], ShapedTile.anIntArray614[var11], ShapedTile.anIntArray614[var12], ShapedTile.anIntArray630[var10], ShapedTile.anIntArray630[var11], ShapedTile.anIntArray630[var12], ShapedTile.anIntArray628[var10], ShapedTile.anIntArray628[var11], ShapedTile.anIntArray628[var12], var0.anIntArray616[var9]);
                     }
                  } else {
                     int var19 = Rasterizer.anInterface2_838.method15(var0.anIntArray616[var9]);
                     Rasterizer.method1154(var16, var17, var18, var13, var14, var15, Class127.method1753(var19, var0.anIntArray625[var9]), Class127.method1753(var19, var0.anIntArray632[var9]), Class127.method1753(var19, var0.anIntArray631[var9]));
                  }
               } else if(var0.anIntArray625[var9] != 12345678) {
                  Rasterizer.method1154(var16, var17, var18, var13, var14, var15, var0.anIntArray625[var9], var0.anIntArray632[var9], var0.anIntArray631[var9]);
               }
            }
         }
      }

   }

   public static void method396(int var0) {
      try {
         if(var0 != 0) {
            method397((byte)35);
         }

         aClass155_2491 = null;
         aClass94_2498 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "lh.B(" + var0 + ')');
      }
   }

   static final void method397(byte var0) {
      try {
         Class114.aClass93_1569.clearAll();
         Class3_Sub15.aClass93_2428.clearAll();
         if(var0 != -41) {
            method394(14);
         }

         Class47.aClass93_743.clearAll();
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "lh.C(" + var0 + ')');
      }
   }

   Class3_Sub21(int var1, int var2, int var3, int var4) {
      try {
         this.anInt2497 = var4;
         this.anInt2494 = var2;
         this.anInt2495 = var3;
         this.anInt2492 = var1;
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "lh.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

}