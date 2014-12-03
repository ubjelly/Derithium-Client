import java.io.IOException;
import java.net.Socket;

class Class127 {

   static int[] anIntArray1679 = new int[14];
   static js5 aClass153_1680;
   static int[] anIntArray1681;


   static final void login(byte var0) {
      try {
         if(0 != Class3_Sub13_Sub25.loginStage && 5 != Class3_Sub13_Sub25.loginStage) {
            try {
               if(~(++Vertex.anInt820) < -2001) {
                  if(Class3_Sub15.worldConnection != null) {
                     Class3_Sub15.worldConnection.close();
                     Class3_Sub15.worldConnection = null;
                  }

                  if(-2 >= ~Class166.anInt2079) {
                     AbstractGraphicsBuffer.returnCode = -5;
                     Class3_Sub13_Sub25.loginStage = 0;
                     return;
                  }

                  Vertex.anInt820 = 0;
                  if(Class140_Sub6.anInt2894 != Class162.anInt2036) {
                     Class140_Sub6.anInt2894 = Class162.anInt2036;
                  } else {
                     Class140_Sub6.anInt2894 = Class26.anInt506;
                  }

                  Class3_Sub13_Sub25.loginStage = 1;
                  ++Class166.anInt2079;
               }

               if(Class3_Sub13_Sub25.loginStage == 1) {
                  Class3_Sub9.aClass64_2318 = Class38.gameSignlink.startConnection(Class38_Sub1.aString2611, Class140_Sub6.anInt2894);
                  Class3_Sub13_Sub25.loginStage = 2;
               }

               if(-3 == ~Class3_Sub13_Sub25.loginStage) {
                  if(~Class3_Sub9.aClass64_2318.status == -3) {
                     throw new IOException();
                  }

                  if(1 != Class3_Sub9.aClass64_2318.status) {
                     return;
                  }

                  Class3_Sub15.worldConnection = new jSocket((Socket)Class3_Sub9.aClass64_2318.value, Class38.gameSignlink);
                  Class3_Sub9.aClass64_2318 = null;
                  long var1 = Class3_Sub13_Sub16.aLong3202 = GroundItem.aClass94_3675.toLong();
                  Class3_Sub13_Sub1.outputStream.pos = 0;
                  Class3_Sub13_Sub1.outputStream.putByte(14);
                  int var3 = (int)(var1 >> 16 & 31L);
                  Class3_Sub13_Sub1.outputStream.putByte(var3);
                  Class3_Sub15.worldConnection.write(Class3_Sub13_Sub1.outputStream.buf, 0, 2);
                  if(Class44_Sub1.aClass155_2627 != null) {
                     Class44_Sub1.aClass155_2627.method2159();
                  }

                  if(Class3_Sub21.aClass155_2491 != null) {
                     Class3_Sub21.aClass155_2491.method2159();
                  }

                  int var4 = Class3_Sub15.worldConnection.read();
                  if(Class44_Sub1.aClass155_2627 != null) {
                     Class44_Sub1.aClass155_2627.method2159();
                  }

                  if(null != Class3_Sub21.aClass155_2491) {
                     Class3_Sub21.aClass155_2491.method2159();
                  }

                  if(~var4 != -1) {
                     AbstractGraphicsBuffer.returnCode = var4;
                     Class3_Sub13_Sub25.loginStage = 0;
                     Class3_Sub15.worldConnection.close();
                     Class3_Sub15.worldConnection = null;
                     return;
                  }

                  Class3_Sub13_Sub25.loginStage = 3;
               }

               if(Class3_Sub13_Sub25.loginStage == 3) {
                  if(~Class3_Sub15.worldConnection.available() > -9) {
                     return;
                  }

                  Class3_Sub15.worldConnection.read(SpotAnimation.aClass3_Sub30_Sub1_532.buf, 0, 8);
                  SpotAnimation.aClass3_Sub30_Sub1_532.pos = 0;
                  Class3_Sub13_Sub27.aLong3338 = SpotAnimation.aClass3_Sub30_Sub1_532.getLong();
                  int[] var9 = new int[4];
                  Class3_Sub13_Sub1.outputStream.pos = 0;
                  var9[2] = (int)(Class3_Sub13_Sub27.aLong3338 >> 32);
                  var9[3] = (int)Class3_Sub13_Sub27.aLong3338;
                  var9[1] = (int)(Math.random() * 9.9999999E7D);
                  var9[0] = (int)(Math.random() * 9.9999999E7D);
                  Class3_Sub13_Sub1.outputStream.putByte(10);
                  Class3_Sub13_Sub1.outputStream.putInt(var9[0]);
                  Class3_Sub13_Sub1.outputStream.putInt(var9[1]);
                  Class3_Sub13_Sub1.outputStream.putInt(var9[2]);
                  Class3_Sub13_Sub1.outputStream.putInt(var9[3]);
                  Class3_Sub13_Sub1.outputStream.putInt(0);
                  Class3_Sub13_Sub1.outputStream.putString(GroundItem.aClass94_3675);
                  Class3_Sub13_Sub1.outputStream.putString(GroundItem.aClass94_3673);
                  Class3_Sub13_Sub1.outputStream.encRsa(Class3_Sub13_Sub14.aBigInteger3162, Class3_Sub13_Sub37.aBigInteger3441, -296);
                  js5Worker.aClass3_Sub30_Sub1_2942.pos = 0;
                  if(40 == Class143.gameState) {
                     js5Worker.aClass3_Sub30_Sub1_2942.putByte(18);
                  } else {
                     js5Worker.aClass3_Sub30_Sub1_2942.putByte(16);
                  }

                  js5Worker.aClass3_Sub30_Sub1_2942.putByte(Class3_Sub13_Sub1.outputStream.pos + 69);
                  js5Worker.aClass3_Sub30_Sub1_2942.putInt(client.clientLoad);
                  //Class151_Sub1.aClass3_Sub30_Sub1_2942.putByte(Class7.anInt2161);
                  //Class151_Sub1.aClass3_Sub30_Sub1_2942.putByte(!Class3_Sub28_Sub19.advertSuppressed?0:1);
                  js5Worker.aClass3_Sub30_Sub1_2942.putByte(1);
                  //Class151_Sub1.aClass3_Sub30_Sub1_2942.putByte(Class83.method1411(0));
                  //Class151_Sub1.aClass3_Sub30_Sub1_2942.putShort(Class23.canvasWid);
                 // Class151_Sub1.aClass3_Sub30_Sub1_2942.putShort(Class140_Sub7.canvasHei);
                  //Class151_Sub1.aClass3_Sub30_Sub1_2942.putByte(Class3_Sub28_Sub14.antiAliasing);
                  //Class81.method1397(Class151_Sub1.aClass3_Sub30_Sub1_2942, true);
                  //Class151_Sub1.aClass3_Sub30_Sub1_2942.putString(Class163_Sub2.aClass94_2996);
                  //Class151_Sub1.aClass3_Sub30_Sub1_2942.putInt(Class3_Sub26.anInt2554);
                  //Class151_Sub1.aClass3_Sub30_Sub1_2942.putInt(Class84.method1421(-2));
                  Class140_Sub2.aBoolean2705 = true;
                  //Class151_Sub1.aClass3_Sub30_Sub1_2942.putShort(Class113.anInt1543);
                  js5Worker.aClass3_Sub30_Sub1_2942.putInt(Class75_Sub3.cacheIndex0.method2118());
                  js5Worker.aClass3_Sub30_Sub1_2942.putInt(Class3_Sub28_Sub19.cacheIndex1.method2118());
                  js5Worker.aClass3_Sub30_Sub1_2942.putInt(Class164.cacheIndex2.method2118());
                  js5Worker.aClass3_Sub30_Sub1_2942.putInt(Class140_Sub3.cacheIndex3.method2118());
                  js5Worker.aClass3_Sub30_Sub1_2942.putInt(AbstractMouseWheel.cacheIndex4.method2118());
                  js5Worker.aClass3_Sub30_Sub1_2942.putInt(Class3_Sub13_Sub6.cacheIndex5.method2118());
                  js5Worker.aClass3_Sub30_Sub1_2942.putInt(Class75_Sub2.cacheIndex6.method2118());
                  js5Worker.aClass3_Sub30_Sub1_2942.putInt(Class159.cacheIndex7.method2118());
                  js5Worker.aClass3_Sub30_Sub1_2942.putInt(Class140_Sub6.cacheIndex8.method2118());
                  js5Worker.aClass3_Sub30_Sub1_2942.putInt(Class3_Sub13_Sub28.cacheIndex9.method2118());
                  js5Worker.aClass3_Sub30_Sub1_2942.putInt(Class3_Sub13_Sub25.cacheIndex10.method2118());
                  js5Worker.aClass3_Sub30_Sub1_2942.putInt(NodeSub.cacheIndex11.method2118());
                  js5Worker.aClass3_Sub30_Sub1_2942.putInt(ClickMaskNode.cacheIndex12.method2118());
                  js5Worker.aClass3_Sub30_Sub1_2942.putInt(js5.cacheIndex13.method2118());
                  js5Worker.aClass3_Sub30_Sub1_2942.putInt(ClanMember.cacheIndex14.method2118());
                  js5Worker.aClass3_Sub30_Sub1_2942.putInt(Npc.cacheIndex15.method2118());
                  //Class151_Sub1.aClass3_Sub30_Sub1_2942.putInt(Class168.aClass153_2097.method2118((byte)-123));
                  //Class151_Sub1.aClass3_Sub30_Sub1_2942.putInt(Npc.aClass153_3993.method2118((byte)-124));
                  //Class151_Sub1.aClass3_Sub30_Sub1_2942.putInt(Class101.aClass153_1428.method2118((byte)-122));
                  //Class151_Sub1.aClass3_Sub30_Sub1_2942.putInt(Class100.aClass153_1410.method2118((byte)-127));
                  //Class151_Sub1.aClass3_Sub30_Sub1_2942.putInt(Class3_Sub13_Sub36.aClass153_3429.method2118((byte)-123));
                 // Class151_Sub1.aClass3_Sub30_Sub1_2942.putInt(Class70.aClass153_1058.method2118((byte)-117));
                  //Class151_Sub1.aClass3_Sub30_Sub1_2942.putInt(Class3_Sub22.aClass153_2528.method2118((byte)-117));
                  //Class151_Sub1.aClass3_Sub30_Sub1_2942.putInt(Class133.aClass153_1751.method2118((byte)-122));
                  //Class151_Sub1.aClass3_Sub30_Sub1_2942.putInt(Class140_Sub7.aClass153_2939.method2118((byte)-118));
                  //Class151_Sub1.aClass3_Sub30_Sub1_2942.putInt(Class3_Sub4.aClass153_2258.method2118((byte)-128));
                  //Class151_Sub1.aClass3_Sub30_Sub1_2942.putInt(Class97.aClass153_1376.method2118((byte)-123));
                  //Class151_Sub1.aClass3_Sub30_Sub1_2942.putInt(Class132.aClass153_1735.method2118((byte)-124));
                  js5Worker.aClass3_Sub30_Sub1_2942.method753(Class3_Sub13_Sub1.outputStream.buf, 0, Class3_Sub13_Sub1.outputStream.pos, var0 + 117);
                  Class3_Sub15.worldConnection.write(js5Worker.aClass3_Sub30_Sub1_2942.buf, 0, js5Worker.aClass3_Sub30_Sub1_2942.pos);
                  Class3_Sub13_Sub1.outputStream.initIsaac(var9);

                  for(int var2 = 0; ~var2 > -5; ++var2) {
                     var9[var2] += 50;
                  }

                  SpotAnimation.aClass3_Sub30_Sub1_532.initIsaac(var9);
                  Class3_Sub13_Sub25.loginStage = 4;
               }

               if(-5 == ~Class3_Sub13_Sub25.loginStage) {
            	   if(~Class3_Sub15.worldConnection.available() > -2) {
            		   return;
            	   }

                  int var10 = Class3_Sub15.worldConnection.read();
                  if(~var10 != -22) {
                     if(var10 != 29) {
                        if(var10 == 1) {
                           Class3_Sub13_Sub25.loginStage = 5;
                           AbstractGraphicsBuffer.returnCode = var10;
                           return;
                        }

                        if(2 != var10) {
                           if(~var10 != -16) {
                              if(23 == var10 && ~Class166.anInt2079 > -2) {
                                 Class3_Sub13_Sub25.loginStage = 1;
                                 ++Class166.anInt2079;
                                 Vertex.anInt820 = 0;
                                 Class3_Sub15.worldConnection.close();
                                 Class3_Sub15.worldConnection = null;
                                 return;
                              }

                              AbstractGraphicsBuffer.returnCode = var10;
                              Class3_Sub13_Sub25.loginStage = 0;
                              Class3_Sub15.worldConnection.close();
                              Class3_Sub15.worldConnection = null;
                              return;
                           }

                           Class3_Sub13_Sub25.loginStage = 0;
                           AbstractGraphicsBuffer.returnCode = var10;
                           return;
                        }

                        Class3_Sub13_Sub25.loginStage = 8;
                     } else {
                        Class3_Sub13_Sub25.loginStage = 10;
                     }
                  } else {
                     Class3_Sub13_Sub25.loginStage = 7;
                  }
               }

               if(6 == Class3_Sub13_Sub25.loginStage) {
                 // Class3_Sub13_Sub1.outputStream.pos = 0;
                 // Class3_Sub13_Sub1.outputStream.putPacket(17);
                 // Class3_Sub15.worldConnection.write(Class3_Sub13_Sub1.outputStream.buf, 0, Class3_Sub13_Sub1.outputStream.pos);
                  Class3_Sub13_Sub25.loginStage = 4;
                  return;
               }

               if(Class3_Sub13_Sub25.loginStage == 7) {
                  if(-2 >= ~Class3_Sub15.worldConnection.available()) {
                     Class3_Sub13_Sub34.anInt3413 = 60 * (3 + Class3_Sub15.worldConnection.read());
                     Class3_Sub13_Sub25.loginStage = 0;
                     AbstractGraphicsBuffer.returnCode = 21;
                     Class3_Sub15.worldConnection.close();
                     Class3_Sub15.worldConnection = null;
                     return;
                  }

                  return;
               }

               if(-11 == ~Class3_Sub13_Sub25.loginStage) {
                  if(1 <= Class3_Sub15.worldConnection.available()) {
                     Class3_Sub26.anInt2561 = Class3_Sub15.worldConnection.read();
                     Class3_Sub13_Sub25.loginStage = 0;
                     AbstractGraphicsBuffer.returnCode = 29;
                     Class3_Sub15.worldConnection.close();
                     Class3_Sub15.worldConnection = null;
                     return;
                  }

                  return;
               }

               if(Class3_Sub13_Sub25.loginStage == 8) {
                  if(~Class3_Sub15.worldConnection.available() > -15) {
                     return;
                  }

                  Class3_Sub15.worldConnection.read(SpotAnimation.aClass3_Sub30_Sub1_532.buf, 0, 8);
                  SpotAnimation.aClass3_Sub30_Sub1_532.pos = 0;
                  Class3_Sub13_Sub26.anInt3320 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                  Class3_Sub28_Sub19.anInt3775 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                  //Class3_Sub15.aBoolean2433 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte() == 1;
                  //Class121.aBoolean1641 = 1 == SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                  //Class3_Sub28_Sub10_Sub1.aBoolean4063 = ~SpotAnimation.aClass3_Sub30_Sub1_532.getUByte() == -2;
                  //Class3_Sub13_Sub14.aBoolean3166 = 1 == SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                  //Canvas_Sub2.aBoolean29 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte() == 1;
                  ClickMaskNode.anInt2211 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                  Class3_Sub13_Sub29.aBoolean3358 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte() == 1;
                  Class2.allowMembers = true;
                  Class113.method1702(Class2.allowMembers);
                  Class8.method845(Class2.allowMembers);
                  /*if(!Class3_Sub28_Sub19.advertSuppressed) {
                     if((!Class3_Sub15.aBoolean2433 || UpdateServerNode.aBoolean4063) && !Class3_Sub13_Sub29.aBoolean3358) {
                        try {
                           Class27.aClass94_516.method1577(Class38.gameSignlink.thisApplet);
                        } catch (Throwable var5) {
                           ;
                        }
                     } else {
                        try {
                           Class97.aClass94_1374.method1577(Class38.gameSignlink.thisApplet);
                        } catch (Throwable var6) {
                           ;
                        }
                     }
                  }*/

                  jString.anInt2147 = SpotAnimation.aClass3_Sub30_Sub1_532.getPacket();
                  Hashtable.anInt1704 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                  Class3_Sub13_Sub25.loginStage = 9;
               }

               if(-10 == ~Class3_Sub13_Sub25.loginStage) {
                  if(~Class3_Sub15.worldConnection.available() > ~Hashtable.anInt1704) {
                     return;
                  }
                  SpotAnimation.aClass3_Sub30_Sub1_532.pos = 0;
                  Class3_Sub15.worldConnection.read(SpotAnimation.aClass3_Sub30_Sub1_532.buf, 0, Hashtable.anInt1704);
                  AbstractGraphicsBuffer.returnCode = 2;
                  Class3_Sub13_Sub25.loginStage = 0;
                  AnimationDefinition.method2061(true);
                  AbstractObjectCache.anInt3606 = -1;
                  Class39.method1033(false);
                  jString.anInt2147 = -1;
                  return;
               }

               if(var0 != -9) {
                  aClass153_1680 = (js5)null;
               }
            } catch (IOException var7) {
               if(null != Class3_Sub15.worldConnection) {
                  Class3_Sub15.worldConnection.close();
                  Class3_Sub15.worldConnection = null;
               }

               if(Class166.anInt2079 >= 1) {
                  Class3_Sub13_Sub25.loginStage = 0;
                  AbstractGraphicsBuffer.returnCode = -4;
               } else {
                  Class3_Sub13_Sub25.loginStage = 1;
                  Vertex.anInt820 = 0;
                  ++Class166.anInt2079;
                  if(~Class162.anInt2036 == ~Class140_Sub6.anInt2894) {
                     Class140_Sub6.anInt2894 = Class26.anInt506;
                  } else {
                     Class140_Sub6.anInt2894 = Class162.anInt2036;
                  }
               }
            }

         }
      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "ri.A(" + var0 + ')');
      }
   }

   static final int method1753(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   public static void method1754(int var0) {
      try {
         aClass153_1680 = null;
         anIntArray1679 = null;
         if(var0 >= -49) {
            login((byte)102);
         }

         anIntArray1681 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ri.B(" + var0 + ')');
      }
   }

}
