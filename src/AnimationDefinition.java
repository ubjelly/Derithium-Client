
final class AnimationDefinition {

   int anInt1845 = 2;
   boolean tween = false;
   static volatile long lastCanvasReplace = 0L;
   boolean aBoolean1848 = false;
   int anInt1849 = -1;
   int anInt1850 = -1;
   int[] frames;
   static js5 aClass153_1852;
   int anInt1854 = -1;
   boolean[] aBooleanArray1855;
   static AbstractIndexedSprite aClass109_1856;
   int anInt1857 = 5;
   boolean aBoolean1859 = false;
   static js5 aClass153_1860;
   int anInt1861 = 99;
   static int anInt1862 = 0;
   int id;
   int anInt1865 = -1;
   int anInt1866 = -1;
   int[][] anIntArrayArray1867;
   static Class25[] aClass25Array1868;
   int[] cycles;
   private int[] anIntArray1870;
   static int[] anIntArray1871 = new int[2];
   boolean aBoolean1872 = false;


   static final Class3_Sub11 method2052(Hashtable var0, UnderlayType var2) {
         long var3 = (long)((var2.anInt2095 - -1 << 16) + var2.anInt2090) + (((long)var2.anInt2100 << 56) - -((long)var2.anInt2094 << 32));

         Class3_Sub11 var5 = (Class3_Sub11)var0.get(var3);
         if(null == var5) {
            var5 = new Class3_Sub11(var2.anInt2095, (float)var2.anInt2090, true, false, var2.anInt2094);
            var0.put(var5, var3);
         }

         return var5;
   }

   final void method2053(Buffer var1, boolean new_header) {
	   while(true) {
           int var3 = var1.getUByte();
           if(var3 == 0) {
              return;
           }
           this.method2060(var3, var1, new_header);
        }
   }

   final AbstractModel method2054(int var1, int var2, int var3, AbstractModel var4, int var5, int var6) {
      try {
         int var7 = this.cycles[var2];
         var2 = this.frames[var2];
         AnimationLoader var8 = AnimationLoader.list(var2 >> 16, var1 + -19749, false);
         var2 &= '\uffff';
         if(var8 == null) {
            return var4.method1890(true, true, true);
         } else {
            var5 &= 3;
            AnimationLoader var9 = null;
            if((this.tween || Class3_Sub26.forceTweeningEnabled) && ~var3 != 0 && this.frames.length > var3) {
               var3 = this.frames[var3];
               var9 = AnimationLoader.list(var3 >> 16, 0, false);
               var3 &= '\uffff';
            }

            AbstractModel var10;
            if(var9 != null) {
               var10 = var4.method1890(!var8.method559(var2) & !var9.method559(var3), !var8.method561(var2) & !var9.method561(var3), !this.aBoolean1848);
            } else {
               var10 = var4.method1890(!var8.method559(var2), !var8.method561(var2), !this.aBoolean1848);
            }

            if(HDToolkit.openGLEnabled && this.aBoolean1848) {
               if(-2 != ~var5) {
                  if(2 != var5) {
                     if(~var5 == -4) {
                        ((HDModel)var10).method1925();
                     }
                  } else {
                     ((HDModel)var10).method1911();
                  }
               } else {
                  ((HDModel)var10).method1902();
               }
            } else if(var5 != 1) {
               if(2 != var5) {
                  if(3 == var5) {
                     var10.rotate90();
                  }
               } else {
                  var10.rotate180();
               }
            } else {
               var10.rotate270();
            }

            var10.method1880(var8, var2, var9, var3, -1 + var6, var7, this.aBoolean1848);
            if(HDToolkit.openGLEnabled && this.aBoolean1848) {
               if(1 != var5) {
                  if(var5 == 2) {
                     ((HDModel)var10).method1911();
                  } else if(var5 == 3) {
                     ((HDModel)var10).method1902();
                  }
               } else {
                  ((HDModel)var10).method1925();
               }
            } else if(~var5 != -2) {
               if(-3 != ~var5) {
                  if(var5 == 3) {
                     var10.rotate270();
                  }
               } else {
                  var10.rotate180();
               }
            } else {
               var10.rotate90();
            }

            return var10;
         }
      } catch (RuntimeException var11) {
         throw Class44.method1067(var11, "tk.D(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null?"{...}":"null") + ',' + var5 + ',' + var6 + ')');
      }
   }

   final AbstractModel method2055(AbstractModel var1, byte var2, int var3, int var4, int var5) {
      try {
         int var7 = this.frames[var5];
         int var6 = this.cycles[var5];
         AnimationLoader var8 = AnimationLoader.list(var7 >> 16, 0, false);
         var7 &= '\uffff';
         if(null == var8) {
            return var1.method1894(true, true, true);
         } else {
            AnimationLoader var9 = null;
            if((this.tween || Class3_Sub26.forceTweeningEnabled) && 0 != ~var3 && ~var3 > ~this.frames.length) {
               var3 = this.frames[var3];
               var9 = AnimationLoader.list(var3 >> 16, 0, false);
               var3 &= '\uffff';
            }

            AnimationLoader var10 = null;
            int var12 = 47 % ((var2 - 66) / 45);
            AnimationLoader var11 = null;
            int var13 = 0;
            int var14 = 0;
            if(null != this.anIntArray1870) {
               if(~this.anIntArray1870.length < ~var5) {
                  var13 = this.anIntArray1870[var5];
                  if(~var13 != -65536) {
                     var10 = AnimationLoader.list(var13 >> 16, 0, false);
                     var13 &= '\uffff';
                  }
               }

               if((this.tween || Class3_Sub26.forceTweeningEnabled) && -1 != var3 && this.anIntArray1870.length > var3) {
                  var14 = this.anIntArray1870[var3];
                  if(~var14 != -65536) {
                     var11 = AnimationLoader.list(var14 >> 16, 0, false);
                     var14 &= '\uffff';
                  }
               }
            }

            boolean var15 = !var8.method559(var7);
            boolean var16 = !var8.method561(var7);
            if(var10 != null) {
               var15 &= !var10.method559(var13);
               var16 &= !var10.method561(var13);
            }

            if(null != var9) {
               var15 &= !var9.method559(var3);
               var16 &= !var9.method561(var3);
            }

            if(null != var11) {
               var15 &= !var11.method559(var14);
               var16 &= !var11.method561(var14);
            }

            AbstractModel var17 = var1.method1894(var15, var16, !this.aBoolean1848);
            var17.method1880(var8, var7, var9, var3, var4 - 1, var6, this.aBoolean1848);
            if(null != var10) {
               var17.method1880(var10, var13, var11, var14, var4 + -1, var6, this.aBoolean1848);
            }

            return var17;
         }
      } catch (RuntimeException var18) {
         throw Class44.method1067(var18, "tk.E(" + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   final AbstractModel method2056(int var1, int var2, int var3, int var4, AbstractModel var5, int var6) {
      try {
         int var7 = this.cycles[var2];
         var2 = this.frames[var2];
         AnimationLoader var8 = AnimationLoader.list(var2 >> 16, var6 + -3, false);
         var2 &= '\uffff';
         if(null == var8) {
            return var5.method1894(true, true, true);
         } else {
            var4 &= var6;
            AnimationLoader var9 = null;
            if((this.tween || Class3_Sub26.forceTweeningEnabled) && ~var1 != 0 && ~var1 > ~this.frames.length) {
               var1 = this.frames[var1];
               var9 = AnimationLoader.list(var1 >> 16, var6 + -3, false);
               var1 &= '\uffff';
            }

            AbstractModel var10;
            if(null == var9) {
               var10 = var5.method1894(!var8.method559(var2), !var8.method561(var2), !this.aBoolean1848);
            } else {
               var10 = var5.method1894(!var8.method559(var2) & !var9.method559(var1), !var8.method561(var2) & !var9.method561(var1), !this.aBoolean1848);
            }

            if(this.aBoolean1848 && HDToolkit.openGLEnabled) {
               if(1 != var4) {
                  if(-3 == ~var4) {
                     ((HDModel)var10).method1911();
                  } else if(-4 == ~var4) {
                     ((HDModel)var10).method1925();
                  }
               } else {
                  ((HDModel)var10).method1902();
               }
            } else if(var4 == 1) {
               var10.rotate270();
            } else if(var4 == 2) {
               var10.rotate180();
            } else if(var4 == 3) {
               var10.rotate90();
            }

            var10.method1880(var8, var2, var9, var1, var3 + -1, var7, this.aBoolean1848);
            if(this.aBoolean1848 && HDToolkit.openGLEnabled) {
               if(~var4 == -2) {
                  ((HDModel)var10).method1925();
               } else if(-3 == ~var4) {
                  ((HDModel)var10).method1911();
               } else if(~var4 == -4) {
                  ((HDModel)var10).method1902();
               }
            } else if(1 != var4) {
               if(var4 == 2) {
                  var10.rotate180();
               } else if(3 == var4) {
                  var10.rotate270();
               }
            } else {
               var10.rotate90();
            }

            return var10;
         }
      } catch (RuntimeException var11) {
         throw Class44.method1067(var11, "tk.B(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null?"{...}":"null") + ',' + var6 + ')');
      }
   }

   public static void method2057(byte var0) {
      try {
         aClass25Array1868 = null;
         aClass109_1856 = null;
         aClass153_1860 = null;
         aClass153_1852 = null;
         if(var0 != -108) {
            aClass153_1852 = (js5)null;
         }

         anIntArray1871 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "tk.F(" + var0 + ')');
      }
   }

   final void postDecode() {
	   if(-1 == this.anInt1866) {
		   if(null == this.aBooleanArray1855) {
			   this.anInt1866 = 0;
		   } else {
			   this.anInt1866 = 2;
		   }
	   }
	   
	   if(-1 == this.anInt1850) {
		   if(null != this.aBooleanArray1855) {
			   this.anInt1850 = 2;
		   } else {
			   this.anInt1850 = 0;
		   }
	   }
   }

   final AbstractModel method2059(AbstractModel var5, int nextFrame, int cycle, int frame) {
	   int time = this.cycles[frame];
	   frame = this.frames[frame];
	   AnimationLoader var7 = AnimationLoader.list(frame >> 16, 0, false);
	   frame &= '\uffff';
	   if(var7 == null) {
		   return var5.method1882(true, true, true);
	   } else {
		   AnimationLoader var9 = null;
		   if((this.tween || Class3_Sub26.forceTweeningEnabled) && ~nextFrame != 0 && ~this.frames.length < ~nextFrame) {
			   nextFrame = this.frames[nextFrame];
			   var9 = AnimationLoader.list(nextFrame >> 16, 0, false);
			   nextFrame &= '\uffff';
		   }

		   AbstractModel var10;
		   if(null == var9) {
			   var10 = var5.method1882(!var7.method559(frame), !var7.method561(frame), !this.aBoolean1848);
		   } else {
			   var10 = var5.method1882(!var7.method559(frame) & !var9.method559(nextFrame), !var7.method561(frame) & !var9.method561(nextFrame), !this.aBoolean1848);
		   }
		   
		   var10.method1880(var7, frame, var9, nextFrame, cycle + -1, time, this.aBoolean1848);
		   return var10;
	   }
   }

   private final void method2060(int arg0, Buffer arg2, boolean new_header) {
	   if (arg0 == 1) {
			int frameCount = arg2.getUShort();
			cycles = new int[frameCount];
			for (int i_23_ = 0; i_23_ < frameCount; i_23_++)
				cycles[i_23_] = arg2.getUShort();
			frames = new int[frameCount];
			for (int i_24_ = 0; frameCount > i_24_; i_24_++)
				frames[i_24_] = arg2.getUShort();
			for (int i_25_ = 0; frameCount > i_25_; i_25_++)
				frames[i_25_] = ((arg2.getUShort() << 96142256) + frames[i_25_]);
		} else if ((arg0 ^ 0xffffffff) == -3)
			anInt1865 = arg2.getUShort();
		else if (arg0 == 3) {
			this.aBooleanArray1855 = new boolean[256];
			int len = arg2.getUByte();
			for (int var5 = 0; var5 < len; ++var5) {
				this.aBooleanArray1855[arg2.getUByte()] = true;
			}
		} else if ((arg0 ^ 0xffffffff) == -5)
			aBoolean1859 = true;
		else if ((arg0 ^ 0xffffffff) != -6) {
			if (arg0 == 6)
				anInt1854 = arg2.getUShort();
			else if ((arg0 ^ 0xffffffff) == -8)
				anInt1849 = arg2.getUShort();
			else if ((arg0 ^ 0xffffffff) != -9) {
				if (arg0 == 9)
					anInt1866 = arg2.getUByte();
				else if (arg0 != 10) {
					if ((arg0 ^ 0xffffffff) == -12)
						anInt1845 = arg2.getUByte();
					else if (arg0 == 12) {
						int len = arg2.getUByte();
						this.anIntArray1870 = new int[len];
						for (int var5 = 0; ~len < ~var5; ++var5) {
							this.anIntArray1870[var5] = arg2.getUShort();
						}
						for (int var5 = 0; ~len < ~var5; ++var5) {
							this.anIntArray1870[var5] += arg2.getUShort() << 16;
						}
					} else if ((arg0 ^ 0xffffffff) == -14) {
						if (client.clientLoad != 464 || new_header) {
							int var4 = arg2.getUShort();
							anIntArrayArray1867 = new int[var4][];
							for (int var5 = 0; ~var4 < ~var5; ++var5) {
								int var6 = arg2.getUByte();
								if (var6 > 0) {
									anIntArrayArray1867[var5] = new int[var6];
									anIntArrayArray1867[var5][0] = arg2.getMidInt();
									for (int var7 = 1; ~var6 < ~var7; ++var7) {
										anIntArrayArray1867[var5][var7] = arg2.getUShort();
									}
								}
							}
						} else {
							int len = arg2.getUByte();
				          	 int[] anIntArray3199 = new int[len];
				          	 for (int i_29_ = 0; len > i_29_; i_29_++)
				          		 anIntArray3199[i_29_] = arg2.getMidInt();
						}
					} else if (arg0 == 14) {
						aBoolean1848 = true;
					} else if (15 == arg0) {
						tween = true;
					} else if (16 == arg0) {
						aBoolean1872 = true;
					} else if (17 == arg0 && client.clientLoad != 666) {
						if (client.clientLoad >= 602 || new_header) {
							arg2.getUByte();
						}
					} else if (arg0 == 18) {
						boolean aBoolean409 = true;
					} else if (arg0 == 19) {
						int[] anIntArray416 = null;
						if (anIntArray416 == null) {
							anIntArray416 = (new int[anIntArrayArray1867.length]);
							for (int i_15_ = 0; (i_15_ < anIntArrayArray1867.length); i_15_++)
								anIntArray416[i_15_] = 255;
						}
						anIntArray416[arg2.getUByte()] = arg2.getUByte();
					} else if (arg0 == 20) {
						int[] anIntArray415 = null;
						int[] anIntArray400 = null;
						if (anIntArray415 == null || anIntArray400 == null) {
							anIntArray415 = (new int[anIntArrayArray1867.length]);
							anIntArray400 = (new int[anIntArrayArray1867.length]);
							for (int i_16_ = 0; (anIntArrayArray1867.length > i_16_); i_16_++) {
								anIntArray415[i_16_] = 256;
								anIntArray400[i_16_] = 256;
							}
						}
						int i_17_ = arg2.getUByte();
						anIntArray415[i_17_] = arg2.getUShort();
						anIntArray400[i_17_] = arg2.getUShort();
					}
				} else
					anInt1850 = arg2.getUByte();
			} else
				anInt1861 = arg2.getUByte();
		} else
			anInt1857 = arg2.getUByte();
   }

   static final AnimationDefinition list(int var0, boolean forcenew) {
	   AnimationDefinition var2 = (AnimationDefinition)Class82.aClass93_1146.get((long)var0);
	   if (var2 != null)
		   return var2;
	   int anim_config = client.getAnimationConfig(var0);
	   byte[] data = aClass153_1860.getFile(anim_config, var0);
	   boolean new_header = false;
	   if (client.clientLoad < 602 || forcenew) {
		   if(data == null) {
		   //new_header = var0 > aClass153_1860.getChildCount(anim_config);
		   //if (new_header) {
				data = aClass153_1860.getFile(33, var0);
				//}
				new_header = true;
		   }
	   } else {
		   new_header = true;
		}
	   var2 = new AnimationDefinition();
	   var2.id = var0;
	   if(data != null) {
		   var2.method2053(new Buffer(data), new_header);
	   }
	   var2.postDecode();
	   Class82.aClass93_1146.put(var2, (long)var0);
	   return var2;
   }

static final void method2061(boolean var0) {
      try {
         Class3_Sub26.anInt2556 = 0;
         Entity.aBoolean2774 = true;
         AbstractIndexedSprite.aLong1465 = 0L;
         DisplayModeInformation.aClass67_1443.anInt1018 = 0;
         Class3_Sub13_Sub6.focus = true;
         Class3_Sub13.method153(112);
         IdentityKit.anInt469 = -1;
         Class7.anInt2166 = -1;
         jString.anInt2147 = -1;
         Class159.logoutCycle = 0;
         Class38_Sub1.systemUpdateCycle = 0;
         Class3_Sub13_Sub1.outputStream.pos = 0;
         StringNode.anInt2582 = -1;
         AbstractSprite.timoutCycle = 0;
         SpotAnimation.aClass3_Sub30_Sub1_532.pos = 0;

         int var1;
         for(var1 = 0; ~var1 > ~RuntimeException_Sub1.aClass96Array2114.length; ++var1) {
            RuntimeException_Sub1.aClass96Array2114[var1] = null;
         }

         Class3_Sub13_Sub34.anInt3415 = 0;
         Class38_Sub1.aBoolean2615 = false;
         Class23.method940(119, 0);

         for(var1 = 0; -101 < ~var1; ++var1) {
            StringNode.chatMessages[var1] = null;
         }

         Class164_Sub1.anInt3012 = 0;
         Class3_Sub13_Sub18.anInt3216 = (int)(Math.random() * 100.0D) + -50;
         Class45.mapFlagY = 0;
         SpotAnimation.cameraYaw = 2047 & (int)(Math.random() * 20.0D) - 10;
         Class58.anInt909 = -1;
         Class159.anInt2022 = 0;
         Class161.anInt2028 = 0;
         InputStream_Sub1.anInt42 = (int)(110.0D * Math.random()) + -55;
         SceneGraphNode.aBoolean1837 = false;
         Class164_Sub2.anInt3020 = -20 + (int)(30.0D * Math.random());
         Class113.anInt1552 = 0;
         Class65.mapFlagX = 0;
         Class3_Sub13_Sub8.anInt3102 = -60 + (int)(Math.random() * 120.0D);
         Class3_Sub13_Sub9.anInt3114 = 0;
         StringNode.anInt2589 = (int)(80.0D * Math.random()) - 40;
         Class163.anInt2046 = 0;

         for(var1 = 0; 2048 > var1; ++var1) {
            Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var1] = null;
            Class65.aClass3_Sub30Array986[var1] = null;
         }

         for(var1 = 0; var1 < '\u8000'; ++var1) {
            Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var1] = null;
         }

         TextureLoader.selfPlayer = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[2047] = new Player();
         Class3_Sub13_Sub30.aClass61_3364.clear();
         Class3_Sub13_Sub15.aClass61_3177.clear();
         if(null != Class3_Sub13_Sub22.aClass61ArrayArrayArray3273) {
            for(var1 = 0; 4 > var1; ++var1) {
               for(int var2 = 0; ~var2 > -105; ++var2) {
                  for(int var3 = 0; ~var3 > -105; ++var3) {
                     Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[var1][var2][var3] = null;
                  }
               }
            }
         }

         Class3_Sub13_Sub6.aClass61_3075 = new Deque();
         HintIcon.anInt1357 = 0;
         Class8.anInt104 = 0;
         Class3_Sub13_Sub2.resetVarp();
         GroundTile.method103();
         Class75.anInt1105 = 0;
         Class163_Sub2_Sub1.anInt4014 = 0;
         Class157.anInt1996 = 0;
         Class3_Sub13_Sub34.anInt3414 = 0;
         AbstractMouseWheel.anInt1904 = 0;
         Canvas_Sub2.anInt30 = 0;
         SpotAnimation.anInt529 = 0;
         MouseHandler.anInt1923 = 0;
         Class3_Sub28_Sub10.anInt3631 = 0;
         Class163_Sub2_Sub1.anInt4021 = 0;

         for(var1 = 0; ~NpcDefinition.anIntArray1277.length < ~var1; ++var1) {
            NpcDefinition.anIntArray1277[var1] = -1;
         }

         if(InvType.mainScreenInterface != -1) {
            Class60.discardInterface(InvType.mainScreenInterface);
         }

         for(OverridedInterface var7 = (OverridedInterface)Class3_Sub13_Sub17.aClass130_3208.getFirst(); var7 != null; var7 = (OverridedInterface)Class3_Sub13_Sub17.aClass130_3208.getNext()) {
            Class3_Sub13_Sub18.removeOverrideInterface(var7, true);
         }

         InvType.mainScreenInterface = -1;
         Class3_Sub13_Sub17.aClass130_3208 = new Hashtable(8);
         LongNode.method122();
         Class3_Sub13_Sub7.aClass11_3087 = null;
         Class38_Sub1.aBoolean2615 = false;
         Class3_Sub13_Sub34.anInt3415 = 0;
         Class77.aClass52_1112.setAppearance(new int[]{0, 0, 0, 0, 0}, -1, false, (int[])null);

         for(var1 = 0; 8 > var1; ++var1) {
            CollisionMap.aClass94Array1299[var1] = null;
            Class1.aBooleanArray54[var1] = false;
            Class3_Sub13_Sub26.anIntArray3328[var1] = -1;
         }

         Class3_Sub28_Sub9.method580((byte)80);
         Class3_Sub13_Sub4.aBoolean3064 = true;

         for(var1 = 0; var1 < 100; ++var1) {
            GroundItem.aBooleanArray3674[var1] = true;
         }

         NodeSub.anInt2572 = 0;
         ClientScript.clanMembers = null;
         jInterface.aClass94_251 = null;

         for(var1 = 0; 6 > var1; ++var1) {
            Class3_Sub13_Sub33.aClass133Array3393[var1] = new GrandExchangeItem();
         }

         for(var1 = 0; -26 < ~var1; ++var1) {
            Class3_Sub13_Sub15.currentStats[var1] = 0;
            Class3_Sub20.maxStats[var1] = 0;
            GrandExchangeItem.currentExp[var1] = 0;
         }

         if(HDToolkit.openGLEnabled) {
            Class3_Sub13_Sub14.method236((byte)64);
         }

         BufferedRequest.aBoolean4068 = var0;
         Class3_Sub13_Sub28.aClass94_3353 = Class56.aClass94_891;
         Class65943149.aBoolean1084 = false;
         Class3_Sub13_Sub38.aShortArray3455 = Class3_Sub13_Sub9.aShortArray3110 = Class136.aShortArray1779 = Class3_Sub13_Sub38.aShortArray3453 = new short[256];
         Class3_Sub13.method165(-7878);
         js5.aBoolean1951 = false;
         //Class3_Sub13_Sub8.method204();
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "tk.A(" + var0 + ')');
      }
   }

}
