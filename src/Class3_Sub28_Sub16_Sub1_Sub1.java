import java.nio.ByteBuffer;
import javax.media.opengl.GL;

final class Class3_Sub28_Sub16_Sub1_Sub1 extends HDSprite {

   final void convert(int[] var1) {
      this.anInt4075 = Class95.method1585(this.width);
      this.anInt4079 = Class95.method1585(this.height);
      byte[] var2 = new byte[this.anInt4075 * this.anInt4079 * 4];
      int var3 = 0;
      int var4 = 0;
      int var5 = (this.anInt4075 - this.width) * 4;

      for(int var6 = 0; var6 < this.height; ++var6) {
         for(int var7 = 0; var7 < this.width; ++var7) {
            int var8 = var1[var4++];
            if(var8 != 0) {
               var2[var3++] = (byte)(var8 >> 16);
               var2[var3++] = (byte)(var8 >> 8);
               var2[var3++] = (byte)var8;
               var2[var3++] = (byte)(var8 >> 24);
            } else {
               var3 += 4;
            }
         }

         var3 += var5;
      }

      ByteBuffer var9 = ByteBuffer.wrap(var2);
      GL var10 = HDToolkit.gl;
      if(this.textureId == -1) {
         int[] var11 = new int[1];
         var10.glGenTextures(1, var11, 0);
         this.textureId = var11[0];
      }

      HDToolkit.bindTexture(this.textureId);
      var10.glTexImage2D(3553, 0, 6408, this.anInt4075, this.anInt4079, 0, 6408, 5121, var9);
      Class31.anInt584 += var9.limit() - this.anInt4074;
      this.anInt4074 = var9.limit();
   }

   Class3_Sub28_Sub16_Sub1_Sub1(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   Class3_Sub28_Sub16_Sub1_Sub1(LDSprite var1) {
      super(var1);
   }
}
