
final class Class75_Sub2 extends Class75 {

   private int anInt2636;
   static Class33 aClass33_2637;
   static GroundTile[][][] groundTiles;
   static int[] anIntArray2639;
   static int[] anIntArray2642 = new int[]{1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5};
   static int anInt2643;
   private int anInt2644;
   static js5Worker cacheIndex6;
   private int anInt2646;
   private int anInt2647;
   static Class33 aClass33_2648;


   final void method1341(int var2, int var3) {
	   int var4 = this.anInt2646 * var2 >> 12;
	   int var5 = var2 * this.anInt2636 >> 12;
	   int var6 = this.anInt2644 * var3 >> 12;
	   int var7 = this.anInt2647 * var3 >> 12;
	   Class95.method1584(this.anInt1101, var7, var4, var6, -26571, var5);
   }

   static final AbstractSprite method1344(int var0, js5 var1, int var2) {
      try {
         if(var0 < 29) {
            groundTiles = (GroundTile[][][])((GroundTile[][][])null);
         }

         return !ItemPile.method2029((byte)-121, var1, var2)?null:client.method1062();
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "kc.C(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   final void method1337(int var1, int var3) {
   }

   public static void method1345(int var0) {
      try {
         if(var0 >= -38) {
            method1344(93, (js5)null, -70);
         }

         anIntArray2642 = null;
         groundTiles = (GroundTile[][][])null;
         aClass33_2648 = null;
         aClass33_2637 = null;
         cacheIndex6 = null;
         anIntArray2639 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "kc.B(" + var0 + ')');
      }
   }

   final void method1335(int var1, int var2, int var3) {
      try {
         int var4 = var2 * this.anInt2646 >> 12;
         if(var3 != 4898) {
            this.anInt2644 = -39;
         }

         int var7 = this.anInt2647 * var1 >> 12;
         int var6 = this.anInt2644 * var1 >> 12;
         int var5 = this.anInt2636 * var2 >> 12;
         Class3_Sub13_Sub12.method223(true, this.anInt1106, var4, var6, var7, this.anInt1104, this.anInt1101, var5);
      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "kc.D(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   Class75_Sub2(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var5, var6, var7);

      try {
         this.anInt2647 = var4;
         this.anInt2646 = var1;
         this.anInt2644 = var2;
         this.anInt2636 = var3;
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "kc.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }

}
