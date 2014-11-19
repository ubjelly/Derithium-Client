
final class Class131 {

   static int anInt1716;
   private static jString aClass94_1717 = jString.createJString("Prepared sound engine");
   short[] aShortArray1718;
   static int anInt1719 = -1;
   int anInt1720;
   jString[] aClass94Array1721;
   
   static js5 skeletonsFetcher;
   static jString aClass94_1724 = jString.createJString(" )2>");
   int[] anIntArray1725;
   private static jString aClass94_1726 = jString.createJString("Select");
   short[] aShortArray1727;
   static int[] anIntArray1729 = new int[]{12543016, 15504954, 15914854, 16773818};
   byte[] aByteArray1730;
   static jString aClass94_1731 = aClass94_1717;
static jString aClass94_1722 = aClass94_1726;

   static final void method1786() {
         while(true) {
            if(~SpotAnimation.aClass3_Sub30_Sub1_532.getBitsLeft(Hashtable.anInt1704) <= -12) {
               int var1 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(11);
               if(var1 != 2047) {
                  boolean var2 = false;
                  if(null == Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var1]) {
                     Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var1] = new Player();
                     var2 = true;
                     if(null != Class65.aClass3_Sub30Array986[var1]) {
                        Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var1].decodeAppearance(Class65.aClass3_Sub30Array986[var1]);
                     }
                  }

                  Class56.anIntArray887[Class159.anInt2022++] = var1;
                  Player var3 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var1];
                  var3.anInt2838 = Class44.loopCycle;
                  int var8 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(5);
                  if(var8 > 15) {
                     var8 -= 32;
                  }
                  int var6 = Class27.anIntArray510[SpotAnimation.aClass3_Sub30_Sub1_532.getBits(3)];
                  int var7 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(1);
                  int var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(1);
                  if(~var4 == -2) {
                     Class21.anIntArray441[Js5CacheWorker.anInt997++] = var1;
                  }

                  if(var2) {
                     var3.turnDirection = var3.directionDegrees = var6;
                  }
                  
                  int var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(5);
                  if(var5 > 15) {
                      var5 -= 32;
                   }

                  var3.method1981(var5 + TextureLoader.selfPlayer.anIntArray2767[0], ~var7 == -2, TextureLoader.selfPlayer.anIntArray2755[0] + var8);
                  continue;
               }
            }

            SpotAnimation.aClass3_Sub30_Sub1_532.endBitAccess();
            return;
         }
   }

   final boolean method1787(int var1, byte var2) {
      try {
         if(var2 != -124) {
            method1793((jString)null, (jString)null, -17, (byte)94);
         }

         return (this.aByteArray1730[var1] & 8) != 0;
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "se.G(" + var1 + ',' + var2 + ')');
      }
   }

   static final int method1788(int var0, int var1, int var2, int var3) {
	   int var5 = 15 & var3;
	   int var7 = -5 >= ~var5?(~var5 != -13 && -15 != ~var5?var1:var0):var2;
	   int var6 = ~var5 > -9?var0:var2;
	   return (-1 != ~(var5 & 1)?-var6:var6) - -(~(2 & var5) != -1?-var7:var7);
   }

   final boolean method1789(int var1, int var2) {
      try {
         if(var2 != 530) {
            this.method1794(-111, 26);
         }

         return ~(4 & this.aByteArray1730[var1]) != -1;
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "se.A(" + var1 + ',' + var2 + ')');
      }
   }

   static final void method1790(int var0, int var1) {
	   InterfaceChangeNode var3 = Class3_Sub24_Sub3.putInterfaceChange(5, var0);
	   var3.add();
	   var3.intValue = var1;
   }

   final int method1791(int var1, int var2) {
      try {
         return var2 != 8?35:this.aByteArray1730[var1] & 3;
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "se.I(" + var1 + ',' + var2 + ')');
      }
   }

   public static void method1792(int var0) {
      try {
         anIntArray1729 = null;
         if(var0 == 0) {
            skeletonsFetcher = null;
            aClass94_1726 = null;
            aClass94_1731 = null;
            aClass94_1717 = null;
            aClass94_1722 = null;
            aClass94_1724 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "se.F(" + var0 + ')');
      }
   }

   static final void method1793(jString var0, jString var1, int var2, byte var3) {
      try {
         GroundItem.aClass94_3673 = var1;
         Class7.anInt2161 = var2;
         GroundItem.aClass94_3675 = var0;
         if(!GroundItem.aClass94_3675.equals(GroundItem.aClass94_3672) && !GroundItem.aClass94_3673.equals(GroundItem.aClass94_3672)) {
            if(0 != ~InterfaceListener.anInt2451) {
               IdentityKit.method951(0);
            } else {
               GroundTile.anInt2246 = 0;
               Class117.anInt1616 = 0;
               AbstractGraphicsBuffer.returnCode = -3;
               Class3_Sub13_Sub31.anInt3375 = 1;
               Buffer var4 = new Buffer(128);
               var4.putByte(10);
               var4.putShort((int)(Math.random() * 99999.0D));
               var4.putShort(464);
               var4.putLong(GroundItem.aClass94_3675.toLong());
               var4.putInt((int)(Math.random() * 9.9999999E7D));
               var4.putString(GroundItem.aClass94_3673);
               var4.putInt((int)(Math.random() * 9.9999999E7D));
               int var5 = 9 / ((var3 - 29) / 60);
               var4.encRsa(Class3_Sub13_Sub14.aBigInteger3162, Class3_Sub13_Sub37.aBigInteger3441, -296);
               Class3_Sub13_Sub1.outputStream.pos = 0;
               Class3_Sub13_Sub1.outputStream.putByte(210);
               Class3_Sub13_Sub1.outputStream.putByte(var4.pos);
               Class3_Sub13_Sub1.outputStream.method753(var4.buf, 0, var4.pos, 125);
            }
         } else {
            AbstractGraphicsBuffer.returnCode = 3;
         }
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "se.C(" + (var0 != null?"{...}":"null") + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   final boolean method1794(int var1, int var2) {
      try {
         if(var2 != -20138) {
            method1788(122, 38, -120, -29);
         }

         return 0 == (this.aByteArray1730[var1] & 16);
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "se.E(" + var1 + ',' + var2 + ')');
      }
   }

   Class131(int var1) {
      try {
         this.anInt1720 = var1;
         this.aClass94Array1721 = new jString[this.anInt1720];
         this.aShortArray1718 = new short[this.anInt1720];
         this.anIntArray1725 = new int[this.anInt1720];
         this.aByteArray1730 = new byte[this.anInt1720];
         this.aShortArray1727 = new short[this.anInt1720];
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "se.<init>(" + var1 + ')');
      }
   }

}
