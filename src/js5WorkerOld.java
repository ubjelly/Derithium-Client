
final class js5WorkerOld {

   static PacketBuffer aClass3_Sub30_Sub1_2942 = new PacketBuffer(5000);
   private FileSystem aClass41_2943;
   private Class62 aClass62_2944;
   private Hashtable aClass130_2946 = new Hashtable(16);
   private int version;
   private int anInt2948 = 0;
   private byte[] aByteArray2949;
   private Class3_Sub28_Sub10 aClass3_Sub28_Sub10_2950;
   static jString aClass94_2951 = jString.createJString("k");
   static int[] anIntArray2952 = new int[128];
   private Js5CacheWorker aClass66_2953;
   private FileSystem aClass41_2954;
   private int crc;
   private Class65943149 aClass73_2956;
   private int index;
   static int anInt2958 = 0;
   static jString aClass94_2959 = jString.createJString("mapfunction");
   private static jString aClass94_2960 = jString.createJString("Loading interfaces )2 ");
   static jString aClass94_2961 = aClass94_2960;
   private boolean aBoolean2962;
   private Deque aClass61_2963 = new Deque();
   private int anInt2964 = 0;
   private boolean aBoolean2965;
   private Deque aClass61_2966;
   private long aLong2967 = 0L;
   private boolean aBoolean2968;


   static final void method2100() {
	   SpotAnimation.aClass3_Sub30_Sub1_532.initBitAccess();
	   int var1 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(1);
	   if(0 != var1) {
		   int var2 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(2);
		   if(0 != var2) {
			   int var4;
			   int var5;
			   if(var2 == 1) {
				   var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(3);
				   TextureLoader.selfPlayer.method1968(1, (byte)-128, var4);
				   var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(1);
				   if(1 == var5) {
					   Class21.anIntArray441[Js5CacheWorker.anInt997++] = 2047;
				   }

               } else if(2 != var2) {
                  if(3 == var2) {
                	  Class26.plane = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(2);
                	  int var7 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(7);//TODO update vise versa
                	  var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(1);
                	  var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(7);//TODO update vise versa
                	  int var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(1);
                     if(~var6 == -2) {
                        Class21.anIntArray441[Js5CacheWorker.anInt997++] = 2047;
                     }

                     TextureLoader.selfPlayer.method1981(var7, var5 == 1, var4);
                  }
               } else {
                  //if(SpotAnimation.aClass3_Sub30_Sub1_532.method812((byte)-11, 1) == 1) {
                     var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(3);
                     TextureLoader.selfPlayer.method1968(2, (byte)-104, var4);
                     var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(3);
                     TextureLoader.selfPlayer.method1968(2, (byte)-126, var5);
                  //} else {
                 //    var4 = SpotAnimation.aClass3_Sub30_Sub1_532.method812((byte)-11, 3);
                 //   Class102.aClass140_Sub4_Sub1_2141.method1968(0, (byte)-109, var4);
                  //}

                  var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(1);
                  if(var4 == 1) {
                     Class21.anIntArray441[Js5CacheWorker.anInt997++] = 2047;
                  }

               }
            } else {
               Class21.anIntArray441[Js5CacheWorker.anInt997++] = 2047;
            }
         }
   }

   final void method2095(int var1, int var2) {
      try {
         if(null != this.aClass41_2954) {
            Node var3;
            for(var3 = this.aClass61_2963.getFirst(); null != var3; var3 = this.aClass61_2963.getNext()) {
               if(~var3.hash == ~((long)var1)) {
                  return;
               }
            }

            int var4 = -66 / ((var2 - 53) / 56);
            var3 = new Node();
            var3.hash = (long)var1;
            this.aClass61_2963.insertBack(var3);
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "bg.H(" + var1 + ',' + var2 + ')');
      }
   }

   final Class62 method2094(int var1) {
      try {
         if(this.aClass62_2944 != null) {
            return this.aClass62_2944;
         } else if(var1 != 0) {
            return (Class62)null;
         } else {
            if(null == this.aClass3_Sub28_Sub10_2950) {
               if(this.aClass66_2953.method1251((byte)73)) {
                  return null;
               }

               this.aClass3_Sub28_Sub10_2950 = this.aClass66_2953.method1255(var1 ^ 115, 255, (byte)0, this.index, true);
            }

            if(this.aClass3_Sub28_Sub10_2950.aBoolean3632) {
               return null;
            } else {
               byte[] var2 = this.aClass3_Sub28_Sub10_2950.getBuffer(false);
               if(this.aClass3_Sub28_Sub10_2950 instanceof UpdateServerNode) {
                  try {
                     if(var2 == null) {
                        throw new RuntimeException();
                     }

                     this.aClass62_2944 = new Class62(var2, this.crc);
                     if(~this.version != ~this.aClass62_2944.rev) {
                        throw new RuntimeException();
                     }
                  } catch (RuntimeException var4) {
                     this.aClass62_2944 = null;
                     if(this.aClass66_2953.method1251((byte)124)) {
                        this.aClass3_Sub28_Sub10_2950 = null;
                     } else {
                        this.aClass3_Sub28_Sub10_2950 = this.aClass66_2953.method1255(-81, 255, (byte)0, this.index, true);
                     }

                     return null;
                  }
               } else {
                  try {
                     if(var2 == null) {
                        throw new RuntimeException();
                     }

                     this.aClass62_2944 = new Class62(var2, this.crc);
                  } catch (RuntimeException var5) {
                     this.aClass66_2953.method1252((byte)-107);
                     this.aClass62_2944 = null;
                     if(!this.aClass66_2953.method1251((byte)-71)) {
                        this.aClass3_Sub28_Sub10_2950 = this.aClass66_2953.method1255(var1 + 120, 255, (byte)0, this.index, true);
                     } else {
                        this.aClass3_Sub28_Sub10_2950 = null;
                     }

                     return null;
                  }

                  if(this.aClass41_2943 != null) {
                     this.aClass73_2956.method1305(this.aClass41_2943, 2, var2, this.index);
                  }
               }

               if(null != this.aClass41_2954) {
                  this.aByteArray2949 = new byte[this.aClass62_2944.anInt960];
                  this.anInt2948 = 0;
               }

               this.aClass3_Sub28_Sub10_2950 = null;
               return this.aClass62_2944;
            }
         }
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "bg.B(" + var1 + ')');
      }
   }

   final void method2101(boolean var1) {
      try {
         if(this.aClass41_2954 != null) {
            this.aBoolean2965 = var1;
            if(this.aClass61_2966 == null) {
               this.aClass61_2966 = new Deque();
            }

         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "bg.A(" + var1 + ')');
      }
   }

   final int method2102(int var1) {
      try {
         if(var1 != 0) {
            this.method2106(-4);
         }

         return this.anInt2948;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "bg.I(" + var1 + ')');
      }
   }

   static final boolean method2103(int var0, int var1) {
      try {
         return var1 >= -78?true:-199 == ~var0 || 230 == var0 || var0 == 156 || ~var0 == -141 || 223 == var0;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "bg.P(" + var0 + ',' + var1 + ')');
      }
   }

   static final void method2104(jInterface var0, boolean var1, int var2) {
      try {
         int var3 = 57 % ((var2 - -58) / 47);
         int var4 = var0.maxScrollHorizontal != 0?var0.maxScrollHorizontal:var0.anInt168;
         int var5 = -1 != ~var0.maxScrollVertical?var0.maxScrollVertical:var0.anInt193;
         AbstractGraphicsBuffer.method2183(var0.uid, var1, var4, 235, var5, SceneGraphNode.interfaceCache[var0.uid >> 16]);
         if(var0.aClass11Array262 != null) {
            AbstractGraphicsBuffer.method2183(var0.uid, var1, var4, 235, var5, var0.aClass11Array262);
         }

         OverridedInterface var6 = (OverridedInterface)Class3_Sub13_Sub17.aClass130_3208.get((long)var0.uid);
         if(var6 != null) {
            Class75_Sub4.method1352(var5, var1, -1, var6.uid, var4);
         }

      } catch (RuntimeException var7) {
         throw Class44.method1067(var7, "bg.N(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + var2 + ')');
      }
   }

   public static void method2105(boolean var0) {
      try {
         aClass94_2959 = null;
         aClass94_2951 = null;
         if(!var0) {
            anIntArray2952 = null;
            aClass3_Sub30_Sub1_2942 = null;
            aClass94_2960 = null;
            aClass94_2961 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "bg.F(" + var0 + ')');
      }
   }

   final int method2106(int var1) {
      try {
         if(null != this.aClass62_2944) {
            if(this.aBoolean2962) {
               Node var2 = this.aClass61_2966.getFirst();
               if(null != var2) {
                  if(var1 != 1) {
                     this.anInt2964 = -91;
                  }

                  return (int)var2.hash;
               } else {
                  return 0;
               }
            } else {
               return this.aClass62_2944.groupLength;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "bg.O(" + var1 + ')');
      }
   }

   final void method2107(boolean var1) {
      try {
         if(var1) {
            if(null != this.aClass61_2966) {
               if(this.method2094(0) == null) {
                  return;
               }

               boolean var2;
               Node var3;
               int var4;
               if(!this.aBoolean2962) {
                  if(!this.aBoolean2965) {
                     this.aClass61_2966 = null;
                  } else {
                     var2 = true;

                     for(var3 = this.aClass61_2966.getFirst(); var3 != null; var3 = this.aClass61_2966.getNext()) {
                        var4 = (int)var3.hash;
                        if(this.aByteArray2949[var4] != 1) {
                           this.method2109(2, var4, 96);
                        }

                        if(this.aByteArray2949[var4] == 1) {
                           var3.unlink();
                        } else {
                           var2 = false;
                        }
                     }

                     while(~this.aClass62_2944.groupFileCount.length < ~this.anInt2964) {
                        if(-1 != ~this.aClass62_2944.groupFileCount[this.anInt2964]) {
                           if(this.aClass66_2953.method1241()) {
                              var2 = false;
                              break;
                           }

                           if(1 != this.aByteArray2949[this.anInt2964]) {
                              this.method2109(2, this.anInt2964, 47);
                           }

                           if(-2 != ~this.aByteArray2949[this.anInt2964]) {
                              var3 = new Node();
                              var3.hash = (long)this.anInt2964;
                              this.aClass61_2966.insertBack(var3);
                              var2 = false;
                           }

                           ++this.anInt2964;
                        } else {
                           ++this.anInt2964;
                        }
                     }

                     if(var2) {
                        this.anInt2964 = 0;
                        this.aBoolean2965 = false;
                     }
                  }
               } else {
                  var2 = true;

                  for(var3 = this.aClass61_2966.getFirst(); null != var3; var3 = this.aClass61_2966.getNext()) {
                     var4 = (int)var3.hash;
                     if(~this.aByteArray2949[var4] == -1) {
                        this.method2109(1, var4, 51);
                     }

                     if(~this.aByteArray2949[var4] != -1) {
                        var3.unlink();
                     } else {
                        var2 = false;
                     }
                  }

                  while(this.aClass62_2944.groupFileCount.length > this.anInt2964) {
                     if(~this.aClass62_2944.groupFileCount[this.anInt2964] == -1) {
                        ++this.anInt2964;
                     } else {
                        if(-251 >= ~this.aClass73_2956.anInt1087) {
                           var2 = false;
                           break;
                        }

                        if(0 == this.aByteArray2949[this.anInt2964]) {
                           this.method2109(1, this.anInt2964, 99);
                        }

                        if(-1 == ~this.aByteArray2949[this.anInt2964]) {
                           var2 = false;
                           var3 = new Node();
                           var3.hash = (long)this.anInt2964;
                           this.aClass61_2966.insertBack(var3);
                        }

                        ++this.anInt2964;
                     }
                  }

                  if(var2) {
                     this.aBoolean2962 = false;
                     this.anInt2964 = 0;
                  }
               }
            }

            if(this.aBoolean2968 && this.aLong2967 <= TimeUtil.currentTimeMillis()) {
               for(Class3_Sub28_Sub10 var6 = (Class3_Sub28_Sub10)this.aClass130_2946.getFirst(); var6 != null; var6 = (Class3_Sub28_Sub10)this.aClass130_2946.getNext()) {
                  if(!var6.aBoolean3632) {
                     if(var6.aBoolean3635) {
                        if(!var6.aBoolean3628) {
                           throw new RuntimeException();
                        }

                        var6.unlink();
                     } else {
                        var6.aBoolean3635 = true;
                     }
                  }
               }

               this.aLong2967 = 1000L + TimeUtil.currentTimeMillis();
            }

         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "bg.J(" + var1 + ')');
      }
   }

   final int method2097(int var1, int var2) {
      try {
         if(var2 != '\uffff') {
            this.anInt2964 = 25;
         }

         Class3_Sub28_Sub10 var3 = (Class3_Sub28_Sub10)this.aClass130_2946.get((long)var1);
         return null != var3?var3.method586():0;
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "bg.L(" + var1 + ',' + var2 + ')');
      }
   }

   final int method2108(byte var1) {
      try {
         if(this.aClass62_2944 != null) {
            if(var1 != 1) {
               anInt2958 = 100;
            }

            return this.aClass62_2944.groupLength;
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "bg.M(" + var1 + ')');
      }
   }

   private final Class3_Sub28_Sub10 method2109(int var1, int var2, int var3) {
      try {
         Object var4 = (Class3_Sub28_Sub10)this.aClass130_2946.get((long)var2);
         if(null != var4 && ~var1 == -1 && !((Class3_Sub28_Sub10)var4).aBoolean3628 && ((Class3_Sub28_Sub10)var4).aBoolean3632) {
            ((Class3_Sub28_Sub10)var4).unlink();
            var4 = null;
         }

         if(null == var4) {
            if(0 == var1) {
               if(null != this.aClass41_2954 && ~this.aByteArray2949[var2] != 0) {
                  var4 = this.aClass73_2956.method1309(this.aClass41_2954, (byte)106, var2);
               } else {
                  if(this.aClass66_2953.method1251((byte)-83)) {
                     return null;
                  }

                  var4 = this.aClass66_2953.method1255(-51, this.index, (byte)2, var2, true);
               }
            } else if(1 != var1) {
               if(~var1 != -3) {
                  throw new RuntimeException();
               }

               if(this.aClass41_2954 == null) {
                  throw new RuntimeException();
               }

               if(~this.aByteArray2949[var2] != 0) {
                  throw new RuntimeException();
               }

               if(this.aClass66_2953.method1241()) {
                  return null;
               }

               var4 = this.aClass66_2953.method1255(-37, this.index, (byte)2, var2, false);
            } else {
               if(this.aClass41_2954 == null) {
                  throw new RuntimeException();
               }

               var4 = this.aClass73_2956.method1307(var2, -27447, this.aClass41_2954);
            }

            this.aClass130_2946.put((Node)var4, (long)var2);
         }

         if(((Class3_Sub28_Sub10)var4).aBoolean3632) {
            return null;
         } else {
            byte[] var5 = ((Class3_Sub28_Sub10)var4).getBuffer(false);
            int var6 = -57 % ((var3 - -10) / 55);
            int var7;
            BufferedRequest var12;
            if(var4 instanceof UpdateServerNode) {
               try {
                  if(var5 != null && ~var5.length < -3) {
                     Class3_Sub13_Sub12.aCRC32_3143.reset();
                     Class3_Sub13_Sub12.aCRC32_3143.update(var5, 0, -2 + var5.length);
                     var7 = (int)Class3_Sub13_Sub12.aCRC32_3143.getValue();
                     if(this.aClass62_2944.groupCrcs[var2] != var7) {
                        throw new RuntimeException();
                     } else {
                        int var8 = (var5[-2 + var5.length] << 8 & '\uff00') - -(255 & var5[-1 + var5.length]);
                        if(~var8 != ~('\uffff' & this.aClass62_2944.groupVersions[var2])) {
                           throw new RuntimeException();
                        } else {
                           if(1 != this.aByteArray2949[var2]) {
                              if(-1 != ~this.aByteArray2949[var2]) {
                                 ;
                              }

                              ++this.anInt2948;
                              this.aByteArray2949[var2] = 1;
                           }

                           if(!((Class3_Sub28_Sub10)var4).aBoolean3628) {
                              ((Class3_Sub28_Sub10)var4).unlink();
                           }

                           return (Class3_Sub28_Sub10)var4;
                        }
                     }
                  } else {
                     throw new RuntimeException();
                  }
               } catch (Exception var9) {
                  this.aByteArray2949[var2] = -1;
                  ((Class3_Sub28_Sub10)var4).unlink();
                  if(((Class3_Sub28_Sub10)var4).aBoolean3628 && !this.aClass66_2953.method1251((byte)-78)) {
                     var12 = this.aClass66_2953.method1255(-13, this.index, (byte)2, var2, true);
                     this.aClass130_2946.put(var12, (long)var2);
                  }

                  return null;
               }
            } else {
               try {
                  if(null == var5 || -3 <= ~var5.length) {
                     throw new RuntimeException();
                  }

                  Class3_Sub13_Sub12.aCRC32_3143.reset();
                  Class3_Sub13_Sub12.aCRC32_3143.update(var5, 0, var5.length - 2);
                  var7 = (int)Class3_Sub13_Sub12.aCRC32_3143.getValue();
                  if(~this.aClass62_2944.groupCrcs[var2] != ~var7) {
                     throw new RuntimeException();
                  }

                  this.aClass66_2953.failAttemps = 0;
                  this.aClass66_2953.anInt1010 = 0;
               } catch (RuntimeException var10) {
                  this.aClass66_2953.method1252((byte)-67);
                  ((Class3_Sub28_Sub10)var4).unlink();
                  if(((Class3_Sub28_Sub10)var4).aBoolean3628 && !this.aClass66_2953.method1251((byte)90)) {
                     var12 = this.aClass66_2953.method1255(112, this.index, (byte)2, var2, true);
                     this.aClass130_2946.put(var12, (long)var2);
                  }

                  return null;
               }

               var5[var5.length + -2] = (byte)(this.aClass62_2944.groupVersions[var2] >>> 8);
               var5[var5.length - 1] = (byte)this.aClass62_2944.groupVersions[var2];
               if(null != this.aClass41_2954) {
                  this.aClass73_2956.method1305(this.aClass41_2954, 2, var5, var2);
                  if(1 != this.aByteArray2949[var2]) {
                     ++this.anInt2948;
                     this.aByteArray2949[var2] = 1;
                  }
               }

               if(!((Class3_Sub28_Sub10)var4).aBoolean3628) {
                  ((Class3_Sub28_Sub10)var4).unlink();
               }

               return (Class3_Sub28_Sub10)var4;
            }
         }
      } catch (RuntimeException var11) {
         throw Class44.method1067(var11, "bg.C(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   final void method2110(int var1) {
      try {
         if(this.aClass61_2966 != null) {
            if(null != this.method2094(var1)) {
               for(Node var2 = this.aClass61_2963.getFirst(); null != var2; var2 = this.aClass61_2963.getNext()) {
                  int var3 = (int)var2.hash;
                  if(0 <= var3 && this.aClass62_2944.anInt960 > var3 && ~this.aClass62_2944.groupFileCount[var3] != -1) {
                     if(this.aByteArray2949[var3] == 0) {
                        this.method2109(1, var3, var1 + 80);
                     }

                     if(-1 == this.aByteArray2949[var3]) {
                        this.method2109(2, var3, var1 + 78);
                     }

                     if(~this.aByteArray2949[var3] == -2) {
                        var2.unlink();
                     }
                  } else {
                     var2.unlink();
                  }
               }

            }
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "bg.D(" + var1 + ')');
      }
   }

   final int method2111() {
	   return null != this.method2094(0)?100:(null == this.aClass3_Sub28_Sub10_2950?0:this.aClass3_Sub28_Sub10_2950.method586());
   }

   final byte[] method2098(int var1, int var2) {
      try {
         Class3_Sub28_Sub10 var3 = this.method2109(var2, var1, 103);
         if(var3 == null) {
            return null;
         } else {
            byte[] var4 = var3.getBuffer(false);
            var3.unlink();
            return var4;
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "bg.K(" + var1 + ',' + var2 + ')');
      }
   }
   
	/*js5Worker(int var1, FileSystem var2, FileSystem var3, Class73 var5, int var6, int var7, boolean var8) {
		this.index = var1;
		this.aClass41_2954 = var2;
		if (this.aClass41_2954 != null) {
			this.aBoolean2962 = true;
			this.aClass61_2966 = new Deque();
		} else {
			this.aBoolean2962 = false;
		}

		this.aClass73_2956 = var5;
		this.crc = var6;
		this.aBoolean2968 = var8;
		this.aClass41_2943 = var3;
		this.aClass66_2953 = var4;
		this.version = var7;
		if (null != this.aClass41_2943) {
			this.aClass3_Sub28_Sub10_2950 = this.aClass73_2956.method1309(this.aClass41_2943, (byte) 113, this.index);
		}

	}*/
   

	public void setIndexCrc(int i_16_, int i_17_) {
		this.crc = i_16_;
		this.version = i_17_;
	}

}
