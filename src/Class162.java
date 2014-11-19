
final class Class162 {

   static int anInt2036;
   static int modelFetchCount = 0;
   static int[][] anIntArrayArray2039 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   static byte[] aByteArray2040 = new byte[520];


   static final void method2203(Player var0, int var1) {
      try {
         Class3_Sub9 var2 = (Class3_Sub9)RawObjectCache.aClass130_4046.get(var0.username.toLong());
         if(var1 != 8) {
            method2204((Buffer)null);
         }

         if(null != var2) {
            if(var2.aClass3_Sub24_Sub1_2312 != null) {
               Class3_Sub26.aClass3_Sub24_Sub2_2563.method461(var2.aClass3_Sub24_Sub1_2312);
               var2.aClass3_Sub24_Sub1_2312 = null;
            }

            var2.unlink();
         }

      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "wc.B(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   static final void method2204(Buffer var0) {
         if(null != LookupTable.aClass30_1039) {
            try {
               LookupTable.aClass30_1039.method984(-117, 0L);
               LookupTable.aClass30_1039.method983(var0.buf, var0.pos, -903171152, 24);
            } catch (Exception var3) {
               ;
            }
         }

         //if(var1 >= 45) {
            var0.pos += 24;
         //}
   }

   public static void method2205(int var0) {
      try {
         anIntArrayArray2039 = (int[][])null;
         aByteArray2040 = null;
         if(var0 != -17413) {
            anInt2036 = 77;
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "wc.C(" + var0 + ')');
      }
   }

   static final void method2206(boolean var0, int var1) {
      try {
         InterfaceChangeNode var2 = Class3_Sub24_Sub3.putInterfaceChange(4, var1);
         var2.a();
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "wc.A(" + var0 + ',' + var1 + ')');
      }
   }

}
