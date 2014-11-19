
class Class164_Sub1 extends Class164 {

   static jString aClass94_3008 = jString.createJString("hitbar_default");
   static AbstractGraphicsBuffer aClass158_3009;
   private int anInt3010;
   static short[] aShortArray3011 = new short[]{(short)6798, (short)8741, (short)25238, (short)4626, (short)4550};
   static int anInt3012 = 0;
   static jString aClass94_3013 = jString.createJString("0");
   private int[] anIntArray3014;
   private byte[] aByteArray3015;
   private int anInt3016;


   final void method2237(int var1, int var2, int var3) {
      try {
         this.anInt3010 += var1 * this.anIntArray3014[var2] >> 12;
         if(var3 != -20975) {
            method2239(-22, -68, -14, 89);
         }

      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "vd.H(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void method2238(int var0, int var1, int var2, int var3, byte var4, int var5) {
      try {
         Class75.anInt1105 = var2;
         Class157.anInt1996 = var1;
         Class163_Sub2_Sub1.anInt4014 = var5;
         MouseHandler.anInt1923 = var3;
         SpotAnimation.anInt529 = var0;
         if(var4 != -21) {
            aClass94_3013 = (jString)null;
         }

         if(-101 >= ~Class163_Sub2_Sub1.anInt4014) {
            int var6 = 64 + 128 * MouseHandler.anInt1923;
            int var7 = 64 + Class157.anInt1996 * 128;
            int var8 = Class121.method1736(Class26.plane, 1, var6, var7) - SpotAnimation.anInt529;
            int var10 = var8 + -Class7.renderZ;
            int var9 = var6 + -Npc.renderX;
            int var11 = -Class77.renderY + var7;
            int var12 = (int)Math.sqrt((double)(var11 * var11 + var9 * var9));
            Class139.renderPitch = 2047 & (int)(Math.atan2((double)var10, (double)var12) * 325.949D);
            Class3_Sub13_Sub25.renderYaw = 2047 & (int)(Math.atan2((double)var9, (double)var11) * -325.949D);
            if(128 > Class139.renderPitch) {
               Class139.renderPitch = 128;
            }

            if(383 < Class139.renderPitch) {
               Class139.renderPitch = 383;
            }
         }

         GrandExchangeItem.anInt1753 = 2;
      } catch (RuntimeException var13) {
         throw Class44.method1067(var13, "vd.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   static final boolean method2239(int var0, int var1, int var2, int var3) {
      if(!Class8.method846(var0, var1, var2)) {
         return false;
      } else {
         int var4 = var1 << 7;
         int var5 = var2 << 7;
         int var6 = Class44.anIntArrayArrayArray723[var0][var1][var2] - 1;
         int var7 = var6 - 120;
         int var8 = var6 - 230;
         int var9 = var6 - 238;
         if(var3 < 16) {
            if(var3 == 1) {
               if(var4 > MillisTimer.anInt2697) {
                  if(!Class3_Sub13_Sub37.method349(var4, var6, var5)) {
                     return false;
                  }

                  if(!Class3_Sub13_Sub37.method349(var4, var6, var5 + 128)) {
                     return false;
                  }
               }

               if(var0 > 0) {
                  if(!Class3_Sub13_Sub37.method349(var4, var7, var5)) {
                     return false;
                  }

                  if(!Class3_Sub13_Sub37.method349(var4, var7, var5 + 128)) {
                     return false;
                  }
               }

               if(!Class3_Sub13_Sub37.method349(var4, var8, var5)) {
                  return false;
               }

               if(!Class3_Sub13_Sub37.method349(var4, var8, var5 + 128)) {
                  return false;
               }

               return true;
            }

            if(var3 == 2) {
               if(var5 < Class3_Sub13_Sub30.anInt3363) {
                  if(!Class3_Sub13_Sub37.method349(var4, var6, var5 + 128)) {
                     return false;
                  }

                  if(!Class3_Sub13_Sub37.method349(var4 + 128, var6, var5 + 128)) {
                     return false;
                  }
               }

               if(var0 > 0) {
                  if(!Class3_Sub13_Sub37.method349(var4, var7, var5 + 128)) {
                     return false;
                  }

                  if(!Class3_Sub13_Sub37.method349(var4 + 128, var7, var5 + 128)) {
                     return false;
                  }
               }

               if(!Class3_Sub13_Sub37.method349(var4, var8, var5 + 128)) {
                  return false;
               }

               if(!Class3_Sub13_Sub37.method349(var4 + 128, var8, var5 + 128)) {
                  return false;
               }

               return true;
            }

            if(var3 == 4) {
               if(var4 < MillisTimer.anInt2697) {
                  if(!Class3_Sub13_Sub37.method349(var4 + 128, var6, var5)) {
                     return false;
                  }

                  if(!Class3_Sub13_Sub37.method349(var4 + 128, var6, var5 + 128)) {
                     return false;
                  }
               }

               if(var0 > 0) {
                  if(!Class3_Sub13_Sub37.method349(var4 + 128, var7, var5)) {
                     return false;
                  }

                  if(!Class3_Sub13_Sub37.method349(var4 + 128, var7, var5 + 128)) {
                     return false;
                  }
               }

               if(!Class3_Sub13_Sub37.method349(var4 + 128, var8, var5)) {
                  return false;
               }

               if(!Class3_Sub13_Sub37.method349(var4 + 128, var8, var5 + 128)) {
                  return false;
               }

               return true;
            }

            if(var3 == 8) {
               if(var5 > Class3_Sub13_Sub30.anInt3363) {
                  if(!Class3_Sub13_Sub37.method349(var4, var6, var5)) {
                     return false;
                  }

                  if(!Class3_Sub13_Sub37.method349(var4 + 128, var6, var5)) {
                     return false;
                  }
               }

               if(var0 > 0) {
                  if(!Class3_Sub13_Sub37.method349(var4, var7, var5)) {
                     return false;
                  }

                  if(!Class3_Sub13_Sub37.method349(var4 + 128, var7, var5)) {
                     return false;
                  }
               }

               if(!Class3_Sub13_Sub37.method349(var4, var8, var5)) {
                  return false;
               }

               if(!Class3_Sub13_Sub37.method349(var4 + 128, var8, var5)) {
                  return false;
               }

               return true;
            }
         }

         return !Class3_Sub13_Sub37.method349(var4 + 64, var9, var5 + 64)?false:(var3 == 16?Class3_Sub13_Sub37.method349(var4, var8, var5 + 128):(var3 == 32?Class3_Sub13_Sub37.method349(var4 + 128, var8, var5 + 128):(var3 == 64?Class3_Sub13_Sub37.method349(var4 + 128, var8, var5):(var3 == 128?Class3_Sub13_Sub37.method349(var4, var8, var5):true))));
      }
   }

   public static void method2240(int var0) {
      try {
         aClass94_3008 = null;
         aShortArray3011 = null;
         aClass94_3013 = null;
         if(var0 == 128) {
            aClass158_3009 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "vd.I(" + var0 + ')');
      }
   }

   static final void method2241(byte var0, boolean var1) {
      try {
         int var2 = -47 / ((var0 - 5) / 49);

         Class3_Sub9 var3;
         for(var3 = (Class3_Sub9)Node.aClass61_78.getFirst(); var3 != null; var3 = (Class3_Sub9)Node.aClass61_78.getNext()) {
            if(null != var3.aClass3_Sub24_Sub1_2312) {
               Class3_Sub26.aClass3_Sub24_Sub2_2563.method461(var3.aClass3_Sub24_Sub1_2312);
               var3.aClass3_Sub24_Sub1_2312 = null;
            }

            if(var3.aClass3_Sub24_Sub1_2315 != null) {
               Class3_Sub26.aClass3_Sub24_Sub2_2563.method461(var3.aClass3_Sub24_Sub1_2315);
               var3.aClass3_Sub24_Sub1_2315 = null;
            }

            var3.unlink();
         }

         if(var1) {
            for(var3 = (Class3_Sub9)jSocket.aClass61_1242.getFirst(); null != var3; var3 = (Class3_Sub9)jSocket.aClass61_1242.getNext()) {
               if(null != var3.aClass3_Sub24_Sub1_2312) {
                  Class3_Sub26.aClass3_Sub24_Sub2_2563.method461(var3.aClass3_Sub24_Sub1_2312);
                  var3.aClass3_Sub24_Sub1_2312 = null;
               }

               var3.unlink();
            }

            for(var3 = (Class3_Sub9)RawObjectCache.aClass130_4046.getFirst(); null != var3; var3 = (Class3_Sub9)RawObjectCache.aClass130_4046.getNext()) {
               if(null != var3.aClass3_Sub24_Sub1_2312) {
                  Class3_Sub26.aClass3_Sub24_Sub2_2563.method461(var3.aClass3_Sub24_Sub1_2312);
                  var3.aClass3_Sub24_Sub1_2312 = null;
               }

               var3.unlink();
            }
         }

      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "vd.G(" + var0 + ',' + var1 + ')');
      }
   }

   final void method2233(int var1) {
      try {
         if(var1 == -949697716) {
            this.anInt3016 = 0;
            this.anInt3010 = 0;
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "vd.C(" + var1 + ')');
      }
   }

   Class164_Sub1(int var1, int var2, int var3, int var4, int var5, float var6) {
      super(var1, var2, var3, var4, var5);

      try {
         this.anIntArray3014 = new int[this.anInt2062];

         for(int var7 = 0; ~this.anInt2062 < ~var7; ++var7) {
            this.anIntArray3014[var7] = (short)((int)(Math.pow((double)var6, (double)var7) * 4096.0D));
         }

      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "vd.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   void method2242(int var1, byte var2) {
      try {
         this.aByteArray3015[this.anInt3016++] = (byte)(127 + (ClientScript.method633(var2, 255) >> 1));
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "vd.B(" + var1 + ',' + var2 + ')');
      }
   }

   final void method2231(byte var1) {
      try {
         this.anInt3010 = Math.abs(this.anInt3010);
         if(var1 != -92) {
            this.method2231((byte)-112);
         }

         if(this.anInt3010 >= 4096) {
            this.anInt3010 = 4095;
         }

         this.method2242(this.anInt3016++, (byte)(this.anInt3010 >> 4));
         this.anInt3010 = 0;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "vd.A(" + var1 + ')');
      }
   }

}
