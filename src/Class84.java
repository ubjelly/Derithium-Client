
final class Class84 {

   static int[][] anIntArrayArray1160 = new int[104][104];
   static int[] anIntArraay1161;
   //static Deque aClass61_1162 = new Deque();
   static int[] anIntArray1163 = new int[1000];
   static int anInt1164 = 0;
   static int anInt1165 = -1;


	static final void method1417() {
		if (~Class143.gameState == -11 && HDToolkit.openGLEnabled) {
			Class117.setGameState(28);
		}

		if (~Class143.gameState == -31) {
			Class117.setGameState(25);
		}
	}

   /*static final void method1418(js5 var1) {
         Class163_Sub2_Sub1.aClass109_Sub1Array4027 = EnumType.method619((byte)65, Npc.anInt4001, var1);
         PlayerAppearance.anIntArray861 = new int[256];

         int var2;
         for(var2 = 0; -4 < ~var2; ++var2) {
            int var4 = (Class131.anIntArray1729[1 + var2] & 16711680) >> 16;
            float var3 = (float)((Class131.anIntArray1729[var2] & 16711680) >> 16);
            float var6 = (float)(Class131.anIntArray1729[var2] >> 8 & 255);
            float var9 = (float)(Class131.anIntArray1729[var2] & 255);
            float var5 = ((float)var4 - var3) / 64.0F;
            int var7 = (Class131.anIntArray1729[var2 + 1] & '\uff00') >> 8;
            float var8 = (-var6 + (float)var7) / 64.0F;
            int var10 = Class131.anIntArray1729[var2 + 1] & 255;
            float var11 = ((float)var10 - var9) / 64.0F;

            for(int var12 = 0; -65 < ~var12; ++var12) {
               PlayerAppearance.anIntArray861[var12 + 64 * var2] = Class3_Sub13_Sub29.method308((int)var9, Class3_Sub13_Sub29.method308((int)var6 << 8, (int)var3 << 16));
               var6 += var8;
               var9 += var11;
               var3 += var5;
            }
         }

         for(var2 = 192; var2 < 255; ++var2) {
            PlayerAppearance.anIntArray861[var2] = Class131.anIntArray1729[3];
         }

         Class161.anIntArray2026 = new int['\u8000'];
         OutputStream_Sub1.anIntArray49 = new int['\u8000'];
         Class3_Sub13_Sub10.method215((byte)-89, (LDIndexedSprite)null);
         PacketBuffer.anIntArray3805 = new int['\u8000'];
         Class127.anIntArray1681 = new int['\u8000'];
         Class97.aClass3_Sub28_Sub16_Sub2_1381 = new LDSprite(128, 254);
   }*/

   static final void method1419(int var0) {
	   if (!client.newMenus) {
		   int var2 = Class3_Sub13_Sub33.anInt3395;
	         int var3 = Class3_Sub28_Sub3.anInt3552;
	         int var1 = AbstractIndexedSprite.anInt1462;
	         int var5 = 6116423;
	         int var4 = Class3_Sub28_Sub1.anInt3537;
	         if(!HDToolkit.openGLEnabled) {//open gl is enabled boolean nigger
	            GraphicsLD.fillRect(var1, var2, var3, var4, var5);
	            GraphicsLD.fillRect(1 + var1, 1 + var2, var3 + -2, 16, 0);
	            GraphicsLD.drawRect(1 + var1, var2 + 18, -2 + var3, -19 + var4, 0);
	         } else {
	            GraphicsHD.fillRect(var1, var2, var3, var4, var5);
	            GraphicsHD.fillRect(1 + var1, 1 + var2, var3 + -2, 16, 0);
	            GraphicsHD.drawRect(1 + var1, var2 + 18, var3 + -2, -19 + var4, 0);
	         }
	         client.getBoldFont().method681(Class75_Sub4.aClass94_2667, var1 - -3, var2 + 14, var5, -1);
	         int var7 = Hashtable.anInt1709;
	         int var6 = PlainTile.anInt1676;
	         if(var0 >= -113) {
	            anIntArrayArray1160 = (int[][])((int[][])null);
	         }
	         for(int var8 = 0; ~Class3_Sub13_Sub34.anInt3415 < ~var8; ++var8) {
	            int var9 = (-var8 + -1 + Class3_Sub13_Sub34.anInt3415) * 15 + var2 - -31;
	            int var10 = 16777215;
	            if(~var1 > ~var6 && ~var6 > ~(var1 - -var3) && -13 + var9 < var7 && ~var7 > ~(3 + var9)) {
	               var10 = 16776960;
	            }
	            client.getBoldFont().method681(Buffer.method802(var8, true), var1 - -3, var9, var10, 0);
	         }
	         LookupTable.method1282(AbstractIndexedSprite.anInt1462, Class3_Sub13_Sub33.anInt3395, Class3_Sub28_Sub1.anInt3537, Class3_Sub28_Sub3.anInt3552);
	   } else {
		   int menuWidth = Class3_Sub28_Sub3.anInt3552;
		   	 int menuOffsetY = Class3_Sub13_Sub33.anInt3395;
		     int menuOffsetX = AbstractIndexedSprite.anInt1462;
	         int color = 6116423;
	         int menuHeight = Class3_Sub28_Sub1.anInt3537;
	 		 int yPos = menuOffsetY, xPos = menuOffsetX;
	 		 if(!HDToolkit.openGLEnabled) {
	 			GraphicsLD.fillRect(xPos + 2, yPos, menuWidth - 4, 1, 0x6d6a5b);
				GraphicsLD.fillRect(xPos + 1, yPos + 1, menuWidth - 2, 1, 0x6d6a5b);
				GraphicsLD.fillRect(xPos, yPos + 2, menuWidth, menuHeight - 2, 0x6d6a5b);
				GraphicsLD.fillRect(xPos + 1, yPos + 3, menuWidth - 2, menuHeight - 4, 0x2b2622);
				GraphicsLD.fillRect(xPos + 3, yPos + 1, menuWidth - 6, 1, 0x322e22);
				GraphicsLD.fillRect(xPos + 3, yPos + 2, menuWidth - 6, 1, 0x2a291b);
				GraphicsLD.fillRect(xPos + 3, yPos + 3, menuWidth - 6, 1, 0x2a261b);
				GraphicsLD.fillRect(xPos + 3, yPos + 4, menuWidth - 6, 1, 0x252116);
				GraphicsLD.fillRect(xPos + 2, yPos + 5, menuWidth - 4, 1, 0x211e15);
				GraphicsLD.fillRect(xPos + 2, yPos + 6, menuWidth - 4, 1, 0x1e1b12);
				GraphicsLD.fillRect(xPos + 2, yPos + 7, menuWidth - 4, 1, 0x1a170e);
				GraphicsLD.fillRect(xPos + 2, yPos + 8, menuWidth - 4, 1, 0x15120b);
				GraphicsLD.fillRect(xPos + 2, yPos + 9, menuWidth - 4, 1, 0x15120b);
				GraphicsLD.fillRect(xPos + 2, yPos + 10, menuWidth - 4, 1, 0x100d08);
				GraphicsLD.fillRect(xPos + 2, yPos + 11, menuWidth - 4, 1, 0x090a04);
				GraphicsLD.fillRect(xPos + 2, yPos + 12, menuWidth - 4, 1, 0x080703);
				GraphicsLD.fillRect(xPos + 2, yPos + 13, menuWidth - 4, 1, 0x090a04);
				GraphicsLD.fillRect(xPos + 2, yPos + 14, menuWidth - 4, 1, 0x070802);
				GraphicsLD.fillRect(xPos + 2, yPos + 15, menuWidth - 4, 1, 0x090a04);
				GraphicsLD.fillRect(xPos + 2, yPos + 16, menuWidth - 4, 1, 0x070802);
				GraphicsLD.fillRect(xPos + 2, yPos + 17, menuWidth - 4, 1, 0x090a04);
				GraphicsLD.fillRect(xPos + 2, yPos + 1, 1, 1, 0x2b271c);
				GraphicsLD.fillRect(xPos + 1, yPos + 2, 2, 1, 0x2b271c);
				GraphicsLD.fillRect(xPos + menuWidth - 3, yPos + 1, 1, 1, 0x2b271c);
				GraphicsLD.fillRect(xPos + menuWidth - 3, yPos + 2, 2, 1, 0x2b271c);
				GraphicsLD.fillRect(xPos + 2, yPos + 19, menuWidth - 4, menuHeight - 21, 0x524a3d);
				GraphicsLD.fillRect(xPos + 3, yPos + 20, menuWidth - 6, menuHeight - 23, 0x2b271c);
				GraphicsLD.fillRect(xPos, yPos + menuHeight - 1, 1, 1, 0x2d2822);
				GraphicsLD.fillRect(xPos, yPos + menuHeight - 2, 1, 1, 0x524a3d);
				GraphicsLD.fillRect(xPos + 1, yPos + menuHeight - 1, 1, 1, 0x524a3d);
				GraphicsLD.fillRect(xPos + 1, yPos + menuHeight - 3, 1, 1, 0x6e675f);
				GraphicsLD.fillRect(xPos + 1, yPos + menuHeight - 2, 2, 1, 0x6e675f);
				GraphicsLD.fillRect(xPos + 2, yPos + menuHeight - 3, 1, 1, 0x2e2a1f);
				GraphicsLD.fillRect(xPos + menuWidth - 1, yPos + menuHeight - 1, 1, 1, 0x2d2822);
				GraphicsLD.fillRect(xPos + menuWidth - 1, yPos + menuHeight - 2, 1, 1, 0x524a3d);
				GraphicsLD.fillRect(xPos + menuWidth - 2, yPos + menuHeight - 1, 1, 1, 0x524a3d);
				GraphicsLD.fillRect(xPos + menuWidth - 2, yPos + menuHeight - 3, 1, 1, 0x6e675f);
				GraphicsLD.fillRect(xPos + menuWidth - 3, yPos + menuHeight - 2, 2, 1, 0x6e675f);
				GraphicsLD.fillRect(xPos + menuWidth - 3, yPos + menuHeight - 3, 1, 1, 0x2e2a1f);
	 		 } else {
		 			GraphicsHD.fillRect(xPos + 2, yPos, menuWidth - 4, 1, 0x6d6a5b);
					GraphicsHD.fillRect(xPos + 1, yPos + 1, menuWidth - 2, 1, 0x6d6a5b);
					GraphicsHD.fillRect(xPos, yPos + 2, menuWidth, menuHeight - 2, 0x6d6a5b);
					GraphicsHD.fillRect(xPos + 1, yPos + 3, menuWidth - 2, menuHeight - 4, 0x2b2622);
					GraphicsHD.fillRect(xPos + 3, yPos + 1, menuWidth - 6, 1, 0x322e22);
					GraphicsHD.fillRect(xPos + 3, yPos + 2, menuWidth - 6, 1, 0x2a291b);
					GraphicsHD.fillRect(xPos + 3, yPos + 3, menuWidth - 6, 1, 0x2a261b);
					GraphicsHD.fillRect(xPos + 3, yPos + 4, menuWidth - 6, 1, 0x252116);
					GraphicsHD.fillRect(xPos + 2, yPos + 5, menuWidth - 4, 1, 0x211e15);
					GraphicsHD.fillRect(xPos + 2, yPos + 6, menuWidth - 4, 1, 0x1e1b12);
					GraphicsHD.fillRect(xPos + 2, yPos + 7, menuWidth - 4, 1, 0x1a170e);
					GraphicsHD.fillRect(xPos + 2, yPos + 8, menuWidth - 4, 1, 0x15120b);
					GraphicsHD.fillRect(xPos + 2, yPos + 9, menuWidth - 4, 1, 0x15120b);
					GraphicsHD.fillRect(xPos + 2, yPos + 10, menuWidth - 4, 1, 0x100d08);
					GraphicsHD.fillRect(xPos + 2, yPos + 11, menuWidth - 4, 1, 0x090a04);
					GraphicsHD.fillRect(xPos + 2, yPos + 12, menuWidth - 4, 1, 0x080703);
					GraphicsHD.fillRect(xPos + 2, yPos + 13, menuWidth - 4, 1, 0x090a04);
					GraphicsHD.fillRect(xPos + 2, yPos + 14, menuWidth - 4, 1, 0x070802);
					GraphicsHD.fillRect(xPos + 2, yPos + 15, menuWidth - 4, 1, 0x090a04);
					GraphicsHD.fillRect(xPos + 2, yPos + 16, menuWidth - 4, 1, 0x070802);
					GraphicsHD.fillRect(xPos + 2, yPos + 17, menuWidth - 4, 1, 0x090a04);
					GraphicsHD.fillRect(xPos + 2, yPos + 1, 1, 1, 0x2b271c);
					GraphicsHD.fillRect(xPos + 1, yPos + 2, 2, 1, 0x2b271c);
					GraphicsHD.fillRect(xPos + menuWidth - 3, yPos + 1, 1, 1, 0x2b271c);
					GraphicsHD.fillRect(xPos + menuWidth - 3, yPos + 2, 2, 1, 0x2b271c);
					GraphicsHD.fillRect(xPos + 2, yPos + 19, menuWidth - 4, menuHeight - 21, 0x524a3d);
					GraphicsHD.fillRect(xPos + 3, yPos + 20, menuWidth - 6, menuHeight - 23, 0x2b271c);
					GraphicsHD.fillRect(xPos, yPos + menuHeight - 1, 1, 1, 0x2d2822);
					GraphicsHD.fillRect(xPos, yPos + menuHeight - 2, 1, 1, 0x524a3d);
					GraphicsHD.fillRect(xPos + 1, yPos + menuHeight - 1, 1, 1, 0x524a3d);
					GraphicsHD.fillRect(xPos + 1, yPos + menuHeight - 3, 1, 1, 0x6e675f);
					GraphicsHD.fillRect(xPos + 1, yPos + menuHeight - 2, 2, 1, 0x6e675f);
					GraphicsHD.fillRect(xPos + 2, yPos + menuHeight - 3, 1, 1, 0x2e2a1f);
					GraphicsHD.fillRect(xPos + menuWidth - 1, yPos + menuHeight - 1, 1, 1, 0x2d2822);
					GraphicsHD.fillRect(xPos + menuWidth - 1, yPos + menuHeight - 2, 1, 1, 0x524a3d);
					GraphicsHD.fillRect(xPos + menuWidth - 2, yPos + menuHeight - 1, 1, 1, 0x524a3d);
					GraphicsHD.fillRect(xPos + menuWidth - 2, yPos + menuHeight - 3, 1, 1, 0x6e675f);
					GraphicsHD.fillRect(xPos + menuWidth - 3, yPos + menuHeight - 2, 2, 1, 0x6e675f);
					GraphicsHD.fillRect(xPos + menuWidth - 3, yPos + menuHeight - 3, 1, 1, 0x2e2a1f);
	 		 }
	 		client.getBoldFont().method681(Class75_Sub4.aClass94_2667,  3 + menuOffsetX, menuOffsetY - -14, color, -1);
	         int var7 = Hashtable.anInt1709;
	         int var6 = PlainTile.anInt1676;
	         for(int var8 = 0; ~Class3_Sub13_Sub34.anInt3415 < ~var8; ++var8) {
	        	int var9 = (-var8 + -1 + Class3_Sub13_Sub34.anInt3415) * 15 + menuOffsetY - -31;
	            int var10 = 0xc6b895;
	            if(~menuOffsetX > ~var6 && ~var6 > ~(menuOffsetX - -menuWidth) && -13 + var9 < var7 && ~var7 > ~(3 + var9)) {
	            	if(!HDToolkit.openGLEnabled) {
	            		if (Buffer.method802(var8, true).method1531(jString.createJString("Cancel"))) {
	            			GraphicsLD.fillRect(xPos + 3, var9 - 10, menuWidth - 6, 12, 0x6f695d);
	            		} else {
	            			GraphicsLD.fillRect(xPos + 3, var9 - 11, menuWidth - 6, 14, 0x6f695d);
	            		}
	            	} else {
	 	               if (Buffer.method802(var8, true).method1531(jString.createJString("Cancel"))) {
	 	            	   	GraphicsHD.fillRect(xPos + 3, var9 - 10, menuWidth - 6, 12, 0x6f695d);
		        		} else {
		        			GraphicsHD.fillRect(xPos + 3, var9 - 11, menuWidth - 6, 14, 0x6f695d);
		        		}
	            	}
	            	var10 = 0xeee5c6;
	            }
	            client.getBoldFont().method681(Buffer.method802(var8, true), menuOffsetX + 3, var9, var10, 0);
	         }
	         LookupTable.method1282(AbstractIndexedSprite.anInt1462, Class3_Sub13_Sub33.anInt3395, Class3_Sub28_Sub1.anInt3537, Class3_Sub28_Sub3.anInt3552);
	   }
   }

   static final void method1420(int var0, int var1, int var2, int var3) {
		InterfaceChangeNode var5 = Class3_Sub24_Sub3.putInterfaceChange(10, var0);
		var5.add();
		var5.intValue2 = var2;
		var5.intValue = var3;
		var5.intValue3 = var1;
   }

	static final int method1421() {
		return ((Class3_Sub13_Sub15.isStereo ? 1 : 0) << 19) + (((Class38.aBoolean661 ? 1 : 0) << 16) + ((!Class128.aBoolean1685 ? 0 : 1) << 15) + ((!DisplayModeInformation.aBoolean1441 ? 0 : 1) << 13) + ((Class140_Sub6.aBoolean2910 ? 1 : 0) << 10) + ((Class3_Sub13_Sub22.aBoolean3275 ? 1 : 0) << 9) + ((jInterface.manyIdleAnimations ? 1 : 0) << 7) + ((!Class25.lowMemoryTextures ? 0 : 1) << 6) + ((KeyboardHandler.showGroundDecorations ? 1 : 0) << 5) + (((!EnumType.visibleLevels ? 0 : 1) << 3) + (Class3_Sub28_Sub10.brightness & 7) - (-((!AbstractObjectCache.removeRoofs ? 0 : 1) << 4) + -((Class44_Sub1.highDetailLights ? 1 : 0) << 8)) - (-(Class80.anInt1137 << 11 & 6144) + -((-1 == ~InterfaceListener.soundEffectsVolume ? 0 : 1) << 20) - (((~Class9.musicVolume != -1 ? 1 : 0) << 21) + ((~Class14.areaSoundsVolume == -1 ? 0 : 1) << 22)))) - -(ParticleEngine.method1757() << 23));
	}

   public static void method1422(byte var0) {
      try {
         anIntArrayArray1160 = (int[][])null;
         //anIntArray1161 = null;
         //aClass61_1162 = null;
         anIntArray1163 = null;
         if(var0 != 24) {
            method1420(-74, 65, 51, 91);
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "lf.B(" + var0 + ')');
      }
   }

}
