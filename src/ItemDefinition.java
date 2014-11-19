import java.awt.Component;
import java.util.Arrays;

final class ItemDefinition {

   private short[] aShortArray751;
   private int anInt752;
   private int anInt753 = -1;
   int anInt754;
   private int anInt755;
   int anInt756 = -1;
   int cost = 1;
   int anInt758;
   private int anInt760 = 0;
   int anInt761;
   int anInt762;
   int stackable;
   private short[] aShortArray765;
   int[] anIntArray766;
   int anInt767;
   int anInt768;
   private int anInt769;
   jString aClass94_770;
   private int anInt771;
   private short[] aShortArray772;
   private int anInt773 = -1;
   private short[] aShortArray774;
   private int anInt775;
   private int anInt776 = -1;
   private int anInt777;
   private int anInt778;
   boolean members;
   private int anInt780;
   static int[] xpForLevel = new int[99];
   int anInt782 = 0;
   jString[] aClass94Array783;
   private int anInt784;
   private byte[] aByteArray785;
   int anInt786;
   int anInt787;
   int anInt788;
   int anInt789;
   private int anInt790;
   int anInt791;
   int anInt792;
   int anInt793;
   private int anInt794;
   int anInt795;
   private int anInt796;
   private int anInt797;
   Hashtable aClass130_798;
   int anInt799;
   int anInt800;
   jString[] aClass94Array801;
   private int anInt802;
   private int anInt803;
   int[] anIntArray804;
   private int anInt805;
   static jString aClass94_806;
   boolean aBoolean807;
   static jString aClass94_809;
   int anInt810;


   final boolean method1102(boolean var1, boolean var2) {
      try {
         int var3 = this.anInt803;
         int var4 = this.anInt796;
         if(var1) {
            var3 = this.anInt773;
            var4 = this.anInt753;
         }
         if(~var3 == 0) {
            return true;
         } else {
            boolean var5 = true;
           if(!StringNode.cacheIndex7.method2129(0, var3)) {
            	if (client.clientLoad < 602) {
					if (!client.modelsCache602.method2129(0, var3)) {
						var5 = false;
					}
				} else {
					var5 = false;
				}
            } 

            if(var4 != -1 && !StringNode.cacheIndex7.method2129(0, var4)) {
            	if (client.clientLoad < 602) {
					if (!client.modelsCache602.method2129(0, var4)) {
						var5 = false;
					}
				} else {
					var5 = false;
				}
            }

            return var5;
         }
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "h.G(" + var1 + ',' + var2 + ')');
      }
   }

   static final void method1103(js5 var0, js5 var1, boolean var2) {
      try {
         Class3_Sub13_Sub14.aClass153_3173 = var0;
         Varp.aClass153_557 = var1;
         if(!var2) {
            ;
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "h.B(" + (var0 != null?"{...}":"null") + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   final jString method1105(int var1, jString var2, int var3) {
      try {
         if(this.aClass130_798 == null) {
            return var2;
         } else {
            if(var1 < 90) {
               method1111(-111);
            }

            StringNode var4 = (StringNode)this.aClass130_798.get((long)var3);
            return null != var4?var4.value:var2;
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "h.S(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

   final ItemDefinition method1106(int var1, int var2) {
      try {
         int var3 = 58 % ((-28 - var2) / 48);
         if(this.anIntArray804 != null && -2 > ~var1) {
            int var4 = -1;

            for(int var5 = 0; 10 > var5; ++var5) {
               if(this.anIntArray766[var5] <= var1 && -1 != ~this.anIntArray766[var5]) {
                  var4 = this.anIntArray804[var5];
               }
            }

            if(0 != ~var4) {
               return ItemDefinition.method1023(var4);
            }
         }

         return this;
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "h.H(" + var1 + ',' + var2 + ')');
      }
   }

   static final Class44_Sub1 method1107(int var0) {
      try {
         if(Class3_Sub13_Sub16.aClass44_Sub1Array3201.length > Class3_Sub6.anInt2291) {
            return Class3_Sub13_Sub16.aClass44_Sub1Array3201[Class3_Sub6.anInt2291++];
         } else {
            if(var0 != 5422) {
               method1107(-66);
            }

            return null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "h.R(" + var0 + ')');
      }
   }

	final boolean method1108(boolean var2) {
		int var4 = this.anInt771;
		int var3 = this.anInt793;
		int var5 = this.anInt769;
		if (var2) {
			var5 = this.anInt776;
			var3 = this.anInt761;
			var4 = this.anInt794;
		}

		if (var3 != -1) {
			boolean var7 = true;
			if (!StringNode.cacheIndex7.method2129(0, var3)) {
				if (client.clientLoad < 602) {
					if (!client.modelsCache602.method2129(0, var3)) {
						var7 = false;
					}
				} else {
					var7 = false;
				}
			}

			if (var4 != -1 && !StringNode.cacheIndex7.method2129(0, var4)) {
				if (client.clientLoad < 602) {
					if (!client.modelsCache602.method2129(0, var4)) {
						var7 = false;
					}
				} else {
					var7 = false;
				}
			}

			if (-1 != var5 && !StringNode.cacheIndex7.method2129(0, var5)) {
				if (client.clientLoad < 602) {
					if (!client.modelsCache602.method2129(0, var5)) {
						var7 = false;
					}
				} else {
					var7 = false;
				}
			}
			return var7;
		} else {
			return true;
		}
	}

   final void method1109(byte var1, ItemDefinition var2, ItemDefinition var3) {
      try {
         this.aByteArray785 = var2.aByteArray785;
         this.anInt778 = var2.anInt778;
         this.aClass130_798 = var2.aClass130_798;
         this.anInt769 = var2.anInt769;
         this.anInt761 = var2.anInt761;
         this.anInt775 = var2.anInt775;
         this.aClass94Array783 = new jString[5];
         this.anInt755 = var3.anInt755;
         this.anInt810 = var3.anInt810;
         this.cost = 0;
         this.anInt782 = var2.anInt782;
         this.anInt773 = var2.anInt773;
         this.aShortArray774 = var2.aShortArray774;
         this.anInt768 = var3.anInt768;
         this.anInt771 = var2.anInt771;
         this.anInt799 = var3.anInt799;
         this.anInt803 = var2.anInt803;
         this.anInt796 = var2.anInt796;
         this.anInt760 = var2.anInt760;
         this.anInt786 = var3.anInt786;
         this.anInt754 = var3.anInt754;
         this.anInt753 = var2.anInt753;
         this.anInt777 = var2.anInt777;
         this.aShortArray772 = var2.aShortArray772;
         this.anInt802 = var2.anInt802;
         this.anInt752 = var2.anInt752;
         this.anInt792 = var3.anInt792;
         if(var1 != 69) {
            this.cost = 109;
         }

         this.anInt793 = var2.anInt793;
         this.anInt794 = var2.anInt794;
         this.aClass94_770 = var2.aClass94_770;
         this.aShortArray751 = var2.aShortArray751;
         this.aShortArray765 = var2.aShortArray765;
         this.aClass94Array801 = var2.aClass94Array801;
         this.members = var2.members;
         this.anInt776 = var2.anInt776;
         if(null != var2.aClass94Array783) {
            for(int var4 = 0; -5 < ~var4; ++var4) {
               this.aClass94Array783[var4] = var2.aClass94Array783[var4];
            }
         }

         this.aClass94Array783[4] = client.aClass94_361;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "h.J(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

   final AbstractModel method1110(int var1, int var2, int var3, AnimationDefinition var4, int var5, int var6) {
      try {
         if(var1 < 94) {
            this.anInt755 = -67;
         }

         if(this.anIntArray804 != null && -2 > ~var5) {
            int var7 = -1;

            for(int var8 = 0; var8 < 10; ++var8) {
               if(~var5 <= ~this.anIntArray766[var8] && ~this.anIntArray766[var8] != -1) {
                  var7 = this.anIntArray804[var8];
               }
            }

            if(~var7 != 0) {
               return ItemDefinition.method1023(var7).method1110(113, var2, var3, var4, 1, var6);
            }
         }

         AbstractModel var11 = (AbstractModel)Class143.aClass93_1874.get((long)this.anInt787);
         if(var11 == null) {
            ModelBuilder var12 = ModelBuilder.get(StringNode.cacheIndex7, this.anInt755, 0);
            if(null == var12) {
               return null;
            }

            int var9;
            if(null != this.aShortArray774) {
               for(var9 = 0; this.aShortArray774.length > var9; ++var9) {
                  if(null != this.aByteArray785 && ~var9 > ~this.aByteArray785.length) {
                     var12.swapColors(this.aShortArray774[var9], Class3_Sub13_Sub38.aShortArray3453[this.aByteArray785[var9] & 255]);
                  } else {
                     var12.swapColors(this.aShortArray774[var9], this.aShortArray772[var9]);
                  }
               }
            }

            if(this.aShortArray765 != null) {
               for(var9 = 0; var9 < this.aShortArray765.length; ++var9) {
                  var12.method1998(this.aShortArray765[var9], this.aShortArray751[var9]);
               }
            }

            var11 = var12.convert(this.anInt784 + 64, 768 + this.anInt790, -50, -10, -50);
            if(~this.anInt805 != -129 || this.anInt780 != 128 || ~this.anInt797 != -129) {
               var11.scale(this.anInt805, this.anInt780, this.anInt797);
            }

            var11.aBoolean2699 = true;
            if(HDToolkit.openGLEnabled) {
               ((HDModel)var11).method1920(false, false, false, true, false, false, true);
            }

            Class143.aClass93_1874.put(var11, (long)this.anInt787);
         }

         if(var4 != null) {
            var11 = var4.method2055(var11, (byte)-88, var2, var3, var6);
         }

         return var11;
      } catch (RuntimeException var10) {
         throw Class44.method1067(var10, "h.E(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null?"{...}":"null") + ',' + var5 + ',' + var6 + ')');
      }
   }

   public static void method1111(int var0) {
      try {
         xpForLevel = null;
         aClass94_809 = null;
         if(var0 == 3327) {
            aClass94_806 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "h.P(" + var0 + ')');
      }
   }

   final void method1112(int var1) {
      try {
         if(var1 != 5401) {
            method1103((js5)null, (js5)null, true);
         }

      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "h.O(" + var1 + ')');
      }
   }

   final void init_decoding(Buffer buff, boolean new_header) {
	   while(true) {
           int var3 = buff.getUByte();
           if(0 == var3) {
              return;
           }
           this.decode_items(buff, var3, new_header);
        }
   }

   private final void decode_items(Buffer buffer, int opcode, boolean new_header) {
	   if(~opcode != -2) {
           if(opcode != 2) {
              if(-5 == ~opcode) {
                 this.anInt810 = buffer.getUShort();
              } else if(~opcode == -6) {
                 this.anInt786 = buffer.getUShort();
              } else if(~opcode == -7) {
                 this.anInt799 = buffer.getUShort();
              } else if(~opcode == -8) {
                 this.anInt792 = buffer.getUShort();
                 if(~this.anInt792 < -32768) {
                    this.anInt792 -= 65536;
                 }
              } else if(~opcode != -9) {
                 if(opcode == 11) {
                    this.stackable = 1;
                 } else if(-13 == ~opcode) {
                    this.cost = buffer.getInt();
                 } else if(-17 != ~opcode) {
                    if(23 == opcode) {
                       this.anInt793 = buffer.getUShort();
                       if (client.clientLoad == 464 && !new_header) {
                       		buffer.getUByte();
                       }
                    } else if(opcode != 24) {
                       if(~opcode != -26) {
                          if(~opcode != -27) {
                             if(opcode >= 30 && -36 < ~opcode) {
                                this.aClass94Array801[-30 + opcode] = buffer.getString();
                                if(this.aClass94Array801[opcode + -30].method1531(Class3_Sub13_Sub3.aClass94_3051)) {
                                   this.aClass94Array801[-30 + opcode] = null;
                                }
                             } else if(35 <= opcode && 40 > opcode) {
                                this.aClass94Array783[-35 + opcode] = buffer.getString();
                             } else {
                                int var5;
                                int var6;
                                if(-41 != ~opcode) {
                                   if(-42 == ~opcode) {
                                      var5 = buffer.getUByte();
                                      this.aShortArray751 = new short[var5];
                                      this.aShortArray765 = new short[var5];

                                      for(var6 = 0; ~var5 < ~var6; ++var6) {
                                         this.aShortArray765[var6] = (short)buffer.getUShort();
                                         this.aShortArray751[var6] = (short)buffer.getUShort();
                                      }
                                   } else if(42 == opcode) {
                                      var5 = buffer.getUByte();
                                      this.aByteArray785 = new byte[var5];

                                      for(var6 = 0; ~var6 > ~var5; ++var6) {
                                         this.aByteArray785[var6] = buffer.getByte();
                                      }
                                   } else if(opcode == 65) {
                                      this.aBoolean807 = true;
                                   } else if(-79 != ~opcode) {
                                      if(-80 == ~opcode) {
                                         this.anInt776 = buffer.getUShort();
                                      } else if(90 == opcode) {
                                         this.anInt803 = buffer.getUShort();
                                      } else if(opcode == 91) {
                                         this.anInt773 = buffer.getUShort();
                                      } else if(opcode != 92) {
                                         if(opcode != 93) {
                                            if(-96 == ~opcode) {
                                               this.anInt768 = buffer.getUShort();
                                            } else if(-97 == ~opcode) {
                                               this.anInt800 = buffer.getUByte();
                                            } else if(opcode == 97) {
                                               this.anInt789 = buffer.getUShort();
                                            } else if(-99 == ~opcode) {
                                               this.anInt791 = buffer.getUShort();
                                            } else if(-101 >= ~opcode && ~opcode > -111) {
                                               if(null == this.anIntArray804) {
                                                  this.anIntArray804 = new int[10];
                                                  this.anIntArray766 = new int[10];
                                               }

                                               this.anIntArray804[-100 + opcode] = buffer.getUShort();
                                               this.anIntArray766[opcode + -100] = buffer.getUShort();
                                            } else if(110 != opcode) {
                                               if(~opcode != -112) {
                                                  if(-113 == ~opcode) {
                                                     this.anInt797 = buffer.getUShort();
                                                  } else if(-114 != ~opcode) {
                                                     if(~opcode == -115) {
                                                        this.anInt790 = 5 * buffer.getByte();
                                                     } else if(opcode == 115) {
                                                        this.anInt782 = buffer.getUByte();
                                                     } else if(opcode != 121) {
                                                        if(opcode == 122) {
                                                           this.anInt762 = buffer.getUShort();
                                                        } else if(125 != opcode) {
                                                           if(~opcode == -127) {
                                                              this.anInt777 = buffer.getByte();
                                                              this.anInt802 = buffer.getByte();
                                                              this.anInt752 = buffer.getByte();
                                                           } else if(opcode == 127) {
                                                              this.anInt767 = buffer.getUByte();
                                                              this.anInt758 = buffer.getUShort();
                                                           } else if(~opcode != -129) {
                                                              if(-130 != ~opcode) {
                                                                 if(-131 == ~opcode) {
                                                                    buffer.getUByte();
                                                                    buffer.getUShort();//some cs2 stuff
                                                                 } else if(opcode == 132) {
                                                               	  int i = buffer.getUByte();
                                                               	  int[] anIntArray2935 = new int[i];
                                                               	  for (int i_5_ = 0; (i ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++)
                                                               		  anIntArray2935[i_5_] = buffer.getUShort();//these are images for items
                                                                 } else if(249 == opcode) {
                                                                    var5 = buffer.getUByte();
                                                                    if(null == this.aClass130_798) {
                                                                       var6 = Class95.method1585(var5);
                                                                       this.aClass130_798 = new Hashtable(var6);
                                                                    }

                                                                    for(var6 = 0; var6 < var5; ++var6) {
                                                                       boolean var7 = buffer.getUByte() == 1;
                                                                       int var8 = buffer.getMidInt();
                                                                       Object var9;
                                                                       if(!var7) {
                                                                          var9 = new IntegerNode(buffer.getInt());
                                                                       } else {
                                                                          var9 = new StringNode(buffer.getString());
                                                                       }

                                                                       this.aClass130_798.put((Node)var9, (long)var8);
                                                                    }
                                                                 }
                                                              } else {
                                                                 buffer.getUByte();
                                                                 buffer.getUShort();//some cs2 stuff
                                                              }
                                                           } else {
                                                              this.anInt788 = buffer.getUByte();
                                                              this.anInt756 = buffer.getUShort();
                                                           }
                                                        } else {
                                                           this.anInt760 = buffer.getByte();
                                                           this.anInt778 = buffer.getByte();
                                                           this.anInt775 = buffer.getByte();
                                                        }
                                                     } else {
                                                        this.anInt795 = buffer.getUShort();
                                                     }
                                                  } else {
                                                     this.anInt784 = buffer.getByte();
                                                  }
                                               } else {
                                                  this.anInt780 = buffer.getUShort();
                                               }
                                            } else {
                                               this.anInt805 = buffer.getUShort();
                                            }
                                         } else {
                                            this.anInt753 = buffer.getUShort();
                                         }
                                      } else {
                                         this.anInt796 = buffer.getUShort();
                                      }
                                   } else {
                                      this.anInt769 = buffer.getUShort();
                                   }
                                } else {
                                   var5 = buffer.getUByte();
                                   this.aShortArray772 = new short[var5];
                                   this.aShortArray774 = new short[var5];

                                   for(var6 = 0; var5 > var6; ++var6) {
                                      this.aShortArray774[var6] = (short)buffer.getUShort();
                                      this.aShortArray772[var6] = (short)buffer.getUShort();
                                   }
                                }
                             }
                          } else {
                             this.anInt794 = buffer.getUShort();
                          }
                       } else {
                          this.anInt761 = buffer.getUShort();
                          if (client.clientLoad == 464 && !new_header) {
                          		buffer.getUByte();//464 uses
                          }
                       }
                    } else {
                       this.anInt771 = buffer.getUShort();
                    }
                 } else {
                    this.members = true;
                 }
              } else {
                 this.anInt754 = buffer.getUShort();
                 if(this.anInt754 > 32767) {
                    this.anInt754 -= 65536;
                 }
              }
           } else {
              this.aClass94_770 = buffer.getString();
           }
        } else {
           this.anInt755 = buffer.getUShort();
        }
   }
   
   private final void decode_higher_revisions(Buffer buffer, int opcode) {
	   if(~opcode != -2) {
           if(opcode != 2) {
              if(-5 == ~opcode) {
                 this.anInt810 = buffer.getUShort();
              } else if(~opcode == -6) {
                 this.anInt786 = buffer.getUShort();
              } else if(~opcode == -7) {
                 this.anInt799 = buffer.getUShort();
              } else if(~opcode == -8) {
                 this.anInt792 = buffer.getUShort();
                 if(~this.anInt792 < -32768) {
                    this.anInt792 -= 65536;
                 }
              } else if(~opcode != -9) {
                 if(opcode == 11) {
                    this.stackable = 1;
                 } else if(-13 == ~opcode) {
                    this.cost = buffer.getInt();
                 } else if(-17 != ~opcode) {
                    if(23 == opcode) {
                       this.anInt793 = buffer.getUShort();
                    } else if(opcode != 24) {
                       if(~opcode != -26) {
                          if(~opcode != -27) {
                             if(opcode >= 30 && -36 < ~opcode) {
                                this.aClass94Array801[-30 + opcode] = buffer.getString();
                                if(this.aClass94Array801[opcode + -30].method1531(Class3_Sub13_Sub3.aClass94_3051)) {
                                   this.aClass94Array801[-30 + opcode] = null;
                                }
                             } else if(35 <= opcode && 40 > opcode) {
                                this.aClass94Array783[-35 + opcode] = buffer.getString();
                             } else {
                                int var5;
                                int var6;
                                if(-41 != ~opcode) {
                                   if(-42 == ~opcode) {
                                      var5 = buffer.getUByte();
                                      this.aShortArray751 = new short[var5];
                                      this.aShortArray765 = new short[var5];

                                      for(var6 = 0; ~var5 < ~var6; ++var6) {
                                         this.aShortArray765[var6] = (short)buffer.getUShort();
                                         this.aShortArray751[var6] = (short)buffer.getUShort();
                                      }
                                   } else if(42 == opcode) {
                                      var5 = buffer.getUByte();
                                      this.aByteArray785 = new byte[var5];

                                      for(var6 = 0; ~var6 > ~var5; ++var6) {
                                         this.aByteArray785[var6] = buffer.getByte();
                                      }
                                   } else if(opcode == 65) {
                                      this.aBoolean807 = true;
                                   } else if(-79 != ~opcode) {
                                      if(-80 == ~opcode) {
                                         this.anInt776 = buffer.getUShort();
                                      } else if(90 == opcode) {
                                         this.anInt803 = buffer.getUShort();
                                      } else if(opcode == 91) {
                                         this.anInt773 = buffer.getUShort();
                                      } else if(opcode != 92) {
                                         if(opcode != 93) {
                                            if(-96 == ~opcode) {
                                               this.anInt768 = buffer.getUShort();
                                            } else if(-97 == ~opcode) {
                                               this.anInt800 = buffer.getUByte();
                                            } else if(opcode == 97) {
                                               this.anInt789 = buffer.getUShort();
                                            } else if(-99 == ~opcode) {
                                               this.anInt791 = buffer.getUShort();
                                            } else if(-101 >= ~opcode && ~opcode > -111) {
                                               if(null == this.anIntArray804) {
                                                  this.anIntArray804 = new int[10];
                                                  this.anIntArray766 = new int[10];
                                               }

                                               this.anIntArray804[-100 + opcode] = buffer.getUShort();
                                               this.anIntArray766[opcode + -100] = buffer.getUShort();
                                            } else if(110 != opcode) {
                                               if(~opcode != -112) {
                                                  if(-113 == ~opcode) {
                                                     this.anInt797 = buffer.getUShort();
                                                  } else if(-114 != ~opcode) {
                                                     if(~opcode == -115) {
                                                        this.anInt790 = 5 * buffer.getByte();
                                                     } else if(opcode == 115) {
                                                        this.anInt782 = buffer.getUByte();
                                                     } else if(opcode != 121) {
                                                        if(opcode == 122) {
                                                           this.anInt762 = buffer.getUShort();
                                                        } else if(125 != opcode) {
                                                           if(~opcode == -127) {
                                                              this.anInt777 = buffer.getByte();
                                                              this.anInt802 = buffer.getByte();
                                                              this.anInt752 = buffer.getByte();
                                                           } else if(opcode == 127) {
                                                              this.anInt767 = buffer.getUByte();
                                                              this.anInt758 = buffer.getUShort();
                                                           } else if(~opcode != -129) {
                                                              if(-130 != ~opcode) {
                                                                 if(-131 == ~opcode) {
                                                                    buffer.getUByte();
                                                                    buffer.getUShort();//some cs2 stuff
                                                                 } else if(opcode == 132) {
                                                               	  int i = buffer.getUByte();
                                                               	  int[] anIntArray2935 = new int[i];
                                                               	  for (int i_5_ = 0; (i ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++)
                                                               		  anIntArray2935[i_5_] = buffer.getUShort();//these are images for items
                                                                 } else if (opcode == 134) {
                                                                	 if (client.clientLoad > 602) {
                                                                		 buffer.getUByte();
                                                                	 }
                                                                 } else if (opcode == 139) {
                                                                	 if (client.clientLoad > 602) {
                                                                		 buffer.getUShort();
                                                                	 }
                                                                 } else if (opcode == 140) {
                                                                	 if (client.clientLoad > 602) {
                                                                		 buffer.getUShort();
                                                                	 }
                                                                 } else if(249 == opcode) {
                                                                    var5 = buffer.getUByte();
                                                                    if(null == this.aClass130_798) {
                                                                       var6 = Class95.method1585(var5);
                                                                       this.aClass130_798 = new Hashtable(var6);
                                                                    }

                                                                    for(var6 = 0; var6 < var5; ++var6) {
                                                                       boolean var7 = buffer.getUByte() == 1;
                                                                       int var8 = buffer.getMidInt();
                                                                       Object var9;
                                                                       if(!var7) {
                                                                          var9 = new IntegerNode(buffer.getInt());
                                                                       } else {
                                                                          var9 = new StringNode(buffer.getString());
                                                                       }

                                                                       this.aClass130_798.put((Node)var9, (long)var8);
                                                                    }
                                                                 }
                                                              } else {
                                                                 buffer.getUByte();
                                                                 buffer.getUShort();//some cs2 stuff
                                                              }
                                                           } else {
                                                              this.anInt788 = buffer.getUByte();
                                                              this.anInt756 = buffer.getUShort();
                                                           }
                                                        } else {
                                                           this.anInt760 = buffer.getByte();
                                                           this.anInt778 = buffer.getByte();
                                                           this.anInt775 = buffer.getByte();
                                                        }
                                                     } else {
                                                        this.anInt795 = buffer.getUShort();
                                                     }
                                                  } else {
                                                     this.anInt784 = buffer.getByte();
                                                  }
                                               } else {
                                                  this.anInt780 = buffer.getUShort();
                                               }
                                            } else {
                                               this.anInt805 = buffer.getUShort();
                                            }
                                         } else {
                                            this.anInt753 = buffer.getUShort();
                                         }
                                      } else {
                                         this.anInt796 = buffer.getUShort();
                                      }
                                   } else {
                                      this.anInt769 = buffer.getUShort();
                                   }
                                } else {
                                   var5 = buffer.getUByte();
                                   this.aShortArray772 = new short[var5];
                                   this.aShortArray774 = new short[var5];

                                   for(var6 = 0; var5 > var6; ++var6) {
                                      this.aShortArray774[var6] = (short)buffer.getUShort();
                                      this.aShortArray772[var6] = (short)buffer.getUShort();
                                   }
                                }
                             }
                          } else {
                             this.anInt794 = buffer.getUShort();
                          }
                       } else {
                          this.anInt761 = buffer.getUShort();
                       }
                    } else {
                       this.anInt771 = buffer.getUShort();
                    }
                 } else {
                    this.members = true;
                 }
              } else {
                 this.anInt754 = buffer.getUShort();
                 if(this.anInt754 > 32767) {
                    this.anInt754 -= 65536;
                 }
              }
           } else {
              this.aClass94_770 = buffer.getString();
           }
        } else {
           this.anInt755 = buffer.getUShort();
        }
   }

	final int method1115(int var1, int var3) {
		if (this.aClass130_798 != null) {
			IntegerNode var5 = (IntegerNode) this.aClass130_798.get((long) var3);
			return null != var5 ? var5.value : var1;
		} else {
			return var1;
		}
	}

   final ModelBuilder method1116(boolean var1, byte var2) {
      try {
         int var4 = this.anInt796;
         if(var2 != -109) {
            return (ModelBuilder)null;
         } else {
            int var3 = this.anInt803;
            if(var1) {
               var4 = this.anInt753;
               var3 = this.anInt773;
            }

            if(-1 != var3) {
               ModelBuilder var5 = ModelBuilder.get(StringNode.cacheIndex7, var3, 0);
               if(-1 != var4) {
                  ModelBuilder var6 = ModelBuilder.get(StringNode.cacheIndex7, var4, 0);
                  ModelBuilder[] var7 = new ModelBuilder[]{var5, var6};
                  var5 = new ModelBuilder(var7, 2);
               }

               int var9;
               if(this.aShortArray774 != null) {
                  for(var9 = 0; var9 < this.aShortArray774.length; ++var9) {
                     var5.swapColors(this.aShortArray774[var9], this.aShortArray772[var9]);
                  }
               }

               if(this.aShortArray765 != null) {
                  for(var9 = 0; ~this.aShortArray765.length < ~var9; ++var9) {
                     var5.method1998(this.aShortArray765[var9], this.aShortArray751[var9]);
                  }
               }

               return var5;
            } else {
               return null;
            }
         }
      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "h.A(" + var1 + ',' + var2 + ')');
      }
   }

   final ModelBuilder method1117(boolean var1, int var2) {
		int var3 = this.anInt793;
		int var4 = this.anInt771;
		int var5 = this.anInt769;
		if (var1) {
			var5 = this.anInt776;
			var3 = this.anInt761;
			var4 = this.anInt794;
		}

		if (var3 == -1) {//TODO this
			return null;
		} else {
			ModelBuilder var6 = ModelBuilder.get(StringNode.cacheIndex7, var3, 0);
			if (0 != ~var4) {
				ModelBuilder var7 = ModelBuilder.get(StringNode.cacheIndex7, var4, 0);
				if (-1 == var5) {
					ModelBuilder[] var8 = new ModelBuilder[] { var6, var7 };
					var6 = new ModelBuilder(var8, 2);
				} else {
					ModelBuilder var12 = ModelBuilder.get(StringNode.cacheIndex7, var5, 0);
					ModelBuilder[] var9 = new ModelBuilder[] { var6, var7, var12 };
					var6 = new ModelBuilder(var9, 3);
				}
			}

			if (var6 == null)
				return null;

			if (!var1 && (~this.anInt760 != -1 || ~this.anInt778 != -1 || -1 != ~this.anInt775)) {
				var6.method2001(this.anInt760, this.anInt778, this.anInt775);
			}

			if (var1 && (~this.anInt777 != -1 || ~this.anInt802 != -1 || ~this.anInt752 != -1)) {
				var6.method2001(this.anInt777, this.anInt802, this.anInt752);
			}

			int var11;
			if (this.aShortArray774 != null) {
				for (var11 = 0; var11 < this.aShortArray774.length; ++var11) {
					var6.swapColors(this.aShortArray774[var11], this.aShortArray772[var11]);
				}
			}

			if (this.aShortArray765 != null) {
				for (var11 = 0; var11 < this.aShortArray765.length; ++var11) {
					var6.method1998(this.aShortArray765[var11], this.aShortArray751[var11]);
				}
			}

			return var6;
		}
   }

   final void method1118(ItemDefinition var1, ItemDefinition var2, boolean var3) {
      try {
         this.aClass94_770 = var1.aClass94_770;
         this.anInt810 = var2.anInt810;
         if(var3) {
            this.anInt780 = -70;
         }

         this.aShortArray774 = var2.aShortArray774;
         this.aShortArray772 = var2.aShortArray772;
         this.anInt786 = var2.anInt786;
         this.anInt799 = var2.anInt799;
         this.aShortArray751 = var2.aShortArray751;
         this.anInt755 = var2.anInt755;
         this.aByteArray785 = var2.aByteArray785;
         this.anInt768 = var2.anInt768;
         this.cost = var1.cost;
         this.stackable = 1;
         this.anInt754 = var2.anInt754;
         this.anInt792 = var2.anInt792;
         this.aShortArray765 = var2.aShortArray765;
         this.members = var1.members;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "h.N(" + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

   static final void addMouseHandler(Component var0) {
	   var0.addMouseListener(RawObjectCache.mouseHandler);
	   var0.addMouseMotionListener(RawObjectCache.mouseHandler);
	   var0.addFocusListener(RawObjectCache.mouseHandler);
   }

   final LDModel method1120(int var1) {
      try {
         ModelBuilder var2 = ModelBuilder.get(StringNode.cacheIndex7, this.anInt755, 0);
         if(var2 == null) {
            return null;
         } else {
            int var3;
            if(this.aShortArray774 != null) {
               for(var3 = 0; this.aShortArray774.length > var3; ++var3) {
                  if(null != this.aByteArray785 && ~var3 > ~this.aByteArray785.length) {
                     var2.swapColors(this.aShortArray774[var3], Class3_Sub13_Sub38.aShortArray3453[this.aByteArray785[var3] & 255]);
                  } else {
                     var2.swapColors(this.aShortArray774[var3], this.aShortArray772[var3]);
                  }
               }
            }

            if(this.aShortArray765 != null) {
               for(var3 = 0; var3 < this.aShortArray765.length; ++var3) {
                  var2.method1998(this.aShortArray765[var3], this.aShortArray751[var3]);
               }
            }

            LDModel var5 = var2.method2000(64 - -this.anInt784, 768 - -this.anInt790, -50, -10, -50);
            if(var1 != 18206) {
               this.method1105(-67, (jString)null, -37);
            }

            if(-129 != ~this.anInt805 || -129 != ~this.anInt780 || -129 != ~this.anInt797) {
               var5.scale(this.anInt805, this.anInt780, this.anInt797);
            }

            return var5;
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "h.L(" + var1 + ')');
      }
   }

   static final ItemDefinition method1023(int var0) {
		ItemDefinition var2 = (ItemDefinition) Class3_Sub28_Sub4.aClass93_3572.get((long) var0);
		if (var2 != null)
			return var2;
		boolean new_header = false;
		byte[] data = Class164.cacheIndex2.getFile(client.getItemsConfig(var0), var0);
		if (data == null) {
			data = Class164.cacheIndex2.getFile(32, var0);
			if (data != null) {
				new_header = true;
			}
		}
		var2 = new ItemDefinition();
		var2.anInt787 = var0;
		if (data != null) {
			var2.init_decoding(new Buffer(data), new_header);
		}
		var2.method1112(5401);
		if (0 != ~var2.anInt791) {
			var2.method1118(method1023(var2.anInt789),method1023(var2.anInt791), false);
		}
		if (var2.anInt762 != -1) {
			var2.method1109((byte) 69, method1023(var2.anInt795),method1023(var2.anInt762));
		}
		if (!Class139.aBoolean1827 && var2.members) {
			var2.aClass94_770 = ClientScript.aClass94_3691;
			var2.anInt782 = 0;
			var2.aClass94Array783 = RuntimeException_Sub1.aClass94Array2119;
			var2.aBoolean807 = false;
			var2.aClass94Array801 = Buffer.aClass94Array2596;
		}
		Class3_Sub28_Sub4.aClass93_3572.put(var2, (long) var0);
		return var2;
   }

public ItemDefinition() {
      this.aClass94_770 = Class40.aClass94_672;
      this.anInt775 = 0;
      this.anInt784 = 0;
      this.anInt769 = -1;
      this.anInt796 = -1;
      this.anInt791 = -1;
      this.anInt777 = 0;
      this.anInt780 = 128;
      this.anInt767 = -1;
      this.anInt758 = -1;
      this.anInt768 = 0;
      this.anInt762 = -1;
      this.anInt795 = -1;
      this.anInt761 = -1;
      this.anInt771 = -1;
      this.anInt754 = 0;
      this.anInt786 = 0;
      this.anInt799 = 0;
      this.anInt800 = 0;
      this.stackable = 0;
      this.anInt789 = -1;
      this.anInt794 = -1;
      this.anInt788 = -1;
      this.anInt797 = 128;
      this.members = false;
      this.anInt752 = 0;
      this.anInt792 = 0;
      this.anInt803 = -1;
      this.anInt802 = 0;
      this.anInt793 = -1;
      this.aClass94Array801 = new jString[]{null, null, Class3_Sub13_Sub33.aClass94_3397, null, null};
      this.anInt805 = 128;
      this.anInt790 = 0;
      this.anInt778 = 0;
      this.aClass94Array783 = new jString[]{null, null, null, null, Class140_Sub3.aClass94_2744};
      this.anInt810 = 2000;
      this.aBoolean807 = false;
   }

   static {
      int var0 = 0;

      for(int var1 = 0; var1 < 99; ++var1) {
         int var2 = 1 + var1;
         int var3 = (int)(Math.pow(2.0D, (double)var2 / 7.0D) * 300.0D + (double)var2);
         var0 += var3;
         xpForLevel[var1] = var0 / 4;
      }

      aClass94_809 = jString.createJString("green:");
      aClass94_806 = jString.createJString("green:");
   }
}
