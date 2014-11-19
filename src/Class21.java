
final class Class21 {

   static boolean aBoolean440 = false;
   static int[] anIntArray441 = new int[2048];
   static jString aClass94_442 = jString.createJString("Number of player models in cache:");
   static int anInt443;
   static jString aClass94_444 = jString.createJString("<img=1>");


   public static void method911(int var0) {
      try {
         if(var0 != 26) {
            anIntArray441 = (int[])null;
         }

         anIntArray441 = null;
         aClass94_444 = null;
         aClass94_442 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "dh.B(" + var0 + ')');
      }
   }

   static final void method912(boolean var0) {
      try {
         Class3_Sub13_Sub1.outputStream.pos = 0;
         Class7.anInt2166 = -1;
         Class38_Sub1.aBoolean2615 = var0;
         Hashtable.anInt1704 = 0;
         Class65.mapFlagX = 0;
         Class3_Sub13_Sub34.anInt3415 = 0;
         StringNode.anInt2582 = -1;
         Class161.anInt2028 = 0;
         Class38_Sub1.systemUpdateCycle = 0;
         IdentityKit.anInt469 = -1;
         SpotAnimation.aClass3_Sub30_Sub1_532.pos = 0;
         AbstractSprite.timoutCycle = 0;
         jString.anInt2147 = -1;

         int var1;
         for(var1 = 0; Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269.length > var1; ++var1) {
            if(null != Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var1]) {
               Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var1].anInt2772 = -1;
            }
         }

         for(var1 = 0; ~var1 > ~Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292.length; ++var1) {
            if(Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var1] != null) {
               Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var1].anInt2772 = -1;
            }
         }

         Class3_Sub28_Sub9.method580((byte)80);
         GrandExchangeItem.anInt1753 = 1;
         Class117.setGameState(30);

         for(var1 = 0; var1 < 100; ++var1) {
            GroundItem.aBooleanArray3674[var1] = true;
         }

         //Class3_Sub13_Sub8.method204();
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "dh.F(" + var0 + ')');
      }
   }

	static final Class118 method913(int var0) {
		try {
			return new Class118_Sub1();
		} catch (Throwable var2) {
			return null;
		}
	}

   static final OverridedInterface overrideInterface(int uid, int var2, int type) {
		OverridedInterface var4 = new OverridedInterface();
		var4.type = type;
		var4.uid = uid;
		Class3_Sub13_Sub17.aClass130_3208.put(var4, (long) var2);
		Class3_Sub13_Sub13.method232(uid);
		jInterface var5 = Class7.getInterface(var2);
		if (var5 != null) {
			Class20.refreshInterface(var5);
		}

		if (null != Class3_Sub13_Sub7.aClass11_3087) {
			Class20.refreshInterface(Class3_Sub13_Sub7.aClass11_3087);
			Class3_Sub13_Sub7.aClass11_3087 = null;
		}

		int var6 = Class3_Sub13_Sub34.anInt3415;

		int var7;
		for (var7 = 0; var6 > var7; ++var7) {
			if (Class2.method73(Class3_Sub13_Sub7.aShortArray3095[var7])) {
				InventoryNode.method509(1, var7);
			}
		}

		if (1 == Class3_Sub13_Sub34.anInt3415) {
			Class38_Sub1.aBoolean2615 = false;
			Class75.method1340(AbstractIndexedSprite.anInt1462,
					Class3_Sub28_Sub3.anInt3552, Class3_Sub13_Sub33.anInt3395,
					Class3_Sub28_Sub1.anInt3537);
		} else {
			Class75.method1340(AbstractIndexedSprite.anInt1462,
					Class3_Sub28_Sub3.anInt3552, Class3_Sub13_Sub33.anInt3395,
					Class3_Sub28_Sub1.anInt3537);
			var7 = client.getBoldFont().method682(Class75_Sub4.aClass94_2667);

			for (int var8 = 0; Class3_Sub13_Sub34.anInt3415 > var8; ++var8) {
				int var9 = client.getBoldFont().method682(
						Buffer.method802(var8, true));
				if (~var9 < ~var7) {
					var7 = var9;
				}
			}

			Class3_Sub28_Sub3.anInt3552 = 8 + var7;
			Class3_Sub28_Sub1.anInt3537 = 15 * Class3_Sub13_Sub34.anInt3415
					+ (!js5.aBoolean1951 ? 22 : 26);
		}

		if (var5 != null) {
			js5Worker.method2104(var5, false, 55);
		}

		Class3_Sub13_Sub12.executeOnLaunchScript(uid);
		if (-1 != InvType.mainScreenInterface) {
			Class3_Sub8.method124(1, InvType.mainScreenInterface);
		}

		return var4;
   }

	/*static final void method915(jString var0) {
		int var2 = Class3_Sub28_Sub8.method576(var0, false);
		if (-1 != var2) {
			AbstractObjectCache.method565(Class119.aClass131_1624.aShortArray1727[var2], Class119.aClass131_1624.aShortArray1718[var2]);
		}
	}*/

   static final AbstractMouseWheel createMouseWheel() {
	   try {
		   return new MouseWheelHandler();
	   } catch (Throwable var2) {
		   return null;
	   }
   }

}
