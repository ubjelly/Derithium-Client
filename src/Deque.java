
final class Deque {

   static Class93 aClass93_939 = new Class93(4);
   Node head = new Node();
   private Node current;


   static final Class70 method1209(int var0, int var1, int var2) {
      GroundTile var3 = Class75_Sub2.groundTiles[var0][var1][var2];
      if(var3 == null) {
         return null;
      } else {
         Class70 var4 = var3.aClass70_2234;
         var3.aClass70_2234 = null;
         return var4;
      }
   }

   static final Class3_Sub28_Sub9 method1210(int var0, int var1) {
      try {
         Class3_Sub28_Sub9 var2 = (Class3_Sub28_Sub9)Class163.aClass47_2041.method1092((long)var1, 1400);
         if(var0 != 64) {
            method1218(false, -77, -82);
         }

         if(null == var2) {
            byte[] var3 = Class3_Sub13_Sub7.aClass153_3098.getFile(11, var1);
            var2 = new Class3_Sub28_Sub9();
            if(var3 != null) {
               var2.method583(207, new Buffer(var3));
            }

            Class163.aClass47_2041.method1097(var2, (long)var1, (byte)98);
            return var2;
         } else {
            return var2;
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "ih.G(" + var0 + ',' + var1 + ')');
      }
   }

   final void clear() {
	   while(true) {
		   Node var2 = this.head.next;
		   if(var2 == this.head) {
			   this.current = null;
			   return;
		   }
		   var2.unlink();
	   }
   }

   final Node method1212(int var1) {
      try {
         Node var2 = this.head.previous;
         if(var1 != 2) {
            method1213(56, (Class3_Sub11[])null);
         }

         if(this.head == var2) {
            this.current = null;
            return null;
         } else {
            this.current = var2.previous;
            return var2;
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "ih.B(" + var1 + ')');
      }
   }

   static final void method1213(int var0, Class3_Sub11[] var1) {
      Class3_Sub23.aClass3_Sub11ArrayArray2542[var0] = var1;
   }

   static final void method1214(int var0, int var1, int var2, int var3, int var4) {
      try {
         Class3_Sub9 var5;
         for(var5 = (Class3_Sub9)Node.aClass61_78.getFirst(); var5 != null; var5 = (Class3_Sub9)Node.aClass61_78.getNext()) {
            Class3_Sub28_Sub11.method606(var1, var5, var3, var0, var2, 126);
         }

         byte var6;
         int var8;
         for(var5 = (Class3_Sub9)jSocket.aClass61_1242.getFirst(); var5 != null; var5 = (Class3_Sub9)jSocket.aClass61_1242.getNext()) {
            var6 = 1;
            if(~var5.aClass140_Sub4_Sub2_2324.idleAnimation != ~var5.aClass140_Sub4_Sub2_2324.currentMoveAnimation) {
               /*if(~var5.aClass140_Sub4_Sub2_2324.runAnimation != ~var5.aClass140_Sub4_Sub2_2324.currentMoveAnimation && ~var7.anInt386 != ~var5.aClass140_Sub4_Sub2_2324.currentMoveAnimation && ~var7.anInt375 != ~var5.aClass140_Sub4_Sub2_2324.currentMoveAnimation && ~var7.anInt373 != ~var5.aClass140_Sub4_Sub2_2324.currentMoveAnimation) {
                  if(var7.anInt398 == var5.aClass140_Sub4_Sub2_2324.currentMoveAnimation || var7.anInt372 == var5.aClass140_Sub4_Sub2_2324.currentMoveAnimation || var5.aClass140_Sub4_Sub2_2324.currentMoveAnimation == var7.anInt379 || ~var7.anInt406 == ~var5.aClass140_Sub4_Sub2_2324.currentMoveAnimation) {
                     var6 = 3;
                  }
               } else {
                  var6 = 2;
               }*///TODO FIXME finish converting
            } else {
               var6 = 0;
            }

            if(var5.anInt2322 != var6) {
               var8 = IsaacCipher.method1232(var5.aClass140_Sub4_Sub2_2324, -1);
               if(var8 != var5.anInt2332) {
                  if(var5.aClass3_Sub24_Sub1_2312 != null) {
                     Class3_Sub26.aClass3_Sub24_Sub2_2563.method461(var5.aClass3_Sub24_Sub1_2312);
                     var5.aClass3_Sub24_Sub1_2312 = null;
                  }

                  var5.anInt2332 = var8;
               }

               var5.anInt2322 = var6;
            }

            var5.anInt2326 = var5.aClass140_Sub4_Sub2_2324.anInt2819;
            var5.anInt2321 = var5.aClass140_Sub4_Sub2_2324.anInt2819 + var5.aClass140_Sub4_Sub2_2324.getSize() * 64;
            var5.anInt2308 = var5.aClass140_Sub4_Sub2_2324.anInt2829;
            var5.anInt2307 = var5.aClass140_Sub4_Sub2_2324.anInt2829 + var5.aClass140_Sub4_Sub2_2324.getSize() * 64;
            Class3_Sub28_Sub11.method606(var1, var5, var3, var0, var2, var4 ^ 113);
         }

         if(var4 == 1) {
            for(var5 = (Class3_Sub9)RawObjectCache.aClass130_4046.getFirst(); var5 != null; var5 = (Class3_Sub9)RawObjectCache.aClass130_4046.getNext()) {
               var6 = 1;
               if(var5.aClass140_Sub4_Sub1_2327.currentMoveAnimation != var5.aClass140_Sub4_Sub1_2327.idleAnimation) {
                  /*&if(var5.aClass140_Sub4_Sub1_2327.currentMoveAnimation != var5.aClass140_Sub4_Sub1_2327.runAnimation && var5.aClass140_Sub4_Sub1_2327.currentMoveAnimation != var7.anInt386 && ~var5.aClass140_Sub4_Sub1_2327.currentMoveAnimation != ~var7.anInt375 && var7.anInt373 != var5.aClass140_Sub4_Sub1_2327.currentMoveAnimation) {
                     if(var7.anInt398 == var5.aClass140_Sub4_Sub1_2327.currentMoveAnimation || var5.aClass140_Sub4_Sub1_2327.currentMoveAnimation == var7.anInt372 || ~var5.aClass140_Sub4_Sub1_2327.currentMoveAnimation == ~var7.anInt379 || ~var5.aClass140_Sub4_Sub1_2327.currentMoveAnimation == ~var7.anInt406) {
                        var6 = 3;
                     }
                  } else {
                     var6 = 2;
                  }*///TODO FINISH COVERTING
               } else {
                  var6 = 0;
               }

               if(~var5.anInt2322 != ~var6) {
                  var8 = Class81.method1398(0, var5.aClass140_Sub4_Sub1_2327);
                  if(~var5.anInt2332 != ~var8) {
                     if(var5.aClass3_Sub24_Sub1_2312 != null) {
                        Class3_Sub26.aClass3_Sub24_Sub2_2563.method461(var5.aClass3_Sub24_Sub1_2312);
                        var5.aClass3_Sub24_Sub1_2312 = null;
                     }

                     var5.anInt2332 = var8;
                  }

                  var5.anInt2322 = var6;
               }

               var5.anInt2326 = var5.aClass140_Sub4_Sub1_2327.anInt2819;
               var5.anInt2321 = var5.aClass140_Sub4_Sub1_2327.anInt2819 + 64 * var5.aClass140_Sub4_Sub1_2327.getSize();
               var5.anInt2308 = var5.aClass140_Sub4_Sub1_2327.anInt2829;
               var5.anInt2307 = var5.aClass140_Sub4_Sub1_2327.anInt2829 + var5.aClass140_Sub4_Sub1_2327.getSize() * 64;
               Class3_Sub28_Sub11.method606(var1, var5, var3, var0, var2, 110);
            }

         }
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "ih.K(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   final void insertBack(Node var2) {
	   if(null != var2.previous) {
		   var2.unlink();
	   }
	   var2.next = this.head;
	   var2.previous = this.head.previous;
	   var2.previous.next = var2;
	   var2.next.previous = var2;
   }

   final void insertFront(Node var2) {
         if(null != var2.previous) {
            var2.unlink();
         }
         var2.next = this.head.next;
         var2.previous = this.head;
         var2.previous.next = var2;
         var2.next.previous = var2;
   }

   public static void method1217(int var0) {
      try {
         aClass93_939 = null;
         if(var0 != 0) {
            method1213(56, (Class3_Sub11[])null);
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ih.J(" + var0 + ')');
      }
   }

   static final jString method1218(boolean var0, int var1, int var2) {
      try {
         return var1 <= 122?(jString)null:Class118.method1723(var0, 10, var2);
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "ih.A(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   final Node getPrevious() {
         Node var2 = this.current;
         if(this.head == var2) {
            this.current = null;
            return null;
         } else {
            this.current = var2.previous;
            return var2;
         }
   }

   final Node popFront() {
	   Node var2 = this.head.next;
	   if(this.head != var2) {
		   var2.unlink();
		   return var2;
	   } else {
		   return null;
	   }
   }

   public Deque() {
      try {
         this.head.previous = this.head;
         this.head.next = this.head;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ih.<init>()");
      }
   }

	final Node getNext() {
		Node var2 = this.current;
		if (var2 != this.head) {
			this.current = var2.next;
			return var2;
		} else {
			this.current = null;
			return null;
		}
	}

   final Node getFirst() {
		Node var2 = this.head.next;

		if (this.head == var2) {
			this.current = null;
			return null;
		} else {
			this.current = var2.next;
			return var2;
		}
   }

}
