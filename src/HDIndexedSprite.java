import java.nio.ByteBuffer;
import javax.media.opengl.GL;

final class HDIndexedSprite extends AbstractIndexedSprite {

   private int anInt2675 = -1;
   private int anInt2676 = -1;
   private int anInt2677 = 0;
   private int anInt2678 = 0;
   private int anInt2679;
   private int convertedHeight;
   private int convertedWidth;

   private final void convert(byte[] var1, int[] pallete) {
      this.convertedWidth = Class95.method1585(this.width);
      this.convertedHeight = Class95.method1585(this.height);
      byte[] pixels = new byte[this.convertedWidth * this.convertedHeight * 4];
      int step = 0;
      int var5 = 0;

      for(int var6 = 0; var6 < this.height; ++var6) {
         for(int var7 = 0; var7 < this.width; ++var7) {
            byte var8 = var1[var5++];
            if(var8 != 0) {
               int color = pallete[var8];
               pixels[step++] = (byte)(color >> 16);
               pixels[step++] = (byte)(color >> 8);
               pixels[step++] = (byte)color;
               pixels[step++] = -1;
            } else {
               step += 4;
            }
         }

         step += (this.convertedWidth - this.width) * 4;
      }

      ByteBuffer pixelsBuffer = ByteBuffer.wrap(pixels);
      GL var11 = HDToolkit.gl;
      if(this.anInt2675 == -1) {
         int[] var12 = new int[1];
         var11.glGenTextures(1, var12, 0);
         this.anInt2675 = var12[0];
         this.anInt2679 = Class31.anInt582;
      }

      HDToolkit.bindTexture(this.anInt2675);
      var11.glTexImage2D(3553, 0, 6408, this.convertedWidth, this.convertedHeight, 0, 6408, 5121, pixelsBuffer);
      Class31.anInt584 += pixelsBuffer.limit() - this.anInt2678;
      this.anInt2678 = pixelsBuffer.limit();
   }

   final void method1666(int var1, int var2, int var3) {
      HDToolkit.initSpriteStuff2();
      var1 += this.offsetX;
      var2 += this.offsetY;
      GL var4 = HDToolkit.gl;
      HDToolkit.bindTexture(this.anInt2675);
      this.method1679(1);
      var4.glColor4f(1.0F, 1.0F, 1.0F, (float)var3 / 256.0F);
      var4.glTranslatef((float)var1, (float)(HDToolkit.canvasHeight - var2), 0.0F);
      var4.glCallList(this.anInt2676);
      var4.glLoadIdentity();
   }

   private final void method1679(int var1) {
      if(this.anInt2677 != var1) {
         this.anInt2677 = var1;
         GL var2 = HDToolkit.gl;
         if(var1 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
         } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
         }

      }
   }

   final void method1667(int var1, int var2) {
      HDToolkit.initSpriteStuff();
      var1 += this.offsetX;
      var2 += this.offsetY;
      GL var3 = HDToolkit.gl;
      HDToolkit.bindTexture(this.anInt2675);
      this.method1679(1);
      var3.glTranslatef((float)var1, (float)(HDToolkit.canvasHeight - var2), 0.0F);
      var3.glCallList(this.anInt2676);
      var3.glLoadIdentity();
   }

   protected final void finalize() throws Throwable {
      if(this.anInt2675 != -1) {
         Class31.method991(this.anInt2675, this.anInt2678, this.anInt2679);
         this.anInt2675 = -1;
         this.anInt2678 = 0;
      }

      if(this.anInt2676 != -1) {
         Class31.method986(this.anInt2676, this.anInt2679);
         this.anInt2676 = -1;
      }

      super.finalize();
   }

   private final void method1680() {
      float var1 = (float)this.width / (float)this.convertedWidth;
      float var2 = (float)this.height / (float)this.convertedHeight;
      GL var3 = HDToolkit.gl;
      if(this.anInt2676 == -1) {
         this.anInt2676 = var3.glGenLists(1);
         this.anInt2679 = Class31.anInt582;
      }

      var3.glNewList(this.anInt2676, 4864);
      var3.glBegin(6);
      var3.glTexCoord2f(var1, 0.0F);
      var3.glVertex2f((float)this.width, 0.0F);
      var3.glTexCoord2f(0.0F, 0.0F);
      var3.glVertex2f(0.0F, 0.0F);
      var3.glTexCoord2f(0.0F, var2);
      var3.glVertex2f(0.0F, (float)(-this.height));
      var3.glTexCoord2f(var1, var2);
      var3.glVertex2f((float)this.width, (float)(-this.height));
      var3.glEnd();
      var3.glEndList();
   }

   HDIndexedSprite(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int[] var8) {
	   this.trimWidth = var1;
	   this.trimHeight = var2;
	   this.offsetX = var3;
	   this.offsetY = var4;
	   this.width = var5;
	   this.height = var6;
	   this.convert(var7, var8);
	   this.method1680();
   }
}