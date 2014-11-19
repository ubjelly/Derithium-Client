import java.io.UnsupportedEncodingException;

final class StringNode extends Node {

   static int anInt2579 = 1;
   static jString[] chatMessages = new jString[100];
   static js5 cacheIndex7;
   static int anInt2582 = 0;
   static boolean aBoolean2583 = false;
   static jString aClass94_2584 = jString.createJString("<)4col>");
   jString value;
   static int renderY2;
   static GameShell currentScreen = null;
   static int anInt2589 = 0;


   static final void method727() {
	   KeyboardHandler.aClass93_1911.clearAll();
	   Class80.aClass93_1131.clearAll();
   }

   static final void method728() {
	   try {
		   if(Class10.anInt154 == 1) {
			   int var1 = Class101.aClass3_Sub24_Sub4_1421.method499();
			   if(-1 > ~var1 && Class101.aClass3_Sub24_Sub4_1421.method473(-124)) {
				   var1 -= SpotAnimation.anInt546;
				   if(-1 < ~var1) {
					   var1 = 0;
				   }

				   Class101.aClass3_Sub24_Sub4_1421.method506(128, var1);
				   return;
			   }

			   Class101.aClass3_Sub24_Sub4_1421.method505((byte)-128);
			   Class101.aClass3_Sub24_Sub4_1421.method485(-110);
			   Class83.aClass3_Sub27_1154 = null;
               Class3_Sub28_Sub4.aClass83_3579 = null;
               if(Class101.aClass153_1423 != null) {
            	   Class10.anInt154 = 2;
               } else {
            	   Class10.anInt154 = 0;
               }
		   }
	   } catch (Exception var2) {
		   var2.printStackTrace();
		   Class101.aClass3_Sub24_Sub4_1421.method505((byte)-127);
		   Class101.aClass153_1423 = null;
		   Class83.aClass3_Sub27_1154 = null;
		   Class10.anInt154 = 0;
		   Class3_Sub28_Sub4.aClass83_3579 = null;
	   }
   }

   static final int method729(int var1, int var2) {
	   if(var1 == -2) {
		   return 12345678;
	   } else if(~var1 == 0) {
		   if(2 > var2) {
			   var2 = 2;
		   } else if(~var2 < -127) {
			   var2 = 126;
		   }

		   return var2;
	   } else {
		   var2 = (127 & var1) * var2 >> 7;
		   if(var2 < 2) {
			   var2 = 2;
		   } else if(var2 > 126) {
			   var2 = 126;
		   }

		   return (var1 & '\uff80') - -var2;
	   }
   }

   static final void method730(int var0, int var1, int var3, int var4, int var5) {
	   if(~var0 <= ~Class101.anInt1425 && var4 <= Class3_Sub28_Sub18.anInt3765 && Class159.anInt2020 <= var5 && Class57.anInt902 >= var3) {
		   Class104.method1632(95, var3, var4, var5, var0, var1);
	   } else {
		   Class93.method1525(3074, var1, var4, var5, var0, var3);
	   }
   }

   static final void setupVarpJs5(js5 var0) {
	   Class3_Sub13_Sub13.varpJs5 = var0;
	   Class95.varpLen = Class3_Sub13_Sub13.varpJs5.getChildCount(16);
   }

   public StringNode() {}

   static final jString method732(String var0) {
	   byte[] var2;
	   try {
		   var2 = var0.getBytes("ISO-8859-1");
	   } catch (UnsupportedEncodingException var5) {
		   var2 = var0.getBytes();
	   }

	   jString var3 = new jString();
	   var3.buf = var2;
	   var3.pos = 0;

	   for(int var4 = 0; var4 < var2.length; ++var4) {
		   if(-1 != ~var2[var4]) {
			   var2[var3.pos++] = var2[var4];
		   }
	   }

	   return var3;
   }

   static final Class3_Sub28_Sub4 method733(int var1) {
	   Class3_Sub28_Sub4 var2 = (Class3_Sub28_Sub4)Class3_Sub28_Sub19.aClass47_3776.method1092((long)var1, 1400);
	   if(null == var2) {
		   byte[] var3;
		   if(-32769 < ~var1) {
			   var3 = Class3_Sub24_Sub3.aClass153_3490.getFile(1, var1);
		   } else {
			   var3 = Class154.aClass153_1967.getFile(1, 32767 & var1);
		   }

		   var2 = new Class3_Sub28_Sub4();

		   if(var3 != null) {
			   var2.method546(new Buffer(var3), -1);
		   }

		   if(var1 >= '\u8000') {
			   var2.method548(60);
		   }

		   Class3_Sub28_Sub19.aClass47_3776.method1097(var2, (long)var1, (byte)-117);
		   return var2;
	   } else {
		   return var2;
	   }
   }

   /*static final void method734(int var0, jString var1) {
	   Class163_Sub2.aClass94_2996 = var1;
	   if(null != Class38.gameSignlink.thisApplet) {
		   try {
			   jString var2 = Class163.aClass94_2044.method1573((byte)125, Class38.gameSignlink.thisApplet);
			   jString var3 = Class144.aClass94_1885.method1573((byte)126, Class38.gameSignlink.thisApplet);
			   jString var4 = client.method903(new jString[]{var2, Class82.aClass94_1151, var1, Class166.aClass94_2074, var3}, (byte)-119);
			   if(var0 == var1.getLength()) {
				   var4 = client.method903(new jString[]{var4, Canvas_Sub2.aClass94_28}, (byte)-60);
			   } else {
				   var4 = client.method903(new jString[]{var4, OutputStream_Sub1.aClass94_51, Class15.method894(94608000000L + TimeUtil.currentTimeMillis(), (byte)52), Class163_Sub3.aClass94_3000, InvType.method612(94608000L, (byte)102)}, (byte)-80);
			   }

			   client.method903(new jString[]{AbstractTimer.aClass94_1694, var4, Hashtable.aClass94_1698}, (byte)-84).method1554(true, Class38.gameSignlink.thisApplet);
		   } catch (Throwable var5) {
			   ;
		   }

         }
   }*/

   public static void method735() {
	   cacheIndex7 = null;
	   chatMessages = null;
	   aClass94_2584 = null;
   }

   static final void method736(int var0) {
	   if(-1 != ~Class10.anInt154) {
		   Class3_Sub13_Sub36.anInt3423 = var0;
	   } else {
		   Class101.aClass3_Sub24_Sub4_1421.method506(128, var0);
	   }
   }

   StringNode(jString var1) {
	   this.value = var1;
   }

}
