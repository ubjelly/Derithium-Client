
final class FixedVertex {

   static long[] aLongArray1631 = new long[256];
   int z;
   int x;
   int y;
   static int[] anIntArray1638;


   public static void method1731(int var0) {
      try {
         anIntArray1638 = null;
         aLongArray1631 = null;
         if(var0 != 12881) {
            method1732((jInterface)null, -125);
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "qj.A(" + var0 + ')');
      }
   }

   static final jString method1732(jInterface var0, int var2) {
	   return !jInterface.getInterfaceClickMask(var0).method92(var2) && var0.anObjectArray314 == null?null:(null != var0.niActions && var0.niActions.length > var2 && var0.niActions[var2] != null && ~var0.niActions[var2].method1564().getLength() != -1?var0.niActions[var2]:(!LookupTable.qaoptestEnabled?null:client.method903(new jString[]{Class121.aClass94_1645, Class72.method1298(var2)})));
   }

   static {
      for(int var2 = 0; 256 > var2; ++var2) {
         long var0 = (long)var2;

         for(int var3 = 0; 8 > var3; ++var3) {
            if(~(1L & var0) != -2L) {
               var0 >>>= 1;
            } else {
               var0 = var0 >>> 1 ^ -3932672073523589310L;
            }
         }

         aLongArray1631[var2] = var0;
      }

      anIntArray1638 = new int[128];
   }
}
