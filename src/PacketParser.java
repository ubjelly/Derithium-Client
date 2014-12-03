import java.io.IOException;

final class PacketParser {

   static int js5Stage = 0;
   static byte[][][] aByteArrayArrayArray81;
   static Deque aClass61_82 = new Deque();
   static short aShort83 = 32767;
   //static jString aClass94_85 = jString.createJString("overlay");
   static int anInt86 = 0;
   static int anInt87 = 0;
   static jInterface aClass11_88 = null;


   static final int method823(int var0, int var1, int var3) {
	   return (8 & Class9.aByteArrayArrayArray113[var3][var1][var0]) == 0?(~var3 < -1 && -1 != ~(Class9.aByteArrayArrayArray113[1][var1][var0] & 2)?-1 + var3:var3):0;
   }

   static final void method824(long[] var0, Object[] var1, int var2) {
      try {
         int var3 = 38 % ((var2 - 28) / 52);
         Class134.method1809(var0.length - 1, var0, 122, 0, var1);
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "ac.E(" + (var0 != null?"{...}":"null") + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   static final void method825(byte var0, int var1) {
      try {
         int var2 = -51 % ((26 - var0) / 33);
         InterfaceChangeNode var3 = Class3_Sub24_Sub3.putInterfaceChange(1, var1);
         var3.a();
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "ac.D(" + var0 + ',' + var1 + ')');
      }
   }

   static final int method826(jString var0, int var1) {
      try {
         if(var1 != -1) {
            method826((jString)null, 65);
         }

         if(var0 != null) {
            for(int var2 = 0; Class8.anInt104 > var2; ++var2) {
               if(var0.method1531(Class70.aClass94Array1046[var2])) {
                  return var2;
               }
            }

            return -1;
         } else {
            return -1;
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "ac.B(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   static final boolean method827() throws IOException {
	   if(Class3_Sub15.worldConnection == null) {
		   return false;
	   }
	   int var1 = Class3_Sub15.worldConnection.available();
	   if(0 == var1) {
		   return false;
	   }
	   if(jString.anInt2147 == -1) {
		   var1--;
		   Class3_Sub15.worldConnection.read(SpotAnimation.aClass3_Sub30_Sub1_532.buf, 0, 1);
		   SpotAnimation.aClass3_Sub30_Sub1_532.pos = 0;
		   jString.anInt2147 = SpotAnimation.aClass3_Sub30_Sub1_532.getPacket();
		   Hashtable.anInt1704 = Class75_Sub4.anIntArray2668[jString.anInt2147];
	   }
	   if(Hashtable.anInt1704 == -1) {
		   if(0 >= var1) {
			   return false;
		   }

		   Class3_Sub15.worldConnection.read(SpotAnimation.aClass3_Sub30_Sub1_532.buf, 0, 1);
		   --var1;
		   Hashtable.anInt1704 = SpotAnimation.aClass3_Sub30_Sub1_532.buf[0] & 255;
	   }

	   if(-2 == Hashtable.anInt1704) {
		   if(var1 <= 1) {
			   return false;
		   }

		   var1 -= 2;
		   Class3_Sub15.worldConnection.read(SpotAnimation.aClass3_Sub30_Sub1_532.buf, 0, 2);
		   SpotAnimation.aClass3_Sub30_Sub1_532.pos = 0;
		   Hashtable.anInt1704 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
	   }

	   if(Hashtable.anInt1704 > var1) {	
		   return false;
	   } 
	   SpotAnimation.aClass3_Sub30_Sub1_532.pos = 0;
	   Class3_Sub15.worldConnection.read(SpotAnimation.aClass3_Sub30_Sub1_532.buf, 0, Hashtable.anInt1704);
	   IdentityKit.anInt469 = Class7.anInt2166;
	   Class7.anInt2166 = StringNode.anInt2582;
	   StringNode.anInt2582 = jString.anInt2147;
	   AbstractSprite.timoutCycle = 0;
	   int var20;
	   int var5;
       jString var24;
       long var4;
	   int var3;
	   jString var58;
	   boolean var31;
       long var2;
       int var10;
       int var11;
       long var29;
       long var36;
	   int var21;
       int var30;
       int var6;
       int var8;
       boolean var32;
       jString var41;
	   if(jString.anInt2147 == 245) {
		   int id = SpotAnimation.aClass3_Sub30_Sub1_532.getUShortA();
		   byte value = SpotAnimation.aClass3_Sub30_Sub1_532.getByte();
		   Class3_Sub13_Sub23.method281(value, id);
		   jString.anInt2147 = -1;
		   return true;
	   } else if(jString.anInt2147 == 69) {
		   jString args = SpotAnimation.aClass3_Sub30_Sub1_532.getString();
		   Object[] var71 = new Object[args.getLength() - -1];

		   for(int i = args.getLength() + -1; -1 >= ~i; --i) {
			   if(115 == args.method1569(i, (byte)-45)) {
				   var71[1 + i] = SpotAnimation.aClass3_Sub30_Sub1_532.getString();
			   } else {
				   var71[1 + i] = new Integer(SpotAnimation.aClass3_Sub30_Sub1_532.getInt());
			   }
		   }

		   var71[0] = new Integer(SpotAnimation.aClass3_Sub30_Sub1_532.getInt());
		   InterfaceListener var66 = new InterfaceListener();
		   var66.objectData = var71;
		   Light.method1065(var66);

		   jString.anInt2147 = -1;
		   return true;
	   } else if(jString.anInt2147 == 108) {
		   jString message = SpotAnimation.aClass3_Sub30_Sub1_532.getString();
		   if (message.method1562(jString.createJString(":newkeys:"))) {
			   client.newKeys = true;
		   } else if (message.method1562(jString.createJString(":oldkeys:"))) {
			   client.newKeys = false;
		   } else if (message.method1562(jString.createJString(":newmenu:"))) {
			   client.newMenus = true;
		   } else if (message.method1562(jString.createJString(":oldmenu:"))) {
			   client.newMenus = false;
		   } else if (message.method1562(jString.createJString(":newhits:"))) {
			   client.newHits = true;
		   } else if (message.method1562(jString.createJString(":oldhits:"))) {
			   client.newHits = false;
		   } else if (message.method1562(jString.createJString(":newhealthbars:"))) {
			   client.newHealthbars = true;
		   } else if (message.method1562(jString.createJString(":oldhealthbars:"))) {
			   client.newHealthbars = false;
		   } else if (message.method1562(jString.createJString(":newmarkers:"))) {
			   client.newMarkers = true;
		   } else if (message.method1562(jString.createJString(":oldmarkers:"))) {
			   client.newMarkers = false;
		   } else if(message.method1550((byte)-60, Class117.aClass94_1614)) {
               var24 = message.substring(message.method1551(Class155.aClass94_1970), 0);
               var4 = var24.toLong();
               var31 = false;

               for(var30 = 0; ~var30 > ~AnimationLoader.anInt3591; ++var30) {
                  if(~Class114.aLongArray1574[var30] == ~var4) {
                     var31 = true;
                     break;
                  }
               }

               if(!var31 && ~Class44_Sub1.anInt2622 == -1) {
                  PacketBuffer.method805(var24, Class3_Sub6.aClass94_2285, 4);
               }
            } else if(message.method1550((byte)-47, Class30.aClass94_567)) {
                var24 = message.substring(message.method1551(Class155.aClass94_1970), 0);
                var4 = var24.toLong();
                var31 = false;

                for(var30 = 0; ~AnimationLoader.anInt3591 < ~var30; ++var30) {
                   if(Class114.aLongArray1574[var30] == var4) {
                      var31 = true;
                      break;
                   }
                }

                if(!var31 && Class44_Sub1.anInt2622 == 0) {
                   var41 = message.substring(message.getLength() + -9, 1 + message.method1551(Class155.aClass94_1970));
                   PacketBuffer.method805(var24, var41, 8);
                }
            /*} else if(message.method1550((byte)-98, Class3_Sub13_Sub26.aClass94_3330)) {
            	var31 = false;
            	var24 = message.method1557(message.method1551(Class155.aClass94_1970), 0);
            	var4 = var24.toLong();

            	for(var30 = 0; ~AnimationLoader.anInt3591 < ~var30; ++var30) {
            		if(var4 == Class114.aLongArray1574[var30]) {
            			var31 = true;
            			break;
            		}
            	}

            	if(!var31 && ~Class44_Sub1.anInt2622 == -1) {
            		PacketBuffer.method805(var24, GroundItem.aClass94_3672, 10);
            	}
            } else if(message.method1550((byte)-128, Class3_Sub20.aClass94_2482)) {
            	var24 = message.method1557(message.method1551(Class3_Sub20.aClass94_2482), 0);*/
            	PacketBuffer.method805(GroundItem.aClass94_3672, var24, 11);
            } else if(message.method1550((byte)-29, Npc.aClass94_3998)) {
                var24 = message.substring(message.method1551(Npc.aClass94_3998), 0);
                if(0 == Class44_Sub1.anInt2622) {
                   PacketBuffer.method805(GroundItem.aClass94_3672, var24, 12);
                }
             /*} else if(message.method1550((byte)-80, Class143.aClass94_1877)) {
            	 var24 = message.method1557(message.method1551(Class143.aClass94_1877), 0);
            	 if(Class44_Sub1.anInt2622 == 0) {
            		 PacketBuffer.method805(GroundItem.aClass94_3672, var24, 13);
            	 }*/
             } else if(message.method1550((byte)-42, Class27.aClass94_514)) {
                 var31 = false;
                 var24 = message.substring(message.method1551(Class155.aClass94_1970), 0);
                 var4 = var24.toLong();

                 for(var30 = 0; AnimationLoader.anInt3591 > var30; ++var30) {
                    if(var4 == Class114.aLongArray1574[var30]) {
                       var31 = true;
                       break;
                    }
                 }

                 if(!var31 && -1 == ~Class44_Sub1.anInt2622) {
                    PacketBuffer.method805(var24, GroundItem.aClass94_3672, 14);
                 }
              } else if(message.method1550((byte)-41, IsaacCipher.aClass94_965)) {
                  var24 = message.substring(message.method1551(Class155.aClass94_1970), 0);
                  var31 = false;
                  var4 = var24.toLong();
                  for(var30 = 0; ~AnimationLoader.anInt3591 < ~var30; ++var30) {
                     if(~Class114.aLongArray1574[var30] == ~var4) {
                        var31 = true;
                        break;
                     }
                  }

                  if(!var31 && 0 == Class44_Sub1.anInt2622) {
                     PacketBuffer.method805(var24, GroundItem.aClass94_3672, 15);
                  }
               /*} else if(message.method1550((byte)-110, Class3_Sub13_Sub30.aClass94_3368)) {
            	   var24 = message.method1557(message.method1551(Class155.aClass94_1970), 0);
            	   var4 = var24.toLong();
            	   var31 = false;

            	   for(var30 = 0; ~AnimationLoader.anInt3591 < ~var30; ++var30) {
            		   if(~var4 == ~Class114.aLongArray1574[var30]) {
            			   var31 = true;
            			   break;
            		   }
            	   }

            	   if(!var31 && Class44_Sub1.anInt2622 == 0) {
            		   PacketBuffer.method805(var24, GroundItem.aClass94_3672, 16);
            	   }
               } else if(message.method1550((byte)-41, jString.aClass94_2155)) {
            	   var24 = message.method1557(message.method1551(Class155.aClass94_1970), 0);
            	   var31 = false;
            	   var4 = var24.toLong();

            	   for(var30 = 0; ~AnimationLoader.anInt3591 < ~var30; ++var30) {
            		   if(~Class114.aLongArray1574[var30] == ~var4) {
            			   var31 = true;
            			   break;
            		   }
            	   }

            	   if(!var31 && Class44_Sub1.anInt2622 == 0) {
            		   var41 = message.method1557(message.getLength() - 9, 1 + message.method1551(Class155.aClass94_1970));
            		   PacketBuffer.method805(var24, var41, 21);
            	   }*/
               } else {
            	   	PacketBuffer.method805(GroundItem.aClass94_3672, message, 0);
               }

		   jString.anInt2147 = -1;
		   return true;
	   } else if(jString.anInt2147 == 123) {
		   var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
		   var58 = SpotAnimation.aClass3_Sub30_Sub1_532.getString();
		   Class3_Sub13_Sub27.method295(var58, (byte)40, var20);

		   jString.anInt2147 = -1;
		   return true;
	   } else if(jString.anInt2147 == 230) {
           Class107.anInt1452 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteA();
           Class65.anInt990 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteS();

           while(~Hashtable.anInt1704 < ~SpotAnimation.aClass3_Sub30_Sub1_532.pos) {
        	   jString.anInt2147 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
        	   Class39.method1038((byte)-82);
           }

           jString.anInt2147 = -1;
           return true;
        } else if(jString.anInt2147 == 68) {
        	jString.anInt2147 = -1;
        	Class65.mapFlagX = 0;
        	return true;
        } else if(jString.anInt2147 == 220) {
        	var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt2();
        	var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
        	Class3_Sub13_Sub33.method327(var3, var20, (byte)68);

        	jString.anInt2147 = -1;
        	return true;
        } else if(81 == jString.anInt2147) {
        	var2 = SpotAnimation.aClass3_Sub30_Sub1_532.getLong();
        	SpotAnimation.aClass3_Sub30_Sub1_532.getByte();
        	var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getLong();
        	var29 = (long)SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
        	var36 = (long)SpotAnimation.aClass3_Sub30_Sub1_532.getMidInt();
        	var10 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
        	boolean var63 = false;
        	var11 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
        	long var55 = (var29 << 32) + var36;
        	int var54 = 0;

			label1521: while (true) {
				if (100 > var54) {
					if (~var55 != ~Class163_Sub2_Sub1.aLongArray4017[var54]) {
						++var54;
						continue;
					}

					var63 = true;
					break;
				}

				if (1 >= var10) {
					for (var54 = 0; ~AnimationLoader.anInt3591 < ~var54; ++var54) {
						if (~Class114.aLongArray1574[var54] == ~var2) {
							var63 = true;
							break label1521;
						}
					}
				}
				break;
			}

			if (!var63 && 0 == Class44_Sub1.anInt2622) {
				Class163_Sub2_Sub1.aLongArray4017[MouseHandler.anInt1921] = var55;
				MouseHandler.anInt1921 = (1 + MouseHandler.anInt1921) % 100;
				jString var61 = StringNode.method733(var11).method555(28021, SpotAnimation.aClass3_Sub30_Sub1_532);
				if (-3 != ~var10 && 3 != var10) {
					if (~var10 != -2) {
						InvType.appendChatMessage(20, var61, FileSystem.longToString(var4).upperCase(), FileSystem.longToString(var2).upperCase());
					} else {
						InvType.appendChatMessage(20, var61, FileSystem.longToString(var4).upperCase(), client.method903(new jString[] { Class32.aClass94_592, FileSystem.longToString(var2).upperCase() }));
					}
				} else {
					InvType.appendChatMessage(20, var61, FileSystem.longToString(var4).upperCase(), client.method903(new jString[] { Class21.aClass94_444, FileSystem.longToString(var2).upperCase() }));
				}
			}

			jString.anInt2147 = -1;
			return true;
		} else if(jString.anInt2147 == 55) {
			Class167.anInt2087 = Class3_Sub13_Sub17.anInt3213;
			var2 = SpotAnimation.aClass3_Sub30_Sub1_532.getLong();
			if (~var2 == -1L) {
				Class161.aClass94_2035 = null;
				jString.anInt2147 = -1;
				jInterface.aClass94_251 = null;
				ClientScript.clanMembers = null;
				NodeSub.anInt2572 = 0;
				return true;
			} else {
				var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getLong();
				jInterface.aClass94_251 = FileSystem.longToString(var4);
				Class161.aClass94_2035 = FileSystem.longToString(var2);
				Player.aByte3953 = SpotAnimation.aClass3_Sub30_Sub1_532.getByte();
				var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
				if (255 == var6) {
					jString.anInt2147 = -1;
					return true;
				} else {
					NodeSub.anInt2572 = var6;
					ClanMember[] var7 = new ClanMember[100];

					for (var8 = 0; ~NodeSub.anInt2572 < ~var8; ++var8) {
						var7[var8] = new ClanMember();
						var7[var8].hash = SpotAnimation.aClass3_Sub30_Sub1_532.getLong();
						var7[var8].name = FileSystem.longToString(var7[var8].hash);
						var7[var8].anInt2478 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
						var7[var8].aByte2472 = SpotAnimation.aClass3_Sub30_Sub1_532.getByte();
						var7[var8].aClass94_2473 = SpotAnimation.aClass3_Sub30_Sub1_532.getString();
						if (~Class3_Sub13_Sub16.aLong3202 == ~var7[var8].hash) {
							CollisionMap.aByte1308 = var7[var8].aByte2472;
						}
					}

					var32 = false;
					var10 = NodeSub.anInt2572;

					while (-1 > ~var10) {
						var32 = true;
						--var10;

						for (var11 = 0; ~var10 < ~var11; ++var11) {
							if (-1 > ~var7[var11].name.method1559(var7[var11 - -1].name)) {
								var32 = false;
								ClanMember var9 = var7[var11];
								var7[var11] = var7[1 + var11];
								var7[var11 + 1] = var9;
							}
						}

						if (var32) {
							break;
						}
					}

					ClientScript.clanMembers = var7;
					jString.anInt2147 = -1;
					return true;
				}
			}
		} else if(jString.anInt2147 == 164) {
			var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt1();
			Class136.aClass64_1778 = Class38.gameSignlink.method1449(var20);
			jString.anInt2147 = -1;
			return true;
		} else if(jString.anInt2147 == 90) {
            Class163_Sub3.method2228((byte)-122);//TODO player update
            jString.anInt2147 = -1;
            return true;
         } else if(jString.anInt2147 == 48) {
        	 var24 = SpotAnimation.aClass3_Sub30_Sub1_532.getString();
        	 var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShortA();
        	 Class3_Sub13_Sub27.method295(var24, (byte)40, var21);
        	 
        	 jString.anInt2147 = -1;
        	 return true;
         } else if(156 == jString.anInt2147) {
        	 Class3_Sub13_Sub8.anInt3101 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
        	 IdentityKit.anInt467 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
        	 Class45.anInt734 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
        	 jString.anInt2147 = -1;
        	 return true;
         } else if(jString.anInt2147 == 72) {
        	 jString var56 = SpotAnimation.aClass3_Sub30_Sub1_532.getString();
        	 var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteS();
        	 var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteC();
        	 var20 = -1;
        	 if(1 <= var21 && ~var21 >= -9) {
        		 if(var56.method1531(Vertex.aClass94_829)) {
        			 var56 = null;
        		 }
        		 CollisionMap.aClass94Array1299[-1 + var21] = var56;
        		 Class3_Sub13_Sub26.anIntArray3328[var21 + -1] = var20;
        		 Class1.aBooleanArray54[var21 + -1] = ~var3 == -1;
        	 }

        	 jString.anInt2147 = -1;
        	 return true;
         } else if(jString.anInt2147 == 142) {
        	 var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteS();
        	 var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt1();
        	 Class3_Sub13_Sub19.method260(var21, var20);

        	 jString.anInt2147 = -1;
        	 return true;
         } else if(jString.anInt2147 == 77) {//TODO this
                                                      var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShortA();
                                                     // var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteA();
                                                      //   if(-3 == ~var3) {
                                                      //      Class7.method834((byte)-86);
                                                      //   }

                                                         InvType.mainScreenInterface = var20;
                                                         Class3_Sub13_Sub13.method232(var20);
                                                         Class124.method1746(false);
                                                         Class3_Sub13_Sub12.executeOnLaunchScript(InvType.mainScreenInterface);

                                                         for(var5 = 0; -101 < ~var5; ++var5) {
                                                            GroundItem.aBooleanArray3674[var5] = true;
                                                         }

                                                      jString.anInt2147 = -1;
                                                      return true;
                                                   } else if(-70 != ~jString.anInt2147) {
                                                      if(141 == jString.anInt2147) {
                                                         var2 = SpotAnimation.aClass3_Sub30_Sub1_532.getLong();
                                                         var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                         jString var56 = StringNode.method733(var21).method555(28021, SpotAnimation.aClass3_Sub30_Sub1_532);
                                                         InvType.appendChatMessage(19, var56, (jString)null, FileSystem.longToString(var2).upperCase());
                                                         jString.anInt2147 = -1;
                                                         return true;
                                                      } else if(-170 != ~jString.anInt2147) {
                                                         if(89 == jString.anInt2147) {
                                                            Class3_Sub13_Sub2.resetVarp();
                                                            PacketBuffer.method819(false);
                                                            Huffman.anInt641 += 32;
                                                            jString.anInt2147 = -1;
                                                            return true;
                                                         } else if(-126 == ~jString.anInt2147) {
                                                            var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                            var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                            var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                            var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                            var30 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                               Class164_Sub1.method2238(var5, var21, var6, var3, (byte)-21, var30);

                                                            jString.anInt2147 = -1;
                                                            return true;
                                                         } else if(63 == jString.anInt2147) {
                                                            var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt2();
                                                            var3 = SpotAnimation.aClass3_Sub30_Sub1_532.method791((byte)10);
                                                            Class131.method1790(var20, var3);
                                                            jString.anInt2147 = -1;
                                                            return true;
                                                         } else {
                                                            ClickMaskNode var38;
                                                            ClickMaskNode var47;
                                                            if(-10 == ~jString.anInt2147) {
                                                               var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShortA();
                                                               var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getLEInt();
                                                               var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
                                                               if(-65536 == ~var5) {
                                                                  var5 = -1;
                                                               }

                                                               var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShortA();
                                                               if(-65536 == ~var6) {
                                                                  var6 = -1;
                                                               }

                                                                  for(var30 = var6; var5 >= var30; ++var30) {
                                                                     var36 = (long)var30 + ((long)var3 << 32);
                                                                     var47 = (ClickMaskNode)Class124.aClass130_1659.get(var36);
                                                                     if(null != var47) {
                                                                        var38 = new ClickMaskNode(var47.clickMask, var20);
                                                                        var47.unlink();
                                                                     } else if(0 != ~var30) {
                                                                        var38 = new ClickMaskNode(0, var20);
                                                                     } else {
                                                                        var38 = new ClickMaskNode(Class7.getInterface(var3).clickMask.clickMask, var20);
                                                                     }

                                                                     Class124.aClass130_1659.put(var38, var36);
                                                                  }

                                                               jString.anInt2147 = -1;
                                                               return true;
                                                            } else {
                                                               int var33;
                                                               if(jString.anInt2147 == 56) {
                                                                  var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                  var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
                                                                  var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt1();
                                                                  var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShortA();
                                                                  if(~(var21 >> 30) == -1) {
                                                                     AnimationDefinition var53;
                                                                     if(var21 >> 29 != 0) {
                                                                        var6 = '\uffff' & var21;
                                                                        Npc var62 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var6];
                                                                        if(null != var62) {
                                                                           if(-65536 == ~var5) {
                                                                              var5 = -1;
                                                                           }

                                                                           var32 = true;
                                                                           if(0 != ~var5 && -1 != var62.anInt2842 && ~AnimationDefinition.list(SpotAnimation.list(var5).anInt542, false).anInt1857 > ~AnimationDefinition.list(SpotAnimation.list(var62.anInt2842).anInt542, false).anInt1857) {
                                                                              var32 = false;
                                                                           }

                                                                           if(var32) {
                                                                              var62.anInt2761 = 0;
                                                                              var62.anInt2842 = var5;
                                                                              var62.anInt2759 = Class44.loopCycle - -var20;
                                                                              var62.anInt2805 = 0;
                                                                              if(var62.anInt2759 > Class44.loopCycle) {
                                                                                 var62.anInt2805 = -1;
                                                                              }

                                                                              var62.anInt2799 = var3;
                                                                              var62.anInt2826 = 1;
                                                                              if(~var62.anInt2842 != 0 && Class44.loopCycle == var62.anInt2759) {
                                                                                 var33 = SpotAnimation.list(var62.anInt2842).anInt542;
                                                                                 if(~var33 != 0) {
                                                                                    var53 = AnimationDefinition.list(var33, false);
                                                                                    if(var53 != null && null != var53.frames) {
                                                                                       jSocket.method1470(var62.anInt2829, var53, 183921384, var62.anInt2819, false, 0);
                                                                                    }
                                                                                 }
                                                                              }
                                                                           }
                                                                        }
                                                                     } else if(-1 != ~(var21 >> 28)) {
                                                                        var6 = var21 & '\uffff';
                                                                        Player var60;
                                                                        if(~ClickMaskNode.anInt2211 == ~var6) {
                                                                           var60 = TextureLoader.selfPlayer;
                                                                        } else {
                                                                           var60 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var6];
                                                                        }

                                                                        if(null != var60) {
                                                                           if(var5 == '\uffff') {
                                                                              var5 = -1;
                                                                           }

                                                                           var32 = true;
                                                                           if(var5 != -1 && ~var60.anInt2842 != 0 && ~AnimationDefinition.list(SpotAnimation.list(var5).anInt542, false).anInt1857 > ~AnimationDefinition.list(SpotAnimation.list(var60.anInt2842).anInt542, false).anInt1857) {
                                                                              var32 = false;
                                                                           }

                                                                           if(var32) {
                                                                              var60.anInt2759 = var20 + Class44.loopCycle;
                                                                              var60.anInt2799 = var3;
                                                                              var60.anInt2842 = var5;
                                                                              if(~var60.anInt2842 == -65536) {
                                                                                 var60.anInt2842 = -1;
                                                                              }

                                                                              var60.anInt2826 = 1;
                                                                              var60.anInt2761 = 0;
                                                                              var60.anInt2805 = 0;
                                                                              if(var60.anInt2759 > Class44.loopCycle) {
                                                                                 var60.anInt2805 = -1;
                                                                              }

                                                                              if(0 != ~var60.anInt2842 && ~var60.anInt2759 == ~Class44.loopCycle) {
                                                                                 var33 = SpotAnimation.list(var60.anInt2842).anInt542;
                                                                                 if(0 != ~var33) {
                                                                                    var53 = AnimationDefinition.list(var33, false);
                                                                                    if(null != var53 && null != var53.frames) {
                                                                                       jSocket.method1470(var60.anInt2829, var53, 183921384, var60.anInt2819, var60 == TextureLoader.selfPlayer, 0);
                                                                                    }
                                                                                 }
                                                                              }
                                                                           }
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var6 = 3 & var21 >> 28;
                                                                     var30 = ((var21 & 268434277) >> 14) + -Class131.anInt1716;
                                                                     var8 = (var21 & 16383) + -Class82.anInt1152;
                                                                     if(~var30 <= -1 && var8 >= 0 && 104 > var30 && ~var8 > -105) {
                                                                        var8 = var8 * 128 - -64;
                                                                        var30 = 128 * var30 + 64;
                                                                        Class140_Sub2 var50 = new Class140_Sub2(var5, var6, var30, var8, -var3 + Class121.method1736(var6, 1, var30, var8), var20, Class44.loopCycle);
                                                                        Class3_Sub13_Sub15.aClass61_3177.insertBack(new Class3_Sub28_Sub2(var50));
                                                                     }
                                                                  }

                                                                  jString.anInt2147 = -1;
                                                                  return true;
                                                               } else if(999 != jString.anInt2147) {
                                                                  if(jString.anInt2147 == 190) {
                                                                     PacketBuffer.method819(false);
                                                                     var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteS();
                                                                     var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getLEInt();
                                                                     var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                     GrandExchangeItem.currentExp[var21] = var3;
                                                                     Class3_Sub13_Sub15.currentStats[var21] = var20;
                                                                     Class3_Sub20.maxStats[var21] = 1;

                                                                     for(var5 = 0; 98 > var5; ++var5) {
                                                                        if(ItemDefinition.xpForLevel[var5] <= var3) {
                                                                           Class3_Sub20.maxStats[var21] = var5 + 2;
                                                                        }
                                                                     }

                                                                    // Class3_Sub28_Sub19.anIntArray3780[ClientScript.method633(31, Class49.anInt815++)] = var21;
                                                                     jString.anInt2147 = -1;
                                                                     return true;
                                                                  } else if(jString.anInt2147 != 104 && 121 != jString.anInt2147 && -98 != ~jString.anInt2147 && ~jString.anInt2147 != -15 && ~jString.anInt2147 != -203 && ~jString.anInt2147 != -136 && jString.anInt2147 != 186 && jString.anInt2147 != 218 && jString.anInt2147 != 39 && jString.anInt2147 != 112 && -21 != ~jString.anInt2147 && 16 != jString.anInt2147 && 17 != jString.anInt2147) {
                                                                     if(jString.anInt2147 == 137) {
                                                                        var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt();
                                                                           OverridedInterface var67 = (OverridedInterface)Class3_Sub13_Sub17.aClass130_3208.get((long)var3);
                                                                           if(null != var67) {
                                                                              Class3_Sub13_Sub18.removeOverrideInterface(var67, true);
                                                                           }

                                                                           if(null != Class3_Sub13_Sub7.aClass11_3087) {
                                                                              Class20.refreshInterface(Class3_Sub13_Sub7.aClass11_3087);
                                                                              Class3_Sub13_Sub7.aClass11_3087 = null;
                                                                        }

                                                                        jString.anInt2147 = -1;
                                                                        return true;
                                                                     } else if(jString.anInt2147 != 187) {
                                                                        /*if(jString.anInt2147 == 132) {
                                                                           var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                           var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShortA();
                                                                           var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShortA();
                                                                           var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt();
                                                                           Class153.method2143(var21, var6, var5, var20);

                                                                           jString.anInt2147 = -1;
                                                                           return true;
                                                                        } else */if(112 == jString.anInt2147) {
                                                                           Class65.anInt990 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                           Class107.anInt1452 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteC();

                                                                           for(var20 = Class65.anInt990; var20 < 8 + Class65.anInt990; ++var20) {
                                                                              for(var3 = Class107.anInt1452; ~var3 > ~(8 + Class107.anInt1452); ++var3) {
                                                                                 if(null != Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[Class26.plane][var20][var3]) {
                                                                                    Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[Class26.plane][var20][var3] = null;
                                                                                    Class128.spawnGroundItem(var3, var20);
                                                                                 }
                                                                              }
                                                                           }

                                                                           for(Class3_Sub4 var68 = (Class3_Sub4)Class3_Sub13_Sub6.aClass61_3075.getFirst(); null != var68; var68 = (Class3_Sub4)Class3_Sub13_Sub6.aClass61_3075.getNext()) {
                                                                              if(~var68.anInt2264 <= ~Class65.anInt990 && 8 + Class65.anInt990 > var68.anInt2264 && var68.anInt2248 >= Class107.anInt1452 && ~var68.anInt2248 > ~(8 + Class107.anInt1452) && var68.anInt2250 == Class26.plane) {
                                                                                 var68.anInt2259 = 0;
                                                                              }
                                                                           }

                                                                           jString.anInt2147 = -1;
                                                                           return true;
                                                                        } else if(jString.anInt2147 == 144) {
                                                                           var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt2();
                                                                           jInterface var65 = Class7.getInterface(var20);

                                                                           for(var21 = 0; var65.inventoryIds.length > var21; ++var21) {
                                                                              var65.inventoryIds[var21] = -1;
                                                                              var65.inventoryIds[var21] = 0;
                                                                           }

                                                                           Class20.refreshInterface(var65);
                                                                           jString.anInt2147 = -1;
                                                                           return true;
                                                                        } else if(-131 == ~jString.anInt2147) {
                                                                           var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getLEInt();
                                                                           var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShortA();
                                                                           if(var21 == '\uffff') {
                                                                              var21 = -1;
                                                                           }

                                                                           Class3_Sub13_Sub18.method256(-1, 1, var20, var21);

                                                                           jString.anInt2147 = -1;
                                                                           return true;
                                                                        } else if(-193 == ~jString.anInt2147) {
                                                                           Class161.anInt2028 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                           jString.anInt2147 = -1;
                                                                           return true;
                                                                        } else if(~jString.anInt2147 == -14) {
                                                                           var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteS();
                                                                           var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteA();
                                                                           var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                           Class26.plane = var3 >> 1;
                                                                           TextureLoader.selfPlayer.method1981(var20, ~(var3 & 1) == -2, var21);
                                                                           jString.anInt2147 = -1;
                                                                           return true;
                                                                        } else {
                                                                           int var12;
                                                                           jString var57;
                                                                           jString var64;
                                                                           if(-101 == ~jString.anInt2147) {
                                                                              /*var2 = SpotAnimation.aClass3_Sub30_Sub1_532.getLong();
                                                                              var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                              var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();*/
                                                                        	   jString name = SpotAnimation.aClass3_Sub30_Sub1_532.getString();
                                                                               var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                               var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                               var2 = name.toLong();
                                                                              var31 = true;
                                                                              if(var2 < 0L) {
                                                                                 var2 &= Long.MAX_VALUE;
                                                                                 var31 = false;
                                                                              }

                                                                              var41 = GroundItem.aClass94_3672;
                                                                              if(-1 > ~var21) {
                                                                                 var41 = SpotAnimation.aClass3_Sub30_Sub1_532.getString();
                                                                              }
                                                                              for(var33 = 0; var33 < Class8.anInt104; ++var33) {
                                                                                 if(var2 == Vertex.aLongArray826[var33]) {
                                                                                    if(~var21 != ~CursorType.anIntArray882[var33]) {
                                                                                       CursorType.anIntArray882[var33] = var21;
                                                                                       if(0 < var21) {
                                                                                          PacketBuffer.method805(GroundItem.aClass94_3672, client.method903(new jString[]{name, UpdateServerNode.aClass94_4058}), 5);
                                                                                       }

                                                                                       if(var21 == 0) {
                                                                                          PacketBuffer.method805(GroundItem.aClass94_3672, client.method903(new jString[]{name, Vertex.aClass94_822}), 5);
                                                                                       }
                                                                                    }

                                                                                    NodeSub.aClass94Array2566[var33] = var41;
                                                                                    Class57.anIntArray904[var33] = var5;
                                                                                    name = null;
                                                                                    Node.aBooleanArray73[var33] = var31;
                                                                                    break;
                                                                                 }
                                                                              }

                                                                              boolean var45 = false;
                                                                              if(null != name && 200 > Class8.anInt104) {
                                                                                 Vertex.aLongArray826[Class8.anInt104] = var2;
                                                                                 Class70.aClass94Array1046[Class8.anInt104] = name;
                                                                                 CursorType.anIntArray882[Class8.anInt104] = var21;
                                                                                 NodeSub.aClass94Array2566[Class8.anInt104] = var41;
                                                                                 Class57.anIntArray904[Class8.anInt104] = var5;
                                                                                 Node.aBooleanArray73[Class8.anInt104] = var31;
                                                                                 ++Class8.anInt104;
                                                                              }

                                                                              Class110.anInt1472 = Class3_Sub13_Sub17.anInt3213;
                                                                              var10 = Class8.anInt104;

                                                                              while(~var10 < -1) {
                                                                                 --var10;
                                                                                 var45 = true;

                                                                                 for(var11 = 0; var11 < var10; ++var11) {
                                                                                    if(~CursorType.anIntArray882[var11] != ~InterfaceListener.anInt2451 && ~InterfaceListener.anInt2451 == ~CursorType.anIntArray882[var11 - -1] || CursorType.anIntArray882[var11] == 0 && CursorType.anIntArray882[var11 - -1] != 0) {
                                                                                       var45 = false;
                                                                                       var12 = CursorType.anIntArray882[var11];
                                                                                       CursorType.anIntArray882[var11] = CursorType.anIntArray882[var11 - -1];
                                                                                       CursorType.anIntArray882[1 + var11] = var12;
                                                                                       var64 = NodeSub.aClass94Array2566[var11];
                                                                                       NodeSub.aClass94Array2566[var11] = NodeSub.aClass94Array2566[var11 + 1];
                                                                                       NodeSub.aClass94Array2566[var11 - -1] = var64;
                                                                                       var57 = Class70.aClass94Array1046[var11];
                                                                                       Class70.aClass94Array1046[var11] = Class70.aClass94Array1046[var11 + 1];
                                                                                       Class70.aClass94Array1046[var11 - -1] = var57;
                                                                                       long var15 = Vertex.aLongArray826[var11];
                                                                                       Vertex.aLongArray826[var11] = Vertex.aLongArray826[var11 - -1];
                                                                                       Vertex.aLongArray826[var11 - -1] = var15;
                                                                                       int var17 = Class57.anIntArray904[var11];
                                                                                       Class57.anIntArray904[var11] = Class57.anIntArray904[var11 - -1];
                                                                                       Class57.anIntArray904[1 + var11] = var17;
                                                                                       boolean var18 = Node.aBooleanArray73[var11];
                                                                                       Node.aBooleanArray73[var11] = Node.aBooleanArray73[var11 - -1];
                                                                                       Node.aBooleanArray73[var11 - -1] = var18;
                                                                                    }
                                                                                 }

                                                                                 if(var45) {
                                                                                    break;
                                                                                 }
                                                                              }

                                                                              jString.anInt2147 = -1;
                                                                              return true;
                                                                           } else if(-161 == ~jString.anInt2147) {
                                                                              if(0 != Hashtable.anInt1704) {
                                                                                 Class3_Sub13_Sub28.aClass94_3353 = SpotAnimation.aClass3_Sub30_Sub1_532.getString();
                                                                              } else {
                                                                                 Class3_Sub13_Sub28.aClass94_3353 = Class56.aClass94_891;
                                                                              }

                                                                              jString.anInt2147 = -1;
                                                                              return true;
                                                                           } else if(128 != jString.anInt2147) {
                                                                              if(~jString.anInt2147 == -155) {
                                                                                 var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                                 var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                                 var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                                 var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                                 var30 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                                 Class3_Sub20.method390(true, var6, var5, var30, (byte)-124, var21, var3);

                                                                                 jString.anInt2147 = -1;
                                                                                 return true;
                                                                              } else if(247 == jString.anInt2147) {
                                                                                 var2 = SpotAnimation.aClass3_Sub30_Sub1_532.getLong();
                                                                                 var4 = (long)SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                                 var29 = (long)SpotAnimation.aClass3_Sub30_Sub1_532.getMidInt();
                                                                                 var8 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                                 var33 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                                 boolean var49 = false;
                                                                                 long var51 = (var4 << -737495840) - -var29;
                                                                                 int var59 = 0;

                                                                                 label1603:
                                                                                 while(true) {
                                                                                    if(100 > var59) {
                                                                                       if(~var51 != ~Class163_Sub2_Sub1.aLongArray4017[var59]) {
                                                                                          ++var59;
                                                                                          continue;
                                                                                       }

                                                                                       var49 = true;
                                                                                       break;
                                                                                    }

                                                                                    if(var8 <= 1) {
                                                                                       for(var59 = 0; ~var59 > ~AnimationLoader.anInt3591; ++var59) {
                                                                                          if(var2 == Class114.aLongArray1574[var59]) {
                                                                                             var49 = true;
                                                                                             break label1603;
                                                                                          }
                                                                                       }
                                                                                    }
                                                                                    break;
                                                                                 }

                                                                                 if(!var49 && ~Class44_Sub1.anInt2622 == -1) {
                                                                                    Class163_Sub2_Sub1.aLongArray4017[MouseHandler.anInt1921] = var51;
                                                                                    MouseHandler.anInt1921 = (1 + MouseHandler.anInt1921) % 100;
                                                                                    var64 = StringNode.method733(var33).method555(28021, SpotAnimation.aClass3_Sub30_Sub1_532);
                                                                                    if(-3 == ~var8) {
                                                                                       InvType.appendChatMessage(18, var64, (jString)null, client.method903(new jString[]{Class21.aClass94_444, FileSystem.longToString(var2).upperCase()}));
                                                                                    } else if(1 == var8) {
                                                                                       InvType.appendChatMessage(18, var64, (jString)null, client.method903(new jString[]{Class32.aClass94_592, FileSystem.longToString(var2).upperCase()}));
                                                                                    } else {
                                                                                       InvType.appendChatMessage(18, var64, (jString)null, FileSystem.longToString(var2).upperCase());
                                                                                    }
                                                                                 }

                                                                                 jString.anInt2147 = -1;
                                                                                 return true;
                                                                              } else {
                                                                                 OverridedInterface var26;
                                                                                 if(~jString.anInt2147 != -177) {
                                                                                    if(jString.anInt2147 != 27) {
                                                                                       if(jString.anInt2147 == 2) {
                                                                                          var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt1();
                                                                                          var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShortA();
                                                                                             VarBit.method1385(var21, var20);

                                                                                          jString.anInt2147 = -1;
                                                                                          return true;
                                                                                       } else if(jString.anInt2147 == 30) {
                                                                                          Class38_Sub1.systemUpdateCycle = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort() * 30;
                                                                                          jString.anInt2147 = -1;
                                                                                          Class140_Sub6.anInt2905 = Class3_Sub13_Sub17.anInt3213;
                                                                                          return true;
                                                                                       }/* else if(~jString.anInt2147 == -115) {
                                                                                          Class3_Sub13_Sub29.method305(Class38.gameSignlink, SpotAnimation.aClass3_Sub30_Sub1_532, Hashtable.anInt1704, (byte)-126);
                                                                                          jString.anInt2147 = -1;
                                                                                          return true;
                                                                                       } else */ else if(9 == jString.anInt2147) {
                                                                                          var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt1();
                                                                                          var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
                                                                                          Class3_Sub13_Sub18.method255(var21, var3);
                                                                                          jString.anInt2147 = -1;
                                                                                          return true;
                                                                                       } else if(jString.anInt2147 == 163) {
                                                                                          PacketBuffer.method819(false);
                                                                                          Class9.energy = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                                          Class140_Sub6.anInt2905 = Class3_Sub13_Sub17.anInt3213;
                                                                                          jString.anInt2147 = -1;
                                                                                          return true;
                                                                                       } else if(~jString.anInt2147 == -210) {
                                                                                          if(-1 != InvType.mainScreenInterface) {
                                                                                             Class3_Sub8.method124(0, InvType.mainScreenInterface);
                                                                                          }

                                                                                          jString.anInt2147 = -1;
                                                                                          return true;
                                                                                       } else if(~jString.anInt2147 != -192) {
                                                                                          if(-103 == ~jString.anInt2147) {
                                                                                             var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
                                                                                             var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteS();
                                                                                             var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                                             Npc var39 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var20];
                                                                                             if(null != var39) {
                                                                                                Hashtable.method1772(var3, var21, 39, var39);
                                                                                             }

                                                                                             jString.anInt2147 = -1;
                                                                                             return true;
                                                                                          } else if(jString.anInt2147 != 159) {
                                                                                             if(jString.anInt2147 == 23) {
                                                                                                jString name = SpotAnimation.aClass3_Sub30_Sub1_532.getString();
                                                                                                var58 = Font.method686(Class32.method992(SpotAnimation.aClass3_Sub30_Sub1_532).method1536(121));
                                                                                                PacketBuffer.method805(name.upperCase(), var58, 6);
                                                                                                jString.anInt2147 = -1;
                                                                                                return true;
                                                                                             } else if(-43 != ~jString.anInt2147) {
                                                                                                if(-112 == ~jString.anInt2147) {
                                                                                                   var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt2();
                                                                                                   var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShortA();
                                                                                                   var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
                                                                                                   var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShortA();
                                                                                                   Class3_Sub13_Sub18.method256(var21, 7, var3, var5 << -311274832 | var6);
                                                                                                   jString.anInt2147 = -1;
                                                                                                   return true;
                                                                                                } else if(37 == jString.anInt2147) {
                                                                                                   int id = SpotAnimation.aClass3_Sub30_Sub1_532.getUShortA();
                                                                                                   int value = SpotAnimation.aClass3_Sub30_Sub1_532.getLEInt();
                                                                                                   Class3_Sub13_Sub23.method281(value, id);
                                                                                                   //Class163.method2209(value, id);
                                                                                                   jString.anInt2147 = -1;
                                                                                                   return true;
                                                                                                } else if(jString.anInt2147 == 238) {
                                                                                                   var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt1();
                                                                                                   var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                                                   var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteC();
                                                                                                   var26 = (OverridedInterface)Class3_Sub13_Sub17.aClass130_3208.get((long)var3);
                                                                                                   if(null != var26) {
                                                                                                	   Class3_Sub13_Sub18.removeOverrideInterface(var26, var26.uid != var5);
                                                                                                   }

                                                                                                   Class21.overrideInterface(var5, var3, var20);

                                                                                                   jString.anInt2147 = -1;
                                                                                                   return true;
                                                                                                } else if(~jString.anInt2147 == -132) {
                                                                                                   for(var20 = 0; var20 < Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269.length; ++var20) {
                                                                                                      if(Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var20] != null) {
                                                                                                         Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var20].currentAnimationId = -1;
                                                                                                      }
                                                                                                   }

                                                                                                   for(var20 = 0; ~Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292.length < ~var20; ++var20) {
                                                                                                      if(null != Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var20]) {
                                                                                                         Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var20].currentAnimationId = -1;
                                                                                                      }
                                                                                                   }

                                                                                                   jString.anInt2147 = -1;
                                                                                                   return true;
                                                                                                } else if(~jString.anInt2147 == -218) {
                                                                                                   var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                                                   HintIcon var48 = new HintIcon();
                                                                                                   var3 = var20 >> 340093798;
                                                                                                   var48.anInt1360 = var20 & 63;
                                                                                                   var48.anInt1351 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                                                   if(~var48.anInt1351 <= -1 && ~var48.anInt1351 > ~Class166.aClass3_Sub28_Sub16Array2072.length) {
                                                                                                      if(~var48.anInt1360 != -2 && 10 != var48.anInt1360) {
                                                                                                         if(-3 >= ~var48.anInt1360 && 6 >= var48.anInt1360) {
                                                                                                            if(var48.anInt1360 == 2) {
                                                                                                               var48.anInt1346 = 64;
                                                                                                               var48.anInt1350 = 64;
                                                                                                            }

                                                                                                            if(-4 == ~var48.anInt1360) {
                                                                                                               var48.anInt1346 = 0;
                                                                                                               var48.anInt1350 = 64;
                                                                                                            }

                                                                                                            if(4 == var48.anInt1360) {
                                                                                                               var48.anInt1346 = 128;
                                                                                                               var48.anInt1350 = 64;
                                                                                                            }

                                                                                                            if(5 == var48.anInt1360) {
                                                                                                               var48.anInt1346 = 64;
                                                                                                               var48.anInt1350 = 0;
                                                                                                            }

                                                                                                            if(-7 == ~var48.anInt1360) {
                                                                                                               var48.anInt1346 = 64;
                                                                                                               var48.anInt1350 = 128;
                                                                                                            }

                                                                                                            var48.anInt1360 = 2;
                                                                                                            var48.anInt1356 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                                                            var48.anInt1347 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                                                            var48.anInt1353 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                                                         }
                                                                                                      } else {
                                                                                                         var48.anInt1359 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                                                         SpotAnimation.aClass3_Sub30_Sub1_532.pos += 3;
                                                                                                      }

                                                                                                      var48.anInt1355 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                                                      if(var48.anInt1355 == '\uffff') {
                                                                                                         var48.anInt1355 = -1;
                                                                                                      }

                                                                                                      RuntimeException_Sub1.aClass96Array2114[var3] = var48;
                                                                                                   }

                                                                                                   jString.anInt2147 = -1;
                                                                                                   return true;
                                                                                                } else if(75 == jString.anInt2147) {//TODO - fix / 8 shit
                                                                                                   AnimationLoader.anInt3591 = Hashtable.anInt1704 / 8;
                                                                                                   for(var20 = 0; ~var20 > ~AnimationLoader.anInt3591; ++var20) {
                                                                                                	   jString name = SpotAnimation.aClass3_Sub30_Sub1_532.getString();
                                                                                                      Class114.aLongArray1574[var20] = name.toLong();
                                                                                                      Class3_Sub13_Sub27.aClass94Array3341[var20] = name;
                                                                                                   }
                                                                                                   Class110.anInt1472 = Class3_Sub13_Sub17.anInt3213;
                                                                                                   jString.anInt2147 = -1;
                                                                                                   return true;
                                                                                                } else if(jString.anInt2147 == 174) {
                                                                                                   Class3_Sub13_Sub14.method237(8169);
                                                                                                   jString.anInt2147 = -1;
                                                                                                   return true;
                                                                                                } else if(201 == jString.anInt2147) {
                                                                                                   var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getLEInt();
                                                                                                   var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getShort();
                                                                                                   var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getShortA();
                                                                                                   UnderlayType.method2271(var21, var3, var5);

                                                                                                   jString.anInt2147 = -1;
                                                                                                   return true;
                                                                                                } else if(jString.anInt2147 == 235) {
                                                                                                   var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteS();
                                                                                                   var3 = var20 >> -518983614;
                                                                                                   var21 = 3 & var20;
                                                                                                   var5 = Class75.anIntArray1107[var3];
                                                                                                   var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                                                   var30 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt();
                                                                                                   if('\uffff' == var6) {
                                                                                                      var6 = -1;
                                                                                                   }

                                                                                                   var10 = 16383 & var30;
                                                                                                   var33 = 16383 & var30 >> 2070792462;
                                                                                                   var33 -= Class131.anInt1716;
                                                                                                   var10 -= Class82.anInt1152;
                                                                                                   var8 = 3 & var30 >> 765199868;
                                                                                                   Vertex.method1131(var8, 110, var21, var3, var10, var5, var33, var6);
                                                                                                   jString.anInt2147 = -1;
                                                                                                   return true;
                                                                                                } else if(jString.anInt2147 == 50) {
                                                                                                   jString name = SpotAnimation.aClass3_Sub30_Sub1_532.getString();
                                                                                                   var4 = (long)SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                                                   var29 = (long)SpotAnimation.aClass3_Sub30_Sub1_532.getMidInt();
                                                                                                   var8 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                                                   boolean var42 = false;
                                                                                                   long var35 = var29 + (var4 << -1802335520);
                                                                                                   var12 = 0;

                                                                                                   label1651:
                                                                                                   while(true) {
                                                                                                      if(-101 >= ~var12) {
                                                                                                         if(var8 <= 1) {
                                                                                                            if((!Class3_Sub15.aBoolean2433 || Class121.aBoolean1641) && !Class3_Sub13_Sub14.aBoolean3166) {
                                                                                                               for(var12 = 0; var12 < AnimationLoader.anInt3591; ++var12) {
                                                                                                                  if(~name.toLong() == ~Class114.aLongArray1574[var12]) {
                                                                                                                     var42 = true;
                                                                                                                     break label1651;
                                                                                                                  }
                                                                                                               }
                                                                                                            } else {
                                                                                                               var42 = true;
                                                                                                            }
                                                                                                         }
                                                                                                         break;
                                                                                                      }

                                                                                                      if(~var35 == ~Class163_Sub2_Sub1.aLongArray4017[var12]) {
                                                                                                         var42 = true;
                                                                                                         break;
                                                                                                      }

                                                                                                      ++var12;
                                                                                                   }

                                                                                                   if(!var42 && -1 == ~Class44_Sub1.anInt2622) {
                                                                                                      Class163_Sub2_Sub1.aLongArray4017[MouseHandler.anInt1921] = var35;
                                                                                                      MouseHandler.anInt1921 = (MouseHandler.anInt1921 - -1) % 100;
                                                                                                      jString var52 = Font.method686(Class32.method992(SpotAnimation.aClass3_Sub30_Sub1_532).method1536(96));
                                                                                                      if(-3 != ~var8 && ~var8 != -4) {
                                                                                                         if(var8 != 1) {
                                                                                                            PacketBuffer.method805(name.upperCase(), var52, 3);
                                                                                                         } else {
                                                                                                            PacketBuffer.method805(client.method903(new jString[]{Class32.aClass94_592, name.upperCase()}), var52, 7);
                                                                                                         }
                                                                                                      } else {
                                                                                                         PacketBuffer.method805(client.method903(new jString[]{Class21.aClass94_444, name.upperCase()}), var52, 7);
                                                                                                      }
                                                                                                   }

                                                                                                   jString.anInt2147 = -1;
                                                                                                   return true;
                                                                                                } else if(-55 != ~jString.anInt2147) {
                                                                                                   if(jString.anInt2147 == 222) {
                                                                                                      Class39.method1033(true);
                                                                                                      jString.anInt2147 = -1;
                                                                                                      return true;
                                                                                                   } else if(~jString.anInt2147 != -173) {
                                                                                                      if(8 == jString.anInt2147) {
                                                                                                         var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getLEInt();
                                                                                                            var21 = 0;
                                                                                                            if(TextureLoader.selfPlayer.playerAppearance != null) {
                                                                                                               var21 = TextureLoader.selfPlayer.playerAppearance.method1163(-24861);
                                                                                                            }
                                                                                                            Class3_Sub13_Sub18.method256(-1, 3, var3, var21);
                                                                                                         jString.anInt2147 = -1;
                                                                                                         return true;
                                                                                                      } else if(jString.anInt2147 == 47) {
                                                                                                         var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt1();
                                                                                                         var24 = SpotAnimation.aClass3_Sub30_Sub1_532.getString();
                                                                                                         AbstractObjectCache.renameText(var24, var20);

                                                                                                         jString.anInt2147 = -1;
                                                                                                         return true;
                                                                                                      } else {
                                                                                                         jInterface var25;
                                                                                                         if(jString.anInt2147 != 120) {
                                                                                                            if(jString.anInt2147 == 24) {
                                                                                                            	AnimationLoader.method560(-21556);
                                                                                                               jString.anInt2147 = -1;
                                                                                                               return true;
                                                                                                            } else if(jString.anInt2147 == 167) {
                                                                                                               Class167.processLogout();
                                                                                                               jString.anInt2147 = -1;
                                                                                                               return false;
                                                                                                            } else if(116 == jString.anInt2147) {
                                                                                                               var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                                                               if(-1 != ~SpotAnimation.aClass3_Sub30_Sub1_532.getUByte()) {
                                                                                                                  --SpotAnimation.aClass3_Sub30_Sub1_532.pos;
                                                                                                                  Class3_Sub13_Sub33.aClass133Array3393[var20] = new GrandExchangeItem(SpotAnimation.aClass3_Sub30_Sub1_532);
                                                                                                               } else {
                                                                                                                  Class3_Sub13_Sub33.aClass133Array3393[var20] = new GrandExchangeItem();
                                                                                                               }

                                                                                                               jString.anInt2147 = -1;
                                                                                                               Class121.anInt1642 = Class3_Sub13_Sub17.anInt3213;
                                                                                                               return true;
                                                                                                            } else if(207 == jString.anInt2147) {
                                                                                                               var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShortA();
                                                                                                               var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt();
                                                                                                               if(~var20 == -65536) {
                                                                                                                  var20 = -1;
                                                                                                               }
                                                                                                               Class3_Sub13_Sub18.method256(-1, 2, var3, var20);

                                                                                                               jString.anInt2147 = -1;
                                                                                                               return true;
                                                                                                            } else if(jString.anInt2147 == 221) {//TODO map region
                                                                                                               Class39.method1033(false);
                                                                                                               jString.anInt2147 = -1;
                                                                                                               return true;
                                                                                                            } else if(254 != jString.anInt2147) {
                                                                                                               if(jString.anInt2147 == 152) {
                                                                                                                  HintIcon.anInt1357 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                                                                  Class110.anInt1472 = Class3_Sub13_Sub17.anInt3213;
                                                                                                                  jString.anInt2147 = -1;
                                                                                                                  return true;
                                                                                                               } else if(jString.anInt2147 != 196) {
                                                                                                                  if(114 != jString.anInt2147) {
                                                                                                                     if(jString.anInt2147 != 92) {
                                                                                                                        /*if(~jString.anInt2147 == -143) {
                                                                                                                           StringNode.method734(0, SpotAnimation.aClass3_Sub30_Sub1_532.getString());
                                                                                                                           jString.anInt2147 = -1;
                                                                                                                           return true;
                                                                                                                        } else */if(jString.anInt2147 != 132) {
                                                                                                                           if(4 == jString.anInt2147) {
                                                                                                                              var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShortA();
                                                                                                                              if(var20 == '\uffff') {
                                                                                                                                 var20 = -1;
                                                                                                                              }

                                                                                                                              Class86.method1427(true, var20);
                                                                                                                              jString.anInt2147 = -1;
                                                                                                                              return true;
                                                                                                                           } else if(jString.anInt2147 != 208) {
                                                                                                                              Class49.method1125("T1 - " + jString.anInt2147 + "," + Class7.anInt2166 + "," + IdentityKit.anInt469 + " - " + Hashtable.anInt1704, (Throwable)null);
                                                                                                                              Class167.processLogout();
                                                                                                                              return true;
                                                                                                                           } else {
                                                                                                                              var20 = SpotAnimation.aClass3_Sub30_Sub1_532.method755((byte)-118);
                                                                                                                              var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
                                                                                                                              if(var3 == '\uffff') {
                                                                                                                                 var3 = -1;
                                                                                                                              }

                                                                                                                              Class167.method2266(var20, var3, (byte)-1);
                                                                                                                              jString.anInt2147 = -1;
                                                                                                                              return true;
                                                                                                                           }
                                                                                                                        } else {
                                                                                                                        	Class107.anInt1452 = SpotAnimation.aClass3_Sub30_Sub1_532.getByte();
                                                                                                                            Class65.anInt990 = SpotAnimation.aClass3_Sub30_Sub1_532.getByte();
                                                                                                                           jString.anInt2147 = -1;
                                                                                                                           return true;
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt();
                                                                                                                        var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                                                                        if(~var20 > 69999) {
                                                                                                                           var3 += '\u8000';
                                                                                                                        }
                                                                                                                        if(0 <= var20) {
                                                                                                                           var25 = Class7.getInterface(var20);
                                                                                                                        } else {
                                                                                                                           var25 = null;
                                                                                                                        }
                                                                                                                        if(var25 != null) {
                                                                                                                           for(var5 = 0; var25.inventoryIds.length > var5; ++var5) {
                                                                                                                              var25.inventoryIds[var5] = 0;
                                                                                                                              var25.inventoryAmounts[var5] = 0;
                                                                                                                           }
                                                                                                                        }
                                                                                                                        Class10.method852((byte)114, var3);
                                                                                                                        var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                                                                        for(var6 = 0; var5 > var6; ++var6) {
                                                                                                                           var30 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteC();
                                                                                                                           if(255 == var30) {
                                                                                                                              var30 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt();
                                                                                                                           }
                                                                                                                           var8 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
                                                                                                                           if(null != var25 && ~var6 > ~var25.inventoryIds.length) {
                                                                                                                              var25.inventoryIds[var6] = var8;
                                                                                                                              var25.inventoryAmounts[var6] = var30 == 0 ? -1 : var30;
                                                                                                                           }

                                                                                                                           UnderlayType.method2277(-1 + var8, var6, var30, var3, (byte)41);
                                                                                                                        }

                                                                                                                        if(var25 != null) {
                                                                                                                           Class20.refreshInterface(var25);
                                                                                                                        }

                                                                                                                        PacketBuffer.method819(false);
                                                                                                                        Class3_Sub28_Sub4.anIntArray3565[ClientScript.method633(Class62.anInt944++, 31)] = ClientScript.method633(32767, var3);
                                                                                                                        jString.anInt2147 = -1;
                                                                                                                        return true;
                                                                                                                     }
                                                                                                                  } else {
                                                                                                                     var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getLEInt();
                                                                                                                     var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getShort();
                                                                                                                     var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getLEInt();
                                                                                                                     if('\uffff' == var21) {
                                                                                                                        var21 = -1;
                                                                                                                     }
                                                                                                                        jInterface var34 = Class7.getInterface(var3);
                                                                                                                        ItemDefinition var43;
                                                                                                                        if(var34.scriptedInterface) {
                                                                                                                           Class140_Sub6.method2026((byte)122, var3, var20, var21);
                                                                                                                           var43 = ItemDefinition.method1023(var21);
                                                                                                                           js5.method2143(var43.anInt810, var3, var43.anInt799, var43.anInt786);
                                                                                                                           Class84.method1420(var3, var43.anInt768, var43.anInt754, var43.anInt792);
                                                                                                                        } else {
                                                                                                                           if(-1 == var21) {
                                                                                                                              var34.mediaTypeDisabled = 0;
                                                                                                                              jString.anInt2147 = -1;
                                                                                                                              return true;
                                                                                                                           }

                                                                                                                           var43 = ItemDefinition.method1023(var21);
                                                                                                                           var34.rotateX = var43.anInt786;
                                                                                                                           var34.zoom = 100 * var43.anInt810 / var20;
                                                                                                                           var34.mediaTypeDisabled = 4;
                                                                                                                           var34.mediaIdDisabled = var21;
                                                                                                                           var34.rotateY = var43.anInt799;
                                                                                                                           Class20.refreshInterface(var34);
                                                                                                                        }

                                                                                                                     jString.anInt2147 = -1;
                                                                                                                     return true;
                                                                                                                  }
                                                                                                               } else {
                                                                                                                  var2 = SpotAnimation.aClass3_Sub30_Sub1_532.getLong();
                                                                                                                  var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                                                                  byte var28 = SpotAnimation.aClass3_Sub30_Sub1_532.getByte();
                                                                                                                  var31 = false;
                                                                                                                  if(-1L != ~(Long.MIN_VALUE & var2)) {
                                                                                                                     var31 = true;
                                                                                                                  }

                                                                                                                  if(!var31) {
                                                                                                                     var41 = SpotAnimation.aClass3_Sub30_Sub1_532.getString();
                                                                                                                     ClanMember var40 = new ClanMember();
                                                                                                                     var40.hash = var2;
                                                                                                                     var40.name = FileSystem.longToString(var40.hash);
                                                                                                                     var40.aByte2472 = var28;
                                                                                                                     var40.aClass94_2473 = var41;
                                                                                                                     var40.anInt2478 = var21;

                                                                                                                     for(var33 = -1 + NodeSub.anInt2572; ~var33 <= -1; --var33) {
                                                                                                                        var10 = ClientScript.clanMembers[var33].name.method1559(var40.name);
                                                                                                                        if(-1 == ~var10) {
                                                                                                                           ClientScript.clanMembers[var33].anInt2478 = var21;
                                                                                                                           ClientScript.clanMembers[var33].aByte2472 = var28;
                                                                                                                           ClientScript.clanMembers[var33].aClass94_2473 = var41;
                                                                                                                           if(~var2 == ~Class3_Sub13_Sub16.aLong3202) {
                                                                                                                              CollisionMap.aByte1308 = var28;
                                                                                                                           }

                                                                                                                           Class167.anInt2087 = Class3_Sub13_Sub17.anInt3213;
                                                                                                                           jString.anInt2147 = -1;
                                                                                                                           return true;
                                                                                                                        }

                                                                                                                        if(var10 < 0) {
                                                                                                                           break;
                                                                                                                        }
                                                                                                                     }

                                                                                                                     if(ClientScript.clanMembers.length <= NodeSub.anInt2572) {
                                                                                                                        jString.anInt2147 = -1;
                                                                                                                        return true;
                                                                                                                     }

                                                                                                                     for(var10 = NodeSub.anInt2572 + -1; ~var33 > ~var10; --var10) {
                                                                                                                        ClientScript.clanMembers[1 + var10] = ClientScript.clanMembers[var10];
                                                                                                                     }

                                                                                                                     if(-1 == ~NodeSub.anInt2572) {
                                                                                                                        ClientScript.clanMembers = new ClanMember[100];
                                                                                                                     }

                                                                                                                     ClientScript.clanMembers[1 + var33] = var40;
                                                                                                                     if(Class3_Sub13_Sub16.aLong3202 == var2) {
                                                                                                                        CollisionMap.aByte1308 = var28;
                                                                                                                     }

                                                                                                                     ++NodeSub.anInt2572;
                                                                                                                  } else {
                                                                                                                     if(~NodeSub.anInt2572 == -1) {
                                                                                                                        jString.anInt2147 = -1;
                                                                                                                        return true;
                                                                                                                     }

                                                                                                                     boolean var37 = false;
                                                                                                                     var2 &= Long.MAX_VALUE;

                                                                                                                     for(var30 = 0; ~NodeSub.anInt2572 < ~var30 && (var2 != ClientScript.clanMembers[var30].hash || ~var21 != ~ClientScript.clanMembers[var30].anInt2478); ++var30) {
                                                                                                                        ;
                                                                                                                     }

                                                                                                                     if(var30 < NodeSub.anInt2572) {
                                                                                                                        while(~(-1 + NodeSub.anInt2572) < ~var30) {
                                                                                                                           ClientScript.clanMembers[var30] = ClientScript.clanMembers[1 + var30];
                                                                                                                           ++var30;
                                                                                                                        }

                                                                                                                        --NodeSub.anInt2572;
                                                                                                                        ClientScript.clanMembers[NodeSub.anInt2572] = null;
                                                                                                                     }
                                                                                                                  }

                                                                                                                  jString.anInt2147 = -1;
                                                                                                                  Class167.anInt2087 = Class3_Sub13_Sub17.anInt3213;
                                                                                                                  return true;
                                                                                                               }
                                                                                                            } else {
                                                                                                               var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
                                                                                                               if(var3 == '\uffff') {
                                                                                                                  var3 = -1;
                                                                                                               }

                                                                                                               var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt();
                                                                                                               var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShortA();
                                                                                                               var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt1();
                                                                                                               if(~var5 == -65536) {
                                                                                                                  var5 = -1;
                                                                                                               }

                                                                                                                  for(var30 = var5; ~var3 <= ~var30; ++var30) {
                                                                                                                     var36 = ((long)var21 << -1381724512) - -((long)var30);
                                                                                                                     var47 = (ClickMaskNode)Class124.aClass130_1659.get(var36);
                                                                                                                     if(var47 == null) {
                                                                                                                        if(-1 == var30) {
                                                                                                                           var38 = new ClickMaskNode(var6, Class7.getInterface(var21).clickMask.anInt2202);
                                                                                                                        } else {
                                                                                                                           var38 = new ClickMaskNode(var6, -1);
                                                                                                                        }
                                                                                                                     } else {
                                                                                                                        var38 = new ClickMaskNode(var6, var47.anInt2202);
                                                                                                                        var47.unlink();
                                                                                                                     }

                                                                                                                     Class124.aClass130_1659.put(var38, var36);
                                                                                                                  }

                                                                                                               jString.anInt2147 = -1;
                                                                                                               return true;
                                                                                                            }
                                                                                                         } else {
                                                                                                            var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt();
                                                                                                            var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                                                            if(69999 < ~var20) {
                                                                                                               var3 += '\u8000';
                                                                                                            }

                                                                                                            if(var20 < 0) {
                                                                                                               var25 = null;
                                                                                                            } else {
                                                                                                               var25 = Class7.getInterface(var20);
                                                                                                            }

                                                                                                            for(; ~SpotAnimation.aClass3_Sub30_Sub1_532.pos > ~Hashtable.anInt1704; UnderlayType.method2277(var6 + -1, var5, var30, var3, (byte)46)) {
                                                                                                               var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getSmart();
                                                                                                               var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                                                               var30 = 0;
                                                                                                               if(var6 != 0) {
                                                                                                                  var30 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                                                                  if(-256 == ~var30) {
                                                                                                                     var30 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt();
                                                                                                                  }
                                                                                                               }

                                                                                                               if(var25 != null && ~var5 <= -1 && ~var25.inventoryIds.length < ~var5) {
                                                                                                                  var25.inventoryIds[var5] = var6;
                                                                                                                  var25.inventoryAmounts[var5] = var30;
                                                                                                               }
                                                                                                            }

                                                                                                            if(var25 != null) {
                                                                                                               Class20.refreshInterface(var25);
                                                                                                            }

                                                                                                            PacketBuffer.method819(false);
                                                                                                            Class3_Sub28_Sub4.anIntArray3565[ClientScript.method633(Class62.anInt944++, 31)] = ClientScript.method633(32767, var3);
                                                                                                            jString.anInt2147 = -1;
                                                                                                            return true;
                                                                                                         }
                                                                                                      }
                                                                                                   } else {
                                                                                                      var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                                                      var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                                                      if(-65536 == ~var20) {
                                                                                                         var20 = -1;
                                                                                                      }

                                                                                                      var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                                                      Class3_Sub13_Sub6.method199(var3, var20, var21, -799);
                                                                                                      jString.anInt2147 = -1;
                                                                                                      return true;
                                                                                                   }
                                                                                                } else {
                                                                                                   var2 = SpotAnimation.aClass3_Sub30_Sub1_532.getLong();
                                                                                                   SpotAnimation.aClass3_Sub30_Sub1_532.getByte();
                                                                                                   var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getLong();
                                                                                                   var29 = (long)SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                                                   var36 = (long)SpotAnimation.aClass3_Sub30_Sub1_532.getMidInt();
                                                                                                   long var44 = (var29 << -164903776) + var36;
                                                                                                   var10 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                                                   boolean var13 = false;
                                                                                                   int var14 = 0;

                                                                                                   label1774:
                                                                                                   while(true) {
                                                                                                      if(var14 >= 100) {
                                                                                                         if(1 >= var10) {
                                                                                                            if((!Class3_Sub15.aBoolean2433 || Class121.aBoolean1641) && !Class3_Sub13_Sub14.aBoolean3166) {
                                                                                                               for(var14 = 0; AnimationLoader.anInt3591 > var14; ++var14) {
                                                                                                                  if(Class114.aLongArray1574[var14] == var2) {
                                                                                                                     var13 = true;
                                                                                                                     break label1774;
                                                                                                                  }
                                                                                                               }
                                                                                                            } else {
                                                                                                               var13 = true;
                                                                                                            }
                                                                                                         }
                                                                                                         break;
                                                                                                      }

                                                                                                      if(Class163_Sub2_Sub1.aLongArray4017[var14] == var44) {
                                                                                                         var13 = true;
                                                                                                         break;
                                                                                                      }

                                                                                                      ++var14;
                                                                                                   }

                                                                                                   if(!var13 && 0 == Class44_Sub1.anInt2622) {
                                                                                                      Class163_Sub2_Sub1.aLongArray4017[MouseHandler.anInt1921] = var44;
                                                                                                      MouseHandler.anInt1921 = (MouseHandler.anInt1921 + 1) % 100;
                                                                                                      var57 = Font.method686(Class32.method992(SpotAnimation.aClass3_Sub30_Sub1_532).method1536(116));
                                                                                                      if(-3 != ~var10 && -4 != ~var10) {
                                                                                                         if(~var10 == -2) {
                                                                                                            Class3_Sub13_Sub11.method221(-1, var57, client.method903(new jString[]{Class32.aClass94_592, FileSystem.longToString(var2).upperCase()}), FileSystem.longToString(var4).upperCase(), 9);
                                                                                                         } else {
                                                                                                            Class3_Sub13_Sub11.method221(-1, var57, FileSystem.longToString(var2).upperCase(), FileSystem.longToString(var4).upperCase(), 9);
                                                                                                         }
                                                                                                      } else {
                                                                                                         Class3_Sub13_Sub11.method221(-1, var57, client.method903(new jString[]{Class21.aClass94_444, FileSystem.longToString(var2).upperCase()}), FileSystem.longToString(var4).upperCase(), 9);
                                                                                                      }
                                                                                                   }

                                                                                                   jString.anInt2147 = -1;
                                                                                                   return true;
                                                                                                }
                                                                                             } else {
                                                                                                if(null != Class3_Sub13_Sub10.fullscreenFrame) {
                                                                                                   SceneGraphNode.method1862(false, NodeSub.anInt2577, -1, -1);
                                                                                                }

                                                                                                byte[] var22 = new byte[Hashtable.anInt1704];
                                                                                                SpotAnimation.aClass3_Sub30_Sub1_532.getBytesIsaac(var22, 0, Hashtable.anInt1704);
                                                                                                var24 = Class3_Sub13_Sub3.bufferToString(var22, 0, Hashtable.anInt1704);
                                                                                                /*if(null == Class3_Sub13_Sub7.aFrame3092 && (3 == Signlink.anInt1214 || !Signlink.osName.startsWith("win") || Class106.aBoolean1451)) {
                                                                                                   Class99.method1596(var24, true);
                                                                                                } else {
                                                                                                   Class3_Sub13_Sub24.aClass94_3295 = var24;
                                                                                                   jString.aBoolean2154 = true;
                                                                                                   Class15.aClass64_351 = Class38.gameSignlink.method1452(new String(var24.method1568(0), "ISO-8859-1"), true);
                                                                                                }*/

                                                                                                jString.anInt2147 = -1;
                                                                                                return true;
                                                                                             }
                                                                                          } else {
                                                                                             PacketBuffer.method819(false);
                                                                                             MouseHandler.weigth = SpotAnimation.aClass3_Sub30_Sub1_532.getShort();
                                                                                             Class140_Sub6.anInt2905 = Class3_Sub13_Sub17.anInt3213;
                                                                                             jString.anInt2147 = -1;
                                                                                             return true;
                                                                                          }
                                                                                       } else {
                                                                                          var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
                                                                                          Class3_Sub28_Sub1.method532(var20);
                                                                                          Class3_Sub28_Sub4.anIntArray3565[ClientScript.method633(31, Class62.anInt944++)] = ClientScript.method633(var20, 32767);
                                                                                          jString.anInt2147 = -1;
                                                                                          return true;
                                                                                       }
                                                                                    } else {
                                                                                       var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                                       var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                                       var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                                       var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                                                                                       var30 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                                          Class104.aBooleanArray2169[var3] = true;
                                                                                          Class3_Sub13_Sub32.anIntArray3383[var3] = var21;
                                                                                          Class166.anIntArray2073[var3] = var5;
                                                                                          Class3_Sub13_Sub29.anIntArray3359[var3] = var6;
                                                                                          Class163_Sub1_Sub1.anIntArray4009[var3] = var30;

                                                                                       jString.anInt2147 = -1;
                                                                                       return true;
                                                                                    }
                                                                                 } else {
                                                                                    var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt1();
                                                                                    var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt1();
                                                                                       OverridedInterface var23 = (OverridedInterface)Class3_Sub13_Sub17.aClass130_3208.get((long)var20);
                                                                                       var26 = (OverridedInterface)Class3_Sub13_Sub17.aClass130_3208.get((long)var21);
                                                                                       if(null != var26) {
                                                                                          Class3_Sub13_Sub18.removeOverrideInterface(var26, null == var23 || var26.uid != var23.uid);
                                                                                       }

                                                                                       if(null != var23) {
                                                                                          var23.unlink();
                                                                                          Class3_Sub13_Sub17.aClass130_3208.put(var23, (long)var21);
                                                                                       }

                                                                                       jInterface var27 = Class7.getInterface(var20);
                                                                                       if(var27 != null) {
                                                                                          Class20.refreshInterface(var27);
                                                                                       }

                                                                                       var27 = Class7.getInterface(var21);
                                                                                       if(null != var27) {
                                                                                          Class20.refreshInterface(var27);
                                                                                          js5Worker.method2104(var27, true, 48);
                                                                                       }

                                                                                       if(0 != ~InvType.mainScreenInterface) {
                                                                                          Class3_Sub8.method124(1, InvType.mainScreenInterface);
                                                                                       }

                                                                                    jString.anInt2147 = -1;
                                                                                    return true;
                                                                                 }
                                                                              }
                                                                           } else {
                                                                              for(var20 = 0; ~Class163_Sub1.variousSettings.length < ~var20; ++var20) {
                                                                                 if(~Class57.anIntArray898[var20] != ~Class163_Sub1.variousSettings[var20]) {
                                                                                    Class163_Sub1.variousSettings[var20] = Class57.anIntArray898[var20];
                                                                                    Class46.method1087(98, var20);
                                                                                    Class44.anIntArray726[ClientScript.method633(Huffman.anInt641++, 31)] = var20;
                                                                                 }
                                                                              }

                                                                              jString.anInt2147 = -1;
                                                                              return true;
                                                                           }
                                                                        }
                                                                     } else {
                                                                        var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
                                                                        var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                           SpotAnimation.cameraYaw = var20;
                                                                           Class3_Sub9.anInt2309 = var21;
                                                                           if(-3 == ~GrandExchangeItem.anInt1753) {
                                                                              Class139.renderPitch = Class3_Sub9.anInt2309;
                                                                              Class3_Sub13_Sub25.renderYaw = SpotAnimation.cameraYaw;
                                                                           }

                                                                           Class47.method1098((byte)-117);

                                                                        jString.anInt2147 = -1;
                                                                        return true;
                                                                     }
                                                                  } else {
                                                                     Class39.method1038((byte)-99);
                                                                     jString.anInt2147 = -1;
                                                                     return true;
                                                                  }
                                                               } else {
                                                                  /*var20 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt2();
                                                                  var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                                                                  var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShortA();
                                                                  Class114.method1708(var5 + (var21 << 16), var20);*/
                                                                  jString.anInt2147 = -1;
                                                                  return true;
                                                               }
                                                            }
                                                         }
                                                      } else {
                                                         Class162.method2204(SpotAnimation.aClass3_Sub30_Sub1_532);
                                                         jString.anInt2147 = -1;
                                                         return true;
                                                      }
                                                   } else {
                                                      var3 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt();
                                                      var21 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShortA();
                                                      Class3_Sub13_Sub18.method255(var21, var3);
                                                         
                                                      jString.anInt2147 = -1;
                                                      return true;
                                                   }
   }

   public static void method828(int var0) {
      try {
         aByteArrayArrayArray81 = (byte[][][])null;
         //aClass94_85 = null;
         if(var0 > -88) {
            method828(-84);
         }

         aClass61_82 = null;
         aClass11_88 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ac.A(" + var0 + ')');
      }
   }

   static final void method829(int var0) {
      try {
         Class20.refreshInterface(Class56.aClass11_886);
         ++Class75_Sub3.anInt2658;
         if(Class21.aBoolean440 && Class85.aBoolean1167) {
            int var1 = PlainTile.anInt1676;
            var1 -= Class144.anInt1881;
            if(Class3_Sub13_Sub13.anInt3156 > var1) {
               var1 = Class3_Sub13_Sub13.anInt3156;
            }

            int var2 = Hashtable.anInt1709;
            if(~(Class3_Sub13_Sub13.anInt3156 + aClass11_88.anInt168) > ~(var1 - -Class56.aClass11_886.anInt168)) {
               var1 = -Class56.aClass11_886.anInt168 + Class3_Sub13_Sub13.anInt3156 + aClass11_88.anInt168;
            }

            var2 -= Class95.anInt1336;
            if(~var2 > ~Class134.anInt1761) {
               var2 = Class134.anInt1761;
            }

            if(Class134.anInt1761 - -aClass11_88.anInt193 < var2 - -Class56.aClass11_886.anInt193) {
               var2 = Class134.anInt1761 + aClass11_88.anInt193 + -Class56.aClass11_886.anInt193;
            }

            if(var0 != -1) {
               aClass61_82 = (Deque)null;
            }

            int var4 = var2 - GroundTile.anInt2218;
            int var3 = var1 + -Class3_Sub15.anInt2421;
            int var6 = var1 + -Class3_Sub13_Sub13.anInt3156 + aClass11_88.anInt247;
            int var7 = aClass11_88.anInt208 + -Class134.anInt1761 + var2;
            int var5 = Class56.aClass11_886.anInt214;
            if(~Class75_Sub3.anInt2658 < ~Class56.aClass11_886.anInt179 && (~var5 > ~var3 || ~(-var5) < ~var3 || var4 > var5 || var4 < -var5)) {
               Npc.aBoolean3975 = true;
            }

            InterfaceListener var8;
            if(Class56.aClass11_886.anObjectArray295 != null && Npc.aBoolean3975) {
               var8 = new InterfaceListener();
               var8.aClass11_2449 = Class56.aClass11_886;
               var8.objectData = Class56.aClass11_886.anObjectArray295;
               var8.anInt2447 = var6;
               var8.anInt2441 = var7;
               Light.method1065(var8);
            }

            if(0 == Class3_Sub13_Sub5.anInt3069) {
               if(Npc.aBoolean3975) {
                  if(Class56.aClass11_886.anObjectArray229 != null) {
                     var8 = new InterfaceListener();
                     var8.anInt2441 = var7;
                     var8.aClass11_2438 = Class27.aClass11_526;
                     var8.anInt2447 = var6;
                     var8.objectData = Class56.aClass11_886.anObjectArray229;
                     var8.aClass11_2449 = Class56.aClass11_886;
                     Light.method1065(var8);
                  }

                  if(Class27.aClass11_526 != null && client.method42(Class56.aClass11_886) != null) {
                     Class3_Sub13_Sub1.outputStream.putPacket(79);
                     Class3_Sub13_Sub1.outputStream.putInt2(Class56.aClass11_886.uid);
                     Class3_Sub13_Sub1.outputStream.putLEShort(Class27.aClass11_526.anInt191);
                     Class3_Sub13_Sub1.outputStream.putInt(Class27.aClass11_526.uid);
                     Class3_Sub13_Sub1.outputStream.putLEShort(Class56.aClass11_886.anInt191);
                  }
               } else if((-2 == ~Js5CacheWorker.anInt998 || Class3_Sub13_Sub39.method353(-1 + Class3_Sub13_Sub34.anInt3415, ~var0)) && Class3_Sub13_Sub34.anInt3415 > 2) {
                  Class132.method1801((byte)-97);
               } else if(~Class3_Sub13_Sub34.anInt3415 < -1) {
                  Class3_Sub13_Sub8.method203(96);
               }

               Class56.aClass11_886 = null;
            }

         } else {
            if(-2 > ~Class75_Sub3.anInt2658) {
               Class56.aClass11_886 = null;
            }

         }
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "ac.F(" + var0 + ')');
      }
   }

}
