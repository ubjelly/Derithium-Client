
final class Class3_Sub24_Sub2 extends Class3_Sub24 {

   private Deque aClass61_3485 = new Deque();
   private Deque aClass61_3486 = new Deque();
   private int anInt3487 = 0;
   private int anInt3488 = -1;


   private final void method456(Class3_Sub3 var1) {
      var1.unlink();
      var1.method106();
      Node var2 = this.aClass61_3486.head.next;
      if(var2 == this.aClass61_3486.head) {
         this.anInt3488 = -1;
      } else {
         this.anInt3488 = ((Class3_Sub3)var2).anInt2247;
      }

   }

   final synchronized void method457(Class3_Sub24 var1) {
      this.aClass61_3485.insertFront(var1);
   }

   final synchronized void method413(int[] var1, int var2, int var3) {
      do {
         if(this.anInt3488 < 0) {
            this.method460(var1, var2, var3);
            return;
         }

         if(this.anInt3487 + var3 < this.anInt3488) {
            this.anInt3487 += var3;
            this.method460(var1, var2, var3);
            return;
         }

         int var4 = this.anInt3488 - this.anInt3487;
         this.method460(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.anInt3487 += var4;
         this.method458();
         Class3_Sub3 var5 = (Class3_Sub3)this.aClass61_3486.getFirst();
         synchronized(var5) {
            int var7 = var5.method105(this);
            if(var7 < 0) {
               var5.anInt2247 = 0;
               this.method456(var5);
            } else {
               var5.anInt2247 = var7;
               this.method462(var5.next, var5);
            }
         }
      } while(var3 != 0);

   }

   private final void method458() {
      if(this.anInt3487 > 0) {
         for(Class3_Sub3 var1 = (Class3_Sub3)this.aClass61_3486.getFirst(); var1 != null; var1 = (Class3_Sub3)this.aClass61_3486.getNext()) {
            var1.anInt2247 -= this.anInt3487;
         }

         this.anInt3488 -= this.anInt3487;
         this.anInt3487 = 0;
      }

   }

   final Class3_Sub24 method411() {
      return (Class3_Sub24)this.aClass61_3485.getFirst();
   }

   private final void method459(int var1) {
      for(Class3_Sub24 var2 = (Class3_Sub24)this.aClass61_3485.getFirst(); var2 != null; var2 = (Class3_Sub24)this.aClass61_3485.getNext()) {
         var2.method415(var1);
      }

   }

   private final void method460(int[] var1, int var2, int var3) {
      for(Class3_Sub24 var4 = (Class3_Sub24)this.aClass61_3485.getFirst(); var4 != null; var4 = (Class3_Sub24)this.aClass61_3485.getNext()) {
         var4.method410(var1, var2, var3);
      }

   }

   final synchronized void method461(Class3_Sub24 var1) {
      var1.unlink();
   }

   final int method409() {
      return 0;
   }

   final synchronized void method415(int var1) {
      do {
         if(this.anInt3488 < 0) {
            this.method459(var1);
            return;
         }

         if(this.anInt3487 + var1 < this.anInt3488) {
            this.anInt3487 += var1;
            this.method459(var1);
            return;
         }

         int var2 = this.anInt3488 - this.anInt3487;
         this.method459(var2);
         var1 -= var2;
         this.anInt3487 += var2;
         this.method458();
         Class3_Sub3 var3 = (Class3_Sub3)this.aClass61_3486.getFirst();
         synchronized(var3) {
            int var5 = var3.method105(this);
            if(var5 < 0) {
               var3.anInt2247 = 0;
               this.method456(var3);
            } else {
               var3.anInt2247 = var5;
               this.method462(var3.next, var3);
            }
         }
      } while(var1 != 0);

   }

   final Class3_Sub24 method414() {
      return (Class3_Sub24)this.aClass61_3485.getNext();
   }

   private final void method462(Node var1, Class3_Sub3 var2) {
      while(var1 != this.aClass61_3486.head && ((Class3_Sub3)var1).anInt2247 <= var2.anInt2247) {
         var1 = var1.next;
      }

      AbstractIndexedSprite.method1662(var2, var1, -16);
      this.anInt3488 = ((Class3_Sub3)this.aClass61_3486.head.next).anInt2247;
   }

}
