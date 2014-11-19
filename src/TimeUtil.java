
public final class TimeUtil {

   private static long aLong89;
   private static long aLong90;


   public static final synchronized long currentTimeMillis() {
      long var1 = System.currentTimeMillis();
      if(~aLong90 < ~var1) {
         aLong89 += aLong90 + -var1;
      }

      aLong90 = var1;
      return aLong89 + var1;
   }
}
