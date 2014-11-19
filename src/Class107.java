
final class Class107 {

   static int anInt1452;
   static jInterface aClass11_1453;
   static jString[] stringArguments;


   static final void method1645(js5 var0, js5 var1, byte var2) {
      try {
         KeyboardHandler.aClass153_1916 = var1;
         int var4 = (int)(21.0D * Math.random()) - 10;
         SubScript.aClass153_878 = var0;
         int var5 = (int)(21.0D * Math.random()) - 10;
         SubScript.aClass153_878.getChildCount(34);
         int var3 = (int)(Math.random() * 21.0D) + -10;
         int var6 = -20 + (int)(41.0D * Math.random());
         AbstractGraphicsBuffer.anInt2015 = var6 + var5;
         if(var2 == -67) {
            Class46.anInt740 = var4 + var6;
            TextureLoader.anInt2136 = var6 + var3;
         }
      } catch (RuntimeException var7) {
         throw Class44.method1067(var7, "og.F(" + (var0 != null?"{...}":"null") + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   public static void method1646() {
         stringArguments = null;
         aClass11_1453 = null;
   }

   static final void method1647(byte var0, int var1, int var2, Entity var3, int var4, int var5, int var6) {
      try {
         if(var0 != 122) {
            method1648((js5)null, 7);
         }

         Class118.method1724(var6, var2, var3.anInt2829, var5, var1, var3.anInt2819, var4);
      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "og.A(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   static final void method1648(js5 var0, int var1) {
      try {
         Class101.aClass153_1420 = var0;
         if(var1 != 255) {
            anInt1452 = -56;
         }

      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "og.B(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   static final void method1649(int var0, int var1) {
      try {
         if(var1 <= -65) {
            InterfaceChangeNode var2 = Class3_Sub24_Sub3.putInterfaceChange(10, var0);
            var2.a();
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "og.C(" + var0 + ',' + var1 + ')');
      }
   }

   static final void method1650(int var0) {
      try {
         Deque.aClass93_939.clearSoftReference();
         if(var0 != 21) {
            aClass11_1453 = (jInterface)null;
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "og.G(" + var0 + ')');
      }
   }

   static final int method1651(int var0, int var1, int var2) {
      try {
         int var3;
         if(~var2 > ~var1) {
            var3 = var2;
            var2 = var1;
            var1 = var3;
         }

         while(var1 != 0) {
            var3 = var2 % var1;
            var2 = var1;
            var1 = var3;
         }

         if(var0 != 19067) {
            stringArguments = (jString[])null;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "og.D(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

}
