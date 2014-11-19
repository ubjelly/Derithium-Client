
final class Queue {

   static js5 aClass153_332;
   private NodeSub head = new NodeSub();
   private NodeSub aClass3_Sub28_335;


   final int method874() {//method1781 hashtable
	   int var2 = 0;

	   for(NodeSub var3 = head.nextSub; var3 != head; ++var2) {
		   var3 = var3.nextSub;
	   }

	   return var2;
   }
   
   public static void method875(byte var0) {
	   aClass153_332 = null;
   }

	final NodeSub method876() {
		NodeSub var2 = head.nextSub;
		if (head != var2) {
			aClass3_Sub28_335 = var2.nextSub;
			return var2;
		} else {
			aClass3_Sub28_335 = null;
			return null;
		}
	}

   final NodeSub method877() {
	   NodeSub var2 = head.nextSub;
	   if(var2 == head) {
		   return null;
	   } else {
		   var2.unlinkSub();
		   return var2;
	   }
   }
   
   final NodeSub peekFirst() {
	   NodeSub var2 = head.nextSub;
	   if(var2 == head)
		   return null;
	   return var2;
   }

   final NodeSub method878() {
	   NodeSub var2 = aClass3_Sub28_335;
	   if(var2 == head) {
		   aClass3_Sub28_335 = null;
		   return null;
	   } else {
		   aClass3_Sub28_335 = var2.nextSub;
		   return var2;
	   }
   }

   final void insertLast(NodeSub var1) {
	   if(var1.previousSub != null) {
		   var1.unlinkSub();
	   }

	   var1.previousSub = head.previousSub;
	   var1.nextSub = head;
	   var1.previousSub.nextSub = var1;
	   var1.nextSub.previousSub = var1;
   }
   
   final void insertFirst(NodeSub var1) {
	   if(var1.previousSub != null) {
		   var1.unlinkSub();
	   }

	   var1.nextSub = head.nextSub;
	   var1.previousSub = head;
	   var1.previousSub.nextSub = var1;
	   var1.nextSub.previousSub = var1;
   }

	static final void method881(int var0, int var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		Class3_Sub4 var10 = null;

		for (Class3_Sub4 var11 = (Class3_Sub4) Class3_Sub13_Sub6.aClass61_3075.getFirst(); var11 != null; var11 = (Class3_Sub4) Class3_Sub13_Sub6.aClass61_3075.getNext()) {
			if (var11.anInt2250 == var0 && ~var4 == ~var11.anInt2264 && var11.anInt2248 == var1 && ~var7 == ~var11.anInt2263) {
				var10 = var11;
				break;
			}
		}

		if (null == var10) {
			var10 = new Class3_Sub4();
			var10.anInt2264 = var4;
			var10.anInt2248 = var1;
			var10.anInt2250 = var0;
			var10.anInt2263 = var7;
			Class132.method1798(72, var10);
			Class3_Sub13_Sub6.aClass61_3075.insertBack(var10);
		}

		var10.anInt2262 = var8;
		var10.anInt2261 = var9;
		var10.anInt2259 = var5;
		var10.anInt2265 = var6;
		var10.anInt2256 = var3;
	}

   static final void method882(int var0, int var1) {
      try {
         Class3_Sub13_Sub36.anInt3423 = 0;
         Class132.anInt1741 = -1;
         Class10.anInt154 = 1;
         SpotAnimation.anInt546 = var1;
         Class3_Sub9.aBoolean2311 = false;
         Class101.aClass153_1423 = null;
         Class3_Sub13_Sub39.anInt3463 = var0;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "ce.F(" + var0 + ',' + var1 + ')');
      }
   }

   final void clear() {
	   while(true) {
		   NodeSub var2 = head.nextSub;
		   if(head == var2) {
			   aClass3_Sub28_335 = null;
			   return;
		   }

		   var2.unlinkSub();
	   }
   }

   static final Class3_Sub28_Sub3 method884(int var0, byte var1, int var2) {
      try {
         Class3_Sub28_Sub3 var3 = (Class3_Sub28_Sub3)Class134.aClass61_1758.getFirst();

         for(int var4 = -82 % ((var1 - 11) / 32); var3 != null; var3 = (Class3_Sub28_Sub3)Class134.aClass61_1758.getNext()) {
            if(var3.aBoolean3553 && var3.method537(var2, (byte)97, var0)) {
               return var3;
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "ce.D(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   public Queue() {
	   head.nextSub = head;
	   head.previousSub = head;
   }

}
