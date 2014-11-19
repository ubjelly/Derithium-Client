
final class RuntimeException_Sub1 extends RuntimeException {

   static int[] anIntArray2113 = new int[]{2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0};
   static HintIcon[] aClass96Array2114 = new HintIcon[4];
   static int anInt2115 = -1;
   static jString aClass94_2116 = jString.createJString("Hidden)2use");
   String aString2117;
   Throwable aThrowable2118;
   static jString[] aClass94Array2119 = null;
   static int anInt2120 = 0;
   static String aString2121;

	static final void setRenderPos(int var0, int var1, int var2, int var3, int var5) {
		StringNode.renderY2 = var1;
		Class3_Sub13_Sub8.renderYaw2 = var5;
		ItemPile.renderPitch2 = var0;
		Class9.renderX2 = var3;
		ClientScript.renderZ2 = var2;
	}

   static final int method2286() {
	   return 6;
   }

   RuntimeException_Sub1(Throwable var1, String var2) {
      this.aString2117 = var2;
      this.aThrowable2118 = var1;
   }

   static final int method2287(int var0, byte var1) {
      try {
         return (-98 < ~var0 || ~var0 < -123) && (-225 < ~var0 || ~var0 < -255 || 247 == var0)?(-256 != ~var0?(var0 != 156?(var1 != 59?72:var0):140):159):var0 + -32;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "ld.C(" + var0 + ',' + var1 + ')');
      }
   }

   public static void method2288(boolean var0) {
      anIntArray2113 = null;
      aClass94_2116 = null;
      aClass96Array2114 = null;
      aClass94Array2119 = null;
      if(var0) {
         method2287(-64, (byte)-87);
      }

      aString2121 = null;
   }

}
