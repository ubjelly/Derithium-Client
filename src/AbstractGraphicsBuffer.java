import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

abstract class AbstractGraphicsBuffer {

   static int[] anIntArray2004 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178};
   static int returnCode = -2;
   static jString aClass94_2006 = jString.createJString("null");
   int[] pixels;
   static byte[][][] aByteArrayArrayArray2008;
   Image image;
   //static int anInt2010 = -16 + (int)(33.0D * Math.random());
   int height;
   int width;
   static int anInt2015;


   abstract void drawGraphics(Graphics graphics, int x, int y);

   static final void method2180(js5 var0, js5 var1) {
         RawObjectCache.aClass153_4048 = var0;
         Class3_Sub13_Sub18.aClass153_3214 = var1;
   }

   public static void method2181(boolean var0) {
      try {
         aByteArrayArrayArray2008 = (byte[][][])null;
         anIntArray2004 = null;
         if(var0) {
            method2181(false);
         }

         aClass94_2006 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "vk.H(" + var0 + ')');
      }
   }

   final void initCanvas() {
	   GraphicsLD.init2dCanvas(this.pixels, this.width, this.height);
   }

   static final void method2183(int var0, boolean var1, int var2, int var3, int var4, jInterface[] var5) {
      try {
         int var6 = 0;
         if(var3 == 235) {
            for(; ~var6 > ~var5.length; ++var6) {
               jInterface var7 = var5[var6];
               if(null != var7 && var7.parent == var0) {
                  Class3_Sub28_Sub11.method603(var4, 13987, var2, var7, var1);
                  Class62.method1224(var7, var4, var2);
                  if(~(var7.maxScrollHorizontal - var7.anInt168) > ~var7.anInt247) {
                     var7.anInt247 = var7.maxScrollHorizontal - var7.anInt168;
                  }

                  if(var7.anInt208 > -var7.anInt193 + var7.maxScrollVertical) {
                     var7.anInt208 = var7.maxScrollVertical - var7.anInt193;
                  }

                  if(-1 < ~var7.anInt208) {
                     var7.anInt208 = 0;
                  }

                  if(var7.anInt247 < 0) {
                     var7.anInt247 = 0;
                  }

                  if(-1 == ~var7.type) {
                     js5Worker.method2104(var7, var1, var3 + -343);
                  }
               }
            }

         }
      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "vk.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null?"{...}":"null") + ')');
      }
   }

   abstract void clip(Graphics graphics, int x, int y, int w, int h);

   abstract void init(Component component, int w, int h, boolean isRasterPremultiplied);

   static final void method2186(Class25 var0) {
      for(int var1 = var0.anInt483; var1 <= var0.anInt495; ++var1) {
         for(int var2 = var0.anInt478; var2 <= var0.anInt481; ++var2) {
            GroundTile var3 = Class75_Sub2.groundTiles[var0.anInt493][var1][var2];
            if(var3 != null) {
               int var4;
               for(var4 = 0; var4 < var3.anInt2223; ++var4) {
                  if(var3.aClass25Array2221[var4] == var0) {
                     --var3.anInt2223;

                     for(int var5 = var4; var5 < var3.anInt2223; ++var5) {
                        var3.aClass25Array2221[var5] = var3.aClass25Array2221[var5 + 1];
                        var3.anIntArray2237[var5] = var3.anIntArray2237[var5 + 1];
                     }

                     var3.aClass25Array2221[var3.anInt2223] = null;
                     break;
                  }
               }

               var3.anInt2228 = 0;

               for(var4 = 0; var4 < var3.anInt2223; ++var4) {
                  var3.anInt2228 |= var3.anIntArray2237[var4];
               }
            }
         }
      }

   }

}
