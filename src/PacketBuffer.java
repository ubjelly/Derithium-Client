final class PacketBuffer extends Buffer {

   static jString[] aClass94Array3802;
   private IsaacCipher isaacCipher;
   static int[] anIntArray3804 = new int[256];
   static int[] anIntArray3805;
   private int bitOffset;
   static jString aClass94_3807 = jString.createJString("m");


   static final void method805(jString var0, jString var2, int var1) {
	   InvType.appendChatMessage(var1, var2, (jString)null, var0);
   }

   static final void method806(int var0, int var1) {
      try {
         if(-1 >= ~var1) {
            int index = Class117.anIntArray1613[var1];
            int interfaceSet = Class27.anIntArray512[var1];
            int var4 = Class3_Sub13_Sub7.aShortArray3095[var1];
            if(var4 >= 2000) {
               var4 -= 2000;
            }

            long var6 = Class3_Sub13_Sub22.aLongArray3271[var1];
            int id = (int)Class3_Sub13_Sub22.aLongArray3271[var1];
            Player var8;
            if(31 == var4) {
               var8 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[id];
               if(null != var8) {
                  Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, var8.anIntArray2767[0], 1, 0, 2, var8.anIntArray2755[0], TextureLoader.selfPlayer.anIntArray2767[0]);
                  Huffman.anInt638 = 2;
                  js5Worker.anInt2958 = 0;
                  Class70.anInt1053 = Class163_Sub1.anInt2993;
                  UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                  Class3_Sub13_Sub1.outputStream.putPacket(180);
                  Class3_Sub13_Sub1.outputStream.putShort(id);
               }
            }

            if(-47 == ~var4) {
              /* Class163_Sub2_Sub1.method2224((byte)39, var6, var3, var2);
               Class3_Sub13_Sub1.outputStream.putPacket(247);//TODO
               Class3_Sub13_Sub1.outputStream.putLEShort(Class82.anInt1152 + var3);
               Class3_Sub13_Sub1.outputStream.putLEShortA(var2 + Class131.anInt1716);
               Class3_Sub13_Sub1.outputStream.putShort(Integer.MAX_VALUE & (int)(var6 >>> 32));*/
            }

            if(~var4 == -41) {
               Class3_Sub13_Sub1.outputStream.putPacket(166);
               Class3_Sub13_Sub1.outputStream.putLEShort(Class110.anInt1473);
               Class3_Sub13_Sub1.outputStream.putShort(index);
               Class3_Sub13_Sub1.outputStream.putLEShortA(id);
               Class3_Sub13_Sub1.outputStream.putInt2(interfaceSet);
               Class3_Sub13_Sub1.outputStream.putLEInt(Class3_Sub28_Sub18.anInt3764, (byte)-122);
               Class3_Sub13_Sub1.outputStream.putShortA(Class164.anInt2050);
               Class3_Sub9.anInt2330 = 0;
               Class151.aClass11_1933 = Class7.getInterface(interfaceSet);
               KeyboardHandler.anInt1918 = index;
            }

            Npc var11;
            if(var4 == 19) {
               var11 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[id];
               if(null != var11) {
                  Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, var11.anIntArray2767[0], 1, 0, 2, var11.anIntArray2755[0], TextureLoader.selfPlayer.anIntArray2767[0]);
                  Huffman.anInt638 = 2;
                  js5Worker.anInt2958 = 0;
                  UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                  Class3_Sub13_Sub1.outputStream.putPacket(51);
                  Class3_Sub13_Sub1.outputStream.putShortA(id);
               }
            }

            if(var4 == 17) {//option 1
               var11 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[id];
               if(var11 != null) {
                  Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, var11.anIntArray2767[0], 1, 0, 2, var11.anIntArray2755[0], TextureLoader.selfPlayer.anIntArray2767[0]);
                  Class70.anInt1053 = Class163_Sub1.anInt2993;
                  js5Worker.anInt2958 = 0;
                  Huffman.anInt638 = 2;
                  UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                  Class3_Sub13_Sub1.outputStream.putPacket(156);
                  Class3_Sub13_Sub1.outputStream.putShortA(id);
               }
            }

            if(var4 == 44) {
               var8 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[id];
               if(null != var8) {
                  Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, var8.anIntArray2767[0], 1, 0, 2, var8.anIntArray2755[0], TextureLoader.selfPlayer.anIntArray2767[0]);
                  Class70.anInt1053 = Class163_Sub1.anInt2993;
                  Huffman.anInt638 = 2;
                  UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                  js5Worker.anInt2958 = 0;
                  Class3_Sub13_Sub1.outputStream.putPacket(133);
                  Class3_Sub13_Sub1.outputStream.putLEShort(id);
               }
            }

            if(-59 == ~var4) {
               Class3_Sub13_Sub1.outputStream.putPacket(247);
               Class3_Sub13_Sub1.outputStream.putInt2(interfaceSet);
               Class3_Sub13_Sub1.outputStream.putShortA(id);
               Class3_Sub13_Sub1.outputStream.putLEShort(index);
               Class3_Sub9.anInt2330 = 0;
               Class151.aClass11_1933 = Class7.getInterface(interfaceSet);
               KeyboardHandler.anInt1918 = index;
            }

            if(-43 == ~var4) {
               Class163_Sub2_Sub1.method2224((byte)39, var6, interfaceSet, index);
               Class3_Sub13_Sub1.outputStream.putPacket(44);
               Class3_Sub13_Sub1.outputStream.putLEShort((int)(var6 >>> 32) & Integer.MAX_VALUE);
               Class3_Sub13_Sub1.outputStream.putShort(index + Class131.anInt1716);
               Class3_Sub13_Sub1.outputStream.putLEShort(interfaceSet + Class82.anInt1152);
            }

            if(28 == var4) {
               Class3_Sub13_Sub19.method264();
            }

            if(~var4 == -46) {
               var11 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[id];
               if(var11 != null) {
                  Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, var11.anIntArray2767[0], 1, 0, 2, var11.anIntArray2755[0], TextureLoader.selfPlayer.anIntArray2767[0]);
                  Class70.anInt1053 = Class163_Sub1.anInt2993;
                  Huffman.anInt638 = 2;
                  js5Worker.anInt2958 = 0;
                  UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                  Class3_Sub13_Sub1.outputStream.putPacket(69);
                  Class3_Sub13_Sub1.outputStream.putShort(jInterface.anInt278);
                  Class3_Sub13_Sub1.outputStream.putInt(SubScript.anInt872);
                  Class3_Sub13_Sub1.outputStream.putShort(id);
               }
            }

            boolean var14;
            if(18 == var4) {
            	var14 = Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 0, false, 0, var0 ^ 2599, index, 0, 0, 2, interfaceSet, TextureLoader.selfPlayer.anIntArray2767[0]);
            	if(!var14) {
            		Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, index, 1, 0, 2, interfaceSet, TextureLoader.selfPlayer.anIntArray2767[0]);
            	}

               Class70.anInt1053 = Class163_Sub1.anInt2993;
               js5Worker.anInt2958 = 0;
               Huffman.anInt638 = 2;
               UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
               Class3_Sub13_Sub1.outputStream.putPacket(216);
               Class3_Sub13_Sub1.outputStream.putShort(id);
               Class3_Sub13_Sub1.outputStream.putShortA(interfaceSet + Class82.anInt1152);
               Class3_Sub13_Sub1.outputStream.putLEShortA(Class131.anInt1716 + index);
            }

            if(var4 == 1001) {
               Class163_Sub2_Sub1.method2224((byte)39, var6, interfaceSet, index);
               Class3_Sub13_Sub1.outputStream.putPacket(170);
               Class3_Sub13_Sub1.outputStream.putLEShortA(Integer.MAX_VALUE & (int)(var6 >>> 32));
               Class3_Sub13_Sub1.outputStream.putLEShortA(index - -Class131.anInt1716);
               Class3_Sub13_Sub1.outputStream.putLEShortA(interfaceSet - -Class82.anInt1152);
            }

            if(~var4 == -1003) {
               Huffman.anInt638 = 2;
               Class70.anInt1053 = Class163_Sub1.anInt2993;
               UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
               js5Worker.anInt2958 = 0;
               Class3_Sub13_Sub1.outputStream.putPacket(92);
               Class3_Sub13_Sub1.outputStream.putLEShortA(id);
            }

            jInterface var13;
            if(~var4 == -1007) {
               var13 = Class7.getInterface(interfaceSet);
               if(null != var13 && ~var13.inventoryAmounts[index] <= -100001) {
                  method805(GroundItem.aClass94_3672, client.method903(new jString[]{Class72.method1298(var13.inventoryAmounts[index]), Class3_Sub28_Sub19.aClass94_3777, ItemDefinition.method1023(id).aClass94_770}), 0);
               } else {
                  Class3_Sub13_Sub1.outputStream.putPacket(92);
                  Class3_Sub13_Sub1.outputStream.putLEShortA(id);
               }

               Class3_Sub9.anInt2330 = 0;
               Class151.aClass11_1933 = Class7.getInterface(interfaceSet);
               KeyboardHandler.anInt1918 = index;
            }

            if(var4 == 60) {
               if(-1 != ~id) {
                  if(-2 == ~id) {
                     if(2 <= Class3_Sub13_Sub26.anInt3320 && ObjectDefinition.aBooleanArray1490[82] && ObjectDefinition.aBooleanArray1490[81]) {
                        Class30.method979(Class131.anInt1716 + index, Class82.anInt1152 + interfaceSet, Class26.plane);
                     } else if(Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 0, true, 0, 2, index, 0, 0, 1, interfaceSet, TextureLoader.selfPlayer.anIntArray2767[0])) {
                        Class3_Sub13_Sub1.outputStream.putByte(Class1.anInt56);
                        Class3_Sub13_Sub1.outputStream.putByte(Class58.anInt916);
                        Class3_Sub13_Sub1.outputStream.putShort(SpotAnimation.cameraYaw);
                        Class3_Sub13_Sub1.outputStream.putByte(57);
                        Class3_Sub13_Sub1.outputStream.putByte(Class3_Sub13_Sub8.anInt3102);
                        Class3_Sub13_Sub1.outputStream.putByte(Class164_Sub2.anInt3020);
                        Class3_Sub13_Sub1.outputStream.putByte(89);
                        Class3_Sub13_Sub1.outputStream.putShort(TextureLoader.selfPlayer.anInt2819);
                        Class3_Sub13_Sub1.outputStream.putShort(TextureLoader.selfPlayer.anInt2829);
                        Class3_Sub13_Sub1.outputStream.putByte(AbstractTimer.anInt1692);
                        Class3_Sub13_Sub1.outputStream.putByte(63);
                     }
                  }
               } else {
                  Class3_Sub28_Sub10.method589(Class26.plane, index, interfaceSet);
               }
            }

            if(1007 == var4) {
               js5Worker.anInt2958 = 0;
               Huffman.anInt638 = 2;
               UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
               Class70.anInt1053 = Class163_Sub1.anInt2993;
               var11 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[id];
               if(var11 != null) {
                  NpcDefinition var9 = var11.aClass90_3976;
                  if(var9.anIntArray1292 != null) {
                     var9 = var9.method1471((byte)80);
                  }

                  if(null != var9) {
                     Class3_Sub13_Sub1.outputStream.putPacket(72);
                     Class3_Sub13_Sub1.outputStream.putShort(var9.anInt1284);
                  }
               }
            }

            if(~var4 == -48) {
            	Class3_Sub13_Sub1.outputStream.putPacket(101);
                Class3_Sub13_Sub1.outputStream.putInt1(interfaceSet);
                Class3_Sub13_Sub1.outputStream.putLEShort(index);
                Class3_Sub13_Sub1.outputStream.putLEShort(id);
                Class3_Sub9.anInt2330 = 0;
                Class151.aClass11_1933 = Class7.getInterface(interfaceSet);
                KeyboardHandler.anInt1918 = index;
            }

            if(var4 == 3) {
               Class3_Sub13_Sub1.outputStream.putPacket(163);
               Class3_Sub13_Sub1.outputStream.putLEShortA(id);
               Class3_Sub13_Sub1.outputStream.putLEShort(index);
               Class3_Sub13_Sub1.outputStream.putLEShortA(jInterface.anInt278);
               Class3_Sub13_Sub1.outputStream.putInt2(interfaceSet);
               Class3_Sub13_Sub1.outputStream.putLEInt(SubScript.anInt872, (byte)-126);
               Class3_Sub9.anInt2330 = 0;
               Class151.aClass11_1933 = Class7.getInterface(interfaceSet);
               KeyboardHandler.anInt1918 = index;
            }

            if(~var4 == -11) {
               var8 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[id];
               if(var8 != null) {
                  Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, var8.anIntArray2767[0], 1, 0, 2, var8.anIntArray2755[0], TextureLoader.selfPlayer.anIntArray2767[0]);
                  Huffman.anInt638 = 2;
                  UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                  Class70.anInt1053 = Class163_Sub1.anInt2993;
                  js5Worker.anInt2958 = 0;
                  Class3_Sub13_Sub1.outputStream.putPacket(4);
                  Class3_Sub13_Sub1.outputStream.putLEShort(id);
               }
            }

            if(41 == var4 && Class3_Sub13_Sub7.aClass11_3087 == null) {
               Class2.method78(index, false, interfaceSet);
               Class3_Sub13_Sub7.aClass11_3087 = AbstractSprite.method638(interfaceSet, index);
               Class20.refreshInterface(Class3_Sub13_Sub7.aClass11_3087);
            }

            if(49 == var4) {
               Class163_Sub2_Sub1.method2224((byte)39, var6, interfaceSet, index);
               Class3_Sub13_Sub1.outputStream.putPacket(120);
               Class3_Sub13_Sub1.outputStream.putShort(Class82.anInt1152 + interfaceSet);
               Class3_Sub13_Sub1.outputStream.putShortA(Integer.MAX_VALUE & (int)(var6 >>> 32));
               Class3_Sub13_Sub1.outputStream.putShortA(index - -Class131.anInt1716);
            }

            if(var4 == 23) {
                Class3_Sub13_Sub1.outputStream.putPacket(88);
                Class3_Sub13_Sub1.outputStream.putLEInt(interfaceSet);
                Class3_Sub13_Sub1.outputStream.putLEShort(id);
                Class3_Sub13_Sub1.outputStream.putLEShortA(index);
                Class3_Sub9.anInt2330 = 0;
                Class151.aClass11_1933 = Class7.getInterface(interfaceSet);
                KeyboardHandler.anInt1918 = index;
            }

            if(-15 == ~var4 && Class163_Sub2_Sub1.method2224((byte)39, var6, interfaceSet, index)) {
               Class3_Sub13_Sub1.outputStream.putPacket(103);
               Class3_Sub13_Sub1.outputStream.putShortA(Class131.anInt1716 + index);
               Class3_Sub13_Sub1.outputStream.putShort(Class110.anInt1473);
               Class3_Sub13_Sub1.outputStream.putLEShortA(interfaceSet + Class82.anInt1152);
               Class3_Sub13_Sub1.outputStream.putInt2(Class3_Sub28_Sub18.anInt3764);
               Class3_Sub13_Sub1.outputStream.putShortA(Class164.anInt2050);
               Class3_Sub13_Sub1.outputStream.putLEShort((int)(var6 >>> 32) & Integer.MAX_VALUE);
            }

            if(var4 == 37) {
               var8 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[id];
               if(var8 != null) {
                  Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, var8.anIntArray2767[0], 1, 0, 2, var8.anIntArray2755[0], TextureLoader.selfPlayer.anIntArray2767[0]);
                  js5Worker.anInt2958 = 0;
                  Huffman.anInt638 = 2;
                  UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                  Class70.anInt1053 = Class163_Sub1.anInt2993;
                  Class3_Sub13_Sub1.outputStream.putPacket(114);
                  Class3_Sub13_Sub1.outputStream.putLEShortA(id);
               }
            }

            if(var4 == 9 || 1003 == var4) {
               OutputStream_Sub1.method66(Class163_Sub2_Sub1.aClass94Array4016[var1], index, id, interfaceSet);
            }

            if(-6 == ~var4) {
            	Class3_Sub13_Sub1.outputStream.putPacket(215);
                Class3_Sub13_Sub1.outputStream.putLEShort(index);
                Class3_Sub13_Sub1.outputStream.putLEInt(interfaceSet);
                Class3_Sub13_Sub1.outputStream.putLEShort(id);
                Class3_Sub9.anInt2330 = 0;
                Class151.aClass11_1933 = Class7.getInterface(interfaceSet);
                KeyboardHandler.anInt1918 = index;
            }

            if(-22 == ~var4) {
            	var14 = Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 0, false, 0, var0 + -2595, index, 0, 0, 2, interfaceSet, TextureLoader.selfPlayer.anIntArray2767[0]);
            	if(!var14) {
            		Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, var0 + -2595, index, 1, 0, 2, interfaceSet, TextureLoader.selfPlayer.anIntArray2767[0]);
            	}

               Huffman.anInt638 = 2;
               Class70.anInt1053 = Class163_Sub1.anInt2993;
               js5Worker.anInt2958 = 0;
               UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
               Class3_Sub13_Sub1.outputStream.putPacket(228);
               Class3_Sub13_Sub1.outputStream.putShort(id);
               Class3_Sub13_Sub1.outputStream.putLEShort(Class131.anInt1716 + index);
               Class3_Sub13_Sub1.outputStream.putLEShortA(Class82.anInt1152 + interfaceSet);
            }

            if(var4 == 4) {//option 2
               var11 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[id];
               if(var11 != null) {
                  Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, var11.anIntArray2767[0], 1, 0, 2, var11.anIntArray2755[0], TextureLoader.selfPlayer.anIntArray2767[0]);
                  Huffman.anInt638 = 2;
                  js5Worker.anInt2958 = 0;
                  UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                  Class70.anInt1053 = Class163_Sub1.anInt2993;
                  Class3_Sub13_Sub1.outputStream.putPacket(19);
                  Class3_Sub13_Sub1.outputStream.putLEShortA(id);
               }
            }

            if(32 == var4) {
               var13 = AbstractSprite.method638(interfaceSet, index);
               if(null != var13) {
                  Class25.method958((byte)-126);
                  ClickMaskNode var16 = jInterface.getInterfaceClickMask(var13);
                  Class145.method2074(interfaceSet, index, var16.method101(), var16.anInt2202, var13.anInt266, -120, var13.anInt238);
                  Class164_Sub1.anInt3012 = 0;
                  Class3_Sub28_Sub9.aClass94_3621 = Class53.method1174(var13);
                  if(Class3_Sub28_Sub9.aClass94_3621 == null) {
                     Class3_Sub28_Sub9.aClass94_3621 = KeyboardHandler.aClass94_1915;
                  }

                  if(var13.scriptedInterface) {
                     Class40.aClass94_676 = client.method903(new jString[]{var13.aClass94_277, Class3_Sub26.aClass94_2562});
                  } else {
                     Class40.aClass94_676 = client.method903(new jString[]{Class19.aClass94_431, var13.spellName, Class3_Sub26.aClass94_2562});
                  }
               }

            } else {
               if(29 == var4) {
                  var8 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[id];
                  if(null != var8) {
                     Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, var8.anIntArray2767[0], 1, 0, 2, var8.anIntArray2755[0], TextureLoader.selfPlayer.anIntArray2767[0]);
                     UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                     js5Worker.anInt2958 = 0;
                     Huffman.anInt638 = 2;
                     Class70.anInt1053 = Class163_Sub1.anInt2993;
                     Class3_Sub13_Sub1.outputStream.putPacket(183);
                     Class3_Sub13_Sub1.outputStream.putLEShortA(id);
                  }
               }

               if(var4 == 35) {
                  Class3_Sub13_Sub1.outputStream.putPacket(161);
                  Class3_Sub13_Sub1.outputStream.putLEInt(interfaceSet, (byte)-119);
                  Class3_Sub13_Sub1.outputStream.putLEShortA(id);
                  Class3_Sub13_Sub1.outputStream.putLEShortA(index);
                  Class3_Sub9.anInt2330 = 0;
                  Class151.aClass11_1933 = Class7.getInterface(interfaceSet);
                  KeyboardHandler.anInt1918 = index;
               }

               if(15 == var4) {
                  var8 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[id];
                  if(var8 != null) {
                     Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, var8.anIntArray2767[0], 1, 0, 2, var8.anIntArray2755[0], TextureLoader.selfPlayer.anIntArray2767[0]);
                     js5Worker.anInt2958 = 0;
                     Huffman.anInt638 = 2;
                     Class70.anInt1053 = Class163_Sub1.anInt2993;
                     UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                     Class3_Sub13_Sub1.outputStream.putPacket(123);
                     Class3_Sub13_Sub1.outputStream.putLEShort(jInterface.anInt278);
                     Class3_Sub13_Sub1.outputStream.putLEShortA(id);
                     Class3_Sub13_Sub1.outputStream.putLEInt(SubScript.anInt872, (byte)-124);
                  }
               }

               if(34 == var4) {
            	   var14 = Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 0, false, 0, var0 ^ 2599, index, 0, 0, 2, interfaceSet, TextureLoader.selfPlayer.anIntArray2767[0]);
            	   if(!var14) {
            		   Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, index, 1, 0, 2, interfaceSet, TextureLoader.selfPlayer.anIntArray2767[0]);
            	   }

                  Class70.anInt1053 = Class163_Sub1.anInt2993;
                  Huffman.anInt638 = 2;
                  UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                  js5Worker.anInt2958 = 0;
                  Class3_Sub13_Sub1.outputStream.putPacket(109);
                  Class3_Sub13_Sub1.outputStream.putLEShort(interfaceSet - -Class82.anInt1152);
                  Class3_Sub13_Sub1.outputStream.putShort(index + Class131.anInt1716);
                  Class3_Sub13_Sub1.outputStream.putLEShortA(id);
               }

               if(var4 == 25) {
                   Class3_Sub13_Sub1.outputStream.putPacket(177);
                   Class3_Sub13_Sub1.outputStream.putShort(id);
                   Class3_Sub13_Sub1.outputStream.putInt1(interfaceSet);
                   Class3_Sub13_Sub1.outputStream.putShort(index);
                   System.out.println("[Packet 177] ID: " + id + " Interface set: " + interfaceSet + " Index: " + index);
                   Class3_Sub9.anInt2330 = 0;
                   Class151.aClass11_1933 = Class7.getInterface(interfaceSet);
                   KeyboardHandler.anInt1918 = index;
               }

               if(~var4 == -3) {//TODO here
                  var11 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[id];
                  if(var11 != null) {
                     Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, var0 + -2595, var11.anIntArray2767[0], 1, 0, 2, var11.anIntArray2755[0], TextureLoader.selfPlayer.anIntArray2767[0]);
                     UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                     Huffman.anInt638 = 2;
                     Class70.anInt1053 = Class163_Sub1.anInt2993;
                     js5Worker.anInt2958 = 0;
                     Class3_Sub13_Sub1.outputStream.putPacket(218);
                     Class3_Sub13_Sub1.outputStream.putLEShort(id);
                  }
               }

               int var12;
               if(-52 == ~var4) {
                  Class3_Sub13_Sub1.outputStream.putPacket(153);
                  Class3_Sub13_Sub1.outputStream.putInt(interfaceSet);
                  var13 = Class7.getInterface(interfaceSet);
                  if(var13.cs1opcodes != null && -6 == ~var13.cs1opcodes[0][0]) {
                     var12 = var13.cs1opcodes[0][1];
                     if(Class163_Sub1.variousSettings[var12] != var13.requiredValues[0]) {
                        Class163_Sub1.variousSettings[var12] = var13.requiredValues[0];
                        Class46.method1087(98, var12);
                     }
                  }
               }

               if(-27 == ~var4) {
                  var11 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[id];
                  if(var11 != null) {
                     Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, var11.anIntArray2767[0], 1, 0, 2, var11.anIntArray2755[0], TextureLoader.selfPlayer.anIntArray2767[0]);
                     Huffman.anInt638 = 2;
                     js5Worker.anInt2958 = 0;
                     UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                     Class70.anInt1053 = Class163_Sub1.anInt2993;
                     Class3_Sub13_Sub1.outputStream.putPacket(187);
                     Class3_Sub13_Sub1.outputStream.putInt(Class3_Sub28_Sub18.anInt3764);
                     Class3_Sub13_Sub1.outputStream.putShortA(id);
                     Class3_Sub13_Sub1.outputStream.putShort(Class164.anInt2050);//id
                     Class3_Sub13_Sub1.outputStream.putShort(Class110.anInt1473);//slot
                  }
               }

               if(59 == var4) {
                  Class3_Sub13_Sub1.outputStream.putPacket(153);
                  Class3_Sub13_Sub1.outputStream.putInt(interfaceSet);
                  var13 = Class7.getInterface(interfaceSet);
                  if(var13.cs1opcodes != null && -6 == ~var13.cs1opcodes[0][0]) {
                     var12 = var13.cs1opcodes[0][1];
                     Class163_Sub1.variousSettings[var12] = -Class163_Sub1.variousSettings[var12] + 1;
                     Class46.method1087(68, var12);
                  }
               }

               if(~var4 == -34) {
                  var14 = Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 0, false, 0, 2, index, 0, 0, 2, interfaceSet, TextureLoader.selfPlayer.anIntArray2767[0]);
                  if(!var14) {
                     Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, var0 + -2595, index, 1, 0, 2, interfaceSet, TextureLoader.selfPlayer.anIntArray2767[0]);
                  }

                  Class70.anInt1053 = Class163_Sub1.anInt2993;
                  js5Worker.anInt2958 = 0;
                  UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                  Huffman.anInt638 = 2;
                  Class3_Sub13_Sub1.outputStream.putPacket(101);
                  Class3_Sub13_Sub1.outputStream.putLEShortA(index - -Class131.anInt1716);
                  Class3_Sub13_Sub1.outputStream.putLEShort(Class110.anInt1473);
                  Class3_Sub13_Sub1.outputStream.putLEShort(Class164.anInt2050);
                  Class3_Sub13_Sub1.outputStream.putLEShort(id);
                  Class3_Sub13_Sub1.outputStream.putLEShortA(Class82.anInt1152 + interfaceSet);
                  Class3_Sub13_Sub1.outputStream.putInt2(Class3_Sub28_Sub18.anInt3764);
               }

               if(-1005 == ~var4) {
                  js5Worker.anInt2958 = 0;
                  Class70.anInt1053 = Class163_Sub1.anInt2993;
                  Huffman.anInt638 = 2;
                  UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                  Class3_Sub13_Sub1.outputStream.putPacket(94);
                  Class3_Sub13_Sub1.outputStream.putLEShortA(id);
               }

               if(11 == var4) {
                  if(-1 != ~id) {
                     if(1 == id) {
                        Class3_Sub13_Sub1.outputStream.putPacket(131);
                        Class3_Sub13_Sub1.outputStream.putInt2(SubScript.anInt872);
                        Class3_Sub13_Sub1.outputStream.putShortA(Class131.anInt1716 + index);
                        Class3_Sub13_Sub1.outputStream.putLEShortA(jInterface.anInt278);
                        Class3_Sub13_Sub1.outputStream.putShortA(interfaceSet + Class82.anInt1152);
                     }
                  } else {
                     InterfaceListener.anInt2440 = 1;
                     Class3_Sub28_Sub10.method589(Class26.plane, index, interfaceSet);
                  }
               }

               if(8 == var4) {
                  var13 = Class7.getInterface(interfaceSet);
                  boolean var15 = true;
                  if(0 < var13.clientCode) {
                     var15 = Class3_Sub28_Sub19.method715(205, var13);
                  }

                  if(var15) {
                     Class3_Sub13_Sub1.outputStream.putPacket(153);
                     Class3_Sub13_Sub1.outputStream.putInt(interfaceSet);
                  }
               }

               if(~var4 == -2) {
                  var8 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[id];
                  if(var8 != null) {
                     Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, var8.anIntArray2767[0], 1, 0, 2, var8.anIntArray2755[0], TextureLoader.selfPlayer.anIntArray2767[0]);
                     js5Worker.anInt2958 = 0;
                     UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                     Huffman.anInt638 = 2;
                     Class70.anInt1053 = Class163_Sub1.anInt2993;
                     Class3_Sub13_Sub1.outputStream.putPacket(248);
                     Class3_Sub13_Sub1.outputStream.putLEShortA(id);
                     Class3_Sub13_Sub1.outputStream.putShort(Class164.anInt2050);
                     Class3_Sub13_Sub1.outputStream.putShort(Class110.anInt1473);
                     Class3_Sub13_Sub1.outputStream.putInt2(Class3_Sub28_Sub18.anInt3764);
                  }
               }

               if(var4 == 7) {
                  Class3_Sub13_Sub1.outputStream.putPacket(86);
                  Class3_Sub13_Sub1.outputStream.putLEShort(index);
                  Class3_Sub13_Sub1.outputStream.putShort(id);
                  Class3_Sub13_Sub1.outputStream.putInt2(interfaceSet);
                  Class3_Sub9.anInt2330 = 0;
                  Class151.aClass11_1933 = Class7.getInterface(interfaceSet);
                  KeyboardHandler.anInt1918 = index;
               }

               if(~var4 == -25) {
                     var14 = Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 0, false, 0, 2, index, 0, 0, 2, interfaceSet, TextureLoader.selfPlayer.anIntArray2767[0]);
                     if(!var14) {
                        Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, index, 1, 0, 2, interfaceSet, TextureLoader.selfPlayer.anIntArray2767[0]);
                     }

                  Huffman.anInt638 = 2;
                  UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                  Class70.anInt1053 = Class163_Sub1.anInt2993;
                  js5Worker.anInt2958 = 0;
                  Class3_Sub13_Sub1.outputStream.putPacket(48);
                  Class3_Sub13_Sub1.outputStream.putShortA(index - -Class131.anInt1716);
                  Class3_Sub13_Sub1.outputStream.putLEShortA(id);
                  Class3_Sub13_Sub1.outputStream.putLEShort(Class82.anInt1152 + interfaceSet);
               }

               if(var4 == 38 && Class163_Sub2_Sub1.method2224((byte)39, var6, interfaceSet, index)) {
                  Class3_Sub13_Sub1.outputStream.putPacket(233);
                  Class3_Sub13_Sub1.outputStream.putLEShortA(interfaceSet + Class82.anInt1152);
                  Class3_Sub13_Sub1.outputStream.putShortA(Class131.anInt1716 + index);
                  Class3_Sub13_Sub1.outputStream.putLEShortA(jInterface.anInt278);
                  Class3_Sub13_Sub1.outputStream.putInt1(SubScript.anInt872);
                  Class3_Sub13_Sub1.outputStream.putShortA((int)(var6 >>> 32) & Integer.MAX_VALUE);
               }
               if(var4 == 13) {
                  Class3_Sub13_Sub1.outputStream.putPacket(220);
                  Class3_Sub13_Sub1.outputStream.putInt(interfaceSet);
                  Class3_Sub13_Sub1.outputStream.putShortA(id);
                  Class3_Sub13_Sub1.outputStream.putLEShort(index);
                  Class3_Sub9.anInt2330 = 0;
                  Class151.aClass11_1933 = Class7.getInterface(interfaceSet);
                  KeyboardHandler.anInt1918 = index;
               }

               if(57 == var4) {
                  var8 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[id];
                  if(null != var8) {
                     Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, var8.anIntArray2767[0], 1, 0, 2, var8.anIntArray2755[0], TextureLoader.selfPlayer.anIntArray2767[0]);
                     Huffman.anInt638 = 2;
                     UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                     Class70.anInt1053 = Class163_Sub1.anInt2993;
                     js5Worker.anInt2958 = 0;
                     Class3_Sub13_Sub1.outputStream.putPacket(175);
                     Class3_Sub13_Sub1.outputStream.putShortA(id);
                  }
               }

               if(var4 != 22) {
                  if(-51 == ~var4) {
                     Class163_Sub2_Sub1.method2224((byte)39, var6, interfaceSet, index);
                     Class3_Sub13_Sub1.outputStream.putPacket(119);
                     Class3_Sub13_Sub1.outputStream.putShort(Class131.anInt1716 + index);
                     Class3_Sub13_Sub1.outputStream.putLEShortA((int)(var6 >>> 32) & Integer.MAX_VALUE);
                     Class3_Sub13_Sub1.outputStream.putLEShortA(interfaceSet + Class82.anInt1152);
                  }

                  if(var4 == 48) {
                      Class3_Sub13_Sub1.outputStream.putPacket(159);
                      Class3_Sub13_Sub1.outputStream.putLEInt(interfaceSet);
                      Class3_Sub13_Sub1.outputStream.putLEShort(index);
                      Class3_Sub13_Sub1.outputStream.putLEShort(id);
                      Class3_Sub9.anInt2330 = 0;
                      Class151.aClass11_1933 = Class7.getInterface(interfaceSet);
                      KeyboardHandler.anInt1918 = index;
                  }

                  if(~var4 == -31) {
                     var8 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[id];
                     if(null != var8) {
                        Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, var8.anIntArray2767[0], 1, 0, 2, var8.anIntArray2755[0], TextureLoader.selfPlayer.anIntArray2767[0]);
                        js5Worker.anInt2958 = 0;
                        Class70.anInt1053 = Class163_Sub1.anInt2993;
                        UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                        Huffman.anInt638 = 2;
                        Class3_Sub13_Sub1.outputStream.putPacket(84);
                        Class3_Sub13_Sub1.outputStream.putShort(id);
                     }
                  }

                  if(var4 == 43) {
                     Class3_Sub13_Sub1.outputStream.putPacket(153);
                     Class3_Sub13_Sub1.outputStream.putLEInt(interfaceSet, (byte)-124);
                     Class3_Sub13_Sub1.outputStream.putLEShort(index);
                     Class3_Sub13_Sub1.outputStream.putLEShort(id);
                     Class3_Sub9.anInt2330 = 0;
                     Class151.aClass11_1933 = Class7.getInterface(interfaceSet);
                     KeyboardHandler.anInt1918 = index;
                  }

                  if(-40 == ~var4) {
                     var14 = Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 0, false, 0, 2, index, 0, 0, 2, interfaceSet, TextureLoader.selfPlayer.anIntArray2767[0]);
                     if(!var14) {
                        Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, index, 1, 0, 2, interfaceSet, TextureLoader.selfPlayer.anIntArray2767[0]);
                     }

                     UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                     Class70.anInt1053 = Class163_Sub1.anInt2993;
                     Huffman.anInt638 = 2;
                     js5Worker.anInt2958 = 0;
                     Class3_Sub13_Sub1.outputStream.putPacket(73);
                     Class3_Sub13_Sub1.outputStream.putInt1(SubScript.anInt872);
                     Class3_Sub13_Sub1.outputStream.putShort(Class82.anInt1152 + interfaceSet);
                     Class3_Sub13_Sub1.outputStream.putLEShortA(id);
                     Class3_Sub13_Sub1.outputStream.putLEShortA(index + Class131.anInt1716);
                     Class3_Sub13_Sub1.outputStream.putLEShort(jInterface.anInt278);
                  }

                  if(var0 == 2597) {
                     if(~var4 == -13) {
                        Class3_Sub13_Sub1.outputStream.putPacket(82);
                        Class3_Sub13_Sub1.outputStream.putShort(jInterface.anInt278);
                        Class3_Sub13_Sub1.outputStream.putInt1(interfaceSet);
                        Class3_Sub13_Sub1.outputStream.putInt(SubScript.anInt872);
                        Class3_Sub13_Sub1.outputStream.putLEShortA(index);
                     }

                     if(var4 == 36) {
                        if(~id != -1) {
                           if(2 <= Class3_Sub13_Sub26.anInt3320 && ObjectDefinition.aBooleanArray1490[82] && ObjectDefinition.aBooleanArray1490[81]) {
                              Class30.method979(index + Class131.anInt1716, Class82.anInt1152 - -interfaceSet, Class26.plane);
                           } else {
                              Class3_Sub13_Sub1.outputStream.putPacket(179);
                              Class3_Sub13_Sub1.outputStream.putShort(interfaceSet + Class82.anInt1152);
                              Class3_Sub13_Sub1.outputStream.putShort(index + Class131.anInt1716);
                           }
                        } else {
                           ObjectDefinition.anInt1521 = 1;
                           Class3_Sub28_Sub10.method589(Class26.plane, index, interfaceSet);
                        }
                     }

                     if(6 == var4) {
                        var8 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[id];
                        if(var8 != null) {
                           Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, var8.anIntArray2767[0], 1, 0, 2, var8.anIntArray2755[0], TextureLoader.selfPlayer.anIntArray2767[0]);
                           UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                           js5Worker.anInt2958 = 0;
                           Huffman.anInt638 = 2;
                           Class70.anInt1053 = Class163_Sub1.anInt2993;
                           Class3_Sub13_Sub1.outputStream.putPacket(106);
                           Class3_Sub13_Sub1.outputStream.putShort(id);
                        }
                     }

                     if(var4 == 20) {
                           var14 = Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 0, false, 0, 2, index, 0, 0, 2, interfaceSet, TextureLoader.selfPlayer.anIntArray2767[0]);
                           if(!var14) {
                              Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, index, 1, 0, 2, interfaceSet, TextureLoader.selfPlayer.anIntArray2767[0]);
                           }

                        UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                        js5Worker.anInt2958 = 0;
                        Class70.anInt1053 = Class163_Sub1.anInt2993;
                        Huffman.anInt638 = 2;
                        Class3_Sub13_Sub1.outputStream.putPacket(33);
                        Class3_Sub13_Sub1.outputStream.putShort(id);
                        Class3_Sub13_Sub1.outputStream.putShort(Class131.anInt1716 + index);
                        Class3_Sub13_Sub1.outputStream.putLEShort(Class82.anInt1152 + interfaceSet);
                     }

                     if(var4 == 16) {//npc attack
                        var11 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[id];
                        if(null != var11) {
                           Class3_Sub28_Sub9.method582(TextureLoader.selfPlayer.anIntArray2755[0], 0, 1, false, 0, 2, var11.anIntArray2767[0], 1, 0, 2, var11.anIntArray2755[0], TextureLoader.selfPlayer.anIntArray2767[0]);
                           Class70.anInt1053 = Class163_Sub1.anInt2993;
                           js5Worker.anInt2958 = 0;
                           UpdateServerNode.anInt4062 = Class38_Sub1.anInt2614;
                           Huffman.anInt638 = 2;
                           Class3_Sub13_Sub1.outputStream.putPacket(129);
                           Class3_Sub13_Sub1.outputStream.putLEShort(id);
                        }
                     }

                     if(~Class164_Sub1.anInt3012 != -1) {
                        Class164_Sub1.anInt3012 = 0;
                        Class20.refreshInterface(Class7.getInterface(Class3_Sub28_Sub18.anInt3764));
                     }

                     if(SceneGraphNode.aBoolean1837) {
                        Class25.method958((byte)-36);
                     }

                     if(Class151.aClass11_1933 != null && -1 == ~Class3_Sub9.anInt2330) {
                        Class20.refreshInterface(Class151.aClass11_1933);
                     }

                  }
               } else {
                  Class25.method958((byte)-86);
                  var13 = Class7.getInterface(interfaceSet);
                  Class3_Sub28_Sub18.anInt3764 = interfaceSet;
                  Class110.anInt1473 = index;
                  Class164_Sub1.anInt3012 = 1;
                  Class164.anInt2050 = id;
                  Class20.refreshInterface(var13);
                  client.aClass94_378 = client.method903(new jString[]{Class3_Sub13_Sub2.aClass94_3042, ItemDefinition.method1023(id).aClass94_770, Class3_Sub26.aClass94_2562});
                  if(client.aClass94_378 == null) {
                     client.aClass94_378 = Vertex.aClass94_829;
                  }

               }
            }
         }
      } catch (RuntimeException var10) {
         throw Class44.method1067(var10, "i.E(" + var0 + ',' + var1 + ')');
      }
   }

   final void initBitAccess() {
	   this.bitOffset = this.pos * 8;
   }

   public static void method808(int var0) {
      try {
         aClass94_3807 = null;
         if(var0 != 1) {
            anIntArray3804 = (int[])null;
         }

         anIntArray3805 = null;
         anIntArray3804 = null;
         aClass94Array3802 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "i.V(" + var0 + ')');
      }
   }

   PacketBuffer(int var1) {
      super(var1);
   }

   static final int method809(int var0, int var1, int var2, int var3) {
         if(Class3_Sub13_Sub32.aBoolean3387) {
            var0 = 1000000;
            Class3_Sub13_Sub32.aBoolean3387 = false;
         }

         Class86 var5 = Class115.aClass86ArrayArray1581[var3][var1];
         float var7 = ((float)var2 * 0.1F + 0.7F) * var5.aFloat1187;
         float var8 = var5.aFloat1190;
         int var6 = var5.anInt1177;
         int var11 = var5.anInt1184;
         int var10 = var5.anInt1175;
         if(!Class38.aBoolean661) {
            var11 = 0;
         }

         float var9 = var5.aFloat1189;
         if(var6 != Class60.anInt932 || TransformList.aFloat2457 != var7 || Class3_Sub13_Sub2.aFloat3044 != var8 || var9 != jInterface.aFloat246 || HintIcon.anInt1345 != var10 || Class132.anInt1736 != var11) {
            TransformList.aFloat2457 = var7;
            Class3_Sub13_Sub36.aFloat3435 = Class3_Sub13_Sub36.aFloat3424;
            Class3_Sub13_Sub8.aFloat3105 = Class30.aFloat578;
            Class60.anInt932 = var6;
            Class155.anInt1971 = InvType.anInt3652;
            OverlayType.anInt1407 = FileSystem.anInt689;
            jInterface.aFloat246 = var9;
            Node.anInt72 = 0;
            Class3_Sub13_Sub23_Sub1.anInt4037 = js5.anInt1950;
            Class132.anInt1736 = var11;
            Class3_Sub13_Sub2.aFloat3044 = var8;
            HintIcon.anInt1345 = var10;
            Class110.aFloat1475 = Class12.aFloat319;
         }

         if(65536 > Node.anInt72) {
            Node.anInt72 += 250 * var0;
            if(-65537 >= ~Node.anInt72) {
               Node.anInt72 = 65536;
            }

            float var15 = (float)Node.anInt72 / 65536.0F;
            int var13 = Node.anInt72 >> 8;
            int var12 = -Node.anInt72 + 65536 >> 8;
            InvType.anInt3652 = (-16711936 & var13 * (HintIcon.anInt1345 & 16711935) + (16711935 & Class155.anInt1971) * var12) + (16711680 & var12 * (Class155.anInt1971 & '\uff00') + ('\uff00' & HintIcon.anInt1345) * var13) >> 8;
            float var14 = (float)(65536 - Node.anInt72) / 65536.0F;
            Class30.aFloat578 = var14 * Class3_Sub13_Sub8.aFloat3105 + var15 * TransformList.aFloat2457;
            Class3_Sub13_Sub36.aFloat3424 = Class3_Sub13_Sub36.aFloat3435 * var14 + var15 * Class3_Sub13_Sub2.aFloat3044;
            Class12.aFloat319 = var15 * jInterface.aFloat246 + var14 * Class110.aFloat1475;
            js5.anInt1950 = (16711680 & (Class60.anInt932 & '\uff00') * var13 + var12 * (Class3_Sub13_Sub23_Sub1.anInt4037 & '\uff00')) + ((16711935 & Class3_Sub13_Sub23_Sub1.anInt4037) * var12 - -((Class60.anInt932 & 16711935) * var13) & -16711936) >> 8;
            FileSystem.anInt689 = var13 * Class132.anInt1736 + var12 * OverlayType.anInt1407 >> 8;
         }

         AtmosphereManager.method1506(js5.anInt1950, Class30.aFloat578, Class3_Sub13_Sub36.aFloat3424, Class12.aFloat319);
         AtmosphereManager.method1508(InvType.anInt3652, FileSystem.anInt689);
         AtmosphereManager.method1509((float)Class46.anInt741, (float)Class3_Sub13_Sub22.anInt3274, (float)Class86.anInt1191);
         AtmosphereManager.method1504();
         return InvType.anInt3652;
   }

   final void getBytesIsaac(byte[] buffer, int off, int len) {
	   for(int var5 = 0; var5 < len; ++var5) {
		   buffer[off + var5] = (byte)(this.buf[this.pos++] - this.isaacCipher.nextInt());
	   }
   }

   final int getBits(int bit) {
         int var3 = this.bitOffset >> 3;
         int var4 = 8 + -(7 & this.bitOffset);
         int var5 = 0;
         this.bitOffset += bit;
         while(~var4 > ~bit) {
        	 var5 += (Class140_Sub2.anIntArray2709[var4] & this.buf[var3++]) << -var4 + bit;
        	 bit -= var4;
        	 var4 = 8;
         }
	
         if(~var4 == ~bit) {
        	 var5 += this.buf[var3] & Class140_Sub2.anIntArray2709[var4];
         } else {
        	 var5 += this.buf[var3] >> var4 - bit & Class140_Sub2.anIntArray2709[bit];
         }

         return var5;
   }

	static final void method813() {
		Class3_Sub28_Sub4.aClass93_3572.clearSoftReference();
		Class143.aClass93_1874.clearSoftReference();
		Class67.aClass93_1013.clearSoftReference();
	}

   final void initIsaac(int[] seed) {
	   this.isaacCipher = new IsaacCipher(seed);
   }

   final int getBitsLeft(int var1) {
	   return var1 * 8 - this.bitOffset;
   }

   final void putPacket(int var2) {
	   this.buf[this.pos++] = (byte)(var2 + this.isaacCipher.nextInt());
   }

   final int getPacket() {
	   return 255 & this.buf[this.pos++] - this.isaacCipher.nextInt();
   }

   final void endBitAccess() {
	   this.pos = (this.bitOffset + 7) / 8;
   }

   static final void method819(boolean var0) {
      try {
         OverridedInterface var1 = (OverridedInterface)Class3_Sub13_Sub17.aClass130_3208.getFirst();
         if(!var0) {
            for(; var1 != null; var1 = (OverridedInterface)Class3_Sub13_Sub17.aClass130_3208.getNext()) {
               int var2 = var1.uid;
               if(Canvas_Sub2.loadInterface(var2)) {
                  boolean var3 = true;
                  jInterface[] var4 = SceneGraphNode.interfaceCache[var2];

                  int var5;
                  for(var5 = 0; ~var4.length < ~var5; ++var5) {
                     if(var4[var5] != null) {
                        var3 = var4[var5].scriptedInterface;
                        break;
                     }
                  }

                  if(!var3) {
                     var5 = (int)var1.hash;
                     jInterface var6 = Class7.getInterface(var5);
                     if(null != var6) {
                        Class20.refreshInterface(var6);
                     }
                  }
               }
            }

         }
      } catch (RuntimeException var7) {
         throw Class44.method1067(var7, "i.A(" + var0 + ')');
      }
   }

}
