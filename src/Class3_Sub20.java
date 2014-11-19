
final class Class3_Sub20 extends Node {

   static int[] maxStats = new int[25];
   
   //static jString aClass94_2482 = jString.createJString(":clan:");
   int anInt2483;
   static int anInt2484 = 0;
   private static jString aClass94_2486 = jString.createJString("red:");
   static int anInt2487;
   static int anInt2488 = 0;
   int anInt2489;
   static jString aClass94_2490 = aClass94_2486;
   static jString aClass94_2481 = aClass94_2486;

	/*static final void method388() {
		if (Class3_Sub13_Sub19.aClass94_3220 != null) {
			Class3_Sub10.method138(Class3_Sub13_Sub19.aClass94_3220, 0);
			Class3_Sub13_Sub19.aClass94_3220 = null;
		}
	}*/

   static final void method389(boolean var0) {
      try {
         Class32.method995();
         Class49.aClass3_Sub28_Sub16_812 = null;
         Class58.anInt909 = -1;
         Class3_Sub13_Sub30.method313();
         Class3_Sub28_Sub21.aClass47_3801.method1101(2);
         OverlayType.aClass136_1413 = new Class136();
         ((TextureLoader)Rasterizer.anInterface2_838).method1618(0);
         LightManager.lightsPos = 0;
         LightManager.lights = new Light[255];
         HDModel.method1929();
         Class141.method2043();
         Class65.method1240();
         //Js5CacheWorker.method1250(var0);
         Class3_Sub13_Sub17.method247((byte)51);

         for(int var1 = 0; 2048 > var1; ++var1) {
            Player var2 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var1];
            if(null != var2) {
               var2.anObject2796 = null;
            }
         }

         if(HDToolkit.openGLEnabled) {
            Class141.method2041(104, 104);
            ParticleEngine.method1755();
         }

         client.loadFonts(js5.cacheIndex13, 0, Class140_Sub6.cacheIndex8);
         Class14.method887(21, Class140_Sub6.cacheIndex8);
         Class3_Sub26.aClass3_Sub28_Sub16_2560 = null;
         Class3_Sub13_Sub7.aClass3_Sub28_Sub16_3099 = null;
         Vertex.aClass3_Sub28_Sub16_824 = null;
         Class95.aClass3_Sub28_Sub16_1339 = null;
         Class108.aClass3_Sub28_Sub16_1457 = null;
         if(Class143.gameState == 5) {
            client.load_title_screen(Class3_Sub13_Sub25.cacheIndex10);
         }

         if(10 == Class143.gameState) {
            Class3_Sub13_Sub11.method219(false);
         }

         if(Class143.gameState == 30) {
            Class117.setGameState(25);
         }

      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "lb.C(" + var0 + ')');
      }
   }

   static final void method390(boolean var0, int var1, int var2, int var3, byte var4, int var5, int var6) {
      try {
         Class3_Sub28_Sub10.anInt3631 = var3;
         Class3_Sub13_Sub34.anInt3414 = var2;
         Canvas_Sub2.anInt30 = var6;
         Class163_Sub2_Sub1.anInt4021 = var1;
         AbstractMouseWheel.anInt1904 = var5;
         if(var0 && Class3_Sub28_Sub10.anInt3631 >= 100) {
            Npc.renderX = 128 * Canvas_Sub2.anInt30 + 64;
            Class77.renderY = 128 * AbstractMouseWheel.anInt1904 + 64;
            Class7.renderZ = Class121.method1736(Class26.plane, 1, Npc.renderX, Class77.renderY) + -Class3_Sub13_Sub34.anInt3414;
         }

         int var7 = 76 % ((-79 - var4) / 35);
         GrandExchangeItem.anInt1753 = 2;
      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "lb.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

	public static void method391() {
		aClass94_2490 = null;
		maxStats = null;
		aClass94_2481 = null;
		aClass94_2486 = null;
		// aClass94_2482 = null;
	}

   Class3_Sub20(int var1, int var2) {
      try {
         this.anInt2483 = var2;
         this.anInt2489 = var1;
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "lb.<init>(" + var1 + ',' + var2 + ')');
      }
   }

   static final void method392(js5 skins, js5 var1, int var2, js5 skeletons) {
      try {
         AnimationDefinition.aClass153_1860 = var1;
         Class7.skinsFetcher = skins;
         Class131.skeletonsFetcher = skeletons;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "lb.E(" + (skins != null?"{...}":"null") + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ',' + (skeletons != null?"{...}":"null") + ')');
      }
   }

}
