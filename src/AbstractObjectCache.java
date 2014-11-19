import java.io.IOException;

abstract class AbstractObjectCache extends NodeSub {

   //static jString aClass94a_3601 = jString.createJString(")3runescape)3com)4l=");
   static int anInt3602;
   static int anInt3603;
   static boolean removeRoofs = true;
   static int[][][] anIntArrayArrayArray3605;
   static int anInt3606;
   static int[] anIntArray3607 = new int[]{0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1};
   static int anInt3608;


   static final LDSprite method562(js5 var0, int var1, int var2, byte var3) {
      try {
         return client.spriteExists(var0, var1, var2)?(var3 != 39?(LDSprite)null:Class3_Sub28_Sub9.method578(var3 ^ 84)):null;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "gf.O(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   public static void method563(int var0) {
      try {
         anIntArrayArrayArray3605 = (int[][][])null;
         //aClass94_3601 = null;
         anIntArray3607 = null;
         if(var0 != 3) {
            anInt3603 = -108;
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "gf.Q(" + var0 + ')');
      }
   }

   static final void method564(Signlink var0, int var1) {
      try {
         Class3_Sub28_Sub10.brightness = 3;
         Class25.method957(96, true);
         removeRoofs = true;
         Class3_Sub13_Sub15.isStereo = true;
         Class128.aBoolean1685 = true;
         Class3_Sub28_Sub9.anInt3622 = 0;
         Class3_Sub13_Sub5.fullscreenFrameHeight = 0;
         KeyboardHandler.showGroundDecorations = true;
         Class44_Sub1.highDetailLights = true;
         jInterface.manyIdleAnimations = true;
         Class14.areaSoundsVolume = 127;
         Class38.aBoolean661 = true;
         Class140_Sub6.aBoolean2910 = true;
         Class3_Sub13.fullscreenFrameWidth = 0;
         Class80.anInt1137 = 2;
         Class3_Sub13_Sub22.aBoolean3275 = true;
         DisplayModeInformation.aBoolean1441 = true;
         Class9.musicVolume = 255;
         Class25.lowMemoryTextures = true;
         GroundItem.antiAliasing = 0;
         FileOnDisk var2 = null;
         InterfaceListener.soundEffectsVolume = 127;
         if(Class3_Sub24_Sub3.maxMemory >= 96) {
            ParticleEngine.method1758(2);
         } else {
            ParticleEngine.method1758(0);
         }

         jString.anInt2148 = var1;
         Class3_Sub20.anInt2488 = 0;
         Class15.aBoolean346 = false;
         Class163_Sub3.aBoolean3004 = true;
         jString.safeMode = false;
         Class65943149.aBoolean1080 = false;
         NodeSub.anInt2577 = 0;

         try {
            SignlinkNode var3 = var0.getPreferences("runescape");

            while(0 == var3.status) {
               Class3_Sub13_Sub34.sleep(1L);
            }

            if(-2 == ~var3.status) {
               var2 = (FileOnDisk)var3.value;
               byte[] var4 = new byte[(int)var2.getLength()];

               int var6;
               for(int var5 = 0; ~var5 > ~var4.length; var5 += var6) {
                  var6 = var2.read(var4, var5, var4.length - var5);
                  if(var6 == -1) {
                     throw new IOException("EOF");
                  }
               }

               VarBit.method1390(new Buffer(var4), -1);
            }
         } catch (Exception var8) {
            ;
         }

         try {
            if(var2 != null) {
               var2.close();
            }
         } catch (Exception var7) {
            ;
         }

      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "gf.F(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   /*static final void method565(int var1, int var2) {
         Class82.anInt1150 = -Class3_Sub13_Sub21.anInt3256 + var1;

         int var3 = -((int)((float)Class3_Sub28_Sub3.aClass11_3551.anInt168 / Class44.aFloat727)) + Class82.anInt1150;
         int var4 = Class82.anInt1150 + (int)((float)Class3_Sub28_Sub3.aClass11_3551.anInt168 / Class44.aFloat727);
         if(var3 < 0) {
            Class82.anInt1150 = (int)((float)Class3_Sub28_Sub3.aClass11_3551.anInt168 / Class44.aFloat727);
         }

         Class3_Sub13_Sub30.anInt3362 = Class108.anInt1460 + -1 + Class2.anInt65 + -var2;
         int var6 = (int)((float)Class3_Sub28_Sub3.aClass11_3551.anInt193 / Class44.aFloat727) + Class3_Sub13_Sub30.anInt3362;
         int var5 = Class3_Sub13_Sub30.anInt3362 - (int)((float)Class3_Sub28_Sub3.aClass11_3551.anInt193 / Class44.aFloat727);
         if(~var4 < ~Class23.anInt455) {
            Class82.anInt1150 = Class23.anInt455 + -((int)((float)Class3_Sub28_Sub3.aClass11_3551.anInt168 / Class44.aFloat727));
         }

         if(-1 < ~var5) {
            Class3_Sub13_Sub30.anInt3362 = (int)((float)Class3_Sub28_Sub3.aClass11_3551.anInt193 / Class44.aFloat727);
         }

         if(~Class108.anInt1460 > ~var6) {
            Class3_Sub13_Sub30.anInt3362 = -((int)((float)Class3_Sub28_Sub3.aClass11_3551.anInt193 / Class44.aFloat727)) + Class108.anInt1460;
         }

   }*/

   static final void renameText(jString text, int uid) {
	   InterfaceChangeNode var3 = Class3_Sub24_Sub3.putInterfaceChange(3, uid);
	   var3.add();

	   var3.stringValue = text;
   }

   abstract Object get();

   abstract boolean isSoftReference();

}
