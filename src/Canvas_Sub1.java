import java.awt.Canvas;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

final class Canvas_Sub1 extends Canvas implements FocusListener {

   static int anInt14 = 0;
   static int anInt15 = 0;
   static int[][] anIntArrayArray20 = new int[5][5000];
   static Class93 aClass93_21 = new Class93(64);
   static int anInt23 = 0;
   static int anInt25 = 1;
   static jString aClass94_26 = jString.createJString("n");


   public static void method53(int var0) {
      try {
         aClass93_21 = null;
         anIntArrayArray20 = (int[][])null;
         aClass94_26 = null;
         if(var0 != 0) {
            aClass93_21 = (Class93)null;
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "oe.C(" + var0 + ')');
      }
   }

   static final int method54(int var0, boolean var1) {
      try {
         return var1?-81:var0 & 127;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "oe.A(" + var0 + ',' + var1 + ')');
      }
   }

   static final void method55(int var0) {
      try {
         if(var0 != 22683) {
            method53(43);
         }

         aClass93_21.clearSoftReference();
         Class99.aClass93_1401.clearSoftReference();
         RawObjectCache.aClass93_4051.clearSoftReference();
         Class154.aClass93_1965.clearSoftReference();
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "oe.B(" + var0 + ')');
      }
   }

@Override
public void focusGained(FocusEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void focusLost(FocusEvent e) {
	// TODO Auto-generated method stub
	
}

}
