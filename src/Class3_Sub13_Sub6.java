
final class Class3_Sub13_Sub6 extends Class3_Sub13 {

   private int anInt3073 = 0;
   private int anInt3074 = 4096;
   static Deque aClass61_3075 = new Deque();
   static int[] spriteHeights;
   static js5Worker cacheIndex5;
   static boolean focus;
   static jString aClass94_3080 = Class95.method1586(23161, 160);
   static int anInt3081 = 0;
   static int[] chatTypes = new int[100];
   static int[] anIntArray3083 = new int[50];

   static final void method195() {
         int var1 = (Npc.renderX >> 10) - -(Class131.anInt1716 >> 3);
         int var2 = (Class77.renderY >> 10) - -(Class82.anInt1152 >> 3);
            byte var3 = 0;
            byte var4 = 8;
            byte var6 = 18;
            Class3_Sub22.aByteArrayArray2521 = new byte[var6][];
            AnimationLoader.anIntArray3587 = new int[var6];
            Class3_Sub13_Sub26.aByteArrayArray3335 = new byte[var6][];
            client.anIntArray2200 = new int[var6];
            Class3_Sub9.anIntArrayArray2319 = new int[var6][4];
            GroundItem.aByteArrayArray3669 = new byte[var6][];
            Class3_Sub24_Sub3.anIntArray3494 = new int[var6];
            Class164_Sub2.aByteArrayArray3027 = new byte[var6][];
            Class3_Sub13_Sub24.anIntArray3290 = new int[var6];
            Class3_Sub13_Sub15.anIntArray3181 = new int[var6];
            Class101.anIntArray1426 = new int[var6];
            byte var5 = 8;
            Class3_Sub13_Sub4.aByteArrayArray3057 = new byte[var6][];
            int var11 = 0;

            int var7;
            for(var7 = (-6 + var1) / 8; ~var7 >= ~((6 + var1) / 8); ++var7) {
               for(int var8 = (-6 + var2) / 8; ~((var2 + 6) / 8) <= ~var8; ++var8) {
                  int var9 = (var7 << 8) - -var8;
                  Class3_Sub24_Sub3.anIntArray3494[var11] = var9;
                  client.anIntArray2200[var11] = cacheIndex5.method2120(client.method903(new jString[]{PacketBuffer.aClass94_3807, Class72.method1298(var7), Class3_Sub13_Sub14.aClass94_3161, Class72.method1298(var8)}));
                  Class101.anIntArray1426[var11] = cacheIndex5.method2120(client.method903(new jString[]{Class161.aClass94_2029, Class72.method1298(var7), Class3_Sub13_Sub14.aClass94_3161, Class72.method1298(var8)}));
                  Class3_Sub13_Sub24.anIntArray3290[var11] = cacheIndex5.method2120(client.method903(new jString[]{Canvas_Sub1.aClass94_26, Class72.method1298(var7), Class3_Sub13_Sub14.aClass94_3161, Class72.method1298(var8)}));
                  Class3_Sub13_Sub15.anIntArray3181[var11] = cacheIndex5.method2120(client.method903(new jString[]{Class95.aClass94_1333, Class72.method1298(var7), Class3_Sub13_Sub14.aClass94_3161, Class72.method1298(var8)}));
                  AnimationLoader.anIntArray3587[var11] = cacheIndex5.method2120(client.method903(new jString[]{Class167.aClass94_2084, Class72.method1298(var7), Class3_Sub13_Sub14.aClass94_3161, Class72.method1298(var8)}));
                  if(~Class3_Sub13_Sub24.anIntArray3290[var11] == 0) {
                     client.anIntArray2200[var11] = -1;
                     Class101.anIntArray1426[var11] = -1;
                     Class3_Sub13_Sub15.anIntArray3181[var11] = -1;
                     AnimationLoader.anIntArray3587[var11] = -1;
                  }

                  ++var11;
               }
            }

            for(var7 = var11; ~var7 > ~Class3_Sub13_Sub24.anIntArray3290.length; ++var7) {
               Class3_Sub13_Sub24.anIntArray3290[var7] = -1;
               client.anIntArray2200[var7] = -1;
               Class101.anIntArray1426[var7] = -1;
               Class3_Sub13_Sub15.anIntArray3181[var7] = -1;
               AnimationLoader.anIntArray3587[var7] = -1;
            }

            Class65943149.method1301(var3, var2, var1, var5, true, var4, true);
   }

   final int[] method154(int var1, byte var2) {
      try {
         int var3 = 69 / ((var2 - 30) / 36);
         int[] var4 = this.aClass114_2382.method1709(-16409, var1);
         if(this.aClass114_2382.aBoolean1580) {
            int[] var5 = this.method152(0, var1, 32755);

            for(int var6 = 0; var6 < Class113.anInt1559; ++var6) {
               int var7 = var5[var6];
               var4[var6] = ~this.anInt3073 >= ~var7 && ~var7 >= ~this.anInt3074?4096:0;
            }
         }

         return var4;
      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "ca.D(" + var1 + ',' + var2 + ')');
      }
   }

   static final void method196(boolean var0) {
      try {
         FileSystem.aClass93_684.clearSoftReference();
         Class163_Sub1.cursorCache.clearSoftReference();
         if(var0) {
            anIntArray3083 = (int[])null;
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ca.B(" + var0 + ')');
      }
   }

   final void method157(int var1, Buffer var2, boolean var3) {
      try {
         if(!var3) {
            method196(true);
         }

         if(~var1 != -1) {
            if(1 == var1) {
               this.anInt3074 = var2.getUShort();
            }
         } else {
            this.anInt3073 = var2.getUShort();
         }

      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "ca.A(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

   public Class3_Sub13_Sub6() {
      super(1, true);
   }

   public static void method197(int var0) {
      try {
         spriteHeights = null;
         aClass61_3075 = null;
         chatTypes = null;
         aClass94_3080 = null;
         if(var0 == 1) {
            anIntArray3083 = null;
            cacheIndex5 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ca.O(" + var0 + ')');
      }
   }

	static final void method198(boolean var0) {
		int var3 = Class164_Sub2.aByteArrayArray3027.length;
		byte[][] var2;
		if (HDToolkit.openGLEnabled && var0) {
			var2 = Class3_Sub13_Sub4.aByteArrayArray3057;
		} else {
			var2 = Class3_Sub22.aByteArrayArray2521;
		}

		for (int var4 = 0; var4 < var3; ++var4) {
			byte[] var5 = var2[var4];
			if (var5 != null) {
				int var6 = -Class131.anInt1716 + 64 * (Class3_Sub24_Sub3.anIntArray3494[var4] >> 8);
				int var7 = (Class3_Sub24_Sub3.anIntArray3494[var4] & 255) * 64 + -Class82.anInt1152;
				Class58.method1194();
				Class3_Sub15.method374(var6, var0, var5, var7, Class86.collisionMap);
			}
		}
	}

   static final void method199(int var0, int var1, int var2, int var3) {
      try {
         if(var3 != -799) {
            focus = true;
         }

         if(-1 != ~InterfaceListener.soundEffectsVolume && var0 != 0 && ~Class113.anInt1552 > -51 && 0 != ~var1) {
            InventoryNode.anIntArray2550[Class113.anInt1552] = var1;
            Class166.anIntArray2068[Class113.anInt1552] = var0;
            jString.anIntArray2157[Class113.anInt1552] = var2;
            TextureLoader.aClass135Array2131[Class113.anInt1552] = null;
            anIntArray3083[Class113.anInt1552] = 0;
            ++Class113.anInt1552;
         }

      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "ca.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

}
