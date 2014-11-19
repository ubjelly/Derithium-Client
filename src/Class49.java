import java.io.DataInputStream;
import java.net.URL;
import java.util.Random;
import java.util.zip.Inflater;

final class Class49 {

   static AbstractSprite aClass3_Sub28_Sub16_812;
   private Inflater anInflater813;
   static boolean[][] aBooleanArrayArray814;
   static int anInt815 = 0;
   static int anInt817;
   static Class47 aClass47_818 = new Class47(64);
   static int anInt819 = 0;


   static final void method1121(boolean var0, byte var1) {
      try {
         byte var2;
         byte[][] var3;
         if(HDToolkit.openGLEnabled && var0) {
            var2 = 1;
            var3 = GroundItem.aByteArrayArray3669;
         } else {
            var3 = Class164_Sub2.aByteArrayArray3027;
            var2 = 4;
         }

         for(int var4 = 0; ~var4 > ~var2; ++var4) {
            Class58.method1194();

            for(int var5 = 0; -14 < ~var5; ++var5) {
               for(int var6 = 0; -14 < ~var6; ++var6) {
                  int var8 = ObjectDefinition.anIntArrayArrayArray1497[var4][var5][var6];
                  boolean var7 = false;
                  if(~var8 != 0) {
                     int var9 = var8 >> 24 & 3;
                     if(!var0 || 0 == var9) {
                        int var12 = 2047 & var8 >> 3;
                        int var10 = var8 >> 1 & 3;
                        int var11 = 1023 & var8 >> 14;
                        int var13 = (var11 / 8 << 8) + var12 / 8;

                        for(int var14 = 0; ~Class3_Sub24_Sub3.anIntArray3494.length < ~var14; ++var14) {
                           if(~Class3_Sub24_Sub3.anIntArray3494[var14] == ~var13 && null != var3[var14]) {
                              Canvas_Sub2.method60(var10, 8 * var5, var4, Class86.collisionMap, var6 * 8, (byte)-100, var3[var14], var9, (var12 & 7) * 8, 8 * (var11 & 7), var0);
                              var7 = true;
                              break;
                           }
                        }
                     }
                  }

                  if(!var7) {
                     Class12.method870(var4, (byte)84, 8 * var6, var5 * 8, 8, 8);
                  }
               }
            }
         }

         if(var1 <= 49) {
            anInt817 = 32;
         }

      } catch (RuntimeException var15) {
         throw Class44.method1067(var15, "ha.E(" + var0 + ',' + var1 + ')');
      }
   }

   static final jInterface method1122(int var0, jInterface var1) {
      try {
         if(var0 != 0) {
            method1123(103, 118);
         }

         jInterface var2 = client.method42(var1);
         if(null == var2) {
            var2 = var1.aClass11_302;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "ha.J(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

   static final byte[] method1123(int var0, int var1) {
      try {
         Class3_Sub28_Sub8 var2 = (Class3_Sub28_Sub8)Class25.aClass47_480.method1092((long)var1, var0 + -16710535);
         if(null == var2) {
            Random var4 = new Random((long)var1);
            byte[] var3 = new byte[512];

            int var5;
            for(var5 = 0; -256 < ~var5; ++var5) {
               var3[var5] = (byte)var5;
            }

            for(var5 = 0; ~var5 > -256; ++var5) {
               int var6 = 255 - var5;
               int var7 = OverlayType.method1603(var4, var6);
               byte var8 = var3[var7];
               var3[var7] = var3[var6];
               var3[var6] = var3[511 + -var5] = var8;
            }

            var2 = new Class3_Sub28_Sub8(var3);
            Class25.aClass47_480.method1097(var2, (long)var1, (byte)52);
         }

         return var0 != 16711935?(byte[])null:var2.aByteArray3612;
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "ha.B(" + var0 + ',' + var1 + ')');
      }
   }

   static final jString method1124(int[] var0, long var1, int var3, boolean var4) {
      try {
         if(var4) {
            return (jString)null;
         } else {
            if(Class58.anInterface4_915 != null) {
               jString var5 = Class58.anInterface4_915.method20(var3, var0, 4936, var1);
               if(var5 != null) {
                  return var5;
               }
            }

            return InvType.method612(var1, (byte)124);
         }
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "ha.H(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + var3 + ',' + var4 + ')');
      }
   }

   static final void method1125(String var0, Throwable var1) {
      try {
         String var3 = "";
         if(null != var1) {
            var3 = Class53.method1172(-95, var1);
         }

         if(var0 != null) {
            if(null != var1) {
               var3 = var3 + " | ";
            }

            var3 = var3 + var0;
         }

         Class7.method831(var3);
         var3 = InterfaceChangeNode.a(":", "%3a", 126, var3);
         var3 = InterfaceChangeNode.a("@", "%40", -31, var3);
         var3 = InterfaceChangeNode.a("&", "%26", -16, var3);
         var3 = InterfaceChangeNode.a("#", "%23", 6, var3);
         if(Class3_Sub13_Sub10.errorSignlink.thisApplet == null) {
            return;
         }

         SignlinkNode var4 = Class3_Sub13_Sub10.errorSignlink.method1439(false, new URL(Class3_Sub13_Sub10.errorSignlink.thisApplet.getCodeBase(), "clienterror.ws?c=" + Class3_Sub13_Sub23_Sub1.anInt4033 + "&u=" + Class3_Sub13_Sub16.aLong3202 + "&v1=" + Signlink.javaVendor + "&v2=" + Signlink.javaVersion + "&e=" + var3));

         while(var4.status == 0) {
            Class3_Sub13_Sub34.sleep(1L);
         }

         if(var4.status == 1) {
            DataInputStream var5 = (DataInputStream)var4.value;
            var5.read();
            var5.close();
         }
      } catch (Exception var6) {
         ;
      }

   }

   static final void method1126(int var0, int var1) {
      try {
         InterfaceChangeNode var2 = Class3_Sub24_Sub3.putInterfaceChange(2, var1);
         int var3 = -67 % ((var0 - -37) / 48);
         var2.a();
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "ha.I(" + var0 + ',' + var1 + ')');
      }
   }

   static final void method1127() {
         if(!Class38_Sub1.aBoolean2615) {
            if(EnumType.anInt3660 != 0) {
               NpcDefinition.anInt1297 = Class3_Sub13_Sub39.anInt3460;
               Class38_Sub1.anInt2612 = UnderlayType.anInt2099;
            } else if(Class3_Sub28_Sub11.anInt3644 == 0) {
               NpcDefinition.anInt1297 = PlainTile.anInt1676;
               Class38_Sub1.anInt2612 = Hashtable.anInt1709;
            } else {
               NpcDefinition.anInt1297 = Class163_Sub1.anInt2993;
               Class38_Sub1.anInt2612 = Class38_Sub1.anInt2614;
            }

            Class3_Sub13_Sub34.anInt3415 = 1;
            ItemPile.aClass94Array2935[0] = Class161.aClass94_2031;
            Class163_Sub2_Sub1.aClass94Array4016[0] = GroundItem.aClass94_3672;
            Class3_Sub13_Sub7.aShortArray3095[0] = 1005;
            Class114.anIntArray1578[0] = AnimationLoader.anInt3590;
         }

         if(-1 != InvType.mainScreenInterface) {
            PlayerAppearance.method1160(InvType.mainScreenInterface);
         }

         int var1;
         for(var1 = 0; var1 < Class3_Sub28_Sub3.anInt3557; ++var1) {
        	 if(GroundItem.aBooleanArray3674[var1]) {
        		 Class163_Sub1_Sub1.aBooleanArray4008[var1] = true;
        	 }

        	 Hashtable.aBooleanArray1712[var1] = GroundItem.aBooleanArray3674[var1];
        	 GroundItem.aBooleanArray3674[var1] = false;
         }

         AbstractSprite.aClass11_3708 = null;
         Class53.anInt865 = -1;
         NodeSub.anInt2567 = -1;
         Class99.aClass11_1402 = null;
         if(HDToolkit.openGLEnabled) {
        	 OutputStream_Sub1.aBoolean47 = true;
         }

         Class3_Sub23.anInt2535 = Class44.loopCycle;
         if(InvType.mainScreenInterface != -1) {
        	 Class3_Sub28_Sub3.anInt3557 = 0;
        	 Class8.method841(true);
         }

         if(HDToolkit.openGLEnabled) {
        	 GraphicsHD.initDefaultBounds();
         } else {
        	 GraphicsLD.initDefaultBounds();
         }

         UnderlayType.method2278();
         if(Class38_Sub1.aBoolean2615) {
        	 if(js5.aBoolean1951) {
        		 IsaacCipher.method1230((byte)116);
        	 } else {
        		 Class84.method1419(-117);
        	 }
         } else if(null == AbstractSprite.aClass11_3708) {
        	 if(-1 != Class53.anInt865) {
        		 IdentityKit.method950((jInterface)null, -86, NodeSub.anInt2567, Class53.anInt865);
        	 }
         } else {
        	 IdentityKit.method950(AbstractSprite.aClass11_3708, -120, RuntimeException_Sub1.anInt2115, Class3_Sub13_Sub23_Sub1.anInt4041);
         }

         var1 = Class38_Sub1.aBoolean2615?-1:Class3_Sub13_Sub35.method335();
         if(var1 == -1) {
        	 var1 = Class161.anInt2027;
         }

         Class3_Sub13_Sub13.setCursor(var1);
         if(-2 == ~InterfaceListener.anInt2440) {
        	 InterfaceListener.anInt2440 = 2;
         }

         if(1 == ObjectDefinition.anInt1521) {
        	 ObjectDefinition.anInt1521 = 2;
         }

         if(~ClientScript.anInt3689 == -4) {
        	 for(int var2 = 0; ~var2 > ~Class3_Sub28_Sub3.anInt3557; ++var2) {
        		 if(!Hashtable.aBooleanArray1712[var2]) {
                     if(Class163_Sub1_Sub1.aBooleanArray4008[var2]) {
                    	 if(!HDToolkit.openGLEnabled) {
                           GraphicsLD.fillRectAlpha(Class155.anIntArray1969[var2], Player.anIntArray3954[var2], Class3_Sub28_Sub18.anIntArray3768[var2], Entity.anIntArray2794[var2], 16711680, 128);
                    	 } else {
                    		 GraphicsHD.fillRectAlpha(Class155.anIntArray1969[var2], Player.anIntArray3954[var2], Class3_Sub28_Sub18.anIntArray3768[var2], Entity.anIntArray2794[var2], 16711680, 128);
                    	 }
                     }
        		 } else if(!HDToolkit.openGLEnabled) {
        			 GraphicsLD.fillRectAlpha(Class155.anIntArray1969[var2], Player.anIntArray3954[var2], Class3_Sub28_Sub18.anIntArray3768[var2], Entity.anIntArray2794[var2], 16711935, 128);
        		 } else {
        			 GraphicsHD.fillRectAlpha(Class155.anIntArray1969[var2], Player.anIntArray3954[var2], Class3_Sub28_Sub18.anIntArray3768[var2], Entity.anIntArray2794[var2], 16711935, 128);
        		 }
        	 }
         }

         //Deque.method1214(Class106.anInt1446, TextureLoader.selfPlayer.anInt2819, TextureLoader.selfPlayer.anInt2829, Class26.plane, 1);
         DisplayModeInformation.anInt1446 = 0;
   }

   final void method1128(byte[] var1, Buffer var2, boolean var3) {
      try {
         if(var3) {
            anInt815 = -81;
         }

         if(31 == var2.buf[var2.pos] && var2.buf[var2.pos + 1] == -117) {
            if(this.anInflater813 == null) {
               this.anInflater813 = new Inflater(true);
            }

            try {
               this.anInflater813.setInput(var2.buf, var2.pos + 10, -8 - (10 + var2.pos) + var2.buf.length);
               this.anInflater813.inflate(var1);
            } catch (Exception var5) {
               this.anInflater813.reset();
               throw new RuntimeException("Invalid GZIP compressed data!");
            }

            this.anInflater813.reset();
         } else {
            throw new RuntimeException("Invalid GZIP header!");
         }
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "ha.D(" + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

   public Class49() {
      this(-1, 1000000, 1000000);
   }

   static final void method1129(int var0, int var1, int var2, int var3, int var4) {
      try {
         int var5 = var3;
         int var6 = var2;
         int var7 = -var2;
         int var8 = -1;
         int var9 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var2 + var4, (byte)0, Class101.anInt1425);
         int var10 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var4 - var2, (byte)0, Class101.anInt1425);
         Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var1], var10, var9, var0);

         while(~var5 > ~var6) {
            var8 += 2;
            var7 += var8;
            int var11;
            int var12;
            int var13;
            int var14;
            if(var7 > 0) {
               --var6;
               var11 = -var6 + var1;
               var7 -= var6 << 1;
               var12 = var1 + var6;
               if(var12 >= Class159.anInt2020 && var11 <= Class57.anInt902) {
                  var13 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var4 - -var5, (byte)0, Class101.anInt1425);
                  var14 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, -var5 + var4, (byte)0, Class101.anInt1425);
                  if(Class57.anInt902 >= var12) {
                     Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var12], var14, var13, var0);
                  }

                  if(Class159.anInt2020 <= var11) {
                     Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var11], var14, var13, var0);
                  }
               }
            }

            ++var5;
            var11 = -var5 + var1;
            var12 = var5 + var1;
            if(var12 >= Class159.anInt2020 && ~Class57.anInt902 <= ~var11) {
               var13 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var4 - -var6, (byte)0, Class101.anInt1425);
               var14 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, -var6 + var4, (byte)0, Class101.anInt1425);
               if(var12 <= Class57.anInt902) {
                  Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var12], var14, var13, var0);
               }

               if(var11 >= Class159.anInt2020) {
                  Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var11], var14, var13, var0);
               }
            }
         }

      } catch (RuntimeException var15) {
         throw Class44.method1067(var15, "ha.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   private Class49(int var1, int var2, int var3) {}

   public static void method1130(int var0) {
      try {
         aClass3_Sub28_Sub16_812 = null;
         if(var0 < 54) {
            anInt819 = -109;
         }

         aClass47_818 = null;
         aBooleanArrayArray814 = (boolean[][])null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ha.F(" + var0 + ')');
      }
   }

}
