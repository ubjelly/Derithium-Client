import java.io.IOException;
import java.io.OutputStream;

final class OutputStream_Sub1 {

   static jString[] aClass94Array45;
   static short aShort46 = 256;
   static boolean aBoolean47 = false;
   static int anInt48 = 2;
   static int[] anIntArray49;
   static jString aClass94_50 = jString.createJString("<col=80ff00>");
   //static jString aClass94_51 = jString.createJString("; Expires=");


	static final short[] arrayCopy(short[] var1) {
		if (null != var1) {
			short[] var2 = new short[var1.length];
			ArrayUtils.arrayCopy(var1, 0, var2, 0, var1.length);
			return var2;
		} else {
			return null;
		}
	}

   static final void method66(jString var0, int var1, int var2, int var4) {
         jInterface var5 = AbstractSprite.method638(var4, var1);
         if(null != var5) {
            if(var5.anObjectArray314 != null) {
               InterfaceListener var6 = new InterfaceListener();
               var6.objectData = var5.anObjectArray314;
               var6.aClass11_2449 = var5;
               var6.aClass94_2439 = var0;
               var6.anInt2445 = var2;
               Light.method1065(var6);
            }

            boolean var8 = true;
            if(0 < var5.clientCode) {
               var8 = Class3_Sub28_Sub19.method715(205, var5);
            }

            if(var8) {
               if(jInterface.getInterfaceClickMask(var5).method92(var2 - 1)) {
                  if(1 == var2) {
                     Class3_Sub13_Sub1.outputStream.putPacket(113);
                     Class3_Sub13_Sub1.outputStream.putInt(var4);
                     Class3_Sub13_Sub1.outputStream.putShort(var1);
                  }

                     if(-3 == ~var2) {
                        Class3_Sub13_Sub1.outputStream.putPacket(37);
                        Class3_Sub13_Sub1.outputStream.putInt(var4);
                        Class3_Sub13_Sub1.outputStream.putShort(var1);
                     }

                     if(~var2 == -4) {
                        Class3_Sub13_Sub1.outputStream.putPacket(134);
                        Class3_Sub13_Sub1.outputStream.putInt(var4);
                        Class3_Sub13_Sub1.outputStream.putShort(var1);
                     }

                     if(var2 == 4) {
                        Class3_Sub13_Sub1.outputStream.putPacket(137);
                        Class3_Sub13_Sub1.outputStream.putInt(var4);
                        Class3_Sub13_Sub1.outputStream.putShort(var1);
                     }

                     if(~var2 == -6) {
                        Class3_Sub13_Sub1.outputStream.putPacket(140);
                        Class3_Sub13_Sub1.outputStream.putInt(var4);
                        Class3_Sub13_Sub1.outputStream.putShort(var1);
                     }

                     if(6 == var2) {
                        Class3_Sub13_Sub1.outputStream.putPacket(210);
                        Class3_Sub13_Sub1.outputStream.putInt(var4);
                        Class3_Sub13_Sub1.outputStream.putShort(var1);
                     }

                     if(-8 == ~var2) {
                        Class3_Sub13_Sub1.outputStream.putPacket(148);
                        Class3_Sub13_Sub1.outputStream.putInt(var4);
                        Class3_Sub13_Sub1.outputStream.putShort(var1);
                     }

                     if(-9 == ~var2) {
                        Class3_Sub13_Sub1.outputStream.putPacket(104);
                        Class3_Sub13_Sub1.outputStream.putInt(var4);
                        Class3_Sub13_Sub1.outputStream.putShort(var1);
                     }

                     if(-10 == ~var2) {
                        Class3_Sub13_Sub1.outputStream.putPacket(9);
                        Class3_Sub13_Sub1.outputStream.putInt(var4);
                        Class3_Sub13_Sub1.outputStream.putShort(var1);
                     }

                     if(~var2 == -11) {
                        Class3_Sub13_Sub1.outputStream.putPacket(28);
                        Class3_Sub13_Sub1.outputStream.putInt(var4);
                        Class3_Sub13_Sub1.outputStream.putShort(var1);
                     }

               }
            }
         }
   }

   public static void method67(boolean var0) {
      try {
         aClass94_50 = null;
         aClass94Array45 = null;
         if(!var0) {
            aBoolean47 = true;
         }

         anIntArray49 = null;
         //aClass94_51 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "vg.B(" + var0 + ')');
      }
   }

   static final void method68(int var0, int var1, Entity var2) {
      try {
         if(~Class44.loopCycle <= ~var2.anInt2800) {
            if(var2.anInt2790 >= Class44.loopCycle) {
               UnderlayType.method2270(var2, (byte)-56);
            } else {
               CursorType.method1180((byte)-22, var2);
            }
         } else {
            Class140_Sub2.method1950(var2, true);
         }

         if(-129 < ~var2.anInt2819 || var2.anInt2829 < 128 || var2.anInt2819 >= 13184 || var2.anInt2829 >= 13184) {
            var2.currentAnimationId = -1;
            var2.anInt2842 = -1;
            var2.anInt2800 = 0;
            var2.anInt2790 = 0;
            var2.anInt2819 = 128 * var2.anIntArray2767[0] - -(64 * var2.getSize());
            var2.anInt2829 = var2.anIntArray2755[0] * 128 + var2.getSize() * 64;
            var2.method1973(var1 + -2395);
         }

         if(var1 == 2279) {
            if(var2 == TextureLoader.selfPlayer && (var2.anInt2819 < 1536 || -1537 < ~var2.anInt2829 || -11777 >= ~var2.anInt2819 || var2.anInt2829 >= 11776)) {
               var2.anInt2842 = -1;
               var2.anInt2800 = 0;
               var2.anInt2790 = 0;
               var2.currentAnimationId = -1;
               var2.anInt2819 = var2.anIntArray2767[0] * 128 + var2.getSize() * 64;
               var2.anInt2829 = 128 * var2.anIntArray2755[0] + 64 * var2.getSize();
               var2.method1973(-98);
            }

            Class17.method904(65536, var2);
            client.method900(var2, -11973);
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "vg.C(" + var0 + ',' + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

}
