
final class Class60 {

   static int anInt930;
   private static jString aClass94_931 = jString.createJString("Continue");
   static int anInt932;
   static int anInt934;
   static jString aClass94_935 = aClass94_931;
   static int anInt936;


   public static void method1206(byte var0) {
      try {
         int var1 = 50 % ((-41 - var0) / 57);
         aClass94_931 = null;
         aClass94_935 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ig.C(" + var0 + ')');
      }
   }

   static final void method1207(int var0) {
      try {
         for(int var1 = 0; ~var1 > ~Class163.anInt2046; ++var1) {
            int var2 = Class15.anIntArray347[var1];
            Npc var3 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var2];
            if(null != var3) {
               OutputStream_Sub1.method68(var3.aClass90_3976.size, 2279, var3);
            }
         }

         if(var0 > -4) {
            discardInterface(108);
         }

      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "ig.A(" + var0 + ')');
      }
   }

	static final void discardInterface(int var1) {
		/*if (-1 != var1) {
			if (Hashtable.interfaceLoaded[var1]) {
				Class3_Sub13_Sub29.interfaceFetcher.method2128(var1);
				if (null != SceneGraphNode.interfaceCache[var1]) {
					boolean var2 = true;

					for (int var3 = 0; SceneGraphNode.interfaceCache[var1].length > var3; ++var3) {
						if (SceneGraphNode.interfaceCache[var1][var3] != null) {
							if (~SceneGraphNode.interfaceCache[var1][var3].type == -3) {
								var2 = false;
							} else {
								SceneGraphNode.interfaceCache[var1][var3] = null;
							}
						}
					}

					if (var2) {
						SceneGraphNode.interfaceCache[var1] = null;
					}

					Hashtable.interfaceLoaded[var1] = false;
				}
			}
		}*/
	}

}
