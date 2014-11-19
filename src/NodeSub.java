
class NodeSub extends Node {

   static jString[] aClass94Array2566 = new jString[200];
   static int anInt2567 = -1;
   long uid;
   NodeSub previousSub;
   static int anInt2572;
   static js5Worker cacheIndex11;
   static int[] anIntArray2574 = new int[14];
   static int anInt2575;
   static jString aClass94_2576 = jString.createJString("Started 3d Library");
   static int anInt2577 = 0;
   NodeSub nextSub;


	static final void method518(Player var0) {
		Class3_Sub9 var2 = (Class3_Sub9) RawObjectCache.aClass130_4046.get(var0.username.toLong());

		if (var2 != null) {
			var2.method134(1);
		} else {
			Class70.method1286(var0.anIntArray2755[0], false, (ObjectDefinition) null, 0, (Npc) null, var0.anIntArray2767[0], Class26.plane, var0);
		}
	}

   static final int method519(int var0, boolean var1, int var2, int var3) {
      try {
         var0 &= 3;
         if(!var1) {
            method520((byte)-89);
         }

         return 0 != var0?(~var0 != -2?(~var0 == -3?-var3 + 7:-var2 + 7):var2):var3;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "rg.RA(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final Class3_Sub28_Sub3 method520(byte var0) {
      try {
         int var1 = -122 % ((var0 - -48) / 33);
         return Buffer.aClass3_Sub28_Sub3_2600;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "rg.OA(" + var0 + ')');
      }
   }

   public static void method521(int var0) {
      try {
         cacheIndex11 = null;
         if(var0 == -3) {
            aClass94Array2566 = null;
            anIntArray2574 = null;
            aClass94_2576 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "rg.QA(" + var0 + ')');
      }
   }

	/*static final void method523(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = var3 - var8;
		int var11 = (-var5 + var0 << 16) / var9;
		int var10 = -var4 + var6;
		int var12 = (var7 + -var1 << 16) / var10;
		Class83.method1410(var1, 0, var6, var4, var3, var5, var8, var12, var11, var2, -12541);
	}*/

   final void unlinkSub() {
	   if(this.previousSub != null) {
		   this.previousSub.nextSub = this.nextSub;
		   this.nextSub.previousSub = this.previousSub;
		   this.nextSub = null;
		   this.previousSub = null;
	   }
   }

}
