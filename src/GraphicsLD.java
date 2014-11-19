
final class GraphicsLD {

   static int width;
   static int startX = 0;
   static int height;
   static int startY = 0;
   static int endX = 0;
   static int[] anIntArray1097;
   static int[] anIntArray1098;
   static int endY = 0;
   static int[] pixels;


   static final void method1310() {
      anIntArray1097 = null;
      anIntArray1098 = null;
   }

   static final void drawRect(int x, int y, int var2, int var3, int var4) {
      drawHorizontalLine(x, y, var2, var4);
      drawHorizontalLine(x, y + var3 - 1, var2, var4);
      drawVerticalLine(x, y, var3, var4);
      drawVerticalLine(x + var2 - 1, y, var3, var4);
   }

   static final void fillRectAlpha(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(var0 < startX) {
         var2 -= startX - var0;
         var0 = startX;
      }

      if(var1 < startY) {
         var3 -= startY - var1;
         var1 = startY;
      }

      if(var0 + var2 > endX) {
         var2 = endX - var0;
      }

      if(var1 + var3 > endY) {
         var3 = endY - var1;
      }

      var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & '\uff00') * var5 >> 8 & '\uff00');
      int var6 = 256 - var5;
      int var7 = width - var2;
      int var8 = var0 + var1 * width;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = pixels[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & '\uff00') * var6 >> 8 & '\uff00');
            pixels[var8++] = var4 + var11;
         }

         var8 += var7;
      }

   }

   private static final void method1313(int var0, int var1, int var2) {
      if(var0 >= startX && var1 >= startY && var0 < endX && var1 < endY) {
         pixels[var0 + var1 * width] = var2;
      }
   }

   static final void method1314(int[] var0, int[] var1) {
      if(var0.length == endY - startY && var1.length == endY - startY) {
         anIntArray1097 = var0;
         anIntArray1098 = var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   static final void drawRectAlpha(int var0, int var1, int var2, int var3, int var4, int var5) {
      method1321(var0, var1, var2, var4, var5);
      method1321(var0, var1 + var3 - 1, var2, var4, var5);
      if(var3 >= 3) {
         method1327(var0, var1 + 1, var3 - 2, var4, var5);
         method1327(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   static final void method1316(int[] var0) {
      startX = var0[0];
      startY = var0[1];
      endX = var0[2];
      endY = var0[3];
      method1310();
   }

   static final void drawHorizontalLine(int x, int y, int height, int color) {
      if(y >= startY && y < endY) {
         if(x < startX) {
            height -= startX - x;
            x = startX;
         }

         if(x + height > endX) {
            height = endX - x;
         }

         int step = x + y * width;

         for(int id = 0; id < height; ++id) {
            pixels[step + id] = color;
         }

      }
   }

   static final void drawVerticalLine(int x, int y, int height, int color) {
      if(x >= startX && x < endX) {
         if(y < startY) {
            height -= startY - y;
            y = startY;
         }

         if(y + height > endY) {
            height = endY - y;
         }

         int step = x + y * width;

         for(int id = 0; id < height; ++id) {
            pixels[step + id * width] = color;
         }

      }
   }

   static final void init2dCanvas(int[] var0, int var1, int var2) {
      pixels = var0;
      width = var1;
      height = var2;
      clipRect(0, 0, var1, var2);
   }

   static final void resetPixels() {
      int var0 = 0;

      int var1;
      for(var1 = width * height - 7; var0 < var1; pixels[var0++] = 0) {
         pixels[var0++] = 0;
         pixels[var0++] = 0;
         pixels[var0++] = 0;
         pixels[var0++] = 0;
         pixels[var0++] = 0;
         pixels[var0++] = 0;
         pixels[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; pixels[var0++] = 0) {
         ;
      }

   }

   private static final void method1321(int var0, int var1, int var2, int var3, int var4) {
      if(var1 >= startY && var1 < endY) {
         if(var0 < startX) {
            var2 -= startX - var0;
            var0 = startX;
         }

         if(var0 + var2 > endX) {
            var2 = endX - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * width;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (pixels[var12] >> 16 & 255) * var5;
            int var10 = (pixels[var12] >> 8 & 255) * var5;
            int var11 = (pixels[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            pixels[var12++] = var14;
         }

      }
   }

   static final void drawDiagonalLine(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 - var0;
      int var7 = var3 - var1;
      int var8 = var6 >= 0?var6:-var6;
      int var9 = var7 >= 0?var7:-var7;
      int var10 = var8;
      if(var8 < var9) {
         var10 = var9;
      }

      if(var10 != 0) {
         int var11 = (var6 << 16) / var10;
         int var12 = (var7 << 16) / var10;
         if(var12 <= var11) {
            var11 = -var11;
         } else {
            var12 = -var12;
         }

         int var13 = var5 * var12 >> 17;
         int var14 = var5 * var12 + 1 >> 17;
         int var15 = var5 * var11 >> 17;
         int var16 = var5 * var11 + 1 >> 17;
         var0 -= Rasterizer.method1139();
         var1 -= Rasterizer.method1153();
         int var17 = var0 + var13;
         int var18 = var0 - var14;
         int var19 = var0 + var6 - var14;
         int var20 = var0 + var6 + var13;
         int var21 = var1 + var15;
         int var22 = var1 - var16;
         int var23 = var1 + var7 - var16;
         int var24 = var1 + var7 + var15;
         Rasterizer.method1148(var17, var18, var19);
         Rasterizer.method1144(var21, var22, var23, var17, var18, var19, var4);
         Rasterizer.method1148(var17, var19, var20);
         Rasterizer.method1144(var21, var23, var24, var17, var19, var20, var4);
      }
   }

   static final void fillRect(int x, int y, int lengthX, int lengthY, int color) {
      if(x < startX) {
         lengthX -= startX - x;
         x = startX;
      }
      if(y < startY) {
         lengthY -= startY - y;
         y = startY;
      }
      if(x + lengthX > endX) {
         lengthX = endX - x;
      }
      if(y + lengthY > endY) {
         lengthY = endY - y;
      }
      int var5 = width - lengthX;
      int index = x + y * width;
      for(int var7 = -lengthY; var7 < 0; ++var7) {
         for(int var8 = -lengthX; var8 < 0; ++var8) {
            pixels[index++] = color;
         }
         index += var5;
      }
   }
   
   //public static void drawPixels(int lengthY, int y, int x, int color, int lengthX) {
   
   static final void testDrawPixels(int lengthY, int y, int x, int color, int lengthX) {
	   if (x < startX) {
   	    lengthX -= startX - x;
   	    x = startX;
   	}
   	if (y < startY) {
   	    lengthY -= startY - y;
   	    y = startY;
   	}
   	if (x + lengthX > endX)
   	    lengthX = endX - x;
   	if (y + lengthY > endY)
   	    lengthY = endY - y;
   	int xStep = width - lengthX;
   	int index = x + y * width;
   	for (int i_57_ = -lengthY; i_57_ < 0; i_57_++) {
   	    for (int i_58_ = -lengthX; i_58_ < 0; i_58_++)
   		pixels[index++] = color;
   	    index += xStep;
   	}
   }

   static final void clipRect(int var0, int var1, int var2, int var3) {
      if(var0 < 0) {
         var0 = 0;
      }

      if(var1 < 0) {
         var1 = 0;
      }

      if(var2 > width) {
         var2 = width;
      }

      if(var3 > height) {
         var3 = height;
      }

      startX = var0;
      startY = var1;
      endX = var2;
      endY = var3;
      method1310();
   }

   static final void method1325(int[] var0) {
      var0[0] = startX;
      var0[1] = startY;
      var0[2] = endX;
      var0[3] = endY;
   }

   static final void method1326(int var0, int var1, int var2, int var3) {
      if(startX < var0) {
         startX = var0;
      }

      if(startY < var1) {
         startY = var1;
      }

      if(endX > var2) {
         endX = var2;
      }

      if(endY > var3) {
         endY = var3;
      }

      method1310();
   }

   private static final void method1327(int var0, int var1, int var2, int var3, int var4) {
      if(var0 >= startX && var0 < endX) {
         if(var1 < startY) {
            var2 -= startY - var1;
            var1 = startY;
         }

         if(var1 + var2 > endY) {
            var2 = endY - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * width;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (pixels[var12] >> 16 & 255) * var5;
            int var10 = (pixels[var12] >> 8 & 255) * var5;
            int var11 = (pixels[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            pixels[var12] = var14;
            var12 += width;
         }

      }
   }

   static final void drawDiagonalLine(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if(var3 == 0) {
         if(var2 >= 0) {
            drawHorizontalLine(var0, var1, var2 + 1, var4);
         } else {
            drawHorizontalLine(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if(var2 == 0) {
         if(var3 >= 0) {
            drawVerticalLine(var0, var1, var3 + 1, var4);
         } else {
            drawVerticalLine(var0, var1 + var3, -var3 + 1, var4);
         }

      } else {
         if(var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if(var2 > var3) {
            var1 <<= 16;
            var1 += '\u8000';
            var3 <<= 16;
            var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5D);
            var2 += var0;
            if(var0 < startX) {
               var1 += var5 * (startX - var0);
               var0 = startX;
            }

            if(var2 >= endX) {
               var2 = endX - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if(var6 >= startY && var6 < endY) {
                  pixels[var0 + var6 * width] = var4;
               }

               var1 += var5;
               ++var0;
            }
         } else {
            var0 <<= 16;
            var0 += '\u8000';
            var2 <<= 16;
            var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5D);
            var3 += var1;
            if(var1 < startY) {
               var0 += var5 * (startY - var1);
               var1 = startY;
            }

            if(var3 >= endY) {
               var3 = endY - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if(var6 >= startX && var6 < endX) {
                  pixels[var6 + var1 * width] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   private static final void method1329(int var0, int var1, int var2, int var3) {
      if(var2 == 0) {
         method1313(var0, var1, var3);
      } else {
         if(var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if(var4 < startY) {
            var4 = startY;
         }

         int var5 = var1 + var2 + 1;
         if(var5 > endY) {
            var5 = endY;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if(var1 > var5) {
            var1 = var5;
         }

         int var12;
         int var13;
         int var14;
         int var15;
         while(var6 < var1) {
            while(var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            var12 = var0 - var8 + 1;
            if(var12 < startX) {
               var12 = startX;
            }

            var13 = var0 + var8;
            if(var13 > endX) {
               var13 = endX;
            }

            var14 = var12 + var6 * width;

            for(var15 = var12; var15 < var13; ++var15) {
               pixels[var14++] = var3;
            }

            ++var6;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for(var11 -= var9; var6 < var5; var10 += var9++ + var9) {
            while(var11 > var7 && var10 > var7) {
               var11 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            var12 = var0 - var8;
            if(var12 < startX) {
               var12 = startX;
            }

            var13 = var0 + var8;
            if(var13 > endX - 1) {
               var13 = endX - 1;
            }

            var14 = var12 + var6 * width;

            for(var15 = var12; var15 <= var13; ++var15) {
               pixels[var14++] = var3;
            }

            ++var6;
            var11 += var9 + var9;
         }

      }
   }

   static final void method1330(int var0, int var1, int var2, int var3, int var4) {
      if(var4 != 0) {
         if(var4 == 256) {
            method1329(var0, var1, var2, var3);
         } else {
            if(var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = (var3 & 255) * var4;
            int var12 = var1 - var2;
            if(var12 < startY) {
               var12 = startY;
            }

            int var13 = var1 + var2 + 1;
            if(var13 > endY) {
               var13 = endY;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if(var1 > var13) {
               var1 = var13;
            }

            int var9;
            int var10;
            int var11;
            int var21;
            int var20;
            int var23;
            int var22;
            int var24;
            while(var14 < var1) {
               while(var19 <= var15 || var18 <= var15) {
                  var18 += var16 + var16;
                  var19 += var16++ + var16;
               }

               var20 = var0 - var16 + 1;
               if(var20 < startX) {
                  var20 = startX;
               }

               var21 = var0 + var16;
               if(var21 > endX) {
                  var21 = endX;
               }

               var22 = var20 + var14 * width;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = (pixels[var22] >> 16 & 255) * var5;
                  var10 = (pixels[var22] >> 8 & 255) * var5;
                  var11 = (pixels[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  pixels[var22++] = var24;
               }

               ++var14;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var17 * var17 + var15;
            var18 = var19 - var2;

            for(var19 -= var17; var14 < var13; var18 += var17++ + var17) {
               while(var19 > var15 && var18 > var15) {
                  var19 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               var20 = var0 - var16;
               if(var20 < startX) {
                  var20 = startX;
               }

               var21 = var0 + var16;
               if(var21 > endX - 1) {
                  var21 = endX - 1;
               }

               var22 = var20 + var14 * width;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = (pixels[var22] >> 16 & 255) * var5;
                  var10 = (pixels[var22] >> 8 & 255) * var5;
                  var11 = (pixels[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  pixels[var22++] = var24;
               }

               ++var14;
               var19 += var17 + var17;
            }

         }
      }
   }

   static final void initDefaultBounds() {
      startX = 0;
      startY = 0;
      endX = width;
      endY = height;
      method1310();
   }

   static final void method1332(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * width;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            pixels[var6++] = var2;
         }

         var5 += width;
      }

   }

   public static void method1333() {
      pixels = null;
      anIntArray1097 = null;
      anIntArray1098 = null;
   }

}
