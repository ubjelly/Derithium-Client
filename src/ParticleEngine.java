import java.nio.FloatBuffer;
import javax.media.opengl.GL;

final class ParticleEngine extends Class127 {//class87_sub1 particleengine in 554

   private static int particleAmount;


   ParticleEngine() {
      new Class17();
      new Deque();
   }

   static final void method1755() {
      GL var0 = HDToolkit.gl;
      if(var0.isExtensionAvailable("GL_ARB_point_parameters")) {
         float[] var1 = new float[]{1.0F, 0.0F, 5.0E-4F};
         var0.glPointParameterfvARB(33065, var1, 0);
         FloatBuffer var2 = FloatBuffer.allocate(1);
         var0.glGetFloatv(33063, var2);
         float var3 = var2.get(0);
         if(var3 > 1024.0F) {
            var3 = 1024.0F;
         }

         var0.glPointParameterfARB(33062, 1.0F);
         var0.glPointParameterfARB(33063, var3);
      }

      if(var0.isExtensionAvailable("GL_ARB_point_sprite")) {
         ;
      }

   }

   static final void method1756() {}

   static final int method1757() {
      return particleAmount;
   }

   static final void method1758(int var0) {
      particleAmount = var0;
   }

   final void method1759() {}

   static {
      new Class128(8);
      particleAmount = 2;
      new Buffer(131056);
   }
}
