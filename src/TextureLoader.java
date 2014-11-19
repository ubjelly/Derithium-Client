
final class TextureLoader implements TextureInterface {

   private boolean[] aBooleanArray2122;
   private js5 aClass153_2123;
   private boolean[] aBooleanArray2124;
   static int[] anIntArray2125;
   private byte[] aByteArray2126;
   private js5 aClass153_2127;
   private boolean[] aBooleanArray2128;
   private byte[] aByteArray2129;
   static Class135[] aClass135Array2131 = new Class135[50];
   private boolean[] load;
   private boolean aBoolean2134 = false;
   private boolean[] aBooleanArray2135;
   static int anInt2136;
   private short[] aShortArray2137;
   private Class47 aClass47_2138;
   private int anInt2139 = 50;
   static LDSprite[] aClass3_Sub28_Sub16_Sub2Array2140;
   static Player selfPlayer;
   private Class47 aClass47_2142;
   private byte[] aByteArray2143;
   private byte[] aByteArray2144;


   final void method1610(boolean var1, int var2) {
      try {
         if(!var1) {
            this.method7((byte)113, 17);
         }

         for(Texture var3 = (Texture)this.aClass47_2142.method1094(0); null != var3; var3 = (Texture)this.aClass47_2142.method1099(-1)) {
            if(var3.aBoolean3797) {
               var3.method723(var2, (byte)-120);
               var3.aBoolean3797 = false;
            }
         }

      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "nk.P(" + var1 + ',' + var2 + ')');
      }
   }

   static final void method1611(int var0, boolean var1) {
      try {
         int var2;
         Npc var3;
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         for(var2 = 0; var2 < Class163.anInt2046; ++var2) {
            var3 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[Class15.anIntArray347[var2]];
            if(null != var3 && var3.method1966((byte)17) && !var3.aClass90_3976.aBoolean1263 != var1 && var3.aClass90_3976.method1472((byte)74)) {
               int var4 = var3.getSize();
               int var5;
               if(1 != var4) {
                  if((~(1 & var4) != -1 || ~(127 & var3.anInt2819) == -1 && 0 == (127 & var3.anInt2829)) && ((var4 & 1) != 1 || -65 == ~(127 & var3.anInt2819) && 64 == (127 & var3.anInt2829))) {
                     var5 = var3.anInt2819 + -(var4 * 64) >> 7;
                     var6 = -(var4 * 64) + var3.anInt2829 >> 7;
                     var7 = var3.getSize() + var5;
                     if(~var5 > -1) {
                        var5 = 0;
                     }

                     if(~var7 < -105) {
                        var7 = 104;
                     }

                     var8 = var6 + var3.getSize();
                     if(-1 < ~var6) {
                        var6 = 0;
                     }

                     if(104 < var8) {
                        var8 = 104;
                     }

                     for(var9 = var5; ~var7 < ~var9; ++var9) {
                        for(var10 = var6; ~var10 > ~var8; ++var10) {
                           ++Class163_Sub1_Sub1.anIntArrayArray4010[var9][var10];
                        }
                     }
                  }
               } else if(-65 == ~(127 & var3.anInt2819) && (var3.anInt2829 & 127) == 64) {
                  var5 = var3.anInt2819 >> 7;
                  var6 = var3.anInt2829 >> 7;
                  if(-1 >= ~var5 && var5 < 104 && ~var6 <= -1 && -105 < ~var6) {
                     ++Class163_Sub1_Sub1.anIntArrayArray4010[var5][var6];
                  }
               }
            }
         }

         label200:
         for(var2 = 0; ~var2 > ~Class163.anInt2046; ++var2) {
            var3 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[Class15.anIntArray347[var2]];
            long var15 = (long)Class15.anIntArray347[var2] << 32 | 536870912L;
            if(var3 != null && var3.method1966((byte)17) && !var3.aClass90_3976.aBoolean1263 == !var1 && var3.aClass90_3976.method1472((byte)74)) {
               var6 = var3.getSize();
               if(-2 != ~var6) {
                  if((var6 & 1) == 0 && -1 == ~(var3.anInt2819 & 127) && -1 == ~(127 & var3.anInt2829) || ~(var6 & 1) == -2 && -65 == ~(var3.anInt2819 & 127) && (127 & var3.anInt2829) == 64) {
                     var7 = -(64 * var6) + var3.anInt2819 >> 7;
                     var8 = -(var6 * 64) + var3.anInt2829 >> 7;
                     var10 = var8 - -var6;
                     if(var8 < 0) {
                        var8 = 0;
                     }

                     boolean var11 = true;
                     var9 = var7 + var6;
                     if(-105 > ~var10) {
                        var10 = 104;
                     }

                     if(-1 < ~var7) {
                        var7 = 0;
                     }

                     if(~var9 < -105) {
                        var9 = 104;
                     }

                     int var12;
                     int var13;
                     for(var12 = var7; var12 < var9; ++var12) {
                        for(var13 = var8; ~var13 > ~var10; ++var13) {
                           if(~Class163_Sub1_Sub1.anIntArrayArray4010[var12][var13] >= -2) {
                              var11 = false;
                              break;
                           }
                        }
                     }

                     if(var11) {
                        var12 = var7;

                        while(true) {
                           if(var12 >= var9) {
                              continue label200;
                           }

                           for(var13 = var8; var13 < var10; ++var13) {
                              --Class163_Sub1_Sub1.anIntArrayArray4010[var12][var13];
                           }

                           ++var12;
                        }
                     }
                  }
               } else if((127 & var3.anInt2819) == 64 && ~(127 & var3.anInt2829) == -65) {
                  var7 = var3.anInt2819 >> 7;
                  var8 = var3.anInt2829 >> 7;
                  if(0 > var7 || ~var7 <= -105 || var8 < 0 || ~var8 <= -105) {
                     continue;
                  }

                  if(1 < Class163_Sub1_Sub1.anIntArrayArray4010[var7][var8]) {
                     --Class163_Sub1_Sub1.anIntArrayArray4010[var7][var8];
                     continue;
                  }
               }

               if(!var3.aClass90_3976.aBoolean1270) {
                  var15 |= Long.MIN_VALUE;
               }

               var3.anInt2831 = Class121.method1736(Class26.plane, 1, var3.anInt2819, var3.anInt2829);
               Class20.method907(Class26.plane, var3.anInt2819, var3.anInt2829, var3.anInt2831, -64 + 64 * var6 + 60, var3, var3.directionDegrees, var15, var3.aBoolean2810);
            }
         }

         var2 = -28 / ((var0 - -7) / 34);
      } catch (RuntimeException var14) {
         throw Class44.method1067(var14, "nk.V(" + var0 + ',' + var1 + ')');
      }
   }

   public final int[] method16(int var1, int var2) {
      try {
         if(var1 != 64) {
            this.method12(105);
         }

         Texture var3 = this.getTexture(var2);
         return null == var3?null:var3.method720(false, this.aBoolean2134 || this.aBooleanArray2122[var2], this, this.aClass153_2123);
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "nk.F(" + var1 + ',' + var2 + ')');
      }
   }

   public static void method1612(int var0) {
      try {
         selfPlayer = null;
         if(var0 != -11565) {
            method1614((long[])null, (int[])null);
         }

         anIntArray2125 = null;
         aClass3_Sub28_Sub16_Sub2Array2140 = null;
         aClass135Array2131 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "nk.W(" + var0 + ')');
      }
   }

   public final void method8(int var1, boolean var2) {
      try {
         Class3_Sub28_Sub4.method551(255 & this.aByteArray2143[var1], this.aByteArray2144[var1] & 255);
         if(var2) {
            boolean var3 = false;
            Texture var4 = this.getTexture(var1);
            if(var4 != null) {
               var3 = var4.method719(this.aClass153_2123, this, 579100487, this.aBoolean2134 || this.aBooleanArray2122[var1]);
            }

            if(!var3) {
               Class3_Sub28_Sub18 var6 = this.method1615(48, var1);
               var6.method712();
            }

         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "nk.G(" + var1 + ',' + var2 + ')');
      }
   }

   private final Texture getTexture(int id) {
	   Texture var3 = (Texture)this.aClass47_2142.method1092((long)id, 1400);
	   if(null != var3) {
		   return var3;
	   } else {
		   byte[] data = this.aClass153_2127.getFile(id, 0);
		   if(null != data) {
			   Buffer buffer = new Buffer(data);
               var3 = new Texture(buffer);
               this.aClass47_2142.method1097(var3, (long)id, (byte)-118);
               return var3;
		   } else {
			   return null;
		   }
	   }
   }

   public final int method9(int var1, boolean var2) {
      try {
         return var2?-63:255 & this.aByteArray2143[var1];
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "nk.D(" + var1 + ',' + var2 + ')');
      }
   }

   public final int method18(int var1, int var2) {
      try {
         if(var2 != 255) {
            method1612(-48);
         }

         return 255 & this.aByteArray2144[var1];
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "nk.B(" + var1 + ',' + var2 + ')');
      }
   }

   static final void method1614(long[] var1, int[] var2) {
	   Class44.method1069(var1, 0, -1 + var1.length, var2);
   }

   public final int method10(int var1, int var2) {
      try {
         int var3 = -81 % ((var1 - 4) / 55);
         return this.aByteArray2126[var2] & 255;
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "nk.C(" + var1 + ',' + var2 + ')');
      }
   }

   public final boolean method7(byte var1, int var2) {
      try {
         if(var1 != 88) {
            this.method19(-99, -37);
         }

         return this.aBooleanArray2128[var2];
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "nk.M(" + var1 + ',' + var2 + ')');
      }
   }

   private final Class3_Sub28_Sub18 method1615(int var1, int var2) {
      try {
         int var3 = 111 / ((-15 - var1) / 38);
         Class3_Sub28_Sub18 var4 = (Class3_Sub28_Sub18)this.aClass47_2138.method1092((long)var2, 1400);
         if(null == var4) {
            var4 = new Class3_Sub28_Sub18(this.aShortArray2137[var2] & '\uffff');
            this.aClass47_2138.method1097(var4, (long)var2, (byte)69);
            return var4;
         } else {
            return var4;
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "nk.U(" + var1 + ',' + var2 + ')');
      }
   }

   public final boolean method11(int var1, int var2) {
      try {
         if(var1 < 0) {
            this.method7((byte)68, -47);
         }

         Texture var3 = this.getTexture(var2);
         return null != var3?var3.method722(-5, this, this.aClass153_2123):false;
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "nk.H(" + var1 + ',' + var2 + ')');
      }
   }

   final void method1616(boolean var1, int var2) {
      try {
         this.aBoolean2134 = var1;
         this.method1618(var2 ^ var2);
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "nk.S(" + var1 + ',' + var2 + ')');
      }
   }

   static final void method1617(int var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         if(~var4 >= ~Class57.anInt902 && ~var2 <= ~Class159.anInt2020) {
            boolean var6;
            if(Class101.anInt1425 <= var1) {
               if(Class3_Sub28_Sub18.anInt3765 >= var1) {
                  var6 = true;
               } else {
                  var6 = false;
                  var1 = Class3_Sub28_Sub18.anInt3765;
               }
            } else {
               var6 = false;
               var1 = Class101.anInt1425;
            }

            boolean var7;
            if(var3 < Class101.anInt1425) {
               var3 = Class101.anInt1425;
               var7 = false;
            } else if(~var3 < ~Class3_Sub28_Sub18.anInt3765) {
               var3 = Class3_Sub28_Sub18.anInt3765;
               var7 = false;
            } else {
               var7 = true;
            }

            if(Class159.anInt2020 > var4) {
               var4 = Class159.anInt2020;
            } else {
               Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var4++], var1, var3, var0);
            }

            if(var2 <= Class57.anInt902) {
               Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var2--], var1, var3, var0);
            } else {
               var2 = Class57.anInt902;
            }

            int var8;
            if(var6 && var7) {
               for(var8 = var4; var8 <= var2; ++var8) {
                  int[] var9 = Class38.anIntArrayArray663[var8];
                  var9[var1] = var9[var3] = var0;
               }
            } else if(!var6) {
               if(var7) {
                  for(var8 = var4; ~var2 <= ~var8; ++var8) {
                     Class38.anIntArrayArray663[var8][var3] = var0;
                  }
               }
            } else {
               for(var8 = var4; ~var8 >= ~var2; ++var8) {
                  Class38.anIntArrayArray663[var8][var1] = var0;
               }
            }
         }

         if(var5 == 29) {
            ;
         }
      } catch (RuntimeException var10) {
         throw Class44.method1067(var10, "nk.R(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   public final boolean method12(int var1) {
	   return this.aBooleanArray2135[var1];
   }

   public final int method19(int var1, int var2) {
      try {
         int var3 = -115 / ((-12 - var1) / 56);
         return 255 & this.aByteArray2129[var2];
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "nk.A(" + var1 + ',' + var2 + ')');
      }
   }

   final void method1618(int var1) {
      try {
         this.aClass47_2142.method1101(2);
         if(var1 == 0) {
            if(null != this.aClass47_2138) {
               this.aClass47_2138.method1101(2);
            }

         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "nk.O(" + var1 + ')');
      }
   }

   public final int method15(int var1) {
	   return '\uffff' & this.aShortArray2137[var1];
   }

   public final boolean method14(byte var1, int var2) {
      try {
         return var1 >= -97?true:this.aBoolean2134 || this.aBooleanArray2122[var2];
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "nk.J(" + var1 + ',' + var2 + ')');
      }
   }

   final void method1619(int var1, int var2) {
      try {
         if(var2 != -1) {
            selfPlayer = (Player)null;
         }

         this.anInt2139 = var1;
         this.aClass47_2142 = new Class47(this.anInt2139);
         if(!HDToolkit.openGLEnabled) {
            this.aClass47_2138 = null;
         } else {
            this.aClass47_2138 = new Class47(this.anInt2139);
         }

      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "nk.N(" + var1 + ',' + var2 + ')');
      }
   }

   public final boolean method17(int var1) {
	   return this.aBooleanArray2124[var1];
   }

   TextureLoader(js5 textureInformation, js5 hdTextures, js5 sprites, int var4, boolean var5) {
	   this.aClass153_2123 = sprites;
	   this.aBoolean2134 = var5;
	   this.anInt2139 = var4;
	   this.aClass153_2127 = textureInformation;
	   this.aClass47_2142 = new Class47(this.anInt2139);
	   if(!HDToolkit.openGLEnabled) {
		   this.aClass47_2138 = null;
	   } else {
		   this.aClass47_2138 = new Class47(this.anInt2139);
	   }

	   Buffer var6 = new Buffer(hdTextures.getFile(0, 0));
	   int var7 = var6.getUShort();
	  // int var7 = 1000;
	   this.aByteArray2143 = new byte[var7 + 1000];
	   this.aByteArray2129 = new byte[var7 + 1000];
	   this.aByteArray2126 = new byte[var7 + 1000];
	   this.aShortArray2137 = new short[var7 + 1000];
	   this.aByteArray2144 = new byte[var7 + 1000];
	   this.aBooleanArray2128 = new boolean[var7 + 1000];
	   this.aBooleanArray2122 = new boolean[var7 + 1000];
	   this.aBooleanArray2124 = new boolean[var7 + 1000];//TODO ghetto fix atm
	   this.load = new boolean[var7];
	   this.aBooleanArray2135 = new boolean[var7 + 1000];

	   int var8;
	   for(var8 = 0; ~var7 < ~var8; ++var8) {
		   this.load[var8] = 1 == var6.getUByte();//3
	   }
	   
	   for(var8 = 0; ~var7 < ~var8; ++var8) {
		   if(this.load[var8]) {
			   this.aBooleanArray2124[var8] = var6.getUByte() == 1;//4
		   }
	   }

	   for(var8 = 0; ~var8 > ~var7; ++var8) {
		   if(this.load[var8]) {
			   this.aBooleanArray2128[var8] = 1 == var6.getUByte();//5
		   }
	   }

	   for(var8 = 0; ~var8 > ~var7; ++var8) {
		   if(this.load[var8]) {
			   this.aBooleanArray2122[var8] = 1 == var6.getUByte();//6
		   }
	   }

	   for(var8 = 0; var8 < var7; ++var8) {
		   if(this.load[var8]) {
			   this.aBooleanArray2135[var8] = 1 == var6.getUByte();//7
		   }
	   }

	   for(var8 = 0; var7 > var8; ++var8) {
		   if(this.load[var8]) {
			   this.aByteArray2126[var8] = var6.getByte();//8
		   }
	   }

	   for(var8 = 0; var7 > var8; ++var8) {
		   if(this.load[var8]) {
			   this.aByteArray2129[var8] = var6.getByte();//9
		   }
	   }

	   for(var8 = 0; var8 < var7; ++var8) {
		   if(this.load[var8]) {
			   this.aByteArray2144[var8] = var6.getByte();//10
		   }
	   }

	   for(var8 = 0; ~var8 > ~var7; ++var8) {
		   if(this.load[var8]) {
			   this.aByteArray2143[var8] = var6.getByte();//11
		   }
	   }

	   for(var8 = 0; var7 > var8; ++var8) {
		   if(this.load[var8]) {
			   this.aShortArray2137[var8] = (short)var6.getUShort();//12
		   }
	   }
		/*for (int i_19_ = 0; (var7 ^ 0xffffffff) < (i_19_ ^ 0xffffffff); i_19_++) {
			//if (aClass213Array3298[i_19_] != null)
			//	aClass213Array3298[i_19_].aByte3011 = class153_sub8
						var6.getByte();//13
		}
		for (int i_20_ = 0; var7 > i_20_; i_20_++) {
			//if (aClass213Array3298[i_20_] != null)
			//	aClass213Array3298[i_20_].aByte3016 = class153_sub8
						var6.getByte();//14
		}
		for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > (var7 ^ 0xffffffff); i_21_++) {
			//if (aClass213Array3298[i_21_] != null)
			//	aClass213Array3298[i_21_].aBoolean3025 = (class153_sub8
			//			.getUByte() ^ 0xffffffff) == -2;//15
			var6.getUByte();
		}
		for (int i_22_ = 0; (var7 ^ 0xffffffff) < (i_22_ ^ 0xffffffff); i_22_++) {
			//if (aClass213Array3298[i_22_] != null)
			//	aClass213Array3298[i_22_].aBoolean3026 = class153_sub8
			//			.getUByte() == 1;//16
			var6.getUByte();
		}
		for (int i_23_ = 0; var7 > i_23_; i_23_++) {
			//if (aClass213Array3298[i_23_] != null)
			//	aClass213Array3298[i_23_].aByte3019 = class153_sub8
						var6.getByte();//17
		}
		for (int i_24_ = 0; var7 > i_24_; i_24_++) {
			//if (aClass213Array3298[i_24_] != null)
			//	aClass213Array3298[i_24_].aBoolean3013 = class153_sub8
			//			.getUByte() == 1;//18
			var6.getUByte();
		}
		for (int i_25_ = 0; var7 > i_25_; i_25_++) {
			//if (aClass213Array3298[i_25_] != null)
			//	aClass213Array3298[i_25_].aBoolean3020 = (class153_sub8
			//			.getUByte() ^ 0xffffffff) == -2;//19
			var6.getUByte();
		}
		for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > (var7 ^ 0xffffffff); i_26_++) {
			//if (aClass213Array3298[i_26_] != null)
			//	aClass213Array3298[i_26_].aBoolean3017 = (class153_sub8
			//			.getUByte() ^ 0xffffffff) == -2;//20
			var6.getUByte();
		}
		for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > (var7 ^ 0xffffffff); i_26_++) {
			//if (aClass213Array3298[i_26_] != null)
			//	aClass213Array3298[i_26_].aBoolean3017 = (class153_sub8
			//			.getUByte() ^ 0xffffffff) == -2;//21
			var6.getUByte();
		}
		for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > (var7 ^ 0xffffffff); i_26_++) {
			//if (aClass213Array3298[i_26_] != null)
			//	aClass213Array3298[i_26_].aBoolean3017 = (class153_sub8
			//			.getUByte() ^ 0xffffffff) == -2;//25
			var6.getInt();
		}*/
   }

   public final int[] method13(int var1, boolean var2, float var3) {
      try {
         Texture var4 = this.getTexture(var1);
         if(null == var4) {
            return null;
         } else {
            var4.aBoolean3797 = var2;
            return var4.method718(this, 0, var3, this.aClass153_2123, this.aBoolean2134 || this.aBooleanArray2122[var1]);
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "nk.L(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

}
