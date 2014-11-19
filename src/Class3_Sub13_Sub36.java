
final class Class3_Sub13_Sub36 extends Class3_Sub13 {

   static int anInt3422;
   static int anInt3423;
   static float aFloat3424;
   private int[] anIntArray3425;
   
   private static jString aClass94_3428 = jString.createJString(" more options");
   static js5 aClass153_3429;
   static byte[][][] aByteArrayArrayArray3430;
   private int anInt3431;
   private int anInt3433;
   private int anInt3434 = -1;
   static float aFloat3435;
   private static jString aClass94_3437 = jString.createJString("Attack");
static jString aClass94_3426 = aClass94_3428;
   static jString aClass94_3427 = aClass94_3437;

   static final void method338(int endY, boolean var2, int startX, int endX, int startY) {
         ++VarBit.anInt1127;
         Class124.method1745(0);
         if(!var2) {
            Class3_Sub5.method116(true, 670232012);
            TextureLoader.method1611(71, true);
            Class3_Sub5.method116(false, 670232012);
         }

         TextureLoader.method1611(100, false);
         if(!var2) {
            Class3_Sub13_Sub28.method302(2);
         }

         Class144.method2067(false);
         if(HDToolkit.openGLEnabled) {
            Class65.method1239(endX, 125, startY, endY, startX, true);
            startX = Class163_Sub1.anInt2989;
            startY = Class3_Sub28_Sub3.anInt3564;
            endX = HintIcon.anInt1358;
            endY = Canvas_Sub2.anInt31;
         }

         int var6;
         int var7;
         if(1 == GrandExchangeItem.anInt1753) {
            var7 = 2047 & StringNode.anInt2589 + SpotAnimation.cameraYaw;
            var6 = Class3_Sub9.anInt2309;
            if(~var6 > ~(Class75_Sub4.anInt2670 / 256)) {
               var6 = Class75_Sub4.anInt2670 / 256;
            }

            if(Class104.aBooleanArray2169[4] && Class166.anIntArray2073[4] + 128 > var6) {
               var6 = 128 + Class166.anIntArray2073[4];
            }

            Class140_Sub2.method1952(Class3_Sub13_Sub13.anInt3155, -1907397104, endY, Class121.method1736(Class26.plane, 1, TextureLoader.selfPlayer.anInt2819, TextureLoader.selfPlayer.anInt2829) + -50, 600 - -(var6 * 3), var7, Class62.anInt942, var6);
         }

            var7 = Class7.renderZ;
            var6 = Npc.renderX;
            int var8 = Class77.renderY;
            int var9 = Class139.renderPitch;
            int var10 = Class3_Sub13_Sub25.renderYaw;

            int var11;
            int var12;
            for(var11 = 0; 5 > var11; ++var11) {
               if(Class104.aBooleanArray2169[var11]) {
                  var12 = (int)((double)(-Class3_Sub13_Sub32.anIntArray3383[var11]) + (double)(Class3_Sub13_Sub32.anIntArray3383[var11] * 2 + 1) * Math.random() + Math.sin((double)Class163_Sub1_Sub1.anIntArray4009[var11] * ((double)Class3_Sub13_Sub29.anIntArray3359[var11] / 100.0D)) * (double)Class166.anIntArray2073[var11]);
                  if(var11 == 3) {
                     Class3_Sub13_Sub25.renderYaw = var12 + Class3_Sub13_Sub25.renderYaw & 2047;
                  }

                  if(var11 == 4) {
                     Class139.renderPitch += var12;
                     if(128 > Class139.renderPitch) {
                        Class139.renderPitch = 128;
                     }

                     if(~Class139.renderPitch < -384) {
                        Class139.renderPitch = 383;
                     }
                  }

                  if(2 == var11) {
                     Class77.renderY += var12;
                  }

                  if(var11 == 1) {
                     Class7.renderZ += var12;
                  }

                  if(var11 == 0) {
                     Npc.renderX += var12;
                  }
               }
            }

            Texture.method725(-118);
            if(HDToolkit.openGLEnabled) {
               GraphicsHD.clipRect(startX, startY, startX + endX, startY + endY);
               float var17 = (float)Class139.renderPitch * 0.17578125F;
               float var16 = 0.17578125F * (float)Class3_Sub13_Sub25.renderYaw;
               if(GrandExchangeItem.anInt1753 == 3) {
                  var17 = 360.0F * Class85.aFloat1169 / 6.2831855F;
                  var16 = Class45.aFloat730 * 360.0F / 6.2831855F;
               }

               HDToolkit.method1844(startX, startY, endX, endY, endX / 2 + startX, startY - -(endY / 2), var17, var16, Hashtable.anInt1705, Hashtable.anInt1705);
            } else {
               GraphicsLD.clipRect(startX, startY, endX + startX, endY + startY);
               Rasterizer.method1134();
            }

            if(!Class38_Sub1.aBoolean2615 && ~NpcDefinition.anInt1297 <= ~startX && ~NpcDefinition.anInt1297 > ~(endX + startX) && startY <= Class38_Sub1.anInt2612 && ~(endY + startY) < ~Class38_Sub1.anInt2612) {
               Class3_Sub13_Sub7.aBoolean3094 = true;
               Class2.anInt59 = 0;
               var12 = Class145.anInt1898;
               int var13 = Class1.anInt55;
               var11 = Class139.anInt1824;
               Class3_Sub28_Sub11.anInt3642 = var11 + (var12 - var11) * (-startX + NpcDefinition.anInt1297) / endX;
               int var14 = Class86.anInt1195;
               client.anInt384 = (-var13 + var14) * (Class38_Sub1.anInt2612 - startY) / endY + var13;
            } else {
               Class3_Sub13_Sub7.aBoolean3094 = false;
               Class2.anInt59 = 0;
            }

            Class58.method1194();
            byte var19 = -3 != ~Class137.method1817()?1:(byte)VarBit.anInt1127;
            if(HDToolkit.openGLEnabled) {
               HDToolkit.method1846();
               HDToolkit.toggleFog(true);
               boolean var18 = false;
               HDToolkit.toggleFog(true);
               if(~Class143.gameState == -11) {
                  var12 = PacketBuffer.method809(DisplayModeInformation.anInt1446, Class77.renderY >> 10, Class3_Sub28_Sub10.brightness, Npc.renderX >> 10);
               } else {
                  var12 = PacketBuffer.method809(DisplayModeInformation.anInt1446, TextureLoader.selfPlayer.anIntArray2755[0] >> 3, Class3_Sub28_Sub10.brightness, TextureLoader.selfPlayer.anIntArray2767[0] >> 3);
               }

               LightManager.method1269(Class44.loopCycle, !Class44_Sub1.highDetailLights);
               HDToolkit.method1849(var12);
               RuntimeException_Sub1.setRenderPos(Class139.renderPitch, Class77.renderY, Class7.renderZ, Npc.renderX, Class3_Sub13_Sub25.renderYaw);
               HDToolkit.anInt1791 = Class44.loopCycle;
               Class3_Sub22.method398(Npc.renderX, Class7.renderZ, Class77.renderY, Class139.renderPitch, Class3_Sub13_Sub25.renderYaw, AbstractGraphicsBuffer.aByteArrayArrayArray2008, FileSystem.anIntArray686, MillisTimer.anIntArray2696, Class159.anIntArray2021, Player.anIntArray3959, AnimationDefinition.anIntArray1871, Class26.plane + 1, var19, TextureLoader.selfPlayer.anInt2819 >> 7, TextureLoader.selfPlayer.anInt2829 >> 7);
               OutputStream_Sub1.aBoolean47 = true;
               if(Class125.blackIssueFix) {
            	   GraphicsHD.initDefaultBounds();
            	   HDToolkit.method1841();
            	   GraphicsHD.clipRect(startX, startY, endX, endY);
            	   Class125.blackIssueFix = false;
               }
               LightManager.method1265();
               RuntimeException_Sub1.setRenderPos(0, 0, 0, 0, 0);
               Class58.method1194();
               Hashtable.method1775();
               Class82.method1405(startY, endX, startX, Hashtable.anInt1705, endY, Hashtable.anInt1705);
               Class163_Sub2_Sub1.method2221(endX, startX, endY, Hashtable.anInt1705, Hashtable.anInt1705, startY);
            } else {
               GraphicsLD.fillRect(startX, startY, endX, endY, 0);
               Class3_Sub22.method398(Npc.renderX, Class7.renderZ, Class77.renderY, Class139.renderPitch, Class3_Sub13_Sub25.renderYaw, AbstractGraphicsBuffer.aByteArrayArrayArray2008, FileSystem.anIntArray686, MillisTimer.anIntArray2696, Class159.anIntArray2021, Player.anIntArray3959, AnimationDefinition.anIntArray1871, Class26.plane - -1, var19, TextureLoader.selfPlayer.anInt2819 >> 7, TextureLoader.selfPlayer.anInt2829 >> 7);
               Class58.method1194();
               Hashtable.method1775();
               Class82.method1405(startY, endX, startX, 256, endY, 256);
               Class163_Sub2_Sub1.method2221(endX, startX, endY, 256, 256, startY);
            }

            ((TextureLoader)Rasterizer.anInterface2_838).method1610(true, DisplayModeInformation.anInt1446);
            Class65.method1235(startX, startY, endX, endY);
            Class139.renderPitch = var9;
            Class77.renderY = var8;
            Class7.renderZ = var7;
            Npc.renderX = var6;
            Class3_Sub13_Sub25.renderYaw = var10;
            if(Class3_Sub13_Sub4.aBoolean3064 && Class58.js5CacheWorker.method1253() == 0) {
               Class3_Sub13_Sub4.aBoolean3064 = false;
            }

            if(Class3_Sub13_Sub4.aBoolean3064) {
               if(HDToolkit.openGLEnabled) {
                  GraphicsHD.fillRect(startX, startY, endX, endY, 0);
               } else {
                  GraphicsLD.fillRect(startX, startY, endX, endY, 0);
               }

               client.drawTextOnScreen(Class3_Sub13_Sub23.aClass94_3282, false);
            }

            if(!var2 && !Class3_Sub13_Sub4.aBoolean3064 && !Class38_Sub1.aBoolean2615 && startX <= NpcDefinition.anInt1297 && endX + startX > NpcDefinition.anInt1297 && ~startY >= ~Class38_Sub1.anInt2612 && endY + startY > Class38_Sub1.anInt2612) {
               Class104.method1628(startY, endX, endY, startX, Class38_Sub1.anInt2612, NpcDefinition.anInt1297, (byte)97);
            }
   }

   final int[][] method166(int var1, int var2) {
      try {
         if(var1 != -1) {
            this.anInt3434 = 6;
         }

         int[][] var3 = this.aClass97_2376.method1594((byte)-120, var2);
         if(this.aClass97_2376.aBoolean1379 && this.method339(false)) {
            int var4 = (this.anInt3433 != Class101.anInt1427?this.anInt3433 * var2 / Class101.anInt1427:var2) * this.anInt3431;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int var8;
            int var9;
            if(~Class113.anInt1559 == ~this.anInt3431) {
               for(var8 = 0; var8 < Class113.anInt1559; ++var8) {
                  var9 = this.anIntArray3425[var4++];
                  var7[var8] = ClientScript.method633(var9 << 4, 4080);
                  var6[var8] = ClientScript.method633(var9, '\uff00') >> 4;
                  var5[var8] = ClientScript.method633(var9, 16711680) >> 12;
               }
            } else {
               for(var8 = 0; var8 < Class113.anInt1559; ++var8) {
                  var9 = this.anInt3431 * var8 / Class113.anInt1559;
                  int var10 = this.anIntArray3425[var4 - -var9];
                  var7[var8] = ClientScript.method633(var10 << 4, 4080);
                  var6[var8] = ClientScript.method633('\uff00', var10) >> 4;
                  var5[var8] = ClientScript.method633(var10 >> 12, 4080);
               }
            }
         }

         return var3;
      } catch (RuntimeException var11) {
         throw Class44.method1067(var11, "ui.T(" + var1 + ',' + var2 + ')');
      }
   }

   private final boolean method339(boolean var1) {
      try {
         if(var1) {
            return true;
         } else if(this.anIntArray3425 == null) {
            if(~this.anInt3434 > -1) {
               return false;
            } else {
               int var2 = Class113.anInt1559;
               int var3 = Class101.anInt1427;
               int var4 = !Class17.anInterface2_408.method14((byte)-104, this.anInt3434)?128:64;
               this.anIntArray3425 = Class17.anInterface2_408.method16(64, this.anInt3434);
               this.anInt3433 = var4;
               this.anInt3431 = var4;
               Class3_Sub13_Sub3.method180(18, var3, var2);
               return this.anIntArray3425 != null;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "ui.LA(" + var1 + ')');
      }
   }

   static final int method340(int var0, int var1) {
      try {
         int var2 = 74 % ((8 - var1) / 54);
         return var0 >>> -376164472;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "ui.NA(" + var0 + ',' + var1 + ')');
      }
   }

   final void method157(int var1, Buffer var2, boolean var3) {
      try {
         if(!var3) {
            aClass153_3429 = (js5)null;
         }

         if(0 == var1) {
            this.anInt3434 = var2.getUShort();
         }

      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "ui.A(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

   public Class3_Sub13_Sub36() {
      super(0, false);
   }

	final void method161() {
		super.method161();
		this.anIntArray3425 = null;
	}

   public static void method341(byte var0) {
      try {
         aClass94_3428 = null;
         aClass94_3437 = null;
         aClass94_3427 = null;
         aClass94_3426 = null;
         if(var0 > 66) {
            aClass153_3429 = null;
            aByteArrayArrayArray3430 = (byte[][][])null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ui.MA(" + var0 + ')');
      }
   }

   static final AbstractIndexedSprite[] method343() {
		AbstractIndexedSprite[] var1 = new AbstractIndexedSprite[Class95.spriteAmount];

		for (int var2 = 0; Class95.spriteAmount > var2; ++var2) {
			if (!HDToolkit.openGLEnabled) {
				var1[var2] = new LDIndexedSprite(Class3_Sub15.spriteTrimWidth, GrandExchangeItem.spriteTrimHeight, Class164.spriteXOffsets[var2], Buffer.spriteYOffsets[var2], ItemPile.spriteWidths[var2], Class3_Sub13_Sub6.spriteHeights[var2], Class163_Sub1.spritePaletteIndicators[var2], Class3_Sub13_Sub38.spritePalette);
			} else {
				var1[var2] = new HDIndexedSprite(Class3_Sub15.spriteTrimWidth, GrandExchangeItem.spriteTrimHeight, Class164.spriteXOffsets[var2], Buffer.spriteYOffsets[var2], ItemPile.spriteWidths[var2], Class3_Sub13_Sub6.spriteHeights[var2], Class163_Sub1.spritePaletteIndicators[var2], Class3_Sub13_Sub38.spritePalette);
			}
		}

		client.resetSprites();
		return var1;
   }

   final int method155(byte var1) {
      try {
         if(var1 != 19) {
            this.method155((byte)-60);
         }

         return this.anInt3434;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "ui.HA(" + var1 + ')');
      }
   }

   static final void method344(int var0, int var1) {
      try {
         if(0 <= var0 && Class3_Sub24_Sub4.aBooleanArray3503.length > var0) {
            Class3_Sub24_Sub4.aBooleanArray3503[var0] = !Class3_Sub24_Sub4.aBooleanArray3503[var0];
            if(var1 != 4) {
               aByteArrayArrayArray3430 = (byte[][][])((byte[][][])null);
            }

         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "ui.KA(" + var0 + ',' + var1 + ')');
      }
   }

}
