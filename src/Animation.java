
final class Animation {

   boolean aBoolean1382 = false;
   int length = -1;
   TransformList transformList = null;
   short[] ids;
   boolean aBoolean1386 = false;
   short[] aShortArray1387;
   short[] vertexX;
   private static byte[] aByteArray1389 = new byte[500];
   private static short[] z = new short[500];
   private static short[] y = new short[500];
   private static short[] aShortArray1392 = new short[500];
   byte[] aByteArray1393;
   private static short[] x = new short[500];
   short[] vertexZ;
   short[] vertexY;
   private static short[] opcodes = new short[500];


   public static void method1595() {
      opcodes = null;
      x = null;
      y = null;
      z = null;
      aShortArray1392 = null;
      aByteArray1389 = null;
   }

	Animation(byte[] var1, TransformList var2, boolean new_decoding) {
		length = 0;
		aBoolean1386 = false;
		transformList = var2;
		try {
			Buffer var3 = new Buffer(var1);
			Buffer var4 = new Buffer(var1);
			var3.pos = 2;
			int var5 = var3.getUByte();
			int var6 = 0;
			int var7 = -1;
			int var8 = -1;
			var4.pos = var3.pos + var5;

			for (int var9 = 0; var9 < var5; ++var9) {
				int var10 = transformList.types[var9];
				if (var10 == 0) {
					var7 = var9;
				}

				int var11 = var3.getUByte();
				if (var11 > 0) {
					
					if (var10 == 0) {
						var8 = var9;
					}

					opcodes[var6] = (short) var9;
					short var12 = 0;
					if (var10 == 3) {
						var12 = 128;
					}

					if ((var11 & 0x1) != 0) {
						x[var6] = (short) var4.getUSmart();
					} else {
						x[var6] = var12;
					}

					if ((var11 & 0x2) != 0) {
						y[var6] = (short) var4.getUSmart();
					} else {
						y[var6] = var12;
					}

					if ((var11 & 0x4) != 0) {
						z[var6] = (short) var4.getUSmart();
					} else {
						z[var6] = var12;
					}

					aByteArray1389[var6] = (byte) (var11 >>> 3 & 0x3);
					if (var10 == 2) {
						x[var6] = (short) (((x[var6] & 255) << 3) + (x[var6] >> 8 & 7));
						y[var6] = (short) (((y[var6] & 255) << 3) + (y[var6] >> 8 & 7));
						z[var6] = (short) (((z[var6] & 255) << 3) + (z[var6] >> 8 & 7));
					}
					aShortArray1392[var6] = -1;
					if (var10 == 1 || var10 == 2 || var10 == 3) {
						if (var7 > var8) {
							aShortArray1392[var6] = (short) var7;
							var8 = var7;
						}
					} else if (var10 == 5) {
						aBoolean1386 = true;
					} else if (var10 == 7) {
						aBoolean1382 = true;
					}

					var6++;
				}
			}

			if (var4.pos != var1.length) {
				throw new RuntimeException();
			} else {
				length = var6;
				ids = new short[var6];
				vertexX = new short[var6];
				vertexY = new short[var6];
				vertexZ = new short[var6];
				aShortArray1387 = new short[var6];
				aByteArray1393 = new byte[var6];

				for (int var9 = 0; var9 < var6; ++var9) {
					ids[var9] = opcodes[var9];
					vertexX[var9] = x[var9];
					vertexY[var9] = y[var9];
					vertexZ[var9] = z[var9];
					aShortArray1387[var9] = aShortArray1392[var9];
					aByteArray1393[var9] = aByteArray1389[var9];
				}

			}
		} catch (Exception e) {
			length = 0;
			aBoolean1386 = false;
			aBoolean1382 = false;
		}
	}

}
