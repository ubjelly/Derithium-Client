import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;

final class Class169 {

   private VertexBuffer aClass156_2105;
   boolean aBoolean2106 = true;
   private ByteBuffer aByteBuffer2107;
   private int anInt2108;
   private ByteBuffer aByteBuffer2109;
   private VertexBuffer aClass156_2110;
   private static byte[] aByteArray2111 = new byte[16384];
   private int anInt2112 = -1;


   final void method2281(int[][] var1, int var2, int var3) {
      Buffer var4 = new Buffer(1620);

      int var6;
      for(int var5 = 0; var5 <= 8; ++var5) {
         for(var6 = 0; var6 <= 8; ++var6) {
            if(HDToolkit.isBigEndianOrder) {
               var4.method801((float)var6 / 8.0F);
               var4.method801((float)var5 / 8.0F);
               var4.method801((float)(var6 * 128));
               var4.method801((float)var1[var6 + var2][var5 + var3]);
               var4.method801((float)(var5 * 128));
            } else {
               var4.method762((float)var6 / 8.0F);
               var4.method762((float)var5 / 8.0F);
               var4.method762((float)(var6 * 128));
               var4.method762((float)var1[var6 + var2][var5 + var3]);
               var4.method762((float)(var5 * 128));
            }
         }
      }

      if(HDToolkit.isBufferAnObject) {
         ByteBuffer var9 = ByteBuffer.wrap(var4.buf, 0, var4.pos);
         this.aClass156_2110 = new VertexBuffer();
         this.aClass156_2110.method2172(var9);
      } else {
         this.aByteBuffer2109 = ByteBuffer.allocateDirect(var4.pos).order(ByteOrder.nativeOrder());
         this.aByteBuffer2109.put(var4.buf, 0, var4.pos);
         this.aByteBuffer2109.flip();
      }

      Buffer var8 = new Buffer(1536);

      for(var6 = 0; var6 < 8; ++var6) {
         for(int var7 = 0; var7 < 8; ++var7) {
            if(HDToolkit.isBigEndianOrder) {
               var8.putInt(var7 + (var6 + 1) * 9);
               var8.putInt(var7 + var6 * 9);
               var8.putInt(var7 + 1 + var6 * 9);
               var8.putInt(var7 + (var6 + 1) * 9);
               var8.putInt(var7 + 1 + var6 * 9);
               var8.putInt(var7 + 1 + (var6 + 1) * 9);
            } else {
               var8.putLEInt(var7 + (var6 + 1) * 9);
               var8.putLEInt(var7 + var6 * 9);
               var8.putLEInt(var7 + 1 + var6 * 9);
               var8.putLEInt(var7 + (var6 + 1) * 9);
               var8.putLEInt(var7 + 1 + var6 * 9);
               var8.putLEInt(var7 + 1 + (var6 + 1) * 9);
            }
         }
      }

      if(HDToolkit.isBufferAnObject) {
         ByteBuffer var10 = ByteBuffer.wrap(var8.buf, 0, var8.pos);
         this.aClass156_2105 = new VertexBuffer();
         this.aClass156_2105.method2170(var10);
      } else {
         this.aByteBuffer2107 = ByteBuffer.allocateDirect(var8.pos).order(ByteOrder.nativeOrder());
         this.aByteBuffer2107.put(var8.buf, 0, var8.pos);
         this.aByteBuffer2107.flip();
      }

   }

   final boolean method2282(LDIndexedSprite var1, int var2, int var3) {
      byte[] var4 = var1.indicators;
      int var5 = var1.width;
      int var6 = var2 * 128 + 1 + (var3 * 128 + 1) * var5;
      int var7 = 0;

      int var8;
      int var9;
      for(var8 = -128; var8 < 0; ++var8) {
         var7 = (var7 << 8) - var7;

         for(var9 = -128; var9 < 0; ++var9) {
            if(var4[var6++] != 0) {
               ++var7;
            }
         }

         var6 += var5 - 128;
      }

      if(var7 == this.anInt2112) {
         return false;
      } else {
         this.anInt2112 = var7;
         var6 = var2 * 128 + 1 + (var3 * 128 + 1) * var5;
         var8 = 0;

         for(var9 = -128; var9 < 0; ++var9) {
            for(int var10 = -128; var10 < 0; ++var10) {
               if(var4[var6] != 0) {
                  aByteArray2111[var8++] = 68;
               } else {
                  int var11 = 0;
                  if(var4[var6 - 1] != 0) {
                     ++var11;
                  }

                  if(var4[var6 + 1] != 0) {
                     ++var11;
                  }

                  if(var4[var6 - var5] != 0) {
                     ++var11;
                  }

                  if(var4[var6 + var5] != 0) {
                     ++var11;
                  }

                  aByteArray2111[var8++] = (byte)(17 * var11);
               }

               ++var6;
            }

            var6 += var5 - 128;
         }

         GL var12 = HDToolkit.gl;
         ByteBuffer var13 = ByteBuffer.wrap(aByteArray2111);
         var13.limit(16384);
         HDToolkit.bindTexture(this.anInt2108);
         var12.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var13);
         return true;
      }
   }

   public static void method2283() {
      aByteArray2111 = null;
   }

   final void method2284() {
      GL var1 = HDToolkit.gl;
      HDToolkit.bindTexture(this.anInt2108);
      if(this.aClass156_2110 != null) {
         this.aClass156_2110.method2169();
         var1.glInterleavedArrays(10791, 20, 0L);
         HDToolkit.aBoolean1798 = false;
      } else {
         if(HDToolkit.isBufferAnObject) {
            var1.glBindBufferARB('\u8892', 0);
         }

         var1.glInterleavedArrays(10791, 20, this.aByteBuffer2109);
         HDToolkit.aBoolean1798 = false;
      }

      if(this.aClass156_2105 != null) {
         this.aClass156_2105.method2171();
         var1.glDrawElements(4, 384, 5125, 0L);
      } else {
         if(HDToolkit.isBufferAnObject) {
            var1.glBindBufferARB('\u8893', 0);
         }

         var1.glDrawElements(4, 384, 5125, this.aByteBuffer2107);
      }

   }

   public Class169() {
      GL var1 = HDToolkit.gl;
      int[] var2 = new int[1];
      var1.glGenTextures(1, var2, 0);
      this.anInt2108 = var2[0];
      Class31.anInt580 += 16384;
      HDToolkit.bindTexture(this.anInt2108);
      var1.glTexParameteri(3553, 10241, 9729);
      var1.glTexParameteri(3553, 10240, 9729);
      var1.glTexParameteri(3553, 10242, '\u812f');
      var1.glTexParameteri(3553, 10243, '\u812f');
   }

}
