import java.nio.ByteBuffer;
import javax.media.opengl.GL;

final class Class160 implements Interface5 {

   private int anInt2187 = -1;
   private boolean aBoolean2188 = false;
   private int[] textures = null;


   private final void method2198() {
      GL gl = HDToolkit.gl;
      this.anInt2187 = gl.glGenLists(2);
      gl.glNewList(this.anInt2187, 4864);
      if(this.textures != null) {
         gl.glActiveTexture(33985);
         gl.glTexGeni(8192, 9472, 34065);
         gl.glTexGeni(8193, 9472, 34065);
         gl.glTexGeni(8194, 9472, 34065);
         gl.glEnable(3168);
         gl.glEnable(3169);
         gl.glEnable(3170);
         gl.glEnable(34067);
         gl.glMatrixMode(5890);
         gl.glLoadIdentity();
         gl.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
         gl.glMatrixMode(5888);
         if(!this.aBoolean2188) {
     		gl.glTexEnvi(8960, 34161, 7681);
    		gl.glTexEnvi(8960, 34176, 34168);
    		gl.glTexEnvi(8960, 34162, 8448);
    		gl.glActiveTexture(33986);
    		gl.glTexEnvi(8960, 8704, 34160);
    		gl.glTexEnvi(8960, 34161, 260);
    		gl.glTexEnvi(8960, 34176, 34168);
    		gl.glTexEnvi(8960, 34177, 34168);
    		gl.glTexEnvi(8960, 34193, 770);
    		gl.glTexEnvi(8960, 34162, 7681);
    		gl.glTexEnvi(8960, 34184, 34167);
            gl.glBindTexture(3553, HDToolkit.anInt1810);
            gl.glEnable(3553);
         } else {
     		gl.glTexEnvi(8960, 34161, 260);
    		gl.glTexEnvi(8960, 34192, 770);
    		gl.glTexEnvi(8960, 34162, 7681);
    		gl.glTexEnvi(8960, 34184, 34167);
         }

         gl.glActiveTexture(33984);
      } else {
  	    gl.glTexEnvi(8960, 34184, 34167);
      }

      gl.glEndList();
      gl.glNewList(this.anInt2187 + 1, 4864);
      if(this.textures != null) {
  	    gl.glActiveTexture(33985);
         gl.glDisable(3168);
         gl.glDisable(3169);
         gl.glDisable(3170);
         gl.glDisable(34067);
         gl.glMatrixMode(5890);
         gl.glLoadIdentity();
         gl.glMatrixMode(5888);
         if(!this.aBoolean2188) {
        	 gl.glTexEnvi(8960, 34161, 8448);
     		gl.glTexEnvi(8960, 34176, 5890);
     		gl.glActiveTexture(33986);
     		gl.glTexEnvi(8960, 8704, 8448);
     		gl.glTexEnvi(8960, 34161, 8448);
     		gl.glTexEnvi(8960, 34176, 5890);
     		gl.glTexEnvi(8960, 34193, 768);
     		gl.glTexEnvi(8960, 34162, 8448);
     		gl.glTexEnvi(8960, 34184, 5890);
     		gl.glDisable(3553);
         } else {
        		gl.glTexEnvi(8960, 34161, 8448);
        		gl.glTexEnvi(8960, 34192, 768);
        		gl.glTexEnvi(8960, 34162, 8448);
        		gl.glTexEnvi(8960, 34184, 5890);
         }

 	    gl.glActiveTexture(33984);
      } else {
  	    gl.glTexEnvi(8960, 34184, 5890);
      }

      gl.glEndList();
   }

   public final void method21() {
      GL var1 = HDToolkit.gl;
      if(DisplayModeInformation.aBoolean1441) {
         var1.glCallList(this.anInt2187 + 1);
      } else {
         var1.glTexEnvi(8960, 34184, 5890);
      }

   }

   public final int method24() {
      return 4;
   }

   public final void method22() {
      GL var1 = HDToolkit.gl;
      HDToolkit.method1847(1);
      if(DisplayModeInformation.aBoolean1441) {
         var1.glCallList(this.anInt2187);
      } else {
  	    var1.glTexEnvi(8960, 34184, 34167);
      }

   }

   public final void method23(int var1) {
      GL var2 = HDToolkit.gl;
      if(DisplayModeInformation.aBoolean1441 && this.textures != null) {
         var2.glActiveTexture(33985);
         var2.glBindTexture(34067, this.textures[var1 - 1]);
         var2.glActiveTexture(33984);
      }

   }

   private final void method2199() {
      GL var8 = HDToolkit.gl;
      if(this.textures == null) {
         this.textures = new int[3];
         var8.glGenTextures(3, this.textures, 0);
      }

      short var9 = 4096;
      byte[] var10 = new byte[var9];
      byte[] var11 = new byte[var9];
      byte[] var12 = new byte[var9];

      for(int var13 = 0; var13 < 6; ++var13) {
         int var14 = 0;

         for(int var15 = 0; var15 < 64; ++var15) {
            for(int var16 = 0; var16 < 64; ++var16) {
               float var5 = 2.0F * (float)var16 / 64.0F - 1.0F;
               float var6 = 2.0F * (float)var15 / 64.0F - 1.0F;
               float var7 = (float)(1.0D / Math.sqrt((double)(var5 * var5 + 1.0F + var6 * var6)));
               var5 *= var7;
               var6 *= var7;
               float var4;
               if(var13 == 0) {
                  var4 = -var5;
               } else if(var13 == 1) {
                  var4 = var5;
               } else if(var13 == 2) {
                  var4 = var6;
               } else if(var13 == 3) {
                  var4 = -var6;
               } else if(var13 == 4) {
                  var4 = var7;
               } else {
                  var4 = -var7;
               }

               int var1;
               int var2;
               int var3;
               if(var4 > 0.0F) {
                  var1 = (int)(Math.pow((double)var4, 96.0D) * 255.0D);
                  var2 = (int)(Math.pow((double)var4, 36.0D) * 255.0D);
                  var3 = (int)(Math.pow((double)var4, 12.0D) * 255.0D);
               } else {
                  var3 = 0;
                  var2 = 0;
                  var1 = 0;
               }

               if(HDToolkit.maxTextureUnits < 3) {
                  var1 /= 5;
                  var2 /= 5;
                  var3 /= 5;
               } else {
                  var1 /= 2;
                  var2 /= 2;
                  var3 /= 2;
               }

               var11[var14] = (byte)var1;
               var12[var14] = (byte)var2;
               var10[var14] = (byte)var3;
               ++var14;
            }
         }

         var8.glBindTexture(34067, this.textures[0]);
         var8.glTexImage2D(34069 + var13, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(var11));
         var8.glBindTexture(34067, this.textures[1]);
         var8.glTexImage2D(34069 + var13, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(var12));
         var8.glBindTexture(34067, this.textures[2]);
         var8.glTexImage2D(34069 + var13, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(var10));
         Class31.anInt580 += var9 * 3;
      }

   }

   public Class160() {
      if(HDToolkit.aBoolean1821 && HDToolkit.maxTextureUnits >= 2) {
         this.method2199();
         GL gl = HDToolkit.gl;
         gl.glBindTexture(34067, this.textures[0]);
 	    gl.glTexParameteri(34067, 10241, 9729);
 	    gl.glTexParameteri(34067, 10240, 9729);
 	    gl.glTexParameteri(34067, 32882, 33071);
 	    gl.glTexParameteri(34067, 10242, 33071);
 	    gl.glTexParameteri(34067, 10243, 33071);
         gl.glBindTexture(34067, this.textures[1]);
 	    gl.glTexParameteri(34067, 10241, 9729);
 	    gl.glTexParameteri(34067, 10240, 9729);
 	    gl.glTexParameteri(34067, 32882, 33071);
 	    gl.glTexParameteri(34067, 10242, 33071);
 	    gl.glTexParameteri(34067, 10243, 33071);
         gl.glBindTexture(34067, this.textures[2]);
 	    gl.glTexParameteri(34067, 10241, 9729);
 	    gl.glTexParameteri(34067, 10240, 9729);
 	    gl.glTexParameteri(34067, 32882, 33071);
 	    gl.glTexParameteri(34067, 10242, 33071);
 	    gl.glTexParameteri(34067, 10243, 33071);
         this.aBoolean2188 = HDToolkit.maxTextureUnits < 3;
      }

      this.method2198();
   }
}
