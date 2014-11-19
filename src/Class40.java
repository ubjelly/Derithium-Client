
final class Class40 {

   static jString aClass94_672 = jString.createJString("null");
   static jString aClass94_673 = jString.createJString(")0");
   static int[] anIntArray675 = new int[]{16, 32, 64, 128};
   static jString aClass94_676 = null;
   static int anInt677 = 0;
   static int anInt678;
   static js5 aClass153_679;
   static AbstractSprite aClass3_Sub28_Sub16_680;


   static final int method1040(int var0, int var1, byte var2, int var3) {
      try {
         return var2 != 0?-127:(~var3 < ~var1?var3:(var1 > var0?var0:var1));
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "gd.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void method1041(long var0, int var2) {
      try {
         Class3_Sub13_Sub1.outputStream.pos = 0;
         Class3_Sub13_Sub1.outputStream.putByte(186);
         Class3_Sub13_Sub1.outputStream.putLong(var0);
         Canvas_Sub1.anInt23 = 1;
         if(var2 == -28236) {
            Class132.anInt1734 = 0;
            SpotAnimation.anInt548 = 0;
            Hashtable.anInt1711 = -3;
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "gd.D(" + var0 + ',' + var2 + ')');
      }
   }

   public static void method1042(boolean var0) {
      try {
         aClass153_679 = null;
         aClass94_676 = null;
         if(!var0) {
            aClass153_679 = (js5)null;
         }

         aClass94_672 = null;
         anIntArray675 = null;
         aClass94_673 = null;
         aClass3_Sub28_Sub16_680 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "gd.A(" + var0 + ')');
      }
   }

   static final LDSprite method1043(int var0, js5 var1, int var2, int var3) {
      try {
         if(var2 != -3178) {
            method1044(-55);
         }

         return client.spriteExists(var1, var0, var3)?Class117.method1722(-53):null;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "gd.G(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void method1044(int var0) {
      try {
         if(var0 != -3782) {
            aClass94_672 = (jString)null;
         }

         InterfaceListener.aClass93_2450.clearSoftReference();
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "gd.E(" + var0 + ')');
      }
   }

   static final void method1045(int var0) {
      try {
         if(var0 != -19761) {
            rebuildMap();
         }

         Class128.aClass93_1683.clearAll();
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "gd.B(" + var0 + ')');
      }
   }

   static final void rebuildMap() {
		Class163_Sub1.ping(false);
		Class3_Sub13_Sub24.anInt3293 = 0;
		boolean pass = true;

		for (int var2 = 0; Class164_Sub2.aByteArrayArray3027.length > var2; var2++) {
			if (-1 != client.anIntArray2200[var2] && null == Class164_Sub2.aByteArrayArray3027[var2]) {
				Class164_Sub2.aByteArrayArray3027[var2] = Class3_Sub13_Sub6.cacheIndex5.getFile(client.anIntArray2200[var2], 0);
				if (Class164_Sub2.aByteArrayArray3027[var2] == null) {
					++Class3_Sub13_Sub24.anInt3293;
					pass = false;
				}
			}

			if (-1 != Class101.anIntArray1426[var2] && null == Class3_Sub22.aByteArrayArray2521[var2]) {
				Class3_Sub22.aByteArrayArray2521[var2] = Class3_Sub13_Sub6.cacheIndex5.method2126(Class101.anIntArray1426[var2], Class3_Sub9.anIntArrayArray2319[var2], 0);
				if (null == Class3_Sub22.aByteArrayArray2521[var2]) {
					pass = false;
					++Class3_Sub13_Sub24.anInt3293;
				}
			}

			if (HDToolkit.openGLEnabled) {
				if (~Class3_Sub13_Sub15.anIntArray3181[var2] != 0 && GroundItem.aByteArrayArray3669[var2] == null) {
					GroundItem.aByteArrayArray3669[var2] = Class3_Sub13_Sub6.cacheIndex5.getFile(Class3_Sub13_Sub15.anIntArray3181[var2], 0);
					if (null == GroundItem.aByteArrayArray3669[var2]) {
						pass = false;
						++Class3_Sub13_Sub24.anInt3293;
					}
				}

				if (AnimationLoader.anIntArray3587[var2] != -1 && null == Class3_Sub13_Sub4.aByteArrayArray3057[var2]) {
					Class3_Sub13_Sub4.aByteArrayArray3057[var2] = Class3_Sub13_Sub6.cacheIndex5.getFile(AnimationLoader.anIntArray3587[var2], 0);
					if (null == Class3_Sub13_Sub4.aByteArrayArray3057[var2]) {
						++Class3_Sub13_Sub24.anInt3293;
						pass = false;
					}
				}
			}

			if (null != Class3_Sub13_Sub24.anIntArray3290 && null == Class3_Sub13_Sub26.aByteArrayArray3335[var2] && Class3_Sub13_Sub24.anIntArray3290[var2] != -1) {
				Class3_Sub13_Sub26.aByteArrayArray3335[var2] = Class3_Sub13_Sub6.cacheIndex5.method2126(Class3_Sub13_Sub24.anIntArray3290[var2], Class3_Sub9.anIntArrayArray2319[var2], 0);
				if (Class3_Sub13_Sub26.aByteArrayArray3335[var2] == null) {
					++Class3_Sub13_Sub24.anInt3293;
					pass = false;
				}
			}
		}

		/*if (Class3_Sub13_Sub35.aClass131_3421 == null) {
			if (null != Class3_Sub13_Sub21.aClass3_Sub28_Sub3_3264
					&& GrandExchangeItem.aClass153_1751.method2135(
							client.method903(new jString[] { Class3_Sub13_Sub21.aClass3_Sub28_Sub3_3264.aClass94_3561, Player.aClass94_3964 }))) {
				if (!GrandExchangeItem.aClass153_1751.method2127(client.method903(new jString[] { Class3_Sub13_Sub21.aClass3_Sub28_Sub3_3264.aClass94_3561, Player.aClass94_3964 }))) {
					pass = false;
					++Class3_Sub13_Sub24.anInt3293;
				} else {
					Class3_Sub13_Sub35.aClass131_3421 = Class81
							.method1403(client.method903(new jString[] { Class3_Sub13_Sub21.aClass3_Sub28_Sub3_3264.aClass94_3561, Player.aClass94_3964 }), GrandExchangeItem.aClass153_1751);
				}
			} else {
				Class3_Sub13_Sub35.aClass131_3421 = new Class131(0);
			}
		}*/

		if (!pass) {
			Class163_Sub2_Sub1.loadingScreenType = 1;
		} else {
			Class162.modelFetchCount = 0;
			pass = true;

			int var4;
			int var5;
			for (int var2 = 0; Class164_Sub2.aByteArrayArray3027.length > var2; var2++) {
				byte[] var3 = Class3_Sub22.aByteArrayArray2521[var2];
				if (null != var3) {
					var5 = -Class82.anInt1152 + (Class3_Sub24_Sub3.anIntArray3494[var2] & 255) * 64;
					var4 = -Class131.anInt1716 + (Class3_Sub24_Sub3.anIntArray3494[var2] >> 8) * 64;
					if (StringNode.aBoolean2583) {
						var5 = 10;
						var4 = 10;
					}

					pass &= IdentityKit.method944((byte) -97, var4, var5, var3);
				}

				if (HDToolkit.openGLEnabled) {
					var3 = Class3_Sub13_Sub4.aByteArrayArray3057[var2];
					if (null != var3) {
						var4 = -Class131.anInt1716 + 64 * (Class3_Sub24_Sub3.anIntArray3494[var2] >> 8);
						var5 = -Class82.anInt1152 + 64 * (Class3_Sub24_Sub3.anIntArray3494[var2] & 255);
						if (StringNode.aBoolean2583) {
							var5 = 10;
							var4 = 10;
						}

						pass &= IdentityKit.method944((byte) -74, var4, var5, var3);
					}
				}
			}

			if (!pass) {
				Class163_Sub2_Sub1.loadingScreenType = 2;
			} else {
				if (Class163_Sub2_Sub1.loadingScreenType != 0) {
					client.drawTextOnScreen(client.method903(new jString[] { Class3_Sub13_Sub23.aClass94_3282, Class140_Sub2.aClass94_2707 }), true);
				}

				Class58.method1194();
				Class3_Sub13_Sub30.method313();
				boolean var11 = false;
				int var12;
				if (HDToolkit.openGLEnabled && Class128.aBoolean1685) {
					for (var12 = 0; ~Class164_Sub2.aByteArrayArray3027.length < ~var12; ++var12) {
						if (null != Class3_Sub13_Sub4.aByteArrayArray3057[var12] || GroundItem.aByteArrayArray3669[var12] != null) {
							var11 = true;
							break;
						}
					}
				}

				Class3_Sub4.method110(4, 104, 104, HDToolkit.openGLEnabled ? 28 : 25, var11);

				for (var12 = 0; 4 > var12; ++var12) {
					Class86.collisionMap[var12].resetFlags();
				}

				for (var12 = 0; ~var12 > -5; ++var12) {
					for (var4 = 0; var4 < 104; ++var4) {
						for (var5 = 0; -105 < ~var5; ++var5) {
							Class9.aByteArrayArrayArray113[var12][var4][var5] = 0;
						}
					}
				}

				Class164_Sub1.method2241((byte) -115, false);
				if (HDToolkit.openGLEnabled) {
					Class141.aClass109_Sub1_1840.method1671();

					for (var12 = 0; var12 < 13; ++var12) {
						for (var4 = 0; var4 < 13; ++var4) {
							Class141.aClass169ArrayArray1841[var12][var4].aBoolean2106 = true;
						}
					}
				}

				if (HDToolkit.openGLEnabled) {
					LightManager.resetLights();
				}

				if (HDToolkit.openGLEnabled) {
					Class39.method1036(118);
				}

				Class58.method1194();
				System.gc();
				Class163_Sub1.ping(true);
				Class117.method1720(false);
				if (!StringNode.aBoolean2583) {
					Class47.method1091(false);
					Class163_Sub1.ping(true);
					if (HDToolkit.openGLEnabled) {
						var12 = TextureLoader.selfPlayer.anIntArray2767[0] >> 3;
						var4 = TextureLoader.selfPlayer.anIntArray2755[0] >> 3;
						Class3_Sub13_Sub11.method220(var4, var12);
					}

					Class3_Sub13_Sub6.method198(false);
					if (null != Class3_Sub13_Sub26.aByteArrayArray3335) {
						Class3_Sub13_Sub21.method272((byte) -124);
					}
				}

				if (StringNode.aBoolean2583) {
					Class49.method1121(false, (byte) 98);
					Class163_Sub1.ping(true);
					if (HDToolkit.openGLEnabled) {
						var12 = TextureLoader.selfPlayer.anIntArray2767[0] >> 3;
						var4 = TextureLoader.selfPlayer.anIntArray2755[0] >> 3;
						Class3_Sub13_Sub11.method220(var4, var12);
					}

					Class163_Sub2_Sub1.method2223(false, (byte) -121);
				}

				Class3_Sub13_Sub30.method313();
				Class163_Sub1.ping(true);
				ProducingGraphicsBuffer.method2189(Class86.collisionMap, false);
				if (HDToolkit.openGLEnabled) {
					LightManager.method1270();
				}

				Class163_Sub1.ping(true);
				var12 = Class85.anInt1174;
				if (var12 > Class26.plane) {
					var12 = Class26.plane;
				}

				if (~var12 > ~(Class26.plane + -1)) {
					var12 = -1 + Class26.plane;
				}

				if (!Npc.visibleLevels()) {
					Class85.method1425(Class85.anInt1174);
				} else {
					Class85.method1425(0);
				}

				Class56.method1188(-113);
				if (HDToolkit.openGLEnabled && var11) {
					Class167.method2264(true);
					Class117.method1720(true);
					if (!StringNode.aBoolean2583) {
						Class47.method1091(true);
						Class163_Sub1.ping(true);
						//Class3_Sub13_Sub6.method198(true, -32624);//TODO crash
					}

					if (StringNode.aBoolean2583) {
						Class49.method1121(true, (byte) 56);
						Class163_Sub1.ping(true);
						Class163_Sub2_Sub1.method2223(true, (byte) -105);
					}

					Class3_Sub13_Sub30.method313();
					Class163_Sub1.ping(true);
					ProducingGraphicsBuffer.method2189(Class86.collisionMap, true);
					Class163_Sub1.ping(true);
					Class56.method1188(-113);
					Class167.method2264(false);
				}

				if (HDToolkit.openGLEnabled) {
					for (var4 = 0; var4 < 13; ++var4) {
						for (var5 = 0; ~var5 > -14; ++var5) {
							Class141.aClass169ArrayArray1841[var4][var5].method2281(Class44.anIntArrayArrayArray723[0], var4 * 8, var5 * 8);
						}
					}
				}

				for (int x = 0; x < 104; ++x) {
					for (int y = 0; 104 > y; ++y) {
						Class128.spawnGroundItem(y, x);
					}
				}

				Buffer.method792(9179409);
				Class58.method1194();
				Class3_Sub13_Sub31.method318(7759444);
				Class3_Sub13_Sub30.method313();
				Class3_Sub13_Sub34.aBoolean3416 = false;
				if (Class3_Sub13_Sub7.resizableFrame != null && null != Class3_Sub15.worldConnection && 25 == Class143.gameState) {
					Class3_Sub13_Sub1.outputStream.putPacket(174);
					Class3_Sub13_Sub1.outputStream.putInt(1057001181);
				}

				if (!StringNode.aBoolean2583) {
					int var7 = (LongNode.anInt2294 + 6) / 8;
					int var6 = (LongNode.anInt2294 - 6) / 8;
					var4 = (AbstractObjectCache.anInt3606 - 6) / 8;
					var5 = (AbstractObjectCache.anInt3606 - -6) / 8;

					for (int var8 = var4 - 1; ~var8 >= ~(var5 - -1); ++var8) {
						for (int var9 = -1 + var6; ~var9 >= ~(var7 - -1); ++var9) {
							if (~var8 > ~var4 || var8 > var5 || ~var9 > ~var6 || var9 > var7) {
								Class3_Sub13_Sub6.cacheIndex5.method2124(
										client.method903(new jString[] { PacketBuffer.aClass94_3807, Class72.method1298(var8), Class3_Sub13_Sub14.aClass94_3161,
												Class72.method1298(var9) }));
								Class3_Sub13_Sub6.cacheIndex5.method2124(client.method903(new jString[] { Class161.aClass94_2029, Class72.method1298(var8),
										Class3_Sub13_Sub14.aClass94_3161, Class72.method1298(var9) }));
							}
						}
					}
				}

				if (Class143.gameState == 28) {
					Class117.setGameState(10);
				} else {
					Class117.setGameState(30);
					if (null != Class3_Sub15.worldConnection) {
						Class3_Sub13_Sub1.outputStream.putPacket(202);
					}
				}

				//Class3_Sub20.method388();
				Class58.method1194();
				Class75_Sub4.method1355();
			}
		}
   }

}
