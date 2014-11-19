
final class Class82 {

   private int[] anIntArray1144;
   private Class3_Sub13 aClass3_Sub13_1145;
   static Class93 aClass93_1146 = new Class93(64);
   private Class3_Sub13[] aClass3_Sub13Array1147;
   private Class3_Sub13 aClass3_Sub13_1148;
   private int[] anIntArray1149;
   //static int anInt1150 = -1;
   //static jString aClass94_1151 = jString.createJString("settings=");
   static int anInt1152;


   final int[] method1404(int var1, boolean var2, int var3, double var4, js5 var7, TextureInterface var8, boolean var9) {
         SceneGraphNode.method1859(var4);
         Class17.anInterface2_408 = var8;
         Class104.aClass153_2172 = var7;
         Class3_Sub13_Sub3.method180(-1, var1, var3);

         int var11;
         for(var11 = 0; ~this.aClass3_Sub13Array1147.length < ~var11; ++var11) {
            this.aClass3_Sub13Array1147[var11].method160(var1, var3, 250);
         }

         int[] var10 = new int[var1 * var3];
         int var12;
         byte var13;
         if(!var9) {
            var13 = 1;
            var11 = 0;
            var12 = var3;
         } else {
            var13 = -1;
            var12 = -1;
            var11 = var3 - 1;
         }

         int var14 = 0;

         int var15;
         for(var15 = 0; ~var15 > ~var1; ++var15) {
            if(var2) {
               var14 = var15;
            }

            int[] var17;
            int[] var16;
            int[] var18;
            if(this.aClass3_Sub13_1145.aBoolean2375) {
               int[] var19 = this.aClass3_Sub13_1145.method154(var15, (byte)109);
               var16 = var19;
               var17 = var19;
               var18 = var19;
            } else {
               int[][] var24 = this.aClass3_Sub13_1145.method166(-1, var15);
               var16 = var24[0];
               var18 = var24[2];
               var17 = var24[1];
            }

            for(int var25 = var11; var25 != var12; var25 += var13) {
               int var20 = var16[var25] >> 4;
               if(var20 > 255) {
                  var20 = 255;
               }

               if(~var20 > -1) {
                  var20 = 0;
               }

               var20 = PacketBuffer.anIntArray3804[var20];
               int var22 = var18[var25] >> 4;
               int var21 = var17[var25] >> 4;
               if(var21 > 255) {
                  var21 = 255;
               }

               if(0 > var21) {
                  var21 = 0;
               }

               if(-256 > ~var22) {
                  var22 = 255;
               }

               var21 = PacketBuffer.anIntArray3804[var21];
               if(-1 < ~var22) {
                  var22 = 0;
               }

               var22 = PacketBuffer.anIntArray3804[var22];
               var10[var14++] = (var20 << 16) - -(var21 << 8) + var22;
               if(var2) {
                  var14 += var3 + -1;
               }
            }
         }

         for(var15 = 0; var15 < this.aClass3_Sub13Array1147.length; ++var15) {
            this.aClass3_Sub13Array1147[var15].method161();
         }

         return var10;
   }

   static final void method1405(int var0, int var1, int var2, int var3, int var4, int var5) {
         Class3_Sub13_Sub39.anInt3464 = 0;

         int var7;
         int var15;
         int var19;
         int var21;
         int var22;
         int var29;
         int var32;
         for(var7 = -1; var7 < Class159.anInt2022 + Class163.anInt2046; ++var7) {
            Object var8;
            if(0 == ~var7) {
               var8 = TextureLoader.selfPlayer;
            } else if(~Class159.anInt2022 < ~var7) {
               var8 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[Class56.anIntArray887[var7]];
            } else {
               var8 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[Class15.anIntArray347[-Class159.anInt2022 + var7]];
            }

            if(null != var8 && ((Entity)var8).method1966((byte)17)) {
               NpcDefinition var9;
               if(var8 instanceof Npc) {
                  var9 = ((Npc)var8).aClass90_3976;
                  if(null != var9.anIntArray1292) {
                     var9 = var9.method1471((byte)-93);
                  }

                  if(var9 == null) {
                     continue;
                  }
               }

               int var12;
               if(var7 < Class159.anInt2022) {
                  var19 = 30;
                  Player var10 = (Player)var8;
                  if(var10.anInt3972 != -1 || -1 != var10.anInt3955) {
                     Class107.method1647((byte)122, var4 >> 1, var3, (Entity)var8, var5, ((Entity)var8).method1975() - -15, var1 >> 1);
                     if(-1 < Class32.anInt590) {
                        if(0 != ~var10.anInt3972) {
                           Class3_Sub13_Sub31.aClass3_Sub28_Sub16Array3373[var10.anInt3972].method643(-12 + Class32.anInt590 + var2, -var19 + var0 + ClickMaskNode.anInt2208);
                           var19 += 25;
                        }

                        if(var10.anInt3955 != -1) {
                           Npc.aClass3_Sub28_Sub16Array3977[var10.anInt3955].method643(-12 + var2 + Class32.anInt590, var0 - (-ClickMaskNode.anInt2208 + var19));
                           var19 += 25;
                        }
                     }
                  }

                  if(~var7 <= -1) {
                     HintIcon[] var11 = RuntimeException_Sub1.aClass96Array2114;

                     for(var12 = 0; ~var11.length < ~var12; ++var12) {
                        HintIcon var13 = var11[var12];
                        if(null != var13 && -11 == ~var13.anInt1360 && Class56.anIntArray887[var7] == var13.anInt1359) {
                           Class107.method1647((byte)122, var4 >> 1, var3, (Entity)var8, var5, ((Entity)var8).method1975() - -15, var1 >> 1);
                           if(Class32.anInt590 > -1) {
                              Class166.aClass3_Sub28_Sub16Array2072[var13.anInt1351].method643(var2 - (-Class32.anInt590 + 12), var0 + (ClickMaskNode.anInt2208 - var19));
                           }
                        }
                     }
                  }
               } else {
                  var9 = ((Npc)var8).aClass90_3976;
                  if(var9.anIntArray1292 != null) {
                     var9 = var9.method1471((byte)102);
                  }

                  if(~var9.anInt1269 <= -1 && Npc.aClass3_Sub28_Sub16Array3977.length > var9.anInt1269) {
                     if(0 == ~var9.anInt1265) {
                        var22 = 15 + ((Entity)var8).method1975();
                     } else {
                        var22 = 15 + var9.anInt1265;
                     }

                     Class107.method1647((byte)122, var4 >> 1, var3, (Entity)var8, var5, var22, var1 >> 1);
                     if(~Class32.anInt590 < 0) {
                        Npc.aClass3_Sub28_Sub16Array3977[var9.anInt1269].method643(var2 - -Class32.anInt590 - 12, -30 + var0 - -ClickMaskNode.anInt2208);
                     }
                  }

                  HintIcon[] var20 = RuntimeException_Sub1.aClass96Array2114;

                  for(var21 = 0; ~var21 > ~var20.length; ++var21) {
                     HintIcon var24 = var20[var21];
                     if(null != var24 && var24.anInt1360 == 1 && ~var24.anInt1359 == ~Class15.anIntArray347[-Class159.anInt2022 + var7] && -11 < ~(Class44.loopCycle % 20)) {
                        if(-1 != var9.anInt1265) {
                           var29 = 15 + var9.anInt1265;
                        } else {
                           var29 = 15 + ((Entity)var8).method1975();
                        }

                        Class107.method1647((byte)122, var4 >> 1, var3, (Entity)var8, var5, var29, var1 >> 1);
                        if(0 > ~Class32.anInt590) {
                           Class166.aClass3_Sub28_Sub16Array2072[var24.anInt1351].method643(-12 + var2 + Class32.anInt590, -28 + ClickMaskNode.anInt2208 + var0);
                        }
                     }
                  }
               }

               if(((Entity)var8).aClass94_2825 != null && (var7 >= Class159.anInt2022 || ~Class3_Sub13_Sub8.anInt3101 == -1 || 3 == Class3_Sub13_Sub8.anInt3101 || 1 == Class3_Sub13_Sub8.anInt3101 && SubScript.method1176(((Player)var8).username, (byte)-82))) {
                  Class107.method1647((byte)122, var4 >> 1, var3, (Entity)var8, var5, ((Entity)var8).method1975(), var1 >> 1);
                  if(-1 < Class32.anInt590 && Class3_Sub13_Sub39.anInt3464 < Class3_Sub13_Sub26.anInt3332) {
                     Class3_Sub13_Sub26.anIntArray3329[Class3_Sub13_Sub39.anInt3464] = client.getBoldFont().method682(((Entity)var8).aClass94_2825) / 2;
                     Class3_Sub13_Sub26.anIntArray3327[Class3_Sub13_Sub39.anInt3464] = client.getBoldFont().anInt3727;
                     Class3_Sub13_Sub26.anIntArray3319[Class3_Sub13_Sub39.anInt3464] = Class32.anInt590;
                     Class3_Sub13_Sub26.anIntArray3337[Class3_Sub13_Sub39.anInt3464] = ClickMaskNode.anInt2208;
                     Class3_Sub13_Sub26.anIntArray3331[Class3_Sub13_Sub39.anInt3464] = ((Entity)var8).anInt2837;
                     Class3_Sub13_Sub26.anIntArray3336[Class3_Sub13_Sub39.anInt3464] = ((Entity)var8).anInt2753;
                     Class3_Sub13_Sub26.anIntArray3318[Class3_Sub13_Sub39.anInt3464] = ((Entity)var8).anInt2814;
                     Class3_Sub13_Sub26.aClass94Array3317[Class3_Sub13_Sub39.anInt3464] = ((Entity)var8).aClass94_2825;
                     ++Class3_Sub13_Sub39.anInt3464;
                  }
               }

               if(~((Entity)var8).anInt2781 < ~Class44.loopCycle) {
            	   AbstractSprite var23 = Js5CacheWorker.aClass3_Sub28_Sub16Array996[client.newHealthbars ? 1 : 3];
                   AbstractSprite var25 = Js5CacheWorker.aClass3_Sub28_Sub16Array996[client.newHealthbars ? 0 : 2];
                  if(var8 instanceof Npc) {
                     Npc var28 = (Npc)var8;
                     AbstractSprite[] var31 = (AbstractSprite[])((AbstractSprite[])Class3_Sub13_Sub11.aClass93_3130.get((long)var28.aClass90_3976.anInt1279));
                     if(var31 == null) {
                        var31 = Class140_Sub6.method2027(0, var28.aClass90_3976.anInt1279, Class140_Sub6.cacheIndex8);
                        if(null != var31) {
                           Class3_Sub13_Sub11.aClass93_3130.put(var31, (long)var28.aClass90_3976.anInt1279);
                        }
                     }

                     if(null != var31 && ~var31.length == -3) {
                        var25 = var31[1];
                        var23 = var31[0];
                     }

                     NpcDefinition var14 = var28.aClass90_3976;
                     if(-1 == var14.anInt1265) {
                        var21 = ((Entity)var8).method1975();
                     } else {
                        var21 = var14.anInt1265;
                     }
                  } else {
                     var21 = ((Entity)var8).method1975();
                  }

                  Class107.method1647((byte)122, var4 >> 1, var3, (Entity)var8, var5, var23.height + 10 + var21, var1 >> 1);
                  if(-1 < Class32.anInt590) {
                	  var12 = -(var23.width >> 1) + Class32.anInt590 + var2;
                	  var29 = ClickMaskNode.anInt2208 + var0 + -3;
                	  var23.method643(var12, var29);
                	  var32 = var23.width * ((Entity)var8).hpRatio / 255;
                	  var15 = var23.height;
                	  if(!HDToolkit.openGLEnabled) {
                		  GraphicsLD.method1326(var12, var29, var12 + var32, var15 + var29);
                	  } else {
                		  GraphicsHD.setBounds(var12, var29, var12 + var32, var29 + var15);
                      }

                      var25.method643(var12, var29);
                      if(HDToolkit.openGLEnabled) {
                         GraphicsHD.clipRect(var2, var0, var1 + var2, var0 - -var4);
                      } else {
                         GraphicsLD.clipRect(var2, var0, var1 + var2, var4 + var0);
                      }
                  }
               }

               for(var19 = 0; ~var19 > -5; ++var19) {
                  if(~((Entity)var8).anIntArray2768[var19] < ~Class44.loopCycle) {
                     if(!(var8 instanceof Npc)) {
                        var22 = ((Entity)var8).method1975() / 2;
                     } else {
                        Npc var30 = (Npc)var8;
                        NpcDefinition var26 = var30.aClass90_3976;
                        if(~var26.anInt1265 == 0) {
                           var22 = ((Entity)var8).method1975() / 2;
                        } else {
                           var22 = var26.anInt1265 / 2;
                        }
                     }

                     Class107.method1647((byte)122, var4 >> 1, var3, (Entity)var8, var5, var22, var1 >> 1);
                     if(-1 < Class32.anInt590) {
                        if(var19 == 1) {
                           ClickMaskNode.anInt2208 -= 20;
                        }

                        if(-3 == ~var19) {
                           ClickMaskNode.anInt2208 -= 10;
                           Class32.anInt590 -= 15;
                        }

                        if(3 == var19) {
                           ClickMaskNode.anInt2208 -= 10;
                           Class32.anInt590 += 15;
                        }
                        int index = (((Entity)var8).anIntArray2815[var19]);
						int damage = (((Entity)var8).anIntArray2836[var19]);
						if (client.newMarkers) {
							if (index == 1) {
								if (damage > 99) {
									index = 2;
								}
							} else if (index == 2) {
								if (damage > 99) {
									index = 4;
								} else {
									index = 3;
								}
							}
							int xIncrease = (index == 2 || index == 4) ? 20 : 12;
							int yIncrease = (index == 2 || index == 4) ? 13 : 12;
							Class75_Sub3.new_hitmarkers[index].method643(-xIncrease + var2 + Class32.anInt590, var0 + ClickMaskNode.anInt2208 - yIncrease);
							client.getSmallFont().method699(Class72.method1298(damage), -1 + Class32.anInt590 + var2, 3 + ClickMaskNode.anInt2208 + var0, 16777215, 0);
						} else {
							Class75_Sub3.old_hitmarkers[index].method643(-12 + var2 + Class32.anInt590, var0 + ClickMaskNode.anInt2208 - 12);
							client.getSmallFont().method699(Class72.method1298(damage), -1 + Class32.anInt590 + var2, 3 + ClickMaskNode.anInt2208 + var0, 16777215, 0);
						}
                     }
                  }
               }
            }
         }

         var7 = 0;
         
         for(; Class3_Sub13_Sub39.anInt3464 > var7; ++var7) {
            var19 = Class3_Sub13_Sub26.anIntArray3337[var7];
            int var18 = Class3_Sub13_Sub26.anIntArray3319[var7];
            var21 = Class3_Sub13_Sub26.anIntArray3327[var7];
            var22 = Class3_Sub13_Sub26.anIntArray3329[var7];
            boolean var27 = true;

            while(var27) {
               var27 = false;

               for(var29 = 0; var7 > var29; ++var29) {
                  if(Class3_Sub13_Sub26.anIntArray3337[var29] - Class3_Sub13_Sub26.anIntArray3327[var29] < 2 + var19 && -var21 + var19 < Class3_Sub13_Sub26.anIntArray3337[var29] - -2 && -var22 + var18 < Class3_Sub13_Sub26.anIntArray3319[var29] + Class3_Sub13_Sub26.anIntArray3329[var29] && Class3_Sub13_Sub26.anIntArray3319[var29] - Class3_Sub13_Sub26.anIntArray3329[var29] < var22 + var18 && -Class3_Sub13_Sub26.anIntArray3327[var29] + Class3_Sub13_Sub26.anIntArray3337[var29] < var19) {
                     var19 = Class3_Sub13_Sub26.anIntArray3337[var29] - Class3_Sub13_Sub26.anIntArray3327[var29];
                     var27 = true;
                  }
               }
            }

            Class32.anInt590 = Class3_Sub13_Sub26.anIntArray3319[var7];
            ClickMaskNode.anInt2208 = Class3_Sub13_Sub26.anIntArray3337[var7] = var19;
            jString var33 = Class3_Sub13_Sub26.aClass94Array3317[var7];
            if(~FileSystem.anInt688 == -1) {
               var32 = 16776960;
               if(-7 < ~Class3_Sub13_Sub26.anIntArray3331[var7]) {
                  var32 = ClickMaskNode.anIntArray2213[Class3_Sub13_Sub26.anIntArray3331[var7]];
               }

               if(6 == Class3_Sub13_Sub26.anIntArray3331[var7]) {
                  var32 = 10 <= VarBit.anInt1127 % 20?16776960:16711680;
               }

               if(~Class3_Sub13_Sub26.anIntArray3331[var7] == -8) {
                  var32 = ~(VarBit.anInt1127 % 20) > -11?255:'\uffff';
               }

               if(8 == Class3_Sub13_Sub26.anIntArray3331[var7]) {
                  var32 = ~(VarBit.anInt1127 % 20) <= -11?8454016:'\ub000';
               }

               if(9 == Class3_Sub13_Sub26.anIntArray3331[var7]) {
                  var15 = -Class3_Sub13_Sub26.anIntArray3318[var7] + 150;
                  if(var15 >= 50) {
                     if(var15 >= 100) {
                        if(150 > var15) {
                           var32 = -500 - (-(5 * var15) - '\uff00');
                        }
                     } else {
                        var32 = 16776960 + 16384000 + -(327680 * var15);
                     }
                  } else {
                     var32 = var15 * 1280 + 16711680;
                  }
               }

               if(10 == Class3_Sub13_Sub26.anIntArray3331[var7]) {
                  var15 = -Class3_Sub13_Sub26.anIntArray3318[var7] + 150;
                  if(50 <= var15) {
                     if(~var15 > -101) {
                        var32 = -(327680 * (-50 + var15)) + 16711935;
                     } else if(150 > var15) {
                        var32 = 327680 * var15 - (32768000 - (255 + -(5 * var15) + 500));
                     }
                  } else {
                     var32 = 16711680 + var15 * 5;
                  }
               }

               if(Class3_Sub13_Sub26.anIntArray3331[var7] == 11) {
                  var15 = 150 + -Class3_Sub13_Sub26.anIntArray3318[var7];
                  if(var15 >= 50) {
                     if(-101 >= ~var15) {
                        if(var15 < 150) {
                           var32 = 16777215 - var15 * 327680 + 32768000;
                        }
                     } else {
                        var32 = '\uff00' - (-(327685 * var15) - -16384250);
                     }
                  } else {
                     var32 = 16777215 - 327685 * var15;
                  }
               }

               if(0 == Class3_Sub13_Sub26.anIntArray3336[var7]) {
                  client.getBoldFont().method699(var33, Class32.anInt590 + var2, var0 + ClickMaskNode.anInt2208, var32, 0);
               }

               if(1 == Class3_Sub13_Sub26.anIntArray3336[var7]) {
                  client.getBoldFont().method696(var33, var2 - -Class32.anInt590, ClickMaskNode.anInt2208 + var0, var32, 0, VarBit.anInt1127);
               }

               if(Class3_Sub13_Sub26.anIntArray3336[var7] == 2) {
                  client.getBoldFont().method695(var33, var2 - -Class32.anInt590, var0 - -ClickMaskNode.anInt2208, var32, 0, VarBit.anInt1127);
               }

               if(-4 == ~Class3_Sub13_Sub26.anIntArray3336[var7]) {
                  client.getBoldFont().method692(var33, var2 + Class32.anInt590, ClickMaskNode.anInt2208 + var0, var32, 0, VarBit.anInt1127, 150 - Class3_Sub13_Sub26.anIntArray3318[var7]);
               }

               if(4 == Class3_Sub13_Sub26.anIntArray3336[var7]) {
                  var15 = (-Class3_Sub13_Sub26.anIntArray3318[var7] + 150) * (client.getBoldFont().method682(var33) - -100) / 150;
                  if(!HDToolkit.openGLEnabled) {
                     GraphicsLD.method1326(-50 + (var2 - -Class32.anInt590), var0, 50 + Class32.anInt590 + var2, var4 + var0);
                  } else {
                     GraphicsHD.setBounds(Class32.anInt590 + var2 + -50, var0, Class32.anInt590 + var2 - -50, var4 + var0);
                  }

                  client.getBoldFont().method681(var33, var2 - (-Class32.anInt590 + -50) + -var15, var0 + ClickMaskNode.anInt2208, var32, 0);
                  if(HDToolkit.openGLEnabled) {
                     GraphicsHD.clipRect(var2, var0, var1 + var2, var4 + var0);
                  } else {
                     GraphicsLD.clipRect(var2, var0, var2 - -var1, var0 + var4);
                  }
               }

               if(Class3_Sub13_Sub26.anIntArray3336[var7] == 5) {
                  int var16 = 0;
                  var15 = -Class3_Sub13_Sub26.anIntArray3318[var7] + 150;
                  if(HDToolkit.openGLEnabled) {
                     GraphicsHD.setBounds(var2, -1 + -client.getBoldFont().anInt3727 + ClickMaskNode.anInt2208 + var0, var1 + var2, 5 + var0 - -ClickMaskNode.anInt2208);
                  } else {
                     GraphicsLD.method1326(var2, -1 + -client.getBoldFont().anInt3727 + ClickMaskNode.anInt2208 + var0, var2 + var1, 5 + ClickMaskNode.anInt2208 + var0);
                  }

                  if(25 > var15) {
                     var16 = var15 + -25;
                  } else if(var15 > 125) {
                     var16 = var15 - 125;
                  }

                  client.getBoldFont().method699(var33, Class32.anInt590 + var2, var16 + var0 + ClickMaskNode.anInt2208, var32, 0);
                  if(HDToolkit.openGLEnabled) {
                     GraphicsHD.clipRect(var2, var0, var2 - -var1, var0 + var4);
                  } else {
                     GraphicsLD.clipRect(var2, var0, var2 + var1, var0 + var4);
                  }
               }
            } else {
               client.getBoldFont().method699(var33, var2 - -Class32.anInt590, var0 + ClickMaskNode.anInt2208, 16776960, 0);
            }
         }
   }

   static final int method1406(byte var0) {
      try {
         int var1 = -21 % ((63 - var0) / 49);
         return RawObjectCache.anInt4045;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "lc.E(" + var0 + ')');
      }
   }

   final byte[] method1407(int var1, int var2, boolean var3, TextureInterface var4, double var5, int var7, js5 var8) {
      try {
         byte[] var9 = new byte[4 * var2 * var1];
         if(var7 != 8839) {
            return (byte[])null;
         } else {
            SceneGraphNode.method1859(var5);
            Class104.aClass153_2172 = var8;
            Class17.anInterface2_408 = var4;
            Class3_Sub13_Sub3.method180(-32, var1, var2);

            int var10;
            for(var10 = 0; this.aClass3_Sub13Array1147.length > var10; ++var10) {
               this.aClass3_Sub13Array1147[var10].method160(var1, var2, var7 + -8589);
            }

            var10 = 0;

            int var11;
            for(var11 = 0; ~var1 < ~var11; ++var11) {
               if(var3) {
                  var10 = var11 << 2;
               }

               int[] var12;
               int[] var13;
               int[] var14;
               int[] var15;
               if(this.aClass3_Sub13_1145.aBoolean2375) {
                  var15 = this.aClass3_Sub13_1145.method154(var11, (byte)-98);
                  var12 = var15;
                  var13 = var15;
                  var14 = var15;
               } else {
                  int[][] var22 = this.aClass3_Sub13_1145.method166(-1, var11);
                  var12 = var22[0];
                  var13 = var22[1];
                  var14 = var22[2];
               }

               if(this.aClass3_Sub13_1148.aBoolean2375) {
                  var15 = this.aClass3_Sub13_1148.method154(var11, (byte)-103);
               } else {
                  var15 = this.aClass3_Sub13_1148.method166(-1, var11)[0];
               }

               for(int var16 = var2 - 1; ~var16 <= -1; --var16) {
                  int var17 = var12[var16] >> 4;
                  if(var17 > 255) {
                     var17 = 255;
                  }

                  if(var17 < 0) {
                     var17 = 0;
                  }

                  int var18 = var13[var16] >> 4;
                  if(-256 > ~var18) {
                     var18 = 255;
                  }

                  int var19 = var14[var16] >> 4;
                  if(var19 > 255) {
                     var19 = 255;
                  }

                  var17 = PacketBuffer.anIntArray3804[var17];
                  if(~var19 > -1) {
                     var19 = 0;
                  }

                  if(~var18 > -1) {
                     var18 = 0;
                  }

                  var18 = PacketBuffer.anIntArray3804[var18];
                  var19 = PacketBuffer.anIntArray3804[var19];
                  int var20;
                  if(~var17 == -1 && -1 == ~var18 && -1 == ~var19) {
                     var20 = 0;
                  } else {
                     var20 = var15[var16] >> 4;
                     if(255 < var20) {
                        var20 = 255;
                     }

                     if(-1 < ~var20) {
                        var20 = 0;
                     }
                  }

                  var9[var10++] = (byte)var17;
                  var9[var10++] = (byte)var18;
                  var9[var10++] = (byte)var19;
                  var9[var10++] = (byte)var20;
                  if(var3) {
                     var10 += -4 + (var2 << 2);
                  }
               }
            }

            for(var11 = 0; ~var11 > ~this.aClass3_Sub13Array1147.length; ++var11) {
               this.aClass3_Sub13Array1147[var11].method161();
            }

            return var9;
         }
      } catch (RuntimeException var21) {
         throw Class44.method1067(var21, "lc.F(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null?"{...}":"null") + ',' + var5 + ',' + var7 + ',' + (var8 != null?"{...}":"null") + ')');
      }
   }

   final boolean method1408(boolean var1, TextureInterface var2, js5 var3) {
      try {
         int var4;
         if(0 < PlainTile.anInt1668) {
            for(var4 = 0; ~var4 > ~this.anIntArray1144.length; ++var4) {
               if(!var3.method2129(this.anIntArray1144[var4], PlainTile.anInt1668)) {
                  return false;
               }
            }
         } else {
            for(var4 = 0; ~var4 > ~this.anIntArray1144.length; ++var4) {
               if(!var3.method2144(this.anIntArray1144[var4])) {
                  return false;
               }
            }
         }

         if(!var1) {
            this.anIntArray1144 = (int[])null;
         }

         for(var4 = 0; ~this.anIntArray1149.length < ~var4; ++var4) {
            if(!var2.method11(21, this.anIntArray1149[var4])) {
               return false;
            }
         }

         return true;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "lc.B(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

   public static void method1409(boolean var0) {
	   aClass93_1146 = null;
	   //aClass94_1151 = null;
   }

   public Class82() {
      try {
         this.anIntArray1149 = new int[0];
         this.anIntArray1144 = new int[0];
         this.aClass3_Sub13_1145 = new Class3_Sub13_Sub22();
         this.aClass3_Sub13_1145.anInt2381 = 1;
         this.aClass3_Sub13_1148 = new Class3_Sub13_Sub22();
         this.aClass3_Sub13Array1147 = new Class3_Sub13[]{this.aClass3_Sub13_1145, this.aClass3_Sub13_1148};
         this.aClass3_Sub13_1148.anInt2381 = 1;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "lc.<init>()");
      }
   }

   Class82(Buffer var1) {
      try {
         int var2 = var1.getUByte();
         this.aClass3_Sub13Array1147 = new Class3_Sub13[var2];
         int[][] var5 = new int[var2][];
         int var4 = 0;
         int var3 = 0;

         int var6;
         Class3_Sub13 var7;
         int var8;
         int var9;
         for(var6 = 0; var2 > var6; ++var6) {
            var7 = InputStream_Sub1.method63((byte)-67, var1);
            if(0 <= var7.method159(4)) {
               ++var3;
            }

            if(~var7.method155((byte)19) <= -1) {
               ++var4;
            }

            var8 = var7.aClass3_Sub13Array2377.length;
            var5[var6] = new int[var8];

            for(var9 = 0; ~var8 < ~var9; ++var9) {
               var5[var6][var9] = var1.getUByte();
            }

            this.aClass3_Sub13Array1147[var6] = var7;
         }

         this.anIntArray1144 = new int[var3];
         this.anIntArray1149 = new int[var4];
         var3 = 0;
         var4 = 0;

         for(var6 = 0; var6 < var2; ++var6) {
            var7 = this.aClass3_Sub13Array1147[var6];
            var8 = var7.aClass3_Sub13Array2377.length;

            for(var9 = 0; ~var9 > ~var8; ++var9) {
               var7.aClass3_Sub13Array2377[var9] = this.aClass3_Sub13Array1147[var5[var6][var9]];
            }

            var9 = var7.method159(4);
            int var10 = var7.method155((byte)19);
            if(-1 > ~var9) {
               this.anIntArray1144[var3++] = var9;
            }

            if(~var10 < -1) {
               this.anIntArray1149[var4++] = var10;
            }

            var5[var6] = null;
         }

         this.aClass3_Sub13_1145 = this.aClass3_Sub13Array1147[var1.getUByte()];
         var5 = (int[][])null;
         this.aClass3_Sub13_1148 = this.aClass3_Sub13Array1147[var1.getUByte()];
      } catch (RuntimeException var11) {
         throw Class44.method1067(var11, "lc.<init>(" + (var1 != null?"{...}":"null") + ')');
      }
   }

}
