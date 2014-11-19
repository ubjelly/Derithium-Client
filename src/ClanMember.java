
final class ClanMember extends Node {

   byte aByte2472;
   jString aClass94_2473;
   static js5Worker cacheIndex14;
   //static int anInt2475 = 0;
   jString name;
   static jString aClass94_2477 = jString.createJString("<col=ffffff>");
   int anInt2478;

   static final Class75_Sub2 method384(Buffer var0) {
	   return new Class75_Sub2(var0.getShort(), var0.getShort(), var0.getShort(), var0.getShort(), var0.getMidInt(), var0.getMidInt(), var0.getUByte());
   }

   static final boolean method385(int z) {
         byte offsetX = 0;
         byte offsetY = 0;
         int var5;
         int pixelId;
         if(null == Class27.landscapeAsSprite) {
            if(!HDToolkit.openGLEnabled && null != Class49.aClass3_Sub28_Sub16_812) {
               Class27.landscapeAsSprite = (LDSprite)Class49.aClass3_Sub28_Sub16_812;
            } else {
               Class27.landscapeAsSprite = new LDSprite(512, 512);
            }

            int[] pixels = Class27.landscapeAsSprite.pixels;
            int pixelAmount = pixels.length;

            for(int pixel = 0; pixel < pixelAmount; ++pixel) {
               pixels[pixel] = 1;
            }

            for(int y = offsetY + 1; -1 + -offsetY + 104 > y; ++y) {
               pixelId = 4 * 512 * (offsetY + 103 + -y) + 24628;

               for(int x = 1 + offsetX; x < (-offsetX + 104 + -1); ++x) {
                  if(-1 == ~(Class9.aByteArrayArrayArray113[z][x][y] & 24)) {
                     jSocket.pushMinimapPixels(pixels, pixelId, 512, z, x, y);
                  }

                  if(~z > -4 && 0 != (Class9.aByteArrayArrayArray113[1 + z][x][y] & 8)) {
                     jSocket.pushMinimapPixels(pixels, pixelId, 512, z + 1, x, y);
                  }

                  pixelId += 4;
               }
            }

            MouseHandler.anInt1924 = 0;

            for(int x = 0; 104 > x; ++x) {
               for(int y = 0; 104 > y; ++y) {
                  long var20 = GroundTile.method104(Class26.plane, x + offsetX, y - -offsetY);
                  if(~var20 != -1L) {
                     ObjectDefinition var10 = ObjectDefinition.list((int)(var20 >>> 32) & Integer.MAX_VALUE);
                     int var11 = var10.anInt1482;
                     int var12;
                     if(null != var10.anIntArray1524) {
                        for(var12 = 0; ~var10.anIntArray1524.length < ~var12; ++var12) {
                           if(-1 != var10.anIntArray1524[var12]) {
                              ObjectDefinition var13 = ObjectDefinition.list(var10.anIntArray1524[var12]);
                              if(0 <= var13.anInt1482) {
                                 var11 = var13.anInt1482;
                                 break;
                              }
                           }
                        }
                     }
                     if(~var11 <= -1) {
                        int var21 = offsetY + y;
                        var12 = offsetX + x;
                        if(22 != var11 && var11 != 29 && 34 != var11 && -37 != ~var11 && 46 != var11 && var11 != 47 && var11 != 48) {
                           int[][] var14 = Class86.collisionMap[Class26.plane].collisionFlags;

                           for(int var15 = 0; -11 < ~var15; ++var15) {
                              int var16 = (int)(Math.random() * 4.0D);
                              if(var16 == 0 && var12 > 0 && ~(x - 3) > ~var12 && ~(var14[var12 - 1][var21] & 19661064) == -1) {
                                 --var12;
                              }

                              if(var16 == 1 && -104 < ~var12 && ~(3 + x) < ~var12 && (var14[var12 - -1][var21] & 19661184) == 0) {
                                 ++var12;
                              }

                              if(2 == var16 && var21 > 0 && ~(-3 + y) > ~var21 && 0 == (var14[var12][-1 + var21] & 19661058)) {
                                 --var21;
                              }

                              if(3 == var16 && var21 < 103 && ~var21 > ~(y - -3) && 0 == (19661088 & var14[var12][1 + var21])) {
                                 ++var21;
                              }
                           }
                        }

                        ClientScript.anIntArray3693[MouseHandler.anInt1924] = var10.anInt1527;
                        Class84.anIntArray1163[MouseHandler.anInt1924] = -offsetX + var12;
                        RawObjectCache.anIntArray4050[MouseHandler.anInt1924] = var21 + -offsetY;
                        ++MouseHandler.anInt1924;
                     }
                  }
               }
            }
         }

         Class27.landscapeAsSprite.initDefault();
         int var18 = (238 + (int)(20.0D * Math.random()) - 10 << 8) + (-10 + (int)(Math.random() * 20.0D) + 238 << 16) + (228 - -((int)(20.0D * Math.random())));
         var5 = (int)(Math.random() * 20.0D) + 238 + -10 << 16;

         for(int y = 1; y < 103; ++y) {
            for(int x = 1; x < 103; ++x) {
               if(0 == (Class9.aByteArrayArrayArray113[z][x + offsetX][y + offsetY] & 24) && !jString.method1529(offsetY, x, var18, y, var5, offsetX, z, true)) {
                  if(HDToolkit.openGLEnabled) {
                     GraphicsLD.pixels = null;
                  } else {
                     Class164_Sub1.aClass158_3009.initCanvas();
                  }

               }

               if(3 > z && ~(Class9.aByteArrayArrayArray113[1 + z][x + offsetX][y + offsetY] & 8) != -1 && !jString.method1529(offsetY, x, var18, y, var5, offsetX, 1 + z, true)) {
                  if(!HDToolkit.openGLEnabled) {
                     Class164_Sub1.aClass158_3009.initCanvas();
                  } else {
                     GraphicsLD.pixels = null;
                  }

               }
            }
         }

         if(HDToolkit.openGLEnabled) {
            int[] pixels = Class27.landscapeAsSprite.pixels;
            int pixelAmount = pixels.length;

            for(int pixel = 0; pixelAmount > pixel; ++pixel) {
               if(pixels[pixel] == 0) {
                  pixels[pixel] = 1;
               }
            }

            Class49.aClass3_Sub28_Sub16_812 = new HDSprite(Class27.landscapeAsSprite);
         } else {
            Class49.aClass3_Sub28_Sub16_812 = Class27.landscapeAsSprite;
         }

         if(!HDToolkit.openGLEnabled) {
            Class164_Sub1.aClass158_3009.initCanvas();
         } else {
            GraphicsLD.pixels = null;
         }

         Class27.landscapeAsSprite = null;
         return true;
   }

   static final void method386(int var0, int var1) {
      try {
         OverridedInterface.aClass93_2604.method1522(var0);
         if(var1 <= -109) {
            Class27.aClass93_511.method1522(var0);
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "kl.D(" + var0 + ',' + var1 + ')');
      }
   }

   public static void method387(int var0) {
      try {
         int var1 = 41 % ((var0 - -70) / 32);
         aClass94_2477 = null;
         cacheIndex14 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "kl.A(" + var0 + ')');
      }
   }

}
