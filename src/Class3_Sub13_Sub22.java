
final class Class3_Sub13_Sub22 extends Class3_Sub13 {

   static int anInt3267;
   static jString aClass94_3268 = jString.createJString(")1");
   static Player[] aClass140_Sub4_Sub1Array3269 = new Player[2048];
   static AbstractIndexedSprite[] aClass109Array3270;
   static long[] aLongArray3271 = new long[500];
   static boolean[] spriteHaveAlpha;
   static Deque[][][] aClass61ArrayArrayArray3273 = new Deque[4][104][104];
   static int anInt3274;
   static boolean aBoolean3275 = true;
   private int anInt3276;

   private Class3_Sub13_Sub22(int var1) {
      super(0, true);
      this.anInt3276 = 4096;

      try {
         this.anInt3276 = var1;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "mi.<init>(" + var1 + ')');
      }
   }

   final void method157(int var1, Buffer var2, boolean var3) {
      try {
         if(!var3) {
            this.method154(121, (byte)52);
         }

         if(var1 == 0) {
            this.anInt3276 = (var2.getUByte() << 12) / 255;
         }

      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "mi.A(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

   public Class3_Sub13_Sub22() {
      this(4096);
   }

	static final void method273(Npc var2, int[] var0, int[] var3, int[] var4) {
		int var5 = 0;
		while (var5 < var4.length) {
			int var6 = var4[var5];
			int var7 = var0[var5];
			int var8 = var3[var5];

			for (int var9 = 0; -1 != ~var7 && ~var2.aClass145Array2809.length < ~var9; ++var9) {
				if ((1 & var7) != 0) {
					if (~var6 == 0) {
						var2.aClass145Array2809[var9] = null;
					} else {
						AnimationDefinition var10 = AnimationDefinition.list(var6, false);
						Class145 var12 = var2.aClass145Array2809[var9];
						int var11 = var10.anInt1845;
						if (null != var12) {
							if (~var6 != ~var12.anInt1890) {
								if (~var10.anInt1857 <= ~AnimationDefinition.list(var12.anInt1890, false).anInt1857) {
									var12 = var2.aClass145Array2809[var9] = null;
								}
							} else if (~var11 == -1) {
								var12 = var2.aClass145Array2809[var9] = null;
							} else if (-2 == ~var11) {
								var12.anInt1893 = 0;
								var12.anInt1894 = 0;
								var12.anInt1891 = 1;
								var12.anInt1897 = 0;
								var12.anInt1900 = var8;
								jSocket.method1470(var2.anInt2829, var10, 183921384, var2.anInt2819, false, 0);
							} else if (~var11 == -3) {
								var12.anInt1894 = 0;
							}
						}

						if (null == var12) {
							var12 = var2.aClass145Array2809[var9] = new Class145();
							var12.anInt1891 = 1;
							var12.anInt1897 = 0;
							var12.anInt1900 = var8;
							var12.anInt1890 = var6;
							var12.anInt1894 = 0;
							var12.anInt1893 = 0;
							jSocket.method1470(var2.anInt2829, var10, 183921384, var2.anInt2819, false, 0);
						}
					}
				}

				var7 >>>= 1;
			}

			++var5;
		}

	}

   final int[] method154(int var1, byte var2) {
      try {
         int var3 = 14 / ((30 - var2) / 36);
         int[] var4 = this.aClass114_2382.method1709(-16409, var1);
         if(this.aClass114_2382.aBoolean1580) {
            ArrayUtils.fill(var4, 0, Class113.anInt1559, this.anInt3276);
         }

         return var4;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "mi.D(" + var1 + ',' + var2 + ')');
      }
   }

   public static void method274(int var0) {
      try {
         aClass140_Sub4_Sub1Array3269 = null;
         if(var0 != -2) {
            aClass94_3268 = (jString)null;
         }

         aClass94_3268 = null;
         spriteHaveAlpha = null;
         aClass109Array3270 = null;
         aLongArray3271 = null;
         aClass61ArrayArrayArray3273 = (Deque[][][])null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "mi.C(" + var0 + ')');
      }
   }

}
