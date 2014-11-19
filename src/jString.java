import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

final class jString implements Interface3 {

   static boolean safeMode = false;
   static int anInt2147 = 0;
   static int anInt2148 = 0;
   static boolean aBoolean2150;
   private boolean aBoolean2152 = true;
   byte[] buf;
   static boolean aBoolean2154;
   //static jString aClass94_2155 = jString.createJString(":allyreq:");
   int pos;
   static int[] anIntArray2157 = new int[50];
   static jString aClass94_2151 = jString.createJString("Allocated memory");;

   final URL method1527(boolean var1) throws MalformedURLException {
      try {
         if(var1) {
            method1548(22);
         }

         return new URL(new String(buf, 0, pos));
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "na.W(" + var1 + ')');
      }
   }

	final boolean equals(jString var2) {
		if (var2 == null) {
			return false;
		} else if (this == var2) {
			return true;
		} else if (pos != var2.pos) {
			return false;
		} else {
			byte[] var4 = var2.buf;
			byte[] var3 = buf;
			for (int var5 = 0; var5 < pos; ++var5) {
				if (var3[var5] != var4[var5]) {
					return false;
				}
			}
			return true;
		}
	}

	static final boolean method1529(int offsetY, int x, int color1, int y, int color2, int offsetX, int z, boolean dummy) {
	      try {
	         long uid = Class157.method2174(z, x + offsetX, y + offsetY);
	         int var10;
	         int var11;
	         int var12;
	         ObjectDefinition var13;
	         int var14;
	         int[] var15;
	         int var16;
	         if(uid != 0L) {
	            var10 = 3 & (int)uid >> 20;
	            var11 = (508650 & (int)uid) >> 14;
	            var12 = Integer.MAX_VALUE & (int)(uid >>> 32);
	            var13 = ObjectDefinition.list(var12);
	            if(-1 != var13.anInt1516) {
	            	if(var13.anInt1516 > client.mapscenes.length)
	            		return false;
					AbstractSprite sprite = client.mapscenes[var13.anInt1516];
					if (sprite != null) {
						int sprite_x = ((var13.sizeX * 4 + -sprite.width) / 2);
						int sprite_y = ((var13.sizeY * 4 + -sprite.height) / 2);
						if(HDToolkit.openGLEnabled) {
							((LDSprite)sprite).drawSprite(sprite_x + (x * 4 + 48), (48 - -((-(var13.sizeY) + -y + 104) * 4) - -sprite_y));
						} else {
							((LDSprite)sprite).drawSprite(sprite_x + (x * 4 + 48), (48 - -((-(var13.sizeY) + -y + 104) * 4) - -sprite_y));
						}
						return true;
					}
					return false;
	               //if(!Class15.method888(x, var13, false, offsetY, offsetX, y, var10)) {//TODO this goofin shit up
	               //   return false;
	               //}
	            } else {
	               var14 = color1;
	               if(~uid < -1L) {
	                  var14 = color2;
	               }

	               var15 = GraphicsLD.pixels;
	               var16 = 4 * (-(y * 512) + '\uce00') + x * 4 + 24624;
	               if(var11 == 0 || var11 == 2) {
	                  if(~var10 == -1) {
	                     var15[var16] = var14;
	                     var15[512 + var16] = var14;
	                     var15[var16 - -1024] = var14;
	                     var15[1536 + var16] = var14;
	                  } else if(~var10 != -2) {
	                     if(~var10 != -3) {
	                        if(3 == var10) {
	                           var15[var16 + 1536] = var14;
	                           var15[1536 + var16 - -1] = var14;
	                           var15[var16 + 1538] = var14;
	                           var15[3 + var16 + 1536] = var14;
	                        }
	                     } else {
	                        var15[var16 - -3] = var14;
	                        var15[var16 - -3 - -512] = var14;
	                        var15[var16 - -3 + 1024] = var14;
	                        var15[var16 + 3 + 1536] = var14;
	                     }
	                  } else {
	                     var15[var16] = var14;
	                     var15[1 + var16] = var14;
	                     var15[var16 - -2] = var14;
	                     var15[var16 - -3] = var14;
	                  }
	               }

	               if(var11 == 3) {
	                  if(var10 == 0) {
	                     var15[var16] = var14;
	                  } else if(1 == var10) {
	                     var15[var16 - -3] = var14;
	                  } else if(-3 == ~var10) {
	                     var15[var16 - -3 + 1536] = var14;
	                  } else if(-4 == ~var10) {
	                     var15[var16 - -1536] = var14;
	                  }
	               }

	               if(~var11 == -3) {
	                  if(-4 != ~var10) {
	                     if(-1 != ~var10) {
	                        if(-2 != ~var10) {
	                           if(2 == var10) {
	                              var15[1536 + var16] = var14;
	                              var15[var16 - -1536 + 1] = var14;
	                              var15[1536 + var16 + 2] = var14;
	                              var15[var16 + 1539] = var14;
	                           }
	                        } else {
	                           var15[var16 - -3] = var14;
	                           var15[512 + 3 + var16] = var14;
	                           var15[3 + (var16 - -1024)] = var14;
	                           var15[1536 + var16 + 3] = var14;
	                        }
	                     } else {
	                        var15[var16] = var14;
	                        var15[1 + var16] = var14;
	                        var15[2 + var16] = var14;
	                        var15[3 + var16] = var14;
	                     }
	                  } else {
	                     var15[var16] = var14;
	                     var15[var16 - -512] = var14;
	                     var15[var16 + 1024] = var14;
	                     var15[1536 + var16] = var14;
	                  }
	               }
	            }
	         }

	         uid = AnimationLoader.method557(z, x + offsetX, offsetY + y);
	         if(uid != 0L) {
	            var10 = (int)uid >> 20 & 3;
	            var11 = ((int)uid & 520964) >> 14;
	            var12 = (int)(uid >>> 32) & Integer.MAX_VALUE;
	            var13 = ObjectDefinition.list(var12);
	            if(~var13.anInt1516 != 0) {
	            	if(var13.anInt1516 > client.mapscenes.length)
	            		return false;
					AbstractSprite sprite = client.mapscenes[var13.anInt1516];
					if (sprite != null) {
						int sprite_x = ((var13.sizeX * 4 + -sprite.width) / 2);
						int sprite_y = ((var13.sizeY * 4 + -sprite.height) / 2);
						if(HDToolkit.openGLEnabled) {
							((LDSprite)sprite).drawSprite(sprite_x + (x * 4 + 48), (48 - -((-(var13.sizeY) + -y + 104) * 4) - -sprite_y));
						} else {
							((LDSprite)sprite).drawSprite(sprite_x + (x * 4 + 48), (48 - -((-(var13.sizeY) + -y + 104) * 4) - -sprite_y));
						}
						return true;
					}
					return false;
	               //if(!Class15.method888(x, var13, false, offsetY, offsetX, y, var10)) {
	               //   return false;
	               //}
	            } else if(var11 == 9) {
	               var14 = 15658734;
	               if(~uid < -1L) {
	                  var14 = 15597568;
	               }

	               var16 = x * 4 + (24624 - -(2048 * (103 - y)));
	               var15 = GraphicsLD.pixels;
	               if(~var10 != -1 && ~var10 != -3) {
	                  var15[var16] = var14;
	                  var15[var16 - -512 - -1] = var14;
	                  var15[var16 - -1024 - -2] = var14;
	                  var15[1536 + var16 - -3] = var14;
	               } else {
	                  var15[1536 + var16] = var14;
	                  var15[var16 - -1025] = var14;
	                  var15[var16 + 512 + 2] = var14;
	                  var15[var16 - -3] = var14;
	               }
	            }
	         }

	         uid = GroundTile.method104(z, x + offsetX, y + offsetY);
	         if(uid != 0L) {
	            var10 = (int)uid >> 20 & 3;
	            var11 = (int)(uid >>> 32) & Integer.MAX_VALUE;
	            ObjectDefinition var18 = ObjectDefinition.list(var11);
	            if(var18.anInt1516 != -1) {
	            	if(var18.anInt1516 > client.mapscenes.length)
	            		return false;
					AbstractSprite sprite = client.mapscenes[var18.anInt1516];
					if (sprite != null) {
						int sprite_x = ((var18.sizeX * 4 + -sprite.width) / 2);
						int sprite_y = ((var18.sizeY * 4 + -sprite.height) / 2);
						if(HDToolkit.openGLEnabled)
							((LDSprite)sprite).drawSprite(sprite_x + (x * 4 + 48), (48 - -((-(var18.sizeY) + -y + 104) * 4) - -sprite_y));
						else
							((LDSprite)sprite).drawSprite(sprite_x + (x * 4 + 48), (48 - -((-(var18.sizeY) + -y + 104) * 4) - -sprite_y));
						return true;
					}
					return false;
	            }
	            //if(0 != ~var18.anInt1516 && !Class15.method888(x, var18, !dummy, offsetY, offsetX, y, var10)) {
	            //   return false;
	            //}
	         }

	         if(!dummy) {
	            aBoolean2150 = true;
	         }

	         return true;
	      } catch (RuntimeException var17) {
	         throw Class44.method1067(var17, "na.N(" + offsetY + ',' + x + ',' + color1 + ',' + y + ',' + color2 + ',' + offsetX + ',' + z + ',' + dummy + ')');
	      }
	   }

   final int method1530(byte var1, int var2) {
      try {
         if(var2 < 1 || -37 > ~var2) {
            var2 = 10;
         }

         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = 0;

         for(int var7 = 29 / ((-47 - var1) / 37); pos > var6; ++var6) {
            int var8 = 255 & buf[var6];
            if(~var6 == -1) {
               if(45 == var8) {
                  var3 = true;
                  continue;
               }

               if(var8 == 43) {
                  continue;
               }
            }

            if(var8 >= 48 && 57 >= var8) {
               var8 -= 48;
            } else if(65 <= var8 && -91 <= ~var8) {
               var8 -= 55;
            } else {
               if(-98 < ~var8 || ~var8 < -123) {
                  throw new NumberFormatException();
               }

               var8 -= 87;
            }

            if(~var2 >= ~var8) {
               throw new NumberFormatException();
            }

            if(var3) {
               var8 = -var8;
            }

            int var9 = var8 + var5 * var2;
            if(var9 / var2 != var5) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if(!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } catch (RuntimeException var10) {
         throw Class44.method1067(var10, "na.AB(" + var1 + ',' + var2 + ')');
      }
   }

   final boolean method1531(jString var2) {
	   if(var2 == null) {
           return false;
        } else if(pos != var2.pos) {
           return false;
        } else {
           for(int var3 = 0; ~pos < ~var3; ++var3) {
              byte var5 = buf[var3];
              if(-66 >= ~var5 && ~var5 >= -91 || ~var5 <= 63 && var5 <= -34 && ~var5 != 40) {
                 var5 = (byte)(var5 + 32);
              }

              byte var6 = var2.buf[var3];
              if(65 <= var6 && -91 <= ~var6 || -64 <= var6 && var6 <= -34 && 40 != ~var6) {
                 var6 = (byte)(var6 + 32);
              }

              if(~var5 != ~var6) {
                 return false;
              }
           }
           return true;
        }
   }

	final void method1532(Graphics var3, int x, int y) {
		String var5;
		try {
			var5 = new String(buf, 0, pos, "ISO-8859-1");
		} catch (UnsupportedEncodingException var7) {
			var5 = new String(buf, 0, pos);
		}

		var3.drawString(var5, x, y);
	}

   final jString method1533(jString var1, boolean var2) {
      try {
         if(aBoolean2152) {
            if(!var2) {
               return (jString)null;
            } else {
               if(var1.pos + pos > buf.length) {
                  int var3;
                  for(var3 = 1; ~(var1.pos + pos) < ~var3; var3 += var3) {
                     ;
                  }

                  byte[] var4 = new byte[var3];
                  ArrayUtils.arrayCopy(buf, 0, var4, 0, pos);
                  buf = var4;
               }

               ArrayUtils.arrayCopy(var1.buf, 0, buf, pos, var1.pos);
               pos += var1.pos;
               return this;
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "na.E(" + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   final jString toLowerCase() {
	   jString var2 = new jString();
	   var2.pos = pos;
	   var2.buf = new byte[pos];
         
	   for(int var3 = 0; ~pos < ~var3; ++var3) {
		   byte var4 = buf[var3];
		   if(65 <= var4 && var4 <= 90 || var4 >= -64 && ~var4 >= 33 && var4 != -41) {
			   var4 = (byte)(var4 + 32);
		   }
		   
		   var2.buf[var3] = var4;
	   }

	   return var2;
   }

   static final int method1535(Class44_Sub1 var0, Class44_Sub1 var1, int var2, int var3, int var4, boolean var5, boolean var6) {
      try {
         int var7 = Class161.method2201(var1, var4, var2 + -5638, var0, var6);
         if(var7 == 0) {
            if(var2 != 5730) {
               return -76;
            } else if(var3 != -1) {
               int var8 = Class161.method2201(var1, var3, var2 ^ 5651, var0, var5);
               return !var5?var8:-var8;
            } else {
               return 0;
            }
         } else {
            return !var6?var7:-var7;
         }
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "na.D(" + (var0 != null?"{...}":"null") + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   final jString method1536(int var1) {
      try {
         byte var3 = 2;
         jString var2 = new jString();
         var2.pos = pos;
         if(var1 < 67) {
            return (jString)null;
         } else {
            var2.buf = new byte[pos];

            for(int var4 = 0; ~pos < ~var4; ++var4) {
               byte var5 = buf[var4];
               if((-98 < ~var5 || 122 < var5) && (31 < ~var5 || ~var5 < 1 || var5 == -9)) {
                  if((var5 < 65 || ~var5 < -91) && (var5 < -64 || var5 > -34 || ~var5 == 40)) {
                     if(~var5 != -47 && 33 != var5 && var5 != 63) {
                        if(32 == var5) {
                           if(2 != var3) {
                              var3 = 1;
                           }
                        } else {
                           var3 = 1;
                        }
                     } else {
                        var3 = 2;
                     }
                  } else {
                     if(0 == var3) {
                        var5 = (byte)(var5 + 32);
                     }

                     var3 = 0;
                  }
               } else {
                  if(2 == var3) {
                     var5 = (byte)(var5 - 32);
                  }

                  var3 = 0;
               }

               var2.buf[var4] = var5;
            }

            return var2;
         }
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "na.DA(" + var1 + ')');
      }
   }

   static final LDSprite method1537(js5 var0, int var1, boolean var2) {
      try {
         if(!ItemPile.method2029((byte)-118, var0, var1)) {
            return null;
         } else {
            if(var2) {
               method1539(-39, true, -93, (js5)null);
            }

            return Class117.method1722(-93);
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "na.GB(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + var2 + ')');
      }
   }

   final long method1538() {
         long var2 = 0L;

         for(int var4 = 0; var4 < pos; ++var4) {
            var2 = (long)(buf[var4] & 255) + (var2 << 5) + -var2;
         }

         return var2;
   }

   static final LDIndexedSprite method1539(int var0, boolean var1, int var2, js5 var3) {
      try {
         if(!var1) {
            method1535((Class44_Sub1)null, (Class44_Sub1)null, -64, -40, 23, false, false);
         }

         return client.spriteExists(var3, var0, var2)?Class77.method1364((byte)82):null;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "na.MA(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

   final int getLength() {
	   return pos;
   }

   public static void method1541(int var0) {
      try {
         aClass94_2151 = null;
         if(var0 != -8635) {
            aClass94_2151 = (jString)null;
         }

         anIntArray2157 = null;
         //aClass94_2155 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "na.R(" + var0 + ')');
      }
   }

   final jString method1542(jString var2, int var3, int var4) {
         if(!aBoolean2152) {
            throw new IllegalArgumentException();
         } else if(0 <= var3 && var3 <= var4 && ~var4 >= ~var2.pos) {
            if(pos + (var4 - var3) > buf.length) {
               int var5;
               for(var5 = 1; ~(pos + var2.pos) < ~var5; var5 += var5) {
                  ;
               }

               byte[] var6 = new byte[var5];
               ArrayUtils.arrayCopy(buf, 0, var6, 0, pos);
               buf = var6;
            }

            ArrayUtils.arrayCopy(var2.buf, var3, buf, pos, -var3 + var4);

            pos += var4 + -var3;
            return this;
         } else {
            throw new IllegalArgumentException();
         }
   }

   final boolean method1543(int var1) {
      try {
         if(var1 < 79) {
            method1552((byte)114);
         }

         return method1561(10, true);
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "na.I(" + var1 + ')');
      }
   }

   final jString method1544(boolean var1) {
      try {
         jString var2 = new jString();
         var2.pos = pos;
         var2.buf = new byte[var2.pos];
         if(!var1) {
            return (jString)null;
         } else {
            for(int var3 = 0; pos > var3; ++var3) {
               var2.buf[pos - var3 + -1] = buf[var3];
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "na.FB(" + var1 + ')');
      }
   }

   final jString upperCase() {
         jString var2 = new jString();
         var2.pos = pos;
         var2.buf = new byte[pos];
         boolean var3 = true;
         int var4 = 0;

         for(; ~pos < ~var4; ++var4) {
            byte var5 = buf[var4];
            if(~var5 != -96) {
               if(97 <= var5 && var5 <= 122 && var3) {
                  var3 = false;
                  var2.buf[var4] = (byte)(-32 + var5);
               } else {
                  var2.buf[var4] = var5;
                  var3 = false;
               }
            } else {
               var3 = true;
               var2.buf[var4] = 32;
            }
         }

         return var2;
   }

   final int method1546(byte var1, jString var2) {
      try {
         if(var1 >= -44) {
            aBoolean2150 = true;
         }

         int var3 = 0;
         int var4 = 0;
         int var6 = var2.pos;
         int var5 = pos;
         int var7 = pos;
         int var8 = var2.pos;
         int var9 = 0;
         int var10 = 0;

         while(-1 != ~var5 && var6 != 0) {
            if(~var3 != -157 && var3 != 230) {
               if(140 != var3 && -199 != ~var3) {
                  if(var3 != 223) {
                     var3 = buf[var9] & 255;
                     ++var9;
                  } else {
                     var3 = 115;
                  }
               } else {
                  var3 = 69;
               }
            } else {
               var3 = 101;
            }

            if(!js5Worker.method2103(var3, -116)) {
               --var5;
            } else {
               ++var7;
            }

            if(var4 != 156 && 230 != var4) {
               if(~var4 != -141 && ~var4 != -199) {
                  if(223 == var4) {
                     var4 = 115;
                  } else {
                     var4 = 255 & var2.buf[var10];
                     ++var10;
                  }
               } else {
                  var4 = 69;
               }
            } else {
               var4 = 101;
            }

            if(js5Worker.method2103(var4, -86)) {
               ++var8;
            } else {
               --var6;
            }

            if(~AbstractGraphicsBuffer.anIntArray2004[var3] > ~AbstractGraphicsBuffer.anIntArray2004[var4]) {
               return -1;
            }

            if(~AbstractGraphicsBuffer.anIntArray2004[var4] > ~AbstractGraphicsBuffer.anIntArray2004[var3]) {
               return 1;
            }
         }

         return var8 <= var7?(var7 > var8?1:0):-1;
      } catch (RuntimeException var11) {
         throw Class44.method1067(var11, "na.FA(" + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   final URL method1547(URL var1, boolean var2) throws MalformedURLException {
      try {
         if(!var2) {
            buf = (byte[])null;
         }

         return new URL(var1, new String(buf, 0, pos));
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "na.EB(" + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   final jString method1548(int var2) {
         if(~var2 < -1 && ~var2 >= -256) {
            jString var3 = new jString();
            var3.buf = new byte[1 + pos];
            var3.pos = pos + 1;
            ArrayUtils.arrayCopy(buf, 0, var3.buf, 0, pos);
            var3.buf[pos] = (byte)var2;
            return var3;
         } else {
            throw new IllegalArgumentException("invalid char");
         }
   }

	final void method1549() {
		String var2;
		try {
			var2 = new String(buf, 0, pos, "ISO-8859-1");
		} catch (UnsupportedEncodingException var4) {
			var2 = new String(buf, 0, pos);
		}

		System.out.println(var2);
	}

   final boolean method1550(byte var1, jString var2) {
      try {
         if(var2.pos > pos) {
            return false;
         } else {
            int var3 = -var2.pos + pos;
            if(var1 >= -25) {
               anIntArray2157 = (int[])null;
            }

            for(int var4 = 0; var4 < var2.pos; ++var4) {
               if(buf[var3 + var4] != var2.buf[var4]) {
                  return false;
               }
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "na.TA(" + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   final int method1551(jString var1) {
	   return method1566(var1, 0, -1);
   	}

   final int method1552(byte var1) {
      try {
         if(var1 > -89) {
            substring(33, -79);
         }

         return method1530((byte)-114, 10);
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "na.T(" + var1 + ')');
      }
   }

   final void method1553(int var1, boolean var2) {
      try {
         if(!aBoolean2152) {
            throw new IllegalArgumentException();
         } else if(-1 < ~var1) {
            throw new IllegalArgumentException();
         } else {
            int var3;
            if(~var1 < ~buf.length) {
               for(var3 = 1; ~var3 > ~var1; var3 += var3) {
                  ;
               }

               byte[] var4 = new byte[var3];
               ArrayUtils.arrayCopy(buf, 0, var4, 0, pos);
               buf = var4;
            }

            for(var3 = pos; ~var3 > ~var1; ++var3) {
               buf[var3] = 32;
            }

            if(var2) {
               anIntArray2157 = (int[])null;
            }

            pos = var1;
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "na.RA(" + var1 + ',' + var2 + ')');
      }
   }

   public final String toString() {
	   return new String(buf);
   }

   final void method1554(boolean var1, Applet var2) throws Throwable {
      try {
         if(var1) {
            String var3 = new String(buf, 0, pos);
            JSUtils.eval(var2, var3);
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "na.AA(" + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   final int method1555(int var1, int var2, int var3) {
      try {
         byte var4 = (byte)var1;
         if(var3 != 1536) {
            return 123;
         } else {
            for(int var5 = var2; ~var5 > ~pos; ++var5) {
               if(buf[var5] == var4) {
                  return var5;
               }
            }

            return -1;
         }
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "na.NA(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   final jString method1556(int var1, byte var2) {
      try {
         if(var2 != -74) {
            toString();
         }

         return substring(pos, var1);
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "na.CA(" + var1 + ',' + var2 + ')');
      }
   }

   final jString substring(int var1, int var3) {
	   jString var4 = new jString();
	   var4.pos = -var3 + var1;
	   var4.buf = new byte[-var3 + var1];
	   ArrayUtils.arrayCopy(buf, var3, var4.buf, 0, var4.pos);
	   return var4;
   }

   final boolean method1558(jString var1, int var2) {
      try {
         if(~pos <= ~var1.pos) {
            for(int var3 = var2; var3 < var1.pos; ++var3) {
               if(~buf[var3] != ~var1.buf[var3]) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "na.UA(" + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   public final boolean equals(Object var1) {
      try {
         if(!(var1 instanceof jString)) {
            throw new IllegalArgumentException();
         } else {
            return equals((jString)var1);
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "na.equals(" + (var1 != null?"{...}":"null") + ')');
      }
   }

   final int method1559(jString var1) {
         int var3;
         if(var1.pos < pos) {
            var3 = var1.pos;
         } else {
            var3 = pos;
         }

         for(int var4 = 0; var3 > var4; ++var4) {
            if((255 & buf[var4]) < (var1.buf[var4] & 255)) {
               return -1;
            }

            if(~(var1.buf[var4] & 255) > ~(buf[var4] & 255)) {
               return 1;
            }
         }

         if(var1.pos > pos) {
            return -1;
         } else if(~var1.pos <= ~pos) {
            return 0;
         } else {
            return 1;
         }
   }

   final jString method1560(jString var1, boolean var2, jString var3) {
      try {
         int var4 = pos;
         int var5 = var1.pos - var3.pos;
         int var6 = 0;

         while(true) {
            int var7 = method1566(var3, var6, -1);
            if(0 > var7) {
               var6 = 0;
               jString var10 = Class47.createBlankJString(var4);

               while(true) {
                  int var8 = method1566(var3, var6, -1);
                  if(0 > var8) {
                     while(~var6 > ~pos) {
                        var10.method1572(255 & buf[var6++], (byte)117);
                     }

                     if(!var2) {
                        method1567(-5);
                     }

                     return var10;
                  }

                  while(var6 < var8) {
                     var10.method1572(buf[var6++] & 255, (byte)125);
                  }

                  var10.method1533(var1, var2);
                  var6 += var3.pos;
               }
            }

            var6 = var7 - -var3.pos;
            var4 += var5;
         }
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "na.IA(" + (var1 != null?"{...}":"null") + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

   public final int hashCode() {
      try {
         return method1574();
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "na.hashCode()");
      }
   }

   private final boolean method1561(int var1, boolean var2) {
      try {
         if(~var1 > -2 || var1 > 36) {
            var1 = 10;
         }

         if(!var2) {
            safeMode = false;
         }

         boolean var4 = false;
         boolean var3 = false;
         int var5 = 0;

         for(int var6 = 0; var6 < pos; ++var6) {
            int var7 = buf[var6] & 255;
            if(0 == var6) {
               if(var7 == 45) {
                  var3 = true;
                  continue;
               }

               if(var7 == 43) {
                  continue;
               }
            }

            if(var7 >= 48 && ~var7 >= -58) {
               var7 -= 48;
            } else if(-66 >= ~var7 && -91 <= ~var7) {
               var7 -= 55;
            } else {
               if(97 > var7 || ~var7 < -123) {
                  return false;
               }

               var7 -= 87;
            }

            if(~var7 <= ~var1) {
               return false;
            }

            if(var3) {
               var7 = -var7;
            }

            int var8 = var7 + var1 * var5;
            if(~var5 != ~(var8 / var1)) {
               return false;
            }

            var5 = var8;
            var4 = true;
         }

         return var4;
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "na.P(" + var1 + ',' + var2 + ')');
      }
   }

   final boolean method1562(jString var2) {
	   if(pos < var2.pos) {
           return false;
        } else {
           for(int var3 = 0; var2.pos > var3; ++var3) {
              byte var4 = buf[var3];
              byte var5 = var2.buf[var3];
              if(var5 >= 65 && var5 <= 90 || -64 <= var5 && -34 >= var5 && -41 != var5) {
                 var5 = (byte)(var5 + 32);
              }

              if(65 <= var4 && ~var4 >= -91 || var4 >= -64 && -34 >= var4 && var4 != -41) {
                 var4 = (byte)(var4 + 32);
              }

              if(~var4 != ~var5) {
                 return false;
              }
           }
           return true;
        }
   }

   final jString method1563() {
	   return this;
   }

   final jString method1564() {
         int var2;
         for(var2 = 0; var2 < pos && (0 <= buf[var2] && 32 >= buf[var2] || -161 == ~(255 & buf[var2])); ++var2) {
            ;
         }

         int var3;
         for(var3 = pos; var3 > var2 && (~buf[var3 - 1] <= -1 && -33 <= ~buf[var3 - 1] || -161 == ~(255 & buf[var3 + -1])); --var3) {
            ;
         }

         if(~var2 == -1 && ~pos == ~var3) {
            return this;
         } else {
            jString var4 = new jString();
            var4.pos = var3 + -var2;
            var4.buf = new byte[var4.pos];

            for(int var5 = 0; var5 < var4.pos; ++var5) {
               var4.buf[var5] = buf[var2 + var5];
            }

            return var4;
         }
   }

   final jString method1565(int var1, int var2, int var3) {
      try {
         byte var4 = (byte)var3;
         jString var6 = new jString();
         byte var5 = (byte)var1;
         var6.pos = pos;
         var6.buf = new byte[pos];
         if(var2 < 3) {
            safeMode = true;
         }

         for(int var7 = 0; ~pos < ~var7; ++var7) {
            byte var8 = buf[var7];
            if(~var8 != ~var4) {
               var6.buf[var7] = var8;
            } else {
               var6.buf[var7] = var5;
            }
         }

         return var6;
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "na.HA(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   final int method1566(jString var1, int var2, int var3) {
      try {
         int var4 = var1.pos;
         if(var2 >= pos) {
            return ~var4 == -1?pos:-1;
         } else {
            if(~var2 > -1) {
               var2 = 0;
            }

            if(var3 == ~var4) {
               return var2;
            } else {
               int var7 = pos - var4;
               byte[] var5 = var1.buf;
               byte var6 = var5[0];
               int var8 = var2;

               while(~var8 >= ~var7) {
                  if(~var6 != ~buf[var8]) {
                     do {
                        ++var8;
                        if(var8 > var7) {
                           return -1;
                        }
                     } while(~var6 != ~buf[var8]);
                  }

                  boolean var9 = true;
                  int var10 = 1 + var8;
                  int var11 = 1;

                  while(true) {
                     if(var11 < var4) {
                        if(~var5[var11] == ~buf[var10]) {
                           ++var10;
                           ++var11;
                           continue;
                        }

                        var9 = false;
                     }

                     if(var9) {
                        return var8;
                     }

                     ++var8;
                     break;
                  }
               }

               return -1;
            }
         }
      } catch (RuntimeException var12) {
         throw Class44.method1067(var12, "na.CB(" + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   final jString[] method1567(int var1) {
         int var3 = 0;

         for(int var4 = 0; ~pos < ~var4; ++var4) {
            if(~var1 == ~buf[var4]) {
               ++var3;
            }
         }

         jString[] var11 = new jString[1 + var3];
         if(var3 == 0) {
            var11[0] = this;
            return var11;
         } else {
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;

            for(; ~var7 > ~var3; ++var7) {
               int var9;
               for(var9 = 0; ~var1 != ~buf[var9 + var6]; ++var9) {
                  ;
               }

               var11[var5++] = substring(var6 - -var9, var6);
               var6 += 1 + var9;
            }

            var11[var3] = substring(pos, var6);
            return var11;
         }
   }

   final byte[] method1568(int var1) {
      try {
         byte[] var2 = new byte[pos];
         ArrayUtils.arrayCopy(buf, 0, var2, var1, pos);
         return var2;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "na.H(" + var1 + ')');
      }
   }

   final int method1569(int var1, byte var2) {
      try {
         int var3 = 53 / ((var2 - 9) / 32);
         return buf[var1] & 255;
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "na.SA(" + var1 + ',' + var2 + ')');
      }
   }

   static final AbstractSprite method1570(int var0, byte var1, boolean var2, int var3, boolean var4, int var5, int var6, boolean var7) {
      try {
         ItemDefinition var8 = ItemDefinition.method1023(var3);
         if(~var6 < -2 && var8.anIntArray804 != null) {
            int var9 = -1;
//TODO add new method from 569 to render item sprites class153_sub25_sub1
            for(int var10 = 0; -11 < ~var10; ++var10) {
               if(~var6 <= ~var8.anIntArray766[var10] && var8.anIntArray766[var10] != 0) {
                  var9 = var8.anIntArray804[var10];
               }
            }

            if(0 != ~var9) {
               var8 = ItemDefinition.method1023(var9);
            }
         }

         LDModel var21 = var8.method1120(18206);
         if(null == var21) {
            return null;
         } else {
            LDSprite var22 = null;
            if(0 == ~var8.anInt791) {
               if(var8.anInt762 != -1) {
                  var22 = (LDSprite)method1570(var0, (byte)-107, true, var8.anInt795, false, var5, var6, false);
                  if(null == var22) {
                     return null;
                  }
               }
            } else {
               var22 = (LDSprite)method1570(0, (byte)116, true, var8.anInt789, false, 1, 10, true);
               if(null == var22) {
                  return null;
               }
            }

            int[] var11 = GraphicsLD.pixels;
            int var12 = GraphicsLD.width;
            int var13 = GraphicsLD.height;
            int[] var14 = new int[4];
            GraphicsLD.method1325(var14);
            LDSprite var15 = new LDSprite(36, 32);
            GraphicsLD.init2dCanvas(var15.pixels, 36, 32);
            Rasterizer.method1134();
            Rasterizer.method1145(16, 16);
            int var16 = var8.anInt810;
            Rasterizer.aBoolean843 = false;
            if(var7) {
               var16 = (int)((double)var16 * 1.5D);
            } else if(var5 == 2) {
               var16 = (int)(1.04D * (double)var16);
            }

            int var18 = Rasterizer.cosineTable[var8.anInt786] * var16 >> 16;
            int var17 = Rasterizer.sineTable[var8.anInt786] * var16 >> 16;
            var21.method1893(0, var8.anInt799, var8.anInt768, var8.anInt786, var8.anInt792, var17 - (var21.method1871() / 2 + -var8.anInt754), var8.anInt754 + var18, -1L);
            if(var5 >= 1) {
               var15.method657(1);
               if(-3 >= ~var5) {
                  var15.method657(16777215);
               }

               GraphicsLD.init2dCanvas(var15.pixels, 36, 32);
            }

            if(~var0 != -1) {
               var15.method668(var0);
            }

            int var19 = 73 / ((-56 - var1) / 47);
            if(0 != ~var8.anInt791) {
               var22.method643(0, 0);
            } else if(-1 != var8.anInt762) {
               GraphicsLD.init2dCanvas(var22.pixels, 36, 32);
               var15.method643(0, 0);
               var15 = var22;
            }

            if(var4 && (~var8.stackable == -2 || var6 != 1) && var6 != -1) {
               Class3_Sub13_Sub37.aClass3_Sub28_Sub17_Sub1_3440.method681(LongNode.method123(1000, var6), 0, 9, 16776960, 1);
            }

            GraphicsLD.init2dCanvas(var11, var12, var13);
            GraphicsLD.method1316(var14);
            Rasterizer.method1134();
            Rasterizer.aBoolean843 = true;
            return (AbstractSprite)(HDToolkit.openGLEnabled && !var2?new HDSprite(var15):var15);
         }
      } catch (RuntimeException var20) {
         throw Class44.method1067(var20, "na.WA(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }

   final jString method1571(byte var1) {
      try {
         long var2 = method1538();
         Class var4 = jString.class;
         synchronized(var4) {
            StringNode var5;
            if(Class86.aClass130_1194 != null) {
               for(var5 = (StringNode)Class86.aClass130_1194.get(var2); null != var5; var5 = (StringNode)Class86.aClass130_1194.method1784()) {
                  if(equals(var5.value)) {
                     return var5.value;
                  }
               }
            } else {
               Class86.aClass130_1194 = new Hashtable(4096);
            }

            var5 = new StringNode();
            if(var1 != 32) {
               return (jString)null;
            }

            var5.value = this;
            aBoolean2152 = false;
            Class86.aClass130_1194.put(var5, var2);
         }

         return this;
      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "na.BB(" + var1 + ')');
      }
   }

   final jString method1572(int var1, byte var2) {
      try {
         if(var2 <= 110) {
            aBoolean2150 = true;
         }

         if(0 < var1 && var1 <= 255) {
            if(!aBoolean2152) {
               throw new IllegalArgumentException();
            } else {
               if(pos == buf.length) {
                  int var3;
                  for(var3 = 1; ~var3 >= ~pos; var3 += var3) {
                     ;
                  }

                  byte[] var4 = new byte[var3];
                  ArrayUtils.arrayCopy(buf, 0, var4, 0, pos);
                  buf = var4;
               }

               buf[pos++] = (byte)var1;
               return this;
            }
         } else {
            throw new IllegalArgumentException("invalid char:" + var1);
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "na.L(" + var1 + ',' + var2 + ')');
      }
   }

   final jString method1573(byte var1, Applet var2) {
      try {
         if(var1 < 124) {
            method1552((byte)-82);
         }

         String var3 = new String(buf, 0, pos);
         String var4 = var2.getParameter(var3);
         return null == var4?null:StringNode.method732(var4);
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "na.DB(" + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

	final int method1574() {
		int var2 = 0;

		for (int var3 = 0; var3 < pos; ++var3) {
			var2 = (255 & buf[var3]) + -var2 + (var2 << 998234309);
		}

		return var2;
	}

   final int method1575(int var1, FontMetrics var2) {
      try {
         if(var1 != -21018) {
            return 63;
         } else {
            String var3;
            try {
               var3 = new String(buf, 0, pos, "ISO-8859-1");
            } catch (UnsupportedEncodingException var5) {
               var3 = new String(buf, 0, pos);
            }

            return var2.stringWidth(var3);
         }
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "na.V(" + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   final jString method1576(byte var1) {
      try {
         if(!aBoolean2152) {
            throw new IllegalArgumentException();
         } else {
            if(var1 != 90) {
               anInt2147 = -84;
            }

            if(buf.length != pos) {
               byte[] var2 = new byte[pos];
               ArrayUtils.arrayCopy(buf, 0, var2, 0, pos);
               buf = var2;
            }

            return this;
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "na.PA(" + var1 + ')');
      }
   }

   final Object method1577(Applet var2) throws Throwable {
	   String var3 = new String(buf, 0, pos);
	   Object var4 = JSUtils.getValue(var2, var3);
	   if(var4 instanceof String) {
		   byte[] var5 = ((String)var4).getBytes();
		   var4 = Class3_Sub13_Sub3.bufferToString(var5, 0, var5.length);
	   }
	   return var4;
   }

   final long toLong() {
	   long var2 = 0L;
       for(int var4 = 0; ~pos < ~var4 && -13 < ~var4; ++var4) {
          byte var5 = buf[var4];
          var2 *= 37L;
          if(65 <= var5 && 90 >= var5) {
             var2 += (long)(-65 + 1 + var5);
          } else if(~var5 <= -98 && 122 >= var5) {
             var2 += (long)(-97 + var5 + 1);
          } else if(var5 >= 48 && var5 <= 57) {
             var2 += (long)(-48 + var5 + 27);
          }
       }
       while(~(var2 % 37L) == -1L && var2 != 0L) {
          var2 /= 37L;
       }
       return var2;
   }

   final jString method1579(int var1) {
      try {
         jString var2 = FileSystem.longToString(toLong());
         return var1 >= -4?(jString)null:(null == var2?Class134.aClass94_1760:var2);
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "na.Q(" + var1 + ')');
      }
   }

   final int method1580(boolean var1, byte[] var2, int var3, int var4, int var5) {
      try {
         ArrayUtils.arrayCopy(buf, var4, var2, var3, -var4 + var5);
         if(!var1) {
            method1570(42, (byte)-117, true, -47, false, 3, -26, true);
         }

         return -var4 + var5;
      } catch (RuntimeException var7) {
         throw Class44.method1067(var7, "na.LA(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

static final jString createJString(String string) {
	   byte[] var2 = string.getBytes();
       int var3 = var2.length;
       jString var4 = new jString();
       int var5 = 0;
       var4.buf = new byte[var3];
       while(var3 > var5) {
          int var6 = var2[var5++] & 255;
          if(45 >= var6 && ~var6 <= -41) {
             if(~var5 <= ~var3) {
                break;
             }

             int var7 = 255 & var2[var5++];
             var4.buf[var4.pos++] = (byte)(-48 + var7 + 43 * (-40 + var6));
          } else if(~var6 != -1) {
             var4.buf[var4.pos++] = (byte)var6;
          }
       }
       var4.method1576((byte)90);
       return var4.method1571((byte)32);
   }

}
