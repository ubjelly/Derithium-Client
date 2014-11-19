
final class Class166 {

   int anInt2063;
   byte[] aByteArray2064;
   static GroundTile[][][] aClass3_Sub2ArrayArrayArray2065;
   int anInt2066;
   int anInt2067;
   static int[] anIntArray2068 = new int[50];
   int anInt2069;
   static AnimationLoader[] aClass3_Sub28_Sub5Array2070 = new AnimationLoader[14];
   int anInt2071;
   static AbstractSprite[] aClass3_Sub28_Sub16Array2072;
   static int[] anIntArray2073 = new int[5];
   //static jString aClass94_2074 = jString.createJString("; version=1; path=)4; domain=");
   static jString aClass94_2075 = jString.createJString("rect_debug=");
   byte[] aByteArray2076;
   int anInt2077;
   int anInt2078;
   static int anInt2079 = 0;
   static jString aClass94_2080 = jString.createJString("(U2");


   public static void method2255(byte var0) {
      try {
         anIntArray2073 = null;
         aClass3_Sub2ArrayArrayArray2065 = (GroundTile[][][])null;
         aClass94_2080 = null;
         aClass94_2075 = null;
         if(var0 >= -126) {
            aClass94_2080 = (jString)null;
         }

         anIntArray2068 = null;
         aClass3_Sub28_Sub5Array2070 = null;
         aClass3_Sub28_Sub16Array2072 = null;
         //aClass94_2074 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "wh.B(" + var0 + ')');
      }
   }

   static final boolean method2256(int var0, int var1, int var2, int var3) {
      if(!Class8.method846(var0, var1, var2)) {
         return false;
      } else {
         int var4 = var1 << 7;
         int var5 = var2 << 7;
         return Class3_Sub13_Sub37.method349(var4 + 1, Class44.anIntArrayArrayArray723[var0][var1][var2] + var3, var5 + 1) && Class3_Sub13_Sub37.method349(var4 + 128 - 1, Class44.anIntArrayArrayArray723[var0][var1 + 1][var2] + var3, var5 + 1) && Class3_Sub13_Sub37.method349(var4 + 128 - 1, Class44.anIntArrayArrayArray723[var0][var1 + 1][var2 + 1] + var3, var5 + 128 - 1) && Class3_Sub13_Sub37.method349(var4 + 1, Class44.anIntArrayArrayArray723[var0][var1][var2 + 1] + var3, var5 + 128 - 1);
      }
   }

   static final void method2257(int var0) {
      try {
         if(var0 < 60) {
            aClass3_Sub28_Sub16Array2072 = (AbstractSprite[])null;
         }

         Class163_Sub2_Sub1.aClass93_4015.clearAll();
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "wh.F(" + var0 + ')');
      }
   }

   static final void method2258(int var0, int var1, jString var2) {
      try {
         jString var3 = var2.method1579(-17).upperCase();
         boolean var4 = false;

         for(int var5 = var1; ~var5 > ~Class159.anInt2022; ++var5) {
            Player var6 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[Class56.anIntArray887[var5]];
            if(null != var6 && null != var6.username && var6.username.method1531(var3)) {
               var4 = true;
               Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, var6.anIntArray2767[0], 1, 0, 2, var6.anIntArray2755[0], TextureLoader.selfPlayer.anIntArray2767[0]);
               if(1 == var0) {
                  Class3_Sub13_Sub1.outputStream.putPacket(68);
                  Class3_Sub13_Sub1.outputStream.putLEShortA(Class56.anIntArray887[var5]);
               } else if(4 != var0) {
                  if(5 != var0) {
                     if(~var0 != -7) {
                        if(~var0 == -8) {
                           Class3_Sub13_Sub1.outputStream.putPacket(114);
                           Class3_Sub13_Sub1.outputStream.putLEShortA(Class56.anIntArray887[var5]);
                        }
                     } else {
                        Class3_Sub13_Sub1.outputStream.putPacket(133);
                        Class3_Sub13_Sub1.outputStream.putLEShort(Class56.anIntArray887[var5]);
                     }
                  } else {
                     Class3_Sub13_Sub1.outputStream.putPacket(4);
                     Class3_Sub13_Sub1.outputStream.putLEShort(Class56.anIntArray887[var5]);
                  }
               } else {
                  Class3_Sub13_Sub1.outputStream.putPacket(180);
                  Class3_Sub13_Sub1.outputStream.putLEShortA(Class56.anIntArray887[var5]);
               }
               break;
            }
         }

         if(!var4) {
            PacketBuffer.method805(GroundItem.aClass94_3672, client.method903(new jString[]{Light.aClass94_691, var3}), 0);
         }

      } catch (RuntimeException var7) {
         throw Class44.method1067(var7, "wh.D(" + var0 + ',' + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   static final AbstractIndexedSprite method2259() {
	   Object var1;
	   if(HDToolkit.openGLEnabled) {
		   var1 = new HDIndexedSprite(Class3_Sub15.spriteTrimWidth, GrandExchangeItem.spriteTrimHeight, Class164.spriteXOffsets[0], Buffer.spriteYOffsets[0], ItemPile.spriteWidths[0], Class3_Sub13_Sub6.spriteHeights[0], Class163_Sub1.spritePaletteIndicators[0], Class3_Sub13_Sub38.spritePalette);
	   } else {
		   var1 = new LDIndexedSprite(Class3_Sub15.spriteTrimWidth, GrandExchangeItem.spriteTrimHeight, Class164.spriteXOffsets[0], Buffer.spriteYOffsets[0], ItemPile.spriteWidths[0], Class3_Sub13_Sub6.spriteHeights[0], Class163_Sub1.spritePaletteIndicators[0], Class3_Sub13_Sub38.spritePalette);
	   }

	   client.resetSprites();
	   return (AbstractIndexedSprite)var1;
   }

   static final void method2260(int var0, int var1) {
      try {
         Class3_Sub13_Sub34.aClass93_3412.method1522(var1);
         if(var0 == -1045) {
            Class3_Sub13_Sub31.aClass93_3369.method1522(var1);
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "wh.E(" + var0 + ',' + var1 + ')');
      }
   }

}
