
final class RenderAnimationDefinition {

   int anInt357 = 0;
   
   int[][] anIntArrayArray359;
   int anInt360 = -1;
   int turn90CCAnimation = -1;
   int anInt367 = -1;
   int idleAnimation = -1;
   int anInt369 = 0;
   int anInt370 = 0;
   int anInt371 = 0;
   int anInt372 = -1;
   int anInt373 = -1;
   int anInt2333 = -1;
   int anInt375 = -1;
   int anInt379 = -1;
   int anInt381 = 0;
   int walkAnimarion = -1;
   int anInt386 = -1;
   int anInt387 = 0;
   int turn180Animation = -1;
   int turn90CWAnimation = -1;
   int runAnimation = -1;
   int anInt395 = 0;
   int anInt398 = -1;
   int anInt399 = 0;
   int anInt400 = 0;
   int anInt403 = 0;
   int anInt406 = -1;
   int anInt407 = -1;
   final void method899(int var1) {
      try {
         if(var1 <= 68) {
            client.method900((Entity)null, -23);
         }

      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "ck.B(" + var1 + ')');
      }
   }

   final void method901(int var1, Buffer var2) {
      try {
         if(var1 != -1) {
            client.method900((Entity)null, -18);
         }

         while(true) {
            int var3 = var2.getUByte();
            if(-1 == ~var3) {
               return;
            }

            this.method902(var3, (byte)-106, var2);
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "ck.H(" + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   private final void method902(int var1, byte var2, Buffer var3) {
         if(var1 == 1) {
            this.idleAnimation = var3.getUShort();
            this.walkAnimarion = var3.getUShort();
            if(-65536 == ~this.walkAnimarion) {
               this.walkAnimarion = -1;
            }

            if('\uffff' == this.idleAnimation) {
               this.idleAnimation = -1;
            }
         } else if(var1 == 2) {
            this.anInt398 = var3.getUShort();
         } else if(var1 == 3) {
        	 this.anInt372 = var3.getUShort();
         } else if(4 == var1) {
        	 this.anInt406 = var3.getUShort();
         } else if(var1 == 5) {
             this.anInt379 = var3.getUShort();
         } else if(6 == var1) {
             this.runAnimation = var3.getUShort();
         } else if(7 == var1) {
        	 this.anInt386 = var3.getUShort();
         } else if(var1 == 8) {
             this.anInt373 = var3.getUShort();
         } else if(9 == var1) {
             this.anInt375 = var3.getUShort();
         } else if(var1 == 26) {
        	 this.anInt395 = (short)(4 * var3.getUByte());
        	 this.anInt381 = (short)(4 * var3.getUByte());
         } else if(var1 == 27) {
             if(this.anIntArrayArray359 == null) {
                this.anIntArrayArray359 = new int[12][];
             }

             int var4 = var3.getUByte();
             this.anIntArrayArray359[var4] = new int[6];

             for(int var5 = 0; var5 < 6; ++var5) {
                this.anIntArrayArray359[var4][var5] = var3.getShort();
             }
         } else if(29 == var1) {
             this.anInt369 = var3.getUByte();
         } else if(var1 == 30) {
             this.anInt357 = var3.getUShort();
         } else if(var1 == 31) {
        	 this.anInt387 = var3.getUByte();
         } else if(32 == var1) {
             this.anInt370 = var3.getUShort();
         } else if(33 == var1) {
        	 this.anInt400 = var3.getShort();
         } else if(34 == var1) {
        	 this.anInt403 = var3.getUByte();
         } else if(var1 == 35) {
             this.anInt399 = var3.getUShort();
         } else if(var1 == 36) {
             this.anInt371 = var3.getShort();
         } else if(37 == var1) {
             this.anInt360 = var3.getUByte();
         } else if(var1 == 38) {
        	 this.anInt367 = var3.getUShort();
         } else if(39 == var1) {
        	 this.anInt407 = var3.getUShort();
         } else if(var1 == 40) {
        	 this.turn180Animation = var3.getUShort();
         } else if(41 == var1) {
        	 this.turn90CWAnimation = var3.getUShort();
         } else if(var1 == 42) {
        	 this.turn90CCAnimation = var3.getUShort();
         } else if(43 == var1) {
             var3.getUShort();
         } else if(var1 == 44) {
             var3.getUShort();
         } else if(var1 == 45) {
        	 anInt2333 = var3.getUShort();
         } else if(var1 == 46) {
        	 int anInt2333 = var3.getUShort();//TODO add new opcodes
         } else if(var1 == 47) {
			int anInt2309 = var3.getUShort();
         } else if(var1 == 48) {
			int anInt2319 = var3.getUShort();
         } else if(var1 == 49) {
			int anInt2300 = var3.getUShort();
         } else if(var1 == 50) {
			int anInt2345 = var3.getUShort();
         } else if(var1 == 51) {
			int anInt2341 = var3.getUShort();
         } else if(var1 == 52) {
        	 int i = var3.getUByte();
        	 int[] anIntArray2332 = new int[i];
        	 int[] anIntArray2329 = new int[i];
        	 int anInt2314 = 0;
        	 for (int i_0_ = 0; i > i_0_; i_0_++) {
        		 anIntArray2332[i_0_] = var3.getUShort();
        		 int i_1_ = var3.getUByte();
        		 anIntArray2329[i_0_] = i_1_;
        		 anInt2314 += i_1_;
        	 }
         } else if (var1 == 53) {
        	 boolean aBoolean2336 = false;
         }
   }

}
