import java.util.Random;

final class OverlayType {

	private int groundRgb = 0;
	int anInt1406;
	static int anInt1407;
	int anInt1408;

	static js5 aClass153_1410;
	boolean aBoolean1411 = true;
	int anInt1412 = -1;
	static Class136 aClass136_1413 = new Class136();
	int anInt1414 = 128;
	static int anInt1416;
	int anInt1417;
	int anInt1418;
	static jString aClass94_1409 = jString.createJString("Loaded input handler");

	private final void calculateHSL(int var1) {
		double var3 = (double) (255 & var1 >> 16) / 256.0D;
		double var5 = (double) (255 & var1 >> 8) / 256.0D;
		double var9 = var3;
		double var7 = (double) (var1 & 255) / 256.0D;
		if (var5 < var3) {
			var9 = var5;
		}

		if (var7 < var9) {
			var9 = var7;
		}

		double var11 = var3;
		double var14 = 0.0D;
		if (var5 > var3) {
			var11 = var5;
		}

		if (var7 > var11) {
			var11 = var7;
		}

		double var16 = 0.0D;
		double var18 = (var11 + var9) / 2.0D;
		if (var9 != var11) {
			if (0.5D > var18) {
				var16 = (var11 - var9) / (var11 + var9);
			}

			if (var11 != var3) {
				if (var5 != var11) {
					if (var7 == var11) {
						var14 = 4.0D + (-var5 + var3) / (-var9 + var11);
					}
				} else {
					var14 = (var7 - var3) / (var11 - var9) + 2.0D;
				}
			} else {
				var14 = (-var7 + var5) / (-var9 + var11);
			}

			if (0.5D <= var18) {
				var16 = (var11 - var9) / (-var9 + (2.0D - var11));
			}
		}

		if (var18 > 0.5D) {
			this.anInt1418 = (int) (var16 * (-var18 + 1.0D) * 512.0D);
		} else {
			this.anInt1418 = (int) (var16 * var18 * 512.0D);
		}

		if (1 > this.anInt1418) {
			this.anInt1418 = 1;
		}

		this.anInt1406 = (int) (var16 * 256.0D);
		this.anInt1417 = (int) (256.0D * var18);
		if (~this.anInt1417 <= -1) {
			if (255 < this.anInt1417) {
				this.anInt1417 = 255;
			}
		} else {
			this.anInt1417 = 0;
		}

		var14 /= 6.0D;
		this.anInt1408 = (int) ((double) this.anInt1418 * var14);
		if (-1 >= ~this.anInt1406) {
			if (this.anInt1406 > 255) {
				this.anInt1406 = 255;
			}
		} else {
			this.anInt1406 = 0;
		}
	}

	final void decode(Buffer buffer) {
		while (true) {
			int opcode = buffer.getUByte();
			if (opcode == 0) {
				return;
			}

			this.decode(buffer, opcode);
		}
	}

	static final int method1602(jString var1) {
		if (Class119.aClass131_1624 != null && var1.getLength() != 0) {
			for (int var2 = 0; ~Class119.aClass131_1624.anInt1720 < ~var2; ++var2) {
				if (Class119.aClass131_1624.aClass94Array1721[var2].method1560(Class3_Sub13_Sub16.aClass94_3192, true, BufferedRequest.aClass94_4066).method1562(var1)) {
					return var2;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	static final int method1603(Random var2, int var1) {
		if (~var1 >= -1) {
			throw new IllegalArgumentException();
		} else if (Class140_Sub6.method2021(var1)) {
			return (int) (((long) var2.nextInt() & 4294967295L) * (long) var1 >> 32);
		} else {
			int var3 = -((int) (4294967296L % (long) var1)) + Integer.MIN_VALUE;

			int var4;
			do {
				var4 = var2.nextInt();
			} while (var3 <= var4);

			return Class3_Sub13_Sub7.method201(var4, var1);
		}
	}

	private final void decode(Buffer buffer, int opcode) {
		if (opcode == 1) {
			this.groundRgb = buffer.getMidInt();
			this.calculateHSL(this.groundRgb);
		} else if (opcode == 2) {
			this.anInt1412 = buffer.getUShort();
			if (this.anInt1412 == 65535) {
				this.anInt1412 = -1;
			}
		} else if (opcode == 3) {
			this.anInt1414 = buffer.getUShort();
		} else if (opcode == 4) {
			this.aBoolean1411 = false;
		}
	}

	static final OverlayType list(int id) {
		OverlayType var2 = (OverlayType) Class44.aClass93_725.get((long) id);
		if (var2 != null)
			return var2;
		byte[] var3 = Class3_Sub23.aClass153_2536.getFile(1, id);
		var2 = new OverlayType();
		if (null != var3) {
			var2.decode(new Buffer(var3));
		}

		Class44.aClass93_725.put(var2, (long) id);
		return var2;
	}

	static final void method1605(jString var1, int var2) {
		Class3_Sub13_Sub1.outputStream.putPacket(188);
		Class3_Sub13_Sub1.outputStream.putByteA(var2);
		Class3_Sub13_Sub1.outputStream.putLong(var1.toLong());
	}

	public static void method1606() {
		aClass94_1409 = null;
		aClass153_1410 = null;
		aClass136_1413 = null;
	}

}
