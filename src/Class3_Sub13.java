
abstract class Class3_Sub13 extends Node {

   boolean aBoolean2375;
   Class97 aClass97_2376;
   Class3_Sub13[] aClass3_Sub13Array2377;
   static int fullscreenFrameWidth = 0;
  // static jString aClass94_2380 = jString.createJString("::shiftclick");
   int anInt2381;
   Class114 aClass114_2382;
   static int anInt2383 = 0;
   static int anInt2384 = 0;
   static jString aClass94_2385 = jString.createJString("::replacecanvas");
   static int[] anIntArray2386 = new int[]{1, -1, -1, 1};


   final int[] method152(int var1, int var2, int var3) {
      try {
         if(var3 != 32755) {
            anInt2383 = 121;
         }

         return this.aClass3_Sub13Array2377[var1].aBoolean2375?this.aClass3_Sub13Array2377[var1].method154(var2, (byte)-118):this.aClass3_Sub13Array2377[var1].method166(-1, var2)[0];
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "j.RA(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void method153(int var0) {
      try {
         if(var0 >= 91) {
            Class3_Sub26.aClass61_2557 = new Deque();
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "j.QA(" + var0 + ')');
      }
   }

   int[] method154(int var1, byte var2) {
      try {
         int var3 = -71 / ((30 - var2) / 36);
         throw new IllegalStateException("This operation does not have a monochrome output");
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "j.D(" + var1 + ',' + var2 + ')');
      }
   }

   int method155(byte var1) {
      try {
         if(var1 != 19) {
            this.method152(-80, 116, -73);
         }

         return -1;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "j.HA(" + var1 + ')');
      }
   }

   public static void method156(int var0) {
	   anIntArray2386 = null;
       aClass94_2385 = null;
      //aClass94_2380 = null;
   }

   void method157(int var1, Buffer var2, boolean var3) {
      try {
         if(!var3) {
            this.aClass3_Sub13Array2377 = (Class3_Sub13[])null;
         }

      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "j.A(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

   void method158(int var1) {
      try {
         if(var1 != 16251) {
            fullscreenFrameWidth = 12;
         }

      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "j.P(" + var1 + ')');
      }
   }

   int method159(int var1) {
      try {
         if(var1 != 4) {
            client.drawTextOnScreen((jString)null, true);
         }

         return -1;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "j.GA(" + var1 + ')');
      }
   }

   final void method160(int var1, int var2, int var3) {
      try {
         if(var3 != 250) {
            this.aClass114_2382 = (Class114)null;
         }

         int var4 = 255 == this.anInt2381?var1:this.anInt2381;
         if(this.aBoolean2375) {
            this.aClass114_2382 = new Class114(var4, var1, var2);
         } else {
            this.aClass97_2376 = new Class97(var4, var1, var2);
         }

      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "j.SA(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

	void method161() {
		if (!this.aBoolean2375) {
			this.aClass97_2376.method1590();
			this.aClass97_2376 = null;
		} else {
			this.aClass114_2382.method1706();
			this.aClass114_2382 = null;
		}
	}

   final int[][] method162(int var1, int var2, byte var3) {
      try {
         if(var3 > -45) {
            return (int[][])((int[][])null);
         } else if(!this.aClass3_Sub13Array2377[var2].aBoolean2375) {
            return this.aClass3_Sub13Array2377[var2].method166(-1, var1);
         } else {
            int[] var4 = this.aClass3_Sub13Array2377[var2].method154(var1, (byte)-105);
            int[][] var5 = new int[][]{var4, var4, var4};
            return var5;
         }
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "j.UA(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final LDFont method163(byte[] var0, int var1) {
      try {
         if(var0 == null) {
            return null;
         } else {
            if(var1 != 25208) {
               fullscreenFrameWidth = 5;
            }

            LDFont var2 = new LDFont(var0, Class164.spriteXOffsets, Buffer.spriteYOffsets, ItemPile.spriteWidths, Class3_Sub13_Sub6.spriteHeights, Class163_Sub1.spritePaletteIndicators);
            client.resetSprites();
            return var2;
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "j.WA(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   Class3_Sub13(int var1, boolean var2) {
      try {
         this.aClass3_Sub13Array2377 = new Class3_Sub13[var1];
         this.aBoolean2375 = var2;
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "j.<init>(" + var1 + ',' + var2 + ')');
      }
   }

   static final void method165(int var0) {
      try {
         Class95.aClass3_Sub28_Sub16_1339 = null;
         Class3_Sub13_Sub7.aClass3_Sub28_Sub16_3099 = null;
         Vertex.aClass3_Sub28_Sub16_824 = null;
         if(var0 != -7878) {
            client.drawTextOnScreen((jString)null, false);
         }

         Class108.aClass3_Sub28_Sub16_1457 = null;
         Class3_Sub26.aClass3_Sub28_Sub16_2560 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "j.VA(" + var0 + ')');
      }
   }

   int[][] method166(int var1, int var2) {
      try {
         if(var1 != -1) {
            return (int[][])((int[][])null);
         } else {
            throw new IllegalStateException("This operation does not have a colour output");
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "j.T(" + var1 + ',' + var2 + ')');
      }
   }

}
