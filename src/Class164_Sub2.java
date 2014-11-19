
class Class164_Sub2 extends Class164 {

   private int anInt3018;
   static Class33 aClass33_3019;
   static int anInt3020 = 0;
   private int anInt3021;
   private int anInt3022;
   private int anInt3023;
   private int anInt3024;
   private byte[] aByteArray3025;
   private int anInt3026;
   static byte[][] aByteArrayArray3027;
   private int anInt3028;
   private int anInt3029;


   void method2244(int var1, byte var2) {
	   this.aByteArray3025[var1] = var2;
   }

   final void method2231(byte var1) {
         this.anInt3018 = this.anInt3021;
         this.anInt3029 >>= 4;
         if(0 > this.anInt3029) {
            this.anInt3029 = 0;
         } else if(255 < this.anInt3029) {
            this.anInt3029 = 255;
         }

         this.method2244(this.anInt3028++, (byte)this.anInt3029);
         if(var1 == -92) {
            this.anInt3029 = 0;
         }
   }

   public static void method2245(byte var0) {
         aClass33_3019 = null;
         if(var0 != -74) {
            aByteArrayArray3027 = (byte[][])((byte[][])null);
         }

         aByteArrayArray3027 = (byte[][])null;
   }

   Class164_Sub2(int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8) {
      super(var1, var2, var3, var4, var5);

      try {
         this.anInt3022 = (int)(4096.0F * var8);
         this.anInt3026 = (int)(var7 * 4096.0F);
         this.anInt3018 = this.anInt3021 = (int)(Math.pow(0.5D, (double)(-var6)) * 4096.0D);
      } catch (RuntimeException var10) {
         throw Class44.method1067(var10, "we.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ')');
      }
   }

   static final int method2246(int var1) {
	   int var2 = var1 * (var1 * var1 >> 12) >> 12;
	   int var3 = 6 * var1 - '\uf000';
	   int var4 = (var1 * var3 >> 12) + '\ua000';
	   return var2 * var4 >> 12;
   }

	static final int method2247(jInterface var2, int var1) {
		if (var2.cs1opcodes != null && var1 < var2.cs1opcodes.length) {

			try {
				int[] var4 = var2.cs1opcodes[var1];
				byte var7 = 0;
				int var5 = 0;
				int var6 = 0;

				while (true) {
					int var9 = 0;
					int var8 = var4[var6++];
					byte var10 = 0;
					if (var8 == 0) {
						return var5;
					}

					if (15 == var8) {
						var10 = 1;
					}

					if (16 == var8) {
						var10 = 2;
					}

					if (var8 == 1) {
						var9 = Class3_Sub13_Sub15.currentStats[var4[var6++]];
					}

					if (-18 == ~var8) {
						var10 = 3;
					}

					if (var8 == 2) {
						var9 = Class3_Sub20.maxStats[var4[var6++]];
					}

					if (var8 == 3) {
						var9 = GrandExchangeItem.currentExp[var4[var6++]];
					}

					int var11;
					jInterface var12;
					int var13;
					int var14;
					if (var8 == 4) {
						var11 = var4[var6++] << 16;
						var11 += var4[var6++];
						var12 = Class7.getInterface(var11);
						var13 = var4[var6++];
						if (-1 != var13 && (!ItemDefinition.method1023(var13).members || Class2.allowMembers)) {
							for (var14 = 0; ~var12.inventoryIds.length < ~var14; ++var14) {
								if (1 + var13 == var12.inventoryIds[var14]) {
									var9 += var12.inventoryAmounts[var14];
								}
							}
						}
					}

					if (var8 == 5) {
						var9 = Class163_Sub1.variousSettings[var4[var6++]];
					}

					if (6 == var8) {
						var9 = ItemDefinition.xpForLevel[-1 + Class3_Sub20.maxStats[var4[var6++]]];
					}

					if (~var8 == -8) {
						var9 = 100 * Class163_Sub1.variousSettings[var4[var6++]] / '\ub71b';
					}

					if (-9 == ~var8) {
						var9 = TextureLoader.selfPlayer.combatLevel;
					}

					if (9 == var8) {
						for (var11 = 0; -26 < ~var11; ++var11) {
							if (Class3_Sub23.skillEnabled[var11]) {
								var9 += Class3_Sub20.maxStats[var11];
							}
						}
					}

					if (var8 == 10) {
						var11 = var4[var6++] << 16;
						var11 += var4[var6++];
						var12 = Class7.getInterface(var11);
						var13 = var4[var6++];
						if (~var13 != 0 && (!ItemDefinition.method1023(var13).members || Class2.allowMembers)) {
							for (var14 = 0; ~var12.inventoryIds.length < ~var14; ++var14) {
								if (~var12.inventoryIds[var14] == ~(1 + var13)) {
									var9 = 999999999;
									break;
								}
							}
						}
					}

					if (-12 == ~var8) {
						var9 = Class9.energy;
					}

					if (12 == var8) {
						var9 = MouseHandler.weigth;
					}

					if (-14 == ~var8) {
						var11 = Class163_Sub1.variousSettings[var4[var6++]];
						int var17 = var4[var6++];
						var9 = ~(1 << var17 & var11) == -1 ? 0 : 1;
					}

					if (-15 == ~var8) {
						var11 = var4[var6++];
						var9 = NpcDefinition.method1484(64835055, var11);
					}

					if (~var8 == -19) {
						var9 = (TextureLoader.selfPlayer.anInt2819 >> 7) - -Class131.anInt1716;
					}

					if (-20 == ~var8) {
						var9 = (TextureLoader.selfPlayer.anInt2829 >> 7) - -Class82.anInt1152;
					}

					if (var8 == 20) {
						var9 = var4[var6++];
					}

					if (0 == var10) {
						if (0 == var7) {
							var5 += var9;
						}

						if (-2 == ~var7) {
							var5 -= var9;
						}

						if (2 == var7 && ~var9 != -1) {
							var5 /= var9;
						}

						if (var7 == 3) {
							var5 *= var9;
						}

						var7 = 0;
					} else {
						var7 = var10;
					}
				}
			} catch (Exception var15) {
				return -1;
			}
		} else {
			return -2;
		}
	}

   static final boolean method2248(int i){
       return i >= 32 && i != 127 && (i < 129 || i > 159);
   }/*int var1) {
	   return 32 <= var1 && -127 <= ~var1?true:(~var1 <= -161 && 255 >= var1?true:~var1 == -129 || -141 == ~var1 || ~var1 == -152 || ~var1 == -157 || var1 == 159);
   }*/

   static final void method2249(byte var0, int var1) {
      try {
         Node var2 = Class124.aClass130_1659.getFirst();
         if(var0 != 83) {
            aClass33_3019 = (Class33)null;
         }

         for(; var2 != null; var2 = Class124.aClass130_1659.getNext()) {
            if(~(65535L & var2.hash >> 48) == ~((long)var1)) {
               var2.unlink();
            }
         }

      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "we.F(" + var0 + ',' + var1 + ')');
      }
   }

   final void method2237(int var1, int var2, int var3) {
         if(0 != var2) {
            this.anInt3023 = this.anInt3022 * this.anInt3024 >> 12;
            if(-1 >= ~this.anInt3023) {
               if(~this.anInt3023 < -4097) {
                  this.anInt3023 = 4096;
               }
            } else {
               this.anInt3023 = 0;
            }

            this.anInt3024 = -(-1 >= ~var1?var1:-var1) + this.anInt3026;
            this.anInt3024 = this.anInt3024 * this.anInt3024 >> 12;
            this.anInt3024 = this.anInt3024 * this.anInt3023 >> 12;
            this.anInt3029 += this.anInt3018 * this.anInt3024 >> 12;
            this.anInt3018 = this.anInt3021 * this.anInt3018 >> 12;
         } else {
            this.anInt3023 = 4096;
            this.anInt3024 = -(-1 >= ~var1?var1:-var1) + this.anInt3026;
            this.anInt3024 = this.anInt3024 * this.anInt3024 >> 12;
            this.anInt3029 = this.anInt3024;
         }

         if(var3 != -20975) {
            this.method2244(-80, (byte)-24);
         }

   }

   final void method2233(int var1) {
         this.anInt3028 = 0;
         this.anInt3029 = 0;
         if(var1 != -949697716) {
            method2249((byte)-82, -73);
         }

   }

}
