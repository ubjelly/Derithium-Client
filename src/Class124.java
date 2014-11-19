
final class Class124 {

   static Hashtable aClass130_1659 = new Hashtable(512);
   static js5 aClass153_1661;


   public static void method1744(boolean var0) {
      try {
         aClass130_1659 = null;
         aClass153_1661 = null;
         if(!var0) {
            aClass130_1659 = (Hashtable)null;
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "rb.A(" + var0 + ')');
      }
   }

   static final void method1745(int var0) {
      try {
         for(int var1 = var0; ~var1 > -105; ++var1) {
            for(int var2 = 0; 104 > var2; ++var2) {
               Class163_Sub1_Sub1.anIntArrayArray4010[var1][var2] = 0;
            }
         }

      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "rb.B(" + var0 + ')');
      }
   }

   static final void method1746(boolean var0) {
	   Class75_Sub4.method1352(ItemPile.canvasHei, var0, -1, InvType.mainScreenInterface, Class23.canvasWid);
   }

   static final Class3_Sub28_Sub3 method1747(Buffer var0, boolean var1) {
      try {
         Class3_Sub28_Sub3 var2 = new Class3_Sub28_Sub3(var0.getString(), var0.getString(), var0.getUShort(), var0.getUShort(), var0.getInt(), var0.getUByte() == 1, var0.getUByte());
         int var3 = var0.getUByte();

         for(int var4 = 0; ~var4 > ~var3; ++var4) {
            var2.aClass61_3560.insertBack(new Class3_Sub21(var0.getUShort(), var0.getUShort(), var0.getUShort(), var0.getUShort()));
         }

         var2.method538();
         return var2;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "rb.D(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

}
