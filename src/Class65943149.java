import java.io.UnsupportedEncodingException;

final class Class65943149 implements Runnable {

   static boolean aBoolean1080 = false;
   static int anInt1081 = 0;
   static int anInt1082;
   static int[] anIntArray1083;
   static boolean aBoolean1084 = false;
   private Queue aClass13_1086 = new Queue();
   int anInt1087 = 0;
   static int anInt1088 = 0;
   private Thread aThread1090;
   private boolean aBoolean1091 = false;


   private final void method1299(UpdateServerNode var1, int var2) {
      try {
         Queue var3 = this.aClass13_1086;
         synchronized(var3) {
            if(var2 != 104) {
               this.method1304(-114);
            }

            this.aClass13_1086.insertLast(var1);
            ++this.anInt1087;
            this.aClass13_1086.notifyAll();
         }
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "k.G(" + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   static final void method1301(int var0, int var1, int var2, int var3, boolean var4, int var5, boolean var6) {
      try {
         if(AbstractObjectCache.anInt3606 != var2 || ~var1 != ~LongNode.anInt2294 || ~Class140_Sub3.anInt2745 != ~var0 && !Npc.visibleLevels()) {
            AbstractObjectCache.anInt3606 = var2;
            LongNode.anInt2294 = var1;
            Class140_Sub3.anInt2745 = var0;
            if(Npc.visibleLevels()) {
               Class140_Sub3.anInt2745 = 0;
            }

            if(var4) {
               Class117.setGameState(28);
            } else {
               Class117.setGameState(25);
            }

            client.drawTextOnScreen(Class3_Sub13_Sub23.aClass94_3282, true);
            int var8 = Class82.anInt1152;
            int var7 = Class131.anInt1716;
            Class82.anInt1152 = var1 * 8 - 48;
            Class131.anInt1716 = 8 * (-6 + var2);
            Class3_Sub13_Sub21.aClass3_Sub28_Sub3_3264 = Queue.method884(8 * AbstractObjectCache.anInt3606, (byte)88, 8 * LongNode.anInt2294);
            int var10 = -var8 + Class82.anInt1152;
            int var9 = Class131.anInt1716 + -var7;
            var7 = Class131.anInt1716;
            var8 = Class82.anInt1152;
            Class3_Sub13_Sub35.aClass131_3421 = null;
            int var11;
            Npc var12;
            int var13;
            if(!var4) {
               for(var11 = 0; var11 < '\u8000'; ++var11) {
                  var12 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var11];
                  if(null != var12) {
                     for(var13 = 0; var13 < 10; ++var13) {
                        var12.anIntArray2767[var13] -= var9;
                        var12.anIntArray2755[var13] -= var10;
                     }

                     var12.anInt2819 -= 128 * var9;
                     var12.anInt2829 -= var10 * 128;
                  }
               }
            } else {
               Class163.anInt2046 = 0;

               for(var11 = 0; -32769 < ~var11; ++var11) {
                  var12 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var11];
                  if(null != var12) {
                     var12.anInt2819 -= 128 * var9;
                     var12.anInt2829 -= 128 * var10;
                     if(-1 >= ~var12.anInt2819 && -13185 <= ~var12.anInt2819 && -1 >= ~var12.anInt2829 && -13185 <= ~var12.anInt2829) {
                        for(var13 = 0; 10 > var13; ++var13) {
                           var12.anIntArray2767[var13] -= var9;
                           var12.anIntArray2755[var13] -= var10;
                        }

                        Class15.anIntArray347[Class163.anInt2046++] = var11;
                     } else {
                        Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var11].method1987(-1, (NpcDefinition)null);
                        Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var11] = null;
                     }
                  }
               }
            }

            for(var11 = 0; var11 < 2048; ++var11) {
               Player var23 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var11];
               if(null != var23) {
                  for(var13 = 0; 10 > var13; ++var13) {
                     var23.anIntArray2767[var13] -= var9;
                     var23.anIntArray2755[var13] -= var10;
                  }

                  var23.anInt2819 -= 128 * var9;
                  var23.anInt2829 -= 128 * var10;
               }
            }

            Class26.plane = var0;
            TextureLoader.selfPlayer.method1981(var5, false, var3);
            byte var25 = 104;
            byte var24 = 0;
            byte var14 = 0;
            byte var16 = 1;
            byte var15 = 104;
            byte var26 = 1;
            if(~var10 > -1) {
               var16 = -1;
               var15 = -1;
               var14 = 103;
            }

            if(~var9 > -1) {
               var26 = -1;
               var24 = 103;
               var25 = -1;
            }

            for(int var17 = var24; ~var17 != ~var25; var17 += var26) {
               for(int var18 = var14; ~var15 != ~var18; var18 += var16) {
                  int var19 = var9 + var17;
                  int var20 = var18 + var10;

                  for(int var21 = 0; 4 > var21; ++var21) {
                     if(-1 >= ~var19 && ~var20 <= -1 && ~var19 > -105 && -105 < ~var20) {
                        Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[var21][var17][var18] = Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[var21][var19][var20];
                     } else {
                        Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[var21][var17][var18] = null;
                     }
                  }
               }
            }

            for(Class3_Sub4 var27 = (Class3_Sub4)Class3_Sub13_Sub6.aClass61_3075.getFirst(); var27 != null; var27 = (Class3_Sub4)Class3_Sub13_Sub6.aClass61_3075.getNext()) {
               var27.anInt2248 -= var10;
               var27.anInt2264 -= var9;
               if(0 > var27.anInt2264 || -1 < ~var27.anInt2248 || var27.anInt2264 >= 104 || var27.anInt2248 >= 104) {
                  var27.unlink();
               }
            }

            if(var4) {
               Npc.renderX -= 128 * var9;
               Class77.renderY -= var10 * 128;
               AbstractMouseWheel.anInt1904 -= var10;
               MouseHandler.anInt1923 -= var9;
               Class157.anInt1996 -= var10;
               Canvas_Sub2.anInt30 -= var9;
            } else {
               GrandExchangeItem.anInt1753 = 1;
            }

            Class113.anInt1552 = 0;
            if(Class65.mapFlagX != 0) {
               Class45.mapFlagY -= var10;
               Class65.mapFlagX -= var9;
            }

            if(var6) {
               if(HDToolkit.openGLEnabled && var4 && (Math.abs(var9) > 104 || 104 < Math.abs(var10))) {
                  Class3_Sub13_Sub14.method236((byte)64);
               }

               Class58.anInt909 = -1;
               Class3_Sub13_Sub15.aClass61_3177.clear();
               Class3_Sub13_Sub30.aClass61_3364.clear();
            }
         }
      } catch (RuntimeException var22) {
         throw Class44.method1067(var22, "k.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

	static final InterfaceChangeNode method1302() {
		InterfaceChangeNode var1 = (InterfaceChangeNode) PlainTile.aClass13_1666.method876();
		if (var1 != null) {
			var1.unlink();
			var1.unlinkSub();
			return var1;
		} else {
			do {
				var1 = (InterfaceChangeNode) Class81.aClass13_1139.method876();
				if (var1 == null) {
					return null;
				}

				if (var1.getAddTime() > TimeUtil.currentTimeMillis()) {
					return null;
				}

				var1.unlink();
				var1.unlinkSub();
			} while ((Long.MIN_VALUE & var1.uid) == 0L);

			return var1;
		}
	}

   static final jString method1303(jInterface var0, jString var1, int var2) {
      try {
         if(~var1.method1551(IdentityKit.aClass94_468) != var2) {
            while(true) {
               int var3 = var1.method1551(Class12.aClass94_331);
               if(0 == ~var3) {
                  while(true) {
                     var3 = var1.method1551(Class166.aClass94_2080);
                     if(var3 == -1) {
                        while(true) {
                           var3 = var1.method1551(CollisionMap.aClass94_1301);
                           if(0 == ~var3) {
                              while(true) {
                                 var3 = var1.method1551(PlayerAppearance.aClass94_852);
                                 if(~var3 == 0) {
                                    while(true) {
                                       var3 = var1.method1551(Class3_Sub13_Sub35.aClass94_3418);
                                       if(0 == ~var3) {
                                          while(true) {
                                             var3 = var1.method1551(Class70.aClass94_1051);
                                             if(~var3 == 0) {
                                                return var1;
                                             }

                                             jString var4 = GroundItem.aClass94_3672;
                                             if(null != Class136.aClass64_1778) {
                                                var4 = Class108.method1653(Class136.aClass64_1778.integerData, 0);

                                                try {
                                                   if(null != Class136.aClass64_1778.value) {
                                                      byte[] var5 = ((String)Class136.aClass64_1778.value).getBytes("ISO-8859-1");
                                                      var4 = Class3_Sub13_Sub3.bufferToString(var5, 0, var5.length);
                                                   }
                                                } catch (UnsupportedEncodingException var6) {
                                                   ;
                                                }
                                             }

                                             var1 = client.method903(new jString[]{var1.substring(var3, 0), var4, var1.method1556(4 + var3, (byte)-74)});
                                          }
                                       }

                                       var1 = client.method903(new jString[]{var1.substring(var3, 0), Class154.method2148(Class164_Sub2.method2247(var0, 4), (byte)-78), var1.method1556(var3 - -2, (byte)-74)});
                                    }
                                 }

                                 var1 = client.method903(new jString[]{var1.substring(var3, 0), Class154.method2148(Class164_Sub2.method2247(var0, 3), (byte)-78), var1.method1556(2 + var3, (byte)-74)});
                              }
                           }

                           var1 = client.method903(new jString[]{var1.substring(var3, 0), Class154.method2148(Class164_Sub2.method2247(var0, 2), (byte)-78), var1.method1556(2 + var3, (byte)-74)});
                        }
                     }

                     var1 = client.method903(new jString[]{var1.substring(var3, 0), Class154.method2148(Class164_Sub2.method2247(var0, 1), (byte)-78), var1.method1556(var3 + 2, (byte)-74)});
                  }
               }

               var1 = client.method903(new jString[]{var1.substring(var3, 0), Class154.method2148(Class164_Sub2.method2247(var0, 0), (byte)-78), var1.method1556(2 + var3, (byte)-74)});
            }
         } else {
            return var1;
         }
      } catch (RuntimeException var7) {
         throw Class44.method1067(var7, "k.K(" + (var0 != null?"{...}":"null") + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   final void method1304(int var1) {
      try {
         this.aBoolean1091 = true;
         Queue var2 = this.aClass13_1086;
         synchronized(var2) {
            this.aClass13_1086.notifyAll();
         }

         try {
            this.aThread1090.join();
         } catch (InterruptedException var4) {
            ;
         }

         this.aThread1090 = null;
         if(var1 != 3208) {
            this.aThread1090 = (Thread)null;
         }

      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "k.B(" + var1 + ')');
      }
   }

   final UpdateServerNode method1305(FileSystem var1, int var2, byte[] var3, int var4) {
      try {
         UpdateServerNode var5 = new UpdateServerNode();
         var5.buffer = var3;
         var5.aBoolean3628 = false;
         var5.uid = (long)var4;
         var5.fileSystem = var1;
         var5.anInt1246 = var2;
         this.method1299(var5, 104);
         return var5;
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "k.A(" + (var1 != null?"{...}":"null") + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ',' + var4 + ')');
      }
   }

   public static void method1306(int var0) {
      try {
         if(var0 == -16222) {
            anIntArray1083 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "k.I(" + var0 + ')');
      }
   }

   final UpdateServerNode method1307(int var1, int var2, FileSystem var3) {
      try {
         UpdateServerNode var4 = new UpdateServerNode();
         var4.fileSystem = var3;
         var4.anInt1246 = 3;
         var4.aBoolean3628 = false;
         if(var2 != -27447) {
            aBoolean1084 = false;
         }

         var4.uid = (long)var1;
         this.method1299(var4, 104);
         return var4;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "k.E(" + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

   static final void method1308(jString var0) {
         //if(2 <= Class3_Sub13_Sub26.anInt3320) {
            int var3;
            Runtime var6;
            if(var0.method1531(Class3_Sub13_Sub13.aClass94_3152)) {
               Class3_Sub13_Sub17.method246(8);

               for(int var2 = 0; var2 < 10; ++var2) {
                  System.gc();
               }

               var6 = Runtime.getRuntime();
               var3 = (int)((var6.totalMemory() - var6.freeMemory()) / 1024L);
               PacketBuffer.method805((jString)null, client.method903(new jString[]{Class3_Sub13_Sub29.aClass94_3360, Class72.method1298(var3), js5Worker.aClass94_2951}), 0);
            }

            int var4;
            /*if(var0.method1531(InvType.aClass94_3651)) {
               Class3_Sub13_Sub17.method246(8);

               for(var2 = 0; var2 < 10; ++var2) {
                  System.gc();
               }

               var6 = Runtime.getRuntime();
               var3 = (int)((var6.totalMemory() + -var6.freeMemory()) / 1024L);
               PacketBuffer.method805((jString)null, 0, client.method903(new jString[]{Class119.aClass94_1625, Class72.method1298(var3), Class151_Sub1.aClass94_2951}, (byte)-94), -1);
               ClickMaskNode.method90(1);
               Class3_Sub13_Sub17.method246(8);

               for(var4 = 0; var4 < 10; ++var4) {
                  System.gc();
               }

               var3 = (int)((var6.totalMemory() + -var6.freeMemory()) / 1024L);
               PacketBuffer.method805((jString)null, 0, client.method903(new jString[]{Class161.aClass94_2033, Class72.method1298(var3), Class151_Sub1.aClass94_2951}, (byte)-104), -1);
            }*/

            /*if(var0.method1531(Class139.aClass94_1830)) {
               PacketBuffer.method805((jString)null, 0, client.method903(new jString[]{Class21.aClass94_442, Class72.method1298(Class118.method1727((byte)123))}, (byte)-94), -1);
            }*/

            /*if(HDToolkit.openGLEnabled && var0.method1531(AbstractSprite.aClass94_3700)) {
               System.out.println("oncard_geometry:" + Class31.anInt585);
               System.out.println("oncard_2d:" + Class31.anInt584);
               System.out.println("oncard_texture:" + Class31.anInt580);
            }*/

            if(var0.method1531(Class151.aClass94_1935)) {
               Class3_Sub13_Sub24.dropClient();
            }

            //if(var0.method1531(OverridedInterface.aClass94_2605)) {
            //   Class58.aClass66_917.method1254(false);
            //}

            //if(var0.method1531(Class110.aClass94_1474)) {
            //   Class58.aClass66_917.method1244(true);
            //}

            /*if(var0.method1531(Class95.aClass94_1337)) {
               Class38.gameSignlink.method1431(0);
               Class3_Sub15.worldConnection.method1467(var1);
               Class58.aClass66_917.method1248(-29340);
            }*/

            if(var0.method1531(Class3_Sub13.aClass94_2385)) {
               AnimationLoader.canvasReplaceRecommended = true;
            }

            /*if(var0.method1531(Class86.aClass94_1188)) {
               Class117.setGameState(25);
            }*/

            if(var0.method1531(Class58.aClass94_910)) {
               Class20.aBoolean438 = true;
            }

            if(var0.method1531(Class30.aClass94_565)) {
               Class20.aBoolean438 = false;
            }

            if(var0.method1531(PlayerAppearance.aClass94_856)) {
               SceneGraphNode.method1862(false, 0, -1, -1);
            }

            if(var0.method1531(Class108.aClass94_1458)) {
               SceneGraphNode.method1862(false, 1, -1, -1);
            }

            /*if(var0.method1531(Class121.aClass94_1646)) {
               Class140.method1862(false, 2, -1, -1);
            }

            if(var0.method1531(Class3_Sub13_Sub15.aClass94_3183)) {
               Class140.method1862(false, 3, 1024, 768);
            }*/

           /* if(var0.method1531(Class3_Sub13_Sub10.aClass94_3123)) {
               for(var2 = 0; -5 < ~var2; ++var2) {
                  for(var3 = 1; ~var3 > -104; ++var3) {
                     for(var4 = 1; var4 < 103; ++var4) {
                        Class86.collisionMap[var2].collisionFlags[var3][var4] = 0;
                     }
                  }
               }
            }*/

            /*if(var0.method1558(Class140.aClass94_1832, 0)) {
               ParticleEngine.method1758(var0.method1556(15, (byte)-74).method1552((byte)-124));
               Class119.writePreferences(Class38.gameSignlink);
               Class140_Sub2.aBoolean2705 = false;
            }*/

            /*if(var0.method1558(Class3_Sub13_Sub23.aClass94_3289, 0) && Class44.modeWhere != 0) {
               Class65.method1237(var0.method1556(6, (byte)-74).method1552((byte)-106), 1000);
            }*/

            if(var0.method1531(Class163.aClass94_2045)) {
               throw new RuntimeException();
            }

            /*if(var0.method1558(GameShell.aClass94_10, 0)) {
               ClientScript.anInt3689 = var0.method1556(12, (byte)-74).method1564(1).method1552((byte)-120);
               PacketBuffer.method805((jString)null, 0, client.method903(new jString[]{Class166.aClass94_2075, Class72.method1298(ClientScript.anInt3689)}, (byte)-75), -1);
            }*/

            /*if(var0.method1531(Class108.aClass94_1456)) {
               Class69.qaoptestEnabled = true;
            }*/

            /*if(var0.method1531(Class3_Sub15.aClass94_2432)) {
               if(!Class3_Sub26.forceTweeningEnabled) {
                  Class3_Sub26.forceTweeningEnabled = true;
                  PacketBuffer.method805((jString)null, Player.aClass94_3961, 0);
               } else {
                  Class3_Sub26.forceTweeningEnabled = false;
                  PacketBuffer.method805((jString)null, Class164.aClass94_2061, 0);
               }
            }*/

            /*if(var0.method1531(Class3_Sub13.aClass94_2380)) {
               if(!Class101.aBoolean1419) {
                  Class20.aClass94_434.method1549(false);
                  Class101.aBoolean1419 = true;
               } else {
                  InvType.aClass94_3653.method1549(false);
                  Class101.aBoolean1419 = false;
               }
            }*/
         //}

         Class3_Sub13_Sub1.outputStream.putPacket(165);
         Class3_Sub13_Sub1.outputStream.putByte(var0.getLength() + -1);
         Class3_Sub13_Sub1.outputStream.putString(var0.method1556(2, (byte)-74));
   }

   final UpdateServerNode method1309(FileSystem var1, byte var2, int var3) {
      try {
         UpdateServerNode var4 = new UpdateServerNode();
         var4.anInt1246 = 1;
         Queue var5 = this.aClass13_1086;
         synchronized(var5) {
            if(var2 < 39) {
               return (UpdateServerNode)null;
            }

            UpdateServerNode var6 = (UpdateServerNode)this.aClass13_1086.method876();

            while(true) {
               if(var6 == null) {
                  break;
               }

               if(~var6.uid == ~((long)var3) && var6.fileSystem == var1 && var6.anInt1246 == 2) {
                  var4.buffer = var6.buffer;
                  var4.aBoolean3632 = false;
                  return var4;
               }

               var6 = (UpdateServerNode)this.aClass13_1086.method878();
            }
         }

         var4.buffer = var1.get(var3);
         var4.aBoolean3632 = false;
         var4.aBoolean3628 = true;
         return var4;
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "k.F(" + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   public final void run() {
      try {
         while(!this.aBoolean1091) {
            Queue var2 = this.aClass13_1086;
            UpdateServerNode var1;
            synchronized(var2) {
               var1 = (UpdateServerNode)this.aClass13_1086.method877();
               if(null == var1) {
                  try {
                     this.aClass13_1086.wait();
                  } catch (InterruptedException var6) {
                     ;
                  }
                  continue;
               }

               --this.anInt1087;
            }

            try {
               if(var1.anInt1246 != 2) {
                  if(-4 == ~var1.anInt1246) {
                     var1.buffer = var1.fileSystem.get((int)var1.uid);
                  }
               } else {
                  var1.fileSystem.method1050((int)var1.uid, var1.buffer.length, var1.buffer);
               }
            } catch (Exception var5) {
               Class49.method1125((String)null, var5);
            }

            var1.aBoolean3632 = false;
         }

      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "k.run()");
      }
   }

   public Class65943149() {
      try {
         SignlinkNode var1 = Class38.gameSignlink.startThread(this, 5);

         while(-1 == ~var1.status) {
            Class3_Sub13_Sub34.sleep(10L);
         }

         if(2 == var1.status) {
            throw new RuntimeException();
         } else {
            this.aThread1090 = (Thread)var1.value;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "k.<init>()");
      }
   }

}
