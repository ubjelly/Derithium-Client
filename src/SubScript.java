
final class SubScript {

   static int anInt869;
   int[] anIntArray870;
   static jString aClass94_871 = jString.createJString("hint_headicons");
   static int anInt872;
   jString[] aClass94Array873;
   ClientScript aClass3_Sub28_Sub15_874;
   int anInt877 = -1;
   static js5 aClass153_878;


	/*static final void method1175(int var0) {
		Class3_Sub13_Sub30.anInt3362 = -1;
		Class82.anInt1150 = -1;
		Class3_Sub28_Sub1.anInt3536 = var0;
		Class3_Sub5.method117();
	}*/

   static final boolean method1176(jString var0, byte var1) {
      try {
         if(var0 != null) {
            for(int var2 = 0; Class8.anInt104 > var2; ++var2) {
               if(var0.method1531(Class70.aClass94Array1046[var2])) {
                  return true;
               }
            }

            if(var1 != -82) {
               aClass94_871 = (jString)null;
            }

            if(var0.method1531(TextureLoader.selfPlayer.username)) {
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "hj.A(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   static final void method1177(short var6, int var0, long var1, jString var4, int var5, jString var7, int var8) {
         if(!Class38_Sub1.aBoolean2615) {
            if(Class3_Sub13_Sub34.anInt3415 < 500) {
               ItemPile.aClass94Array2935[Class3_Sub13_Sub34.anInt3415] = var7;
               Class163_Sub2_Sub1.aClass94Array4016[Class3_Sub13_Sub34.anInt3415] = var4;
               Class114.anIntArray1578[Class3_Sub13_Sub34.anInt3415] = ~var0 == 0?AnimationLoader.anInt3590:var0;
               Class3_Sub13_Sub7.aShortArray3095[Class3_Sub13_Sub34.anInt3415] = var6;
               Class3_Sub13_Sub22.aLongArray3271[Class3_Sub13_Sub34.anInt3415] = var1;
               Class117.anIntArray1613[Class3_Sub13_Sub34.anInt3415] = var5;
               Class27.anIntArray512[Class3_Sub13_Sub34.anInt3415] = var8;
               ++Class3_Sub13_Sub34.anInt3415;
            }

         }
   }

   public static void method1178(byte var0) {
      try {
         int var1 = 103 / ((var0 - -13) / 52);
         aClass94_871 = null;
         aClass153_878 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "hj.B(" + var0 + ')');
      }
   }

}
