
final class SpotAnimation {

	static int anInt529;
	private int anInt530 = 128;
	static int cameraYaw = 0;
	static PacketBuffer aClass3_Sub30_Sub1_532 = new PacketBuffer(5000);
	private short[] aShortArray533;
	private short[] aShortArray534;
	private short[] aShortArray535;
	boolean aBoolean536 = false;
	private int anInt537 = 0;
	private int anInt538 = 0;
	int anInt539;
	private int anInt540 = 128;
	private int anInt541;
	int anInt542 = -1;
	private int anInt543 = 0;
	private short[] aShortArray545;
	static int anInt546;
	static jString aClass94_547 = jString.createJString("slide:");;
	static int anInt548 = 0;
	static volatile int anInt549 = 0;
	static jString aClass94_551 = jString.createJString("slide:");;

	//some new opcode
	boolean aBoolean3047;

	final void decode(Buffer buffer) {
		while (true) {
			int configCode = buffer.getUByte();
			if (configCode == 0) {
				return;
			}

			decode(buffer, configCode);
		}
	}

	public static void method964(int var0) {
		try {
			aClass3_Sub30_Sub1_532 = null;
			if(var0 != 6) {
				method964(-57);
			}

			aClass94_547 = null;
			aClass94_551 = null;
		} catch (RuntimeException var2) {
			throw Class44.method1067(var2, "eg.E(" + var0 + ')');
		}
	}

	private final void decode(Buffer buffer, int configCode) {
		if (configCode == 1) {
			anInt541 = buffer.getUShort();
		} else if (configCode == 2) {
			anInt542 = buffer.getUShort();
		} else if (configCode == 4) {
			anInt530 = buffer.getUShort();
		} else if (configCode == 5) {
			anInt540 = buffer.getUShort();
		} else if (configCode == 6) {
			anInt543 = buffer.getUShort();
		} else if (configCode == 7) {
			anInt538 = buffer.getUByte();
		} else if (configCode == 8) {
			anInt537 = buffer.getUByte();
		} else if (configCode == 9) {
			aBoolean536 = true;
		} else if (configCode == 10) {
			aBoolean3047 = true;
		} else if (40 == configCode) {
			int var4 = buffer.getUByte();
			aShortArray533 = new short[var4];
			aShortArray545 = new short[var4];

			for (int var5 = 0; var5 < var4; ++var5) {
				aShortArray533[var5] = (short) buffer.getUShort();
				aShortArray545[var5] = (short) buffer.getUShort();
			}
		} else if (41 == configCode) {
			int var4 = buffer.getUByte();
			aShortArray534 = new short[var4];
			aShortArray535 = new short[var4];

			for (int var5 = 0; ~var4 < ~var5; ++var5) {
				aShortArray534[var5] = (short) buffer.getUShort();
				aShortArray535[var5] = (short) buffer.getUShort();
			}
		}
	}

	final AbstractModel method966(int var1, byte var2, int var3, int var4) {
		AbstractModel var5 = (AbstractModel) Class27.aClass93_511.get(
				(long) anInt539);
		if (var5 == null) {
			ModelBuilder var6 = ModelBuilder.get(RawObjectCache.aClass153_4048, anInt541, 0);
			if (null == var6) {
				return null;
			}

			int var7;
			if (null != aShortArray533) {
				for (var7 = 0; aShortArray533.length > var7; ++var7) {
					var6.swapColors(aShortArray533[var7],
							aShortArray545[var7]);
				}
			}

			if (aShortArray534 != null) {
				for (var7 = 0; var7 < aShortArray534.length; ++var7) {
					var6.method1998(aShortArray534[var7],
							aShortArray535[var7]);
				}
			}

			var5 = var6.convert(64 - -anInt538, anInt537 + 850,
					-30, -50, -30);
			Class27.aClass93_511.put(var5, (long) anInt539);
		}

		AbstractModel var9;
		if (0 != ~anInt542 && var3 != -1) {
			var9 = AnimationDefinition.list(anInt542, false).method2059(var5,
					var1, var4, var3);
		} else {
			var9 = var5.method1882(true, true, true);
		}

		if (128 != anInt530 || 128 != anInt540) {
			var9.scale(anInt530, anInt540, anInt530);
		}

		if (anInt543 != 0) {
			if (90 == anInt543) {
				var9.rotate90();
			}

			if (180 == anInt543) {
				var9.rotate180();
			}

			if (270 == anInt543) {
				var9.rotate270();
			}
		}

		return var9;
	}

	static final SpotAnimation list(int var1) {
		SpotAnimation var2 = (SpotAnimation) OverridedInterface.aClass93_2604.get((long) var1);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Class164.cacheIndex2.getFile(client.getGraphicConfig(var1), var1);
			if (var3 == null) {
				var3 = Class164.cacheIndex2.getFile(34, var1);
			}
			var2 = new SpotAnimation();
			var2.anInt539 = var1;

			if (null != var3) {
				var2.decode(new Buffer(var3));
			}

			OverridedInterface.aClass93_2604.put(var2, (long) var1);
			return var2;
		}
	}

	static final void method967(int var0, int var1, int var3, int var4, int var5, int var6, int var7) {
		if(Canvas_Sub2.loadInterface(var5))
			client.drawInterface(SceneGraphNode.interfaceCache[var5], -1, var6, var1, var4, var7, var0, var3);
	}

}
