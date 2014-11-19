import java.util.Calendar;

final class Class3_Sub28_Sub9 extends NodeSub {

   int anInt3614;
   static Calendar aCalendar3616 = Calendar.getInstance();
   private int anInt3617;
   jString aClass94_3619;
   static int anInt3620 = 0;
   static jString aClass94_3621 = null;
   static int anInt3622 = 0;
   static int anInt3623 = 0;
   static int anInt3624;


   static final LDSprite method578(int var0) {
      try {
         int var1 = Class3_Sub13_Sub6.spriteHeights[0] * ItemPile.spriteWidths[0];
         byte[] var2 = Class163_Sub1.spritePaletteIndicators[0];
         if(var0 != 115) {
            anInt3624 = 112;
         }

         Object var3;
         if(Class3_Sub13_Sub22.spriteHaveAlpha[0]) {
            byte[] var4 = Class163_Sub3.spriteAlphas[0];
            int[] var5 = new int[var1];

            for(int var6 = 0; var6 < var1; ++var6) {
               var5[var6] = Class3_Sub13_Sub29.method308(ClientScript.method633(var4[var6] << 24, -16777216), Class3_Sub13_Sub38.spritePalette[ClientScript.method633(255, var2[var6])]);
            }

            var3 = new LDTransparentSprite(Class3_Sub15.spriteTrimWidth, GrandExchangeItem.spriteTrimHeight, Class164.spriteXOffsets[0], Buffer.spriteYOffsets[0], ItemPile.spriteWidths[0], Class3_Sub13_Sub6.spriteHeights[0], var5);
         } else {
            int[] var8 = new int[var1];

            for(int var9 = 0; var9 < var1; ++var9) {
               var8[var9] = Class3_Sub13_Sub38.spritePalette[ClientScript.method633(var2[var9], 255)];
            }

            var3 = new LDSprite(Class3_Sub15.spriteTrimWidth, GrandExchangeItem.spriteTrimHeight, Class164.spriteXOffsets[0], Buffer.spriteYOffsets[0], ItemPile.spriteWidths[0], Class3_Sub13_Sub6.spriteHeights[0], var8);
         }

         client.resetSprites();
         return (LDSprite)var3;
      } catch (RuntimeException var7) {
         throw Class44.method1067(var7, "hn.P(" + var0 + ')');
      }
   }

   private final void method579(int var1, Buffer var2, int var3) {
      try {
         if(~var1 != -2) {
            if(var1 == 2) {
               this.anInt3614 = var2.getInt();
            } else if(-6 == ~var1) {
               this.aClass94_3619 = var2.getString();
            }
         } else {
            this.anInt3617 = var2.getUByte();
         }

         if(var3 != 0) {
            method582(5, 31, 114, true, -67, 14, -33, -115, -101, -61, -25, -121);
         }

      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "hn.A(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

   static final void method580(byte var0) {
      try {
         if(var0 != 80) {
            method582(88, 85, -8, true, 72, 12, 29, 96, 6, 57, -13, 15);
         }

         GroundTile.aClass130_2220 = new Hashtable(32);
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "hn.B(" + var0 + ')');
      }
   }

   static final boolean method582(int var0, int var1, int var2, boolean var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      try {
         return TextureLoader.selfPlayer.getSize() != var5?(TextureLoader.selfPlayer.getSize() <= 2?ProducingGraphicsBuffer.method2191(var6, var4, var11, -1001, var10, var9, var2, var1, var3, var8, var0, var7):PlayerAppearance.method1166(var10, (byte)34, var7, var9, var1, TextureLoader.selfPlayer.getSize(), var6, var8, var4, var11, var2, var3, var0)):Class2.method76(var7, var8, var4, var0, var10, var3, var2, var1, var6, var9, 127, var11);
      } catch (RuntimeException var13) {
         throw Class44.method1067(var13, "hn.O(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ',' + var11 + ')');
      }
   }

   final void method583(int var1, Buffer var2) {
      try {
         if(var1 == 207) {
            while(true) {
               int var3 = var2.getUByte();
               if(var3 == 0) {
                  return;
               }

               this.method579(var3, var2, 0);
            }
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "hn.C(" + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   public static void method584(int var0) {
      try {
         aCalendar3616 = null;
         if(var0 != 0) {
            method580((byte)-90);
         }

         aClass94_3621 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "hn.F(" + var0 + ')');
      }
   }

   final boolean method585(int var1) {
      try {
         if(var1 != 0) {
            aClass94_3621 = (jString)null;
         }

         return this.anInt3617 == 115;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "hn.E(" + var1 + ')');
      }
   }

}
