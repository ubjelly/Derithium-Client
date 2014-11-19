
final class IsaacCipher {

   static jString aClass94_965 = jString.createJString(":duelfriend:");
   private int anInt966;
   private int anInt967;
   private int anInt968;
   private int[] anIntArray970;
   private int[] anIntArray971;
   private int anInt972;

   private final void method1227(boolean var1) {
      try {
         if(!var1) {
            this.method1229(82);
         }

         int var10 = -1640531527;
         int var9 = -1640531527;
         int var8 = -1640531527;
         int var7 = -1640531527;
         int var6 = -1640531527;
         int var5 = -1640531527;
         int var4 = -1640531527;
         int var3 = -1640531527;

         int var2;
         for(var2 = 0; 4 > var2; ++var2) {
            var3 ^= var4 << 11;
            var6 += var3;
            var4 += var5;
            var4 ^= var5 >>> 2;
            var5 += var6;
            var5 ^= var6 << 8;
            var8 += var5;
            var7 += var4;
            var6 += var7;
            var6 ^= var7 >>> 16;
            var7 += var8;
            var9 += var6;
            var7 ^= var8 << 10;
            var10 += var7;
            var8 += var9;
            var8 ^= var9 >>> 4;
            var9 += var10;
            var9 ^= var10 << 8;
            var4 += var9;
            var3 += var8;
            var10 += var3;
            var10 ^= var3 >>> 9;
            var5 += var10;
            var3 += var4;
         }

         for(var2 = 0; ~var2 > -257; var2 += 8) {
            var6 += this.anIntArray970[3 + var2];
            var7 += this.anIntArray970[var2 - -4];
            var9 += this.anIntArray970[var2 + 6];
            var3 += this.anIntArray970[var2];
            var5 += this.anIntArray970[2 + var2];
            var8 += this.anIntArray970[var2 - -5];
            var10 += this.anIntArray970[7 + var2];
            var4 += this.anIntArray970[var2 - -1];
            var3 ^= var4 << 11;
            var4 += var5;
            var4 ^= var5 >>> 2;
            var6 += var3;
            var5 += var6;
            var5 ^= var6 << 8;
            var7 += var4;
            var6 += var7;
            var6 ^= var7 >>> 16;
            var8 += var5;
            var7 += var8;
            var7 ^= var8 << 10;
            var10 += var7;
            var9 += var6;
            var8 += var9;
            var8 ^= var9 >>> 4;
            var9 += var10;
            var9 ^= var10 << 8;
            var3 += var8;
            var10 += var3;
            var4 += var9;
            var10 ^= var3 >>> 9;
            var3 += var4;
            this.anIntArray971[var2] = var3;
            this.anIntArray971[1 + var2] = var4;
            var5 += var10;
            this.anIntArray971[2 + var2] = var5;
            this.anIntArray971[var2 + 3] = var6;
            this.anIntArray971[4 + var2] = var7;
            this.anIntArray971[5 + var2] = var8;
            this.anIntArray971[var2 - -6] = var9;
            this.anIntArray971[7 + var2] = var10;
         }

         for(var2 = 0; -257 < ~var2; var2 += 8) {
            var9 += this.anIntArray971[6 + var2];
            var8 += this.anIntArray971[var2 + 5];
            var7 += this.anIntArray971[4 + var2];
            var4 += this.anIntArray971[var2 + 1];
            var5 += this.anIntArray971[2 + var2];
            var3 += this.anIntArray971[var2];
            var3 ^= var4 << 11;
            var6 += this.anIntArray971[var2 + 3];
            var10 += this.anIntArray971[var2 + 7];
            var6 += var3;
            var4 += var5;
            var4 ^= var5 >>> 2;
            var5 += var6;
            var7 += var4;
            var5 ^= var6 << 8;
            var8 += var5;
            var6 += var7;
            var6 ^= var7 >>> 16;
            var7 += var8;
            var7 ^= var8 << 10;
            var9 += var6;
            var8 += var9;
            var8 ^= var9 >>> 4;
            var10 += var7;
            var9 += var10;
            var3 += var8;
            var9 ^= var10 << 8;
            var4 += var9;
            var10 += var3;
            var10 ^= var3 >>> 9;
            var5 += var10;
            var3 += var4;
            this.anIntArray971[var2] = var3;
            this.anIntArray971[1 + var2] = var4;
            this.anIntArray971[var2 - -2] = var5;
            this.anIntArray971[3 + var2] = var6;
            this.anIntArray971[4 + var2] = var7;
            this.anIntArray971[5 + var2] = var8;
            this.anIntArray971[var2 + 6] = var9;
            this.anIntArray971[var2 - -7] = var10;
         }

         this.method1229(-1879);
         this.anInt968 = 256;
      } catch (RuntimeException var11) {
         throw Class44.method1067(var11, "ij.E(" + var1 + ')');
      }
   }

   final int nextInt() {
	   if(this.anInt968-- == 0) {
		   this.method1229(-1879);
		   this.anInt968 = 255;
	   }
	   return 0;
	  // return ClientLoader.USEISAAC ? this.anIntArray970[this.anInt968] : 0;
   }

   private final void method1229(int var1) {
      try {
         this.anInt967 += ++this.anInt966;
         int var2 = 0;
         if(var1 != -1879) {
            this.anInt968 = -98;
         }

         while(-257 < ~var2) {
            int var3 = this.anIntArray971[var2];
            if((2 & var2) != 0) {
               if(~(var2 & 1) != -1) {
                  this.anInt972 ^= this.anInt972 >>> 16;
               } else {
                  this.anInt972 ^= this.anInt972 << 2;
               }
            } else if((var2 & 1) != 0) {
               this.anInt972 ^= this.anInt972 >>> 6;
            } else {
               this.anInt972 ^= this.anInt972 << 13;
            }

            this.anInt972 += this.anIntArray971[128 + var2 & 255];
            int var4;
            this.anIntArray971[var2] = var4 = this.anInt967 + this.anInt972 + this.anIntArray971[ClientScript.method633(var3, 1020) >> 2];
            this.anIntArray970[var2] = this.anInt967 = var3 + this.anIntArray971[ClientScript.method633(261347, var4) >> 8 >> 2];
            ++var2;
         }

      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "ij.A(" + var1 + ')');
      }
   }

   static final void method1230(byte var0) {
      try {
         int var1 = AbstractIndexedSprite.anInt1462;
         int var2 = Class3_Sub13_Sub33.anInt3395;
         int var4 = Class3_Sub28_Sub1.anInt3537;
         int var3 = Class3_Sub28_Sub3.anInt3552;
         if(Class3_Sub13_Sub7.aClass3_Sub28_Sub16_3099 == null || null == Class108.aClass3_Sub28_Sub16_1457) {
            if(Class140_Sub6.cacheIndex8.method2144(Class26.anInt502) && Class140_Sub6.cacheIndex8.method2144(Class99.anInt1400)) {
               Class3_Sub13_Sub7.aClass3_Sub28_Sub16_3099 = AbstractObjectCache.method562(Class140_Sub6.cacheIndex8, 0, Class26.anInt502, (byte)39);
               Class108.aClass3_Sub28_Sub16_1457 = AbstractObjectCache.method562(Class140_Sub6.cacheIndex8, 0, Class99.anInt1400, (byte)39);
               if(HDToolkit.openGLEnabled) {
                  if(Class3_Sub13_Sub7.aClass3_Sub28_Sub16_3099 instanceof LDTransparentSprite) {
                     Class3_Sub13_Sub7.aClass3_Sub28_Sub16_3099 = new Class3_Sub28_Sub16_Sub1_Sub1((LDSprite)Class3_Sub13_Sub7.aClass3_Sub28_Sub16_3099);
                  } else {
                     Class3_Sub13_Sub7.aClass3_Sub28_Sub16_3099 = new HDSprite((LDSprite)Class3_Sub13_Sub7.aClass3_Sub28_Sub16_3099);
                  }

                  if(Class108.aClass3_Sub28_Sub16_1457 instanceof LDTransparentSprite) {
                     Class108.aClass3_Sub28_Sub16_1457 = new Class3_Sub28_Sub16_Sub1_Sub1((LDSprite)Class108.aClass3_Sub28_Sub16_1457);
                  } else {
                     Class108.aClass3_Sub28_Sub16_1457 = new HDSprite((LDSprite)Class108.aClass3_Sub28_Sub16_1457);
                  }
               }
            } else if(HDToolkit.openGLEnabled) {
               GraphicsHD.fillRectAlpha(var1, var2, var3, 20, InterfaceChangeNode.anInt3600, -Class62.anInt963 + 256);
            } else {
               GraphicsLD.fillRectAlpha(var1, var2, var3, 20, InterfaceChangeNode.anInt3600, -Class62.anInt963 + 256);
            }
         }

         int var5;
         int var6;
         if(Class3_Sub13_Sub7.aClass3_Sub28_Sub16_3099 != null && Class108.aClass3_Sub28_Sub16_1457 != null) {
            var5 = var3 / Class3_Sub13_Sub7.aClass3_Sub28_Sub16_3099.width;

            for(var6 = 0; ~var5 < ~var6; ++var6) {
               Class3_Sub13_Sub7.aClass3_Sub28_Sub16_3099.method643(var6 * Class3_Sub13_Sub7.aClass3_Sub28_Sub16_3099.width + var1, var2);
            }

            Class108.aClass3_Sub28_Sub16_1457.method643(var1, var2);
            Class108.aClass3_Sub28_Sub16_1457.drawSprite(-Class108.aClass3_Sub28_Sub16_1457.width + (var1 - -var3), var2);
         }

         client.getBoldFont().method681(Class75_Sub4.aClass94_2667, var1 - -3, 14 + var2, Class3_Sub13_Sub28.anInt3351, -1);
         if(HDToolkit.openGLEnabled) {
            GraphicsHD.fillRectAlpha(var1, 20 + var2, var3, var4 - 20, InterfaceChangeNode.anInt3600, -Class62.anInt963 + 256);
         } else {
            GraphicsLD.fillRectAlpha(var1, 20 + var2, var3, -20 + var4, InterfaceChangeNode.anInt3600, -Class62.anInt963 + 256);
         }

         var6 = Hashtable.anInt1709;
         var5 = PlainTile.anInt1676;
         if(var0 < 85) {
            aClass94_965 = (jString)null;
         }

         int var7;
         int var8;
         for(var7 = 0; Class3_Sub13_Sub34.anInt3415 > var7; ++var7) {
            var8 = (-var7 + Class3_Sub13_Sub34.anInt3415 - 1) * 15 + var2 + 35;
            if(var1 < var5 && var5 < var1 - -var3 && ~var6 < ~(-13 + var8) && ~var6 > ~(var8 + 3)) {
               if(HDToolkit.openGLEnabled) {
                  GraphicsHD.fillRectAlpha(var1, var8 + -13, var3, 16, MouseHandler.anInt1926, -Class136.anInt1771 + 256);
               } else {
                  GraphicsLD.fillRectAlpha(var1, var8 + -13, var3, 16, MouseHandler.anInt1926, -Class136.anInt1771 + 256);
               }
            }
         }

         if((Class95.aClass3_Sub28_Sub16_1339 == null || Vertex.aClass3_Sub28_Sub16_824 == null || null == Class3_Sub26.aClass3_Sub28_Sub16_2560) && Class140_Sub6.cacheIndex8.method2144(Class46.anInt739) && Class140_Sub6.cacheIndex8.method2144(VarBit.anInt1126) && Class140_Sub6.cacheIndex8.method2144(ItemPile.anInt2937)) {
            Class95.aClass3_Sub28_Sub16_1339 = AbstractObjectCache.method562(Class140_Sub6.cacheIndex8, 0, Class46.anInt739, (byte)39);
            Vertex.aClass3_Sub28_Sub16_824 = AbstractObjectCache.method562(Class140_Sub6.cacheIndex8, 0, VarBit.anInt1126, (byte)39);
            Class3_Sub26.aClass3_Sub28_Sub16_2560 = AbstractObjectCache.method562(Class140_Sub6.cacheIndex8, 0, ItemPile.anInt2937, (byte)39);
            if(HDToolkit.openGLEnabled) {
               if(!(Class95.aClass3_Sub28_Sub16_1339 instanceof LDTransparentSprite)) {
                  Class95.aClass3_Sub28_Sub16_1339 = new HDSprite((LDSprite)Class95.aClass3_Sub28_Sub16_1339);
               } else {
                  Class95.aClass3_Sub28_Sub16_1339 = new Class3_Sub28_Sub16_Sub1_Sub1((LDSprite)Class95.aClass3_Sub28_Sub16_1339);
               }

               if(!(Vertex.aClass3_Sub28_Sub16_824 instanceof LDTransparentSprite)) {
                  Vertex.aClass3_Sub28_Sub16_824 = new HDSprite((LDSprite)Vertex.aClass3_Sub28_Sub16_824);
               } else {
                  Vertex.aClass3_Sub28_Sub16_824 = new Class3_Sub28_Sub16_Sub1_Sub1((LDSprite)Vertex.aClass3_Sub28_Sub16_824);
               }

               if(!(Class3_Sub26.aClass3_Sub28_Sub16_2560 instanceof LDTransparentSprite)) {
                  Class3_Sub26.aClass3_Sub28_Sub16_2560 = new HDSprite((LDSprite)Class3_Sub26.aClass3_Sub28_Sub16_2560);
               } else {
                  Class3_Sub26.aClass3_Sub28_Sub16_2560 = new Class3_Sub28_Sub16_Sub1_Sub1((LDSprite)Class3_Sub26.aClass3_Sub28_Sub16_2560);
               }
            }
         }

         int var9;
         if(Class95.aClass3_Sub28_Sub16_1339 != null && null != Vertex.aClass3_Sub28_Sub16_824 && null != Class3_Sub26.aClass3_Sub28_Sub16_2560) {
            var7 = var3 / Class95.aClass3_Sub28_Sub16_1339.width;

            for(var8 = 0; var7 > var8; ++var8) {
               Class95.aClass3_Sub28_Sub16_1339.method643(var1 + Class95.aClass3_Sub28_Sub16_1339.width * var8, var4 + var2 + -Class95.aClass3_Sub28_Sub16_1339.height);
            }

            var8 = (-20 + var4) / Vertex.aClass3_Sub28_Sub16_824.height;

            for(var9 = 0; var9 < var8; ++var9) {
               Vertex.aClass3_Sub28_Sub16_824.method643(var1, var2 + 20 + var9 * Vertex.aClass3_Sub28_Sub16_824.height);
               Vertex.aClass3_Sub28_Sub16_824.drawSprite(var1 - (-var3 - -Vertex.aClass3_Sub28_Sub16_824.width), var2 + 20 + var9 * Vertex.aClass3_Sub28_Sub16_824.height);
            }

            Class3_Sub26.aClass3_Sub28_Sub16_2560.method643(var1, var4 + (var2 - Class3_Sub26.aClass3_Sub28_Sub16_2560.height));
            Class3_Sub26.aClass3_Sub28_Sub16_2560.drawSprite(var1 + var3 - Class3_Sub26.aClass3_Sub28_Sub16_2560.width, var2 - -var4 + -Class3_Sub26.aClass3_Sub28_Sub16_2560.height);
         }

         for(var7 = 0; var7 < Class3_Sub13_Sub34.anInt3415; ++var7) {
            var8 = 15 * (Class3_Sub13_Sub34.anInt3415 - 1 + -var7) + var2 + 35;
            var9 = Class3_Sub13_Sub28.anInt3351;
            if(var1 < var5 && var3 + var1 > var5 && ~(var8 - 13) > ~var6 && ~var6 > ~(var8 - -3)) {
               var9 = Class154.anInt1957;
            }

            client.getBoldFont().method681(Buffer.method802(var7, true), 3 + var1, var8, var9, 0);
         }

         LookupTable.method1282(AbstractIndexedSprite.anInt1462, Class3_Sub13_Sub33.anInt3395, Class3_Sub28_Sub1.anInt3537, Class3_Sub28_Sub3.anInt3552);
      } catch (RuntimeException var10) {
         throw Class44.method1067(var10, "ij.F(" + var0 + ')');
      }
   }

   public static void method1231(int var0) {
      try {
         aClass94_965 = null;
         if(var0 <= 116) {
            method1230((byte)-73);
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ij.D(" + var0 + ')');
      }
   }

   static final int method1232(Npc var0, int var1) {
      try {
         if(var1 != -1) {
            return 103;
         } else {
            NpcDefinition var2 = var0.aClass90_3976;
            if(null != var2.anIntArray1292) {
               var2 = var2.method1471((byte)-108);
               if(var2 == null) {
                  return -1;
               }
            }

            int var3 = var2.anInt1293;
            if(var0.idleAnimation == var0.currentMoveAnimation) {
               var3 = var2.anInt1262;
            //} else if(~var0.currentMoveAnimation != ~var0.runAnimation && var4.anInt386 != var0.currentMoveAnimation && var0.currentMoveAnimation != var4.anInt375 && var0.currentMoveAnimation != var4.anInt373) {
             //  if(~var4.anInt398 == ~var0.currentMoveAnimation || var0.currentMoveAnimation == var4.anInt372 || ~var0.currentMoveAnimation == ~var4.anInt379 || ~var0.currentMoveAnimation == ~var4.anInt406) {
            ///      var3 = var2.anInt1290;
            //   }//TODO FIXME finish
            } else {
               var3 = var2.anInt1276;
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "ij.B(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   private IsaacCipher() {}

   IsaacCipher(int[] var1) {
      try {
         this.anIntArray970 = new int[256];
         this.anIntArray971 = new int[256];

         for(int var2 = 0; ~var2 > ~var1.length; ++var2) {
            this.anIntArray970[var2] = var1[var2];
         }

         this.method1227(true);
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "ij.<init>(" + (var1 != null?"{...}":"null") + ')');
      }
   }

}
