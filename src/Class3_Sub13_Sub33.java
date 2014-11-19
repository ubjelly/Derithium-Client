
final class Class3_Sub13_Sub33 extends Class3_Sub13 {

   static byte[][][] aByteArrayArarayArray3390;
   static jString[] aClass94Array3391;
   private Class75[] aClass75Array3392;
   static GrandExchangeItem[] aClass133Array3393 = new GrandExchangeItem[6];
   static jString aClass94_3394 = jString.createJString("<col=ffb000>");
   static int anInt3395;
   static byte[] aByteArray3396;
   
   static volatile int anInt3398 = 0;
   static jString aClass94_3399 = jString.createJString("<br>(X");
   private static jString aClass94_3400 = jString.createJString("Take");
   static jString aClass94_3397 = aClass94_3400;

   final int[] method154(int var1, byte var2) {
      try {
         int var4 = -75 % ((30 - var2) / 36);
         int[] var3 = this.aClass114_2382.method1709(-16409, var1);
         if(this.aClass114_2382.aBoolean1580) {
            this.method323(-60, this.aClass114_2382.method1710((byte)124));
         }

         return var3;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "si.D(" + var1 + ',' + var2 + ')');
      }
   }

   static final int method322(boolean var0, byte var1) {
      try {
         return !var0?104:255 & var1;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "si.C(" + var0 + ',' + var1 + ')');
      }
   }
   
   public static js5 getModelJs5() {
	   if (client.clientLoad < 602) {
		   return client.modelsCache602;
	   }
	   return Class159.cacheIndex7;
   }

   private final void method323(int var1, int[][] var2) {
      try {
         int var4 = Class101.anInt1427;
         int var3 = Class113.anInt1559;
         Class3_Sub13_Sub13.method230(var2, true);
         Class58.method1196(0, 0, (byte)111, Class3_Sub20.anInt2487, client.anInt396);
         if(this.aClass75Array3392 != null) {
            for(int var5 = 0; this.aClass75Array3392.length > var5; ++var5) {
               Class75 var6 = this.aClass75Array3392[var5];
               int var7 = var6.anInt1101;
               int var8 = var6.anInt1104;
               if(var7 >= 0) {
                  if(~var8 > -1) {
                     var6.method1341(var3, var4);
                  } else {
                     var6.method1335(var4, var3, 4898);
                  }
               } else if(~var8 <= -1) {
                  var6.method1337(var4, var3);
               }
            }
         }

         if(var1 != -60) {
            method326((byte)-35, (jString)null);
         }

      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "si.F(" + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   final void method157(int var1, Buffer var2, boolean var3) {
      try {
         if(var1 == 0) {
            this.aClass75Array3392 = new Class75[var2.getUByte()];

            for(int var4 = 0; ~this.aClass75Array3392.length < ~var4; ++var4) {
               int var5 = var2.getUByte();
               if(var5 == 0) {
                  this.aClass75Array3392[var4] = Class8.method843(-5232, var2);
               } else if(-2 == ~var5) {
                  this.aClass75Array3392[var4] = Class3_Sub28_Sub2.method536((byte)54, var2);
               } else if(var5 != 2) {
                  if(3 == var5) {
                     this.aClass75Array3392[var4] = ClanMember.method384(var2);
                  }
               } else {
                  this.aClass75Array3392[var4] = Class3_Sub22.method404((byte)-110, var2);
               }
            }
         } else if(1 == var1) {
            this.aBoolean2375 = var2.getUByte() == 1;
         }

         if(!var3) {
            this.method323(124, (int[][])((int[][])null));
         }

      } catch (RuntimeException var7) {
         throw Class44.method1067(var7, "si.A(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

	static final void method324(int var0) {
		AtmosphereManager.method1506(AtmosphereManager.screenColor, (0.7F + (float) var0 * 0.1F) * 1.1523438F, 0.69921875F, 0.69921875F);
		AtmosphereManager.method1509(-50.0F, -60.0F, -50.0F);
		AtmosphereManager.method1508(AtmosphereManager.fogColor, 0);
		AtmosphereManager.method1504();
	}

   public static void method325(int var0) {
      try {
         //aByteArrayArrayArray3390 = (byte[][][])null;
         if(var0 == 0) {
            aByteArray3396 = null;
            aClass133Array3393 = null;
            aClass94_3400 = null;
            aClass94Array3391 = null;
            aClass94_3397 = null;
            aClass94_3399 = null;
            aClass94_3394 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "si.E(" + var0 + ')');
      }
   }

   static final int method326(byte var0, jString var1) {
      try {
         if(var0 <= 13) {
            aClass94_3399 = (jString)null;
         }

         return var1.getLength() + 1;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "si.O(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

   final int[][] method166(int var1, int var2) {
      try {
         if(var1 != -1) {
            return (int[][])((int[][])null);
         } else {
            int[][] var3 = this.aClass97_2376.method1594((byte)-117, var2);
            if(this.aClass97_2376.aBoolean1379) {
               int var4 = Class113.anInt1559;
               int var5 = Class101.anInt1427;
               int[][] var6 = new int[var5][var4];
               int[][][] var7 = this.aClass97_2376.method1589((byte)-56);
               this.method323(-60, var6);

               for(int var8 = 0; var8 < Class101.anInt1427; ++var8) {
                  int[] var9 = var6[var8];
                  int[][] var10 = var7[var8];
                  int[] var11 = var10[0];
                  int[] var12 = var10[1];
                  int[] var13 = var10[2];

                  for(int var14 = 0; ~var14 > ~Class113.anInt1559; ++var14) {
                     int var15 = var9[var14];
                     var13[var14] = ClientScript.method633(255, var15) << 4;
                     var12[var14] = ClientScript.method633(4080, var15 >> 4);
                     var11[var14] = ClientScript.method633(var15 >> 12, 4080);
                  }
               }
            }

            return var3;
         }
      } catch (RuntimeException var16) {
         throw Class44.method1067(var16, "si.T(" + var1 + ',' + var2 + ')');
      }
   }

   public Class3_Sub13_Sub33() {
      super(0, true);
   }

   static final void method327(int var0, int var1, byte var2) {
      try {
         if(var2 != 68) {
            aClass94_3397 = (jString)null;
         }

         InterfaceChangeNode var3 = Class3_Sub24_Sub3.putInterfaceChange(12, var1);
         var3.add();
         var3.intValue = var0;
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "si.B(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

}
