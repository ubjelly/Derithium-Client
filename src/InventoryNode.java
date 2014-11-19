
final class InventoryNode extends Node {

   int[] anIntArray2547 = new int[]{-1};
   static short[] aShortArray2548;
   static int[] anIntArray2550 = new int[50];
   int[] anIntArray2551 = new int[]{0};
   static AbstractTimer aClass129_2552;


   static final void method509(int var0, int var1) {
      try {
         --Class3_Sub13_Sub34.anInt3415;
         if(Class3_Sub13_Sub34.anInt3415 != var1) {
            ArrayUtils.arrayCopy(ItemPile.aClass94Array2935, var1 + 1, ItemPile.aClass94Array2935, var1, -var1 + Class3_Sub13_Sub34.anInt3415);
            ArrayUtils.arrayCopy(Class163_Sub2_Sub1.aClass94Array4016, 1 + var1, Class163_Sub2_Sub1.aClass94Array4016, var1, Class3_Sub13_Sub34.anInt3415 - var1);
            ArrayUtils.arrayCopy(Class114.anIntArray1578, 1 + var1, Class114.anIntArray1578, var1, -var1 + Class3_Sub13_Sub34.anInt3415);
            ArrayUtils.arrayCopy(Class3_Sub13_Sub7.aShortArray3095, 1 + var1, Class3_Sub13_Sub7.aShortArray3095, var1, Class3_Sub13_Sub34.anInt3415 + -var1);
            ArrayUtils.arrayCopy(Class3_Sub13_Sub22.aLongArray3271, 1 + var1, Class3_Sub13_Sub22.aLongArray3271, var1, -var1 + Class3_Sub13_Sub34.anInt3415);
            ArrayUtils.arrayCopy(Class117.anIntArray1613, var1 + var0, Class117.anIntArray1613, var1, -var1 + Class3_Sub13_Sub34.anInt3415);
            ArrayUtils.arrayCopy(Class27.anIntArray512, 1 + var1, Class27.anIntArray512, var1, Class3_Sub13_Sub34.anInt3415 + -var1);
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "qe.A(" + var0 + ',' + var1 + ')');
      }
   }

   public static void method510(int var0) {
      try {
         if(var0 > -73) {
            method510(-59);
         }

         aClass129_2552 = null;
         aShortArray2548 = null;
         anIntArray2550 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "qe.B(" + var0 + ')');
      }
   }

}
