import java.math.BigInteger;

class Buffer extends Node {

	byte[] buf;
	static int[] spriteYOffsets;
	int pos;
	static jString[] aClass94Array2596 = null;
	static jString aClass94_2597 = jString.createJString("Loaded interfaces");
	static jString aClass94_2598 = jString.createJString("<br>");
	static Class3_Sub28_Sub3 aClass3_Sub28_Sub3_2600;
	static js5Worker[] aClass151_Sub1Array2601 = new js5Worker[256];

	final int getUShort() {
		pos += 2;
		return (buf[pos - 2] << 8 & '\uff00') + (buf[pos - 1] & 255);
	}

	final void putInt(int var2) {
		buf[pos++] = (byte)(var2 >> 24);
		buf[pos++] = (byte)(var2 >> 16);
		buf[pos++] = (byte)(var2 >> 8);
		buf[pos++] = (byte)var2;
	}

	final void method739(int var1, int var2, long var3) {
		try {
			--var2;
			if(~var2 <= -1 && -8 <= ~var2) {
				if(var1 == 0) {
					for(int var5 = var2 * 8; 0 <= var5; var5 -= 8) {
						buf[pos++] = (byte)((int)(var3 >> var5));
					}

				}
			} else {
				throw new IllegalArgumentException();
			}
		} catch (RuntimeException var6) {
			throw Class44.method1067(var6, "wa.OB(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final void putLong(long var1) {
			buf[pos++] = (byte)((int)(var1 >> 56));
			buf[pos++] = (byte)((int)(var1 >> 48));
				buf[pos++] = (byte)((int)(var1 >> 40));
				buf[pos++] = (byte)((int)(var1 >> 32));
				buf[pos++] = (byte)((int)(var1 >> 24));
				buf[pos++] = (byte)((int)(var1 >> 16));
				buf[pos++] = (byte)((int)(var1 >> 8));
				buf[pos++] = (byte)((int)var1);
	}

	final int method741() {
		byte var2 = buf[pos++];
		int var3;
		for (var3 = 0; 0 > var2; var2 = buf[pos++]) {
			var3 = (127 & var2 | var3) << 7;
		}

		return var2 | var3;
	}

	final void method742(int var1, int var2) {
		try {
			buf[-4 + pos + -var2] = (byte)(var2 >> 24);
			buf[-var2 + pos - 3] = (byte)(var2 >> 16);
			buf[-2 + pos + -var2] = (byte)(var2 >> 8);
			if(var1 < 78) {
				method771(37);
			}

			buf[-var2 + pos + -1] = (byte)var2;
		} catch (RuntimeException var4) {
			throw Class44.method1067(var4, "wa.VB(" + var1 + ',' + var2 + ')');
		}
	}

	final void putByteS(int var2) {
		buf[pos++] = (byte)(128 - var2);
	}

	static final void method744(boolean var0) {
		try {
			if(!var0) {
				method784(-10, -32, -21);
			}

			++KeyboardHandler.anInt1908;
		} catch (RuntimeException var2) {
			throw Class44.method1067(var2, "wa.HA(" + var0 + ')');
		}
	}

	final void putString(jString var2) {
		pos += var2.method1580(true, buf, pos, 0, var2.getLength());
		buf[pos++] = 0;
	}

	static final void method746(byte var0) {
		try {
			Class67.aClass93_1013.clearAll();
			if(var0 == -29) {
				;
			}
		} catch (RuntimeException var2) {
			throw Class44.method1067(var2, "wa.VC(" + var0 + ')');
		}
	}

	final int getShortA() {
		pos += 2;
		int var2 = (buf[-2 + pos] << 8 & '\uff00') - -(-128 + buf[pos + -1] & 255);

		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	     final int getInt() {
    	pos += 4;
    	return (((buf[pos - 1]) & 0xff)
    		 + (((buf[pos - 2]) & 0xff) << 8)
    		 + (((buf[pos - 4]) & 0xff) << 24)
    		 + (((buf[pos - 3]) & 0xff) << 16));
    }
	 

	final byte getByteS() {
		return (byte) (128 - buf[pos++]);
	}

	final jString method750(byte var1) {
		try {
			if(var1 != 78) {
				return (jString)null;
			} else if(buf[pos] != 0) {
				return getString();
			} else {
				++pos;
				return null;
			}
		} catch (RuntimeException var3) {
			throw Class44.method1067(var3, "wa.IB(" + var1 + ')');
		}
	}

	final int getUByteA() {
		return 255 & (buf[pos++] - 128);
	}

	final void putByte(int var2) {
		buf[pos++] = (byte)var2;
	}

	final void method753(byte[] var1, int var2, int var3, int var4) {
		try {
			int var5 = var2;
			if(var4 >= 37) {
				while(~var5 > ~(var2 + var3)) {
					buf[pos++] = var1[var5];
					++var5;
				}

			}
		} catch (RuntimeException var6) {
			throw Class44.method1067(var6, "wa.QC(" + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	final int getUByteS() {
		return 128 - buf[pos++] & 255;
	}

	final int method755(byte var1) {
		try {
			pos += 3;
			int var2 = 40 % ((-7 - var1) / 47);
			return ((buf[pos + -2] & 255) << 8) + ((buf[-1 + pos] & 255) << 16) + (buf[-3 + pos] & 255);
		} catch (RuntimeException var3) {
			throw Class44.method1067(var3, "wa.BA(" + var1 + ')');
		}
	}

	final long getLong() {
		long var2 = (long)getInt() & 4294967295L;
		long var4 = 4294967295L & (long)getInt();
		return var4 + (var2 << 32);
	}

	final void putLEInt(int var1) {
		buf[pos++] = (byte) var1;
		buf[pos++] = (byte) (var1 >> 8);
		buf[pos++] = (byte) (var1 >> 16);
		buf[pos++] = (byte) (var1 >> 24);
	}

	final int getUShortA() {
		pos += 2;
		return (buf[pos - 1] - 128 & 255) + ('\uff00' & buf[pos - 2] << 8);
	}

	final void putInt2(int var2) {
		buf[pos++] = (byte)(var2 >> 16);
		buf[pos++] = (byte)(var2 >> 24);
		buf[pos++] = (byte)var2;
		buf[pos++] = (byte)(var2 >> 8);
	}

	Buffer(int var1) {
		try {
			buf = Class134.method1807(66, var1);
			pos = 0;
		} catch (RuntimeException var3) {
			throw Class44.method1067(var3, "wa.<init>(" + var1 + ')');
		}
	}

	final byte getByte() {
		return buf[pos++];
	}

	final jString method761(int var1) {
		try {
			byte var2 = buf[pos++];
			if(var1 < 50) {
				buf = (byte[])null;
			}

			if(0 != var2) {
				throw new IllegalStateException("Bad version number in gjstr2");
			} else {
				int var3 = pos;

				while(-1 != ~buf[pos++]) {
					;
				}

				return Class3_Sub13_Sub3.bufferToString(buf, var3, pos - (var3 - -1));
			}
		} catch (RuntimeException var4) {
			throw Class44.method1067(var4, "wa.DA(" + var1 + ')');
		}
	}

	final void method762(float var1) {
		int var3 = Float.floatToRawIntBits(var1);
		buf[pos++] = (byte)var3;
		buf[pos++] = (byte)(var3 >> 8);
		buf[pos++] = (byte)(var3 >> 16);
		buf[pos++] = (byte)(var3 >> 24);
	}

	final byte getByteC() {
		return (byte)(-buf[pos++] + 0);
	}

	final void getBytes(byte[] buffer, int off, int len) {
		for(int var5 = off; off + len > var5; ++var5) {
			buffer[var5] = buf[pos++];
		}
	}

	final void putLEShortA(int var1) {
		buf[pos++] = (byte)(var1 + 128);
		buf[pos++] = (byte)(var1 >> 8);
	}

	final int getULEShort() {
		pos += 2;
		return (255 & buf[pos - 2]) + ('\uff00' & buf[pos - 1] << 8);
	}

	public static void method767(int var0) {
		try {
			spriteYOffsets = null;
			aClass94_2597 = null;
			aClass3_Sub28_Sub3_2600 = null;
			aClass94Array2596 = null;
			aClass151_Sub1Array2601 = null;
			aClass94_2598 = null;
			if(var0 != 0) {
				spriteYOffsets = (int[])null;
			}

		} catch (RuntimeException var2) {
			throw Class44.method1067(var2, "wa.IC(" + var0 + ')');
		}
	}

	final void putSmart(int var2) {
		if(0 <= var2 && ~var2 > -129) {
			putByte(var2);
		} else if(0 <= var2 && ~var2 > -32769) {
			putShort('\u8000' + var2);
		} else {
			throw new IllegalArgumentException();
		}
	}

	final void putSizedByte(int var2) {
		buf[-1 + -var2 + pos] = (byte)var2;
	}

	final void method770(int[] var1, int var2, int var3, int var4) {
		try {
			int var5 = pos;
			pos = var3;
			int var6 = (-var3 + var4) / 8;

			for(int var7 = 0; var6 > var7; ++var7) {
				int var10 = -957401312;
				int var8 = getInt();
				int var9 = getInt();
				int var12 = 32;

				for(int var11 = -1640531527; var12-- > 0; var8 -= (var9 >>> 5 ^ var9 << 4) + var9 ^ var1[var10 & 3] + var10) {
					var9 -= var1[(6754 & var10) >>> 11] + var10 ^ var8 + (var8 >>> 5 ^ var8 << 4);
					var10 -= var11;
				}

				pos -= 8;
				putInt(var8);
				putInt(var9);
			}

			if(var2 <= 102) {
				spriteYOffsets = (int[])null;
			}

			pos = var5;
		} catch (RuntimeException var13) {
			throw Class44.method1067(var13, "wa.SC(" + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	final void method771(int var1) {
			if(~(-128 & var1) != -1) {
				if(-1 != ~(-16384 & var1)) {
					if((var1 & -2097152) != 0) {
						if(0 != (-268435456 & var1)) {
							putByte(var1 >>> 28 | 128);
						}

						putByte(128 | var1 >>> 21);
					}

					putByte(128 | var1 >>> 14);
				}

				putByte(var1 >>> 7 | 128);
			}

			putByte(var1 & 127);
	}

	final long method772(int var1, int var2) {
		try {
			--var1;
			if(var2 <= var1 && ~var1 >= -8) {
				long var4 = 0L;

				for(int var3 = var1 * 8; ~var3 <= -1; var3 -= 8) {
					var4 |= ((long)buf[pos++] & 255L) << var3;
				}

				return var4;
			} else {
				throw new IllegalArgumentException();
			}
		} catch (RuntimeException var6) {
			throw Class44.method1067(var6, "wa.VA(" + var1 + ',' + var2 + ')');
		}
	}

	final int method773() {
		int var3 = getSmart();

		int var2;
		for (var2 = 0; 32767 == var3; var2 += 32767) {
			var3 = getSmart();
		}

		var2 += var3;
		return var2;
	}

	final void method774(int var1, int var2, byte[] var3, int var4) {
		try {
			if(var1 == 2) {
				for(int var5 = var4 - (-var2 - -1); ~var4 >= ~var5; --var5) {
					var3[var5] = buf[pos++];
				}

			}
		} catch (RuntimeException var6) {
			throw Class44.method1067(var6, "wa.HC(" + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ',' + var4 + ')');
		}
	}

	final void putInt1(int var1) {
		buf[pos++] = (byte)(var1 >> 8);
		buf[pos++] = (byte)var1;
		buf[pos++] = (byte)(var1 >> 24);
		buf[pos++] = (byte)(var1 >> 16);
	}

	final jString getString() {
		int var2 = pos;
		while(0 != buf[pos++]) {
			;
		}
		return Class3_Sub13_Sub3.bufferToString(buf, var2, (pos - 1) - var2);
	}

	static final void method777(CollisionMap[] var0, boolean var1, int var2, int var3, int var4, int var5, int var6, byte[] var7) {
		try {
			int var10;
			int var11;
			if(!var1) {
				for(int var9 = 0; 4 > var9; ++var9) {
					for(var10 = 0; -65 < ~var10; ++var10) {
						for(var11 = 0; ~var11 > -65; ++var11) {
							if(-1 > ~(var5 - -var10) && var10 + var5 < 103 && ~(var3 + var11) < -1 && ~(var11 + var3) > -104) {
								var0[var9].collisionFlags[var10 + var5][var3 - -var11] = ClientScript.method633(var0[var9].collisionFlags[var10 + var5][var3 - -var11], -16777217);
							}
						}
					}
				}
			}

			Buffer var20 = new Buffer(var7);
			byte var8;
			if(!var1) {
				var8 = 4;
			} else {
				var8 = 1;
			}

			int var12;
			for(var10 = 0; var8 > var10; ++var10) {
				for(var11 = 0; ~var11 > -65; ++var11) {
					for(var12 = 0; 64 > var12; ++var12) {
						Class167.method2267(var2, var6, var1, var20, var12 - -var3, var5 + var11, (byte)91, 0, var10);
					}
				}
			}

			int var14;
			int var15;
			int var17;
			boolean var21;
			int var24;
			for(var21 = false; var20.pos < var20.buf.length; var21 = true) {
				var11 = var20.getUByte();
				if(var11 != 129) {
					--var20.pos;
					break;
				}

				for(var12 = 0; var12 < 4; ++var12) {
					byte var13 = var20.getByte();
					if(0 != var13) {
						if(1 != var13) {
							if(var13 == 2 && -1 > ~var12) {
								var15 = var5 + 64;
								var24 = var3;
								var17 = var3 + 64;
								if(~var15 > -1) {
									var15 = 0;
								} else if(104 <= var15) {
									var15 = 104;
								}

								if(~var3 <= -1) {
									if(-105 >= ~var3) {
										var24 = 104;
									}
								} else {
									var24 = 0;
								}

								if(-1 >= ~var17) {
									if(~var17 <= -105) {
										var17 = 104;
									}
								} else {
									var17 = 0;
								}

								var14 = var5;
								if(var5 >= 0) {
									if(104 <= var5) {
										var14 = 104;
									}
								} else {
									var14 = 0;
								}

								while(var15 > var14) {
									while(~var24 > ~var17) {
										Class136.aByteArrayArrayArray1774[var12][var14][var24] = Class136.aByteArrayArrayArray1774[var12 + -1][var14][var24];
										++var24;
									}

									++var14;
								}
							}
						} else {
							for(var14 = 0; ~var14 > -65; var14 += 4) {
								for(var15 = 0; var15 < 64; var15 += 4) {
									byte var16 = var20.getByte();

									for(var17 = var14 + var5; 4 + var5 + var14 > var17; ++var17) {
										for(int var18 = var3 + var15; ~var18 > ~(4 + var3 + var15); ++var18) {
											if(var17 >= 0 && ~var17 > -105 && 0 <= var18 && -105 < ~var18) {
												Class136.aByteArrayArrayArray1774[var12][var17][var18] = var16;
											}
										}
									}
								}
							}
						}
					} else {
						var14 = var5;
						if(var5 >= 0) {
							if(~var5 <= -105) {
								var14 = 104;
							}
						} else {
							var14 = 0;
						}

						var24 = var3;
						if(-1 < ~var3) {
							var24 = 0;
						} else if(~var3 <= -105) {
							var24 = 104;
						}

						var15 = 64 + var5;
						var17 = var3 + 64;
						if(-1 >= ~var17) {
							if(var17 >= 104) {
								var17 = 104;
							}
						} else {
							var17 = 0;
						}

						if(-1 < ~var15) {
							var15 = 0;
						} else if(var15 >= 104) {
							var15 = 104;
						}

						while(~var14 > ~var15) {
							while(var24 < var17) {
								Class136.aByteArrayArrayArray1774[var12][var14][var24] = 0;
								++var24;
							}

							++var14;
						}
					}
				}
			}

			if(var4 == 4) {
				int var23;
				if(HDToolkit.openGLEnabled && !var1) {
					Class86 var22 = null;

					while(~var20.pos > ~var20.buf.length) {
						var12 = var20.getUByte();
						if(var12 != 0) {
							if(~var12 != -2) {
								throw new IllegalStateException();
							}

							var23 = var20.getUByte();
							if(0 < var23) {
								for(var14 = 0; var23 > var14; ++var14) {
									Light var25 = new Light(var20);
									if(-32 == ~var25.anInt705) {
										Class57 var26 = Class57.method1401(var20.getUShort());
										var25.method1060((byte)-67, var26.anInt896, var26.anInt908, var26.anInt899, var26.anInt907);
									}

									var25.anInt708 += var3 << 7;
									var25.anInt703 += var5 << 7;
									var17 = var25.anInt708 >> 7;
									var24 = var25.anInt703 >> 7;
									if(~var24 <= -1 && 0 <= var17 && ~var24 > -105 && ~var17 > -105) {
										var25.aBoolean696 = 0 != (Class9.aByteArrayArrayArray113[1][var24][var17] & 2);
										var25.anInt697 = Class44.anIntArrayArrayArray723[var25.anInt704][var24][var17] + -var25.anInt697;
										LightManager.method1264(var25);
									}
								}
							}
						} else {
							var22 = new Class86(var20);
						}
					}

					if(var22 == null) {
						var22 = new Class86();
					}

					for(var12 = 0; -9 < ~var12; ++var12) {
						for(var23 = 0; -9 < ~var23; ++var23) {
							var14 = var12 + (var5 >> 3);
							var15 = (var3 >> 3) + var23;
							if(0 <= var14 && var14 < 13 && -1 >= ~var15 && ~var15 > -14) {
								Class115.aClass86ArrayArray1581[var14][var15] = var22;
							}
						}
					}
				}

				if(!var21) {
					for(var11 = 0; var11 < 4; ++var11) {
						for(var12 = 0; 16 > var12; ++var12) {
							for(var23 = 0; var23 < 16; ++var23) {
								var14 = (var5 >> 2) - -var12;
								var15 = var23 + (var3 >> 2);
								if(0 <= var14 && 26 > var14 && 0 <= var15 && var15 < 26) {
									Class136.aByteArrayArrayArray1774[var11][var14][var15] = 0;
								}
							}
						}
					}
				}

			}
		} catch (RuntimeException var19) {
			throw Class44.method1067(var19, "wa.OA(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + (var7 != null?"{...}":"null") + ')');
		}
	}

	final int getSmart() {
		int var2 = buf[pos] & 255;
		return 128 <= var2?getUShort() - 32768:getUByte();
	}

	final void putTriByte(int var1) {
		buf[pos++] = (byte)(var1 >> 16);
		buf[pos++] = (byte)(var1 >> 8);
		buf[pos++] = (byte)var1;
	}

	final int getInt1() {
		pos += 4;
		return ((buf[pos - 2] & 255) << 24) + ((255 & buf[pos - 1]) << 16) + ('\uff00' & buf[-4 + pos] << 8) - -(buf[pos + -3] & 255);
	}

	final int getULEShortA() {
		pos += 2;
		return (buf[pos - 1] << 8 & '\uff00') + (255 & -128 + buf[pos - 2]);
	}

	final int getLEInt() {
		pos += 4;
		return (255 & buf[-4 + pos]) + (16711680 & buf[pos - 2] << 1572599856) + ((255 & buf[pos + -1]) << -34836040) + ((buf[-3 + pos] & 255) << 481963272);
	}

	final void putShortA(int var1) {
		buf[pos++] = (byte)(var1 >> -702824440);
		buf[pos++] = (byte)(128 + var1);
	}

	static final Class12 method784(int var0, int var1, int var2) {
		GroundTile var3 = Class75_Sub2.groundTiles[var0][var1][var2];
		return var3 != null && var3.aClass12_2230 != null?var3.aClass12_2230:null;
	}

	Buffer(byte[] var1) {
		try {
			pos = 0;
			buf = var1;
		} catch (RuntimeException var3) {
			throw Class44.method1067(var3, "wa.<init>(" + (var1 != null?"{...}":"null") + ')');
		}
	}

	final void putLEInt(int var1, byte var2) {
		buf[pos++] = (byte)var1;
		buf[pos++] = (byte)(var1 >> -1080682200);
		buf[pos++] = (byte)(var1 >> 16);
		buf[pos++] = (byte)(var1 >> 12970328);
	}

	final int getUByteC() {
		return 255 & 0 + -buf[pos++];
	}

	final int getShort() {
		pos += 2;
		int var2 = (buf[-1 + pos] & 255) + ((255 & buf[pos + -2]) << -2034851416);
		if(~var2 < -32768) {
			var2 -= 65536;
		}

		return var2;
	}

	final int method788(int var1) {
		try {
			pos += 2;
			int var2 = ((buf[pos - 1] & 255) << 1510012168) - -(buf[-2 + pos] - 128 & 255);
			if(var1 != -1741292848) {
				encRsa((BigInteger)null, (BigInteger)null, 11);
			}

			if(32767 < var2) {
				var2 -= 65536;
			}

			return var2;
		} catch (RuntimeException var3) {
			throw Class44.method1067(var3, "wa.EC(" + var1 + ')');
		}
	}

	final byte getByteA() {
		return (byte)(buf[pos++] - 128);
	}

	final void putByteA(int var1) {
		buf[pos++] = (byte)(128 + var1);
	}

	final int method791(byte var1) {
		try {
			pos += 2;
			if(var1 != 10) {
				getUByteA();
			}

			int var2 = (buf[-2 + pos] & 255) + ('\uff00' & buf[pos + -1] << 50972264);
			if(var2 > 32767) {
				var2 -= 65536;
			}

			return var2;
		} catch (RuntimeException var3) {
			throw Class44.method1067(var3, "wa.SA(" + var1 + ')');
		}
	}

	static final void method792(int var0) {
		try {
			if(var0 == 9179409) {
				int var1 = Class137.method1817();
				if(0 == var1) {
					AbstractGraphicsBuffer.aByteArrayArrayArray2008 = (byte[][][])null;
					Class136.method1816(0, -7);
				} else if(~var1 == -2) {
					Class3_Sub5.method112((byte)0, (byte)55);
					Class136.method1816(512, -7);
					Class3_Sub13_Sub18.method257((byte)125);
				} else {
					Class3_Sub5.method112((byte)(-4 + VarBit.anInt1127 & 255), (byte)55);
					Class136.method1816(2, -7);
				}

			}
		} catch (RuntimeException var2) {
			throw Class44.method1067(var2, "wa.AA(" + var0 + ')');
		}
	}

	final int method793(byte var1, int var2) {
		try {
			if(var1 < 1) {
				return 65;
			} else {
				int var3 = Class99.method1599(var2, pos, buf);
				putInt(var3);
				return var3;
			}
		} catch (RuntimeException var4) {
			throw Class44.method1067(var4, "wa.QB(" + var1 + ',' + var2 + ')');
		}
	}

	final int getMidInt() {
		pos += 3;
		return (16711680 & buf[pos + -3] << -2022440336) + (('\uff00' & buf[-2 + pos] << -54462168) - -(buf[pos + -1] & 255));
	}

	static final void method795(byte var0, int var1) {
		try {
			if(var0 != 14) {
				spriteYOffsets = (int[])null;
			}

			InterfaceListener.aClass93_2450.method1522(var1);
		} catch (RuntimeException var3) {
			throw Class44.method1067(var3, "wa.OC(" + var0 + ',' + var1 + ')');
		}
	}

	final void putLEShort(int var2) {
		buf[pos++] = (byte)var2;
		buf[pos++] = (byte)(var2 >> 8);
	}

	final int getUSmart() {
		int var2 = buf[pos] & 255;
		return ~var2 > -129?-64 + getUByte():getUShort() - '\uc000';
	}

	final int getInt2() {
		pos += 4;
		return ((buf[pos - 3] & 255) << -1597905000) - -(16711680 & buf[pos + -4] << 861399376) + (((buf[pos + -1] & 255) << 979767016) - -(255 & buf[pos + -2]));
	}

	/*static final void method799(int var0, int var1, int var2, int var3, int var4) {
		try {
			if(~Class140_Sub3.anInt2737 > -101) {
				GroundItem.method626(64);
			}

			if(HDToolkit.openGLEnabled) {
				GraphicsHD.clipRect(var0, var2, var0 + var4, var3 + var2);
			} else {
				GraphicsLD.clipRect(var0, var2, var0 + var4, var3 + var2);
			}

			int var6;
			int var7;
			if(~Class140_Sub3.anInt2737 <= -101) {
				Class17.anInt410 = (int)((float)(var3 * 2) / Class44.aFloat727);
				Class60.anInt930 = Class3_Sub28_Sub1.anInt3536 + -((int)((float)var4 / Class44.aFloat727));
				int var15 = -((int)((float)var4 / Class44.aFloat727)) + Class3_Sub28_Sub1.anInt3536;
				var6 = Class3_Sub4.anInt2251 - (int)((float)var3 / Class44.aFloat727);
				Class60.anInt934 = Class3_Sub4.anInt2251 + -((int)((float)var3 / Class44.aFloat727));
				int var8 = Class3_Sub4.anInt2251 + (int)((float)var3 / Class44.aFloat727);
				var7 = (int)((float)var4 / Class44.aFloat727) + Class3_Sub28_Sub1.anInt3536;
				Class49.anInt817 = (int)((float)(var4 * 2) / Class44.aFloat727);
				if(var1 != 64) {
					aClass94Array2596 = (jString[])null;
				}

				if(HDToolkit.openGLEnabled) {
					if(Class3_Sub13_Sub19.aClass3_Sub28_Sub16_Sub2_3221 == null || ~Class3_Sub13_Sub19.aClass3_Sub28_Sub16_Sub2_3221.width != ~var4 || ~Class3_Sub13_Sub19.aClass3_Sub28_Sub16_Sub2_3221.height != ~var3) {
						Class3_Sub13_Sub19.aClass3_Sub28_Sub16_Sub2_3221 = null;
						Class3_Sub13_Sub19.aClass3_Sub28_Sub16_Sub2_3221 = new LDSprite(var4, var3);
					}

					GraphicsLD.init2dCanvas(Class3_Sub13_Sub19.aClass3_Sub28_Sub16_Sub2_3221.pixels, var4, var3);
					NodeSub.method523(var4, 0, 0, var7, var6, 0, var8, var3, var15);
					Class23.method938(var4, 0, var7, var8, var3, 0, 1, var15, var6);
					Class3_Sub5.method111((byte)-54, 0, 0, var15, var4, var8, var6, var7, var3);
					GraphicsHD.method926(Class3_Sub13_Sub19.aClass3_Sub28_Sub16_Sub2_3221.pixels, var0, var2, var4, var3);
					GraphicsLD.pixels = null;
				} else {
					NodeSub.method523(var4 + var0, var2, 0, var7, var6, var0, var8, var2 - -var3, var15);
					Class23.method938(var0 + var4, var0, var7, var8, var3 + var2, var2, 1, var15, var6);
					Class3_Sub5.method111((byte)-100, var0, var2, var15, var0 - -var4, var8, var6, var7, var3 + var2);
				}

				if(0 < AbstractSprite.anInt3704) {
					--Class3_Sub28_Sub8.anInt3611;
					if(-1 == ~Class3_Sub28_Sub8.anInt3611) {
						Class3_Sub28_Sub8.anInt3611 = 20;
						--AbstractSprite.anInt3704;
					}
				}

				if(Class20.aBoolean438) {
					int var10 = -8 + var2 - -var3;
					int var9 = -5 + (var0 - -var4);
					client.getRegularFont().method688(client.method903(new jString[]{Class65.aClass94_985, Class72.method1298(AnimationDefinition.anInt1862)}, (byte)-62), var9, var10, 16776960, -1);
					Runtime var11 = Runtime.getRuntime();
					int var12 = (int)((var11.totalMemory() - var11.freeMemory()) / 1024L);
					int var13 = 16776960;
					var10 -= 15;
					if(~var12 < -65537) {
						var13 = 16711680;
					}

					client.getRegularFont().method688(client.method903(new jString[]{Class119.aClass94_1630, Class72.method1298(var12), Class3_Sub13_Sub4.aClass94_3055}, (byte)-108), var9, var10, var13, -1);
					var10 -= 15;
				}

			} else {
				byte var5 = 20;
				var6 = var0 - -(var4 / 2);
				var7 = var3 / 2 + (var2 - 18) + -var5;
				if(HDToolkit.openGLEnabled) {
					GraphicsHD.fillRect(var0, var2, var4, var3, 0);
					GraphicsHD.drawRect(var6 - 152, var7, 304, 34, 9179409);
					GraphicsHD.drawRect(var6 + -151, var7 + 1, 302, 32, 0);
					GraphicsHD.fillRect(-150 + var6, var7 + 2, 3 * Class140_Sub3.anInt2737, 30, 9179409);
					GraphicsHD.fillRect(-150 + var6 + Class140_Sub3.anInt2737 * 3, var7 - -2, 300 + -(3 * Class140_Sub3.anInt2737), 30, 0);
				} else {
					GraphicsLD.fillRect(var0, var2, var4, var3, 0);
					GraphicsLD.drawRect(var6 + -152, var7, 304, 34, 9179409);
					GraphicsLD.drawRect(var6 + -151, 1 + var7, 302, 32, 0);
					GraphicsLD.fillRect(var6 + -150, var7 + 2, Class140_Sub3.anInt2737 * 3, 30, 9179409);
					GraphicsLD.fillRect(3 * Class140_Sub3.anInt2737 + -150 + var6, var7 - -2, -(Class140_Sub3.anInt2737 * 3) + 300, 30, 0);
				}

				client.getBoldFont().method699(IdentityKit.aClass94_462, var6, var5 + var7, 16777215, -1);
			}
		} catch (RuntimeException var14) {
			throw Class44.method1067(var14, "wa.FA(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}*/

	final void encRsa(BigInteger var1, BigInteger var2, int var3) {
		try {
			int var4 = pos;
			pos = 0;
			byte[] var5 = new byte[var4];
			getBytes(var5, 0, var4);
			BigInteger var6 = new BigInteger(var5);
			BigInteger var7 = null;
			//if (ClientLoader.useRsa)
				var7 = var6.modPow(var1, var2);
			//else
			//	var7 = var6; 
			byte[] var8 = var7.toByteArray();
			pos = 0;
			putByte(var8.length);
			method753(var8, 0, var8.length, var3 + 348);
		} catch (RuntimeException var9) {
			throw Class44.method1067(var9, "wa.KB(" + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
		}
	}

	final void method801(float var2) {
		int var3 = Float.floatToRawIntBits(var2);
		buf[pos++] = (byte)(var3 >> -1164789608);
		buf[pos++] = (byte)(var3 >> -259929904);
		buf[pos++] = (byte)(var3 >> 1414718216);
		buf[pos++] = (byte)var3;
	}

	static final jString method802(int var0, boolean var1) {
		try {
			if(!var1) {
				method746((byte)-33);
			}

			return -1 > ~Class163_Sub2_Sub1.aClass94Array4016[var0].getLength()?client.method903(new jString[]{ItemPile.aClass94Array2935[var0], InputStream_Sub1.aClass94_43, Class163_Sub2_Sub1.aClass94Array4016[var0]}):ItemPile.aClass94Array2935[var0];
		} catch (RuntimeException var3) {
			throw Class44.method1067(var3, "wa.RB(" + var0 + ',' + var1 + ')');
		}
	}

	final int getUByte() {
		return buf[pos++] & 0xff;
	}

	final void putShort(int var2) {
		buf[pos++] = (byte)(var2 >> 8);
		buf[pos++] = (byte)var2;
	}

	public int getSmartA() {
		int value = buf[pos] & 0xff;
		if (value < 128) {
			return getUByte() - 64;
		}
		return getUShort() - 49152;
	}

	public int readSmart32() {
		if (buf[pos] >= 0) {
			return getUShort() & 0x7FFF;
		}
		return getInt() & 0x7FFFFFFF;
	}

}
