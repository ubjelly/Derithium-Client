import javax.media.opengl.GL;

final class Class104 implements Interface5 {

   static boolean[] aBooleanArray2169 = new boolean[5];
   static jString aClass94_2171 = jString.createJString("");
   static js5 aClass153_2172;
   private int anInt2173;
   private float[] aFloatArray2174 = new float[4];
   private static jString aClass94_2175 = jString.createJString(")4a=");
   static jString aClass94_2176 = jString.createJString("(U0a )2 non)2existant gosub script)2num: ");


   static final void method1626(byte var0) {
      try {
         Class3_Sub28_Sub4.aClass93_3572.clearAll();
         Class143.aClass93_1874.clearAll();
         if(var0 <= -124) {
            Class67.aClass93_1013.clearAll();
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ob.F(" + var0 + ')');
      }
   }

   static final boolean method1627(int var0, byte var1) {
      try {
         Class44_Sub1 var2 = Class3_Sub8.method130(97, var0);
         if(var2 != null) {
            if(1 != Signlink.anInt1214 && -3 != ~Signlink.anInt1214 && -3 != ~Class44.modeWhere) {
               jString var9 = GameShell.aClass94_8;
               if(Class44.modeWhere != 0) {
                  var9 = client.method903(new jString[]{Class163_Sub1_Sub1.aClass94_4007, Class72.method1298(var2.anInt2621 - -7000)});
               }

               if(var1 > -2) {
                  return false;
               } else {
                  jString var4 = GameShell.aClass94_8;
                  if(Class163_Sub2.aClass94_2996 != null) {
                     var4 = client.method903(new jString[]{Class97.aClass94_1380, Class163_Sub2.aClass94_2996});
                  }

                  jString var5 = client.method903(new jString[]{Class65.aClass94_992, var2.aClass94_2625, var9, OverridedInterface.aClass94_2608, Class72.method1298(0), aClass94_2175, Class72.method1298(Class3_Sub26.anInt2554), var4, Class80.aClass94_1133, !Class3_Sub28_Sub11.aBoolean3641?Class164_Sub1.aClass94_3013:Class14.aClass94_339, Class38_Sub1.aClass94_2610, !Class163_Sub2_Sub1.objectTag?Class164_Sub1.aClass94_3013:Class14.aClass94_339, Class118.aClass94_1617, Class3_Sub28_Sub19.advertSuppressed?Class14.aClass94_339:Class164_Sub1.aClass94_3013});

                  try {
                     PlainTile.aClient1671.getAppletContext().showDocument(var5.method1527(false), "_self");
                  } catch (Exception var7) {
                     return false;
                  }

                  return true;
               }
            } else {
               byte[] var3 = var2.aClass94_2625.method1568(0);
               Class38_Sub1.aString2611 = new String(var3, 0, var3.length);
               InterfaceListener.anInt2451 = var2.anInt2621;
               if(-1 != ~Class44.modeWhere) {
                  Class162.anInt2036 = '\u9c40' + InterfaceListener.anInt2451;
                  Class140_Sub6.anInt2894 = Class162.anInt2036;
                  Class26.anInt506 = InterfaceListener.anInt2451 + '\uc350';
               }

               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "ob.E(" + var0 + ',' + var1 + ')');
      }
   }

   static final void method1628(int var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         int var9;
         int var12;
         if(~Class164_Sub1.anInt3012 == -1) {
            int var10 = Class86.anInt1195;
            var9 = Class1.anInt55;
            int var8 = Class145.anInt1898;
            int var7 = Class139.anInt1824;
            int var11 = (var5 - var3) * (-var7 + var8) / var1 - -var7;
            var12 = var9 + (var10 + -var9) * (-var0 + var4) / var2;
            if(SceneGraphNode.aBoolean1837 && ~(64 & Class164.anInt2051) != -1) {
               jInterface var13 = AbstractSprite.method638(SubScript.anInt872, jInterface.anInt278);
               if(var13 != null) {
                  SubScript.method1177((short)11, Class144.anInt1887, 0L, Class131.aClass94_1724, var11, Class3_Sub28_Sub9.aClass94_3621, var12);
               } else {
                  Class25.method958((byte)-87);
               }
            } else {
               SubScript.method1177((short)60, -1, 0L, GroundItem.aClass94_3672, var11, Class3_Sub13_Sub28.aClass94_3353, var12);
            }
         }

         if(var6 > 48) {
            long var25 = -1L;

            for(var9 = 0; Class2.anInt59 > var9; ++var9) {
               long var26 = Class3_Sub13_Sub38.aLongArray3448[var9];
               var12 = (int)var26 & 127;
               int var14 = ((int)var26 & 2009320690) >> 29;
               int var15 = (int)(var26 >>> 32) & Integer.MAX_VALUE;
               int var27 = 127 & (int)var26 >> 7;
               if(~var26 != ~var25) {
                  var25 = var26;
                  int var18;
                  if(~var14 == -3 && Class151.method2096(Class26.plane, var12, var27, var26)) {
                     ObjectDefinition var16 = ObjectDefinition.list(var15);
                     if(null != var16.anIntArray1524) {
                        var16 = var16.method1685();
                     }

                     if(null == var16) {
                        continue;
                     }

                     if(-2 == ~Class164_Sub1.anInt3012) {
                        SubScript.method1177((short)14, Class99.anInt1403, var26, client.method903(new jString[]{client.aClass94_378, Class3_Sub28_Sub4.aClass94_3573, var16.name}), var12, Class3_Sub13_Sub32.aClass94_3388, var27);
                     } else if(!SceneGraphNode.aBoolean1837) {
                        jString[] var29 = var16.aClass94Array1499;
                        if(Class123.aBoolean1656) {
                           var29 = OverridedInterface.method822(19406, var29);
                        }

                        if(var29 != null) {
                           for(var18 = 4; var18 >= 0; --var18) {
                              if(null != var29[var18]) {
                                 short var19 = 0;
                                 if(var18 == 0) {
                                    var19 = 42;
                                 }

                                 if(-2 == ~var18) {
                                    var19 = 50;
                                 }

                                 int var20 = -1;
                                 if(2 == var18) {
                                    var19 = 49;
                                 }

                                 if(var16.anInt1493 == var18) {
                                    var20 = var16.anInt1517;
                                 }

                                 if(-4 == ~var18) {
                                    var19 = 46;
                                 }

                                 if(var18 == var16.anInt1520) {
                                    var20 = var16.anInt1522;
                                 }

                                 if(-5 == ~var18) {
                                    var19 = 1001;
                                 }

                                 SubScript.method1177(var19, var20, var26, client.method903(new jString[]{Class139.aClass94_1826, var16.name}), var12, var29[var18], var27);
                              }
                           }
                        }

                        SubScript.method1177((short)1004, Class131.anInt1719, (long)var16.anInt1527, client.method903(new jString[]{Class139.aClass94_1826, var16.name}), var12, Class86.aClass94_1180, var27);
                     } else {
                        Class3_Sub28_Sub9 var17 = -1 == LookupTable.anInt1038?null:Deque.method1210(64, LookupTable.anInt1038);
                        if(0 != (Class164.anInt2051 & 4) && (var17 == null || ~var16.method1691(var17.anInt3614, LookupTable.anInt1038, (byte)98) != ~var17.anInt3614)) {
                           SubScript.method1177((short)38, Class144.anInt1887, var26, client.method903(new jString[]{Class40.aClass94_676, Class3_Sub28_Sub4.aClass94_3573, var16.name}), var12, Class3_Sub28_Sub9.aClass94_3621, var27);
                        }
                     }
                  }

                  int var21;
                  int var22;
                  int var33;
                  Player var38;
                  Npc var36;
                  int var37;
                  if(-2 == ~var14) {
                     Npc var31 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var15];
                     if(~(var31.aClass90_3976.size & 1) == -1 && -1 == ~(127 & var31.anInt2819) && ~(var31.anInt2829 & 127) == -1 || 1 == (var31.aClass90_3976.size & 1) && (127 & var31.anInt2819) == 64 && -65 == ~(var31.anInt2829 & 127)) {
                        var33 = var31.anInt2819 - -64 - 64 * var31.aClass90_3976.size;
                        var18 = -((-1 + var31.aClass90_3976.size) * 64) + var31.anInt2829;

                        for(var37 = 0; var37 < Class163.anInt2046; ++var37) {
                           var36 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[Class15.anIntArray347[var37]];
                           var21 = -(var36.aClass90_3976.size * 64) - -64 + var36.anInt2819;
                           var22 = var36.anInt2829 + -(var36.aClass90_3976.size * 64) - -64;
                           if(var36 != null && var31 != var36 && ~var21 <= ~var33 && var31.aClass90_3976.size - (-var33 + var21 >> 7) >= var36.aClass90_3976.size && var18 <= var22 && var36.aClass90_3976.size <= -(-var18 + var22 >> 7) + var31.aClass90_3976.size) {
                              Class144.method2068(var36.aClass90_3976, var12, -126, Class15.anIntArray347[var37], var27);
                           }
                        }

                        for(var37 = 0; ~Class159.anInt2022 < ~var37; ++var37) {
                           var38 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[Class56.anIntArray887[var37]];
                           var21 = var38.anInt2819 + 64 + -(64 * var38.getSize());
                           var22 = var38.anInt2829 - (var38.getSize() * 64 + -64);
                           if(var38 != null && var21 >= var33 && ~var38.getSize() >= ~(var31.aClass90_3976.size - (var21 - var33 >> 7)) && ~var22 <= ~var18 && var38.getSize() <= -(-var18 + var22 >> 7) + var31.aClass90_3976.size) {
                              Class3_Sub13_Sub30.method312(Class56.anIntArray887[var37], 5, var27, var38, var12);
                           }
                        }
                     }

                     Class144.method2068(var31.aClass90_3976, var12, -108, var15, var27);
                  }

                  if(var14 == 0) {
                     Player var30 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var15];
                     if((127 & var30.anInt2819) == 64 && 64 == (127 & var30.anInt2829)) {
                        var33 = var30.anInt2819 + -(64 * (-1 + var30.getSize()));
                        var18 = var30.anInt2829 + 64 + -(var30.getSize() * 64);

                        for(var37 = 0; var37 < Class163.anInt2046; ++var37) {
                           var36 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[Class15.anIntArray347[var37]];
                           var21 = var36.anInt2819 + -(var36.aClass90_3976.size * 64) - -64;
                           var22 = var36.anInt2829 - 64 * var36.aClass90_3976.size - -64;
                           if(var36 != null && var21 >= var33 && var36.aClass90_3976.size <= -(var21 - var33 >> 7) + var30.getSize() && ~var22 <= ~var18 && ~var36.aClass90_3976.size >= ~(-(-var18 + var22 >> 7) + var30.getSize())) {
                              Class144.method2068(var36.aClass90_3976, var12, -121, Class15.anIntArray347[var37], var27);
                           }
                        }

                        for(var37 = 0; var37 < Class159.anInt2022; ++var37) {
                           var38 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[Class56.anIntArray887[var37]];
                           var21 = var38.anInt2819 - (var38.getSize() + -1) * 64;
                           var22 = var38.anInt2829 - (-64 + 64 * var38.getSize());
                           if(null != var38 && var38 != var30 && ~var33 >= ~var21 && var38.getSize() <= var30.getSize() - (var21 - var33 >> 7) && ~var22 <= ~var18 && ~var38.getSize() >= ~(-(var22 + -var18 >> 7) + var30.getSize())) {
                              Class3_Sub13_Sub30.method312(Class56.anIntArray887[var37], 9, var27, var38, var12);
                           }
                        }
                     }

                     Class3_Sub13_Sub30.method312(var15, 31, var27, var30, var12);
                  }

                  if(~var14 == -4) {
                     Deque var28 = Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[Class26.plane][var12][var27];
                     if(null != var28) {
                        for(GroundItem var32 = (GroundItem)var28.method1212(2); null != var32; var32 = (GroundItem)var28.getPrevious()) {
                           var18 = var32.aClass140_Sub7_3676.id;
                           ItemDefinition var40 = ItemDefinition.method1023(var18);
                           if(-2 == ~Class164_Sub1.anInt3012) {
                              SubScript.method1177((short)33, Class99.anInt1403, (long)var18, client.method903(new jString[]{client.aClass94_378, Hashtable.aClass94_1699, var40.aClass94_770}), var12, Class3_Sub13_Sub32.aClass94_3388, var27);
                           } else if(!SceneGraphNode.aBoolean1837) {
                              jString[] var34 = var40.aClass94Array801;
                              if(Class123.aBoolean1656) {
                                 var34 = OverridedInterface.method822(19406, var34);
                              }

                              for(var21 = 4; ~var21 <= -1; --var21) {
                                 if(var34 != null && null != var34[var21]) {
                                    byte var35 = 0;
                                    if(~var21 == -1) {
                                       var35 = 21;
                                    }

                                    if(1 == var21) {
                                       var35 = 34;
                                    }

                                    int var23 = -1;
                                    if(~var21 == ~var40.anInt767) {
                                       var23 = var40.anInt758;
                                    }

                                    if(var21 == 2) {
                                       var35 = 18;
                                    }

                                    if(var40.anInt788 == var21) {
                                       var23 = var40.anInt756;
                                    }

                                    if(~var21 == -4) {
                                       var35 = 20;
                                    }

                                    if(-5 == ~var21) {
                                       var35 = 24;
                                    }

                                    SubScript.method1177(var35, var23, (long)var18, client.method903(new jString[]{Class3_Sub13_Sub2.aClass94_3042, var40.aClass94_770}), var12, var34[var21], var27);
                                 }
                              }

                              SubScript.method1177((short)1002, Class131.anInt1719, (long)var18, client.method903(new jString[]{Class3_Sub13_Sub2.aClass94_3042, var40.aClass94_770}), var12, Class86.aClass94_1180, var27);
                           } else {
                              //Class3_Sub28_Sub9 var39 = LookupTable.anInt1038 == -1?null:Deque.method1210(64, LookupTable.anInt1038);
                              //if((Class164.anInt2051 & 1) != 0 && (null == var39 || ~var40.method1115(var39.anInt3614, LookupTable.anInt1038) != ~var39.anInt3614)) {
                              if((Class164.anInt2051 & 1) != 0) {
                                 SubScript.method1177((short)39, Class144.anInt1887, (long)var18, client.method903(new jString[]{Class40.aClass94_676, Hashtable.aClass94_1699, var40.aClass94_770}), var12, Class3_Sub28_Sub9.aClass94_3621, var27);
                              }
                           }
                        }
                     }
                  }
               }
            }

         }
      } catch (RuntimeException var24) {
         throw Class44.method1067(var24, "ob.K(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   static final void method1629(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19) {
      int var21;
      PlainTile var20;
      if(var3 == 0) {
         var20 = new PlainTile(var10, var11, var12, var13, -1, var18, false);

         for(var21 = var0; var21 >= 0; --var21) {
            if(Class75_Sub2.groundTiles[var21][var1][var2] == null) {
               Class75_Sub2.groundTiles[var21][var1][var2] = new GroundTile(var21, var1, var2);
            }
         }

         Class75_Sub2.groundTiles[var0][var1][var2].plainTile = var20;
      } else if(var3 != 1) {
         ShapedTile var22 = new ShapedTile(var3, var4, var5, var1, var2, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19);

         for(var21 = var0; var21 >= 0; --var21) {
            if(Class75_Sub2.groundTiles[var21][var1][var2] == null) {
               Class75_Sub2.groundTiles[var21][var1][var2] = new GroundTile(var21, var1, var2);
            }
         }

         Class75_Sub2.groundTiles[var0][var1][var2].shapedTile = var22;
      } else {
         var20 = new PlainTile(var14, var15, var16, var17, var5, var19, var6 == var7 && var6 == var8 && var6 == var9);

         for(var21 = var0; var21 >= 0; --var21) {
            if(Class75_Sub2.groundTiles[var21][var1][var2] == null) {
               Class75_Sub2.groundTiles[var21][var1][var2] = new GroundTile(var21, var1, var2);
            }
         }

         Class75_Sub2.groundTiles[var0][var1][var2].plainTile = var20;
      }
   }

   public final int method24() {
      try {
         return 0;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ob.C()");
      }
   }

   public final void method23(int var1) {
         GL var2 = HDToolkit.gl;
         float var4 = (float)(1 + (var1 >> 3 & 3)) * 0.01F;
         float var3 = -0.01F * (float)(1 + (var1 & 3));
         float var5 = 0 == (var1 & 64)?4.8828125E-4F:9.765625E-4F;
         boolean var6 = -1 != ~(128 & var1);
         if(var6) {
            this.aFloatArray2174[0] = var5;
            this.aFloatArray2174[1] = 0.0F;
            this.aFloatArray2174[2] = 0.0F;
            this.aFloatArray2174[3] = 0.0F;
         } else {
            this.aFloatArray2174[2] = var5;
            this.aFloatArray2174[1] = 0.0F;
            this.aFloatArray2174[3] = 0.0F;
            this.aFloatArray2174[0] = 0.0F;
         }

         var2.glActiveTexture('\u84c1');
         var2.glMatrixMode(5888);
         var2.glPushMatrix();
         var2.glLoadIdentity();
         var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
         var2.glRotatef((float)ItemPile.renderPitch2 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
         var2.glRotatef(360.0F * (float)Class3_Sub13_Sub8.renderYaw2 / 2048.0F, 0.0F, 1.0F, 0.0F);
         var2.glTranslatef((float)(-Class9.renderX2), (float)(-ClientScript.renderZ2), (float)(-StringNode.renderY2));
         var2.glTexGenfv(8192, 9474, this.aFloatArray2174, 0);
         this.aFloatArray2174[3] = var3 * (float)HDToolkit.anInt1791;
         this.aFloatArray2174[0] = 0.0F;
         this.aFloatArray2174[2] = 0.0F;
         this.aFloatArray2174[1] = var5;
         var2.glTexGenfv(8193, 9474, this.aFloatArray2174, 0);
         var2.glPopMatrix();
         if(!Class88.aBoolean1227) {
            int var7 = (int)((float)HDToolkit.anInt1791 * var4 * 64.0F);
            var2.glBindTexture(3553, Class88.anIntArray1223[var7 % 64]);
         } else {
            this.aFloatArray2174[3] = (float)HDToolkit.anInt1791 * var4;
            this.aFloatArray2174[1] = 0.0F;
            this.aFloatArray2174[0] = 0.0F;
            this.aFloatArray2174[2] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.aFloatArray2174, 0);
         }

         var2.glActiveTexture('\u84c0');
   }

   public final void method21() {
	   GL var1 = HDToolkit.gl;
	   var1.glCallList(1 + this.anInt2173);
   }

   public final void method22() {
	   GL var1 = HDToolkit.gl;
	   var1.glCallList(this.anInt2173);
   }

   public static void method1630(byte var0) {
      try {
         aClass94_2171 = null;
         aClass153_2172 = null;
         aBooleanArray2169 = null;
         aClass94_2176 = null;
         if(var0 > -112) {
            method1632(-116, 108, 54, -120, 44, 6);
         }

         aClass94_2175 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ob.J(" + var0 + ')');
      }
   }

   private final void method1631(int var1) {
		GL var2 = HDToolkit.gl;
		this.anInt2173 = var2.glGenLists(var1);
		var2.glNewList(this.anInt2173, 4864);
		var2.glActiveTexture('\u84c1');
		if (!Class88.aBoolean1227) {
			var2.glEnable(3553);
		} else {
			var2.glBindTexture('\u806f', Class88.anInt1229);
			var2.glTexGeni(8194, 9472, 9217);
			var2.glEnable(3170);
			var2.glEnable('\u806f');
		}

		var2.glTexGeni(8192, 9472, 9216);
		var2.glTexGeni(8193, 9472, 9216);
		var2.glEnable(3168);
		var2.glEnable(3169);
		var2.glActiveTexture('\u84c0');
		var2.glEndList();
		var2.glNewList(this.anInt2173 + 1, 4864);
		var2.glActiveTexture('\u84c1');
		if (Class88.aBoolean1227) {
			var2.glDisable('\u806f');
			var2.glDisable(3170);
		} else {
			var2.glDisable(3553);
		}

		var2.glDisable(3168);
		var2.glDisable(3169);
		var2.glActiveTexture('\u84c0');
		var2.glEndList();
   }

   public Class104() {
	   this.method1631(2);
   }

   static final void method1632(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         if(var0 <= 66) {
            method1630((byte)-33);
         }

         for(int var6 = var3; ~var1 <= ~var6; ++var6) {
            Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var6], var4, var2, var5);
         }

      } catch (RuntimeException var7) {
         throw Class44.method1067(var7, "ob.G(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

}
