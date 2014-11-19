import java.io.IOException;

class Class163_Sub1 extends Class163 {

   static Class93 cursorCache = new Class93(2);
   static int[] variousSettings = new int[2500];
   static long[] aLongArray2986 = new long[32];
   static byte[][] spritePaletteIndicators;
   private static jString aClass94_2988 = jString.createJString("glow3:");
   static int anInt2989 = 0;
   static Deque tiles = new Deque();
   static jString aClass94_2991 = aClass94_2988;
   static jString aClass94_2992 = aClass94_2988;
   static int anInt2993 = 0;
   static int anInt2994;

   static final void ping(boolean force) {
	   Class58.method1194();
	   if(30 == Class143.gameState || Class143.gameState == 25) {
		   Class3_Sub13_Sub23_Sub1.pingTimer++;
		   if(Class3_Sub13_Sub23_Sub1.pingTimer >= 50 || force) {
			   Class3_Sub13_Sub23_Sub1.pingTimer = 0;
			   if(!Class3_Sub28_Sub18.errorPinging && Class3_Sub15.worldConnection != null) {
				   Class3_Sub13_Sub1.outputStream.putPacket(202);
				   try {
					   Class3_Sub15.worldConnection.write(Class3_Sub13_Sub1.outputStream.buf, 0, Class3_Sub13_Sub1.outputStream.pos);
					   Class3_Sub13_Sub1.outputStream.pos = 0;
				   } catch (IOException var3) {
					   Class3_Sub28_Sub18.errorPinging = true;
				   }
			   }	   
			   Class58.method1194();
		   }
	   }
   }

   static final void method2211(int var0) {
      try {
         if(var0 == -48) {
            if(null == Class67.aClass11_1017) {
               if(null == Class56.aClass11_886) {
                  int var1 = Class3_Sub28_Sub11.anInt3644;
                  int var3;
                  int var4;
                  if(!Class38_Sub1.aBoolean2615) {
                     if(~var1 == -2 && 0 < Class3_Sub13_Sub34.anInt3415) {
                        short var2 = Class3_Sub13_Sub7.aShortArray3095[-1 + Class3_Sub13_Sub34.anInt3415];
                        if(-26 == ~var2 || var2 == 23 || 48 == var2 || ~var2 == -8 || 13 == var2 || ~var2 == -48 || -6 == ~var2 || var2 == 43 || -36 == ~var2 || ~var2 == -59 || ~var2 == -23 || var2 == 1006) {
                           var3 = Class117.anIntArray1613[-1 + Class3_Sub13_Sub34.anInt3415];
                           var4 = Class27.anIntArray512[Class3_Sub13_Sub34.anInt3415 + -1];
                           jInterface var5 = Class7.getInterface(var4);
                           ClickMaskNode var6 = jInterface.getInterfaceClickMask(var5);
                           if(var6.method100((byte)-9) || var6.method93(572878952)) {
                              Class40.anInt677 = 0;
                              Class72.aBoolean1074 = false;
                              if(Class67.aClass11_1017 != null) {
                                 Class20.refreshInterface(Class67.aClass11_1017);
                              }

                              Class67.aClass11_1017 = Class7.getInterface(var4);
                              MillisTimer.anInt2693 = anInt2993;
                              InputStream_Sub1.anInt40 = Class38_Sub1.anInt2614;
                              PacketParser.anInt86 = var3;
                              Class20.refreshInterface(Class67.aClass11_1017);
                              return;
                           }
                        }
                     }

                     if(-2 == ~var1 && (-2 == ~Js5CacheWorker.anInt998 && 2 < Class3_Sub13_Sub34.anInt3415 || Class3_Sub13_Sub39.method353(Class3_Sub13_Sub34.anInt3415 + -1, 0))) {
                        var1 = 2;
                     }

                     if(~var1 == -3 && -1 > ~Class3_Sub13_Sub34.anInt3415 || -2 == ~EnumType.anInt3660) {
                        Class132.method1801((byte)-105);
                     }

                     if(1 == var1 && Class3_Sub13_Sub34.anInt3415 > 0 || -3 == ~EnumType.anInt3660) {
                        Class3_Sub13_Sub8.method203(100);
                     }
                  } else {
                     int var11;
                     if(-2 != ~var1) {
                        var3 = Hashtable.anInt1709;
                        var11 = PlainTile.anInt1676;
                        if(~var11 > ~(AbstractIndexedSprite.anInt1462 - 10) || ~var11 < ~(Class3_Sub28_Sub3.anInt3552 + (AbstractIndexedSprite.anInt1462 - -10)) || ~(-10 + Class3_Sub13_Sub33.anInt3395) < ~var3 || ~var3 < ~(Class3_Sub28_Sub1.anInt3537 + (Class3_Sub13_Sub33.anInt3395 - -10))) {
                           Class38_Sub1.aBoolean2615 = false;
                           Class75.method1340(AbstractIndexedSprite.anInt1462, Class3_Sub28_Sub3.anInt3552, Class3_Sub13_Sub33.anInt3395, Class3_Sub28_Sub1.anInt3537);
                        }
                     }

                     if(-2 == ~var1) {
                        var11 = AbstractIndexedSprite.anInt1462;
                        var3 = Class3_Sub13_Sub33.anInt3395;
                        var4 = Class3_Sub28_Sub3.anInt3552;
                        int var12 = anInt2993;
                        int var13 = Class38_Sub1.anInt2614;
                        int var7 = -1;

                        for(int var8 = 0; var8 < Class3_Sub13_Sub34.anInt3415; ++var8) {
                           int var9;
                           if(js5.aBoolean1951) {
                              var9 = 15 * (Class3_Sub13_Sub34.anInt3415 + -1 + -var8) + 35 + var3;
                           } else {
                              var9 = 15 * (-var8 + (Class3_Sub13_Sub34.anInt3415 - 1)) + var3 + 31;
                           }

                           if(~var12 < ~var11 && ~(var11 - -var4) < ~var12 && var9 + -13 < var13 && ~(3 + var9) < ~var13) {
                              var7 = var8;
                           }
                        }

                        if(~var7 != 0) {
                           PacketBuffer.method806(2597, var7);
                        }

                        Class38_Sub1.aBoolean2615 = false;
                        Class75.method1340(AbstractIndexedSprite.anInt1462, Class3_Sub28_Sub3.anInt3552, Class3_Sub13_Sub33.anInt3395, Class3_Sub28_Sub1.anInt3537);
                     }
                  }

               }
            }
         }
      } catch (RuntimeException var10) {
         throw Class44.method1067(var10, "ah.A(" + var0 + ')');
      }
   }

   public static void method2212(boolean var0) {
      try {
         variousSettings = null;
         aClass94_2988 = null;
         cursorCache = null;
         tiles = null;
         aLongArray2986 = null;
         if(var0) {
            method2211(68);
         }

         aClass94_2992 = null;
         spritePaletteIndicators = (byte[][])null;
         aClass94_2991 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ah.C(" + var0 + ')');
      }
   }

}
