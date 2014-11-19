
final class jInterface {

   boolean hidden = false;
   Object[] anObjectArray156;
   boolean aBoolean157;
   Object[] anObjectArray158;
   Object[] onLaunchListener;
   int anInt160 = 1;
   Object[] anObjectArray161;
   byte aByte162 = 0;
   boolean aBoolean163;
   int zoom = 100;
   Object[] anObjectArray165;
   int y;
   boolean aBoolean167;
   int anInt168;
   short aShort169 = 3000;
   Object[] anObjectArray170;
   jString[] niActions;
   jString enabledText;
   jString[] oiActions;
   Object[] anObjectArray174;
   int[] anIntArray175;
   Object[] anObjectArray176;
   int width;
   boolean flipVertical;
   int anInt179 = 0;
   Object[] anObjectArray180;
   boolean aBoolean181 = false;
   int rotateX = 0;
   Object[] anObjectArray183;
   int anInt184;
   int[] anIntArray185;
   boolean aBoolean186 = false;
   int type;
   boolean aBoolean188 = false;
   int clientCode;
   int parent;
   int anInt191 = -1;
   int anInt192;
   int anInt193 = 0;
   int horizontalAlignment = 0;
   boolean aBoolean195;
   private int mediaIdEnabled;
   int[] spriteId;
   int enabledAnim = -1;
   boolean flipHorizontal;
   boolean aBoolean200;
   int mediaIdDisabled;
   int mediaTypeDisabled;
   Object[] anObjectArray203;
   int anInt204;
   int verticalSpacing = 0;
   Object[] anObjectArray206;
   int[] anIntArray207;
   int anInt208 = 0;
   static jString aClass94_209 = jString.createJString("event_opbase");
   int anInt210 = 0;
   int[] anIntArray211;
   int mouseOverId;
   int anInt213;
   int anInt214 = 0;
   boolean shaded;
   int anInt216;
   Object[] anObjectArray217;
   int disabledColor;
   boolean aBoolean219;
   Object[] keyPressedListener;
   Object[] anObjectArray221;
   int enabledMouseOverColor;
   int alpha;
   int disabledSprite = -1;
   int verticalAlignment;
   boolean filled = false;
   boolean aBoolean227;
   int disabledMouseOverColor;
   Object[] anObjectArray229;
   int translateY = 0;
   byte[] aByteArray231;
   jString disabledText;
   boolean scriptedInterface;
   int anInt234;
   Object[] anObjectArray235;
   static boolean manyIdleAnimations = true;
   int rotationModifier;
   int anInt238 = -1;
   Object[] anObjectArray239;
   int maxScrollHorizontal;
   byte aByte241;
   int anInt242;
   jString spellName;
   int height;
   jString selectedActionName;
   static float aFloat246;
   int anInt247;
   Object[] anObjectArray248;
   int[] anIntArray249;
   int thickness = 1;
   static jString aClass94_251 = null;
   int maxScrollVertical;
   int enabledColor;
   int[] inventoryIds;
   int anInt255;
   Object[] anObjectArray256;
   ClickMaskNode clickMask;
   int anInt258;
   int translateX;
   int anInt260;
   static long aLong261 = 0L;
   jInterface[] aClass11Array262;
   byte[] aByteArray263;
   int anInt264;
   int anInt265;
   int anInt266;
   int anInt267;
   Object[] anObjectArray268;
   Object[] anObjectArray269;
   int font;
   int anInt271;
   int[] spriteX;
   byte aByte273;
   int[] anIntArray274;
   int[] valueCompareTypes;
   Object[] anObjectArray276;
   jString aClass94_277;
   static int anInt278 = -1;
   int uid;
   int rotateZ;
   Object[] anObjectArray281;
   Object[] anObjectArray282;
   int anInt283;
   int anInt284;
   int invSpritePadX;
   int[] anIntArray286;
   int shadow;
   int outline;
   jString tooltip;
   int invSpritePadY;
   int[] anIntArray291;
   int anInt292;
   short aShort293;
   private int mediaTypeEnabled;
   Object[] anObjectArray295;
   int enabledSprite;
   int[][] cs1opcodes;
   int[] anIntArray299;
   int[] spriteY;
   int rotatino;
   jInterface aClass11_302;
   Object[] anObjectArray303;
   byte aByte304;
   int disabledAnim;
   int anInt306;
   int[] requiredValues;
   int rotateY;
   boolean depthBufferEnabled;
   int[] anIntArray310;
   int anInt311;
   int anInt312;
   Object[] anObjectArray313;
   Object[] anObjectArray314;
   Object[] anObjectArray315;
   int x;
   int[] inventoryAmounts;
   int actionType;


   final void method854(int var1, int var2, byte var3) {
      try {
         if(this.anIntArray249 == null || ~this.anIntArray249.length >= ~var1) {
            int[] var4 = new int[1 + var1];
            if(this.anIntArray249 != null) {
               int var5;
               for(var5 = 0; this.anIntArray249.length > var5; ++var5) {
                  var4[var5] = this.anIntArray249[var5];
               }

               for(var5 = this.anIntArray249.length; ~var1 < ~var5; ++var5) {
                  var4[var5] = -1;
               }
            }

            this.anIntArray249 = var4;
         }

         this.anIntArray249[var1] = var2;
         if(var3 != 43) {
            this.anIntArray211 = (int[])null;
         }

      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "be.P(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   /*final boolean method855(int var1) {
	   if(this.anIntArray207 != null) {
		   return true;
	   } else {
			LDIndexedSprite var2 = jString.method1539(0, true, this.disabledSprite, Class12.aClass153_323);
			if (null == var2) {
				return false;
			} else {
				var2.method1675();
				this.anIntArray207 = new int[var2.height];
				this.anIntArray291 = new int[var2.height];
				int var3 = 0;

				while (var3 < var2.height) {
					int var4 = 0;
					int var5 = var2.width;
					int var6 = 0;

					while (true) {
						if (var6 < var2.width) {
							if (0 == var2.indicators[var2.width * var3 + var6]) {
								++var6;
								continue;
							}

							var4 = var6;
						}

						for (var6 = var4; var2.width > var6; ++var6) {
							if (0 == var2.indicators[var3 * var2.width
									+ var6]) {
								var5 = var6;
								break;
							}
						}

						this.anIntArray207[var3] = var4;
						this.anIntArray291[var3] = var5 - var4;
						++var3;
						break;
					}
				}

				return true;
			}
		}
   }*/

	/*static final jString method856() {
		jString var1 = RawObjectCache.aClass94_4052;
		jString var2 = GroundItem.aClass94_3672;
		if (-1 != ~Class44.modeWhere) {
			var1 = Player.aClass94_3971;
		}

		if (null != Class163_Sub2.aClass94_2996) {
			var2 = client.method903(new jString[] { Class3_Sub28_Sub11.aClass94_3637, Class163_Sub2.aClass94_2996 }, (byte) -64);
		}

		return client.method903(new jString[] { Class30.aClass94_577, var1, AbstractObjectCache.aClass94_3601, Class72.method1298(0), Class151.aClass94_1932, Class72.method1298(Class3_Sub26.anInt2554), var2, Class140_Sub3.aClass94_2735 }, (byte) -61);
	}*/

   final void method857(byte var1, jString var2, int var3) {
      try {
         if(null == this.niActions || ~this.niActions.length >= ~var3) {
            jString[] var4 = new jString[1 + var3];
            if(null != this.niActions) {
               for(int var5 = 0; ~this.niActions.length < ~var5; ++var5) {
                  var4[var5] = this.niActions[var5];
               }
            }

            this.niActions = var4;
         }

         this.niActions[var3] = var2;
         int var7 = -124 % ((-10 - var1) / 60);
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "be.B(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

   final void decodeOld(Buffer var2) {

         this.scriptedInterface = false;
         this.type = var2.getUByte();
         this.actionType = var2.getUByte();
         this.clientCode = var2.getUShort();
         this.x = var2.getShort();
         this.y = var2.getShort();
         this.width = var2.getUShort();
         this.height = var2.getUShort();
         this.aByte304 = 0;
         this.aByte241 = 0;
         this.aByte273 = 0;
         this.aByte162 = 0;
         this.alpha = var2.getUByte();
         this.parent = var2.getUShort();
         if(~this.parent != -65536) {
            this.parent += -65536 & this.uid;
         } else {
            this.parent = -1;
         }

         this.mouseOverId = var2.getUShort();
         if(-65536 == ~this.mouseOverId) {
            this.mouseOverId = -1;
         }

         int var3 = var2.getUByte();
         int var4;
         if(-1 > ~var3) {
            this.requiredValues = new int[var3];
            this.valueCompareTypes = new int[var3];

            for(var4 = 0; ~var3 < ~var4; ++var4) {
               this.valueCompareTypes[var4] = var2.getUByte();
               this.requiredValues[var4] = var2.getUShort();
            }
         }

         var4 = var2.getUByte();
         int clickMask;
         int var6;
         int var7;
         if(-1 > ~var4) {
            this.cs1opcodes = new int[var4][];

            for(int id = 0; var4 > id; ++id) {
               var6 = var2.getUShort();
               this.cs1opcodes[id] = new int[var6];

               for(var7 = 0; ~var7 > ~var6; ++var7) {
                  this.cs1opcodes[id][var7] = var2.getUShort();
                  if(~this.cs1opcodes[id][var7] == -65536) {
                     this.cs1opcodes[id][var7] = -1;
                  }
               }
            }
         }

         if(-1 == ~this.type) {
            this.maxScrollVertical = var2.getUShort();
            this.hidden = 1 == var2.getUByte();
         }

         if(~this.type == -2) {
            var2.getUShort();
            var2.getUByte();
         }

         clickMask = 0;
         if(~this.type == -3) {
            this.aByte241 = 3;
            this.inventoryAmounts = new int[this.width * this.height];
            this.inventoryIds = new int[this.height * this.width];
            this.aByte304 = 3;
            var6 = var2.getUByte();
            var7 = var2.getUByte();
            if(~var6 == -2) {
               clickMask |= 268435456;
            }

            int var8 = var2.getUByte();
            if(~var7 == -2) {
               clickMask |= 1073741824;
            }

            if(1 == var8) {
               clickMask |= Integer.MIN_VALUE;
            }

            int var9 = var2.getUByte();
            if(var9 == 1) {
               clickMask |= 536870912;
            }

            this.invSpritePadX = var2.getUByte();
            this.invSpritePadY = var2.getUByte();
            this.spriteY = new int[20];
            this.spriteX = new int[20];
            this.spriteId = new int[20];

            int var10;
            for(var10 = 0; 20 > var10; ++var10) {
               int var11 = var2.getUByte();
               if(var11 == 1) {
                  this.spriteX[var10] = var2.getShort();
                  this.spriteY[var10] = var2.getShort();
                  this.spriteId[var10] = var2.getInt();
               } else {
                  this.spriteId[var10] = -1;
               }
            }

            this.oiActions = new jString[5];

            for(var10 = 0; var10 < 5; ++var10) {
               jString var14 = var2.getString();
               if(var14.getLength() > 0) {
                  this.oiActions[var10] = var14;
                  clickMask |= 1 << 23 - -var10;
               }
            }
         }

         if(3 == this.type) {
            this.filled = 1 == var2.getUByte();
         }

         if(this.type == 4 || 1 == this.type) {
            this.horizontalAlignment = var2.getUByte();
            this.verticalAlignment = var2.getUByte();
            this.verticalSpacing = var2.getUByte();
            this.font = var2.getUShort();
            if(~this.font == -65536) {
               this.font = -1;
            }

            this.shaded = 1 == var2.getUByte();
         }

         if(this.type == 4) {
            this.disabledText = var2.getString();
            this.enabledText = var2.getString();
         }

         if(this.type == 1 || this.type == 3 || 4 == this.type) {
            this.disabledColor = var2.getInt();
         }

         if(~this.type == -4 || ~this.type == -5) {
            this.enabledColor = var2.getInt();
            this.disabledMouseOverColor = var2.getInt();
            this.enabledMouseOverColor = var2.getInt();
         }

         if(-6 == ~this.type) {
            this.disabledSprite = var2.getInt();
            this.enabledSprite = var2.getInt();
         }

         if(6 == this.type) {
            this.mediaTypeDisabled = 1;
            this.mediaIdDisabled = var2.getUShort();
            this.mediaTypeEnabled = 1;
            if(this.mediaIdDisabled == '\uffff') {
               this.mediaIdDisabled = -1;
            }

            this.mediaIdEnabled = var2.getUShort();
            if(this.mediaIdEnabled == '\uffff') {
               this.mediaIdEnabled = -1;
            }

            this.disabledAnim = var2.getUShort();
            if(~this.disabledAnim == -65536) {
               this.disabledAnim = -1;
            }

            this.enabledAnim = var2.getUShort();
            if('\uffff' == this.enabledAnim) {
               this.enabledAnim = -1;
            }

            this.zoom = var2.getUShort();
            this.rotateX = var2.getUShort();
            this.rotateY = var2.getUShort();
         }

         if(7 == this.type) {
            this.aByte241 = 3;
            this.aByte304 = 3;
            this.inventoryAmounts = new int[this.height * this.width];
            this.inventoryIds = new int[this.width * this.height];
            this.horizontalAlignment = var2.getUByte();
            this.font = var2.getUShort();
            if(~this.font == -65536) {
               this.font = -1;
            }

            this.shaded = ~var2.getUByte() == -2;
            this.disabledColor = var2.getInt();
            this.invSpritePadX = var2.getShort();
            this.invSpritePadY = var2.getShort();
            var6 = var2.getUByte();
            if(-2 == ~var6) {
               clickMask |= 1073741824;
            }

            this.oiActions = new jString[5];

            for(var7 = 0; var7 < 5; ++var7) {
               jString var13 = var2.getString();
               if(var13.getLength() > 0) {
                  this.oiActions[var7] = var13;
                  clickMask |= 1 << 23 - -var7;
               }
            }
         }

         if(8 == this.type) {
            this.disabledText = var2.getString();
         }

         if(-3 == ~this.actionType || ~this.type == -3) {
            this.selectedActionName = var2.getString();
            this.spellName = var2.getString();
            var6 = 0x3f & var2.getUShort();
            clickMask |= var6 << 11;
         }

         if(this.actionType == 1 || this.actionType == 4 || -6 == ~this.actionType || this.actionType == 6) {
            this.tooltip = var2.getString();
            if(this.tooltip.getLength() == 0) {
               if(~this.actionType == -2) {
                  this.tooltip = Class115.aClass94_1583;
               }

               if(-5 == ~this.actionType) {
                  this.tooltip = Class131.aClass94_1722;
               }

               if(5 == this.actionType) {
                  this.tooltip = Class131.aClass94_1722;
               }

               if(this.actionType == 6) {
                  this.tooltip = Class60.aClass94_935;
               }
            }
         }

         if(-2 == ~this.actionType || -5 == ~this.actionType || -6 == ~this.actionType) {
            clickMask |= 4194304;
         }

         if(~this.actionType == -7) {
            clickMask |= 1;
         }

         this.clickMask = new ClickMaskNode(clickMask, -1);
   }

   final AbstractSprite method859(boolean var1, int var2) {
      try {
         GameShell.aBoolean6 = false;
         if(!var1) {
            return (AbstractSprite)null;
         } else if(~var2 <= -1 && var2 < this.spriteId.length) {
            int var3 = this.spriteId[var2];
            if(~var3 != 0) {
               AbstractSprite var4 = (AbstractSprite)Class114.aClass93_1569.get((long)var3);
               if(var4 == null) {
                  var4 = client.method602(0, var3, Class12.aClass153_323);
                  if(null != var4) {
                     Class114.aClass93_1569.put(var4, (long)var3);
                  } else {
                     GameShell.aBoolean6 = true;
                  }

                  return var4;
               } else {
                  return var4;
               }
            } else {
               return null;
            }
         } else {
            return null;
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "be.I(" + var1 + ',' + var2 + ')');
      }
   }

   public static void method860(int var0) {
      try {
         aClass94_209 = null;
         if(var0 < 63) {
            method860(42);
         }

         aClass94_251 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "be.F(" + var0 + ')');
      }
   }

   static final int method861(int var0, int var1, int var2) {
      try {
         InventoryNode var3 = (InventoryNode)GroundTile.aClass130_2220.get((long)var0);
         return null == var3?-1:(0 <= var2 && var2 < var3.anIntArray2547.length?(var1 < 39?-69:var3.anIntArray2547[var2]):-1);
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "be.J(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   private final Object[] method862(Buffer var2) {
            int var3 = var2.getUByte();
            if(-1 != ~var3) {
               Object[] var4 = new Object[var3];

               for(int var5 = 0; var3 > var5; ++var5) {
                  int var6 = var2.getUByte();
                  if(0 != var6) {
                     if(-2 == ~var6) {
                        var4[var5] = var2.getString();
                     }
                  } else {
                     var4[var5] = new Integer(var2.getInt());
                  }
               }

               this.aBoolean195 = true;
               return var4;
            } else {
               return null;
            }
   }

   private final int[] method863(Buffer var1) {
         int var3 = var1.getUByte();
         if(-1 == ~var3) {
            return null;
         } else {
            int[] var4 = new int[var3];

            for(int var5 = 0; ~var5 > ~var3; ++var5) {
               var4[var5] = var1.getInt();
            }

            return var4;
         }
   }

   final void method864(int var1, int var2, int var3) {
      try {
         int var4 = this.inventoryIds[var2];
         this.inventoryIds[var2] = this.inventoryIds[var1];
         if(var3 > -66) {
            this.decodeOld((Buffer)null);
         }

         this.inventoryIds[var1] = var4;
         var4 = this.inventoryAmounts[var2];
         this.inventoryAmounts[var2] = this.inventoryAmounts[var1];
         this.inventoryAmounts[var1] = var4;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "be.L(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   final AbstractModel method865(int var1, AnimationDefinition var2, int var3, int var5, boolean var6, PlayerAppearance var7) {
         GameShell.aBoolean6 = false;
         int var8;
         int var9;
         if(var6) {
            var8 = this.mediaTypeEnabled;
            var9 = this.mediaIdEnabled;
         } else {
            var9 = this.mediaIdDisabled;
            var8 = this.mediaTypeDisabled;
         }

         if(-1 != ~var8) {
            if(-2 == ~var8 && var9 == -1) {
               return null;
            } else {
               AbstractModel var10;
               if(1 == var8) {
                  var10 = (AbstractModel)Class3_Sub15.aClass93_2428.get((long)((var8 << 16) - -var9));
                  if(var10 == null) {
                     ModelBuilder var18 = ModelBuilder.get(Class119.aClass153_1628, var9, 0);
                     if(var18 == null) {
                        GameShell.aBoolean6 = true;
                        return null;
                     }

                     var10 = var18.convert(64, 768, -50, -10, -50);
                     Class3_Sub15.aClass93_2428.put(var10, (long)(var9 + (var8 << 16)));
                  }

                  if(var2 != null) {
                     var10 = var2.method2055(var10, (byte)119, var1, var5, var3);
                  }

                  return var10;
               } else if(var8 != 2) {
                  if(3 != var8) {
                     if(4 == var8) {
                        ItemDefinition var16 = ItemDefinition.method1023(var9);
                        AbstractModel var17 = var16.method1110(110, var1, var5, var2, 10, var3);
                        if(var17 != null) {
                           return var17;
                        } else {
                           GameShell.aBoolean6 = true;
                           return null;
                        }
                     } else if(var8 != 6) {
                        if(~var8 != -8) {
                           return null;
                        } else if(var7 != null) {
                           int var15 = this.mediaIdDisabled >>> 16;
                           int var11 = this.mediaIdDisabled & '\uffff';
                           int var12 = this.anInt265;
                           AbstractModel var13 = var7.method1157(var1, var12, var15, var5, var2, var3, var11, -2012759707);
                           if(var13 == null) {
                              GameShell.aBoolean6 = true;
                              return null;
                           } else {
                              return var13;
                           }
                        } else {
                           return null;
                        }
                     } else {
                        var10 = NpcDefinition.list(var9).method1476((Class145[])null, 0, (byte)-120, 0, var1, var5, var3, (AnimationDefinition)null, 0, var2);
                        if(null != var10) {
                           return var10;
                        } else {
                           GameShell.aBoolean6 = true;
                           return null;
                        }
                     }
                  } else if(null == var7) {
                     return null;
                  } else {
                     var10 = var7.method1167(var5, var2, var3, var1);
                     if(null == var10) {
                        GameShell.aBoolean6 = true;
                        return null;
                     } else {
                        return var10;
                     }
                  }
               } else {
                  var10 = NpcDefinition.list(var9).method1482(var2, var5, var1, 27, var3);
                  if(null != var10) {
                     return var10;
                  } else {
                     GameShell.aBoolean6 = true;
                     return null;
                  }
               }
            }
         } else {
        	 return null;
         }
   }

   final AbstractSprite method866(byte var1, boolean var2) {
      try {
         GameShell.aBoolean6 = false;
         int var3;
         if(var2) {
            var3 = this.enabledSprite;
         } else {
            var3 = this.disabledSprite;
         }

         if(0 == ~var3) {
            return null;
         } else {
            long var4 = ((this.flipVertical?1L:0L) << 38) + ((!this.aBoolean157?0L:1L) << 35) + (long)var3 + ((long)this.outline << 36) + ((this.flipHorizontal?1L:0L) << 39) + ((long)this.shadow << 40);
            AbstractSprite var6 = (AbstractSprite)Class114.aClass93_1569.get(var4);
            if(var6 != null) {
               return var6;
            } else {
               LDSprite var7;
               if(this.aBoolean157) {
                  var7 = AbstractObjectCache.method562(Class12.aClass153_323, 0, var3, (byte)39);
               } else {
                  var7 = Class40.method1043(0, Class12.aClass153_323, -3178, var3);
               }

               if(null == var7) {
                  GameShell.aBoolean6 = true;
                  return null;
               } else if(var1 != -113) {
                  return (AbstractSprite)null;
               } else {
                  if(this.flipVertical) {
                     var7.method663();
                  }

                  if(this.flipHorizontal) {
                     var7.method653();
                  }

                  if(this.outline > 0) {
                     var7.method652(this.outline);
                  }

                  if(~this.outline <= -2) {
                     var7.method657(1);
                  }

                  if(2 <= this.outline) {
                     var7.method657(16777215);
                  }

                  if(this.shadow != 0) {
                     var7.method668(this.shadow);
                  }

                  Object var9;
                  if(HDToolkit.openGLEnabled) {
                     if(!(var7 instanceof LDTransparentSprite)) {
                        var9 = new HDSprite(var7);
                     } else {
                        var9 = new Class3_Sub28_Sub16_Sub1_Sub1(var7);
                     }
                  } else {
                     var9 = var7;
                  }

                  Class114.aClass93_1569.put(var9, var4);
                  return (AbstractSprite)var9;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "be.O(" + var1 + ',' + var2 + ')');
      }
   }

   final void decodeNew(Buffer var2) {
         this.scriptedInterface = true;
         ++var2.pos;
         this.type = var2.getUByte();
         /*if(-1 != ~(128 & this.type)) {
            this.type &= 127;
            var2.method776(true);
         }*/

         this.clientCode = var2.getUShort();
         this.x = var2.getShort();
         this.y = var2.getShort();
         this.width = var2.getUShort();
         this.height = var2.getUShort();
         /*this.aByte304 = var2.getByte();
         this.aByte241 = var2.getByte();
         this.aByte273 = var2.getByte();
         this.aByte162 = var2.getByte();*/
         this.parent = var2.getUShort();
         if(-65536 == ~this.parent) {
            this.parent = -1;
         } else {
            this.parent = (this.uid & -65536) - -this.parent;
         }

         this.hidden = -2 == ~var2.getUByte();
         if(~this.type == -1) {
            this.maxScrollHorizontal = var2.getUShort();
            this.maxScrollVertical = var2.getUShort();
            //this.aBoolean219 = -2 == ~var2.getUByte();
         }

         int var3;
         if(~this.type == -6) {
            this.disabledSprite = var2.getInt();
            this.rotatino = var2.getUShort();
            var3 = var2.getUByte();
            this.aBoolean157 = -1 != ~(2 & var3);
            this.aBoolean186 = ~(1 & var3) != -1;
            this.alpha = var2.getUByte();
            this.outline = var2.getUByte();
            this.shadow = var2.getInt();
            this.flipVertical = ~var2.getUByte() == -2;
            this.flipHorizontal = 1 == var2.getUByte();
         }

         if(~this.type == -7) {
            this.mediaTypeDisabled = 1;
            this.mediaIdDisabled = var2.getUShort();
            if(~this.mediaIdDisabled == -65536) {
               this.mediaIdDisabled = -1;
            }

            this.translateX = var2.getShort();
            this.translateY = var2.getShort();
            this.rotateX = var2.getUShort();
            this.rotateY = var2.getUShort();
            this.rotateZ = var2.getUShort();
            this.zoom = var2.getUShort();
            this.disabledAnim = var2.getUShort();
            if('\uffff' == this.disabledAnim) {
               this.disabledAnim = -1;
            }

            this.aBoolean181 = var2.getUByte() == 1;
            /*this.aShort293 = (short)var2.getUShort();
            this.aShort169 = (short)var2.getUShort();
            this.depthBufferEnabled = 1 == var2.getUByte();
            if(this.aByte304 != 0) {
               this.anInt184 = var2.getUShort();
            }

            if(this.aByte241 != 0) {
               this.anInt312 = var2.getUShort();
            }*/
         }

         if(~this.type == -5) {
            this.font = var2.getUShort();
            if(~this.font == -65536) {
               this.font = -1;
            }

            this.disabledText = var2.getString();
            this.verticalSpacing = var2.getUByte();
            this.horizontalAlignment = var2.getUByte();
            this.verticalAlignment = var2.getUByte();
            this.shaded = var2.getUByte() == 1;
            this.disabledColor = var2.getInt();
         }

         if(this.type == 3) {
            this.disabledColor = var2.getInt();
            this.filled = 1 == var2.getUByte();
            this.alpha = var2.getUByte();
         }

         if(-10 == ~this.type) {
            this.thickness = var2.getUByte();
            this.disabledColor = var2.getInt();
            //this.aBoolean167 = 1 == var2.getUByte();
         }

         int clickMask = var2.getMidInt();
         /*int var4 = var2.getUByte();
         int var5;
         if(var4 != 0) {
            this.anIntArray299 = new int[10];
            this.aByteArray263 = new byte[10];

            for(this.aByteArray231 = new byte[10]; ~var4 != -1; var4 = var2.getUByte()) {
               var5 = (var4 >> 4) - 1;
               var4 = var2.getUByte() | var4 << 8;
               var4 &= 4095;
               if(4095 == var4) {
                  this.anIntArray299[var5] = -1;
               } else {
                  this.anIntArray299[var5] = var4;
               }

               this.aByteArray263[var5] = var2.getByte();
               this.aByteArray231[var5] = var2.getByte();
            }
         }*/

         this.aClass94_277 = var2.getString();
         int actionLength = var2.getUByte();
         int var6 = actionLength & 15;
         int var8 = 0;
         if(0 < var6) {
            this.niActions = new jString[var6];

            for(var8 = 0; var6 > var8; ++var8) {
               this.niActions[var8] = var2.getString();
            }
         }

         /*int var7 = var5 >> 4;
         if(var7 > 0) {
            var8 = var2.getUByte();
            this.anIntArray249 = new int[var8 + 1];

            for(int var9 = 0; var9 < this.anIntArray249.length; ++var9) {
               this.anIntArray249[var9] = -1;
            }

            this.anIntArray249[var8] = var2.getUShort();
         }

         if(1 < var7) {
            var8 = var2.getUByte();
            this.anIntArray249[var8] = var2.getUShort();
         }*/

         this.anInt214 = var2.getUByte();
         this.anInt179 = var2.getUByte();
         this.aBoolean200 = var2.getUByte() == 1;
         this.selectedActionName = var2.getString();
        /* if(0 != Class3_Sub28_Sub15.method630((byte)-34, var3)) {
            var8 = var2.getUShort();
            this.anInt266 = var2.getUShort();
            if(-65536 == ~var8) {
               var8 = -1;
            }

            if('\uffff' == this.anInt266) {
               this.anInt266 = -1;
            }

            this.anInt238 = var2.getUShort();
            if(this.anInt238 == '\uffff') {
               this.anInt238 = -1;
            }
         }*/

         this.clickMask = new ClickMaskNode(clickMask, var8);
         this.onLaunchListener = this.method862(var2);
         this.anObjectArray248 = this.method862(var2);
         this.anObjectArray281 = this.method862(var2);
         this.anObjectArray303 = this.method862(var2);
         this.anObjectArray203 = this.method862(var2);
         this.anObjectArray282 = this.method862(var2);
         this.anObjectArray174 = this.method862(var2);
         this.anObjectArray158 = this.method862(var2);
         this.anObjectArray269 = this.method862(var2);
         this.anObjectArray314 = this.method862(var2);
         this.anObjectArray276 = this.method862(var2);
         this.anObjectArray165 = this.method862(var2);
         this.anObjectArray170 = this.method862(var2);
         this.anObjectArray239 = this.method862(var2);
         this.anObjectArray180 = this.method862(var2);
         this.anObjectArray295 = this.method862(var2);
         this.anObjectArray229 = this.method862(var2);
         this.anObjectArray183 = this.method862(var2);
         //this.anObjectArray161 = this.method862(var2);
         //this.anObjectArray221 = this.method862(var2);
         this.anIntArray286 = this.method863(var2);
         this.anIntArray175 = this.method863(var2);
         this.anIntArray274 = this.method863(var2);
         //this.anIntArray211 = this.method863(var2);
         //this.anIntArray185 = this.method863(var2);
   }

	final Font method868(AbstractIndexedSprite[] var1, int var2) {
		GameShell.aBoolean6 = false;
		if (-1 == this.font) {
			return null;
		} else {
			Font interface_font = (Font) Class47.aClass93_743.get((long) font);
			if (null != interface_font) {
				return interface_font;
			} else {
				interface_font = client.fetchFont(var2, this.font, Class12.aClass153_323, Class97.aClass153_1378);
				if (null == interface_font) {
					GameShell.aBoolean6 = true;
				} else {
					interface_font.method697(var1, (int[]) null);
					Class47.aClass93_743.put(interface_font, (long) font);
				}
				return interface_font;
			}
		}
	}

   static final boolean isComponentHidden(jInterface var0) {
	      if(LookupTable.qaoptestEnabled) {
	         if(getInterfaceClickMask(var0).clickMask != 0) {
	            return false;
	         }
	
	         if(var0.type == 0) {
	            return false;
	         }
	      }
	
	      return var0.hidden;
	   }

static final ClickMaskNode getInterfaceClickMask(jInterface var0) {
	      ClickMaskNode var1 = (ClickMaskNode)Class124.aClass130_1659.get(((long)var0.uid << 32) + (long)var0.anInt191);
	      return var1 != null?var1:var0.clickMask;
	   }

static final int method869(int var0, int var1) {
      try {
         return ~var1 != -16711936?(var0 < 97?-63:Class56.method1186(0, var1)):-1;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "be.D(" + var0 + ',' + var1 + ')');
      }
   }

   public jInterface() {
      this.spellName = Class104.aClass94_2171;
      this.aBoolean163 = false;
      this.verticalAlignment = 0;
      this.mouseOverId = -1;
      this.aBoolean167 = false;
      this.anInt266 = -1;
      this.aByte241 = 0;
      this.maxScrollVertical = 0;
      this.aBoolean200 = false;
      this.shaded = false;
      this.anInt204 = -1;
      this.anInt260 = 1;
      this.disabledMouseOverColor = 0;
      this.scriptedInterface = false;
      this.clickMask = ProducingGraphicsBuffer.aClass3_Sub1_2980;
      this.enabledColor = 0;
      this.disabledText = Class104.aClass94_2171;
      this.anInt168 = 0;
      this.anInt247 = 0;
      this.aBoolean219 = false;
      this.mediaIdEnabled = -1;
      this.parent = -1;
      this.anInt216 = 1;
      this.anInt192 = -1;
      this.enabledMouseOverColor = 0;
      this.anInt264 = 0;
      this.aClass94_277 = Class104.aClass94_2171;
      this.anInt284 = 0;
      this.width = 0;
      this.invSpritePadX = 0;
      this.anInt234 = -1;
      this.aBoolean157 = false;
      this.anInt184 = 0;
      this.alpha = 0;
      this.anInt258 = 0;
      this.selectedActionName = Class104.aClass94_2171;
      this.rotationModifier = 0;
      this.enabledText = Class104.aClass94_2171;
      this.outline = 0;
      this.anInt265 = -1;
      this.anInt242 = 0;
      this.translateX = 0;
      this.invSpritePadY = 0;
      this.height = 0;
      this.uid = -1;
      this.enabledSprite = -1;
      this.aByte273 = 0;
      this.anInt267 = 0;
      this.font = -1;
      this.maxScrollHorizontal = 0;
      this.anInt255 = 0;
      this.aShort293 = 0;
      this.rotatino = 0;
      this.disabledAnim = -1;
      this.tooltip = Class115.aClass94_1583;
      this.rotateZ = 0;
      this.anInt271 = 0;
      this.anInt292 = -1;
      this.clientCode = 0;
      this.shadow = 0;
      this.aClass11_302 = null;
      this.anInt311 = 0;
      this.mediaTypeDisabled = 1;
      this.depthBufferEnabled = false;
      this.aByte304 = 0;
      this.mediaTypeEnabled = 1;
      this.anInt312 = 0;
      this.rotateY = 0;
      this.aBoolean195 = false;
      this.x = 0;
      this.anInt306 = 0;
      this.y = 0;
      this.aBoolean227 = true;
      this.anInt283 = 0;
      this.anInt213 = 0;
      this.disabledColor = 0;
      this.actionType = 0;
   }

}
