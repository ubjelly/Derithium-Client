
final class Class3_Sub13_Sub31 extends Class3_Sub13 {

   static Class93 aClass93_3369 = new Class93(64);
   static jString new_markers_string = jString.createJString("new_markers");
   static jString old_markers_string = jString.createJString("hitmarks");
   private static jString aClass94_3371 = jString.createJString("Sat");
   private static jString aClass94_3372 = jString.createJString("Mon");
   static AbstractSprite[] aClass3_Sub28_Sub16Array3373;
   private static jString aClass94_3374 = jString.createJString("Fri");
   static int anInt3375 = 0;
   static int anInt3377 = 7759444;
   private static jString aClass94_3378 = jString.createJString("Wed");
   private static jString aClass94_3379 = jString.createJString("Thu");
   private static jString aClass94_3380 = jString.createJString("Tue");
   private static jString aClass94_3381 = jString.createJString("Sun");
   static jString aClass94_3382 = jString.createJString("(U0a )2 in: ");
   static jString[] aClass94Array3376 = new jString[]{aClass94_3381, aClass94_3372, aClass94_3380, aClass94_3378, aClass94_3379, aClass94_3374, aClass94_3371};

   public static void method317(int var0) {
      try {
         aClass94Array3376 = null;
         aClass94_3378 = null;
         aClass94_3374 = null;
         aClass94_3382 = null;
         aClass94_3381 = null;
         aClass94_3372 = null;
         aClass94_3380 = null;
         if(var0 != 7759444) {
            method317(72);
         }

         aClass93_3369 = null;
         aClass94_3379 = null;
         aClass3_Sub28_Sub16Array3373 = null;
         old_markers_string = null;
         aClass94_3371 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "rl.C(" + var0 + ')');
      }
   }

   final int[] method154(int var1, byte var2) {
      try {
         int var3 = -96 / ((var2 - 30) / 36);
         return TextureLoader.anIntArray2125;
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "rl.D(" + var1 + ',' + var2 + ')');
      }
   }

   public Class3_Sub13_Sub31() {
      super(0, true);
   }

   static final void method318(int var0) {
      try {
         Class3_Sub4 var1 = (Class3_Sub4)Class3_Sub13_Sub6.aClass61_3075.getFirst();
         if(var0 != 7759444) {
            aClass94_3379 = (jString)null;
         }

         for(; null != var1; var1 = (Class3_Sub4)Class3_Sub13_Sub6.aClass61_3075.getNext()) {
            if(var1.anInt2259 != -1) {
               var1.unlink();
            } else {
               var1.anInt2261 = 0;
               Class132.method1798(56, var1);
            }
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "rl.B(" + var0 + ')');
      }
   }

}
