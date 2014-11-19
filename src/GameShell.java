import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {

   private boolean aBoolean1 = false;
   static int anInt3 = 0;

   static boolean aBoolean6 = false;
   static jString aClass94_8 = jString.createJString("");
   static jString aClass94_9 = jString.createJString(")3)3)3");
  // static jString aClass94_10 = jString.createJString("::rect_debug");
   static boolean initOpenGL = false;
   public static int anInt12;
   public static boolean aBoolean13;
   static jString aClass94_4 = jString.createJString(" from your ignore list first)3");;

   public final void focusLost(FocusEvent var1) {
	   Class163_Sub2_Sub1.focusIn = false;
   }

   abstract void mainLoop();

   public final void windowClosing(WindowEvent var1) {
	   this.destroy();
   }

   public final void windowIconified(WindowEvent var1) {}

   public static void method26() {
	   aClass94_8 = null;
	  // aClass94_10 = null;
	   aClass94_9 = null;
	   aClass94_4 = null;
   }

   public final void windowDeactivated(WindowEvent var1) {}

   static final jString method27(jString var0) {
	   int var2 = OverlayType.method1602(var0);
	   return var2 != -1?Class119.aClass131_1624.aClass94Array1721[var2].method1560(Class3_Sub13_Sub16.aClass94_3192, true, BufferedRequest.aClass94_4066):RawObjectCache.aClass94_4049;
   }

   public final AppletContext getAppletContext() {
	   return null != Class3_Sub13_Sub7.resizableFrame?null:(Class38.gameSignlink != null && this != Class38.gameSignlink.thisApplet?Class38.gameSignlink.thisApplet.getAppletContext():super.getAppletContext());
   }

   public final void focusGained(FocusEvent var1) {
	   Class163_Sub2_Sub1.focusIn = true;
	   Class3_Sub13_Sub10.fullRedraw = true;
   }

   static final void method28() {
	   Class143.aClass93_1874.clearAll();
   }

   public final void windowClosed(WindowEvent var1) {}

   final boolean method29() {
	   /*String var2 = this.getDocumentBase().getHost().toLowerCase();
	   if(!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
		   if(!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
			   if(var2.endsWith("127.0.0.1")) {
				   return true;
			   } else {
				   while(-1 > ~var2.length() && 48 <= var2.charAt(-1 + var2.length()) && 57 >= var2.charAt(-1 + var2.length())) {
					   var2 = var2.substring(0, -1 + var2.length());
				   }

				   if(!var2.endsWith("192.168.1.")) {
					   this.method31("invalidhost", var1 + -27544);
					   return false;
				   } else {
					   return true;
				   }
			   }
		   } else {
			   return true;
		   }
	   } else {
		   return true;
	   }*/
	   return true;
   }

   final synchronized void addCanvas() {
	   if(InvType.canvas != null) {
		   InvType.canvas.removeFocusListener(this);
		   InvType.canvas.getParent().remove(InvType.canvas);
	   }

	   Container container;
	   if(Class3_Sub13_Sub10.fullscreenFrame != null) {
		   container = Class3_Sub13_Sub10.fullscreenFrame;
	   } else if(null != Class3_Sub13_Sub7.resizableFrame) {
		   container = Class3_Sub13_Sub7.resizableFrame;
	   } else {
		   container = Class38.gameSignlink.thisApplet;
	   }

	   container.setLayout(null);
	   InvType.canvas = new Canvas_Sub2(this);
	   container.add(InvType.canvas);
	   InvType.canvas.setSize(Class23.canvasWid, ItemPile.canvasHei);
	   InvType.canvas.setVisible(true);
	   if(container != Class3_Sub13_Sub7.resizableFrame) {
		   InvType.canvas.setLocation(Class84.anInt1164, DisplayModeInformation.anInt1442);
	   } else {
		   Insets var3 = Class3_Sub13_Sub7.resizableFrame.getInsets();
		   InvType.canvas.setLocation(Class84.anInt1164 + var3.left, var3.top + DisplayModeInformation.anInt1442);
	   }

	   InvType.canvas.addFocusListener(this);
	   InvType.canvas.requestFocus();
	   Class163_Sub2_Sub1.focusIn = true;
	   Class3_Sub13_Sub10.fullRedraw = true;
	   Class3_Sub13_Sub6.focus = true;
	   AnimationLoader.canvasReplaceRecommended = false;
	   AnimationDefinition.lastCanvasReplace = TimeUtil.currentTimeMillis();
   }

   public final void destroy() {
	   if(this == StringNode.currentScreen && !Varp.shutdown) {
		   Class3_Sub9.killtime = TimeUtil.currentTimeMillis();
		   Class3_Sub13_Sub34.sleep(5000L);
		   Class3_Sub13_Sub10.errorSignlink = null;
		   this.destroyApplet(false);
	   }
   }

   public final void update(Graphics var1) {
	   this.paint(var1);
   }

   final void error(String var1) {
	   if(!this.aBoolean1) {
		   this.aBoolean1 = true;
		   System.out.println("error_game_" + var1);

		   try {
			   this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_top");
		   } catch (Exception var4) {
			   ;
		   }
		   
	   }
   }

   abstract void method32(byte var1);

   abstract void method33(int var1);

   public final URL getDocumentBase() {
	   return null != Class3_Sub13_Sub7.resizableFrame?null:(Class38.gameSignlink != null && this != Class38.gameSignlink.thisApplet?Class38.gameSignlink.thisApplet.getDocumentBase():super.getDocumentBase());
   }

   public final synchronized void paint(Graphics var1) {
	   if(this == StringNode.currentScreen && !Varp.shutdown) {
		   Class3_Sub13_Sub10.fullRedraw = true;
		   if(Class137.safeRedraw && !HDToolkit.openGLEnabled && (TimeUtil.currentTimeMillis() - AnimationDefinition.lastCanvasReplace) > 1000L) {
			   Rectangle var2 = var1.getClipBounds();
			   if(var2 == null || ~var2.width <= ~Class3_Sub9.anInt2334 && ~Class70.anInt1047 >= ~var2.height) {
				   AnimationLoader.canvasReplaceRecommended = true;
			   }
		   }	   
	   }
   }

   public final void windowDeiconified(WindowEvent var1) {}

   static final void method34() {
	   if(null != Class44_Sub1.aClass155_2627) {
		   Class44_Sub1.aClass155_2627.method2163(false);
	   }

	   if(Class3_Sub21.aClass155_2491 != null) {
		   Class3_Sub21.aClass155_2491.method2163(false);
	   }

	   Class140_Sub3.method1959(256, 2, 22050, Class3_Sub13_Sub15.isStereo);
	   Class44_Sub1.aClass155_2627 = Class58.method1195(22050, Class38.gameSignlink, InvType.canvas, 0, 14);
	   Class44_Sub1.aClass155_2627.method2154(114, Class86.aClass3_Sub24_Sub4_1193);
	   Class3_Sub21.aClass155_2491 = Class58.method1195(2048, Class38.gameSignlink, InvType.canvas, 1, 14);
	   Class3_Sub21.aClass155_2491.method2154(-126, Class3_Sub26.aClass3_Sub24_Sub2_2563);
   }

   private final void destroyApplet(boolean var2) {
	   synchronized(this) {
		   if(Varp.shutdown) {
			   return;
		   }

		   Varp.shutdown = true;
	   }

	   if(Class38.gameSignlink.thisApplet != null) {
		   Class38.gameSignlink.thisApplet.destroy();
	   }

	   try {
		   this.method32((byte)23);
	   } catch (Exception var8) {
		   ;
	   }

	   if(InvType.canvas != null) {
		   try {
			   InvType.canvas.removeFocusListener(this);
			   InvType.canvas.getParent().remove(InvType.canvas);
		   } catch (Exception var7) {
			   ;
		   }
	   }

	   if(null != Class38.gameSignlink) {
		   try {
			   Class38.gameSignlink.method1445();
		   } catch (Exception var6) {
			   ;
		   }
	   }

	   this.method33(126);

	   if(null != Class3_Sub13_Sub7.resizableFrame) {
		   try {
			   System.exit(0);
		   } catch (Throwable var5) {
			   ;
		   }
	   }

	   System.out.println("Shutdown complete - clean:" + var2);
   }

   public final void windowActivated(WindowEvent var1) {}

   private final void method36() {
	   long var2 = TimeUtil.currentTimeMillis();
	   long var4 = Class134.aLongArray1766[js5.anInt1953];
	   Class134.aLongArray1766[js5.anInt1953] = var2;
	   js5.anInt1953 = 31 & js5.anInt1953 - -1;
	   synchronized(this) {
		   Class3_Sub13_Sub6.focus = Class163_Sub2_Sub1.focusIn;
	   }
	   
	   this.mainLoop();
	   if(0L != var4 && var2 <= var4) {
		   ;
	   }
   }

   public static final void providesignlink(Signlink var0) {
	   Class38.gameSignlink = var0;
	   Class3_Sub13_Sub10.errorSignlink = var0;
   }

   private final void method37() {
	   long var2 = TimeUtil.currentTimeMillis();
	   long var4 = Class163_Sub1.aLongArray2986[Class62.anInt950];
	   Class163_Sub1.aLongArray2986[Class62.anInt950] = var2;
	   Class62.anInt950 = 31 & Class62.anInt950 + 1;
	   if(~var4 != -1L && var2 > var4) {
		   int var6 = (int)(var2 + -var4);
		   AnimationDefinition.anInt1862 = (32000 + (var6 >> 1)) / var6;
	   }

	   if(50 < Class3_Sub13_Sub25.anInt3313++) {
		   Class3_Sub13_Sub10.fullRedraw = true;
		   Class3_Sub13_Sub25.anInt3313 -= 50;
		   InvType.canvas.setSize(Class23.canvasWid, ItemPile.canvasHei);
		   InvType.canvas.setVisible(true);
		   if(Class3_Sub13_Sub7.resizableFrame != null && null == Class3_Sub13_Sub10.fullscreenFrame) {
			   Insets var8 = Class3_Sub13_Sub7.resizableFrame.getInsets();
			   InvType.canvas.setLocation(var8.left + Class84.anInt1164, DisplayModeInformation.anInt1442 + var8.top);
		   } else {
			   InvType.canvas.setLocation(Class84.anInt1164, DisplayModeInformation.anInt1442);
		   }
	   }

	   this.mainRedraw(40);
   }

   abstract void mainRedraw(int var1);

   public final URL getCodeBase() {
      return Class3_Sub13_Sub7.resizableFrame == null?(null != Class38.gameSignlink && this != Class38.gameSignlink.thisApplet?Class38.gameSignlink.thisApplet.getCodeBase():super.getCodeBase()):null;
   }

   public final void run() {
	   try {
		   if(null != Signlink.javaVendor) {
			   String var1 = Signlink.javaVendor.toLowerCase();
			   if(var1.indexOf("sun") == -1 && -1 == var1.indexOf("apple")) {
				   if(0 != ~var1.indexOf("ibm") && (Signlink.javaVersion == null || Signlink.javaVersion.equals("1.4.2"))) {
					   this.error("wrongjava");
					   return;
				   }
			   } else {
				   String var2 = Signlink.javaVersion;
				   if(var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
					   this.error("wrongjava");
					   return;
				   }

				   Class132.anInt1737 = 5;
			   }
		   }

		   int var7;
		   if(null != Signlink.javaVersion && Signlink.javaVersion.startsWith("1.")) {
			   var7 = 2;

			   int var9;
			   for(var9 = 0; var7 < Signlink.javaVersion.length(); ++var7) {
				   char var3 = Signlink.javaVersion.charAt(var7);
				   if(var3 < 48 || 57 < var3) {
					   break;
				   }

				   var9 = var9 * 10 - (48 - var3);
			   }

			   if(~var9 <= -6) {
				   Class137.safeRedraw = true;
			   }
		   }

		   if(null != Class38.gameSignlink.thisApplet) {
			   Method var8 = Signlink.cycleRootMethod;
			   if(null != var8) {
				   try {
					   var8.invoke(Class38.gameSignlink.thisApplet, new Object[]{Boolean.TRUE});
				   } catch (Throwable var4) {
					   ;
				   }
			   }
		   }

		   Class3_Sub28_Sub18.calculateMaxMemory();
		   this.addCanvas();
		   Class164_Sub1.aClass158_3009 = Class3_Sub13_Sub23_Sub1.createGraphicsBuffer(InvType.canvas, Class23.canvasWid, ItemPile.canvasHei);
		   this.method39();
		   InventoryNode.aClass129_2552 = Huffman.method1012();

		   while(-1L == ~Class3_Sub9.killtime || Class3_Sub9.killtime > TimeUtil.currentTimeMillis()) {
			   GrandExchangeItem.anInt1754 = InventoryNode.aClass129_2552.method1767(-1, Class132.anInt1737, Class44_Sub1.anInt2626);

			   for(var7 = 0; var7 < GrandExchangeItem.anInt1754; ++var7) {
				   this.method36();
			   }

			   this.method37();
			   Class81.processEventQueue(Class38.gameSignlink, InvType.canvas);
		   }
	   } catch (Exception var5) {
		   Class49.method1125((String)null, var5);
		   this.error("crash");
	   }

	   this.destroyApplet(true);
   }

   public final String getParameter(String var1) {
	   return Class3_Sub13_Sub7.resizableFrame == null?(Class38.gameSignlink != null && this != Class38.gameSignlink.thisApplet?Class38.gameSignlink.thisApplet.getParameter(var1):super.getParameter(var1)):null;
   }

   abstract void method39();

   public final void stop() {
	   if(StringNode.currentScreen == this && !Varp.shutdown) {
		   Class3_Sub9.killtime = 4000L + TimeUtil.currentTimeMillis();
	   }
   }

   public abstract void init();

   final void method40(int var1, int var2, boolean var3, int var4, String var5, int var6, int var8) {
	   try {
		   ItemPile.canvasHei = var6;
		   Class70.anInt1047 = var6;
		   Class84.anInt1164 = 0;
		   Class3_Sub13_Sub23_Sub1.anInt4033 = var2;
		   Class23.canvasWid = var4;
		   Class3_Sub9.anInt2334 = var4;
		   DisplayModeInformation.anInt1442 = 0;
		   StringNode.currentScreen = this;
		   Class3_Sub13_Sub7.resizableFrame = new Frame();
		   Class3_Sub13_Sub7.resizableFrame.setTitle("Jagex");
		   Class3_Sub13_Sub7.resizableFrame.setResizable(true);
		   Class3_Sub13_Sub7.resizableFrame.addWindowListener(this);
		   Class3_Sub13_Sub7.resizableFrame.setVisible(true);
		   Class3_Sub13_Sub7.resizableFrame.toFront();
		   Insets var9 = Class3_Sub13_Sub7.resizableFrame.getInsets();
		   Class3_Sub13_Sub7.resizableFrame.setSize(var9.left + Class3_Sub9.anInt2334 + var9.right, var9.top + Class70.anInt1047 + var9.bottom);
		   Class3_Sub13_Sub10.errorSignlink = Class38.gameSignlink = new Signlink((Applet)null, var1, var5, var8);
		   SignlinkNode var10 = Class38.gameSignlink.startThread(this, 1);

		   while(0 == var10.status) {
			   Class3_Sub13_Sub34.sleep(10L);
		   }

		   Class17.aThread409 = (Thread)var10.value;
	   } catch (Exception var11) {
		   Class49.method1125((String)null, var11);
	   }
   }

   public final void windowOpened(WindowEvent var1) {}

   public final void start() {
	   if(StringNode.currentScreen == this && !Varp.shutdown) {
		   Class3_Sub9.killtime = 0L;
	   }
   }

   final void method41(int var2, int var3, int var4, int var5) {
	   try {
		   if(StringNode.currentScreen != null) {
			   ++Huffman.anInt639;
			   if(~Huffman.anInt639 <= -4) {
				   this.error("alreadyloaded");
				   return;
			   }

			   this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
			   return;
		   }

		   StringNode.currentScreen = this;
		   DisplayModeInformation.anInt1442 = 0;
		   Class3_Sub13_Sub23_Sub1.anInt4033 = var4;
		   Class23.canvasWid = var2;
		   Class3_Sub9.anInt2334 = var2;
		   Class84.anInt1164 = 0;
		   ItemPile.canvasHei = var5;
		   Class70.anInt1047 = var5;
		   String var6 = this.getParameter("openwinjs");
		   if(var6 != null && var6.equals("1")) {
			   InterfaceChangeNode.aBoolean3594 = true;
		   } else {
			   InterfaceChangeNode.aBoolean3594 = false;
		   }

		   if(null == Class38.gameSignlink) {
			   Class3_Sub13_Sub10.errorSignlink = Class38.gameSignlink = new Signlink(this, var3, (String)null, client.indexCount);
		   }

		   SignlinkNode var7 = Class38.gameSignlink.startThread(this, 1);

		   while(~var7.status == -1) {
			   Class3_Sub13_Sub34.sleep(10L);
		   }

		   Class17.aThread409 = (Thread)var7.value;
	   } catch (Exception var8) {
		   Class49.method1125((String)null, var8);
		   this.error("crash");
	   }
   }

}
