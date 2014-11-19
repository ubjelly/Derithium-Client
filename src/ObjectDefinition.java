final class ObjectDefinition {

	private short[] aShortArray1476;
	private short[] aShortArray1477;
	int anInt1478;
	private int anInt1479;
	int sizeX = 1;
	private int anInt1481;
	int anInt1482;
	boolean aBoolean1483 = false;
	int anInt1484;
	int sizeY = 1;
	boolean projectileCliped;
	private int[] types;
	private int anInt1488;
	private int anInt1489;
	static boolean[] aBooleanArray1490 = new boolean[112];
	boolean aBoolean1491;
	boolean aBoolean1492;
	int anInt1493;
	private int anInt1494 = 0;
	private short[] aShortArray1495;
	private int anInt1496;
	static int[][][] anIntArrayArrayArray1497 = new int[4][13][13];
	boolean aBoolean1498;
	jString[] aClass94Array1499;
	private short aShort1500;
	private Hashtable aClass130_1501;
	boolean aBoolean1502 = false;
	boolean aBoolean1503;
	jString name;
	private byte aByte1505;
	private short[] aShortArray1506;
	boolean aBoolean1507;
	boolean aBoolean1510;
	private int anInt1511;
	int anInt1512;
	private byte[] aByteArray1513;
	static int worldId = 1;
	int anInt1515;
	int anInt1516;
	int anInt1517;
	int anInt1518;
	private int[] models;
	int anInt1520;
	static int anInt1521 = 0;
	int anInt1522;
	int[] anIntArray1524;
	boolean aBoolean1525;
	private int anInt1526;
	int anInt1527;
	int anInt1528;
	int anInt1529;
	boolean aBoolean1530;
	int anInt1531;
	private int anInt1532;
	int anInt1533;
	private int anInt1534;
	static short aShort1535 = 320;
	private boolean aBoolean1536;
	boolean aBoolean1537;
	int clipType;
	int[] anIntArray1539;
	int anInt1540;
	private boolean aBoolean1541;
	boolean aBoolean1542;

	final boolean method1684(int var1, int var2) {
		try {
			if (types != null) {
				for (int var7 = 0; ~types.length < ~var7; ++var7) {
					if (~var2 == ~types[var7]) {
						return client.getModelJs5(models[var7] & '\uffff').method2129(0, models[var7] & '\uffff');
					}
				}
				return true;
			} else if (null == models) {
				return true;
			} else if (-11 != ~var2) {
				return true;
			} else {
				boolean var4 = true;
				for (int var5 = 0; models.length > var5; ++var5) {
					var4 &= client.getModelJs5('\uffff' & models[var5]).method2129(0, '\uffff' & models[var5]);
				}
				return var4;
			}
		} catch (RuntimeException var6) {
			throw Class44.method1067(var6, "pb.H(" + var1 + ',' + var2 + ')');
		}
	}

	final ObjectDefinition method1685() {
		int var2 = -1;
		if (anInt1526 != -1) {
			var2 = NpcDefinition.method1484(64835055, anInt1526);
		} else if (anInt1532 != -1) {
			var2 = Class163_Sub1.variousSettings[anInt1532];
		}

		if (~var2 <= -1 && ~var2 > ~(anIntArray1524.length - 1) && ~anIntArray1524[var2] != 0) {
			return ObjectDefinition.list(anIntArray1524[var2]);
		} else {
			int var3 = anIntArray1524[-1 + anIntArray1524.length];
			return ~var3 == 0 ? null : ObjectDefinition.list(var3);
		}
	}

	private final ModelBuilder method1686(int var1, int var2, int var3) {
		try {
			ModelBuilder var4 = null;
			boolean var5 = aBoolean1536;
			if (-3 == ~var2 && 3 < var1) {
				var5 = !var5;
			}

			int var6;
			int var7;
			if (null == types) {
				if (-11 != ~var2) {
					return null;
				}

				if (models == null) {
					return null;
				}

				var6 = models.length;

				for (var7 = 0; ~var7 > ~var6; ++var7) {
					int var8 = models[var7];
					if (var5) {
						var8 += 65536;
					}

					var4 = (ModelBuilder) Class99.aClass93_1401.get((long) var8);
					if (var4 == null) {
						var4 = ModelBuilder.get(client.getModelJs5(var8 & '\uffff'), var8 & '\uffff', 0);
						if (var4 == null) {
							return null;
						}

						if (var5) {
							var4.method2002();
						}

						Class99.aClass93_1401.put(var4, (long) var8);
					}

					if (1 < var6) {
						Class164.aClass140_Sub5Array2058[var7] = var4;
					}
				}

				if (~var6 < -2) {
					var4 = new ModelBuilder(Class164.aClass140_Sub5Array2058, var6);
				}
			} else {
				var6 = -1;

				for (var7 = 0; types.length > var7; ++var7) {
					if (var2 == types[var7]) {
						var6 = var7;
						break;
					}
				}

				if (~var6 == 0) {
					return null;
				}

				var7 = models[var6];
				if (var5) {
					var7 += 65536;
				}

				var4 = (ModelBuilder) Class99.aClass93_1401.get((long) var7);
				if (null == var4) {
					var4 = ModelBuilder.get(client.getModelJs5(var7 & '\uffff'), var7 & '\uffff', 0);
					if (null == var4) {
						return null;
					}

					if (var5) {
						var4.method2002();
					}

					Class99.aClass93_1401.put(var4, (long) var7);
				}
			}

			boolean var11;
			if (128 == anInt1479 && ~anInt1488 == -129 && 128 == anInt1481) {
				var11 = false;
			} else {
				var11 = true;
			}

			boolean var12;
			if (anInt1496 == 0 && -1 == ~anInt1511 && 0 == anInt1534) {
				var12 = false;
			} else {
				var12 = true;
			}

			ModelBuilder var13 = new ModelBuilder(var4, var3 == ~var1 && !var11 && !var12, aShortArray1477 == null, null == aShortArray1476, true);
			if (~var2 == -5 && var1 > 3) {
				var13.method2011(256);
				var13.method2001(45, 0, -45);
			}

			var1 &= 3;
			if (-2 != ~var1) {
				if (-3 != ~var1) {
					if (3 == var1) {
						var13.method2018();
					}
				} else {
					var13.method1989();
				}
			} else {
				var13.method1991();
			}

			int var9;
			if (null != aShortArray1477) {
				for (var9 = 0; aShortArray1477.length > var9; ++var9) {
					if (null != aByteArray1513 && aByteArray1513.length > var9) {
						var13.swapColors(aShortArray1477[var9], Class3_Sub13_Sub9.aShortArray3110[255 & aByteArray1513[var9]]);
					} else {
						var13.swapColors(aShortArray1477[var9], aShortArray1506[var9]);
					}
				}
			}

			if (aShortArray1476 != null) {
				for (var9 = 0; aShortArray1476.length > var9; ++var9) {
					var13.method1998(aShortArray1476[var9], aShortArray1495[var9]);
				}
			}

			if (var11) {
				var13.method1994(anInt1479, anInt1488, anInt1481);
			}

			if (var12) {
				var13.method2001(anInt1496, anInt1511, anInt1534);
			}

			return var13;
		} catch (RuntimeException var10) {
			throw Class44.method1067(var10, "pb.O(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	public static void method1687(int var0) {
		try {
			anIntArrayArrayArray1497 = (int[][][]) null;
			aBooleanArray1490 = null;
			if (var0 != -11) {
				anInt1521 = -96;
			}

		} catch (RuntimeException var2) {
			throw Class44.method1067(var2, "pb.B(" + var0 + ')');
		}
	}

	static final Class72 method1688(int var0, int var1, int var2) {
		GroundTile var3 = Class75_Sub2.groundTiles[var0][var1][var2];
		if (var3 == null) {
			return null;
		} else {
			Class72 var4 = var3.aClass72_2245;
			var3.aClass72_2245 = null;
			return var4;
		}
	}

	final void method1689() {
		if (anInt1529 == -1) {
			anInt1529 = 0;
			if (null != models && (null == types || -11 == ~types[0])) {
				anInt1529 = 1;
				for (int var2 = 0; var2 < 5; ++var2) {
					if (aClass94Array1499[var2] != null) {
						anInt1529 = 1;
						break;
					}
				}
			}
		}

		if (-1 == anInt1540) {
			anInt1540 = clipType != 0 ? 1 : 0;
		}

	}

	final boolean method1690(int var1) {
		try {
			if (anIntArray1524 != null) {
				if (var1 != 28933) {
					method1696(34, 54, (int[][]) ((int[][]) null), 55, 80, (int[][]) ((int[][]) null), true, (LDIndexedSprite) null, (byte) 127, true, -38);
				}

				for (int var2 = 0; ~var2 > ~anIntArray1524.length; ++var2) {
					if (0 != ~anIntArray1524[var2]) {
						ObjectDefinition var3 = ObjectDefinition.list(anIntArray1524[var2]);
						if (0 != ~var3.anInt1512 || var3.anIntArray1539 != null) {
							return true;
						}
					}
				}

				return false;
			} else {
				return anInt1512 != -1 || anIntArray1539 != null;
			}
		} catch (RuntimeException var4) {
			throw Class44.method1067(var4, "pb.F(" + var1 + ')');
		}
	}

	final int method1691(int var1, int var2, byte var3) {
		try {
			if (var3 <= 76) {
				return -40;
			} else if (aClass130_1501 == null) {
				return var1;
			} else {
				IntegerNode var4 = (IntegerNode) aClass130_1501.get((long) var2);
				return var4 != null ? var4.value : var1;
			}
		} catch (RuntimeException var5) {
			throw Class44.method1067(var5, "pb.N(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final void decode(Buffer var2) {
		boolean newRevision = var2.getUByte() == 1;
		for (;;) {
			int var3 = var2.getUByte();
			if (var3 == 0) {
				break;
			}
			if (newRevision) {
				decode_higher_revisions(var2, var3);
			} else {
				decode_464(var2, var3);
			}
		}
	}

	private final void decode_464(Buffer buffer, int opcode) {
		int var4;
		int var5;
		if (opcode == 1) {
			var4 = buffer.getUByte();
			if (~var4 < -1) {
				if (models != null && !Class47.aBoolean742) {
					buffer.pos += var4 * 3;
				} else {
					types = new int[var4];
					models = new int[var4];

					for (var5 = 0; var4 > var5; ++var5) {
						models[var5] = buffer.getUShort();
						types[var5] = buffer.getUByte();
					}
				}
			}
		} else if (opcode == 2) {
			name = buffer.getString();
		} else if (opcode == 5) {
			var4 = buffer.getUByte();
			if (~var4 < -1) {
				if (null != models && !Class47.aBoolean742) {
					buffer.pos += var4 * 2;
				} else {
					models = new int[var4];
					types = null;

					for (var5 = 0; var4 > var5; ++var5) {
						models[var5] = buffer.getUShort();
					}
				}
			}
		} else if (opcode == 14) {
			sizeX = buffer.getUByte();
		} else if (opcode == 15) {
			sizeY = buffer.getUByte();
		} else if (opcode == 17) {
			clipType = 0;
			projectileCliped = false;
		} else if (opcode == 18) {
			projectileCliped = false;
		} else if (opcode == 19) {
			anInt1529 = buffer.getUByte();
		} else if (opcode == 21) {
			aByte1505 = 1;
		} else if (opcode == 22) {
			aBoolean1541 = true;
		} else if (opcode == 23) {
			aBoolean1542 = true;
		} else if (opcode == 24) {
			anInt1531 = buffer.getUShort();
			if (~anInt1531 == -65536) {
				anInt1531 = -1;
			}
		} else if (opcode == 27) {
			clipType = 1;
		} else if (opcode == 28) {
			anInt1528 = buffer.getUByte();
		} else if (opcode == 29) {
			anInt1494 = buffer.getByte();
		} else if (opcode == 39) {
			anInt1489 = buffer.getByte() * 5;
		} else if (opcode >= 30 && opcode < 35) {
			aClass94Array1499[opcode - 30] = buffer.getString();
			if (aClass94Array1499[-30 + opcode].method1531(Class3_Sub13_Sub3.aClass94_3051)) {
				aClass94Array1499[-30 + opcode] = null;
			}
		} else if (opcode == 40) {
			var4 = buffer.getUByte();
			aShortArray1477 = new short[var4];
			aShortArray1506 = new short[var4];
			for (var5 = 0; var5 < var4; ++var5) {
				aShortArray1477[var5] = (short) buffer.getUShort();
				aShortArray1506[var5] = (short) buffer.getUShort();
			}
		} else if (opcode == 41) {
			var4 = buffer.getUByte();
			aShortArray1495 = new short[var4];
			aShortArray1476 = new short[var4];
			for (var5 = 0; ~var5 > ~var4; ++var5) {
				aShortArray1476[var5] = (short) buffer.getUShort();
				aShortArray1495[var5] = (short) buffer.getUShort();
			}
		} else if (opcode == 42) {
			var4 = buffer.getUByte();
			aByteArray1513 = new byte[var4];
			for (var5 = 0; ~var5 > ~var4; ++var5) {
				aByteArray1513[var5] = buffer.getByte();
			}
		} else if (opcode == 60) {
			anInt1482 = buffer.getUShort();
		} else if (opcode == 62) {
			aBoolean1536 = true;
		} else if (opcode == 64) {
			aBoolean1525 = false;
		} else if (opcode == 65) {
			anInt1479 = buffer.getUShort();
		} else if (opcode == 66) {
			anInt1488 = buffer.getUShort();
		} else if (opcode == 67) {
			anInt1481 = buffer.getUShort();
		} else if (opcode == 68) {
			anInt1516 = buffer.getUShort();
		} else if (opcode == 69) {
			anInt1533 = buffer.getUByte();
		} else if (opcode == 70) {
			anInt1496 = buffer.getShort();
		} else if (opcode == 71) {
			anInt1511 = buffer.getShort();
		} else if (opcode == 72) {
			anInt1534 = buffer.getShort();
		} else if (opcode == 73) {
			aBoolean1483 = true;
		} else if (opcode == 74) {
			aBoolean1498 = true;
		} else if (opcode == 75) {
			anInt1540 = buffer.getUByte();
		} else if (opcode == 77 || opcode == 92) {
			var4 = -1;
			anInt1526 = buffer.getUShort();
			if ('\uffff' == anInt1526) {
				anInt1526 = -1;
			}
			anInt1532 = buffer.getUShort();
			if ('\uffff' == anInt1532) {
				anInt1532 = -1;
			}
			if (92 == opcode) {
				var4 = buffer.getUShort();
				if (var4 == '\uffff') {
					var4 = -1;
				}
			}
			var5 = buffer.getUByte();
			anIntArray1524 = new int[var5 - -2];

			for (int var6 = 0; var5 >= var6; ++var6) {
				anIntArray1524[var6] = buffer.getUShort();
				if ('\uffff' == anIntArray1524[var6]) {
					anIntArray1524[var6] = -1;
				}
			}
			anIntArray1524[1 + var5] = var4;
		} else if (opcode == 78) {
			anInt1512 = buffer.getUShort();
			anInt1484 = buffer.getUByte();
		} else if (opcode == 79) {
			anInt1518 = buffer.getUShort();
			anInt1515 = buffer.getUShort();
			anInt1484 = buffer.getUByte();
			var4 = buffer.getUByte();
			anIntArray1539 = new int[var4];
			for (var5 = 0; ~var4 < ~var5; ++var5) {
				anIntArray1539[var5] = buffer.getUShort();
			}
		}
	}

	private final void decode_higher_revisions(Buffer buffer, int opcode) {
		int var4;
		int var5;
		if (1 == opcode) {
			var4 = buffer.getUByte();
			if (~var4 < -1) {
				if (models != null && !Class47.aBoolean742) {
					buffer.pos += var4 * 3;
				} else {
					types = new int[var4];
					models = new int[var4];

					for (var5 = 0; var4 > var5; ++var5) {
						models[var5] = buffer.getUShort();
						types[var5] = buffer.getUByte();
					}
				}
			}
		} else if (2 == opcode) {
			name = buffer.getString();
		} else if (5 == opcode) {
			var4 = buffer.getUByte();
			if (~var4 < -1) {
				if (null != models && !Class47.aBoolean742) {
					buffer.pos += var4 * 2;
				} else {
					models = new int[var4];
					types = null;

					for (var5 = 0; var4 > var5; ++var5) {
						models[var5] = buffer.getUShort();
					}
				}
			}
		} else if (opcode == 14) {
			sizeX = buffer.getUByte();
		} else if (opcode == 15) {
			sizeY = buffer.getUByte();
		} else if (opcode == 17) {
			clipType = 0;
			projectileCliped = false;
		} else if (opcode == 18) {
			projectileCliped = false;
		} else if (opcode == 19) {
			anInt1529 = buffer.getUByte();
		} else if (opcode == 21) {
			aByte1505 = 1;
		} else if (opcode == 22) {
			aBoolean1541 = true;
		} else if (opcode == 23) {
			aBoolean1542 = true;
		} else if (opcode == 24) {
			anInt1531 = buffer.getUShort();
			if (anInt1531 == 65535) {
				anInt1531 = -1;
			}
		} else if (opcode == 27) {
			clipType = 1;
		} else if (opcode == 28) {
			anInt1528 = buffer.getUByte();
		} else if (opcode == 29) {
			anInt1494 = buffer.getByte();
		} else if (opcode == 39) {
			anInt1489 = buffer.getByte() * 5;
		} else if (opcode >= 30 && opcode < 35) {
			aClass94Array1499[opcode - 30] = buffer.getString();
			if (aClass94Array1499[-30 + opcode].method1531(Class3_Sub13_Sub3.aClass94_3051)) {
				aClass94Array1499[-30 + opcode] = null;
			}
		} else if (opcode == 40) {
			var4 = buffer.getUByte();
			aShortArray1477 = new short[var4];
			aShortArray1506 = new short[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				aShortArray1477[var5] = (short) buffer.getUShort();
				aShortArray1506[var5] = (short) buffer.getUShort();
			}
		} else if (opcode == 41) {
			var4 = buffer.getUByte();
			aShortArray1495 = new short[var4];
			aShortArray1476 = new short[var4];

			for (var5 = 0; ~var5 > ~var4; ++var5) {
				aShortArray1476[var5] = (short) buffer.getUShort();
				aShortArray1495[var5] = (short) buffer.getUShort();
			}
		} else if (opcode == 42) {
			var4 = buffer.getUByte();
			aByteArray1513 = new byte[var4];

			for (var5 = 0; ~var5 > ~var4; ++var5) {
				aByteArray1513[var5] = buffer.getByte();
			}
		} else if (opcode == 60) {
			anInt1482 = buffer.getUShort();
		} else if (opcode == 62) {
			aBoolean1536 = true;
		} else if (opcode == 64) {
			aBoolean1525 = false;
		} else if (opcode == 65) {
			anInt1479 = buffer.getUShort();
		} else if (opcode == 66) {
			anInt1488 = buffer.getUShort();
		} else if (opcode == 67) {
			anInt1481 = buffer.getUShort();
		} else if (opcode == 69) {
			anInt1533 = buffer.getUByte();
		} else if (70 == opcode) {
					anInt1496 = buffer.getShort();
				} else if (71 == opcode) {
					anInt1511 = buffer.getShort();
				} else if (72 == opcode) {
					anInt1534 = buffer.getShort();
				} else if (opcode != 73) {
					if (opcode != 74) {
						if (75 == opcode) {
							anInt1540 = buffer.getUByte();
						} else if (~opcode != -78 && -93 != ~opcode) {
							if (78 != opcode) {
								if (~opcode != -80) {
									if (81 != opcode) {
										if (~opcode != -83) {
											if (opcode != 88) {
												if (-90 != ~opcode) {
													if (90 != opcode) {
														if (opcode == 91) {
															aBoolean1491 = true;
														} else if (-94 == ~opcode) {
															aByte1505 = 3;
															aShort1500 = (short) buffer.getUShort();
														} else if (opcode != 94) {
															if (~opcode == -96) {
																aByte1505 = 5;
															} else if (~opcode != -97) {
																if (~opcode == -98) {
																	aBoolean1537 = true;
																} else if (opcode == 98) {
																	aBoolean1510 = true;
																} else if (~opcode != -100) {
																	if (-101 == ~opcode) {
																		anInt1520 = buffer.getUByte();
																		anInt1522 = buffer.getUShort();
																	} else if (opcode == 101) {
																		anInt1478 = buffer.getUByte();
																	} else if (opcode == 102) {
																		anInt1516 = buffer.getUShort();
																	} else if (opcode == 103) {
																		int anInt1190 = 0;
																	} else if (opcode == 104) {
																		int anInt1186 = buffer.getUByte();
																	} else if (opcode == 105) {
																		boolean aBoolean1173 = true;
																	} else if (opcode == 106) {
																		int i = buffer.getUByte();
																		int[] anIntArray1210 = new int[i];
																		int[] anIntArray1143 = new int[i];
																		int anInt1145 = 0;
																		for (int i_24_ = 0; i > i_24_; i_24_++) {
																			anIntArray1143[i_24_] = buffer.getUShort();
																			int i_25_ = buffer.getUByte();
																			anIntArray1210[i_24_] = i_25_;
																			anInt1145 += i_25_;
																		}
																	} else if (opcode == 107) {
																		int anInt1156 = buffer.getUShort();
																	} else if (opcode >= 150 && opcode < 155) {
																		aClass94Array1499[opcode - 150] = buffer.getString();
																		if (aClass94Array1499[opcode - 150].method1531(Class3_Sub13_Sub3.aClass94_3051))
																			aClass94Array1499[opcode - 150] = null;
																	} else if (opcode == 160) {
																		int i = buffer.getUByte();
																		int[] anIntArray1189 = new int[i];
																		for (int i_23_ = 0; i > i_23_; i_23_++)
																			anIntArray1189[i_23_] = buffer.getUShort();
																	} else if (249 == opcode) {
																		var4 = buffer.getUByte();
																		if (null == aClass130_1501) {
																			var5 = Class95.method1585(var4);
																			aClass130_1501 = new Hashtable(var5);
																		}

																		for (var5 = 0; var4 > var5; ++var5) {
																			boolean var10 = -2 == ~buffer.getUByte();
																			int var7 = buffer.getMidInt();
																			Object var8;
																			if (!var10) {
																				var8 = new IntegerNode(buffer.getInt());
																			} else {
																				var8 = new StringNode(buffer.getString());
																			}

																			aClass130_1501.put((Node) var8, (long) var7);
																		}
																	}
																} else {
																	anInt1493 = buffer.getUByte();
																	anInt1517 = buffer.getUShort();
																}
															} else {
																aBoolean1507 = true;
															}
														} else {
															aByte1505 = 4;
														}
													} else {
														aBoolean1502 = true;
													}
												} else {
													aBoolean1492 = false;
												}
											} else {
												aBoolean1503 = false;
											}
										} else {
											aBoolean1530 = true;
										}
									} else {
										aByte1505 = 2;
										aShort1500 = (short) (256 * buffer.getUByte());
									}
								} else {
									anInt1518 = buffer.getUShort();
									anInt1515 = buffer.getUShort();
									anInt1484 = buffer.getUByte();
									var4 = buffer.getUByte();
									anIntArray1539 = new int[var4];

									for (var5 = 0; ~var4 < ~var5; ++var5) {
										anIntArray1539[var5] = buffer.getUShort();
									}
								}
							} else {
								anInt1512 = buffer.getUShort();
								anInt1484 = buffer.getUByte();
							}
						} else {
							var4 = -1;
							anInt1526 = buffer.getUShort();
							if ('\uffff' == anInt1526) {
								anInt1526 = -1;
							}

							anInt1532 = buffer.getUShort();
							if ('\uffff' == anInt1532) {
								anInt1532 = -1;
							}

							if (92 == opcode) {
								var4 = buffer.getUShort();
								if (var4 == '\uffff') {
									var4 = -1;
								}
							}

							var5 = buffer.getUByte();
							anIntArray1524 = new int[var5 - -2];

							for (int var6 = 0; var5 >= var6; ++var6) {
								anIntArray1524[var6] = buffer.getUShort();
								if ('\uffff' == anIntArray1524[var6]) {
									anIntArray1524[var6] = -1;
								}
							}

							anIntArray1524[1 + var5] = var4;
						}
					} else {
						aBoolean1498 = true;
					}
				} else {
					aBoolean1483 = true;
				}
	}

	final boolean method1694(boolean var1) {
		if (null == models) {
			return true;
		} else {
			boolean var2 = true;
			for (int var3 = 0; models.length > var3; ++var3) {
				js5 model_cache = client.getModelJs5(0xffff & models[var3]);
				var2 &= model_cache.method2129(0, 0xffff & models[var3]);
			}
			return var2;
		}
	}

	private final HDModel method1695(int var1, boolean var2, boolean var3, int var4) {
		try {
			int var6 = anInt1494 + 64;
			int var7 = 5 * anInt1489 + 768;
			HDModel var5 = null;
			int var8;
			int var12;
			if (types != null) {
				var8 = -1;

				int var9;
				for (var9 = 0; ~var9 > ~types.length; ++var9) {
					if (~types[var9] == ~var4) {
						var8 = var9;
						break;
					}
				}

				if (0 == ~var8) {
					return null;
				}

				var9 = models[var8];
				if (var2) {
					var9 += 65536;
				}

				var5 = (HDModel) Class99.aClass93_1401.get((long) var9);
				if (null == var5) {
					ModelBuilder var10 = ModelBuilder.get(LookupTable.aClass153_1043, '\uffff' & var9, 0);
					if (null == var10) {
						return null;
					}

					var5 = new HDModel(var10, var6, var7, var2);
					Class99.aClass93_1401.put(var5, (long) var9);
				}
			} else {
				if (var4 != 10) {
					return null;
				}

				if (models == null) {
					return null;
				}

				var8 = models.length;
				if (-1 == ~var8) {
					return null;
				}

				long var16 = 0L;

				for (int var11 = 0; ~var8 < ~var11; ++var11) {
					var16 = (long) models[var11] + var16 * 67783L;
				}

				if (var2) {
					var16 = ~var16;
				}

				var5 = (HDModel) Class99.aClass93_1401.get(var16);
				if (null == var5) {
					ModelBuilder var17 = null;

					for (var12 = 0; ~var8 < ~var12; ++var12) {
						var17 = ModelBuilder.get(client.getModelJs5(models[var12] & '\uffff'), models[var12] & '\uffff', 0);
						if (null == var17) {
							return null;
						}

						if (var8 > 1) {
							Class164.aClass140_Sub5Array2058[var12] = var17;
						}
					}

					if (1 < var8) {
						var17 = new ModelBuilder(Class164.aClass140_Sub5Array2058, var8);
					}

					var5 = new HDModel(var17, var6, var7, var2);
					Class99.aClass93_1401.put(var5, var16);
				}
			}

			boolean var14 = aBoolean1536;
			if (~var4 == -3 && var1 > 3) {
				var14 = !var14;
			}

			boolean var15 = 128 == anInt1488 && -1 == ~anInt1511;
			boolean var18 = -1 == ~var1 && 128 == anInt1479 && ~anInt1481 == -129 && ~anInt1496 == -1 && anInt1534 == 0 && !var14;
			HDModel var19 = var5.method1926(var18, var15, aShortArray1477 == null, true, ~var5.method1903() == ~var6, -1 == ~var1 && !var14, var3, ~var7 == ~var5.method1924(), true, !var14, aShortArray1476 == null);
			if (var14) {
				var19.method1931();
			}

			if (var4 == 4 && 3 < var1) {
				var19.method1932(256);
				var19.move(45, 0, -45);
			}

			var1 &= 3;
			if (1 == var1) {
				var19.method1925();
			} else if (~var1 != -3) {
				if (~var1 == -4) {
					var19.method1902();
				}
			} else {
				var19.method1911();
			}

			if (null != aShortArray1477) {
				for (var12 = 0; ~aShortArray1477.length < ~var12; ++var12) {
					var19.method1918(aShortArray1477[var12], aShortArray1506[var12]);
				}
			}

			if (null != aShortArray1476) {
				for (var12 = 0; ~aShortArray1476.length < ~var12; ++var12) {
					var19.method1916(aShortArray1476[var12], aShortArray1495[var12]);
				}
			}

			if (anInt1479 != 128 || -129 != ~anInt1488 || ~anInt1481 != -129) {
				var19.scale(anInt1479, anInt1488, anInt1481);
			}

			if (-1 != ~anInt1496 || anInt1511 != 0 || 0 != anInt1534) {
				var19.move(anInt1496, anInt1511, anInt1534);
			}

			if (var6 != var19.method1903()) {
				var19.method1914(var6);
			}

			if (var19.method1924() != var7) {
				var19.method1909(var7);
			}

			return var19;
		} catch (RuntimeException var13) {
			throw Class44.method1067(var13, "pb.L(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	final Class136 method1696(int var1, int var2, int[][] var3, int var4, int var5, int[][] var6, boolean var7, LDIndexedSprite var8, byte var9, boolean var10, int var11) {
		try {
			if (var9 >= -5) {
				return (Class136) null;
			} else {
				long var12;
				if (!HDToolkit.openGLEnabled) {
					if (types != null) {
						var12 = (long) ((var4 << 3) + ((anInt1527 << 10) - -var1));
					} else {
						var12 = (long) ((anInt1527 << 10) + var1);
					}

					boolean var20;
					if (var7 && aBoolean1541) {
						var12 |= Long.MIN_VALUE;
						var20 = true;
					} else {
						var20 = false;
					}

					Object var22 = (SceneGraphNode) RawObjectCache.aClass93_4051.get(var12);
					if (null == var22) {
						ModelBuilder var21 = method1686(var1, var4, -1);
						if (var21 == null) {
							OverlayType.aClass136_1413.aClass140_1777 = null;
							return OverlayType.aClass136_1413;
						}

						var21.method2010();
						if (-11 == ~var4 && var1 > 3) {
							var21.method2011(256);
						}

						if (!var20) {
							var22 = new LDModel(var21, 64 - -anInt1494, 5 * anInt1489 + 768, -50, -10, -50);
						} else {
							var21.aShort2879 = (short) (64 + anInt1494);
							var22 = var21;
							var21.aShort2876 = (short) (768 + 5 * anInt1489);
							var21.calculateNormals();
						}

						RawObjectCache.aClass93_4051.put(var22, var12);
					}

					if (var20) {
						var22 = ((ModelBuilder) var22).method2004();
					}

					if (0 != aByte1505) {
						if (!(var22 instanceof LDModel)) {
							if (var22 instanceof ModelBuilder) {
								var22 = ((ModelBuilder) var22).method1999(aByte1505, aShort1500, var3, var6, var2, var5, var11, true, false);
							}
						} else {
							var22 = ((LDModel) var22).method1941(aByte1505, aShort1500, var3, var6, var2, var5, var11, true);
						}
					}

					OverlayType.aClass136_1413.aClass140_1777 = (SceneGraphNode) var22;
					return OverlayType.aClass136_1413;
				} else {
					if (null != types) {
						var12 = (long) (var1 + (anInt1527 << 10) - -(var4 << 3));
					} else {
						var12 = (long) ((anInt1527 << 10) + var1);
					}

					Class136 var16 = (Class136) RawObjectCache.aClass93_4051.get(var12);
					HDModel var14;
					LDIndexedSprite var15;
					if (null == var16) {
						var14 = method1695(var1, false, true, var4);
						if (null == var14) {
							OverlayType.aClass136_1413.aClass140_1777 = null;
							OverlayType.aClass136_1413.aClass109_Sub1_1770 = null;
							return OverlayType.aClass136_1413;
						}

						if (~var4 == -11 && var1 > 3) {
							var14.method1876(256);
						}

						if (var10) {
							var15 = var14.method1933(var8);
						} else {
							var15 = null;
						}

						var16 = new Class136();
						var16.aClass140_1777 = var14;
						var16.aClass109_Sub1_1770 = var15;
						RawObjectCache.aClass93_4051.put(var16, var12);
					} else {
						var14 = (HDModel) var16.aClass140_1777;
						var15 = var16.aClass109_Sub1_1770;
					}

					boolean var17 = aBoolean1541 & var7;
					HDModel var18 = var14.method1926(3 != aByte1505, ~aByte1505 == -1, true, true, true, true, !var17, true, true, true, true);
					if (~aByte1505 != -1) {
						var18.method1919(aByte1505, aShort1500, var14, var3, var6, var2, var5, var11);
					}

					var18.method1920(~anInt1529 == -1 && !aBoolean1510, true, true, true, -1 == ~anInt1529, true, false);
					OverlayType.aClass136_1413.aClass140_1777 = var18;
					var18.aBoolean3809 = var17;
					OverlayType.aClass136_1413.aClass109_Sub1_1770 = var15;
					return OverlayType.aClass136_1413;
				}
			}
		} catch (RuntimeException var19) {
			throw Class44.method1067(var19, "pb.A(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ',' + var5 + ',' + (var6 != null ? "{...}" : "null") + ',' + var7 + ',' + (var8 != null ? "{...}" : "null") + ',' + var9 + ',' + var10 + ',' + var11 + ')');
		}
	}

	final Class136 method1697(int var1, int var2, LDIndexedSprite var3, int var4, AnimationDefinition var5, int var6, int[][] var7, boolean var8, int var9, int var10, int[][] var11, int var12, int var13, int var14) {
		try {
			if (var10 != 8308) {
				method1694(false);
			}

			long var15;
			if (HDToolkit.openGLEnabled) {
				if (types != null) {
					var15 = (long) ((var13 << 3) + ((anInt1527 << 10) - -var6));
				} else {
					var15 = (long) (var6 + (anInt1527 << 10));
				}

				HDModel var23 = (HDModel) Class154.aClass93_1965.get(var15);
				if (var23 == null) {
					var23 = method1695(var6, true, true, var13);
					if (null == var23) {
						return null;
					}

					var23.method1908();
					var23.method1920(false, false, false, true, false, false, true);
					Class154.aClass93_1965.put(var23, var15);
				}

				boolean var19 = false;
				HDModel var22 = var23;
				if (null != var5) {
					var22 = (HDModel) var5.method2056(var12, var9, var14, var6, var23, 3);
					var19 = true;
				}

				if (~var13 == -11 && 3 < var6) {
					if (!var19) {
						var22 = (HDModel) var22.method1890(true, true, true);
						var19 = true;
					}

					var22.method1876(256);
				}

				if (var8) {
					OverlayType.aClass136_1413.aClass109_Sub1_1770 = var22.method1933(var3);
				} else {
					OverlayType.aClass136_1413.aClass109_Sub1_1770 = null;
				}

				if (aByte1505 != 0) {
					if (!var19) {
						var19 = true;
						var22 = (HDModel) var22.method1890(true, true, true);
					}

					var22.method1919(aByte1505, aShort1500, var23, var7, var11, var2, var4, var1);
				}

				OverlayType.aClass136_1413.aClass140_1777 = var22;
				return OverlayType.aClass136_1413;
			} else {
				if (types == null) {
					var15 = (long) ((anInt1527 << 10) + var6);
				} else {
					var15 = (long) (var6 + (anInt1527 << 10) + (var13 << 3));
				}

				LDModel var17 = (LDModel) Class154.aClass93_1965.get(var15);
				if (var17 == null) {
					ModelBuilder var18 = method1686(var6, var13, -1);
					if (var18 == null) {
						return null;
					}

					var17 = new LDModel(var18, 64 + anInt1494, anInt1489 * 5 + 768, -50, -10, -50);
					Class154.aClass93_1965.put(var17, var15);
				}

				boolean var21 = false;
				if (var5 != null) {
					var21 = true;
					var17 = (LDModel) var5.method2054(19749, var9, var12, var17, var6, var14);
				}

				if (-11 == ~var13 && var6 > 3) {
					if (!var21) {
						var21 = true;
						var17 = (LDModel) var17.method1890(true, true, true);
					}

					var17.method1876(256);
				}

				if (aByte1505 != 0) {
					if (!var21) {
						var17 = (LDModel) var17.method1890(true, true, true);
						var21 = true;
					}

					var17 = var17.method1941(aByte1505, aShort1500, var7, var11, var2, var4, var1, false);
				}

				OverlayType.aClass136_1413.aClass140_1777 = var17;
				return OverlayType.aClass136_1413;
			}
		} catch (RuntimeException var20) {
			throw Class44.method1067(var20, "pb.M(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ',' + var6 + ',' + (var7 != null ? "{...}" : "null") + ',' + var8 + ',' + var9 + ',' + var10 + ',' + (var11 != null ? "{...}" : "null") + ',' + var12 + ',' + var13 + ',' + var14 + ')');
		}
	}

	final jString method1698(jString var1, int var2, int var3) {
		try {
			if (var2 != -23085) {
				method1688(108, -11, 57);
			}

			if (null != aClass130_1501) {
				StringNode var4 = (StringNode) aClass130_1501.get((long) var3);
				return var4 == null ? var1 : var4.value;
			} else {
				return var1;
			}
		} catch (RuntimeException var5) {
			throw Class44.method1067(var5, "pb.E(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}

	static final ObjectDefinition list(int var1) {
		ObjectDefinition var2 = (ObjectDefinition) Canvas_Sub1.aClass93_21.get((long) var1);
		if (var2 != null)
			return var2;
		byte[] var3 = Class85.aClass153_1171.getFile(6, var1);
		var2 = new ObjectDefinition();
		var2.anInt1527 = var1;
		if (null != var3) {
			var2.decode(new Buffer(var3));
		}
		var2.method1689();
		if (!Class14.aBoolean337 && var2.aBoolean1491) {
			var2.aClass94Array1499 = null;
		}
		if (var2.aBoolean1498) {
			var2.clipType = 0;
			var2.projectileCliped = false;
		}
		Canvas_Sub1.aClass93_21.put(var2, (long) var1);
		return var2;
	}

	public ObjectDefinition() {
		name = Class3_Sub13_Sub13.aClass94_3150;
		aBoolean1503 = true;
		anInt1493 = -1;
		anInt1515 = 0;
		anInt1516 = -1;
		aByte1505 = 0;
		aBoolean1491 = false;
		anInt1517 = -1;
		anInt1496 = 0;
		anInt1518 = 0;
		anInt1482 = -1;
		aBoolean1510 = false;
		anInt1520 = -1;
		aShort1500 = -1;
		anInt1481 = 128;
		aClass94Array1499 = new jString[5];
		anInt1479 = 128;
		aBoolean1492 = true;
		anInt1488 = 128;
		aBoolean1498 = false;
		anInt1529 = -1;
		aBoolean1530 = false;
		aBoolean1525 = true;
		anInt1532 = -1;
		anInt1522 = -1;
		anInt1533 = 0;
		projectileCliped = true;
		anInt1534 = 0;
		anInt1478 = 0;
		anInt1528 = 16;
		aBoolean1537 = false;
		anInt1511 = 0;
		anInt1484 = 0;
		anInt1489 = 0;
		anInt1531 = -1;
		aBoolean1507 = false;
		anInt1512 = -1;
		clipType = 2;
		aBoolean1536 = false;
		anInt1526 = -1;
		anInt1540 = -1;
		aBoolean1541 = false;
		aBoolean1542 = false;
	}

}
