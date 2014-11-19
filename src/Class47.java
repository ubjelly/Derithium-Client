
final class Class47 {

   static boolean aBoolean742 = false;
   static Class93 aClass93_743 = new Class93(20);
   private NodeSub aClass3_Sub28_744 = new NodeSub();
   private Hashtable aClass130_745;
   private int anInt746;
   private Queue aClass13_747 = new Queue();
   static js5 aClass153_748;
   private int anInt749;
   static jString aClass94_750 = jString.createJString("null");

	/*static final boolean method1088() {
		if (Class3_Sub28_Sub11.aBoolean3641) {
			try {
				Class8.aClass94_106.method1577(-1857, Class38.gameSignlink.thisApplet);
				return true;
			} catch (Throwable var2) {
				;
			}
		}
		return false;
	}*/

   static final AnimationLoader method1089(js5 skeletons, boolean var1, js5 skins, int var4, boolean new_header) {
         boolean var5 = true;
            int[] var6 = skeletons.getChildEntries(var4);

            for(int var7 = 0; var7 < var6.length; ++var7) {
               byte[] var8 = skeletons.method2140(var6[var7], var4, 0);
               if(var8 == null) {
                  var5 = false;
               } else {
                  int var9 = (255 & var8[0]) << 8 | var8[1] & 255;
                  byte[] var10;
                  if(!var1) {
                     var10 = skins.method2140(0, var9, 0);
                  } else {
                     var10 = skins.method2140(var9, 0, 0);
                  }

                  if(null == var10) {
                     var5 = false;
                  }
               }
            }

            if(!var5) {
               return null;
            } else {
               try {
                  return new AnimationLoader(skeletons, skins, var4, var1, new_header);
               } catch (Exception var11) {
                  return null;
               }
            }
   }

	static final jString createBlankJString(int var1) {
		jString var2 = new jString();
		var2.pos = 0;
		var2.buf = new byte[var1];
		return var2;
	}

   static final void method1091(boolean var0) {
         byte var2;
         byte[][] var3;
         if(HDToolkit.openGLEnabled && var0) {
            var2 = 1;
            var3 = GroundItem.aByteArrayArray3669;
         } else {
            var2 = 4;
            var3 = Class164_Sub2.aByteArrayArray3027;
         }

         int var4 = var3.length;

         int var5;
         int var6;
         int var7;
         byte[] var8;
         for(var5 = 0; ~var4 < ~var5; ++var5) {
            var6 = -Class131.anInt1716 + 64 * (Class3_Sub24_Sub3.anIntArray3494[var5] >> 8);
            var7 = -Class82.anInt1152 + 64 * (255 & Class3_Sub24_Sub3.anIntArray3494[var5]);
            var8 = var3[var5];
            if(null != var8) {
               Class58.method1194();
               Buffer.method777(Class86.collisionMap, var0, -48 + 8 * AbstractObjectCache.anInt3606, var7, 4, var6, (LongNode.anInt2294 + -6) * 8, var8);
            }
         }

         var5 = 0;

         for(; ~var4 < ~var5; ++var5) {
            var6 = -Class131.anInt1716 + 64 * (Class3_Sub24_Sub3.anIntArray3494[var5] >> 8);
            var7 = -Class82.anInt1152 + 64 * (255 & Class3_Sub24_Sub3.anIntArray3494[var5]);
            var8 = var3[var5];
            if(var8 == null && ~LongNode.anInt2294 > -801) {
               Class58.method1194();

               for(int var9 = 0; var9 < var2; ++var9) {
                  Class12.method870(var9, (byte)102, var7, var6, 64, 64);
               }
            }
         }
   }

   final NodeSub method1092(long var1, int var3) {
      try {
         if(var3 != 1400) {
            this.anInt749 = -79;
         }

         NodeSub var4 = (NodeSub)this.aClass130_745.get(var1);
         if(null != var4) {
            this.aClass13_747.insertLast(var4);
         }

         return var4;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "gn.N(" + var1 + ',' + var3 + ')');
      }
   }

   static final void method1093() {
	   for(int var1 = 0; var1 < 100; ++var1) {
		   GroundItem.aBooleanArray3674[var1] = true;
	   }
   }

   final Node method1094(int var1) {
      try {
         return var1 != 0?(Node)null:this.aClass130_745.getFirst();
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "gn.A(" + var1 + ')');
      }
   }

   static final void method1095(int x, int var1, int var2, jInterface[] var3, int width, int var5, int y, int height, byte var8, int var9) {
      try {
         if(HDToolkit.openGLEnabled) {
            GraphicsHD.clipRect(x, y, width, height);
         } else {
            GraphicsLD.clipRect(x, y, width, height);
            Rasterizer.method1134();
         }
         for(int var10 = 0; ~var3.length < ~var10; ++var10) {
            jInterface var11 = var3[var10];
            if(var11 != null && (~var11.parent == ~var5 || var5 == -1412584499 && var11 == Class56.aClass11_886)) {
               int var12;
               if(0 != ~var9) {
                  var12 = var9;
               } else {
                  Class155.anIntArray1969[Class3_Sub28_Sub3.anInt3557] = var2 + var11.anInt306;
                  Player.anIntArray3954[Class3_Sub28_Sub3.anInt3557] = var11.anInt210 - -var1;
                  Class3_Sub28_Sub18.anIntArray3768[Class3_Sub28_Sub3.anInt3557] = var11.anInt168;
                  Entity.anIntArray2794[Class3_Sub28_Sub3.anInt3557] = var11.anInt193;
                  var12 = Class3_Sub28_Sub3.anInt3557++;
               }

               var11.anInt204 = Class44.loopCycle;
               var11.anInt292 = var12;
               if(!var11.scriptedInterface || !jInterface.isComponentHidden(var11)) {
                  if(0 < var11.clientCode) {
                     Class2.method81((byte)-128, var11);
                  }

                  int var14 = var1 + var11.anInt210;
                  int var15 = var11.alpha;
                  int var13 = var11.anInt306 - -var2;
                  if(LookupTable.qaoptestEnabled && (0 != jInterface.getInterfaceClickMask(var11).clickMask || var11.type == 0) && var15 > 127) {
                     var15 = 127;
                  }

                  int var17;
                  int var16;
                  if(var11 == Class56.aClass11_886) {
                     if(var5 != -1412584499 && !var11.aBoolean200) {
                        AbstractObjectCache.anInt3602 = var2;
                        Class65943149.anInt1082 = var1;
                        SceneGraphNode.aClass11Array1836 = var3;
                        continue;
                     }

                     if(Npc.aBoolean3975 && Class85.aBoolean1167) {
                        var17 = Hashtable.anInt1709;
                        var16 = PlainTile.anInt1676;
                        var17 -= Class95.anInt1336;
                        if(var17 < Class134.anInt1761) {
                           var17 = Class134.anInt1761;
                        }

                        if(~(var17 + var11.anInt193) < ~(PacketParser.aClass11_88.anInt193 + Class134.anInt1761)) {
                           var17 = -var11.anInt193 + PacketParser.aClass11_88.anInt193 + Class134.anInt1761;
                        }

                        var14 = var17;
                        var16 -= Class144.anInt1881;
                        if(Class3_Sub13_Sub13.anInt3156 > var16) {
                           var16 = Class3_Sub13_Sub13.anInt3156;
                        }

                        if(~(PacketParser.aClass11_88.anInt168 + Class3_Sub13_Sub13.anInt3156) > ~(var11.anInt168 + var16)) {
                           var16 = -var11.anInt168 + PacketParser.aClass11_88.anInt168 + Class3_Sub13_Sub13.anInt3156;
                        }

                        var13 = var16;
                     }

                     if(!var11.aBoolean200) {
                        var15 = 128;
                     }
                  }

                  int var19;
                  int var18;
                  int var21;
                  int var20;
                  if(2 != var11.type) {
                     var17 = ~var14 < ~y?var14:y;
                     var16 = ~x > ~var13?var13:x;
                     var20 = var11.anInt168 + var13;
                     var21 = var14 - -var11.anInt193;
                     if(~var11.type == -10) {
                        ++var21;
                        ++var20;
                     }

                     var19 = height <= var21?height:var21;
                     var18 = ~var20 <= ~width?width:var20;
                  } else {
                     var19 = height;
                     var18 = width;
                     var17 = y;
                     var16 = x;
                  }

                  if(!var11.scriptedInterface || ~var18 < ~var16 && ~var17 > ~var19) {
                     int var23;
                     int var22;
                     int var25;
                     int var24;
                     int var26;
                     int var29;
                     int var28;
                     int var47;
                     if(~var11.clientCode != -1) {
                        if(~var11.clientCode == -1338 || var11.clientCode == 1403 && HDToolkit.openGLEnabled) {
                           UnderlayType.aClass11_2091 = var11;
                           NodeSub.anInt2567 = var14;
                           Class53.anInt865 = var13;
                           Class3_Sub13_Sub36.method338(var11.anInt193, ~var11.clientCode == -1404, var13, var11.anInt168, var14);
                           if(HDToolkit.openGLEnabled) {
                              GraphicsHD.clipRect(x, y, width, height);
                           } else {
                              GraphicsLD.clipRect(x, y, width, height);
                           }
                           continue;
                        }

                        if(var11.clientCode == 1338) {
                            //   System.out.println(var14+":"+var15+":"+var13);
                        	//System.out.println(x+":"+y+":"+width+":"+height+":"+client.mapbackSprte.width+":"+client.mapbackSprte.height);
                            /*if(HDToolkit.openGLEnabled) {
                                GraphicsHD.clipRect(var13, var14, var13 + client.mapbackSprte.anInt1461, var14 + client.mapbackSprte.anInt1468);
                             } else {
                                GraphicsLD.clipRect(var13, var14, var13 + client.mapbackSprte.anInt1461, var14 + client.mapbackSprte.anInt1468);
                             }
                            
                            if(2 != Class161.anInt2028 && 5 != Class161.anInt2028) {
                                if(HDToolkit.openGLEnabled) {
                                    GraphicsHD.fillRect(var13 + 97, var14 + 82 - 4, 3, 3, 16777215);
                                 } else {
                                    GraphicsLD.fillRect(var13 + 97, var14 + 82 - 4, 3, 3, 16777215);
                                 }
                            } else {
                            	  if(HDToolkit.openGLEnabled) {
                            		  GraphicsHD.method926(client.mapbackSource, var13 + 25, var14 + 5, 0, 0);//var13 + 97, var14 + 82 - 4, 3, 3, 16777215);
                            	  } else {
                            		  GraphicsLD.method1332(var13 + 25, var14 + 5, 0, client.mapbackSource, client.mapbackDest);
                            	  }
                            }
                            
                            if(Hashtable.aBooleanArray1712[var12])
                            	client.mapbackSprte.method1667(var13, var14);
                        	
                            if(HDToolkit.openGLEnabled) {
                                GraphicsHD.clipRect(x, y, width, height);
                             } else {
                                GraphicsLD.clipRect(x, y, width, height);
                             }*/
                          // if(!var11.method855(-30721)) {
                           //   continue;
                           //}

                           Class3_Sub8.method125(var11, var12, var14, var13);
                           if(HDToolkit.openGLEnabled) {
                               GraphicsHD.clipRect(x, y, width, height);
                            } else {
                               GraphicsLD.clipRect(x, y, width, height);
                            }

                           if(0 != Class161.anInt2028 && 3 != Class161.anInt2028 || Class38_Sub1.aBoolean2615 || var16 > NpcDefinition.anInt1297 || ~Class38_Sub1.anInt2612 > ~var17 || ~NpcDefinition.anInt1297 <= ~var18 || ~var19 >= ~Class38_Sub1.anInt2612) {
                              continue;
                           }

                           var20 = NpcDefinition.anInt1297 - var13 - 25;
                           var21 = -var14 + Class38_Sub1.anInt2612;
                           var22 = client.mapbackSource[var21];
                           if(~var20 > ~var22 || ~var20 < ~(var22 + client.mapbackDest[var21])) {
                              continue;
                           }
                           
                           var20 += 15;

                           var21 -= var11.anInt193 / 2;
                           var23 = 2047 & SpotAnimation.cameraYaw + Class3_Sub13_Sub8.anInt3102;
                           var20 -= var11.anInt168 / 2;
                           var24 = Rasterizer.sineTable[var23];
                           var25 = Rasterizer.cosineTable[var23];
                           var24 = (Class164_Sub2.anInt3020 + 256) * var24 >> 8;
                           var25 = (Class164_Sub2.anInt3020 + 256) * var25 >> 8;
                           var47 = -(var24 * var20) + var25 * var21 >> 11;
                           var26 = var21 * var24 + (var20 * var25) >> 11;
                           var28 = TextureLoader.selfPlayer.anInt2819 + var26 >> 7;
                           var29 = -var47 + TextureLoader.selfPlayer.anInt2829 >> 7;
                           if(SceneGraphNode.aBoolean1837 && 0 != (Class164.anInt2051 & 64)) {
                              jInterface var53 = AbstractSprite.method638(SubScript.anInt872, jInterface.anInt278);
                              if(null != var53) {
                                 SubScript.method1177((short)11, Class144.anInt1887, 1L, Class131.aClass94_1724, var28, Class3_Sub28_Sub9.aClass94_3621, var29);
                              } else {
                                 Class25.method958((byte)-91);
                              }
                              continue;
                           }

                           SubScript.method1177((short)60, -1, 1L, GroundItem.aClass94_3672, var28, Class3_Sub13_Sub28.aClass94_3353, var29);
                           continue;
                        }

                        /*if(var11.clientCode == 1339) {
                           if(var11.method855(-30721)) {
                              CollisionMap.method1493(var13, var14, var11, var12, (byte)59);
                              if(!HDToolkit.openGLEnabled) {
                                 GraphicsLD.clipRect(x, y, width, height);
                              } else {
                                 GraphicsHD.clipRect(x, y, width, height);
                              }
                           }
                           continue;
                        }*/

                        /*if(var11.clientCode == 1400) {
                           Buffer.method799(var13, 64, var14, var11.anInt193, var11.anInt168);
                           GroundItem.aBooleanArray3674[var12] = true;
                           Class163_Sub1_Sub1.aBooleanArray4008[var12] = true;
                           if(HDToolkit.openGLEnabled) {
                              GraphicsHD.clipRect(x, y, width, height);
                           } else {
                              GraphicsLD.clipRect(x, y, width, height);
                           }
                           continue;
                        }*/

                       /* if(-1402 == ~var11.clientCode) {
                           Class1.method72(var13, var11.anInt193, var11.anInt168, 19481, var14);
                           GroundItem.aBooleanArray3674[var12] = true;
                           Class163_Sub1_Sub1.aBooleanArray4008[var12] = true;
                           if(!HDToolkit.openGLEnabled) {
                              GraphicsLD.clipRect(x, y, width, height);
                           } else {
                              GraphicsHD.clipRect(x, y, width, height);
                           }
                           continue;
                        }*/

                        /*if(1402 == var11.clientCode) {
                           if(!HDToolkit.openGLEnabled) {
                              AbstractTimer.method1768(var13, 95, var14);
                              GroundItem.aBooleanArray3674[var12] = true;
                              Class163_Sub1_Sub1.aBooleanArray4008[var12] = true;
                           }
                           continue;
                        }*/

                        /*if(~var11.clientCode == -1406) {
                           if(!Class20.aBoolean438) {
                              continue;
                           }

                           var20 = var11.anInt168 + var13;
                           var21 = 15 + var14;
                           client.getRegularFont().method688(client.method903(new jString[]{Class3_Sub13_Sub16.aClass94_3196, Class72.method1298(AnimationDefinition.anInt1862)}, (byte)-69), var20, var21, 16776960, -1);
                           var21 += 15;
                           Runtime var57 = Runtime.getRuntime();
                           var23 = (int)((var57.totalMemory() + -var57.freeMemory()) / 1024L);
                           var24 = 16776960;
                           if(~var23 < -65537) {
                              var24 = 16711680;
                           }

                           client.getRegularFont().method688(client.method903(new jString[]{Class3_Sub28_Sub10_Sub1.aClass94_4057, Class72.method1298(var23), Class151_Sub1.aClass94_2951}, (byte)-128), var20, var21, var24, -1);
                           var21 += 15;
                           if(HDToolkit.openGLEnabled) {
                              var24 = 16776960;
                              var25 = (Class31.anInt580 + Class31.anInt585 + Class31.anInt584) / 1024;
                              if(65536 < var25) {
                                 var24 = 16711680;
                              }

                              client.getRegularFont().method688(client.method903(new jString[]{Class118.aClass94_1622, Class72.method1298(var25), Class151_Sub1.aClass94_2951}, (byte)-97), var20, var21, var24, -1);
                              var21 += 15;
                           }

                           var24 = 16776960;
                           var25 = 0;
                           var47 = 0;
                           var26 = 0;

                           for(var28 = 0; var28 < client.indexCount; ++var28) {
                              var25 += Buffer.aClass151_Sub1Array2601[var28].method2108((byte)1);
                              var26 += Buffer.aClass151_Sub1Array2601[var28].method2102(0);
                              var47 += Buffer.aClass151_Sub1Array2601[var28].method2106(1);
                           }

                           var29 = 10000 * var26 / var25;
                           var28 = var47 * 100 / var25;
                           jString var55 = client.method903(new jString[]{Class20.aClass94_436, Class3_Sub23.method407(0, true, 2, (long)var29, 2), Class3_Sub21.aClass94_2498, Class72.method1298(var28), Class10.aClass94_148}, (byte)-113);
                           client.getSmallFont().method688(var55, var20, var21, var24, -1);
                           var21 += 12;
                           Class3_Sub28_Sub14.aBooleanArray3674[var12] = true;
                           Class163_Sub1_Sub1.aBooleanArray4008[var12] = true;
                           continue;
                        }*/

                        /*if(-1407 == ~var11.clientCode) {
                           RuntimeException_Sub1.anInt2115 = var14;
                           AbstractSprite.aClass11_3708 = var11;
                           Class3_Sub13_Sub23_Sub1.anInt4041 = var13;
                           continue;
                        }*/
                     }

                     if(!Class38_Sub1.aBoolean2615) {
                        if(~var11.type == -1 && var11.aBoolean219 && NpcDefinition.anInt1297 >= var16 && ~Class38_Sub1.anInt2612 <= ~var17 && NpcDefinition.anInt1297 < var18 && ~var19 < ~Class38_Sub1.anInt2612 && !LookupTable.qaoptestEnabled) {
                           Class3_Sub13_Sub34.anInt3415 = 1;
                           Class114.anIntArray1578[0] = AnimationLoader.anInt3590;
                           ItemPile.aClass94Array2935[0] = Class161.aClass94_2031;
                           Class163_Sub2_Sub1.aClass94Array4016[0] = GroundItem.aClass94_3672;
                           Class3_Sub13_Sub7.aShortArray3095[0] = 1005;
                        }

                        if(var16 <= NpcDefinition.anInt1297 && ~var17 >= ~Class38_Sub1.anInt2612 && var18 > NpcDefinition.anInt1297 && ~var19 < ~Class38_Sub1.anInt2612) {
                           Class3_Sub24_Sub4.method477(var11, Class38_Sub1.anInt2612 + -var14, -var13 + NpcDefinition.anInt1297);
                        }
                     }

                     if(-1 == ~var11.type) {
                        if(!var11.scriptedInterface && jInterface.isComponentHidden(var11) && Class107.aClass11_1453 != var11) {
                           continue;
                        }

                        if(!var11.scriptedInterface) {
                           if(~(-var11.anInt193 + var11.maxScrollVertical) > ~var11.anInt208) {
                              var11.anInt208 = -var11.anInt193 + var11.maxScrollVertical;
                           }

                           if(0 > var11.anInt208) {
                              var11.anInt208 = 0;
                           }
                        }

                        method1095(var16, -var11.anInt208 + var14, -var11.anInt247 + var13, var3, var18, var11.uid, var17, var19, (byte)87, var12);
                        if(null != var11.aClass11Array262) {
                           method1095(var16, -var11.anInt208 + var14, -var11.anInt247 + var13, var11.aClass11Array262, var18, var11.uid, var17, var19, (byte)52, var12);
                        }

                        OverridedInterface var36 = (OverridedInterface)Class3_Sub13_Sub17.aClass130_3208.get((long)var11.uid);
                        if(var36 != null) {
                           if(var36.type == 0 && !Class38_Sub1.aBoolean2615 && NpcDefinition.anInt1297 >= var16 && ~var17 >= ~Class38_Sub1.anInt2612 && ~var18 < ~NpcDefinition.anInt1297 && Class38_Sub1.anInt2612 < var19 && !LookupTable.qaoptestEnabled) {
                              ItemPile.aClass94Array2935[0] = Class161.aClass94_2031;
                              Class3_Sub13_Sub34.anInt3415 = 1;
                              Class114.anIntArray1578[0] = AnimationLoader.anInt3590;
                              Class3_Sub13_Sub7.aShortArray3095[0] = 1005;
                              Class163_Sub2_Sub1.aClass94Array4016[0] = GroundItem.aClass94_3672;
                           }

                           Class3_Sub13_Sub1.method171(-101, var36.uid, var16, var18, var13, var12, var19, var17, var14);
                        }

                        if(HDToolkit.openGLEnabled) {
                           GraphicsHD.clipRect(x, y, width, height);
                        } else {
                           GraphicsLD.clipRect(x, y, width, height);
                           Rasterizer.method1134();
                        }
                     }

                     if(Hashtable.aBooleanArray1712[var12] || ~ClientScript.anInt3689 < -2) {
                        if(-1 == ~var11.type && !var11.scriptedInterface && var11.maxScrollVertical > var11.anInt193) {
                           Class3_Sub13_Sub12.drawScroller(var11.anInt208, var11.maxScrollVertical, var11.anInt168 + var13, var14, var11.anInt193);
                        }

                        if(var11.type != 1) {
                           boolean var39;
                           boolean var46;
                           if(-3 == ~var11.type) {
                              var20 = 0;

                              for(var21 = 0; ~var21 > ~var11.height; ++var21) {
                                 for(var22 = 0; var11.width > var22; ++var22) {
                                    var24 = var14 + var21 * (32 - -var11.invSpritePadY);
                                    var23 = (var11.invSpritePadX + 32) * var22 + var13;
                                    if(var20 < 20) {
                                       var24 += var11.spriteY[var20];
                                       var23 += var11.spriteX[var20];
                                    }

                                    if(var11.inventoryIds[var20] <= 0) {
                                       if(null != var11.spriteId && var20 < 20) {
                                          AbstractSprite var58 = var11.method859(true, var20);
                                          if(null == var58) {
                                             if(GameShell.aBoolean6) {
                                                Class20.refreshInterface(var11);
                                             }
                                          } else {
                                             var58.method643(var23, var24);
                                          }
                                       }
                                    } else {
                                       var39 = false;
                                       var46 = false;
                                       var47 = var11.inventoryIds[var20] + -1;
                                       if(x < 32 + var23 && ~var23 > ~width && ~y > ~(var24 - -32) && ~var24 > ~height || var11 == Class67.aClass11_1017 && ~PacketParser.anInt86 == ~var20) {
                                          AbstractSprite var54;
                                          if(-2 == ~Class164_Sub1.anInt3012 && Class110.anInt1473 == var20 && ~var11.uid == ~Class3_Sub28_Sub18.anInt3764) {
                                             var54 = Class114.method1707(2, var47, var11.aBoolean227, var11.inventoryAmounts[var20], 0, 65536);
                                          } else {
                                             var54 = Class114.method1707(1, var47, var11.aBoolean227, var11.inventoryAmounts[var20], 3153952, 65536);
                                          }
                                          if(Rasterizer.aBoolean837) {
                                             GroundItem.aBooleanArray3674[var12] = true;
                                          }

                                          if(null == var54) {
                                             Class20.refreshInterface(var11);
                                          } else if(Class67.aClass11_1017 == var11 && var20 == PacketParser.anInt86) {
                                             var25 = PlainTile.anInt1676 - MillisTimer.anInt2693;
                                             var26 = -InputStream_Sub1.anInt40 + Hashtable.anInt1709;
                                             if(-6 < ~var26 && 4 > ~var26) {
                                                var26 = 0;
                                             }

                                             if(var25 < 5 && ~var25 < 4) {
                                                var25 = 0;
                                             }

                                             if(5 > Class40.anInt677) {
                                                var25 = 0;
                                                var26 = 0;
                                             }
                                             var54.drawTransparentSprite(var23 + var25, var24 - -var26, 128);
                                             if(var5 != -1) {
                                                jInterface var51 = var3[var5 & '\uffff'];
                                                int var31;
                                                int var30;
                                                if(HDToolkit.openGLEnabled) {
                                                   var31 = GraphicsHD.endY;
                                                   var30 = GraphicsHD.startY;
                                                } else {
                                                   var30 = GraphicsLD.startY;
                                                   var31 = GraphicsLD.endY;
                                                }

                                                int var32;
                                                if(~var30 < ~(var26 + var24) && -1 > ~var51.anInt208) {
                                                   var32 = DisplayModeInformation.anInt1446 * (-var26 + var30 + -var24) / 3;
                                                   if(~var32 < ~(DisplayModeInformation.anInt1446 * 10)) {
                                                      var32 = 10 * DisplayModeInformation.anInt1446;
                                                   }

                                                   if(var32 > var51.anInt208) {
                                                      var32 = var51.anInt208;
                                                   }

                                                   var51.anInt208 -= var32;
                                                   InputStream_Sub1.anInt40 += var32;
                                                   Class20.refreshInterface(var51);
                                                }

                                                if(var31 < 32 + var26 + var24 && var51.anInt208 < -var51.anInt193 + var51.maxScrollVertical) {
                                                   var32 = (-var31 + 32 + (var24 - -var26)) * DisplayModeInformation.anInt1446 / 3;
                                                   if(var32 > DisplayModeInformation.anInt1446 * 10) {
                                                      var32 = 10 * DisplayModeInformation.anInt1446;
                                                   }

                                                   if(-var51.anInt208 + var51.maxScrollVertical + -var51.anInt193 < var32) {
                                                      var32 = var51.maxScrollVertical + -var51.anInt193 + -var51.anInt208;
                                                   }

                                                   var51.anInt208 += var32;
                                                   InputStream_Sub1.anInt40 -= var32;
                                                   Class20.refreshInterface(var51);
                                                }
                                             }
                                          } else if(var11 == Class151.aClass11_1933 && var20 == KeyboardHandler.anInt1918) {
                                             var54.drawTransparentSprite(var23, var24, 128);
                                          } else {
                                             var54.method643(var23, var24);
                                          }
                                          int amount = var11.inventoryAmounts[var20];
                                          if (amount == -1) {
                                        	  client.infinitySymbol.method643(var23, var24);
                                          }
                                       }
                                    }

                                    ++var20;
                                 }
                              }
                           } else if(3 == var11.type) {
                              if(!InvType.method609(var11)) {
                                 var20 = var11.disabledColor;
                                 if(var11 == Class107.aClass11_1453 && 0 != var11.disabledMouseOverColor) {
                                    var20 = var11.disabledMouseOverColor;
                                 }
                              } else {
                                 var20 = var11.enabledColor;
                                 if(Class107.aClass11_1453 == var11 && 0 != var11.enabledMouseOverColor) {
                                    var20 = var11.enabledMouseOverColor;
                                 }
                              }

                              if(0 != var15) {
                                 if(var11.filled) {
                                    if(!HDToolkit.openGLEnabled) {
                                       GraphicsLD.fillRectAlpha(var13, var14, var11.anInt168, var11.anInt193, var20, 256 - (var15 & 255));
                                    } else {
                                       GraphicsHD.fillRectAlpha(var13, var14, var11.anInt168, var11.anInt193, var20, 256 - (var15 & 255));
                                    }
                                 } else if(HDToolkit.openGLEnabled) {
                                    GraphicsHD.drawRectAlpha(var13, var14, var11.anInt168, var11.anInt193, var20, 256 - (var15 & 255));
                                 } else {
                                    GraphicsLD.drawRectAlpha(var13, var14, var11.anInt168, var11.anInt193, var20, 256 - (var15 & 255));
                                 }
                              } else if(var11.filled) {
                                 if(HDToolkit.openGLEnabled) {
                                    GraphicsHD.fillRect(var13, var14, var11.anInt168, var11.anInt193, var20);
                                 } else {
                                    GraphicsLD.fillRect(var13, var14, var11.anInt168, var11.anInt193, var20);
                                 }
                              } else if(!HDToolkit.openGLEnabled) {
                                 GraphicsLD.drawRect(var13, var14, var11.anInt168, var11.anInt193, var20);
                              } else {
                                 GraphicsHD.drawRect(var13, var14, var11.anInt168, var11.anInt193, var20);
                              }
                           } else {
                              Font var34;
                              if(-5 == ~var11.type) {
                                 var34 = var11.method868(Class3_Sub13_Sub22.aClass109Array3270, 0);
                                 if(var34 != null) {
                                    jString var45 = var11.disabledText;
                                    if(!InvType.method609(var11)) {
                                       var21 = var11.disabledColor;
                                       if(Class107.aClass11_1453 == var11 && var11.disabledMouseOverColor != 0) {
                                          var21 = var11.disabledMouseOverColor;
                                       }
                                    } else {
                                       var21 = var11.enabledColor;
                                       if(Class107.aClass11_1453 == var11 && var11.enabledMouseOverColor != 0) {
                                          var21 = var11.enabledMouseOverColor;
                                       }

                                       if(~var11.enabledText.getLength() < -1) {
                                          var45 = var11.enabledText;
                                       }
                                    }

                                    if(var11.scriptedInterface && 0 != ~var11.anInt192) {
                                       ItemDefinition var50 = ItemDefinition.method1023(var11.anInt192);
                                       var45 = var50.aClass94_770;
                                       if(var45 == null) {
                                          var45 = Vertex.aClass94_829;
                                       }

                                       if((-2 == ~var50.stackable || -2 != ~var11.anInt271) && var11.anInt271 != -1) {
                                          var45 = client.method903(new jString[]{Class3_Sub13_Sub2.aClass94_3042, var45, Class3_Sub8.aClass94_2306, Huffman.method1013((byte)-125, var11.anInt271)});
                                       }
                                    }

                                    if(Class3_Sub13_Sub7.aClass11_3087 == var11) {
                                       var21 = var11.disabledColor;
                                       var45 = GroundTile.aClass94_2216;
                                    }

                                    if(!var11.scriptedInterface) {
                                       var45 = Class65943149.method1303(var11, var45, 0);
                                    }

                                    var34.method676(var45, var13, var14, var11.anInt168, var11.anInt193, var21, !var11.shaded?-1:0, var11.horizontalAlignment, var11.verticalAlignment, var11.verticalSpacing);
                                 } else if(GameShell.aBoolean6) {
                                    Class20.refreshInterface(var11);
                                 }
                              } else if(5 != var11.type) {
                                 ItemDefinition var42;
                                 if(var11.type == 6) {
                                    boolean var41 = InvType.method609(var11);
                                    AbstractModel var38 = null;
                                    if(var41) {
                                       var21 = var11.enabledAnim;
                                    } else {
                                       var21 = var11.disabledAnim;
                                    }

                                    var23 = 0;
                                    if(~var11.anInt192 != 0) {
                                       var42 = ItemDefinition.method1023(var11.anInt192);
                                       if(var42 != null) {
                                          var42 = var42.method1106(var11.anInt271, 78);
                                          AnimationDefinition var52 = ~var21 == 0?null:AnimationDefinition.list(var21, false);
                                          var38 = var42.method1110(100, var11.anInt260, var11.anInt267, var52, 1, var11.anInt283);
                                          if(var38 == null) {
                                             Class20.refreshInterface(var11);
                                          } else {
                                             var23 = -var38.method1871() / 2;
                                          }
                                       }
                                    } else if(5 != var11.mediaTypeDisabled) {
                                       if(0 == ~var21) {
                                          var38 = var11.method865(-1, (AnimationDefinition)null, -1, 0, var41, TextureLoader.selfPlayer.playerAppearance);
                                          if(null == var38 && GameShell.aBoolean6) {
                                             Class20.refreshInterface(var11);
                                          }
                                       } else {
                                          AnimationDefinition var48 = AnimationDefinition.list(var21, false);
                                          var38 = var11.method865(var11.anInt260, var48, var11.anInt283, var11.anInt267, var41, TextureLoader.selfPlayer.playerAppearance);
                                          if(null == var38 && GameShell.aBoolean6) {
                                             Class20.refreshInterface(var11);
                                          }
                                       }
                                    } else if(-1 == var11.mediaIdDisabled) {
                                       var38 = Class77.aClass52_1112.method1165((Class145[])null, -1, (AnimationDefinition)null, (AnimationDefinition)null, 0, -1, 100, 0, true, -1, -1);
                                    } else {
                                       var24 = 2047 & var11.mediaIdDisabled;
                                       if(~var24 == ~ClickMaskNode.anInt2211) {
                                          var24 = 2047;
                                       }

                                       Player var49 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var24];
                                       AnimationDefinition var56 = var21 == -1?null:AnimationDefinition.list(var21, false);
                                       if(null != var49 && ~((int)var49.username.toLong() << -1033903957) == ~(-2048 & var11.mediaIdDisabled)) {
                                          var38 = var49.playerAppearance.method1165((Class145[])null, -1, (AnimationDefinition)null, var56, 0, -1, -126, 0, true, var11.anInt283, 0);
                                       }
                                    }

                                    if(var38 != null) {
                                       if(~var11.anInt184 < -1) {
                                          var24 = (var11.anInt168 << -873624568) / var11.anInt184;
                                       } else {
                                          var24 = 256;
                                       }

                                       if(var11.anInt312 <= 0) {
                                          var25 = 256;
                                       } else {
                                          var25 = (var11.anInt193 << 991611304) / var11.anInt312;
                                       }

                                       var26 = var13 - -(var11.anInt168 / 2) - -(var24 * var11.translateX >> -1758325176);
                                       var47 = var11.anInt193 / 2 + var14 + (var25 * var11.translateY >> -1056321176);
                                       if(HDToolkit.openGLEnabled) {
                                          if(var11.aBoolean181) {
                                             HDToolkit.method1855(var26, var47, var11.zoom, var11.aShort293, var24, var25);
                                          } else {
                                             HDToolkit.method1821(var26, var47, var24, var25);
                                             HDToolkit.method1825((float)var11.aShort169, 1.5F * (float)var11.aShort293);
                                          }

                                          HDToolkit.method1846();
                                          HDToolkit.toggleFog(true);
                                          HDToolkit.toggleFog(false);
                                          Class3_Sub13_Sub33.method324(Class3_Sub28_Sub10.brightness);
                                          if(OutputStream_Sub1.aBoolean47) {
                                             GraphicsHD.initDefaultBounds();
                                             HDToolkit.method1841();
                                             GraphicsHD.clipRect(x, y, width, height);
                                             OutputStream_Sub1.aBoolean47 = false;
                                          }

                                          if(var11.depthBufferEnabled) {
                                             HDToolkit.disableDepthBuffer();
                                          }

                                          var28 = Rasterizer.sineTable[var11.rotateX] * var11.zoom >> -215429808;
                                          var29 = var11.zoom * Rasterizer.cosineTable[var11.rotateX] >> -957182768;
                                          if(var11.scriptedInterface) {
                                             var38.method1893(0, var11.rotateY, var11.rotateZ, var11.rotateX, var11.anInt258, var11.anInt264 + var28 + var23, var11.anInt264 + var29, -1L);
                                          } else {
                                             var38.method1893(0, var11.rotateY, 0, var11.rotateX, 0, var28, var29, -1L);
                                          }

                                          if(var11.depthBufferEnabled) {
                                             HDToolkit.enableDepthBuffer();
                                          }
                                       } else {
                                          Rasterizer.method1145(var26, var47);
                                          var28 = Rasterizer.sineTable[var11.rotateX] * var11.zoom >> 428930352;
                                          var29 = var11.zoom * Rasterizer.cosineTable[var11.rotateX] >> 1430420816;
                                          if(!var11.scriptedInterface) {
                                             var38.method1893(0, var11.rotateY, 0, var11.rotateX, 0, var28, var29, -1L);
                                          } else if(var11.aBoolean181) {
                                             ((LDModel)var38).method1946(0, var11.rotateY, var11.rotateZ, var11.rotateX, var11.anInt258, var11.anInt264 + var23 + var28, var29 + var11.anInt264, var11.zoom);
                                          } else {
                                             var38.method1893(0, var11.rotateY, var11.rotateZ, var11.rotateX, var11.anInt258, var11.anInt264 + (var28 - -var23), var29 + var11.anInt264, -1L);
                                          }

                                          Rasterizer.method1141();
                                       }
                                    }
                                 } else {
                                    if(-8 == ~var11.type) {
                                       var34 = var11.method868(Class3_Sub13_Sub22.aClass109Array3270, 0);
                                       if(var34 == null) {
                                          if(GameShell.aBoolean6) {
                                             Class20.refreshInterface(var11);
                                          }
                                          continue;
                                       }

                                       var21 = 0;

                                       for(var22 = 0; ~var11.height < ~var22; ++var22) {
                                          for(var23 = 0; var23 < var11.width; ++var23) {
                                             if(0 < var11.inventoryIds[var21]) {
                                                var42 = ItemDefinition.method1023(var11.inventoryIds[var21] + -1);
                                                jString var40;
                                                if(1 != var42.stackable && 1 == var11.inventoryAmounts[var21]) {
                                                   var40 = client.method903(new jString[]{Class3_Sub13_Sub2.aClass94_3042, var42.aClass94_770, StringNode.aClass94_2584});
                                                } else {
                                                   var40 = client.method903(new jString[]{Class3_Sub13_Sub2.aClass94_3042, var42.aClass94_770, Class3_Sub8.aClass94_2306, Huffman.method1013((byte)-100, var11.inventoryAmounts[var21])});
                                                }

                                                var26 = var13 + var23 * (var11.invSpritePadX + 115);
                                                var47 = (var11.invSpritePadY + 12) * var22 + var14;
                                                if(~var11.horizontalAlignment != -1) {
                                                   if(-2 == ~var11.horizontalAlignment) {
                                                      var34.method699(var40, 57 + var26, var47, var11.disabledColor, !var11.shaded?-1:0);
                                                   } else {
                                                      var34.method688(var40, -1 + var26 + 115, var47, var11.disabledColor, !var11.shaded?-1:0);
                                                   }
                                                } else {
                                                   var34.method681(var40, var26, var47, var11.disabledColor, var11.shaded?0:-1);
                                                }
                                             }

                                             ++var21;
                                          }
                                       }
                                    }

                                    if(var11.type == 8 && Class20.aClass11_439 == var11 && ~Class75.anInt1109 == ~Class3_Sub13_Sub26.anInt3323) {
                                       var21 = 0;
                                       var20 = 0;
                                       jString var43 = var11.disabledText;
                                       Font var35 = client.getRegularFont();
                                       var43 = Class65943149.method1303(var11, var43, 0);

                                       jString var44;
                                       while(-1 > ~var43.getLength()) {
                                          var25 = var43.method1551(Buffer.aClass94_2598);
                                          if(var25 != -1) {
                                             var44 = var43.substring(var25, 0);
                                             var43 = var43.method1556(var25 + 4, (byte)-74);
                                          } else {
                                             var44 = var43;
                                             var43 = GroundItem.aClass94_3672;
                                          }

                                          var26 = var35.method682(var44);
                                          var21 += var35.anInt3727 - -1;
                                          if(~var20 > ~var26) {
                                             var20 = var26;
                                          }
                                       }

                                       var26 = var14 - -var11.anInt193 - -5;
                                       var20 += 6;
                                       var21 += 7;
                                       if(~(var26 - -var21) < ~height) {
                                          var26 = -var21 + height;
                                       }

                                       var25 = -var20 + -5 + var13 - -var11.anInt168;
                                       if(var25 < 5 + var13) {
                                          var25 = 5 + var13;
                                       }

                                       if(~(var20 + var25) < ~width) {
                                          var25 = -var20 + width;
                                       }

                                       if(HDToolkit.openGLEnabled) {
                                          GraphicsHD.fillRect(var25, var26, var20, var21, 16777120);
                                          GraphicsHD.drawRect(var25, var26, var20, var21, 0);
                                       } else {
                                          GraphicsLD.fillRect(var25, var26, var20, var21, 16777120);
                                          GraphicsLD.drawRect(var25, var26, var20, var21, 0);
                                       }

                                       var43 = var11.disabledText;
                                       var47 = 2 + (var26 - -var35.anInt3727);

                                       for(var43 = Class65943149.method1303(var11, var43, 0); ~var43.getLength() < -1; var47 += var35.anInt3727 + 1) {
                                          var28 = var43.method1551(Buffer.aClass94_2598);
                                          if(0 == ~var28) {
                                             var44 = var43;
                                             var43 = GroundItem.aClass94_3672;
                                          } else {
                                             var44 = var43.substring(var28, 0);
                                             var43 = var43.method1556(4 + var28, (byte)-74);
                                          }

                                          var35.method681(var44, 3 + var25, var47, 0, -1);
                                       }
                                    }

                                    if(var11.type == 9) {
                                       if(var11.aBoolean167) {
                                          var20 = var13;
                                          var22 = var13 + var11.anInt168;
                                          var21 = var14 + var11.anInt193;
                                          var23 = var14;
                                       } else {
                                          var20 = var13;
                                          var21 = var14;
                                          var23 = var14 + var11.anInt193;
                                          var22 = var13 + var11.anInt168;
                                       }
                                       //var11.anInt250 = 1;
                                       //System.out.println("drawing line"+var11.anInt218);
                                       if(var11.thickness == 1) {
                                          if(!HDToolkit.openGLEnabled) {
                                             GraphicsLD.drawDiagonalLine(var20, var21, var22, var23, var11.disabledColor);
                                          } else {
                                             GraphicsHD.drawDiagonalLine(var20, var21, var22, var23, var11.disabledColor);
                                          }
                                       } else if(!HDToolkit.openGLEnabled) {
                                          GraphicsLD.drawDiagonalLine(var20, var21, var22, var23, var11.disabledColor, var11.thickness);
                                       } else {
                                          GraphicsHD.drawDiagonalLine(var20, var21, var22, var23, var11.disabledColor, var11.thickness);
                                       }
                                    }
                                 }
                              } else {
                                 AbstractSprite var37;
                                 if(!var11.scriptedInterface) {
                                    var37 = var11.method866((byte)-113, InvType.method609(var11));
                                    if(null != var37) {
                                       var37.method643(var13, var14);
                                    } else if(GameShell.aBoolean6) {
                                       Class20.refreshInterface(var11);
                                    }
                                 } else {
                                    if(var11.anInt192 != -1) {
                                       var37 = Class114.method1707(var11.outline, var11.anInt192, var11.aBoolean227, var11.anInt271, var11.shadow, 65536);
                                    } else {
                                       var37 = var11.method866((byte)-113, false);
                                    }

                                    if(var37 == null) {
                                       if(GameShell.aBoolean6) {
                                          Class20.refreshInterface(var11);
                                       }
                                    } else {
                                       var21 = var37.trimWidth;
                                       var22 = var37.trimHeight;
                                       if(!var11.aBoolean186) {
                                          var23 = var11.anInt168 * 4096 / var21;
                                          if(-1 == ~var11.rotatino) {
                                             if(0 != var15) {
                                                var37.method642(var13, var14, var11.anInt168, var11.anInt193, -(255 & var15) + 256);
                                             } else if(~var21 == ~var11.anInt168 && ~var22 == ~var11.anInt193) {
                                                var37.method643(var13, var14);
                                             } else {
                                                var37.method639(var13, var14, var11.anInt168, var11.anInt193);
                                             }
                                          } else {
                                             var37.method640(var14 + var11.anInt193 / 2, var11.rotatino, var23, var13 + var11.anInt168 / 2);
                                          }
                                       } else {
                                          var23 = (var21 + -1 + var11.anInt168) / var21;
                                          var24 = (var11.anInt193 - 1 - -var22) / var22;
                                          if(HDToolkit.openGLEnabled) {
                                             GraphicsHD.setBounds(var13, var14, var11.anInt168 + var13, var11.anInt193 + var14);
                                             var39 = Class140_Sub6.method2021(var37.width);
                                             var46 = Class140_Sub6.method2021(var37.height);
                                             HDSprite var27 = (HDSprite)var37;
                                             if(var39 && var46) {
                                                if(var15 != 0) {
                                                   var27.method646(var13, var14, -(255 & var15) + 256, var23, var24);
                                                } else {
                                                   var27.method649(var13, var14, var23, var24);
                                                }
                                             } else if(var39) {
                                                for(var28 = 0; ~var24 < ~var28; ++var28) {
                                                   if(~var15 == -1) {
                                                      var27.method649(var13, var28 * var22 + var14, var23, 1);
                                                   } else {
                                                      var27.method646(var13, var14 + var28 * var22, 256 + -(var15 & 255), var23, 1);
                                                   }
                                                }
                                             } else if(!var46) {
                                                for(var28 = 0; ~var28 > ~var23; ++var28) {
                                                   for(var29 = 0; ~var24 < ~var29; ++var29) {
                                                      if(var15 != 0) {
                                                         var37.drawTransparentSprite(var28 * var21 + var13, var22 * var29 + var14, -(255 & var15) + 256);
                                                      } else {
                                                         var37.method643(var13 - -(var21 * var28), var22 * var29 + var14);
                                                      }
                                                   }
                                                }
                                             } else {
                                                for(var28 = 0; ~var23 < ~var28; ++var28) {
                                                   if(~var15 != -1) {
                                                      var27.method646(var21 * var28 + var13, var14, -(var15 & 255) + 256, 1, var24);
                                                   } else {
                                                      var27.method649(var21 * var28 + var13, var14, 1, var24);
                                                   }
                                                }
                                             }

                                             GraphicsHD.clipRect(x, y, width, height);
                                          } else {
                                             GraphicsLD.method1326(var13, var14, var13 - -var11.anInt168, var14 - -var11.anInt193);

                                             for(var25 = 0; var25 < var23; ++var25) {
                                                for(var26 = 0; ~var26 > ~var24; ++var26) {
                                                   if(var11.rotatino == 0) {
                                                      if(0 == var15) {
                                                         var37.method643(var25 * var21 + var13, var22 * var26 + var14);
                                                      } else {
                                                         var37.drawTransparentSprite(var25 * var21 + var13, var14 + var26 * var22, 256 - (255 & var15));
                                                      }
                                                   } else {
                                                      var37.method640(var14 - -(var22 * var26) + var22 / 2, var11.rotatino, 4096, var25 * var21 + var13 + var21 / 2);
                                                   }
                                                }
                                             }

                                             GraphicsLD.clipRect(x, y, width, height);
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         if(var8 <= 31) {
            aClass153_748 = (js5)null;
         }

      } catch (RuntimeException var33) {
         throw Class44.method1067(var33, "gn.B(" + x + ',' + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ',' + width + ',' + var5 + ',' + y + ',' + height + ',' + var8 + ',' + var9 + ')');
      }
   }

   public static void method1096(byte var0) {
      try {
         aClass153_748 = null;
         if(var0 < 84) {
            method1091(true);
         }

         aClass94_750 = null;
         aClass93_743 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "gn.G(" + var0 + ')');
      }
   }

   final void method1097(NodeSub var1, long var2, byte var4) {
      try {
         if(-1 == ~this.anInt749) {
            NodeSub var5 = this.aClass13_747.method877();
            var5.unlink();
            var5.unlinkSub();
            if(this.aClass3_Sub28_744 == var5) {
               var5 = this.aClass13_747.method877();
               var5.unlink();
               var5.unlinkSub();
            }
         } else {
            --this.anInt749;
         }

         this.aClass130_745.put(var1, var2);
         int var7 = -76 % ((var4 - -5) / 35);
         this.aClass13_747.insertLast(var1);
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "gn.L(" + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var4 + ')');
      }
   }

   static final void method1098(byte var0) {
      try {
         if(-129 < ~Class3_Sub9.anInt2309) {
            Class3_Sub9.anInt2309 = 128;
         }

         if(-384 > ~Class3_Sub9.anInt2309) {
            Class3_Sub9.anInt2309 = 383;
         }

         SpotAnimation.cameraYaw &= 2047;
         if(var0 >= -31) {
            aClass153_748 = (js5)null;
         }

         int var1 = Class3_Sub13_Sub13.anInt3155 >> -971224825;
         int var2 = Class62.anInt942 >> -694284537;
         int var3 = Class121.method1736(Class26.plane, 1, Class3_Sub13_Sub13.anInt3155, Class62.anInt942);
         int var4 = 0;
         int var5;
         if(-4 > ~var1 && 3 < var2 && 100 > var1 && var2 < 100) {
            for(var5 = -4 + var1; var1 - -4 >= var5; ++var5) {
               for(int var6 = -4 + var2; var6 <= 4 + var2; ++var6) {
                  int var7 = Class26.plane;
                  if(3 > var7 && 2 == (2 & Class9.aByteArrayArrayArray113[1][var5][var6])) {
                     ++var7;
                  }

                  int var8 = (255 & Class136.aByteArrayArrayArray1774[var7][var5][var6]) * 8 - Class44.anIntArrayArrayArray723[var7][var5][var6] + var3;
                  if(var8 > var4) {
                     var4 = var8;
                  }
               }
            }
         }

         var5 = 192 * var4;
         if(-98049 > ~var5) {
            var5 = 98048;
         }

         if(-32769 < ~var5) {
            var5 = '\u8000';
         }

         if(~Class75_Sub4.anInt2670 <= ~var5) {
            if(~var5 > ~Class75_Sub4.anInt2670) {
               Class75_Sub4.anInt2670 += (var5 - Class75_Sub4.anInt2670) / 80;
            }
         } else {
            Class75_Sub4.anInt2670 += (-Class75_Sub4.anInt2670 + var5) / 24;
         }

      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "gn.D(" + var0 + ')');
      }
   }

   final Node method1099(int var1) {
      try {
         if(var1 != -1) {
            aClass93_743 = (Class93)null;
         }

         return this.aClass130_745.getNext();
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "gn.F(" + var1 + ')');
      }
   }

   static final int method1100(int var0, int var2) {
         if(0 == ~var2) {
            return 12345678;
         } else {

            var0 = var0 * (127 & var2) >> 2137332647;
            if(2 <= var0) {
               if(126 < var0) {
                  var0 = 126;
               }
            } else {
               var0 = 2;
            }

            return var0 + ('\uff80' & var2);
         }
   }

   final void method1101(int var1) {
      try {
         this.aClass13_747.clear();
         this.aClass130_745.clear();
         this.aClass3_Sub28_744 = new NodeSub();
         if(var1 != 2) {
            this.method1092(-36L, 52);
         }

         this.anInt749 = this.anInt746;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "gn.E(" + var1 + ')');
      }
   }

   Class47(int var1) {
      try {
         int var2 = 1;

         for(this.anInt749 = var1; ~var1 < ~(var2 - -var2); var2 += var2) {
            ;
         }

         this.anInt746 = var1;
         this.aClass130_745 = new Hashtable(var2);
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "gn.<init>(" + var1 + ')');
      }
   }

}
