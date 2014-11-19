
final class Class3_Sub13_Sub11 extends Class3_Sub13 {

   private int anInt3129;
   static Class93 aClass93_3130 = new Class93(4);
   static int anInt3132;
   static jString aClass94_3133 = jString.createJString(")2");
   private int anInt3134;
   private int anInt3135;
   static Class47 aClass47_3137 = new Class47(64);
   static jString aClass94_3138 = jString.createJString("b12_full");
   static int[] anIntArray3139 = new int[14];
   //static jString aClass94_3140 = jString.createJString("overlay2");


   private Class3_Sub13_Sub11(int var1) {
      super(0, false);

      try {
         this.method218((byte)75, var1);
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "fm.<init>(" + var1 + ')');
      }
   }

   public static void method217(int var0) {
      try {
         aClass94_3138 = null;
         aClass94_3133 = null;
         //aClass94_3140 = null;
         aClass93_3130 = null;
         anIntArray3139 = null;
         if(var0 != 1) {
            aClass94_3138 = (jString)null;
         }

         aClass47_3137 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "fm.B(" + var0 + ')');
      }
   }

   public Class3_Sub13_Sub11() {
      this(0);
   }

   private final void method218(byte var1, int var2) {
      try {
         this.anInt3134 = 4080 & var2 >> 4;
         this.anInt3135 = var2 << 4 & 4080;
         if(var1 == 75) {
            this.anInt3129 = (var2 & 16711680) >> 12;
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "fm.Q(" + var1 + ',' + var2 + ')');
      }
   }

   final int[][] method166(int var1, int var2) {
      try {
         if(var1 != -1) {
            method222(-87, 26, 75, -56, 22, -68);
         }

         int[][] var3 = this.aClass97_2376.method1594((byte)-123, var2);
         if(this.aClass97_2376.aBoolean1379) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];

            for(int var7 = 0; ~var7 > ~Class113.anInt1559; ++var7) {
               var4[var7] = this.anInt3129;
               var5[var7] = this.anInt3134;
               var6[var7] = this.anInt3135;
            }
         }

         return var3;
      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "fm.T(" + var1 + ',' + var2 + ')');
      }
   }

   static final void method219(boolean var0) {
		if (var0) {
			if (-1 != InvType.mainScreenInterface) {
				Class60.discardInterface(InvType.mainScreenInterface);
			}

			for (OverridedInterface var2 = (OverridedInterface) Class3_Sub13_Sub17.aClass130_3208.getFirst(); null != var2; var2 = (OverridedInterface) Class3_Sub13_Sub17.aClass130_3208.getNext()) {
				Class3_Sub13_Sub18.removeOverrideInterface(var2, true);
			}

			InvType.mainScreenInterface = -1;
			Class3_Sub13_Sub17.aClass130_3208 = new Hashtable(8);
			LongNode.method122();
			InvType.mainScreenInterface = Class3_Sub22.loginScreenInterfaceid;
			Class124.method1746(false);
			Class47.method1093();
			Class3_Sub13_Sub12.executeOnLaunchScript(InvType.mainScreenInterface);
		}

		AnimationLoader.anInt3590 = -1;
		/*Class3_Sub13_Sub13.setCursor(Class161.anInt2027);
         TextureLoader.selfPlayer = new Player();
         TextureLoader.selfPlayer.anInt2829 = 3000;
         TextureLoader.selfPlayer.anInt2819 = 3000;
         if(HDToolkit.openGLEnabled) {
            if(-3 == ~GrandExchangeItem.anInt1753) {
               Npc.renderX = Canvas_Sub2.anInt30 << 7;
               Class77.renderY = AbstractMouseWheel.anInt1904 << 7;
            } else {
               InterfaceChangeNode.d();
            }

            Class3_Sub13_Sub14.method236((byte)64);
            Class3_Sub13_Sub6.method195();
            Class117.setGameState(28);
         } else {*/
		//   Class84.method1418(Class140_Sub6.cacheIndex8);
		Class117.setGameState(10);
		//}
   }
   
   static final void method220(int var1, int var2) {
	   Class46.anInt741 = Class115.aClass86ArrayArray1581[var2][var1].anInt1185;
	   Class3_Sub13_Sub22.anInt3274 = Class115.aClass86ArrayArray1581[var2][var1].anInt1181;
	   Class86.anInt1191 = Class115.aClass86ArrayArray1581[var2][var1].anInt1178;
	   AtmosphereManager.method1509((float)Class46.anInt741, (float)Class3_Sub13_Sub22.anInt3274, (float)Class86.anInt1191);
   }

   static final void method221(int var0, jString var1, jString var2, jString var3, int var4) {
      try {
         InvType.appendChatMessage(var4, var1, var3, var2);
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "fm.F(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ',' + (var3 != null?"{...}":"null") + ',' + var4 + ')');
      }
   }

   final void method157(int var1, Buffer var2, boolean var3) {
      try {
         if(!var3) {
            method221(-64, (jString)null, (jString)null, (jString)null, 34);
         }

         if(-1 == ~var1) {
            this.method218((byte)75, var2.getMidInt());
         }

      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "fm.A(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

   static final boolean method222(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6;
      int var7;
      if(var1 == var2 && var3 == var4) {
         if(!Class8.method846(var0, var1, var3)) {
            return false;
         } else {
            var6 = var1 << 7;
            var7 = var3 << 7;
            return Class3_Sub13_Sub37.method349(var6 + 1, Class44.anIntArrayArrayArray723[var0][var1][var3] + var5, var7 + 1) && Class3_Sub13_Sub37.method349(var6 + 128 - 1, Class44.anIntArrayArrayArray723[var0][var1 + 1][var3] + var5, var7 + 1) && Class3_Sub13_Sub37.method349(var6 + 128 - 1, Class44.anIntArrayArrayArray723[var0][var1 + 1][var3 + 1] + var5, var7 + 128 - 1) && Class3_Sub13_Sub37.method349(var6 + 1, Class44.anIntArrayArrayArray723[var0][var1][var3 + 1] + var5, var7 + 128 - 1);
         }
      } else {
         for(var6 = var1; var6 <= var2; ++var6) {
            for(var7 = var3; var7 <= var4; ++var7) {
               if(Class81.anIntArrayArrayArray1142[var0][var6][var7] == -Class3_Sub28_Sub1.anInt3539) {
                  return false;
               }
            }
         }

         var6 = (var1 << 7) + 1;
         var7 = (var3 << 7) + 2;
         int var8 = Class44.anIntArrayArrayArray723[var0][var1][var3] + var5;
         if(!Class3_Sub13_Sub37.method349(var6, var8, var7)) {
            return false;
         } else {
            int var9 = (var2 << 7) - 1;
            if(!Class3_Sub13_Sub37.method349(var9, var8, var7)) {
               return false;
            } else {
               int var10 = (var4 << 7) - 1;
               if(!Class3_Sub13_Sub37.method349(var6, var8, var10)) {
                  return false;
               } else if(!Class3_Sub13_Sub37.method349(var9, var8, var10)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

}
