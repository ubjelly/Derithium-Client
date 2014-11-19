
final class Npc extends Entity {

	static boolean aBoolean3975 = false;
	NpcDefinition aClass90_3976;
	static AbstractSprite[] aClass3_Sub28_Sub16Array3977;
	private static jString aClass94_3978 = jString.createJString("Dec");
	//static float aFloat3979;
	private static jString aClass94_3980 = jString.createJString("Jul");
	private static jString aClass94_3982 = jString.createJString("May");
	private static jString aClass94_3983 = jString.createJString("Nov");
	private static jString aClass94_3984 = jString.createJString("Mar");
	static int[] anIntArray3986 = new int[32];
	private static jString aClass94_3987 = jString.createJString("flash3:");
	static jString aClass94_3988 = aClass94_3987;
	static jString aClass94_3981 = aClass94_3987;
	private static jString aClass94_3989 = jString.createJString("Jan");
	private static jString aClass94_3990 = jString.createJString("Feb");
	static jString aClass94_3992 = jString.createJString("loginscreen");
	static js5 aClass153_3993;
	static js5Worker cacheIndex15;
	static int renderX;
	private static jString aClass94_3996 = jString.createJString("Aug");
	static int[] anIntArray3997 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
	static jString aClass94_3998 = jString.createJString(":trade:");
	private static jString aClass94_3999 = jString.createJString("Apr");
	private static jString aClass94_4000 = jString.createJString("Jun");
	//static int anInt4001;
	static int subScriptPos = 0;
	private static jString aClass94_4003 = jString.createJString("Sep");
	private static jString aClass94_4004 = jString.createJString("Oct");
	static jString[] aClass94Array3985 = new jString[]{aClass94_3989, aClass94_3990, aClass94_3984, aClass94_3999, aClass94_3982, aClass94_4000, aClass94_3980, aClass94_3996, aClass94_4003, aClass94_4004, aClass94_3983, aClass94_3978};

	public static void method1983(int var0) {
		try {
			anIntArray3986 = null;
			aClass94_3984 = null;
			aClass94_3983 = null;
			aClass94_3989 = null;
			if(var0 == -3) {
				cacheIndex15 = null;
				anIntArray3997 = null;
				aClass94_4004 = null;
				aClass94_3998 = null;
				aClass94_3999 = null;
				aClass3_Sub28_Sub16Array3977 = null;
				aClass94_3978 = null;
				aClass94_3992 = null;
				aClass94_3990 = null;
				aClass94_3996 = null;
				aClass94_3981 = null;
				aClass153_3993 = null;
				aClass94_3987 = null;
				aClass94Array3985 = null;
				aClass94_3982 = null;
				aClass94_3988 = null;
				aClass94_3980 = null;
				aClass94_4003 = null;
				aClass94_4000 = null;
			}
		} catch (RuntimeException var2) {
			throw Class44.method1067(var2, "km.N(" + var0 + ')');
		}
	}

	static final int method1984(int var0, int var2) {
		int var3 = 57 * var2 + var0;
		var3 ^= var3 << 13;
		int var4 = Integer.MAX_VALUE & 1376312589 + (var3 * var3 * 15731 - -789221) * var3;
		return (var4 & 133802063) >> 19;
	}

	protected final void finalize() {}

	final int method1871() {
		try {
			return this.anInt2820;
		} catch (RuntimeException var2) {
			throw Class44.method1067(var2, "km.MA()");
		}
	}

	final void render(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, int var11, ParticleEngine var12) {
		try {
			if(this.aClass90_3976 != null) {
				AnimationDefinition var13 = 0 != ~this.currentAnimationId && -1 == ~this.animationDelay?AnimationDefinition.list(this.currentAnimationId, false):null;
				AnimationDefinition var14 = -1 != this.currentMoveAnimation && (this.currentMoveAnimation != idleAnimation || var13 == null)?AnimationDefinition.list(this.currentMoveAnimation, false):null;
				AbstractModel var15 = this.aClass90_3976.method1476(this.aClass145Array2809, this.anInt2793, (byte)-116, this.anInt2813, this.anInt2776, this.anInt2760, this.anInt2832, var14, this.anInt2802, var13);
				if(var15 != null) {
					this.anInt2820 = var15.method1871();
					NpcDefinition var16 = this.aClass90_3976;
					if(null != var16.anIntArray1292) {
						var16 = var16.method1471((byte)-110);
					}

					AbstractModel var17;
					if(Class140_Sub6.aBoolean2910 && var16.aBoolean1249) {
						var17 = Class140_Sub3.method1957(this.aClass90_3976.aByte1287, this.aBoolean2810, null == var14?var13:var14, this.anInt2819, this.aClass90_3976.aShort1256, this.anInt2829, this.aClass90_3976.aShort1286, this.aClass90_3976.size, var15, var1, null != var14?this.anInt2813:this.anInt2832, this.anInt2831, this.aClass90_3976.aByte1275, (byte)-49);
						if(HDToolkit.openGLEnabled) {
							float var18 = HDToolkit.method1852();
							float var19 = HDToolkit.method1839();
							HDToolkit.disableDepthBuffer();
							HDToolkit.method1825(var18, -150.0F + var19);
							var17.render(0, var2, var3, var4, var5, var6, var7, var8, -1L, var11, this.aClass127_Sub1_2801);
							HDToolkit.enableDepthBuffer();
							HDToolkit.method1825(var18, var19);
						} else {
							var17.render(0, var2, var3, var4, var5, var6, var7, var8, -1L, var11, this.aClass127_Sub1_2801);
						}
					}

					this.method1971(var15);
					this.method1969(var15, var1);
					var17 = null;
					if(~this.anInt2842 != 0 && -1 != this.anInt2805) {
						SpotAnimation var21 = SpotAnimation.list(this.anInt2842);
						var17 = var21.method966(this.anInt2826, (byte)-30, this.anInt2805, this.anInt2761);
						if(var17 != null) {
							var17.move(0, -this.anInt2799, 0);
							if(var21.aBoolean536) {
								if(-1 != ~Class3_Sub13_Sub16.anInt3198) {
									var17.method1896(Class3_Sub13_Sub16.anInt3198);
								}

								if(~Class3_Sub28_Sub9.anInt3623 != -1) {
									var17.method1886(Class3_Sub28_Sub9.anInt3623);
								}

								if(0 != Class3_Sub13_Sub9.anInt3111) {
									var17.move(0, Class3_Sub13_Sub9.anInt3111, 0);
								}
							}
						}
					}

					if(!HDToolkit.openGLEnabled) {
						if(null != var17) {
							var15 = ((LDModel)var15).method1943(var17);
						}

						if(this.aClass90_3976.size == 1) {
							var15.aBoolean2699 = true;
						}

						var15.render(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, this.aClass127_Sub1_2801);
					} else {
						if(-2 == ~this.aClass90_3976.size) {
							var15.aBoolean2699 = true;
						}

						var15.render(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, this.aClass127_Sub1_2801);
						if(var17 != null) {
							if(-2 == ~this.aClass90_3976.size) {
								var17.aBoolean2699 = true;
							}

							var17.render(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, this.aClass127_Sub1_2801);
						}
					}

				}
			}
		} catch (RuntimeException var20) {
			throw Class44.method1067(var20, "km.IA(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var11 + ',' + (var12 != null?"{...}":"null") + ')');
		}
	}

	final void method1867(int var1, int var2, int var3, int var4, int var5) {
		try {
			if(this.aClass90_3976 == null) {
				;
			}
		} catch (RuntimeException var7) {
			throw Class44.method1067(var7, "km.IB(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}

	final boolean method1966(byte var1) {
		try {
			if(var1 != 17) {
				method1984(-101, 63);
			}

			return null != this.aClass90_3976;
		} catch (RuntimeException var3) {
			throw Class44.method1067(var3, "km.L(" + var1 + ')');
		}
	}

	static final boolean visibleLevels() {
		return HDToolkit.openGLEnabled ? true : EnumType.visibleLevels;
	}

	final void method1987(int var1, NpcDefinition var2) {
		try {
			this.aClass90_3976 = var2;
			if(var1 == -1) {
				if(this.aClass127_Sub1_2801 != null) {
					this.aClass127_Sub1_2801.method1759();
				}

			}
		} catch (RuntimeException var4) {
			throw Class44.method1067(var4, "km.R(" + var1 + ',' + (var2 != null?"{...}":"null") + ')');
		}
	}

	static final boolean method1988() {
			try {
				if(~Class10.anInt154 == -3) {
					if(Class83.aClass3_Sub27_1154 == null) {
						Class83.aClass3_Sub27_1154 = Class3_Sub27.method517(Class101.aClass153_1423, Class3_Sub13_Sub39.anInt3463, Class132.anInt1741);
						if(null == Class83.aClass3_Sub27_1154) {
							return false;
						}
					}

					if(Class3_Sub28_Sub4.aClass83_3579 == null) {
						Class3_Sub28_Sub4.aClass83_3579 = new Class83(Class40.aClass153_679, Texture.aClass153_3786);
					}

					if(Class101.aClass3_Sub24_Sub4_1421.method470(Class83.aClass3_Sub27_1154, -122, Class124.aClass153_1661, Class3_Sub28_Sub4.aClass83_3579, 22050)) {
						Class101.aClass3_Sub24_Sub4_1421.method471((byte)53);
						Class101.aClass3_Sub24_Sub4_1421.method506(128, Class3_Sub13_Sub36.anInt3423);
						Class101.aClass3_Sub24_Sub4_1421.method490(Class3_Sub9.aBoolean2311, Class83.aClass3_Sub27_1154, 17774);
						Class10.anInt154 = 0;
						Class83.aClass3_Sub27_1154 = null;
						Class3_Sub28_Sub4.aClass83_3579 = null;
						Class101.aClass153_1423 = null;
						return true;
					}
				}
			} catch (Exception var2) {
				var2.printStackTrace();
				Class101.aClass3_Sub24_Sub4_1421.method505((byte)-128);
				Class101.aClass153_1423 = null;
				Class83.aClass3_Sub27_1154 = null;
				Class10.anInt154 = 0;
				Class3_Sub28_Sub4.aClass83_3579 = null;
			}

			return false;
	}

}
