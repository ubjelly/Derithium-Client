
final class RawObjectCache extends AbstractObjectCache {

   static Class93 aClass93_4043 = new Class93(64);
   private Object value;
   static volatile int anInt4045 = 0;
   static Hashtable aClass130_4046 = new Hashtable(16);
   static MouseHandler mouseHandler = new MouseHandler();
   static js5 aClass153_4048;
   static jString aClass94_4049 = jString.createJString("");
   static int[] anIntArray4050 = new int[1000];
   static Class93 aClass93_4051 = new Class93(30);
  // static jString aClass94_4052 = jString.createJString("www");


   static final void method569(int var0, int var1) {
      try {
         if(var0 < -78) {
            InterfaceChangeNode var2 = Class3_Sub24_Sub3.putInterfaceChange(7, var1);
            var2.a();
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "he.C(" + var0 + ',' + var1 + ')');
      }
   }

   final Object get() {
	   return this.value;
   }

   public static void method570(int var0) {
      try {
         aClass94_4049 = null;
         anIntArray4050 = null;
         mouseHandler = null;
         aClass130_4046 = null;
         //aClass94_4052 = null;
         aClass93_4043 = null;
         aClass153_4048 = null;
         if(var0 > -101) {
            method570(-94);
         }

         aClass93_4051 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "he.D(" + var0 + ')');
      }
   }

   final boolean isSoftReference() {
	   return false;
   }

   RawObjectCache(Object var1) {
	   this.value = var1;
   }

}
