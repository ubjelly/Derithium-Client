
final class Class57 {

   static AbstractSprite aClass3_Sub28_Sub16_895;
   int anInt896 = 0;
   static int[] anIntArray898 = new int[2500];
   int anInt899 = 2048;
   static int anInt902 = 100;
   static int[] anIntArray904 = new int[200];
   static int anInt906;
   int anInt907 = 0;
   int anInt908 = 2048;

	final void decode(Buffer buffer) {
		while (true) {
			int configCode = buffer.getUByte();
			if (configCode == 0) {
				return;
			}

			this.decode(buffer, configCode);
		}
	}

	private final void decode(Buffer buffer, int configCode) {
		if (configCode == 1) {
			this.anInt896 = buffer.getUByte();
		} else if (configCode == 2) {
			this.anInt908 = buffer.getUShort();
		} else if (configCode == 3) {
			this.anInt899 = buffer.getUShort();
		} else if (configCode == 4) {
			this.anInt907 = buffer.getShort();
		}
	}

	static final Class57 method1401(int var1) {
		Class57 var2 = (Class57) Class128.aClass93_1683.get((long) var1);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Class46.aClass153_737.getFile(31, var1);
			var2 = new Class57();
			if (var3 != null) {
				var2.decode(new Buffer(var3));
			}

			Class128.aClass93_1683.put(var2, (long) var1);
			return var2;
		}
	}

	public static void method1192() {
		anIntArray898 = null;
		anIntArray904 = null;
		aClass3_Sub28_Sub16_895 = null;
	}

}
