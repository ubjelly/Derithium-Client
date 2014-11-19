
final class Class39 {

   static int anInt670 = 0;

   static final void method1033(boolean var1) {
         StringNode.aBoolean2583 = var1;
         if(!StringNode.aBoolean2583) {
        	 int regionY = SpotAnimation.aClass3_Sub30_Sub1_532.getUShortA();
        	 
            int regionLength = (Hashtable.anInt1704 - SpotAnimation.aClass3_Sub30_Sub1_532.pos) / 16;
            Class3_Sub9.anIntArrayArray2319 = new int[regionLength][4];
            
            for(int region = 0; regionLength > region; ++region) {
               for(int plane = 0; plane < 4; ++plane) {
                  Class3_Sub9.anIntArrayArray2319[region][plane] = SpotAnimation.aClass3_Sub30_Sub1_532.getInt1();
               }
            }

            int regionX = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
            int localX = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
            int z = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
            int localY = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
            Class3_Sub24_Sub3.anIntArray3494 = new int[regionLength];
            Class164_Sub2.aByteArrayArray3027 = new byte[regionLength][];
            Class3_Sub13_Sub26.aByteArrayArray3335 = (byte[][])null;
            Class3_Sub13_Sub15.anIntArray3181 = new int[regionLength];
            Class3_Sub22.aByteArrayArray2521 = new byte[regionLength][];
            Class3_Sub13_Sub4.aByteArrayArray3057 = new byte[regionLength][];
            Class3_Sub13_Sub24.anIntArray3290 = null;
            client.anIntArray2200 = new int[regionLength];
            GroundItem.aByteArrayArray3669 = new byte[regionLength][];
            Class101.anIntArray1426 = new int[regionLength];
            AnimationLoader.anIntArray3587 = new int[regionLength];
            boolean var8 = false;
            if((regionX / 8 == 48 || -50 == ~(regionX / 8)) && regionY / 8 == 48) {
               var8 = true;
            }

            if(regionX / 8 == 48 && regionY / 8 == 148) {
               var8 = true;
            }

            regionLength = 0;
            for(int xStep = (regionX - 6) / 8; (6 + regionX) / 8 >= xStep; ++xStep) {
               for(int yStep = (regionY - 6) / 8; ((6 + regionY) / 8) >= yStep; ++yStep) {
                  int regionId = (xStep << 8) - -yStep;
                  if(var8 && (yStep == 49 || yStep == 149 || 147 == yStep || -51 == ~xStep || -50 == ~xStep && ~yStep == -48)) {
                     Class3_Sub24_Sub3.anIntArray3494[regionLength] = regionId;
                     client.anIntArray2200[regionLength] = -1;
                     Class101.anIntArray1426[regionLength] = -1;
                     Class3_Sub13_Sub15.anIntArray3181[regionLength] = -1;
                     AnimationLoader.anIntArray3587[regionLength] = -1;
                  } else {
                     Class3_Sub24_Sub3.anIntArray3494[regionLength] = regionId;
                     client.anIntArray2200[regionLength] = Class3_Sub13_Sub6.cacheIndex5.method2120(client.method903(new jString[]{PacketBuffer.aClass94_3807, Class72.method1298(xStep), Class3_Sub13_Sub14.aClass94_3161, Class72.method1298(yStep)}));
                     Class101.anIntArray1426[regionLength] = Class3_Sub13_Sub6.cacheIndex5.method2120(client.method903(new jString[]{Class161.aClass94_2029, Class72.method1298(xStep), Class3_Sub13_Sub14.aClass94_3161, Class72.method1298(yStep)}));
                     //Class3_Sub13_Sub15.anIntArray3181[arrayId] = Class3_Sub13_Sub6.aClass153_3077.method2120(RenderAnimationDefinition.method903(new RSString[]{Class95.aClass94_1333, Class72.method1298((byte)9, var9), Class3_Sub13_Sub14.aClass94_3161, Class72.method1298((byte)9, var10)}, (byte)-107), (byte)-30);
                     //Class3_Sub28_Sub5.anIntArray3587[arrayId] = Class3_Sub13_Sub6.aClass153_3077.method2120(RenderAnimationDefinition.method903(new RSString[]{Class167.aClass94_2084, Class72.method1298((byte)9, var9), Class3_Sub13_Sub14.aClass94_3161, Class72.method1298((byte)9, var10)}, (byte)-91), (byte)-30);
                  }

                  ++regionLength;
               }
            }

            Class65943149.method1301(z, regionY, regionX, localY, false, localX, true);
         } else {
            int regionX = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShortA();
            int z = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteS();
            int regionY = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShortA();
            int localY = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShortA();
            int localX = SpotAnimation.aClass3_Sub30_Sub1_532.getUShortA();
            SpotAnimation.aClass3_Sub30_Sub1_532.initBitAccess();

            for(int plane = 0; plane < 4; ++plane) {
               for(int x = 0; x < 13; ++x) {
                  for(int y = 0; 13 > y; ++y) {
                     int exist = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(1);
                     if(exist != 1) {
                        ObjectDefinition.anIntArrayArrayArray1497[plane][x][y] = -1;
                     } else {
                        ObjectDefinition.anIntArrayArrayArray1497[plane][x][y] = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(26);
                     }
                  }
               }
            }

            SpotAnimation.aClass3_Sub30_Sub1_532.endBitAccess();
            int regionCount = (-SpotAnimation.aClass3_Sub30_Sub1_532.pos + Hashtable.anInt1704) / 16;
            Class3_Sub9.anIntArrayArray2319 = new int[regionCount][4];

            for(int regionId = 0; regionId < regionCount; ++regionId) {
               for(int plane = 0; plane < 4; ++plane) {
                  Class3_Sub9.anIntArrayArray2319[regionId][plane] = SpotAnimation.aClass3_Sub30_Sub1_532.getInt();
               }
            }

            AnimationLoader.anIntArray3587 = new int[regionCount];
            Class101.anIntArray1426 = new int[regionCount];
            client.anIntArray2200 = new int[regionCount];
            Class3_Sub13_Sub4.aByteArrayArray3057 = new byte[regionCount][];
            Class3_Sub13_Sub24.anIntArray3290 = null;
            Class3_Sub13_Sub15.anIntArray3181 = new int[regionCount];
            Class3_Sub22.aByteArrayArray2521 = new byte[regionCount][];
            Class164_Sub2.aByteArrayArray3027 = new byte[regionCount][];
            Class3_Sub24_Sub3.anIntArray3494 = new int[regionCount];
            Class3_Sub13_Sub26.aByteArrayArray3335 = (byte[][])null;
            GroundItem.aByteArrayArray3669 = new byte[regionCount][];
            regionCount = 0;

            for(int plane = 0; -5 < ~plane; ++plane) {
               for(int stepX = 0; stepX < 13; ++stepX) {
                  for(int stepY = 0; ~stepY > -14; ++stepY) {
                     int info = ObjectDefinition.anIntArrayArrayArray1497[plane][stepX][stepY];
                     if(0 != ~info) {
                        int chunkX = (0xffcd3b & info) >> -2107931090;
                        int chunkY = (info & 0x3ffb) >> -103046685;
                        int var14 = (chunkX / 8 << -612065144) - -(chunkY / 8);

                        int var15;
                        for(var15 = 0; ~var15 > ~regionCount; ++var15) {
                           if(~var14 == ~Class3_Sub24_Sub3.anIntArray3494[var15]) {
                              var14 = -1;
                              break;
                           }
                        }

                        if(var14 != -1) {
                           Class3_Sub24_Sub3.anIntArray3494[regionCount] = var14;
                           int var16 = var14 & 255;
                           var15 = ('\uff6c' & var14) >> 8;
                           client.anIntArray2200[regionCount] = Class3_Sub13_Sub6.cacheIndex5.method2120(client.method903(new jString[]{PacketBuffer.aClass94_3807, Class72.method1298(var15), Class3_Sub13_Sub14.aClass94_3161, Class72.method1298(var16)}));
                           Class101.anIntArray1426[regionCount] = Class3_Sub13_Sub6.cacheIndex5.method2120(client.method903(new jString[]{Class161.aClass94_2029, Class72.method1298(var15), Class3_Sub13_Sub14.aClass94_3161, Class72.method1298(var16)}));
                           //Class3_Sub13_Sub15.anIntArray3181[regionY] = Class3_Sub13_Sub6.cacheIndex5.method2120(RenderAnimationDefinition.method903(new jString[]{Class95.aClass94_1333, Class72.method1298(var15), Class3_Sub13_Sub14.aClass94_3161, Class72.method1298(var16)}, (byte)-85));
                           //AnimationLoader.anIntArray3587[regionY] = Class3_Sub13_Sub6.cacheIndex5.method2120(RenderAnimationDefinition.method903(new jString[]{Class167.aClass94_2084, Class72.method1298(var15), Class3_Sub13_Sub14.aClass94_3161, Class72.method1298(var16)}, (byte)-93));
                           ++regionCount;
                        }
                     }
                  }
               }
            }

            Class65943149.method1301(z, regionX, regionY, localY, false, localX, true);
         }
   }

   static final void method1036(int var0) {
      try {
         Class86 var1 = new Class86();
         if(var0 <= 101) {
            loadMiscSprites((js5)null);
         }

         for(int var2 = 0; -14 < ~var2; ++var2) {
            for(int var3 = 0; -14 < ~var3; ++var3) {
               Class115.aClass86ArrayArray1581[var2][var3] = var1;
            }
         }

      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "g.D(" + var0 + ')');
      }
   }

   static final Class19 method1037(int var0, int var1, int var2) {
      GroundTile var3 = Class75_Sub2.groundTiles[var0][var1][var2];
      if(var3 == null) {
         return null;
      } else {
         Class19 var4 = var3.aClass19_2233;
         var3.aClass19_2233 = null;
         return var4;
      }
   }

   static final void method1038(byte var0) {
      try {
         int var1;
         int var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         if(jString.anInt2147 == 16) {
             var1 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteA();
             var3 = var1 & 3;
             var2 = var1 >> 2;
             var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteA();
             var6 = ((125 & var5) >> 4) + Class65.anInt990;
             var7 = (7 & var5) + Class107.anInt1452;
            var4 = Class75.anIntArray1107[var2];
            if(0 <= var6 && var7 >= 0 && ~var6 > -105 && 104 > var7) {
               Queue.method881(Class26.plane, var7, var3, var6, -1, -1, var4, var2, 0);
            }

         } else if(jString.anInt2147 == 112) {
            var1 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
            var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
            var2 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteS();
            var4 = (7 & var2) + Class107.anInt1452;
            var3 = ((120 & var2) >> 4) + Class65.anInt990;
            if(~var3 <= -1 && ~var4 <= -1 && 104 > var3 && var4 < 104) {
               ItemPile var31 = new ItemPile();
               var31.amount = var5;
               var31.id = var1;
               if(Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[Class26.plane][var3][var4] == null) {
                  Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[Class26.plane][var3][var4] = new Deque();
               }

               Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[Class26.plane][var3][var4].insertBack(new GroundItem(var31));
               Class128.spawnGroundItem(var4, var3);
            }

         } else {
            int var8;
            int var10;
            int var11;
            int var13;
            int var28;
            int var35;
            Class140_Sub6 var36;
            if(-122 == ~jString.anInt2147) {
               var1 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
               var2 = 2 * Class65.anInt990 + (15 & var1 >> 4);
               var3 = (15 & var1) + 2 * Class107.anInt1452;
               var4 = var2 - -SpotAnimation.aClass3_Sub30_Sub1_532.getByte();
               var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getByte() + var3;
               var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getShort();
               var7 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
               var8 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte() * 4;
               var28 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte() * 4;
               var10 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
               var11 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
               var35 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
               if(-256 == ~var35) {
                  var35 = -1;
               }

               var13 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
               if(0 <= var2 && 0 <= var3 && 208 > var2 && 208 > var3 && var4 >= 0 && 0 <= var5 && var4 < 208 && -209 < ~var5 && var7 != '\uffff') {
                  var5 *= 64;
                  var4 = 64 * var4;
                  var3 = 64 * var3;
                  var2 = 64 * var2;
                  var36 = new Class140_Sub6(var7, Class26.plane, var2, var3, Class121.method1736(Class26.plane, 1, var2, var3) + -var8, Class44.loopCycle + var10, var11 + Class44.loopCycle, var35, var13, var6, var28);
                  var36.method2024(var5, 1, Class44.loopCycle + var10, -var28 + Class121.method1736(Class26.plane, 1, var4, var5), var4);
                  Class3_Sub13_Sub30.aClass61_3364.insertBack(new Class3_Sub28_Sub19(var36));
               }

            } else if(jString.anInt2147 == 186) {
               var1 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
               var2 = Class65.anInt990 + (var1 >> 4 & 7);
               var3 = Class107.anInt1452 - -(var1 & 7);
               var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
               var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
               var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
               if(-1 >= ~var2 && ~var3 <= -1 && ~var2 > -105 && -105 < ~var3) {
                  var2 = var2 * 128 - -64;
                  var3 = var3 * 128 - -64;
                  Class140_Sub2 var32 = new Class140_Sub2(var4, Class26.plane, var2, var3, -var5 + Class121.method1736(Class26.plane, 1, var2, var3), var6, Class44.loopCycle);
                  Class3_Sub13_Sub15.aClass61_3177.insertBack(new Class3_Sub28_Sub2(var32));
               }

            } else if(jString.anInt2147 == 17) {
                var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteA();
                var6 = Class65.anInt990 - -((var5 & 125) >> 4);
                var7 = (7 & var5) + Class107.anInt1452;
               var8 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
               var1 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteA();
               var2 = var1 >> 2;
               var3 = 3 & var1;
               var4 = Class75.anIntArray1107[var2];
               if(~var6 <= -1 && var7 >= 0 && var6 < 104 && ~var7 > -105) {
                  Queue.method881(Class26.plane, var7, var3, var6, -1, var8, var4, var2, 0);
               }

            } else if(~jString.anInt2147 != -21) {
               int var14;
               if(202 == jString.anInt2147) {
                  var1 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                  var2 = var1 >> 2;
                  var3 = var1 & 3;
                  var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                  var5 = (var4 >> 4 & 7) + Class65.anInt990;
                  var6 = (7 & var4) + Class107.anInt1452;
                  byte var25 = SpotAnimation.aClass3_Sub30_Sub1_532.getByteA();
                  byte var30 = SpotAnimation.aClass3_Sub30_Sub1_532.getByteA();
                  byte var9 = SpotAnimation.aClass3_Sub30_Sub1_532.getByteS();
                  var10 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShortA();
                  var11 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
                  byte var12 = SpotAnimation.aClass3_Sub30_Sub1_532.getByte();
                  var13 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                  var14 = SpotAnimation.aClass3_Sub30_Sub1_532.method788(-1741292848);
                  if(!HDToolkit.openGLEnabled) {
                     Class3_Sub13_Sub23.method280(var12, var13, var14, var11, var6, var9, var3, var25, var5, var2, -745213428, var30, var10);
                  }
               }

               if(-15 == ~jString.anInt2147) {
                  var1 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                  var3 = Class107.anInt1452 + (var1 & 7);
                  var2 = ((var1 & 119) >> 4) + Class65.anInt990;
                  var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                  var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                  var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                  if(0 <= var2 && ~var3 <= -1 && var2 < 104 && ~var3 > -105) {
                     Deque var29 = Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[Class26.plane][var2][var3];
                     if(var29 != null) {
                        for(GroundItem var34 = (GroundItem)var29.getFirst(); var34 != null; var34 = (GroundItem)var29.getNext()) {
                           ItemPile var33 = var34.aClass140_Sub7_3676;
                           if(~(var4 & 32767) == ~var33.id && var5 == var33.amount) {
                              var33.amount = var6;
                              break;
                           }
                        }

                        Class128.spawnGroundItem(var3, var2);
                     }
                  }

               } else if(135 == jString.anInt2147) {
                  var1 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShortA();
                  var2 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteC();
                  var4 = Class107.anInt1452 + (7 & var2);
                  var3 = (7 & var2 >> 4) + Class65.anInt990;
                  var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
                  var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
                  if(0 <= var3 && ~var4 <= -1 && var3 < 104 && -105 < ~var4 && ClickMaskNode.anInt2211 != var1) {
                     ItemPile var27 = new ItemPile();
                     var27.amount = var5;
                     var27.id = var6;
                     if(null == Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[Class26.plane][var3][var4]) {
                        Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[Class26.plane][var3][var4] = new Deque();
                     }

                     Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[Class26.plane][var3][var4].insertBack(new GroundItem(var27));
                     Class128.spawnGroundItem(var4, var3);
                  }

               } else if(var0 <= -67) {
                  if(218 != jString.anInt2147) {
                     if(jString.anInt2147 == 104) {
                        var1 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                        var3 = 2 * Class107.anInt1452 + (var1 & 15);
                        var2 = 2 * Class65.anInt990 - -(var1 >> 4 & 15);
                        var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getByte() + var2;
                        var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getByte() + var3;
                        var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getShort();
                        var7 = SpotAnimation.aClass3_Sub30_Sub1_532.getShort();
                        var8 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                        var28 = SpotAnimation.aClass3_Sub30_Sub1_532.getByte();
                        var10 = 4 * SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                        var11 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                        var35 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                        var13 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                        var14 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                        if(255 == var13) {
                           var13 = -1;
                        }

                        if(var2 >= 0 && -1 >= ~var3 && 208 > var2 && var3 < 208 && 0 <= var4 && ~var5 <= -1 && 208 > var4 && 208 > var5 && var8 != '\uffff') {
                           var4 = 64 * var4;
                           var2 *= 64;
                           var5 *= 64;
                           var3 *= 64;
                           if(~var6 != -1) {
                              int var15;
                              int var17;
                              Object var16;
                              int var18;
                              if(0 <= var6) {
                                 var17 = var6 - 1;
                                 var18 = 2047 & var17;
                                 var15 = 15 & var17 >> 11;
                                 var16 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var18];
                              } else {
                                 var17 = -1 + -var6;
                                 var15 = (31085 & var17) >> 11;
                                 var18 = 2047 & var17;
                                 if(ClickMaskNode.anInt2211 != var18) {
                                    var16 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var18];
                                 } else {
                                    var16 = TextureLoader.selfPlayer;
                                 }
                              }
                           }

                           Class140_Sub6 var37 = new Class140_Sub6(var8, Class26.plane, var2, var3, -var28 + Class121.method1736(Class26.plane, 1, var2, var3), var11 + Class44.loopCycle, var35 + Class44.loopCycle, var13, var14, var7, var10);
                           var37.method2024(var5, 1, var11 + Class44.loopCycle, -var10 + Class121.method1736(Class26.plane, 1, var4, var5), var4);
                           Class3_Sub13_Sub30.aClass61_3364.insertBack(new Class3_Sub28_Sub19(var37));
                        }

                     } else if(97 == jString.anInt2147) {
                        var1 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                        var2 = Class65.anInt990 + (7 & var1 >> 4);
                        var3 = Class107.anInt1452 + (var1 & 7);
                        var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                        if(~var4 == -65536) {
                           var4 = -1;
                        }

                        var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                        var6 = (242 & var5) >> 4;
                        var8 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                        var7 = 7 & var5;
                        if(-1 >= ~var2 && -1 >= ~var3 && var2 < 104 && var3 < 104) {
                           var28 = 1 + var6;
                           if(~TextureLoader.selfPlayer.anIntArray2767[0] <= ~(var2 + -var28) && ~(var28 + var2) <= ~TextureLoader.selfPlayer.anIntArray2767[0] && TextureLoader.selfPlayer.anIntArray2755[0] >= -var28 + var3 && TextureLoader.selfPlayer.anIntArray2755[0] <= var28 + var3 && 0 != Class14.areaSoundsVolume && var7 > 0 && 50 > Class113.anInt1552 && ~var4 != 0) {
                              InventoryNode.anIntArray2550[Class113.anInt1552] = var4;
                              Class166.anIntArray2068[Class113.anInt1552] = var7;
                              jString.anIntArray2157[Class113.anInt1552] = var8;
                              TextureLoader.aClass135Array2131[Class113.anInt1552] = null;
                              Class3_Sub13_Sub6.anIntArray3083[Class113.anInt1552] = var6 + ((var2 << 16) - -(var3 << 8));
                              ++Class113.anInt1552;
                           }
                        }

                     } else if(jString.anInt2147 == 39) {
                         var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShortA();
                        var1 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteS();
                        var3 = Class107.anInt1452 + (var1 & 7);
                        var2 = ((113 & var1) >> 4) + Class65.anInt990;
                        if(-1 >= ~var2 && var3 >= 0 && 104 > var2 && 104 > var3) {
                           Deque var24 = Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[Class26.plane][var2][var3];
                           if(var24 != null) {
                              for(GroundItem var26 = (GroundItem)var24.getFirst(); var26 != null; var26 = (GroundItem)var24.getNext()) {
                                 if(var26.aClass140_Sub7_3676.id == (var4 & 32767)) {
                                    var26.unlink();
                                    break;
                                 }
                              }

                              if(var24.getFirst() == null) {
                                 Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[Class26.plane][var2][var3] = null;
                              }

                              Class128.spawnGroundItem(var3, var2);
                           }
                        }

                     }
                  } else {
                     var1 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                     var2 = Class65.anInt990 - -(var1 >> 4 & 7);
                     var3 = (var1 & 7) + Class107.anInt1452;
                     var4 = var2 + SpotAnimation.aClass3_Sub30_Sub1_532.getByte();
                     var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getByte() + var3;
                     var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getShort();
                     var7 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                     var8 = 4 * SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                     var28 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte() * 4;
                     var10 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                     var11 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
                     var35 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                     var13 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
                     if(255 == var35) {
                        var35 = -1;
                     }

                     if(~var2 <= -1 && var3 >= 0 && -105 < ~var2 && 104 > var3 && ~var4 <= -1 && var5 >= 0 && -105 < ~var4 && 104 > var5 && -65536 != ~var7) {
                        var5 = var5 * 128 + 64;
                        var3 = 128 * var3 + 64;
                        var2 = 128 * var2 + 64;
                        var4 = 128 * var4 + 64;
                        var36 = new Class140_Sub6(var7, Class26.plane, var2, var3, Class121.method1736(Class26.plane, 1, var2, var3) + -var8, var10 + Class44.loopCycle, var11 + Class44.loopCycle, var35, var13, var6, var28);
                        var36.method2024(var5, 1, Class44.loopCycle + var10, Class121.method1736(Class26.plane, 1, var4, var5) - var28, var4);
                        Class3_Sub13_Sub30.aClass61_3364.insertBack(new Class3_Sub28_Sub19(var36));
                     }

                  }
               }
            } else {
               var1 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteS();
               var2 = ((var1 & 125) >> 4) + Class65.anInt990;
               var3 = Class107.anInt1452 + (7 & var1);
               var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteS();
               var5 = var4 >> 2;
               var6 = 3 & var4;
               var7 = Class75.anIntArray1107[var5];
               var8 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
               if('\uffff' == var8) {
                  var8 = -1;
               }

               Vertex.method1131(Class26.plane, 125, var6, var5, var3, var7, var2, var8);
            }
         }
      } catch (RuntimeException var23) {
         throw Class44.method1067(var23, "g.G(" + var0 + ')');
      }
   }

   static final void loadMiscSprites(js5 var1) {
         HintIcon.anInt1352 = var1.method2120(Class140_Sub2.aClass94_2700);
         Class75_Sub2.anInt2643 = var1.method2120(Class26.aClass94_504);
         Class3_Sub13_Sub11.anInt3132 = var1.method2120(Class3_Sub13_Sub11.aClass94_3138);
         UnderlayType.anInt2104 = var1.method2120(js5Worker.aClass94_2959);
         Class3_Sub13_Sub23_Sub1.old_markers_id = var1.method2120(Class3_Sub13_Sub31.old_markers_string);
         Class3_Sub13_Sub23_Sub1.new_markers_id = var1.method2120(Class3_Sub13_Sub31.new_markers_string);
         client.infinitySymbolId = var1.method2120(client.infinitySymbolString);
         client.mapscenesId = var1.method2120(client.mapscene);
         client.mapbackId = var1.method2120(client.mapback);
         client.set_464_id = var1.method2120(jString.createJString("464_set"));
         client.set_530_id = var1.method2120(jString.createJString("530_set"));
         client.set_562_id = var1.method2120(jString.createJString("562_set"));
         client.set_602_id = var1.method2120(jString.createJString("602_set"));
         client.revision_images_id = var1.method2120(jString.createJString("rev_sprites"));
         client.anInt2195 = var1.method2120(Class164_Sub1.aClass94_3008);
         NodeSub.anInt2575 = var1.method2120(Class72.aClass94_1070);
         client.anInt380 = var1.method2120(Class134.aClass94_1764);
         Class3_Sub13_Sub29.anInt3356 = var1.method2120(SubScript.aClass94_871);
         MillisTimer.anInt2689 = var1.method2120(Class113.aClass94_1556);
         Class3_Sub13_Sub4.anInt3061 = var1.method2120(Class3_Sub13_Sub38.aClass94_3452);
         Class75_Sub1.anInt2633 = var1.method2120(Class3_Sub13_Sub14.aClass94_3168);
         Class40.anInt678 = var1.method2120(Class113.aClass94_1567);
         Class3_Sub15.anInt2436 = var1.method2120(KeyboardHandler.aClass94_1913);
         Class3_Sub28_Sub18.anInt3757 = var1.method2120(Class3_Sub28_Sub4.aClass94_3576);
         Class45.anInt735 = var1.method2120(Class140_Sub2.aClass94_2702);
         Class93.anInt1325 = var1.method2120(UnderlayType.aClass94_2089);
         IntegerNode.anInt2471 = var1.method2120(Class7.aClass94_2164);
   }

}
