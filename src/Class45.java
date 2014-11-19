
final class Class45 {

   static int[] anIntArray729 = new int[4096];
   static float aFloat730;
   static js5 aClass153_731;
   static boolean aBoolean732 = false;
   static int mapFlagY = 0;
   static int anInt734 = 0;
   static int anInt735;
   static AbstractSprite[] aClass3_Sub28_Sub16_736;


   static final void method1080(int var0, int var1, byte var2, Player var3) {
         int var4;
         int var5;
         int var7;

         if((var0 & 0x100) != 0) {
            var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteS();
            var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteS();
            var3.method1970(var5, -8, Class44.loopCycle, var4);
            var3.anInt2781 = 300 + Class44.loopCycle;
            int currentHp = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteA();
            int maxHp = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteA();
            var3.hpRatio = (currentHp * 255) / maxHp;
         }
         
         if((0x200 & var0) != 0) {
             var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
             if(var4 == '\uffff') {
                var4 = -1;
             }

             var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getInt2();
             boolean var21 = true;
             if(~var4 != 0 && 0 != ~var3.anInt2842 && AnimationDefinition.list(SpotAnimation.list(var4).anInt542, false).anInt1857 < AnimationDefinition.list(SpotAnimation.list(var3.anInt2842).anInt542, false).anInt1857) {
                var21 = false;
             }

             if(var21) {
                var3.anInt2759 = (var5 & '\uffff') + Class44.loopCycle;
                var3.anInt2761 = 0;
                var3.anInt2805 = 0;
                var3.anInt2842 = var4;
                if(~var3.anInt2759 < ~Class44.loopCycle) {
                   var3.anInt2805 = -1;
                }

                var3.anInt2799 = var5 >> 16;
                var3.anInt2826 = 1;
                if(~var3.anInt2842 != 0 && Class44.loopCycle == var3.anInt2759) {
                   var7 = SpotAnimation.list(var3.anInt2842).anInt542;
                   if(0 != ~var7) {
                      AnimationDefinition var24 = AnimationDefinition.list(var7, false);
                      if(null != var24 && var24.frames != null) {
                         jSocket.method1470(var3.anInt2829, var24, 183921384, var3.anInt2819, var3 == TextureLoader.selfPlayer, 0);
                      }
                   }
                }
             }
          }
         
         if((0x8 & var0) != 0) {
             var3.anInt2772 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
             if(-65536 == ~var3.anInt2772) {
                var3.anInt2772 = -1;
             }
          }
         

         if((var0 & 0x4) != 0) {
        	 var3.anInt2786 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShortA();
        	 var3.anInt2762 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShortA();
         }
         

         if((0x400 & var0) != 0) {
            var3.anInt2784 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteS();
            var3.anInt2835 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteS();
            var3.anInt2823 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteS();
            var3.anInt2798 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteA();
            var3.anInt2800 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShortA() + Class44.loopCycle;
            var3.anInt2790 = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort() - -Class44.loopCycle;
            var3.anInt2840 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteC();
            var3.walkQueueLocationIndex = 1;
            var3.anInt2811 = 0;
         }
         
         if((var0 & 0x80) != 0) {
             var3.aClass94_2825 = SpotAnimation.aClass3_Sub30_Sub1_532.getString();
             if(~var3.aClass94_2825.method1569(0, (byte)-45) == -127) {
                var3.aClass94_2825 = var3.aClass94_2825.method1556(1, (byte)-74);
                PacketBuffer.method805(var3.method1980(0), var3.aClass94_2825, 2);
             } else if(var3 == TextureLoader.selfPlayer) {
                PacketBuffer.method805(var3.method1980(0), var3.aClass94_2825, 2);
             }

             var3.anInt2753 = 0;
             var3.anInt2837 = 0;
             var3.anInt2814 = 150;
          }

         if((var0 & 0x20) != 0) {
            var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
            if(-65536 == ~var4) {
               var4 = -1;
            }

            var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteC();
            GroundItem.method628(0, var5, var4, var3);
         }
         
         if(0 != (var0 & 0x1)) {
             var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShortA();
             var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteA();
             int var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByte();
             var7 = SpotAnimation.aClass3_Sub30_Sub1_532.pos;
             if(null != var3.username && var3.playerAppearance != null) {
                long var9 = var3.username.toLong();
                boolean var11 = false;
                if(var5 <= 1) {
                   if((Class3_Sub15.aBoolean2433 && !Class121.aBoolean1641 || Class3_Sub13_Sub14.aBoolean3166)) {
                      var11 = true;
                   } else {
                      for(int var12 = 0; var12 < AnimationLoader.anInt3591; ++var12) {
                         if(Class114.aLongArray1574[var12] == var9) {
                            var11 = true;
                            break;
                         }
                      }
                   }
                }

                if(!var11 && 0 == Class44_Sub1.anInt2622) {
                   Class161.aClass3_Sub30_2030.pos = 0;
                   SpotAnimation.aClass3_Sub30_Sub1_532.method774(2, var6, Class161.aClass3_Sub30_2030.buf, 0);
                   Class161.aClass3_Sub30_2030.pos = 0;
                   int var13 = -1;
                   jString var25;
                   var25 = Font.method686(Class32.method992(Class161.aClass3_Sub30_2030).method1536(78));

                   var3.aClass94_2825 = var25.method1564();
                   var3.anInt2753 = var4 & 255;
                   var3.anInt2814 = 150;
                   var3.anInt2837 = var4 >> 8;
                   if(-3 != ~var5) {
                      if(~var5 != -2) {
                         InvType.appendChatMessage(2, var25, (jString)null, var3.method1980(0));
                      } else {
                         InvType.appendChatMessage(1, var25, (jString)null, client.method903(new jString[]{Class32.aClass94_592, var3.method1980(0)}));
                      }
                   } else {
                      InvType.appendChatMessage(1, var25, (jString)null, client.method903(new jString[]{Class21.aClass94_444, var3.method1980(var2 + 79)}));
                   }
                }
             }

             SpotAnimation.aClass3_Sub30_Sub1_532.pos = var7 + var6;
          }

         if((var0 & 0x2) != 0) {
            var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteA();
            var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteS();
            var3.method1970(var5, var2 + 71, Class44.loopCycle, var4);
            //(entity.currentHealth * 30) / entity.maxHealth;
            var3.anInt2781 = 300 + Class44.loopCycle;
            int currentHp = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteA();
            int maxHp = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteA();
            var3.hpRatio = (currentHp * 255) / maxHp;
         }       
            
         if(0 != (0x40 & var0)) {
        	 var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteA();
        	 byte[] var16 = new byte[var4];
        	 Buffer var19 = new Buffer(var16);
        	 SpotAnimation.aClass3_Sub30_Sub1_532.getBytes(var16, 0, var4);
        	 Class65.aClass3_Sub30Array986[var1] = var19;
        	 var3.decodeAppearance(var19);
         }
         
         if((2048 & var0) != 0) {
             var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteC();
             int[] var18 = new int[var4];
             int[] var17 = new int[var4];
             int[] var20 = new int[var4];

             for(int var22 = 0; ~var4 < ~var22; ++var22) {
                int var23 = SpotAnimation.aClass3_Sub30_Sub1_532.getULEShort();
                if('\uffff' == var23) {
                   var23 = -1;
                }

                var18[var22] = var23;
                var17[var22] = SpotAnimation.aClass3_Sub30_Sub1_532.getUByteA();
                var20[var22] = SpotAnimation.aClass3_Sub30_Sub1_532.getUShort();
             }

             Class75_Sub1.method1342(var17, var18, var3, (byte)-113, var20);
          }

   }

   public static void method1081(byte var0) {
      try {
         aClass3_Sub28_Sub16_736 = null;
         anIntArray729 = null;
         if(var0 <= 63) {
            decodeSprites((byte[])null);
         }

         aClass153_731 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "gk.E(" + var0 + ')');
      }
   }

   static final void decodeSprites(byte[] data) {
	   Buffer buffer = new Buffer(data);
	   buffer.pos = data.length - 2;
	   Class95.spriteAmount = buffer.getUShort();
	   Class3_Sub13_Sub6.spriteHeights = new int[Class95.spriteAmount];
	   ItemPile.spriteWidths = new int[Class95.spriteAmount];
	   Class164.spriteXOffsets = new int[Class95.spriteAmount];
	   Class3_Sub13_Sub22.spriteHaveAlpha = new boolean[Class95.spriteAmount];
	   Class163_Sub3.spriteAlphas = new byte[Class95.spriteAmount][];
	   Buffer.spriteYOffsets = new int[Class95.spriteAmount];
	   Class163_Sub1.spritePaletteIndicators = new byte[Class95.spriteAmount][];
	   buffer.pos = data.length - (8 * Class95.spriteAmount) - 7;
	   Class3_Sub15.spriteTrimWidth = buffer.getUShort();
	   GrandExchangeItem.spriteTrimHeight = buffer.getUShort();
	   int paletteSize = (buffer.getUByte() & 0xff) - -1;

	   int var4;
	   for(var4 = 0; var4 < Class95.spriteAmount; ++var4) {
		   Class164.spriteXOffsets[var4] = buffer.getUShort();
	   }

	   for(var4 = 0; var4 < Class95.spriteAmount; ++var4) {
		   Buffer.spriteYOffsets[var4] = buffer.getUShort();
	   }

	   for(var4 = 0; Class95.spriteAmount > var4; ++var4) {
		   ItemPile.spriteWidths[var4] = buffer.getUShort();
	   }
	   
	   for(var4 = 0; var4 < Class95.spriteAmount; ++var4) {
		   Class3_Sub13_Sub6.spriteHeights[var4] = buffer.getUShort();
	   }

	   buffer.pos = -(8 * Class95.spriteAmount) + data.length + -7 + 3 + -(paletteSize * 3);
	   Class3_Sub13_Sub38.spritePalette = new int[paletteSize];

	   for(var4 = 1; ~var4 > ~paletteSize; ++var4) {
		   Class3_Sub13_Sub38.spritePalette[var4] = buffer.getMidInt();
		   if(0 == Class3_Sub13_Sub38.spritePalette[var4]) {
			   Class3_Sub13_Sub38.spritePalette[var4] = 1;
		   }
	   }

	   buffer.pos = 0;
	   
	   for(var4 = 0; var4 < Class95.spriteAmount; ++var4) {
		   int var5 = ItemPile.spriteWidths[var4];
		   int var6 = Class3_Sub13_Sub6.spriteHeights[var4];
		   int var7 = var5 * var6;
		   byte[] var8 = new byte[var7];
		   boolean var10 = false;
		   Class163_Sub1.spritePaletteIndicators[var4] = var8;
		   byte[] var9 = new byte[var7];
		   Class163_Sub3.spriteAlphas[var4] = var9;
		   int var11 = buffer.getUByte();
		   int var12;
		   if(-1 != ~(1 & var11)) {
			   int var13;
			   for(var12 = 0; ~var12 > ~var5; ++var12) {
				   for(var13 = 0; var13 < var6; ++var13) {
					   var8[var12 + var13 * var5] = buffer.getByte();
				   }
			   }

			   if(-1 != ~(var11 & 2)) {
				   for(var12 = 0; ~var12 > ~var5; ++var12) {
					   for(var13 = 0; var13 < var6; ++var13) {
						   byte var14 = var9[var5 * var13 + var12] = buffer.getByte();
						   var10 |= -1 != var14;
					   }
				   }
			   }
		   } else {
			   for(var12 = 0; ~var7 < ~var12; ++var12) {
				   var8[var12] = buffer.getByte();
			   }

			   if((2 & var11) != 0) {
				   for(var12 = 0; ~var12 > ~var7; ++var12) {
					   byte var16 = var9[var12] = buffer.getByte();
					   var10 |= var16 != -1;
				   }
			   }
		   }

		   Class3_Sub13_Sub22.spriteHaveAlpha[var4] = var10;
	   }
   }

   static final void method1083(byte var0) {
      try {
         Class3_Sub13_Sub9.anIntArray3107 = InputStream_Sub1.method62(true, 14585, 8, 2048, 4, 0.4F, 8, 35);
         int var1 = -5 / ((var0 - 45) / 59);
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "gk.C(" + var0 + ')');
      }
   }

	static final void method1084(NodeSub var0, NodeSub var1) {
		if (var1.previousSub != null) {
			var1.unlinkSub();
		}

		var1.previousSub = var0;
		var1.nextSub = var0.nextSub;
		var1.previousSub.nextSub = var1;
		var1.nextSub.previousSub = var1;
	}

}
