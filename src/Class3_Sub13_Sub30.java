
final class Class3_Sub13_Sub30 extends Class3_Sub13 {

   //static int anInt3362 = -1;
   static int anInt3363;
   static Deque aClass61_3364 = new Deque();
   static long lastJs5ConnectionTime;
   static int[] anIntArray3367 = new int[64];
   //static jString aClass94_3368 = jString.createJString(":clanreq:");


   static final void method312(int var0, int var1, int var2, Player var3, int var4) {
      try {
         if(TextureLoader.selfPlayer != var3) {
            if(Class3_Sub13_Sub34.anInt3415 < 400) {
               jString var5;
               if(-1 == ~var3.anInt3974) {
                  boolean var6 = true;
                  if(~TextureLoader.selfPlayer.anInt3970 != 0 && -1 != var3.anInt3970) {
                     int var7 = var3.combatLevel < TextureLoader.selfPlayer.combatLevel?TextureLoader.selfPlayer.combatLevel:var3.combatLevel;
                     int var8 = ~TextureLoader.selfPlayer.anInt3970 > ~var3.anInt3970?TextureLoader.selfPlayer.anInt3970:var3.anInt3970;
                     int var9 = 5 - -(var7 * 10 / 100) + var8;
                     int var10 = -var3.combatLevel + TextureLoader.selfPlayer.combatLevel;
                     if(0 > var10) {
                        var10 = -var10;
                     }

                     if(var9 < var10) {
                        var6 = false;
                     }
                  }

                  jString var13 = Class27.aClass94_525;
                  if(var3.combatLevel < var3.anInt3965) {
                     var5 = client.method903(new jString[]{var3.method1980(0), var6?Class72.method1295(var3.combatLevel, (byte)-73, TextureLoader.selfPlayer.combatLevel):Class3_Sub26.aClass94_2562, Class72.aClass94_1072, var13, Class72.method1298(var3.combatLevel), Class40.aClass94_673, Class72.method1298(var3.anInt3965 + -var3.combatLevel), Class3_Sub9.aClass94_2335});
                  } else {
                     var5 = client.method903(new jString[]{var3.method1980(0), var6?Class72.method1295(var3.combatLevel, (byte)-128, TextureLoader.selfPlayer.combatLevel):Class3_Sub26.aClass94_2562, Class72.aClass94_1072, var13, Class72.method1298(var3.combatLevel), Class3_Sub9.aClass94_2335});
                  }
               } else {
                  var5 = client.method903(new jString[]{var3.method1980(0), Class72.aClass94_1072, Class27.aClass94_522, Class72.method1298(var3.anInt3974), Class3_Sub9.aClass94_2335});
               }

               int var12;
               if(~Class164_Sub1.anInt3012 == -2) {
                  SubScript.method1177((short)1, Class99.anInt1403, (long)var0, client.method903(new jString[]{client.aClass94_378, Class56.aClass94_892, var5}), var4, Class3_Sub13_Sub32.aClass94_3388, var2);
               } else if(!SceneGraphNode.aBoolean1837) {
                  for(var12 = 7; -1 >= ~var12; --var12) {
                     if(null != CollisionMap.aClass94Array1299[var12]) {
                        short var14 = 0;
                        boolean var16 = false;
                        if(CollisionMap.aClass94Array1299[var12].method1531(Class3_Sub13_Sub36.aClass94_3427)) {
                           if(var3.combatLevel > TextureLoader.selfPlayer.combatLevel) {
                              var14 = 2000;
                           }

                           if(-1 != ~TextureLoader.selfPlayer.team && ~var3.team != -1) {
                              if(~TextureLoader.selfPlayer.team != ~var3.team) {
                                 var14 = 0;
                              } else {
                                 var14 = 2000;
                              }
                           }
                        } else if(Class1.aBooleanArray54[var12]) {
                           var14 = 2000;
                        }

                        short var15 = Class7.aShortArray2167[var12];
                        var15 += var14;
                        SubScript.method1177(var15, Class3_Sub13_Sub26.anIntArray3328[var12], (long)var0, client.method903(new jString[]{Class3_Sub26.aClass94_2562, var5}), var4, CollisionMap.aClass94Array1299[var12], var2);
                     }
                  }
               } else if((8 & Class164.anInt2051) != 0) {
                  SubScript.method1177((short)15, Class144.anInt1887, (long)var0, client.method903(new jString[]{Class40.aClass94_676, Class56.aClass94_892, var5}), var4, Class3_Sub28_Sub9.aClass94_3621, var2);
               }

               if(var1 <= 0) {
                  lastJs5ConnectionTime = -79L;
               }

               for(var12 = 0; ~Class3_Sub13_Sub34.anInt3415 < ~var12; ++var12) {
                  if(~Class3_Sub13_Sub7.aShortArray3095[var12] == -61) {
                     Class163_Sub2_Sub1.aClass94Array4016[var12] = client.method903(new jString[]{Class3_Sub26.aClass94_2562, var5});
                     break;
                  }
               }

            }
         }
      } catch (RuntimeException var11) {
         throw Class44.method1067(var11, "rj.C(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ',' + var4 + ')');
      }
   }

	static final void method313() {
		Class166.method2257(96);
		Class3_Sub8.method128(2);
		Class163_Sub2_Sub1.method2220(0);
		Class3_Sub10.method139(69);
		Class3_Sub26.method512((byte) -108);
		Class104.method1626((byte) -128);
		Class3_Sub13_Sub3.method182(true);
		Class145.method2077(true);
		Class25.method959(0);
		Class3_Sub28_Sub19.method716(14073);
		Class3_Sub15.method370((byte) -73);
		Class3_Sub13_Sub29.method304(6799);
		Class40.method1045(-19761);
		Class3_Sub13_Sub3.method183(-108);
		StringNode.method727();
		Class3_Sub21.method397((byte) -41);
		if (~Class3_Sub13_Sub13.modeWhat != -1) {
			for (int var1 = 0; ~Class3_Sub6.aByteArrayArray2287.length < ~var1; ++var1) {
				Class3_Sub6.aByteArrayArray2287[var1] = null;
			}

			Class56.anInt893 = 0;
		}

		Class108.method1659(16712751);
		Class3_Sub10.method142();
		Class80.aClass93_1135.clearAll();
		if (!HDToolkit.openGLEnabled) {
			((TextureLoader) Rasterizer.anInterface2_838).method1618(0);
		}

		Class56.aClass47_885.method1101(2);
		Class75_Sub3.cacheIndex0.method2137();
		Class3_Sub28_Sub19.cacheIndex1.method2137();
		Class140_Sub3.cacheIndex3.method2137();
		AbstractMouseWheel.cacheIndex4.method2137();
		Class3_Sub13_Sub6.cacheIndex5.method2137();
		Class75_Sub2.cacheIndex6.method2137();
		Class159.cacheIndex7.method2137();
		Class140_Sub6.cacheIndex8.method2137();
		Class3_Sub13_Sub25.cacheIndex10.method2137();
		NodeSub.cacheIndex11.method2137();
		ClickMaskNode.cacheIndex12.method2137();
		Class3_Sub13_Sub11.aClass93_3130.clearAll();
	}

   private final int method314(int var1, int var2, int var3) {
      try {
         if(var2 != 7001) {
            this.method314(-83, 92, 48);
         }

         int var4 = var3 - -(57 * var1);
         var4 ^= var4 << 1;
         return 4096 + -((var4 * (var4 * var4 * 15731 - -789221) - -1376312589 & Integer.MAX_VALUE) / 262144);
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "rj.O(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   public Class3_Sub13_Sub30() {
      super(0, true);
   }

   public static void method315(int var0) {
      try {
         aClass61_3364 = null;
         anIntArray3367 = null;
         if(var0 != -15028) {
            aClass61_3364 = (Deque)null;
         }

         //aClass94_3368 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "rj.B(" + var0 + ')');
      }
   }

   final int[] method154(int var1, byte var2) {
      try {
         int var4 = 104 % ((30 - var2) / 36);
         int[] var3 = this.aClass114_2382.method1709(-16409, var1);
         if(this.aClass114_2382.aBoolean1580) {
            int var5 = Class163_Sub3.anIntArray2999[var1];

            for(int var6 = 0; var6 < Class113.anInt1559; ++var6) {
               var3[var6] = this.method314(var5, 7001, TextureLoader.anIntArray2125[var6]) % 4096;
            }
         }

         return var3;
      } catch (RuntimeException var7) {
         throw Class44.method1067(var7, "rj.D(" + var1 + ',' + var2 + ')');
      }
   }

   static final void method316(CollisionMap[] var0, int var1, byte[] var2, int var3, int var4, int var5, int var6, boolean var7, int var8, int var9, byte var10) {
      try {
         if(var10 == -54) {
            int var12 = -1;
            Buffer var11 = new Buffer(var2);

            while(true) {
               int var13 = var11.method773();
               if(~var13 == -1) {
                  return;
               }

               var12 += var13;
               int var14 = 0;

               while(true) {
                  int var15 = var11.getSmart();
                  if(~var15 == -1) {
                     break;
                  }

                  var14 += -1 + var15;
                  int var16 = 63 & var14;
                  int var17 = var14 >> 6 & 63;
                  int var18 = var14 >> 12;
                  int var19 = var11.getUByte();
                  int var20 = var19 >> 2;
                  int var21 = 3 & var19;
                  if(~var3 == ~var18 && ~var17 <= ~var8 && var17 < 8 + var8 && var9 <= var16 && 8 + var9 > var16) {
                     ObjectDefinition var22 = ObjectDefinition.list(var12);
                     int var23 = LongNode.method121(var16 & 7, var4, var21, var22.sizeY, var22.sizeX, 1, 7 & var17) + var5;
                     int var24 = SceneGraphNode.method1863(var22.sizeX, var4, (byte)126, var22.sizeY, 7 & var17, var21, 7 & var16) + var6;
                     if(~var23 < -1 && var24 > 0 && -104 < ~var23 && var24 < 103) {
                        CollisionMap var25 = null;
                        if(!var7) {
                           int var26 = var1;
                           if(2 == (Class9.aByteArrayArrayArray113[1][var23][var24] & 2)) {
                              var26 = var1 - 1;
                           }

                           if(var26 >= 0) {
                              var25 = var0[var26];
                           }
                        }

                        Class110.method1683(var1, !var7, var1, var7, var25, var12, var20, var23, var24, 3 & var21 + var4);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var27) {
         throw Class44.method1067(var27, "rj.F(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ')');
      }
   }

}
