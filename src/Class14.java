
final class Class14 {

   static boolean aBoolean337;
   static jString aClass94_339 = jString.createJString("1");
   static int areaSoundsVolume = 127;
   static jString aClass94_341 = jString.createJString(")3");


   private static final LDIndexedSprite[] method885(int var1, js5 var2, int var3) {
         return !client.spriteExists(var2, var3, var1)?null:LookupTable.method1281(0);
   }

   public static void method886(byte var0) {
      try {
         if(var0 < 26) {
            aClass94_339 = (jString)null;
         }

         aClass94_339 = null;
         aClass94_341 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "cg.B(" + var0 + ')');
      }
   }

   static final void method887(int var0, js5 var1) {
      try {
    	 client.infinitySymbol = client.method602(0, client.infinitySymbolId, var1);
         TextureLoader.aClass3_Sub28_Sub16_Sub2Array2140 = Class157.method2176(var1, 0, UnderlayType.anInt2104);
         Class75_Sub3.old_hitmarkers = Class140_Sub6.method2027(0, Class3_Sub13_Sub23_Sub1.old_markers_id, var1);
         Class75_Sub3.new_hitmarkers = Class140_Sub6.method2027(0, Class3_Sub13_Sub23_Sub1.new_markers_id, var1);
         Js5CacheWorker.aClass3_Sub28_Sub16Array996 = Class140_Sub6.method2027(0, client.anInt2195, var1);
         Class3_Sub13_Sub31.aClass3_Sub28_Sub16Array3373 = Class140_Sub6.method2027(0, NodeSub.anInt2575, var1);
         Npc.aClass3_Sub28_Sub16Array3977 = Class140_Sub6.method2027(0, client.anInt380, var1);
         Class166.aClass3_Sub28_Sub16Array2072 = Class140_Sub6.method2027(0, Class3_Sub13_Sub29.anInt3356, var1);
         MillisTimer.aClass3_Sub28_Sub16Array2690 = Class140_Sub6.method2027(0, MillisTimer.anInt2689, var1);
         Class45.aClass3_Sub28_Sub16_736 =  Class140_Sub6.method2027(0, Class3_Sub13_Sub4.anInt3061, var1);
         client.mapscenes = Class3_Sub13_Sub23_Sub1.method28622222(0, client.mapscenesId, var1);
         client.mapbackSprte = InterfaceChangeNode.a(client.mapbackId, var1, true);//Class3_Sub28_Sub11.method602(0, client.mapbackId, (byte)-18, var1);
         client.set_464 = Class3_Sub13_Sub23_Sub1.method286(0, client.set_464_id, var1);
         client.set_530 = Class3_Sub13_Sub23_Sub1.method286(0, client.set_530_id, var1);
         client.set_562 = Class3_Sub13_Sub23_Sub1.method286(0, client.set_562_id, var1);
         client.set_602 = Class3_Sub13_Sub23_Sub1.method286(0, client.set_602_id, var1);
         client.revision_images = Class3_Sub13_Sub23_Sub1.method286(0, client.revision_images_id, var1);
         Class139.aClass3_Sub28_Sub16Array1825 = Class3_Sub13_Sub23_Sub1.method286(0, Class75_Sub1.anInt2633, var1);
         Class80.aClass3_Sub28_Sub16Array1136 = Class3_Sub13_Sub23_Sub1.method286(0, Class40.anInt678, var1);
         SceneGraphNode.aClass109Array1831 = Class85.method1424(var1, (byte)-12, 0, Class3_Sub15.anInt2436);
         Class3_Sub13_Sub22.aClass109Array3270 = Class85.method1424(var1, (byte)-12, 0, Class3_Sub28_Sub18.anInt3757);
         client.getSmallFont().method697(Class3_Sub13_Sub22.aClass109Array3270, (int[])null);
         client.getRegularFont().method697(Class3_Sub13_Sub22.aClass109Array3270, (int[])null);
         client.getBoldFont().method697(Class3_Sub13_Sub22.aClass109Array3270, (int[])null);
         if(HDToolkit.openGLEnabled) {
            Class141.aClass109_Sub1Array1843 = method885(Class45.anInt735, var1, 0);
            for(int var2 = 0; Class141.aClass109_Sub1Array1843.length > var2; ++var2) {
               Class141.aClass109_Sub1Array1843[var2].method1675();
            }
         }
         LDSprite var10 = Class40.method1043(0, var1, var0 + -3199, Class93.anInt1325);
         var10.resize();
         if(HDToolkit.openGLEnabled) {
            Class57.aClass3_Sub28_Sub16_895 = new HDSprite(var10);
         } else {
            Class57.aClass3_Sub28_Sub16_895 = var10;
         }

         /*LDSprite[] var3 = Class157.method2176(0, 32767, IntegerNode.anInt2471, var1);

         for(var4 = 0; ~var4 > ~var3.length; ++var4) {
            var3[var4].resize();
         }

         if(!HDToolkit.openGLEnabled) {
            Class3_Sub13_Sub39.aClass3_Sub28_Sub16Array3458 = var3;
         } else {
            Class3_Sub13_Sub39.aClass3_Sub28_Sub16Array3458 = new AbstractSprite[var3.length];

            for(var4 = 0; var4 < var3.length; ++var4) {
               Class3_Sub13_Sub39.aClass3_Sub28_Sub16Array3458[var4] = new HDSprite(var3[var4]);
            }
         }*/

         int var5 = (int)((double)var0 * Math.random()) - 10;
         int var4 = (int)(21.0D * Math.random()) - 10;
         int var6 = -10 + (int)(21.0D * Math.random());
         int var7 = -20 + (int)(Math.random() * 41.0D);

         for(int var8 = 0; var8 < TextureLoader.aClass3_Sub28_Sub16_Sub2Array2140.length; ++var8) {
            TextureLoader.aClass3_Sub28_Sub16_Sub2Array2140[var8].method669(var4 + var7, var7 + var5, var7 + var6);
         }

         if(!HDToolkit.openGLEnabled) {
            Entity.aClass3_Sub28_Sub16Array2839 = TextureLoader.aClass3_Sub28_Sub16_Sub2Array2140;
         } else {
            Entity.aClass3_Sub28_Sub16Array2839 = new AbstractSprite[TextureLoader.aClass3_Sub28_Sub16_Sub2Array2140.length];

            for(int var8 = 0; TextureLoader.aClass3_Sub28_Sub16_Sub2Array2140.length > var8; ++var8) {
               Entity.aClass3_Sub28_Sub16Array2839[var8] = new HDSprite(TextureLoader.aClass3_Sub28_Sub16_Sub2Array2140[var8]);
            }
         }
         if(client.mapbackSource == null && !HDToolkit.openGLEnabled) { //Minimap fix not here
	         LDIndexedSprite sprite = (LDIndexedSprite) client.mapbackSprte;
	         //sprite.method1675();
	         client.mapbackSource = new int[sprite.height];
	         client.mapbackDest = new int[sprite.height];
	         client.compassSource = new int[33];
	         client.compassDest = new int[33];
	         for (int id = 5; id < sprite.height; id++) {
					int i_44_ = 999;
					int i_45_ = 0;
					for (int i_46_ = 25; i_46_ < 172; i_46_++) {
						if (sprite.indicators[i_46_ + sprite.width * id] != 0 || i_46_ <= 34 && id <= 34) {
							if (i_44_ != 999) {
								i_45_ = i_46_;
								break;
							}
						} else if (i_44_ == 999)
							i_44_ = i_46_;
					}
					client.mapbackSource[id - 5] = i_44_ - 25;
					client.mapbackDest[id - 5] = i_45_ - i_44_;
				}
				for (int id = 0; id < 33; id++) {
					int i_40_ = 999;
					int i_41_ = 0;
					for (int i_42_ = 0; i_42_ < 34; i_42_++) {
						if (sprite.indicators[(sprite.width * id) + i_42_] != 0) {
							if (i_40_ != 999) {
								i_41_ = i_42_;
								break;
							}
						} else if (i_40_ == 999)
							i_40_ = i_42_;
					}
					client.compassSource[id] = i_40_;
					client.compassDest[id] = i_41_ - i_40_;
				}
         }
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "cg.A(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

}
