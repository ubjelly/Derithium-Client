
final class Class75_Sub4 extends Class75 {

   static int[] anIntArray2663;
   static int[] anIntArray2664;
   private static jString aClass94_2665 = jString.createJString("Choose Option");
   private int anInt2666;
   static jString aClass94_2667 = aClass94_2665;
	public static int[] anIntArray2668 = { 
		4, 10, 4, 0, 0, 2, 0, 0, 4, 6,//0
		0, 0, 0, 0, 0, 6, 2, 4, 0, 0, //10
		0, 0, 0, -1, 0, 0, 7, 0, 0, 0, //20
		2, 0, 0, 0, 0, 0, 0, 6, 0, 3, //30
		5, 0, 0, 0, 0, 0, 0, -2, 0, 0, //40
		-1, 0, 0, 0, 0, -2, 0, 0, 0, 0, //50
		0, 5, 0, 6, 0, 0, 0, 0, 0, -2, //60
		0, 0, -1, 0, 0, -1, 0, 2, 0, -2, //70
		0, 0, 6, 0, 0, 0, 5, 0, 0, -1, //80
		-2, 0, -2, 0, 0, 0, 0, 0, 0, 0, //90
		-1, 0, 0, 0, 11, 0, 0, 0, -1, 0, //100
		0, 0, 5, 6, 10, 0, 0, 0, 0, 0, //110
		-2, 0, 0, 0, 0, 0, 0, 0, 0, 0, //120
		0, 0, 2, 0, 0, 0, 0, 4, 0, 0,//130
		4, 0, 5, 1, 0, 0, 0, 0, 0, 0,//140
		0, 0, 1, 0, 0, 0, 3, 0, 0, 2, //150
		6, 0, 0, 1, 0, 0, 6, 0, 2, 0, //160
		0, 0, 0, 4, -2, 0, 0, 0, 0, 0, //170
		0, 0, -2, 0, 0, 0, 6, 0, 0, 0, //180
		6, 0, 0, 0, 0, 0, 0, 0, 0, 2, //190
		0, 8, 0, 0, 0, 0, 0, 6, 7, 0, //200
		0, 0, 0, 0, -2, 0, 0, 0, 15, 0, //210
		0, -2, -2, 0, 0, 0, 0, 0, 0, 0, //220
		0, 0, 0, 8, 0, 0, 0, 3, 7, 14, //230
		0, 0, 0, 0, 6, 3, 0, 0, 0, 0, //240
		0, 0, -2, 0, 12, 0 };//250
   //static int[] anIntArray2668 = new int[]{-1, 0, 8, 0, 2, 0, 0, 0, 0, 12, 0, 1, 0, 3, 7, 0, 15, 6, 0, 0, 4, 7, -2, -1, 2, 0, 2, 8, 0, 0, 0, 0, -2, 5, 0, 0, 8, 3, 6, 0, 0, 0, -1, 0, -1, 0, 0, 6, -2, 0, 12, 0, 0, 0, -1, -2, 10, 0, 0, 0, 3, 0, -1, 0, 0, 5, 6, 0, 0, 8, -1, -1, 0, 8, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 6, 2, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 5, 0, 0, -2, 0, 0, 0, 0, 0, 12, 2, 0, -2, -2, 20, 0, 0, 10, 0, 15, 0, -1, 0, 8, -2, 0, 0, 0, 8, 0, 12, 0, 0, 7, 0, 0, 0, 0, 0, -1, -1, 0, 4, 5, 0, 0, 0, 6, 0, 0, 0, 0, 8, 9, 0, 0, 0, 2, -1, 0, -2, 0, 4, 14, 0, 0, 0, 24, 0, -2, 5, 0, 0, 0, 10, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 2, 1, 0, 0, 2, -1, 1, 0, 0, 0, 0, 14, 0, 0, 0, 0, 10, 5, 0, 0, 0, 0, 0, -2, 0, 0, 9, 0, 0, 8, 0, 0, 0, 0, -2, 6, 0, 0, 0, -2, 0, 3, 0, 1, 7, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 3, 0, 0};
   private int anInt2669;
   static int anInt2670 = 0;
   private int anInt2671;
   private int anInt2672;


	static final void method1349() {
		for (int id = 0; Js5CacheWorker.anInt997 > id; ++id) {
			int var2 = Class21.anIntArray441[id];
			Npc var3 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var2];
			int var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
			// if((var4 & 8) != 0) {
			// var4 += SpotAnimation.aClass3_Sub30_Sub1_532.getUByte() << 8;
			// }

			int var5;
			int var6;
			if ((var4 & 0x40) != 0) {
				var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShortA();
				var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteA();
				if ('\uffff' == var5) {
					var5 = -1;
				}

				Hashtable.method1772(var6, var5, 39, var3);
			}

			if (-1 != ~(var4 & 0x80)) {
				var3.aClass94_2825 = SpotAnimation.aClass3_Sub30_Sub1_532.getString();
				var3.anInt2814 = 100;
			}

			if (0 != (var4 & 0x8)) {
				var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
				if (var5 == '\uffff') {
					var5 = -1;
				}

				var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt1();
				boolean var7 = true;
				if (0 != ~var5 && 0 != ~var3.anInt2842 && AnimationDefinition.list(SpotAnimation.list(var5).anInt542, false).anInt1857 < AnimationDefinition.list(SpotAnimation.list(var3.anInt2842).anInt542, false).anInt1857) {
					var7 = false;
				}

				if (var7) {
					var3.anInt2842 = var5;
					var3.anInt2759 = ('\uffff' & var6) + Class44.loopCycle;
					var3.anInt2761 = 0;
					var3.anInt2805 = 0;
					var3.anInt2799 = var6 >> 16;
					var3.anInt2826 = 1;
					if (var3.anInt2759 > Class44.loopCycle) {
						var3.anInt2805 = -1;
					}

					if (var3.anInt2842 != -1 && ~var3.anInt2759 == ~Class44.loopCycle) {
						int var8 = SpotAnimation.list(var3.anInt2842).anInt542;
						if (0 != ~var8) {
							AnimationDefinition var9 = AnimationDefinition.list(var8, false);
							if (null != var9 && var9.frames != null) {
								jSocket.method1470(var3.anInt2829, var9, 183921384, var3.anInt2819, false, 0);
							}
						}
					}
				}
			}

			if ((var4 & 0x1) != 0) {
				var3.anInt2786 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShortA();
				var3.anInt2762 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
			}

			if (-1 != ~(0x10 & var4)) {
				var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteS();
				var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteA();
				var3.method1970(var6, -8, Class44.loopCycle, var5);
				var3.anInt2781 = 300 + Class44.loopCycle;
				int currentHp = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteA();
				int maxHp = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteS();
				var3.hpRatio = (currentHp * 255) / maxHp;
			}

			if (-1 != ~(var4 & 0x4)) {
				var3.anInt2772 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
				if (-65536 == ~var3.anInt2772) {
					var3.anInt2772 = -1;
				}
			}

			if ((var4 & 0x20) != 0) {
				var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
				var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteA();
				var3.method1970(var6, -8, Class44.loopCycle, var5);
				var3.anInt2781 = 300 + Class44.loopCycle;
				int currentHp = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
				int maxHp = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
				var3.hpRatio = (currentHp * 255) / maxHp;
			}

			if ((0x2 & var4) != 0) {
				if (var3.aClass90_3976.method1474(-1)) {
					Class3_Sub28_Sub8.method574(var3, false);
				}

				var3.method1987(-1, NpcDefinition.list(SpotAnimation.aClass3_Sub30_Sub1_532.getUShort()));
				var3.setSize(var3.aClass90_3976.size, 2);
				var3.idleAnimation = var3.aClass90_3976.idleAnim;
				var3.walkAnimation = var3.aClass90_3976.walkAnim;
				var3.turn180Animation = var3.aClass90_3976.turn180Animation;
				var3.turn90CWAnimation = var3.aClass90_3976.turn90CWAnimation;
				var3.turn90CCAnimation = var3.aClass90_3976.turn90CCAnimation;
				// var3.anInt2763 = var3.aClass90_3976.anInt1280;
				if (var3.aClass90_3976.method1474(-1)) {
					Class70.method1286(var3.anIntArray2755[0], false, (ObjectDefinition) null, 0, var3, var3.anIntArray2767[0], Class26.plane, (Player) null);
				}
			}

			if ((256 & var4) != 0) {
				var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteC();
				int[] var12 = new int[var5];
				int[] var13 = new int[var5];
				int[] var14 = new int[var5];

				for (int var15 = 0; ~var15 > ~var5; ++var15) {
					int var10 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
					if (var10 == '\uffff') {
						var10 = -1;
					}

					var12[var15] = var10;
					var13[var15] = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteS();
					var14[var15] = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
				}

				Class3_Sub13_Sub22.method273(var3, var14, var13, var12);
			}
		}
	}

   final void method1337(int var1, int var3) {
	   int var5 = var3 * this.anInt2666 >> 12;
	   int var7 = this.anInt2669 * var1 >> 12;
	   int var4 = this.anInt2671 * var3 >> 12;
	   int var6 = this.anInt2672 * var1 >> 12;
	   Class145.method2072(this.anInt1104, var4, var6, var5, var7, this.anInt1106, -2);
   }

   public static void method1350(byte var0) {
      try {
         anIntArray2664 = null;
         aClass94_2665 = null;
         if(var0 != 75) {
            method1350((byte)-116);
         }

         aClass94_2667 = null;
         anIntArray2668 = null;
         anIntArray2663 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ta.C(" + var0 + ')');
      }
   }

   Class75_Sub4(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var5, var6, var7);

      try {
         this.anInt2672 = var2;
         this.anInt2666 = var3;
         this.anInt2671 = var1;
         this.anInt2669 = var4;
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "ta.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }

   final void method1341(int var2, int var3) {
	   int var4 = this.anInt2671 * var2 >> 12;
	   int var5 = var2 * this.anInt2666 >> 12;
	   int var6 = var3 * this.anInt2672 >> 12;
	   int var7 = var3 * this.anInt2669 >> 12;
	   StringNode.method730(var4, this.anInt1101, var7, var5, var6);
   }

   final void method1335(int var1, int var2, int var3) {
      try {
         if(var3 == 4898) {
            int var4 = var2 * this.anInt2671 >> 12;
            int var6 = this.anInt2672 * var1 >> 12;
            int var5 = var2 * this.anInt2666 >> 12;
            int var7 = this.anInt2669 * var1 >> 12;
            Class3_Sub13_Sub5.method194(this.anInt1106, var7, this.anInt1101, this.anInt1104, var6, 4096, var5, var4);
         }
      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "ta.D(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void method1352(int var0, boolean var1, int var2, int var3, int var4) {
	   if(Canvas_Sub2.loadInterface(var3)) {
		   AbstractGraphicsBuffer.method2183(var2, var1, var4, 235, var0, SceneGraphNode.interfaceCache[var3]);
	   }
   }

   static final void method1353(LDSprite[] var0, int var1, js5 var2) {
      try {
         Class3_Sub13_Sub17.aClass153_3210 = var2;
         SceneGraphNode.aClass3_Sub28_Sub16_Sub2Array1839 = var0;
         if(var1 == -11931) {
            Class3_Sub24_Sub4.aBooleanArray3503 = new boolean[SceneGraphNode.aClass3_Sub28_Sub16_Sub2Array1839.length];
            Class134.aClass61_1758.clear();
            int var3 = Class3_Sub13_Sub17.aClass153_3210.method2120(Class3_Sub8.aClass94_2304);
            int[] var4 = Class3_Sub13_Sub17.aClass153_3210.getChildEntries(var3);

            for(int var5 = 0; ~var4.length < ~var5; ++var5) {
               Class134.aClass61_1758.insertBack(Class124.method1747(new Buffer(Class3_Sub13_Sub17.aClass153_3210.getFile(var3, var4[var5])), true));
            }

         }
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "ta.B(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   static final void method1354(int var0, int var1, boolean var2, int var3, int var4) {
      try {
         if(var4 >= Class159.anInt2020 && var4 <= Class57.anInt902) {
            var0 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var0, (byte)0, Class101.anInt1425);
            var3 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var3, (byte)0, Class101.anInt1425);
            Class3_Sub13_Sub32.method320(var1, var4, var3, (byte)-123, var0);
         }

         if(!var2) {
            aClass94_2665 = (jString)null;
         }

      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "ta.L(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

	static final void method1355() {
		InventoryNode.aClass129_2552.method1770(-124);

		int var1;
		for (var1 = 0; var1 < 32; ++var1) {
			Class163_Sub1.aLongArray2986[var1] = 0L;
		}

		for (var1 = 0; var1 < 32; ++var1) {
			Class134.aLongArray1766[var1] = 0L;
		}

		GrandExchangeItem.anInt1754 = 0;
	}

}
