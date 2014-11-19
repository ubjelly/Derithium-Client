
final class LongNode extends Node {

   static int[] anIntArray2292 = new int[1000];
   static int anInt2293 = -1;
   static int anInt2294;
   long value;

   public static void method120(int var0) {
      try {
         anIntArray2292 = null;
         if(var0 != 1000) {
            anInt2293 = 55;
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "eb.B(" + var0 + ')');
      }
   }

   static final int method121(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         if((var2 & 1) == var5) {
            int var7 = var4;
            var4 = var3;
            var3 = var7;
         }

         var1 &= 3;
         return 0 != var1?(~var1 != -2?(var1 != 2?-var0 + 7 + 1 + -var3:-var6 + (7 - (var4 + -1))):var0):var6;
      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "eb.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   static final void method122() {
	   SceneGraphNode.interfaceCache = new jInterface[Class3_Sub13_Sub29.interfaceFetcher.method2121()][];
	   Hashtable.interfaceLoaded = new boolean[Class3_Sub13_Sub29.interfaceFetcher.method2121()];
   }

   static final jString method123(int var0, int var1) {
      try {
         if(100000 > var1) {
            return client.method903(new jString[]{Class56.aClass94_888, Class72.method1298(var1), Class72.aClass94_1076});
         } else {
            if(var0 != 1000) {
               method123(-54, 54);
            }

            return var1 >= 10000000?client.method903(new jString[]{Class3_Sub13_Sub25.aClass94_3307, Class72.method1298(var1 / 1000000), Class3_Sub13_Sub10.aClass94_3117, Class72.aClass94_1076}):client.method903(new jString[]{ClanMember.aClass94_2477, Class72.method1298(var1 / 1000), AnimationLoader.aClass94_3584, Class72.aClass94_1076});
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "eb.C(" + var0 + ',' + var1 + ')');
      }
   }

   public LongNode() {}

   LongNode(long var1) {
	   this.value = var1;
   }

}
