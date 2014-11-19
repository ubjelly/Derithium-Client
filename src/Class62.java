
final class Class62 {

   static int anInt942;
   int[][] groupFileNames;
   static int anInt944 = 0;
   int[] groupCrcs;
   byte[][][] groupFileBuffers;
   static jString aClass94_946 = jString.createJString(")2");
   int groupLength;
   private static jString aClass94_948 = jString.createJString("You can(Wt add yourself to your own friend list)3");
   LookupTable groupLookupTable;
   static int anInt950;
   static int anInt952;
   int[] groupIds;
   int[] groupFileAmount;
   int[] groupNames;
   int[] groupFileCount;
   static jString aClass94_957 = aClass94_948;
   int[] groupVersions;
   int[][] groupFileIds;
   int anInt960;
   int rev;
   LookupTable[] groupFileLookupTable;
   static int anInt963;
   int anInt964;


   public static void method1223(int var0) {
      try {
         aClass94_946 = null;
         if(var0 == 0) {
            aClass94_948 = null;
            aClass94_957 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ii.A(" + var0 + ')');
      }
   }

   static final void method1224(jInterface var0, int var2, int var3) {
         if(0 != var0.aByte162) {
            if(var0.aByte162 != 1) {
               if(2 == var0.aByte162) {
                  var0.anInt210 = var2 - var0.anInt193 - var0.y;
               } else if(var0.aByte162 != 3) {
                  if(4 == var0.aByte162) {
                     var0.anInt210 = (var2 * var0.y >> 14) + (-var0.anInt193 + var2) / 2;
                  } else {
                     var0.anInt210 = -(var2 * var0.y >> 14) + -var0.anInt193 + var2;
                  }
               } else {
                  var0.anInt210 = var0.y * var2 >> 14;
               }
            } else {
               var0.anInt210 = (var2 - var0.anInt193) / 2 + var0.y;
            }
         } else {
            var0.anInt210 = var0.y;
         }

         if(0 == var0.aByte273) {
            var0.anInt306 = var0.x;
         } else if(~var0.aByte273 != -2) {
            if(var0.aByte273 == 2) {
               var0.anInt306 = -var0.x + -var0.anInt168 + var3;
            } else if(3 != var0.aByte273) {
               if(4 != var0.aByte273) {
                  var0.anInt306 = -(var3 * var0.x >> 14) + var3 + -var0.anInt168;
               } else {
                  var0.anInt306 = (var0.x * var3 >> 14) + (var3 - var0.anInt168) / 2;
               }
            } else {
               var0.anInt306 = var0.x * var3 >> 14;
            }
         } else {
            var0.anInt306 = var0.x + (var3 - var0.anInt168) / 2;
         }

         if(LookupTable.qaoptestEnabled && (jInterface.getInterfaceClickMask(var0).clickMask != 0 || ~var0.type == -1)) {
            if(~var0.anInt210 > -1) {
               var0.anInt210 = 0;
            } else if(var0.anInt193 + var0.anInt210 > var2) {
               var0.anInt210 = var2 + -var0.anInt193;
            }

            if(0 > var0.anInt306) {
               var0.anInt306 = 0;
            } else if(var3 < var0.anInt306 - -var0.anInt168) {
               var0.anInt306 = var3 + -var0.anInt168;
            }
         }

   }

	static final void method1225() {
		MouseHandler var1 = RawObjectCache.mouseHandler;
		synchronized (var1) {
			Class3_Sub13_Sub5.anInt3069 = SpotAnimation.anInt549;
			PlainTile.anInt1676 = Class3_Sub21.anInt2493;
			Hashtable.anInt1709 = Class95.anInt1340;
			Class3_Sub28_Sub11.anInt3644 = Class140_Sub3.anInt2743;
			Class163_Sub1.anInt2993 = client.anInt362;
			++RawObjectCache.anInt4045;
			Class38_Sub1.anInt2614 = Class3_Sub13_Sub32.anInt3389;
			Class75.aLong1102 = Class140_Sub6.aLong2926;
			Class140_Sub3.anInt2743 = 0;
		}
	}

	private final void method1226(byte[] var2) {
		Buffer buffer = new Buffer(EnumType.method623(var2));
		int protocol = buffer.getUByte();
		if (protocol >= 6) {
			rev = buffer.getInt();
		} else {
			rev = 0;
		}
		int groupNamed = buffer.getUByte();
		int offset = 0;
		groupLength = protocol >= 7 ? buffer.readSmart32() : buffer.getUShort();
		int var7 = -1;
		groupIds = new int[groupLength];
		int var8;
		for (var8 = 0; groupLength > var8; ++var8) {
			groupIds[var8] = offset += protocol >= 7 ? buffer.readSmart32() : buffer.getUShort();
			if (groupIds[var8] > var7) {
				var7 = groupIds[var8];
			}
		}
		anInt960 = var7 + 1;
		groupVersions = new int[anInt960];
		groupFileIds = new int[anInt960][];
		groupCrcs = new int[anInt960];
		groupFileBuffers = new byte[anInt960][][];
		groupFileAmount = new int[anInt960];
		groupFileCount = new int[anInt960];
		if (groupNamed != 0) {
			groupNames = new int[anInt960];
			//for (int id = 0; id < anInt960; ++id) {
			//	groupNames[id] = -1;
			//}
			for (int id = 0; id < groupLength; ++id) {
				groupNames[groupIds[id]] = buffer.getInt();
			}
			groupLookupTable = new LookupTable(groupNames);
		}
		for (int id = 0; groupLength > id; ++id) {
			groupCrcs[groupIds[id]] = buffer.getInt();
		}
		for (int id = 0; groupLength > id; ++id) {
			groupVersions[groupIds[id]] = buffer.getInt();
		}
		for (int id = 0; groupLength > id; ++id) {
			groupFileCount[groupIds[id]] = protocol >= 7 ? buffer.readSmart32() : buffer.getUShort();
		}
		for (int groupIdx = 0; groupIdx < groupLength; ++groupIdx) {
			offset = 0;
			int groupId = groupIds[groupIdx];
			int fileCount = groupFileCount[groupId];
			int maxFileId = -1;
			groupFileIds[groupId] = new int[fileCount];
			for (int fileIdx = 0; fileCount > fileIdx; ++fileIdx) {
				int fileId = groupFileIds[groupId][fileIdx] = offset += protocol >= 7 ? buffer.readSmart32() : buffer.getUShort();
				if (fileId > maxFileId) {
					maxFileId = fileId;
				}
			}
			groupFileBuffers[groupId] = new byte[maxFileId + 1][];
			groupFileAmount[groupId] = maxFileId + 1;
			//if (~(1 + maxFileId) == ~fileCount) {
			//	groupFileIds[groupId] = null;
			//}
		}
		if (groupNamed != 0) {
			groupFileLookupTable = new LookupTable[var7 + 1];
			groupFileNames = new int[1 + var7][];
			for (int groupIdx = 0; groupIdx < groupLength; ++groupIdx) {
				int groupId = groupIds[groupIdx];
				int fileCount = groupFileCount[groupId];
				groupFileNames[groupId] = new int[groupFileBuffers[groupId].length];
				// for(int fileIdx = 0; fileIdx < groupFileAmount[groupId];
				// ++fileIdx) {
				// groupFileNames[groupId][fileIdx] = -1;
				// }
				for (int fileIdx = 0; fileIdx < fileCount; ++fileIdx) {
					int fileId;
					if (null != groupFileIds[groupId]) {
						fileId = groupFileIds[groupId][fileIdx];
					} else {
						fileId = fileIdx;
					}
					groupFileNames[groupId][fileId] = buffer.getInt();
				}
				groupFileLookupTable[groupId] = new LookupTable(groupFileNames[groupId]);
			}
		}
	}

	Class62(byte[] var1, int var2) {
		anInt964 = Class38.method1026(var1, var1.length, false);
		if (var2 == anInt964) {
			method1226(var1);
		} else {
			throw new RuntimeException();
		}
	}

}
