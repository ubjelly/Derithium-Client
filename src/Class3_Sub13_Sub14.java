import java.math.BigInteger;

final class Class3_Sub13_Sub14 extends Class3_Sub13 {

   static Class65943149 aClass73_3159;
   private int anInt3160 = 0;
   static jString aClass94_3161 = jString.createJString("_");
   static BigInteger aBigInteger3162 = new BigInteger("65537");
   private int anInt3163 = 20;
   private int anInt3164 = 1365;
   private int anInt3165 = 0;
   static boolean aBoolean3166 = false;

   static jString aClass94_3168 = jString.createJString("cross");
   static int[] anIntArray3171 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
   static js5 aClass153_3173;
   static jString aClass94_3167 = jString.createJString("Loaded textures");

   final void method157(int var1, Buffer var2, boolean var3) {
      try {
         if(!var3) {
            aClass94_3168 = (jString)null;
         }

         if(-1 != ~var1) {
            if(-2 != ~var1) {
               if(~var1 != -3) {
                  if(var1 == 3) {
                     this.anInt3165 = var2.getUShort();
                  }
               } else {
                  this.anInt3160 = var2.getUShort();
               }
            } else {
               this.anInt3163 = var2.getUShort();
            }
         } else {
            this.anInt3164 = var2.getUShort();
         }

      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "gm.A(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

   static final void method236(byte var0) {
      try {
         if(var0 == 64) {
            Class3_Sub13_Sub32.aBoolean3387 = true;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "gm.C(" + var0 + ')');
      }
   }

   static final void method237(int var0) {
      try {
         Js5CacheWorker.anInt997 = 0;
         Class139.anInt1829 = 0;
         IdentityKit.method945((byte)-11);
         Class167.method2261(113);
         Class75_Sub4.method1349();

         int var1;
         for(var1 = 0; ~var1 > ~Class139.anInt1829; ++var1) {
            int var2 = LongNode.anIntArray2292[var1];
            if(~Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var2].anInt2838 != ~Class44.loopCycle) {
               if(Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var2].aClass90_3976.method1474(-1)) {
                  Class3_Sub28_Sub8.method574(Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var2], false);
               }

               Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var2].method1987(-1, (NpcDefinition)null);
               Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var2] = null;
            }
         }

         if(var0 != 8169) {
            method237(96);
         }

         if(Hashtable.anInt1704 == SpotAnimation.aClass3_Sub30_Sub1_532.pos) {
            for(var1 = 0; var1 < Class163.anInt2046; ++var1) {
               if(null == Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[Class15.anIntArray347[var1]]) {
                  throw new RuntimeException("gnp2 pos:" + var1 + " size:" + Class163.anInt2046);
               }
            }

         } else {
            throw new RuntimeException("gnp1 pos:" + SpotAnimation.aClass3_Sub30_Sub1_532.pos + " psize:" + Hashtable.anInt1704);
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "gm.B(" + var0 + ')');
      }
   }

   final int[] method154(int var1, byte var2) {
      try {
         int var4 = -72 % ((30 - var2) / 36);
         int[] var3 = this.aClass114_2382.method1709(-16409, var1);
         if(this.aClass114_2382.aBoolean1580) {
            for(int var5 = 0; ~Class113.anInt1559 < ~var5; ++var5) {
               int var7 = this.anInt3165 + (Class163_Sub3.anIntArray2999[var1] << 12) / this.anInt3164;
               int var6 = this.anInt3160 + (TextureLoader.anIntArray2125[var5] << 12) / this.anInt3164;
               int var8 = var6;
               int var10 = var6;
               int var9 = var7;
               int var11 = var7;
               int var14 = 0;
               int var12 = var6 * var6 >> 12;

               for(int var13 = var7 * var7 >> 12; ~(var12 - -var13) > -16385 && ~this.anInt3163 < ~var14; var12 = var10 * var10 >> 12) {
                  var11 = (var10 * var11 >> 12) * 2 + var9;
                  ++var14;
                  var10 = var12 + -var13 + var8;
                  var13 = var11 * var11 >> 12;
               }

               var3[var5] = ~var14 <= ~(this.anInt3163 + -1)?0:(var14 << 12) / this.anInt3163;
            }
         }

         return var3;
      } catch (RuntimeException var15) {
         throw Class44.method1067(var15, "gm.D(" + var1 + ',' + var2 + ')');
      }
   }

   public static void method238(int var0) {
      try {
         if(var0 == 9423) {
            aBigInteger3162 = null;
            anIntArray3171 = null;
            aClass73_3159 = null;
            aClass153_3173 = null;
            aClass94_3168 = null;
            aClass94_3167 = null;
            aClass94_3161 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "gm.E(" + var0 + ')');
      }
   }

   public Class3_Sub13_Sub14() {
      super(0, true);
   }

}
