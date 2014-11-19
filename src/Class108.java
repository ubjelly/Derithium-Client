
final class Class108 {

   //static jString aClass94_1456 = jString.createJString("::qa_op_test");
   static AbstractSprite aClass3_Sub28_Sub16_1457;
   static jString aClass94_1458 = jString.createJString("::hd");
  // static int anInt1460;

   static final void method1652(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      try {
         if(var9 != 0) {
            aClass94_1458 = (jString)null;
         }

         if(~var5 <= ~Class101.anInt1425 && ~var5 >= ~Class3_Sub28_Sub18.anInt3765 && var0 >= Class101.anInt1425 && ~var0 >= ~Class3_Sub28_Sub18.anInt3765 && ~var6 <= ~Class101.anInt1425 && ~Class3_Sub28_Sub18.anInt3765 <= ~var6 && ~Class101.anInt1425 >= ~var1 && ~var1 >= ~Class3_Sub28_Sub18.anInt3765 && ~Class159.anInt2020 >= ~var4 && ~var4 >= ~Class57.anInt902 && ~var7 <= ~Class159.anInt2020 && Class57.anInt902 >= var7 && var2 >= Class159.anInt2020 && ~Class57.anInt902 <= ~var2 && ~var3 <= ~Class159.anInt2020 && ~var3 >= ~Class57.anInt902) {
            Class3_Sub5.method114(var2, var8, var7, var6, var1, var3, var4, var0, var5);
         } else {
            Class95.method1583(var5, var0, var7, 3, var8, var3, var2, var1, var6, var4);
         }

      } catch (RuntimeException var11) {
         throw Class44.method1067(var11, "oi.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
      }
   }

   static final jString method1653(int var0, int var1) {
      try {
         if(var1 != 0) {
            method1660(-41);
         }

         return client.method903(new jString[]{Class72.method1298(255 & var0 >> 24), Class163_Sub2_Sub1.aClass94_4023, Class72.method1298((var0 & 16712751) >> 16), Class163_Sub2_Sub1.aClass94_4023, Class72.method1298(255 & var0 >> 8), Class163_Sub2_Sub1.aClass94_4023, Class72.method1298(var0 & 255)});
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "oi.F(" + var0 + ',' + var1 + ')');
      }
   }

   static final void method1654(int var0) {
      try {
         Entity.aClass93_2792.clearSoftReference();
         if(var0 == -15447) {
            ;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "oi.E(" + var0 + ')');
      }
   }

   static final byte[] method1655(byte var0, byte[] var1) {
      try {
         if(var1 == null) {
            return null;
         } else {
            if(var0 > -30) {
               aClass3_Sub28_Sub16_1457 = (AbstractSprite)null;
            }

            byte[] var2 = new byte[var1.length];
            ArrayUtils.arrayCopy(var1, 0, var2, 0, var1.length);
            return var2;
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "oi.H(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

   static final void method1657(int var0, int var1) {
      try {
         InterfaceChangeNode var2 = Class3_Sub24_Sub3.putInterfaceChange(5, var0);
         var2.a();
         if(var1 != -903) {
            aClass94_1458 = (jString)null;
         }

      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "oi.J(" + var0 + ',' + var1 + ')');
      }
   }

   static final void method1658(int var0, int[] var1, Object[] var2) {
      try {
         Class25.method956(var2, var1.length - 1, var1, 74, 0);
         int var3 = 113 % ((76 - var0) / 45);
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "oi.I(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   static final void method1659(int var0) {
      try {
         Deque.aClass93_939.clearAll();
         if(var0 == 16712751) {
            ;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "oi.G(" + var0 + ')');
      }
   }

   public static void method1660(int var0) {
      try {
         aClass3_Sub28_Sub16_1457 = null;
         aClass94_1458 = null;
         //aClass94_1456 = null;
         if(var0 != 13123) {
            aClass94_1458 = (jString)null;
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "oi.A(" + var0 + ')');
      }
   }

   static final void method1661(int var0, js5 var1, js5 var2, boolean var3) {
      try {
         Class14.aBoolean337 = var3;
         LookupTable.aClass153_1043 = var2;
         if(var0 != 2) {
            method1658(22, (int[])null, (Object[])null);
         }

         Class85.aClass153_1171 = var1;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "oi.D(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

}
