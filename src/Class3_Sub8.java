
final class Class3_Sub8 extends Node {

   int anInt2296;
   SignlinkNode[] aClass64Array2298;
   int[] anIntArray2299;
   int[] anIntArray2300;
   int[] anIntArray2301;
   byte[][][] aByteArrayArrayArray2302;
   SignlinkNode[] aClass64Array2303;
   static jString aClass94_2304 = jString.createJString("details");
   int anInt2305;
   static jString aClass94_2306 = jString.createJString("<)4col> x");


   static final void method124(int var1, int var2) {
	   if(Canvas_Sub2.loadInterface(var2)) {
		   Class2.method75(SceneGraphNode.interfaceCache[var2], true, var1);
	   }
   }

   static final void method125(jInterface var4, int var0, int var2, int var3) {
         Class58.method1194();
         if(HDToolkit.openGLEnabled) {
            GraphicsHD.clipRect(var3, var2, var3 + var4.anInt168, var2 + var4.anInt193);
         } else {
            GraphicsLD.clipRect(var3, var2, var3 + var4.anInt168, var2 + var4.anInt193);
         }
         //System.out.println((2 != Class161.anInt2028)+":"+(5 != Class161.anInt2028) + ":"+(Class49.aClass3_Sub28_Sub16_812 != null));
         if(2 != Class161.anInt2028 && 5 != Class161.anInt2028 && Class49.aClass3_Sub28_Sub16_812 != null) {
            int var19 = Class3_Sub13_Sub8.anInt3102 + SpotAnimation.cameraYaw & 2047;
            int var6 = 0 + TextureLoader.selfPlayer.anInt2819 / 32 + 48;
            int var7 = 0 + -(TextureLoader.selfPlayer.anInt2829 / 32) + 464;
            
            if(!HDToolkit.openGLEnabled) {
               ((LDSprite)Class49.aClass3_Sub28_Sub16_812).method664(var3 + 25, var2 + 5, 146, 151, var6, var7, var19, 256 + Class164_Sub2.anInt3020, client.mapbackSource, client.mapbackDest);
            } else {
               ((HDSprite)Class49.aClass3_Sub28_Sub16_812).method647(var3 + 25, var2 + 5, 146, 151, var6, var7, var19, Class164_Sub2.anInt3020 + 256);
            }

            if(!HDToolkit.openGLEnabled) {
                ((LDSprite)Class57.aClass3_Sub28_Sub16_895).method664(var3, var2, 33, 33, 25, 25, SpotAnimation.cameraYaw, 256 + Class164_Sub2.anInt3020, client.compassSource, client.compassDest);
             } else {
                ((HDSprite)Class57.aClass3_Sub28_Sub16_895).method647(var3, var2, 33, 33, 25, 25, SpotAnimation.cameraYaw, Class164_Sub2.anInt3020 + 256);
             }
            
            int var9;
            int var10;
            int var11;
            int var12;
            int var13;
            int var14;
            int var17;
            int var16;
            /*if(null != Class3_Sub13_Sub35.aClass131_3421) {
               for(int var8 = 0; var8 < Class3_Sub13_Sub35.aClass131_3421.anInt1720; ++var8) {
                  if(Class3_Sub13_Sub35.aClass131_3421.method1789(var8, var1 ^ 553)) {
                     var9 = 2 + 4 * (Class3_Sub13_Sub35.aClass131_3421.aShortArray1727[var8] + -Class131.anInt1716) + -(TextureLoader.aClass140_Sub4_Sub1_2141.anInt2819 / 32);
                     var11 = Rasterizer.sineTable[var19];
                     var12 = Rasterizer.cosineTable[var19];
                     Font var15 = client.getSmallFont();
                     var11 = var11 * 256 / (256 + Class164_Sub2.anInt3020);
                     var10 = 2 + 4 * (-Class82.anInt1152 + Class3_Sub13_Sub35.aClass131_3421.aShortArray1718[var8]) - TextureLoader.aClass140_Sub4_Sub1_2141.anInt2829 / 32;
                     var12 = var12 * 256 / (256 + Class164_Sub2.anInt3020);
                     var14 = -(var9 * var11) + var10 * var12 >> 16;
                     if(Class3_Sub13_Sub35.aClass131_3421.method1791(var8, var1 + -51) == 1) {
                        var15 = client.getRegularFont();
                     }

                     if(2 == Class3_Sub13_Sub35.aClass131_3421.method1791(var8, 8)) {
                        var15 = client.getBoldFont();
                     }

                     var13 = var11 * var10 - -(var12 * var9) >> 16;
                     var16 = var15.method680(Class3_Sub13_Sub35.aClass131_3421.aClass94Array1721[var8], 100);
                     var13 -= var16 / 2;
                     if(~var13 <= ~(-var4.anInt168) && var13 <= var4.anInt168 && var14 >= -var4.anInt193 && var14 <= var4.anInt193) {
                        var17 = 16777215;
                        if(~Class3_Sub13_Sub35.aClass131_3421.anIntArray1725[var8] != 0) {
                           var17 = Class3_Sub13_Sub35.aClass131_3421.anIntArray1725[var8];
                        }

                        if(!HDToolkit.openGLEnabled) {
                           GraphicsLD.method1314(var4.anIntArray207, var4.anIntArray291);
                        } else {
                           GraphicsHD.method936((HDSprite)var4.method866((byte)-113, false));
                        }

                        var15.method693(Class3_Sub13_Sub35.aClass131_3421.aClass94Array1721[var8], var3 + var13 + var4.anInt168 / 2, var2 + var4.anInt193 / 2 + -var14, var16, 50, var17, 0, 256, 1, 0, 0);
                        if(HDToolkit.openGLEnabled) {
                           GraphicsHD.method921();
                        } else {
                           GraphicsLD.method1310();
                        }
                     }
                  }
               }
            }*/

            for(var9 = 0; MouseHandler.anInt1924 > var9; ++var9) {
               var10 = -(TextureLoader.selfPlayer.anInt2819 / 32) + 2 + 4 * Class84.anIntArray1163[var9] + 0;
               var11 = -(TextureLoader.selfPlayer.anInt2829 / 32) + 2 + (RawObjectCache.anIntArray4050[var9] * 4 - 0);
               ObjectDefinition var20 = ObjectDefinition.list(ClientScript.anIntArray3693[var9]);
               if(var20.anInt1482 > Entity.aClass3_Sub28_Sub16Array2839.length)
            	   continue;
               if(null != var20.anIntArray1524) {
                  var20 = var20.method1685();
                  if(null == var20 || 0 == ~var20.anInt1482) {
                     continue;
                  }
               }
               Class38_Sub1.method1030(var4, Entity.aClass3_Sub28_Sub16Array2839[var20.anInt1482], var11, var10, var2, var3);
            }

            for(var9 = 0; 104 > var9; ++var9) {
               for(var10 = 0; -105 < ~var10; ++var10) {
                  Deque var25 = Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[Class26.plane][var9][var10];
                  if(null != var25) {
                     var12 = 2 + var9 * 4 + -(TextureLoader.selfPlayer.anInt2819 / 32);
                     var13 = -(TextureLoader.selfPlayer.anInt2829 / 32) + 2 + 4 * var10;
                     Class38_Sub1.method1030(var4, Class80.aClass3_Sub28_Sub16Array1136[0], var13, var12, var2, var3);
                  }
               }
            }

            for(var9 = 0; ~Class163.anInt2046 < ~var9; ++var9) {
               Npc var21 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[Class15.anIntArray347[var9]];
               if(var21 != null && var21.method1966((byte)17)) {
                  NpcDefinition var22 = var21.aClass90_3976;
                  if(null != var22 && null != var22.anIntArray1292) {
                     var22 = var22.method1471((byte)-3);
                  }

                  if(var22 != null && var22.aBoolean1285 && var22.aBoolean1270) {
                     var12 = var21.anInt2819 / 32 - TextureLoader.selfPlayer.anInt2819 / 32;
                     var13 = var21.anInt2829 / 32 + -(TextureLoader.selfPlayer.anInt2829 / 32);
                     if(~var22.anInt1283 != 0) {
                        Class38_Sub1.method1030(var4, Entity.aClass3_Sub28_Sub16Array2839[var22.anInt1283], var13, var12, var2, var3);
                     } else {
                        Class38_Sub1.method1030(var4, Class80.aClass3_Sub28_Sub16Array1136[1], var13, var12, var2, var3);
                     }
                  }
               }
            }

            for(var9 = 0; var9 < Class159.anInt2022; ++var9) {
               Player var23 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[Class56.anIntArray887[var9]];
               if(null != var23 && var23.method1966((byte)17)) {
                  var12 = var23.anInt2829 / 32 - TextureLoader.selfPlayer.anInt2829 / 32;
                  var11 = -(TextureLoader.selfPlayer.anInt2819 / 32) + var23.anInt2819 / 32;
                  long var29 = var23.username.toLong();
                  boolean var28 = false;

                  for(var16 = 0; ~Class8.anInt104 < ~var16; ++var16) {
                     if(~var29 == ~Vertex.aLongArray826[var16] && 0 != CursorType.anIntArray882[var16]) {
                        var28 = true;
                        break;
                     }
                  }

                  boolean var31 = false;

                  for(var17 = 0; NodeSub.anInt2572 > var17; ++var17) {
                     if(var29 == ClientScript.clanMembers[var17].hash) {
                        var31 = true;
                        break;
                     }
                  }

                  boolean var32 = false;
                  if(-1 != ~TextureLoader.selfPlayer.team && 0 != var23.team && var23.team == TextureLoader.selfPlayer.team) {
                     var32 = true;
                  }

                  if(var28) {
                     Class38_Sub1.method1030(var4, Class80.aClass3_Sub28_Sub16Array1136[3], var12, var11, var2, var3);
                  } else if(!var31) {
                     if(var32) {
                        Class38_Sub1.method1030(var4, Class80.aClass3_Sub28_Sub16Array1136[4], var12, var11, var2, var3);
                     } else {
                        Class38_Sub1.method1030(var4, Class80.aClass3_Sub28_Sub16Array1136[2], var12, var11, var2, var3);
                     }
                  } else {
                     Class38_Sub1.method1030(var4, Class80.aClass3_Sub28_Sub16Array1136[5], var12, var11, var2, var3);
                  }
               }
            }

            HintIcon[] var24 = RuntimeException_Sub1.aClass96Array2114;

            for(var10 = 0; ~var10 > ~var24.length; ++var10) {
               HintIcon var26 = var24[var10];
               if(null != var26 && -1 != ~var26.anInt1360 && Class44.loopCycle % 20 < 10) {
                  if(~var26.anInt1360 == -2 && var26.anInt1359 >= 0 && var26.anInt1359 < Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292.length) {
                     Npc var27 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var26.anInt1359];
                     if(null != var27) {
                        var13 = -(TextureLoader.selfPlayer.anInt2819 / 32) + var27.anInt2819 / 32;
                        var14 = var27.anInt2829 / 32 + -(TextureLoader.selfPlayer.anInt2829 / 32);
                        Class53.method1171(var26.anInt1351, var2, var3, var13, var14, var4, false);
                     }
                  }

                  if(-3 == ~var26.anInt1360) {
                     var12 = (-Class131.anInt1716 + var26.anInt1356) * 4 + 2 - TextureLoader.selfPlayer.anInt2819 / 32;
                     var13 = -(TextureLoader.selfPlayer.anInt2829 / 32) + 2 + (-Class82.anInt1152 + var26.anInt1347) * 4;
                     Class53.method1171(var26.anInt1351, var2, var3, var12, var13, var4, false);
                  }

                  if(var26.anInt1360 == 10 && -1 >= ~var26.anInt1359 && Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269.length > var26.anInt1359) {
                     Player var30 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var26.anInt1359];
                     if(null != var30) {
                        var14 = var30.anInt2829 / 32 + -(TextureLoader.selfPlayer.anInt2829 / 32);
                        var13 = var30.anInt2819 / 32 + -(TextureLoader.selfPlayer.anInt2819 / 32);
                        Class53.method1171(var26.anInt1351, var2, var3, var13, var14, var4, false);
                     }
                  }
               }
            }

            if(Class65.mapFlagX != 0) {
               var9 = 4 * Class65.mapFlagX + (2 - TextureLoader.selfPlayer.anInt2819 / 32);
               var10 = 2 + 4 * Class45.mapFlagY - TextureLoader.selfPlayer.anInt2829 / 32;
               Class38_Sub1.method1030(var4, Class45.aClass3_Sub28_Sub16_736[0], var10, var9, var2, var3);
            }

            if(!HDToolkit.openGLEnabled) {
            	GraphicsLD.fillRect(var3 + 97, var2 + 82 - 4, 3, 3, 16777215);
               //GraphicsLD.fillRect(-1 + var4.anInt168 / 2 + var3, -1 + var4.anInt193 / 2 + var2, 3, 3, 16777215);
            } else {
            	GraphicsHD.fillRect(var3 + 97, var2 + 82 - 4, 3, 3, 16777215);
               //GraphicsHD.fillRect(-1 + (var3 - -(var4.anInt168 / 2)), -1 + var2 - -(var4.anInt193 / 2), 3, 3, 16777215);
            }
         } else if(!HDToolkit.openGLEnabled) {
            GraphicsLD.method1332(var3 + 25, var2 + 5, 0, client.mapbackSource, client.mapbackDest);
         /*} else {
            AbstractSprite var5 = var4.method866((byte)-113, false);
            if(null != var5) {
               var5.method643(var3, var2);
            }*/
         }
         client.mapbackSprte.method1667(var3, var2);

         Class163_Sub1_Sub1.aBooleanArray4008[var0] = true;
   }

   static final void method126(boolean var0, int var1, int var2, int var3, int var4) {
      try {
         if(!var0) {
            if(~var4 <= ~Class101.anInt1425 && var4 <= Class3_Sub28_Sub18.anInt3765) {
               var2 = Class40.method1040(Class57.anInt902, var2, (byte)0, Class159.anInt2020);
               var1 = Class40.method1040(Class57.anInt902, var1, (byte)0, Class159.anInt2020);
               Class3_Sub13_Sub16.method244(2, var2, var4, var1, var3);
            }

         }
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "ed.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   static final void method127(short[] var0, int var1, jString[] var2, int var3, int var4) {
      try {
         if(~var1 < ~var4) {
            int var6 = var4;
            int var5 = (var4 - -var1) / 2;
            jString var7 = var2[var5];
            var2[var5] = var2[var1];
            var2[var1] = var7;
            short var8 = var0[var5];
            var0[var5] = var0[var1];
            var0[var1] = var8;

            for(int var9 = var4; ~var1 < ~var9; ++var9) {
               if(var7 == null || null != var2[var9] && var2[var9].method1559(var7) < (var9 & 1)) {
                  jString var10 = var2[var9];
                  var2[var9] = var2[var6];
                  var2[var6] = var10;
                  short var11 = var0[var9];
                  var0[var9] = var0[var6];
                  var0[var6++] = var11;
               }
            }

            var2[var1] = var2[var6];
            var2[var6] = var7;
            var0[var1] = var0[var6];
            var0[var6] = var8;
            method127(var0, -1 + var6, var2, -909, var4);
            method127(var0, var1, var2, -909, var6 - -1);
         }

      } catch (RuntimeException var12) {
         throw Class44.method1067(var12, "ed.E(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ',' + var4 + ')');
      }
   }

   static final void method128(int var0) {
      try {
         Class44.aClass93_725.clearAll();
         if(var0 != 2) {
            method127((short[])null, -27, (jString[])null, -4, -64);
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ed.O(" + var0 + ')');
      }
   }

   static final int method129(int var0, int var1, int var2, int var3) {
      try {
         if(var1 != 2) {
            method131(14);
         }

         if(-244 <= ~var0) {
            if(~var0 < -218) {
               var2 >>= 3;
            } else if(var0 <= 192) {
               if(179 < var0) {
                  var2 >>= 1;
               }
            } else {
               var2 >>= 2;
            }
         } else {
            var2 >>= 4;
         }

         return (var0 >> 1) + (var2 >> 5 << 7) + (var3 >> 2 << 10);
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "ed.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final Class44_Sub1 method130(int var0, int var1) {
      try {
         if(Class30.aBoolean579 && ~var1 <= ~Class3_Sub13_Sub4.anInt3054 && ~var1 >= ~OverlayType.anInt1416) {
            int var2 = 120 / ((0 - var0) / 32);
            return Class117.aClass44_Sub1Array1609[var1 - Class3_Sub13_Sub4.anInt3054];
         } else {
            return null;
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "ed.P(" + var0 + ',' + var1 + ')');
      }
   }

   public static void method131(int var0) {
      try {
         aClass94_2304 = null;
         aClass94_2306 = null;
         if(var0 >= -104) {
            method132((byte)-28);
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ed.Q(" + var0 + ')');
      }
   }

   static final void method132(byte var0) {
      try {
         for(int var1 = 0; var1 < Class113.anInt1552; ++var1) {
            --jString.anIntArray2157[var1];
            if(~jString.anIntArray2157[var1] > 9) {
               --Class113.anInt1552;

               for(int var2 = var1; var2 < Class113.anInt1552; ++var2) {
                  InventoryNode.anIntArray2550[var2] = InventoryNode.anIntArray2550[var2 - -1];
                  TextureLoader.aClass135Array2131[var2] = TextureLoader.aClass135Array2131[var2 + 1];
                  Class166.anIntArray2068[var2] = Class166.anIntArray2068[1 + var2];
                  jString.anIntArray2157[var2] = jString.anIntArray2157[1 + var2];
                  Class3_Sub13_Sub6.anIntArray3083[var2] = Class3_Sub13_Sub6.anIntArray3083[var2 - -1];
               }

               --var1;
            } else {
               Class135 var11 = TextureLoader.aClass135Array2131[var1];
               if(null == var11) {
                  var11 = Class135.method1811(AbstractMouseWheel.cacheIndex4, InventoryNode.anIntArray2550[var1], 0);
                  if(null == var11) {
                     continue;
                  }

                  jString.anIntArray2157[var1] += var11.method1813();
                  TextureLoader.aClass135Array2131[var1] = var11;
               }

               if(0 > jString.anIntArray2157[var1]) {
                  int var3;
                  if(~Class3_Sub13_Sub6.anIntArray3083[var1] != -1) {
                     int var4 = 128 * (255 & Class3_Sub13_Sub6.anIntArray3083[var1]);
                     int var7 = Class3_Sub13_Sub6.anIntArray3083[var1] >> 8 & 255;
                     int var5 = 255 & Class3_Sub13_Sub6.anIntArray3083[var1] >> 16;
                     int var8 = -TextureLoader.selfPlayer.anInt2829 + 64 + 128 * var7;
                     if(var8 < 0) {
                        var8 = -var8;
                     }

                     int var6 = -TextureLoader.selfPlayer.anInt2819 + 64 + var5 * 128;
                     if(0 > var6) {
                        var6 = -var6;
                     }

                     int var9 = -128 + var6 + var8;
                     if(~var4 > ~var9) {
                        jString.anIntArray2157[var1] = -100;
                        continue;
                     }

                     if(~var9 > -1) {
                        var9 = 0;
                     }

                     var3 = Class14.areaSoundsVolume * (var4 + -var9) / var4;
                  } else {
                     var3 = InterfaceListener.soundEffectsVolume;
                  }

                  if(-1 > ~var3) {
                     Class3_Sub12_Sub1 var12 = var11.method1812().method151(Class27.aClass157_524);
                     Class3_Sub24_Sub1 var13 = Class3_Sub24_Sub1.method437(var12, 100, var3);
                     var13.method429(Class166.anIntArray2068[var1] + -1);
                     Class3_Sub26.aClass3_Sub24_Sub2_2563.method457(var13);
                  }

                  jString.anIntArray2157[var1] = -100;
               }
            }
         }

         if(var0 != -92) {
            method126(true, 36, 42, 14, 51);
         }

         if(Class83.aBoolean1158 && !VarBit.method1391(-1)) {
            if(0 != Class9.musicVolume && AbstractTimer.anInt1691 != -1) {
               Class70.method1285(Class75_Sub2.cacheIndex6, false, AbstractTimer.anInt1691, 0, false, Class9.musicVolume);
            }

            Class83.aBoolean1158 = false;
         } else if(-1 != ~Class9.musicVolume && ~AbstractTimer.anInt1691 != 0 && !VarBit.method1391(var0 + 91)) {
            Class3_Sub13_Sub1.outputStream.putPacket(137);
            Class3_Sub13_Sub1.outputStream.putInt(AbstractTimer.anInt1691);
            AbstractTimer.anInt1691 = -1;
         }

      } catch (RuntimeException var10) {
         throw Class44.method1067(var10, "ed.C(" + var0 + ')');
      }
   }

}
