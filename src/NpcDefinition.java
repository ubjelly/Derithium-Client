
final class NpcDefinition {

   int size = 1;
   private short[] aShortArray1246;
   private byte[] aByteArray1247;
   private short[] aShortArray1248;
   boolean aBoolean1249;
   private int[] anIntArray1250;
   private int anInt1251;
   static int anInt1252 = -1;
   int anInt1253;
   private short[] aShortArray1254;
   boolean aBoolean1255 = true;
   short aShort1256 = 0;
   private int anInt1257;
   private int[][] anIntArrayArray1258;
   jString[] aClass94Array1259;
   int anInt1260;
   private int[][] anIntArrayArray1261;
   int anInt1262 = -1;
   boolean aBoolean1263;
   private int anInt1264;
   int anInt1265;
   private int anInt1266;
   byte aByte1267;
   byte aByte1268;
   int anInt1269;
   boolean aBoolean1270 = true;
   private short[] aShortArray1271;
   private Hashtable aClass130_1272;
   jString aClass94_1273;
   int anInt1274;
   byte aByte1275;
   int anInt1276 = -1;
   static int[] anIntArray1277 = new int[2000];
   int anInt1278;
   int anInt1279;
   int anInt1280;
   private int anInt1282;
   int anInt1283;
   int anInt1284;
   boolean aBoolean1285;
   short aShort1286;
   byte aByte1287;
   private int[] anIntArray1288;
   int anInt1289;
   int anInt1290;
   int anInt1291;
   int[] anIntArray1292;
   int anInt1293;
   private int anInt1295;
   int anInt1296;
   static int anInt1297;
   int anInt1298;
   int idleAnim, walkAnim, turn180Animation, turn90CWAnimation, turn90CCAnimation = -1;


   final NpcDefinition method1471(byte var1) {
      try {
         int var2 = -1;
         if(~anInt1257 == 0) {
            if(anInt1295 != -1) {
               var2 = Class163_Sub1.variousSettings[anInt1295];
            }
         } else {
            var2 = method1484(64835055, anInt1257);
         }

         int var3;
         if(0 <= var2 && ~var2 > ~(-1 + anIntArray1292.length) && anIntArray1292[var2] != -1) {
            var3 = -24 % ((-46 - var1) / 41);
            return NpcDefinition.list(anIntArray1292[var2]);
         } else {
            var3 = anIntArray1292[-1 + anIntArray1292.length];
            return ~var3 == 0?null:NpcDefinition.list(var3);
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "me.G(" + var1 + ')');
      }
   }

   final boolean method1472(byte var1) {
      try {
         if(var1 != 74) {
            return true;
         } else if(null == anIntArray1292) {
            return true;
         } else {
            int var2 = -1;
            if(-1 == anInt1257) {
               if(~anInt1295 != 0) {
                  var2 = Class163_Sub1.variousSettings[anInt1295];
               }
            } else {
               var2 = method1484(64835055, anInt1257);
            }

            if(var2 >= 0 && var2 < -1 + anIntArray1292.length && -1 != anIntArray1292[var2]) {
               return true;
            } else {
               int var3 = anIntArray1292[-1 + anIntArray1292.length];
               return 0 != ~var3;
            }
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "me.L(" + var1 + ')');
      }
   }

   public static void method1473(byte var0) {
      try {
         anIntArray1277 = null;
         if(var0 != 103) {
            anInt1297 = -20;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "me.K(" + var0 + ')');
      }
   }

   final boolean method1474(int var1) {
      try {
         if(var1 != -1) {
            method1480(false, (jString)null, -57);
         }

         if(anIntArray1292 != null) {
            for(int var2 = 0; ~anIntArray1292.length < ~var2; ++var2) {
               if(0 != ~anIntArray1292[var2]) {
                  NpcDefinition var3 = NpcDefinition.list(anIntArray1292[var2]);
                  if(0 != ~var3.anInt1262 || 0 != ~var3.anInt1293 || var3.anInt1276 != -1) {
                     return true;
                  }
               }
            }

            return false;
         } else {
            return -1 != anInt1262 || anInt1293 != -1 || anInt1276 != -1;
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "me.E(" + var1 + ')');
      }
   }

   final int method1475(int var1, int var3) {
	   if(null != aClass130_1272) {
		   IntegerNode var4 = (IntegerNode)aClass130_1272.get((long)var1);
		   return var4 != null?var4.value:var3;
	   } else {
		   return var3;
	   }
   }

   final AbstractModel method1476(Class145[] var1, int var2, byte var3, int var4, int var5, int var6, int var7, AnimationDefinition var8, int var9, AnimationDefinition var10) {
      try {
         if(anIntArray1292 != null) {
            NpcDefinition var33 = method1471((byte)32);
            return null != var33?var33.method1476(var1, var2, (byte)-102, var4, var5, var6, var7, var8, var9, var10):null;
         } else {
            AbstractModel var11 = (AbstractModel)InterfaceListener.aClass93_2442.get((long)anInt1284);
            boolean var12;
            int var17;
            int var16;
            int var19;
            int var18;
            int var21;
            int var20;
            int var22;
            int var24;
            int var27;
            int var29;
            int var28;
            if(null == var11) {
               var12 = false;

               for(int var13 = 0; var13 < anIntArray1288.length; ++var13) {
                  if(anIntArray1288[var13] != -1 && !Class3_Sub13_Sub33.getModelJs5().method2129(0, anIntArray1288[var13])) {
                     var12 = true;
                  }
               }

               if(var12) {
                  return null;
               }

               ModelBuilder[] var14 = new ModelBuilder[anIntArray1288.length];

               for(int var15 = 0; ~anIntArray1288.length < ~var15; ++var15) {
                  if(0 != ~anIntArray1288[var15]) {
                     var14[var15] = ModelBuilder.get(Class3_Sub13_Sub33.getModelJs5(), anIntArray1288[var15], 0);
                     if(null != anIntArrayArray1261 && anIntArrayArray1261[var15] != null && var14[var15] != null) {
                        var14[var15].method2001(anIntArrayArray1261[var15][0], anIntArrayArray1261[var15][1], anIntArrayArray1261[var15][2]);
                     }
                  }
               }

               ModelBuilder var34;
               if(var14.length == 1) {
                  var34 = var14[0];
               } else {
                  var34 = new ModelBuilder(var14, var14.length);
               }

               if(aShortArray1248 != null) {
                  for(var16 = 0; ~aShortArray1248.length < ~var16; ++var16) {
                     if(null != aByteArray1247 && ~aByteArray1247.length < ~var16) {
                        var34.swapColors(aShortArray1248[var16], Class136.aShortArray1779[aByteArray1247[var16] & 255]);
                     } else {
                        var34.swapColors(aShortArray1248[var16], aShortArray1254[var16]);
                     }
                  }
               }

               if(null != aShortArray1271) {
                  for(var16 = 0; aShortArray1271.length > var16; ++var16) {
                     var34.method1998(aShortArray1271[var16], aShortArray1246[var16]);
                  }
               }

               var11 = var34.convert(anInt1251 + 64, anInt1282 + 850, -30, -50, -30);
               if(HDToolkit.openGLEnabled) {
                  ((HDModel)var11).method1920(false, false, false, true, false, false, true);
               }

               InterfaceListener.aClass93_2442.put(var11, (long)anInt1284);
            }

            var12 = false;
            boolean var37 = false;
            boolean var35 = false;
            boolean var36 = false;
            var16 = null != var1?var1.length:0;

            for(var17 = 0; ~var16 < ~var17; ++var17) {
               if(var1[var17] != null) {
                  AnimationDefinition var39 = AnimationDefinition.list(var1[var17].anInt1890, true);
                  if(null != var39.frames) {
                     Class85.aClass142Array1168[var17] = var39;
                     var20 = var1[var17].anInt1891;
                     var12 = true;
                     var19 = var1[var17].anInt1893;
                     var21 = var39.frames[var19];
                     Class3_Sub13_Sub1.aClass3_Sub28_Sub5Array3041[var17] = AnimationLoader.list(var21 >>> 16, 0, true);
                     var21 &= '\uffff';
                     Class58.anIntArray912[var17] = var21;
                     if(Class3_Sub13_Sub1.aClass3_Sub28_Sub5Array3041[var17] != null) {
                        var35 |= Class3_Sub13_Sub1.aClass3_Sub28_Sub5Array3041[var17].method561(var21);
                        var37 |= Class3_Sub13_Sub1.aClass3_Sub28_Sub5Array3041[var17].method559(var21);
                        var36 |= var39.aBoolean1848;
                     }

                     if((var39.tween || Class3_Sub26.forceTweeningEnabled) && 0 != ~var20 && ~var39.frames.length < ~var20) {
                        Class38.anIntArray664[var17] = var39.cycles[var19];
                        NodeSub.anIntArray2574[var17] = var1[var17].anInt1897;
                        var22 = var39.frames[var20];
                        Class3_Sub13_Sub23_Sub1.aClass3_Sub28_Sub5Array4031[var17] = AnimationLoader.list(var22 >>> 16, 0, false);
                        var22 &= '\uffff';
                        Class30.anIntArray574[var17] = var22;
                        if(null != Class3_Sub13_Sub23_Sub1.aClass3_Sub28_Sub5Array4031[var17]) {
                           var35 |= Class3_Sub13_Sub23_Sub1.aClass3_Sub28_Sub5Array4031[var17].method561(var22);
                           var37 |= Class3_Sub13_Sub23_Sub1.aClass3_Sub28_Sub5Array4031[var17].method559(var22);
                        }
                     } else {
                        Class38.anIntArray664[var17] = 0;
                        NodeSub.anIntArray2574[var17] = 0;
                        Class3_Sub13_Sub23_Sub1.aClass3_Sub28_Sub5Array4031[var17] = null;
                        Class30.anIntArray574[var17] = -1;
                     }
                  }
               }
            }

            if(!var12 && null == var10 && var8 == null) {
               AbstractModel var41 = var11.method1894(true, true, true);
               if(anInt1264 != 128 || -129 != ~anInt1266) {
                  var41.scale(anInt1264, anInt1266, anInt1264);
               }

               return var41;
            } else {
               var18 = -1;
               var17 = -1;
               var19 = 0;
               AnimationLoader var40 = null;
               AnimationLoader var43 = null;
               int var42;
               if(var10 != null) {
                  var17 = var10.frames[var7];
                  var22 = var17 >>> 16;
                  var17 &= '\uffff';
                  var40 = AnimationLoader.list(var22, 0, true);
                  if(null != var40) {
                     var35 |= var40.method561(var17);
                     var37 |= var40.method559(var17);
                     var36 |= var10.aBoolean1848;
                  }

                  if((var10.tween || Class3_Sub26.forceTweeningEnabled) && 0 != ~var5 && ~var10.frames.length < ~var5) {
                     var19 = var10.cycles[var7];
                     var18 = var10.frames[var5];
                     var42 = var18 >>> 16;
                     var18 &= '\uffff';
                     if(var22 != var42) {
                        var43 = AnimationLoader.list(var18 >>> 16, 0, true);
                     } else {
                        var43 = var40;
                     }

                     if(var43 != null) {
                        var35 |= var43.method561(var18);
                        var37 |= var43.method559(var18);
                     }
                  }
               }

               var22 = -1;
               var42 = -1;
               AnimationLoader var44 = null;
               var24 = 0;
               AnimationLoader var46 = null;
               if(var8 != null) {
                  var22 = var8.frames[var4];
                  var27 = var22 >>> 16;
                  var22 &= '\uffff';
                  var44 = AnimationLoader.list(var27, 0, true);
                  if(var44 != null) {
                     var35 |= var44.method561(var22);
                     var37 |= var44.method559(var22);
                     var36 |= var8.aBoolean1848;
                  }

                  if((var8.tween || Class3_Sub26.forceTweeningEnabled) && 0 != ~var2 && var2 < var8.frames.length) {
                     var24 = var8.cycles[var4];
                     var42 = var8.frames[var2];
                     var28 = var42 >>> 16;
                     var42 &= '\uffff';
                     if(~var28 == ~var27) {
                        var46 = var44;
                     } else {
                        var46 = AnimationLoader.list(var42 >>> 16, 0, true);
                     }

                     if(null != var46) {
                        var35 |= var46.method561(var42);
                        var37 |= var46.method559(var42);
                     }
                  }
               }

               AbstractModel var45 = var11.method1894(!var37, !var35, !var36);
               var29 = 1;

               for(var28 = 0; var28 < var16; ++var28) {
                  if(Class3_Sub13_Sub1.aClass3_Sub28_Sub5Array3041[var28] != null) {
                     var45.method1887(Class3_Sub13_Sub1.aClass3_Sub28_Sub5Array3041[var28], Class58.anIntArray912[var28], Class3_Sub13_Sub23_Sub1.aClass3_Sub28_Sub5Array4031[var28], Class30.anIntArray574[var28], -1 + NodeSub.anIntArray2574[var28], Class38.anIntArray664[var28], var29, Class85.aClass142Array1168[var28].aBoolean1848, anIntArrayArray1258[var28]);
                  }

                  var29 <<= 1;
               }

               if(var40 != null && var44 != null) {
                  var45.method1892(var40, var17, var43, var18, var6 + -1, var19, var44, var22, var46, var42, var9 + -1, var24, var10.aBooleanArray1855, var10.aBoolean1848 | var8.aBoolean1848);
               } else if(var40 == null) {
                  if(null != var44) {
                     var45.method1880(var44, var22, var46, var42, -1 + var9, var24, var8.aBoolean1848);
                  }
               } else {
                  var45.method1880(var40, var17, var43, var18, var6 + -1, var19, var10.aBoolean1848);
               }

               for(var28 = 0; ~var28 > ~var16; ++var28) {
                  Class3_Sub13_Sub1.aClass3_Sub28_Sub5Array3041[var28] = null;
                  Class3_Sub13_Sub23_Sub1.aClass3_Sub28_Sub5Array4031[var28] = null;
                  Class85.aClass142Array1168[var28] = null;
               }

               if(~anInt1264 != -129 || -129 != ~anInt1266) {
                  var45.scale(anInt1264, anInt1266, anInt1264);
               }

               return var45;
            }
         }
      } catch (RuntimeException var32) {
         throw Class44.method1067(var32, "me.M(" + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + (var8 != null?"{...}":"null") + ',' + var9 + ',' + (var10 != null?"{...}":"null") + ')');
      }
   }

   final jString method1477(int var1, jString var2, boolean var3) {
      try {
         if(null != aClass130_1272) {
            StringNode var4 = (StringNode)aClass130_1272.get((long)var1);
            return !var3?(jString)null:(null == var4?var2:var4.value);
         } else {
            return var2;
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "me.I(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

   final void method1478(Buffer var1, boolean new_header) {
	   while(true) {
           int var3 = var1.getUByte();
           if(-1 == ~var3) {
              return;
           }
           decode_525(var3, var1);
        }
   }

	/*static final void method1479(int var0) {
		Class3_Sub13_Sub30.anInt3362 = -1;

		if (-38 == ~var0) {
			Npc.aFloat3979 = 3.0F;
		} else if (50 != var0) {
			if (var0 == 75) {
				Npc.aFloat3979 = 6.0F;
			} else if (var0 != 100) {
				if (var0 == 200) {
					Npc.aFloat3979 = 16.0F;
				}
			} else {
				Npc.aFloat3979 = 8.0F;
			}
		} else {
			Npc.aFloat3979 = 4.0F;
		}

		Class3_Sub13_Sub30.anInt3362 = -1;
	}*/

   static final void method1480(boolean var0, jString var1, int var2) {
      try {
         short[] var3 = new short[16];
         var1 = var1.toLowerCase();
         int var4 = 0;

         for(int var5 = 0; ~var5 > ~Class3_Sub13_Sub23.anInt3287; ++var5) {
            ItemDefinition var6 = ItemDefinition.method1023(var5);
            if((!var0 || var6.aBoolean807) && var6.anInt791 == -1 && -1 == var6.anInt762 && -1 == ~var6.anInt800 && var6.aClass94_770.toLowerCase().method1551(var1) != -1) {
               if(~var4 <= -251) {
                  Class99.aShortArray1398 = null;
                  Class62.anInt952 = -1;
                  return;
               }

               if(~var4 <= ~var3.length) {
                  short[] var7 = new short[2 * var3.length];

                  for(int var8 = 0; var8 < var4; ++var8) {
                     var7[var8] = var3[var8];
                  }

                  var3 = var7;
               }

               var3[var4++] = (short)var5;
            }
         }

         Class99.aShortArray1398 = var3;
         Entity.anInt2756 = 0;
         Class62.anInt952 = var4;
         jString[] var10 = new jString[Class62.anInt952];

         for(int var11 = 0; Class62.anInt952 > var11; ++var11) {
            var10[var11] = ItemDefinition.method1023(var3[var11]).aClass94_770;
         }

         int var12 = -44 / ((45 - var2) / 33);
         Class3_Sub13_Sub29.method307(var10, Class99.aShortArray1398, 77);
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "me.J(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   final void method1481(int var1) {
      try {
         int var2 = 36 % ((12 - var1) / 41);
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "me.D(" + var1 + ')');
      }
   }

   final AbstractModel method1482(AnimationDefinition var1, int var2, int var3, int var4, int var5) {
         if(anIntArray1292 == null) {
            if(null == anIntArray1250) {
               return null;
            } else {
               AbstractModel var12 = (AbstractModel)Class154.aClass93_1964.get((long)anInt1284);
               if(var12 == null) {
                  boolean var7 = false;

                  for(int var8 = 0; ~var8 > ~anIntArray1250.length; ++var8) {
                     if(!Class3_Sub13_Sub33.getModelJs5().method2129(0, anIntArray1250[var8])) {
                        var7 = true;
                     }
                  }

                  if(var7) {
                     return null;
                  }

                  ModelBuilder[] var14 = new ModelBuilder[anIntArray1250.length];

                  for(int var9 = 0; ~var9 > ~anIntArray1250.length; ++var9) {
                     var14[var9] = ModelBuilder.get(Class3_Sub13_Sub33.getModelJs5(), anIntArray1250[var9], 0);
                  }

                  ModelBuilder var15;
                  if(-2 != ~var14.length) {
                     var15 = new ModelBuilder(var14, var14.length);
                  } else {
                     var15 = var14[0];
                  }

                  int var10;
                  if(null != aShortArray1248) {
                     for(var10 = 0; ~aShortArray1248.length < ~var10; ++var10) {
                        if(aByteArray1247 != null && ~var10 > ~aByteArray1247.length) {
                           var15.swapColors(aShortArray1248[var10], Class136.aShortArray1779[255 & aByteArray1247[var10]]);
                        } else {
                           var15.swapColors(aShortArray1248[var10], aShortArray1254[var10]);
                        }
                     }
                  }

                  if(aShortArray1271 != null) {
                     for(var10 = 0; ~var10 > ~aShortArray1271.length; ++var10) {
                        var15.method1998(aShortArray1271[var10], aShortArray1246[var10]);
                     }
                  }

                  var12 = var15.convert(64, 768, -50, -10, -50);
                  Class154.aClass93_1964.put(var12, (long)anInt1284);
               }

               if(null != var1) {
                  var12 = var1.method2055(var12, (byte)-75, var3, var2, var5);
               }

               return var12;
            }
         } else {
            NpcDefinition var6 = method1471((byte)-100);
            return null == var6?null:var6.method1482(var1, var2, var3, 54, var5);
         }
   }

   private final void decode_525(int opcode, Buffer buffer) {
	   if (opcode == 1) {
			int var4 = buffer.getUByte();
			anIntArray1288 = new int[var4];
			for (int var5 = 0; var4 > var5; ++var5) {
				anIntArray1288[var5] = buffer.getUShort();
				if (anIntArray1288[var5] == '\uffff') {
					anIntArray1288[var5] = -1;
				}
			}
		} else if (opcode == 2) {
			aClass94_1273 = buffer.getString();
		} else if (opcode == 12) {
			size = buffer.getUByte();
		} else if (opcode == 13) {
			idleAnim = buffer.getUShort();
		} else if (opcode == 14) {
			walkAnim = buffer.getUShort();
		} else if (opcode == 15) {
			buffer.getUShort();// TODO - ??
		} else if (opcode == 16) {
			buffer.getUShort();// TODO - ??
		} else if (opcode == 17) {
			walkAnim = buffer.getUShort();
			turn180Animation = buffer.getUShort();
			turn90CWAnimation = buffer.getUShort();
			turn90CCAnimation = buffer.getUShort();
		} else if (opcode >= 30 && opcode < 35) {
			aClass94Array1259[-30 + opcode] = buffer.getString();
			if (aClass94Array1259[opcode - 30].method1531(Class3_Sub13_Sub3.aClass94_3051))
				aClass94Array1259[opcode - 30] = null;
		} else if (opcode == 40) {
			int var4 = buffer.getUByte();
			aShortArray1254 = new short[var4];
			aShortArray1248 = new short[var4];
			for (int var5 = 0; var4 > var5; ++var5) {
				aShortArray1248[var5] = (short) buffer.getUShort();
				aShortArray1254[var5] = (short) buffer.getUShort();
			}
		} else if (opcode == 41) {
			int var4 = buffer.getUByte();
			aShortArray1246 = new short[var4];
			aShortArray1271 = new short[var4];
			for (int var5 = 0; ~var4 < ~var5; ++var5) {
				aShortArray1271[var5] = (short) buffer.getUShort();
				aShortArray1246[var5] = (short) buffer.getUShort();
			}
		} else if (opcode == 42) {
			int var4 = buffer.getUByte();
			aByteArray1247 = new byte[var4];
			for (int var5 = 0; var4 > var5; ++var5) {
				aByteArray1247[var5] = buffer.getByte();
			}
		} else if (opcode == 60) {
			int i = buffer.getUByte();
			anIntArray1250 = new int[i];
			for (int i_3_ = 0; i_3_ < i; i_3_++)
				anIntArray1250[i_3_] = buffer.getUShort();
		} else if (opcode == 93) {
			aBoolean1285 = false;
		} else if (opcode == 95) {
			anInt1260 = buffer.getUShort();
		} else if (opcode == 97) {
			anInt1264 = buffer.getUShort();
		} else if (opcode == 98) {
			anInt1266 = buffer.getUShort();
		} else if (opcode == 99) {
			aBoolean1263 = true;
		} else if (opcode == 100) {
			anInt1251 = buffer.getByte();
		} else if (opcode == 101) {
			anInt1282 = buffer.getByte() * 5;
		} else if (opcode == 102) {
			anInt1269 = buffer.getUShort();
		} else if (opcode == 103) {
			anInt1274 = buffer.getUShort();
		} else if (opcode == 106 || opcode == 118) {
			anInt1257 = buffer.getUShort();
            int var4 = -1;
            if(-65536 == ~anInt1257) {
               anInt1257 = -1;
            }
            anInt1295 = buffer.getUShort();
            if(~anInt1295 == -65536) {
               anInt1295 = -1;
            }
            if(opcode == 118) {
               var4 = buffer.getUShort();
               if(-65536 == ~var4) {
                  var4 = -1;
               }
            }
            int var5 = buffer.getUByte();
            anIntArray1292 = new int[2 + var5];
            for(int var6 = 0; ~var5 <= ~var6; ++var6) {
               anIntArray1292[var6] = buffer.getUShort();
               if(~anIntArray1292[var6] == -65536) {
                  anIntArray1292[var6] = -1;
               }
            }
            anIntArray1292[1 + var5] = var4;
		} else if (opcode == 107) {
			aBoolean1270 = false;
		} else if (opcode == 109) {
			aBoolean1255 = false;
		} else if (opcode == 111) {
			aBoolean1249 = false;
		} else if (opcode == 113) {
			aShort1286 = (short)buffer.getUShort();
            aShort1256 = (short)buffer.getUShort();
		} else if (opcode == 114) {
			aByte1287 = buffer.getByte();
            aByte1275 = buffer.getByte();
		} else if (opcode == 115) {
			buffer.getUByte();
			buffer.getUByte();
		} else if (opcode == 119) {
			aByte1267 = buffer.getByte();
		} else if (opcode == 120) {
			buffer.getUShort();
			buffer.getUShort();
			buffer.getUShort();
			buffer.getUByte();
		} else if (opcode == 121) {
			anIntArrayArray1261 = new int[anIntArray1288.length][];
            int var4 = buffer.getUByte();
            for(int var5 = 0; var5 < var4; ++var5) {
               int var6 = buffer.getUByte();
               int[] var7 = anIntArrayArray1261[var6] = new int[3];
               var7[0] = buffer.getByte();
               var7[1] = buffer.getByte();
               var7[2] = buffer.getByte();
            }
		} else if (opcode == 122) {
			anInt1279 = buffer.getUShort();
		} else if (opcode == 123) {
			anInt1265 = buffer.getUShort();
		} else if (opcode == 125) {
			aByte1268 = buffer.getByte();
		} else if (opcode == 126) {
			anInt1283 = buffer.getUShort();
		} else if (opcode == 249) {
			int var4 = buffer.getUByte();
            if(null == aClass130_1272) {
            	int var5 = Class95.method1585(var4);
               aClass130_1272 = new Hashtable(var5);
            }
            for(int var5 = 0; ~var5 > ~var4; ++var5) {
               boolean var11 = 1 == buffer.getUByte();
               int var10 = buffer.getMidInt();
               Object var8;
               if(!var11) {
                  var8 = new IntegerNode(buffer.getInt());
               } else {
                  var8 = new StringNode(buffer.getString());
               }
               aClass130_1272.put((Node)var8, (long)var10);
            }
		}
   }
 
   static final NpcDefinition list(int id) {
		NpcDefinition definition = (NpcDefinition) RawObjectCache.aClass93_4043.get((long) id);
		if (definition != null)
			return definition;
		byte[] data = Varp.aClass153_557.getFile(35, id);
		definition = new NpcDefinition();
		definition.anInt1284 = id;
		if (null != data) {
			definition.method1478(new Buffer(data), true);
		}
		switch (definition.anInt1284) {
		case 1265:
			definition.aBoolean1285 = true;
			break;
		case 872:
			definition.aClass94Array1259[2] = jString.createJString("Trade");
			break;
		case 198:
			definition.aClass94_1273 = jString.createJString("Combat Master");
			break;
		}
		definition.method1481(98);
		RawObjectCache.aClass93_4043.put(definition, (long) id);
		return definition;
   }

public NpcDefinition() {
      aClass94_1273 = AbstractGraphicsBuffer.aClass94_2006;
      anInt1260 = -1;
      aBoolean1285 = true;
      anInt1253 = -1;
      anInt1282 = 0;
      anInt1283 = -1;
      anInt1264 = 128;
      aByte1275 = -16;
      anInt1269 = -1;
      aByte1267 = 0;
      aBoolean1249 = true;
      aShort1286 = 0;
      anInt1289 = -1;
      anInt1279 = -1;
      anInt1251 = 0;
      aBoolean1263 = false;
      anInt1274 = 32;
      aClass94Array1259 = new jString[5];
      anInt1293 = -1;
      aByte1287 = -96;
      aByte1268 = 7;
      anInt1280 = -1;
      anInt1296 = -1;
      anInt1291 = 0;
      anInt1266 = 128;
      anInt1257 = -1;
      anInt1290 = -1;
      anInt1265 = -1;
      anInt1278 = -1;
      anInt1295 = -1;
      anInt1298 = -1;
   }

   static final int method1484(int var0, int var1) {
      try {
         if(var0 != 64835055) {
            anIntArray1277 = (int[])null;
         }

         VarBit var2 = VarBit.list(var1);
         int var3 = var2.setting;
         int var5 = var2.endBit;
         int var4 = var2.startBit;
         int var6 = Class3_Sub6.anIntArray2288[var5 + -var4];
         return Class163_Sub1.variousSettings[var3] >> var4 & var6;
      } catch (RuntimeException var7) {
         throw Class44.method1067(var7, "me.B(" + var0 + ',' + var1 + ')');
      }
   }

}
