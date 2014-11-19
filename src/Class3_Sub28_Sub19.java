
final class Class3_Sub28_Sub19 extends NodeSub {

   static js5Worker cacheIndex1;
   static int anInt3773;
   static int anInt3775 = 0;
   static Class47 aClass47_3776 = new Class47(64);
   static jString aClass94_3777 = jString.createJString(" x ");
   Class140_Sub6 aClass140_Sub6_3778;
   static boolean advertSuppressed = false;
   static int[] anIntArray3780 = new int[32];


   static final boolean method715(int var0, jInterface var1) {
      try {
         if(var0 == var1.clientCode) {
            Class159.logoutCycle = 250;
            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "ud.B(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

   static final void method716(int var0) {
      try {
         Class136.aClass93_1772.clearAll();
         if(var0 != 14073) {
            method717(9);
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ud.A(" + var0 + ')');
      }
   }

   public static void method717(int var0) {
      try {
         aClass94_3777 = null;
         int var1 = 54 % ((48 - var0) / 56);
         anIntArray3780 = null;
         cacheIndex1 = null;
         aClass47_3776 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ud.C(" + var0 + ')');
      }
   }

   Class3_Sub28_Sub19(Class140_Sub6 var1) {
      try {
         this.aClass140_Sub6_3778 = var1;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "ud.<init>(" + (var1 != null?"{...}":"null") + ')');
      }
   }

}
