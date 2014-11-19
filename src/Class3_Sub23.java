
final class Class3_Sub23 extends Node {

   static int anInt2530 = 2301979;
   int anInt2531;
   int anInt2532;
   static int[] anIntArray2533;
   static int anInt2535 = -2;
   static js5 aClass153_2536;
   static int anInt2537 = 0;
   static boolean[] skillEnabled = {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };
   int anInt2539;
   static Class3_Sub11[][] aClass3_Sub11ArrayArray2542;


   public static void method405(boolean var0) {
      try {
         aClass153_2536 = null;
         anIntArray2533 = null;
         aClass3_Sub11ArrayArray2542 = (Class3_Sub11[][])null;
         skillEnabled = null;
         if(!var0) {
            method408(-65, (byte)-3, 110, (int[][])((int[][])null), -123, 122);
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "oj.B(" + var0 + ')');
      }
   }

   static final jString method407(int var0, boolean var1, int var2, long var3, int var5) {
      try {
         jString var6 = Class47.createBlankJString(0);
         if(~var3 > -1L) {
            var3 = -var3;
            var6.method1533(Class3_Sub13_Sub11.aClass94_3133, true);
         }

         jString var8 = Class143.aClass94_1880;
         jString var7 = Class14.aClass94_341;
         if(~var0 == -2) {
            var8 = Class14.aClass94_341;
            var7 = Class143.aClass94_1880;
         }

         if(-3 == ~var0) {
            var7 = Class143.aClass94_1880;
            var8 = Class3_Sub13_Sub6.aClass94_3080;
         }

         if(-4 == ~var0) {
            var8 = Class14.aClass94_341;
            var7 = Class143.aClass94_1880;
         }

         jString var10 = Class47.createBlankJString(0);

         int var11;
         for(var11 = 0; ~var11 > ~var2; ++var11) {
            var10.method1533(Class72.method1298((int)(var3 % 10L)), true);
            var3 /= 10L;
         }

         var11 = 0;
         jString var9;
         if(var3 != 0L) {
            jString var12;
            for(var12 = Class47.createBlankJString(0); var3 > 0L; var3 /= 10L) {
               if(var1 && ~var11 != -1 && -1 == ~(var11 % 3)) {
                  var12.method1533(var8, true);
               }

               var12.method1533(Class72.method1298((int)(var3 % 10L)), true);
               ++var11;
            }

            var9 = var12;
         } else {
            var9 = Class3_Sub13_Sub1.aClass94_3039;
         }

         if(var5 != 2) {
            return (jString)null;
         } else {
            if(~var10.getLength() < -1) {
               var10.method1533(var7, true);
            }

            return client.method903(new jString[]{var6, var9.method1544(true), var10.method1544(true)});
         }
      } catch (RuntimeException var13) {
         throw Class44.method1067(var13, "oj.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var5 + ')');
      }
   }

   static final int method408(int var0, byte var1, int var2, int[][] var3, int var4, int var5) {
      try {
         int var6 = var0 * var3[1 + var4][var2] + (128 - var0) * var3[var4][var2] >> 7;
         int var7 = var3[var4][1 + var2] * (-var0 + 128) + var3[var4 - -1][var2 - -1] * var0 >> 7;
         int var8 = -121 / ((var1 - 5) / 46);
         return var6 * (128 + -var5) - -(var5 * var7) >> 7;
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "oj.A(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ',' + var4 + ',' + var5 + ')');
      }
   }

}
