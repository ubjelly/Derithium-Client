import java.io.IOException;
import java.util.zip.CRC32;

final class Js5CacheWorker {

   private static Hashtable aClass40_1146 = new Hashtable(4096);
   static jString aClass94_995 = jString.createJString("(Y<)4col>");
   static AbstractSprite[] aClass3_Sub28_Sub16Array996;
   static int anInt997 = 0;
   static int anInt998 = 0;
   static int anInt999 = -1;
	static CRC32 aCRC32_2190 = new CRC32();
   private static Hashtable aClass40_1630 = new Hashtable(32);
   private static Queue aClass30_2033 = new Queue();
   static int anInt1002 = 0;
   private static Hashtable aClass40_1335 = new Hashtable(4096);
   private static Hashtable aClass40_14 = new Hashtable(4096);
   public static long lastConnection;
   public static jSocket js5Connection2;
   public static int latency;
   public static Buffer aClass3_Sub12_2087 = new Buffer(8);
   public static byte encryption = 0;
   static volatile int anInt1010 = 0;
   public static volatile int failAttemps = 0;
   public static BufferedRequest aClass3_Sub3_Sub13_128;
   public static int anInt1132;
   public static int anInt335;
   public static int anInt1501;
   public static int anInt1744;
   public static int anInt865 = 0;
   public static Buffer aClass3_Sub12_1448;
   public static boolean aBoolean159;

   final boolean method1241() {
	   return 20 <= method1246();
   }

   public static void method1242() {
	   aClass3_Sub28_Sub16Array996 = null;
	   aClass94_995 = null;
   }

   static boolean processUpdateServer() {
		long time = TimeUtil.currentTimeMillis();
		int timeDiff = (int) (time - lastConnection);
		lastConnection = time;
		if (timeDiff > 200) {
			timeDiff = 200;
		}
		latency += timeDiff;
		if (anInt335 == 0 && anInt865 == 0 && anInt1132 == 0 && anInt1501 == 0) {
			return true;
		}
		if (js5Connection2 == null) {
			return false;
		} else {
			try {
				
				if (latency > 30000) {
					throw new IOException();
				}
				//js5Connection2.method1466();

				/*BufferedRequest var21;
				for (var21 = (BufferedRequest) aClass40_1146.method876(); null != var21; var21 = (BufferedRequest) aClass40_1146.method878()) {
					aClass3_Sub30_1007.pos = 0;
					aClass3_Sub30_1007.putByte(1);
					aClass3_Sub30_1007.putTriByte((int) var21.uid);
					js5Connection2.write(aClass3_Sub30_1007.buf, 0, 4);
					aClass40_1630.put(var21, var21.uid);
				}*/
				while (anInt865 < 20) {
					if (anInt1501 <= 0)
						break;
					BufferedRequest request = (BufferedRequest) aClass40_1146.getFirst();
					Buffer buffer = new Buffer(4);
					buffer.putByte(1);
					buffer.putTriByte((int) request.hash);
					js5Connection2.write(buffer.buf, 0, 4);
					aClass40_1630.put(request, request.hash);
					anInt865++;
					anInt1501--;
				}

				for (/**/; anInt335 < 20 && anInt1132 > 0; anInt335++) {
					BufferedRequest class3_sub3_sub13 = (BufferedRequest) aClass30_2033.peekFirst();
					Buffer class3_sub12 = new Buffer(4);
					class3_sub12.putByte(0);
					class3_sub12.putTriByte((int) class3_sub3_sub13.hash);
					js5Connection2.write(class3_sub12.buf, 0, 4);
					class3_sub3_sub13.unlinkSub();
					aClass40_1335.put(class3_sub3_sub13, class3_sub3_sub13.hash);
					anInt1132--;
				}

				for (int var3 = 0; 100 > var3; ++var3) {
					int avail = js5Connection2.available();
					if (avail < 0) {
						throw new IOException();
					}

					if (avail == 0) {
						break;
					}

					latency = 0;
					byte i_3_ = 0;
					if (null != aClass3_Sub3_Sub13_128) {
						if (anInt1744 == 0) {
							i_3_ = 1;
						}
					} else {
						i_3_ = 8;
					}
					if (i_3_ <= 0) {
						int i_12_ = aClass3_Sub12_1448.buf.length - aClass3_Sub3_Sub13_128.padding;
						int i_13_ = 512 - anInt1744;
						if (i_13_ > i_12_ - aClass3_Sub12_1448.pos) {
							i_13_ = i_12_ - aClass3_Sub12_1448.pos;
						}

						if (i_13_ > avail) {
							i_13_ = avail;
						}

						js5Connection2.read(aClass3_Sub12_1448.buf, aClass3_Sub12_1448.pos, i_13_);
						if (encryption != 0) {
							for (int i_14_ = 0; i_13_ > i_14_; ++i_14_) {
								aClass3_Sub12_1448.buf[aClass3_Sub12_1448.pos + i_14_] ^= encryption;
							}
						}

						anInt1744 += i_13_;
						aClass3_Sub12_1448.pos += i_13_;
						if (aClass3_Sub12_1448.pos == i_12_) {
							if (aClass3_Sub3_Sub13_128.hash == 16711935L) {
								client.aClass3_Sub12_1667 = aClass3_Sub12_1448;
								for (int i_15_ = 0; i_15_ < 256; i_15_++) {
									js5Worker class18_sub1 = Class8.aClass18_Sub1Array745[i_15_];
									if (class18_sub1 != null) {
										client.aClass3_Sub12_1667.pos = i_15_ * 4 + 5;
										int i_16_ = client.aClass3_Sub12_1667.getInt();
										class18_sub1.setIndexCrc(i_16_);
									}
								}
							} else {
								aCRC32_2190.reset();
								aCRC32_2190.update(aClass3_Sub12_1448.buf, 0, i_12_);
								int i_17_= (int) aCRC32_2190.getValue();
								if (i_17_ != aClass3_Sub3_Sub13_128.blockPosition) {
								    try {
										js5Connection2.close();
								    } catch (Exception exception) {
								    }
								    encryption = (byte) (int) (255.0 * Math.random() + 1.0);
								    js5Connection2 = null;
								    //js5CrcError = 0;
								    return false;
								}
								//js5CrcError = 100;//TODO ghetto fix
								failAttemps = 0;
								aClass3_Sub3_Sub13_128.worker.method602(aClass3_Sub12_1448.buf, (int) (aClass3_Sub3_Sub13_128.hash & 0xffffL), (aClass3_Sub3_Sub13_128.hash & 0xff0000L) == 16711680L, aBoolean159);
							}
							aClass3_Sub3_Sub13_128.unlink();
							aClass3_Sub3_Sub13_128 = null;
							anInt1744 = 0;
							if (!aBoolean159)
								anInt335--;
							else
								anInt865--;
							aClass3_Sub12_1448 = null;
						} else {
							if (anInt1744 == 512) {
								anInt1744 = 0;
							}
						}
					} else {
						int i_4_ = i_3_ - aClass3_Sub12_2087.pos;
						if (i_4_ > avail) {
							i_4_ = avail;
						}

						js5Connection2.read(aClass3_Sub12_2087.buf, aClass3_Sub12_2087.pos, i_4_);
						if (0 != encryption) {
							for (int i_5_ = 0; i_5_ < i_4_; ++i_5_) {
								aClass3_Sub12_2087.buf[i_5_ + aClass3_Sub12_2087.pos] ^= encryption;
							}
						}

						aClass3_Sub12_2087.pos += i_4_;
						if (~aClass3_Sub12_2087.pos <= ~i_3_) {
							if (aClass3_Sub3_Sub13_128 == null) {
								aClass3_Sub12_2087.pos = 0;
								int cache = aClass3_Sub12_2087.getUByte();
								int file = aClass3_Sub12_2087.getUShort();
								int settings = aClass3_Sub12_2087.getUByte();
								int fileSize = aClass3_Sub12_2087.getInt();
								long uid = (long) ((cache << 16) + file);
								BufferedRequest var15 = (BufferedRequest) aClass40_1630.get(uid);
								aBoolean159 = true;
								if(var15 == null) {
									var15 = (BufferedRequest) aClass40_1335.get(uid);
									aBoolean159 = false;
								}
								if (null == var15) {
									// break;
									throw new IOException();
								}
								aClass3_Sub3_Sub13_128 = var15;
								int var16 = settings == 0 ? 5 : 9;
								aClass3_Sub12_1448 = new Buffer(fileSize + var16 + aClass3_Sub3_Sub13_128.padding);
								aClass3_Sub12_1448.putByte(settings);
								aClass3_Sub12_1448.putInt(fileSize);
								anInt1744 = 8;
								aClass3_Sub12_2087.pos = 0;
							} else if (anInt1744 == 0) {
								if (aClass3_Sub12_2087.buf[0] == -1) {
									aClass3_Sub12_2087.pos = 0;
									anInt1744 = 1;
								} else {
									aClass3_Sub3_Sub13_128 = null;
								}
							}
						}
					}
				}

				return true;
			} catch (IOException var19) {
				//var19.printStackTrace();
				 try {
					 js5Connection2.close();
				 } catch (Exception var17) {
					 
				 }
				 ++failAttemps;
				 js5Connection2 = null;
				return false;// 0 == method1253(4) && ~method1246(11706) == -1;
			}
		}
   }

   static final Class3_Sub15 method1245(js5 var1, int var2) {
	   byte[] var3 = var1.method2138(var2);
	   return var3 != null?new Class3_Sub15(var3):null;
   }

   private final int method1246() {
	   return aClass30_2033.method874() + aClass40_1335.method1785();
   }

	static final void method1247(boolean var1) {
		if (null != js5Connection2) {
			try {
				Buffer class3_sub12 = new Buffer(4);
				class3_sub12.putByte(var1 ? 2 : 3);
				class3_sub12.putTriByte(0);
				js5Connection2.write(class3_sub12.buf, 0, 4);
			} catch (IOException var6) {
				try {
					js5Connection2.close();
				} catch (Exception var5) {
					;
				}

				failAttemps++;
				anInt1010 = -2;
				js5Connection2 = null;
			}

		}
	}
	
	static final void method682(js5Worker class18_sub1, int i_0_) {
		if (client.aClass3_Sub12_1667 != null) {
		    client.aClass3_Sub12_1667.pos = i_0_ * 4 + 5;
		    int i_1_ = client.aClass3_Sub12_1667.getInt();
		    class18_sub1.setIndexCrc(i_1_);
		} else {
		    method164(true, null, 0, (byte) 0, 255, 255);
		    Class8.aClass18_Sub1Array745[i_0_] = class18_sub1;
		}
	}

   final static void method1249(boolean var1, jSocket var2) {
         if(null != js5Connection2) {
            try {
               js5Connection2.close();
            } catch (Exception var8) {
               ;
            }

            js5Connection2 = null;
         }

         js5Connection2 = var2;
         //method1256();
         method1247(var1);
         aClass3_Sub12_2087.pos = 0;
         aClass3_Sub3_Sub13_128 = null;

         for (;;) {
 	    	BufferedRequest class3_sub3_sub13 = ((BufferedRequest) aClass40_1630.getFirst());
 	    	if (class3_sub3_sub13 == null)
 	    		break;
 	    	aClass40_1146.put(class3_sub3_sub13, (((Node) class3_sub3_sub13).hash));
 	    	anInt1501++;
 	    	anInt865--;
 	    }
 	    for (;;) {
 	    	BufferedRequest class3_sub3_sub13 = ((BufferedRequest) aClass40_1335.getFirst());
 	    	if (class3_sub3_sub13 == null)
 	    		break;
 	    	aClass30_2033.insertFirst(class3_sub3_sub13);
 	    	aClass40_14.put(class3_sub3_sub13, (((Node) class3_sub3_sub13).hash));
 	    	anInt1132++;
 	    	anInt335--;
 	    }
 	    if (encryption != 0) {
 	    	try {
 	    		Buffer class3_sub12 = new Buffer(4);
	    		class3_sub12.putByte(4);
	    		class3_sub12.putByte(encryption);
	    		class3_sub12.putShort(0);
	    		js5Connection2.write(class3_sub12.buf, 0, 4);
 	    	} catch (IOException ioexception) {
                try {
                    js5Connection2.close();
                 } catch (Exception var6) {
                    ;
                 }

                 anInt1010 = -2;
                 ++failAttemps;
                 js5Connection2 = null;
 	    	}
 	    }
        latency = 0;
        lastConnection = TimeUtil.currentTimeMillis();
        /*while(true) {
            BufferedRequest var4 = (BufferedRequest)aClass40_1630.getFirst();
            if(null == var4) {
               while(true) {
                  var4 = (BufferedRequest)aClass40_1335.getFirst();
                  if(var4 == null) {
                     if(encryption != 0) {
                        try {
                           aClass3_Sub30_1007.pos = 0;
                           aClass3_Sub30_1007.putByte(4);
                           aClass3_Sub30_1007.putByte(encryption);
                           aClass3_Sub30_1007.putShort(0);
                           js5Connection2.write(aClass3_Sub30_1007.buf, 0, 4);
                        } catch (IOException var7) {
                           try {
                              js5Connection2.close();
                           } catch (Exception var6) {
                              ;
                           }

                           anInt1010 = -2;
                           ++failAttemps;
                           js5Connection2 = null;
                        }
                     }

                     latency = 0;
                     lastConnection = TimeUtil.currentTimeMillis();
                     return;
                  }

                  aClass30_2033.insertLast(var4);
               }
            }

            aClass40_1146.insertLast(var4);
         }*/
   }

	static final void method1a250(boolean var1) {
		//Class3_Sub10.aByteArrayArrayArray2339 = (byte[][][]) null;
		//Class44.anIntArrayArrayArray720 = (int[][][]) null;

		//Class3_Sub28_Sub3.aClass11_3551 = null;
		//client.aByteArrayArrayArray383 = (byte[][][]) null;
		//Class84.anIntArray1161 = null;
		//InterfaceListener.aByteArrayArrayArray2452 = (byte[][][]) null;
		/*if (var1 && null != Buffer.aClass3_Sub28_Sub3_2600) {
			Class3_Sub13_Sub19.aClass94_3220 = Buffer.aClass3_Sub28_Sub3_2600.aClass94_3561;
		} else {
			Class3_Sub13_Sub19.aClass94_3220 = null;
		}*/

		//Huffman.aByteArrayArrayArray640 = (byte[][][]) null;
		//Class3_Sub13_Sub33.aByteArrayArrayArray3390 = (byte[][][]) null;
		//Varp.anIntArrayArrayArray558 = (int[][][]) null;
		//AbstractMouseWheel.anIntArrayArrayArray1903 = (int[][][]) null;
		//Class140_Sub3.anInt2737 = 0;
		Buffer.aClass3_Sub28_Sub3_2600 = null;
		//Class84.aClass61_1162.clear();
		Class119.aClass131_1624 = null;
		//Class3_Sub13_Sub30.anInt3362 = -1;
		Class75_Sub2.aClass33_2648 = null;
		CollisionMap.aClass33_1305 = null;
		jSocket.aClass33_1238 = null;
		Class161.aClass33_2034 = null;
		Class164_Sub2.aClass33_3019 = null;
		Class99.aClass33_1399 = null;
		Class75_Sub2.aClass33_2637 = null;
		Class119.aClass33_1626 = null;
		Huffman.aClass3_Sub28_Sub16_637 = null;
		//Class82.anInt1150 = -1;
		//Class3_Sub13_Sub19.aClass3_Sub28_Sub16_Sub2_3221 = null;
	}

   final boolean method1251(byte var1) {
      try {
         int var2 = 33 % ((2 - var1) / 58);
         return 20 <= method1253();
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "jb.L(" + var1 + ')');
      }
   }

   final void method1252(byte var1) {
      try {
         int var2 = -116 / ((var1 - 45) / 51);

         try {
            js5Connection2.close();
         } catch (Exception var4) {
            ;
         }

         anInt1010 = -1;
         encryption = (byte)((int)(255.0D * Math.random() + 1.0D));
         js5Connection2 = null;
         ++failAttemps;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "jb.A(" + var1 + ')');
      }
   }

   final int method1253() {
	   return 0;
   }

   final void method1254(boolean var1) {
      try {
         if(js5Connection2 != null) {
            js5Connection2.close();
         }

         if(var1) {
            method1247(true);
         }

      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "jb.D(" + var1 + ')');
      }
   }
   
	static final void method164(boolean bool, js5Worker class18_sub1, int crc, byte i_32_, int i_33_, int i_34_) {
		long l = (long) ((i_33_ << 16) + i_34_);
		BufferedRequest class3_sub3_sub13 = (BufferedRequest) aClass40_1146.get(l);
		if (class3_sub3_sub13 == null) {
			class3_sub3_sub13 = (BufferedRequest) aClass40_1630.get(l);
			if (class3_sub3_sub13 == null) {
				class3_sub3_sub13 = (BufferedRequest) aClass40_14.get(l);
				if (class3_sub3_sub13 != null) {
					if (bool) {
						class3_sub3_sub13.unlinkSub();
						aClass40_1146.put(class3_sub3_sub13, l);
						anInt1132--;
						anInt1501++;
					}
				} else {
					if (!bool) {
						class3_sub3_sub13 = (BufferedRequest) aClass40_1335.get(l);
						if (class3_sub3_sub13 != null)
							return;
					}
					class3_sub3_sub13 = new BufferedRequest();
					class3_sub3_sub13.blockPosition = crc;
					class3_sub3_sub13.worker = class18_sub1;
					class3_sub3_sub13.padding = i_32_;
					if (!bool) {
						aClass30_2033.insertLast(class3_sub3_sub13);
						aClass40_14.put(class3_sub3_sub13, l);
						anInt1132++;
					} else {
						aClass40_1146.put(class3_sub3_sub13, l);
						anInt1501++;
					}
				}
			}
		}
	}

   final BufferedRequest method1255(int var1, int var2, byte var3, int var4, boolean var5) {
	   BufferedRequest var8 = new BufferedRequest();
	   long var6 = (long)(var4 + (var2 << 16));
	   var8.aBoolean3628 = var5;
	   var8.uid = var6;
	   var8.padding = var3;
	   if(var5) {
            if(~method1253() <= -21) {
               throw new RuntimeException();
            }

            //aClass40_1146.insertLast(var8);
         } else {
            if(method1246() >= 20) {
               throw new RuntimeException();
            }

            aClass30_2033.insertLast(var8);
         }

         return var8;
   }

	static final void method366(int i, int i_0_) {
		long l = (long) (i + (i_0_ << 16));
		BufferedRequest class3_sub3_sub13 = (BufferedRequest) aClass40_14.get(l);
		if (class3_sub3_sub13 != null)
			aClass30_2033.insertFirst(class3_sub3_sub13);
	}

}
