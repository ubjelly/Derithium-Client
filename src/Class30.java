import java.io.EOFException;
import java.io.File;
import java.io.IOException;

final class Class30 {

   private long aLong563;
   private byte[] aByteArray564;
   static jString aClass94_565 = jString.createJString("::fpsoff");
   private int anInt566 = 0;
   static jString aClass94_567 = jString.createJString(":chalreq:");
   private long aLong568;
   private long aLong569;
   private long aLong570;
   private long aLong571 = -1L;
   private byte[] aByteArray572;
   private FileOnDisk aClass122_573;
   static int[] anIntArray574 = new int[14];
   private int anInt575;
   private long aLong576 = -1L;
   //static jString aClass94_577 = jString.createJString("http:)4)4");
   static float aFloat578;
   static boolean aBoolean579 = false;


   public static void method974(boolean var0) {
      try {
         //aClass94_577 = null;
         if(var0) {
            anIntArray574 = null;
            aClass94_567 = null;
            aClass94_565 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "en.G(" + var0 + ')');
      }
   }

   private final void method975(byte var1) throws IOException {
      try {
         int var2 = 56 % ((45 - var1) / 44);
         if(-1L != this.aLong571) {
            if(this.aLong571 != this.aLong570) {
               this.aClass122_573.seek(this.aLong571);
               this.aLong570 = this.aLong571;
            }

            this.aClass122_573.write(this.aByteArray572, 0, this.anInt566);
            long var3 = -1L;
            if(~this.aLong576 >= ~this.aLong571 && ~(this.aLong576 + (long)this.anInt575) < ~this.aLong571) {
               var3 = this.aLong571;
            } else if(this.aLong571 <= this.aLong576 && ~this.aLong576 > ~(this.aLong571 - -((long)this.anInt566))) {
               var3 = this.aLong576;
            }

            this.aLong570 += (long)this.anInt566;
            if(this.aLong563 < this.aLong570) {
               this.aLong563 = this.aLong570;
            }

            long var5 = -1L;
            if(this.aLong576 < this.aLong571 - -((long)this.anInt566) && (long)this.anInt575 + this.aLong576 >= (long)this.anInt566 + this.aLong571) {
               var5 = this.aLong571 - -((long)this.anInt566);
            } else if(~(this.aLong576 - -((long)this.anInt575)) < ~this.aLong571 && (long)this.anInt566 + this.aLong571 >= (long)this.anInt575 + this.aLong576) {
               var5 = (long)this.anInt575 + this.aLong576;
            }

            if(-1L < var3 && ~var5 < ~var3) {
               int var7 = (int)(-var3 + var5);
               ArrayUtils.arrayCopy(this.aByteArray572, (int)(var3 - this.aLong571), this.aByteArray564, (int)(var3 + -this.aLong576), var7);
            }

            this.anInt566 = 0;
            this.aLong571 = -1L;
         }

      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "en.C(" + var1 + ')');
      }
   }

   final long method976() {
	   return this.aLong568;
   }

   private final File getFile() {
	   return this.aClass122_573.getFile();
   }

   final void method978(int var1, byte[] var2, int var3, int var4) throws IOException {
      try {
         try {
            if(var1 - -var3 > var2.length) {
               throw new ArrayIndexOutOfBoundsException(var3 + var1 - var2.length);
            }

            if(-1L != this.aLong571 && this.aLong569 >= this.aLong571 && (long)this.anInt566 + this.aLong571 >= (long)var3 + this.aLong569) {
               ArrayUtils.arrayCopy(this.aByteArray572, (int)(-this.aLong571 + this.aLong569), var2, var1, var3);
               this.aLong569 += (long)var3;
               return;
            }

            long var5 = this.aLong569;
            int var8 = var3;
            int var9;
            if(this.aLong576 <= this.aLong569 && this.aLong576 + (long)this.anInt575 > this.aLong569) {
               var9 = (int)((long)this.anInt575 - this.aLong569 + this.aLong576);
               if(~var9 < ~var3) {
                  var9 = var3;
               }

               ArrayUtils.arrayCopy(this.aByteArray564, (int)(this.aLong569 - this.aLong576), var2, var1, var9);
               var1 += var9;
               var3 -= var9;
               this.aLong569 += (long)var9;
            }

            if(~this.aByteArray564.length > ~var3) {
               this.aClass122_573.seek(this.aLong569);

               for(this.aLong570 = this.aLong569; 0 < var3; this.aLong569 += (long)var9) {
                  var9 = this.aClass122_573.read(var2, var1, var3);
                  if(0 == ~var9) {
                     break;
                  }

                  this.aLong570 += (long)var9;
                  var3 -= var9;
                  var1 += var9;
               }
            } else if(~var3 < -1) {
               this.method981(4393);
               var9 = var3;
               if(var3 > this.anInt575) {
                  var9 = this.anInt575;
               }

               ArrayUtils.arrayCopy(this.aByteArray564, 0, var2, var1, var9);
               var3 -= var9;
               var1 += var9;
               this.aLong569 += (long)var9;
            }

            if(-1L != this.aLong571) {
               if(this.aLong569 < this.aLong571 && ~var3 < -1) {
                  var9 = (int)(-this.aLong569 + this.aLong571) + var1;
                  if(~(var1 - -var3) > ~var9) {
                     var9 = var1 + var3;
                  }

                  while(var1 < var9) {
                     var2[var1++] = 0;
                     ++this.aLong569;
                     --var3;
                  }
               }

               long var16 = -1L;
               long var11 = -1L;
               if((long)this.anInt566 + this.aLong571 > var5 && (long)var8 + var5 >= (long)this.anInt566 + this.aLong571) {
                  var11 = (long)this.anInt566 + this.aLong571;
               } else if(~this.aLong571 > ~((long)var8 + var5) && ~((long)this.anInt566 + this.aLong571) <= ~((long)var8 + var5)) {
                  var11 = (long)var8 + var5;
               }

               if(~var5 >= ~this.aLong571 && ~(var5 - -((long)var8)) < ~this.aLong571) {
                  var16 = this.aLong571;
               } else if(~var5 <= ~this.aLong571 && var5 < (long)this.anInt566 + this.aLong571) {
                  var16 = var5;
               }

               if(-1L < var16 && var11 > var16) {
                  int var13 = (int)(var11 + -var16);
                  ArrayUtils.arrayCopy(this.aByteArray572, (int)(var16 + -this.aLong571), var2, (int)(var16 + -var5) + var1, var13);
                  if(this.aLong569 < var11) {
                     var3 = (int)((long)var3 - (-this.aLong569 + var11));
                     this.aLong569 = var11;
                  }
               }
            }
         } catch (IOException var14) {
            this.aLong570 = -1L;
            throw var14;
         }

         if(var4 < var3) {
            throw new EOFException();
         }
      } catch (RuntimeException var15) {
         throw Class44.method1067(var15, "en.F(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ',' + var4 + ')');
      }
   }

   static final void method979(int var0, int var1, int var2) {
	   jString var4 = client.method903(new jString[]{PlayerAppearance.aClass94_853, Class72.method1298(var2), Class3_Sub13_Sub22.aClass94_3268, Class72.method1298(var0 >> 6), Class3_Sub13_Sub22.aClass94_3268, Class72.method1298(var1 >> 6), Class3_Sub13_Sub22.aClass94_3268, Class72.method1298(var0 & 63), Class3_Sub13_Sub22.aClass94_3268, Class72.method1298(63 & var1)});
	   //var4.method1549(false);
	   Class65943149.method1308(var4);
   }

   final void method980(boolean var1) throws IOException {
      try {
         this.method975((byte)-75);
         this.aClass122_573.close();
         if(var1) {
            this.aLong569 = 91L;
         }

      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "en.K(" + var1 + ')');
      }
   }

   private final void method981(int var1) throws IOException {
      try {
         this.anInt575 = 0;
         if(var1 != 4393) {
            this.method976();
         }

         if(this.aLong570 != this.aLong569) {
            this.aClass122_573.seek(this.aLong569);
            this.aLong570 = this.aLong569;
         }

         int var3;
         for(this.aLong576 = this.aLong569; this.aByteArray564.length > this.anInt575; this.anInt575 += var3) {
            int var2 = this.aByteArray564.length + -this.anInt575;
            if(-200000001 > ~var2) {
               var2 = 200000000;
            }

            var3 = this.aClass122_573.read(this.aByteArray564, this.anInt575, var2);
            if(0 == ~var3) {
               break;
            }

            this.aLong570 += (long)var3;
         }

      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "en.A(" + var1 + ')');
      }
   }

	final void method982(boolean var1, byte[] var2) throws IOException {
		this.method978(0, var2, var2.length, 0);
	}

   final void method983(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         try {
            if(~this.aLong568 > ~((long)var4 + this.aLong569)) {
               this.aLong568 = (long)var4 + this.aLong569;
            }

            if(0L != ~this.aLong571 && (this.aLong571 > this.aLong569 || ~this.aLong569 < ~((long)this.anInt566 + this.aLong571))) {
               this.method975((byte)124);
            }

            if(~this.aLong571 != 0L && (long)this.aByteArray572.length + this.aLong571 < (long)var4 + this.aLong569) {
               int var5 = (int)((long)this.aByteArray572.length - this.aLong569 + this.aLong571);
               var4 -= var5;
               ArrayUtils.arrayCopy(var1, var2, this.aByteArray572, (int)(this.aLong569 + -this.aLong571), var5);
               this.aLong569 += (long)var5;
               this.anInt566 = this.aByteArray572.length;
               this.method975((byte)93);
               var2 += var5;
            }

            if(~this.aByteArray572.length > ~var4) {
               if(~this.aLong569 != ~this.aLong570) {
                  this.aClass122_573.seek(this.aLong569);
                  this.aLong570 = this.aLong569;
               }

               this.aClass122_573.write(var1, var2, var4);
               long var12 = -1L;
               if(this.aLong576 <= this.aLong569 && ~((long)this.anInt575 + this.aLong576) < ~this.aLong569) {
                  var12 = this.aLong569;
               } else if(~this.aLong569 >= ~this.aLong576 && ~((long)var4 + this.aLong569) < ~this.aLong576) {
                  var12 = this.aLong576;
               }

               this.aLong570 += (long)var4;
               long var7 = -1L;
               if(this.aLong563 < this.aLong570) {
                  this.aLong563 = this.aLong570;
               }

               if(this.aLong569 + (long)var4 > this.aLong576 && ~(this.aLong569 - -((long)var4)) >= ~(this.aLong576 - -((long)this.anInt575))) {
                  var7 = (long)var4 + this.aLong569;
               } else if(~(this.aLong576 + (long)this.anInt575) < ~this.aLong569 && this.aLong569 + (long)var4 >= (long)this.anInt575 + this.aLong576) {
                  var7 = (long)this.anInt575 + this.aLong576;
               }

               if(~var12 < 0L && var7 > var12) {
                  int var9 = (int)(-var12 + var7);
                  ArrayUtils.arrayCopy(var1, (int)(-this.aLong569 + var12 + (long)var2), this.aByteArray564, (int)(-this.aLong576 + var12), var9);
               }

               this.aLong569 += (long)var4;
               return;
            }

            if(0 < var4) {
               if(this.aLong571 == -1L) {
                  this.aLong571 = this.aLong569;
               }

               ArrayUtils.arrayCopy(var1, var2, this.aByteArray572, (int)(this.aLong569 + -this.aLong571), var4);
               this.aLong569 += (long)var4;
               if(~((long)this.anInt566) > ~(-this.aLong571 + this.aLong569)) {
                  this.anInt566 = (int)(-this.aLong571 + this.aLong569);
               }

               return;
            }
         } catch (IOException var10) {
            this.aLong570 = -1L;
            throw var10;
         }

         if(var3 != -903171152) {
            this.aLong563 = -28L;
         }

      } catch (RuntimeException var11) {
         throw Class44.method1067(var11, "en.H(" + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

	final void method984(int var1, long var2) throws IOException {
		if (var2 >= 0L) {
			this.aLong569 = var2;
		} else {
			throw new IOException("Invalid seek to " + var2 + " in file " + this.getFile());
		}
	}

   Class30(FileOnDisk var1, int var2, int var3) throws IOException {
      try {
         this.aClass122_573 = var1;
         this.aLong568 = this.aLong563 = var1.getLength();
         this.aByteArray572 = new byte[var3];
         this.aByteArray564 = new byte[var2];
         this.aLong569 = 0L;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "en.<init>(" + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ')');
      }
   }

}
