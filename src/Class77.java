
final class Class77 {

   static int renderY;
   static PlayerAppearance aClass52_1112 = new PlayerAppearance();


   static final LDIndexedSprite method1364(byte var0) {
      try {
         LDIndexedSprite var1 = new LDIndexedSprite(Class3_Sub15.spriteTrimWidth, GrandExchangeItem.spriteTrimHeight, Class164.spriteXOffsets[0], Buffer.spriteYOffsets[0], ItemPile.spriteWidths[0], Class3_Sub13_Sub6.spriteHeights[0], Class163_Sub1.spritePaletteIndicators[0], Class3_Sub13_Sub38.spritePalette);
         if(var0 <= 55) {
            method1366(86, -88);
         }

         client.resetSprites();
         return var1;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "kh.B(" + var0 + ')');
      }
   }

   public static void method1365(int var0) {
      try {
         aClass52_1112 = null;
         if(var0 <= 96) {
            renderY = 55;
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "kh.E(" + var0 + ')');
      }
   }

   static final void method1366(int var0, int var1) {
      try {
         if(var0 != 104) {
            method1367(114, 95, -80, (byte)-90, -2, 56);
         }

         ProducingGraphicsBuffer.aClass93_2982.method1522(var1);
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "kh.C(" + var0 + ',' + var1 + ')');
      }
   }

   static final void method1367(int var0, int var1, int var2, byte var3, int var4, int var5) {
      try {
         Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var2++], var5, var1, var0);
         Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var4--], var5, var1, var0);
         if(var3 >= 23) {
            for(int var6 = var2; ~var6 >= ~var4; ++var6) {
               int[] var7 = Class38.anIntArrayArray663[var6];
               var7[var5] = var7[var1] = var0;
            }

         }
      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "kh.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   	static final void method1368() {
   		Class3_Sub13_Sub1.outputStream.putPacket(104);
   		Class3_Sub13_Sub1.outputStream.putLong(0L);
   }

}
