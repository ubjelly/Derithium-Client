import java.nio.ByteBuffer;
import javax.media.opengl.GL;

final class Class37 {

   private VertexBuffer aClass156_642;
   private int[] anIntArray643;
   private byte[] aByteArray644;
   private int[] anIntArray645;
   private VertexBuffer aClass156_646;
   private ByteBuffer pointersBuffer;
   private int[] anIntArray648;
   private int[] anIntArray649;
   private byte[] aByteArray650;
   int anInt651;
   private ByteBuffer aByteBuffer652;
   int anInt653;
   private byte[] aByteArray654;
   int anInt655;
   private Hashtable aClass130_656;
   int anInt657;


   final int method1018(Light var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      long var8 = 0L;
      if((var2 & 127) == 0 || (var4 & 127) == 0) {
         var8 = (long)(var2 + (var4 << 16));
         IntegerNode var10 = (IntegerNode)this.aClass130_656.get(var8);
         if(var10 != null) {
            return var10.value;
         }
      }

      int var23 = var1.anInt713;
      float var11 = (float)(var1.anInt703 - var2);
      float var12 = (float)(var1.anInt697 - var3);
      float var13 = (float)(var1.anInt708 - var4);
      float var14 = (float)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
      float var15 = 1.0F / var14;
      var11 *= var15;
      var12 *= var15;
      var13 *= var15;
      float var16 = var14 / (float)((var1.anInt698 << 7) + 64);
      float var17 = 1.0F - var16 * var16;
      if(var17 < 0.0F) {
         var17 = 0.0F;
      }

      float var18 = var11 * var5 + var12 * var6 + var13 * var7;
      if(var18 < 0.0F) {
         var18 = 0.0F;
      }

      float var19 = var18 * var17 * 2.0F;
      if(var19 > 1.0F) {
         var19 = 1.0F;
      }

      int var20 = (int)(var19 * (float)(var23 >> 16 & 255));
      if(var20 > 255) {
         var20 = 255;
      }

      int var21 = (int)(var19 * (float)(var23 >> 8 & 255));
      if(var21 > 255) {
         var21 = 255;
      }

      int var22 = (int)(var19 * (float)(var23 & 255));
      if(var22 > 255) {
         var22 = 255;
      }

      this.aByteArray654[this.anInt653] = (byte)var20;
      this.aByteArray644[this.anInt653] = (byte)var21;
      this.aByteArray650[this.anInt653] = (byte)var22;
      this.anIntArray645[this.anInt653] = var2;
      this.anIntArray649[this.anInt653] = var3;
      this.anIntArray648[this.anInt653] = var4;
      this.aClass130_656.put(new IntegerNode(this.anInt653), var8);
      return this.anInt653++;
   }

   final void method1019() {
      Buffer var1 = new Buffer(this.anInt655 * 4);
      Buffer var2 = new Buffer(this.anInt653 * 16);
      int var3;
      if(HDToolkit.isBigEndianOrder) {
         for(var3 = 0; var3 < this.anInt653; ++var3) {
            var2.putByte(this.aByteArray654[var3]);
            var2.putByte(this.aByteArray644[var3]);
            var2.putByte(this.aByteArray650[var3]);
            var2.putByte(255);
            var2.method801((float)this.anIntArray645[var3]);
            var2.method801((float)this.anIntArray649[var3]);
            var2.method801((float)this.anIntArray648[var3]);
         }

         for(var3 = 0; var3 < this.anInt655; ++var3) {
            var1.putInt(this.anIntArray643[var3]);
         }
      } else {
         for(var3 = 0; var3 < this.anInt653; ++var3) {
            var2.putByte(this.aByteArray654[var3]);
            var2.putByte(this.aByteArray644[var3]);
            var2.putByte(this.aByteArray650[var3]);
            var2.putByte(255);
            var2.method762((float)this.anIntArray645[var3]);
            var2.method762((float)this.anIntArray649[var3]);
            var2.method762((float)this.anIntArray648[var3]);
         }

         for(var3 = 0; var3 < this.anInt655; ++var3) {
            var1.putLEInt(this.anIntArray643[var3]);
         }
      }

      if(HDToolkit.isBufferAnObject) {
         this.aClass156_642 = new VertexBuffer();
         ByteBuffer var4 = ByteBuffer.wrap(var2.buf);
         this.aClass156_642.method2172(var4);
         this.aClass156_646 = new VertexBuffer();
         var4 = ByteBuffer.wrap(var1.buf);
         this.aClass156_646.method2170(var4);
      } else {
         this.pointersBuffer = ByteBuffer.allocateDirect(var2.pos);
         this.pointersBuffer.put(var2.buf);
         this.pointersBuffer.flip();
         this.aByteBuffer652 = ByteBuffer.allocateDirect(var1.pos);
         this.aByteBuffer652.put(var1.buf);
         this.aByteBuffer652.flip();
      }

      this.anIntArray645 = null;
      this.anIntArray649 = null;
      this.anIntArray648 = null;
      this.aByteArray654 = null;
      this.aByteArray644 = null;
      this.aByteArray650 = null;
      this.anIntArray643 = null;
      this.aClass130_656 = null;
   }

   final void method1020() {
      this.anIntArray643 = new int[this.anInt651];
      this.anIntArray645 = new int[this.anInt657];
      this.anIntArray649 = new int[this.anInt657];
      this.anIntArray648 = new int[this.anInt657];
      this.aByteArray654 = new byte[this.anInt657];
      this.aByteArray644 = new byte[this.anInt657];
      this.aByteArray650 = new byte[this.anInt657];
      this.aClass130_656 = new Hashtable(Class95.method1585(this.anInt657));
   }

   final void method1021() {
      GL var1 = HDToolkit.gl;
      if(HDToolkit.isBufferAnObject) {
         this.aClass156_642.method2169();
         var1.glInterleavedArrays(10787, 16, 0L);
         HDToolkit.aBoolean1798 = false;
         this.aClass156_646.method2171();
         var1.glDrawElements(4, this.anInt655, 5125, 0L);
      } else {
         if(HDToolkit.isBufferAnObject) {
            var1.glBindBufferARB('\u8892', 0);
            var1.glBindBufferARB('\u8893', 0);
         }

         var1.glInterleavedArrays(10787, 16, this.pointersBuffer);
         HDToolkit.aBoolean1798 = false;
         var1.glDrawElements(4, this.anInt655, 5125, this.aByteBuffer652);
      }

   }

   final void method1022(int[] var1) {
      for(int var2 = 1; var2 < var1.length - 1; ++var2) {
         this.anIntArray643[this.anInt655++] = var1[0];
         this.anIntArray643[this.anInt655++] = var1[var2];
         this.anIntArray643[this.anInt655++] = var1[var2 + 1];
      }

   }

}
