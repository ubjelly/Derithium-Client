
final class ItemPile extends SceneGraphNode {

   static jString aClass94_2928 = jString.createJString("null");
   static int[] intStack = new int[1000];
   int amount;
   static int[] spriteWidths;
   private int anInt2932 = -32768;
   static int[] anIntArray2933 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
   static int canvasHei;
   static jString[] aClass94Array2935 = new jString[500];
   int id;
   static int anInt2937;
   static int renderPitch2;
   static js5 aClass153_2939;


   static final boolean method2029(byte var0, js5 var1, int var2) {
      try {
         if(var0 > -116) {
            return false;
         } else {
            byte[] var3 = var1.method2138(var2);
            if(null != var3) {
               Class45.decodeSprites(var3);
               return true;
            } else {
               return false;
            }
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "uj.B(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   public static void method2030(byte var0) {
      try {
    	  intStack = null;
         if(var0 < 82) {
            method2031((byte)-61, false, -20, 24, (GroundTile[][][])((GroundTile[][][])null), 124);
         }

         spriteWidths = null;
         anIntArray2933 = null;
         aClass94Array2935 = null;
         aClass94_2928 = null;
         aClass153_2939 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "uj.C(" + var0 + ')');
      }
   }

   static final boolean method2031(byte var0, boolean var1, int var2, int var3, GroundTile[][][] var4, int var5) {
      try {
         byte var6 = !var1?(byte)(255 & VarBit.anInt1127):1;
         if(~var6 == ~AbstractGraphicsBuffer.aByteArrayArrayArray2008[Class26.plane][var2][var3]) {
            return false;
         } else if(-1 == ~(Class9.aByteArrayArrayArray113[Class26.plane][var2][var3] & 4)) {
            return false;
         } else {
            int var8 = 0;
            byte var7 = 0;
            Class3_Sub13_Sub38.anIntArray3456[var7] = var2;
            if(var0 >= -9) {
               method2031((byte)-29, false, 59, 52, (GroundTile[][][])((GroundTile[][][])null), 75);
            }

            int var23 = var7 + 1;
            Class45.anIntArray729[var7] = var3;
            AbstractGraphicsBuffer.aByteArrayArrayArray2008[Class26.plane][var2][var3] = var6;

            while(~var8 != ~var23) {
               int var10 = (16740943 & Class3_Sub13_Sub38.anIntArray3456[var8]) >> 16;
               int var11 = 255 & Class3_Sub13_Sub38.anIntArray3456[var8] >> 24;
               int var9 = Class3_Sub13_Sub38.anIntArray3456[var8] & '\uffff';
               int var13 = (Class45.anIntArray729[var8] & 16721603) >> 16;
               int var12 = Class45.anIntArray729[var8] & '\uffff';
               var8 = 4095 & 1 + var8;
               boolean var14 = false;
               boolean var15 = false;
               if(0 == (Class9.aByteArrayArrayArray113[Class26.plane][var9][var12] & 4)) {
                  var14 = true;
               }

               int var17;
               int var16;
               label257:
               for(var16 = 1 + Class26.plane; 3 >= var16; ++var16) {
                  if(-1 == ~(Class9.aByteArrayArrayArray113[var16][var9][var12] & 8)) {
                     int var18;
                     int var20;
                     if(var14 && var4[var16][var9][var12] != null) {
                        if(null != var4[var16][var9][var12].aClass70_2234) {
                           var17 = CursorType.method1184(var10, (byte)82);
                           if(~var4[var16][var9][var12].aClass70_2234.anInt1055 == ~var17 || var4[var16][var9][var12].aClass70_2234.anInt1059 == var17) {
                              continue;
                           }

                           if(0 != var11) {
                              var18 = CursorType.method1184(var11, (byte)-93);
                              if(var18 == var4[var16][var9][var12].aClass70_2234.anInt1055 || var4[var16][var9][var12].aClass70_2234.anInt1059 == var18) {
                                 continue;
                              }
                           }

                           if(var13 != 0) {
                              var18 = CursorType.method1184(var13, (byte)99);
                              if(var18 == var4[var16][var9][var12].aClass70_2234.anInt1055 || ~var18 == ~var4[var16][var9][var12].aClass70_2234.anInt1059) {
                                 continue;
                              }
                           }
                        }

                        if(var4[var16][var9][var12].aClass25Array2221 != null) {
                           for(var17 = 0; ~var4[var16][var9][var12].anInt2223 < ~var17; ++var17) {
                              var18 = (int)(63L & var4[var16][var9][var12].aClass25Array2221[var17].aLong498 >> 14);
                              if(-22 == ~var18) {
                                 var18 = 19;
                              }

                              int var19 = (int)(var4[var16][var9][var12].aClass25Array2221[var17].aLong498 >> 20 & 3L);
                              var20 = var18 | var19 << 6;
                              if(~var20 == ~var10 || var11 != 0 && var20 == var11 || -1 != ~var13 && var13 == var20) {
                                 continue label257;
                              }
                           }
                        }
                     }

                     var15 = true;
                     GroundTile var24 = var4[var16][var9][var12];
                     if(var24 != null && ~var24.anInt2223 < -1) {
                        for(var18 = 0; ~var24.anInt2223 < ~var18; ++var18) {
                           Class25 var25 = var24.aClass25Array2221[var18];
                           if(~var25.anInt495 != ~var25.anInt483 || ~var25.anInt481 != ~var25.anInt478) {
                              for(var20 = var25.anInt483; ~var25.anInt495 <= ~var20; ++var20) {
                                 for(int var21 = var25.anInt478; ~var21 >= ~var25.anInt481; ++var21) {
                                    AbstractGraphicsBuffer.aByteArrayArrayArray2008[var16][var20][var21] = var6;
                                 }
                              }
                           }
                        }
                     }

                     AbstractGraphicsBuffer.aByteArrayArrayArray2008[var16][var9][var12] = var6;
                  }
               }

               if(var15) {
                  if(Class44.anIntArrayArrayArray723[Class26.plane - -1][var9][var12] > FileSystem.anIntArray686[var5]) {
                     FileSystem.anIntArray686[var5] = Class44.anIntArrayArrayArray723[Class26.plane + 1][var9][var12];
                  }

                  var16 = var9 << 7;
                  if(var16 >= MillisTimer.anIntArray2696[var5]) {
                     if(~Class159.anIntArray2021[var5] > ~var16) {
                        Class159.anIntArray2021[var5] = var16;
                     }
                  } else {
                     MillisTimer.anIntArray2696[var5] = var16;
                  }

                  var17 = var12 << 7;
                  if(~AnimationDefinition.anIntArray1871[var5] < ~var17) {
                     AnimationDefinition.anIntArray1871[var5] = var17;
                  } else if(Player.anIntArray3959[var5] < var17) {
                     Player.anIntArray3959[var5] = var17;
                  }
               }

               if(!var14) {
                  if(-2 >= ~var9 && AbstractGraphicsBuffer.aByteArrayArrayArray2008[Class26.plane][-1 + var9][var12] != var6) {
                     Class3_Sub13_Sub38.anIntArray3456[var23] = Class3_Sub13_Sub29.method308(Class3_Sub13_Sub29.method308(var9 - 1, 1179648), -754974720);
                     Class45.anIntArray729[var23] = Class3_Sub13_Sub29.method308(var12, 1245184);
                     var23 = 1 + var23 & 4095;
                     AbstractGraphicsBuffer.aByteArrayArrayArray2008[Class26.plane][var9 - 1][var12] = var6;
                  }

                  ++var12;
                  if(104 > var12) {
                     if(-1 >= ~(var9 + -1) && ~var6 != ~AbstractGraphicsBuffer.aByteArrayArrayArray2008[Class26.plane][-1 + var9][var12] && ~(Class9.aByteArrayArrayArray113[Class26.plane][var9][var12] & 4) == -1 && ~(Class9.aByteArrayArrayArray113[Class26.plane][-1 + var9][var12 + -1] & 4) == -1) {
                        Class3_Sub13_Sub38.anIntArray3456[var23] = Class3_Sub13_Sub29.method308(1375731712, Class3_Sub13_Sub29.method308(1179648, -1 + var9));
                        Class45.anIntArray729[var23] = Class3_Sub13_Sub29.method308(var12, 1245184);
                        AbstractGraphicsBuffer.aByteArrayArrayArray2008[Class26.plane][-1 + var9][var12] = var6;
                        var23 = 1 + var23 & 4095;
                     }

                     if(var6 != AbstractGraphicsBuffer.aByteArrayArrayArray2008[Class26.plane][var9][var12]) {
                        Class3_Sub13_Sub38.anIntArray3456[var23] = Class3_Sub13_Sub29.method308(318767104, Class3_Sub13_Sub29.method308(var9, 5373952));
                        Class45.anIntArray729[var23] = Class3_Sub13_Sub29.method308(5439488, var12);
                        var23 = 4095 & 1 + var23;
                        AbstractGraphicsBuffer.aByteArrayArrayArray2008[Class26.plane][var9][var12] = var6;
                     }

                     if(-105 < ~(1 + var9) && AbstractGraphicsBuffer.aByteArrayArrayArray2008[Class26.plane][var9 + 1][var12] != var6 && 0 == (Class9.aByteArrayArrayArray113[Class26.plane][var9][var12] & 4) && ~(Class9.aByteArrayArrayArray113[Class26.plane][1 + var9][var12 - 1] & 4) == -1) {
                        Class3_Sub13_Sub38.anIntArray3456[var23] = Class3_Sub13_Sub29.method308(-1845493760, Class3_Sub13_Sub29.method308(5373952, var9 + 1));
                        Class45.anIntArray729[var23] = Class3_Sub13_Sub29.method308(5439488, var12);
                        AbstractGraphicsBuffer.aByteArrayArrayArray2008[Class26.plane][var9 - -1][var12] = var6;
                        var23 = 4095 & var23 - -1;
                     }
                  }

                  --var12;
                  if(104 > 1 + var9 && var6 != AbstractGraphicsBuffer.aByteArrayArrayArray2008[Class26.plane][var9 - -1][var12]) {
                     Class3_Sub13_Sub38.anIntArray3456[var23] = Class3_Sub13_Sub29.method308(Class3_Sub13_Sub29.method308(1 + var9, 9568256), 1392508928);
                     Class45.anIntArray729[var23] = Class3_Sub13_Sub29.method308(var12, 9633792);
                     AbstractGraphicsBuffer.aByteArrayArrayArray2008[Class26.plane][1 + var9][var12] = var6;
                     var23 = var23 + 1 & 4095;
                  }

                  --var12;
                  if(-1 >= ~var12) {
                     if(0 <= var9 + -1 && AbstractGraphicsBuffer.aByteArrayArrayArray2008[Class26.plane][-1 + var9][var12] != var6 && ~(Class9.aByteArrayArrayArray113[Class26.plane][var9][var12] & 4) == -1 && ~(Class9.aByteArrayArrayArray113[Class26.plane][var9 + -1][1 + var12] & 4) == -1) {
                        Class3_Sub13_Sub38.anIntArray3456[var23] = Class3_Sub13_Sub29.method308(Class3_Sub13_Sub29.method308(-1 + var9, 13762560), 301989888);
                        Class45.anIntArray729[var23] = Class3_Sub13_Sub29.method308(var12, 13828096);
                        AbstractGraphicsBuffer.aByteArrayArrayArray2008[Class26.plane][-1 + var9][var12] = var6;
                        var23 = 4095 & var23 - -1;
                     }

                     if(var6 != AbstractGraphicsBuffer.aByteArrayArrayArray2008[Class26.plane][var9][var12]) {
                        Class3_Sub13_Sub38.anIntArray3456[var23] = Class3_Sub13_Sub29.method308(Class3_Sub13_Sub29.method308(var9, 13762560), -1828716544);
                        Class45.anIntArray729[var23] = Class3_Sub13_Sub29.method308(13828096, var12);
                        var23 = var23 - -1 & 4095;
                        AbstractGraphicsBuffer.aByteArrayArrayArray2008[Class26.plane][var9][var12] = var6;
                     }

                     if(-105 < ~(var9 - -1) && AbstractGraphicsBuffer.aByteArrayArrayArray2008[Class26.plane][var9 + 1][var12] != var6 && ~(4 & Class9.aByteArrayArrayArray113[Class26.plane][var9][var12]) == -1 && ~(Class9.aByteArrayArrayArray113[Class26.plane][1 + var9][1 + var12] & 4) == -1) {
                        Class3_Sub13_Sub38.anIntArray3456[var23] = Class3_Sub13_Sub29.method308(-771751936, Class3_Sub13_Sub29.method308(var9 - -1, 9568256));
                        Class45.anIntArray729[var23] = Class3_Sub13_Sub29.method308(9633792, var12);
                        AbstractGraphicsBuffer.aByteArrayArrayArray2008[Class26.plane][var9 + 1][var12] = var6;
                        var23 = 4095 & 1 + var23;
                     }
                  }
               }
            }

            if(-1000000 != FileSystem.anIntArray686[var5]) {
               FileSystem.anIntArray686[var5] += 10;
               MillisTimer.anIntArray2696[var5] -= 50;
               Class159.anIntArray2021[var5] += 50;
               Player.anIntArray3959[var5] += 50;
               AnimationDefinition.anIntArray1871[var5] -= 50;
            }

            return true;
         }
      } catch (RuntimeException var22) {
         throw Class44.method1067(var22, "uj.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null?"{...}":"null") + ',' + var5 + ')');
      }
   }

   final void method1867(int var1, int var2, int var3, int var4, int var5) {}

   static final int method2032(int var0, int var1) {
      try {
         if(var1 != 5439488) {
            anInt2937 = 102;
         }

         return var0 >>> 10;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "uj.E(" + var0 + ',' + var1 + ')');
      }
   }

   static final jString method2033(Buffer var0, int var1, int var2) {
      try {
         try {
            int var3 = var0.getSmart();
            if(var2 < var3) {
               var3 = var2;
            }

            byte[] var4 = new byte[var3];
            var0.pos += Class3_Sub13_Sub9.aClass36_3112.method1017(0, var3, var4, var1 ^ -1247, var0.buf, var0.pos);
            jString var5 = Class3_Sub13_Sub3.bufferToString(var4, 0, var3);
            return var1 != 1?(jString)null:var5;
         } catch (Exception var6) {
            return Class159.aClass94_2018;
         }
      } catch (RuntimeException var7) {
         throw Class44.method1067(var7, "uj.D(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + var2 + ')');
      }
   }

   final void render(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, int var11, ParticleEngine var12) {
      try {
         AbstractModel var13 = ItemDefinition.method1023(this.id).method1110(124, -1, 0, (AnimationDefinition)null, this.amount, 0);
         if(null != var13) {
            var13.render(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
            this.anInt2932 = var13.method1871();
         }
      } catch (RuntimeException var14) {
         throw Class44.method1067(var14, "uj.IA(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var11 + ',' + (var12 != null?"{...}":"null") + ')');
      }
   }

   final int method1871() {
      try {
         return this.anInt2932;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "uj.MA()");
      }
   }

}
