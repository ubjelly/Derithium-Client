import java.awt.event.KeyEvent;

final class VarBit {
	
   int startBit;
   static int anInt1a124 = -1;
   int endBit;
   static int anInt1126;
   static int anInt1127 = 0;
   int setting;
   static jString aClass94_1129 = jString.createJString("Clientscript error )2 check log for details");


   static final void method1385(int var0, int var1) {
	   InterfaceChangeNode var3 = Class3_Sub24_Sub3.putInterfaceChange(6, var1);
	   var3.add();

	   var3.intValue = var0;
   }	

   static final int method1386(boolean var0, KeyEvent var1) {
      try {
         int var2 = var1.getKeyChar();
         if(!var0) {
            return -90;
         } else if(8364 == var2) {
            return 128;
         } else {
            if(~var2 >= -1 || 256 <= var2) {
               var2 = -1;
            }

            return var2;
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "kk.C(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

   final void method1387(Buffer var1, int var2) {
      try {
         while(true) {
            int var3 = var1.getUByte();
            if(var3 == 0) {
               var3 = -26 % ((-36 - var2) / 58);
               return;
            }

            this.method1389(var1, 1, var3);
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "kk.G(" + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   public static void method1388(boolean var0) {
      try {
         aClass94_1129 = null;
         if(!var0) {
            anInt1126 = 8;
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "kk.D(" + var0 + ')');
      }
   }

   private final void method1389(Buffer var1, int var2, int var3) {
      try {
         if(var2 == var3) {
            this.setting = var1.getUShort();
            this.startBit = var1.getUByte();
            this.endBit = var1.getUByte();
         }

      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "kk.B(" + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final VarBit list(int id) {
	   VarBit var2 = (VarBit)InterfaceListener.aClass93_2450.get((long)id);
	   if (var2 != null)
		   return var2;
	   byte[] var3 = Class101.aClass153_1420.getFile(14, id);
	   var2 = new VarBit();
	   if(var3 != null) {
		   var2.method1387(new Buffer(var3), -111);
	   }
	   InterfaceListener.aClass93_2450.put(var2, (long)id);
	   return var2;
   }

static final void method1390(Buffer var0, int var1) {
      try {
         if(-2 >= ~(-var0.pos + var0.buf.length)) {
            int var2 = var0.getUByte();
            if(var2 >= 0 && ~var2 >= -12) {
               byte var3;
               if(var2 == 11) {
                  var3 = 33;
               } else if(var2 != 10) {
                  if(var2 == 9) {
                     var3 = 31;
                  } else if(~var2 == -9) {
                     var3 = 30;
                  } else if(~var2 == -8) {
                     var3 = 29;
                  } else if(-7 != ~var2) {
                     if(~var2 == -6) {
                        var3 = 28;
                     } else if(-5 != ~var2) {
                        if(-4 == ~var2) {
                           var3 = 23;
                        } else if(-3 == ~var2) {
                           var3 = 22;
                        } else if(1 == var2) {
                           var3 = 23;
                        } else {
                           var3 = 19;
                        }
                     } else {
                        var3 = 24;
                     }
                  } else {
                     var3 = 28;
                  }
               } else {
                  var3 = 32;
               }

               if(~(var0.buf.length - var0.pos) <= ~var3) {
                  Class3_Sub28_Sub10.brightness = var0.getUByte();
                  if(-2 >= ~Class3_Sub28_Sub10.brightness) {
                     if(-5 > ~Class3_Sub28_Sub10.brightness) {
                        Class3_Sub28_Sub10.brightness = 4;
                     }
                  } else {
                     Class3_Sub28_Sub10.brightness = 1;
                  }

                  Class25.method957(var1 + 97, 1 == var0.getUByte());
                  AbstractObjectCache.removeRoofs = var0.getUByte() == 1;
                  KeyboardHandler.showGroundDecorations = 1 == var0.getUByte();
                  Class25.lowMemoryTextures = 1 == var0.getUByte();
                  jInterface.manyIdleAnimations = var0.getUByte() == 1;
                  Class44_Sub1.highDetailLights = ~var0.getUByte() == -2;
                  Class3_Sub13_Sub22.aBoolean3275 = -2 == ~var0.getUByte();
                  Class140_Sub6.aBoolean2910 = 1 == var0.getUByte();
                  Class80.anInt1137 = var0.getUByte();
                  if(2 < Class80.anInt1137) {
                     Class80.anInt1137 = 2;
                  }

                  if(var2 < 2) {
                     DisplayModeInformation.aBoolean1441 = ~var0.getUByte() == -2;
                     var0.getUByte();
                  } else {
                     DisplayModeInformation.aBoolean1441 = -2 == ~var0.getUByte();
                  }

                  Class128.aBoolean1685 = 1 == var0.getUByte();
                  Class38.aBoolean661 = ~var0.getUByte() == -2;
                  Class3_Sub28_Sub9.anInt3622 = var0.getUByte();
                  if(~Class3_Sub28_Sub9.anInt3622 < -3) {
                     Class3_Sub28_Sub9.anInt3622 = 2;
                  }

                  GroundItem.antiAliasing = Class3_Sub28_Sub9.anInt3622;
                  Class3_Sub13_Sub15.isStereo = ~var0.getUByte() == -2;
                  InterfaceListener.soundEffectsVolume = var0.getUByte();
                  if(~InterfaceListener.soundEffectsVolume < -128) {
                     InterfaceListener.soundEffectsVolume = 127;
                  }

                  Class9.musicVolume = var0.getUByte();
                  Class14.areaSoundsVolume = var0.getUByte();
                  if(-128 > ~Class14.areaSoundsVolume) {
                     Class14.areaSoundsVolume = 127;
                  }

                  if(~var2 <= -2) {
                     Class3_Sub13.fullscreenFrameWidth = var0.getUShort();
                     Class3_Sub13_Sub5.fullscreenFrameHeight = var0.getUShort();
                  }

                  if(-4 >= ~var2 && ~var2 > -7) {
                     var0.getUByte();
                  }

                  if(~var2 <= -5) {
                     int var4 = var0.getUByte();
                     if(-97 < ~Class3_Sub24_Sub3.maxMemory) {
                        var4 = 0;
                     }

                     ParticleEngine.method1758(var4);
                  }

                  if(~var2 <= -6) {
                     jString.anInt2148 = var0.getInt();
                  }

                  if(var1 != -1) {
                     aClass94_1129 = (jString)null;
                  }

                  if(6 <= var2) {
                     NodeSub.anInt2577 = var0.getUByte();
                  }

                  if(~var2 <= -8) {
                     jString.safeMode = 1 == var0.getUByte();
                  }

                  if(8 <= var2) {
                     Class15.aBoolean346 = ~var0.getUByte() == -2;
                  }

                  if(9 <= var2) {
                     Class3_Sub20.anInt2488 = var0.getUByte();
                  }

                  if(10 <= var2) {
                     Class65943149.aBoolean1080 = 0 != var0.getUByte();
                  }

                  if(-12 >= ~var2) {
                     Class163_Sub3.aBoolean3004 = ~var0.getUByte() != -1;
                  }

               }
            }
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "kk.F(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   static final boolean method1391(int var0) {
      try {
         return var0 == ~Class10.anInt154?Class101.aClass3_Sub24_Sub4_1421.method473(-128):true;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "kk.A(" + var0 + ')');
      }
   }

}
