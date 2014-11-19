
final class CursorType {

   int anInt879;
   int anInt881;
   static int[] anIntArray882 = new int[200];
   private int graphic;


   final LDSprite getCursor() {
	   LDSprite var2 = (LDSprite)Class163_Sub1.cursorCache.get((long)this.graphic);
	   if(null != var2) {
		   return var2;
	   } else {
		   var2 = AbstractObjectCache.method562(AnimationDefinition.aClass153_1852, 0, this.graphic, (byte)39);
		   if(var2 != null) {
			   Class163_Sub1.cursorCache.put(var2, (long)this.graphic);
		   }

		   return var2;
	   }
   }

   static final void method1180(byte var0, Entity var1) {
      try {
         var1.currentMoveAnimation = var1.idleAnimation;
         if(~var1.walkQueueLocationIndex != -1) {
            if(~var1.currentAnimationId != 0 && 0 == var1.animationDelay) {
               AnimationDefinition var3 = AnimationDefinition.list(var1.currentAnimationId, false);
               if(var1.anInt2811 > 0 && var3.anInt1866 == 0) {
                  ++var1.anInt2824;
                  return;
               }
               if(var1.anInt2811 <= 0 && 0 == var3.anInt1850) {
                  ++var1.anInt2824;
                  return;
               }
            }

            int var18 = var1.anInt2819;
            int var4 = var1.anInt2829;
            int var5 = var1.anIntArray2767[-1 + var1.walkQueueLocationIndex] * 128 - -(var1.getSize() * 64);
            int var6 = 128 * var1.anIntArray2755[-1 + var1.walkQueueLocationIndex] - -(var1.getSize() * 64);
            if(-257 > ~(var5 + -var18) || -var18 + var5 < -256 || ~(var6 - var4) < -257 || -256 > var6 - var4) {
               var1.anInt2819 = var5;
               var1.anInt2829 = var6;
               return;
            }

            if(var5 <= var18) {
               if(var18 <= var5) {
                  if(var6 <= var4) {
                     if(~var4 < ~var6) {
                        var1.turnDirection = 0;
                     }
                  } else {
                     var1.turnDirection = 1024;
                  }
               } else if(var6 > var4) {
                  var1.turnDirection = 768;
               } else if(var6 < var4) {
                  var1.turnDirection = 256;
               } else {
                  var1.turnDirection = 512;
               }
            } else if(var6 > var4) {
               var1.turnDirection = 1280;
            } else if(var4 > var6) {
               var1.turnDirection = 1792;
            } else {
               var1.turnDirection = 1536;
            }

            int var7 = 2047 & -var1.directionDegrees + var1.turnDirection;
            int anim = var1.turn180Animation;
            if(1024 < var7) {
               var7 -= 2048;
            }//this my bbc :)

            boolean var10 = true;
            if(var7 >= -256 && var7 <= 256) {
               anim = var1.walkAnimation;
            } else if(-257 >= ~var7 && 768 > var7) {
               anim = var1.turn90CCAnimation;
            } else if(767 >= ~var7 && -256 >= var7) {
               anim = var1.turn90CWAnimation;
            }

            int steps = 4;
            if(~anim == 0) {
               anim = var1.walkAnimation;
            }

            var1.currentMoveAnimation = anim;
            if(var1 instanceof Npc) {
               var10 = ((Npc)var1).aClass90_3976.aBoolean1255;
            }

            if(var10) {
               if(~var1.directionDegrees != ~var1.turnDirection && 0 == ~var1.anInt2772 && ~var1.anInt2779 != -1) {
                  steps = 2;
               }

               if(2 < var1.walkQueueLocationIndex) {
                  steps = 6;
               }

               if(3 < var1.walkQueueLocationIndex) {
                  steps = 8;
               }

               if(-1 > ~var1.anInt2824 && ~var1.walkQueueLocationIndex < -2) {
                  steps = 8;
                  --var1.anInt2824;
               }
            } else {
               if(1 < var1.walkQueueLocationIndex) {
                  steps = 6;
               }

               if(~var1.walkQueueLocationIndex < -3) {
                  steps = 8;
               }

               if(-1 > ~var1.anInt2824 && var1.walkQueueLocationIndex > 1) {
                  --var1.anInt2824;
                  steps = 8;
               }
            }

            if(2 != var1.aByteArray2795[var1.walkQueueLocationIndex - 1]) {
               if(-1 == ~var1.aByteArray2795[-1 + var1.walkQueueLocationIndex]) {
                  steps >>= 1;
               }
            } else {
               steps <<= 1;
            }
            
            if(8 <= steps && var1.currentMoveAnimation == var1.walkAnimation && -1 != var1.runAnimation) {
            	var1.currentMoveAnimation = var1.runAnimation;
            }

            /*if(8 <= steps && -1 != var2.runAnimation) {
               if(~var2.turn180Animation == ~var1.currentMoveAnimation && -1 != var2.anInt386) {
                  var1.currentMoveAnimation = var2.anInt386;
               } else if(var1.currentMoveAnimation == var2.turn90CWAnimation && ~var2.anInt373 != 0) {
                  var1.currentMoveAnimation = var2.anInt373;
               } else if(~var1.currentMoveAnimation == ~var2.turn90CCAnimation && ~var2.anInt375 != 0) {
                  var1.currentMoveAnimation = var2.anInt375;
               } else {
                  var1.currentMoveAnimation = var2.runAnimation;
               }
            } else if(var2.anInt398 != -1 && ~var11 == -1) {
               if(~var2.turn180Animation == ~var1.currentMoveAnimation && ~var2.anInt372 != 0) {
                  var1.currentMoveAnimation = var2.anInt372;
               } else if(~var2.turn90CWAnimation == ~var1.currentMoveAnimation && -1 != var2.anInt406) {
                  var1.currentMoveAnimation = var2.anInt406;
               } else if(var2.turn90CCAnimation == var1.currentMoveAnimation && -1 != var2.anInt379) {
                  var1.currentMoveAnimation = var2.anInt379;
               } else {
                  var1.currentMoveAnimation = var2.anInt398;
               }
            }*/

            if(~var18 > ~var5) {
               var1.anInt2819 += steps;
               if(~var5 > ~var1.anInt2819) {
                  var1.anInt2819 = var5;
               }
            } else if(var18 > var5) {
               var1.anInt2819 -= steps;
               if(~var5 < ~var1.anInt2819) {
                  var1.anInt2819 = var5;
               }
            }

            if(var4 >= var6) {
               if(var6 < var4) {
                  var1.anInt2829 -= steps;
                  if(var6 > var1.anInt2829) {
                     var1.anInt2829 = var6;
                  }
               }
            } else {
               var1.anInt2829 += steps;
               if(~var1.anInt2829 < ~var6) {
                  var1.anInt2829 = var6;
               }
            }

            if(~var1.anInt2819 == ~var5 && var6 == var1.anInt2829) {
               --var1.walkQueueLocationIndex;
               if(0 < var1.anInt2811) {
                  --var1.anInt2811;
               }
            }
         } else {
            var1.anInt2824 = 0;
         }

      } catch (RuntimeException var17) {
         throw Class44.method1067(var17, "ia.C(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

   public static void method1181(byte var0) {
      try {
         anIntArray882 = null;
         if(var0 != -118) {
            anIntArray882 = (int[])null;
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ia.E(" + var0 + ')');
      }
   }

   final void method1182(Buffer var1, int var2, byte var3) {
      try {
         if(var3 < 75) {
            this.method1182((Buffer)null, -111, (byte)47);
         }

         while(true) {
            int var4 = var1.getUByte();
            if(-1 == ~var4) {
               return;
            }

            this.method1183(-18426, var2, var4, var1);
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "ia.G(" + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   private final void method1183(int var1, int var2, int var3, Buffer var4) {
	   if(var3 == 1) {
		   this.graphic = var4.getUShort();
	   }
	   if(var3 == 2) {
		   this.anInt881 = var4.getUByte();
		   this.anInt879 = var4.getUByte();
	   }
   }

   static final CursorType list(int id) {
	   CursorType var2 = (CursorType)FileSystem.aClass93_684.get((long)id);
	   if(var2 != null) {
		   return var2;
	   } else {
		   byte[] var3 = Class3_Sub13_Sub19.aClass153_3227.getFile(33, id);

		   var2 = new CursorType();
		   if(var3 != null) {
			   var2.method1182(new Buffer(var3), id, (byte)85);
		   }

		   FileSystem.aClass93_684.put(var2, (long)id);
		   return var2;
	   }
   }

static final int method1184(int var0, byte var1) {
      try {
         int var2 = 91 / ((var1 - 28) / 39);
         int var3 = var0 & 63;
         int var4 = (var0 & 217) >> 6;
         if(~var3 != -19) {
            if(-20 == ~var3 || ~var3 == -22) {
               if(var4 == 0) {
                  return 16;
               }

               if(1 == var4) {
                  return 32;
               }

               if(var4 == 2) {
                  return 64;
               }

               if(-4 == ~var4) {
                  return 128;
               }
            }
         } else {
            if(0 == var4) {
               return 1;
            }

            if(-2 == ~var4) {
               return 2;
            }

            if(-3 == ~var4) {
               return 4;
            }

            if(3 == var4) {
               return 8;
            }
         }

         return 0;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "ia.A(" + var0 + ',' + var1 + ')');
      }
   }

   static final int method1185() {
	   return 1;
   }

}
