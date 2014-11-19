
final class Class3_Sub13_Sub8 extends Class3_Sub13 {

   private boolean aBoolean3100 = true;
   static int anInt3101 = 0;
   static int anInt3102 = 0;
   static int renderYaw2;
   private boolean aBoolean3104 = true;
   static float aFloat3105;

   final void method157(int var1, Buffer var2, boolean var3) {
      try {
         if(!var3) {
            method207(18, false, -19, 102L);
         }

         if(~var1 == -1) {
            this.aBoolean3100 = -2 == ~var2.getUByte();
         } else if(-2 == ~var1) {
            this.aBoolean3104 = var2.getUByte() == 1;
         } else if(-3 == ~var1) {
            this.aBoolean2375 = ~var2.getUByte() == -2;
         }

      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "ej.A(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

   final int[][] method166(int var1, int var2) {
      try {
         if(var1 != -1) {
            method207(-98, true, 95, 79L);
         }

         int[][] var3 = this.aClass97_2376.method1594((byte)54, var2);
         if(this.aClass97_2376.aBoolean1379) {
            int[][] var4 = this.method162(!this.aBoolean3104?var2:-var2 + Class3_Sub20.anInt2487, 0, (byte)-105);
            int[] var5 = var4[0];
            int[] var7 = var4[2];
            int[] var6 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            int[] var8 = var3[0];
            int var11;
            if(this.aBoolean3100) {
               for(var11 = 0; Class113.anInt1559 > var11; ++var11) {
                  var8[var11] = var5[client.anInt396 + -var11];
                  var9[var11] = var6[-var11 + client.anInt396];
                  var10[var11] = var7[client.anInt396 - var11];
               }
            } else {
               for(var11 = 0; ~Class113.anInt1559 < ~var11; ++var11) {
                  var8[var11] = var5[var11];
                  var9[var11] = var6[var11];
                  var10[var11] = var7[var11];
               }
            }
         }

         return var3;
      } catch (RuntimeException var12) {
         throw Class44.method1067(var12, "ej.T(" + var1 + ',' + var2 + ')');
      }
   }

   static final void method203(int var0) {
      try {
         int var1 = 15 / ((-11 - var0) / 63);
         if(EnumType.anInt3660 == 2) {
            if(~NpcDefinition.anInt1297 == ~Class3_Sub13_Sub39.anInt3460 && Class38_Sub1.anInt2612 == UnderlayType.anInt2099) {
               EnumType.anInt3660 = 0;
               if(Class101.aBoolean1419 && ObjectDefinition.aBooleanArray1490[81] && ~Class3_Sub13_Sub34.anInt3415 < -3) {
                  PacketBuffer.method806(2597, Class3_Sub13_Sub34.anInt3415 + -2);
               } else {
                  PacketBuffer.method806(2597, Class3_Sub13_Sub34.anInt3415 + -1);
               }
            }
         } else if(NpcDefinition.anInt1297 == Class163_Sub1.anInt2993 && ~Class38_Sub1.anInt2612 == ~Class38_Sub1.anInt2614) {
            EnumType.anInt3660 = 0;
            if(Class101.aBoolean1419 && ObjectDefinition.aBooleanArray1490[81] && -3 > ~Class3_Sub13_Sub34.anInt3415) {
               PacketBuffer.method806(2597, Class3_Sub13_Sub34.anInt3415 - 2);
            } else {
               PacketBuffer.method806(2597, Class3_Sub13_Sub34.anInt3415 - 1);
            }
         } else {
            UnderlayType.anInt2099 = Class38_Sub1.anInt2614;
            EnumType.anInt3660 = 2;
            Class3_Sub13_Sub39.anInt3460 = Class163_Sub1.anInt2993;
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ej.B(" + var0 + ')');
      }
   }

   /*static final void method204() {
	   Class3_Sub13_Sub1.outputStream.putPacket(243);
	   Class3_Sub13_Sub1.outputStream.putByte(Class83.getDisplayMode());
	   Class3_Sub13_Sub1.outputStream.putShort(Class23.canvasWid);
	   Class3_Sub13_Sub1.outputStream.putShort(ItemPile.canvasHei);
	   Class3_Sub13_Sub1.outputStream.putByte(GroundItem.antiAliasing);
   }*///TODO not needed

   static final void method205(js5 var0, js5 var2, Interface4 var3) {
         Class154.aClass153_1967 = var0;
         Class58.anInterface4_915 = var3;
         Class3_Sub24_Sub3.aClass153_3490 = var2;
         if(Class3_Sub24_Sub3.aClass153_3490 != null) {
            Class83.anInt1156 = Class3_Sub24_Sub3.aClass153_3490.getChildCount(1);
         }

         if(Class154.aClass153_1967 != null) {
            client.anInt377 = Class154.aClass153_1967.getChildCount(1);
         }

   }

   public Class3_Sub13_Sub8() {
      super(1, false);
   }

   final int[] method154(int var1, byte var2) {
      try {
         int var3 = -34 / ((var2 - 30) / 36);
         int[] var4 = this.aClass114_2382.method1709(-16409, var1);
         if(this.aClass114_2382.aBoolean1580) {
            int[] var5 = this.method152(0, !this.aBoolean3104?var1:Class3_Sub20.anInt2487 + -var1, 32755);
            if(!this.aBoolean3100) {
               ArrayUtils.arrayCopy(var5, 0, var4, 0, Class113.anInt1559);
            } else {
               for(int var6 = 0; var6 < Class113.anInt1559; ++var6) {
                  var4[var6] = var5[-var6 + client.anInt396];
               }
            }
         }

         return var4;
      } catch (RuntimeException var7) {
         throw Class44.method1067(var7, "ej.D(" + var1 + ',' + var2 + ')');
      }
   }

   static final jString method207(int var0, boolean var1, int var2, long var3) {
      try {
         if(~var0 <= -3 && var0 <= 36) {
            if(var2 <= 71) {
               aFloat3105 = 1.3008908F;
            }

            long var6 = var3 / (long)var0;

            int var5;
            for(var5 = 1; var6 != 0L; var6 /= (long)var0) {
               ++var5;
            }

            int var8 = var5;
            if(0L > var3 || var1) {
               var8 = var5 + 1;
            }

            byte[] var9 = new byte[var8];
            if(var3 >= 0L) {
               if(var1) {
                  var9[0] = 43;
               }
            } else {
               var9[0] = 45;
            }

            for(int var10 = 0; ~var5 < ~var10; ++var10) {
               int var11 = (int)(var3 % (long)var0);
               var3 /= (long)var0;
               if(var11 < 0) {
                  var11 = -var11;
               }

               if(var11 > 9) {
                  var11 += 39;
               }

               var9[-1 + -var10 + var8] = (byte)(var11 + 48);
            }

            jString var13 = new jString();
            var13.buf = var9;
            var13.pos = var8;
            return var13;
         } else {
            throw new IllegalArgumentException("Invalid radix:" + var0);
         }
      } catch (RuntimeException var12) {
         throw Class44.method1067(var12, "ej.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

}
