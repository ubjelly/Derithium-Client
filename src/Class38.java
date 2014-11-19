
class Class38 {

   static int anInt660;
   static boolean aBoolean661 = true;
   static jString aClass94_662 = jString.createJString("Please remove ");
   static int[][] anIntArrayArray663;
   static int[] anIntArray664 = new int[14];
   static Signlink gameSignlink;
   static jString aClass94_666 = jString.createJString("Please remove ");
   static AbstractMouseWheel mouseWheelHandler;


   public static void method1024() {
		anIntArray664 = null;
		anIntArrayArray663 = (int[][]) null;
		mouseWheelHandler = null;
		gameSignlink = null;
		aClass94_662 = null;
		aClass94_666 = null;
   }

	static final void method1025() {
		OverridedInterface.aClass93_2604.clearSoftReference();
		Class27.aClass93_511.clearSoftReference();
	}

   static final int method1026(byte[] var0, int var1, boolean var2) {
      try {
         return var2?-3:Class99.method1599(0, var1, var0);
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "fk.H(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + var2 + ')');
      }
   }

   static final void method1027(int var0, byte var1) {
      try {
         Class44.aClass93_725.method1522(var0);
         int var2 = -38 % ((var1 - 29) / 40);
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "fk.J(" + var0 + ',' + var1 + ')');
      }
   }

   static final void method1028(int var0) {
      try {
         for(int var1 = -1; ~var1 > ~Class159.anInt2022; ++var1) {
            int var2;
            if(0 == ~var1) {
               var2 = 2047;
            } else {
               var2 = Class56.anIntArray887[var1];
            }

            Player var3 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var2];
            if(var3 != null) {
               OutputStream_Sub1.method68(var3.getSize(), 2279, var3);
            }
         }

         if(var0 >= -3) {
            aClass94_666 = (jString)null;
         }

      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "fk.G(" + var0 + ')');
      }
   }

}
