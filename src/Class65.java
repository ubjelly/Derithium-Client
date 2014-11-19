
final class Class65 {

   static Deque aClass61_983 = new Deque();
   static int anInt984 = 0;
   static jString aClass94_985 = jString.createJString("Fps:");
   static Buffer[] aClass3_Sub30Array986 = new Buffer[2048];
   static int mapFlagX = 0;
   static int anInt990;
   static int currentCursorId = -1;
   static jString aClass94_992 = jString.createJString("http:)4)4");

	static final int[] arrayCopy(int[] var0) {
		if (null != var0) {
			int[] var2 = new int[var0.length];
			ArrayUtils.arrayCopy(var0, 0, var2, 0, var0.length);
			return var2;
		} else {
			return null;
		}
	}

	static final int method1234(int var0, int var1, int var2) {
		int var4 = var1 / var0;
		int var6 = var2 / var0;
		int var7 = var2 & var0 - 1;
		int var5 = -1 + var0 & var1;
		int var8 = Class3_Sub28_Sub3.method543(var4, var6);
		int var9 = Class3_Sub28_Sub3.method543(var4 + 1, var6);
		int var10 = Class3_Sub28_Sub3.method543(var4, 1 + var6);
		int var11 = Class3_Sub28_Sub3.method543(1 + var4, var6 + 1);
		int var12 = Class3_Sub13_Sub23.method275(var8, var9, var5, var0);
		int var13 = Class3_Sub13_Sub23.method275(var10, var11, var5, var0);
		return Class3_Sub13_Sub23.method275(var12, var13, var7, var0);
	}

   static final void method1235(int x, int y, int width, int height) {
	   /**
	    *  var20 = var11.anInt168 + var13;
                           var21 = 15 + var14;
                           Class126.aClass3_Sub28_Sub17_1669.method688(RenderAnimationDefinition.method903(new RSString[]{Class3_Sub13_Sub16.aClass94_3196, Class72.method1298((byte)9, AnimationDefinition.anInt1862)}, (byte)-69), var20, var21, 16776960, -1);
                           var21 += 15;
                           Runtime var57 = Runtime.getRuntime();
                           var23 = (int)((var57.totalMemory() + -var57.freeMemory()) / 1024L);
                           var24 = 16776960;
                           if(~var23 < -65537) {
                              var24 = 16711680;
                           }

                           Class126.aClass3_Sub28_Sub17_1669.method688(RenderAnimationDefinition.method903(new RSString[]{Class3_Sub28_Sub10_Sub1.aClass94_4057, Class72.method1298((byte)9, var23), Class151_Sub1.aClass94_2951}, (byte)-128), var20, var21, var24, -1);
                           var21 += 15;
                           if(HDToolkit.openGLEnabled) {
                              var24 = 16776960;
                              var25 = (Class31.anInt580 + Class31.anInt585 + Class31.anInt584) / 1024;
                              if(65536 < var25) {
                                 var24 = 16711680;
                              }

                              Class126.aClass3_Sub28_Sub17_1669.method688(RenderAnimationDefinition.method903(new RSString[]{Class118.aClass94_1622, Class72.method1298((byte)9, var25), Class151_Sub1.aClass94_2951}, (byte)-97), var20, var21, var24, -1);
                              var21 += 15;
                           }

                           var24 = 16776960;
                           var25 = 0;
                           var47 = 0;
                           var26 = 0;

                           for(var28 = 0; var28 < client.indexCount; ++var28) {
                              var25 += Buffer.aClass151_Sub1Array2601[var28].method2108((byte)1);
                              var26 += Buffer.aClass151_Sub1Array2601[var28].method2102(0);
                              var47 += Buffer.aClass151_Sub1Array2601[var28].method2106(1);
                           }

                           var29 = 10000 * var26 / var25;
                           var28 = var47 * 100 / var25;
                           RSString var55 = RenderAnimationDefinition.method903(new RSString[]{Class20.aClass94_436, Class3_Sub23.method407(0, true, 2, (long)var29, 2), Class3_Sub21.aClass94_2498, Class72.method1298((byte)9, var28), Class10.aClass94_148}, (byte)-113);
                           Class3_Sub13.aClass3_Sub28_Sub17_2379.method688(var55, var20, var21, var24, -1);
                           var21 += 12;
	    */
	   if(Huffman.anInt638 == 1) {
		   Class139.aClass3_Sub28_Sub16Array1825[js5Worker.anInt2958 / 100].method643(-8 + Class70.anInt1053, -8 + UpdateServerNode.anInt4062);
	   }

	   if(Huffman.anInt638 == 2) {
		   Class139.aClass3_Sub28_Sub16Array1825[4 + js5Worker.anInt2958 / 100].method643(Class70.anInt1053 + -8, -8 + UpdateServerNode.anInt4062);
	   }

	   Class3_Sub13_Sub37.method347(true);
	   if(Class20.aBoolean438) {
		   //System.out.println(x+":"+y+":"+width+":"+height);
		   System.out.println("X: " + Class163_Sub1.anInt2993 + " Y: " + Class38_Sub1.anInt2614);
		   int i = (x + 512) - 5;
		   int i_0_ = 20 + y;
		   int i_1_ = 16776960;
		   client.getRegularFont().method688(client.method903(new jString[]{Class3_Sub13_Sub16.aClass94_3196, Class72.method1298(AnimationDefinition.anInt1862)}), i, i_0_, 16776960, -1);
		   i_0_ += 15;
		   Runtime runtime = Runtime.getRuntime();
		   int i_2_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
		   client.getRegularFont().method688(client.method903(new jString[]{UpdateServerNode.aClass94_4057, Class72.method1298(i_2_), js5Worker.aClass94_2951}), i, i_0_, i_1_, -1);
		   i_0_ += 15;
		  /* if(HDToolkit.openGLEnabled) {
			   i_1_ = 16776960;
               int var25 = (Class31.anInt580 + Class31.anInt585 + Class31.anInt584) / 1024;

               Class126.aClass3_Sub28_Sub17_1669.method688(RenderAnimationDefinition.method903(new RSString[]{Class118.aClass94_1622, Class72.method1298(var25), Class151_Sub1.aClass94_2951}, (byte)-97), i, i_0_, i_1_, -1);
               i_0_ += 15;
		   }*/
		   i_0_ += 15;
           /*int var24 = 16776960;
           int var25 = 0;
           int var47 = 0;
           int var26 = 0;

           for(int var28 = 0; var28 < 16; ++var28) {
              var25 += Buffer.aClass151_Sub1Array2601[var28].method2108((byte)1);
              var26 += Buffer.aClass151_Sub1Array2601[var28].method2102(0);
              var47 += Buffer.aClass151_Sub1Array2601[var28].method2106(1);
           }

           int var29 = 10000 * var26 / var25;
           int var28 = var47 * 100 / var25;
           jString var55 = client.method903(new jString[]{Class20.aClass94_436, Class3_Sub23.method407(0, true, 2, (long)var29, 2), Class3_Sub21.aClass94_2498, Class72.method1298(var28), Class10.aClass94_148}, (byte)-113);
           client.getSmallFont().method688(var55, i, i_0_, var24, -1);
           i_0_ += 12;*/
	   }
   }

   static final void method1236(js5 var0, js5 var1, int var2) {
      try {
         Class47.aClass153_748 = var1;
         if(var2 >= -94) {
            aClass94_992 = (jString)null;
         }

         Queue.aClass153_332 = var0;
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "ja.F(" + (var0 != null?"{...}":"null") + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   static final void method1237(int var0, int var1) {
      try {
         Class44_Sub1.anInt2626 = var1 / var0;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "ja.D(" + var0 + ',' + var1 + ')');
      }
   }

   public static void method1238(int var0) {
      try {
         aClass94_992 = null;
         if(var0 < -83) {
            aClass61_983 = null;
            aClass94_985 = null;
            aClass3_Sub30Array986 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ja.B(" + var0 + ')');
      }
   }

   static final void method1239(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      try {
         if(-2 < ~var0) {
            var0 = 1;
         }

         if(1 > var3) {
            var3 = 1;
         }

         if(HDToolkit.openGLEnabled) {
            int var6 = var3 + -334;
            if(0 <= var6) {
               if(~var6 < -101) {
                  var6 = 100;
               }
            } else {
               var6 = 0;
            }

            int var7 = var6 * (Class3_Sub13_Sub3.aShort3052 + -DisplayModeInformation.aShort1444) / 100 + DisplayModeInformation.aShort1444;
            if(Class3_Sub13_Sub19.aShort3241 <= var7) {
               if(PacketParser.aShort83 < var7) {
                  var7 = PacketParser.aShort83;
               }
            } else {
               var7 = Class3_Sub13_Sub19.aShort3241;
            }

            int var8 = var7 * var3 * 512 / (var0 * 334);
            int var9;
            int var10;
            short var12;
            if(var8 >= Class26.aShort505) {
               if(~Class3_Sub13_Sub23_Sub1.aShort4038 > ~var8) {
                  var12 = Class3_Sub13_Sub23_Sub1.aShort4038;
                  var7 = var12 * var0 * 334 / (var3 * 512);
                  if(~Class3_Sub13_Sub19.aShort3241 < ~var7) {
                     var7 = Class3_Sub13_Sub19.aShort3241;
                     var9 = var12 * var0 * 334 / (512 * var7);
                     var10 = (-var9 + var3) / 2;
                     if(var5) {
                        GraphicsHD.initDefaultBounds();
                        GraphicsHD.fillRect(var4, var2, var0, var10, 0);
                        GraphicsHD.fillRect(var4, var2 + (var3 - var10), var0, var10, 0);
                     }

                     var3 -= var10 * 2;
                     var2 += var10;
                  }
               }
            } else {
               var12 = Class26.aShort505;
               var7 = 334 * var0 * var12 / (512 * var3);
               if(PacketParser.aShort83 < var7) {
                  var7 = PacketParser.aShort83;
                  var9 = 512 * var3 * var7 / (334 * var12);
                  var10 = (var0 - var9) / 2;
                  if(var5) {
                     GraphicsHD.initDefaultBounds();
                     GraphicsHD.fillRect(var4, var2, var10, var3, 0);
                     GraphicsHD.fillRect(var0 + (var4 - var10), var2, var10, var3, 0);
                  }

                  var4 += var10;
                  var0 -= 2 * var10;
               }
            }

            Hashtable.anInt1705 = var7 * var3 / 334;
         }

         HintIcon.anInt1358 = (short)var0;
         Canvas_Sub2.anInt31 = (short)var3;
         if(var1 < 11) {
            arrayCopy((int[])null);
         }

         Class3_Sub28_Sub3.anInt3564 = var2;
         Class163_Sub1.anInt2989 = var4;
      } catch (RuntimeException var11) {
         throw Class44.method1067(var11, "ja.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   static final void method1240() {
         client.setRegularFont(null);
         Class75_Sub3.old_hitmarkers = null;
         Class75_Sub3.new_hitmarkers = null;
         Class139.aClass3_Sub28_Sub16Array1825 = null;
         Class3_Sub13_Sub22.aClass109Array3270 = null;
         Class157.aClass3_Sub28_Sub17_Sub1_2000 = null;
         TextureLoader.aClass3_Sub28_Sub16_Sub2Array2140 = null;
         Entity.aClass3_Sub28_Sub16Array2839 = null;
         MillisTimer.aClass3_Sub28_Sub16Array2690 = null;
         Npc.aClass3_Sub28_Sub16Array3977 = null;
         client.setBoldFont(null);
         Class57.aClass3_Sub28_Sub16_895 = null;
         Class80.aClass3_Sub28_Sub16Array1136 = null;
         client.setSmallFont(null);
         Class45.aClass3_Sub28_Sub16_736 = null;
         Js5CacheWorker.aClass3_Sub28_Sub16Array996 = null;
         Class3_Sub13_Sub39.aClass3_Sub28_Sub16Array3458 = null;
         Class166.aClass3_Sub28_Sub16Array2072 = null;
         Class3_Sub13_Sub31.aClass3_Sub28_Sub16Array3373 = null;
         SceneGraphNode.aClass109Array1831 = null;
   }

}
