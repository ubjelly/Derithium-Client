import java.util.zip.CRC32;

final class Class3_Sub13_Sub12 extends Class3_Sub13 {

   private static jString aClass94_3141 = jString.createJString("Loaded config");
   static jString aClass94_3142 = aClass94_3141;
   static CRC32 aCRC32_3143 = new CRC32();
   static jString aClass94_3145 = jString.createJString(")1 ");


   static final void method223(boolean var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if(~var4 == ~var7) {
            jSocket.method1460(var1, var3, (byte)-113, var6, var7, var2, var5);
         } else {
            if(!var0) {
               executeOnLaunchScript(87);
            }

            if(~(var2 - var7) <= ~Class101.anInt1425 && var7 + var2 <= Class3_Sub28_Sub18.anInt3765 && ~Class159.anInt2020 >= ~(var3 - var4) && Class57.anInt902 >= var3 + var4) {
               Class161.method2200(var6, var2, var3, var5, var7, 95, var4, var1);
            } else {
               Class3_Sub13_Sub34.method329(var7, var6, var5, var1, (byte)-54, var3, var2, var4);
            }

         }
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "fn.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }

   public Class3_Sub13_Sub12() {
      super(1, true);
   }

   static final void drawScroller(int var1, int var2, int var3, int var4, int var5) {
		SceneGraphNode.aClass109Array1831[0].method1667(var3, var4);
		SceneGraphNode.aClass109Array1831[1].method1667(var3, -16 + var5 + var4);
		int var6 = var5 * (var5 + -32) / var2;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = var1 * (-var6 + -32 + var5) / (var2 + -var5);
		if (HDToolkit.openGLEnabled) {
			GraphicsHD.fillRect(var3, 16 + var4, 16, -32 + var5, Class3_Sub23.anInt2530);
			GraphicsHD.fillRect(var3, 16 + var4 + var7, 16, var6, Class25.anInt486);
			GraphicsHD.drawVerticalLine(var3, var7 + (var4 - -16), var6, Class3_Sub13_Sub31.anInt3377);
			GraphicsHD.drawVerticalLine(var3 + 1, var7 + 16 + var4, var6, Class3_Sub13_Sub31.anInt3377);
			GraphicsHD.drawHorizontalLine(var3, var7 + 16 + var4, 16, Class3_Sub13_Sub31.anInt3377);
			GraphicsHD.drawHorizontalLine(var3, var7 + var4 + 17, 16, Class3_Sub13_Sub31.anInt3377);
			GraphicsHD.drawVerticalLine(15 + var3, var4 + (16 - -var7), var6, GroundTile.anInt2243);
			GraphicsHD.drawVerticalLine(14 + var3, 17 + (var4 - -var7), -1 + var6, GroundTile.anInt2243);
			GraphicsHD.drawHorizontalLine(var3, var6 + 15 + var4 + var7, 16, GroundTile.anInt2243);
			GraphicsHD.drawHorizontalLine(var3 + 1, var4 + 14 - -var7 + var6, 15, GroundTile.anInt2243);
		} else {
			GraphicsLD.fillRect(var3, 16 + var4, 16, -32 + var5, Class3_Sub23.anInt2530);
			GraphicsLD.fillRect(var3, var7 + (var4 - -16), 16, var6, Class25.anInt486);
			GraphicsLD.drawVerticalLine(var3, var7 + var4 + 16, var6, Class3_Sub13_Sub31.anInt3377);
			GraphicsLD.drawVerticalLine(var3 + 1, var7 + 16 + var4, var6, Class3_Sub13_Sub31.anInt3377);
			GraphicsLD.drawHorizontalLine(var3, var4 + (16 - -var7), 16, Class3_Sub13_Sub31.anInt3377);
			GraphicsLD.drawHorizontalLine(var3, 17 + var4 + var7, 16, Class3_Sub13_Sub31.anInt3377);
			GraphicsLD.drawVerticalLine(var3 - -15, var7 + 16 + var4, var6, GroundTile.anInt2243);
			GraphicsLD.drawVerticalLine(14 + var3, var4 - -17 - -var7, -1 + var6, GroundTile.anInt2243);
			GraphicsLD.drawHorizontalLine(var3, var6 + 15 + var4 + var7, 16, GroundTile.anInt2243);
			GraphicsLD.drawHorizontalLine(1 + var3, var6 + var4 - (-14 + -var7), 15, GroundTile.anInt2243);
		}

   }

   static final void method225(int var0, jInterface var1) {
      try {
         jInterface var2 = UnderlayType.method2273(var1);
         if(var0 != 14) {
            method227(true);
         }

         int var3;
         int var4;
         if(null == var2) {
            var4 = ItemPile.canvasHei;
            var3 = Class23.canvasWid;
         } else {
            var4 = var2.anInt193;
            var3 = var2.anInt168;
         }

         Class3_Sub28_Sub11.method603(var4, 13987, var3, var1, false);
         Class62.method1224(var1, var4, var3);
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "fn.Q(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

   static final void executeOnLaunchScript(int var0) {
	   if(var0 != -1) {

		   if(Canvas_Sub2.loadInterface(var0)) {
			   jInterface[] var2 = SceneGraphNode.interfaceCache[var0];

			   for(int var3 = 0; var3 < var2.length; ++var3) {
				   jInterface var4 = var2[var3];
				   if(null != var4.onLaunchListener) {
					   InterfaceListener var5 = new InterfaceListener();
					   var5.objectData = var4.onLaunchListener;
					   var5.aClass11_2449 = var4;
					   ClientScript.method1104(2000000, var5);
				   }
			   }
			   
		   }
	   }
   }

   public static void method227(boolean var0) {
      try {
         aClass94_3142 = null;
         aClass94_3145 = null;
         aCRC32_3143 = null;
         if(!var0) {
            aClass94_3142 = (jString)null;
         }

         aClass94_3141 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "fn.O(" + var0 + ')');
      }
   }

   final int[] method154(int var1, byte var2) {
      try {
         int var3 = -42 / ((30 - var2) / 36);
         int[] var10 = this.aClass114_2382.method1709(-16409, var1);
         if(this.aClass114_2382.aBoolean1580) {
            int[][] var4 = this.method162(var1, 0, (byte)-126);
            int[] var5 = var4[0];
            int[] var7 = var4[2];
            int[] var6 = var4[1];

            for(int var8 = 0; ~var8 > ~Class113.anInt1559; ++var8) {
               var10[var8] = (var7[var8] + var5[var8] + var6[var8]) / 3;
            }
         }

         return var10;
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "fn.D(" + var1 + ',' + var2 + ')');
      }
   }

	static final int method228(js5 var0, js5 var1) {
		int var3 = 0;
		if (var0.method2144(HintIcon.anInt1352)) {
			++var3;
		}

		if (var0.method2144(Class75_Sub2.anInt2643)) {
			++var3;
		}

		if (var0.method2144(Class3_Sub13_Sub11.anInt3132)) {
			++var3;
		}

		if (var1.method2144(HintIcon.anInt1352)) {
			++var3;
		}

		if (var1.method2144(Class75_Sub2.anInt2643)) {
			++var3;
		}

		if (var1.method2144(Class3_Sub13_Sub11.anInt3132)) {
			++var3;
		}

		return var3;
	}

}
