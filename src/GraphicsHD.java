import java.nio.IntBuffer;
import javax.media.opengl.GL;

final class GraphicsHD {

   static HDSprite aClass3_Sub28_Sub16_Sub1_447 = null;
   static int startY = 0;
   static int startX = 0;
   static int endX = 0;
   static int endY = 0;

   static final void method921() {
      aClass3_Sub28_Sub16_Sub1_447 = null;
   }

   static final void drawHorizontalLine(int x, int y, int height, int color) {
      HDToolkit.init2dStuff();
      float var4 = (float)x + 0.3F;
      float var5 = var4 + (float)height;
      float var6 = (float)HDToolkit.canvasHeight - ((float)y + 0.3F);
      GL var7 = HDToolkit.gl;
      var7.glBegin(1);
      var7.glColor3ub((byte)(color >> 16), (byte)(color >> 8), (byte)color);
      var7.glVertex2f(var4, var6);
      var7.glVertex2f(var5, var6);
      var7.glEnd();
   }

   public static void method923() {
      aClass3_Sub28_Sub16_Sub1_447 = null;
   }

   static final void drawVerticalLine(int var0, int var1, int var2, int var3) {
      HDToolkit.init2dStuff();
      float var4 = (float)var0 + 0.3F;
      float var5 = (float)HDToolkit.canvasHeight - ((float)var1 + 0.3F);
      float var6 = var5 - (float)var2;
      GL var7 = HDToolkit.gl;
      var7.glBegin(1);
      var7.glColor3ub((byte)(var3 >> 16), (byte)(var3 >> 8), (byte)var3);
      var7.glVertex2f(var4, var5);
      var7.glVertex2f(var4, var6);
      var7.glEnd();
   }

   static final void initDefaultBounds() {
      startX = 0;
      startY = 0;
      endX = HDToolkit.canvasWidth;
      endY = HDToolkit.canvasHeight;
      GL var0 = HDToolkit.gl;
      var0.glDisable(3089);
      method921();
   }

   static final void method926(int[] var0, int var1, int var2, int var3, int var4) {
      HDToolkit.init2dStuff();
      GL var5 = HDToolkit.gl;
      var5.glRasterPos2i(var1, HDToolkit.canvasHeight - var2);
      var5.glPixelZoom(1.0F, -1.0F);
      var5.glDisable(3042);
      var5.glDisable(3008);
      var5.glDrawPixels(var3, var4, '\u80e1', HDToolkit.isBigEndianOrder?'\u8367':5121, IntBuffer.wrap(var0));
      var5.glEnable(3008);
      var5.glEnable(3042);
      var5.glPixelZoom(1.0F, 1.0F);
   }

   static final void drawRect(int var0, int var1, int var2, int var3, int var4) {
      HDToolkit.init2dStuff();
      float var5 = (float)var0 + 0.3F;
      float var6 = var5 + (float)(var2 - 1);
      float var7 = (float)HDToolkit.canvasHeight - ((float)var1 + 0.3F);
      float var8 = var7 - (float)(var3 - 1);
      GL var9 = HDToolkit.gl;
      var9.glBegin(2);
      var9.glColor3ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4);
      var9.glVertex2f(var5, var7);
      var9.glVertex2f(var5, var8);
      var9.glVertex2f(var6, var8);
      var9.glVertex2f(var6, var7);
      var9.glEnd();
   }

   static final void drawRectAlpha(int var0, int var1, int var2, int var3, int var4, int var5) {
      HDToolkit.init2dStuff();
      float var6 = (float)var0 + 0.3F;
      float var7 = var6 + (float)(var2 - 1);
      float var8 = (float)HDToolkit.canvasHeight - ((float)var1 + 0.3F);
      float var9 = var8 - (float)(var3 - 1);
      GL var10 = HDToolkit.gl;
      var10.glBegin(2);
      var10.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, var5 > 255?-1:(byte)var5);
      var10.glVertex2f(var6, var8);
      var10.glVertex2f(var6, var9);
      var10.glVertex2f(var7, var9);
      var10.glVertex2f(var7, var8);
      var10.glEnd();
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
         int var17 = var0 + var13;
         int var18 = var0 - var14;
         int var19 = var0 + var6 - var14;
         int var20 = var0 + var6 + var13;
         int var21 = var1 + var15;
         int var22 = var1 - var16;
         int var23 = var1 + var7 - var16;
         int var24 = var1 + var7 + var15;
         HDToolkit.init2dStuff();
         GL var25 = HDToolkit.gl;
         var25.glColor3ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4);
         var25.glBegin(6);
         if(var12 <= var11) {
            var25.glVertex2f((float)var20, (float)(HDToolkit.canvasHeight - var24));
            var25.glVertex2f((float)var19, (float)(HDToolkit.canvasHeight - var23));
            var25.glVertex2f((float)var18, (float)(HDToolkit.canvasHeight - var22));
            var25.glVertex2f((float)var17, (float)(HDToolkit.canvasHeight - var21));
         } else {
            var25.glVertex2f((float)var17, (float)(HDToolkit.canvasHeight - var21));
            var25.glVertex2f((float)var18, (float)(HDToolkit.canvasHeight - var22));
            var25.glVertex2f((float)var19, (float)(HDToolkit.canvasHeight - var23));
            var25.glVertex2f((float)var20, (float)(HDToolkit.canvasHeight - var24));
         }

         var25.glEnd();
      }
   }

   static final void fillRectAlpha(int var0, int var1, int var2, int var3, int var4, int var5) {
      HDToolkit.init2dStuff();
      float var6 = (float)var0;
      float var7 = var6 + (float)var2;
      float var8 = (float)(HDToolkit.canvasHeight - var1);
      float var9 = var8 - (float)var3;
      GL var10 = HDToolkit.gl;
      var10.glBegin(6);
      var10.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, var5 > 255?-1:(byte)var5);
      var10.glVertex2f(var6, var8);
      var10.glVertex2f(var6, var9);
      var10.glVertex2f(var7, var9);
      var10.glVertex2f(var7, var8);
      var10.glEnd();
   }

   static final void setBounds(int var0, int var1, int var2, int var3) {
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

      GL var4 = HDToolkit.gl;
      var4.glEnable(3089);
      if(startX <= endX && startY <= endY) {
         var4.glScissor(startX, HDToolkit.canvasHeight - endY, endX - startX, endY - startY);
      } else {
         var4.glScissor(0, 0, 0, 0);
      }

      method921();
   }

   static final void resetPixels() {
      HDToolkit.gl.glClear(106640);
   }

   static final void drawDiagonalLine(int var0, int var1, int var2, int var3, int var4) {
      HDToolkit.init2dStuff();
      float var5 = (float)var0 + 0.3F;
      float var6 = (float)var2 + 0.3F;
      float var7 = (float)HDToolkit.canvasHeight - ((float)var1 + 0.3F);
      float var8 = (float)HDToolkit.canvasHeight - ((float)var3 + 0.3F);
      GL var9 = HDToolkit.gl;
      var9.glBegin(2);
      var9.glColor3ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4);
      var9.glVertex2f(var5, var7);
      var9.glVertex2f(var6, var8);
      var9.glEnd();
   }

   static final void fillRect(int var0, int var1, int var2, int var3, int var4) {
      HDToolkit.init2dStuff();
      float var5 = (float)var0;
      float var6 = var5 + (float)var2;
      float var7 = (float)(HDToolkit.canvasHeight - var1);
      float var8 = var7 - (float)var3;
      GL var9 = HDToolkit.gl;
      var9.glBegin(6);
      var9.glColor3ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4);
      var9.glVertex2f(var5, var7);
      var9.glVertex2f(var5, var8);
      var9.glVertex2f(var6, var8);
      var9.glVertex2f(var6, var7);
      var9.glEnd();
   }

   static final void clipRect(int var0, int var1, int var2, int var3) {
      if(var0 < 0) {
         var0 = 0;
      }

      if(var1 < 0) {
         var1 = 0;
      }

      if(var2 > HDToolkit.canvasWidth) {
         var2 = HDToolkit.canvasWidth;
      }

      if(var3 > HDToolkit.canvasHeight) {
         var3 = HDToolkit.canvasHeight;
      }

      startX = var0;
      startY = var1;
      endX = var2;
      endY = var3;
      GL var4 = HDToolkit.gl;
      var4.glEnable(3089);
      if(startX <= endX && startY <= endY) {
         var4.glScissor(startX, HDToolkit.canvasHeight - endY, endX - startX, endY - startY);
      } else {
         var4.glScissor(0, 0, 0, 0);
      }

      method921();
   }

   static final void method936(HDSprite var0) {
      if(var0.height != endY - startY) {
         throw new IllegalArgumentException();
      } else {
         aClass3_Sub28_Sub16_Sub1_447 = var0;
      }
   }

}
