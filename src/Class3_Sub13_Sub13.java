import java.awt.Point;
import java.io.IOException;

final class Class3_Sub13_Sub13 extends Class3_Sub13 {

   private int anInt3147 = 4;
   static int modeWhat = 0;
   private int anInt3149 = 4;
   static jString aClass94_3150 = jString.createJString("null");
   static jString aClass94_3152 = jString.createJString("::gc");
   static int anInt3153;
   static js5 varpJs5;
   static int anInt3155;
   static int anInt3156 = -1;


   static final void setCursor(int var0) {
	   if(!Class163_Sub3.aBoolean3004) {
		   var0 = -1;
	   }
	   /*if(var0 != Class65.currentCursorId) {
		   if(var0 != -1) {
			   CursorType var2 = CursorType.list(var0);
			   LDSprite var3 = var2.getCursor();
			   if(null != var3) {
				   Class38.gameSignlink.method1434(var3.method655(), 10000, var3.trimWidth, InvType.canvas, new Point(var2.anInt881, var2.anInt879), var3.trimHeight);
				   Class65.currentCursorId = var0;
			   } else {
				   var0 = -1;
			   }
		   }

		   if(0 == ~var0 && ~Class65.currentCursorId != 0) {
			   Class38.gameSignlink.method1434((int[])null, 10000, -1, InvType.canvas, new Point(), -1);
			   Class65.currentCursorId = -1;
		   }
		   
	   }*/
   }

   public Class3_Sub13_Sub13() {
      super(1, false);
   }

   final void method157(int var1, Buffer var2, boolean var3) {
      try {
         if(!var3) {
            modeWhat = -117;
         }

         if(~var1 == -1) {
            this.anInt3149 = var2.getUByte();
         } else if(1 == var1) {
            this.anInt3147 = var2.getUByte();
         }

      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "gg.A(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

   static final void method230(int[][] var0, boolean var1) {
      try {
         Class38.anIntArrayArray663 = var0;
         if(!var1) {
            method234();
         }

      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "gg.Q(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   static final void method232(int var0) {
         if(Canvas_Sub2.loadInterface(var0)) {
            jInterface[] var2 = SceneGraphNode.interfaceCache[var0];

            for(int var3 = 0; ~var2.length < ~var3; ++var3) {
               jInterface var4 = var2[var3];
               if(null != var4) {
                  var4.anInt260 = 1;
                  var4.anInt283 = 0;
                  var4.anInt267 = 0;
               }
            }
         }
   }

   final int[] method154(int var1, byte var2) {
      try {
         int var3 = 39 % ((30 - var2) / 36);
         int[] var10 = this.aClass114_2382.method1709(-16409, var1);
         if(this.aClass114_2382.aBoolean1580) {
            int var5 = Class113.anInt1559 / this.anInt3149;
            int var6 = Class101.anInt1427 / this.anInt3147;
            int[] var4;
            int var7;
            if(-1 <= ~var6) {
               var4 = this.method152(0, 0, 32755);
            } else {
               var7 = var1 % var6;
               var4 = this.method152(0, Class101.anInt1427 * var7 / var6, 32755);
            }

            for(var7 = 0; var7 < Class113.anInt1559; ++var7) {
               if(0 >= var5) {
                  var10[var7] = var4[0];
               } else {
                  int var8 = var7 % var5;
                  var10[var7] = var4[Class113.anInt1559 * var8 / var5];
               }
            }
         }

         return var10;
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "gg.D(" + var1 + ',' + var2 + ')');
      }
   }

   /*static final void loadRunes(js5 var1) {
	   Npc.anInt4001 = var1.method2120(Class9.aClass94_119);
   }*/

	public static void method234() {
		aClass94_3150 = null;
		varpJs5 = null;
		aClass94_3152 = null;
	}

   final int[][] method166(int var1, int var2) {
      try {
         if(var1 != -1) {
            return (int[][])((int[][])null);
         } else {
            int[][] var3 = this.aClass97_2376.method1594((byte)-123, var2);
            if(this.aClass97_2376.aBoolean1379) {
               int var5 = Class113.anInt1559 / this.anInt3149;
               int var6 = Class101.anInt1427 / this.anInt3147;
               int[][] var4;
               if(var6 > 0) {
                  int var7 = var2 % var6;
                  var4 = this.method162(var7 * Class101.anInt1427 / var6, 0, (byte)-109);
               } else {
                  var4 = this.method162(0, 0, (byte)-120);
               }

               int[] var17 = var4[0];
               int[] var9 = var4[2];
               int[] var10 = var3[0];
               int[] var8 = var4[1];
               int[] var11 = var3[1];
               int[] var12 = var3[2];

               for(int var13 = 0; ~var13 > ~Class113.anInt1559; ++var13) {
                  int var14;
                  if(var5 <= 0) {
                     var14 = 0;
                  } else {
                     int var15 = var13 % var5;
                     var14 = var15 * Class113.anInt1559 / var5;
                  }

                  var10[var13] = var17[var14];
                  var11[var13] = var8[var14];
                  var12[var13] = var9[var14];
               }
            }

            return var3;
         }
      } catch (RuntimeException var16) {
         throw Class44.method1067(var16, "gg.T(" + var1 + ',' + var2 + ')');
      }
   }

   static final void handleMainGame(boolean var0) {
         if(Class159.logoutCycle > 0) {
            Class159.logoutCycle--;
         }

         if(Class38_Sub1.systemUpdateCycle > 1) {
            Class38_Sub1.systemUpdateCycle--;
            Class140_Sub6.anInt2905 = Class3_Sub13_Sub17.anInt3213;
         }

         if(Class3_Sub28_Sub18.errorPinging) {
            Class3_Sub28_Sub18.errorPinging = false;
            Class3_Sub13_Sub24.dropClient();
         } else {
            for(int var1 = 0; var1 < 100 && Class3_Sub13_Sub3.method181(-15450); ++var1) {
               ;
            }

            if(Class143.gameState == 30) {
               Class163_Sub2_Sub1.method2226(Class3_Sub13_Sub1.outputStream, 163, -116);
               Object var14 = DisplayModeInformation.aClass67_1443.anObject1016;
               int var2;
               int var3;
               int var4;
               int var5;
               int var6;
               int var8;
               int var9;
               synchronized(var14) {
                  if(Canvas_Sub2.aBoolean29) {
                     if(Class3_Sub28_Sub11.anInt3644 != 0 || DisplayModeInformation.aClass67_1443.anInt1018 >= 40) {
                        Class3_Sub13_Sub1.outputStream.putPacket(185);
                        var3 = 0;
                        Class3_Sub13_Sub1.outputStream.putByte(0);
                        var2 = Class3_Sub13_Sub1.outputStream.pos;

                        for(var4 = 0; DisplayModeInformation.aClass67_1443.anInt1018 > var4 && ~(Class3_Sub13_Sub1.outputStream.pos - var2) > -241; ++var4) {
                           ++var3;
                           var5 = DisplayModeInformation.aClass67_1443.anIntArray1019[var4];
                           var6 = DisplayModeInformation.aClass67_1443.anIntArray1020[var4];
                           if(-1 < ~var5) {
                              var5 = 0;
                           } else if(-65535 > ~var5) {
                              var5 = '\ufffe';
                           }

                           if(var6 >= 0) {
                              if('\ufffe' < var6) {
                                 var6 = '\ufffe';
                              }
                           } else {
                              var6 = 0;
                           }

                           boolean var7 = false;
                           if(DisplayModeInformation.aClass67_1443.anIntArray1019[var4] == -1 && 0 == ~DisplayModeInformation.aClass67_1443.anIntArray1020[var4]) {
                              var7 = true;
                              var5 = -1;
                              var6 = -1;
                           }

                           if(Class155.anInt1977 == var6 && var5 == Canvas_Sub1.anInt14) {
                              if(2047 > Class3_Sub26.anInt2556) {
                                 ++Class3_Sub26.anInt2556;
                              }
                           } else {
                              var8 = -Class155.anInt1977 + var6;
                              Class155.anInt1977 = var6;
                              var9 = var5 + -Canvas_Sub1.anInt14;
                              Canvas_Sub1.anInt14 = var5;
                              if(~Class3_Sub26.anInt2556 > -9 && var8 >= -32 && 31 >= var8 && -32 <= var9 && var9 <= 31) {
                                 var9 += 32;
                                 var8 += 32;
                                 Class3_Sub13_Sub1.outputStream.putShort(var9 + (Class3_Sub26.anInt2556 << 12) + (var8 << 6));
                                 Class3_Sub26.anInt2556 = 0;
                              } else if(Class3_Sub26.anInt2556 < 32 && 127 >= ~var8 && -128 <= ~var8 && var9 >= -128 && var9 <= 127) {
                                 Class3_Sub13_Sub1.outputStream.putByte(128 - -Class3_Sub26.anInt2556);
                                 var9 += 128;
                                 var8 += 128;
                                 Class3_Sub13_Sub1.outputStream.putShort((var8 << 8) + var9);
                                 Class3_Sub26.anInt2556 = 0;
                              } else if(32 > Class3_Sub26.anInt2556) {
                                 Class3_Sub13_Sub1.outputStream.putByte(192 - -Class3_Sub26.anInt2556);
                                 if(var7) {
                                    Class3_Sub13_Sub1.outputStream.putInt(Integer.MIN_VALUE);
                                 } else {
                                    Class3_Sub13_Sub1.outputStream.putInt(var6 | var5 << 16);
                                 }

                                 Class3_Sub26.anInt2556 = 0;
                              } else {
                                 Class3_Sub13_Sub1.outputStream.putShort(Class3_Sub26.anInt2556 + '\ue000');
                                 if(var7) {
                                    Class3_Sub13_Sub1.outputStream.putInt(Integer.MIN_VALUE);
                                 } else {
                                    Class3_Sub13_Sub1.outputStream.putInt(var6 | var5 << 16);
                                 }

                                 Class3_Sub26.anInt2556 = 0;
                              }
                           }
                        }

                        Class3_Sub13_Sub1.outputStream.putSizedByte(-var2 + Class3_Sub13_Sub1.outputStream.pos);
                        if(~DisplayModeInformation.aClass67_1443.anInt1018 < ~var3) {
                           DisplayModeInformation.aClass67_1443.anInt1018 -= var3;

                           for(var4 = 0; DisplayModeInformation.aClass67_1443.anInt1018 > var4; ++var4) {
                              DisplayModeInformation.aClass67_1443.anIntArray1020[var4] = DisplayModeInformation.aClass67_1443.anIntArray1020[var3 + var4];
                              DisplayModeInformation.aClass67_1443.anIntArray1019[var4] = DisplayModeInformation.aClass67_1443.anIntArray1019[var4 + var3];
                           }
                        } else {
                           DisplayModeInformation.aClass67_1443.anInt1018 = 0;
                        }
                     }
                  } else {
                     DisplayModeInformation.aClass67_1443.anInt1018 = 0;
                  }
               }

               if(-1 != ~Class3_Sub28_Sub11.anInt3644) {
                  long var15 = (-AbstractIndexedSprite.aLong1465 + Class75.aLong1102) / 50L;
                  var3 = Class38_Sub1.anInt2614;
                  if(var3 >= 0) {
                     if(var3 > '\uffff') {
                        var3 = '\uffff';
                     }
                  } else {
                     var3 = 0;
                  }

                  if(32767L < var15) {
                     var15 = 32767L;
                  }

                  var4 = Class163_Sub1.anInt2993;
                  AbstractIndexedSprite.aLong1465 = Class75.aLong1102;
                  byte var19 = 0;
                  if(~var4 <= -1) {
                     if(var4 > '\uffff') {
                        var4 = '\uffff';
                     }
                  } else {
                     var4 = 0;
                  }

                  var6 = (int)var15;
                  if(-3 == ~Class3_Sub28_Sub11.anInt3644) {
                     var19 = 1;
                  }

                  Class3_Sub13_Sub1.outputStream.putPacket(99);
                  //Class3_Sub13_Sub1.outputStream.method765(var19 << 15 | var6, (byte)3);
                  Class3_Sub13_Sub1.outputStream.putInt(var4 | var3 << 16);
               }

               if(0 < ClickMaskNode.anInt2212) {
                  --ClickMaskNode.anInt2212;
               }

               if(Class15.aBoolean346) {
                  for(int var1 = 0; ~var1 > ~Class3_Sub23.anInt2537; ++var1) {
                     var2 = GrandExchangeItem.anIntArray1755[var1];
                     if(98 == var2 || -100 == ~var2 || -97 == ~var2 || var2 == 97) {
                        BufferedRequest.aBoolean4068 = true;
                        break;
                     }
                  }
               } else if(ObjectDefinition.aBooleanArray1490[96] || ObjectDefinition.aBooleanArray1490[97] || ObjectDefinition.aBooleanArray1490[98] || ObjectDefinition.aBooleanArray1490[99]) {
                  BufferedRequest.aBoolean4068 = true;
               }
               
               if(BufferedRequest.aBoolean4068 && 0 >= ClickMaskNode.anInt2212) {
                  ClickMaskNode.anInt2212 = 20;
                  BufferedRequest.aBoolean4068 = false;
                  Class3_Sub13_Sub1.outputStream.putPacket(128);
                  Class3_Sub13_Sub1.outputStream.putLEShortA(Class3_Sub9.anInt2309);
                  Class3_Sub13_Sub1.outputStream.putShort(SpotAnimation.cameraYaw);
               }

               if(!Class3_Sub13_Sub6.focus != var0 && !Entity.aBoolean2774) {
                  Entity.aBoolean2774 = true;
                  Class3_Sub13_Sub1.outputStream.putPacket(7);
                  Class3_Sub13_Sub1.outputStream.putByte(1);
               }

               if(!Class3_Sub13_Sub6.focus && Entity.aBoolean2774) {
                  Entity.aBoolean2774 = false;
                  Class3_Sub13_Sub1.outputStream.putPacket(7);
                  Class3_Sub13_Sub1.outputStream.putByte(0);
               }

               /*if(!Class140_Sub2.aBoolean2705) {
                  Class3_Sub13_Sub1.outputStream.putPacket(98);//require settings
                  Class3_Sub13_Sub1.outputStream.putInt(Class84.method1421(-2));
                  Class140_Sub2.aBoolean2705 = true;
               }*/

               Class163_Sub1_Sub1.method2214(0);
               if(Class143.gameState == 30) {
                  MouseHandler.method2087();
                  Class115.method1713((byte)-91);
                  Class3_Sub8.method132((byte)-92);
                  AbstractSprite.timoutCycle++;
                  if(AbstractSprite.timoutCycle > 750) {
                     Class3_Sub13_Sub24.dropClient();
                  } else {
                     Class38.method1028(-102);
                     Class60.method1207(-72);
                     Class3_Sub13_Sub4.method189((byte)-62);
                     //if(Class3_Sub28_Sub3.aClass11_3551 != null) {
                     //   Class9.method848(4);
                     //}

                     for(int var1 = Class3_Sub5.method115(true); ~var1 != 0; var1 = Class3_Sub5.method115(false)) {
                        Class46.method1087(40, var1);
                        Class44.anIntArray726[ClientScript.method633(Huffman.anInt641++, 31)] = var1;
                     }

                     int var22;//TODO FIXME if any issues
                     for(InterfaceChangeNode var16 = Class65943149.method1302(); var16 != null; var16 = Class65943149.method1302()) {
                        int type = var16.getType();
                        int uid = var16.getUid();
                        if(1 == type) {
                           NpcDefinition.anIntArray1277[uid] = var16.intValue;
                           Npc.anIntArray3986[ClientScript.method633(31, PacketParser.anInt87++)] = uid;
                        } else if(type == 2) {
                           Class132.aClass94Array1739[uid] = var16.stringValue;
                           Class163_Sub2_Sub1.anIntArray4025[ClientScript.method633(31, Class3_Sub9.anInt2317++)] = uid;
                        } else if(type == 3) {
                     	   jInterface var20 = Class7.getInterface(uid);
                     	   if(!var16.stringValue.equals(var20.disabledText)) {
                     		   var20.disabledText = var16.stringValue;
                     		   Class20.refreshInterface(var20);
                     	   }
                        } else if(type == 4) {
                        	jInterface var20 = Class7.getInterface(uid);
                        	var6 = var16.intValue;
                        	var8 = var16.intValue3;
                        	var22 = var16.intValue2;
                        	if(var20.mediaTypeDisabled != var6 || var20.mediaIdDisabled != var22 || var8 != var20.anInt265) {
                        		var20.mediaIdDisabled = var22;
                        		var20.anInt265 = var8;
                        		if(client.clientLoad != 464)
                        			var20.zoom = 2000;
                        		var20.mediaTypeDisabled = var6;
                        		Class20.refreshInterface(var20);
                        	}
                        } else if(type == 5) {
                        	jInterface var20 = Class7.getInterface(uid);
                        	if(~var20.disabledAnim != ~var16.intValue || ~var16.intValue == 0) {
                        		var20.anInt260 = 1;
                        		var20.anInt267 = 0;
                        		var20.disabledAnim = var16.intValue;
                        		var20.anInt283 = 0;
                        		Class20.refreshInterface(var20);
                        	}
                        } else if(type == 6) {
                            var5 = var16.intValue;
                            var6 = (32195 & var5) >> 10;
                            var8 = var5 & 31;
                            var22 = (var5 & 1000) >> 5;
                            jInterface var10 = Class7.getInterface(uid);
                            var9 = (var8 << 3) + (var22 << 11) + (var6 << 19);
                            if(var9 != var10.disabledColor) {
                               var10.disabledColor = var9;
                               Class20.refreshInterface(var10);
                            }
                        } else if(type == 7) {
                        	jInterface var20 = Class7.getInterface(uid);
                        	boolean var24 = var16.intValue == 1;
                            if(!var24 != !var20.hidden) {
                               var20.hidden = var24;
                               Class20.refreshInterface(var20);
                            }
                        } else if(type == 8) {
                            jInterface var20 = Class7.getInterface(uid);
                            if(var16.intValue != var20.rotateX || var20.rotateY != var16.intValue2 || ~var16.intValue3 != ~var20.zoom) {
                               var20.rotateX = var16.intValue;
                               var20.zoom = var16.intValue3;
                               var20.rotateY = var16.intValue2;
                               if(-1 != var20.anInt192) {
                                  if(~var20.anInt184 >= -1) {
                                     if(~var20.width < -1) {
                                        var20.zoom = 32 * var20.zoom / var20.width;
                                     }
                                  } else {
                                     var20.zoom = var20.zoom * 32 / var20.anInt184;
                                  }
                               }

                               Class20.refreshInterface(var20);
                            }
                        } else if(type == 9) {
                            jInterface var20 = Class7.getInterface(uid);
                            if(~var16.intValue != ~var20.anInt192 || var20.anInt271 != var16.intValue2) {
                               var20.anInt192 = var16.intValue;
                               var20.anInt271 = var16.intValue2;
                               Class20.refreshInterface(var20);
                            }
                        } else if(type == 10) {
                        	jInterface var20 = Class7.getInterface(uid);
                        	if(~var20.anInt258 != ~var16.intValue || ~var16.intValue2 != ~var20.anInt264 || var20.rotateZ != var16.intValue3) {
                        		var20.anInt264 = var16.intValue2;
                        		var20.rotateZ = var16.intValue3;
                        		var20.anInt258 = var16.intValue;
                        		Class20.refreshInterface(var20);
                        	}
                        } else if(type == 11) {
                        	jInterface var20 = Class7.getInterface(uid);
                        	var20.anInt306 = var20.x = var16.intValue;
                        	var20.aByte273 = 0;
                        	var20.aByte162 = 0;
                        	var20.anInt210 = var20.y = var16.intValue2;
                        	Class20.refreshInterface(var20);
                        } else if(type == 12) {
                        	jInterface var20 = Class7.getInterface(uid);
                        	var6 = var16.intValue;
                        	if(null != var20 && 0 == var20.type) {
                        		if(var6 > var20.maxScrollVertical + -var20.anInt193) {
                        			var6 = var20.maxScrollVertical + -var20.anInt193;
                        		}
                        		
                        		if(0 > var6) {
                        			var6 = 0;
                        		}

                        		if(var6 != var20.anInt208) {
                        			var20.anInt208 = var6;
                        			Class20.refreshInterface(var20);
                        		}
                        	}
                        } else if(type == 13) {
                        	jInterface var20 = Class7.getInterface(uid);
                        	var20.rotationModifier = var16.intValue;
                        }
                     }

                     if(Huffman.anInt638 != 0) {
                        js5Worker.anInt2958 += 20;
                        if(400 <= js5Worker.anInt2958) {
                           Huffman.anInt638 = 0;
                        }
                     }

                     ++DisplayModeInformation.anInt1446;
                     if(Class151.aClass11_1933 != null) {
                        ++Class3_Sub9.anInt2330;
                        if(15 <= Class3_Sub9.anInt2330) {
                           Class20.refreshInterface(Class151.aClass11_1933);
                           Class151.aClass11_1933 = null;
                        }
                     }

                     jInterface var17;
                     if(Class67.aClass11_1017 != null) {
                        Class20.refreshInterface(Class67.aClass11_1017);
                        if(~(5 + MillisTimer.anInt2693) > ~PlainTile.anInt1676 || PlainTile.anInt1676 < -5 + MillisTimer.anInt2693 || ~(InputStream_Sub1.anInt40 + 5) > ~Hashtable.anInt1709 || -5 + InputStream_Sub1.anInt40 > Hashtable.anInt1709) {
                           Class72.aBoolean1074 = true;
                        }

                        ++Class40.anInt677;
                        if(0 == Class3_Sub13_Sub5.anInt3069) {
                           if(Class72.aBoolean1074 && 5 <= Class40.anInt677) {
                              if(Class67.aClass11_1017 == Class99.aClass11_1402 && PacketParser.anInt86 != Class140_Sub2.anInt2701) {
                                 var17 = Class67.aClass11_1017;
                                 byte var18 = 0;
                                 if(1 == Canvas_Sub1.anInt15 && 206 == var17.clientCode) {
                                    var18 = 1;
                                 }

                                 if(var17.inventoryIds[Class140_Sub2.anInt2701] <= 0) {
                                    var18 = 0;
                                 }

                                 if(!jInterface.getInterfaceClickMask(var17).method93(572878952)) {
                                    if(~var18 == -2) {
                                       var6 = Class140_Sub2.anInt2701;
                                       var5 = PacketParser.anInt86;

                                       while(var6 != var5) {
                                          if(var5 > var6) {
                                             var17.method864(-1 + var5, var5, -71);
                                             --var5;
                                          } else if(~var6 < ~var5) {
                                             var17.method864(1 + var5, var5, -95);
                                             ++var5;
                                          }
                                       }
                                    } else {
                                       var17.method864(Class140_Sub2.anInt2701, PacketParser.anInt86, -93);
                                    }
                                 } else {
                                    var5 = PacketParser.anInt86;
                                    var6 = Class140_Sub2.anInt2701;
                                    var17.inventoryIds[var6] = var17.inventoryIds[var5];
                                    var17.inventoryAmounts[var6] = var17.inventoryAmounts[var5];
                                    var17.inventoryIds[var5] = -1;
                                    var17.inventoryAmounts[var5] = 0;
                                 }

                                 Class3_Sub13_Sub1.outputStream.putPacket(121);
                                 Class3_Sub13_Sub1.outputStream.putShortA(Class140_Sub2.anInt2701);
                                 Class3_Sub13_Sub1.outputStream.putByteA(var18);
                                 Class3_Sub13_Sub1.outputStream.putInt1(Class67.aClass11_1017.uid);
                                 Class3_Sub13_Sub1.outputStream.putLEShort(PacketParser.anInt86);
                              }
                           } else if((-2 == ~Js5CacheWorker.anInt998 || Class3_Sub13_Sub39.method353(-1 + Class3_Sub13_Sub34.anInt3415, 0)) && Class3_Sub13_Sub34.anInt3415 > 2) {
                              Class132.method1801((byte)-116);
                           } else if(-1 > ~Class3_Sub13_Sub34.anInt3415) {
                              Class3_Sub13_Sub8.method203(56);
                           }

                           Class3_Sub28_Sub11.anInt3644 = 0;
                           Class3_Sub9.anInt2330 = 10;
                           Class67.aClass11_1017 = null;
                        }
                     }

                     Class85.aBoolean1167 = false;
                     Class27.aClass11_526 = null;
                     Class21.aBoolean440 = false;
                     Class3_Sub23.anInt2537 = 0;
                     var17 = Class107.aClass11_1453;
                     Class107.aClass11_1453 = null;
                     jInterface var21 = Class20.aClass11_439;

                     for(Class20.aClass11_439 = null; UpdateServerNode.method591(72) && 128 > Class3_Sub23.anInt2537; ++Class3_Sub23.anInt2537) {
                        GrandExchangeItem.anIntArray1755[Class3_Sub23.anInt2537] = Class3_Sub28_Sub9.anInt3624;
                        FixedVertex.anIntArray1638[Class3_Sub23.anInt2537] = Class3_Sub13_Sub27.anInt3342;
                     }

                     //Class3_Sub28_Sub3.aClass11_3551 = null;
                     if(-1 != InvType.mainScreenInterface) {
                        SpotAnimation.method967(0, 0, 0, Class23.canvasWid, InvType.mainScreenInterface, 0, ItemPile.canvasHei);
                     }

                     ++Class3_Sub13_Sub17.anInt3213;

                     while(true) {
                        InterfaceListener var26 = (InterfaceListener)PacketParser.aClass61_82.popFront();
                        jInterface var23;
                        jInterface var25;
                        if(var26 == null) {
                           while(true) {
                              var26 = (InterfaceListener)Class65.aClass61_983.popFront();
                              if(var26 == null) {
                                 while(true) {
                                    var26 = (InterfaceListener)Class110.aClass61_1471.popFront();
                                    if(var26 == null) {
                                       //if(Class3_Sub28_Sub3.aClass11_3551 == null) {
                                       //   ClanMember.anInt2475 = 0;
                                       //}

                                       if(Class56.aClass11_886 != null) {
                                          PacketParser.method829(-1);
                                       }

                                       if(Class3_Sub13_Sub26.anInt3320 >= 2 && ObjectDefinition.aBooleanArray1490[82] && ObjectDefinition.aBooleanArray1490[81] && 0 != Varp.anInt561) {
                                          var5 = Class26.plane - Varp.anInt561;
                                          if(0 > var5) {
                                             var5 = 0;
                                          } else if(var5 > 3) {
                                             var5 = 3;
                                          }

                                          Class30.method979(TextureLoader.selfPlayer.anIntArray2767[0] + Class131.anInt1716, TextureLoader.selfPlayer.anIntArray2755[0] + Class82.anInt1152, var5);
                                       }

                                       if(Class3_Sub13_Sub26.anInt3320 >= 2 && ObjectDefinition.aBooleanArray1490[82] && ObjectDefinition.aBooleanArray1490[81]) {
                                          if(-1 != Class27.anInt515) {
                                             Class30.method979(Class131.anInt1716 + Class27.anInt515, Class82.anInt1152 - -Js5CacheWorker.anInt999, Class26.plane);
                                          }

                                          ObjectDefinition.anInt1521 = 0;
                                          InterfaceListener.anInt2440 = 0;
                                       } else if(-3 == ~InterfaceListener.anInt2440) {
                                          if(~Class27.anInt515 != 0) {
                                             Class3_Sub13_Sub1.outputStream.putPacket(131);
                                             Class3_Sub13_Sub1.outputStream.putInt2(SubScript.anInt872);
                                             Class3_Sub13_Sub1.outputStream.putShortA(Class131.anInt1716 + Class27.anInt515);
                                             Class3_Sub13_Sub1.outputStream.putLEShortA(jInterface.anInt278);
                                             Class3_Sub13_Sub1.outputStream.putShortA(Js5CacheWorker.anInt999 + Class82.anInt1152);
                                             Huffman.anInt638 = 1;
                                             js5Worker.anInt2958 = 0;
                                             UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                                             Class70.anInt1053 = Class163_Sub1.anInt2993;
                                          }

                                          InterfaceListener.anInt2440 = 0;
                                       } else if(2 == ObjectDefinition.anInt1521) {
                                          if(-1 != Class27.anInt515) {
                                             Class3_Sub13_Sub1.outputStream.putPacket(179);
                                             Class3_Sub13_Sub1.outputStream.putShort(Class82.anInt1152 + Js5CacheWorker.anInt999);
                                             Class3_Sub13_Sub1.outputStream.putShort(Class27.anInt515 + Class131.anInt1716);
                                             js5Worker.anInt2958 = 0;
                                             Huffman.anInt638 = 1;
                                             Class70.anInt1053 = Class163_Sub1.anInt2993;
                                             UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                                          }

                                          ObjectDefinition.anInt1521 = 0;
                                       } else if(-1 != Class27.anInt515 && 0 == InterfaceListener.anInt2440 && ObjectDefinition.anInt1521 == 0) {
                                          boolean var27 = Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 0, true, 0, 2, Class27.anInt515, 0, 0, 0, Js5CacheWorker.anInt999, TextureLoader.selfPlayer.anIntArray2767[0]);
                                          if(var27) {
                                             UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                                             js5Worker.anInt2958 = 0;
                                             Class70.anInt1053 = Class163_Sub1.anInt2993;
                                             Huffman.anInt638 = 1;
                                          }
                                       }

                                       Class27.anInt515 = -1;
                                       Class163_Sub1.method2211(-48);
                                       if(Class107.aClass11_1453 != var17) {
                                          if(var17 != null) {
                                             Class20.refreshInterface(var17);
                                          }

                                          if(null != Class107.aClass11_1453) {
                                             Class20.refreshInterface(Class107.aClass11_1453);
                                          }
                                       }

                                       if(var21 != Class20.aClass11_439 && ~Class3_Sub13_Sub26.anInt3323 == ~Class75.anInt1109) {
                                          if(null != var21) {
                                             Class20.refreshInterface(var21);
                                          }

                                          if(null != Class20.aClass11_439) {
                                             Class20.refreshInterface(Class20.aClass11_439);
                                          }
                                       }

                                       if(Class20.aClass11_439 == null) {
                                          if(~Class75.anInt1109 < -1) {
                                             --Class75.anInt1109;
                                          }
                                       } else if(Class75.anInt1109 < Class3_Sub13_Sub26.anInt3323) {
                                          ++Class75.anInt1109;
                                          if(Class3_Sub13_Sub26.anInt3323 == Class75.anInt1109) {
                                             Class20.refreshInterface(Class20.aClass11_439);
                                          }
                                       }

                                       if(GrandExchangeItem.anInt1753 == 1) {
                                          KeyboardHandler.method2086((byte)68);
                                       } else if(GrandExchangeItem.anInt1753 == 2) {
                                          InterfaceListener.method379(1024);
                                       //} else {
                                       //   InterfaceChangeNode.d();
                                       }

                                       for(var5 = 0; -6 < ~var5; ++var5) {
                                          ++Class163_Sub1_Sub1.anIntArray4009[var5];
                                       }

                                       var5 = Class82.method1406((byte)-43);
                                       var6 = Class3_Sub13_Sub28.method301((byte)-119);
                                       if(~var5 < -15001 && -15001 > ~var6) {
                                          Class159.logoutCycle = 250;
                                          Class23.method940(112, 14500);
                                          Class3_Sub13_Sub1.outputStream.putPacket(230);
                                       }

                                       if(Class15.aClass64_351 != null && Class15.aClass64_351.status == 1) {
                                          //if(null != Class15.aClass64_351.value) {
                                          //   Class99.method1596(Class3_Sub13_Sub24.aClass94_3295, jString.aBoolean2154);
                                          //}

                                          Class3_Sub13_Sub24.aClass94_3295 = null;
                                          Class15.aClass64_351 = null;
                                          jString.aBoolean2154 = false;
                                       }

                                       ++Class3_Sub13_Sub23_Sub1.pingTimer;
                                       ++Light.anInt716;
                                       ++RuntimeException_Sub1.anInt2120;
                                       if(RuntimeException_Sub1.anInt2120 > 500) {
                                          RuntimeException_Sub1.anInt2120 = 0;
                                          var22 = (int)(8.0D * Math.random());
                                          if(-5 == ~(var22 & 4)) {
                                             StringNode.anInt2589 += Class128.anInt1682;
                                          }

                                          if(-3 == ~(var22 & 2)) {
                                             InputStream_Sub1.anInt42 += GroundTile.anInt2217;
                                          }

                                          if(-2 == ~(var22 & 1)) {
                                             Class3_Sub13_Sub18.anInt3216 += AbstractMouseWheel.anInt1901;
                                          }
                                       }

                                       if(~Light.anInt716 < -501) {
                                          Light.anInt716 = 0;
                                          var22 = (int)(8.0D * Math.random());
                                          if(-2 == ~(1 & var22)) {
                                             Class3_Sub13_Sub8.anInt3102 += OutputStream_Sub1.anInt48;
                                          }

                                          if(~(2 & var22) == -3) {
                                             Class164_Sub2.anInt3020 += Canvas_Sub1.anInt25;
                                          }
                                       }

                                       if(~Class3_Sub13_Sub18.anInt3216 > 49) {
                                          AbstractMouseWheel.anInt1901 = 2;
                                       }

                                       if(59 < ~Class3_Sub13_Sub8.anInt3102) {
                                          OutputStream_Sub1.anInt48 = 2;
                                       }

                                       if(~Class164_Sub2.anInt3020 > 19) {
                                          Canvas_Sub1.anInt25 = 1;
                                       }

                                       if(-55 > InputStream_Sub1.anInt42) {
                                          GroundTile.anInt2217 = 2;
                                       }

                                       if(InputStream_Sub1.anInt42 > 55) {
                                          GroundTile.anInt2217 = -2;
                                       }

                                       if(-40 > StringNode.anInt2589) {
                                          Class128.anInt1682 = 1;
                                       }

                                       if(Class3_Sub13_Sub18.anInt3216 > 50) {
                                          AbstractMouseWheel.anInt1901 = -2;
                                       }

                                       if(~StringNode.anInt2589 < -41) {
                                          Class128.anInt1682 = -1;
                                       }

                                       if(10 < Class164_Sub2.anInt3020) {
                                          Canvas_Sub1.anInt25 = -1;
                                       }

                                       if(60 < Class3_Sub13_Sub8.anInt3102) {
                                          OutputStream_Sub1.anInt48 = -2;
                                       }

                                       if(~Class3_Sub13_Sub23_Sub1.pingTimer < -51) {
                                          Class3_Sub13_Sub1.outputStream.putPacket(202);
                                       }

                                       try {
                                          if(Class3_Sub15.worldConnection != null && Class3_Sub13_Sub1.outputStream.pos > 0) {
                                             Class3_Sub15.worldConnection.write(Class3_Sub13_Sub1.outputStream.buf, 0, Class3_Sub13_Sub1.outputStream.pos);
                                             Class3_Sub13_Sub23_Sub1.pingTimer = 0;
                                             Class3_Sub13_Sub1.outputStream.pos = 0;
                                          }
                                       } catch (IOException var11) {
                                          Class3_Sub13_Sub24.dropClient();
                                       }

                                       return;
                                    }

                                    var25 = var26.aClass11_2449;
                                    if(-1 >= ~var25.anInt191) {
                                       var23 = Class7.getInterface(var25.parent);
                                       if(null == var23 || var23.aClass11Array262 == null || ~var25.anInt191 <= ~var23.aClass11Array262.length || var25 != var23.aClass11Array262[var25.anInt191]) {
                                          continue;
                                       }
                                    }

                                    Light.method1065(var26);
                                 }
                              }

                              var25 = var26.aClass11_2449;
                              if(~var25.anInt191 <= -1) {
                                 var23 = Class7.getInterface(var25.parent);
                                 if(var23 == null || null == var23.aClass11Array262 || var23.aClass11Array262.length <= var25.anInt191 || var23.aClass11Array262[var25.anInt191] != var25) {
                                    continue;
                                 }
                              }

                              Light.method1065(var26);
                           }
                        }

                        var25 = var26.aClass11_2449;
                        if(var25.anInt191 >= 0) {
                           var23 = Class7.getInterface(var25.parent);
                           if(var23 == null || var23.aClass11Array262 == null || var25.anInt191 >= var23.aClass11Array262.length || var23.aClass11Array262[var25.anInt191] != var25) {
                              continue;
                           }
                        }

                        Light.method1065(var26);
                     }
                  }
               }
            }
         }
   }

}
