
final class PlayerAppearance {

   static jString aClass94_852 = jString.createJString("(U4");
   static jString aClass94_853 = jString.createJString("::tele ");
   int npcId;
   private long aLong855;
   static jString aClass94_856 = jString.createJString("::ld");
   private int[] appearanceInfo;
   static int[] anIntArray859;
   private long appearanceHash;
   static int[] anIntArray861;
   private int[] colors;
   private int[][] anIntArrayArray863;
   boolean isFemale;


   final AbstractModel method1157(int var1, int var2, int var3, int var4, AnimationDefinition var5, int var6, int var7, int var8) {
      try {
         if(var8 != -2012759707) {
            this.npcId = -32;
         }

         long var9 = (long)var3 | (long)(var7 << 16) | (long)var2 << 32;
         AbstractModel var11 = (AbstractModel)Class80.aClass93_1131.get(var9);
         if(null == var11) {
            ModelBuilder[] var12 = new ModelBuilder[3];
            int var13 = 0;
            if(!IdentityKit.list(var3).method948(var8 ^ -2012744886) || !IdentityKit.list(var7).method948(18991) || !IdentityKit.list(var2).method948(18991)) {
               return null;
            }

            ModelBuilder var14 = IdentityKit.list(var3).method941(true);
            if(null != var14) {
               var12[var13++] = var14;
            }

            var14 = IdentityKit.list(var7).method941(true);
            if(var14 != null) {
               var12[var13++] = var14;
            }

            var14 = IdentityKit.list(var2).method941(true);
            if(var14 != null) {
               var12[var13++] = var14;
            }

            var14 = new ModelBuilder(var12, var13);

            for(int var15 = 0; ~var15 > -6; ++var15) {
               if(~this.colors[var15] > ~Class15.aShortArrayArray344[var15].length) {
                  var14.swapColors(InventoryNode.aShortArray2548[var15], Class15.aShortArrayArray344[var15][this.colors[var15]]);
               }

               if(~Class101.aShortArrayArray1429[var15].length < ~this.colors[var15]) {
                  var14.swapColors(CollisionMap.aShortArray1311[var15], Class101.aShortArrayArray1429[var15][this.colors[var15]]);
               }
            }

            var11 = var14.convert(64, 768, -50, -10, -50);
            Class80.aClass93_1131.put(var11, var9);
         }

         if(null != var5) {
            var11 = var5.method2055(var11, (byte)-86, var1, var4, var6);
         }

         return var11;
      } catch (RuntimeException var16) {
         throw Class44.method1067(var16, "hh.J(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null?"{...}":"null") + ',' + var6 + ',' + var7 + ',' + var8 + ')');
      }
   }

   private final void updateAppearance() {
	   /*long var2 = this.appearanceHash;
	   this.appearanceHash = -1L;
	   long[] var4 = Class120.aLongArray1631;
	   this.appearanceHash = var4[(int)(255L & ((long)(this.appearanceHash >> 8) ^ this.appearanceHash))] ^ this.appearanceHash >>> 8;
	   this.appearanceHash = var4[(int)(255L & (this.appearanceHash ^ (long)this.appearanceHash))] ^ this.appearanceHash >>> 8;

	   int var5;
	   for(var5 = 0; 12 > var5; ++var5) {
		   this.appearanceHash = this.appearanceHash >>> 8 ^ var4[(int)((this.appearanceHash ^ (long)(this.appearanceInfo[var5] >> 24)) & 255L)];
		   this.appearanceHash = this.appearanceHash >>> 8 ^ var4[(int)(255L & (this.appearanceHash ^ (long)(this.appearanceInfo[var5] >> 16)))];
		   this.appearanceHash = var4[(int)(255L & ((long)(this.appearanceInfo[var5] >> 8) ^ this.appearanceHash))] ^ this.appearanceHash >>> 8;
		   this.appearanceHash = this.appearanceHash >>> 8 ^ var4[(int)((this.appearanceHash ^ (long)this.appearanceInfo[var5]) & 255L)];
	   }

	   for(var5 = 0; var5 < 5; ++var5) {
		   this.appearanceHash = var4[(int)(((long)this.colors[var5] ^ this.appearanceHash) & 255L)] ^ this.appearanceHash >>> 8;
	   }
	   
	   this.appearanceHash = var4[(int)(((long)(this.isFemale?1:0) ^ this.appearanceHash) & 255L)] ^ this.appearanceHash >>> 8;*/
	  	long currentHash = appearanceHash;
    	int shield = appearanceInfo[5];
    	int hands = appearanceInfo[9];
    	appearanceInfo[5] = hands;
    	appearanceInfo[9] = shield;
    	appearanceHash = 0L;
    	for (int id = 0; id < 12; id++) {
    		appearanceHash <<= 4;
    		if (appearanceInfo[id] >= 256)
    			appearanceHash += (long) (appearanceInfo[id] - 256);
    	}
    	if (appearanceInfo[0] >= 256)
    		appearanceHash += (long) (appearanceInfo[0] - 256 >> 4);
    	if (appearanceInfo[1] >= 256)
    		appearanceHash += (long) (appearanceInfo[1] - 256 >> 8);
    	for (int i_38_ = 0; i_38_ < 5; i_38_++) {
    		appearanceHash <<= 3;
    		appearanceHash += (long) colors[i_38_];
    	}
    	appearanceHash <<= 1;
    	appearanceHash += (long) (isFemale ? 1 : 0);
    	/* ^ simplified, FIXME use that if any issues
    	 *     	PlayerAppearance instance = this;
    	instance.equipmentHash = instance.equipmentHash + (long) (!isFemale ? 0 : 1);
    	 */
    	appearanceInfo[5] = shield;
    	appearanceInfo[9] = hands;
    	if(0L != currentHash && this.appearanceHash != currentHash) {
    		KeyboardHandler.aClass93_1911.remove(currentHash);
    	}

   }

   final void method1159(boolean var1, boolean var2) {
      try {
         if(!var2) {
            anIntArray859 = (int[])null;
         }

         this.isFemale = var1;
         this.updateAppearance();
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "hh.A(" + var1 + ',' + var2 + ')');
      }
   }

   static final void method1160(int var1) {
	   if(Canvas_Sub2.loadInterface(var1)) {
		   Class67.method1260(-1, SceneGraphNode.interfaceCache[var1]);
	   }
   }

   final void setAppearance(int[] col, int npc, boolean fem, int[] ei) {
//colors, npcId, ~var4 == -2, equipmentIds, 
         if(null == ei) {
            ei = new int[12];

            for(int var7 = 0; -9 < ~var7; ++var7) {
               for(int var8 = 0; Class25.anInt497 > var8; ++var8) {
                  IdentityKit var9 = IdentityKit.list(var8);
                  if(null != var9 && !var9.aBoolean476 && ~var9.anInt466 == ~(!fem?Class3_Sub26.anIntArray2559[var7]:Class3_Sub13_Sub19.anIntArray3228[var7])) {
                     ei[Class163.anIntArray2043[var7]] = var8 + 256;
                     break;
                  }
               }
            }
         }

         this.npcId = npc;
         this.isFemale = fem;
         this.colors = col;
         this.appearanceInfo = ei;
         this.updateAppearance();
   }

   final void method1162(int var1, boolean var2, int var3) {
      try {
         this.colors[var1] = var3;
         this.updateAppearance();
         if(var2) {
            this.method1159(false, false);
         }

      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "hh.L(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   final int method1163(int var1) {
      try {
         if(var1 != -24861) {
            anIntArray859 = (int[])null;
         }

         return this.npcId != -1?305419896 + NpcDefinition.list(this.npcId).anInt1284:(this.appearanceInfo[8] << 10) + ((this.colors[0] << 25) - -(this.colors[4] << 20)) - (-(this.appearanceInfo[0] << 15) - ((this.appearanceInfo[11] << 5) + this.appearanceInfo[1]));
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "hh.E(" + var1 + ')');
      }
   }

   final void method1164(int var1, int var2, int var3) {
	   int var4 = Class163.anIntArray2043[var1];
	   if(0 != this.appearanceInfo[var4]) {
		   if(IdentityKit.list(var2 - 256) != null) {
			   this.appearanceInfo[var4] = var2 - 256;
			   this.updateAppearance();
		   }
	   }
   }

   final AbstractModel method1165(Class145[] var1, int var2, AnimationDefinition movingAnimation, AnimationDefinition currentAnimation, int var5, int var6, int var7, int var8, boolean var9, int frameIndex, int var11) {
      try {
         int var12 = 102 % ((var7 - -39) / 61);
         if(0 != ~this.npcId) {
            return NpcDefinition.list(this.npcId).method1476(var1, var6, (byte)-128, var11, var2, var8, frameIndex, movingAnimation, var5, currentAnimation);
         } else {
            int[] equipment = this.appearanceInfo;
            long hash = this.appearanceHash;
            if(currentAnimation != null && (currentAnimation.anInt1854 >= 0 || currentAnimation.anInt1849 >= 0)) {
               equipment = new int[12];

               for(int var16 = 0; 12 > var16; ++var16) {
                  equipment[var16] = this.appearanceInfo[var16];
               }
               
               if(client.clientLoad == 464) {
                   if(currentAnimation.anInt1854 >= 0) {
	            	   equipment[5] = currentAnimation.anInt1854;
	            	   hash += (long) (currentAnimation.anInt1854 - (appearanceInfo[5] << 8));
	               }
	
	               if(currentAnimation.anInt1849 >= 0) {
	            	   equipment[3] = currentAnimation.anInt1849;
	            	   hash += (long) (currentAnimation.anInt1849 - (appearanceInfo[3] << 16));
	               }   
               } else {
	               if(currentAnimation.anInt1854 >= 0) {
	            	   equipment[5] = currentAnimation.anInt1854 + 512;
	            	   hash += (long) (currentAnimation.anInt1854 - (appearanceInfo[5] << 8));
	               }
	
	               if(currentAnimation.anInt1849 >= 0) {
	            	   equipment[3] = currentAnimation.anInt1849 + 512;
	            	   hash += (long) (currentAnimation.anInt1849 - (appearanceInfo[3] << 16));
	               }
               }
            }

            AbstractModel var37 = (AbstractModel)KeyboardHandler.aClass93_1911.get(hash);
            boolean var17;
            int var23;
            int frameUid;
            int var25;
            int var24;
            int var26;
            int var29;
            int var28;
            int var34;
            int var32;
            int var33;
            int var45;
            if(var37 == null) {
               var17 = false;

               int var19;
               for(int var18 = 0; 12 > var18; ++var18) {
                  var19 = equipment[var18];
                  if(var19 >= 512 && !ItemDefinition.method1023(var19 - 512).method1108(this.isFemale)) {
                	  var17 = true;
                  }
                  if(var19 >= 256 && var19 < 512 && !IdentityKit.list(var19 - 256).method942(101)) {
                     var17 = true;
                  }
               }

               if(var17) {
                  if(this.aLong855 != -1L) {
                     var37 = (AbstractModel)KeyboardHandler.aClass93_1911.get(this.aLong855);
                  }

                  if(null == var37) {
                     return null;
                  }
               }

               if(null == var37) {
                  ModelBuilder[] var39 = new ModelBuilder[12];

                  int var20;
                  for(var19 = 0; var19 < 12; ++var19) {
                     var20 = equipment[var19];
                     ModelBuilder var21;
                     if (var20 >= 256 && var20 < 512) {
                    	 var21 = IdentityKit.list(var20 - 256).method947((byte)-26);
                    	 if(null != var21) {
                    		 var39[var19] = var21;
                    	 }
                     }
                     if (var20 >= 512) {
                    	 var21 = ItemDefinition.method1023(var20 - 512).method1117(this.isFemale, 80);
                    	 if(null != var21) {
                    		 var39[var19] = var21;
                    	 }
                     }
                  }

                  /*RenderAnimationDefinition var40 = null;

                  if(var40 != null && null != var40.anIntArrayArray359) {
                     for(var20 = 0; var20 < var40.anIntArrayArray359.length; ++var20) {
                        if(null != var40.anIntArrayArray359[var20] && null != var39[var20]) {
                           var45 = var40.anIntArrayArray359[var20][0];
                           var22 = var40.anIntArrayArray359[var20][1];
                           var23 = var40.anIntArrayArray359[var20][2];
                           var25 = var40.anIntArrayArray359[var20][4];
                           var24 = var40.anIntArrayArray359[var20][3];
                           var26 = var40.anIntArrayArray359[var20][5];
                           if(null == this.anIntArrayArray863) {
                              this.anIntArrayArray863 = new int[var40.anIntArrayArray359.length][];
                           }

                           if(this.anIntArrayArray863[var20] == null) {
                              int[] var27 = this.anIntArrayArray863[var20] = new int[15];
                              if(~var24 == -1 && -1 == ~var25 && var26 == 0) {
                                 var27[12] = -var45;
                                 var27[13] = -var22;
                                 var27[0] = var27[4] = var27[8] = '\u8000';
                                 var27[14] = -var23;
                              } else {
                                 var28 = Rasterizer.cosineTable[var24] >> 1;
                                 var29 = Rasterizer.sineTable[var24] >> 1;
                                 int var30 = Rasterizer.cosineTable[var25] >> 1;
                                 int var31 = Rasterizer.sineTable[var25] >> 1;
                                 var32 = Rasterizer.cosineTable[var26] >> 1;
                                 var33 = Rasterizer.sineTable[var26] >> 1;
                                 var27[4] = var28 * var32 + 16384 >> 15;
                                 var27[5] = -var29;
                                 var27[3] = 16384 + var33 * var28 >> 15;
                                 var27[2] = 16384 + var28 * var31 >> 15;
                                 var27[8] = var30 * var28 - -16384 >> 15;
                                 int var35 = 16384 + var33 * var29 >> 15;
                                 var27[0] = var31 * var35 + var32 * var30 - -16384 >> 15;
                                 var27[14] = 16384 + var27[8] * -var23 + -var22 * var27[5] + var27[2] * -var45 >> 15;
                                 var27[6] = var30 * var35 + (var32 * -var31 - -16384) >> 15;
                                 var34 = 16384 + var32 * var29 >> 15;
                                 var27[7] = 16384 + -var33 * -var31 + var34 * var30 >> 15;
                                 var27[1] = var31 * var34 + (var30 * -var33 - -16384) >> 15;
                                 var27[12] = -var22 * var27[3] + var27[0] * -var45 + -var23 * var27[6] - -16384 >> 15;
                                 var27[13] = 16384 + -var22 * var27[4] + var27[1] * -var45 + -var23 * var27[7] >> 15;
                              }

                              var27[9] = var45;
                              var27[11] = var23;
                              var27[10] = var22;
                           }

                           if(0 != var24 || ~var25 != -1 || ~var26 != -1) {
                              var39[var20].method2013(var24, var25, var26);
                           }

                           if(var45 != 0 || 0 != var22 || 0 != var23) {
                              var39[var20].method2001(var45, var22, var23);
                           }
                        }
                     }
                  }*/

                  ModelBuilder var43 = new ModelBuilder(var39, var39.length);

                  for(var45 = 0; 5 > var45; ++var45) {
                     if(Class15.aShortArrayArray344[var45].length > this.colors[var45]) {
                        var43.swapColors(InventoryNode.aShortArray2548[var45], Class15.aShortArrayArray344[var45][this.colors[var45]]);
                     }

                     if(Class101.aShortArrayArray1429[var45].length > this.colors[var45]) {
                        var43.swapColors(CollisionMap.aShortArray1311[var45], Class101.aShortArrayArray1429[var45][this.colors[var45]]);
                     }
                  }

                  var37 = var43.convert(64, 850, -30, -50, -30);
                  if(HDToolkit.openGLEnabled) {
                     ((HDModel)var37).method1920(false, false, true, true, false, false, true);
                  }

                  if(var9) {
                     KeyboardHandler.aClass93_1911.put(var37, hash);
                     this.aLong855 = hash;
                  }
               }
            }

            var17 = false;
            boolean var38 = false;
            var45 = var1 != null?var1.length:0;
            boolean var42 = false;
            boolean var44 = false;

            int frameId;
            for(frameUid = 0; ~var45 < ~frameUid; ++frameUid) {
               if(var1[frameUid] != null) {
                  AnimationDefinition var41 = AnimationDefinition.list(var1[frameUid].anInt1890, false);
                  if(var41.frames != null) {
                     var17 = true;
                     Class123.aClass142Array1654[frameUid] = var41;
                     var24 = var1[frameUid].anInt1893;
                     var25 = var1[frameUid].anInt1891;
                     var26 = var41.frames[var24];
                     Class166.aClass3_Sub28_Sub5Array2070[frameUid] = AnimationLoader.list(var26 >>> 16, 0, false);
                     var26 &= '\uffff';
                     SceneGraphNode.anIntArray1833[frameUid] = var26;
                     if(Class166.aClass3_Sub28_Sub5Array2070[frameUid] != null) {
                        var42 |= Class166.aClass3_Sub28_Sub5Array2070[frameUid].method561(var26);
                        var38 |= Class166.aClass3_Sub28_Sub5Array2070[frameUid].method559(var26);
                        var44 |= var41.aBoolean1848;
                     }

                     if((var41.tween || Class3_Sub26.forceTweeningEnabled) && 0 != ~var25 && var25 < var41.frames.length) {
                        Class154.anIntArray1960[frameUid] = var41.cycles[var24];
                        Class3_Sub13_Sub11.anIntArray3139[frameUid] = var1[frameUid].anInt1897;
                        frameId = var41.frames[var25];
                        Class75.aClass3_Sub28_Sub5Array1103[frameUid] = AnimationLoader.list(frameId >>> 16, 0, false);
                        frameId &= '\uffff';
                        Class127.anIntArray1679[frameUid] = frameId;
                        if(null != Class75.aClass3_Sub28_Sub5Array1103[frameUid]) {
                           var42 |= Class75.aClass3_Sub28_Sub5Array1103[frameUid].method561(frameId);
                           var38 |= Class75.aClass3_Sub28_Sub5Array1103[frameUid].method559(frameId);
                        }
                     } else {
                        Class154.anIntArray1960[frameUid] = 0;
                        Class3_Sub13_Sub11.anIntArray3139[frameUid] = 0;
                        Class75.aClass3_Sub28_Sub5Array1103[frameUid] = null;
                        Class127.anIntArray1679[frameUid] = -1;
                     }
                  }
               }
            }

            if(!var17 && null == currentAnimation && null == movingAnimation) {
               return var37;
            } else {
               frameUid = -1;
               var23 = -1;
               var24 = 0;
               AnimationLoader var48 = null;
               AnimationLoader var46 = null;
               if(null != currentAnimation) {
                  frameUid = currentAnimation.frames[frameIndex];
                  frameId = frameUid >>> 16;
                  var46 = AnimationLoader.list(frameId, 0, false);
                  frameUid &= '\uffff';
                  if(var46 != null) {
                     var42 |= var46.method561(frameUid);
                     var38 |= var46.method559(frameUid);
                     var44 |= currentAnimation.aBoolean1848;
                  }

                  if((currentAnimation.tween || Class3_Sub26.forceTweeningEnabled) && var2 != -1 && currentAnimation.frames.length > var2) {
                     var23 = currentAnimation.frames[var2];
                     var28 = var23 >>> 16;
                     var23 &= '\uffff';
                     var24 = currentAnimation.cycles[frameIndex];
                     if(~frameId != ~var28) {
                        var48 = AnimationLoader.list(var23 >>> 16, 0, false);
                     } else {
                        var48 = var46;
                     }

                     if(null != var48) {
                        var42 |= var48.method561(var23);
                        var38 |= var48.method559(var23);
                     }
                  }
               }

               frameId = -1;
               var28 = -1;
               AnimationLoader var49 = null;
               AnimationLoader var50 = null;
               var29 = 0;
               if(movingAnimation != null) {
                  frameId = movingAnimation.frames[var11];
                  var32 = frameId >>> 16;
                  frameId &= '\uffff';
                  var49 = AnimationLoader.list(var32, 0, false);
                  if(null != var49) {
                     var42 |= var49.method561(frameId);
                     var38 |= var49.method559(frameId);
                     var44 |= movingAnimation.aBoolean1848;
                  }

                  if((movingAnimation.tween || Class3_Sub26.forceTweeningEnabled) && 0 != ~var6 && movingAnimation.frames.length > var6) {
                     var29 = movingAnimation.cycles[var11];
                     var28 = movingAnimation.frames[var6];
                     var33 = var28 >>> 16;
                     var28 &= '\uffff';
                     if(~var32 != ~var33) {
                        var50 = AnimationLoader.list(var28 >>> 16, 0, false);
                     } else {
                        var50 = var49;
                     }

                     if(null != var50) {
                        var42 |= var50.method561(var28);
                        var38 |= var50.method559(var28);
                     }
                  }
               }

               AbstractModel var51 = var37.method1894(!var38, !var42, !var44);
               var33 = 0;

               for(var34 = 1; var33 < var45; var34 <<= 1) {
                  if(Class166.aClass3_Sub28_Sub5Array2070[var33] != null) {
                     var51.method1887(Class166.aClass3_Sub28_Sub5Array2070[var33], SceneGraphNode.anIntArray1833[var33], Class75.aClass3_Sub28_Sub5Array1103[var33], Class127.anIntArray1679[var33], Class3_Sub13_Sub11.anIntArray3139[var33] + -1, Class154.anIntArray1960[var33], var34, Class123.aClass142Array1654[var33].aBoolean1848, this.anIntArrayArray863[var33]);
                  }

                  ++var33;
               }

               
               if(null != var46 && null != var49) {
            	   var51.method1892(var46, frameUid, var48, var23, var8 - 1, var24, var49, frameId, var50, var28, var5 + -1, var29, currentAnimation.aBooleanArray1855, currentAnimation.aBoolean1848 | movingAnimation.aBoolean1848);
               } else if(var46 == null) {
                  if(null != var49) {
                     var51.method1880(var49, frameId, var50, var28, var5 - 1, var29, movingAnimation.aBoolean1848);
                  }
               } else {
            	   var51.method1880(var46, frameUid, var48, var23, var8 + -1, var24, currentAnimation.aBoolean1848);
               }

               for(var33 = 0; var33 < var45; ++var33) {
                  Class166.aClass3_Sub28_Sub5Array2070[var33] = null;
                  Class75.aClass3_Sub28_Sub5Array1103[var33] = null;
                  Class123.aClass142Array1654[var33] = null;
               }
               return var51;
            }
         }
      } catch (RuntimeException var36) {
         throw Class44.method1067(var36, "hh.D(" + (var1 != null?"{...}":"null") + ',' + var2 + ',' + (movingAnimation != null?"{...}":"null") + ',' + (currentAnimation != null?"{...}":"null") + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + frameIndex + ',' + var11 + ')');
      }
   }

   static final boolean method1166(int var0, byte var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11, int var12) {
      try {
         int var13;
         int var14;
         for(var13 = 0; ~var13 > -105; ++var13) {
            for(var14 = 0; var14 < 104; ++var14) {
               Class84.anIntArrayArray1160[var13][var14] = 0;
               Class97.anIntArrayArray1373[var13][var14] = 99999999;
            }
         }

         var13 = var9;
         var14 = var12;
         Class84.anIntArrayArray1160[var9][var12] = 99;
         Class97.anIntArrayArray1373[var9][var12] = 0;
         byte var15 = 0;
         if(var1 != 34) {
            return true;
         } else {
            Class3_Sub13_Sub38.anIntArray3456[var15] = var9;
            int var28 = var15 + 1;
            Class45.anIntArray729[var15] = var12;
            int var16 = 0;
            boolean var17 = false;
            int[][] var18 = Class86.collisionMap[Class26.plane].collisionFlags;

            int var19;
            int var20;
            label410:
            while(~var16 != ~var28) {
               var13 = Class3_Sub13_Sub38.anIntArray3456[var16];
               var14 = Class45.anIntArray729[var16];
               var16 = 1 + var16 & 4095;
               if(~var6 == ~var13 && ~var14 == ~var0) {
                  var17 = true;
                  break;
               }

               if(0 != var7) {
                  if((var7 < 5 || 10 == var7) && Class86.collisionMap[Class26.plane].method1488(var0, var13, false, var14, var6, var7 + -1, var5, var4)) {
                     var17 = true;
                     break;
                  }

                  if(var7 < 10 && Class86.collisionMap[Class26.plane].method1492(var0, -1 + var7, var6, var14, var5, var4, var13, 95)) {
                     var17 = true;
                     break;
                  }
               }

               if(var2 != 0 && -1 != ~var10 && Class86.collisionMap[Class26.plane].method1498(true, var6, var14, var13, var5, var2, var8, var0, var10)) {
                  var17 = true;
                  break;
               }

               var19 = 1 + Class97.anIntArrayArray1373[var13][var14];
               if(var13 > 0 && Class84.anIntArrayArray1160[-1 + var13][var14] == 0 && (var18[var13 + -1][var14] & 19661070) == 0 && 0 == (19661112 & var18[-1 + var13][-1 + var5 + var14])) {
                  var20 = 1;

                  while(true) {
                     if(-1 + var5 <= var20) {
                        Class3_Sub13_Sub38.anIntArray3456[var28] = -1 + var13;
                        Class45.anIntArray729[var28] = var14;
                        Class84.anIntArrayArray1160[-1 + var13][var14] = 2;
                        var28 = 4095 & 1 + var28;
                        Class97.anIntArrayArray1373[var13 + -1][var14] = var19;
                        break;
                     }

                     if(-1 != ~(19661118 & var18[-1 + var13][var14 + var20])) {
                        break;
                     }

                     ++var20;
                  }
               }

               if(-103 < ~var13 && ~Class84.anIntArrayArray1160[1 + var13][var14] == -1 && (19661187 & var18[var13 + var5][var14]) == 0 && ~(19661280 & var18[var5 + var13][var14 + var5 + -1]) == -1) {
                  var20 = 1;

                  while(true) {
                     if(var20 >= -1 + var5) {
                        Class3_Sub13_Sub38.anIntArray3456[var28] = var13 + 1;
                        Class45.anIntArray729[var28] = var14;
                        Class84.anIntArrayArray1160[var13 + 1][var14] = 8;
                        Class97.anIntArrayArray1373[var13 + 1][var14] = var19;
                        var28 = 4095 & var28 - -1;
                        break;
                     }

                     if(~(var18[var5 + var13][var14 + var20] & 19661283) != -1) {
                        break;
                     }

                     ++var20;
                  }
               }

               if(-1 > ~var14 && 0 == Class84.anIntArrayArray1160[var13][-1 + var14] && (19661070 & var18[var13][-1 + var14]) == 0 && 0 == (19661187 & var18[-1 + var5 + var13][var14 + -1])) {
                  var20 = 1;

                  while(true) {
                     if(-1 + var5 <= var20) {
                        Class3_Sub13_Sub38.anIntArray3456[var28] = var13;
                        Class45.anIntArray729[var28] = -1 + var14;
                        Class84.anIntArrayArray1160[var13][-1 + var14] = 1;
                        var28 = 4095 & 1 + var28;
                        Class97.anIntArrayArray1373[var13][-1 + var14] = var19;
                        break;
                     }

                     if((var18[var13 + var20][var14 + -1] & 19661199) != 0) {
                        break;
                     }

                     ++var20;
                  }
               }

               if(102 > var14 && ~Class84.anIntArrayArray1160[var13][1 + var14] == -1 && ~(var18[var13][var14 + var5] & 19661112) == -1 && -1 == ~(19661280 & var18[-1 + var13 + var5][var5 + var14])) {
                  var20 = 1;

                  while(true) {
                     if(~var20 <= ~(var5 + -1)) {
                        Class3_Sub13_Sub38.anIntArray3456[var28] = var13;
                        Class45.anIntArray729[var28] = var14 + 1;
                        Class84.anIntArrayArray1160[var13][1 + var14] = 4;
                        Class97.anIntArrayArray1373[var13][1 + var14] = var19;
                        var28 = 4095 & var28 + 1;
                        break;
                     }

                     if(-1 != ~(19661304 & var18[var13 - -var20][var5 + var14])) {
                        break;
                     }

                     ++var20;
                  }
               }

               if(var13 > 0 && -1 > ~var14 && -1 == ~Class84.anIntArrayArray1160[var13 + -1][var14 + -1] && ~(var18[var13 + -1][-1 + var5 + -1 + var14] & 19661112) == -1 && 0 == (19661070 & var18[-1 + var13][var14 - 1]) && ~(var18[var5 + -1 + (var13 - 1)][-1 + var14] & 19661187) == -1) {
                  var20 = 1;

                  while(true) {
                     if(var5 - 1 <= var20) {
                        Class3_Sub13_Sub38.anIntArray3456[var28] = var13 - 1;
                        Class45.anIntArray729[var28] = -1 + var14;
                        var28 = 4095 & var28 + 1;
                        Class84.anIntArrayArray1160[var13 + -1][-1 + var14] = 3;
                        Class97.anIntArrayArray1373[-1 + var13][var14 + -1] = var19;
                        break;
                     }

                     if((var18[var13 - 1][var14 - 1 + var20] & 19661118) != 0 || 0 != (19661199 & var18[var20 + -1 + var13][-1 + var14])) {
                        break;
                     }

                     ++var20;
                  }
               }

               if(102 > var13 && ~var14 < -1 && -1 == ~Class84.anIntArrayArray1160[1 + var13][-1 + var14] && -1 == ~(19661070 & var18[1 + var13][-1 + var14]) && (var18[var5 + var13][-1 + var14] & 19661187) == 0 && (var18[var13 - -var5][-1 + var14 + var5 + -1] & 19661280) == 0) {
                  var20 = 1;

                  while(true) {
                     if(~var20 <= ~(-1 + var5)) {
                        Class3_Sub13_Sub38.anIntArray3456[var28] = 1 + var13;
                        Class45.anIntArray729[var28] = -1 + var14;
                        var28 = 1 + var28 & 4095;
                        Class84.anIntArrayArray1160[var13 - -1][-1 + var14] = 9;
                        Class97.anIntArrayArray1373[1 + var13][-1 + var14] = var19;
                        break;
                     }

                     if(-1 != ~(19661283 & var18[var13 + var5][var14 - (1 + -var20)]) || ~(19661199 & var18[var20 + (var13 - -1)][-1 + var14]) != -1) {
                        break;
                     }

                     ++var20;
                  }
               }

               if(~var13 < -1 && 102 > var14 && -1 == ~Class84.anIntArrayArray1160[-1 + var13][var14 - -1] && 0 == (19661070 & var18[var13 - 1][1 + var14]) && (19661112 & var18[-1 + var13][var14 + var5]) == 0 && 0 == (19661280 & var18[var13][var14 + var5])) {
                  var20 = 1;

                  while(true) {
                     if(-1 + var5 <= var20) {
                        Class3_Sub13_Sub38.anIntArray3456[var28] = var13 - 1;
                        Class45.anIntArray729[var28] = var14 + 1;
                        var28 = 4095 & var28 - -1;
                        Class84.anIntArrayArray1160[-1 + var13][1 + var14] = 6;
                        Class97.anIntArrayArray1373[-1 + var13][1 + var14] = var19;
                        break;
                     }

                     if((var18[var13 - 1][var14 - -1 - -var20] & 19661118) != 0 || ~(var18[var20 + -1 + var13][var5 + var14] & 19661304) != -1) {
                        break;
                     }

                     ++var20;
                  }
               }

               if(~var13 > -103 && -103 < ~var14 && Class84.anIntArrayArray1160[var13 - -1][1 + var14] == 0 && 0 == (19661112 & var18[var13 + 1][var14 + var5]) && 0 == (var18[var13 - -var5][var14 + var5] & 19661280) && ~(19661187 & var18[var5 + var13][1 + var14]) == -1) {
                  for(var20 = 1; var20 < -1 + var5; ++var20) {
                     if(-1 != ~(var18[var20 + var13 - -1][var14 - -var5] & 19661304) || 0 != (var18[var5 + var13][var20 + (var14 - -1)] & 19661283)) {
                        continue label410;
                     }
                  }

                  Class3_Sub13_Sub38.anIntArray3456[var28] = 1 + var13;
                  Class45.anIntArray729[var28] = var14 - -1;
                  Class84.anIntArrayArray1160[1 + var13][1 + var14] = 12;
                  Class97.anIntArrayArray1373[1 + var13][1 + var14] = var19;
                  var28 = 1 + var28 & 4095;
               }
            }

            AbstractTimer.anInt1692 = 0;
            if(!var17) {
               if(!var11) {
                  return false;
               }

               var19 = 1000;
               var20 = 100;
               byte var21 = 10;

               for(int var22 = var6 - var21; var22 <= var21 + var6; ++var22) {
                  for(int var23 = -var21 + var0; ~var23 >= ~(var0 - -var21); ++var23) {
                     if(var22 >= 0 && -1 >= ~var23 && ~var22 > -105 && ~var23 > -105 && -101 < ~Class97.anIntArrayArray1373[var22][var23]) {
                        int var24 = 0;
                        if(~var6 < ~var22) {
                           var24 = -var22 + var6;
                        } else if(~(var6 - (-var2 - -1)) > ~var22) {
                           var24 = -var2 + -var6 - -1 + var22;
                        }

                        int var25 = 0;
                        if(~var23 > ~var0) {
                           var25 = -var23 + var0;
                        } else if(~(var0 + var10 + -1) > ~var23) {
                           var25 = var23 + 1 + -var0 + -var10;
                        }

                        int var26 = var24 * var24 + var25 * var25;
                        if(~var26 > ~var19 || var26 == var19 && ~var20 < ~Class97.anIntArrayArray1373[var22][var23]) {
                           var20 = Class97.anIntArrayArray1373[var22][var23];
                           var13 = var22;
                           var19 = var26;
                           var14 = var23;
                        }
                     }
                  }
               }

               if(var19 == 1000) {
                  return false;
               }

               if(~var13 == ~var9 && var12 == var14) {
                  return false;
               }

               AbstractTimer.anInt1692 = 1;
            }

            byte var29 = 0;
            Class3_Sub13_Sub38.anIntArray3456[var29] = var13;
            var16 = var29 + 1;
            Class45.anIntArray729[var29] = var14;

            for(var19 = var20 = Class84.anIntArrayArray1160[var13][var14]; ~var13 != ~var9 || ~var12 != ~var14; var19 = Class84.anIntArrayArray1160[var13][var14]) {
               if(~var20 != ~var19) {
                  Class3_Sub13_Sub38.anIntArray3456[var16] = var13;
                  var20 = var19;
                  Class45.anIntArray729[var16++] = var14;
               }

               if(-1 == ~(2 & var19)) {
                  if(0 != (8 & var19)) {
                     --var13;
                  }
               } else {
                  ++var13;
               }

               if(~(var19 & 1) != -1) {
                  ++var14;
               } else if(-1 != ~(var19 & 4)) {
                  --var14;
               }
            }

            if(0 >= var16) {
               if(var3 == 1) {
                  return false;
               } else {
                  return true;
               }
            } else {
               Class3_Sub13_Sub27.method299(var16, var3);
               return true;
            }
         }
      } catch (RuntimeException var27) {
         throw Class44.method1067(var27, "hh.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ',' + var11 + ',' + var12 + ')');
      }
   }

   final AbstractModel method1167(int var1, AnimationDefinition var3, int var4, int var5) {
         if(-1 == this.npcId) {
            AbstractModel var6 = (AbstractModel)Class80.aClass93_1131.get(this.appearanceHash);

            if(var6 == null) {
               boolean var7 = false;

               for(int var8 = 0; var8 < 12; ++var8) {
                  int equipId = this.appearanceInfo[var8];
                  if(equipId >= 256 && equipId < 512 && !IdentityKit.list(equipId - 256).method948(18991)) {
                	  var7 = true;
                  } else if(equipId >= 512 && !ItemDefinition.method1023(1073741823 - 512).method1102(this.isFemale, false)) {
                     var7 = true;
                  }
               }

               if(var7) {
                  return null;
               }

               ModelBuilder[] var14 = new ModelBuilder[12];
               int pos = 0;

               for(int var10 = 0; var10 < 12; ++var10) {
                  int equipId = this.appearanceInfo[var10];
                  ModelBuilder var12;
                  if(equipId >= 256 && equipId < 512) {
                	  var12 = IdentityKit.list(equipId - 256).method941(true);
                	  if(null != var12) {
                		  var14[pos++] = var12;
                	  }
                  }
                  if(equipId >= 512) {
	                  var12 = ItemDefinition.method1023(equipId - 512).method1116(this.isFemale, (byte)-109);
	                  if(var12 != null) {
	                	  var14[pos++] = var12;
	                  }
                  }
               }

               ModelBuilder var15 = new ModelBuilder(var14, pos);

               for(int id = 0; id < 5; ++id) {
                  if(Class15.aShortArrayArray344[id].length > this.colors[id]) {
                     var15.swapColors(InventoryNode.aShortArray2548[id], Class15.aShortArrayArray344[id][this.colors[id]]);
                  }

                  if(Class101.aShortArrayArray1429[id].length > this.colors[id]) {
                     var15.swapColors(CollisionMap.aShortArray1311[id], Class101.aShortArrayArray1429[id][this.colors[id]]);
                  }
               }

               var6 = var15.convert(64, 768, -50, -10, -50);
               Class80.aClass93_1131.put(var6, this.appearanceHash);
            }

            if(var3 != null) {
               var6 = var3.method2055(var6, (byte)120, var5, var1, var4);
            }

            return var6;
         } else {
            return NpcDefinition.list(this.npcId).method1482(var3, var1, var5, -109, var4);
         }
   }

   public static void method1168(int var0) {
      try {
         aClass94_853 = null;
         aClass94_852 = null;
         if(var0 == 8160) {
            anIntArray859 = null;
            aClass94_856 = null;
            anIntArray861 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "hh.H(" + var0 + ')');
      }
   }

}
