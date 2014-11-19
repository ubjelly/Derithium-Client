import javax.media.opengl.GL;

final class Class3_Sub22 extends Node {

   int anInt2501;
   int anInt2502;
   int anInt2503;
   Class166 aClass166_2504;
   static Class49 aClass49_2505 = new Class49();
   int anInt2506;
   Class3_Sub24_Sub1 aClass3_Sub24_Sub1_2507;
   int anInt2508;
   Class3_Sub12_Sub1 aClass3_Sub12_Sub1_2509;
   int anInt2510;
   int anInt2511;
   int anInt2512;
   int anInt2513;
   int anInt2514;
   int anInt2515;
   int anInt2516;
   int anInt2517;
   int anInt2519;
   int anInt2520;
   static byte[][] aByteArrayArray2521;
   int anInt2522;
   int anInt2523;
   Class3_Sub15 aClass3_Sub15_2527;
   static js5 aClass153_2528;
   static int loginScreenInterfaceid;


   static final void method398(int var0, int var1, int var2, int var3, int var4, byte[][][] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int var11, byte var12, int var13, int var14) {
      if(var0 < 0) {
         var0 = 0;
      } else if(var0 >= jSocket.anInt1234 * 128) {
         var0 = jSocket.anInt1234 * 128 - 1;
      }

      if(var2 < 0) {
         var2 = 0;
      } else if(var2 >= Class3_Sub13_Sub15.anInt3179 * 128) {
         var2 = Class3_Sub13_Sub15.anInt3179 * 128 - 1;
      }

      Class60.anInt936 = Rasterizer.sineTable[var3];
      LookupTable.anInt1037 = Rasterizer.cosineTable[var3];
      Class3_Sub13_Sub34.anInt3417 = Rasterizer.sineTable[var4];
      Class3_Sub13_Sub13.anInt3153 = Rasterizer.cosineTable[var4];
      MillisTimer.anInt2697 = var0;
      EnumType.anInt3657 = var1;
      Class3_Sub13_Sub30.anInt3363 = var2;
      Class97.anInt1375 = var0 / 128;
      Class3_Sub13_Sub27.anInt3340 = var2 / 128;
      Class163_Sub1_Sub1.anInt4006 = Class97.anInt1375 - Class3_Sub13_Sub39.anInt3466;
      if(Class163_Sub1_Sub1.anInt4006 < 0) {
         Class163_Sub1_Sub1.anInt4006 = 0;
      }

      AbstractObjectCache.anInt3603 = Class3_Sub13_Sub27.anInt3340 - Class3_Sub13_Sub39.anInt3466;
      if(AbstractObjectCache.anInt3603 < 0) {
         AbstractObjectCache.anInt3603 = 0;
      }

      Class2.anInt67 = Class97.anInt1375 + Class3_Sub13_Sub39.anInt3466;
      if(Class2.anInt67 > jSocket.anInt1234) {
         Class2.anInt67 = jSocket.anInt1234;
      }

      PlainTile.anInt1665 = Class3_Sub13_Sub27.anInt3340 + Class3_Sub13_Sub39.anInt3466;
      if(PlainTile.anInt1665 > Class3_Sub13_Sub15.anInt3179) {
         PlainTile.anInt1665 = Class3_Sub13_Sub15.anInt3179;
      }

      short var15;
      if(HDToolkit.openGLEnabled) {
         var15 = 3584;
      } else {
         var15 = 3500;
      }

      int var17;
      int var16;
      for(var16 = 0; var16 < Class3_Sub13_Sub39.anInt3466 + Class3_Sub13_Sub39.anInt3466 + 2; ++var16) {
         for(var17 = 0; var17 < Class3_Sub13_Sub39.anInt3466 + Class3_Sub13_Sub39.anInt3466 + 2; ++var17) {
            int var18 = (var16 - Class3_Sub13_Sub39.anInt3466 << 7) - (MillisTimer.anInt2697 & 127);
            int var19 = (var17 - Class3_Sub13_Sub39.anInt3466 << 7) - (Class3_Sub13_Sub30.anInt3363 & 127);
            int var20 = Class97.anInt1375 - Class3_Sub13_Sub39.anInt3466 + var16;
            int var21 = Class3_Sub13_Sub27.anInt3340 - Class3_Sub13_Sub39.anInt3466 + var17;
            if(var20 >= 0 && var21 >= 0 && var20 < jSocket.anInt1234 && var21 < Class3_Sub13_Sub15.anInt3179) {
               int var22;
               if(AbstractObjectCache.anIntArrayArrayArray3605 != null) {
                  var22 = AbstractObjectCache.anIntArrayArrayArray3605[0][var20][var21] - EnumType.anInt3657 + 128;
               } else {
                  var22 = Class58.anIntArrayArrayArray914[0][var20][var21] - EnumType.anInt3657 + 128;
               }

               int var23 = Class58.anIntArrayArrayArray914[3][var20][var21] - EnumType.anInt3657 - 1000;
               Class49.aBooleanArrayArray814[var16][var17] = CollisionMap.method1495(var18, var23, var22, var19, var15);
            } else {
               Class49.aBooleanArrayArray814[var16][var17] = false;
            }
         }
      }

      for(var16 = 0; var16 < Class3_Sub13_Sub39.anInt3466 + Class3_Sub13_Sub39.anInt3466 + 1; ++var16) {
         for(var17 = 0; var17 < Class3_Sub13_Sub39.anInt3466 + Class3_Sub13_Sub39.anInt3466 + 1; ++var17) {
            Class23.aBooleanArrayArray457[var16][var17] = Class49.aBooleanArrayArray814[var16][var17] || Class49.aBooleanArrayArray814[var16 + 1][var17] || Class49.aBooleanArrayArray814[var16][var17 + 1] || Class49.aBooleanArrayArray814[var16 + 1][var17 + 1];
         }
      }

      Class3_Sub13_Sub2.anIntArray3045 = var6;
      Class65943149.anIntArray1083 = var7;
      PlayerAppearance.anIntArray859 = var8;
      Class75_Sub4.anIntArray2663 = var9;
      InputStream_Sub1.anIntArray39 = var10;
      Class72.method1294();
      if(Class166.aClass3_Sub2ArrayArrayArray2065 != null) {
         Class167.method2264(true);
         AbstractMouseWheel.method2083(var0, var1, var2, (byte[][][])null, 0, (byte)0, var13, var14);
         if(HDToolkit.openGLEnabled) {
            Class3_Sub13_Sub17.aBoolean3207 = false;
            Class3_Sub28_Sub4.method551(0, 0);
            AtmosphereManager.method1512((float[])null);
            LightManager.method1265();
         }

         Class167.method2264(false);
      }

      AbstractMouseWheel.method2083(var0, var1, var2, var5, var11, var12, var13, var14);
   }

   public static void method399() {
         aByteArrayArray2521 = (byte[][])null;
         aClass153_2528 = null;
         aClass49_2505 = null;
   }

   static final void method400(long var0) {
	   if(0 != var0) {
		   Class3_Sub13_Sub1.outputStream.putPacket(104);
		   Class3_Sub13_Sub1.outputStream.putLong(var0);
	   }
   }

   final void method401() {
         this.aClass166_2504 = null;
         this.aClass3_Sub12_Sub1_2509 = null;
         this.aClass3_Sub24_Sub1_2507 = null;
         this.aClass3_Sub15_2527 = null;
   }

   static final void synchronizeKeyCodes() {
		if (Signlink.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			Class117.keycodes[187] = 27;
			Class117.keycodes[223] = 28;
			Class117.keycodes[221] = 43;
			Class117.keycodes[188] = 71;
			Class117.keycodes[222] = 59;
			Class117.keycodes[192] = 58;
			Class117.keycodes[191] = 73;
			Class117.keycodes[219] = 42;
			Class117.keycodes[190] = 72;
			Class117.keycodes[186] = 57;
			Class117.keycodes[220] = 74;
			Class117.keycodes[189] = 26;
		} else {
			Class117.keycodes[222] = 58;
			Class117.keycodes[192] = 28;
			Class117.keycodes[520] = 59;
			Class117.keycodes[45] = 26;
			Class117.keycodes[61] = 27;
			Class117.keycodes[91] = 42;
			Class117.keycodes[59] = 57;
			Class117.keycodes[93] = 43;
			Class117.keycodes[44] = 71;
			Class117.keycodes[92] = 74;
			Class117.keycodes[46] = 72;
			Class117.keycodes[47] = 73;
		}
   }

   static final void method403() {
      GL var0 = HDToolkit.gl;
      var0.glDisableClientState('\u8076');
      HDToolkit.toggleLighting(false);
      var0.glDisable(2929);
      var0.glPushAttrib(128);
      var0.glFogf(2915, 3072.0F);
      HDToolkit.disableDepthBuffer();

      for(int var1 = 0; var1 < client.aClass3_Sub11ArrayArray2199[0].length; ++var1) {
         Class3_Sub11 var2 = client.aClass3_Sub11ArrayArray2199[0][var1];
         if(var2.anInt2351 >= 0 && Rasterizer.anInterface2_838.method18(var2.anInt2351, 255) == 4) {
            var0.glColor4fv(Class114.method1705(var2.anInt2355, 0), 0);
            float var3 = 201.5F - (var2.aBoolean2364?1.0F:0.5F);
            var2.method149(Class75_Sub2.groundTiles, var3, true);
         }
      }

      var0.glEnableClientState('\u8076');
      HDToolkit.method1846();
      var0.glEnable(2929);
      var0.glPopAttrib();
      HDToolkit.enableDepthBuffer();
   }

   static final Class75_Sub4 method404(byte var0, Buffer var1) {
      try {
         return var0 > -55?(Class75_Sub4)null:new Class75_Sub4(var1.getShort(), var1.getShort(), var1.getShort(), var1.getShort(), var1.getMidInt(), var1.getMidInt(), var1.getUByte());
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "mf.C(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

}
