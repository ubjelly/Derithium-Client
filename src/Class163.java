
class Class163 {

   static Class47 aClass47_2041 = new Class47(64);
   static int[] anIntArray2043 = new int[]{8, 11, 4, 6, 9, 7, 10, 0};
   static jString aClass94_2044 = jString.createJString("cookieprefix");
   static jString aClass94_2045 = jString.createJString("::errortest");
   static int anInt2046 = 0;


	public static void method2208() {
		aClass47_2041 = null;
		anIntArray2043 = null;
		aClass94_2045 = null;
		aClass94_2044 = null;
	}

   static final void method2209(int var1, int var2) {
	   VarBit var3 = VarBit.list(var2);
       int var4 = var3.setting;
       int var6 = var3.endBit;
       int var5 = var3.startBit;
       int var7 = Class3_Sub6.anIntArray2288[var6 - var5];
       if(~var1 > -1 || var7 < var1) {
          var1 = 0;
       }
       var7 <<= var5;
       Class3_Sub13_Sub23.method281(var1 << var5 & var7 | ~var7 & Class57.anIntArray898[var4], var4);
   }

}
