
final class Class44_Sub1 extends Class44 {

   jString aClass94_2620;
   int anInt2621;
   static int anInt2622 = 0;
   static boolean highDetailLights = true;
   static jString aClass94_2624 = jString.createJString("Loaded update list");;
   jString aClass94_2625;
   static int anInt2626 = 20;
   static Class155 aClass155_2627;

   static final void method1076() {
	   Class154.aClass93_1964.clearAll();
   }

   public static void method1077(int var0) {
      try {
         aClass94_2624 = null;
         aClass155_2627 = null;
         if(var0 != 0) {
            anInt2626 = 89;
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ba.A(" + var0 + ')');
      }
   }

   final Class26 method1078(int var1) {
      try {
         int var2 = -35 / ((var1 - 0) / 56);
         return Class119.aClass26Array1627[this.anInt721];
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "ba.B(" + var1 + ')');
      }
   }

   static final int method1079(int var0, byte var1) {
	   if(0 > var0) {
		   return 0;
	   } else {
		   InventoryNode var2 = (InventoryNode)GroundTile.aClass130_2220.get((long)var0);
		   if(var2 == null) {
			   return InvType.list(var0).size;
		   } else {
			   int var3 = 0;
			   
			   for(int var4 = 0; var4 < var2.anIntArray2547.length; ++var4) {
				   if(0 == ~var2.anIntArray2547[var4]) {
					   ++var3;
				   }
			   }

			   var3 += InvType.list(var0).size + -var2.anIntArray2547.length;
			   return var3;
		   }
	   }
   }

}
