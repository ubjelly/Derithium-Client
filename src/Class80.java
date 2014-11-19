import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.ImageObserver;

final class Class80 {

   private Node aClass3_1130;
   static Class93 aClass93_1131 = new Class93(5);
   private int current = 0;
   static jString aClass94_1133 = jString.createJString(")4j");
   private Hashtable aClass130_1134;
   static Class93 aClass93_1135 = new Class93(4);
   static AbstractSprite[] aClass3_Sub28_Sub16Array1136;
   static int anInt1137 = 2;
   static int[] anIntArray1138;


   final Node getNext() {
         Node var2;
         if(-1 > ~this.current && this.aClass130_1134.table[this.current + -1] != this.aClass3_1130) {
            var2 = this.aClass3_1130;
            this.aClass3_1130 = var2.next;
            return var2;
         } else {
            do {
               if(~this.aClass130_1134.count >= ~this.current) {
                  return null;
               }

               var2 = this.aClass130_1134.table[this.current++].next;
            } while(var2 == this.aClass130_1134.table[-1 + this.current]);

            this.aClass3_1130 = var2.next;
            return var2;
         }
   }

   final Node getFirst() {
	   this.current = 0;
	   return this.getNext();
   }

	public static void method1394() {
		anIntArray1138 = null;
		aClass93_1131 = null;
		aClass94_1133 = null;
		aClass93_1135 = null;
		aClass3_Sub28_Sub16Array1136 = null;
	}

	static final long method1395(int var0, int var1, int var2) {
		GroundTile var3 = Class75_Sub2.groundTiles[var0][var1][var2];
		return var3 != null && var3.aClass19_2233 != null ? var3.aClass19_2233.aLong428 : 0L;
	}

	static final void method1396() {
		int var2 = DisplayModeInformation.anInt1442;
		int var1 = Class84.anInt1164;
		int var4 = -ItemPile.canvasHei + (Class70.anInt1047 - var2);
		int var3 = -var1 + Class3_Sub9.anInt2334 - Class23.canvasWid;
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
			try {
				Object var5;
				if (null != Class3_Sub13_Sub10.fullscreenFrame) {
					var5 = Class3_Sub13_Sub10.fullscreenFrame;
				} else if (Class3_Sub13_Sub7.resizableFrame == null) {
					var5 = Class38.gameSignlink.thisApplet;
				} else {
					var5 = Class3_Sub13_Sub7.resizableFrame;
				}

				int var7 = 0;
				int var6 = 0;
				if (Class3_Sub13_Sub7.resizableFrame == var5) {
					Insets var8 = Class3_Sub13_Sub7.resizableFrame.getInsets();
					var6 = var8.left;
					var7 = var8.top;
				}

				Graphics var11 = ((Container) var5).getGraphics();
				var11.setColor(Color.black);
				if (var1 > 0) {
					var11.fillRect(var6, var7, var1, Class70.anInt1047);
				}

				if (var2 > 0) {
					var11.fillRect(var6, var7, Class3_Sub9.anInt2334, var2);
				}

				if (var3 > 0) {
					var11.fillRect(-var3 + var6 + Class3_Sub9.anInt2334, var7, var3, Class70.anInt1047);
				}

				if (var4 > 0) {
					var11.fillRect(var6, -var4 + var7 + Class70.anInt1047, Class3_Sub9.anInt2334, var4);
				}
			} catch (Exception var9) {
				;
			}
		}
	}
	
	Class80(Hashtable var1) {
	   this.aClass130_1134 = var1;
   }

}