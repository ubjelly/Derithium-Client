
class Node {

   long hash;
   static int anInt72 = 0;
   static boolean[] aBooleanArray73 = new boolean[200];
   Node next;
   static jString[] stringStack = new jString[1000];
   Node previous;
   static Deque aClass61_78 = new Deque();


   final boolean method82(int var1) {
      try {
         return var1 != 0?false:null != this.previous;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "ab.I(" + var1 + ')');
      }
   }

   public static void method83() {
	   stringStack = null;
	   aClass61_78 = null;
	   aBooleanArray73 = null;
   }

   /*static final void method84(jString var0) {
	   int var2 = OverlayType.method1602(var0);
	   if(var2 != -1) {
		   AbstractObjectCache.method565(Class119.aClass131_1624.aShortArray1727[var2], Class119.aClass131_1624.aShortArray1718[var2]);
	   }
   }*/

   static final void method85(byte var0) {
      try {
         int var1 = -122 % ((var0 - -63) / 48);
         Class136.aClass93_1772.clearSoftReference();
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ab.G(" + var0 + ')');
      }
   }

   final void unlink() {
         if(null != this.previous) {
            this.previous.next = this.next;
            this.next.previous = this.previous;
            this.previous = null;
            this.next = null;
         }
   }

   static final DisplayModeInformation[] method88(byte var0) {
      try {
         if(var0 != 28) {
            aBooleanArray73 = (boolean[])null;
         }

         if(Class56.aClass106Array890 == null) {
            DisplayModeInformation[] var1 = BufferedRequest.gatherDisplayModesInformation(Class38.gameSignlink);
            DisplayModeInformation[] var2 = new DisplayModeInformation[var1.length];
            int var3 = 0;

            label58:
            for(int var4 = 0; var4 < var1.length; ++var4) {
               DisplayModeInformation var5 = var1[var4];
               if((0 >= var5.bitDepth || var5.bitDepth >= 24) && ~var5.width <= -801 && 600 <= var5.height) {
                  for(int var6 = 0; var3 > var6; ++var6) {
                     DisplayModeInformation var7 = var2[var6];
                     if(var5.width == var7.width && ~var7.height == ~var5.height) {
                        if(~var5.bitDepth < ~var7.bitDepth) {
                           var2[var6] = var5;
                        }
                        continue label58;
                     }
                  }

                  var2[var3] = var5;
                  ++var3;
               }
            }

            Class56.aClass106Array890 = new DisplayModeInformation[var3];
            ArrayUtils.arrayCopy(var2, 0, Class56.aClass106Array890, 0, var3);
            int[] var9 = new int[Class56.aClass106Array890.length];

            for(int var10 = 0; Class56.aClass106Array890.length > var10; ++var10) {
               DisplayModeInformation var11 = Class56.aClass106Array890[var10];
               var9[var10] = var11.height * var11.width;
            }

            Class108.method1658(21, var9, Class56.aClass106Array890);
         }

         return Class56.aClass106Array890;
      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "ab.M(" + var0 + ')');
      }
   }

   static final void method89(js5 var1, js5 var2, js5 var3, js5 var4) {
         Class12.aClass153_323 = var2;
         Class97.aClass153_1378 = var1;
         Class3_Sub13_Sub29.interfaceFetcher = var3;
         Class119.aClass153_1628 = var4;
         SceneGraphNode.interfaceCache = new jInterface[Class3_Sub13_Sub29.interfaceFetcher.method2121()][];
         Hashtable.interfaceLoaded = new boolean[Class3_Sub13_Sub29.interfaceFetcher.method2121()];
   }

}
