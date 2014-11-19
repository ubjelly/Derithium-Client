
final class Class167 {

   static jString aClass94_2082 = jString.createJString(" <col=ffff00>");
   static jString aClass94_2083 = null;
   static jString aClass94_2084 = jString.createJString("ul");
   static int anInt2087 = 0;


   static final void method2261(int var0) {
      try {
         while(true) {
            if(SpotAnimation.aClass3_Sub30_Sub1_532.getBitsLeft(Hashtable.anInt1704) >= 27) {
               int var1 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(15);
               if(32767 != var1) {
                  boolean var2 = false;
                  if(null == Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var1]) {
                     var2 = true;
                     Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var1] = new Npc();
                  }

                  Npc var3 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var1];
                  Class15.anIntArray347[Class163.anInt2046++] = var1;
                  var3.anInt2838 = Class44.loopCycle;
                  if(null != var3.aClass90_3976 && var3.aClass90_3976.method1474(-1)) {
                     Class3_Sub28_Sub8.method574(var3, false);
                  }
                  
                  
                  int var7 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(5);
                  if(15 < var7) {
                      var7 -= 32;
                   }
                 
                  
                  var3.method1987(-1, NpcDefinition.list(SpotAnimation.aClass3_Sub30_Sub1_532.getBits(14)));
                  

                  int var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(1);
                  if(~var6 == -2) {
                     Class21.anIntArray441[Js5CacheWorker.anInt997++] = var1;
                  }

                  int var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(1);
                  int var5 = Class27.anIntArray510[SpotAnimation.aClass3_Sub30_Sub1_532.getBits(3)];
                  if(var2) {
                     var3.turnDirection = var3.directionDegrees = var5;
                  }
                  
                  int var8 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(5);
                  if(15 < var8) {
                     var8 -= 32;
                  }

                  var3.setSize(var3.aClass90_3976.size, 2);
                  var3.idleAnimation = var3.aClass90_3976.idleAnim;
                  var3.walkAnimation = var3.aClass90_3976.walkAnim;
                  var3.turn180Animation = var3.aClass90_3976.turn180Animation;
                  var3.turn90CWAnimation = var3.aClass90_3976.turn90CWAnimation;
                  var3.turn90CCAnimation = var3.aClass90_3976.turn90CCAnimation;
                  //var3.anInt2763 = var3.aClass90_3976.anInt1280;
                  var3.anInt2779 = var3.aClass90_3976.anInt1274;
                  if(~var3.anInt2779 == -1) {
                     var3.directionDegrees = 0;
                  }

                  var3.method1967(var3.getSize(), TextureLoader.selfPlayer.anIntArray2767[0] + var8, var7 + TextureLoader.selfPlayer.anIntArray2755[0], ~var4 == -2);
                  if(var3.aClass90_3976.method1474(-1)) {
                     Class70.method1286(var3.anIntArray2755[0], false, (ObjectDefinition)null, 0, var3, var3.anIntArray2767[0], Class26.plane, (Player)null);
                  }
                  continue;
               }
            }

            SpotAnimation.aClass3_Sub30_Sub1_532.endBitAccess();
            if(var0 <= 0) {
               method2265(-16);
            }

            return;
         }
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "wj.E(" + var0 + ')');
      }
   }

   public static void method2262(byte var0) {
      try {
         aClass94_2083 = null;
         if(var0 > 0) {
            aClass94_2082 = null;
            aClass94_2084 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "wj.F(" + var0 + ')');
      }
   }

   static final void method2263(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      Class113 var7 = new Class113();
      var7.anInt1553 = var1 / 128;
      var7.anInt1547 = var2 / 128;
      var7.anInt1563 = var3 / 128;
      var7.anInt1566 = var4 / 128;
      var7.anInt1554 = var0;
      var7.anInt1562 = var1;
      var7.anInt1545 = var2;
      var7.anInt1560 = var3;
      var7.anInt1550 = var4;
      var7.anInt1544 = var5;
      var7.anInt1548 = var6;
      Class3_Sub28_Sub8.aClass113Array3610[Class3_Sub4.anInt2249++] = var7;
   }

   static final void method2264(boolean var0) {
      if(var0) {
         Class75_Sub2.groundTiles = Class166.aClass3_Sub2ArrayArrayArray2065;
         Class44.anIntArrayArrayArray723 = AbstractObjectCache.anIntArrayArrayArray3605;
         Class3_Sub23.aClass3_Sub11ArrayArray2542 = Class3_Sub13_Sub28.aClass3_Sub11ArrayArray3346;
      } else {
         Class75_Sub2.groundTiles = BufferedRequest.aClass3_Sub2ArrayArrayArray4070;
         Class44.anIntArrayArrayArray723 = Class58.anIntArrayArrayArray914;
         Class3_Sub23.aClass3_Sub11ArrayArray2542 = client.aClass3_Sub11ArrayArray2199;
      }

      TransformList.anInt2456 = Class75_Sub2.groundTiles.length;
   }

   static final void method2265(int var0) {
      try {
         InterfaceListener.aClass93_2442.clearAll();
         if(var0 != 0) {
            aClass94_2084 = (jString)null;
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "wj.B(" + var0 + ')');
      }
   }

   static final void method2266(int var0, int var1, byte var2) {
      try {
         if(Class9.musicVolume != 0 && var1 != -1) {
            Class70.method1285(NodeSub.cacheIndex11, false, var1, 0, false, Class9.musicVolume);
            Class83.aBoolean1158 = true;
         }

         if(var2 != -1) {
            aClass94_2084 = (jString)null;
         }

      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "wj.D(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   static final void method2267(int var0, int var1, boolean var2, Buffer var3, int var4, int var5, byte var6, int var7, int var8) {
      try {
         int var9;
         if(-1 >= ~var5 && ~var5 > -105 && var4 >= 0 && -105 < ~var4) {
            if(!var2) {
               Class9.aByteArrayArrayArray113[var8][var5][var4] = 0;
            }

            while(true) {
               var9 = var3.getUByte();
               if(-1 == ~var9) {
                  if(!var2) {
                     if(~var8 != -1) {
                        Class44.anIntArrayArrayArray723[var8][var5][var4] = -240 + Class44.anIntArrayArrayArray723[var8 - 1][var5][var4];
                     } else {
                        Class44.anIntArrayArrayArray723[0][var5][var4] = 8 * -Class32.method993(var4 + 556238 + var1, 125, var0 + var5 + 932731);
                     }
                  } else {
                     Class44.anIntArrayArrayArray723[0][var5][var4] = Class58.anIntArrayArrayArray914[0][var5][var4];
                  }
                  break;
               }

               if(var9 == 1) {
                  int var10 = var3.getUByte();
                  if(!var2) {
                     if(~var10 == -2) {
                        var10 = 0;
                     }

                     if(-1 == ~var8) {
                        Class44.anIntArrayArrayArray723[0][var5][var4] = 8 * -var10;
                     } else {
                        Class44.anIntArrayArrayArray723[var8][var5][var4] = -(var10 * 8) + Class44.anIntArrayArrayArray723[-1 + var8][var5][var4];
                     }
                  } else {
                     Class44.anIntArrayArrayArray723[0][var5][var4] = Class58.anIntArrayArrayArray914[0][var5][var4] - -(var10 * 8);
                  }
                  break;
               }

               if(49 >= var9) {
                  Class139.aByteArrayArrayArray1828[var8][var5][var4] = var3.getByte();
                  Class93.aByteArrayArrayArray1328[var8][var5][var4] = (byte)((-2 + var9) / 4);
                  PacketParser.aByteArrayArrayArray81[var8][var5][var4] = (byte)ClientScript.method633(-2 + var9 + var7, 3);
               } else if(var9 > 81) {
                  Class3_Sub13_Sub36.aByteArrayArrayArray3430[var8][var5][var4] = (byte)(-81 + var9);
               } else if(!var2) {
                  Class9.aByteArrayArrayArray113[var8][var5][var4] = (byte)(var9 - 49);
               }
            }
         } else {
            while(true) {
               var9 = var3.getUByte();
               if(~var9 == -1) {
                  break;
               }

               if(~var9 == -2) {
                  var3.getUByte();
                  break;
               }

               if(-50 <= ~var9) {
                  var3.getUByte();
               }
            }
         }

         if(var6 < 58) {
            anInt2087 = 87;
         }

      } catch (RuntimeException var11) {
         throw Class44.method1067(var11, "wj.A(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ')');
      }
   }

   static final int method2268(int var1, int var2) {
         InventoryNode var3 = (InventoryNode)GroundTile.aClass130_2220.get((long)var1);
         if(var3 != null) {
            if(var2 != -1) {
               int var4 = 0;

               for(int var5 = 0; ~var5 > ~var3.anIntArray2551.length; ++var5) {
                  if(~var2 == ~var3.anIntArray2547[var5]) {
                     var4 += var3.anIntArray2551[var5];
                  }
               }
               return var4;
            } else {
               return 0;
            }
         } else {
            return 0;
         }
   }

	static final void processLogout() {
		if (null != Class3_Sub15.worldConnection) {
			Class3_Sub15.worldConnection.close();
			Class3_Sub15.worldConnection = null;
		}

		Class3_Sub13_Sub30.method313();
		Class32.method995();

		for (int var1 = 0; var1 < 4; ++var1) {
			Class86.collisionMap[var1].resetFlags();
		}

		// Js5CacheWorker.method1250(false);
		System.gc();
		Queue.method882(-1, 2);
		Class83.aBoolean1158 = false;
		AbstractTimer.anInt1691 = -1;
		Class164_Sub1.method2241((byte) -77, true);
		StringNode.aBoolean2583 = false;
		Class82.anInt1152 = 0;
		AbstractObjectCache.anInt3606 = 0;
		LongNode.anInt2294 = 0;
		Class131.anInt1716 = 0;

		for (int var1 = 0; RuntimeException_Sub1.aClass96Array2114.length > var1; ++var1) {
			RuntimeException_Sub1.aClass96Array2114[var1] = null;
		}

		Class159.anInt2022 = 0;
		Class163.anInt2046 = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var1] = null;
			Class65.aClass3_Sub30Array986[var1] = null;
		}

		for (int var1 = 0; -32769 < ~var1; ++var1) {
			Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var1] = null;
		}

		for (int var1 = 0; 4 > var1; ++var1) {
			for (int var2 = 0; -105 < ~var2; ++var2) {
				for (int var3 = 0; ~var3 > -105; ++var3) {
					Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[var1][var2][var3] = null;
				}
			}
		}

		AnimationLoader.method560(-21556);
		Class3_Sub13_Sub2.resetVarp();
		Class3_Sub13_Sub11.method219(true);
	}
         
}
