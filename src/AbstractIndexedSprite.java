
abstract class AbstractIndexedSprite {

   int width;
   static int anInt1462;
   int offsetY;
   static long aLong1465 = 0L;
   int trimHeight;
   int height;
   int trimWidth;
   int offsetX;


   static final void method1662(Node var0, Node var1, int var2) {
      try {
         if(null != var0.previous) {
            var0.unlink();
         }

         var0.next = var1;
         var0.previous = var1.previous;
         if(var2 == -16) {
            var0.previous.next = var0;
            var0.next.previous = var0;
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "ok.C(" + (var0 != null?"{...}":"null") + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   static final Queue method1664(int var0, int var1, byte var2) {
      try {
         Queue var3 = new Queue();

         for(Class3_Sub28_Sub3 var4 = (Class3_Sub28_Sub3)Class134.aClass61_1758.getFirst(); var4 != null; var4 = (Class3_Sub28_Sub3)Class134.aClass61_1758.getNext()) {
            if(var4.aBoolean3553 && var4.method537(var1, (byte)97, var0)) {
               var3.insertLast(var4);
            }
         }

         int var6 = 30 % ((64 - var2) / 54);
         return var3;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "ok.B(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   static final void method1665(int var1, int var2, int var3, int var4, int var5, int var6) {
	   int var7 = var5 + var2;
	   int var8 = -var5 + var4;

	   int var9 = var5 + var6;

	   int var11;
	   for(var11 = var2; ~var11 > ~var7; ++var11) {
		   Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var11], var6, var1, var3);
	   }
	   
	   for(var11 = var4; var8 < var11; --var11) {
		   Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var11], var6, var1, var3);
	   }

	   int var10 = -var5 + var1;

	   for(var11 = var7; ~var8 <= ~var11; ++var11) {
		   int[] var12 = Class38.anIntArrayArray663[var11];
		   Class3_Sub13_Sub23_Sub1.method282(var12, var6, var9, var3);
		   Class3_Sub13_Sub23_Sub1.method282(var12, var10, var1, var3);
	   }
   }

   abstract void method1666(int var1, int var2, int var3);

   abstract void method1667(int var1, int var2);

}
