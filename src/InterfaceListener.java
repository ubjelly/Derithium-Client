
final class InterfaceListener extends Node {

   jInterface aClass11_2438;
   jString aClass94_2439;
   static int anInt2440 = 0;
   int anInt2441;
   static Class93 aClass93_2442 = new Class93(50);
   int anInt2443;
   int anInt2444;
   int anInt2445;
   boolean aBoolean2446;
   int anInt2447;
   Object[] objectData;
   jInterface aClass11_2449;
   static Class93 aClass93_2450 = new Class93(64);
   static int anInt2451 = -1;
   //static byte[][][] aByteArrayArrayArray2452;
   static int soundEffectsVolume = 127;


   static final void method375(int var0, js5 var1, js5 var2) {
      try {
         Class10.aClass153_152 = var1;
         Class127.aClass153_1680 = var2;
         Class25.anInt497 = Class127.aClass153_1680.getChildCount(var0);
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "jl.D(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   public static void method376(boolean var0) {
      try {
         aClass93_2442 = null;
         if(var0) {
            VarBit.list(97);
         }

         //aByteArrayArrayArray2452 = (byte[][][])null;
         aClass93_2450 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "jl.E(" + var0 + ')');
      }
   }

   static final void method377(int var0, int var1, int var2, int var3, int var4) {
      try {
         Class3_Sub13_Sub1.outputStream.pos = 0;
         Class3_Sub13_Sub1.outputStream.putByte(147);
         Class3_Sub13_Sub1.outputStream.putByte(var2);
         Class3_Sub13_Sub1.outputStream.putByte(var3);
         Class3_Sub13_Sub1.outputStream.putShort(var0);
         Class3_Sub13_Sub1.outputStream.putShort(var1);
         Class132.anInt1734 = 0;
         SpotAnimation.anInt548 = 0;
         Canvas_Sub1.anInt23 = var4;
         Hashtable.anInt1711 = -3;
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "jl.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   static final void method379(int var0) {
      try {
         int var2 = AbstractMouseWheel.anInt1904 * 128 - -64;
         int var1 = 128 * Canvas_Sub2.anInt30 + 64;
         int var3 = Class121.method1736(Class26.plane, 1, var1, var2) - Class3_Sub13_Sub34.anInt3414;
         if(100 <= Class3_Sub28_Sub10.anInt3631) {
            Npc.renderX = 64 + Canvas_Sub2.anInt30 * 128;
            Class77.renderY = 64 + AbstractMouseWheel.anInt1904 * 128;
            Class7.renderZ = Class121.method1736(Class26.plane, var0 + -1023, Npc.renderX, Class77.renderY) + -Class3_Sub13_Sub34.anInt3414;
         } else {
            if(Npc.renderX < var1) {
               Npc.renderX += Class163_Sub2_Sub1.anInt4021 + Class3_Sub28_Sub10.anInt3631 * (-Npc.renderX + var1) / 1000;
               if(~Npc.renderX < ~var1) {
                  Npc.renderX = var1;
               }
            }

            if(~Class7.renderZ > ~var3) {
               Class7.renderZ += (-Class7.renderZ + var3) * Class3_Sub28_Sub10.anInt3631 / 1000 + Class163_Sub2_Sub1.anInt4021;
               if(Class7.renderZ > var3) {
                  Class7.renderZ = var3;
               }
            }

            if(~Npc.renderX < ~var1) {
               Npc.renderX -= Class163_Sub2_Sub1.anInt4021 + (Npc.renderX + -var1) * Class3_Sub28_Sub10.anInt3631 / 1000;
               if(Npc.renderX < var1) {
                  Npc.renderX = var1;
               }
            }

            if(Class77.renderY < var2) {
               Class77.renderY += Class163_Sub2_Sub1.anInt4021 + Class3_Sub28_Sub10.anInt3631 * (var2 - Class77.renderY) / 1000;
               if(~var2 > ~Class77.renderY) {
                  Class77.renderY = var2;
               }
            }

            if(var3 < Class7.renderZ) {
               Class7.renderZ -= (Class7.renderZ - var3) * Class3_Sub28_Sub10.anInt3631 / 1000 + Class163_Sub2_Sub1.anInt4021;
               if(~var3 < ~Class7.renderZ) {
                  Class7.renderZ = var3;
               }
            }

            if(~Class77.renderY < ~var2) {
               Class77.renderY -= Class163_Sub2_Sub1.anInt4021 - -((-var2 + Class77.renderY) * Class3_Sub28_Sub10.anInt3631 / 1000);
               if(~var2 < ~Class77.renderY) {
                  Class77.renderY = var2;
               }
            }
         }

         var2 = Class157.anInt1996 * 128 - -64;
         var1 = MouseHandler.anInt1923 * 128 + 64;
         var3 = Class121.method1736(Class26.plane, 1, var1, var2) + -SpotAnimation.anInt529;
         int var5 = var3 + -Class7.renderZ;
         int var6 = -Class77.renderY + var2;
         int var4 = -Npc.renderX + var1;
         int var7 = (int)Math.sqrt((double)(var4 * var4 + var6 * var6));
         int var8 = (int)(325.949D * Math.atan2((double)var5, (double)var7)) & 2047;
         if(128 > var8) {
            var8 = 128;
         }

         if(~var8 < -384) {
            var8 = 383;
         }

         int var9 = (int)(-325.949D * Math.atan2((double)var4, (double)var6)) & 2047;
         if(~Class139.renderPitch > ~var8) {
            Class139.renderPitch += Class75.anInt1105 + Class163_Sub2_Sub1.anInt4014 * (-Class139.renderPitch + var8) / 1000;
            if(Class139.renderPitch > var8) {
               Class139.renderPitch = var8;
            }
         }

         if(Class139.renderPitch > var8) {
            Class139.renderPitch -= (Class139.renderPitch - var8) * Class163_Sub2_Sub1.anInt4014 / 1000 + Class75.anInt1105;
            if(~Class139.renderPitch > ~var8) {
               Class139.renderPitch = var8;
            }
         }

         int var10 = -Class3_Sub13_Sub25.renderYaw + var9;
         if(var10 > var0) {
            var10 -= 2048;
         }

         if(-1024 > var10) {
            var10 += 2048;
         }

         if(~var10 < -1) {
            Class3_Sub13_Sub25.renderYaw += var10 * Class163_Sub2_Sub1.anInt4014 / 1000 + Class75.anInt1105;
            Class3_Sub13_Sub25.renderYaw &= 2047;
         }

         if(-1 < ~var10) {
            Class3_Sub13_Sub25.renderYaw -= Class163_Sub2_Sub1.anInt4014 * -var10 / 1000 + Class75.anInt1105;
            Class3_Sub13_Sub25.renderYaw &= 2047;
         }

         int var11 = -Class3_Sub13_Sub25.renderYaw + var9;
         if(1024 < var11) {
            var11 -= 2048;
         }

         if(~var11 > 1023) {
            var11 += 2048;
         }

         if(var11 < 0 && -1 > ~var10 || var11 > 0 && ~var10 > -1) {
            Class3_Sub13_Sub25.renderYaw = var9;
         }

      } catch (RuntimeException var12) {
         throw Class44.method1067(var12, "jl.B(" + var0 + ')');
      }
   }

}
