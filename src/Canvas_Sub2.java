import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

final class Canvas_Sub2 extends Canvas {

   //static jString aClass94_28 = jString.createJString("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");
   static boolean aBoolean29 = false;
   static int anInt30;
   static int anInt31 = 0;
   private Component aComponent33;
   static jString aClass94_32 = jString.createJString("flash2:");
   static jString aClass94_36 = jString.createJString("flash2:");

	static final void method56(int var0) {
		InterfaceChangeNode var2 = Class3_Sub24_Sub3.putInterfaceChange(6, var0);
		var2.a();
	}

	static final boolean loadInterface(int var0) {
		if (!Hashtable.interfaceLoaded[var0]) {
			if (Class3_Sub13_Sub29.interfaceFetcher.method2117(var0)) {
				int var2 = Class3_Sub13_Sub29.interfaceFetcher.getChildCount(var0);
				if (0 == var2) {
					Hashtable.interfaceLoaded[var0] = true;
					return true;
				} else {
					if (null == SceneGraphNode.interfaceCache[var0]) {
						SceneGraphNode.interfaceCache[var0] = new jInterface[var2];
					}

					for (int var3 = 0; var3 < var2; ++var3) {
						if (null == SceneGraphNode.interfaceCache[var0][var3]) {
							byte[] var4 = Class3_Sub13_Sub29.interfaceFetcher.getFile(var0, var3);
							if (var4 != null) {
								jInterface var5 = SceneGraphNode.interfaceCache[var0][var3] = new jInterface();
								var5.uid = var3 + (var0 << 16);
								if (-1 == var4[0]) {
									var5.decodeNew(new Buffer(var4));
								} else {
									var5.decodeOld(new Buffer(var4));
								}
							}
						}
					}

					Hashtable.interfaceLoaded[var0] = true;
					return true;
				}
			} else {
				return false;
			}
		} else {
			return true;
		}
	}

   static final void method58(int var0) {
	   int var1 = 0;
       while(var1 < Js5CacheWorker.anInt997) {
          int var2 = Class21.anIntArray441[var1];
          Player var3 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var2];
          int var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
          if(0 != (0x10 & var4)) {
             var4 += SpotAnimation.aClass3_Sub30_Sub1_532.getUByte() << 8;
          }
          Class45.method1080(var4, var2, (byte)-79, var3);
          ++var1;
       }
   }

   public static void method59() {
	   //aClass94_28 = null;
	   aClass94_36 = null;
	   aClass94_32 = null;
   }

	public final void update(Graphics var1) {
		this.aComponent33.update(var1);
	}

   static final void method60(int var0, int var1, int var2, CollisionMap[] var3, int var4, byte var5, byte[] var6, int var7, int var8, int var9, boolean var10) {
      try {
         int var13;
         if(!var10) {
            for(int var12 = 0; -9 < ~var12; ++var12) {
               for(var13 = 0; 8 > var13; ++var13) {
                  if(0 < var1 - -var12 && var12 + var1 < 103 && -1 > ~(var13 + var4) && -104 < ~(var4 + var13)) {
                     var3[var2].collisionFlags[var12 + var1][var13 + var4] = ClientScript.method633(var3[var2].collisionFlags[var12 + var1][var13 + var4], -16777217);
                  }
               }
            }
         }

         if(var5 >= -91) {
            aClass94_36 = (jString)null;
         }

         byte var11;
         if(var10) {
            var11 = 1;
         } else {
            var11 = 4;
         }

         Buffer var25 = new Buffer(var6);

         int var14;
         int var15;
         for(var13 = 0; var13 < var11; ++var13) {
            for(var14 = 0; var14 < 64; ++var14) {
               for(var15 = 0; -65 < ~var15; ++var15) {
                  if(~var7 == ~var13 && var9 <= var14 && 8 + var9 > var14 && var8 <= var15 && var15 < 8 + var8) {
                     Class167.method2267(0, 0, var10, var25, Class3_Sub13_Sub29.method310(var0, (byte)-117, 7 & var14, 7 & var15) + var4, NodeSub.method519(var0, true, var15 & 7, var14 & 7) + var1, (byte)63, var0, var2);
                  } else {
                     Class167.method2267(0, 0, var10, var25, -1, -1, (byte)123, 0, 0);
                  }
               }
            }
         }

         int var17;
         int var21;
         int var20;
         int var22;
         int var29;
         while(~var25.buf.length < ~var25.pos) {
            var14 = var25.getUByte();
            if(-130 != ~var14) {
               --var25.pos;
               break;
            }

            for(var15 = 0; var15 < 4; ++var15) {
               byte var16 = var25.getByte();
               int var18;
               if(var16 != 0) {
                  if(~var16 == -2) {
                     for(var17 = 0; 64 > var17; var17 += 4) {
                        for(var18 = 0; -65 < ~var18; var18 += 4) {
                           byte var19 = var25.getByte();
                           if(~var15 >= ~var7) {
                              for(var20 = var17; ~var20 > ~(var17 + 4); ++var20) {
                                 for(var21 = var18; var21 < 4 + var18; ++var21) {
                                    if(~var20 <= ~var9 && ~var20 > ~(8 + var9) && ~var21 <= ~var8 && ~(var8 + 8) < ~var8) {
                                       var22 = var1 - -NodeSub.method519(var0, true, var21 & 7, var20 & 7);
                                       int var23 = Class3_Sub13_Sub29.method310(var0, (byte)-97, 7 & var20, var21 & 7) + var4;
                                       if(0 <= var22 && 104 > var22 && -1 >= ~var23 && ~var23 > -105) {
                                          Class136.aByteArrayArrayArray1774[var2][var22][var23] = var19;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  } else if(-3 == ~var16) {
                     ;
                  }
               } else if(var15 <= var7) {
                  var18 = 7 + var1;
                  var17 = var1;
                  var20 = var4 - -7;
                  if(-1 < ~var20) {
                     var20 = 0;
                  } else if(104 <= var20) {
                     var20 = 104;
                  }

                  if(0 <= var18) {
                     if(~var18 <= -105) {
                        var18 = 104;
                     }
                  } else {
                     var18 = 0;
                  }

                  var29 = var4;
                  if(var4 < 0) {
                     var29 = 0;
                  } else if(104 <= var4) {
                     var29 = 104;
                  }

                  if(var1 < 0) {
                     var17 = 0;
                  } else if(104 <= var1) {
                     var17 = 104;
                  }

                  while(var18 > var17) {
                     while(var29 < var20) {
                        Class136.aByteArrayArrayArray1774[var2][var17][var29] = 0;
                        ++var29;
                     }

                     ++var17;
                  }
               }
            }
         }

         boolean var27 = false;
         int var28;
         if(HDToolkit.openGLEnabled && !var10) {
            Class86 var26 = null;

            while(var25.buf.length > var25.pos) {
               var15 = var25.getUByte();
               if(var15 != 0) {
                  if(-2 != ~var15) {
                     throw new IllegalStateException();
                  }

                  var28 = var25.getUByte();
                  if(-1 > ~var28) {
                     for(var17 = 0; ~var17 > ~var28; ++var17) {
                        Light var30 = new Light(var25);
                        if(~var30.anInt705 == -32) {
                           Class57 var31 = Class57.method1401(var25.getUShort());
                           var30.method1060((byte)123, var31.anInt896, var31.anInt908, var31.anInt899, var31.anInt907);
                        }

                        var29 = var30.anInt703 >> 7;
                        var20 = var30.anInt708 >> 7;
                        if(~var7 == ~var30.anInt704 && ~var29 <= ~var9 && var9 - -8 > var29 && ~var8 >= ~var20 && ~(var8 - -8) < ~var20) {
                           var21 = Class3_Sub26.method514(var0, var30.anInt703 & 1023, (byte)-83, 1023 & var30.anInt708) + (var1 << 7);
                           var22 = Class3_Sub13_Sub25.method293(var30.anInt703 & 1023, var0, false, 1023 & var30.anInt708) + (var4 << 7);
                           var30.anInt703 = var21;
                           var30.anInt708 = var22;
                           var29 = var30.anInt703 >> 7;
                           var20 = var30.anInt708 >> 7;
                           if(var29 >= 0 && -1 >= ~var20 && 104 > var29 && var20 < 104) {
                              var30.aBoolean696 = ~(2 & Class9.aByteArrayArrayArray113[1][var29][var20]) != -1;
                              var30.anInt697 = Class44.anIntArrayArrayArray723[var30.anInt704][var29][var20] - var30.anInt697;
                              LightManager.method1264(var30);
                           }
                        }
                     }
                  }
               } else {
                  var26 = new Class86(var25);
               }
            }

            if(null == var26) {
               var26 = new Class86();
            }

            Class115.aClass86ArrayArray1581[var1 >> 3][var4 >> 3] = var26;
         }

         if(!var27) {
            var14 = 7 + var1;
            var15 = var4 - -7;

            for(var28 = var1; ~var28 > ~var14; ++var28) {
               for(var17 = var4; ~var17 > ~var15; ++var17) {
                  Class136.aByteArrayArrayArray1774[var2][var28][var17] = 0;
               }
            }
         }

      } catch (RuntimeException var24) {
         throw Class44.method1067(var24, "tm.E(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ',' + var4 + ',' + var5 + ',' + (var6 != null?"{...}":"null") + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ')');
      }
   }

	public final void paint(Graphics var1) {
		this.aComponent33.paint(var1);
	}

	Canvas_Sub2(Component var1) {
		this.aComponent33 = var1;
	}

}
