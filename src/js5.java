
class js5 {

   static int anInt1944;
   private boolean clearOnUnpack;
   private boolean clearOnUse;
   private Class151 aClass151_1947;
   static js5Worker cacheIndex13;
   public Class62 aClass62_1949 = null;
   static int anInt1950;
   static boolean aBoolean1951 = false;
   static int anInt1953;
   public byte[][] groupBuffer;


   final boolean allGroupsExist() {
	   if(!method2122()) {
		   return false;
	   } else {

		   boolean finished = true;
	
		   for(int groupIndex = 0; groupIndex < aClass62_1949.groupIds.length; ++groupIndex) {
			   int groupId = aClass62_1949.groupIds[groupIndex];
			   if(null == groupBuffer[groupId]) {
				   requestDownload(groupId);
				   if(null == groupBuffer[groupId]) {
					   finished = false;
				   }
			   }
		   }

		   return finished;
	   }
   }

   final void method2115(boolean var2, boolean var3) {
		if (method2122()) {
			if (var2) {
				aClass62_1949.groupNames = null;
				aClass62_1949.groupLookupTable = null;
			}

			if (var3) {
				aClass62_1949.groupFileLookupTable = null;
				aClass62_1949.groupFileNames = (int[][]) null;
			}

		}
   }

   final int method2116(int var1, jString var2) {
      try {
         if(!method2122()) {
            return 0;
         } else {
            var2 = var2.toLowerCase();
            if(var1 != 22813) {
               return -12;
            } else {
               int var3 = aClass62_1949.groupLookupTable.method1280(var2.method1574());
               return 0;//method2114(var3);TODO
            }
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "ve.P(" + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   final boolean method2117(int var2) {
	   /*if(method2130(var2)) {
		   if(null == groupBuffer[var2]) {
			   requestDownload(var2);
			   return null != groupBuffer[var2];
		   } else {
			   return true;
		   }
	   } else {
		   return false;
	   }*/
		if (groupBuffer[var2] != null)
			return true;
		requestDownload(var2);
		if (groupBuffer[var2] != null)
			return true;
		return false;
   }
   
	void requestDownload(int i_76_) {
	}

   final int method2118() {
	   if(method2122()) {
           return aClass62_1949.anInt964;
        } else {
           throw new IllegalStateException("");
        }
   }

   public static void method2119(int var0) {
      try {
         if(var0 != 100) {
            method2143(-91, 7, -83, 24);
         }

         cacheIndex13 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ve.AA(" + var0 + ')');
      }
   }

   final int method2120(jString var1) {
	   if(method2122()) {
		   var1 = var1.toLowerCase();
		   int var3 = aClass62_1949.groupLookupTable.method1280(var1.method1574());
		   //if (method2130(var3)) {
			   return var3;
			   //} else {
			   //   return -1;
		   //
	   } else {
		   return -1;
	   }
   }

   final int method2121() {
	   if(!method2122()) {
           return -1;
        } else {
           return aClass62_1949.groupFileAmount.length;
        }
   }
   
   public void decode(byte[] buffer, int crc) {
	   aClass62_1949 = new Class62(buffer, crc);
	   groupBuffer = new byte[aClass62_1949.anInt960][];
   }

	private final boolean method2122() {
		if (aClass62_1949 == null) {
			return false;
		}
		return true;
	}

	final byte[] method2123(jString var2, jString var3) {
		if (!method2122()) {
			return null;
		} else {
			var3 = var3.toLowerCase();
			var2 = var2.toLowerCase();
			int var4 = aClass62_1949.groupLookupTable.method1280(var3.method1574());

			if (method2130(var4)) {
				int var5 = aClass62_1949.groupFileLookupTable[var4].method1280(var2.method1574());
				return getFile(var4, var5);
			} else {
				return null;
			}
		}
	}

	final void method2124(jString var2) {
		if (method2122()) {
			var2 = var2.toLowerCase();
			int var3 = aClass62_1949.groupLookupTable.method1280(var2.method1574());
			method2131(var3);
		}
	}
	
	

	final boolean method2125(jString var1, jString var3) {
		if (!method2122()) {
			return false;
		} else {
			var3 = var3.toLowerCase();
			var1 = var1.toLowerCase();
			int var4 = aClass62_1949.groupLookupTable.method1280(var3.method1574());
			if (method2130(var4)) {
				int var5 = aClass62_1949.groupFileLookupTable[var4].method1280(var1.method1574());
				return method2129(var5, var4);
			} else {
				return false;
			}
		}
	}

   final byte[] method2126(int group, int[] var2, int file) {
		if (group < 0 || group >= aClass62_1949.groupFileBuffers.length
				|| aClass62_1949.groupFileBuffers[group] == null || file < 0
				|| aClass62_1949.groupFileBuffers[group].length <= file)
			return null;
		if (aClass62_1949.groupFileBuffers[group] == null || aClass62_1949.groupFileBuffers[group][file] == null) {
			boolean var5 = unpack(group, var2);
			if (!var5) {
				requestDownload(group);
				var5 = unpack(group, var2);
				if (!var5) {
					return null;
				}
			}
		}
		byte[] var7 = aClass62_1949.groupFileBuffers[group][file];
		/*if (clearOnUse) {
			aClass62_1949.groupFileBuffers[group][file] = null;
			if (aClass62_1949.groupFileAmount[group] == 1) {
				aClass62_1949.groupFileBuffers[group] = null;
			}
		}*/
		return var7;
   }

	final boolean method2127(jString var2) {
		if (method2122()) {
			var2 = var2.toLowerCase();
			int var3 = aClass62_1949.groupLookupTable.method1280(var2.method1574());
			return method2117(var3);
		} else {
			return false;
		}
	}

	final void method2128(int var2) {
		/*if (method2130(var2)) {
			if (null != aClass62_1949.groupFileBuffers) {
				aClass62_1949.groupFileBuffers[var2] = null;
			}

		}*/
	}

   final boolean method2129(int var2, int var3) {
	   if(method2139(var3, var2)) {
           if(aClass62_1949.groupFileBuffers[var3] != null && null != aClass62_1949.groupFileBuffers[var3][var2]) {
              return true;
           } else if(groupBuffer[var3] == null) {
              requestDownload(var3);
              return groupBuffer[var3] != null;
           } else {
              return true;
           }
        } else {
           return false;
        }
   }

   private final boolean method2130(int var2) {
	   if(method2122()) {
		   if(var2 >= 0 && aClass62_1949.groupFileAmount.length > var2 && ~aClass62_1949.groupFileAmount[var2] != -1) {
			   return true;
		   } else {
			   throw new IllegalArgumentException(Integer.toString(var2));
		   }
	   } else {
		   return false;
	   }
   }

	void method2131(int var2) {
	}

   private final boolean unpack(int file, int[] keys) {
         //if(!method2130(var2, var1)) {
         //   return false;
         //} else
		if (groupBuffer[file] == null) {
			return false;
		} else {
			int[] children = aClass62_1949.groupFileIds[file];
			int size = aClass62_1949.groupFileCount[file];

			boolean prepared = true;
			byte[][] childs = aClass62_1949.groupFileBuffers[file];

			for (int id = 0; id < size; ++id) {
				int var9;
				if(children == null) {
					var9 = id;
				} else {
					var9 = children[id];
				}

				if(childs[var9] == null) {
					prepared = false;
					break;
				}
			}

			if (prepared)
				return true;
			byte[] unwrapped;
			if (null != keys && (keys[0] != 0 || keys[1] != 0 || 0 != keys[2] || keys[3] != 0)) {
				unwrapped = new byte[groupBuffer[file].length];
				System.arraycopy(groupBuffer[file], 0, unwrapped, 0, unwrapped.length);
				Buffer var22 = new Buffer(unwrapped);
				var22.method770(keys, 120, 5, var22.buf.length);
			} else {
				unwrapped = groupBuffer[file];
			}

			byte[] uncompressed;
			try {
				uncompressed = EnumType.method623(unwrapped);
			} catch (RuntimeException var19) {
				throw Class44.method1067(var19, "T3 - " + (keys != null) + "," + file + "," + unwrapped.length + "," + Class38.method1026(unwrapped, unwrapped.length, false) + "," + Class38.method1026(unwrapped, unwrapped.length - 2, false) + "," + aClass62_1949.groupCrcs[file] + "," + aClass62_1949.anInt964);
			}

			//if (clearOnUnpack) {
			//	groupBuffer[file] = null;
			//}

			if (size > 1) {
				int length = uncompressed.length;
				int verification = uncompressed[--length] & 0xff;
				length -= size * verification * 4;
				Buffer buffer = new Buffer(uncompressed);
				buffer.pos = length;
				int[] outOffset = new int[size];
				for (int i = 0; i < verification; ++i) {
					int offset = 0;
					for (int count = 0; ~size < ~count; ++count) {
						offset += buffer.getInt();
						outOffset[count] += offset;
					}
				}
				for (int i = 0; i < size; ++i) {
					if (childs[children[i]] == null)
						childs[children[i]] = new byte[outOffset[i]];
					outOffset[i] = 0;
				}
				buffer.pos = length;
				int readPos = 0;
				for (int i = 0; i < verification; ++i) {
					int offset = 0;
					for (int id = 0; size > id; ++id) {
						offset += buffer.getInt();
						ArrayUtils.arrayCopy(uncompressed, readPos, childs[children[id]], outOffset[id], offset);
						readPos += offset;
						outOffset[id] += offset;
					}
				}

			} else {
				int id = 0;
				if(null != children) {
					id = children[0];
				} else {
					id = 0;
				}
				childs[id] = uncompressed;
			}

			return true;
		}
	}

   final byte[] getFile(int var1, int var3) {
	   return method2126(var1, (int[])null, var3);
   }

   final boolean method2135(jString var1) {
		if (method2122()) {
			var1 = var1.toLowerCase();
			int var3 = aClass62_1949.groupLookupTable.method1280(var1.method1574());
			return ~var3 <= -1;
		} else {
			return false;
		}
	}

   final void method2137() {
         /*if(aClass62_1949.groupFileBuffers != null) {
            for(int var2 = 0; aClass62_1949.groupFileBuffers.length > var2; ++var2) {
               aClass62_1949.groupFileBuffers[var2] = null;
            }
         }*/
   }

   final byte[] method2138(int var1) {
      try {
         if(!method2122()) {
            return null;
         } else if(~aClass62_1949.groupFileAmount.length == -2) {
            return getFile(0, var1);
         } else if(!method2130(var1)) {
            return null;
         } else if(~aClass62_1949.groupFileAmount[var1] != -2) {
        	 throw new RuntimeException();
         } else {
            return getFile(var1, 0);
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "ve.HA(" + var1 + ')');
      }
   }

	private final boolean method2139(int group, int file) {
		if (method2122()) {
			if (aClass62_1949.groupFileAmount.length < group) {
				return false;
			}
			if (group >= 0 && file >= 0 && aClass62_1949.groupFileAmount.length > group && aClass62_1949.groupFileAmount[group] > file) {
				return true;
			} else {
				throw new IllegalArgumentException(group + "," + file);
			}
		} else {
			return false;
		}
	}

	final byte[] method2140(int var1, int var2, int var3) {
		if (!method2139(var2, var1)) {
			return null;
		} else {
			if (aClass62_1949.groupFileBuffers[var2] == null || null == aClass62_1949.groupFileBuffers[var2][var1]) {
				boolean var4 = unpack(var2, (int[]) null);
				if (!var4) {
					requestDownload(var2);
					var4 = unpack(var2, (int[]) null);
					if (!var4) {
						return null;
					}
				}
			}

			byte[] var6 = aClass62_1949.groupFileBuffers[var2][var1];
			return var6;
		}
	}

   final int[] getChildEntries(int var2) {
	   if(!method2130(var2)) {
           return null;
        } else {
           int[] var3 = aClass62_1949.groupFileIds[var2];
           if(null == var3) {
              var3 = new int[aClass62_1949.groupFileCount[var2]];

              for(int var4 = 0; var3.length > var4; var3[var4] = var4++) {
                 ;
              }
           }
           return var3;
        }
   }

   js5(Class151 var1, boolean var2, boolean var3) {
      try {
         aClass151_1947 = var1;
         clearOnUnpack = var2;
         clearOnUse = var3;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "ve.<init>(" + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   final int getChildCount(int var1) {
	   if(!method2130(var1)) {
           return 0;
        } else {
           return aClass62_1949.groupFileAmount[var1];
        }
   }

   static final void method2143(int var1, int var2, int var3, int var4) {
	   InterfaceChangeNode var5 = Class3_Sub24_Sub3.putInterfaceChange(8, var2);
	   var5.add();
	   var5.intValue3 = var1;
	   var5.intValue = var4;
	   var5.intValue2 = var3;
   }

	final boolean method2144(int var2) {
		if (!method2122()) {
			return false;
		} else if (aClass62_1949.groupFileAmount.length == 1) {
			return method2129(var2, 0);
		} else if (aClass62_1949.groupFileAmount[var2] == 1) {
			return method2129(0, var2);
		} else {
			throw new RuntimeException();
		}
	}

}
