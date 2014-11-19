
abstract class Class3_Sub28_Sub10 extends NodeSub {

   static int brightness = 3;
   private static jString aClass94_3626 = jString.createJString("Created gameworld");
   boolean aBoolean3628;
   static jString aClass94_3629 = aClass94_3626;
   static int anInt3631;
   volatile boolean aBoolean3632 = true;
   boolean aBoolean3635;


   abstract int method586();

   abstract byte[] getBuffer(boolean var1);

   public static void method588() {
	   aClass94_3626 = null;
	   aClass94_3629 = null;
   }

   static final void method589(int var0, int var1, int var2) {
      Class3_Sub13_Sub21.aBoolean3261 = true;
      CollisionMap.anInt1302 = var0;
      Class49.anInt819 = var1;
      Class3_Sub13_Sub23_Sub1.anInt4039 = var2;
      Class27.anInt515 = -1;
      Js5CacheWorker.anInt999 = -1;
   }

   static final boolean method590(byte var0, int var1, int var2) {
      try {
         if(11 == var2) {
            var2 = 10;
         }

         int var3 = -59 % ((var0 - 26) / 55);
         if(-6 >= ~var2 && var2 <= 8) {
            var2 = 4;
         }

         ObjectDefinition var4 = ObjectDefinition.list(var1);
         return var4.method1684(115, var2);
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "il.D(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

}
