
final class Class7 implements Interface4 {

   static js5 skinsFetcher;
   static int anInt2161 = -1;
   static int renderZ;
   static jString aClass94_2164 = jString.createJString("hint_mapedge");
   static int anInt2166 = 0;
   static short[] aShortArray2167 = new short[]{(short)30, (short)6, (short)31, (short)29, (short)10, (short)44, (short)37, (short)57};
   static jString aClass94_2168 = jString.createJString("<br>");


   static final void method831(String var1) {
      System.out.println("Error: " + InterfaceChangeNode.a("%0a", "\n", 105, var1));
   }

   static final jInterface getInterface(int var1) {
	  int var2 = var1 >> 16;
      int var3 = 0xffff & var1;
      if(SceneGraphNode.interfaceCache[var2] == null || null == SceneGraphNode.interfaceCache[var2][var3]) {
    	  boolean var4 = Canvas_Sub2.loadInterface(var2);
    	  if(!var4) {
    		  return null;
    	  }
      }

      return SceneGraphNode.interfaceCache[var2][var3];
   }

   public static void method833(byte var0) {
      try {
         aShortArray2167 = null;
         skinsFetcher = null;
         aClass94_2164 = null;
         aClass94_2168 = null;
         int var1 = 124 / ((var0 - 28) / 41);
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "af.E(" + var0 + ')');
      }
   }

   public final jString method20(int var1, int[] var2, int var3, long var4) {
      try {
         if(var1 != 0) {
            if(var1 != 1 && ~var1 != -11) {
               return var1 != 6 && var1 != 7 && 11 != var1?(var3 != 4936?(jString)null:null):EnumType.list(var2[0]).method616((int)var4, (byte)-69);
            } else {
               ItemDefinition var8 = ItemDefinition.method1023((int)var4);
               return var8.aClass94_770;
            }
         } else {
            EnumType var6 = EnumType.list(var2[0]);
            return var6.method616((int)var4, (byte)120);
         }
      } catch (RuntimeException var7) {
         throw Class44.method1067(var7, "af.A(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ',' + var4 + ')');
      }
   }

   static final void method834(byte var0) {
      try {
         //Js5CacheWorker.method1250(false);
         System.gc();
         Class117.setGameState(25);
         if(var0 >= -80) {
            anInt2166 = -89;
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "af.D(" + var0 + ')');
      }
   }

   static final boolean method835(int var0, int var1, int var2, int var3, int var4, int var5, SceneGraphNode var6, int var7, long var8) {
      if(var6 == null) {
         return true;
      } else {
         int var10 = var1 * 128 + 64 * var4;
         int var11 = var2 * 128 + 64 * var5;
         return Class56.method1189(var0, var1, var2, var4, var5, var10, var11, var3, var6, var7, false, var8);
      }
   }

}
