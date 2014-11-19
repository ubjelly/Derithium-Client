
final class Class23 {

   static int anInt453 = 0;
   static int canvasWid;
   //static int anInt455;
   static boolean[][] aBooleanArrayArray457;
   private static jString aClass94_458 = jString.createJString("Opened title screen");
   static jString aClass94_459 = aClass94_458;


   public static void method937(int var0) {
      try {
         aBooleanArrayArray457 = (boolean[][])null;
         aClass94_458 = null;
         if(var0 != 0) {
            aBooleanArrayArray457 = (boolean[][])((boolean[][])null);
         }

         aClass94_459 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "dl.A(" + var0 + ')');
      }
   }

	/*static final void method938(int var0, int var1, int var2, int var3, int var4, int var5, int var7, int var8) {
		int var9 = var2 - var7;
		int var10 = var3 - var8;
		int var11 = (-var1 + var0 << 16) / var9;
		int var12 = (-var5 + var4 << 16) / var10;
		Class136.method1814(var1, var3, var2, var12, var7, 0, 0, 127, var11, var8, var5);
	}*/

   static final Buffer getPreferencesBuffer() {
         Buffer var1 = new Buffer(34);
         var1.putByte(11);
         var1.putByte(Class3_Sub28_Sub10.brightness);
         var1.putByte(!EnumType.visibleLevels?0:1);
         var1.putByte(AbstractObjectCache.removeRoofs?1:0);
         var1.putByte(KeyboardHandler.showGroundDecorations?1:0);
         var1.putByte(Class25.lowMemoryTextures?1:0);
         var1.putByte(!jInterface.manyIdleAnimations?0:1);
         var1.putByte(!Class44_Sub1.highDetailLights?0:1);
         var1.putByte(Class3_Sub13_Sub22.aBoolean3275?1:0);
         var1.putByte(!Class140_Sub6.aBoolean2910?0:1);
         var1.putByte(Class80.anInt1137);
         var1.putByte(!DisplayModeInformation.aBoolean1441?0:1);
         var1.putByte(Class128.aBoolean1685?1:0);
         var1.putByte(Class38.aBoolean661?1:0);
         var1.putByte(Class3_Sub28_Sub9.anInt3622);
         var1.putByte(!Class3_Sub13_Sub15.isStereo?0:1);
         var1.putByte(InterfaceListener.soundEffectsVolume);
         var1.putByte(Class9.musicVolume);
         var1.putByte(Class14.areaSoundsVolume);
         var1.putShort(Class3_Sub13.fullscreenFrameWidth);
         var1.putShort(Class3_Sub13_Sub5.fullscreenFrameHeight);
         var1.putByte(ParticleEngine.method1757());
         var1.putInt(jString.anInt2148);
         var1.putByte(NodeSub.anInt2577);
         var1.putByte(jString.safeMode?1:0);
         var1.putByte(!Class15.aBoolean346?0:1);
         var1.putByte(Class3_Sub20.anInt2488);
         var1.putByte(Class65943149.aBoolean1080?1:0);
         var1.putByte(Class163_Sub3.aBoolean3004?1:0);
         return var1;
   }

   static final void method940(int var0, int var1) {
      try {
         if(var0 >= 101) {
            MouseHandler var2 = RawObjectCache.mouseHandler;
            synchronized(var2) {
               RawObjectCache.anInt4045 = var1;
            }
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "dl.D(" + var0 + ',' + var1 + ')');
      }
   }

}
