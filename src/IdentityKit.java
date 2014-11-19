
final class IdentityKit {

   private short[] aShortArray460 = new short[6];
  
   private short[] aShortArray464 = new short[6];
   static jString aClass94_465 = jString.createJString(" ");
   int anInt466 = -1;
   static int anInt467 = 0;
   static jString aClass94_468 = jString.createJString("(U");
   static int anInt469 = 0;
   private short[] aShortArray470 = new short[6];
   private short[] aShortArray471 = new short[6];
   static int anInt472 = 0;
   private static jString aClass94_473 = jString.createJString("Loading title screen )2 ");
   private int[] anIntArray474;
   private int[] anIntArray475 = new int[]{-1, -1, -1, -1, -1};
   boolean aBoolean476 = false;
   private static jString aClass94_477 = jString.createJString("Loading)3)3)3");
 static jString aClass94_461 = aClass94_473;
   static jString aClass94_462 = aClass94_477;

   final ModelBuilder method941(boolean var1) {
      try {
         if(!var1) {
            return (ModelBuilder)null;
         } else {
            int var3 = 0;
            ModelBuilder[] var2 = new ModelBuilder[5];

            for(int var4 = 0; -6 < ~var4; ++var4) {
               if(0 != ~this.anIntArray475[var4]) {
                  var2[var3++] = ModelBuilder.get(Class10.aClass153_152, this.anIntArray475[var4], 0);
               }
            }

            ModelBuilder var7 = new ModelBuilder(var2, var3);
            int var5;
            if(this.aShortArray464 != null) {
               for(var5 = 0; ~var5 > ~this.aShortArray464.length; ++var5) {
                  var7.swapColors(this.aShortArray464[var5], this.aShortArray460[var5]);
               }
            }

            if(null != this.aShortArray471) {
               for(var5 = 0; ~this.aShortArray471.length < ~var5; ++var5) {
                  var7.method1998(this.aShortArray471[var5], this.aShortArray470[var5]);
               }
            }

            return var7;
         }
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "dm.F(" + var1 + ')');
      }
   }

   final boolean method942(int var1) {
      try {
         if(null == this.anIntArray474) {
            return true;
         } else {
            boolean var2 = true;
            if(var1 < 72) {
               this.method948(44);
            }

            for(int var3 = 0; ~var3 > ~this.anIntArray474.length; ++var3) {
               if(!Class10.aClass153_152.method2129(0, this.anIntArray474[var3])) {
                  var2 = false;
               }
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "dm.J(" + var1 + ')');
      }
   }

   public static void method943(int var0) {
      try {
         aClass94_468 = null;
         aClass94_473 = null;
         if(var0 == -9893) {
            aClass94_477 = null;
            aClass94_465 = null;
            aClass94_462 = null;
            aClass94_461 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "dm.C(" + var0 + ')');
      }
   }

   static final boolean method944(byte var0, int var1, int var2, byte[] var3) {
		boolean var5 = true;
		int objectId = -1;
		Buffer var6 = new Buffer(var3);

		for(;;) {
			int var8 = var6.method773();
			if (0 == var8) {
				break;
			}

			int var9 = 0;
			objectId += var8;
			boolean var10 = false;

			for(;;) {
				int var11;
				if (!var10) {
					var11 = var6.getSmart();
					if (0 == var11) {
						break;
					}

					var9 += var11 + -1;
					int var12 = 63 & var9;
					int var13 = (4088 & var9) >> 6;
					int var16 = var2 + var12;
					int var15 = var1 + var13;
					int var14 = var6.getUByte() >> 2;
					if (~var15 < -1 && var16 > 0 && 103 > var15 && 103 > var16) {
						ObjectDefinition var17 = ObjectDefinition.list(objectId);
						if (var14 != 22 || KeyboardHandler.showGroundDecorations || 0 != var17.anInt1529 || ~var17.clipType == -2 || var17.aBoolean1483) {
							var10 = true;
							if (!var17.method1694(false)) {
								var5 = false;
								++Class162.modelFetchCount;
							}
						}
					}
				} else {
					var11 = var6.getSmart();
					if (~var11 == -1) {
						break;
					}

					var6.getUByte();
				}
			}
		}
		return var5;
	}

   static final void method945(byte var0) {
      try {
         SpotAnimation.aClass3_Sub30_Sub1_532.initBitAccess();
         int var1 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(8);
         int var2;
         if(~Class163.anInt2046 < ~var1) {
            for(var2 = var1; var2 < Class163.anInt2046; ++var2) {
               LongNode.anIntArray2292[Class139.anInt1829++] = Class15.anIntArray347[var2];
            }
         }

         if(Class163.anInt2046 < var1) {
            throw new RuntimeException("gnpov1");
         } else {
            Class163.anInt2046 = 0;

            for(var2 = 0; ~var2 > ~var1; ++var2) {
               int var3 = Class15.anIntArray347[var2];
               Npc var4 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var3];
               int var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(1);
               if(0 != var5) {
                  int var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(2);
                  if(-1 != ~var6) {
                     int var7;
                     int var8;
                     if(1 != var6) {
                        if(var6 == 2) {
                           Class15.anIntArray347[Class163.anInt2046++] = var3;
                           var4.anInt2838 = Class44.loopCycle;
                           //if(-2 == ~SpotAnimation.aClass3_Sub30_Sub1_532.method812((byte)-11, 1)) {
                              var7 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(3);
                              var4.method1968(2, (byte)-122, var7);
                              var8 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(3);
                              var4.method1968(2, (byte)85, var8);
                           //} else {
                            //  var7 = SpotAnimation.aClass3_Sub30_Sub1_532.method812((byte)-11, 3);
                            //  var4.method1968(0, (byte)-80, var7);
                           ////}

                           var7 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(1);
                           if(var7 == 1) {
                              Class21.anIntArray441[Js5CacheWorker.anInt997++] = var3;
                           }
                        } else if(var6 == 3) {
                           LongNode.anIntArray2292[Class139.anInt1829++] = var3;
                        }
                     } else {
                        Class15.anIntArray347[Class163.anInt2046++] = var3;
                        var4.anInt2838 = Class44.loopCycle;
                        var7 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(3);
                        var4.method1968(1, (byte)32, var7);
                        var8 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(1);
                        if(1 == var8) {
                           Class21.anIntArray441[Js5CacheWorker.anInt997++] = var3;
                        }
                     }
                  } else {
                     Class15.anIntArray347[Class163.anInt2046++] = var3;
                     var4.anInt2838 = Class44.loopCycle;
                     Class21.anIntArray441[Js5CacheWorker.anInt997++] = var3;
                  }
               } else {
                  Class15.anIntArray347[Class163.anInt2046++] = var3;
                  var4.anInt2838 = Class44.loopCycle;
               }
            }

         }
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "dm.E(" + var0 + ')');
      }
   }

   private final void method946(Buffer var2, int var3) {
	   if(var3 == 1) {
           this.anInt466 = var2.getUByte();
	   } else if(var3 == 2) {
		   int var4 = var2.getUByte();
		   this.anIntArray474 = new int[var4];

		   for(int var5 = 0; var4 > var5; ++var5) {
			   this.anIntArray474[var5] = var2.getUShort();
		   }
	   } else if(var3 == 3) {
		   this.aBoolean476 = true;
	   } else if(var3 >= 40 && var3 < 50) {
		   this.aShortArray460[var3 - 40] = (short)var2.getUShort();
	   } else if(var3 >= 50 && var3 < 60) {
           this.aShortArray464[var3 - 50] = (short)var2.getUShort();
              /*if(-42 == ~var3) {
                 var4 = var2.getUByte();
                 this.aShortArray471 = new short[var4];
                 this.aShortArray470 = new short[var4];

                 for(var5 = 0; ~var4 < ~var5; ++var5) {
                    this.aShortArray471[var5] = (short)var2.getUShort();
                    this.aShortArray470[var5] = (short)var2.getUShort();
                 }*/
	   } else if(~var3 <= -61 && var3 < 70) {
		   this.anIntArray475[var3 - 60] = var2.getUShort();
	   }
   }

   final ModelBuilder method947(byte var1) {
      try {
         if(this.anIntArray474 == null) {
            return null;
         } else {
            ModelBuilder[] var2 = new ModelBuilder[this.anIntArray474.length];

            for(int var3 = 0; ~var3 > ~this.anIntArray474.length; ++var3) {
               var2[var3] = ModelBuilder.get(Class10.aClass153_152, this.anIntArray474[var3], 0);
            }

            int var4 = 27 / ((var1 - 74) / 35);
            ModelBuilder var7;
            if(var2.length == 1) {
               var7 = var2[0];
            } else {
               var7 = new ModelBuilder(var2, var2.length);
            }

            int var5;
            if(null != this.aShortArray464) {
               for(var5 = 0; var5 < this.aShortArray464.length; ++var5) {
                  var7.swapColors(this.aShortArray464[var5], this.aShortArray460[var5]);
               }
            }

            if(this.aShortArray471 != null) {
               for(var5 = 0; ~var5 > ~this.aShortArray471.length; ++var5) {
                  var7.method1998(this.aShortArray471[var5], this.aShortArray470[var5]);
               }
            }

            return var7;
         }
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "dm.H(" + var1 + ')');
      }
   }

   final boolean method948(int var1) {
      try {
         boolean var2 = true;
         if(var1 != 18991) {
            this.aShortArray460 = (short[])null;
         }

         for(int var3 = 0; var3 < 5; ++var3) {
            if(-1 != this.anIntArray475[var3] && !Class10.aClass153_152.method2129(0, this.anIntArray475[var3])) {
               var2 = false;
            }
         }

         return var2;
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "dm.B(" + var1 + ')');
      }
   }

   static final void method949(int var0, byte var1, int var2, int var3, int var4) {
      try {
         int var5 = -44 / ((24 - var1) / 59);
         int var6 = 0;
         Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var4], -var2 + var0, var0 - -var2, var3);
         int var8 = -var2;
         int var7 = var2;
         int var9 = -1;

         while(~var6 > ~var7) {
            ++var6;
            var9 += 2;
            var8 += var9;
            if(var8 >= 0) {
               --var7;
               var8 -= var7 << 1;
               int[] var10 = Class38.anIntArrayArray663[var4 - -var7];
               int[] var11 = Class38.anIntArrayArray663[var4 - var7];
               int var12 = var0 - -var6;
               int var13 = -var6 + var0;
               Class3_Sub13_Sub23_Sub1.method282(var10, var13, var12, var3);
               Class3_Sub13_Sub23_Sub1.method282(var11, var13, var12, var3);
            }

            int var16 = var7 + var0;
            int var15 = -var7 + var0;
            int[] var17 = Class38.anIntArrayArray663[var4 - -var6];
            int[] var18 = Class38.anIntArrayArray663[-var6 + var4];
            Class3_Sub13_Sub23_Sub1.method282(var17, var15, var16, var3);
            Class3_Sub13_Sub23_Sub1.method282(var18, var15, var16, var3);
         }

      } catch (RuntimeException var14) {
         throw Class44.method1067(var14, "dm.I(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   static final void method950(jInterface var0, int var1, int var2, int var3) {
      try {
         if(2 <= Class3_Sub13_Sub34.anInt3415 || ~Class164_Sub1.anInt3012 != -1 || SceneGraphNode.aBoolean1837) {
            if(var1 > -55) {
               aClass94_473 = (jString)null;
            }

            jString var4 = Class3_Sub28_Sub1.method531((byte)94);
            if(var0 == null) {
               int var5 = client.getBoldFont().method683(var4, 4 + var3, var2 - -15, 16777215, 0, Class3_Sub13_Sub7.tooltipRandomGenerator, Class38_Sub1.randomSeed);
               Class75.method1340(4 + var3, client.getBoldFont().method682(var4) + var5, var2, 15);
            } else {
               Font var7 = var0.method868(Class3_Sub13_Sub22.aClass109Array3270, 0);
               if(null == var7) {
                  var7 = client.getBoldFont();
               }

               var7.method702(var4, var3, var2, var0.anInt168, var0.anInt193, var0.disabledColor, var0.shadow, var0.horizontalAlignment, var0.verticalAlignment, Class3_Sub13_Sub7.tooltipRandomGenerator, Class38_Sub1.randomSeed, Player.anIntArray3951);
               Class75.method1340(Player.anIntArray3951[0], Player.anIntArray3951[2], Player.anIntArray3951[1], Player.anIntArray3951[3]);
            }

         }
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "dm.D(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void method951(int var0) {
      try {
         Class3_Sub28_Sub18.errorPinging = false;
         Class3_Sub13_Sub34.anInt3413 = 0;
         AbstractGraphicsBuffer.returnCode = -3;
         Vertex.anInt820 = 0;
         Class3_Sub13_Sub25.loginStage = 1;
         Class166.anInt2079 = var0;
         Class3_Sub26.anInt2561 = -1;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "dm.G(" + var0 + ')');
      }
   }

   final void method952(int var1, Buffer var2) {
      try {
         if(var1 == -31957) {
            while(true) {
               int var3 = var2.getUByte();
               if(0 == var3) {
                  return;
               }

               this.method946(var2, var3);
            }
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "dm.L(" + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   static final IdentityKit list(int var0) {
	   IdentityKit var2 = (IdentityKit)Entity.aClass93_2792.get((long)var0);
       if (var2 != null)
      	 return var2;
       byte[] var3 = Class127.aClass153_1680.getFile(3, var0);
       var2 = new IdentityKit();
       if(null != var3) {
          var2.method952(-31957, new Buffer(var3));
       }
       Entity.aClass93_2792.put(var2, (long)var0);
       return var2;
   }

}
