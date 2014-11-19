
final class LookupTable {

   static int anInt1037;
   static int anInt1038;
   static Class30 aClass30_1039;
   static boolean qaoptestEnabled = false;
   private int[] anIntArray1041;
   static int anInt1042;
   static js5 aClass153_1043;


   final int method1280(int var1) {
	   int var3 = (this.anIntArray1041.length >> 1) + -1;
       int var4 = var3 & var1;
       while(true) {
          int var5 = this.anIntArray1041[1 + var4 + var4];
          if(var5 == -1) {
             return -1;
          }
          if(var1 == this.anIntArray1041[var4 + var4]) {
             return var5;
          }
          var4 = var4 - -1 & var3;
       }
   }

   static final LDIndexedSprite[] method1281(int var0) {
      try {
         LDIndexedSprite[] var1 = new LDIndexedSprite[Class95.spriteAmount];

         for(int var2 = var0; ~var2 > ~Class95.spriteAmount; ++var2) {
            var1[var2] = new LDIndexedSprite(Class3_Sub15.spriteTrimWidth, GrandExchangeItem.spriteTrimHeight, Class164.spriteXOffsets[var2], Buffer.spriteYOffsets[var2], ItemPile.spriteWidths[var2], Class3_Sub13_Sub6.spriteHeights[var2], Class163_Sub1.spritePaletteIndicators[var2], Class3_Sub13_Sub38.spritePalette);
         }

         client.resetSprites();
         return var1;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "jg.A(" + var0 + ')');
      }
   }

   static final void method1282(int var0, int var2, int var3, int var4) {
	   for(int var5 = 0; ~Class3_Sub28_Sub3.anInt3557 < ~var5; ++var5) {
		   if(var0 < Class155.anIntArray1969[var5] - -Class3_Sub28_Sub18.anIntArray3768[var5] && var0 + var4 > Class155.anIntArray1969[var5] && ~(Player.anIntArray3954[var5] - -Entity.anIntArray2794[var5]) < ~var2 && ~Player.anIntArray3954[var5] > ~(var3 + var2)) {
			   Class163_Sub1_Sub1.aBooleanArray4008[var5] = true;
		   }
	   }
   }

   public static void method1283(byte var0) {
      try {
         aClass153_1043 = null;
         aClass30_1039 = null;
         int var1 = -9 / ((var0 - 64) / 53);
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "jg.B(" + var0 + ')');
      }
   }

   LookupTable(int[] var1) {
      try {
         int var2;
         for(var2 = 1; (var1.length >> 1) + var1.length >= var2; var2 <<= 1) {
            ;
         }

         this.anIntArray1041 = new int[var2 + var2];

         int var3;
         for(var3 = 0; var2 + var2 > var3; ++var3) {
            this.anIntArray1041[var3] = -1;
         }

         int var4;
         for(var3 = 0; var1.length > var3; this.anIntArray1041[var4 - -var4 - -1] = var3++) {
            for(var4 = -1 + var2 & var1[var3]; 0 != ~this.anIntArray1041[1 + var4 - -var4]; var4 = -1 + var2 & 1 + var4) {
               ;
            }

            this.anIntArray1041[var4 + var4] = var1[var3];
         }

      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "jg.<init>(" + (var1 != null?"{...}":"null") + ')');
      }
   }

}
