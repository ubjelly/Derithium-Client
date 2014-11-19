
final class TransformList extends Node {

   int id;
   int[] anIntArray2455;
   static int anInt2456;
   static float aFloat2457;
   int[][] skins;
   int amount;
   boolean[] aBooleanArray2463;
   int[] types;
   static jString aClass94_2464 = jString.createJString("");

   public static void method380(int var0) {
      try {
         aClass94_2464 = null;
         if(var0 != -29113) {
            method381();
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "jm.B(" + var0 + ')');
      }
   }

   static final void method381() {
		if (-1 != InvType.mainScreenInterface) {
			PlayerAppearance.method1160(InvType.mainScreenInterface);
		}

		for (int var1 = 0; var1 < Class3_Sub28_Sub3.anInt3557; ++var1) {
			if (GroundItem.aBooleanArray3674[var1]) {
				Class163_Sub1_Sub1.aBooleanArray4008[var1] = true;
			}

			Hashtable.aBooleanArray1712[var1] = GroundItem.aBooleanArray3674[var1];
			GroundItem.aBooleanArray3674[var1] = false;
		}

		Class53.anInt865 = -1;
		Class99.aClass11_1402 = null;
		Class3_Sub23.anInt2535 = Class44.loopCycle;
		if (HDToolkit.openGLEnabled) {
			OutputStream_Sub1.aBoolean47 = true;
		}

		NodeSub.anInt2567 = -1;

		if (InvType.mainScreenInterface != -1) {
			Class3_Sub28_Sub3.anInt3557 = 0;
			Class8.method841(true);
		}

		if (HDToolkit.openGLEnabled) {
			GraphicsHD.initDefaultBounds();
		} else {
			GraphicsLD.initDefaultBounds();
		}

		DisplayModeInformation.anInt1446 = 0;
   }

   TransformList(int var1, byte[] var2, boolean new_header) {
      try {
         this.id = var1;
         Buffer var3 = new Buffer(var2);
         this.amount = var3.getUByte();
         this.skins = new int[this.amount][];
         this.types = new int[this.amount];
         this.aBooleanArray2463 = new boolean[this.amount];
         this.anIntArray2455 = new int[this.amount];

         int var4;
         for(var4 = 0; ~var4 > ~this.amount; ++var4) {
            this.types[var4] = var3.getUByte();
         }
         if (client.clientLoad != 464 || new_header) {
        	 for(var4 = 0; var4 < this.amount; ++var4) {
      			this.aBooleanArray2463[var4] = var3.getUByte() == 1;
      		}
      		for(var4 = 0; var4 < this.amount; ++var4) {
      			this.anIntArray2455[var4] = var3.getUShort();
      		}
         }
         if(client.clientLoad == 464) {
     		for(var4 = 0; var4 < this.amount; ++var4) {
     			this.anIntArray2455[var4] = 65535;//var3.getUShort();
     		}
         }
         for(var4 = 0; var4 < this.amount; ++var4) {
             this.skins[var4] = new int[var3.getUByte()];
          }

          for(var4 = 0; this.amount > var4; ++var4) {
             for(int var5 = 0; ~var5 > ~this.skins[var4].length; ++var5) {
                this.skins[var4][var5] = var3.getUByte();
             }
          }

      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "jm.<init>(" + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

}
