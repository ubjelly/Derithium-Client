
abstract class AbstractSprite extends NodeSub {

   int height;
   int trimWidth;
   int offsetY;
   static int timoutCycle = 0;
   //static jString aClass94_3700 = jString.createJString("::cardmem");
   int offsetX;
   static jString aClass94_3702 = jString.createJString(" )2> <col=ffff00>");
   static jString aClass94_3703 = jString.createJString(" )2> ");
   static int anInt3704;
   int trimHeight;
   int width;
   static jInterface aClass11_3708 = null;

   public static void method634() {
	   aClass11_3708 = null;
	   aClass94_3702 = null;
	   aClass94_3703 = null;
	   //aClass94_3700 = null;
   }

   abstract void drawFlippedSprite(int var1, int var2);

   abstract void method636(int var1, int var2, int var3, int var4, int var5, int var6);

   abstract void drawTransparentSprite(int var1, int var2, int var3);

   static final jInterface method638(int var1, int var2) {
	   jInterface var3 = Class7.getInterface(var1);
	   return 0 == ~var2?var3:((var3 != null && var3.aClass11Array262 != null && ~var3.aClass11Array262.length < ~var2?var3.aClass11Array262[var2]:null));
   }

   abstract void method639(int var1, int var2, int var3, int var4);

   final void method640(int var1, int var2, int var3, int var4) {
	   int var6 = this.trimWidth << 3;
	   int var7 = this.trimHeight << 3;
	   var4 = (var4 << 4) + (var6 & 15);
	   var1 = (var1 << 4) + (15 & var7);
	   this.method636(var6, var7, var4, var1, var2, var3);
   }

   abstract void drawSprite(int var1, int var2);

   abstract void method642(int var1, int var2, int var3, int var4, int var5);

   abstract void method643(int var1, int var2);

}
