
final class UnderlayType {

   static jString aClass94_2089 = jString.createJString("compass");
   int anInt2090 = 128;
   static jInterface aClass11_2091 = null;
   boolean aBoolean2092 = false;
   boolean aBoolean2093 = true;
   int anInt2094 = 1190717;
   int anInt2095 = -1;
   static js5 aClass153_2097;
   int anInt2098 = -1;
   static int anInt2099 = 0;
   int anInt2100 = 8;
   int anInt2101 = 16;
   boolean aBoolean2102 = true;
   int anInt2103 = 0;
   static int anInt2104;


   static final void method2270(Entity var0, byte var1) {
      try {
         if(Class44.loopCycle == var0.anInt2790 || ~var0.currentAnimationId == 0 || var0.animationDelay != 0 || ~(1 + var0.anInt2760) < ~AnimationDefinition.list(var0.currentAnimationId, false).cycles[var0.anInt2832]) {
            int var2 = var0.anInt2790 + -var0.anInt2800;
            int var3 = Class44.loopCycle + -var0.anInt2800;
            int var4 = var0.anInt2784 * 128 + 64 * var0.getSize();
            int var5 = var0.anInt2835 * 128 - -(var0.getSize() * 64);
            int var6 = 128 * var0.anInt2823 + var0.getSize() * 64;
            int var7 = 128 * var0.anInt2798 + var0.getSize() * 64;
            var0.anInt2819 = (var3 * var6 + var4 * (var2 - var3)) / var2;
            var0.anInt2829 = (var7 * var3 + var5 * (var2 - var3)) / var2;
         }

         if(var1 <= -51) {
            var0.anInt2824 = 0;
            if(-1 == ~var0.anInt2840) {
               var0.turnDirection = 1024;
            }

            if(1 == var0.anInt2840) {
               var0.turnDirection = 1536;
            }

            if(-3 == ~var0.anInt2840) {
               var0.turnDirection = 0;
            }

            if(var0.anInt2840 == 3) {
               var0.turnDirection = 512;
            }

            var0.directionDegrees = var0.turnDirection;
         }
      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "wl.K(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   static final void method2271(int var0, int var1, int var3) {
	   InterfaceChangeNode var4 = Class3_Sub24_Sub3.putInterfaceChange(11, var1);
	   var4.add();
	   var4.intValue2 = var3;
	   var4.intValue = var0;
   }

   static final void method2272(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, byte var10) {
      try {
         int var11 = var2;
         if(~GraphicsLD.endX < ~var2) {
            if(~var2 > ~GraphicsLD.startX) {
               var11 = GraphicsLD.startX;
            }

            int var12 = var7 + var2;
            if(GraphicsLD.startX < var12) {
               if(GraphicsLD.endX < var12) {
                  var12 = GraphicsLD.endX;
               }

               int var13 = var8;
               if(~GraphicsLD.endY < ~var8) {
                  int var14 = var8 + var6;
                  if(~var8 > ~GraphicsLD.startY) {
                     var13 = GraphicsLD.startY;
                  }

                  if(var14 > GraphicsLD.startY) {
                     if(var10 == 21) {
                        int var15 = var11 + GraphicsLD.width * var13;
                        if(-10 == ~var5) {
                           var3 = 3 & var3 - -1;
                           var5 = 1;
                        }

                        int var16 = -var12 + var11 + GraphicsLD.width;
                        var13 -= var8;
                        int var20 = var6 + -var13;
                        if(GraphicsLD.endY < var14) {
                           var14 = GraphicsLD.endY;
                        }

                        if(~var5 == -11) {
                           var3 = var3 - -3 & 3;
                           var5 = 1;
                        }

                        var11 -= var2;
                        int var18 = -var11 + var7;
                        if(11 == var5) {
                           var3 = 3 & var3 + 3;
                           var5 = 8;
                        }

                        var12 -= var2;
                        int var17 = var7 + -var12;
                        var14 -= var8;
                        int var19 = var6 - var14;
                        int var21;
                        int var22;
                        if(-2 != ~var5) {
                           if(2 == var5) {
                              if(-1 != ~var3) {
                                 if(1 == var3) {
                                    for(var21 = var13; ~var21 > ~var14; ++var21) {
                                       for(var22 = var11; ~var12 < ~var22; ++var22) {
                                          if(0 <= var15 && ~var15 > ~var0.length) {
                                             if(~(var21 << 1) >= ~var22) {
                                                var0[var15] = var1;
                                             } else if(var9) {
                                                var0[var15] = var4;
                                             }

                                             ++var15;
                                          } else {
                                             ++var15;
                                          }
                                       }

                                       var15 += var16;
                                    }

                                 } else if(var3 != 2) {
                                    if(3 == var3) {
                                       for(var21 = var20 + -1; var19 <= var21; --var21) {
                                          for(var22 = -1 + var18; var17 <= var22; --var22) {
                                             if(var21 << 1 > var22) {
                                                if(var9) {
                                                   var0[var15] = var4;
                                                }
                                             } else {
                                                var0[var15] = var1;
                                             }

                                             ++var15;
                                          }

                                          var15 += var16;
                                       }

                                    }
                                 } else {
                                    for(var21 = var13; ~var14 < ~var21; ++var21) {
                                       for(var22 = var18 + -1; var17 <= var22; --var22) {
                                          if(var21 >> 1 >= var22) {
                                             var0[var15] = var1;
                                          } else if(var9) {
                                             var0[var15] = var4;
                                          }

                                          ++var15;
                                       }

                                       var15 += var16;
                                    }

                                 }
                              } else {
                                 for(var21 = var20 + -1; var19 <= var21; --var21) {
                                    for(var22 = var11; ~var22 > ~var12; ++var22) {
                                       if(~(var21 >> 1) <= ~var22) {
                                          var0[var15] = var1;
                                       } else if(var9) {
                                          var0[var15] = var4;
                                       }

                                       ++var15;
                                    }

                                    var15 += var16;
                                 }

                              }
                           } else if(~var5 != -4) {
                              if(~var5 != -5) {
                                 if(var5 != 5) {
                                    if(~var5 == -7) {
                                       if(~var3 == -1) {
                                          for(var21 = var13; var14 > var21; ++var21) {
                                             for(var22 = var11; var12 > var22; ++var22) {
                                                if(var22 > var7 / 2) {
                                                   if(var9) {
                                                      var0[var15] = var4;
                                                   }
                                                } else {
                                                   var0[var15] = var1;
                                                }

                                                ++var15;
                                             }

                                             var15 += var16;
                                          }

                                          return;
                                       }

                                       if(~var3 == -2) {
                                          for(var21 = var13; ~var21 > ~var14; ++var21) {
                                             for(var22 = var11; var12 > var22; ++var22) {
                                                if(var21 > var6 / 2) {
                                                   if(var9) {
                                                      var0[var15] = var4;
                                                   }
                                                } else {
                                                   var0[var15] = var1;
                                                }

                                                ++var15;
                                             }

                                             var15 += var16;
                                          }

                                          return;
                                       }

                                       if(2 == var3) {
                                          for(var21 = var13; ~var21 > ~var14; ++var21) {
                                             for(var22 = var11; ~var12 < ~var22; ++var22) {
                                                if(var22 >= var7 / 2) {
                                                   var0[var15] = var1;
                                                } else if(var9) {
                                                   var0[var15] = var4;
                                                }

                                                ++var15;
                                             }

                                             var15 += var16;
                                          }

                                          return;
                                       }

                                       if(~var3 == -4) {
                                          for(var21 = var13; ~var21 > ~var14; ++var21) {
                                             for(var22 = var11; ~var22 > ~var12; ++var22) {
                                                if(~var21 > ~(var6 / 2)) {
                                                   if(var9) {
                                                      var0[var15] = var4;
                                                   }
                                                } else {
                                                   var0[var15] = var1;
                                                }

                                                ++var15;
                                             }

                                             var15 += var16;
                                          }

                                          return;
                                       }
                                    }

                                    if(7 == var5) {
                                       if(0 == var3) {
                                          for(var21 = var13; ~var14 < ~var21; ++var21) {
                                             for(var22 = var11; ~var12 < ~var22; ++var22) {
                                                if(var22 <= var21 + -(var6 / 2)) {
                                                   var0[var15] = var1;
                                                } else if(var9) {
                                                   var0[var15] = var4;
                                                }

                                                ++var15;
                                             }

                                             var15 += var16;
                                          }

                                          return;
                                       }

                                       if(var3 == 1) {
                                          for(var21 = var20 + -1; var21 >= var19; --var21) {
                                             for(var22 = var11; var12 > var22; ++var22) {
                                                if(~(-(var6 / 2) + var21) > ~var22) {
                                                   if(var9) {
                                                      var0[var15] = var4;
                                                   }
                                                } else {
                                                   var0[var15] = var1;
                                                }

                                                ++var15;
                                             }

                                             var15 += var16;
                                          }

                                          return;
                                       }

                                       if(~var3 == -3) {
                                          for(var21 = var20 + -1; ~var19 >= ~var21; --var21) {
                                             for(var22 = -1 + var18; ~var17 >= ~var22; --var22) {
                                                if(var22 > var21 + -(var6 / 2)) {
                                                   if(var9) {
                                                      var0[var15] = var4;
                                                   }
                                                } else {
                                                   var0[var15] = var1;
                                                }

                                                ++var15;
                                             }

                                             var15 += var16;
                                          }

                                          return;
                                       }

                                       if(3 == var3) {
                                          for(var21 = var13; ~var21 > ~var14; ++var21) {
                                             for(var22 = -1 + var18; ~var22 <= ~var17; --var22) {
                                                if(var21 + -(var6 / 2) >= var22) {
                                                   var0[var15] = var1;
                                                } else if(var9) {
                                                   var0[var15] = var4;
                                                }

                                                ++var15;
                                             }

                                             var15 += var16;
                                          }

                                          return;
                                       }
                                    }

                                    if(~var5 == -9) {
                                       if(0 == var3) {
                                          for(var21 = var13; var14 > var21; ++var21) {
                                             for(var22 = var11; ~var12 < ~var22; ++var22) {
                                                if(-(var6 / 2) + var21 <= var22) {
                                                   var0[var15] = var1;
                                                } else if(var9) {
                                                   var0[var15] = var4;
                                                }

                                                ++var15;
                                             }

                                             var15 += var16;
                                          }

                                          return;
                                       }

                                       if(var3 == 1) {
                                          for(var21 = -1 + var20; var21 >= var19; --var21) {
                                             for(var22 = var11; ~var12 < ~var22; ++var22) {
                                                if(-(var6 / 2) + var21 > var22) {
                                                   if(var9) {
                                                      var0[var15] = var4;
                                                   }
                                                } else {
                                                   var0[var15] = var1;
                                                }

                                                ++var15;
                                             }

                                             var15 += var16;
                                          }

                                          return;
                                       }

                                       if(var3 == 2) {
                                          for(var21 = var20 - 1; ~var21 <= ~var19; --var21) {
                                             for(var22 = -1 + var18; ~var17 >= ~var22; --var22) {
                                                if(~var22 > ~(var21 - var6 / 2)) {
                                                   if(var9) {
                                                      var0[var15] = var4;
                                                   }
                                                } else {
                                                   var0[var15] = var1;
                                                }

                                                ++var15;
                                             }

                                             var15 += var16;
                                          }

                                          return;
                                       }

                                       if(~var3 == -4) {
                                          for(var21 = var13; ~var14 < ~var21; ++var21) {
                                             for(var22 = -1 + var18; ~var22 <= ~var17; --var22) {
                                                if(var21 + -(var6 / 2) > var22) {
                                                   if(var9) {
                                                      var0[var15] = var4;
                                                   }
                                                } else {
                                                   var0[var15] = var1;
                                                }

                                                ++var15;
                                             }

                                             var15 += var16;
                                          }

                                          return;
                                       }
                                    }

                                 } else if(0 == var3) {
                                    for(var21 = var20 + -1; var21 >= var19; --var21) {
                                       for(var22 = -1 + var18; ~var17 >= ~var22; --var22) {
                                          if(var21 >> 1 <= var22) {
                                             var0[var15] = var1;
                                          } else if(var9) {
                                             var0[var15] = var4;
                                          }

                                          ++var15;
                                       }

                                       var15 += var16;
                                    }

                                 } else if(1 == var3) {
                                    for(var21 = -1 + var20; ~var19 >= ~var21; --var21) {
                                       for(var22 = var11; var22 < var12; ++var22) {
                                          if(var22 > var21 << 1) {
                                             if(var9) {
                                                var0[var15] = var4;
                                             }
                                          } else {
                                             var0[var15] = var1;
                                          }

                                          ++var15;
                                       }

                                       var15 += var16;
                                    }

                                 } else if(~var3 != -3) {
                                    if(~var3 == -4) {
                                       for(var21 = var13; ~var14 < ~var21; ++var21) {
                                          for(var22 = var18 + -1; var17 <= var22; --var22) {
                                             if(var21 << 1 >= var22) {
                                                var0[var15] = var1;
                                             } else if(var9) {
                                                var0[var15] = var4;
                                             }

                                             ++var15;
                                          }

                                          var15 += var16;
                                       }

                                    }
                                 } else {
                                    for(var21 = var13; var14 > var21; ++var21) {
                                       for(var22 = var11; ~var12 < ~var22; ++var22) {
                                          if(~var22 > ~(var21 >> 1)) {
                                             if(var9) {
                                                var0[var15] = var4;
                                             }
                                          } else {
                                             var0[var15] = var1;
                                          }

                                          ++var15;
                                       }

                                       var15 += var16;
                                    }

                                 }
                              } else if(~var3 != -1) {
                                 if(1 == var3) {
                                    for(var21 = var13; var21 < var14; ++var21) {
                                       for(var22 = var11; var22 < var12; ++var22) {
                                          if(~(var21 << 1) <= ~var22) {
                                             var0[var15] = var1;
                                          } else if(var9) {
                                             var0[var15] = var4;
                                          }

                                          ++var15;
                                       }

                                       var15 += var16;
                                    }

                                 } else if(2 == var3) {
                                    for(var21 = var13; var21 < var14; ++var21) {
                                       for(var22 = var18 + -1; ~var17 >= ~var22; --var22) {
                                          if(~var22 <= ~(var21 >> 1)) {
                                             var0[var15] = var1;
                                          } else if(var9) {
                                             var0[var15] = var4;
                                          }

                                          ++var15;
                                       }

                                       var15 += var16;
                                    }

                                 } else if(var3 == 3) {
                                    for(var21 = -1 + var20; ~var19 >= ~var21; --var21) {
                                       for(var22 = -1 + var18; ~var17 >= ~var22; --var22) {
                                          if(var22 <= var21 << 1) {
                                             var0[var15] = var1;
                                          } else if(var9) {
                                             var0[var15] = var4;
                                          }

                                          ++var15;
                                       }

                                       var15 += var16;
                                    }

                                 }
                              } else {
                                 for(var21 = var20 + -1; ~var19 >= ~var21; --var21) {
                                    for(var22 = var11; ~var22 > ~var12; ++var22) {
                                       if(~(var21 >> 1) < ~var22) {
                                          if(var9) {
                                             var0[var15] = var4;
                                          }
                                       } else {
                                          var0[var15] = var1;
                                       }

                                       ++var15;
                                    }

                                    var15 += var16;
                                 }

                              }
                           } else if(-1 == ~var3) {
                              for(var21 = var20 - 1; ~var19 >= ~var21; --var21) {
                                 for(var22 = -1 + var18; var17 <= var22; --var22) {
                                    if(~(var21 >> 1) <= ~var22) {
                                       var0[var15] = var1;
                                    } else if(var9) {
                                       var0[var15] = var4;
                                    }

                                    ++var15;
                                 }

                                 var15 += var16;
                              }

                           } else if(~var3 == -2) {
                              for(var21 = -1 + var20; ~var21 <= ~var19; --var21) {
                                 for(var22 = var11; ~var22 > ~var12; ++var22) {
                                    if(var22 >= var21 << 1) {
                                       var0[var15] = var1;
                                    } else if(var9) {
                                       var0[var15] = var4;
                                    }

                                    ++var15;
                                 }

                                 var15 += var16;
                              }

                           } else if(2 == var3) {
                              for(var21 = var13; ~var14 < ~var21; ++var21) {
                                 for(var22 = var11; ~var22 > ~var12; ++var22) {
                                    if(~var22 >= ~(var21 >> 1)) {
                                       var0[var15] = var1;
                                    } else if(var9) {
                                       var0[var15] = var4;
                                    }

                                    ++var15;
                                 }

                                 var15 += var16;
                              }

                           } else if(3 == var3) {
                              for(var21 = var13; ~var14 < ~var21; ++var21) {
                                 for(var22 = var18 - 1; ~var22 <= ~var17; --var22) {
                                    if(~(var21 << 1) < ~var22) {
                                       if(var9) {
                                          var0[var15] = var4;
                                       }
                                    } else {
                                       var0[var15] = var1;
                                    }

                                    ++var15;
                                 }

                                 var15 += var16;
                              }

                           }
                        } else if(var3 == 0) {
                           for(var21 = var13; ~var14 < ~var21; ++var21) {
                              for(var22 = var11; ~var12 < ~var22; ++var22) {
                                 if(~var22 >= ~var21) {
                                    var0[var15] = var1;
                                 } else if(var9) {
                                    var0[var15] = var4;
                                 }

                                 ++var15;
                              }

                              var15 += var16;
                           }

                        } else if(1 != var3) {
                           if(2 != var3) {
                              if(-4 == ~var3) {
                                 for(var21 = var20 + -1; var19 <= var21; --var21) {
                                    for(var22 = var11; ~var22 > ~var12; ++var22) {
                                       if(var22 < var21) {
                                          if(var9) {
                                             var0[var15] = var4;
                                          }
                                       } else {
                                          var0[var15] = var1;
                                       }

                                       ++var15;
                                    }

                                    var15 += var16;
                                 }

                              }
                           } else {
                              for(var21 = var13; var21 < var14; ++var21) {
                                 for(var22 = var11; var12 > var22; ++var22) {
                                    if(var22 >= var21) {
                                       var0[var15] = var1;
                                    } else if(var9) {
                                       var0[var15] = var4;
                                    }

                                    ++var15;
                                 }

                                 var15 += var16;
                              }

                           }
                        } else {
                           for(var21 = var20 + -1; var21 >= var19; --var21) {
                              for(var22 = var11; ~var12 < ~var22; ++var22) {
                                 if(var21 >= var22) {
                                    var0[var15] = var1;
                                 } else if(var9) {
                                    var0[var15] = var4;
                                 }

                                 ++var15;
                              }

                              var15 += var16;
                           }

                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var23) {
         throw Class44.method1067(var23, "wl.C(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ')');
      }
   }

   static final jInterface method2273(jInterface var0) {
		if (var0.parent == -1) {
			int var3 = var0.uid >>> 16;
			Class80 var4 = new Class80(Class3_Sub13_Sub17.aClass130_3208);

			for (OverridedInterface var2 = (OverridedInterface) var4.getFirst(); null != var2; var2 = (OverridedInterface) var4.getNext()) {
				if (~var3 == ~var2.uid) {
					return Class7.getInterface((int) var2.hash);
				}
			}

			return null;
		} else {
			return Class7.getInterface(var0.parent);
		}
   }

	final void decode(Buffer buffer, int id) {
		while (true) {
			int var4 = buffer.getUByte();
			if (var4 == 0) {
				return;
			}

			this.decode(buffer, var4, id);
		}
	}

   static final void method2275(int var0, byte var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         if(var1 <= 68) {
            method2273((jInterface)null);
         }

         int var8 = -var5 + var3;
         MouseHandler.method2091(var3, 4);
         int var7 = 0;
         if(~var8 > -1) {
            var8 = 0;
         }

         int var9 = var3;
         int var10 = -var3;
         int var12 = -var8;
         int var11 = var8;
         int var13 = -1;
         int var17;
         int var16;
         int var19;
         int var18;
         if(var2 >= Class159.anInt2020 && Class57.anInt902 >= var2) {
            int[] var15 = Class38.anIntArrayArray663[var2];
            var16 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, -var3 + var6, (byte)0, Class101.anInt1425);
            var17 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var3 + var6, (byte)0, Class101.anInt1425);
            var18 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var6 + -var8, (byte)0, Class101.anInt1425);
            var19 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var6 - -var8, (byte)0, Class101.anInt1425);
            Class3_Sub13_Sub23_Sub1.method282(var15, var16, var18, var4);
            Class3_Sub13_Sub23_Sub1.method282(var15, var18, var19, var0);
            Class3_Sub13_Sub23_Sub1.method282(var15, var19, var17, var4);
         }

         int var14 = -1;

         while(~var7 > ~var9) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if(-1 >= ~var12 && ~var11 <= -2) {
               --var11;
               SceneGraphNode.anIntArray1838[var11] = var7;
               var12 -= var11 << 1;
            }

            ++var7;
            int var21;
            int var20;
            int[] var22;
            int var24;
            if(0 <= var10) {
               --var9;
               var10 -= var9 << 1;
               var24 = var2 + -var9;
               var16 = var2 + var9;
               if(~Class159.anInt2020 >= ~var16 && ~Class57.anInt902 <= ~var24) {
                  if(~var9 <= ~var8) {
                     var17 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var7 + var6, (byte)0, Class101.anInt1425);
                     var18 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, -var7 + var6, (byte)0, Class101.anInt1425);
                     if(~Class57.anInt902 <= ~var16) {
                        Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var16], var18, var17, var4);
                     }

                     if(var24 >= Class159.anInt2020) {
                        Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var24], var18, var17, var4);
                     }
                  } else {
                     var17 = SceneGraphNode.anIntArray1838[var9];
                     var18 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var7 + var6, (byte)0, Class101.anInt1425);
                     var19 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, -var7 + var6, (byte)0, Class101.anInt1425);
                     var20 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var6 - -var17, (byte)0, Class101.anInt1425);
                     var21 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, -var17 + var6, (byte)0, Class101.anInt1425);
                     if(Class57.anInt902 >= var16) {
                        var22 = Class38.anIntArrayArray663[var16];
                        Class3_Sub13_Sub23_Sub1.method282(var22, var19, var21, var4);
                        Class3_Sub13_Sub23_Sub1.method282(var22, var21, var20, var0);
                        Class3_Sub13_Sub23_Sub1.method282(var22, var20, var18, var4);
                     }

                     if(~var24 <= ~Class159.anInt2020) {
                        var22 = Class38.anIntArrayArray663[var24];
                        Class3_Sub13_Sub23_Sub1.method282(var22, var19, var21, var4);
                        Class3_Sub13_Sub23_Sub1.method282(var22, var21, var20, var0);
                        Class3_Sub13_Sub23_Sub1.method282(var22, var20, var18, var4);
                     }
                  }
               }
            }

            var24 = -var7 + var2;
            var16 = var2 - -var7;
            if(~Class159.anInt2020 >= ~var16 && ~Class57.anInt902 <= ~var24) {
               var17 = var6 + var9;
               var18 = var6 + -var9;
               if(var17 >= Class101.anInt1425 && ~Class3_Sub28_Sub18.anInt3765 <= ~var18) {
                  var17 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var17, (byte)0, Class101.anInt1425);
                  var18 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var18, (byte)0, Class101.anInt1425);
                  if(var7 < var8) {
                     var19 = var11 >= var7?var11:SceneGraphNode.anIntArray1838[var7];
                     var20 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var19 + var6, (byte)0, Class101.anInt1425);
                     var21 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var6 - var19, (byte)0, Class101.anInt1425);
                     if(Class57.anInt902 >= var16) {
                        var22 = Class38.anIntArrayArray663[var16];
                        Class3_Sub13_Sub23_Sub1.method282(var22, var18, var21, var4);
                        Class3_Sub13_Sub23_Sub1.method282(var22, var21, var20, var0);
                        Class3_Sub13_Sub23_Sub1.method282(var22, var20, var17, var4);
                     }

                     if(var24 >= Class159.anInt2020) {
                        var22 = Class38.anIntArrayArray663[var24];
                        Class3_Sub13_Sub23_Sub1.method282(var22, var18, var21, var4);
                        Class3_Sub13_Sub23_Sub1.method282(var22, var21, var20, var0);
                        Class3_Sub13_Sub23_Sub1.method282(var22, var20, var17, var4);
                     }
                  } else {
                     if(~Class57.anInt902 <= ~var16) {
                        Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var16], var18, var17, var4);
                     }

                     if(var24 >= Class159.anInt2020) {
                        Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var24], var18, var17, var4);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var23) {
         throw Class44.method1067(var23, "wl.I(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   public static void method2276(int var0) {
      try {
         if(var0 == -2) {
            aClass94_2089 = null;
            aClass153_2097 = null;
            aClass11_2091 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "wl.G(" + var0 + ')');
      }
   }

   static final void method2277(int var0, int var1, int var2, int var3, byte var4) {
	   InventoryNode var5 = (InventoryNode)GroundTile.aClass130_2220.get((long)var3);
	   if(var5 == null) {
		   var5 = new InventoryNode();
		   GroundTile.aClass130_2220.put(var5, (long)var3);
	   }

	   if(var1 >= var5.anIntArray2547.length) {
		   int[] var6 = new int[var1 + 1];
		   int[] var7 = new int[var1 + 1];

		   int var8;
		   for(var8 = 0; ~var5.anIntArray2547.length < ~var8; ++var8) {
			   var6[var8] = var5.anIntArray2547[var8];
			   var7[var8] = var5.anIntArray2551[var8];
		   }

		   for(var8 = var5.anIntArray2547.length; ~var8 > ~var1; ++var8) {
			   var6[var8] = -1;
			   var7[var8] = 0;
		   }

		   var5.anIntArray2547 = var6;
		   var5.anIntArray2551 = var7;
	   }

	   var5.anIntArray2547[var1] = var0;
	   var5.anIntArray2551[var1] = var2;
   }

   static final void method2278() {
         boolean var1 = false;

         while(!var1) {
            var1 = true;

            for(int var2 = 0; ~var2 > ~(-1 + Class3_Sub13_Sub34.anInt3415); ++var2) {
               if(Class3_Sub13_Sub7.aShortArray3095[var2] < 1000 && -1001 > ~Class3_Sub13_Sub7.aShortArray3095[1 + var2]) {
                  jString var3 = Class163_Sub2_Sub1.aClass94Array4016[var2];
                  var1 = false;
                  Class163_Sub2_Sub1.aClass94Array4016[var2] = Class163_Sub2_Sub1.aClass94Array4016[1 + var2];
                  Class163_Sub2_Sub1.aClass94Array4016[1 + var2] = var3;
                  jString var4 = ItemPile.aClass94Array2935[var2];
                  ItemPile.aClass94Array2935[var2] = ItemPile.aClass94Array2935[var2 + 1];
                  ItemPile.aClass94Array2935[var2 - -1] = var4;
                  int var5 = Class117.anIntArray1613[var2];
                  Class117.anIntArray1613[var2] = Class117.anIntArray1613[1 + var2];
                  Class117.anIntArray1613[var2 + 1] = var5;
                  var5 = Class27.anIntArray512[var2];
                  Class27.anIntArray512[var2] = Class27.anIntArray512[var2 + 1];
                  Class27.anIntArray512[1 + var2] = var5;
                  var5 = Class114.anIntArray1578[var2];
                  Class114.anIntArray1578[var2] = Class114.anIntArray1578[1 + var2];
                  Class114.anIntArray1578[var2 - -1] = var5;
                  short var6 = Class3_Sub13_Sub7.aShortArray3095[var2];
                  Class3_Sub13_Sub7.aShortArray3095[var2] = Class3_Sub13_Sub7.aShortArray3095[1 + var2];
                  Class3_Sub13_Sub7.aShortArray3095[var2 + 1] = var6;
                  long var7 = Class3_Sub13_Sub22.aLongArray3271[var2];
                  Class3_Sub13_Sub22.aLongArray3271[var2] = Class3_Sub13_Sub22.aLongArray3271[var2 + 1];
                  Class3_Sub13_Sub22.aLongArray3271[var2 - -1] = var7;
               }
            }
         }
   }

   private final void decode(Buffer buffer, int opcode, int id) {
            if(-2 != ~opcode) {
               if(opcode != 2) {
                  if(3 != opcode) {
                     if(5 != opcode) {
                        if(-8 != ~opcode) {
                           if(~opcode != -9) {
                              if(-10 != ~opcode) {
                                 if(-11 != ~opcode) {
                                    if(opcode != 11) {
                                       if(12 != opcode) {
                                          if(13 != opcode) {
                                             if(~opcode == -15) {
                                                this.anInt2101 = buffer.getUByte();
                                             }
                                          } else {
                                             this.anInt2094 = buffer.getMidInt();
                                          }
                                       } else {
                                          this.aBoolean2092 = true;
                                       }
                                    } else {
                                       this.anInt2100 = buffer.getUByte();
                                    }
                                 } else {
                                    this.aBoolean2093 = false;
                                 }
                              } else {
                                 this.anInt2090 = buffer.getUShort();
                              }
                           } else {
                              Class3_Sub13_Sub6.anInt3081 = id;
                           }
                        } else {
                           this.anInt2098 = jInterface.method869(116, buffer.getMidInt());
                        }
                     } else {
                        this.aBoolean2102 = false;
                     }
                  } else {
                     this.anInt2095 = buffer.getUShort();
                     if(this.anInt2095 == '\uffff') {
                        this.anInt2095 = -1;
                     }
                  }
               } else {
                  this.anInt2095 = buffer.getUByte();
               }
            } else {
               this.anInt2103 = jInterface.method869(116, buffer.getMidInt());
            }
   }

   static final UnderlayType list(int id) {
         UnderlayType var2 = (UnderlayType)Class163_Sub2_Sub1.aClass93_4015.get((long)id);
         if(null == var2) {

            byte[] var4 = AnimationLoader.aClass153_3580.getFile(4, id);
            var2 = new UnderlayType();
            if(var4 != null) {
               var2.decode(new Buffer(var4), id);
            }

            Class163_Sub2_Sub1.aClass93_4015.put(var2, (long)id);
            return var2;
         } else {
            return var2;
         }
   }

   static final void method2280(int var0, int var1) {
	   InterfaceChangeNode var2 = Class3_Sub24_Sub3.putInterfaceChange(11, var1);
	   var2.a();
   }

}
