
final class Class117 {

   static Class44_Sub1[] aClass44_Sub1Array1609;
   private static jString aClass94_1610 = jString.createJString("Loaded wordpack");
   static int[] keycodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
   static int[] anIntArray1613 = new int[500];
   static jString aClass94_1614 = jString.createJString(":tradereq:");
   static jString aClass94_1615 = aClass94_1610;
   static int anInt1616 = 0;


   static final void setGameState(int var0) {
         if(Class143.gameState != var0) {
            if(0 == Class143.gameState) {
               Class93.method1517((byte)-118);
            }

            if(var0 == 40) {
               IdentityKit.method951(0);
            }

            boolean var2 = var0 == 5 || var0 == 10 || var0 == 28;
            if(40 != var0 && null != Class163_Sub2_Sub1.worldConnection2) {
               Class163_Sub2_Sub1.worldConnection2.close();
               Class163_Sub2_Sub1.worldConnection2 = null;
            }

            if(var0 == 25 || var0 == 28) {
               Class162.modelFetchCount = 0;
               StringNode.anInt2579 = 1;
               Class163_Sub2_Sub1.loadingScreenType = 0;
               Class3_Sub5.anInt2275 = 1;
               Class3_Sub13_Sub24.anInt3293 = 0;
               //Js5CacheWorker.method1250(true);
            }

            //if(25 == var0 || var0 == 10) {
            //   Class72.method1293();
            //}

            if(var0 == 5 || !client.closed_revision_choosing) {
               client.load_title_screen(Class3_Sub13_Sub25.cacheIndex10);
            } else {
               Class3_Sub13_Sub17.method247((byte)-121);
            }

            boolean var3 = 5 == Class143.gameState || Class143.gameState == 10 || 28 == Class143.gameState;
            if(var3 == !var2) {
               if(var2) {
                  AbstractTimer.anInt1691 = KeyboardHandler.anInt1912;
                  if(Class9.musicVolume != 0) {
                     Class151.method2099(true, KeyboardHandler.anInt1912, 0, Class75_Sub2.cacheIndex6, false, 255, 2);
                  } else {
                     Queue.method882(-1, 2);
                  }

                  Class58.js5CacheWorker.method1247(false);
               } else {
                  Queue.method882(-1, 2);
                  Class58.js5CacheWorker.method1247(true);
               }
            }

            if(HDToolkit.openGLEnabled && (25 == var0 || var0 == 28 || 40 == var0)) {
               HDToolkit.method1833();
            }
            
            if(HDToolkit.openGLEnabled && (var0 == 30)) {
                Class44.forceRefresh = true;
            }
            
            Class143.gameState = var0;
         }
   }

   static final void method1720(boolean var0) {
		AbstractTimer.anIntArray1695 = new int[104];
		Class80.anIntArray1138 = new int[104];
		Class85.anInt1174 = 99;
		MouseHandler.anIntArray1920 = new int[104];
		byte var2;
		if (var0) {
			var2 = 1;
		} else {
			var2 = 4;
		}
		Class93.aByteArrayArrayArray1328 = new byte[var2][104][104];
		IntegerNode.anIntArray2469 = new int[104];
		Class38_Sub1.anIntArrayArrayArray2609 = new int[var2][105][105];
		Class67.aByteArrayArrayArray1014 = new byte[var2][105][105];
		Class139.aByteArrayArrayArray1828 = new byte[var2][104][104];
		OverridedInterface.anIntArray2606 = new int[104];
		PacketParser.aByteArrayArrayArray81 = new byte[var2][104][104];
		Class3_Sub13_Sub36.aByteArrayArrayArray3430 = new byte[var2][104][104];
   }

   public static void method1721() {
		aClass94_1610 = null;
		keycodes = null;
		aClass94_1614 = null;
		aClass44_Sub1Array1609 = null;
		anIntArray1613 = null;
		aClass94_1615 = null;
   }

   static final LDSprite method1722(int var0) {
      try {
         int var1 = ItemPile.spriteWidths[0] * Class3_Sub13_Sub6.spriteHeights[0];
         byte[] var2 = Class163_Sub1.spritePaletteIndicators[0];
         int[] var3 = new int[var1];

         for(int var4 = 0; var1 > var4; ++var4) {
            var3[var4] = Class3_Sub13_Sub38.spritePalette[ClientScript.method633(var2[var4], 255)];
         }

         LDSprite var6 = new LDSprite(Class3_Sub15.spriteTrimWidth, GrandExchangeItem.spriteTrimHeight, Class164.spriteXOffsets[0], Buffer.spriteYOffsets[0], ItemPile.spriteWidths[0], Class3_Sub13_Sub6.spriteHeights[0], var3);
         client.resetSprites();
         return var0 >= -51?(LDSprite)null:var6;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "pl.A(" + var0 + ')');
      }
   }

}
