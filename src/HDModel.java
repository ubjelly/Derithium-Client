import java.nio.ByteBuffer;
import javax.media.opengl.GL;

final class HDModel extends AbstractModel {

   private short[] triangleColors;
   boolean aBoolean3809 = false;
   private short[] aShortArray3810;
   private short[] aShortArray3811;
   private VertexBuffer aClass156_3812;
   private short[] aShortArray3813;
   private Class121 aClass121_3814;
   private Class121 aClass121_3815;
   private byte[] triangleTransparencies;
   private Class121 aClass121_3817;
   private static Buffer aClass3_Sub30_3818 = new Buffer(10000);
   private short aShort3819;
   private byte[] triangleTSkins;
   private static long[] aLongArray3821;
   int[] xVertices;
   int vertexCount = 0;
   private float[] aFloatArray3824;
   private int[][] anIntArrayArray3825;
   private short[] aShortArray3826;
   private short[] triangleTextureIds;
   private short[] aShortArray3828;
   private int[][] anIntArrayArray3829;
   private short[] aShortArray3830;
   private short[] aShortArray3831;
   private short[] aShortArray3832;
   private int anInt3833 = 0;
   private static ByteBuffer aByteBuffer3834;
   Class6 aClass6_3835;
   private byte aByte3836 = 0;
   private short[] aShortArray3837;
   private int[] anIntArray3838;
   Class121 aClass121_3839;
   private int[] anIntArray3840;
   private short[] aShortArray3841;
   private static HDModel aClass140_Sub1_Sub1_3842 = new HDModel();
   private Class18 aClass18_3843;
   private int[] anIntArray3844;
   int[] yVertices;
   private Class121 aClass121_3846;
   private float[] aFloatArray3847;
   int[] zVertices;
   private short aShort3849;
   private static HDModel aClass140_Sub1_Sub1_3850 = new HDModel();
   private byte aByte3851 = 0;
   private int anInt3852 = 0;
   private static HDModel aClass140_Sub1_Sub1_3853 = new HDModel();
   private static HDModel aClass140_Sub1_Sub1_3854 = new HDModel();
   private static HDModel aClass140_Sub1_Sub1_3855 = new HDModel();
   private static HDModel aClass140_Sub1_Sub1_3856 = new HDModel();
   private static int[] anIntArray3857 = new int[1];
   private static float aFloat3858;
   private static int anInt3859;
   private static float aFloat3860;
   private static int[] anIntArray3861 = new int[1];
   private static int anInt3862;
   private static float aFloat3863;
   private static float aFloat3864;
   private static int anInt3865;
   private static float aFloat3866;
   private static float aFloat3867;
   private static boolean aBoolean3868 = false;


   private static final int method1901(float var0, float var1, float var2) {
      float var3 = var0 < 0.0F?-var0:var0;
      float var4 = var1 < 0.0F?-var1:var1;
      float var5 = var2 < 0.0F?-var2:var2;
      return var4 > var3 && var4 > var5?(var1 > 0.0F?0:1):(var5 > var3 && var5 > var4?(var2 > 0.0F?2:3):(var0 > 0.0F?4:5));
   }

   final AbstractModel method1882(boolean var1, boolean var2, boolean var3) {
      return this.method1923(var1, var2, var3, aClass140_Sub1_Sub1_3854, aClass140_Sub1_Sub1_3853);
   }

   final void render(int var1, int var2, int var3, int var4, int var5, int vectorX, int vectorY, int vectorZ, long var9, int var11, ParticleEngine var12) {
      if(this.anInt3833 != 0) {
         if(!this.aClass6_3835.calculated) {
            this.calculateBounds();
         }

         short var13 = this.aClass6_3835.aShort93;
         short var14 = this.aClass6_3835.highestY;
         short var15 = this.aClass6_3835.lowestY;
         int var16 = vectorZ * var5 - vectorX * var4 >> 16;
         int var17 = vectorY * var2 + var16 * var3 >> 16;
         int var18 = var17 + (var13 * var3 + var15 * var2 >> 16);
         if(var18 > 50) {
            int var19 = var17 + (-var13 * var3 + var14 * var2 >> 16);
            if(var19 < 3584) {
               int var20 = vectorZ * var4 + vectorX * var5 >> 16;
               int var21 = var20 + var13 << 9;
               if(var21 / var18 > Class139.anInt1824) {
                  int var22 = var20 - var13 << 9;
                  if(var22 / var18 < Class145.anInt1898) {
                     int var23 = vectorY * var3 - var16 * var2 >> 16;
                     int var24 = var23 + (var13 * var2 + var15 * var3 >> 16) << 9;
                     if(var24 / var18 > Class1.anInt55) {
                        int var25 = var23 + (-var13 * var2 + var14 * var3 >> 16) << 9;
                        if(var25 / var18 < Class86.anInt1195) {
                           int var26 = 0;
                           int var27 = 0;
                           if(var1 != 0) {
                              var26 = Rasterizer.sineTable[var1];
                              var27 = Rasterizer.cosineTable[var1];
                           }

                           if(var9 > 0L && Class3_Sub13_Sub7.aBoolean3094 && var19 > 0) {
                              int var28;
                              int var30;
                              if(var20 > 0) {
                                 var28 = var22 / var18;
                                 var30 = var21 / var19;
                              } else {
                                 var28 = var22 / var19;
                                 var30 = var21 / var18;
                              }

                              int var29;
                              int var31;
                              if(var23 > 0) {
                                 var29 = var25 / var18;
                                 var31 = var24 / var19;
                              } else {
                                 var29 = var25 / var19;
                                 var31 = var24 / var18;
                              }

                              if(Class3_Sub28_Sub11.anInt3642 >= var28 && Class3_Sub28_Sub11.anInt3642 <= var30 && client.anInt384 >= var29 && client.anInt384 <= var31) {
                                 var28 = 999999;
                                 var30 = -999999;
                                 var29 = 999999;
                                 var31 = -999999;
                                 short var32 = this.aClass6_3835.lowestX;
                                 short var33 = this.aClass6_3835.highestX;
                                 short var34 = this.aClass6_3835.highestZ;
                                 short var35 = this.aClass6_3835.lowestZ;
                                 int[] var36 = new int[]{var32, var33, var32, var33, var32, var33, var32, var33};
                                 int[] var37 = new int[]{var34, var34, var35, var35, var34, var34, var35, var35};
                                 int[] var38 = new int[]{var14, var14, var14, var14, var15, var15, var15, var15};

                                 int var39;
                                 int var42;
                                 int var43;
                                 int var40;
                                 int var41;
                                 int var44;
                                 int var45;
                                 for(var39 = 0; var39 < 8; ++var39) {
                                    var40 = var36[var39];
                                    var41 = var38[var39];
                                    var42 = var37[var39];
                                    if(var1 != 0) {
                                       var43 = var42 * var26 + var40 * var27 >> 16;
                                       var42 = var42 * var27 - var40 * var26 >> 16;
                                       var40 = var43;
                                    }

                                    var40 += vectorX;
                                    var41 += vectorY;
                                    var42 += vectorZ;
                                    var43 = var42 * var4 + var40 * var5 >> 16;
                                    var42 = var42 * var5 - var40 * var4 >> 16;
                                    var40 = var43;
                                    var43 = var41 * var3 - var42 * var2 >> 16;
                                    var42 = var41 * var2 + var42 * var3 >> 16;
                                    if(var42 > 0) {
                                       var44 = (var40 << 9) / var42;
                                       var45 = (var43 << 9) / var42;
                                       if(var44 < var28) {
                                          var28 = var44;
                                       }

                                       if(var44 > var30) {
                                          var30 = var44;
                                       }

                                       if(var45 < var29) {
                                          var29 = var45;
                                       }

                                       if(var45 > var31) {
                                          var31 = var45;
                                       }
                                    }
                                 }

                                 if(Class3_Sub28_Sub11.anInt3642 >= var28 && Class3_Sub28_Sub11.anInt3642 <= var30 && client.anInt384 >= var29 && client.anInt384 <= var31) {
                                    if(this.aBoolean2699) {
                                       Class3_Sub13_Sub38.aLongArray3448[Class2.anInt59++] = var9;
                                    } else {
                                       if(anIntArray3861.length < this.anInt3833) {
                                          anIntArray3861 = new int[this.anInt3833];
                                          anIntArray3857 = new int[this.anInt3833];
                                       }

                                       var39 = 0;

                                       label118:
                                       while(true) {
                                          if(var39 >= this.vertexCount) {
                                             var39 = 0;

                                             while(true) {
                                                if(var39 >= this.anInt3852) {
                                                   break label118;
                                                }

                                                short var53 = this.aShortArray3811[var39];
                                                short var52 = this.aShortArray3830[var39];
                                                short var51 = this.aShortArray3831[var39];
                                                if(this.method1927(Class3_Sub28_Sub11.anInt3642, client.anInt384, anIntArray3857[var53], anIntArray3857[var52], anIntArray3857[var51], anIntArray3861[var53], anIntArray3861[var52], anIntArray3861[var51])) {
                                                   Class3_Sub13_Sub38.aLongArray3448[Class2.anInt59++] = var9;
                                                   break label118;
                                                }

                                                ++var39;
                                             }
                                          }

                                          var40 = this.xVertices[var39];
                                          var41 = this.yVertices[var39];
                                          var42 = this.zVertices[var39];
                                          if(var1 != 0) {
                                             var43 = var42 * var26 + var40 * var27 >> 16;
                                             var42 = var42 * var27 - var40 * var26 >> 16;
                                             var40 = var43;
                                          }

                                          var40 += vectorX;
                                          var41 += vectorY;
                                          var42 += vectorZ;
                                          var43 = var42 * var4 + var40 * var5 >> 16;
                                          var42 = var42 * var5 - var40 * var4 >> 16;
                                          var40 = var43;
                                          var43 = var41 * var3 - var42 * var2 >> 16;
                                          var42 = var41 * var2 + var42 * var3 >> 16;
                                          if(var42 < 50) {
                                             break;
                                          }

                                          var44 = (var40 << 9) / var42;
                                          var45 = (var43 << 9) / var42;
                                          int var46 = this.anIntArray3838[var39];
                                          int var47 = this.anIntArray3838[var39 + 1];

                                          for(int var48 = var46; var48 < var47; ++var48) {
                                             int var49 = this.aShortArray3828[var48] - 1;
                                             if(var49 == -1) {
                                                break;
                                             }

                                             anIntArray3861[var49] = var44;
                                             anIntArray3857[var49] = var45;
                                          }

                                          ++var39;
                                       }
                                    }
                                 }
                              }
                           }

                           GL var50 = HDToolkit.gl;
                           var50.glPushMatrix();
                           var50.glTranslatef((float)vectorX, (float)vectorY, (float)vectorZ);
                           var50.glRotatef((float)var1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
                           this.method1930();
                           var50.glRotatef((float)(-var1) * 0.17578125F, 0.0F, 1.0F, 0.0F);
                           var50.glTranslatef((float)(-vectorX), (float)(-vectorY), (float)(-vectorZ));
                           var50.glPopMatrix();
                        }
                     }
                  }
               }
            }
         }
      }
   }

   final void method1902() {
      if(this.aShortArray3810 == null) {
         this.rotate270();
      } else {
         int var1;
         for(var1 = 0; var1 < this.vertexCount; ++var1) {
            int var2 = this.zVertices[var1];
            this.zVertices[var1] = this.xVertices[var1];
            this.xVertices[var1] = -var2;
         }

         for(var1 = 0; var1 < this.anInt3833; ++var1) {
            short var3 = this.aShortArray3837[var1];
            this.aShortArray3837[var1] = this.aShortArray3810[var1];
            this.aShortArray3810[var1] = (short)(-var3);
         }

         this.aClass6_3835.calculated = false;
         this.aClass121_3839.aBoolean1640 = false;
         if(this.aClass121_3815 != null) {
            this.aClass121_3815.aBoolean1640 = false;
         }

      }
   }

   final int method1903() {
      return this.aShort3849;
   }

   final void method1886(int var1) {
      int var2 = Rasterizer.sineTable[var1];
      int var3 = Rasterizer.cosineTable[var1];

      for(int var4 = 0; var4 < this.vertexCount; ++var4) {
         int var5 = this.yVertices[var4] * var2 + this.xVertices[var4] * var3 >> 16;
         this.yVertices[var4] = this.yVertices[var4] * var3 - this.xVertices[var4] * var2 >> 16;
         this.xVertices[var4] = var5;
      }

      this.aClass6_3835.calculated = false;
      this.aClass121_3839.aBoolean1640 = false;
   }

   final int method1883() {
      if(!this.aClass6_3835.calculated) {
         this.calculateBounds();
      }

      return this.aClass6_3835.highestX;
   }

   final int method1872() {
      if(!this.aClass6_3835.calculated) {
         this.calculateBounds();
      }

      return this.aClass6_3835.lowestZ;
   }

   final boolean method1865() {
      return this.aBoolean3809 && this.xVertices != null && this.aShortArray3810 != null;
   }

   final int method1898() {
      if(!this.aClass6_3835.calculated) {
         this.calculateBounds();
      }

      return this.aClass6_3835.highestZ;
   }

   final void move(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.vertexCount; ++var4) {
         this.xVertices[var4] += var1;
         this.yVertices[var4] += var2;
         this.zVertices[var4] += var3;
      }

      this.aClass6_3835.calculated = false;
      this.aClass121_3839.aBoolean1640 = false;
   }

   final AbstractModel method1890(boolean var1, boolean var2, boolean var3) {
      return this.method1923(var1, var2, var3, aClass140_Sub1_Sub1_3856, aClass140_Sub1_Sub1_3855);
   }

   private static final void method1904(int var0, int var1, int var2, int var3, int var4, int var5, float[] var6, float var7, int var8, float var9) {
      var0 -= var3;
      var1 -= var4;
      var2 -= var5;
      float var10 = (float)var0 * var6[0] + (float)var1 * var6[1] + (float)var2 * var6[2];
      float var11 = (float)var0 * var6[3] + (float)var1 * var6[4] + (float)var2 * var6[5];
      float var12 = (float)var0 * var6[6] + (float)var1 * var6[7] + (float)var2 * var6[8];
      float var13 = (float)Math.atan2((double)var10, (double)var12) / 6.2831855F + 0.5F;
      if(var7 != 1.0F) {
         var13 *= var7;
      }

      float var14 = var11 + 0.5F + var9;
      float var15;
      if(var8 == 1) {
         var15 = var13;
         var13 = -var14;
         var14 = var15;
      } else if(var8 == 2) {
         var13 = -var13;
         var14 = -var14;
      } else if(var8 == 3) {
         var15 = var13;
         var13 = var14;
         var14 = -var15;
      }

      aFloat3863 = var13;
      aFloat3866 = var14;
   }

   final void method1866(SceneGraphNode var1, int var2, int var3, int var4, boolean var5) {
      HDModel var6 = (HDModel)var1;
      if(this.anInt3852 != 0 && var6.anInt3852 != 0) {
         int var7 = var6.vertexCount;
         int[] var8 = var6.xVertices;
         int[] var9 = var6.yVertices;
         int[] var10 = var6.zVertices;
         short[] var11 = var6.aShortArray3810;
         short[] var12 = var6.aShortArray3826;
         short[] var13 = var6.aShortArray3837;
         short[] var14 = var6.aShortArray3841;
         short[] var15;
         short[] var17;
         short[] var16;
         short[] var18;
         if(this.aClass18_3843 != null) {
            var15 = this.aClass18_3843.aShortArray417;
            var16 = this.aClass18_3843.aShortArray419;
            var17 = this.aClass18_3843.aShortArray418;
            var18 = this.aClass18_3843.aShortArray416;
         } else {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
         }

         short[] var19;
         short[] var21;
         short[] var20;
         short[] var22;
         if(var6.aClass18_3843 != null) {
            var19 = var6.aClass18_3843.aShortArray417;
            var20 = var6.aClass18_3843.aShortArray419;
            var21 = var6.aClass18_3843.aShortArray418;
            var22 = var6.aClass18_3843.aShortArray416;
         } else {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
         }

         int[] var23 = var6.anIntArray3838;
         short[] var24 = var6.aShortArray3828;
         if(!var6.aClass6_3835.calculated) {
            var6.calculateBounds();
         }

         short var25 = var6.aClass6_3835.highestY;
         short var26 = var6.aClass6_3835.lowestY;
         short var27 = var6.aClass6_3835.lowestX;
         short var28 = var6.aClass6_3835.highestX;
         short var29 = var6.aClass6_3835.highestZ;
         short var30 = var6.aClass6_3835.lowestZ;

         for(int var31 = 0; var31 < this.vertexCount; ++var31) {
            int var32 = this.yVertices[var31] - var3;
            if(var32 >= var25 && var32 <= var26) {
               int var33 = this.xVertices[var31] - var2;
               if(var33 >= var27 && var33 <= var28) {
                  int var34 = this.zVertices[var31] - var4;
                  if(var34 >= var29 && var34 <= var30) {
                     int var35 = -1;
                     int var36 = this.anIntArray3838[var31];
                     int var37 = this.anIntArray3838[var31 + 1];

                     int var38;
                     for(var38 = var36; var38 < var37; ++var38) {
                        var35 = this.aShortArray3828[var38] - 1;
                        if(var35 == -1 || this.aShortArray3841[var35] != 0) {
                           break;
                        }
                     }

                     if(var35 != -1) {
                        for(var38 = 0; var38 < var7; ++var38) {
                           if(var33 == var8[var38] && var34 == var10[var38] && var32 == var9[var38]) {
                              int var39 = -1;
                              var36 = var23[var38];
                              var37 = var23[var38 + 1];

                              for(int var40 = var36; var40 < var37; ++var40) {
                                 var39 = var24[var40] - 1;
                                 if(var39 == -1 || var14[var39] != 0) {
                                    break;
                                 }
                              }

                              if(var39 != -1) {
                                 if(var15 == null) {
                                    this.aClass18_3843 = new Class18();//TODO
                                    var15 = this.aClass18_3843.aShortArray417 = OutputStream_Sub1.arrayCopy(this.aShortArray3810);
                                    var16 = this.aClass18_3843.aShortArray419 = OutputStream_Sub1.arrayCopy(this.aShortArray3826);
                                    var17 = this.aClass18_3843.aShortArray418 = OutputStream_Sub1.arrayCopy(this.aShortArray3837);
                                    var18 = this.aClass18_3843.aShortArray416 = OutputStream_Sub1.arrayCopy(this.aShortArray3841);
                                 }

                                 if(var19 == null) {
                                    Class18 var47 = var6.aClass18_3843 = new Class18();
                                    var19 = var47.aShortArray417 = OutputStream_Sub1.arrayCopy(var11);
                                    var20 = var47.aShortArray419 = OutputStream_Sub1.arrayCopy(var12);
                                    var21 = var47.aShortArray418 = OutputStream_Sub1.arrayCopy(var13);
                                    var22 = var47.aShortArray416 = OutputStream_Sub1.arrayCopy(var14);
                                 }

                                 short var46 = this.aShortArray3810[var35];
                                 short var41 = this.aShortArray3826[var35];
                                 short var42 = this.aShortArray3837[var35];
                                 short var43 = this.aShortArray3841[var35];
                                 var36 = var23[var38];
                                 var37 = var23[var38 + 1];

                                 int var44;
                                 int var45;
                                 for(var44 = var36; var44 < var37; ++var44) {
                                    var45 = var24[var44] - 1;
                                    if(var45 == -1) {
                                       break;
                                    }

                                    if(var22[var45] != 0) {
                                       var19[var45] += var46;
                                       var20[var45] += var41;
                                       var21[var45] += var42;
                                       var22[var45] += var43;
                                    }
                                 }

                                 var46 = var11[var39];
                                 var41 = var12[var39];
                                 var42 = var13[var39];
                                 var43 = var14[var39];
                                 var36 = this.anIntArray3838[var31];
                                 var37 = this.anIntArray3838[var31 + 1];

                                 for(var44 = var36; var44 < var37; ++var44) {
                                    var45 = this.aShortArray3828[var44] - 1;
                                    if(var45 == -1) {
                                       break;
                                    }

                                    if(var18[var45] != 0) {
                                       var15[var45] += var46;
                                       var16[var45] += var41;
                                       var17[var45] += var42;
                                       var18[var45] += var43;
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
   }

   final void method1893(int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8) {
      if(this.anInt3833 != 0) {
         GL var10 = HDToolkit.gl;
         var10.glPushMatrix();
         if(var4 != 0) {
            var10.glRotatef((float)var4 * 0.17578125F, 1.0F, 0.0F, 0.0F);
         }

         var10.glTranslatef((float)var5, (float)var6, (float)var7);
         if(var2 != 0) {
            var10.glRotatef((float)var2 * 0.17578125F, 0.0F, 1.0F, 0.0F);
         }

         if(var1 != 0) {
            var10.glRotatef((float)var1 * 0.17578125F, 1.0F, 0.0F, 0.0F);
         }

         if(var3 != 0) {
            var10.glRotatef((float)(-var3) * 0.17578125F, 0.0F, 0.0F, 1.0F);
         }

         this.method1930();
         var10.glPopMatrix();
      }
   }

   private static final int method1905(int var0, short var1, int var2, byte var3) {
      int var4 = Rasterizer.anIntArray834[LDModel.blendColor(var0, var2)];
      if(var1 != -1) {
         int var5 = Rasterizer.anInterface2_838.method19(93, var1 & '\uffff');
         int var6;
         int var8;
         if(var5 != 0) {
            if(var2 < 0) {
               var6 = 0;
            } else if(var2 > 127) {
               var6 = 16777215;
            } else {
               var6 = 131586 * var2;
            }

            if(var5 == 256) {
               var4 = var6;
            } else {
               var8 = 256 - var5;
               var4 = ((var6 & 16711935) * var5 + (var4 & 16711935) * var8 & -16711936) + ((var6 & '\uff00') * var5 + (var4 & '\uff00') * var8 & 16711680) >> 8;
            }
         }

         var6 = Rasterizer.anInterface2_838.method10(90, var1 & '\uffff');
         if(var6 != 0) {
            var6 += 256;
            int var7 = ((var4 & 16711680) >> 16) * var6;
            if(var7 > '\uffff') {
               var7 = '\uffff';
            }

            var8 = ((var4 & '\uff00') >> 8) * var6;
            if(var8 > '\uffff') {
               var8 = '\uffff';
            }

            int var9 = (var4 & 255) * var6;
            if(var9 > '\uffff') {
               var9 = '\uffff';
            }

            var4 = (var7 << 8 & 16711680) + (var8 & '\uff00') + (var9 >> 8);
         }
      }

      return (var4 << 8) + (255 - (var3 & 255));
   }

   private static final float[] method1906(int var0, int var1, int var2, int angle, float var4, float var5, float var6) {
      float[] var7 = new float[9];
      float[] var8 = new float[9];
      float var9 = (float)Math.cos((double)((float)angle * 0.024543693F));//angle to rad
      float var10 = (float)Math.sin((double)((float)angle * 0.024543693F));//angle to rad
      float var11 = 1.0F - var9;
      var7[0] = var9;
      var7[1] = 0.0F;
      var7[2] = var10;
      var7[3] = 0.0F;
      var7[4] = 1.0F;
      var7[5] = 0.0F;
      var7[6] = -var10;
      var7[7] = 0.0F;
      var7[8] = var9;
      float[] var12 = new float[9];
      float var13 = 1.0F;
      float var14 = 0.0F;
      var9 = (float)var1 / 32767.0F;
      var10 = -((float)Math.sqrt((double)(1.0F - var9 * var9)));
      var11 = 1.0F - var9;
      float var15 = (float)Math.sqrt((double)(var0 * var0 + var2 * var2));
      if(var15 == 0.0F && var9 == 0.0F) {
         var8 = var7;
      } else {
         if(var15 != 0.0F) {
            var13 = (float)(-var2) / var15;
            var14 = (float)var0 / var15;
         }

         var12[0] = var9 + var13 * var13 * var11;
         var12[1] = var14 * var10;
         var12[2] = var14 * var13 * var11;
         var12[3] = -var14 * var10;
         var12[4] = var9;
         var12[5] = var13 * var10;
         var12[6] = var13 * var14 * var11;
         var12[7] = -var13 * var10;
         var12[8] = var9 + var14 * var14 * var11;
         var8[0] = var7[0] * var12[0] + var7[1] * var12[3] + var7[2] * var12[6];
         var8[1] = var7[0] * var12[1] + var7[1] * var12[4] + var7[2] * var12[7];
         var8[2] = var7[0] * var12[2] + var7[1] * var12[5] + var7[2] * var12[8];
         var8[3] = var7[3] * var12[0] + var7[4] * var12[3] + var7[5] * var12[6];
         var8[4] = var7[3] * var12[1] + var7[4] * var12[4] + var7[5] * var12[7];
         var8[5] = var7[3] * var12[2] + var7[4] * var12[5] + var7[5] * var12[8];
         var8[6] = var7[6] * var12[0] + var7[7] * var12[3] + var7[8] * var12[6];
         var8[7] = var7[6] * var12[1] + var7[7] * var12[4] + var7[8] * var12[7];
         var8[8] = var7[6] * var12[2] + var7[7] * var12[5] + var7[8] * var12[8];
      }

      var8[0] *= var4;
      var8[1] *= var4;
      var8[2] *= var4;
      var8[3] *= var5;
      var8[4] *= var5;
      var8[5] *= var5;
      var8[6] *= var6;
      var8[7] *= var6;
      var8[8] *= var6;
      return var8;
   }

   private final short method1907(ModelBuilder var1, int var2, long var3, int var5, int var6, int var7, int var8, float var9, float var10) {
      int var11 = this.anIntArray3838[var2];
      int var12 = this.anIntArray3838[var2 + 1];
      int var13 = 0;

      for(int var14 = var11; var14 < var12; ++var14) {
         short var15 = this.aShortArray3828[var14];
         if(var15 == 0) {
            var13 = var14;
            break;
         }

         if(aLongArray3821[var14] == var3) {
            return (short)(var15 - 1);
         }
      }

      this.aShortArray3828[var13] = (short)(this.anInt3833 + 1);
      aLongArray3821[var13] = var3;
      this.aShortArray3810[this.anInt3833] = (short)var5;
      this.aShortArray3826[this.anInt3833] = (short)var6;
      this.aShortArray3837[this.anInt3833] = (short)var7;
      this.aShortArray3841[this.anInt3833] = (short)var8;
      this.aFloatArray3824[this.anInt3833] = var9;
      this.aFloatArray3847[this.anInt3833] = var10;
      return (short)(this.anInt3833++);
   }

   final void method1876(int var1) {
      int var2 = Rasterizer.sineTable[var1];
      int var3 = Rasterizer.cosineTable[var1];

      for(int var4 = 0; var4 < this.vertexCount; ++var4) {
         int var5 = this.zVertices[var4] * var2 + this.xVertices[var4] * var3 >> 16;
         this.zVertices[var4] = this.zVertices[var4] * var3 - this.xVertices[var4] * var2 >> 16;
         this.xVertices[var4] = var5;
      }

      this.aClass6_3835.calculated = false;
      this.aClass121_3839.aBoolean1640 = false;
   }

   final void method1899(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8) {
      int var9 = var2.length;
      int var10;
      int var11;
      int var14;
      int var15;
      int var47;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var10 = 0;
         anInt3859 = 0;
         anInt3865 = 0;
         anInt3862 = 0;

         for(var11 = 0; var11 < var9; ++var11) {
            var47 = var2[var11];
            if(var47 < this.anIntArrayArray3825.length) {
               int[] var48 = this.anIntArrayArray3825[var47];

               for(var14 = 0; var14 < var48.length; ++var14) {
                  var15 = var48[var14];
                  if(this.aShortArray3832 == null || (var7 & this.aShortArray3832[var15]) != 0) {
                     anInt3859 += this.xVertices[var15];
                     anInt3865 += this.yVertices[var15];
                     anInt3862 += this.zVertices[var15];
                     ++var10;
                  }
               }
            }
         }

         if(var10 > 0) {
            anInt3859 = anInt3859 / var10 + var3;
            anInt3865 = anInt3865 / var10 + var4;
            anInt3862 = anInt3862 / var10 + var5;
            aBoolean3868 = true;
         } else {
            anInt3859 = var3;
            anInt3865 = var4;
            anInt3862 = var5;
         }

      } else {
         int[] var12;
         int var13;
         if(var1 == 1) {
            if(var8 != null) {
               var10 = var8[0] * var3 + var8[1] * var4 + var8[2] * var5 + 16384 >> 15;
               var11 = var8[3] * var3 + var8[4] * var4 + var8[5] * var5 + 16384 >> 15;
               var47 = var8[6] * var3 + var8[7] * var4 + var8[8] * var5 + 16384 >> 15;
               var3 = var10;
               var4 = var11;
               var5 = var47;
            }

            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var10 = 0; var10 < var9; ++var10) {
               var11 = var2[var10];
               if(var11 < this.anIntArrayArray3825.length) {
                  var12 = this.anIntArrayArray3825[var11];

                  for(var13 = 0; var13 < var12.length; ++var13) {
                     var14 = var12[var13];
                     if(this.aShortArray3832 == null || (var7 & this.aShortArray3832[var14]) != 0) {
                        this.xVertices[var14] += var3;
                        this.yVertices[var14] += var4;
                        this.zVertices[var14] += var5;
                     }
                  }
               }
            }

         } else {
            int var17;
            int var16;
            int var19;
            int var18;
            int var21;
            int var20;
            int var23;
            int var22;
            int var24;
            int var27;
            int var26;
            int var28;
            int var30;
            int var34;
            int[] var35;
            int var32;
            int var33;
            int var38;
            int var39;
            int var36;
            int var37;
            int var40;
            if(var1 == 2) {
               if(var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var47 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var14 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(aBoolean3868) {
                     var16 = var8[0] * anInt3859 + var8[3] * anInt3865 + var8[6] * anInt3862 + 16384 >> 15;
                     var17 = var8[1] * anInt3859 + var8[4] * anInt3865 + var8[7] * anInt3862 + 16384 >> 15;
                     var18 = var8[2] * anInt3859 + var8[5] * anInt3865 + var8[8] * anInt3862 + 16384 >> 15;
                     var16 += var13;
                     var17 += var14;
                     var18 += var15;
                     anInt3859 = var16;
                     anInt3865 = var17;
                     anInt3862 = var18;
                     aBoolean3868 = false;
                  }

                  int[] var49 = new int[9];
                  var17 = Rasterizer.cosineTable[var3] >> 1;
                  var18 = Rasterizer.sineTable[var3] >> 1;
                  var19 = Rasterizer.cosineTable[var4] >> 1;
                  var20 = Rasterizer.sineTable[var4] >> 1;
                  var21 = Rasterizer.cosineTable[var5] >> 1;
                  var22 = Rasterizer.sineTable[var5] >> 1;
                  var23 = var18 * var21 + 16384 >> 15;
                  var24 = var18 * var22 + 16384 >> 15;
                  var49[0] = var19 * var21 + var20 * var24 + 16384 >> 15;
                  var49[1] = -var19 * var22 + var20 * var23 + 16384 >> 15;
                  var49[2] = var20 * var17 + 16384 >> 15;
                  var49[3] = var17 * var22 + 16384 >> 15;
                  var49[4] = var17 * var21 + 16384 >> 15;
                  var49[5] = -var18;
                  var49[6] = -var20 * var21 + var19 * var24 + 16384 >> 15;
                  var49[7] = var20 * var22 + var19 * var23 + 16384 >> 15;
                  var49[8] = var19 * var17 + 16384 >> 15;
                  int var50 = var49[0] * -anInt3859 + var49[1] * -anInt3865 + var49[2] * -anInt3862 + 16384 >> 15;
                  var26 = var49[3] * -anInt3859 + var49[4] * -anInt3865 + var49[5] * -anInt3862 + 16384 >> 15;
                  var27 = var49[6] * -anInt3859 + var49[7] * -anInt3865 + var49[8] * -anInt3862 + 16384 >> 15;
                  var28 = var50 + anInt3859;
                  int var51 = var26 + anInt3865;
                  var30 = var27 + anInt3862;
                  int[] var52 = new int[9];

                  for(var32 = 0; var32 < 3; ++var32) {
                     for(var33 = 0; var33 < 3; ++var33) {
                        var34 = 0;

                        for(int var53 = 0; var53 < 3; ++var53) {
                           var34 += var49[var32 * 3 + var53] * var8[var33 * 3 + var53];
                        }

                        var52[var32 * 3 + var33] = var34 + 16384 >> 15;
                     }
                  }

                  var32 = var49[0] * var13 + var49[1] * var14 + var49[2] * var15 + 16384 >> 15;
                  var33 = var49[3] * var13 + var49[4] * var14 + var49[5] * var15 + 16384 >> 15;
                  var34 = var49[6] * var13 + var49[7] * var14 + var49[8] * var15 + 16384 >> 15;
                  var32 += var28;
                  var33 += var51;
                  var34 += var30;
                  var35 = new int[9];

                  for(var36 = 0; var36 < 3; ++var36) {
                     for(var37 = 0; var37 < 3; ++var37) {
                        var38 = 0;

                        for(var39 = 0; var39 < 3; ++var39) {
                           var38 += var8[var36 * 3 + var39] * var52[var37 + var39 * 3];
                        }

                        var35[var36 * 3 + var37] = var38 + 16384 >> 15;
                     }
                  }

                  var36 = var8[0] * var32 + var8[1] * var33 + var8[2] * var34 + 16384 >> 15;
                  var37 = var8[3] * var32 + var8[4] * var33 + var8[5] * var34 + 16384 >> 15;
                  var38 = var8[6] * var32 + var8[7] * var33 + var8[8] * var34 + 16384 >> 15;
                  var36 += var10;
                  var37 += var11;
                  var38 += var47;

                  for(var39 = 0; var39 < var9; ++var39) {
                     var40 = var2[var39];
                     if(var40 < this.anIntArrayArray3825.length) {
                        int[] var41 = this.anIntArrayArray3825[var40];

                        for(int var42 = 0; var42 < var41.length; ++var42) {
                           int var43 = var41[var42];
                           if(this.aShortArray3832 == null || (var7 & this.aShortArray3832[var43]) != 0) {
                              int var44 = var35[0] * this.xVertices[var43] + var35[1] * this.yVertices[var43] + var35[2] * this.zVertices[var43] + 16384 >> 15;
                              int var45 = var35[3] * this.xVertices[var43] + var35[4] * this.yVertices[var43] + var35[5] * this.zVertices[var43] + 16384 >> 15;
                              int var46 = var35[6] * this.xVertices[var43] + var35[7] * this.yVertices[var43] + var35[8] * this.zVertices[var43] + 16384 >> 15;
                              var44 += var36;
                              var45 += var37;
                              var46 += var38;
                              this.xVertices[var43] = var44;
                              this.yVertices[var43] = var45;
                              this.zVertices[var43] = var46;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray3825.length) {
                        var12 = this.anIntArrayArray3825[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var14 = var12[var13];
                           if(this.aShortArray3832 == null || (var7 & this.aShortArray3832[var14]) != 0) {
                              this.xVertices[var14] -= anInt3859;
                              this.yVertices[var14] -= anInt3865;
                              this.zVertices[var14] -= anInt3862;
                              if(var5 != 0) {
                                 var15 = Rasterizer.sineTable[var5];
                                 var16 = Rasterizer.cosineTable[var5];
                                 var17 = this.yVertices[var14] * var15 + this.xVertices[var14] * var16 + 32767 >> 16;
                                 this.yVertices[var14] = this.yVertices[var14] * var16 - this.xVertices[var14] * var15 + 32767 >> 16;
                                 this.xVertices[var14] = var17;
                              }

                              if(var3 != 0) {
                                 var15 = Rasterizer.sineTable[var3];
                                 var16 = Rasterizer.cosineTable[var3];
                                 var17 = this.yVertices[var14] * var16 - this.zVertices[var14] * var15 + 32767 >> 16;
                                 this.zVertices[var14] = this.yVertices[var14] * var15 + this.zVertices[var14] * var16 + 32767 >> 16;
                                 this.yVertices[var14] = var17;
                              }

                              if(var4 != 0) {
                                 var15 = Rasterizer.sineTable[var4];
                                 var16 = Rasterizer.cosineTable[var4];
                                 var17 = this.zVertices[var14] * var15 + this.xVertices[var14] * var16 + 32767 >> 16;
                                 this.zVertices[var14] = this.zVertices[var14] * var16 - this.xVertices[var14] * var15 + 32767 >> 16;
                                 this.xVertices[var14] = var17;
                              }

                              this.xVertices[var14] += anInt3859;
                              this.yVertices[var14] += anInt3865;
                              this.zVertices[var14] += anInt3862;
                           }
                        }
                     }
                  }

                  if(var6 && this.aShortArray3810 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray3825.length) {
                           var12 = this.anIntArrayArray3825[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var14 = var12[var13];
                              if(this.aShortArray3832 == null || (var7 & this.aShortArray3832[var14]) != 0) {
                                 var15 = this.anIntArray3838[var14];
                                 var16 = this.anIntArray3838[var14 + 1];

                                 for(var17 = var15; var17 < var16; ++var17) {
                                    var18 = this.aShortArray3828[var17] - 1;
                                    if(var18 == -1) {
                                       break;
                                    }

                                    if(var5 != 0) {
                                       var19 = Rasterizer.sineTable[var5];
                                       var20 = Rasterizer.cosineTable[var5];
                                       var21 = this.aShortArray3826[var18] * var19 + this.aShortArray3810[var18] * var20 + 32767 >> 16;
                                       this.aShortArray3826[var18] = (short)(this.aShortArray3826[var18] * var20 - this.aShortArray3810[var18] * var19 + 32767 >> 16);
                                       this.aShortArray3810[var18] = (short)var21;
                                    }

                                    if(var3 != 0) {
                                       var19 = Rasterizer.sineTable[var3];
                                       var20 = Rasterizer.cosineTable[var3];
                                       var21 = this.aShortArray3826[var18] * var20 - this.aShortArray3837[var18] * var19 + 32767 >> 16;
                                       this.aShortArray3837[var18] = (short)(this.aShortArray3826[var18] * var19 + this.aShortArray3837[var18] * var20 + 32767 >> 16);
                                       this.aShortArray3826[var18] = (short)var21;
                                    }

                                    if(var4 != 0) {
                                       var19 = Rasterizer.sineTable[var4];
                                       var20 = Rasterizer.cosineTable[var4];
                                       var21 = this.aShortArray3837[var18] * var19 + this.aShortArray3810[var18] * var20 + 32767 >> 16;
                                       this.aShortArray3837[var18] = (short)(this.aShortArray3837[var18] * var20 - this.aShortArray3810[var18] * var19 + 32767 >> 16);
                                       this.aShortArray3810[var18] = (short)var21;
                                    }
                                 }
                              }
                           }
                        }
                     }

                     if(this.aClass121_3815 != null) {
                        this.aClass121_3815.aBoolean1640 = false;
                     }
                  }
               }

            } else if(var1 == 3) {
               if(var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var47 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var14 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(aBoolean3868) {
                     var16 = var8[0] * anInt3859 + var8[3] * anInt3865 + var8[6] * anInt3862 + 16384 >> 15;
                     var17 = var8[1] * anInt3859 + var8[4] * anInt3865 + var8[7] * anInt3862 + 16384 >> 15;
                     var18 = var8[2] * anInt3859 + var8[5] * anInt3865 + var8[8] * anInt3862 + 16384 >> 15;
                     var16 += var13;
                     var17 += var14;
                     var18 += var15;
                     anInt3859 = var16;
                     anInt3865 = var17;
                     anInt3862 = var18;
                     aBoolean3868 = false;
                  }

                  var16 = var3 << 15 >> 7;
                  var17 = var4 << 15 >> 7;
                  var18 = var5 << 15 >> 7;
                  var19 = var16 * -anInt3859 + 16384 >> 15;
                  var20 = var17 * -anInt3865 + 16384 >> 15;
                  var21 = var18 * -anInt3862 + 16384 >> 15;
                  var22 = var19 + anInt3859;
                  var23 = var20 + anInt3865;
                  var24 = var21 + anInt3862;
                  int[] var25 = new int[]{var16 * var8[0] + 16384 >> 15, var16 * var8[3] + 16384 >> 15, var16 * var8[6] + 16384 >> 15, var17 * var8[1] + 16384 >> 15, var17 * var8[4] + 16384 >> 15, var17 * var8[7] + 16384 >> 15, var18 * var8[2] + 16384 >> 15, var18 * var8[5] + 16384 >> 15, var18 * var8[8] + 16384 >> 15};
                  var26 = var16 * var13 + 16384 >> 15;
                  var27 = var17 * var14 + 16384 >> 15;
                  var28 = var18 * var15 + 16384 >> 15;
                  var26 += var22;
                  var27 += var23;
                  var28 += var24;
                  int[] var29 = new int[9];

                  int var31;
                  for(var30 = 0; var30 < 3; ++var30) {
                     for(var31 = 0; var31 < 3; ++var31) {
                        var32 = 0;

                        for(var33 = 0; var33 < 3; ++var33) {
                           var32 += var8[var30 * 3 + var33] * var25[var31 + var33 * 3];
                        }

                        var29[var30 * 3 + var31] = var32 + 16384 >> 15;
                     }
                  }

                  var30 = var8[0] * var26 + var8[1] * var27 + var8[2] * var28 + 16384 >> 15;
                  var31 = var8[3] * var26 + var8[4] * var27 + var8[5] * var28 + 16384 >> 15;
                  var32 = var8[6] * var26 + var8[7] * var27 + var8[8] * var28 + 16384 >> 15;
                  var30 += var10;
                  var31 += var11;
                  var32 += var47;

                  for(var33 = 0; var33 < var9; ++var33) {
                     var34 = var2[var33];
                     if(var34 < this.anIntArrayArray3825.length) {
                        var35 = this.anIntArrayArray3825[var34];

                        for(var36 = 0; var36 < var35.length; ++var36) {
                           var37 = var35[var36];
                           if(this.aShortArray3832 == null || (var7 & this.aShortArray3832[var37]) != 0) {
                              var38 = var29[0] * this.xVertices[var37] + var29[1] * this.yVertices[var37] + var29[2] * this.zVertices[var37] + 16384 >> 15;
                              var39 = var29[3] * this.xVertices[var37] + var29[4] * this.yVertices[var37] + var29[5] * this.zVertices[var37] + 16384 >> 15;
                              var40 = var29[6] * this.xVertices[var37] + var29[7] * this.yVertices[var37] + var29[8] * this.zVertices[var37] + 16384 >> 15;
                              var38 += var30;
                              var39 += var31;
                              var40 += var32;
                              this.xVertices[var37] = var38;
                              this.yVertices[var37] = var39;
                              this.zVertices[var37] = var40;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray3825.length) {
                        var12 = this.anIntArrayArray3825[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var14 = var12[var13];
                           if(this.aShortArray3832 == null || (var7 & this.aShortArray3832[var14]) != 0) {
                              this.xVertices[var14] -= anInt3859;
                              this.yVertices[var14] -= anInt3865;
                              this.zVertices[var14] -= anInt3862;
                              this.xVertices[var14] = this.xVertices[var14] * var3 >> 7;
                              this.yVertices[var14] = this.yVertices[var14] * var4 >> 7;
                              this.zVertices[var14] = this.zVertices[var14] * var5 >> 7;
                              this.xVertices[var14] += anInt3859;
                              this.yVertices[var14] += anInt3865;
                              this.zVertices[var14] += anInt3862;
                           }
                        }
                     }
                  }
               }

            } else if(var1 == 5) {
               if(this.anIntArrayArray3829 != null && this.triangleTransparencies != null) {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray3829.length) {
                        var12 = this.anIntArrayArray3829[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var14 = var12[var13];
                           if(this.aShortArray3813 == null || (var7 & this.aShortArray3813[var14]) != 0) {
                              var15 = (this.triangleTransparencies[var14] & 255) + var3 * 8;
                              if(var15 < 0) {
                                 var15 = 0;
                              } else if(var15 > 255) {
                                 var15 = 255;
                              }

                              this.triangleTransparencies[var14] = (byte)var15;
                           }
                        }

                        if(var12.length > 0) {
                           this.aClass121_3814.aBoolean1640 = false;
                        }
                     }
                  }
               }

            } else if(var1 == 7) {
               if(this.anIntArrayArray3829 != null) {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray3829.length) {
                        var12 = this.anIntArrayArray3829[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var14 = var12[var13];
                           if(this.aShortArray3813 == null || (var7 & this.aShortArray3813[var14]) != 0) {
                              var15 = this.triangleColors[var14] & '\uffff';
                              var16 = var15 >> 10 & 63;
                              var17 = var15 >> 7 & 7;
                              var18 = var15 & 127;
                              var16 = var16 + var3 & 63;
                              var17 += var4 / 4;
                              if(var17 < 0) {
                                 var17 = 0;
                              } else if(var17 > 7) {
                                 var17 = 7;
                              }

                              var18 += var5;
                              if(var18 < 0) {
                                 var18 = 0;
                              } else if(var18 > 127) {
                                 var18 = 127;
                              }

                              this.triangleColors[var14] = (short)(var16 << 10 | var17 << 7 | var18);
                           }
                        }

                        if(var12.length > 0) {
                           this.aClass121_3814.aBoolean1640 = false;
                        }
                     }
                  }
               }

            }
         }
      }
   }

   final int method1871() {
      if(!this.aClass6_3835.calculated) {
         this.calculateBounds();
      }

      return this.aClass6_3835.highestY;
   }

   final void method1908() {
      int[] var1;
      int var2;
      int var3;
      int var4;
      if(this.anIntArray3844 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.vertexCount; ++var3) {
            var4 = this.anIntArray3844[var3] & 255;
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.anIntArrayArray3825 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.anIntArrayArray3825[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.vertexCount; this.anIntArrayArray3825[var4][var1[var4]++] = var3++) {
            var4 = this.anIntArray3844[var3] & 255;
         }

         this.anIntArray3844 = null;
      }

      if(this.triangleTSkins != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.anInt3852; ++var3) {
            var4 = this.triangleTSkins[var3] & 255;
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.anIntArrayArray3829 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.anIntArrayArray3829[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.anInt3852; this.anIntArrayArray3829[var4][var1[var4]++] = var3++) {
            var4 = this.triangleTSkins[var3] & 255;
         }

         this.triangleTSkins = null;
      }

   }

   final void method1909(int var1) {
      this.aShort3819 = (short)var1;
      if(this.aClass121_3815 != null) {
         this.aClass121_3815.aBoolean1640 = false;
      }

   }

   private static final void method1910(int var0, int var1, int var2, int var3, int var4, int var5, float[] var6, int var7, float var8) {
      var0 -= var3;
      var1 -= var4;
      var2 -= var5;
      float var9 = (float)var0 * var6[0] + (float)var1 * var6[1] + (float)var2 * var6[2];
      float var10 = (float)var0 * var6[3] + (float)var1 * var6[4] + (float)var2 * var6[5];
      float var11 = (float)var0 * var6[6] + (float)var1 * var6[7] + (float)var2 * var6[8];
      float var12 = (float)Math.sqrt((double)(var9 * var9 + var10 * var10 + var11 * var11));
      float var13 = (float)Math.atan2((double)var9, (double)var11) / 6.2831855F + 0.5F;
      float var14 = (float)Math.asin((double)(var10 / var12)) / 3.1415927F + 0.5F + var8;
      float var15;
      if(var7 == 1) {
         var15 = var13;
         var13 = -var14;
         var14 = var15;
      } else if(var7 == 2) {
         var13 = -var13;
         var14 = -var14;
      } else if(var7 == 3) {
         var15 = var13;
         var13 = var14;
         var14 = -var15;
      }

      aFloat3867 = var13;
      aFloat3860 = var14;
   }

   final void method1911() {
      if(this.aShortArray3810 == null) {
         this.rotate180();
      } else {
         int var1;
         for(var1 = 0; var1 < this.vertexCount; ++var1) {
            this.xVertices[var1] = -this.xVertices[var1];
            this.zVertices[var1] = -this.zVertices[var1];
         }

         for(var1 = 0; var1 < this.anInt3833; ++var1) {
            this.aShortArray3810[var1] = (short)(-this.aShortArray3810[var1]);
            this.aShortArray3837[var1] = (short)(-this.aShortArray3837[var1]);
         }

         this.aClass6_3835.calculated = false;
         this.aClass121_3839.aBoolean1640 = false;
         if(this.aClass121_3815 != null) {
            this.aClass121_3815.aBoolean1640 = false;
         }

      }
   }

   final void scale(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.vertexCount; ++var4) {
         this.xVertices[var4] = this.xVertices[var4] * var1 >> 7;
         this.yVertices[var4] = this.yVertices[var4] * var2 >> 7;
         this.zVertices[var4] = this.zVertices[var4] * var3 >> 7;
      }

      this.aClass6_3835.calculated = false;
      this.aClass121_3839.aBoolean1640 = false;
   }

   final AbstractModel method1894(boolean var1, boolean var2, boolean var3) {
      return this.method1923(var1, var2, var3, aClass140_Sub1_Sub1_3850, aClass140_Sub1_Sub1_3842);
   }

   final void rotate180() {
      for(int var1 = 0; var1 < this.vertexCount; ++var1) {
         this.xVertices[var1] = -this.xVertices[var1];
         this.zVertices[var1] = -this.zVertices[var1];
      }

      this.aClass6_3835.calculated = false;
      this.aClass121_3839.aBoolean1640 = false;
   }

   private final void method1912() {
      if(aClass3_Sub30_3818.buf.length < this.anInt3833 * 12) {
         aClass3_Sub30_3818 = new Buffer((this.anInt3833 + 100) * 12);
      } else {
         aClass3_Sub30_3818.pos = 0;
      }

      int var1;
      if(HDToolkit.isBigEndianOrder) {
         for(var1 = 0; var1 < this.anInt3852; ++var1) {
            aClass3_Sub30_3818.putInt(this.aShortArray3811[var1]);
            aClass3_Sub30_3818.putInt(this.aShortArray3830[var1]);
            aClass3_Sub30_3818.putInt(this.aShortArray3831[var1]);
         }
      } else {
         for(var1 = 0; var1 < this.anInt3852; ++var1) {
            aClass3_Sub30_3818.putLEInt(this.aShortArray3811[var1]);
            aClass3_Sub30_3818.putLEInt(this.aShortArray3830[var1]);
            aClass3_Sub30_3818.putLEInt(this.aShortArray3831[var1]);
         }
      }

      if(HDToolkit.isBufferAnObject) {
         VertexBuffer var3 = new VertexBuffer();
         ByteBuffer var2 = ByteBuffer.wrap(aClass3_Sub30_3818.buf, 0, aClass3_Sub30_3818.pos);
         var3.method2172(var2);
         this.aClass121_3846.aBoolean1640 = true;
         this.aClass121_3846.pointer = null;
         this.aClass121_3846.aClass156_1643 = var3;
      } else {
         ByteBuffer var4 = ByteBuffer.allocateDirect(aClass3_Sub30_3818.pos);
         var4.put(aClass3_Sub30_3818.buf, 0, aClass3_Sub30_3818.pos);
         var4.flip();
         this.aClass121_3846.aBoolean1640 = true;
         this.aClass121_3846.pointer = var4;
         this.aClass121_3846.aClass156_1643 = null;
      }

   }

   private static final void method1913(int var0, int var1, int var2, int var3, int var4, int var5, int var6, float[] var7, int var8, float var9, float var10, float var11) {
      var0 -= var3;
      var1 -= var4;
      var2 -= var5;
      float var12 = (float)var0 * var7[0] + (float)var1 * var7[1] + (float)var2 * var7[2];
      float var13 = (float)var0 * var7[3] + (float)var1 * var7[4] + (float)var2 * var7[5];
      float var14 = (float)var0 * var7[6] + (float)var1 * var7[7] + (float)var2 * var7[8];
      float var15;
      float var16;
      if(var6 == 0) {
         var15 = var12 + var9 + 0.5F;
         var16 = -var14 + var11 + 0.5F;
      } else if(var6 == 1) {
         var15 = var12 + var9 + 0.5F;
         var16 = var14 + var11 + 0.5F;
      } else if(var6 == 2) {
         var15 = -var12 + var9 + 0.5F;
         var16 = -var13 + var10 + 0.5F;
      } else if(var6 == 3) {
         var15 = var12 + var9 + 0.5F;
         var16 = -var13 + var10 + 0.5F;
      } else if(var6 == 4) {
         var15 = var14 + var11 + 0.5F;
         var16 = -var13 + var10 + 0.5F;
      } else {
         var15 = -var14 + var11 + 0.5F;
         var16 = -var13 + var10 + 0.5F;
      }

      float var17;
      if(var8 == 1) {
         var17 = var15;
         var15 = -var16;
         var16 = var17;
      } else if(var8 == 2) {
         var15 = -var15;
         var16 = -var16;
      } else if(var8 == 3) {
         var17 = var15;
         var15 = var16;
         var16 = -var17;
      }

      aFloat3864 = var15;
      aFloat3858 = var16;
   }

   final void method1914(int var1) {
      this.aShort3849 = (short)var1;
      this.aClass121_3814.aBoolean1640 = false;
   }

   public static void method1915() {
      aLongArray3821 = null;
      aClass3_Sub30_3818 = null;
      aByteBuffer3834 = null;
      aClass140_Sub1_Sub1_3842 = null;
      aClass140_Sub1_Sub1_3850 = null;
      aClass140_Sub1_Sub1_3853 = null;
      aClass140_Sub1_Sub1_3854 = null;
      aClass140_Sub1_Sub1_3855 = null;
      aClass140_Sub1_Sub1_3856 = null;
      anIntArray3861 = null;
      anIntArray3857 = null;
   }

   final boolean method1873() {
      if(this.anIntArrayArray3825 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.vertexCount; ++var1) {
            this.xVertices[var1] <<= 4;
            this.yVertices[var1] <<= 4;
            this.zVertices[var1] <<= 4;
         }

         anInt3859 = 0;
         anInt3865 = 0;
         anInt3862 = 0;
         return true;
      }
   }

   final void method1916(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.anInt3852; ++var3) {
         if(this.triangleTextureIds[var3] == var1) {
            this.triangleTextureIds[var3] = var2;
         }
      }

      var3 = 0;
      int var4 = 0;
      if(var1 != -1) {
         var3 = Rasterizer.anInterface2_838.method19(-125, var1 & '\uffff');
         var4 = Rasterizer.anInterface2_838.method10(-98, var1 & '\uffff');
      }

      int var5 = 0;
      int var6 = 0;
      if(var2 != -1) {
         var5 = Rasterizer.anInterface2_838.method19(57, var2 & '\uffff');
         var6 = Rasterizer.anInterface2_838.method10(-114, var2 & '\uffff');
      }

      if(var3 != var5 || var4 != var6) {
         this.aClass121_3814.aBoolean1640 = false;
      }

   }

   private final void calculateBounds() {
      int lowestX = 32767;
      int highestY = 32767;
      int highestZ = 32767;
      int highestX = -32768;
      int lowestY = -32768;
      int lowestZ = -32768;
      int var7 = 0;
      //int var8 = 0;

      for(int var9 = 0; var9 < this.vertexCount; ++var9) {
         int verterX = this.xVertices[var9];
         int verterY = this.yVertices[var9];
         int verterZ = this.zVertices[var9];
         if(verterX < lowestX) {
            lowestX = verterX;
         }

         if(verterX > highestX) {
            highestX = verterX;
         }

         if(verterY < highestY) {
            highestY = verterY;
         }

         if(verterY > lowestY) {
            lowestY = verterY;
         }

         if(verterZ < highestZ) {
            highestZ = verterZ;
         }

         if(verterZ > lowestZ) {
            lowestZ = verterZ;
         }

         int var13 = verterX * verterX + verterZ * verterZ;
         if(var13 > var7) {
            var7 = var13;
         }

        /* var13 = verterX * verterX + verterZ * verterZ + verterY * verterY;
         if(var13 > var8) {
            var8 = var13;
         }*/
      }

      this.aClass6_3835.lowestX = (short)lowestX;
      this.aClass6_3835.highestX = (short)highestX;
      this.aClass6_3835.highestY = (short)highestY;
      this.aClass6_3835.lowestY = (short)lowestY;
      this.aClass6_3835.highestZ = (short)highestZ;
      this.aClass6_3835.lowestZ = (short)lowestZ;
      this.aClass6_3835.aShort93 = (short)((int)(Math.sqrt((double)var7) + 0.99D));
      //Math.sqrt((double)var8);
      this.aClass6_3835.calculated = true;
   }

   final void method1918(short var1, short var2) {
      for(int var3 = 0; var3 < this.anInt3852; ++var3) {
         if(this.triangleColors[var3] == var1) {
            this.triangleColors[var3] = var2;
         }
      }

      this.aClass121_3814.aBoolean1640 = false;
   }

   final void method1919(int var1, int var2, HDModel var3, int[][] var4, int[][] var5, int var6, int var7, int var8) {
      if(!var3.aClass6_3835.calculated) {
         var3.calculateBounds();
      }

      int var9 = var6 + var3.aClass6_3835.lowestX;
      int var10 = var6 + var3.aClass6_3835.highestX;
      int var11 = var8 + var3.aClass6_3835.highestZ;
      int var12 = var8 + var3.aClass6_3835.lowestZ;
      if(var1 != 1 && var1 != 2 && var1 != 3 && var1 != 5 || var9 >= 0 && var10 + 128 >> 7 < var4.length && var11 >= 0 && var12 + 128 >> 7 < var4[0].length) {
         if(var1 != 4 && var1 != 5) {
            var9 >>= 7;
            var10 = var10 + 127 >> 7;
            var11 >>= 7;
            var12 = var12 + 127 >> 7;
            if(var4[var9][var11] == var7 && var4[var10][var11] == var7 && var4[var9][var12] == var7 && var4[var10][var12] == var7) {
               return;
            }
         } else {
            if(var5 == null) {
               return;
            }

            if(var9 < 0 || var10 + 128 >> 7 >= var5.length || var11 < 0 || var12 + 128 >> 7 >= var5[0].length) {
               return;
            }
         }

         int var13;
         int var14;
         int var15;
         int var17;
         int var16;
         int var19;
         int var18;
         int var21;
         int var20;
         int var22;
         if(var1 == 1) {
            for(var13 = 0; var13 < this.vertexCount; ++var13) {
               var14 = this.xVertices[var13] + var6;
               var15 = this.zVertices[var13] + var8;
               var16 = var14 & 127;
               var17 = var15 & 127;
               var18 = var14 >> 7;
               var19 = var15 >> 7;
               var20 = var4[var18][var19] * (128 - var16) + var4[var18 + 1][var19] * var16 >> 7;
               var21 = var4[var18][var19 + 1] * (128 - var16) + var4[var18 + 1][var19 + 1] * var16 >> 7;
               var22 = var20 * (128 - var17) + var21 * var17 >> 7;
               this.yVertices[var13] = this.yVertices[var13] + var22 - var7;
            }
         } else {
            int var23;
            int var24;
            if(var1 == 2) {
               short var26 = var3.aClass6_3835.highestY;

               for(var14 = 0; var14 < this.vertexCount; ++var14) {
                  var15 = (this.yVertices[var14] << 16) / var26;
                  if(var15 < var2) {
                     var16 = this.xVertices[var14] + var6;
                     var17 = this.zVertices[var14] + var8;
                     var18 = var16 & 127;
                     var19 = var17 & 127;
                     var20 = var16 >> 7;
                     var21 = var17 >> 7;
                     var22 = var4[var20][var21] * (128 - var18) + var4[var20 + 1][var21] * var18 >> 7;
                     var23 = var4[var20][var21 + 1] * (128 - var18) + var4[var20 + 1][var21 + 1] * var18 >> 7;
                     var24 = var22 * (128 - var19) + var23 * var19 >> 7;
                     this.yVertices[var14] += (var24 - var7) * (var2 - var15) / var2;
                  }
               }
            } else if(var1 == 3) {
               var13 = (var2 & 255) * 4;
               var14 = (var2 >> 8 & 255) * 4;
               this.method1895(var4, var6, var7, var8, var13, var14);
            } else if(var1 == 4) {
               var13 = var3.aClass6_3835.lowestY - var3.aClass6_3835.highestY;

               for(var14 = 0; var14 < this.vertexCount; ++var14) {
                  var15 = this.xVertices[var14] + var6;
                  var16 = this.zVertices[var14] + var8;
                  var17 = var15 & 127;
                  var18 = var16 & 127;
                  var19 = var15 >> 7;
                  var20 = var16 >> 7;
                  var21 = var5[var19][var20] * (128 - var17) + var5[var19 + 1][var20] * var17 >> 7;
                  var22 = var5[var19][var20 + 1] * (128 - var17) + var5[var19 + 1][var20 + 1] * var17 >> 7;
                  var23 = var21 * (128 - var18) + var22 * var18 >> 7;
                  this.yVertices[var14] = this.yVertices[var14] + (var23 - var7) + var13;
               }
            } else if(var1 == 5) {
               var13 = var3.aClass6_3835.lowestY - var3.aClass6_3835.highestY;

               for(var14 = 0; var14 < this.vertexCount; ++var14) {
                  var15 = this.xVertices[var14] + var6;
                  var16 = this.zVertices[var14] + var8;
                  var17 = var15 & 127;
                  var18 = var16 & 127;
                  var19 = var15 >> 7;
                  var20 = var16 >> 7;
                  var21 = var4[var19][var20] * (128 - var17) + var4[var19 + 1][var20] * var17 >> 7;
                  var22 = var4[var19][var20 + 1] * (128 - var17) + var4[var19 + 1][var20 + 1] * var17 >> 7;
                  var23 = var21 * (128 - var18) + var22 * var18 >> 7;
                  var21 = var5[var19][var20] * (128 - var17) + var5[var19 + 1][var20] * var17 >> 7;
                  var22 = var5[var19][var20 + 1] * (128 - var17) + var5[var19 + 1][var20 + 1] * var17 >> 7;
                  var24 = var21 * (128 - var18) + var22 * var18 >> 7;
                  int var25 = var23 - var24;
                  this.yVertices[var14] = ((this.yVertices[var14] << 8) / var13 * var25 >> 8) - (var7 - var23);
               }
            }
         }

         this.aClass121_3839.aBoolean1640 = false;
         this.aClass6_3835.calculated = false;
      }
   }

   final void method1920(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      if(this.aByte3836 != 0) {
         throw new IllegalArgumentException();
      } else if(this.anInt3833 != 0) {
         if(var7) {
            boolean var8 = !this.aClass121_3814.aBoolean1640 && (var2 || var3 && !DisplayModeInformation.aBoolean1441);
            this.method1922(false, !this.aClass121_3839.aBoolean1640 && var1, var8, this.aClass121_3815 != null && !this.aClass121_3815.aBoolean1640 && var3, !this.aClass121_3817.aBoolean1640 && var4);
            if(!this.aClass121_3846.aBoolean1640 && var5 && var2) {
               this.method1912();
            }
         }

         if(var1) {
            if(this.aClass121_3839.aBoolean1640) {
               if(!this.aClass6_3835.calculated) {
                  this.calculateBounds();
               }

               this.xVertices = null;
               this.yVertices = null;
               this.zVertices = null;
               this.aShortArray3828 = null;
               this.anIntArray3838 = null;
            } else {
               this.aByte3851 = (byte)(this.aByte3851 | 1);
            }
         }

         if(var2) {
            if(this.aClass121_3814.aBoolean1640) {
               this.triangleColors = null;
               this.triangleTransparencies = null;
            } else {
               this.aByte3851 = (byte)(this.aByte3851 | 2);
            }
         }

         if(var3 && DisplayModeInformation.aBoolean1441) {
            if(this.aClass121_3815.aBoolean1640) {
               this.aShortArray3810 = null;
               this.aShortArray3826 = null;
               this.aShortArray3837 = null;
               this.aShortArray3841 = null;
            } else {
               this.aByte3851 = (byte)(this.aByte3851 | 4);
            }
         }

         if(var4) {
            if(this.aClass121_3817.aBoolean1640) {
               this.aFloatArray3824 = null;
               this.aFloatArray3847 = null;
            } else {
               this.aByte3851 = (byte)(this.aByte3851 | 8);
            }
         }

         if(var5 && var2) {
            if(this.aClass121_3846.aBoolean1640 && this.aClass121_3814.aBoolean1640) {
               this.aShortArray3811 = null;
               this.aShortArray3830 = null;
               this.aShortArray3831 = null;
            } else {
               this.aByte3851 = (byte)(this.aByte3851 | 16);
            }
         }

         if(var6) {
            this.anIntArray3844 = null;
            this.triangleTSkins = null;
            this.anIntArrayArray3825 = (int[][])null;
            this.anIntArrayArray3829 = (int[][])null;
         }

      }
   }

   private static final float[] copyFloatArray(float[] var0, int var1) {
      float[] var2 = new float[var1];
      ArrayUtils.arrayCopy(var0, 0, var2, 0, var1);
      return var2;
   }

   private final void method1922(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      int var6 = 0;
      if(var2) {
         this.aClass121_3839.anInt1639 = var6;
         var6 += 12;
      }

      if(var3) {
         this.aClass121_3814.anInt1639 = var6;
         var6 += 4;
      }

      if(var4) {
         this.aClass121_3815.anInt1639 = var6;
         var6 += 12;
      }

      if(var5) {
         this.aClass121_3817.anInt1639 = var6;
         var6 += 8;
      }

      if(var6 != 0) {
         if(aClass3_Sub30_3818.buf.length < this.anInt3833 * var6) {
            aClass3_Sub30_3818 = new Buffer((this.anInt3833 + 100) * var6);
         } else {
            aClass3_Sub30_3818.pos = 0;
         }

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         if(var2) {
            int var14;
            if(HDToolkit.isBigEndianOrder) {
               for(var7 = 0; var7 < this.vertexCount; ++var7) {
                  var8 = Float.floatToRawIntBits((float)this.xVertices[var7]);
                  var9 = Float.floatToRawIntBits((float)this.yVertices[var7]);
                  var10 = Float.floatToRawIntBits((float)this.zVertices[var7]);
                  var11 = this.anIntArray3838[var7];
                  var12 = this.anIntArray3838[var7 + 1];

                  for(var13 = var11; var13 < var12; ++var13) {
                     var14 = this.aShortArray3828[var13] - 1;
                     if(var14 == -1) {
                        break;
                     }

                     aClass3_Sub30_3818.pos = var14 * var6;
                     aClass3_Sub30_3818.putInt(var8);
                     aClass3_Sub30_3818.putInt(var9);
                     aClass3_Sub30_3818.putInt(var10);
                  }
               }
            } else {
               for(var7 = 0; var7 < this.vertexCount; ++var7) {
                  var8 = Float.floatToRawIntBits((float)this.xVertices[var7]);
                  var9 = Float.floatToRawIntBits((float)this.yVertices[var7]);
                  var10 = Float.floatToRawIntBits((float)this.zVertices[var7]);
                  var11 = this.anIntArray3838[var7];
                  var12 = this.anIntArray3838[var7 + 1];

                  for(var13 = var11; var13 < var12; ++var13) {
                     var14 = this.aShortArray3828[var13] - 1;
                     if(var14 == -1) {
                        break;
                     }

                     aClass3_Sub30_3818.pos = var14 * var6;
                     aClass3_Sub30_3818.putLEInt(var8);
                     aClass3_Sub30_3818.putLEInt(var9);
                     aClass3_Sub30_3818.putLEInt(var10);
                  }
               }
            }
         }

         if(var3) {
            if(!DisplayModeInformation.aBoolean1441) {
               var7 = (int)AtmosphereManager.aFloatArray1312[0];
               var8 = (int)AtmosphereManager.aFloatArray1312[1];
               var9 = (int)AtmosphereManager.aFloatArray1312[2];
               var10 = (int)Math.sqrt((double)(var7 * var7 + var8 * var8 + var9 * var9));
               var11 = (int)((float)this.aShort3849 * 1.3F);
               var12 = this.aShort3819 * var10 >> 8;

               for(var13 = 0; var13 < this.anInt3852; ++var13) {
                  short var33 = this.aShortArray3811[var13];
                  short var15 = this.aShortArray3841[var33];
                  int var16;
                  if(var15 < 0) {
                     var16 = -1 - var15;
                  } else {
                     if(var15 != 0) {
                        var16 = var11 + (var7 * this.aShortArray3810[var33] + var8 * this.aShortArray3826[var33] + var9 * this.aShortArray3837[var33]) / (var12 * var15);
                     } else {
                        var16 = var11 + (var7 * this.aShortArray3810[var33] + var8 * this.aShortArray3826[var33] + var9 * this.aShortArray3837[var33]) / (var12 + var12 / 2);
                     }

                     if(var16 < 0) {
                        var16 = 0;
                     } else if(var16 > 16384) {
                        var16 = 16384;
                     }

                     this.aShortArray3841[var33] = (short)(-1 - var16);
                  }

                  short var17 = this.aShortArray3830[var13];
                  short var18 = this.aShortArray3841[var17];
                  int var19;
                  if(var18 < 0) {
                     var19 = -1 - var18;
                  } else {
                     if(var18 != 0) {
                        var19 = var11 + (var7 * this.aShortArray3810[var17] + var8 * this.aShortArray3826[var17] + var9 * this.aShortArray3837[var17]) / (var12 * var18);
                     } else {
                        var19 = var11 + (var7 * this.aShortArray3810[var17] + var8 * this.aShortArray3826[var17] + var9 * this.aShortArray3837[var17]) / (var12 + var12 / 2);
                     }

                     if(var19 < 0) {
                        var19 = 0;
                     } else if(var19 > 16384) {
                        var19 = 16384;
                     }

                     this.aShortArray3841[var17] = (short)(-1 - var19);
                  }

                  short var20 = this.aShortArray3831[var13];
                  short var21 = this.aShortArray3841[var20];
                  int var22;
                  if(var21 < 0) {
                     var22 = -1 - var21;
                  } else {
                     if(var21 != 0) {
                        var22 = var11 + (var7 * this.aShortArray3810[var20] + var8 * this.aShortArray3826[var20] + var9 * this.aShortArray3837[var20]) / (var12 * var21);
                     } else {
                        var22 = var11 + (var7 * this.aShortArray3810[var20] + var8 * this.aShortArray3826[var20] + var9 * this.aShortArray3837[var20]) / (var12 + var12 / 2);
                     }

                     if(var22 < 0) {
                        var22 = 0;
                     } else if(var22 > 16384) {
                        var22 = 16384;
                     }

                     this.aShortArray3841[var20] = (short)(-1 - var22);
                  }

                  int var23 = method1905(this.triangleColors[var13], this.triangleTextureIds[var13], var16, this.triangleTransparencies[var13]);
                  int var24 = method1905(this.triangleColors[var13], this.triangleTextureIds[var13], var19, this.triangleTransparencies[var13]);
                  int var25 = method1905(this.triangleColors[var13], this.triangleTextureIds[var13], var22, this.triangleTransparencies[var13]);
                  aClass3_Sub30_3818.pos = this.aClass121_3814.anInt1639 + var33 * var6;
                  aClass3_Sub30_3818.putInt(var23);
                  aClass3_Sub30_3818.pos = this.aClass121_3814.anInt1639 + var17 * var6;
                  aClass3_Sub30_3818.putInt(var24);
                  aClass3_Sub30_3818.pos = this.aClass121_3814.anInt1639 + var20 * var6;
                  aClass3_Sub30_3818.putInt(var25);
               }

               this.aShortArray3810 = null;
               this.aShortArray3826 = null;
               this.aShortArray3837 = null;
            } else {
               for(var7 = 0; var7 < this.anInt3852; ++var7) {
                  var8 = method1905(this.triangleColors[var7], this.triangleTextureIds[var7], this.aShort3849, this.triangleTransparencies[var7]);
                  aClass3_Sub30_3818.pos = this.aClass121_3814.anInt1639 + this.aShortArray3811[var7] * var6;
                  aClass3_Sub30_3818.putInt(var8);
                  aClass3_Sub30_3818.pos = this.aClass121_3814.anInt1639 + this.aShortArray3830[var7] * var6;
                  aClass3_Sub30_3818.putInt(var8);
                  aClass3_Sub30_3818.pos = this.aClass121_3814.anInt1639 + this.aShortArray3831[var7] * var6;
                  aClass3_Sub30_3818.putInt(var8);
               }
            }
         }

         if(var4) {
            float var27 = 3.0F / (float)this.aShort3819;
            float var26 = 3.0F / (float)(this.aShort3819 + this.aShort3819 / 2);
            aClass3_Sub30_3818.pos = this.aClass121_3815.anInt1639;
            short var30;
            float var32;
            if(HDToolkit.isBigEndianOrder) {
               for(var9 = 0; var9 < this.anInt3833; ++var9) {
                  var30 = this.aShortArray3841[var9];
                  if(var30 == 0) {
                     aClass3_Sub30_3818.method801((float)this.aShortArray3810[var9] * var26);
                     aClass3_Sub30_3818.method801((float)this.aShortArray3826[var9] * var26);
                     aClass3_Sub30_3818.method801((float)this.aShortArray3837[var9] * var26);
                  } else {
                     var32 = var27 / (float)var30;
                     aClass3_Sub30_3818.method801((float)this.aShortArray3810[var9] * var32);
                     aClass3_Sub30_3818.method801((float)this.aShortArray3826[var9] * var32);
                     aClass3_Sub30_3818.method801((float)this.aShortArray3837[var9] * var32);
                  }

                  aClass3_Sub30_3818.pos += var6 - 12;
               }
            } else {
               for(var9 = 0; var9 < this.anInt3833; ++var9) {
                  var30 = this.aShortArray3841[var9];
                  if(var30 == 0) {
                     aClass3_Sub30_3818.method762((float)this.aShortArray3810[var9] * var26);
                     aClass3_Sub30_3818.method762((float)this.aShortArray3826[var9] * var26);
                     aClass3_Sub30_3818.method762((float)this.aShortArray3837[var9] * var26);
                  } else {
                     var32 = var27 / (float)var30;
                     aClass3_Sub30_3818.method762((float)this.aShortArray3810[var9] * var32);
                     aClass3_Sub30_3818.method762((float)this.aShortArray3826[var9] * var32);
                     aClass3_Sub30_3818.method762((float)this.aShortArray3837[var9] * var32);
                  }

                  aClass3_Sub30_3818.pos += var6 - 12;
               }
            }
         }

         if(var5) {
            aClass3_Sub30_3818.pos = this.aClass121_3817.anInt1639;
            if(HDToolkit.isBigEndianOrder) {
               for(var7 = 0; var7 < this.anInt3833; ++var7) {
                  aClass3_Sub30_3818.method801(this.aFloatArray3824[var7]);
                  aClass3_Sub30_3818.method801(this.aFloatArray3847[var7]);
                  aClass3_Sub30_3818.pos += var6 - 8;
               }
            } else {
               for(var7 = 0; var7 < this.anInt3833; ++var7) {
                  aClass3_Sub30_3818.method762(this.aFloatArray3824[var7]);
                  aClass3_Sub30_3818.method762(this.aFloatArray3847[var7]);
                  aClass3_Sub30_3818.pos += var6 - 8;
               }
            }
         }

         aClass3_Sub30_3818.pos = var6 * this.anInt3833;
         ByteBuffer var29;
         if(var1) {
            if(HDToolkit.aBoolean1817) {
               var29 = ByteBuffer.wrap(aClass3_Sub30_3818.buf, 0, aClass3_Sub30_3818.pos);
               if(this.aClass156_3812 == null) {
                  this.aClass156_3812 = new VertexBuffer(true);
                  this.aClass156_3812.method2172(var29);
               } else {
                  this.aClass156_3812.method2168(var29);
               }

               if(var2) {
                  this.aClass121_3839.aBoolean1640 = true;
                  this.aClass121_3839.pointer = null;
                  this.aClass121_3839.aClass156_1643 = this.aClass156_3812;
                  this.aClass121_3839.stride = var6;
               }

               if(var3) {
                  this.aClass121_3814.aBoolean1640 = true;
                  this.aClass121_3814.pointer = null;
                  this.aClass121_3814.aClass156_1643 = this.aClass156_3812;
                  this.aClass121_3814.stride = var6;
               }

               if(var4) {
                  this.aClass121_3815.aBoolean1640 = true;
                  this.aClass121_3815.pointer = null;
                  this.aClass121_3815.aClass156_1643 = this.aClass156_3812;
                  this.aClass121_3815.stride = var6;
               }

               if(var5) {
                  this.aClass121_3817.aBoolean1640 = true;
                  this.aClass121_3817.pointer = null;
                  this.aClass121_3817.aClass156_1643 = this.aClass156_3812;
                  this.aClass121_3817.stride = var6;
               }
            } else {
               if(aByteBuffer3834 != null && aByteBuffer3834.capacity() >= aClass3_Sub30_3818.pos) {
                  aByteBuffer3834.clear();
               } else {
                  aByteBuffer3834 = ByteBuffer.allocateDirect(aClass3_Sub30_3818.pos + 100 * var6);
               }

               aByteBuffer3834.put(aClass3_Sub30_3818.buf, 0, aClass3_Sub30_3818.pos);
               aByteBuffer3834.flip();
               if(var2) {
                  this.aClass121_3839.aBoolean1640 = true;
                  this.aClass121_3839.pointer = aByteBuffer3834;
                  this.aClass121_3839.aClass156_1643 = null;
                  this.aClass121_3839.stride = var6;
               }

               if(var3) {
                  this.aClass121_3814.aBoolean1640 = true;
                  this.aClass121_3814.pointer = aByteBuffer3834;
                  this.aClass121_3839.aClass156_1643 = null;
                  this.aClass121_3814.stride = var6;
               }

               if(var4) {
                  this.aClass121_3815.aBoolean1640 = true;
                  this.aClass121_3815.pointer = aByteBuffer3834;
                  this.aClass121_3815.aClass156_1643 = null;
                  this.aClass121_3815.stride = var6;
               }

               if(var5) {
                  this.aClass121_3817.aBoolean1640 = true;
                  this.aClass121_3817.pointer = aByteBuffer3834;
                  this.aClass121_3817.aClass156_1643 = null;
                  this.aClass121_3817.stride = var6;
               }
            }
         } else if(HDToolkit.isBufferAnObject) {
            VertexBuffer var31 = new VertexBuffer();
            ByteBuffer var28 = ByteBuffer.wrap(aClass3_Sub30_3818.buf, 0, aClass3_Sub30_3818.pos);
            var31.method2172(var28);
            if(var2) {
               this.aClass121_3839.aBoolean1640 = true;
               this.aClass121_3839.pointer = null;
               this.aClass121_3839.aClass156_1643 = var31;
               this.aClass121_3839.stride = var6;
            }

            if(var3) {
               this.aClass121_3814.aBoolean1640 = true;
               this.aClass121_3814.pointer = null;
               this.aClass121_3814.aClass156_1643 = var31;
               this.aClass121_3814.stride = var6;
            }

            if(var4) {
               this.aClass121_3815.aBoolean1640 = true;
               this.aClass121_3815.pointer = null;
               this.aClass121_3815.aClass156_1643 = var31;
               this.aClass121_3815.stride = var6;
            }

            if(var5) {
               this.aClass121_3817.aBoolean1640 = true;
               this.aClass121_3817.pointer = null;
               this.aClass121_3817.aClass156_1643 = var31;
               this.aClass121_3817.stride = var6;
            }
         } else {
            var29 = ByteBuffer.allocateDirect(aClass3_Sub30_3818.pos);
            var29.put(aClass3_Sub30_3818.buf, 0, aClass3_Sub30_3818.pos);
            var29.flip();
            if(var2) {
               this.aClass121_3839.aBoolean1640 = true;
               this.aClass121_3839.pointer = var29;
               this.aClass121_3839.aClass156_1643 = null;
               this.aClass121_3839.stride = var6;
            }

            if(var3) {
               this.aClass121_3814.aBoolean1640 = true;
               this.aClass121_3814.pointer = var29;
               this.aClass121_3839.aClass156_1643 = null;
               this.aClass121_3814.stride = var6;
            }

            if(var4) {
               this.aClass121_3815.aBoolean1640 = true;
               this.aClass121_3815.pointer = var29;
               this.aClass121_3815.aClass156_1643 = null;
               this.aClass121_3815.stride = var6;
            }

            if(var5) {
               this.aClass121_3817.aBoolean1640 = true;
               this.aClass121_3817.pointer = var29;
               this.aClass121_3817.aClass156_1643 = null;
               this.aClass121_3817.stride = var6;
            }
         }

      }
   }

   private final AbstractModel method1923(boolean var1, boolean var2, boolean var3, HDModel var4, HDModel var5) {
      var4.vertexCount = this.vertexCount;
      var4.anInt3833 = this.anInt3833;
      var4.anInt3852 = this.anInt3852;
      var4.aShort3849 = this.aShort3849;
      var4.aShort3819 = this.aShort3819;
      var4.aByte3836 = (byte)(1 | (var1 && var2?0:2) | (var3?0:4));
      if(var4.xVertices == null || var4.xVertices.length < this.vertexCount) {
         var4.xVertices = new int[this.vertexCount + 100];
         var4.yVertices = new int[this.vertexCount + 100];
         var4.zVertices = new int[this.vertexCount + 100];
      }

      int var6;
      for(var6 = 0; var6 < this.vertexCount; ++var6) {
         var4.xVertices[var6] = this.xVertices[var6];
         var4.yVertices[var6] = this.yVertices[var6];
         var4.zVertices[var6] = this.zVertices[var6];
      }

      if(var4.aClass121_3839 == null) {
         var4.aClass121_3839 = new Class121();
      }

      var4.aClass121_3839.aBoolean1640 = false;
      if(var4.aClass6_3835 == null) {
         var4.aClass6_3835 = new Class6();
      }

      var4.aClass6_3835.calculated = false;
      if(var1) {
         var4.triangleTransparencies = this.triangleTransparencies;
      } else {
         if(var5.triangleTransparencies == null || var5.triangleTransparencies.length < this.anInt3852) {
            var5.triangleTransparencies = new byte[this.anInt3852 + 100];
         }

         var4.triangleTransparencies = var5.triangleTransparencies;

         for(var6 = 0; var6 < this.anInt3852; ++var6) {
            var4.triangleTransparencies[var6] = this.triangleTransparencies[var6];
         }
      }

      if(var2) {
         var4.triangleColors = this.triangleColors;
      } else {
         if(var5.triangleColors == null || var5.triangleColors.length < this.anInt3852) {
            var5.triangleColors = new short[this.anInt3852 + 100];
         }

         var4.triangleColors = var5.triangleColors;

         for(var6 = 0; var6 < this.anInt3852; ++var6) {
            var4.triangleColors[var6] = this.triangleColors[var6];
         }
      }

      if(var1 && var2) {
         var4.aClass121_3814 = this.aClass121_3814;
      } else {
         if(var5.aClass121_3814 == null) {
            var5.aClass121_3814 = new Class121();
         }

         var4.aClass121_3814 = var5.aClass121_3814;
         var4.aClass121_3814.aBoolean1640 = false;
      }

      if(!var3 && this.aShortArray3810 != null) {
         if(var5.aShortArray3810 == null || var5.aShortArray3810.length < this.anInt3833) {
            var5.aShortArray3810 = new short[this.anInt3833 + 100];
            var5.aShortArray3826 = new short[this.anInt3833 + 100];
            var5.aShortArray3837 = new short[this.anInt3833 + 100];
            var5.aShortArray3841 = new short[this.anInt3833 + 100];
         }

         var4.aShortArray3810 = var5.aShortArray3810;
         var4.aShortArray3826 = var5.aShortArray3826;
         var4.aShortArray3837 = var5.aShortArray3837;
         var4.aShortArray3841 = var5.aShortArray3841;

         for(var6 = 0; var6 < this.anInt3833; ++var6) {
            var4.aShortArray3810[var6] = this.aShortArray3810[var6];
            var4.aShortArray3826[var6] = this.aShortArray3826[var6];
            var4.aShortArray3837[var6] = this.aShortArray3837[var6];
            var4.aShortArray3841[var6] = this.aShortArray3841[var6];
         }

         if(DisplayModeInformation.aBoolean1441) {
            if(var5.aClass121_3815 == null) {
               var5.aClass121_3815 = new Class121();
            }

            var4.aClass121_3815 = var5.aClass121_3815;
            var4.aClass121_3815.aBoolean1640 = false;
         } else {
            var4.aClass121_3815 = null;
         }
      } else {
         var4.aShortArray3810 = this.aShortArray3810;
         var4.aShortArray3826 = this.aShortArray3826;
         var4.aShortArray3837 = this.aShortArray3837;
         var4.aShortArray3841 = this.aShortArray3841;
         var4.aClass121_3815 = this.aClass121_3815;
      }

      var4.aFloatArray3824 = this.aFloatArray3824;
      var4.aFloatArray3847 = this.aFloatArray3847;
      var4.anIntArray3844 = this.anIntArray3844;
      var4.anIntArrayArray3825 = this.anIntArrayArray3825;
      var4.aShortArray3811 = this.aShortArray3811;
      var4.aShortArray3830 = this.aShortArray3830;
      var4.aShortArray3831 = this.aShortArray3831;
      var4.triangleTextureIds = this.triangleTextureIds;
      var4.triangleTSkins = this.triangleTSkins;
      var4.anIntArrayArray3829 = this.anIntArrayArray3829;
      var4.aClass121_3817 = this.aClass121_3817;
      var4.aClass121_3846 = this.aClass121_3846;
      var4.anIntArray3840 = this.anIntArray3840;
      var4.aShortArray3828 = this.aShortArray3828;
      var4.anIntArray3838 = this.anIntArray3838;
      var4.aBoolean2699 = this.aBoolean2699;
      var4.aShortArray3832 = this.aShortArray3832;
      var4.aShortArray3813 = this.aShortArray3813;
      return var4;
   }

   final SceneGraphNode method1861(int var1, int var2, int var3) {
      this.aBoolean3809 = false;
      if(this.aClass18_3843 != null) {
         this.aShortArray3810 = this.aClass18_3843.aShortArray417;
         this.aShortArray3826 = this.aClass18_3843.aShortArray419;
         this.aShortArray3837 = this.aClass18_3843.aShortArray418;
         this.aShortArray3841 = this.aClass18_3843.aShortArray416;
         this.aClass18_3843 = null;
      }

      return this;
   }

   final int method1924() {
      return this.aShort3819;
   }

   final void method1925() {
      if(this.aShortArray3810 == null) {
         this.rotate90();
      } else {
         int var1;
         for(var1 = 0; var1 < this.vertexCount; ++var1) {
            int var2 = this.xVertices[var1];
            this.xVertices[var1] = this.zVertices[var1];
            this.zVertices[var1] = -var2;
         }

         for(var1 = 0; var1 < this.anInt3833; ++var1) {
            short var3 = this.aShortArray3810[var1];
            this.aShortArray3810[var1] = this.aShortArray3837[var1];
            this.aShortArray3837[var1] = (short)(-var3);
         }

         this.aClass6_3835.calculated = false;
         this.aClass121_3839.aBoolean1640 = false;
         if(this.aClass121_3815 != null) {
            this.aClass121_3815.aBoolean1640 = false;
         }

      }
   }

   final HDModel method1926(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9, boolean var10, boolean var11) {
      HDModel var12 = new HDModel();
      var12.vertexCount = this.vertexCount;
      var12.anInt3833 = this.anInt3833;
      var12.anInt3852 = this.anInt3852;
      if(var1) {
         var12.xVertices = this.xVertices;
         var12.zVertices = this.zVertices;
      } else {
         var12.xVertices = Class65.arrayCopy(this.xVertices);
         var12.zVertices = Class65.arrayCopy(this.zVertices);
      }

      if(var2) {
         var12.yVertices = this.yVertices;
      } else {
         var12.yVertices = Class65.arrayCopy(this.yVertices);
      }

      if(var1 && var2) {
         var12.aClass121_3839 = this.aClass121_3839;
         var12.aClass6_3835 = this.aClass6_3835;
      } else {
         var12.aClass121_3839 = new Class121();
         var12.aClass6_3835 = new Class6();
      }

      if(var3) {
         var12.triangleColors = this.triangleColors;
      } else {
         var12.triangleColors = OutputStream_Sub1.arrayCopy(this.triangleColors);
      }

      if(var4) {
         var12.triangleTransparencies = this.triangleTransparencies;
      } else {
         var12.triangleTransparencies = Class108.method1655((byte)-46, this.triangleTransparencies);
      }

      if(var3 && var4 && var5 && (var8 && var6 || DisplayModeInformation.aBoolean1441)) {
         var12.aClass121_3814 = this.aClass121_3814;
      } else {
         var12.aClass121_3814 = new Class121();
      }

      if(var6) {
         var12.aShortArray3810 = this.aShortArray3810;
         var12.aShortArray3826 = this.aShortArray3826;
         var12.aShortArray3837 = this.aShortArray3837;
         var12.aShortArray3841 = this.aShortArray3841;
      } else {
         var12.aShortArray3810 = OutputStream_Sub1.arrayCopy(this.aShortArray3810);
         var12.aShortArray3826 = OutputStream_Sub1.arrayCopy(this.aShortArray3826);
         var12.aShortArray3837 = OutputStream_Sub1.arrayCopy(this.aShortArray3837);
         var12.aShortArray3841 = OutputStream_Sub1.arrayCopy(this.aShortArray3841);
      }

      if(DisplayModeInformation.aBoolean1441) {
         if(var6 && var7 && var8) {
            var12.aClass121_3815 = this.aClass121_3815;
         } else {
            var12.aClass121_3815 = new Class121();
         }
      } else {
         var12.aClass121_3815 = null;
      }

      if(var9) {
         var12.aFloatArray3824 = this.aFloatArray3824;
         var12.aFloatArray3847 = this.aFloatArray3847;
         var12.aClass121_3817 = this.aClass121_3817;
      } else {
         var12.aFloatArray3824 = Class3_Sub6.method119(this.aFloatArray3824, 0);
         var12.aFloatArray3847 = Class3_Sub6.method119(this.aFloatArray3847, 0);
         var12.aClass121_3817 = new Class121();
      }

      if(var10) {
         var12.aShortArray3811 = this.aShortArray3811;
         var12.aShortArray3830 = this.aShortArray3830;
         var12.aShortArray3831 = this.aShortArray3831;
         var12.aClass121_3846 = this.aClass121_3846;
      } else {
         var12.aShortArray3811 = OutputStream_Sub1.arrayCopy(this.aShortArray3811);
         var12.aShortArray3830 = OutputStream_Sub1.arrayCopy(this.aShortArray3830);
         var12.aShortArray3831 = OutputStream_Sub1.arrayCopy(this.aShortArray3831);
         var12.aClass121_3846 = new Class121();
      }

      if(var11) {
         var12.triangleTextureIds = this.triangleTextureIds;
      } else {
         var12.triangleTextureIds = OutputStream_Sub1.arrayCopy(this.triangleTextureIds);
      }

      var12.anIntArray3844 = this.anIntArray3844;
      var12.anIntArrayArray3825 = this.anIntArrayArray3825;
      var12.triangleTSkins = this.triangleTSkins;
      var12.anIntArrayArray3829 = this.anIntArrayArray3829;
      var12.anIntArray3840 = this.anIntArray3840;
      var12.aShortArray3828 = this.aShortArray3828;
      var12.anIntArray3838 = this.anIntArray3838;
      var12.aShort3849 = this.aShort3849;
      var12.aShort3819 = this.aShort3819;
      var12.aShortArray3832 = this.aShortArray3832;
      var12.aShortArray3813 = this.aShortArray3813;
      return var12;
   }

   final void rotate90() {
      for(int var1 = 0; var1 < this.vertexCount; ++var1) {
         int var2 = this.xVertices[var1];
         this.xVertices[var1] = this.zVertices[var1];
         this.zVertices[var1] = -var2;
      }

      this.aClass6_3835.calculated = false;
      this.aClass121_3839.aBoolean1640 = false;
   }

   private final boolean method1927(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      return var2 < var3 && var2 < var4 && var2 < var5?false:(var2 > var3 && var2 > var4 && var2 > var5?false:(var1 < var6 && var1 < var7 && var1 < var8?false:var1 <= var6 || var1 <= var7 || var1 <= var8));
   }

   private static final short[] copyShortArray(short[] var0, int var1) {
      short[] var2 = new short[var1];
      ArrayUtils.arrayCopy(var0, 0, var2, 0, var1);
      return var2;
   }

   final int method1888() {
      if(!this.aClass6_3835.calculated) {
         this.calculateBounds();
      }

      return this.aClass6_3835.aShort93;
   }

   final void method1891(int var1, int[] var2, int var3, int var4, int var5, boolean var6) {
      int var7 = var2.length;
      int var8;
      int var9;
      int var12;
      int var13;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var8 = 0;
         anInt3859 = 0;
         anInt3865 = 0;
         anInt3862 = 0;

         for(var9 = 0; var9 < var7; ++var9) {
            int var20 = var2[var9];
            if(var20 < this.anIntArrayArray3825.length) {
               int[] var21 = this.anIntArrayArray3825[var20];

               for(var12 = 0; var12 < var21.length; ++var12) {
                  var13 = var21[var12];
                  anInt3859 += this.xVertices[var13];
                  anInt3865 += this.yVertices[var13];
                  anInt3862 += this.zVertices[var13];
                  ++var8;
               }
            }
         }

         if(var8 > 0) {
            anInt3859 = anInt3859 / var8 + var3;
            anInt3865 = anInt3865 / var8 + var4;
            anInt3862 = anInt3862 / var8 + var5;
         } else {
            anInt3859 = var3;
            anInt3865 = var4;
            anInt3862 = var5;
         }

      } else {
         int[] var10;
         int var11;
         if(var1 == 1) {
            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var8 = 0; var8 < var7; ++var8) {
               var9 = var2[var8];
               if(var9 < this.anIntArrayArray3825.length) {
                  var10 = this.anIntArrayArray3825[var9];

                  for(var11 = 0; var11 < var10.length; ++var11) {
                     var12 = var10[var11];
                     this.xVertices[var12] += var3;
                     this.yVertices[var12] += var4;
                     this.zVertices[var12] += var5;
                  }
               }
            }

         } else {
            int var14;
            int var15;
            int var16;
            if(var1 == 2) {
               for(var8 = 0; var8 < var7; ++var8) {
                  var9 = var2[var8];
                  if(var9 < this.anIntArrayArray3825.length) {
                     var10 = this.anIntArrayArray3825[var9];

                     for(var11 = 0; var11 < var10.length; ++var11) {
                        var12 = var10[var11];
                        this.xVertices[var12] -= anInt3859;
                        this.yVertices[var12] -= anInt3865;
                        this.zVertices[var12] -= anInt3862;
                        if(var5 != 0) {
                           var13 = Rasterizer.sineTable[var5];
                           var14 = Rasterizer.cosineTable[var5];
                           var15 = this.yVertices[var12] * var13 + this.xVertices[var12] * var14 + 32767 >> 16;
                           this.yVertices[var12] = this.yVertices[var12] * var14 - this.xVertices[var12] * var13 + 32767 >> 16;
                           this.xVertices[var12] = var15;
                        }

                        if(var3 != 0) {
                           var13 = Rasterizer.sineTable[var3];
                           var14 = Rasterizer.cosineTable[var3];
                           var15 = this.yVertices[var12] * var14 - this.zVertices[var12] * var13 + 32767 >> 16;
                           this.zVertices[var12] = this.yVertices[var12] * var13 + this.zVertices[var12] * var14 + 32767 >> 16;
                           this.yVertices[var12] = var15;
                        }

                        if(var4 != 0) {
                           var13 = Rasterizer.sineTable[var4];
                           var14 = Rasterizer.cosineTable[var4];
                           var15 = this.zVertices[var12] * var13 + this.xVertices[var12] * var14 + 32767 >> 16;
                           this.zVertices[var12] = this.zVertices[var12] * var14 - this.xVertices[var12] * var13 + 32767 >> 16;
                           this.xVertices[var12] = var15;
                        }

                        this.xVertices[var12] += anInt3859;
                        this.yVertices[var12] += anInt3865;
                        this.zVertices[var12] += anInt3862;
                     }
                  }
               }

               if(var6 && this.aShortArray3810 != null) {
                  for(var8 = 0; var8 < var7; ++var8) {
                     var9 = var2[var8];
                     if(var9 < this.anIntArrayArray3825.length) {
                        var10 = this.anIntArrayArray3825[var9];

                        for(var11 = 0; var11 < var10.length; ++var11) {
                           var12 = var10[var11];
                           var13 = this.anIntArray3838[var12];
                           var14 = this.anIntArray3838[var12 + 1];

                           for(var15 = var13; var15 < var14; ++var15) {
                              var16 = this.aShortArray3828[var15] - 1;
                              if(var16 == -1) {
                                 break;
                              }

                              int var17;
                              int var19;
                              int var18;
                              if(var5 != 0) {
                                 var17 = Rasterizer.sineTable[var5];
                                 var18 = Rasterizer.cosineTable[var5];
                                 var19 = this.aShortArray3826[var16] * var17 + this.aShortArray3810[var16] * var18 + 32767 >> 16;
                                 this.aShortArray3826[var16] = (short)(this.aShortArray3826[var16] * var18 - this.aShortArray3810[var16] * var17 + 32767 >> 16);
                                 this.aShortArray3810[var16] = (short)var19;
                              }

                              if(var3 != 0) {
                                 var17 = Rasterizer.sineTable[var3];
                                 var18 = Rasterizer.cosineTable[var3];
                                 var19 = this.aShortArray3826[var16] * var18 - this.aShortArray3837[var16] * var17 + 32767 >> 16;
                                 this.aShortArray3837[var16] = (short)(this.aShortArray3826[var16] * var17 + this.aShortArray3837[var16] * var18 + 32767 >> 16);
                                 this.aShortArray3826[var16] = (short)var19;
                              }

                              if(var4 != 0) {
                                 var17 = Rasterizer.sineTable[var4];
                                 var18 = Rasterizer.cosineTable[var4];
                                 var19 = this.aShortArray3837[var16] * var17 + this.aShortArray3810[var16] * var18 + 32767 >> 16;
                                 this.aShortArray3837[var16] = (short)(this.aShortArray3837[var16] * var18 - this.aShortArray3810[var16] * var17 + 32767 >> 16);
                                 this.aShortArray3810[var16] = (short)var19;
                              }
                           }
                        }
                     }
                  }

                  if(this.aClass121_3815 != null) {
                     this.aClass121_3815.aBoolean1640 = false;
                  }
               }

            } else if(var1 == 3) {
               for(var8 = 0; var8 < var7; ++var8) {
                  var9 = var2[var8];
                  if(var9 < this.anIntArrayArray3825.length) {
                     var10 = this.anIntArrayArray3825[var9];

                     for(var11 = 0; var11 < var10.length; ++var11) {
                        var12 = var10[var11];
                        this.xVertices[var12] -= anInt3859;
                        this.yVertices[var12] -= anInt3865;
                        this.zVertices[var12] -= anInt3862;
                        this.xVertices[var12] = this.xVertices[var12] * var3 >> 7;
                        this.yVertices[var12] = this.yVertices[var12] * var4 >> 7;
                        this.zVertices[var12] = this.zVertices[var12] * var5 >> 7;
                        this.xVertices[var12] += anInt3859;
                        this.yVertices[var12] += anInt3865;
                        this.zVertices[var12] += anInt3862;
                     }
                  }
               }

            } else if(var1 == 5) {
               if(this.anIntArrayArray3829 != null && this.triangleTransparencies != null) {
                  for(var8 = 0; var8 < var7; ++var8) {
                     var9 = var2[var8];
                     if(var9 < this.anIntArrayArray3829.length) {
                        var10 = this.anIntArrayArray3829[var9];

                        for(var11 = 0; var11 < var10.length; ++var11) {
                           var12 = var10[var11];
                           var13 = (this.triangleTransparencies[var12] & 255) + var3 * 8;
                           if(var13 < 0) {
                              var13 = 0;
                           } else if(var13 > 255) {
                              var13 = 255;
                           }

                           this.triangleTransparencies[var12] = (byte)var13;
                        }

                        if(var10.length > 0) {
                           this.aClass121_3814.aBoolean1640 = false;
                        }
                     }
                  }
               }

            } else if(var1 == 7) {
               if(this.anIntArrayArray3829 != null) {
                  for(var8 = 0; var8 < var7; ++var8) {
                     var9 = var2[var8];
                     if(var9 < this.anIntArrayArray3829.length) {
                        var10 = this.anIntArrayArray3829[var9];

                        for(var11 = 0; var11 < var10.length; ++var11) {
                           var12 = var10[var11];
                           var13 = this.triangleColors[var12] & '\uffff';
                           var14 = var13 >> 10 & 63;
                           var15 = var13 >> 7 & 7;
                           var16 = var13 & 127;
                           var14 = var14 + var3 & 63;
                           var15 += var4 / 4;
                           if(var15 < 0) {
                              var15 = 0;
                           } else if(var15 > 7) {
                              var15 = 7;
                           }

                           var16 += var5;
                           if(var16 < 0) {
                              var16 = 0;
                           } else if(var16 > 127) {
                              var16 = 127;
                           }

                           this.triangleColors[var12] = (short)(var14 << 10 | var15 << 7 | var16);
                        }

                        if(var10.length > 0) {
                           this.aClass121_3814.aBoolean1640 = false;
                        }
                     }
                  }
               }

            }
         }
      }
   }

   final void method1889(int var1, int var2, int var3, int var4) {
      int var5;
      int var6;
      if(var1 == 0) {
         var5 = 0;
         anInt3859 = 0;
         anInt3865 = 0;
         anInt3862 = 0;

         for(var6 = 0; var6 < this.vertexCount; ++var6) {
            anInt3859 += this.xVertices[var6];
            anInt3865 += this.yVertices[var6];
            anInt3862 += this.zVertices[var6];
            ++var5;
         }

         if(var5 > 0) {
            anInt3859 = anInt3859 / var5 + var2;
            anInt3865 = anInt3865 / var5 + var3;
            anInt3862 = anInt3862 / var5 + var4;
         } else {
            anInt3859 = var2;
            anInt3865 = var3;
            anInt3862 = var4;
         }

      } else if(var1 == 1) {
         for(var5 = 0; var5 < this.vertexCount; ++var5) {
            this.xVertices[var5] += var2;
            this.yVertices[var5] += var3;
            this.zVertices[var5] += var4;
         }

      } else {
         int var7;
         int var8;
         if(var1 == 2) {
            for(var5 = 0; var5 < this.vertexCount; ++var5) {
               this.xVertices[var5] -= anInt3859;
               this.yVertices[var5] -= anInt3865;
               this.zVertices[var5] -= anInt3862;
               if(var4 != 0) {
                  var6 = Rasterizer.sineTable[var4];
                  var7 = Rasterizer.cosineTable[var4];
                  var8 = this.yVertices[var5] * var6 + this.xVertices[var5] * var7 + 32767 >> 16;
                  this.yVertices[var5] = this.yVertices[var5] * var7 - this.xVertices[var5] * var6 + 32767 >> 16;
                  this.xVertices[var5] = var8;
               }

               if(var2 != 0) {
                  var6 = Rasterizer.sineTable[var2];
                  var7 = Rasterizer.cosineTable[var2];
                  var8 = this.yVertices[var5] * var7 - this.zVertices[var5] * var6 + 32767 >> 16;
                  this.zVertices[var5] = this.yVertices[var5] * var6 + this.zVertices[var5] * var7 + 32767 >> 16;
                  this.yVertices[var5] = var8;
               }

               if(var3 != 0) {
                  var6 = Rasterizer.sineTable[var3];
                  var7 = Rasterizer.cosineTable[var3];
                  var8 = this.zVertices[var5] * var6 + this.xVertices[var5] * var7 + 32767 >> 16;
                  this.zVertices[var5] = this.zVertices[var5] * var7 - this.xVertices[var5] * var6 + 32767 >> 16;
                  this.xVertices[var5] = var8;
               }

               this.xVertices[var5] += anInt3859;
               this.yVertices[var5] += anInt3865;
               this.zVertices[var5] += anInt3862;
            }

         } else if(var1 != 3) {
            if(var1 == 5) {
               for(var5 = 0; var5 < this.anInt3852; ++var5) {
                  var6 = (this.triangleTransparencies[var5] & 255) + var2 * 8;
                  if(var6 < 0) {
                     var6 = 0;
                  } else if(var6 > 255) {
                     var6 = 255;
                  }

                  this.triangleTransparencies[var5] = (byte)var6;
               }

               this.aClass121_3814.aBoolean1640 = false;
            } else if(var1 == 7) {
               for(var5 = 0; var5 < this.anInt3852; ++var5) {
                  var6 = this.triangleColors[var5] & '\uffff';
                  var7 = var6 >> 10 & 63;
                  var8 = var6 >> 7 & 7;
                  int var9 = var6 & 127;
                  var7 = var7 + var2 & 63;
                  var8 += var3 / 4;
                  if(var8 < 0) {
                     var8 = 0;
                  } else if(var8 > 7) {
                     var8 = 7;
                  }

                  var9 += var4;
                  if(var9 < 0) {
                     var9 = 0;
                  } else if(var9 > 127) {
                     var9 = 127;
                  }

                  this.triangleColors[var5] = (short)(var7 << 10 | var8 << 7 | var9);
               }

               this.aClass121_3814.aBoolean1640 = false;
            }
         } else {
            for(var5 = 0; var5 < this.vertexCount; ++var5) {
               this.xVertices[var5] -= anInt3859;
               this.yVertices[var5] -= anInt3865;
               this.zVertices[var5] -= anInt3862;
               this.xVertices[var5] = this.xVertices[var5] * var2 / 128;
               this.yVertices[var5] = this.yVertices[var5] * var3 / 128;
               this.zVertices[var5] = this.zVertices[var5] * var4 / 128;
               this.xVertices[var5] += anInt3859;
               this.yVertices[var5] += anInt3865;
               this.zVertices[var5] += anInt3862;
            }

         }
      }
   }

   static final void method1929() {
      aClass140_Sub1_Sub1_3842 = new HDModel();
      aClass140_Sub1_Sub1_3850 = new HDModel();
      aClass140_Sub1_Sub1_3853 = new HDModel();
      aClass140_Sub1_Sub1_3854 = new HDModel();
      aClass140_Sub1_Sub1_3855 = new HDModel();
      aClass140_Sub1_Sub1_3856 = new HDModel();
   }

   final int method1884() {
      if(!this.aClass6_3835.calculated) {
         this.calculateBounds();
      }

      return this.aClass6_3835.lowestX;
   }

   private final void method1930() {
	   GL var1 = HDToolkit.gl;
	   if(this.anInt3852 != 0) {
		   if(this.aByte3836 != 0) {
			   this.method1922(true, !this.aClass121_3839.aBoolean1640 && (this.aByte3836 & 1) != 0, !this.aClass121_3814.aBoolean1640 && (this.aByte3836 & 2) != 0, this.aClass121_3815 != null && !this.aClass121_3815.aBoolean1640 && (this.aByte3836 & 4) != 0, false);
		   }

		   this.method1922(false, !this.aClass121_3839.aBoolean1640, !this.aClass121_3814.aBoolean1640, this.aClass121_3815 != null && !this.aClass121_3815.aBoolean1640, !this.aClass121_3817.aBoolean1640);
		   if(!this.aClass121_3846.aBoolean1640) {
			   this.method1912();
		   }

         if(this.aByte3851 != 0) {
            if((this.aByte3851 & 1) != 0) {
               this.xVertices = null;
               this.yVertices = null;
               this.zVertices = null;
               this.aShortArray3828 = null;
               this.anIntArray3838 = null;
            }

            if((this.aByte3851 & 2) != 0) {
               this.triangleColors = null;
               this.triangleTransparencies = null;
            }

            if((this.aByte3851 & 4) != 0) {
               this.aShortArray3810 = null;
               this.aShortArray3826 = null;
               this.aShortArray3837 = null;
               this.aShortArray3841 = null;
            }

            if((this.aByte3851 & 8) != 0) {
               this.aFloatArray3824 = null;
               this.aFloatArray3847 = null;
            }

            if((this.aByte3851 & 16) != 0) {
               this.aShortArray3811 = null;
               this.aShortArray3830 = null;
               this.aShortArray3831 = null;
            }

            this.aByte3851 = 0;
         }

         VertexBuffer var2 = null;
         if(this.aClass121_3839.aClass156_1643 != null) {
            this.aClass121_3839.aClass156_1643.method2169();
            var2 = this.aClass121_3839.aClass156_1643;
            var1.glVertexPointer(3, 5126, this.aClass121_3839.stride, (long)this.aClass121_3839.anInt1639);
         }

         if(this.aClass121_3814.aClass156_1643 != null) {
            if(var2 != this.aClass121_3814.aClass156_1643) {
               this.aClass121_3814.aClass156_1643.method2169();
               var2 = this.aClass121_3814.aClass156_1643;
            }

            var1.glColorPointer(4, 5121, this.aClass121_3814.stride, (long)this.aClass121_3814.anInt1639);
         }

         if(DisplayModeInformation.aBoolean1441 && this.aClass121_3815.aClass156_1643 != null) {
            if(var2 != this.aClass121_3815.aClass156_1643) {
               this.aClass121_3815.aClass156_1643.method2169();
               var2 = this.aClass121_3815.aClass156_1643;
            }

            var1.glNormalPointer(5126, this.aClass121_3815.stride, (long)this.aClass121_3815.anInt1639);
         }

         if(this.aClass121_3817.aClass156_1643 != null) {
            if(var2 != this.aClass121_3817.aClass156_1643) {
               this.aClass121_3817.aClass156_1643.method2169();
               var2 = this.aClass121_3817.aClass156_1643;
            }

            var1.glTexCoordPointer(2, 5126, this.aClass121_3817.stride, (long)this.aClass121_3817.anInt1639);
         }

         if(this.aClass121_3846.aClass156_1643 != null) {
            this.aClass121_3846.aClass156_1643.method2171();
         }

         if(this.aClass121_3839.aClass156_1643 == null || this.aClass121_3814.aClass156_1643 == null || DisplayModeInformation.aBoolean1441 && this.aClass121_3815.aClass156_1643 == null || this.aClass121_3817.aClass156_1643 == null) {
            if(HDToolkit.isBufferAnObject) {
               var1.glBindBufferARB('\u8892', 0);
            }

            if(this.aClass121_3839.aClass156_1643 == null) {
               this.aClass121_3839.pointer.position(this.aClass121_3839.anInt1639);
               var1.glVertexPointer(3, 5126, this.aClass121_3839.stride, this.aClass121_3839.pointer);
            }

            if(this.aClass121_3814.aClass156_1643 == null) {
               this.aClass121_3814.pointer.position(this.aClass121_3814.anInt1639);
               var1.glColorPointer(4, 5121, this.aClass121_3814.stride, this.aClass121_3814.pointer);
            }

            if(DisplayModeInformation.aBoolean1441 && this.aClass121_3815.aClass156_1643 == null) {
               this.aClass121_3815.pointer.position(this.aClass121_3815.anInt1639);
               var1.glNormalPointer(5126, this.aClass121_3815.stride, this.aClass121_3815.pointer);
            }

            if(this.aClass121_3817.aClass156_1643 == null) {
               this.aClass121_3817.pointer.position(this.aClass121_3817.anInt1639);
               var1.glTexCoordPointer(2, 5126, this.aClass121_3817.stride, this.aClass121_3817.pointer);
            }
         }

         if(this.aClass121_3846.aClass156_1643 == null && HDToolkit.isBufferAnObject) {
            var1.glBindBufferARB('\u8893', 0);
         }

         int var3 = this.anIntArray3840.length - 1;

         for(int var4 = 0; var4 < var3; ++var4) {
            int var5 = this.anIntArray3840[var4];
            int var6 = this.anIntArray3840[var4 + 1];
            short var7 = this.triangleTextureIds[var5];
            if(var7 == -1) {
               HDToolkit.bindTexture(-1);
               Class3_Sub28_Sub4.method551(0, 0);
            } else {
               Rasterizer.anInterface2_838.method8(var7 & 0xffff, true);
            }

            if(this.aClass121_3846.aClass156_1643 != null) {
               var1.glDrawElements(4, (var6 - var5) * 3, 5125, (long)(var5 * 12));
            } else {
               this.aClass121_3846.pointer.position(var5 * 12);
               var1.glDrawElements(4, (var6 - var5) * 3, 5125, this.aClass121_3846.pointer);
            }
         }

      }
   }

   final void method1879() {
      for(int var1 = 0; var1 < this.vertexCount; ++var1) {
         this.xVertices[var1] = this.xVertices[var1] + 7 >> 4;
         this.yVertices[var1] = this.yVertices[var1] + 7 >> 4;
         this.zVertices[var1] = this.zVertices[var1] + 7 >> 4;
      }

      this.aClass6_3835.calculated = false;
      this.aClass121_3839.aBoolean1640 = false;
   }

   final void method1931() {
      int var1;
      for(var1 = 0; var1 < this.vertexCount; ++var1) {
         this.zVertices[var1] = -this.zVertices[var1];
      }

      if(this.aShortArray3837 != null) {
         for(var1 = 0; var1 < this.anInt3833; ++var1) {
            this.aShortArray3837[var1] = (short)(-this.aShortArray3837[var1]);
         }
      }

      for(var1 = 0; var1 < this.anInt3852; ++var1) {
         short var2 = this.aShortArray3811[var1];
         this.aShortArray3811[var1] = this.aShortArray3831[var1];
         this.aShortArray3831[var1] = var2;
      }

      this.aClass6_3835.calculated = false;
      this.aClass121_3839.aBoolean1640 = false;
      if(this.aClass121_3815 != null) {
         this.aClass121_3815.aBoolean1640 = false;
      }

      this.aClass121_3846.aBoolean1640 = false;
   }

   final void method1896(int var1) {
      int var2 = Rasterizer.sineTable[var1];
      int var3 = Rasterizer.cosineTable[var1];

      for(int var4 = 0; var4 < this.vertexCount; ++var4) {
         int var5 = this.yVertices[var4] * var3 - this.zVertices[var4] * var2 >> 16;
         this.zVertices[var4] = this.yVertices[var4] * var2 + this.zVertices[var4] * var3 >> 16;
         this.yVertices[var4] = var5;
      }

      this.aClass6_3835.calculated = false;
      this.aClass121_3839.aBoolean1640 = false;
   }

   final void method1932(int var1) {
      if(this.aShortArray3810 == null) {
         this.method1876(var1);
      } else {
         int var2 = Rasterizer.sineTable[var1];
         int var3 = Rasterizer.cosineTable[var1];

         int var4;
         int var5;
         for(var4 = 0; var4 < this.vertexCount; ++var4) {
            var5 = this.zVertices[var4] * var2 + this.xVertices[var4] * var3 >> 16;
            this.zVertices[var4] = this.zVertices[var4] * var3 - this.xVertices[var4] * var2 >> 16;
            this.xVertices[var4] = var5;
         }

         for(var4 = 0; var4 < this.anInt3833; ++var4) {
            var5 = this.aShortArray3837[var4] * var2 + this.aShortArray3810[var4] * var3 >> 16;
            this.aShortArray3837[var4] = (short)(this.aShortArray3837[var4] * var3 - this.aShortArray3810[var4] * var2 >> 16);
            this.aShortArray3810[var4] = (short)var5;
         }

         this.aClass6_3835.calculated = false;
         this.aClass121_3839.aBoolean1640 = false;
         if(this.aClass121_3815 != null) {
            this.aClass121_3815.aBoolean1640 = false;
         }

      }
   }

   final LDIndexedSprite method1933(LDIndexedSprite var1) {
      if(this.anInt3833 == 0) {
         return null;
      } else {
         if(!this.aClass6_3835.calculated) {
            this.calculateBounds();
         }

         int var2;
         int var3;
         if(AtmosphereManager.anInt1314 > 0) {
            var2 = this.aClass6_3835.lowestX - (this.aClass6_3835.lowestY * AtmosphereManager.anInt1314 >> 8) >> 3;
            var3 = this.aClass6_3835.highestX - (this.aClass6_3835.highestY * AtmosphereManager.anInt1314 >> 8) >> 3;
         } else {
            var2 = this.aClass6_3835.lowestX - (this.aClass6_3835.highestY * AtmosphereManager.anInt1314 >> 8) >> 3;
            var3 = this.aClass6_3835.highestX - (this.aClass6_3835.lowestY * AtmosphereManager.anInt1314 >> 8) >> 3;
         }

         int var4;
         int var5;
         if(AtmosphereManager.anInt1315 > 0) {
            var4 = this.aClass6_3835.highestZ - (this.aClass6_3835.lowestY * AtmosphereManager.anInt1315 >> 8) >> 3;
            var5 = this.aClass6_3835.lowestZ - (this.aClass6_3835.highestY * AtmosphereManager.anInt1315 >> 8) >> 3;
         } else {
            var4 = this.aClass6_3835.highestZ - (this.aClass6_3835.highestY * AtmosphereManager.anInt1315 >> 8) >> 3;
            var5 = this.aClass6_3835.lowestZ - (this.aClass6_3835.lowestY * AtmosphereManager.anInt1315 >> 8) >> 3;
         }

         int var6 = var3 - var2 + 1;
         int var7 = var5 - var4 + 1;
         LDIndexedSprite var8;
         if(var1 != null && var1.indicators.length >= var6 * var7) {
            var8 = var1;
            var1.trimWidth = var1.width = var6;
            var1.trimHeight = var1.height = var7;
            var1.method1671();
         } else {
            var8 = new LDIndexedSprite(var6, var7, 0);
         }

         var8.offsetX = var2;
         var8.offsetY = var4;
         if(anIntArray3861.length < this.anInt3833) {
            anIntArray3861 = new int[this.anInt3833];
            anIntArray3857 = new int[this.anInt3833];
         }

         int var9 = 0;

         int var13;
         int var14;
         int var15;
         while(var9 < this.vertexCount) {
            int var10 = (this.xVertices[var9] - (this.yVertices[var9] * AtmosphereManager.anInt1314 >> 8) >> 3) - var2;
            int var11 = (this.zVertices[var9] - (this.yVertices[var9] * AtmosphereManager.anInt1315 >> 8) >> 3) - var4;
            int var12 = this.anIntArray3838[var9];
            var13 = this.anIntArray3838[var9 + 1];
            var14 = var12;

            while(true) {
               if(var14 < var13) {
                  var15 = this.aShortArray3828[var14] - 1;
                  if(var15 != -1) {
                     anIntArray3861[var15] = var10;
                     anIntArray3857[var15] = var11;
                     ++var14;
                     continue;
                  }
               }

               ++var9;
               break;
            }
         }

         for(var9 = 0; var9 < this.anInt3852; ++var9) {
            if(this.triangleTransparencies[var9] <= 128) {
               short var20 = this.aShortArray3811[var9];
               short var19 = this.aShortArray3830[var9];
               short var21 = this.aShortArray3831[var9];
               var13 = anIntArray3861[var20];
               var14 = anIntArray3861[var19];
               var15 = anIntArray3861[var21];
               int var16 = anIntArray3857[var20];
               int var17 = anIntArray3857[var19];
               int var18 = anIntArray3857[var21];
               if((var13 - var14) * (var17 - var18) - (var17 - var16) * (var15 - var14) > 0) {
                  Rasterizer.method1147(var8.indicators, var16, var17, var18, var13, var14, var15, var6);
               }
            }
         }

         return var8;
      }
   }

   final void rotate270() {
      for(int var1 = 0; var1 < this.vertexCount; ++var1) {
         int var2 = this.zVertices[var1];
         this.zVertices[var1] = this.xVertices[var1];
         this.xVertices[var1] = -var2;
      }

      this.aClass6_3835.calculated = false;
      this.aClass121_3839.aBoolean1640 = false;
   }

   private HDModel() {}

   HDModel(ModelBuilder var1, int var2, int var3, boolean var4) {
      int[] var5 = new int[var1.triangleCount];
      this.anIntArray3838 = new int[var1.vertexCount + 1];

      for(int var6 = 0; var6 < var1.triangleCount; ++var6) {
         if((var1.triangleFaceTypes == null || var1.triangleFaceTypes[var6] != 2) && (var1.triangleTextureIds == null || var1.triangleTextureIds[var6] == -1 || !Rasterizer.anInterface2_838.method12(var1.triangleTextureIds[var6] & '\uffff'))) {
            var5[this.anInt3852++] = var6;
            ++this.anIntArray3838[var1.trianglesA[var6]];
            ++this.anIntArray3838[var1.trianglesB[var6]];
            ++this.anIntArray3838[var1.trianglesC[var6]];
         }
      }

      long[] var60 = new long[this.anInt3852];

      int var7;
      int var8;
      int var9;
      int var62;
      for(var7 = 0; var7 < this.anInt3852; ++var7) {
         var8 = var5[var7];
         var9 = 0;
         byte var10 = 0;
         int var11 = 0;
         int var12 = 0;
         short textureId = -1;
         if(var1.triangleTextureIds != null) {
            textureId = var1.triangleTextureIds[var8];
            if(textureId != -1) {
               var11 = Rasterizer.anInterface2_838.method18(textureId & '\uffff', 255);
               var12 = Rasterizer.anInterface2_838.method9(textureId & '\uffff', false);
            }
         }

         boolean var14 = var1.triangleTransparencies != null && var1.triangleTransparencies[var8] != 0 || textureId != -1 && !Rasterizer.anInterface2_838.method7((byte)88, textureId & '\uffff');
         if((var4 || var14) && var1.trianglePriorities != null) {
            var9 += var1.trianglePriorities[var8] << 17;
         }

         if(var14) {
            var9 += 65536;
         }

         var9 += (var11 & 255) << 8;
         var9 += var12 & 255;
         var62 = var10 + ((textureId & '\uffff') << 16);
         var62 += var7 & '\uffff';
         var60[var7] = ((long)var9 << 32) + (long)var62;
      }

      TextureLoader.method1614(var60, var5);
      this.vertexCount = var1.vertexCount;
      this.xVertices = var1.xVertices;
      this.yVertices = var1.yVertices;
      this.zVertices = var1.zVertices;
      this.anIntArray3844 = var1.vertexVSkins;
      this.aShortArray3832 = var1.aShortArray2893;
      var7 = this.anInt3852 * 3;
      this.aShortArray3810 = new short[var7];
      this.aShortArray3826 = new short[var7];
      this.aShortArray3837 = new short[var7];
      this.aShortArray3841 = new short[var7];
      this.aFloatArray3824 = new float[var7];
      this.aFloatArray3847 = new float[var7];
      this.triangleColors = new short[this.anInt3852];
      this.triangleTransparencies = new byte[this.anInt3852];
      this.aShortArray3811 = new short[this.anInt3852];
      this.aShortArray3830 = new short[this.anInt3852];
      this.aShortArray3831 = new short[this.anInt3852];
      this.triangleTextureIds = new short[this.anInt3852];
      if(var1.triangleTSkins != null) {
         this.triangleTSkins = new byte[this.anInt3852];
      }

      if(var1.aShortArray2855 != null) {
         this.aShortArray3813 = new short[this.anInt3852];
      }

      this.aClass6_3835 = new Class6();
      this.aClass121_3839 = new Class121();
      this.aClass121_3814 = new Class121();
      if(DisplayModeInformation.aBoolean1441) {
         this.aClass121_3815 = new Class121();
      }

      this.aClass121_3817 = new Class121();
      this.aClass121_3846 = new Class121();
      this.aShort3849 = (short)var2;
      this.aShort3819 = (short)var3;
      this.aShortArray3828 = new short[var7];
      aLongArray3821 = new long[var7];
      var8 = 0;

      for(var9 = 0; var9 < var1.vertexCount; ++var9) {
         var62 = this.anIntArray3838[var9];
         this.anIntArray3838[var9] = var8;
         var8 += var62;
      }

      this.anIntArray3838[var1.vertexCount] = var8;
      int[] var63 = null;
      int[] var61 = null;
      int[] var64 = null;
      float[][] var65 = (float[][])null;
      int var27;
      int var68;
      float var79;
      float var75;
      float var82;
      if(var1.aByteArray2866 != null) {
         var68 = var1.anInt2862;
         int[] var69 = new int[var68];
         int[] var15 = new int[var68];
         int[] var16 = new int[var68];
         int[] var17 = new int[var68];
         int[] var18 = new int[var68];
         int[] var19 = new int[var68];

         int var20;
         for(var20 = 0; var20 < var68; ++var20) {
            var69[var20] = Integer.MAX_VALUE;
            var15[var20] = -2147483647;
            var16[var20] = Integer.MAX_VALUE;
            var17[var20] = -2147483647;
            var18[var20] = Integer.MAX_VALUE;
            var19[var20] = -2147483647;
         }

         for(var20 = 0; var20 < this.anInt3852; ++var20) {
            int var21 = var5[var20];
            if(var1.aByteArray2866[var21] != -1) {
               int var22 = var1.aByteArray2866[var21] & 255;

               for(int var23 = 0; var23 < 3; ++var23) {
                  int var24;
                  if(var23 == 0) {
                     var24 = var1.trianglesA[var21];
                  } else if(var23 == 1) {
                     var24 = var1.trianglesB[var21];
                  } else {
                     var24 = var1.trianglesC[var21];
                  }

                  int var25 = var1.xVertices[var24];
                  int var26 = var1.yVertices[var24];
                  var27 = var1.zVertices[var24];
                  if(var25 < var69[var22]) {
                     var69[var22] = var25;
                  }

                  if(var25 > var15[var22]) {
                     var15[var22] = var25;
                  }

                  if(var26 < var16[var22]) {
                     var16[var22] = var26;
                  }

                  if(var26 > var17[var22]) {
                     var17[var22] = var26;
                  }

                  if(var27 < var18[var22]) {
                     var18[var22] = var27;
                  }

                  if(var27 > var19[var22]) {
                     var19[var22] = var27;
                  }
               }
            }
         }

         var63 = new int[var68];
         var61 = new int[var68];
         var64 = new int[var68];
         var65 = new float[var68][];

         for(var20 = 0; var20 < var68; ++var20) {
            byte var76 = var1.aByteArray2857[var20];
            if(var76 > 0) {
               var63[var20] = (var69[var20] + var15[var20]) / 2;
               var61[var20] = (var16[var20] + var17[var20]) / 2;
               var64[var20] = (var18[var20] + var19[var20]) / 2;
               if(var76 == 1) {
                  short var80 = var1.aShortArray2888[var20];
                  if(var80 == 0) {
                     var75 = 1.0F;
                     var79 = 1.0F;
                  } else if(var80 > 0) {
                     var75 = 1.0F;
                     var79 = (float)var80 / 1024.0F;
                  } else {
                     var79 = 1.0F;
                     var75 = (float)(-var80) / 1024.0F;
                  }

                  var82 = 64.0F / (float)(var1.aShortArray2882[var20] & '\uffff');
               } else if(var76 == 2) {
                  var75 = 64.0F / (float)(var1.aShortArray2888[var20] & '\uffff');
                  var82 = 64.0F / (float)(var1.aShortArray2882[var20] & '\uffff');
                  var79 = 64.0F / (float)(var1.aShortArray2851[var20] & '\uffff');
               } else {
                  var75 = (float)var1.aShortArray2888[var20] / 1024.0F;
                  var82 = (float)var1.aShortArray2882[var20] / 1024.0F;
                  var79 = (float)var1.aShortArray2851[var20] / 1024.0F;
               }

               var65[var20] = method1906(var1.texTrianglesA[var20], var1.texTrianglesB[var20], var1.texTrianglesC[var20], var1.aByteArray2845[var20] & 255, var75, var82, var79);
            }
         }
      }

      short var71;
      int var67;
      for(var68 = 0; var68 < this.anInt3852; ++var68) {
         int var70 = var5[var68];
         var67 = var1.triangleColors[var70] & '\uffff';
         if(var1.triangleTextureIds == null) {
            var71 = -1;
         } else {
            var71 = var1.triangleTextureIds[var70];
         }
         
         int var72;
         if(var1.aByteArray2866 == null) {
            var72 = -1;
         } else {
            var72 = var1.aByteArray2866[var70];
         }

         int var74;
         if(var1.triangleTransparencies == null) {
            var74 = 0;
         } else {
            var74 = var1.triangleTransparencies[var70] & 255;
         }

         float var73 = 0.0F;
         float var78 = 0.0F;
         float var77 = 0.0F;
         var75 = 0.0F;
         var82 = 0.0F;
         var79 = 0.0F;
         byte var81 = 0;
         byte var83 = 0;
         var27 = 0;
         byte var28;
         int var31;
         int var87;
         if(var71 != -1) {
            if(var72 == -1) {
               var73 = 0.0F;
               var78 = 1.0F;
               var77 = 1.0F;
               var75 = 1.0F;
               var81 = 1;
               var82 = 0.0F;
               var79 = 0.0F;
               var83 = 2;
            } else {
               var72 &= 255;
               var28 = var1.aByteArray2857[var72];
               int var29;
               int var30;
               float var38;
               float var39;
               float var37;
               float var51;
               float var50;
               float var49;
               float var54;
               float var53;
               float var52;
               if(var28 == 0) {
                  var29 = var1.trianglesA[var70];
                  var30 = var1.trianglesB[var70];
                  var31 = var1.trianglesC[var70];
                  short var32 = var1.texTrianglesA[var72];
                  short var33 = var1.texTrianglesB[var72];
                  short var34 = var1.texTrianglesC[var72];
                  float var35 = (float)var1.xVertices[var32];
                  float var36 = (float)var1.yVertices[var32];
                  var37 = (float)var1.zVertices[var32];
                  var38 = (float)var1.xVertices[var33] - var35;
                  var39 = (float)var1.yVertices[var33] - var36;
                  float var40 = (float)var1.zVertices[var33] - var37;
                  float var41 = (float)var1.xVertices[var34] - var35;
                  float var42 = (float)var1.yVertices[var34] - var36;
                  float var43 = (float)var1.zVertices[var34] - var37;
                  float var44 = (float)var1.xVertices[var29] - var35;
                  float var45 = (float)var1.yVertices[var29] - var36;
                  float var46 = (float)var1.zVertices[var29] - var37;
                  float var47 = (float)var1.xVertices[var30] - var35;
                  float var48 = (float)var1.yVertices[var30] - var36;
                  var49 = (float)var1.zVertices[var30] - var37;
                  var50 = (float)var1.xVertices[var31] - var35;
                  var51 = (float)var1.yVertices[var31] - var36;
                  var52 = (float)var1.zVertices[var31] - var37;
                  var53 = var39 * var43 - var40 * var42;
                  var54 = var40 * var41 - var38 * var43;
                  float var55 = var38 * var42 - var39 * var41;
                  float var56 = var42 * var55 - var43 * var54;
                  float var57 = var43 * var53 - var41 * var55;
                  float var58 = var41 * var54 - var42 * var53;
                  float var59 = 1.0F / (var56 * var38 + var57 * var39 + var58 * var40);
                  var73 = (var56 * var44 + var57 * var45 + var58 * var46) * var59;
                  var77 = (var56 * var47 + var57 * var48 + var58 * var49) * var59;
                  var82 = (var56 * var50 + var57 * var51 + var58 * var52) * var59;
                  var56 = var39 * var55 - var40 * var54;
                  var57 = var40 * var53 - var38 * var55;
                  var58 = var38 * var54 - var39 * var53;
                  var59 = 1.0F / (var56 * var41 + var57 * var42 + var58 * var43);
                  var78 = (var56 * var44 + var57 * var45 + var58 * var46) * var59;
                  var75 = (var56 * var47 + var57 * var48 + var58 * var49) * var59;
                  var79 = (var56 * var50 + var57 * var51 + var58 * var52) * var59;
               } else {
                  var29 = var1.trianglesA[var70];
                  var30 = var1.trianglesB[var70];
                  var31 = var1.trianglesC[var70];
                  int var88 = var63[var72];
                  var87 = var61[var72];
                  int var94 = var64[var72];
                  float[] var93 = var65[var72];
                  byte var90 = var1.aByteArray2867[var72];
                  var37 = (float)var1.aByteArray2877[var72] / 256.0F;
                  if(var28 == 1) {
                     var38 = (float)(var1.aShortArray2851[var72] & '\uffff') / 1024.0F;
                     method1904(var1.xVertices[var29], var1.yVertices[var29], var1.zVertices[var29], var88, var87, var94, var93, var38, var90, var37);
                     var73 = aFloat3863;
                     var78 = aFloat3866;
                     method1904(var1.xVertices[var30], var1.yVertices[var30], var1.zVertices[var30], var88, var87, var94, var93, var38, var90, var37);
                     var77 = aFloat3863;
                     var75 = aFloat3866;
                     method1904(var1.xVertices[var31], var1.yVertices[var31], var1.zVertices[var31], var88, var87, var94, var93, var38, var90, var37);
                     var82 = aFloat3863;
                     var79 = aFloat3866;
                     var39 = var38 / 2.0F;
                     if((var90 & 1) == 0) {
                        if(var77 - var73 > var39) {
                           var77 -= var38;
                           var81 = 1;
                        } else if(var73 - var77 > var39) {
                           var77 += var38;
                           var81 = 2;
                        }

                        if(var82 - var73 > var39) {
                           var82 -= var38;
                           var83 = 1;
                        } else if(var73 - var82 > var39) {
                           var82 += var38;
                           var83 = 2;
                        }
                     } else {
                        if(var75 - var78 > var39) {
                           var75 -= var38;
                           var81 = 1;
                        } else if(var78 - var75 > var39) {
                           var75 += var38;
                           var81 = 2;
                        }

                        if(var79 - var78 > var39) {
                           var79 -= var38;
                           var83 = 1;
                        } else if(var78 - var79 > var39) {
                           var79 += var38;
                           var83 = 2;
                        }
                     }
                  } else if(var28 == 2) {
                     var38 = (float)var1.aByteArray2852[var72] / 256.0F;
                     var39 = (float)var1.aByteArray2869[var72] / 256.0F;
                     int var97 = var1.xVertices[var30] - var1.xVertices[var29];
                     int var96 = var1.yVertices[var30] - var1.yVertices[var29];
                     int var101 = var1.zVertices[var30] - var1.zVertices[var29];
                     int var102 = var1.xVertices[var31] - var1.xVertices[var29];
                     int var103 = var1.yVertices[var31] - var1.yVertices[var29];
                     int var98 = var1.zVertices[var31] - var1.zVertices[var29];
                     int var99 = var96 * var98 - var103 * var101;
                     int var100 = var101 * var102 - var98 * var97;
                     int var104 = var97 * var103 - var102 * var96;
                     var49 = 64.0F / (float)(var1.aShortArray2888[var72] & '\uffff');
                     var50 = 64.0F / (float)(var1.aShortArray2882[var72] & '\uffff');
                     var51 = 64.0F / (float)(var1.aShortArray2851[var72] & '\uffff');
                     var52 = ((float)var99 * var93[0] + (float)var100 * var93[1] + (float)var104 * var93[2]) / var49;
                     var53 = ((float)var99 * var93[3] + (float)var100 * var93[4] + (float)var104 * var93[5]) / var50;
                     var54 = ((float)var99 * var93[6] + (float)var100 * var93[7] + (float)var104 * var93[8]) / var51;
                     var27 = method1901(var52, var53, var54);
                     method1913(var1.xVertices[var29], var1.yVertices[var29], var1.zVertices[var29], var88, var87, var94, var27, var93, var90, var37, var38, var39);
                     var73 = aFloat3864;
                     var78 = aFloat3858;
                     method1913(var1.xVertices[var30], var1.yVertices[var30], var1.zVertices[var30], var88, var87, var94, var27, var93, var90, var37, var38, var39);
                     var77 = aFloat3864;
                     var75 = aFloat3858;
                     method1913(var1.xVertices[var31], var1.yVertices[var31], var1.zVertices[var31], var88, var87, var94, var27, var93, var90, var37, var38, var39);
                     var82 = aFloat3864;
                     var79 = aFloat3858;
                  } else if(var28 == 3) {
                     method1910(var1.xVertices[var29], var1.yVertices[var29], var1.zVertices[var29], var88, var87, var94, var93, var90, var37);
                     var73 = aFloat3867;
                     var78 = aFloat3860;
                     method1910(var1.xVertices[var30], var1.yVertices[var30], var1.zVertices[var30], var88, var87, var94, var93, var90, var37);
                     var77 = aFloat3867;
                     var75 = aFloat3860;
                     method1910(var1.xVertices[var31], var1.yVertices[var31], var1.zVertices[var31], var88, var87, var94, var93, var90, var37);
                     var82 = aFloat3867;
                     var79 = aFloat3860;
                     if((var90 & 1) == 0) {
                        if(var77 - var73 > 0.5F) {
                           --var77;
                           var81 = 1;
                        } else if(var73 - var77 > 0.5F) {
                           ++var77;
                           var81 = 2;
                        }

                        if(var82 - var73 > 0.5F) {
                           --var82;
                           var83 = 1;
                        } else if(var73 - var82 > 0.5F) {
                           ++var82;
                           var83 = 2;
                        }
                     } else {
                        if(var75 - var78 > 0.5F) {
                           --var75;
                           var81 = 1;
                        } else if(var78 - var75 > 0.5F) {
                           ++var75;
                           var81 = 2;
                        }

                        if(var79 - var78 > 0.5F) {
                           --var79;
                           var83 = 1;
                        } else if(var78 - var79 > 0.5F) {
                           ++var79;
                           var83 = 2;
                        }
                     }
                  }
               }
            }
         }

         var1.calculateNormals();
         if(var1.triangleFaceTypes == null) {
            var28 = 0;
         } else {
            var28 = var1.triangleFaceTypes[var70];
         }

         if(var28 == 0) {
            long var86 = (long)(var72 << 2) + ((long)(var27 << 24) + (long)(var67 << 8) + (long)var74 << 32);
            var31 = var1.trianglesA[var70];
            Vertex var89 = var1.normalVertices[var31];
            this.aShortArray3811[var68] = this.method1907(var1, var31, var86, var89.x, var89.y, var89.z, var89.size, var73, var78);
            var87 = var1.trianglesB[var70];
            Vertex var95 = var1.normalVertices[var87];
            this.aShortArray3830[var68] = this.method1907(var1, var87, var86 + (long)var81, var95.x, var95.y, var95.z, var95.size, var77, var75);
            int var92 = var1.trianglesC[var70];
            Vertex var91 = var1.normalVertices[var92];
            this.aShortArray3831[var68] = this.method1907(var1, var92, var86 + (long)var83, var91.x, var91.y, var91.z, var91.size, var82, var79);
         } else if(var28 == 1) {
            FixedVertex var85 = var1.fixedNormalVertices[var70];
            long var84 = (long)((var72 << 2) + (var85.x > 0?1024:2048) + (var85.y + 256 << 12) + (var85.z + 256 << 22)) + ((long)(var27 << 24) + (long)(var67 << 8) + (long)var74 << 32);
            this.aShortArray3811[var68] = this.method1907(var1, var1.trianglesA[var70], var84, var85.x, var85.y, var85.z, 0, var73, var78);
            this.aShortArray3830[var68] = this.method1907(var1, var1.trianglesB[var70], var84 + (long)var81, var85.x, var85.y, var85.z, 0, var77, var75);
            this.aShortArray3831[var68] = this.method1907(var1, var1.trianglesC[var70], var84 + (long)var83, var85.x, var85.y, var85.z, 0, var82, var79);
         }

         if(var1.triangleTextureIds != null) {
            this.triangleTextureIds[var68] = var1.triangleTextureIds[var70];
         } else {
            this.triangleTextureIds[var68] = -1;
         }

         if(this.triangleTSkins != null) {
            this.triangleTSkins[var68] = (byte)var1.triangleTSkins[var70];
         }

         this.triangleColors[var68] = var1.triangleColors[var70];
         if(var1.triangleTransparencies != null) {
            this.triangleTransparencies[var68] = var1.triangleTransparencies[var70];
         }

         if(var1.aShortArray2855 != null) {
            this.aShortArray3813[var68] = var1.aShortArray2855[var70];
         }
      }

      var68 = 0;
      short var66 = -10000;

      for(var67 = 0; var67 < this.anInt3852; ++var67) {
         var71 = this.triangleTextureIds[var67];
         if(var71 != var66) {
            ++var68;
            var66 = var71;
         }
      }

      this.anIntArray3840 = new int[var68 + 1];
      var68 = 0;
      var66 = -10000;

      for(var67 = 0; var67 < this.anInt3852; ++var67) {
         var71 = this.triangleTextureIds[var67];
         if(var71 != var66) {
            this.anIntArray3840[var68++] = var67;
            var66 = var71;
         }
      }

      this.anIntArray3840[var68] = this.anInt3852;
      aLongArray3821 = null;
      this.aShortArray3810 = copyShortArray(this.aShortArray3810, this.anInt3833);
      this.aShortArray3826 = copyShortArray(this.aShortArray3826, this.anInt3833);
      this.aShortArray3837 = copyShortArray(this.aShortArray3837, this.anInt3833);
      this.aShortArray3841 = copyShortArray(this.aShortArray3841, this.anInt3833);
      this.aFloatArray3824 = copyFloatArray(this.aFloatArray3824, this.anInt3833);
      this.aFloatArray3847 = copyFloatArray(this.aFloatArray3847, this.anInt3833);
   }

}
