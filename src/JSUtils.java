import java.applet.Applet;
import netscape.javascript.JSObject;

final class JSUtils {

   static final Object getValue(Applet var2, String var0) throws Throwable {
      return JSObject.getWindow(var2).call(var0, (Object[])null);
   }

   static final Object getValue(Applet var0, String var1, Object[] var2) throws Throwable {
      return JSObject.getWindow(var0).call(var1, var2);
   }

   static final void eval(Applet var0, String var2) throws Throwable {
      JSObject.getWindow(var0).eval(var2);
   }
}
