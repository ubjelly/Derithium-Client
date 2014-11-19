
final class Player extends Entity {

   static int[] anIntArray3951 = new int[4];
   int anInt3952 = -1;
   static byte aByte3953;
   static int[] anIntArray3954 = new int[100];
   int anInt3955 = -1;
   int team = 0;
   private int anInt3958 = 0;
   static int[] anIntArray3959 = new int[2];
   int combatLevel = 0;
   static jString aClass94_3961 = jString.createJString("Tweening enabled(Q");
   PlayerAppearance playerAppearance;
   int anInt3963 = -1;
   //static jString aClass94_3964 = jString.createJString("_labels");
   int anInt3965 = 0;
   int anInt3966 = -1;
   jString username;
   boolean aBoolean3968 = false;
   int anInt3969 = 0;
   int anInt3970 = -1;
   //static jString aClass94_3971 = jString.createJString("www)2wtqa");
   int anInt3972 = -1;
   int anInt3973 = -1;
   int anInt3974 = 0;

   final int getSize() {
	   if(null != this.playerAppearance && 0 != ~this.playerAppearance.npcId) {
		   return NpcDefinition.list(this.playerAppearance.npcId).size;
	   } else {
		   return super.getSize();
	   }
   }

   final void decodeAppearance(Buffer buffer) {
	   buffer.pos = 0;
	   int var3 = buffer.getUByte();
	   int npcId = -1;
	   int var4 = 1 & var3;
	   boolean var6 = ~(var3 & 4) != -1;
	   int var7 = super.getSize();
	   this.setSize(1 + (var3 >> 3 & 7), 2);
	   this.anInt3958 = 3 & var3 >> 6;
	   this.anInt2819 += (-var7 + this.getSize()) * 64;
	   this.anInt2829 += 64 * (this.getSize() + -var7);
	   this.anInt3972 = buffer.getByte();
	   this.anInt3955 = buffer.getByte();
	   this.team = 0;

	   int var11;
	   int var12;
	   int var13;
	   int var14;
	   int[] equipmentIds = new int[12];
	   for(int var10 = 0; var10 < 12; ++var10) {
		   int equipment = buffer.getUByte();
		   if(equipment == 0) {
			   equipmentIds[var10] = 0;
		   } else {
			   int var121 = buffer.getUByte();
			   equipmentIds[var10] = (equipment << 8) + var121;
			   if(var10 == 0 && equipmentIds[0] == 65535) {
				   npcId = buffer.getUShort();
				   //this.team = buffer.getUByte();
				   break;
			   }
			   
			   if(equipmentIds[var10] >= 512) {
				   int t = ItemDefinition.method1023(equipmentIds[var10] - 512).anInt782;
				   if(t != 0) {
					   this.team = t;
				   }
			   }
		   }
	   }
	   /*for(int var10 = 0; var10 < 12; ++var10) {
		   int equipment = buffer.getUByte();
		   if(equipment == 0) {
			   equipmentIds[var10] = 0;
		   } else {
			   int var121 = buffer.getUByte();
			   int var131 = (equipment << 8) + var121;
			   if(var10 == 0 && var131 == 65535) {
				   npcId = buffer.getUShort();
				   this.team = buffer.getUByte();
				   break;
			   }
			   
			   if('\u8000' <= var131) {
				   var131 = Class75_Sub4.anIntArray2664[var131 - '\u8000'];
				   equipmentIds[var10] = Class3_Sub13_Sub29.method308(1073741824, var131);
				   var14 = ItemDefinition.method1023(var131).anInt782;
				   if(var14 != 0) {
					   this.team = var14;
				   }
			   } else {
				   equipmentIds[var10] = Class3_Sub13_Sub29.method308(-256 + var131, Integer.MIN_VALUE);
			   }
		   }
	   }*/

	   int[] colors = new int[5];
	   
	   for(var11 = 0; var11 < 5; ++var11) {
		   var12 = buffer.getUByte();
		   if(-1 < ~var12 || var12 >= Class15.aShortArrayArray344[var11].length) {
			   var12 = 0;
		   }

		   colors[var11] = var12;
	   }
	
	   /*this.anInt2763 = buffer.getUShort();
	   buffer.getUShort();
	   buffer.getUShort();
	   buffer.getUShort();
	   buffer.getUShort();
	   buffer.getUShort();
	   buffer.getUShort();*/
		idleAnimation = buffer.getUShort();
		if (idleAnimation == 65535)
			idleAnimation = -1;
		turnAnimation = buffer.getUShort();
		if (turnAnimation == 65535)
			turnAnimation = -1;
		walkAnimation = buffer.getUShort();
		if (walkAnimation == 65535)
			walkAnimation = -1;
		turn180Animation = buffer.getUShort();
		if (turn180Animation == 65535)
			turn180Animation = -1;
		turn90CWAnimation = buffer.getUShort();
		if (turn90CWAnimation == 65535)
			turn90CWAnimation = -1;
		turn90CCAnimation = buffer.getUShort();
		if (turn90CCAnimation == 65535)
			turn90CCAnimation = -1;
		runAnimation = buffer.getUShort();
		if (runAnimation == 65535)
			runAnimation = -1;
	   long var20 = buffer.getLong();
	   this.username = FileSystem.longToString(var20).upperCase();
	   this.combatLevel = buffer.getUByte();
	   //if(var6) {
		   this.anInt3974 = buffer.getUShort();
		   this.anInt3965 = this.combatLevel;
		   this.anInt3970 = -1;
	  /* } else {
		   this.anInt3974 = 0;
		   this.anInt3965 = buffer.getUByte();
		   this.anInt3970 = buffer.getUByte();
		   if(-256 == ~this.anInt3970) {
			   this.anInt3970 = -1;
		   }
	   }*/

	   var13 = this.anInt3969;
	   this.anInt3969 = 0;//buffer.getUByte();
	   if(0 == this.anInt3969) {
		   Class162.method2203(this, 8);
	   } else {
		   int var15 = this.anInt3966;
		   int var16 = this.anInt3963;
		   int var17 = this.anInt3973;
		   var14 = this.anInt3952;
		   this.anInt3952 = buffer.getUShort();
		   this.anInt3966 = buffer.getUShort();
		   this.anInt3963 = buffer.getUShort();
		   this.anInt3973 = buffer.getUShort();
		   if(this.anInt3969 != var13 || ~this.anInt3952 != ~var14 || ~this.anInt3966 != ~var15 || var16 != this.anInt3963 || ~this.anInt3973 != ~var17) {
			   NodeSub.method518(this);
		   }
	   }

	   if(null == this.playerAppearance) {
		   this.playerAppearance = new PlayerAppearance();
	   }

	   var14 = this.playerAppearance.npcId;
	   this.playerAppearance.setAppearance(colors, npcId, ~var4 == -2, equipmentIds);
	   if(~var14 != ~npcId) {
		   this.anInt2819 = 128 * this.anIntArray2767[0] + this.getSize() * 64;
		   this.anInt2829 = 128 * this.anIntArray2755[0] - -(64 * this.getSize());
	   }
	   
	   if(this.aClass127_Sub1_2801 != null) {
		   this.aClass127_Sub1_2801.method1759();
	   }
   }

   final void render(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, int var11, ParticleEngine var12) {
      try {
         if(this.playerAppearance != null) {
            AnimationDefinition var13 = this.currentAnimationId != -1 && 0 == this.animationDelay?AnimationDefinition.list(this.currentAnimationId, false):null;
            AnimationDefinition var14 = 0 != ~this.currentMoveAnimation && !this.aBoolean3968 && (this.currentMoveAnimation != idleAnimation || var13 == null)?AnimationDefinition.list(this.currentMoveAnimation, false):null;
            AbstractModel var15 = this.playerAppearance.method1165(this.aClass145Array2809, this.anInt2776, var14, var13, this.anInt2802, this.anInt2793, -120, this.anInt2760, true, this.anInt2832, this.anInt2813);
            int var16 = Class118.method1727();
            if(HDToolkit.openGLEnabled && Class3_Sub24_Sub3.maxMemory < 96 && ~var16 < -51) {
               ClickMaskNode.method90(1);
            }

            int var17;
            if(0 != Class3_Sub13_Sub13.modeWhat && var16 < 50) {
               for(var17 = 50 - var16; Class56.anInt893 < var17; ++Class56.anInt893) {
                  Class3_Sub6.aByteArrayArray2287[Class56.anInt893] = new byte[102400];
               }

               while(Class56.anInt893 > var17) {
                  --Class56.anInt893;
                  Class3_Sub6.aByteArrayArray2287[Class56.anInt893] = null;
               }
            }

            if(var15 != null) {
               this.anInt2820 = var15.method1871();
               AbstractModel var23;
               if(HDToolkit.openGLEnabled) {
            	   if(Class140_Sub6.aBoolean2910 && (-1 == this.playerAppearance.npcId || NpcDefinition.list(this.playerAppearance.npcId).aBoolean1249)) {
            		   var23 = Class140_Sub3.method1957(160, this.aBoolean2810, var14 == null?var13:var14, this.anInt2819, 0, this.anInt2829, 0, 1, var15, var1, null != var14?this.anInt2813:this.anInt2832, this.anInt2831, 240, (byte)-49);
            		   float var18 = HDToolkit.method1852();
            		   float var19 = HDToolkit.method1839();
            		   HDToolkit.disableDepthBuffer();
            		   HDToolkit.method1825(var18, -150.0F + var19);
            		   var23.render(0, var2, var3, var4, var5, var6, var7, var8, -1L, var11, (ParticleEngine)null);
            		   HDToolkit.enableDepthBuffer();
            		   HDToolkit.method1825(var18, var19);
            	   }
               }
               /*if(Class140_Sub6.aBoolean2910 && (-1 == this.aClass52_3962.npcId || NpcDefinition.list(this.aClass52_3962.npcId).aBoolean1249)) {
                  var23 = Class140_Sub3.method1957(160, this.aBoolean2810, var14 == null?var13:var14, this.anInt2819, 0, this.anInt2829, 0, 1, var15, var1, null != var14?this.anInt2813:this.anInt2832, this.anInt2831, 240, (byte)-49);
                  if(HDToolkit.openGLEnabled) {
                     float var18 = HDToolkit.method1852();
                     float var19 = HDToolkit.method1839();
                     HDToolkit.disableDepthBuffer();
                     HDToolkit.method1825(var18, -150.0F + var19);
                     var23.render(0, var2, var3, var4, var5, var6, var7, var8, -1L, var11, (ParticleEngine)null);
                     HDToolkit.enableDepthBuffer();
                     HDToolkit.method1825(var18, var19);
                  } else {
                     var23.render(0, var2, var3, var4, var5, var6, var7, var8, -1L, var11, (ParticleEngine)null);
                  }
               }*/

               if(TextureLoader.selfPlayer == this) {
                  for(var17 = RuntimeException_Sub1.aClass96Array2114.length + -1; -1 >= ~var17; --var17) {
                     HintIcon var27 = RuntimeException_Sub1.aClass96Array2114[var17];
                     if(var27 != null && ~var27.anInt1355 != 0) {
                        int var21;
                        int var20;
                        if(-2 == ~var27.anInt1360 && 0 <= var27.anInt1359 && ~Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292.length < ~var27.anInt1359) {
                           Npc var24 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var27.anInt1359];
                           if(null != var24) {
                              var20 = var24.anInt2819 / 32 - TextureLoader.selfPlayer.anInt2819 / 32;
                              var21 = -(TextureLoader.selfPlayer.anInt2829 / 32) + var24.anInt2829 / 32;
                              this.method1979((ParticleEngine)null, var21, var15, var20, var6, var11, 2047, var1, var8, var5, var4, var2, var27.anInt1355, var3, var7);
                           }
                        }

                        if(var27.anInt1360 == 2) {
                           int var29 = 4 * (-Class131.anInt1716 + var27.anInt1356) + 2 + -(TextureLoader.selfPlayer.anInt2819 / 32);
                           var20 = 2 + (4 * (var27.anInt1347 - Class82.anInt1152) - TextureLoader.selfPlayer.anInt2829 / 32);
                           this.method1979((ParticleEngine)null, var20, var15, var29, var6, var11, 2047, var1, var8, var5, var4, var2, var27.anInt1355, var3, var7);
                        }

                        if(-11 == ~var27.anInt1360 && var27.anInt1359 >= 0 && ~Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269.length < ~var27.anInt1359) {
                           Player var28 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var27.anInt1359];
                           if(null != var28) {
                              var20 = -(TextureLoader.selfPlayer.anInt2819 / 32) + var28.anInt2819 / 32;
                              var21 = var28.anInt2829 / 32 + -(TextureLoader.selfPlayer.anInt2829 / 32);
                              this.method1979((ParticleEngine)null, var21, var15, var20, var6, var11, 2047, var1, var8, var5, var4, var2, var27.anInt1355, var3, var7);
                           }
                        }
                     }
                  }
               }

               this.method1971(var15);
               this.method1969(var15, var1);
               var23 = null;
               if(!this.aBoolean3968 && 0 != ~this.anInt2842 && this.anInt2805 != -1) {
                  SpotAnimation var26 = SpotAnimation.list(this.anInt2842);
                  var23 = var26.method966(this.anInt2826, (byte)-30, this.anInt2805, this.anInt2761);
                  if(var23 != null) {
                     var23.move(0, -this.anInt2799, 0);
                     if(var26.aBoolean536) {
                        if(Class3_Sub13_Sub16.anInt3198 != 0) {
                           var23.method1896(Class3_Sub13_Sub16.anInt3198);
                        }

                        if(0 != Class3_Sub28_Sub9.anInt3623) {
                           var23.method1886(Class3_Sub28_Sub9.anInt3623);
                        }

                        if(Class3_Sub13_Sub9.anInt3111 != 0) {
                           var23.move(0, Class3_Sub13_Sub9.anInt3111, 0);
                        }
                     }
                  }
               }

               AbstractModel var25 = null;
               if(!this.aBoolean3968 && this.anObject2796 != null) {
                  if(Class44.loopCycle >= this.anInt2778) {
                     this.anObject2796 = null;
                  }

                  if(~this.anInt2797 >= ~Class44.loopCycle && this.anInt2778 > Class44.loopCycle) {
                     if(!(this.anObject2796 instanceof Class140_Sub3)) {
                        var25 = (AbstractModel)this.anObject2796;
                     } else {
                        var25 = (AbstractModel)((Class140_Sub3)this.anObject2796).method1963(3);
                     }

                     var25.move(this.anInt2782 + -this.anInt2819, this.anInt2812 + -this.anInt2831, this.anInt2833 + -this.anInt2829);
                     if(-513 != ~this.turnDirection) {
                        if(~this.turnDirection != -1025) {
                           if(-1537 == ~this.turnDirection) {
                              var25.rotate90();
                           }
                        } else {
                           var25.rotate180();
                        }
                     } else {
                        var25.rotate270();
                     }
                  }
               }

               if(HDToolkit.openGLEnabled) {
                  var15.aBoolean2699 = true;
                  var15.render(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, this.aClass127_Sub1_2801);
                  if(var23 != null) {
                     var23.aBoolean2699 = true;
                     var23.render(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, this.aClass127_Sub1_2801);
                  }
               } else {
                  if(null != var23) {
                     var15 = ((LDModel)var15).method1943(var23);
                  }

                  if(var25 != null) {
                     var15 = ((LDModel)var15).method1943(var25);
                  }

                  var15.aBoolean2699 = true;
                  var15.render(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, this.aClass127_Sub1_2801);
               }

               if(null != var25) {
                  if(this.turnDirection == 512) {
                     var25.rotate90();
                  } else if(1024 == this.turnDirection) {
                     var25.rotate180();
                  } else if(1536 == this.turnDirection) {
                     var25.rotate270();
                  }

                  var25.move(-this.anInt2782 + this.anInt2819, -this.anInt2812 + this.anInt2831, -this.anInt2833 + this.anInt2829);
               }

            }
         }
      } catch (RuntimeException var22) {
         throw Class44.method1067(var22, "e.IA(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var11 + ',' + (var12 != null?"{...}":"null") + ')');
      }
   }

   private final void method1979(ParticleEngine var1, int var2, AbstractModel var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      try {
         int var16 = var4 * var4 - -(var2 * var2);
         if(-17 >= ~var16 && -360001 <= ~var16) {
            int var17 = (int)(325.949D * Math.atan2((double)var4, (double)var2)) & var7;
            AbstractModel var18 = Class128.method1763(true, var17, this.anInt2829, var13, this.anInt2819, var3, this.anInt2831);
            if(var18 != null) {
               if(HDToolkit.openGLEnabled) {
                  float var19 = HDToolkit.method1852();
                  float var20 = HDToolkit.method1839();
                  HDToolkit.disableDepthBuffer();
                  HDToolkit.method1825(var19, var20 - 150.0F);
                  var18.render(0, var12, var14, var11, var10, var5, var15, var9, -1L, var6, var1);
                  HDToolkit.enableDepthBuffer();
                  HDToolkit.method1825(var19, var20);
               } else {
                  var18.render(0, var12, var14, var11, var10, var5, var15, var9, -1L, var6, var1);
               }
            }

         }
      } catch (RuntimeException var21) {
         throw Class44.method1067(var21, "e.N(" + (var1 != null?"{...}":"null") + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ',' + var11 + ',' + var12 + ',' + var13 + ',' + var14 + ',' + var15 + ')');
      }
   }

   final boolean method1966(byte var1) {
      try {
         if(var1 != 17) {
            anIntArray3954 = (int[])null;
         }

         return this.playerAppearance != null;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "e.L(" + var1 + ')');
      }
   }

   final jString method1980(int var1) {
      try {
         jString var2 = this.username;
         if(var1 != 0) {
            this.render(-63, 126, 58, -9, -74, -119, -45, -114, -62L, -76, (ParticleEngine)null);
         }

         if(PacketBuffer.aClass94Array3802 != null) {
            var2 = client.method903(new jString[]{PacketBuffer.aClass94Array3802[this.anInt3958], var2});
         }

         if(null != OutputStream_Sub1.aClass94Array45) {
            var2 = client.method903(new jString[]{var2, OutputStream_Sub1.aClass94Array45[this.anInt3958]});
         }

         return var2;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "e.Q(" + var1 + ')');
      }
   }

   final void method1867(int var1, int var2, int var3, int var4, int var5) {}

   final void method1981(int var2, boolean var3, int var4) {
	   super.method1967(this.getSize(), var2, var4, var3);
   }

   protected final void finalize() {}

   public static void method1982(byte var0) {
      try {
         //aClass94_3971 = null;
         anIntArray3951 = null;
         aClass94_3961 = null;
         anIntArray3959 = null;
         if(var0 <= 116) {
            method1982((byte)-48);
         }

         anIntArray3954 = null;
         //aClass94_3964 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "e.R(" + var0 + ')');
      }
   }

   final int method1871() {
      try {
         return this.anInt2820;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "e.MA()");
      }
   }

}
