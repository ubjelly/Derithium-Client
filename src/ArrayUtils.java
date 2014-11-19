
final class ArrayUtils {

   static final void arrayCopy(long[] var0, int var1, long[] var2, int var3, int var4) {
      if(var0 == var2) {
         if(var1 == var3) {
            return;
         }

         if(var3 > var1 && var3 < var1 + var4) {
            --var4;
            var1 += var4;
            var3 += var4;
            var4 = var1 - var4;

            for(var4 += 3; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            for(var4 -= 3; var1 >= var4; var2[var3--] = var0[var1--]) {
               ;
            }

            return;
         }
      }

      var4 += var1;

      for(var4 -= 3; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      for(var4 += 3; var1 < var4; var2[var3++] = var0[var1++]) {
         ;
      }

   }

   static final void arrayCopy(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      if(var0 == var2) {
         if(var1 == var3) {
            return;
         }

         if(var3 > var1 && var3 < var1 + var4) {
            --var4;
            var1 += var4;
            var3 += var4;
            var4 = var1 - var4;

            for(var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            for(var4 -= 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               ;
            }

            return;
         }
      }

      var4 += var1;

      for(var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      for(var4 += 7; var1 < var4; var2[var3++] = var0[var1++]) {
         ;
      }

   }

   static final void arrayCopy(int[] var0, int var1, int[] var2, int var3, int var4) {
      if(var0 == var2) {
         if(var1 == var3) {
            return;
         }

         if(var3 > var1 && var3 < var1 + var4) {
            --var4;
            var1 += var4;
            var3 += var4;
            var4 = var1 - var4;

            for(var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            for(var4 -= 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               ;
            }

            return;
         }
      }

      var4 += var1;

      for(var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      for(var4 += 7; var1 < var4; var2[var3++] = var0[var1++]) {
         ;
      }

   }

   static final void fill(int[] var0, int var1, int var2, int var3) {
      for(var2 = var1 + var2 - 7; var1 < var2; var0[var1++] = var3) {
         var0[var1++] = var3;
         var0[var1++] = var3;
         var0[var1++] = var3;
         var0[var1++] = var3;
         var0[var1++] = var3;
         var0[var1++] = var3;
         var0[var1++] = var3;
      }

      for(var2 += 7; var1 < var2; var0[var1++] = var3) {
         ;
      }

   }

   static final void arrayCopy(float[] var0, int var1, float[] var2, int var3, int var4) {
      if(var0 == var2) {
         if(var1 == var3) {
            return;
         }

         if(var3 > var1 && var3 < var1 + var4) {
            --var4;
            var1 += var4;
            var3 += var4;
            var4 = var1 - var4;

            for(var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            for(var4 -= 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               ;
            }

            return;
         }
      }

      var4 += var1;

      for(var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      for(var4 += 7; var1 < var4; var2[var3++] = var0[var1++]) {
         ;
      }

   }

   static final void arrayCopy(short[] var0, int var1, short[] var2, int var3, int var4) {
      if(var0 == var2) {
         if(var1 == var3) {
            return;
         }

         if(var3 > var1 && var3 < var1 + var4) {
            --var4;
            var1 += var4;
            var3 += var4;
            var4 = var1 - var4;

            for(var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            for(var4 -= 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               ;
            }

            return;
         }
      }

      var4 += var1;

      for(var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      for(var4 += 7; var1 < var4; var2[var3++] = var0[var1++]) {
         ;
      }

   }

   static final void arrayCopy(Object[] var0, int var1, Object[] var2, int var3, int var4) {
      if(var0 == var2) {
         if(var1 == var3) {
            return;
         }

         if(var3 > var1 && var3 < var1 + var4) {
            --var4;
            var1 += var4;
            var3 += var4;
            var4 = var1 - var4;

            for(var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            for(var4 -= 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               ;
            }

            return;
         }
      }

      var4 += var1;

      for(var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      for(var4 += 7; var1 < var4; var2[var3++] = var0[var1++]) {
         ;
      }

   }

   static final void clear(int[] var0, int var1, int var2) {
      for(var2 = var1 + var2 - 7; var1 < var2; var0[var1++] = 0) {
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
      }

      for(var2 += 7; var1 < var2; var0[var1++] = 0) {
         ;
      }

   }
}
