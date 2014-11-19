
final class Class10 {

   static jString aClass94_148 = jString.createJString("(U(Y");
   int anInt149;
   Class3_Sub28_Sub4 aClass3_Sub28_Sub4_151;
   static js5 aClass153_152;
   int[] anIntArray153;
   static int anInt154 = 0;


   static final LDSprite[] method851(boolean var0) {
      try {
         LDSprite[] var1 = new LDSprite[Class95.spriteAmount];
         if(!var0) {
            method852((byte)127, -18);
         }

         for(int var2 = 0; ~var2 > ~Class95.spriteAmount; ++var2) {
            int var3 = Class3_Sub13_Sub6.spriteHeights[var2] * ItemPile.spriteWidths[var2];
            byte[] var4 = Class163_Sub1.spritePaletteIndicators[var2];
            int[] var5 = new int[var3];

            for(int var6 = 0; ~var6 > ~var3; ++var6) {
               var5[var6] = Class3_Sub13_Sub38.spritePalette[ClientScript.method633(255, var4[var6])];
            }

            var1[var2] = new LDSprite(Class3_Sub15.spriteTrimWidth, GrandExchangeItem.spriteTrimHeight, Class164.spriteXOffsets[var2], Buffer.spriteYOffsets[var2], ItemPile.spriteWidths[var2], Class3_Sub13_Sub6.spriteHeights[var2], var5);
         }

         client.resetSprites();
         return var1;
      } catch (RuntimeException var7) {
         throw Class44.method1067(var7, "bd.B(" + var0 + ')');
      }
   }

   static final void method852(byte var0, int var1) {
      try {
         InventoryNode var2 = (InventoryNode)GroundTile.aClass130_2220.get((long)var1);
         if(var2 != null) {
            if(var0 != 114) {
               aClass153_152 = (js5)null;
            }

            for(int var3 = 0; var2.anIntArray2547.length > var3; ++var3) {
               var2.anIntArray2547[var3] = -1;
               var2.anIntArray2551[var3] = 0;
            }

         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "bd.C(" + var0 + ',' + var1 + ')');
      }
   }

   public static void method853(int var0) {
      try {
         aClass94_148 = null;
         if(var0 != 0) {
            aClass94_148 = (jString)null;
         }

         aClass153_152 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "bd.A(" + var0 + ')');
      }
   }

}
