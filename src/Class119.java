import java.awt.Container;
import java.awt.Insets;

final class Class119 {

   static Class131 aClass131_1624;
   static jString aClass94_1625 = jString.createJString("Memory before cleanup=");
   static Class33 aClass33_1626;
   static Class26[] aClass26Array1627;
   static js5 aClass153_1628;
   static jString aClass94_1630 = jString.createJString("Mem:");

   public static void method1728(int var0) {
      try {
         aClass33_1626 = null;
         aClass131_1624 = null;
         aClass26Array1627 = null;
         aClass94_1630 = null;
         aClass153_1628 = null;
         aClass94_1625 = null;
         if(var0 != -14256) {
            method1728(46);
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "qh.B(" + var0 + ')');
      }
   }

   static final void method1729() {
	   Object var1;
	   if(null == Class3_Sub13_Sub10.fullscreenFrame) {
		   if(Class3_Sub13_Sub7.resizableFrame != null) {
			   var1 = Class3_Sub13_Sub7.resizableFrame;
		   } else {
			   var1 = Class38.gameSignlink.thisApplet;
		   }
	   } else {
		   var1 = Class3_Sub13_Sub10.fullscreenFrame;
	   }

         Class3_Sub9.anInt2334 = ((Container)var1).getSize().width;
         Class70.anInt1047 = ((Container)var1).getSize().height;
         Insets var2;
         if(var1 == Class3_Sub13_Sub7.resizableFrame) {
            var2 = Class3_Sub13_Sub7.resizableFrame.getInsets();
            Class70.anInt1047 -= var2.bottom + var2.top;
            Class3_Sub9.anInt2334 -= var2.right + var2.left;
         }

         if(~Class83.getDisplayMode() <= -3) {
            Class23.canvasWid = Class3_Sub9.anInt2334;
            Class84.anInt1164 = 0;
            DisplayModeInformation.anInt1442 = 0;
            ItemPile.canvasHei = Class70.anInt1047;
         } else {
            DisplayModeInformation.anInt1442 = 0;
            Class84.anInt1164 = (-765 + Class3_Sub9.anInt2334) / 2;
            ItemPile.canvasHei = 503;
            Class23.canvasWid = 765;
         }

         if(HDToolkit.openGLEnabled) {
            HDToolkit.method1854(Class23.canvasWid, ItemPile.canvasHei);
         }

         InvType.canvas.setSize(Class23.canvasWid, ItemPile.canvasHei);
         if(var1 != Class3_Sub13_Sub7.resizableFrame) {
            InvType.canvas.setLocation(Class84.anInt1164, DisplayModeInformation.anInt1442);
         } else {
            var2 = Class3_Sub13_Sub7.resizableFrame.getInsets();
            InvType.canvas.setLocation(var2.left + Class84.anInt1164, DisplayModeInformation.anInt1442 + var2.top);
         }

         if(~InvType.mainScreenInterface != 0) {
            Class124.method1746(true);
         }

         Class80.method1396();
   }

   static final void writePreferences(Signlink var0) {
	   FileOnDisk var2 = null;

	   try {
		   SignlinkNode var3 = var0.getPreferences("runescape");

		   while(0 == var3.status) {
			   Class3_Sub13_Sub34.sleep(1L);
		   }

		   if(var3.status == 1) {
			   var2 = (FileOnDisk)var3.value;
			   Buffer var4 = Class23.getPreferencesBuffer();
			   var2.write(var4.buf, 0, var4.pos);
		   }
	   } catch (Exception var6) {
		   ;
	   }

	   try {
		   if(var2 != null) {
			   var2.close();
		   }
	   } catch (Exception var5) {
		   ;
	   }
   }

}
