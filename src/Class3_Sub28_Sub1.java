import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;

final class Class3_Sub28_Sub1 extends NodeSub {

   static boolean aBoolean3531 = false;
   static Class3_Sub20 aClass3_Sub20_3532 = new Class3_Sub20(0, 0);
   int[] anIntArray3533;
   int[] anIntArray3534;
   int[] anIntArray3535;
   //static int anInt3536;
   static int anInt3537;
   jString aClass94_3538;
   static int anInt3539;
   int[] anIntArray3540;


   final void method525() {
	   int var2;
	   if(null != this.anIntArray3540) {
		   for(var2 = 0; ~this.anIntArray3540.length < ~var2; ++var2) {
			   this.anIntArray3540[var2] = Class3_Sub13_Sub29.method308(this.anIntArray3540[var2], '\u8000');
		   }
	   }

	   if(null != this.anIntArray3534) {
		   for(var2 = 0; this.anIntArray3534.length > var2; ++var2) {
			   this.anIntArray3534[var2] = Class3_Sub13_Sub29.method308(this.anIntArray3534[var2], '\u8000');
		   }
	   }
   }

   final int method526(int var1, int var2) {
      try {
         if(this.anIntArray3540 != null) {
            for(int var3 = var2; ~var3 > ~this.anIntArray3540.length; ++var3) {
               if(var1 == this.anIntArray3533[var3]) {
                  return this.anIntArray3540[var3];
               }
            }

            return -1;
         } else {
            return -1;
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "bc.Q(" + var1 + ',' + var2 + ')');
      }
   }

   private final void method527(Buffer var1, int var2, int var3) {
      try {
         if(var2 != 0) {
            this.method526(-91, -3);
         }

         if(var3 == 1) {
            this.aClass94_3538 = var1.getString();
         } else {
            int var4;
            int var5;
            if(var3 != 2) {
               if(var3 == 3) {
                  var4 = var1.getUByte();
                  this.anIntArray3540 = new int[var4];
                  this.anIntArray3533 = new int[var4];

                  for(var5 = 0; var5 < var4; ++var5) {
                     this.anIntArray3540[var5] = var1.getUShort();
                     this.anIntArray3533[var5] = Class3_Sub13_Sub33.method322(true, var1.getByte());
                  }
               } else if(-5 == ~var3) {
                  ;
               }
            } else {
               var4 = var1.getUByte();
               this.anIntArray3534 = new int[var4];
               this.anIntArray3535 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.anIntArray3534[var5] = var1.getUShort();
                  this.anIntArray3535[var5] = Class3_Sub13_Sub33.method322(true, var1.getByte());
               }
            }
         }

      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "bc.E(" + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   public static void method528(int var0) {
      try {
         aClass3_Sub20_3532 = null;
         if(var0 != -1667) {
            anInt3539 = 101;
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "bc.B(" + var0 + ')');
      }
   }

   final int method529(byte var1, int var2) {
      try {
         int var3 = 45 / ((var1 - -30) / 49);
         if(null == this.anIntArray3534) {
            return -1;
         } else {
            for(int var4 = 0; this.anIntArray3534.length > var4; ++var4) {
               if(~this.anIntArray3535[var4] == ~var2) {
                  return this.anIntArray3534[var4];
               }
            }

            return -1;
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "bc.P(" + var1 + ',' + var2 + ')');
      }
   }

   final void method530(Buffer var1, byte var2) {
      try {
         if(var2 <= 104) {
            this.anIntArray3534 = (int[])null;
         }

         while(true) {
            int var3 = var1.getUByte();
            if(~var3 == -1) {
               return;
            }

            this.method527(var1, 0, var3);
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "bc.D(" + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   static final jString method531(byte var0) {
      try {
         jString var1;
         if(-2 == ~Class164_Sub1.anInt3012 && -3 < ~Class3_Sub13_Sub34.anInt3415) {
            var1 = client.method903(new jString[]{Class3_Sub13_Sub32.aClass94_3388, InputStream_Sub1.aClass94_43, client.aClass94_378, Class131.aClass94_1724});
         } else if(SceneGraphNode.aBoolean1837 && 2 > Class3_Sub13_Sub34.anInt3415) {
            var1 = client.method903(new jString[]{Class3_Sub28_Sub9.aClass94_3621, InputStream_Sub1.aClass94_43, Class40.aClass94_676, Class131.aClass94_1724});
         } else if(Class101.aBoolean1419 && ObjectDefinition.aBooleanArray1490[81] && Class3_Sub13_Sub34.anInt3415 > 2) {
            var1 = Buffer.method802(Class3_Sub13_Sub34.anInt3415 + -2, true);
         } else {
            var1 = Buffer.method802(Class3_Sub13_Sub34.anInt3415 - 1, true);
         }

         if(Class3_Sub13_Sub34.anInt3415 > 2) {
            var1 = client.method903(new jString[]{var1, Class1.aClass94_58, Class72.method1298(Class3_Sub13_Sub34.anInt3415 - 2), Class3_Sub13_Sub36.aClass94_3426});
         }

         int var2 = -97 % ((var0 - 55) / 32);
         return var1;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "bc.F(" + var0 + ')');
      }
   }

   static final void method532(int var0) {
	   InventoryNode var2 = (InventoryNode)GroundTile.aClass130_2220.get((long)var0);
	   if(null != var2) {
		   	var2.unlink();
	   }
   	}	

   static final void method533(Color var0, boolean var2, jString var3, int var4) {
	   try {
			Graphics var5 = InvType.canvas.getGraphics();
			if (Class3_Sub13_Sub32.aFont3384 == null) {
				Class3_Sub13_Sub32.aFont3384 = new Font("Helvetica", 1, 13);
				Class139.aFontMetrics1822 = InvType.canvas.getFontMetrics(Class3_Sub13_Sub32.aFont3384);
			}

			if (var2 || Class3_Sub14.selectionImage != null) {
				if(Class3_Sub14.selectionImage != null)
					Class3_Sub14.selectionImage = null;
				var5.setColor(Color.black);
				var5.fillRect(0, 0, Class23.canvasWid, ItemPile.canvasHei);
			}

			if (null == var0) {
				var0 = new Color(140, 17, 17);
			}

			try {
				if (null == MillisTimer.anImage2695) {
					MillisTimer.anImage2695 = InvType.canvas.createImage(304, 34);
				}

				Graphics var6 = MillisTimer.anImage2695.getGraphics();
				var6.setColor(var0);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var4 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(3 * var4 + 2, 2, -(3 * var4) + 300, 30);
				var6.setFont(Class3_Sub13_Sub32.aFont3384);
				var6.setColor(Color.white);
				var3.method1532(var6, (-var3.method1575(-21018, Class139.aFontMetrics1822) + 304) / 2, 22);
				var5.drawImage(MillisTimer.anImage2695, Class23.canvasWid / 2 - 152, -18 + ItemPile.canvasHei / 2, (ImageObserver) null);
			} catch (Exception var9) {
				int var7 = -152 + Class23.canvasWid / 2;
				int var8 = -18 + ItemPile.canvasHei / 2;
				var5.setColor(var0);
				var5.drawRect(var7, var8, 303, 33);
				var5.fillRect(var7 + 2, 2 + var8, 3 * var4, 30);
				var5.setColor(Color.black);
				var5.drawRect(1 + var7, var8 - -1, 301, 31);
				var5.fillRect(3 * var4 + (var7 - -2), 2 + var8, 300 - var4 * 3, 30);
				var5.setFont(Class3_Sub13_Sub32.aFont3384);
				var5.setColor(Color.white);
				var3.method1532(var5, var7 + (-var3.method1575(-21018, Class139.aFontMetrics1822) + 304) / 2, 22 + var8);
			}

			if (Class167.aClass94_2083 != null) {
				var5.setFont(Class3_Sub13_Sub32.aFont3384);
				var5.setColor(Color.white);
				Class167.aClass94_2083.method1532(var5, Class23.canvasWid / 2 - Class167.aClass94_2083.method1575(-21018, Class139.aFontMetrics1822) / 2, ItemPile.canvasHei / 2 - 26);
			}
		} catch (Exception var10) {
			InvType.canvas.repaint();
		}
   }

}
