import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;

final class Class121 {

   int anInt1639 = 0;
   boolean aBoolean1640 = false;
   static boolean aBoolean1641 = false;
   static int anInt1642 = 0;
   VertexBuffer aClass156_1643;
   ByteBuffer pointer;
   static jString aClass94_1645 = jString.createJString("Hidden)2");
   //static jString aClass94_1646 = jString.createJString("::wm2");
   int stride = 0;


   public static void method1733(int var0) {
      try {
         //aClass94_1646 = null;
         aClass94_1645 = null;
         if(var0 != -17148) {
            anInt1642 = 54;
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ql.C(" + var0 + ')');
      }
   }

   static final int method1734(int var0, float var1, int var2, int var3, int[][] var4, int[][] var5, int var6, float[][] var7, int var8, byte var9, int var10, boolean var11, Class3_Sub11 var12, float[][] var13, int var14, int var15, float[][] var16, int var17) {
      try {
         int var18;
         if(~var10 != -2) {
            if(var10 != 2) {
               if(~var10 == -4) {
                  var18 = var15;
                  var15 = 128 + -var17;
                  var17 = var18;
               }
            } else {
               var17 = -var17 + 128;
               var15 = -var15 + 128;
            }
         } else {
            var18 = var15;
            var15 = var17;
            var17 = -var18 + 128;
         }

         float var19;
         int var21;
         float var20;
         float var30;
         if(~var15 == -1 && -1 == ~var17) {
            var19 = var16[var6][var14];
            var20 = var7[var6][var14];
            var30 = var13[var6][var14];
            var21 = var2;
         } else if(-129 == ~var15 && ~var17 == -1) {
            var21 = var3;
            var19 = var16[var6 + 1][var14];
            var20 = var7[1 + var6][var14];
            var30 = var13[var6 + 1][var14];
         } else if(-129 == ~var15 && ~var17 == -129) {
            var20 = var7[1 + var6][var14 - -1];
            var30 = var13[var6 + 1][1 + var14];
            var19 = var16[1 + var6][var14 - -1];
            var21 = var8;
         } else if(~var15 == -1 && -129 == ~var17) {
            var20 = var7[var6][1 + var14];
            var19 = var16[var6][1 + var14];
            var30 = var13[var6][var14 - -1];
            var21 = var0;
         } else {
            var30 = var13[var6][var14];
            var19 = var16[var6][var14];
            float var23 = (float)var17 / 128.0F;
            float var22 = (float)var15 / 128.0F;
            var30 += (var13[var6 - -1][var14] - var30) * var22;
            var19 += (-var19 + var16[var6 + 1][var14]) * var22;
            float var24 = var13[var6][var14 + 1];
            float var25 = var16[var6][var14 - -1];
            var25 += (-var25 + var16[var6 + 1][var14 - -1]) * var22;
            var20 = var7[var6][var14];
            var19 += var23 * (-var19 + var25);
            float var26 = var7[var6][1 + var14];
            var24 += (-var24 + var13[var6 - -1][var14 + 1]) * var22;
            var30 += var23 * (-var30 + var24);
            var26 += (-var26 + var7[1 + var6][var14 - -1]) * var22;
            var20 += (-var20 + var7[var6 - -1][var14]) * var22;
            var20 += (-var20 + var26) * var23;
            int var27 = Class3_Sub13_Sub10.method210(18348, var15, var2, var3);
            int var28 = Class3_Sub13_Sub10.method210(18348, var15, var0, var8);
            var21 = Class3_Sub13_Sub10.method210(18348, var17, var27, var28);
         }

         if(var9 > -111) {
            return -54;
         } else {
            int var32 = var17 + (var14 << 7);
            int var33 = Class3_Sub23.method408(var15, (byte)-51, var14, var5, var6, var17);
            int var31 = (var6 << 7) - -var15;
            return var12.method146(var31, var33, var32, var30, var19, var20, !var11?var21:-256 & var21, var4 != null?(float)(var33 + -Class3_Sub23.method408(var15, (byte)103, var14, var4, var6, var17)) / var1:0.0F);
         }
      } catch (RuntimeException var29) {
         throw Class44.method1067(var29, "ql.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null?"{...}":"null") + ',' + (var5 != null?"{...}":"null") + ',' + var6 + ',' + (var7 != null?"{...}":"null") + ',' + var8 + ',' + var9 + ',' + var10 + ',' + var11 + ',' + (var12 != null?"{...}":"null") + ',' + (var13 != null?"{...}":"null") + ',' + var14 + ',' + var15 + ',' + (var16 != null?"{...}":"null") + ',' + var17 + ')');
      }
   }

   static final int method1735() {
		try {
			if (Light.anInt692 == 0) {
				if (~(TimeUtil.currentTimeMillis() + -5000L) > ~Class3_Sub13_Sub34.aLong3411) {
					return 0;
				}

				Class3_Sub9.aClass64_2318 = Class38.gameSignlink.startConnection(RuntimeException_Sub1.serverIp, Class123.anInt1658);
				jInterface.aLong261 = TimeUtil.currentTimeMillis();
				Light.anInt692 = 1;
			}

			if (30000L + jInterface.aLong261 < TimeUtil.currentTimeMillis()) {
				return Class3_Sub13_Sub3.method179(1000);
			}

			int var1;
			int var2;
			if (1 == Light.anInt692) {
				if (-3 == ~Class3_Sub9.aClass64_2318.status) {
					return Class3_Sub13_Sub3.method179(1001);
				}

				if (1 != Class3_Sub9.aClass64_2318.status) {
					return -1;
				}

				Class3_Sub15.worldConnection = new jSocket((Socket) Class3_Sub9.aClass64_2318.value, Class38.gameSignlink);
				Class3_Sub13_Sub1.outputStream.pos = 0;
				Class3_Sub9.aClass64_2318 = null;
				var1 = 0;
				if (Class30.aBoolean579) {
					var1 = AbstractObjectCache.anInt3608;
				}

				Class3_Sub13_Sub1.outputStream.putByte(255);
				Class3_Sub13_Sub1.outputStream.putInt(var1);
				Class3_Sub15.worldConnection.write(Class3_Sub13_Sub1.outputStream.buf, 0, Class3_Sub13_Sub1.outputStream.pos);
				if (null != Class44_Sub1.aClass155_2627) {
					Class44_Sub1.aClass155_2627.method2159();
				}

				if (null != Class3_Sub21.aClass155_2491) {
					Class3_Sub21.aClass155_2491.method2159();
				}

				var2 = Class3_Sub15.worldConnection.read();
				if (Class44_Sub1.aClass155_2627 != null) {
					Class44_Sub1.aClass155_2627.method2159();
				}

				if (null != Class3_Sub21.aClass155_2491) {
					Class3_Sub21.aClass155_2491.method2159();
				}

				if (var2 != 0) {
					return Class3_Sub13_Sub3.method179(var2);
				}

				Light.anInt692 = 2;
			}

			if (-3 == ~Light.anInt692) {
				if (2 > Class3_Sub15.worldConnection.available()) {
					return -1;
				}

				Js5CacheWorker.anInt1002 = Class3_Sub15.worldConnection.read();
				Js5CacheWorker.anInt1002 <<= 8;
				Js5CacheWorker.anInt1002 += Class3_Sub15.worldConnection.read();
				Light.anInt692 = 3;
				Class3_Sub20.anInt2484 = 0;
				Class3_Sub13_Sub33.aByteArray3396 = new byte[Js5CacheWorker.anInt1002];
			}

			if (-4 == ~Light.anInt692) {
				var1 = Class3_Sub15.worldConnection.available();
				if (1 > var1) {
					return -1;
				}

				if (var1 > -Class3_Sub20.anInt2484 + Js5CacheWorker.anInt1002) {
					var1 = Js5CacheWorker.anInt1002 + -Class3_Sub20.anInt2484;
				}

				Class3_Sub15.worldConnection.read(Class3_Sub13_Sub33.aByteArray3396, Class3_Sub20.anInt2484, var1);
				Class3_Sub20.anInt2484 += var1;
				if (Class3_Sub20.anInt2484 >= Js5CacheWorker.anInt1002) {
					if (Class3_Sub13_Sub23.method278(4, Class3_Sub13_Sub33.aByteArray3396)) {
						Class3_Sub13_Sub16.aClass44_Sub1Array3201 = new Class44_Sub1[Class57.anInt906];
						var2 = 0;

						for (int var3 = Class3_Sub13_Sub4.anInt3054; var3 <= OverlayType.anInt1416; ++var3) {
							Class44_Sub1 var4 = Class3_Sub8.method130(91, var3);
							if (null != var4) {
								Class3_Sub13_Sub16.aClass44_Sub1Array3201[var2++] = var4;
							}
						}

						Class3_Sub15.worldConnection.close();
						Class3_Sub15.worldConnection = null;
						Class65943149.anInt1088 = 0;
						Light.anInt692 = 0;
						Class3_Sub13_Sub33.aByteArray3396 = null;
						Class3_Sub13_Sub34.aLong3411 = TimeUtil.currentTimeMillis();
						return 0;
					}

					return Class3_Sub13_Sub3.method179(1002);
				}

				return -1;
			}
		} catch (IOException var5) {
			return Class3_Sub13_Sub3.method179(1003);
		}

		return -1;
   }

   static final int method1736(int var0, int var1, int var2, int var3) {
      try {
         if(null == Class44.anIntArrayArrayArray723) {
            return 0;
         } else {
            int var4 = var2 >> 7;
            int var5 = var3 >> 7;
            if(-1 >= ~var4 && 0 <= var5 && var4 <= 103 && 103 >= var5) {
               int var7 = 127 & var2;
               int var8 = var3 & 127;
               int var6 = var0;
               if(3 > var0 && ~(2 & Class9.aByteArrayArrayArray113[1][var4][var5]) == -3) {
                  var6 = var0 + 1;
               }

               int var10 = var7 * Class44.anIntArrayArrayArray723[var6][var1 + var4][1 + var5] + Class44.anIntArrayArrayArray723[var6][var4][var5 + 1] * (-var7 + 128) >> 7;
               int var9 = var7 * Class44.anIntArrayArrayArray723[var6][var4 + 1][var5] + (-var7 + 128) * Class44.anIntArrayArrayArray723[var6][var4][var5] >> 7;
               return var8 * var10 + (128 - var8) * var9 >> 7;
            } else {
               return 0;
            }
         }
      } catch (RuntimeException var11) {
         throw Class44.method1067(var11, "ql.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

}
