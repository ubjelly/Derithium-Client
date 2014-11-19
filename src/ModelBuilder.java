
final class ModelBuilder extends SceneGraphNode {

   byte[] triangleTransparencies;
   private short aShort2844;
   byte[] aByteArray2845;
   short[] texTrianglesB;
   int[] triangleTSkins;
   byte aByte2848 = 0;
   int triangleCount = 0;
   private short aShort2850;
   short[] aShortArray2851;
   byte[] aByteArray2852;
   private boolean boundsCalculated = false;
   private short aShort2854;
   short[] aShortArray2855;
   int[][] anIntArrayArray2856;
   byte[] aByteArray2857;
   short[] triangleTextureIds;
   byte[] triangleFaceTypes;
   int[] vertexVSkins;
   private static int[] anIntArray2861 = new int[10000];
   int anInt2862;
   private static int[] anIntArray2863 = Rasterizer.cosineTable;
   int[] trianglesC;
   int[] trianglesA;
   byte[] aByteArray2866;
   byte[] aByteArray2867;
   private static int anInt2868 = 0;
   byte[] aByteArray2869;
   short[] triangleColors;
   private static int[] anIntArray2871 = Rasterizer.sineTable;
   Vertex[] normalVertices;
   private short aShort2873;
   private short aShort2874;
   private static int[] anIntArray2875 = new int[10000];
   short aShort2876;
   byte[] aByteArray2877;
   int[] trianglesB;
   short aShort2879;
   private short aShort2880;
   int[] yVertices;
   short[] aShortArray2882;
   Vertex[] aClass50Array2883;
   short[] texTrianglesA;
   int[] xVertices;
   FixedVertex[] fixedNormalVertices;
   int vertexCount = 0;
   short[] aShortArray2888;
   byte[] trianglePriorities;
   int[][] anIntArrayArray2890;
   short[] texTrianglesC;
   int[] zVertices;
   short[] aShortArray2893;
   int size = 12;
   int t;//TODO - new var?


   final void method1989() {
      for(int var1 = 0; var1 < vertexCount; ++var1) {
         xVertices[var1] = -xVertices[var1];
         zVertices[var1] = -zVertices[var1];
      }

      method2007();
   }

   public static void method1990() {
      anIntArray2861 = null;
      anIntArray2875 = null;
      anIntArray2871 = null;
      anIntArray2863 = null;
   }

   final void method1991() {
      for(int var1 = 0; var1 < vertexCount; ++var1) {
         int var2 = xVertices[var1];
         xVertices[var1] = zVertices[var1];
         zVertices[var1] = -var2;
      }

      method2007();
   }

   private final void method1992(int var1) {
      int var2 = anIntArray2871[var1];
      int var3 = anIntArray2863[var1];

      for(int var4 = 0; var4 < vertexCount; ++var4) {
         int var5 = yVertices[var4] * var2 + xVertices[var4] * var3 >> 16;
         yVertices[var4] = yVertices[var4] * var3 - xVertices[var4] * var2 >> 16;
         xVertices[var4] = var5;
      }

      method2007();
   }

   private final void calculateBounds() {
      if(!boundsCalculated) {
         boundsCalculated = true;
         int var1 = 32767;
         int var2 = 32767;
         int var3 = 32767;
         int var4 = -32768;
         int var5 = -32768;
         int var6 = -32768;

         for(int var7 = 0; var7 < vertexCount; ++var7) {
            int var8 = xVertices[var7];
            int var9 = yVertices[var7];
            int var10 = zVertices[var7];
            if(var8 < var1) {
               var1 = var8;
            }

            if(var8 > var4) {
               var4 = var8;
            }

            if(var9 < var2) {
               var2 = var9;
            }

            if(var9 > var5) {
               var5 = var9;
            }

            if(var10 < var3) {
               var3 = var10;
            }

            if(var10 > var6) {
               var6 = var10;
            }
         }

         aShort2850 = (short)var1;
         aShort2873 = (short)var4;
         aShort2854 = (short)var2;
         aShort2844 = (short)var5;
         aShort2880 = (short)var3;
         aShort2874 = (short)var6;
      }
   }

   final void method1994(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < vertexCount; ++var4) {
         xVertices[var4] = xVertices[var4] * var1 / 128;
         yVertices[var4] = yVertices[var4] * var2 / 128;
         zVertices[var4] = zVertices[var4] * var3 / 128;
      }

      method2007();
   }

   final SceneGraphNode method1861(int var1, int var2, int var3) {
      return convert(aShort2879, aShort2876, var1, var2, var3);
   }

   private final int method1995(ModelBuilder var1, int var2, short var3) {
      int var4 = var1.xVertices[var2];
      int var5 = var1.yVertices[var2];
      int var6 = var1.zVertices[var2];

      for(int var7 = 0; var7 < vertexCount; ++var7) {
         if(var4 == xVertices[var7] && var5 == yVertices[var7] && var6 == zVertices[var7]) {
            aShortArray2893[var7] |= var3;
            return var7;
         }
      }

      xVertices[vertexCount] = var4;
      yVertices[vertexCount] = var5;
      zVertices[vertexCount] = var6;
      aShortArray2893[vertexCount] = var3;
      if(var1.vertexVSkins != null) {
         vertexVSkins[vertexCount] = var1.vertexVSkins[var2];
      }

      return vertexCount++;
   }

   private final void method1996(int[][] var1, int var2, int var3, int var4, int var5, int var6) {
      int var10 = -var5 / 2;
      int var11 = -var6 / 2;
      int var12 = method2009(var1, var2 + var10, var4 + var11);
      int var13 = var5 / 2;
      int var14 = -var6 / 2;
      int var15 = method2009(var1, var2 + var13, var4 + var14);
      int var16 = -var5 / 2;
      int var17 = var6 / 2;
      int var18 = method2009(var1, var2 + var16, var4 + var17);
      int var19 = var5 / 2;
      int var20 = var6 / 2;
      int var21 = method2009(var1, var2 + var19, var4 + var20);
      int var22 = var12 < var15?var12:var15;
      int var23 = var18 < var21?var18:var21;
      int var24 = var15 < var21?var15:var21;
      int var25 = var12 < var18?var12:var18;
      if(var6 != 0) {
         int var26 = (int)(Math.atan2((double)(var22 - var23), (double)var6) * 325.95D) & 2047;
         if(var26 != 0) {
            method2006(var26);
         }
      }

      if(var5 != 0) {
         int var27 = (int)(Math.atan2((double)(var25 - var24), (double)var5) * 325.95D) & 2047;
         if(var27 != 0) {
            method1992(var27);
         }
      }

      int var28 = var12 + var21;
      if(var15 + var18 < var28) {
         var28 = var15 + var18;
      }

      var28 = (var28 >> 1) - var3;
      if(var28 != 0) {
         method2001(0, var28, 0);
      }

   }

   final void render(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, int var11, ParticleEngine var12) {}

	final void calculateNormals() {
		if (normalVertices == null) {
			normalVertices = new Vertex[vertexCount];
			for (int id = 0; id < vertexCount; ++id) {
				normalVertices[id] = new Vertex();
			}
			for (int id = 0; id < triangleCount; ++id) {
				int tA = trianglesA[id];
				int tB = trianglesB[id];
				int tC = trianglesC[id];
				int x1 = xVertices[tB] - xVertices[tA];
				int y1 = yVertices[tB] - yVertices[tA];
				int z1 = zVertices[tB] - zVertices[tA];
				int x2 = xVertices[tC] - xVertices[tA];
				int y2 = yVertices[tC] - yVertices[tA];
				int z2 = zVertices[tC] - zVertices[tA];
				int normalX = y1 * z2 - y2 * z1;
				int normalY = z1 * x2 - z2 * x1;
				int normalZ = x1 * y2 - x2 * y1;
				for (; normalX > 8192 || normalY > 8192 || normalZ > 8192 || normalX < -8192 || normalY < -8192 || normalZ < -8192;) {
					normalX >>= 1;
					normalY >>= 1;
					normalZ >>= 1;
				}

				int normalDst = (int) Math.sqrt((double) (normalX * normalX + normalY * normalY + normalZ * normalZ));
				if (normalDst <= 0) {
					normalDst = 1;
				}

				normalX = normalX * 256 / normalDst;
				normalY = normalY * 256 / normalDst;
				normalZ = normalZ * 256 / normalDst;
				byte face;
				if (triangleFaceTypes == null) {
					face = 0;
				} else {
					face = triangleFaceTypes[id];
				}

				if (face == 0) {
					Vertex var16 = normalVertices[tA];
					var16.x += normalX;
					var16.y += normalY;
					var16.z += normalZ;
					++var16.size;
					var16 = normalVertices[tB];
					var16.x += normalX;
					var16.y += normalY;
					var16.z += normalZ;
					++var16.size;
					var16 = normalVertices[tC];
					var16.x += normalX;
					var16.y += normalY;
					var16.z += normalZ;
					++var16.size;
				} else if (face == 1) {
					if (fixedNormalVertices == null) {
						fixedNormalVertices = new FixedVertex[triangleCount];
					}

					FixedVertex var17 = fixedNormalVertices[id] = new FixedVertex();
					var17.x = normalX;
					var17.y = normalY;
					var17.z = normalZ;
				}
			}

		}
	}

   final void method1998(short var1, short var2) {
      if(triangleTextureIds != null) {
         for(int var3 = 0; var3 < triangleCount; ++var3) {
            if(triangleTextureIds[var3] == var1) {
               triangleTextureIds[var3] = var2;
            }
         }

      }
   }

   final ModelBuilder method1999(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7, boolean var8, boolean var9) {
      calculateBounds();
      int var10 = var5 + aShort2850;
      int var11 = var5 + aShort2873;
      int var12 = var7 + aShort2880;
      int var13 = var7 + aShort2874;
      if((var1 == 1 || var1 == 2 || var1 == 3 || var1 == 5) && (var10 < 0 || var11 + 128 >> 7 >= var3.length || var12 < 0 || var13 + 128 >> 7 >= var3[0].length)) {
         return this;
      } else {
         if(var1 != 4 && var1 != 5) {
            var10 >>= 7;
            var11 = var11 + 127 >> 7;
            var12 >>= 7;
            var13 = var13 + 127 >> 7;
            if(var3[var10][var12] == var6 && var3[var11][var12] == var6 && var3[var10][var13] == var6 && var3[var11][var13] == var6) {
               return this;
            }
         } else {
            if(var4 == null) {
               return this;
            }

            if(var10 < 0 || var11 + 128 >> 7 >= var4.length || var12 < 0 || var13 + 128 >> 7 >= var4[0].length) {
               return this;
            }
         }

         ModelBuilder var14;
         if(var8) {
            var14 = new ModelBuilder();
            var14.vertexCount = vertexCount;
            var14.triangleCount = triangleCount;
            var14.anInt2862 = anInt2862;
            var14.trianglesA = trianglesA;
            var14.trianglesB = trianglesB;
            var14.trianglesC = trianglesC;
            var14.triangleFaceTypes = triangleFaceTypes;
            var14.trianglePriorities = trianglePriorities;
            var14.triangleTransparencies = triangleTransparencies;
            var14.aByteArray2866 = aByteArray2866;
            var14.triangleColors = triangleColors;
            var14.triangleTextureIds = triangleTextureIds;
            var14.aByte2848 = aByte2848;
            var14.aByteArray2857 = aByteArray2857;
            var14.texTrianglesA = texTrianglesA;
            var14.texTrianglesB = texTrianglesB;
            var14.texTrianglesC = texTrianglesC;
            var14.aShortArray2888 = aShortArray2888;
            var14.aShortArray2882 = aShortArray2882;
            var14.aShortArray2851 = aShortArray2851;
            var14.aByteArray2845 = aByteArray2845;
            var14.aByteArray2867 = aByteArray2867;
            var14.aByteArray2877 = aByteArray2877;
            var14.aByteArray2852 = aByteArray2852;
            var14.aByteArray2869 = aByteArray2869;
            var14.vertexVSkins = vertexVSkins;
            var14.triangleTSkins = triangleTSkins;
            var14.anIntArrayArray2890 = anIntArrayArray2890;
            var14.anIntArrayArray2856 = anIntArrayArray2856;
            var14.aShort2879 = aShort2879;
            var14.aShort2876 = aShort2876;
            var14.normalVertices = normalVertices;
            var14.fixedNormalVertices = fixedNormalVertices;
            var14.aClass50Array2883 = aClass50Array2883;
            if(var1 == 3) {
               var14.xVertices = Class65.arrayCopy(xVertices);
               var14.yVertices = Class65.arrayCopy(yVertices);
               var14.zVertices = Class65.arrayCopy(zVertices);
            } else {
               var14.xVertices = xVertices;
               var14.yVertices = new int[var14.vertexCount];
               var14.zVertices = zVertices;
            }
         } else {
            var14 = this;
         }

         int var15;
         int var17;
         int var16;
         int var19;
         int var18;
         int var21;
         int var20;
         int var23;
         int var22;
         int var24;
         if(var1 == 1) {
            for(var15 = 0; var15 < var14.vertexCount; ++var15) {
               var16 = xVertices[var15] + var5;
               var17 = zVertices[var15] + var7;
               var18 = var16 & 127;
               var19 = var17 & 127;
               var20 = var16 >> 7;
               var21 = var17 >> 7;
               var22 = var3[var20][var21] * (128 - var18) + var3[var20 + 1][var21] * var18 >> 7;
               var23 = var3[var20][var21 + 1] * (128 - var18) + var3[var20 + 1][var21 + 1] * var18 >> 7;
               var24 = var22 * (128 - var19) + var23 * var19 >> 7;
               var14.yVertices[var15] = yVertices[var15] + var24 - var6;
            }
         } else {
            int var25;
            if(var1 == 2) {
               for(var15 = 0; var15 < var14.vertexCount; ++var15) {
                  var16 = (yVertices[var15] << 16) / aShort2854;
                  if(var16 < var2) {
                     var17 = xVertices[var15] + var5;
                     var18 = zVertices[var15] + var7;
                     var19 = var17 & 127;
                     var20 = var18 & 127;
                     var21 = var17 >> 7;
                     var22 = var18 >> 7;
                     var23 = var3[var21][var22] * (128 - var19) + var3[var21 + 1][var22] * var19 >> 7;
                     var24 = var3[var21][var22 + 1] * (128 - var19) + var3[var21 + 1][var22 + 1] * var19 >> 7;
                     var25 = var23 * (128 - var20) + var24 * var20 >> 7;
                     var14.yVertices[var15] = yVertices[var15] + (var25 - var6) * (var2 - var16) / var2;
                  } else {
                     var14.yVertices[var15] = yVertices[var15];
                  }
               }
            } else if(var1 == 3) {
               var15 = (var2 & 255) * 4;
               var16 = (var2 >> 8 & 255) * 4;
               method1996(var3, var5, var6, var7, var15, var16);
            } else if(var1 == 4) {
               var15 = aShort2844 - aShort2854;

               for(var16 = 0; var16 < vertexCount; ++var16) {
                  var17 = xVertices[var16] + var5;
                  var18 = zVertices[var16] + var7;
                  var19 = var17 & 127;
                  var20 = var18 & 127;
                  var21 = var17 >> 7;
                  var22 = var18 >> 7;
                  var23 = var4[var21][var22] * (128 - var19) + var4[var21 + 1][var22] * var19 >> 7;
                  var24 = var4[var21][var22 + 1] * (128 - var19) + var4[var21 + 1][var22 + 1] * var19 >> 7;
                  var25 = var23 * (128 - var20) + var24 * var20 >> 7;
                  var14.yVertices[var16] = yVertices[var16] + (var25 - var6) + var15;
               }
            } else if(var1 == 5) {
               var15 = aShort2844 - aShort2854;

               for(var16 = 0; var16 < vertexCount; ++var16) {
                  var17 = xVertices[var16] + var5;
                  var18 = zVertices[var16] + var7;
                  var19 = var17 & 127;
                  var20 = var18 & 127;
                  var21 = var17 >> 7;
                  var22 = var18 >> 7;
                  var23 = var3[var21][var22] * (128 - var19) + var3[var21 + 1][var22] * var19 >> 7;
                  var24 = var3[var21][var22 + 1] * (128 - var19) + var3[var21 + 1][var22 + 1] * var19 >> 7;
                  var25 = var23 * (128 - var20) + var24 * var20 >> 7;
                  var23 = var4[var21][var22] * (128 - var19) + var4[var21 + 1][var22] * var19 >> 7;
                  var24 = var4[var21][var22 + 1] * (128 - var19) + var4[var21 + 1][var22 + 1] * var19 >> 7;
                  int var26 = var23 * (128 - var20) + var24 * var20 >> 7;
                  int var27 = var25 - var26;
                  var14.yVertices[var16] = ((yVertices[var16] << 8) / var15 * var27 >> 8) - (var6 - var25);
               }
            }
         }

         if(var9) {
            var14.method2007();
         } else {
            boundsCalculated = false;
         }

         return var14;
      }
   }

   final LDModel method2000(int var1, int var2, int var3, int var4, int var5) {
      return new LDModel(this, var1, var2, var3, var4, var5);
   }

   final void method1867(int var1, int var2, int var3, int var4, int var5) {}

   final void method2001(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < vertexCount; ++var4) {
         xVertices[var4] += var1;
         yVertices[var4] += var2;
         zVertices[var4] += var3;
      }

      method2007();
   }

   final void method2002() {
      int var1;
      for(var1 = 0; var1 < vertexCount; ++var1) {
         zVertices[var1] = -zVertices[var1];
      }

      for(var1 = 0; var1 < triangleCount; ++var1) {
         int var2 = trianglesA[var1];
         trianglesA[var1] = trianglesC[var1];
         trianglesC[var1] = var2;
      }

      method2007();
   }

   final boolean method1865() {
      return true;
   }

   /*private final void decode_666(byte[] is) {
	    Buffer stream = new Buffer(is);
		Buffer stream_44_ = new Buffer(is);
		Buffer stream_45_ = new Buffer(is);
		Buffer stream_46_ = new Buffer(is);
		Buffer stream_47_ = new Buffer(is);
		Buffer stream_48_ = new Buffer(is);
		Buffer stream_49_ = new Buffer(is);
		((Buffer) stream).pos = is.length - 23;
		vertexCount = stream.getUShort();
		triangleCount = stream.getUShort();
		anInt2862 = stream.getUByte();
		int i_50_ = stream.getUByte();
		boolean bool = (i_50_ & 0x1) == 1;
		boolean bool_51_ = (0x2 & i_50_) == 2;
		boolean bool_52_ = (0x4 & i_50_) == 4;
		boolean bool_53_ = (0x8 & i_50_) == 8;
		if (!bool_53_) {
			decodenew(is);
			return;
		}
		if (bool_53_) {
		    ((Buffer) stream).pos -= 7;
		    size = stream.getUByte();
		    ((Buffer) stream).pos += 6;
		}
		int i_54_ = stream.getUByte();
		int i_55_ = stream.getUByte();
		int i_56_ = stream.getUByte();
		int i_57_ = stream.getUByte();
		int i_58_ = stream.getUByte();
		int i_59_ = stream.getUShort();
		int i_60_ = stream.getUShort();
		int i_61_ = stream.getUShort();
		int i_62_ = stream.getUShort();
		int i_63_ = stream.getUShort();
		int numTexTriangles = 0;
		int i_65_ = 0;
		int i_66_ = 0;
		if (anInt2862 > 0) {
		    aByteArray2857 = new byte[anInt2862];
		    ((Buffer) stream).pos = 0;
		    for (int i_67_ = 0; anInt2862 > i_67_; i_67_++) {
			byte i_68_ = aByteArray2857[i_67_] = stream.getByte();
			if (i_68_ >= 1 && i_68_ <= 3)
			    i_65_++;
			if (i_68_ == 0)
			    numTexTriangles++;
			if (i_68_ == 2)
			    i_66_++;
		    }
		}
		int i_69_ = anInt2862;
		int i_70_ = i_69_;
		i_69_ += vertexCount;
		int i_71_ = i_69_;
		if (bool)
		    i_69_ += triangleCount;
		int i_72_ = i_69_;
		i_69_ += triangleCount;
		int i_73_ = i_69_;
		if (i_54_ == 255)
		    i_69_ += triangleCount;
		int i_74_ = i_69_;
		if (i_56_ == 1)
		    i_69_ += triangleCount;
		int i_75_ = i_69_;
		if (i_58_ == 1)
		    i_69_ += vertexCount;
		int i_76_ = i_69_;
		if (i_55_ == 1)
		    i_69_ += triangleCount;
		int i_77_ = i_69_;
		i_69_ += i_62_;
		int i_78_ = i_69_;
		if (i_57_ == 1)
		    i_69_ += triangleCount * 2;
		int i_79_ = i_69_;
		i_69_ += i_63_;
		int i_80_ = i_69_;
		i_69_ += 2 * triangleCount;
		int i_81_ = i_69_;
		i_69_ += i_59_;
		int i_82_ = i_69_;
		i_69_ += i_60_;
		int i_83_ = i_69_;
		i_69_ += i_61_;
		int i_84_ = i_69_;
		i_69_ += numTexTriangles * 6;
		int i_85_ = i_69_;
		i_69_ += 6 * i_65_;
		int i_86_ = 6;
		if (size != 14) {
		    if (size >= 15)
			i_86_ = 9;
		} else
		    i_86_ = 7;
		int i_87_ = i_69_;
		i_69_ += i_86_ * i_65_;
		int i_88_ = i_69_;
		i_69_ += i_65_;
		int i_89_ = i_69_;
		i_69_ += i_65_;
		int i_90_ = i_69_;
		i_69_ += i_66_ * 2 + i_65_;
		trianglesA = new int[triangleCount];
		triangleColors = new short[triangleCount];
		if (i_58_ == 1)
		    vertexVSkins = new int[vertexCount];
		if (bool)
		    triangleFaceTypes = new byte[triangleCount];
		int i_91_ = i_69_;
		((Buffer) stream).pos = i_70_;
		trianglesB = new int[triangleCount];
		if (i_54_ == 255)
		    trianglePriorities = new byte[triangleCount];
		else
		    aByte2848 = (byte) i_54_;
		zVertices = new int[vertexCount];
		if (i_55_ == 1)
		    triangleTransparencies = new byte[triangleCount];
		xVertices = new int[vertexCount];
		trianglesC = new int[triangleCount];
		if (i_57_ == 1)
		    triangleTextureIds = new short[triangleCount];
		if (i_56_ == 1)
			triangleTSkins = new int[triangleCount];
		yVertices = new int[vertexCount];
		if (anInt2862 > 0) {
		    texTrianglesC = new short[anInt2862];
		    if (i_66_ > 0) {
			aByteArray2852 = new byte[i_66_];
			aByteArray2869 = new byte[i_66_];
		    }
		    texTrianglesA = new short[anInt2862];
		    texTrianglesB = new short[anInt2862];
		    if (i_65_ > 0) {
		    	aShortArray2888 = new short[i_65_];
				aShortArray2882 = new short[i_65_];
				aShortArray2851 = new short[i_65_];
				aByteArray2845 = new byte[i_65_];
				aByteArray2867 = new byte[i_65_];
				aByteArray2877 = new byte[i_65_];
		    }
		}
		if (i_57_ == 1 && anInt2862 > 0)
		    aByteArray2866 = new byte[triangleCount];
		((Buffer) stream_44_).pos = i_81_;
		((Buffer) stream_45_).pos = i_82_;
		((Buffer) stream_46_).pos = i_83_;
		((Buffer) stream_47_).pos = i_75_;
		int i_92_ = 0;
		int i_93_ = 0;
		int i_94_ = 0;
		for (int i_95_ = 0; vertexCount > i_95_; i_95_++) {
		    int i_96_ = stream.getUByte();
		    int i_97_ = 0;
		    if ((i_96_ & 0x1) != 0)
			i_97_ = stream_44_.getSmartA();
		    int i_98_ = 0;
		    if ((0x2 & i_96_) != 0)
			i_98_ = stream_45_.getSmartA();
		    int i_99_ = 0;
		    if ((i_96_ & 0x4) != 0)
			i_99_ = stream_46_.getSmartA();
		    xVertices[i_95_] = i_97_ + i_92_;
		    yVertices[i_95_] = i_98_ + i_93_;
		    zVertices[i_95_] = i_99_ + i_94_;
		    i_93_ = yVertices[i_95_];
		    i_94_ = zVertices[i_95_];
		    i_92_ = xVertices[i_95_];
		    if (i_58_ == 1)
			vertexVSkins[i_95_] = stream_47_.getUByte();
		}
		((Buffer) stream).pos = i_80_;
		((Buffer) stream_44_).pos = i_71_;
		((Buffer) stream_45_).pos = i_73_;
		((Buffer) stream_46_).pos = i_76_;
		((Buffer) stream_47_).pos = i_74_;
		((Buffer) stream_48_).pos = i_78_;
		((Buffer) stream_49_).pos = i_79_;
		for (int i_100_ = 0; triangleCount > i_100_; i_100_++) {
		    triangleColors[i_100_] = (short) stream.getUShort();
		    if (bool)
			triangleFaceTypes[i_100_] = stream_44_.getByte();
		    if (i_54_ == 255)
			trianglePriorities[i_100_] = stream_45_.getByte();
		    if (i_55_ == 1)
			triangleTransparencies[i_100_] = stream_46_.getByte();
		    if (i_56_ == 1)
		    	triangleTSkins[i_100_] = stream_47_.getUByte();
		    if (i_57_ == 1)
			triangleTextureIds[i_100_] = (short) (stream_48_.getUShort() - 1);
		    if (aByteArray2866 != null) {
			if ((triangleTextureIds[i_100_] ^ 0xffffffff) == 0)
			    aByteArray2866[i_100_] = (byte) -1;
			else
			    aByteArray2866[i_100_] = (byte) (stream_49_.getUByte() - 1);
		    }
		}
		t = -1;
		((Buffer) stream).pos = i_77_;
		((Buffer) stream_44_).pos = i_72_;
		short i_101_ = 0;
		short i_102_ = 0;
		short i_103_ = 0;
		int i_104_ = 0;
		for (int i_105_ = 0; i_105_ < triangleCount; i_105_++) {
		    int i_106_ = stream_44_.getUByte();
		    if (i_106_ == 1) {
			i_101_ = (short) (stream.getSmartA() + i_104_);
			i_104_ = i_101_;
			i_102_ = (short) (stream.getSmartA() + i_104_);
			i_104_ = i_102_;
			i_103_ = (short) (i_104_ + stream.getSmartA());
			trianglesA[i_105_] = i_101_;
			i_104_ = i_103_;
			trianglesB[i_105_] = i_102_;
			trianglesC[i_105_] = i_103_;
			if (t < i_101_)
			    t = i_101_;
			if ((i_102_ ^ 0xffffffff) < (t ^ 0xffffffff))
			    t = i_102_;
			if ((i_103_ ^ 0xffffffff) < (t ^ 0xffffffff))
			    t = i_103_;
		    }
		    if (i_106_ == 2) {
			i_102_ = i_103_;
			i_103_ = (short) (stream.getSmartA() + i_104_);
			i_104_ = i_103_;
			trianglesA[i_105_] = i_101_;
			trianglesB[i_105_] = i_102_;
			trianglesC[i_105_] = i_103_;
			if (t < i_103_)
			    t = i_103_;
		    }
		    if (i_106_ == 3) {
			i_101_ = i_103_;
			i_103_ = (short) (stream.getSmartA() + i_104_);
			trianglesA[i_105_] = i_101_;
			i_104_ = i_103_;
			trianglesB[i_105_] = i_102_;
			trianglesC[i_105_] = i_103_;
			if (t < i_103_)
			    t = i_103_;
		    }
		    if (i_106_ == 4) {
			short i_107_ = i_101_;
			i_101_ = i_102_;
			i_102_ = i_107_;
			i_103_ = (short) (stream.getSmartA() + i_104_);
			i_104_ = i_103_;
			trianglesA[i_105_] = i_101_;
			trianglesB[i_105_] = i_102_;
			trianglesC[i_105_] = i_103_;
			if (t < i_103_)
			    t = i_103_;
		    }
		}
		((Buffer) stream).pos = i_84_;
		t++;
		((Buffer) stream_44_).pos = i_85_;
		((Buffer) stream_45_).pos = i_87_;
		((Buffer) stream_46_).pos = i_88_;
		((Buffer) stream_47_).pos = i_89_;
		((Buffer) stream_48_).pos = i_90_;
		for (int i_108_ = 0;
		     (i_108_ ^ 0xffffffff) > (anInt2862 ^ 0xffffffff); i_108_++) {
		    int i_109_ = 0xff & aByteArray2857[i_108_];
		    if (i_109_ == 0) {
			texTrianglesA[i_108_] = (short) stream.getUShort();
			texTrianglesB[i_108_] = (short) stream.getUShort();
			texTrianglesC[i_108_] = (short) stream.getUShort();
		    }
		    if (i_109_ == 1) {
			texTrianglesA[i_108_] = (short) stream_44_.getUShort();
			texTrianglesB[i_108_] = (short) stream_44_.getUShort();
			texTrianglesC[i_108_] = (short) stream_44_.getUShort();
			if (size < 15) {
			    aShortArray2888[i_108_] = (short) stream_45_.getUShort();
			    if (size >= 14)
				aShortArray2882[i_108_] = (short) stream_45_.getMidInt();
			    else
				aShortArray2882[i_108_] = (short) stream_45_.getUShort();
			    aShortArray2851[i_108_] = (short) stream_45_.getUShort();
			} else {
			    aShortArray2888[i_108_] = (short) stream_45_.getMidInt();
			    aShortArray2882[i_108_] = (short) stream_45_.getMidInt();
			    aShortArray2851[i_108_] = (short) stream_45_.getMidInt();
			}
			aByteArray2845[i_108_] = stream_46_.getByte();
			aByteArray2867[i_108_] = stream_47_.getByte();
			aByteArray2877[i_108_] = stream_48_.getByte();
		    }
		    if (i_109_ == 2) {
			texTrianglesA[i_108_] = (short) stream_44_.getUShort();
			texTrianglesB[i_108_] = (short) stream_44_.getUShort();
			texTrianglesC[i_108_] = (short) stream_44_.getUShort();
			if (size < 15) {
			    aShortArray2888[i_108_] = (short) stream_45_.getUShort();
			    if (size >= 14)
				aShortArray2882[i_108_] = (short) stream_45_.getMidInt();
			    else
				aShortArray2882[i_108_] = (short) stream_45_.getUShort();
			    aShortArray2851[i_108_] = (short) stream_45_.getUShort();
			} else {
			    aShortArray2888[i_108_] = (short) stream_45_.getMidInt();
			    aShortArray2882[i_108_] = (short) stream_45_.getMidInt();
			    aShortArray2851[i_108_] = (short) stream_45_.getMidInt();
			}
			aByteArray2845[i_108_] = stream_46_.getByte();
			aByteArray2867[i_108_] = stream_47_.getByte();
			aByteArray2877[i_108_] = stream_48_.getByte();
			aByteArray2852[i_108_] = stream_48_.getByte();
			aByteArray2869[i_108_] = stream_48_.getByte();
		    }
		    if (i_109_ == 3) {
			texTrianglesA[i_108_] = (short) stream_44_.getUShort();
			texTrianglesB[i_108_] = (short) stream_44_.getUShort();
			texTrianglesC[i_108_] = (short) stream_44_.getUShort();
			if (size < 15) {
			    aShortArray2888[i_108_] = (short) stream_45_.getUShort();
			    if (size >= 14)
				aShortArray2882[i_108_] = (short) stream_45_.getMidInt();
			    else
				aShortArray2882[i_108_] = (short) stream_45_.getUShort();
			    aShortArray2851[i_108_] = (short) stream_45_.getUShort();
			} else {
			    aShortArray2888[i_108_] = (short) stream_45_.getMidInt();
			    aShortArray2882[i_108_] = (short) stream_45_.getMidInt();
			    aShortArray2851[i_108_] = (short) stream_45_.getMidInt();
			}
			aByteArray2845[i_108_] = stream_46_.getByte();
			aByteArray2867[i_108_] = stream_47_.getByte();
			aByteArray2877[i_108_] = stream_48_.getByte();
		    }
		}
		((Buffer) stream).pos = i_91_;
		if (bool_51_) {
		    int i_110_ = stream.getUByte();
		    if (i_110_ > 0) {
			//f_ab = new fa[i_110_];
			for (int i_111_ = 0; i_111_ < i_110_; i_111_++) {
			    int i_112_ = stream.getUShort();
			    int i_113_ = stream.getUShort();
			    byte i_114_;
			    if (i_54_ == 255)
				i_114_ = trianglePriorities[i_113_];
			    else
				i_114_ = (byte) i_54_;
			    //f_ab[i_111_] = new fa(i_112_, trianglesA[i_113_], trianglesB[i_113_], trianglesC[i_113_], i_114_);
			}
		    }
		    int i_115_ = stream.getUByte();
		    if (i_115_ > 0) {
			//d = new nc[i_115_];//TODO
			for (int i_116_ = 0; i_115_ > i_116_; i_116_++) {
			    int i_117_ = stream.getUShort();
			    int i_118_ = stream.getUShort();
			    //d[i_116_] = new nc(i_117_, i_118_);//TODO
			}
		    }
		}
		if (bool_52_) {
		    int i_119_ = stream.getUByte();
		    if (i_119_ > 0) {
			//C = new vt[i_119_];//TODO
			for (int i_120_ = 0; i_119_ > i_120_; i_120_++) {
			    int i_121_ = stream.getUShort();
			    int i_122_ = stream.getUShort();
			    int i_123_ = stream.getUByte();
			    byte i_124_ = stream.getByte();
			    //C[i_120_] = new vt(i_121_, i_122_, i_123_, i_124_);//TODO
			}
		    }
		}
   }*/
   
   /*private final void decode_602(byte[] data) {
	   Buffer nc1 = new Buffer(data);
		Buffer nc2 = new Buffer(data);
		Buffer nc3 = new Buffer(data);
		Buffer nc4 = new Buffer(data);
		Buffer nc5 = new Buffer(data);
		Buffer nc6 = new Buffer(data);
		Buffer nc7 = new Buffer(data);
		nc1.pos = data.length - 23;
		vertexCount = nc1.getUShort();
		triangleCount = nc1.getUShort();
		anInt2862 = nc1.getUByte();
		int flags = nc1.getUByte();
		boolean bool = (flags & 0x1) != 0;
		boolean bool_78_ = (flags & 0x2) != 0;
		boolean bool_25_ = (flags & 0x4) != 0;
		boolean bool_26_ = (flags & 0x8) != 0;
		if (!bool_26_) {
			decodenew(data);
			return;
		}
		if (bool_26_) {
			nc1.pos -= 7;
			size = nc1.getUByte();
			nc1.pos += 6;
		}
		int priority = nc1.getUByte();
		int j2 = nc1.getUByte();
		int k2 = nc1.getUByte();
		int texture_opcode = nc1.getUByte();
		int i3 = nc1.getUByte();
		int j3 = nc1.getUShort();
		int k3 = nc1.getUShort();
		int l3 = nc1.getUShort();
		int i4 = nc1.getUShort();
		int j4 = nc1.getUShort();
		int k4 = 0;
		int l4 = 0;
		int i5 = 0;
		triangleColors = new short[triangleCount];
		if (anInt2862 > 0) {
			aByteArray2857 = new byte[anInt2862];
			nc1.pos = 0;
			for (int j5 = 0; j5 < anInt2862; j5++) {
				byte byte0 = aByteArray2857[j5] = nc1.getByte();
				if (byte0 == 0)
					k4++;
				if (byte0 >= 1 && byte0 <= 3)
					l4++;
				if (byte0 == 2)
					i5++;
			}
		}
		int k5 = anInt2862;
		int l5 = k5;
		k5 += vertexCount;
		int i6 = k5;
		if (bool)
			k5 += triangleCount;
		if (flags == 1)
			k5 += triangleCount;
		int j6 = k5;
		k5 += triangleCount;
		int k6 = k5;
		if (priority == 255)
			k5 += triangleCount;
		int l6 = k5;
		if (k2 == 1)
			k5 += triangleCount;
		int i7 = k5;
		if (i3 == 1)
			k5 += vertexCount;
		int j7 = k5;
		if (j2 == 1)
			k5 += triangleCount;
		int k7 = k5;
		k5 += i4;
		int l7 = k5;
		if (texture_opcode == 1)
			k5 += triangleCount * 2;
		int i8 = k5;
		k5 += j4;
		int j8 = k5;
		k5 += triangleCount * 2;
		int k8 = k5;
		k5 += j3;
		int l8 = k5;
		k5 += k3;
		int i9 = k5;
		k5 += l3;
		int j9 = k5;
		k5 += k4 * 6;
		int k9 = k5;
		k5 += l4 * 6;
		int i_59_ = 6;
		if (size != 14) {
			if (size >= 15)
				i_59_ = 9;
		} else
			i_59_ = 7;
		int l9 = k5;
		k5 += i_59_ * l4;
		int i10 = k5;
		k5 += l4;
		int j10 = k5;
		k5 += l4;
		int k10 = k5;
		k5 += l4 + i5 * 2;
		xVertices = new int[vertexCount];
		yVertices = new int[vertexCount];
		zVertices = new int[vertexCount];
		trianglesA = new int[triangleCount];
		trianglesB = new int[triangleCount];
		trianglesC = new int[triangleCount];
		vertexVSkins = new int[vertexCount];
		triangleFaceTypes = new byte[triangleCount];
		trianglePriorities = new byte[triangleCount];
		triangleTransparencies = new byte[triangleCount];
		triangleTSkins = new int[triangleCount];
		if (i3 == 1)
			vertexVSkins = new int[vertexCount];
		if (bool)
			triangleFaceTypes = new byte[triangleCount];
		if (priority == 255)
			trianglePriorities = new byte[triangleCount];
		else
			aByte2848 = (byte) priority;
		if (j2 == 1)
			triangleTransparencies = new byte[triangleCount];
		if (k2 == 1)
			triangleTSkins = new int[triangleCount];
		if (texture_opcode == 1)
			triangleTextureIds = new short[triangleCount];
		if (texture_opcode == 1 && anInt2862 > 0)
			aByteArray2866 = new byte[triangleCount];
		if (anInt2862 > 0) {
			texTrianglesA = new short[anInt2862];
			texTrianglesB = new short[anInt2862];
			texTrianglesC = new short[anInt2862];
			if (l4 > 0) {
				aShortArray2888 = new short[l4];
				aShortArray2882 = new short[l4];
				aShortArray2851 = new short[l4];
				aByteArray2845 = new byte[l4];
				aByteArray2867 = new byte[l4];
				aByteArray2877 = new byte[l4];
			}
			if (i5 > 0) {
				aByteArray2852 = new byte[i5];
				aByteArray2869 = new byte[i5];
			}
		}
		nc1.pos = l5;
		nc2.pos = k8;
		nc3.pos = l8;
		nc4.pos = i9;
		nc5.pos = i7;
		int l10 = 0;
		int i11 = 0;
		int j11 = 0;
		for (int k11 = 0; k11 < vertexCount; k11++) {
			int l11 = nc1.getUByte();
			int j12 = 0;
			if ((l11 & 1) != 0)
				j12 = nc2.getSmartA();
			int l12 = 0;
			if ((l11 & 2) != 0)
				l12 = nc3.getSmartA();
			int j13 = 0;
			if ((l11 & 4) != 0)
				j13 = nc4.getSmartA();
			xVertices[k11] = l10 + j12;
			yVertices[k11] = i11 + l12;
			zVertices[k11] = j11 + j13;
			l10 = xVertices[k11];
			i11 = yVertices[k11];
			j11 = zVertices[k11];
			if (vertexVSkins != null)
				vertexVSkins[k11] = nc5.getUByte();
		}
		nc1.pos = j8;
		nc2.pos = i6;
		nc3.pos = k6;
		nc4.pos = j7;
		nc5.pos = l6;
		nc6.pos = l7;
		nc7.pos = i8;
		for (int i12 = 0; i12 < triangleCount; i12++) {
			triangleColors[i12] = (short) nc1.getUShort();
			if (flags == 1) {
				triangleFaceTypes[i12] = nc2.getByte();
				if (triangleFaceTypes[i12] == 2)
					triangleColors[i12] = (short) 65535;
				triangleFaceTypes[i12] = 0;
			}
			if (priority == 255) {
				trianglePriorities[i12] = nc3.getByte();
			}
			if (j2 == 1) {
				triangleTransparencies[i12] = nc4.getByte();
				if (triangleTransparencies[i12] < 0)
					triangleTransparencies[i12] = (byte) (256 + triangleTransparencies[i12]);
			}
			if (k2 == 1)
				triangleTSkins[i12] = nc5.getUByte();
			if (texture_opcode == 1)
				triangleTextureIds[i12] = (short) (nc6.getUShort() - 1);
			if (aByteArray2866 != null)
				if (triangleTextureIds[i12] != -1)
					aByteArray2866[i12] = (byte) (nc7.getUByte() - 1);
				else
					aByteArray2866[i12] = -1;
		}
		nc1.pos = k7;
		nc2.pos = j6;
		int k12 = 0;
		int i13 = 0;
		int k13 = 0;
		int l13 = 0;
		for (int i14 = 0; i14 < triangleCount; i14++) {
			int j14 = nc2.getUByte();
			if (j14 == 1) {
				k12 = nc1.getSmartA() + l13;
				l13 = k12;
				i13 = nc1.getSmartA() + l13;
				l13 = i13;
				k13 = nc1.getSmartA() + l13;
				l13 = k13;
				trianglesA[i14] = k12;
				trianglesB[i14] = i13;
				trianglesC[i14] = k13;
			}
			if (j14 == 2) {
				i13 = k13;
				k13 = nc1.getSmartA() + l13;
				l13 = k13;
				trianglesA[i14] = k12;
				trianglesB[i14] = i13;
				trianglesC[i14] = k13;
			}
			if (j14 == 3) {
				k12 = k13;
				k13 = nc1.getSmartA() + l13;
				l13 = k13;
				trianglesA[i14] = k12;
				trianglesB[i14] = i13;
				trianglesC[i14] = k13;
			}
			if (j14 == 4) {
				int l14 = k12;
				k12 = i13;
				i13 = l14;
				k13 = nc1.getSmartA() + l13;
				l13 = k13;
				trianglesA[i14] = k12;
				trianglesB[i14] = i13;
				trianglesC[i14] = k13;
			}
		}
		nc1.pos = j9;
		nc2.pos = k9;
		nc3.pos = l9;
		nc4.pos = i10;
		nc5.pos = j10;
		nc6.pos = k10;
		for (int k14 = 0; k14 < anInt2862; k14++) {
			int i15 = aByteArray2857[k14] & 0xff;
			if (i15 == 0) {
				texTrianglesA[k14] = (short) nc1.getUShort();
				texTrianglesB[k14] = (short) nc1.getUShort();
				texTrianglesC[k14] = (short) nc1.getUShort();
			}
			if (i15 == 1) {
				texTrianglesA[k14] = (short) nc2.getUShort();
				texTrianglesB[k14] = (short) nc2.getUShort();
				texTrianglesC[k14] = (short) nc2.getUShort();
				if (size < 15) {
					aShortArray2888[k14] = (short) nc3.getUShort();
					if (size >= 14)
						aShortArray2882[k14] = (short) nc3.getMidInt();
					else
						aShortArray2882[k14] = (short) nc3.getUShort();
					aShortArray2851[k14] = (short) nc3.getUShort();
				} else {
					aShortArray2888[k14] = (short) nc3.getUShort();
					aShortArray2882[k14] = (short) nc3.getUShort();
					aShortArray2851[k14] = (short) nc3.getUShort();
				}
				aByteArray2845[k14] = nc4.getByte();
				aByteArray2867[k14] = nc5.getByte();
				aByteArray2877[k14] = nc6.getByte();
			}
			if (i15 == 2) {
				texTrianglesA[k14] = (short) nc2.getUShort();
				texTrianglesB[k14] = (short) nc2.getUShort();
				texTrianglesC[k14] = (short) nc2.getUShort();
				if (size >= 15) {
					aShortArray2888[k14] = (short) nc3.getUShort();
					aShortArray2882[k14] = (short) nc3.getUShort();
					aShortArray2851[k14] = (short) nc3.getUShort();
				} else {
					aShortArray2888[k14] = (short) nc3.getUShort();
					if (size < 14)
						aShortArray2882[k14] = (short) nc3.getUShort();
					else
						aShortArray2882[k14] = (short) nc3.getUShort();
					aShortArray2851[k14] = (short) nc3.getUShort();
				}
				aByteArray2845[k14] = nc4.getByte();
				aByteArray2867[k14] = nc5.getByte();
				aByteArray2877[k14] = nc6.getByte();
				aByteArray2852[k14] = nc6.getByte();
				aByteArray2869[k14] = nc6.getByte();
			}
			if (i15 == 3) {
				texTrianglesA[k14] = (short) nc2.getUShort();
				texTrianglesB[k14] = (short) nc2.getUShort();
				texTrianglesC[k14] = (short) nc2.getUShort();
				if (size < 15) {
					aShortArray2888[k14] = (short) nc3.getUShort();
					if (size < 14)
						aShortArray2882[k14] = (short) nc3.getUShort();
					else
						aShortArray2882[k14] = (short) nc3.getUShort();
					aShortArray2851[k14] = (short) nc3.getUShort();
				} else {
					aShortArray2888[k14] = (short) nc3.getUShort();
					aShortArray2882[k14] = (short) nc3.getUShort();
					aShortArray2851[k14] = (short) nc3.getUShort();
				}
				aByteArray2845[k14] = nc4.getByte();
				aByteArray2867[k14] = nc5.getByte();
				aByteArray2877[k14] = nc6.getByte();
			}
		}
		if (priority != 255) {
			for (int i12 = 0; i12 < triangleCount; i12++)
				trianglePriorities[i12] = (byte) priority;
		}
  	  method1994(32, 32, 32);
   }*/
   
   private final void decodenew(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var2.pos = var1.length - 23;
      int var9 = var2.getUShort();
      int var10 = var2.getUShort();
      int var11 = var2.getUByte();
      int var12 = var2.getUByte();
      boolean var13 = (var12 & 1) == 1;
      boolean var14 = (var12 & 2) == 2;
      int var15 = var2.getUByte();
      int var16 = var2.getUByte();
      int var17 = var2.getUByte();
      int var18 = var2.getUByte();
      int var19 = var2.getUByte();
      int var20 = var2.getUShort();
      int var21 = var2.getUShort();
      int var22 = var2.getUShort();
      int var23 = var2.getUShort();
      int var24 = var2.getUShort();
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28;
      if(var11 > 0) {
         aByteArray2857 = new byte[var11];
         var2.pos = 0;
         for(var28 = 0; var28 < var11; ++var28) {
            byte var29 = aByteArray2857[var28] = var2.getByte();
            if(var29 == 0) {
               ++var25;
            }
            if(var29 >= 1 && var29 <= 3) {
               ++var26;
            }
            if(var29 == 2) {
               ++var27;
            }
         }
      }
      var28 = var11 + var9;
      int var30 = var28;
      if(var13) {
         var28 += var10;
      }

      int var31 = var28;
      var28 += var10;
      int var32 = var28;
      if(var15 == 255) {
         var28 += var10;
      }

      int var33 = var28;
      if(var17 == 1) {
         var28 += var10;
      }

      int var34 = var28;
      if(var19 == 1) {
         var28 += var9;
      }

      int var35 = var28;
      if(var16 == 1) {
         var28 += var10;
      }

      int var36 = var28;
      var28 += var23;
      int var37 = var28;
      if(var18 == 1) {
         var28 += var10 * 2;
      }

      int var38 = var28;
      var28 += var24;
      int var39 = var28;
      var28 += var10 * 2;
      int var40 = var28;
      var28 += var20;
      int var41 = var28;
      var28 += var21;
      int var42 = var28;
      var28 += var22;
      int var43 = var28;
      var28 += var25 * 6;
      int var44 = var28;
      var28 += var26 * 6;
      int var45 = var28;
      var28 += var26 * 6;
      int var46 = var28;
      var28 += var26;
      int var47 = var28;
      var28 += var26;
      int var48 = var28;
      var28 += var26 + var27 * 2;
      vertexCount = var9;
      triangleCount = var10;
      anInt2862 = var11;
      xVertices = new int[var9];
      yVertices = new int[var9];
      zVertices = new int[var9];
      trianglesA = new int[var10];
      trianglesB = new int[var10];
      trianglesC = new int[var10];
      if(var19 == 1) {
         vertexVSkins = new int[var9];
      }

      if(var13) {
         triangleFaceTypes = new byte[var10];
      }

      if(var15 == 255) {
         trianglePriorities = new byte[var10];
      } else {
         aByte2848 = (byte)var15;
      }

      if(var16 == 1) {
         triangleTransparencies = new byte[var10];
      }

      if(var17 == 1) {
         triangleTSkins = new int[var10];
      }

      if(var18 == 1) {
         triangleTextureIds = new short[var10];
      }

      if(var18 == 1 && var11 > 0) {
         aByteArray2866 = new byte[var10];
      }

      triangleColors = new short[var10];
      if(var11 > 0) {
         texTrianglesA = new short[var11];
         texTrianglesB = new short[var11];
         texTrianglesC = new short[var11];
         if(var26 > 0) {
            aShortArray2888 = new short[var26];
            aShortArray2882 = new short[var26];
            aShortArray2851 = new short[var26];
            aByteArray2845 = new byte[var26];
            aByteArray2867 = new byte[var26];
            aByteArray2877 = new byte[var26];
         }

         if(var27 > 0) {
            aByteArray2852 = new byte[var27];
            aByteArray2869 = new byte[var27];
         }
      }

      var2.pos = var11;
      var3.pos = var40;
      var4.pos = var41;
      var5.pos = var42;
      var6.pos = var34;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      int var55;
      int var54;
      int var53;
      int var57;
      int var56;
      for(var53 = 0; var53 < var9; ++var53) {
         var54 = var2.getUByte();
         var55 = 0;
         if((var54 & 1) != 0) {
            var55 = var3.getUSmart();
         }

         var56 = 0;
         if((var54 & 2) != 0) {
            var56 = var4.getUSmart();
         }

         var57 = 0;
         if((var54 & 4) != 0) {
            var57 = var5.getUSmart();
         }

         xVertices[var53] = var50 + var55;
         yVertices[var53] = var51 + var56;
         zVertices[var53] = var52 + var57;
         var50 = xVertices[var53];
         var51 = yVertices[var53];
         var52 = zVertices[var53];
         if(var19 == 1) {
            vertexVSkins[var53] = var6.getUByte();
         }
      }

      var2.pos = var39;
      var3.pos = var30;
      var4.pos = var32;
      var5.pos = var35;
      var6.pos = var33;
      var7.pos = var37;
      var8.pos = var38;

      for(var53 = 0; var53 < var10; ++var53) {
         triangleColors[var53] = (short)var2.getUShort();
         if(var13) {
            triangleFaceTypes[var53] = var3.getByte();
         }

         if(var15 == 255) {
            trianglePriorities[var53] = var4.getByte();
         }

         if(var16 == 1) {
            triangleTransparencies[var53] = var5.getByte();
         }

         if(var17 == 1) {
            triangleTSkins[var53] = var6.getUByte();
         }

         if(var18 == 1) {
            triangleTextureIds[var53] = (short)(var7.getUShort() - 1);
         }

         if(aByteArray2866 != null) {
            if(triangleTextureIds[var53] != -1) {
               aByteArray2866[var53] = (byte)(var8.getUByte() - 1);
            } else {
               aByteArray2866[var53] = -1;
            }
         }
      }

      var2.pos = var36;
      var3.pos = var31;
      var53 = 0;
      var54 = 0;
      var55 = 0;
      var56 = 0;

      int var58;
      for(var57 = 0; var57 < var10; ++var57) {
         var58 = var3.getUByte();
         if(var58 == 1) {
            var53 = var2.getUSmart() + var56;
            var54 = var2.getUSmart() + var53;
            var55 = var2.getUSmart() + var54;
            var56 = var55;
            trianglesA[var57] = var53;
            trianglesB[var57] = var54;
            trianglesC[var57] = var55;
         }

         if(var58 == 2) {
            var54 = var55;
            var55 = var2.getUSmart() + var56;
            var56 = var55;
            trianglesA[var57] = var53;
            trianglesB[var57] = var54;
            trianglesC[var57] = var55;
         }

         if(var58 == 3) {
            var53 = var55;
            var55 = var2.getUSmart() + var56;
            var56 = var55;
            trianglesA[var57] = var53;
            trianglesB[var57] = var54;
            trianglesC[var57] = var55;
         }

         if(var58 == 4) {
            int var59 = var53;
            var53 = var54;
            var54 = var59;
            var55 = var2.getUSmart() + var56;
            var56 = var55;
            trianglesA[var57] = var53;
            trianglesB[var57] = var59;
            trianglesC[var57] = var55;
         }
      }

      var2.pos = var43;
      var3.pos = var44;
      var4.pos = var45;
      var5.pos = var46;
      var6.pos = var47;
      var7.pos = var48;

      for(var57 = 0; var57 < var11; ++var57) {
         var58 = aByteArray2857[var57] & 255;
         if(var58 == 0) {
            texTrianglesA[var57] = (short)var2.getUShort();
            texTrianglesB[var57] = (short)var2.getUShort();
            texTrianglesC[var57] = (short)var2.getUShort();
         }

         if(var58 == 1) {
            texTrianglesA[var57] = (short)var3.getUShort();
            texTrianglesB[var57] = (short)var3.getUShort();
            texTrianglesC[var57] = (short)var3.getUShort();
            aShortArray2888[var57] = (short)var4.getUShort();
            aShortArray2882[var57] = (short)var4.getUShort();
            aShortArray2851[var57] = (short)var4.getUShort();
            aByteArray2845[var57] = var5.getByte();
            aByteArray2867[var57] = var6.getByte();
            aByteArray2877[var57] = var7.getByte();
         }

         if(var58 == 2) {
            texTrianglesA[var57] = (short)var3.getUShort();
            texTrianglesB[var57] = (short)var3.getUShort();
            texTrianglesC[var57] = (short)var3.getUShort();
            aShortArray2888[var57] = (short)var4.getUShort();
            aShortArray2882[var57] = (short)var4.getUShort();
            aShortArray2851[var57] = (short)var4.getUShort();
            aByteArray2845[var57] = var5.getByte();
            aByteArray2867[var57] = var6.getByte();
            aByteArray2877[var57] = var7.getByte();
            aByteArray2852[var57] = var7.getByte();
            aByteArray2869[var57] = var7.getByte();
         }

         if(var58 == 3) {
            texTrianglesA[var57] = (short)var3.getUShort();
            texTrianglesB[var57] = (short)var3.getUShort();
            texTrianglesC[var57] = (short)var3.getUShort();
            aShortArray2888[var57] = (short)var4.getUShort();
            aShortArray2882[var57] = (short)var4.getUShort();
            aShortArray2851[var57] = (short)var4.getUShort();
            aByteArray2845[var57] = var5.getByte();
            aByteArray2867[var57] = var6.getByte();
            aByteArray2877[var57] = var7.getByte();
         }
      }

      if(var14) {
         var2.pos = var28;
         var57 = var2.getUByte();
         if(var57 > 0) {
            var2.pos += 4 * var57;
         }

         var58 = var2.getUByte();
         if(var58 > 0) {
            var2.pos += 4 * var58;
         }
         //TODO class187
         /*
          * 	    class153_sub8.position = i_111_;
	    int i_130_ = class153_sub8.getUByte();
	    if (i_130_ > 0) {
		aClass154Array2691 = new Class154[i_130_];
		for (int i_131_ = 0; i_131_ < i_130_; i_131_++) {
		    int i_132_ = class153_sub8.getUShort();
		    int i_133_ = class153_sub8.getUShort();
		    byte i_134_;
		    if ((i_75_ ^ 0xffffffff) != -256)
			i_134_ = (byte) i_75_;
		    else
			i_134_ = aByteArray2666[i_133_];
		    aClass154Array2691[i_131_]
			= new Class154(i_132_, aShortArray2684[i_133_],
				       aShortArray2647[i_133_],
				       aShortArray2656[i_133_], i_134_);
		}
	    }
	    int i_135_ = class153_sub8.getUByte();
	    if ((i_135_ ^ 0xffffffff) < -1) {
		aClass37Array2673 = new Class37[i_135_];
		for (int i_136_ = 0;
		     (i_136_ ^ 0xffffffff) > (i_135_ ^ 0xffffffff); i_136_++)
		    aClass37Array2673[i_136_]
			= new Class37(class153_sub8.getUShort(),
				      class153_sub8.getUShort());
	    }
          */
      }

   }

   final ModelBuilder method2004() {
      ModelBuilder var1 = new ModelBuilder();
      if(triangleFaceTypes != null) {
         var1.triangleFaceTypes = new byte[triangleCount];

         for(int var2 = 0; var2 < triangleCount; ++var2) {
            var1.triangleFaceTypes[var2] = triangleFaceTypes[var2];
         }
      }

      var1.vertexCount = vertexCount;
      var1.triangleCount = triangleCount;
      var1.anInt2862 = anInt2862;
      var1.xVertices = xVertices;
      var1.yVertices = yVertices;
      var1.zVertices = zVertices;
      var1.trianglesA = trianglesA;
      var1.trianglesB = trianglesB;
      var1.trianglesC = trianglesC;
      var1.trianglePriorities = trianglePriorities;
      var1.triangleTransparencies = triangleTransparencies;
      var1.aByteArray2866 = aByteArray2866;
      var1.triangleColors = triangleColors;
      var1.triangleTextureIds = triangleTextureIds;
      var1.aByte2848 = aByte2848;
      var1.aByteArray2857 = aByteArray2857;
      var1.texTrianglesA = texTrianglesA;
      var1.texTrianglesB = texTrianglesB;
      var1.texTrianglesC = texTrianglesC;
      var1.aShortArray2888 = aShortArray2888;
      var1.aShortArray2882 = aShortArray2882;
      var1.aShortArray2851 = aShortArray2851;
      var1.aByteArray2845 = aByteArray2845;
      var1.aByteArray2867 = aByteArray2867;
      var1.aByteArray2877 = aByteArray2877;
      var1.aByteArray2852 = aByteArray2852;
      var1.aByteArray2869 = aByteArray2869;
      var1.vertexVSkins = vertexVSkins;
      var1.triangleTSkins = triangleTSkins;
      var1.anIntArrayArray2890 = anIntArrayArray2890;
      var1.anIntArrayArray2856 = anIntArrayArray2856;
      var1.normalVertices = normalVertices;
      var1.fixedNormalVertices = fixedNormalVertices;
      var1.aShort2879 = aShort2879;
      var1.aShort2876 = aShort2876;
      return var1;
   }

   final int method2005(int var1, int var2, int var3, byte var4, short var5, byte var6) {
      trianglesA[triangleCount] = var1;
      trianglesB[triangleCount] = var2;
      trianglesC[triangleCount] = var3;
      triangleFaceTypes[triangleCount] = var4;
      aByteArray2866[triangleCount] = -1;
      triangleColors[triangleCount] = var5;
      triangleTextureIds[triangleCount] = -1;
      triangleTransparencies[triangleCount] = var6;
      return triangleCount++;
   }

   private final void method2006(int var1) {
      int var2 = anIntArray2871[var1];
      int var3 = anIntArray2863[var1];

      for(int var4 = 0; var4 < vertexCount; ++var4) {
         int var5 = yVertices[var4] * var3 - zVertices[var4] * var2 >> 16;
         zVertices[var4] = yVertices[var4] * var2 + zVertices[var4] * var3 >> 16;
         yVertices[var4] = var5;
      }

      method2007();
   }

   private final void method2007() {
      normalVertices = null;
      aClass50Array2883 = null;
      fixedNormalVertices = null;
      boundsCalculated = false;
   }

   final AbstractModel convert(int var1, int var2, int var3, int var4, int var5) {
      if(HDToolkit.openGLEnabled) {
         HDModel var6 = new HDModel(this, var1, var2, true);
         var6.method1908();
         return var6;
      } else {
         return new LDModel(this, var1, var2, var3, var4, var5);
      }
   }

   private static final int method2009(int[][] var0, int var1, int var2) {
      int var3 = var1 >> 7;
      int var4 = var2 >> 7;
      if(var3 >= 0 && var4 >= 0 && var3 < var0.length && var4 < var0[0].length) {
         int var5 = var1 & 127;
         int var6 = var2 & 127;
         int var7 = var0[var3][var4] * (128 - var5) + var0[var3 + 1][var4] * var5 >> 7;
         int var8 = var0[var3][var4 + 1] * (128 - var5) + var0[var3 + 1][var4 + 1] * var5 >> 7;
         return var7 * (128 - var6) + var8 * var6 >> 7;
      } else {
         return 0;
      }
   }

   final int method1871() {
      if(!boundsCalculated) {
         calculateBounds();
      }

      return aShort2854;
   }

   final void method2010() {
      vertexVSkins = null;
      triangleTSkins = null;
      anIntArrayArray2890 = (int[][])null;
      anIntArrayArray2856 = (int[][])null;
   }

   final void method1866(SceneGraphNode var1, int var2, int var3, int var4, boolean var5) {
      ModelBuilder var6 = (ModelBuilder)var1;
      var6.calculateBounds();
      var6.calculateNormals();
      ++anInt2868;
      int var7 = 0;
      int[] var8 = var6.xVertices;
      int var9 = var6.vertexCount;

      int var10;
      for(var10 = 0; var10 < vertexCount; ++var10) {
         Vertex var11 = normalVertices[var10];
         if(var11.size != 0) {
            int var12 = yVertices[var10] - var3;
            if(var12 >= var6.aShort2854 && var12 <= var6.aShort2844) {
               int var13 = xVertices[var10] - var2;
               if(var13 >= var6.aShort2850 && var13 <= var6.aShort2873) {
                  int var14 = zVertices[var10] - var4;
                  if(var14 >= var6.aShort2880 && var14 <= var6.aShort2874) {
                     for(int var15 = 0; var15 < var9; ++var15) {
                        Vertex var16 = var6.normalVertices[var15];
                        if(var13 == var8[var15] && var14 == var6.zVertices[var15] && var12 == var6.yVertices[var15] && var16.size != 0) {
                           if(aClass50Array2883 == null) {
                              aClass50Array2883 = new Vertex[vertexCount];
                           }

                           if(var6.aClass50Array2883 == null) {
                              var6.aClass50Array2883 = new Vertex[var9];
                           }

                           Vertex var17 = aClass50Array2883[var10];
                           if(var17 == null) {
                              var17 = aClass50Array2883[var10] = new Vertex(var11);
                           }

                           Vertex var18 = var6.aClass50Array2883[var15];
                           if(var18 == null) {
                              var18 = var6.aClass50Array2883[var15] = new Vertex(var16);
                           }

                           var17.x += var16.x;
                           var17.y += var16.y;
                           var17.z += var16.z;
                           var17.size += var16.size;
                           var18.x += var11.x;
                           var18.y += var11.y;
                           var18.z += var11.z;
                           var18.size += var11.size;
                           ++var7;
                           anIntArray2861[var10] = anInt2868;
                           anIntArray2875[var15] = anInt2868;
                        }
                     }
                  }
               }
            }
         }
      }

      if(var7 >= 3 && var5) {
         for(var10 = 0; var10 < triangleCount; ++var10) {
            if(anIntArray2861[trianglesA[var10]] == anInt2868 && anIntArray2861[trianglesB[var10]] == anInt2868 && anIntArray2861[trianglesC[var10]] == anInt2868) {
               if(triangleFaceTypes == null) {
                  triangleFaceTypes = new byte[triangleCount];
               }

               triangleFaceTypes[var10] = 2;
            }
         }

         for(var10 = 0; var10 < var6.triangleCount; ++var10) {
            if(anIntArray2875[var6.trianglesA[var10]] == anInt2868 && anIntArray2875[var6.trianglesB[var10]] == anInt2868 && anIntArray2875[var6.trianglesC[var10]] == anInt2868) {
               if(var6.triangleFaceTypes == null) {
                  var6.triangleFaceTypes = new byte[var6.triangleCount];
               }

               var6.triangleFaceTypes[var10] = 2;
            }
         }

      }
   }

   final void method2011(int var1) {
      int var2 = anIntArray2871[var1];
      int var3 = anIntArray2863[var1];

      for(int var4 = 0; var4 < vertexCount; ++var4) {
         int var5 = zVertices[var4] * var2 + xVertices[var4] * var3 >> 16;
         zVertices[var4] = zVertices[var4] * var3 - xVertices[var4] * var2 >> 16;
         xVertices[var4] = var5;
      }

      method2007();
   }

   final void method2012() {
      int[] var1;
      int var2;
      int var3;
      int var4;
      if(vertexVSkins != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < vertexCount; ++var3) {
            var4 = vertexVSkins[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         anIntArrayArray2890 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            anIntArrayArray2890[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < vertexCount; anIntArrayArray2890[var4][var1[var4]++] = var3++) {
            var4 = vertexVSkins[var3];
         }

         vertexVSkins = null;
      }

      if(triangleTSkins != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < triangleCount; ++var3) {
            var4 = triangleTSkins[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         anIntArrayArray2856 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            anIntArrayArray2856[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < triangleCount; anIntArrayArray2856[var4][var1[var4]++] = var3++) {
            var4 = triangleTSkins[var3];
         }

         triangleTSkins = null;
      }

   }

   final void method2013(int var1, int var2, int var3) {
      int var4;
      int var5;
      int var6;
      int var7;
      if(var3 != 0) {
         var4 = anIntArray2871[var3];
         var5 = anIntArray2863[var3];

         for(var6 = 0; var6 < vertexCount; ++var6) {
            var7 = yVertices[var6] * var4 + xVertices[var6] * var5 >> 16;
            yVertices[var6] = yVertices[var6] * var5 - xVertices[var6] * var4 >> 16;
            xVertices[var6] = var7;
         }
      }

      if(var1 != 0) {
         var4 = anIntArray2871[var1];
         var5 = anIntArray2863[var1];

         for(var6 = 0; var6 < vertexCount; ++var6) {
            var7 = yVertices[var6] * var5 - zVertices[var6] * var4 >> 16;
            zVertices[var6] = yVertices[var6] * var4 + zVertices[var6] * var5 >> 16;
            yVertices[var6] = var7;
         }
      }

      if(var2 != 0) {
         var4 = anIntArray2871[var2];
         var5 = anIntArray2863[var2];

         for(var6 = 0; var6 < vertexCount; ++var6) {
            var7 = zVertices[var6] * var4 + xVertices[var6] * var5 >> 16;
            zVertices[var6] = zVertices[var6] * var5 - xVertices[var6] * var4 >> 16;
            xVertices[var6] = var7;
         }
      }

   }

   final int method2014(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < vertexCount; ++var4) {
         if(xVertices[var4] == var1 && yVertices[var4] == var2 && zVertices[var4] == var3) {
            return var4;
         }
      }

      xVertices[vertexCount] = var1;
      yVertices[vertexCount] = var2;
      zVertices[vertexCount] = var3;
      return vertexCount++;
   }

   static final ModelBuilder get(js5 var0, int id, int var2) {
	   /*try {
		  throw new RuntimeException("id=" + id);
	   } catch (Exception e) {
		   e.printStackTrace();
	   }*/
	   js5 modelSystem = var0;
	   boolean useNewHeader = false;
	   if (client.clientLoad < 602) {
		   useNewHeader = id > var0.aClass62_1949.anInt960;
		   modelSystem = useNewHeader ? client.modelsCache602 : var0;
	   }
	   byte[] data = modelSystem.getFile(id, var2);
		if (data == null) {
			/*try {
				throw new RuntimeException("error id=" + id);
			} catch (Exception e) {
				e.printStackTrace();
			}*/
			return null;
		}
	   return new ModelBuilder(data);
   }

   final void swapColors(short var1, short var2) {
      for(int var3 = 0; var3 < triangleCount; ++var3) {
         if(triangleColors[var3] == var1) {
            triangleColors[var3] = var2;
         }
      }

   }

   private final void decodeold(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.pos = var1.length - 18;
      int var9 = var4.getUShort();
      int var10 = var4.getUShort();
      int var11 = var4.getUByte();
      int var12 = var4.getUByte();
      int var13 = var4.getUByte();
      int var14 = var4.getUByte();
      int var15 = var4.getUByte();
      int var16 = var4.getUByte();
      int var17 = var4.getUShort();
      int var18 = var4.getUShort();
      int var19 = var4.getUShort();
      int var20 = var4.getUShort();
      byte var21 = 0;
      int var45 = var21 + var9;
      int var23 = var45;
      var45 += var10;
      int var24 = var45;
      if(var13 == 255) {
         var45 += var10;
      }

      int var25 = var45;
      if(var15 == 1) {
         var45 += var10;
      }

      int var26 = var45;
      if(var12 == 1) {
         var45 += var10;
      }

      int var27 = var45;
      if(var16 == 1) {
         var45 += var9;
      }

      int var28 = var45;
      if(var14 == 1) {
         var45 += var10;
      }

      int var29 = var45;
      var45 += var20;
      int var30 = var45;
      var45 += var10 * 2;
      int var31 = var45;
      var45 += var11 * 6;
      int var32 = var45;
      var45 += var17;
      int var33 = var45;
      var45 += var18;
      vertexCount = var9;
      triangleCount = var10;
      anInt2862 = var11;
      xVertices = new int[var9];
      yVertices = new int[var9];
      zVertices = new int[var9];
      trianglesA = new int[var10];
      trianglesB = new int[var10];
      trianglesC = new int[var10];
      if(var11 > 0) {
         aByteArray2857 = new byte[var11];
         texTrianglesA = new short[var11];
         texTrianglesB = new short[var11];
         texTrianglesC = new short[var11];
      }

      if(var16 == 1) {
         vertexVSkins = new int[var9];
      }

      if(var12 == 1) {
         triangleFaceTypes = new byte[var10];
         aByteArray2866 = new byte[var10];
         triangleTextureIds = new short[var10];
      }

      if(var13 == 255) {
         trianglePriorities = new byte[var10];
      } else {
         aByte2848 = (byte)var13;
      }

      if(var14 == 1) {
         triangleTransparencies = new byte[var10];
      }

      if(var15 == 1) {
         triangleTSkins = new int[var10];
      }

      triangleColors = new short[var10];
      var4.pos = var21;
      var5.pos = var32;
      var6.pos = var33;
      var7.pos = var45;
      var8.pos = var27;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var42;
      int var40;
      int var41;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.getUByte();
         var40 = 0;
         if((var39 & 1) != 0) {
            var40 = var5.getUSmart();
         }

         var41 = 0;
         if((var39 & 2) != 0) {
            var41 = var6.getUSmart();
         }

         var42 = 0;
         if((var39 & 4) != 0) {
            var42 = var7.getUSmart();
         }

         xVertices[var38] = var35 + var40;
         yVertices[var38] = var36 + var41;
         zVertices[var38] = var37 + var42;
         var35 = xVertices[var38];
         var36 = yVertices[var38];
         var37 = zVertices[var38];
         if(var16 == 1) {
            vertexVSkins[var38] = var8.getUByte();
         }
      }

      var4.pos = var30;
      var5.pos = var26;
      var6.pos = var24;
      var7.pos = var28;
      var8.pos = var25;

      for(var38 = 0; var38 < var10; ++var38) {
         triangleColors[var38] = (short)var4.getUShort();
         if(var12 == 1) {
            var39 = var5.getUByte();
            if((var39 & 1) == 1) {
               triangleFaceTypes[var38] = 1;
               var2 = true;
            } else {
               triangleFaceTypes[var38] = 0;
            }

            if((var39 & 2) == 2) {
               aByteArray2866[var38] = (byte)(var39 >> 2);
               triangleTextureIds[var38] = triangleColors[var38];
               triangleColors[var38] = 127;
               if(triangleTextureIds[var38] != -1) {
                  var3 = true;
               }
            } else {
               aByteArray2866[var38] = -1;
               triangleTextureIds[var38] = -1;
            }
         }

         if(var13 == 255) {
            trianglePriorities[var38] = var6.getByte();
         }

         if(var14 == 1) {
            triangleTransparencies[var38] = var7.getByte();
         }

         if(var15 == 1) {
            triangleTSkins[var38] = var8.getUByte();
         }
      }

      var4.pos = var29;
      var5.pos = var23;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.getUByte();
         if(var43 == 1) {
            var38 = var4.getUSmart() + var41;
            var39 = var4.getUSmart() + var38;
            var40 = var4.getUSmart() + var39;
            var41 = var40;
            trianglesA[var42] = var38;
            trianglesB[var42] = var39;
            trianglesC[var42] = var40;
         }

         if(var43 == 2) {
            var39 = var40;
            var40 = var4.getUSmart() + var41;
            var41 = var40;
            trianglesA[var42] = var38;
            trianglesB[var42] = var39;
            trianglesC[var42] = var40;
         }

         if(var43 == 3) {
            var38 = var40;
            var40 = var4.getUSmart() + var41;
            var41 = var40;
            trianglesA[var42] = var38;
            trianglesB[var42] = var39;
            trianglesC[var42] = var40;
         }

         if(var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.getUSmart() + var41;
            var41 = var40;
            trianglesA[var42] = var38;
            trianglesB[var42] = var44;
            trianglesC[var42] = var40;
         }
      }

      var4.pos = var31;

      for(var42 = 0; var42 < var11; ++var42) {
         aByteArray2857[var42] = 0;
         texTrianglesA[var42] = (short)var4.getUShort();
         texTrianglesB[var42] = (short)var4.getUShort();
         texTrianglesC[var42] = (short)var4.getUShort();
      }

      if(aByteArray2866 != null) {
         boolean var46 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = aByteArray2866[var43] & 255;
            if(var44 != 255) {
               if((texTrianglesA[var44] & '\uffff') == trianglesA[var43] && (texTrianglesB[var44] & '\uffff') == trianglesB[var43] && (texTrianglesC[var44] & '\uffff') == trianglesC[var43]) {
                  aByteArray2866[var43] = -1;
               } else {
                  var46 = true;
               }
            }
         }

         if(!var46) {
            aByteArray2866 = null;
         }
      }

      if(!var3) {
         triangleTextureIds = null;
      }

      if(!var2) {
         triangleFaceTypes = null;
      }

   }

   final void method2018() {
      for(int var1 = 0; var1 < vertexCount; ++var1) {
         int var2 = zVertices[var1];
         zVertices[var1] = xVertices[var1];
         xVertices[var1] = -var2;
      }

      method2007();
   }

   private ModelBuilder() {}

   private ModelBuilder(byte[] var1) {
      if(var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
    	  decodenew(var1);
      } else {
         decodeold(var1);
      }

   }

   ModelBuilder(int var1, int var2, int var3) {
      xVertices = new int[var1];
      yVertices = new int[var1];
      zVertices = new int[var1];
      vertexVSkins = new int[var1];
      trianglesA = new int[var2];
      trianglesB = new int[var2];
      trianglesC = new int[var2];
      triangleFaceTypes = new byte[var2];
      trianglePriorities = new byte[var2];
      triangleTransparencies = new byte[var2];
      triangleColors = new short[var2];
      triangleTextureIds = new short[var2];
      aByteArray2866 = new byte[var2];
      triangleTSkins = new int[var2];
      if(var3 > 0) {
         aByteArray2857 = new byte[var3];
         texTrianglesA = new short[var3];
         texTrianglesB = new short[var3];
         texTrianglesC = new short[var3];
         aShortArray2888 = new short[var3];
         aShortArray2882 = new short[var3];
         aShortArray2851 = new short[var3];
         aByteArray2845 = new byte[var3];
         aByteArray2867 = new byte[var3];
         aByteArray2877 = new byte[var3];
         aByteArray2852 = new byte[var3];
         aByteArray2869 = new byte[var3];
      }

   }

   ModelBuilder(ModelBuilder[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      vertexCount = 0;
      triangleCount = 0;
      anInt2862 = 0;
      byte var9 = 0;
      byte var10 = 0;
      aByte2848 = -1;

      int var11;
      for(var11 = 0; var11 < var2; ++var11) {
         ModelBuilder var12 = var1[var11];
         if(var12 != null) {
            vertexCount += var12.vertexCount;
            triangleCount += var12.triangleCount;
            anInt2862 += var12.anInt2862;
            if(var12.trianglePriorities != null) {
               var4 = true;
            } else {
               if(aByte2848 == -1) {
                  aByte2848 = var12.aByte2848;
               }

               if(aByte2848 != var12.aByte2848) {
                  var4 = true;
               }
            }

            var3 |= var12.triangleFaceTypes != null;
            var5 |= var12.triangleTransparencies != null;
            var6 |= var12.triangleTSkins != null;
            var7 |= var12.triangleTextureIds != null;
            var8 |= var12.aByteArray2866 != null;
         }
      }

      xVertices = new int[vertexCount];
      yVertices = new int[vertexCount];
      zVertices = new int[vertexCount];
      vertexVSkins = new int[vertexCount];
      aShortArray2893 = new short[vertexCount];
      trianglesA = new int[triangleCount];
      trianglesB = new int[triangleCount];
      trianglesC = new int[triangleCount];
      if(var3) {
         triangleFaceTypes = new byte[triangleCount];
      }

      if(var4) {
         trianglePriorities = new byte[triangleCount];
      }

      if(var5) {
         triangleTransparencies = new byte[triangleCount];
      }

      if(var6) {
         triangleTSkins = new int[triangleCount];
      }

      if(var7) {
         triangleTextureIds = new short[triangleCount];
      }

      if(var8) {
         aByteArray2866 = new byte[triangleCount];
      }

      if(var9 > 0) {
         ;
      }

      if(var10 > 0) {
         ;
      }

      triangleColors = new short[triangleCount];
      aShortArray2855 = new short[triangleCount];
      if(anInt2862 > 0) {
         aByteArray2857 = new byte[anInt2862];
         texTrianglesA = new short[anInt2862];
         texTrianglesB = new short[anInt2862];
         texTrianglesC = new short[anInt2862];
         aShortArray2888 = new short[anInt2862];
         aShortArray2882 = new short[anInt2862];
         aShortArray2851 = new short[anInt2862];
         aByteArray2845 = new byte[anInt2862];
         aByteArray2867 = new byte[anInt2862];
         aByteArray2877 = new byte[anInt2862];
         aByteArray2852 = new byte[anInt2862];
         aByteArray2869 = new byte[anInt2862];
      }

      vertexCount = 0;
      triangleCount = 0;
      anInt2862 = 0;
      boolean var16 = false;
      boolean var17 = false;

      for(var11 = 0; var11 < var2; ++var11) {
         short var18 = (short)(1 << var11);
         ModelBuilder var13 = var1[var11];
         if(var13 != null) {
            int var14;
            for(var14 = 0; var14 < var13.triangleCount; ++var14) {
               if(var3 && var13.triangleFaceTypes != null) {
                  triangleFaceTypes[triangleCount] = var13.triangleFaceTypes[var14];
               }

               if(var4) {
                  if(var13.trianglePriorities != null) {
                     trianglePriorities[triangleCount] = var13.trianglePriorities[var14];
                  } else {
                     trianglePriorities[triangleCount] = var13.aByte2848;
                  }
               }

               if(var5 && var13.triangleTransparencies != null) {
                  triangleTransparencies[triangleCount] = var13.triangleTransparencies[var14];
               }

               if(var6 && var13.triangleTSkins != null) {
                  triangleTSkins[triangleCount] = var13.triangleTSkins[var14];
               }

               if(var7) {
                  if(var13.triangleTextureIds != null) {
                     triangleTextureIds[triangleCount] = var13.triangleTextureIds[var14];
                  } else {
                     triangleTextureIds[triangleCount] = -1;
                  }
               }

               if(var8) {
                  if(var13.aByteArray2866 != null && var13.aByteArray2866[var14] != -1) {
                     aByteArray2866[triangleCount] = (byte)(var13.aByteArray2866[var14] + anInt2862);
                  } else {
                     aByteArray2866[triangleCount] = -1;
                  }
               }

               triangleColors[triangleCount] = var13.triangleColors[var14];
               aShortArray2855[triangleCount] = var18;
               trianglesA[triangleCount] = method1995(var13, var13.trianglesA[var14], var18);
               trianglesB[triangleCount] = method1995(var13, var13.trianglesB[var14], var18);
               trianglesC[triangleCount] = method1995(var13, var13.trianglesC[var14], var18);
               ++triangleCount;
            }

            for(var14 = 0; var14 < var13.anInt2862; ++var14) {
               byte var15 = aByteArray2857[anInt2862] = var13.aByteArray2857[var14];
               if(var15 == 0) {
                  texTrianglesA[anInt2862] = (short)method1995(var13, var13.texTrianglesA[var14], var18);
                  texTrianglesB[anInt2862] = (short)method1995(var13, var13.texTrianglesB[var14], var18);
                  texTrianglesC[anInt2862] = (short)method1995(var13, var13.texTrianglesC[var14], var18);
               }

               if(var15 >= 1 && var15 <= 3) {
                  texTrianglesA[anInt2862] = var13.texTrianglesA[var14];
                  texTrianglesB[anInt2862] = var13.texTrianglesB[var14];
                  texTrianglesC[anInt2862] = var13.texTrianglesC[var14];
                  aShortArray2888[anInt2862] = var13.aShortArray2888[var14];
                  aShortArray2882[anInt2862] = var13.aShortArray2882[var14];
                  aShortArray2851[anInt2862] = var13.aShortArray2851[var14];
                  aByteArray2845[anInt2862] = var13.aByteArray2845[var14];
                  aByteArray2867[anInt2862] = var13.aByteArray2867[var14];
                  aByteArray2877[anInt2862] = var13.aByteArray2877[var14];
               }

               if(var15 == 2) {
                  aByteArray2852[anInt2862] = var13.aByteArray2852[var14];
                  aByteArray2869[anInt2862] = var13.aByteArray2869[var14];
               }

               ++anInt2862;
            }
         }
      }

   }

   ModelBuilder(ModelBuilder var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      vertexCount = var1.vertexCount;
      triangleCount = var1.triangleCount;
      anInt2862 = var1.anInt2862;
      int var6;
      if(var2) {
         xVertices = var1.xVertices;
         yVertices = var1.yVertices;
         zVertices = var1.zVertices;
      } else {
         xVertices = new int[vertexCount];
         yVertices = new int[vertexCount];
         zVertices = new int[vertexCount];

         for(var6 = 0; var6 < vertexCount; ++var6) {
            xVertices[var6] = var1.xVertices[var6];
            yVertices[var6] = var1.yVertices[var6];
            zVertices[var6] = var1.zVertices[var6];
         }
      }

      if(var3) {
         triangleColors = var1.triangleColors;
      } else {
         triangleColors = new short[triangleCount];

         for(var6 = 0; var6 < triangleCount; ++var6) {
            triangleColors[var6] = var1.triangleColors[var6];
         }
      }

      if(!var4 && var1.triangleTextureIds != null) {
         triangleTextureIds = new short[triangleCount];

         for(var6 = 0; var6 < triangleCount; ++var6) {
            triangleTextureIds[var6] = var1.triangleTextureIds[var6];
         }
      } else {
         triangleTextureIds = var1.triangleTextureIds;
      }

      if(var5) {
         triangleTransparencies = var1.triangleTransparencies;
      } else {
         triangleTransparencies = new byte[triangleCount];
         if(var1.triangleTransparencies == null) {
            for(var6 = 0; var6 < triangleCount; ++var6) {
               triangleTransparencies[var6] = 0;
            }
         } else {
            for(var6 = 0; var6 < triangleCount; ++var6) {
               triangleTransparencies[var6] = var1.triangleTransparencies[var6];
            }
         }
      }

      trianglesA = var1.trianglesA;
      trianglesB = var1.trianglesB;
      trianglesC = var1.trianglesC;
      triangleFaceTypes = var1.triangleFaceTypes;
      trianglePriorities = var1.trianglePriorities;
      aByteArray2866 = var1.aByteArray2866;
      aByte2848 = var1.aByte2848;
      aByteArray2857 = var1.aByteArray2857;
      texTrianglesA = var1.texTrianglesA;
      texTrianglesB = var1.texTrianglesB;
      texTrianglesC = var1.texTrianglesC;
      aShortArray2888 = var1.aShortArray2888;
      aShortArray2882 = var1.aShortArray2882;
      aShortArray2851 = var1.aShortArray2851;
      aByteArray2845 = var1.aByteArray2845;
      aByteArray2867 = var1.aByteArray2867;
      aByteArray2877 = var1.aByteArray2877;
      aByteArray2852 = var1.aByteArray2852;
      aByteArray2869 = var1.aByteArray2869;
      vertexVSkins = var1.vertexVSkins;
      triangleTSkins = var1.triangleTSkins;
      anIntArrayArray2890 = var1.anIntArrayArray2890;
      anIntArrayArray2856 = var1.anIntArrayArray2856;
      normalVertices = var1.normalVertices;
      fixedNormalVertices = var1.fixedNormalVertices;
      aClass50Array2883 = var1.aClass50Array2883;
      aShort2879 = var1.aShort2879;
      aShort2876 = var1.aShort2876;
   }

}
