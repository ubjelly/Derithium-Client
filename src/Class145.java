
final class Class145 {

   int anInt1890;
   int anInt1891;
   
   int anInt1893;
   int anInt1894;
   static Class113[] aClass113Array1895;
   int anInt1897;
   static int anInt1898;
   private static jString aClass94_1899 = jString.createJString("Loading textures )2 ");
   int anInt1900;
static jString aClass94_1892 = aClass94_1899;

   public static void method2071(byte var0) {
      try {
         aClass94_1892 = null;
         aClass113Array1895 = null;
         aClass94_1899 = null;
         if(var0 <= 1) {
            method2075(112, (byte)44);
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ub.G(" + var0 + ')');
      }
   }

   static final void method2072(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         if(Class101.anInt1425 <= var1 && Class3_Sub28_Sub18.anInt3765 >= var3 && ~Class159.anInt2020 >= ~var2 && var4 <= Class57.anInt902) {
            if(-2 == ~var5) {
               Class77.method1367(var0, var3, var2, (byte)34, var4, var1);
            } else {
               AbstractIndexedSprite.method1665(var3, var2, var0, var4, var5, var1);
            }
         } else if(1 != var5) {
            Class3_Sub13_Sub3.method184(var4, var5, var3, var1, 1, var0, var2);
         } else {
            TextureLoader.method1617(var0, var1, var4, var3, var2, (byte)29);
         }

         if(var6 != -2) {
            method2075(89, (byte)-73);
         }

      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "ub.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   static final void method2073(GroundTile var0, boolean var1) {
      Class163_Sub1.tiles.insertBack(var0);

      while(true) {
         GroundTile var2 = (GroundTile)Class163_Sub1.tiles.popFront();
         if(var2 == null) {
            return;
         }

         if(var2.aBoolean2225) {
            int x = var2.anInt2239;
            int y = var2.anInt2231;
            int z = var2.anInt2244;
            int var6 = var2.anInt2238;
            GroundTile[][] var7 = Class75_Sub2.groundTiles[z];
            float var8 = 0.0F;
            int var9;
            int var10;
            int var11;
            int var12;
            if(HDToolkit.openGLEnabled) {
               if(AbstractObjectCache.anIntArrayArrayArray3605 == Class44.anIntArrayArrayArray723) {
                  var9 = Class3_Sub13_Sub9.anIntArrayArray3115[x][y];
                  var10 = var9 & 16777215;
                  if(var10 != jSocket.anInt1244) {
                     jSocket.anInt1244 = var10;
                     Class3_Sub28_Sub2.method535((byte)56, var10);
                     AtmosphereManager.method1512(Class72.method1297());
                  }

                  var11 = var9 >>> 24 << 3;
                  if(var11 != Class3_Sub13_Sub5.anInt3072) {
                     Class3_Sub13_Sub5.anInt3072 = var11;
                     Class3_Sub21.method394(var11);
                  }

                  var12 = Class58.anIntArrayArrayArray914[0][x][y] + Class58.anIntArrayArrayArray914[0][x + 1][y] + Class58.anIntArrayArrayArray914[0][x][y + 1] + Class58.anIntArrayArrayArray914[0][x + 1][y + 1] >> 2;
                  Class3_Sub28_Sub4.method551(-var12, 3);
                  var8 = 201.5F;
                  HDToolkit.method1832(var8);
               } else {
                  var8 = 201.5F - 50.0F * (float)(var6 + 1);
                  HDToolkit.method1832(var8);
               }
            }

            int var14;
            int var15;
            int var17;
            int var16;
            int var18;
            GroundTile var21;
            Class70 var23;
            boolean var22;
            Class25 var25;
            GroundTile var35;
            if(var2.aBoolean2222) {
               if(var1) {
                  if(z > 0) {
                     var21 = Class75_Sub2.groundTiles[z - 1][x][y];
                     if(var21 != null && var21.aBoolean2225) {
                        continue;
                     }
                  }

                  if(x <= Class97.anInt1375 && x > Class163_Sub1_Sub1.anInt4006) {
                     var21 = var7[x - 1][y];
                     if(var21 != null && var21.aBoolean2225 && (var21.aBoolean2222 || (var2.anInt2228 & 1) == 0)) {
                        continue;
                     }
                  }

                  if(x >= Class97.anInt1375 && x < Class2.anInt67 - 1) {
                     var21 = var7[x + 1][y];
                     if(var21 != null && var21.aBoolean2225 && (var21.aBoolean2222 || (var2.anInt2228 & 4) == 0)) {
                        continue;
                     }
                  }

                  if(y <= Class3_Sub13_Sub27.anInt3340 && y > AbstractObjectCache.anInt3603) {
                     var21 = var7[x][y - 1];
                     if(var21 != null && var21.aBoolean2225 && (var21.aBoolean2222 || (var2.anInt2228 & 8) == 0)) {
                        continue;
                     }
                  }

                  if(y >= Class3_Sub13_Sub27.anInt3340 && y < PlainTile.anInt1665 - 1) {
                     var21 = var7[x][y + 1];
                     if(var21 != null && var21.aBoolean2225 && (var21.aBoolean2222 || (var2.anInt2228 & 2) == 0)) {
                        continue;
                     }
                  }
               } else {
                  var1 = true;
               }

               var2.aBoolean2222 = false;
               if(var2.aClass3_Sub2_2235 != null) {
                  var21 = var2.aClass3_Sub2_2235;
                  if(HDToolkit.openGLEnabled) {
                     HDToolkit.method1832(201.5F - 50.0F * (float)(var21.anInt2238 + 1));
                  }

                  if(var21.plainTile != null) {
                     if(!Class8.method846(0, x, y)) {
                        Class3_Sub13_Sub18.method259(var21.plainTile, 0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, x, y, false);
                     } else {
                        Class3_Sub13_Sub18.method259(var21.plainTile, 0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, x, y, true);
                     }
                  } else if(var21.shapedTile != null) {
                     if(!Class8.method846(0, x, y)) {
                        Class3_Sub21.method395(var21.shapedTile, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, x, y, false);
                     } else {
                        Class3_Sub21.method395(var21.shapedTile, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, x, y, true);
                     }
                  }

                  var23 = var21.aClass70_2234;
                  if(var23 != null) {
                     if(HDToolkit.openGLEnabled) {
                        if((var23.anInt1055 & var2.anInt2241) != 0) {
                           LightManager.method1263(var23.anInt1055, MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, var6, x, y);
                        } else {
                           LightManager.method1268(MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, z, x, y);
                        }
                     }

                     var23.aClass140_1049.render(0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var23.anInt1054 - MillisTimer.anInt2697, var23.anInt1057 - EnumType.anInt3657, var23.anInt1045 - Class3_Sub13_Sub30.anInt3363, var23.aLong1048, z, (ParticleEngine)null);
                  }

                  for(var11 = 0; var11 < var21.anInt2223; ++var11) {
                     var25 = var21.aClass25Array2221[var11];
                     if(var25 != null) {
                        if(HDToolkit.openGLEnabled) {
                           LightManager.method1268(MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, z, x, y);
                        }

                        var25.aClass140_479.render(var25.anInt496, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var25.anInt482 - MillisTimer.anInt2697, var25.anInt489 - EnumType.anInt3657, var25.anInt484 - Class3_Sub13_Sub30.anInt3363, var25.aLong498, z, (ParticleEngine)null);
                     }
                  }

                  if(HDToolkit.openGLEnabled) {
                     HDToolkit.method1832(var8);
                  }
               }

               var22 = false;
               if(var2.plainTile != null) {
                  if(!Class8.method846(var6, x, y)) {
                     var22 = true;
                     if(var2.plainTile.anInt1664 != 12345678 || Class3_Sub13_Sub21.aBoolean3261 && z <= CollisionMap.anInt1302) {
                        Class3_Sub13_Sub18.method259(var2.plainTile, var6, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, x, y, false);
                     }
                  } else {
                     Class3_Sub13_Sub18.method259(var2.plainTile, var6, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, x, y, true);
                  }
               } else if(var2.shapedTile != null) {
                  if(!Class8.method846(var6, x, y)) {
                     var22 = true;
                     Class3_Sub21.method395(var2.shapedTile, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, x, y, false);
                  } else {
                     Class3_Sub21.method395(var2.shapedTile, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, x, y, true);
                  }
               }

               if(var22) {
                  Class12 var24 = var2.aClass12_2230;
                  if(var24 != null && (var24.aLong328 & 2147483648L) != 0L) {
                     if(HDToolkit.openGLEnabled && var24.aBoolean329) {
                        HDToolkit.method1832(var8 + 50.0F - 1.5F);
                     }

                     if(HDToolkit.openGLEnabled) {
                        LightManager.method1268(MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, z, x, y);
                     }

                     var24.aClass140_320.render(0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var24.anInt324 - MillisTimer.anInt2697, var24.anInt326 - EnumType.anInt3657, var24.anInt330 - Class3_Sub13_Sub30.anInt3363, var24.aLong328, z, (ParticleEngine)null);
                     if(HDToolkit.openGLEnabled && var24.aBoolean329) {
                        HDToolkit.method1832(var8);
                     }
                  }
               }

               var10 = 0;
               var11 = 0;
               Class70 var26 = var2.aClass70_2234;
               Class19 var13 = var2.aClass19_2233;
               if(var26 != null || var13 != null) {
                  if(Class97.anInt1375 == x) {
                     ++var10;
                  } else if(Class97.anInt1375 < x) {
                     var10 += 2;
                  }

                  if(Class3_Sub13_Sub27.anInt3340 == y) {
                     var10 += 3;
                  } else if(Class3_Sub13_Sub27.anInt3340 > y) {
                     var10 += 6;
                  }

                  var11 = Npc.anIntArray3997[var10];
                  var2.anInt2241 = Class3_Sub13_Sub26.anIntArray3321[var10];
               }

               if(var26 != null) {
                  if((var26.anInt1055 & Class3_Sub10.anIntArray2338[var10]) != 0) {
                     if(var26.anInt1055 == 16) {
                        var2.anInt2227 = 3;
                        var2.anInt2229 = IntegerNode.anIntArray2470[var10];
                        var2.anInt2232 = 3 - var2.anInt2229;
                     } else if(var26.anInt1055 == 32) {
                        var2.anInt2227 = 6;
                        var2.anInt2229 = ItemPile.anIntArray2933[var10];
                        var2.anInt2232 = 6 - var2.anInt2229;
                     } else if(var26.anInt1055 == 64) {
                        var2.anInt2227 = 12;
                        var2.anInt2229 = Class3_Sub13_Sub14.anIntArray3171[var10];
                        var2.anInt2232 = 12 - var2.anInt2229;
                     } else {
                        var2.anInt2227 = 9;
                        var2.anInt2229 = Class3_Sub13_Sub23_Sub1.anIntArray4035[var10];
                        var2.anInt2232 = 9 - var2.anInt2229;
                     }
                  } else {
                     var2.anInt2227 = 0;
                  }

                  if((var26.anInt1055 & var11) != 0 && !Class164_Sub1.method2239(var6, x, y, var26.anInt1055)) {
                     if(HDToolkit.openGLEnabled) {
                        LightManager.method1268(MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, z, x, y);
                     }

                     var26.aClass140_1049.render(0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var26.anInt1054 - MillisTimer.anInt2697, var26.anInt1057 - EnumType.anInt3657, var26.anInt1045 - Class3_Sub13_Sub30.anInt3363, var26.aLong1048, z, (ParticleEngine)null);
                  }

                  if((var26.anInt1059 & var11) != 0 && !Class164_Sub1.method2239(var6, x, y, var26.anInt1059)) {
                     if(HDToolkit.openGLEnabled) {
                        LightManager.method1268(MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, z, x, y);
                     }

                     var26.aClass140_1052.render(0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var26.anInt1054 - MillisTimer.anInt2697, var26.anInt1057 - EnumType.anInt3657, var26.anInt1045 - Class3_Sub13_Sub30.anInt3363, var26.aLong1048, z, (ParticleEngine)null);
                  }
               }

               if(var13 != null && !Class166.method2256(var6, x, y, var13.aClass140_429.method1871())) {
                  if(HDToolkit.openGLEnabled) {
                     HDToolkit.method1832(var8 - 0.5F);
                  }

                  if((var13.anInt432 & var11) != 0) {
                     if(HDToolkit.openGLEnabled) {
                        LightManager.method1268(MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, z, x, y);
                     }

                     var13.aClass140_429.render(0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var13.anInt424 - MillisTimer.anInt2697 + var13.anInt430, var13.anInt425 - EnumType.anInt3657, var13.anInt427 - Class3_Sub13_Sub30.anInt3363 + var13.anInt426, var13.aLong428, z, (ParticleEngine)null);
                  } else if(var13.anInt432 == 256) {
                     var14 = var13.anInt424 - MillisTimer.anInt2697;
                     var15 = var13.anInt425 - EnumType.anInt3657;
                     var16 = var13.anInt427 - Class3_Sub13_Sub30.anInt3363;
                     var17 = var13.anInt420;
                     if(var17 != 1 && var17 != 2) {
                        var18 = var14;
                     } else {
                        var18 = -var14;
                     }

                     int var19;
                     if(var17 != 2 && var17 != 3) {
                        var19 = var16;
                     } else {
                        var19 = -var16;
                     }

                     if(var19 < var18) {
                        if(HDToolkit.openGLEnabled) {
                           LightManager.method1268(MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, z, x, y);
                        }

                        var13.aClass140_429.render(0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var14 + var13.anInt430, var15, var16 + var13.anInt426, var13.aLong428, z, (ParticleEngine)null);
                     } else if(var13.aClass140_423 != null) {
                        if(HDToolkit.openGLEnabled) {
                           LightManager.method1268(MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, z, x, y);
                        }

                        var13.aClass140_423.render(0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var14, var15, var16, var13.aLong428, z, (ParticleEngine)null);
                     }
                  }

                  if(HDToolkit.openGLEnabled) {
                     HDToolkit.method1832(var8);
                  }
               }

               if(var22) {
                  Class12 var30 = var2.aClass12_2230;
                  if(var30 != null && (var30.aLong328 & 2147483648L) == 0L) {
                     if(HDToolkit.openGLEnabled && var30.aBoolean329) {
                        HDToolkit.method1832(var8 + 50.0F - 1.5F);
                     }

                     if(HDToolkit.openGLEnabled) {
                        LightManager.method1268(MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, z, x, y);
                     }

                     var30.aClass140_320.render(0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var30.anInt324 - MillisTimer.anInt2697, var30.anInt326 - EnumType.anInt3657, var30.anInt330 - Class3_Sub13_Sub30.anInt3363, var30.aLong328, z, (ParticleEngine)null);
                     if(HDToolkit.openGLEnabled && var30.aBoolean329) {
                        HDToolkit.method1832(var8);
                     }
                  }

                  Class72 var28 = var2.aClass72_2245;
                  if(var28 != null && var28.anInt1077 == 0) {
                     if(HDToolkit.openGLEnabled) {
                        LightManager.method1268(MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, z, x, y);
                     }

                     if(var28.aClass140_1067 != null) {
                        var28.aClass140_1067.render(0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var28.anInt1078 - MillisTimer.anInt2697, var28.anInt1068 - EnumType.anInt3657, var28.anInt1075 - Class3_Sub13_Sub30.anInt3363, var28.aLong1079, z, (ParticleEngine)null);
                     }

                     if(var28.aClass140_1069 != null) {
                        var28.aClass140_1069.render(0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var28.anInt1078 - MillisTimer.anInt2697, var28.anInt1068 - EnumType.anInt3657, var28.anInt1075 - Class3_Sub13_Sub30.anInt3363, var28.aLong1079, z, (ParticleEngine)null);
                     }

                     if(var28.aClass140_1073 != null) {
                        var28.aClass140_1073.render(0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var28.anInt1078 - MillisTimer.anInt2697, var28.anInt1068 - EnumType.anInt3657, var28.anInt1075 - Class3_Sub13_Sub30.anInt3363, var28.aLong1079, z, (ParticleEngine)null);
                     }
                  }
               }

               var14 = var2.anInt2228;
               if(var14 != 0) {
                  if(x < Class97.anInt1375 && (var14 & 4) != 0) {
                     var35 = var7[x + 1][y];
                     if(var35 != null && var35.aBoolean2225) {
                        Class163_Sub1.tiles.insertBack(var35);
                     }
                  }

                  if(y < Class3_Sub13_Sub27.anInt3340 && (var14 & 2) != 0) {
                     var35 = var7[x][y + 1];
                     if(var35 != null && var35.aBoolean2225) {
                        Class163_Sub1.tiles.insertBack(var35);
                     }
                  }

                  if(x > Class97.anInt1375 && (var14 & 1) != 0) {
                     var35 = var7[x - 1][y];
                     if(var35 != null && var35.aBoolean2225) {
                        Class163_Sub1.tiles.insertBack(var35);
                     }
                  }

                  if(y > Class3_Sub13_Sub27.anInt3340 && (var14 & 8) != 0) {
                     var35 = var7[x][y - 1];
                     if(var35 != null && var35.aBoolean2225) {
                        Class163_Sub1.tiles.insertBack(var35);
                     }
                  }
               }
            }

            int var27;
            if(var2.anInt2227 != 0) {
               var22 = true;

               for(var10 = 0; var10 < var2.anInt2223; ++var10) {
                  if(var2.aClass25Array2221[var10].anInt490 != Class3_Sub28_Sub1.anInt3539 && (var2.anIntArray2237[var10] & var2.anInt2227) == var2.anInt2229) {
                     var22 = false;
                     break;
                  }
               }

               if(var22) {
                  var23 = var2.aClass70_2234;
                  if(!Class164_Sub1.method2239(var6, x, y, var23.anInt1055)) {
                     if(HDToolkit.openGLEnabled) {
                        label736: {
                           if((var23.aLong1048 & 1032192L) == 16384L) {
                              var11 = var23.anInt1054 - MillisTimer.anInt2697;
                              var12 = var23.anInt1045 - Class3_Sub13_Sub30.anInt3363;
                              var27 = (int)(var23.aLong1048 >> 20 & 3L);
                              if(var27 == 0) {
                                 var11 -= 64;
                                 var12 += 64;
                                 if(var12 < var11 && x > 0 && y < Class3_Sub13_Sub15.anInt3179 - 1) {
                                    LightManager.method1268(MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, z, x - 1, y + 1);
                                    break label736;
                                 }
                              } else if(var27 == 1) {
                                 var11 += 64;
                                 var12 += 64;
                                 if(var12 < -var11 && x < jSocket.anInt1234 - 1 && y < Class3_Sub13_Sub15.anInt3179 - 1) {
                                    LightManager.method1268(MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, z, x + 1, y + 1);
                                    break label736;
                                 }
                              } else if(var27 == 2) {
                                 var11 += 64;
                                 var12 -= 64;
                                 if(var12 > var11 && x < jSocket.anInt1234 - 1 && y > 0) {
                                    LightManager.method1268(MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, z, x + 1, y - 1);
                                    break label736;
                                 }
                              } else if(var27 == 3) {
                                 var11 -= 64;
                                 var12 -= 64;
                                 if(var12 > -var11 && x > 0 && y > 0) {
                                    LightManager.method1268(MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, z, x - 1, y - 1);
                                    break label736;
                                 }
                              }
                           }

                           LightManager.method1268(MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, z, x, y);
                        }
                     }

                     var23.aClass140_1049.render(0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var23.anInt1054 - MillisTimer.anInt2697, var23.anInt1057 - EnumType.anInt3657, var23.anInt1045 - Class3_Sub13_Sub30.anInt3363, var23.aLong1048, z, (ParticleEngine)null);
                  }

                  var2.anInt2227 = 0;
               }
            }

            if(var2.aBoolean2236) {
               try {
                  var9 = var2.anInt2223;
                  var2.aBoolean2236 = false;
                  var10 = 0;

                  label712:
                  for(var11 = 0; var11 < var9; ++var11) {
                     var25 = var2.aClass25Array2221[var11];
                     if(var25.anInt490 != Class3_Sub28_Sub1.anInt3539) {
                        for(var27 = var25.anInt483; var27 <= var25.anInt495; ++var27) {
                           for(var14 = var25.anInt478; var14 <= var25.anInt481; ++var14) {
                              var35 = var7[var27][var14];
                              if(var35.aBoolean2222) {
                                 var2.aBoolean2236 = true;
                                 continue label712;
                              }

                              if(var35.anInt2227 != 0) {
                                 var16 = 0;
                                 if(var27 > var25.anInt483) {
                                    ++var16;
                                 }

                                 if(var27 < var25.anInt495) {
                                    var16 += 4;
                                 }

                                 if(var14 > var25.anInt478) {
                                    var16 += 8;
                                 }

                                 if(var14 < var25.anInt481) {
                                    var16 += 2;
                                 }

                                 if((var16 & var35.anInt2227) == var2.anInt2232) {
                                    var2.aBoolean2236 = true;
                                    continue label712;
                                 }
                              }
                           }
                        }

                        UpdateServerNode.aClass25Array4060[var10++] = var25;
                        var27 = Class97.anInt1375 - var25.anInt483;
                        var14 = var25.anInt495 - Class97.anInt1375;
                        if(var14 > var27) {
                           var27 = var14;
                        }

                        var15 = Class3_Sub13_Sub27.anInt3340 - var25.anInt478;
                        var16 = var25.anInt481 - Class3_Sub13_Sub27.anInt3340;
                        if(var16 > var15) {
                           var25.anInt487 = var27 + var16;
                        } else {
                           var25.anInt487 = var27 + var15;
                        }
                     }
                  }

                  while(var10 > 0) {
                     var11 = -50;
                     var12 = -1;

                     for(var27 = 0; var27 < var10; ++var27) {
                        Class25 var34 = UpdateServerNode.aClass25Array4060[var27];
                        if(var34.anInt490 != Class3_Sub28_Sub1.anInt3539) {
                           if(var34.anInt487 > var11) {
                              var11 = var34.anInt487;
                              var12 = var27;
                           } else if(var34.anInt487 == var11) {
                              var15 = var34.anInt482 - MillisTimer.anInt2697;
                              var16 = var34.anInt484 - Class3_Sub13_Sub30.anInt3363;
                              var17 = UpdateServerNode.aClass25Array4060[var12].anInt482 - MillisTimer.anInt2697;
                              var18 = UpdateServerNode.aClass25Array4060[var12].anInt484 - Class3_Sub13_Sub30.anInt3363;
                              if(var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                 var12 = var27;
                              }
                           }
                        }
                     }

                     if(var12 == -1) {
                        break;
                     }

                     Class25 var32 = UpdateServerNode.aClass25Array4060[var12];
                     var32.anInt490 = Class3_Sub28_Sub1.anInt3539;
                     if(!Class3_Sub13_Sub11.method222(var6, var32.anInt483, var32.anInt495, var32.anInt478, var32.anInt481, var32.aClass140_479.method1871())) {
                        if(HDToolkit.openGLEnabled) {
                           if((var32.aLong498 & 1032192L) == 147456L) {
                              LightManager.method1268(MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, z, x, y);
                              var14 = var32.anInt482 - MillisTimer.anInt2697;
                              var15 = var32.anInt484 - Class3_Sub13_Sub30.anInt3363;
                              var16 = (int)(var32.aLong498 >> 20 & 3L);
                              if(var16 != 1 && var16 != 3) {
                                 if(var15 > var14) {
                                    LightManager.method1272(z, x, y - 1, x + 1, y);
                                 } else {
                                    LightManager.method1272(z, x, y + 1, x - 1, y);
                                 }
                              } else if(var15 > -var14) {
                                 LightManager.method1272(z, x, y - 1, x - 1, y);
                              } else {
                                 LightManager.method1272(z, x, y + 1, x + 1, y);
                              }
                           } else {
                              LightManager.method1266(MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, z, var32.anInt483, var32.anInt478, var32.anInt495, var32.anInt481);
                           }
                        }

                        var32.aClass140_479.render(var32.anInt496, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var32.anInt482 - MillisTimer.anInt2697, var32.anInt489 - EnumType.anInt3657, var32.anInt484 - Class3_Sub13_Sub30.anInt3363, var32.aLong498, z, (ParticleEngine)null);
                     }

                     for(var14 = var32.anInt483; var14 <= var32.anInt495; ++var14) {
                        for(var15 = var32.anInt478; var15 <= var32.anInt481; ++var15) {
                           GroundTile var37 = var7[var14][var15];
                           if(var37.anInt2227 != 0) {
                              Class163_Sub1.tiles.insertBack(var37);
                           } else if((var14 != x || var15 != y) && var37.aBoolean2225) {
                              Class163_Sub1.tiles.insertBack(var37);
                           }
                        }
                     }
                  }

                  if(var2.aBoolean2236) {
                     continue;
                  }
               } catch (Exception var20) {
                  var2.aBoolean2236 = false;
               }
            }

            if(var2.aBoolean2225 && var2.anInt2227 == 0) {
               if(x <= Class97.anInt1375 && x > Class163_Sub1_Sub1.anInt4006) {
                  var21 = var7[x - 1][y];
                  if(var21 != null && var21.aBoolean2225) {
                     continue;
                  }
               }

               if(x >= Class97.anInt1375 && x < Class2.anInt67 - 1) {
                  var21 = var7[x + 1][y];
                  if(var21 != null && var21.aBoolean2225) {
                     continue;
                  }
               }

               if(y <= Class3_Sub13_Sub27.anInt3340 && y > AbstractObjectCache.anInt3603) {
                  var21 = var7[x][y - 1];
                  if(var21 != null && var21.aBoolean2225) {
                     continue;
                  }
               }

               if(y >= Class3_Sub13_Sub27.anInt3340 && y < PlainTile.anInt1665 - 1) {
                  var21 = var7[x][y + 1];
                  if(var21 != null && var21.aBoolean2225) {
                     continue;
                  }
               }

               var2.aBoolean2225 = false;
               --GameShell.anInt3;
               Class72 var29 = var2.aClass72_2245;
               if(var29 != null && var29.anInt1077 != 0) {
                  if(HDToolkit.openGLEnabled) {
                     LightManager.method1268(MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, z, x, y);
                  }

                  if(var29.aClass140_1067 != null) {
                     var29.aClass140_1067.render(0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var29.anInt1078 - MillisTimer.anInt2697, var29.anInt1068 - EnumType.anInt3657 - var29.anInt1077, var29.anInt1075 - Class3_Sub13_Sub30.anInt3363, var29.aLong1079, z, (ParticleEngine)null);
                  }

                  if(var29.aClass140_1069 != null) {
                     var29.aClass140_1069.render(0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var29.anInt1078 - MillisTimer.anInt2697, var29.anInt1068 - EnumType.anInt3657 - var29.anInt1077, var29.anInt1075 - Class3_Sub13_Sub30.anInt3363, var29.aLong1079, z, (ParticleEngine)null);
                  }

                  if(var29.aClass140_1073 != null) {
                     var29.aClass140_1073.render(0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var29.anInt1078 - MillisTimer.anInt2697, var29.anInt1068 - EnumType.anInt3657 - var29.anInt1077, var29.anInt1075 - Class3_Sub13_Sub30.anInt3363, var29.aLong1079, z, (ParticleEngine)null);
                  }
               }

               if(var2.anInt2241 != 0) {
                  Class19 var36 = var2.aClass19_2233;
                  if(var36 != null && !Class166.method2256(var6, x, y, var36.aClass140_429.method1871())) {
                     if((var36.anInt432 & var2.anInt2241) != 0) {
                        if(HDToolkit.openGLEnabled) {
                           LightManager.method1268(MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, z, x, y);
                        }

                        var36.aClass140_429.render(0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var36.anInt424 - MillisTimer.anInt2697 + var36.anInt430, var36.anInt425 - EnumType.anInt3657, var36.anInt427 - Class3_Sub13_Sub30.anInt3363 + var36.anInt426, var36.aLong428, z, (ParticleEngine)null);
                     } else if(var36.anInt432 == 256) {
                        var11 = var36.anInt424 - MillisTimer.anInt2697;
                        var12 = var36.anInt425 - EnumType.anInt3657;
                        var27 = var36.anInt427 - Class3_Sub13_Sub30.anInt3363;
                        var14 = var36.anInt420;
                        if(var14 != 1 && var14 != 2) {
                           var15 = var11;
                        } else {
                           var15 = -var11;
                        }

                        if(var14 != 2 && var14 != 3) {
                           var16 = var27;
                        } else {
                           var16 = -var27;
                        }

                        if(var16 >= var15) {
                           if(HDToolkit.openGLEnabled) {
                              LightManager.method1268(MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, z, x, y);
                           }

                           var36.aClass140_429.render(0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var11 + var36.anInt430, var12, var27 + var36.anInt426, var36.aLong428, z, (ParticleEngine)null);
                        } else if(var36.aClass140_423 != null) {
                           if(HDToolkit.openGLEnabled) {
                              LightManager.method1268(MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, z, x, y);
                           }

                           var36.aClass140_423.render(0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var11, var12, var27, var36.aLong428, z, (ParticleEngine)null);
                        }
                     }
                  }

                  Class70 var31 = var2.aClass70_2234;
                  if(var31 != null) {
                     if((var31.anInt1059 & var2.anInt2241) != 0 && !Class164_Sub1.method2239(var6, x, y, var31.anInt1059)) {
                        if(HDToolkit.openGLEnabled) {
                           LightManager.method1263(var31.anInt1059, MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, var6, x, y);
                        }

                        var31.aClass140_1052.render(0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var31.anInt1054 - MillisTimer.anInt2697, var31.anInt1057 - EnumType.anInt3657, var31.anInt1045 - Class3_Sub13_Sub30.anInt3363, var31.aLong1048, z, (ParticleEngine)null);
                     }

                     if((var31.anInt1055 & var2.anInt2241) != 0 && !Class164_Sub1.method2239(var6, x, y, var31.anInt1055)) {
                        if(HDToolkit.openGLEnabled) {
                           LightManager.method1263(var31.anInt1055, MillisTimer.anInt2697, EnumType.anInt3657, Class3_Sub13_Sub30.anInt3363, var6, x, y);
                        }

                        var31.aClass140_1049.render(0, Class60.anInt936, LookupTable.anInt1037, Class3_Sub13_Sub34.anInt3417, Class3_Sub13_Sub13.anInt3153, var31.anInt1054 - MillisTimer.anInt2697, var31.anInt1057 - EnumType.anInt3657, var31.anInt1045 - Class3_Sub13_Sub30.anInt3363, var31.aLong1048, z, (ParticleEngine)null);
                     }
                  }
               }

               GroundTile var33;
               if(z < TransformList.anInt2456 - 1) {
                  var33 = Class75_Sub2.groundTiles[z + 1][x][y];
                  if(var33 != null && var33.aBoolean2225) {
                     Class163_Sub1.tiles.insertBack(var33);
                  }
               }

               if(x < Class97.anInt1375) {
                  var33 = var7[x + 1][y];
                  if(var33 != null && var33.aBoolean2225) {
                     Class163_Sub1.tiles.insertBack(var33);
                  }
               }

               if(y < Class3_Sub13_Sub27.anInt3340) {
                  var33 = var7[x][y + 1];
                  if(var33 != null && var33.aBoolean2225) {
                     Class163_Sub1.tiles.insertBack(var33);
                  }
               }

               if(x > Class97.anInt1375) {
                  var33 = var7[x - 1][y];
                  if(var33 != null && var33.aBoolean2225) {
                     Class163_Sub1.tiles.insertBack(var33);
                  }
               }

               if(y > Class3_Sub13_Sub27.anInt3340) {
                  var33 = var7[x][y - 1];
                  if(var33 != null && var33.aBoolean2225) {
                     Class163_Sub1.tiles.insertBack(var33);
                  }
               }
            }
         }
      }
   }

   static final void method2074(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         jInterface var7 = AbstractSprite.method638(var0, var1);
         if(null != var7 && null != var7.anObjectArray203) {
            InterfaceListener var8 = new InterfaceListener();
            var8.aClass11_2449 = var7;
            var8.objectData = var7.anObjectArray203;
            Light.method1065(var8);
         }

         jInterface.anInt278 = var1;
         LookupTable.anInt1038 = var3;
         if(var5 < -110) {
            SubScript.anInt872 = var0;
            Class164.anInt2051 = var2;
            SceneGraphNode.aBoolean1837 = true;
            Class144.anInt1887 = var4;
            AnimationLoader.anInt3590 = var6;
            Class20.refreshInterface(var7);
         }
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "ub.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   static final int method2075(int var0, byte var1) {
      try {
         int var2 = 110 / ((var1 - 34) / 61);
         return 255 & var0;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "ub.A(" + var0 + ',' + var1 + ')');
      }
   }

	static final void method2077(boolean var0) {
      try {
         OverridedInterface.aClass93_2604.clearAll();
         if(!var0) {
            aClass94_1899 = (jString)null;
         }

         Class27.aClass93_511.clearAll();
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ub.B(" + var0 + ')');
      }
   }

}
