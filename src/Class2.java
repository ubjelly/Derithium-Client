
final class Class2 {
	
	private static jString aClass94_68 = jString.createJString("glow1:");

	static int anInt59 = 0;
	static jString aClass94_60 = aClass94_68;
	int anInt61;
	static jString aClass94_62 = aClass94_68;
	static short[] aShortArray63 = new short[]{(short)960, (short)957, (short)-21568, (short)-21571, (short)22464};
	int anInt64;
	//static int anInt65;
	static boolean allowMembers = false;
	static int anInt67;
	boolean aBoolean69 = false;
	static Interface5[] anInterface5Array70;

	static final boolean method73(short var0) {
		if(var0 != 47 && ~var0 != -6 && var0 != 43 && ~var0 != -36 && ~var0 != -59 && -23 != ~var0 && var0 != 40 && var0 != 3) {
			if(-10 != ~var0 && ~var0 != -13 && -1007 != ~var0 && -1004 != ~var0) {
				return var0 != 25 && -24 != ~var0 && 48 != var0 && var0 != 7 && -14 != ~var0?var0 == 8 || var0 == 32 || ~var0 == -29 || ~var0 == -60 || ~var0 == -52 || -42 == ~var0:true;
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	final void method74(byte var1, Buffer var2, int var3) {
		try {
			while(true) {
				int var4 = var2.getUByte();
				if(-1 == ~var4) {
					if(var1 > -108) {
						this.method74((byte)85, (Buffer)null, 63);
					}

					return;
				}

				this.method79(var4, var2, var3);
			}
		} catch (RuntimeException var5) {
			throw Class44.method1067(var5, "aa.F(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
		}
	}

	static final void method75(jInterface[] var0, boolean var1, int var2) {
		if (var1) {
			for (int var3 = 0; ~var3 > ~var0.length; ++var3) {
				jInterface var4 = var0[var3];
				if (null != var4) {
					if (var4.type == 0) {
						if (null != var4.aClass11Array262) {
							method75(var4.aClass11Array262, true, var2);
						}

						OverridedInterface var5 = (OverridedInterface) Class3_Sub13_Sub17.aClass130_3208.get((long) var4.uid);
						if (null != var5) {
							Class3_Sub8.method124(var2, var5.uid);
						}
					}

					InterfaceListener var7;
					if (~var2 == -1 && null != var4.anObjectArray206) {
						var7 = new InterfaceListener();
						var7.objectData = var4.anObjectArray206;
						var7.aClass11_2449 = var4;
						Light.method1065(var7);
					}

					if (-2 == ~var2 && var4.anObjectArray176 != null) {
						if (-1 >= ~var4.anInt191) {
							jInterface var8 = Class7.getInterface(var4.uid);
							if (null == var8 || null == var8.aClass11Array262 || ~var4.anInt191 <= ~var8.aClass11Array262.length || var8.aClass11Array262[var4.anInt191] != var4) {
								continue;
							}
						}

						var7 = new InterfaceListener();
						var7.objectData = var4.anObjectArray176;
						var7.aClass11_2449 = var4;
						Light.method1065(var7);
					}
				}
			}

		}
	}

	static final boolean method76(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		try {
			int var12;
			int var13;
			for(var12 = 0; 104 > var12; ++var12) {
				for(var13 = 0; -105 < ~var13; ++var13) {
					Class84.anIntArrayArray1160[var12][var13] = 0;
					Class97.anIntArrayArray1373[var12][var13] = 99999999;
				}
			}

			Class84.anIntArrayArray1160[var11][var3] = 99;
			Class97.anIntArrayArray1373[var11][var3] = 0;
			var13 = var3;
			var12 = var11;
			byte var14 = 0;
			Class3_Sub13_Sub38.anIntArray3456[var14] = var11;
			boolean var16 = false;
			int var15 = 0;
			int var27 = var14 + 1;
			Class45.anIntArray729[var14] = var3;
			int[][] var17 = Class86.collisionMap[Class26.plane].collisionFlags;

			int var18;
			while(var15 != var27) {
				var12 = Class3_Sub13_Sub38.anIntArray3456[var15];
				var13 = Class45.anIntArray729[var15];
				var15 = 4095 & var15 - -1;
				if(var8 == var12 && ~var4 == ~var13) {
					var16 = true;
					break;
				}

				if(-1 != ~var1) {
					if((5 > var1 || -11 == ~var1) && Class86.collisionMap[Class26.plane].method1488(var4, var12, false, var13, var8, -1 + var1, 2, var7)) {
						var16 = true;
						break;
					}

					if(var1 < 10 && Class86.collisionMap[Class26.plane].method1492(var4, var1 + -1, var8, var13, 2, var7, var12, 88)) {
						var16 = true;
						break;
					}
				}

				if(0 != var0 && ~var6 != -1 && Class86.collisionMap[Class26.plane].method1498(true, var8, var13, var12, 2, var0, var2, var4, var6)) {
					var16 = true;
					break;
				}

				var18 = Class97.anIntArrayArray1373[var12][var13] - -1;
				if(var12 > 0 && ~Class84.anIntArrayArray1160[var12 + -1][var13] == -1 && 0 == (var17[-1 + var12][var13] & 19661070) && ~(var17[-1 + var12][var13 + 1] & 19661112) == -1) {
					Class3_Sub13_Sub38.anIntArray3456[var27] = var12 + -1;
					Class45.anIntArray729[var27] = var13;
					var27 = 1 + var27 & 4095;
					Class84.anIntArrayArray1160[var12 - 1][var13] = 2;
					Class97.anIntArrayArray1373[-1 + var12][var13] = var18;
				}

				if(102 > var12 && ~Class84.anIntArrayArray1160[1 + var12][var13] == -1 && 0 == (var17[2 + var12][var13] & 19661187) && 0 == (var17[var12 + 2][1 + var13] & 19661280)) {
					Class3_Sub13_Sub38.anIntArray3456[var27] = 1 + var12;
					Class45.anIntArray729[var27] = var13;
					var27 = 4095 & var27 + 1;
					Class84.anIntArrayArray1160[var12 - -1][var13] = 8;
					Class97.anIntArrayArray1373[var12 - -1][var13] = var18;
				}

				if(var13 > 0 && ~Class84.anIntArrayArray1160[var12][var13 + -1] == -1 && (19661070 & var17[var12][-1 + var13]) == 0 && ~(var17[var12 + 1][var13 - 1] & 19661187) == -1) {
					Class3_Sub13_Sub38.anIntArray3456[var27] = var12;
					Class45.anIntArray729[var27] = -1 + var13;
					Class84.anIntArrayArray1160[var12][-1 + var13] = 1;
					Class97.anIntArrayArray1373[var12][-1 + var13] = var18;
					var27 = 4095 & 1 + var27;
				}

				if(~var13 > -103 && ~Class84.anIntArrayArray1160[var12][var13 + 1] == -1 && ~(var17[var12][2 + var13] & 19661112) == -1 && -1 == ~(var17[1 + var12][var13 + 2] & 19661280)) {
					Class3_Sub13_Sub38.anIntArray3456[var27] = var12;
					Class45.anIntArray729[var27] = var13 + 1;
					Class84.anIntArrayArray1160[var12][1 + var13] = 4;
					var27 = 1 + var27 & 4095;
					Class97.anIntArrayArray1373[var12][var13 - -1] = var18;
				}

				if(var12 > 0 && var13 > 0 && -1 == ~Class84.anIntArrayArray1160[-1 + var12][-1 + var13] && -1 == ~(19661112 & var17[-1 + var12][var13]) && 0 == (var17[-1 + var12][-1 + var13] & 19661070) && 0 == (19661187 & var17[var12][-1 + var13])) {
					Class3_Sub13_Sub38.anIntArray3456[var27] = -1 + var12;
					Class45.anIntArray729[var27] = -1 + var13;
					Class84.anIntArrayArray1160[-1 + var12][-1 + var13] = 3;
					Class97.anIntArrayArray1373[-1 + var12][-1 + var13] = var18;
					var27 = 4095 & var27 + 1;
				}

				if(-103 < ~var12 && 0 < var13 && ~Class84.anIntArrayArray1160[1 + var12][var13 + -1] == -1 && -1 == ~(var17[var12 - -1][var13 - 1] & 19661070) && -1 == ~(19661187 & var17[2 + var12][var13 + -1]) && -1 == ~(19661280 & var17[var12 + 2][var13])) {
					Class3_Sub13_Sub38.anIntArray3456[var27] = var12 - -1;
					Class45.anIntArray729[var27] = var13 - 1;
					var27 = 4095 & 1 + var27;
					Class84.anIntArrayArray1160[var12 - -1][-1 + var13] = 9;
					Class97.anIntArrayArray1373[1 + var12][var13 + -1] = var18;
				}

				if(-1 > ~var12 && -103 < ~var13 && 0 == Class84.anIntArrayArray1160[var12 - 1][var13 + 1] && ~(var17[-1 + var12][var13 - -1] & 19661070) == -1 && 0 == (19661112 & var17[-1 + var12][var13 - -2]) && ~(19661280 & var17[var12][var13 + 2]) == -1) {
					Class3_Sub13_Sub38.anIntArray3456[var27] = var12 - 1;
					Class45.anIntArray729[var27] = 1 + var13;
					Class84.anIntArrayArray1160[var12 - 1][1 + var13] = 6;
					Class97.anIntArrayArray1373[-1 + var12][1 + var13] = var18;
					var27 = 1 + var27 & 4095;
				}

				if(-103 < ~var12 && ~var13 > -103 && -1 == ~Class84.anIntArrayArray1160[1 + var12][1 + var13] && -1 == ~(19661112 & var17[var12 - -1][2 + var13]) && -1 == ~(19661280 & var17[var12 + 2][var13 - -2]) && (19661187 & var17[var12 - -2][var13 + 1]) == 0) {
					Class3_Sub13_Sub38.anIntArray3456[var27] = 1 + var12;
					Class45.anIntArray729[var27] = var13 + 1;
					var27 = var27 - -1 & 4095;
					Class84.anIntArrayArray1160[var12 - -1][var13 + 1] = 12;
					Class97.anIntArrayArray1373[1 + var12][1 + var13] = var18;
				}
			}

			AbstractTimer.anInt1692 = 0;
			int var19;
			if(!var16) {
				if(!var5) {
					return false;
				}

				var18 = 1000;
				var19 = 100;
				byte var20 = 10;

				for(int var21 = -var20 + var8; ~var21 >= ~(var20 + var8); ++var21) {
					for(int var22 = var4 + -var20; ~var22 >= ~(var20 + var4); ++var22) {
						if(-1 >= ~var21 && -1 >= ~var22 && -105 < ~var21 && 104 > var22 && Class97.anIntArrayArray1373[var21][var22] < 100) {
							int var23 = 0;
							int var24 = 0;
							if(~var21 <= ~var8) {
								if(~var21 < ~(-1 + var0 + var8)) {
									var23 = var21 + 1 + -var0 + -var8;
								}
							} else {
								var23 = var8 - var21;
							}

							if(~var4 >= ~var22) {
								if(~var22 < ~(-1 + var4 + var6)) {
									var24 = -var4 + -var6 + 1 + var22;
								}
							} else {
								var24 = -var22 + var4;
							}

							int var25 = var23 * var23 + var24 * var24;
							if(var25 < var18 || ~var18 == ~var25 && Class97.anIntArrayArray1373[var21][var22] < var19) {
								var13 = var22;
								var19 = Class97.anIntArrayArray1373[var21][var22];
								var18 = var25;
								var12 = var21;
							}
						}
					}
				}

				if(~var18 == -1001) {
					return false;
				}

				if(var11 == var12 && ~var13 == ~var3) {
					return false;
				}

				AbstractTimer.anInt1692 = 1;
			}

			byte var28 = 0;
			Class3_Sub13_Sub38.anIntArray3456[var28] = var12;
			var15 = var28 + 1;
			Class45.anIntArray729[var28] = var13;
			var18 = var19 = Class84.anIntArrayArray1160[var12][var13];
			if(var10 <= 2) {
				aClass94_60 = (jString)null;
			}

			for(; ~var11 != ~var12 || ~var3 != ~var13; var18 = Class84.anIntArrayArray1160[var12][var13]) {
				if(var19 != var18) {
					Class3_Sub13_Sub38.anIntArray3456[var15] = var12;
					Class45.anIntArray729[var15++] = var13;
					var19 = var18;
				}

				if((var18 & 2) != 0) {
					++var12;
				} else if(~(8 & var18) != -1) {
					--var12;
				}

				if((var18 & 1) == 0) {
					if(~(var18 & 4) != -1) {
						--var13;
					}
				} else {
					++var13;
				}
			}

			if(~var15 >= -1) {
				if(1 != var9) {
					return true;
				} else {
					return false;
				}
			} else {
				Class3_Sub13_Sub27.method299(var15, var9);
				return true;
			}
		} catch (RuntimeException var26) {
			throw Class44.method1067(var26, "aa.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ',' + var11 + ')');
		}
	}

	final LDIndexedSprite method77(int var1, byte var2) {
		try {
			LDIndexedSprite var3 = (LDIndexedSprite)Class3_Sub13_Sub31.aClass93_3369.get((long)(var1 << 16 | this.anInt64));
			if(var3 != null) {
				return var3;
			} else {
				KeyboardHandler.aClass153_1916.method2144(this.anInt64);
				int var4 = 125 % ((var2 - -21) / 50);
				var3 = jString.method1539(0, true, this.anInt64, KeyboardHandler.aClass153_1916);
				if(var3 != null) {
					var3.method1668(TextureLoader.anInt2136, Class46.anInt740, AbstractGraphicsBuffer.anInt2015);
					var3.trimWidth = var3.width;
					var3.trimHeight = var3.height;

					for(int var5 = 0; ~var1 < ~var5; ++var5) {
						var3.method1674();
					}

					Class3_Sub13_Sub31.aClass93_3369.put(var3, (long)(var1 << 16 | this.anInt64));
				}

				return var3;
			}
		} catch (RuntimeException var6) {
			throw Class44.method1067(var6, "aa.D(" + var1 + ',' + var2 + ')');
		}
	}

	static final void method78(int var0, boolean var1, int var2) {
		try {
			++js5.anInt1944;
			Class3_Sub13_Sub1.outputStream.putPacket(240);
			Class3_Sub13_Sub1.outputStream.putInt(var2);
			//if(!var1) {
			//	Class3_Sub13_Sub1.outputStream.putLEShort(var0);
			//}
		} catch (RuntimeException var4) {
			throw Class44.method1067(var4, "aa.E(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	private final void method79(int var1, Buffer var2, int var3) {
			if(var1 == 1) {
				this.anInt64 = var2.getUShort();
			} else if(var1 != 2) {
				if(~var1 != -4) {
					if(var1 == 4) {
						this.anInt64 = -1;
					}
				} else {
					this.aBoolean69 = true;
				}
			} else {
				this.anInt61 = var2.getMidInt();
			}
	}

	static final Class2 list(int var0) {
		Class2 var2 = (Class2)Class3_Sub13_Sub34.aClass93_3412.get((long)var0);
		if(var2 != null) {
			return var2;
		} else {
			byte[] var3 = Class164.cacheIndex2.getFile(36, var0);
	
			var2 = new Class2();
			//System.out.println(var0);
			if(var3 != null && var0!=0 && var0!=25) {
				var2.method74((byte)-115, new Buffer(var3), var0);
			}
			
			Class3_Sub13_Sub34.aClass93_3412.put(var2, (long)var0);
			return var2;
		}
	   }

	public static void method80() {
		aClass94_60 = null;
		aShortArray63 = null;
		aClass94_68 = null;
		anInterface5Array70 = null;
		aClass94_62 = null;
	}

	static final void method81(byte var0, jInterface var1) {
		try {
			if(var0 != -128) {
				method75((jInterface[])null, true, 21);
			}

			int var2 = var1.clientCode;
			if(324 != var2) {
				if(-326 != ~var2) {
					if(var2 == 327) {
						var1.rotateX = 150;
						var1.rotateY = 2047 & (int)(Math.sin((double)Class44.loopCycle / 40.0D) * 256.0D);
						var1.mediaTypeDisabled = 5;
						var1.mediaIdDisabled = -1;
					} else if(var2 == 328) {
						if(null == TextureLoader.selfPlayer.username) {
							var1.mediaIdDisabled = 0;
						} else {
							var1.rotateX = 150;
							var1.rotateY = 2047 & (int)(256.0D * Math.sin((double)Class44.loopCycle / 40.0D));
							var1.mediaTypeDisabled = 5;
							var1.mediaIdDisabled = 2047 + ((int)TextureLoader.selfPlayer.username.toLong() << 11);
							var1.anInt260 = TextureLoader.selfPlayer.anInt2793;
							var1.anInt267 = 0;
							var1.disabledAnim = TextureLoader.selfPlayer.currentMoveAnimation;
							var1.anInt283 = TextureLoader.selfPlayer.anInt2813;
						}
					} else if(var2 == 329) {
						if(null == TextureLoader.selfPlayer.username) {
							var1.mediaIdDisabled = 0;
						} else {
							var1.rotateX = 150;
							var1.rotateY = 2047 & (int)(256.0D * Math.sin((double)Class44.loopCycle / 40.0D));
							var1.mediaTypeDisabled = 5;
							var1.mediaIdDisabled = 2047 + ((int)TextureLoader.selfPlayer.username.toLong() << 11);
							var1.anInt260 = TextureLoader.selfPlayer.anInt2793;
							var1.anInt267 = 0;
							var1.disabledAnim = TextureLoader.selfPlayer.currentMoveAnimation;
							var1.anInt283 = TextureLoader.selfPlayer.anInt2813;
						}
					}
				} else {
					if(-1 == Class3_Sub13_Sub21.anInt3260) {
						Class84.anInt1165 = var1.enabledSprite;
						Class3_Sub13_Sub21.anInt3260 = var1.disabledSprite;
					}

					if(!Class77.aClass52_1112.isFemale) {
						var1.disabledSprite = Class3_Sub13_Sub21.anInt3260;
					} else {
						var1.disabledSprite = Class84.anInt1165;
					}

				}
			} else {
				if(-1 == Class3_Sub13_Sub21.anInt3260) {
					Class3_Sub13_Sub21.anInt3260 = var1.disabledSprite;
					Class84.anInt1165 = var1.enabledSprite;
				}

				if(Class77.aClass52_1112.isFemale) {
					var1.disabledSprite = Class3_Sub13_Sub21.anInt3260;
				} else {
					var1.disabledSprite = Class84.anInt1165;
				}

			}
		} catch (RuntimeException var3) {
			throw Class44.method1067(var3, "aa.H(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
		}
	}

}
