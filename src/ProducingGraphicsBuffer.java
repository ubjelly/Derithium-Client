import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

final class ProducingGraphicsBuffer extends AbstractGraphicsBuffer implements ImageProducer, ImageObserver {

   static jString[] aClass94Array2977 = new jString[5];
   private ImageConsumer imageConsumer;
   private ColorModel colorModel;
   static ClickMaskNode aClass3_Sub1_2980 = new ClickMaskNode(0, -1);
   static boolean aBoolean2981 = false;
   static Class93 aClass93_2982 = new Class93(32);


   public final synchronized void addConsumer(ImageConsumer var1) {
	   this.imageConsumer = var1;
	   var1.setDimensions(this.width, this.height);
	   var1.setProperties((Hashtable)null);
	   var1.setColorModel(this.colorModel);
	   var1.setHints(14);
   }

   public static void method2187(int var0) {
      try {
         aClass94Array2977 = null;
         aClass93_2982 = null;
         aClass3_Sub1_2980 = null;
         if(var0 != 27316) {
            aBoolean2981 = true;
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "di.I(" + var0 + ')');
      }
   }

   private final synchronized void setPixels(int x, int y, int w, int h) {
	   if(null != this.imageConsumer) {
		   this.imageConsumer.setPixels(x, y, w, h, this.colorModel, this.pixels, y * this.width + x, this.width);
		   this.imageConsumer.imageComplete(2);
	   }
   }

   public final synchronized void removeConsumer(ImageConsumer var1) {
	   if(this.imageConsumer == var1) {
		   this.imageConsumer = null;
	   }
   }

   final void clip(Graphics graphics, int x, int y, int w, int h) {
	   this.setPixels(x, y, w, h);
	   Shape var7 = graphics.getClip();
	   graphics.clipRect(x, y, w, h);
	   graphics.drawImage(this.image, 0, 0, this);
	   graphics.setClip(var7);
   }

   public final void startProduction(ImageConsumer var1) {
	   this.addConsumer(var1);
   }

   static final void method2189(CollisionMap[] var0, boolean var1) {
         if(!var1) {
            for(int var4 = 0; var4 < 4; ++var4) {
               for(int var5 = 0; var5 < 104; ++var5) {
                  for(int var6 = 0; var6 < 104; ++var6) {
                     if((0x1 & Class9.aByteArrayArrayArray113[var4][var5][var6]) == 1) {
                        int var7 = var4;
                        if((0x2 & Class9.aByteArrayArrayArray113[1][var5][var6]) == 2) {
                           var7 = var4 - 1;
                        }

                        if(var7 >= 0) {
                           var0[var7].method1497(var6, var5);
                        }
                     }
                  }
               }
            }
         }

         byte maxPlane;
         if(!var1) {
            maxPlane = 4;
         } else {
            maxPlane = 1;
         }

         int[][] var34 = new int[104][104];
         int[][] var35 = new int[104][104];

         int var10;
         int var11;
         int var13;
         int var14;
         int var15;
         int var16;
         int var19;
         int var18;
         int var20;
         int var37;
         int var44;
         for(int var8 = 0; maxPlane > var8; ++var8) {
            byte[][] var9 = Class67.aByteArrayArrayArray1014[var8];
            int var21;
            int var23;
            int var22;
            int var24;
            if(HDToolkit.openGLEnabled) {
               if(!DisplayModeInformation.aBoolean1441) {
                  var10 = (int)AtmosphereManager.aFloatArray1312[0];
                  var11 = (int)AtmosphereManager.aFloatArray1312[1];
                  var37 = (int)AtmosphereManager.aFloatArray1312[2];
                  var13 = (int)Math.sqrt((double)(var11 * var11 + (var10 * var10 - -(var37 * var37))));
                  var14 = 1024 * var13 >> 8;

                  for(var15 = 1; -104 < ~var15; ++var15) {
                     for(var16 = 1; var16 < 103; ++var16) {
                        byte var17 = 96;
                        var18 = Class44.anIntArrayArrayArray723[var8][var16 - -1][var15] - Class44.anIntArrayArrayArray723[var8][-1 + var16][var15];
                        var19 = Class44.anIntArrayArrayArray723[var8][var16][var15 + 1] - Class44.anIntArrayArrayArray723[var8][var16][-1 + var15];
                        var20 = (int)Math.sqrt((double)(var18 * var18 + 65536 + var19 * var19));
                        var21 = (var18 << 8) / var20;
                        var24 = (var9[var16][1 + var15] >> 3) + (var9[var16][var15 - 1] >> 2) + ((var9[var16 - 1][var15] >> 2) + (var9[var16 + 1][var15] >> 3) - -(var9[var16][var15] >> 1));
                        var22 = -65536 / var20;
                        var23 = (var19 << 8) / var20;
                        var44 = var17 + (var37 * var23 + (var10 * var21 - -(var22 * var11))) / var14;
                        var35[var16][var15] = var44 + -((int)((float)var24 * 1.7F));
                     }
                  }
               } else {
                  for(var10 = 1; var10 < 103; ++var10) {
                     for(var11 = 1; ~var11 > -104; ++var11) {
                        var13 = (var9[1 + var11][var10] >> 3) + (var9[-1 + var11][var10] >> 2) - -(var9[var11][-1 + var10] >> 2) - -(var9[var11][1 + var10] >> 3) - -(var9[var11][var10] >> 1);
                        byte var12 = 74;
                        var35[var11][var10] = -var13 + var12;
                     }
                  }
               }
            } else {
               var10 = (int)Math.sqrt(5100.0D);
               var11 = 768 * var10 >> 8;

               for(var37 = 1; var37 < 103; ++var37) {
                  for(var13 = 1; 103 > var13; ++var13) {
                     var16 = -Class44.anIntArrayArrayArray723[var8][var13][-1 + var37] + Class44.anIntArrayArrayArray723[var8][var13][var37 + 1];
                     byte var41 = 74;
                     var15 = -Class44.anIntArrayArrayArray723[var8][var13 + -1][var37] + Class44.anIntArrayArrayArray723[var8][var13 - -1][var37];
                     var44 = (int)Math.sqrt((double)(var15 * var15 - -65536 - -(var16 * var16)));
                     var20 = (var16 << 8) / var44;
                     var19 = -65536 / var44;
                     var18 = (var15 << 8) / var44;
                     var21 = (var9[var13][var37] >> 1) + (var9[var13][-1 + var37] >> 2) + (var9[var13 - -1][var37] >> 3) + ((var9[var13 - 1][var37] >> 2) - -(var9[var13][var37 + 1] >> 3));
                     var14 = var41 + (var20 * -50 + var18 * -50 - -(var19 * -10)) / var11;
                     var35[var13][var37] = var14 - var21;
                  }
               }
            }

            for(var10 = 0; 104 > var10; ++var10) {
               AbstractTimer.anIntArray1695[var10] = 0;
               Class80.anIntArray1138[var10] = 0;
               OverridedInterface.anIntArray2606[var10] = 0;
               MouseHandler.anIntArray1920[var10] = 0;
               IntegerNode.anIntArray2469[var10] = 0;
            }

            for(var10 = -5; ~var10 > -105; ++var10) {
               for(var11 = 0; 104 > var11; ++var11) {
                  var37 = var10 - -5;
                  if(var37 < 104) {
                     var13 = 255 & Class3_Sub13_Sub36.aByteArrayArrayArray3430[var8][var37][var11];
                     if(var13 > 0) {
                        OverlayType var39 = OverlayType.list(-1 + var13);
                        AbstractTimer.anIntArray1695[var11] += var39.anInt1408;
                        Class80.anIntArray1138[var11] += var39.anInt1406;
                        OverridedInterface.anIntArray2606[var11] += var39.anInt1417;
                        MouseHandler.anIntArray1920[var11] += var39.anInt1418;
                        ++IntegerNode.anIntArray2469[var11];
                     }
                  }

                  var13 = -5 + var10;
                  if(0 <= var13) {
                     var14 = 255 & Class3_Sub13_Sub36.aByteArrayArrayArray3430[var8][var13][var11];
                     if(var14 > 0) {
                        OverlayType var42 = OverlayType.list(-1 + var14);
                        AbstractTimer.anIntArray1695[var11] -= var42.anInt1408;
                        Class80.anIntArray1138[var11] -= var42.anInt1406;
                        OverridedInterface.anIntArray2606[var11] -= var42.anInt1417;
                        MouseHandler.anIntArray1920[var11] -= var42.anInt1418;
                        --IntegerNode.anIntArray2469[var11];
                     }
                  }
               }

               if(var10 >= 0) {
                  var11 = 0;
                  var13 = 0;
                  var37 = 0;
                  var14 = 0;
                  var15 = 0;

                  for(var16 = -5; var16 < 104; ++var16) {
                     var44 = var16 - -5;
                     if(104 > var44) {
                        var37 += Class80.anIntArray1138[var44];
                        var15 += IntegerNode.anIntArray2469[var44];
                        var11 += AbstractTimer.anIntArray1695[var44];
                        var14 += MouseHandler.anIntArray1920[var44];
                        var13 += OverridedInterface.anIntArray2606[var44];
                     }

                     var18 = var16 + -5;
                     if(~var18 <= -1) {
                        var37 -= Class80.anIntArray1138[var18];
                        var14 -= MouseHandler.anIntArray1920[var18];
                        var11 -= AbstractTimer.anIntArray1695[var18];
                        var15 -= IntegerNode.anIntArray2469[var18];
                        var13 -= OverridedInterface.anIntArray2606[var18];
                     }

                     if(0 <= var16 && -1 > ~var15) {
                        var34[var10][var16] = Class3_Sub8.method129(var13 / var15, 2, var37 / var15, 256 * var11 / var14);
                     }
                  }
               }
            }

            for(var10 = 1; ~var10 > -104; ++var10) {
               label754:
               for(var11 = 1; ~var11 > -104; ++var11) {
                  if(var1 || Npc.visibleLevels() || ~(2 & Class9.aByteArrayArrayArray113[0][var10][var11]) != -1 || ~(16 & Class9.aByteArrayArrayArray113[var8][var10][var11]) == -1 && PacketParser.method823(var11, var10, var8) == Class140_Sub3.anInt2745) {
                     if(~Class85.anInt1174 < ~var8) {
                        Class85.anInt1174 = var8;
                     }

                     var37 = 255 & Class3_Sub13_Sub36.aByteArrayArrayArray3430[var8][var10][var11];
                     var13 = Class139.aByteArrayArrayArray1828[var8][var10][var11] & 255;
                     if(0 < var37 || -1 > ~var13) {
                        var15 = Class44.anIntArrayArrayArray723[var8][var10 + 1][var11];
                        var14 = Class44.anIntArrayArrayArray723[var8][var10][var11];
                        var44 = Class44.anIntArrayArrayArray723[var8][var10][1 + var11];
                        var16 = Class44.anIntArrayArrayArray723[var8][1 + var10][var11 + 1];
                        if(0 < var8) {
                           boolean var47 = true;
                           if(var37 == 0 && Class93.aByteArrayArrayArray1328[var8][var10][var11] != 0) {
                              var47 = false;
                           }

                           if(-1 > ~var13 && !UnderlayType.list(var13 + -1).aBoolean2102) {
                              var47 = false;
                           }

                           if(var47 && var14 == var15 && ~var14 == ~var16 && ~var44 == ~var14) {
                              Class38_Sub1.anIntArrayArrayArray2609[var8][var10][var11] = Class3_Sub13_Sub29.method308(Class38_Sub1.anIntArrayArrayArray2609[var8][var10][var11], 4);
                           }
                        }

                        if(-1 <= ~var37) {
                           var18 = -1;
                           var19 = 0;
                        } else {
                           var18 = var34[var10][var11];
                           var20 = (var18 & 127);
                           if(-1 >= ~var20) {
                              if(-128 > ~var20) {
                                 var20 = 127;
                              }
                           } else {
                              var20 = 0;
                           }

                           var21 = (896 & var18) + (var18 & '\ufc00') + var20;
                           var19 = Rasterizer.anIntArray834[Class47.method1100(96, var21)];
                        }

                        var20 = var35[var10][var11];
                        var23 = var35[var10][var11 + 1];
                        var21 = var35[1 + var10][var11];
                        var22 = var35[var10 - -1][var11 - -1];
                        if(var13 != 0) {
                           var24 = 1 + Class93.aByteArrayArrayArray1328[var8][var10][var11];
                           byte var25 = PacketParser.aByteArrayArrayArray81[var8][var10][var11];
                           UnderlayType var26 = UnderlayType.list(var13 + -1);
                           int var27;
                           int var29;
                           int var28;
                           if(HDToolkit.openGLEnabled && !var1 && null != Class3_Sub13_Sub9.anIntArrayArray3115 && 0 == var8) {
                              if(-1 != var26.anInt2095 && Rasterizer.anInterface2_838.method18(var26.anInt2095, 255) == 4) {
                                 Class3_Sub13_Sub9.anIntArrayArray3115[var10][var11] = (var26.anInt2101 << 24) + var26.anInt2094;
                              } else {
                                 label722:
                                 for(var27 = var10 + -1; ~var27 >= ~(1 + var10); ++var27) {
                                    for(var28 = var11 + -1; ~var28 >= ~(1 + var11); ++var28) {
                                       if((~var10 != ~var27 || ~var28 != ~var11) && -1 >= ~var27 && var27 < 104 && var28 >= 0 && -105 < ~var28) {
                                          var29 = Class139.aByteArrayArrayArray1828[var8][var27][var28] & 255;
                                          if(-1 != ~var29) {
                                             UnderlayType var30 = UnderlayType.list(-1 + var29);
                                             if(0 != ~var30.anInt2095 && -5 == ~Rasterizer.anInterface2_838.method18(var30.anInt2095, 255)) {
                                                Class3_Sub13_Sub9.anIntArrayArray3115[var10][var11] = var30.anInt2094 + (var30.anInt2101 << 24);
                                                break label722;
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }

                           var27 = var26.anInt2095;
                           if(0 <= var27 && !Rasterizer.anInterface2_838.method17(var27)) {
                              var27 = -1;
                           }

                           int var31;
                           int var55;
                           if(var27 < 0) {
                              if(var26.anInt2103 != -1) {
                                 var28 = var26.anInt2103;
                                 var55 = (var28 & 127);
                                 if(-1 >= ~var55) {
                                    if(~var55 < -128) {
                                       var55 = 127;
                                    }
                                 } else {
                                    var55 = 0;
                                 }

                                 var31 = (var28 & 896) + (('\ufc00' & var28) - -var55);
                                 var29 = Rasterizer.anIntArray834[StringNode.method729(var31, 96)];
                              } else {
                                 var28 = -2;
                                 var29 = 0;
                              }
                           } else {
                              var28 = -1;
                              var29 = Rasterizer.anIntArray834[StringNode.method729(Rasterizer.anInterface2_838.method15(var27), 96)];
                           }

                           if(~var26.anInt2098 <= -1) {
                              var55 = var26.anInt2098;
                              var31 = (var55 & 127);
                              if(-1 >= ~var31) {
                                 if(127 < var31) {
                                    var31 = 127;
                                 }
                              } else {
                                 var31 = 0;
                              }

                              int var32 = (896 & var55) + (('\ufc00' & var55) - -var31);
                              var29 = Rasterizer.anIntArray834[StringNode.method729(var32, 96)];
                           }

                           Class104.method1629(var8, var10, var11, var24, var25, var27, var14, var15, var16, var44, Class47.method1100(var20, var18), Class47.method1100(var21, var18), Class47.method1100(var22, var18), Class47.method1100(var23, var18), StringNode.method729(var28, var20), StringNode.method729(var28, var21), StringNode.method729(var28, var22), StringNode.method729(var28, var23), var19, var29);
                           if(HDToolkit.openGLEnabled && -1 > ~var8) {
                              Class141.method2037(var24, var25, 1 == ~var28 || !var26.aBoolean2093, -1 == var18 || !OverlayType.list(-1 + var37).aBoolean1411, var10, var11, -Class44.anIntArrayArrayArray723[0][var10][var11] + var14, var15 - Class44.anIntArrayArrayArray723[0][1 + var10][var11], -Class44.anIntArrayArrayArray723[0][1 + var10][var11 + 1] + var16, -Class44.anIntArrayArrayArray723[0][var10][1 + var11] + var44);
                           }
                        } else {
                           Class104.method1629(var8, var10, var11, 0, 0, -1, var14, var15, var16, var44, Class47.method1100(var20, var18), Class47.method1100(var21, var18), Class47.method1100(var22, var18), Class47.method1100(var23, var18), 0, 0, 0, 0, var19, 0);
                           if(HDToolkit.openGLEnabled && var8 > 0 && 0 != ~var18 && OverlayType.list(-1 + var37).aBoolean1411) {
                              Class141.method2037(0, 0, true, false, var10, var11, var14 - Class44.anIntArrayArrayArray723[0][var10][var11], -Class44.anIntArrayArrayArray723[0][1 + var10][var11] + var15, var16 - Class44.anIntArrayArrayArray723[0][1 + var10][1 + var11], var44 - Class44.anIntArrayArrayArray723[0][var10][1 + var11]);
                           }

                           if(HDToolkit.openGLEnabled && !var1 && Class3_Sub13_Sub9.anIntArrayArray3115 != null && 0 == var8) {
                              for(var24 = var10 + -1; ~var24 >= ~(var10 - -1); ++var24) {
                                 for(int var52 = -1 + var11; ~(1 + var11) <= ~var52; ++var52) {
                                    if((var24 != var10 || var11 != var52) && var24 >= 0 && var24 < 104 && 0 <= var52 && -105 < ~var52) {
                                       int var54 = Class139.aByteArrayArrayArray1828[var8][var24][var52] & 255;
                                       if(var54 != 0) {
                                          UnderlayType var53 = UnderlayType.list(-1 + var54);
                                          if(~var53.anInt2095 != 0 && 4 == Rasterizer.anInterface2_838.method18(var53.anInt2095, 255)) {
                                             Class3_Sub13_Sub9.anIntArrayArray3115[var10][var11] = var53.anInt2094 + (var53.anInt2101 << 24);
                                             continue label754;
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            if(HDToolkit.openGLEnabled) {
               float[][] var38 = new float[105][105];
               int[][] var45 = Class44.anIntArrayArrayArray723[var8];
               float[][] var40 = new float[105][105];
               float[][] var43 = new float[105][105];

               for(var14 = 1; ~var14 >= -104; ++var14) {
                  for(var15 = 1; -104 <= ~var15; ++var15) {
                     var44 = var45[var15][var14 - -1] + -var45[var15][-1 + var14];
                     var16 = -var45[var15 - 1][var14] + var45[var15 + 1][var14];
                     float var51 = (float)Math.sqrt((double)(var16 * var16 - -65536 - -(var44 * var44)));
                     var38[var15][var14] = (float)var16 / var51;
                     var40[var15][var14] = -256.0F / var51;
                     var43[var15][var14] = (float)var44 / var51;
                  }
               }

               Class3_Sub11[] var50;
               if(!var1) {
                  var50 = Class3_Sub13_Sub27.method298(Class9.aByteArrayArrayArray113, Class93.aByteArrayArrayArray1328[var8], Class3_Sub13_Sub36.aByteArrayArrayArray3430[var8], var35, var40, (int[][])null, Class139.aByteArrayArrayArray1828[var8], PacketParser.aByteArrayArrayArray81[var8], var38, var8, var43, var34, Class44.anIntArrayArrayArray723[var8], (int[][])null, 4096);
                  Class3_Sub11[] var46 = Class1.method70(var40, var38, Class44.anIntArrayArrayArray723[var8], var8, var43, PacketParser.aByteArrayArrayArray81[var8], var35, 0, Class93.aByteArrayArrayArray1328[var8], Class3_Sub13_Sub36.aByteArrayArrayArray3430[var8], Class139.aByteArrayArrayArray1828[var8], Class9.aByteArrayArrayArray113);
                  Class3_Sub11[] var49 = new Class3_Sub11[var50.length - -var46.length];

                  for(var44 = 0; ~var50.length < ~var44; ++var44) {
                     var49[var44] = var50[var44];
                  }

                  for(var44 = 0; ~var46.length < ~var44; ++var44) {
                     var49[var50.length + var44] = var46[var44];
                  }

                  Deque.method1213(var8, var49);
                  AbstractTimer.method1769(var43, Class3_Sub13_Sub36.aByteArrayArrayArray3430[var8], PacketParser.aByteArrayArrayArray81[var8], LightManager.lights, var8, LightManager.lightsPos, var40, Class93.aByteArrayArrayArray1328[var8], Class139.aByteArrayArrayArray1828[var8], Class44.anIntArrayArrayArray723[var8], -8771, var38);
               } else {
                  var50 = Class3_Sub13_Sub27.method298(Class9.aByteArrayArrayArray113, Class93.aByteArrayArrayArray1328[var8], Class3_Sub13_Sub36.aByteArrayArrayArray3430[var8], var35, var40, Class3_Sub13_Sub9.anIntArrayArray3115, Class139.aByteArrayArrayArray1828[var8], PacketParser.aByteArrayArrayArray81[var8], var38, var8, var43, var34, Class44.anIntArrayArrayArray723[var8], Class58.anIntArrayArrayArray914[0], 4096);
                  Deque.method1213(var8, var50);
               }
            }

            Class3_Sub13_Sub36.aByteArrayArrayArray3430[var8] = (byte[][])null;
            Class139.aByteArrayArrayArray1828[var8] = (byte[][])null;
            Class93.aByteArrayArrayArray1328[var8] = (byte[][])null;
            PacketParser.aByteArrayArrayArray81[var8] = (byte[][])null;
            Class67.aByteArrayArrayArray1014[var8] = (byte[][])null;
         }

         Class128.method1764(-50, -10, -50);
         if(!var1) {
            int var36;
            for(int var8 = 0; 104 > var8; ++var8) {
               for(var36 = 0; ~var36 > -105; ++var36) {
                  if((Class9.aByteArrayArrayArray113[1][var8][var36] & 2) == 2) {
                     Class3_Sub28_Sub18.method709(var8, var36);
                  }
               }
            }

            for(int var8 = 0; 4 > var8; ++var8) {
               for(var36 = 0; -105 <= ~var36; ++var36) {
                  for(var10 = 0; ~var10 >= -105; ++var10) {
                     short var48;
                     if(-1 != ~(Class38_Sub1.anIntArrayArrayArray2609[var8][var10][var36] & 1)) {
                        var14 = var8;

                        for(var11 = var36; var11 > 0 && -1 != ~(1 & Class38_Sub1.anIntArrayArrayArray2609[var8][var10][-1 + var11]); --var11) {
                           ;
                        }

                        var13 = var8;

                        for(var37 = var36; ~var37 > -105 && (1 & Class38_Sub1.anIntArrayArrayArray2609[var8][var10][var37 - -1]) != 0; ++var37) {
                           ;
                        }

                        label453:
                        while(var13 > 0) {
                           for(var15 = var11; var15 <= var37; ++var15) {
                              if(-1 == ~(Class38_Sub1.anIntArrayArrayArray2609[var13 + -1][var10][var15] & 1)) {
                                 break label453;
                              }
                           }

                           --var13;
                        }

                        label464:
                        while(~var14 > -4) {
                           for(var15 = var11; ~var37 <= ~var15; ++var15) {
                              if(~(1 & Class38_Sub1.anIntArrayArrayArray2609[var14 + 1][var10][var15]) == -1) {
                                 break label464;
                              }
                           }

                           ++var14;
                        }

                        var15 = (var14 - (-1 + var13)) * (-var11 + (var37 - -1));
                        if(var15 >= 8) {
                           var48 = 240;
                           var44 = -var48 + Class44.anIntArrayArrayArray723[var14][var10][var11];
                           var18 = Class44.anIntArrayArrayArray723[var13][var10][var11];
                           Class167.method2263(1, 128 * var10, 128 * var10, 128 * var11, var37 * 128 + 128, var44, var18);

                           for(var19 = var13; ~var14 <= ~var19; ++var19) {
                              for(var20 = var11; var37 >= var20; ++var20) {
                                 Class38_Sub1.anIntArrayArrayArray2609[var19][var10][var20] = ClientScript.method633(Class38_Sub1.anIntArrayArrayArray2609[var19][var10][var20], -2);
                              }
                           }
                        }
                     }

                     if((2 & Class38_Sub1.anIntArrayArrayArray2609[var8][var10][var36]) != 0) {
                        for(var11 = var10; 0 < var11 && ~(Class38_Sub1.anIntArrayArrayArray2609[var8][-1 + var11][var36] & 2) != -1; --var11) {
                           ;
                        }

                        var14 = var8;
                        var13 = var8;

                        for(var37 = var10; 104 > var37 && (2 & Class38_Sub1.anIntArrayArrayArray2609[var8][var37 - -1][var36]) != 0; ++var37) {
                           ;
                        }

                        label503:
                        while(~var13 < -1) {
                           for(var15 = var11; var15 <= var37; ++var15) {
                              if(0 == (2 & Class38_Sub1.anIntArrayArrayArray2609[-1 + var13][var15][var36])) {
                                 break label503;
                              }
                           }

                           --var13;
                        }

                        label514:
                        while(~var14 > -4) {
                           for(var15 = var11; var15 <= var37; ++var15) {
                              if(~(2 & Class38_Sub1.anIntArrayArrayArray2609[var14 + 1][var15][var36]) == -1) {
                                 break label514;
                              }
                           }

                           ++var14;
                        }

                        var15 = (-var11 + var37 - -1) * (-var13 + var14 - -1);
                        if(8 <= var15) {
                           var48 = 240;
                           var44 = Class44.anIntArrayArrayArray723[var14][var11][var36] - var48;
                           var18 = Class44.anIntArrayArrayArray723[var13][var11][var36];
                           Class167.method2263(2, var11 * 128, 128 * var37 + 128, 128 * var36, var36 * 128, var44, var18);

                           for(var19 = var13; var14 >= var19; ++var19) {
                              for(var20 = var11; var20 <= var37; ++var20) {
                                 Class38_Sub1.anIntArrayArrayArray2609[var19][var20][var36] = ClientScript.method633(Class38_Sub1.anIntArrayArrayArray2609[var19][var20][var36], -3);
                              }
                           }
                        }
                     }

                     if((4 & Class38_Sub1.anIntArrayArrayArray2609[var8][var10][var36]) != 0) {
                        var11 = var10;
                        var37 = var10;

                        for(var13 = var36; 0 < var13 && 0 != (4 & Class38_Sub1.anIntArrayArrayArray2609[var8][var10][-1 + var13]); --var13) {
                           ;
                        }

                        for(var14 = var36; ~var14 > -105 && ~(Class38_Sub1.anIntArrayArrayArray2609[var8][var10][var14 + 1] & 4) != -1; ++var14) {
                           ;
                        }

                        label554:
                        while(~var11 < -1) {
                           for(var15 = var13; ~var15 >= ~var14; ++var15) {
                              if(0 == (Class38_Sub1.anIntArrayArrayArray2609[var8][var11 + -1][var15] & 4)) {
                                 break label554;
                              }
                           }

                           --var11;
                        }

                        label565:
                        while(var37 < 104) {
                           for(var15 = var13; var14 >= var15; ++var15) {
                              if(0 == (4 & Class38_Sub1.anIntArrayArrayArray2609[var8][1 + var37][var15])) {
                                 break label565;
                              }
                           }

                           ++var37;
                        }

                        if(4 <= (1 + -var11 + var37) * (var14 - (var13 - 1))) {
                           var15 = Class44.anIntArrayArrayArray723[var8][var11][var13];
                           Class167.method2263(4, var11 * 128, 128 * var37 - -128, var13 * 128, 128 + 128 * var14, var15, var15);

                           for(var16 = var11; var37 >= var16; ++var16) {
                              for(var44 = var13; var14 >= var44; ++var44) {
                                 Class38_Sub1.anIntArrayArrayArray2609[var8][var16][var44] = ClientScript.method633(Class38_Sub1.anIntArrayArrayArray2609[var8][var16][var44], -5);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
   }

   private final synchronized void setPixels() {
	   if(this.imageConsumer != null) {
		   this.imageConsumer.setPixels(0, 0, this.width, this.height, this.colorModel, this.pixels, 0, this.width);
		   this.imageConsumer.imageComplete(2);
	   }
   }

   public final synchronized boolean isConsumer(ImageConsumer var1) {
	   return this.imageConsumer == var1;
   }

   static final boolean method2191(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11) {
      try {
         int var12;
         int var13;
         for(var12 = 0; -105 < ~var12; ++var12) {
            for(var13 = 0; -105 < ~var13; ++var13) {
               Class84.anIntArrayArray1160[var12][var13] = 0;
               Class97.anIntArrayArray1373[var12][var13] = 99999999;
            }
         }

         var12 = var2;
         Class84.anIntArrayArray1160[var2][var10] = 99;
         var13 = var10;
         Class97.anIntArrayArray1373[var2][var10] = 0;
         byte var14 = 0;
         boolean var16 = false;
         if(var3 != -1001) {
            return false;
         } else {
            int var15 = 0;
            Class3_Sub13_Sub38.anIntArray3456[var14] = var2;
            int var27 = var14 + 1;
            Class45.anIntArray729[var14] = var10;
            int[][] var17 = Class86.collisionMap[Class26.plane].collisionFlags;

            int var18;
            while(~var27 != ~var15) {
               var13 = Class45.anIntArray729[var15];
               var12 = Class3_Sub13_Sub38.anIntArray3456[var15];
               var15 = 4095 & var15 + 1;
               if(var12 == var0 && var13 == var4) {
                  var16 = true;
                  break;
               }

               if(~var9 != -1) {
                  if((~var9 > -6 || 10 == var9) && Class86.collisionMap[Class26.plane].method1488(var4, var12, false, var13, var0, var9 + -1, 1, var7)) {
                     var16 = true;
                     break;
                  }

                  if(-11 < ~var9 && Class86.collisionMap[Class26.plane].method1492(var4, -1 + var9, var0, var13, 1, var7, var12, 95)) {
                     var16 = true;
                     break;
                  }
               }

               if(var11 != 0 && 0 != var6 && Class86.collisionMap[Class26.plane].method1498(true, var0, var13, var12, 1, var11, var1, var4, var6)) {
                  var16 = true;
                  break;
               }

               var18 = 1 + Class97.anIntArrayArray1373[var12][var13];
               if(0 < var12 && Class84.anIntArrayArray1160[var12 + -1][var13] == 0 && ~(19661064 & var17[var12 + -1][var13]) == -1) {
                  Class3_Sub13_Sub38.anIntArray3456[var27] = -1 + var12;
                  Class45.anIntArray729[var27] = var13;
                  var27 = var27 - -1 & 4095;
                  Class84.anIntArrayArray1160[-1 + var12][var13] = 2;
                  Class97.anIntArrayArray1373[-1 + var12][var13] = var18;
               }

               if(103 > var12 && Class84.anIntArrayArray1160[var12 + 1][var13] == 0 && -1 == ~(var17[var12 + 1][var13] & 19661184)) {
                  Class3_Sub13_Sub38.anIntArray3456[var27] = var12 - -1;
                  Class45.anIntArray729[var27] = var13;
                  var27 = 1 + var27 & 4095;
                  Class84.anIntArrayArray1160[var12 - -1][var13] = 8;
                  Class97.anIntArrayArray1373[1 + var12][var13] = var18;
               }

               if(~var13 < -1 && -1 == ~Class84.anIntArrayArray1160[var12][var13 - 1] && -1 == ~(19661058 & var17[var12][-1 + var13])) {
                  Class3_Sub13_Sub38.anIntArray3456[var27] = var12;
                  Class45.anIntArray729[var27] = -1 + var13;
                  Class84.anIntArrayArray1160[var12][var13 - 1] = 1;
                  var27 = var27 + 1 & 4095;
                  Class97.anIntArrayArray1373[var12][-1 + var13] = var18;
               }

               if(103 > var13 && ~Class84.anIntArrayArray1160[var12][1 + var13] == -1 && -1 == ~(19661088 & var17[var12][var13 + 1])) {
                  Class3_Sub13_Sub38.anIntArray3456[var27] = var12;
                  Class45.anIntArray729[var27] = var13 - -1;
                  var27 = 1 + var27 & 4095;
                  Class84.anIntArrayArray1160[var12][1 + var13] = 4;
                  Class97.anIntArrayArray1373[var12][var13 - -1] = var18;
               }

               if(~var12 < -1 && ~var13 < -1 && ~Class84.anIntArrayArray1160[-1 + var12][var13 - 1] == -1 && ~(var17[var12 - 1][-1 + var13] & 19661070) == -1 && ~(19661064 & var17[var12 - 1][var13]) == -1 && (19661058 & var17[var12][-1 + var13]) == 0) {
                  Class3_Sub13_Sub38.anIntArray3456[var27] = -1 + var12;
                  Class45.anIntArray729[var27] = var13 + -1;
                  var27 = 1 + var27 & 4095;
                  Class84.anIntArrayArray1160[-1 + var12][-1 + var13] = 3;
                  Class97.anIntArrayArray1373[var12 - 1][var13 + -1] = var18;
               }

               if(~var12 > -104 && 0 < var13 && -1 == ~Class84.anIntArrayArray1160[var12 - -1][var13 - 1] && 0 == (19661187 & var17[var12 - -1][-1 + var13]) && -1 == ~(19661184 & var17[var12 - -1][var13]) && -1 == ~(19661058 & var17[var12][-1 + var13])) {
                  Class3_Sub13_Sub38.anIntArray3456[var27] = var12 + 1;
                  Class45.anIntArray729[var27] = -1 + var13;
                  var27 = 4095 & var27 + 1;
                  Class84.anIntArrayArray1160[1 + var12][var13 + -1] = 9;
                  Class97.anIntArrayArray1373[var12 - -1][-1 + var13] = var18;
               }

               if(0 < var12 && -104 < ~var13 && 0 == Class84.anIntArrayArray1160[var12 + -1][var13 + 1] && 0 == (19661112 & var17[var12 + -1][1 + var13]) && 0 == (var17[var12 + -1][var13] & 19661064) && -1 == ~(19661088 & var17[var12][1 + var13])) {
                  Class3_Sub13_Sub38.anIntArray3456[var27] = var12 - 1;
                  Class45.anIntArray729[var27] = 1 + var13;
                  Class84.anIntArrayArray1160[-1 + var12][var13 - -1] = 6;
                  var27 = 4095 & 1 + var27;
                  Class97.anIntArrayArray1373[-1 + var12][1 + var13] = var18;
               }

               if(var12 < 103 && ~var13 > -104 && -1 == ~Class84.anIntArrayArray1160[var12 - -1][1 + var13] && (19661280 & var17[1 + var12][var13 + 1]) == 0 && ~(var17[1 + var12][var13] & 19661184) == -1 && -1 == ~(19661088 & var17[var12][var13 - -1])) {
                  Class3_Sub13_Sub38.anIntArray3456[var27] = var12 + 1;
                  Class45.anIntArray729[var27] = var13 - -1;
                  Class84.anIntArrayArray1160[var12 + 1][1 + var13] = 12;
                  var27 = var27 - -1 & 4095;
                  Class97.anIntArrayArray1373[1 + var12][var13 - -1] = var18;
               }
            }

            AbstractTimer.anInt1692 = 0;
            int var19;
            if(!var16) {
               if(!var8) {
                  return false;
               }

               var18 = 1000;
               var19 = 100;
               byte var20 = 10;

               for(int var21 = var0 + -var20; var20 + var0 >= var21; ++var21) {
                  for(int var22 = var4 + -var20; ~var22 >= ~(var4 - -var20); ++var22) {
                     if(-1 >= ~var21 && ~var22 <= -1 && 104 > var21 && ~var22 > -105 && 100 > Class97.anIntArrayArray1373[var21][var22]) {
                        int var24 = 0;
                        if(~var22 > ~var4) {
                           var24 = var4 + -var22;
                        } else if(var6 + var4 - 1 < var22) {
                           var24 = 1 + (-var4 - var6) + var22;
                        }

                        int var23 = 0;
                        if(~var21 <= ~var0) {
                           if(~var21 < ~(-1 + var11 + var0)) {
                              var23 = 1 - var11 - (var0 - var21);
                           }
                        } else {
                           var23 = var0 + -var21;
                        }

                        int var25 = var24 * var24 + var23 * var23;
                        if(~var25 > ~var18 || ~var25 == ~var18 && Class97.anIntArrayArray1373[var21][var22] < var19) {
                           var13 = var22;
                           var18 = var25;
                           var12 = var21;
                           var19 = Class97.anIntArrayArray1373[var21][var22];
                        }
                     }
                  }
               }

               if(-1001 == ~var18) {
                  return false;
               }

               if(var2 == var12 && ~var13 == ~var10) {
                  return false;
               }

               AbstractTimer.anInt1692 = 1;
            }

            byte var28 = 0;
            Class3_Sub13_Sub38.anIntArray3456[var28] = var12;
            var15 = var28 + 1;
            Class45.anIntArray729[var28] = var13;

            for(var18 = var19 = Class84.anIntArrayArray1160[var12][var13]; var2 != var12 || var13 != var10; var18 = Class84.anIntArrayArray1160[var12][var13]) {
               if(var19 != var18) {
                  var19 = var18;
                  Class3_Sub13_Sub38.anIntArray3456[var15] = var12;
                  Class45.anIntArray729[var15++] = var13;
               }

               if(~(var18 & 2) == -1) {
                  if(0 != (8 & var18)) {
                     --var12;
                  }
               } else {
                  ++var12;
               }

               if(~(1 & var18) == -1) {
                  if(0 != (4 & var18)) {
                     --var13;
                  }
               } else {
                  ++var13;
               }
            }

            if(-1 > ~var15) {
               Class3_Sub13_Sub27.method299(var15, var5);
               return true;
            } else if(-2 == ~var5) {
               return false;
            } else {
               return true;
            }
         }
      } catch (RuntimeException var26) {
         throw Class44.method1067(var26, "di.J(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ',' + var11 + ')');
      }
   }

   final void drawGraphics(Graphics graphics, int x, int y) {
	   this.setPixels();
	   graphics.drawImage(this.image, x, y, this);
   }

   final void init(Component component, int w, int h, boolean isRasterPremultiplied) {
		this.height = h;
		this.pixels = new int[w * h + 1];
		this.width = w;
		this.colorModel = new DirectColorModel(32, 16711680, '\uff00', 255);
		this.image = component.createImage(this);
		this.setPixels();
		component.prepareImage(this.image, this);
		this.setPixels();
		component.prepareImage(this.image, this);
		this.setPixels();
		component.prepareImage(this.image, this);
		this.initCanvas();
		if (isRasterPremultiplied) {
			this.addConsumer((ImageConsumer) null);
		}
   }

   public final boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
	   return true;
   }

   static final void method2192(int var0) {
      try {
         if(var0 > -26) {
            method2191(-54, -79, 96, 36, -65, 4, -120, 29, false, -60, -74, 43);
         }

         Class154.aClass93_1955.clearSoftReference();
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "di.M(" + var0 + ')');
      }
   }

   public final void requestTopDownLeftRightResend(ImageConsumer var1) {}

}
