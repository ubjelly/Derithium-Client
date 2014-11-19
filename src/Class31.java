import javax.media.opengl.GL;

final class Class31 {

   static int anInt580 = 0;
   private static Deque aClass61_581 = new Deque();
   static int anInt582 = 0;
   private static long lastGcTime = 0L;
   static int anInt584 = 0;
   static int anInt585 = 0;
   private static Deque aClass61_586 = new Deque();
   private static Deque aClass61_587 = new Deque();
   private static Deque aClass61_588 = new Deque();
   private static int[] anIntArray589 = new int[1000];

   static final synchronized void method985(int var0, int var1, int var2) {
      if(var2 == anInt582) {
         IntegerNode var3 = new IntegerNode(var1);
         var3.hash = (long)var0;
         aClass61_587.insertBack(var3);
      }
   }

   static final synchronized void method986(int var0, int var1) {
      if(var1 == anInt582) {
         IntegerNode var2 = new IntegerNode();
         var2.hash = (long)var0;
         aClass61_588.insertBack(var2);
      }
   }

   public static void method987() {
      aClass61_581 = null;
      aClass61_586 = null;
      aClass61_587 = null;
      aClass61_588 = null;
      anIntArray589 = null;
   }

   static final synchronized void method988() {
      ++anInt582;
      aClass61_581.clear();
      aClass61_586.clear();
      aClass61_587.clear();
      aClass61_588.clear();
      anInt585 = 0;
      anInt584 = 0;
      anInt580 = 0;
   }

   static final synchronized void method989(int var0, int var1, int var2) {
      if(var2 == anInt582) {
         IntegerNode var3 = new IntegerNode(var1);
         var3.hash = (long)var0;
         aClass61_581.insertBack(var3);
      }
   }

   static final synchronized void method990() {
      GL var0 = HDToolkit.gl;
      int var1 = 0;

      while(true) {
         IntegerNode var2 = (IntegerNode)aClass61_581.popFront();
         if(var2 == null) {
            if(var1 > 0) {
               var0.glDeleteBuffersARB(var1, anIntArray589, 0);
               var1 = 0;
            }

            while(true) {
               var2 = (IntegerNode)aClass61_586.popFront();
               if(var2 == null) {
                  while(true) {
                     var2 = (IntegerNode)aClass61_587.popFront();
                     if(var2 == null) {
                        if(var1 > 0) {
                           var0.glDeleteTextures(var1, anIntArray589, 0);
                        }

                        while(true) {
                           var2 = (IntegerNode)aClass61_588.popFront();
                           if(var2 == null) {
                              if(anInt585 + anInt584 + anInt580 > 100663296 && TimeUtil.currentTimeMillis() > lastGcTime + 60000L) {
                                 System.gc();
                                 lastGcTime = TimeUtil.currentTimeMillis();
                              }

                              return;
                           }

                           int var3 = (int)var2.hash;
                           var0.glDeleteLists(var3, 1);
                        }
                     }

                     anIntArray589[var1++] = (int)var2.hash;
                     anInt580 -= var2.value;
                     if(var1 == 1000) {
                        var0.glDeleteTextures(var1, anIntArray589, 0);
                        var1 = 0;
                     }
                  }
               }

               anIntArray589[var1++] = (int)var2.hash;
               anInt584 -= var2.value;
               if(var1 == 1000) {
                  var0.glDeleteTextures(var1, anIntArray589, 0);
                  var1 = 0;
               }
            }
         }

         anIntArray589[var1++] = (int)var2.hash;
         anInt585 -= var2.value;
         if(var1 == 1000) {
            var0.glDeleteBuffersARB(var1, anIntArray589, 0);
            var1 = 0;
         }
      }
   }

   static final synchronized void method991(int var0, int var1, int var2) {
      if(var2 == anInt582) {
         IntegerNode var3 = new IntegerNode(var1);
         var3.hash = (long)var0;
         aClass61_586.insertBack(var3);
      }
   }

}
