
final class InterfaceChangeNode extends NodeSub {

   static boolean aBoolean3594;
   static jString aClass94_3595 = jString.createJString("(U0a )2 via: ");
   int intValue3;
   int intValue2;
   int intValue;
   jString stringValue;
   static int anInt3600;


   final void a() {
	   this.uid = TimeUtil.currentTimeMillis() + 500L | Long.MIN_VALUE & this.uid;
	   Class81.aClass13_1139.insertLast(this);
   }

   /*static final void d() {
         if(0 != ~NpcDefinition.anInt1252 && 0 != ~LongNode.anInt2293) {
            int var1 = (Class163_Sub2_Sub1.anInt4020 * (-Class134.anInt1759 + Class3_Sub13.anInt2383) >> 16) + Class134.anInt1759;
            float[] var3 = new float[3];
            Class163_Sub2_Sub1.anInt4020 += var1;
            if(~Class163_Sub2_Sub1.anInt4020 <= -65536) {
               Class163_Sub2_Sub1.anInt4020 = '\uffff';
               if(!GroundItem.aBoolean3668) {
                  Class3_Sub28_Sub1.aBoolean3531 = true;
               } else {
                  Class3_Sub28_Sub1.aBoolean3531 = false;
               }

               GroundItem.aBoolean3668 = true;
            } else {
               GroundItem.aBoolean3668 = false;
               Class3_Sub28_Sub1.aBoolean3531 = false;
            }

               float var2 = (float)Class163_Sub2_Sub1.anInt4020 / 65535.0F;
               int var4 = Class73.anInt1081 * 2;

               int var6;
               int var7;
               int var8;
               int var9;
               int var10;
               int var11;
               int var12;
               for(int var5 = 0; -4 < ~var5; ++var5) {
                  var8 = (Class58.anIntArrayArrayArray911[NpcDefinition.anInt1252][var4 - -2][var5] + -Class58.anIntArrayArrayArray911[NpcDefinition.anInt1252][var4 - -3][var5] - -Class58.anIntArrayArrayArray911[NpcDefinition.anInt1252][var4 - -2][var5]) * 3;
                  var9 = Class58.anIntArrayArrayArray911[NpcDefinition.anInt1252][var4][var5];
                  var7 = 3 * Class58.anIntArrayArrayArray911[NpcDefinition.anInt1252][var4 + 1][var5];
                  var6 = 3 * Class58.anIntArrayArrayArray911[NpcDefinition.anInt1252][var4][var5];
                  var10 = -var6 + var7;
                  var11 = var8 + -(var7 * 2) + var6;
                  var12 = Class58.anIntArrayArrayArray911[NpcDefinition.anInt1252][2 + var4][var5] + -var9 - -var7 - var8;
                  var3[var5] = (float)var9 + (((float)var12 * var2 + (float)var11) * var2 + (float)var10) * var2;
               }

               Class7.renderZ = -1 * (int)var3[1];
               Npc.renderX = (int)var3[0] + -(128 * Class131.anInt1716);
               Class77.renderY = (int)var3[2] + -(Class82.anInt1152 * 128);
               float[] var16 = new float[3];
               var6 = Class39.anInt670 * 2;

               for(var7 = 0; ~var7 > -4; ++var7) {
                  var8 = Class58.anIntArrayArrayArray911[LongNode.anInt2293][var6][var7] * 3;
                  var10 = (Class58.anIntArrayArrayArray911[LongNode.anInt2293][2 + var6][var7] - Class58.anIntArrayArrayArray911[LongNode.anInt2293][3 + var6][var7] + Class58.anIntArrayArrayArray911[LongNode.anInt2293][var6 - -2][var7]) * 3;
                  var11 = Class58.anIntArrayArrayArray911[LongNode.anInt2293][var6][var7];
                  var9 = Class58.anIntArrayArrayArray911[LongNode.anInt2293][1 + var6][var7] * 3;
                  var12 = var9 + -var8;
                  int var13 = var10 + var8 + -(2 * var9);
                  int var14 = -var10 + Class58.anIntArrayArrayArray911[LongNode.anInt2293][var6 - -2][var7] + -var11 + var9;
                  var16[var7] = (float)var11 + var2 * (var2 * (var2 * (float)var14 + (float)var13) + (float)var12);
               }

               float var17 = -var3[0] + var16[0];
               float var19 = var16[2] - var3[2];
               float var18 = (-var3[1] + var16[1]) * -1.0F;
               double var20 = Math.sqrt((double)(var19 * var19 + var17 * var17));
               Class85.aFloat1169 = (float)Math.atan2((double)var18, var20);
               Class45.aFloat730 = -((float)Math.atan2((double)var17, (double)var19));
               Class139.renderPitch = 2047 & (int)(325.949D * (double)Class85.aFloat1169);
               Class3_Sub13_Sub25.renderYaw = 2047 & (int)((double)Class45.aFloat730 * 325.949D);
         }
   }*/

   final long getAddTime() {
	   return this.uid & Long.MAX_VALUE;
   }

   static final AbstractIndexedSprite a(int var0, js5 var1, boolean var2) {
      try {
         return !ItemPile.method2029((byte)-127, var1, var0)?null:(!var2?(AbstractIndexedSprite)null:Class166.method2259());
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "da.C(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   final int getType() {
	   return (int)(255L & this.hash >>> 32);
   }

   final int getUid() {
	   return (int) this.hash;
   }

   static final String a(String var0, String var1, int var2, String var3) {
      for(int var4 = var3.indexOf(var0); 0 != ~var4; var4 = var3.indexOf(var0, var4 + var1.length())) {
         var3 = var3.substring(0, var4) + var1 + var3.substring(var0.length() + var4);
      }

      int var5 = -20 % ((var2 - 59) / 46);
      return var3;
   }

   static final void a(int var0, int var1, int var2, jInterface var3) {
      try {
         if(null == Class56.aClass11_886 && !Class38_Sub1.aBoolean2615) {
            if(var2 < 61) {
               a(19, 20, -32, (jInterface)null);
            }

            if(null != var3 && Class49.method1122(0, var3) != null) {
               Class56.aClass11_886 = var3;
               PacketParser.aClass11_88 = Class49.method1122(0, var3);
               Class144.anInt1881 = var1;
               Npc.aBoolean3975 = false;
               Class75_Sub3.anInt2658 = 0;
               Class95.anInt1336 = var0;
            }
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "da.S(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, jString var4, long var5, int var7) {
      try {
         Buffer var8 = new Buffer(128);
         var8.putByte(10);
         var8.putShort((int)(Math.random() * 99999.0D));
         var8.putShort(464);
         var8.putLong(var5);
         var8.putInt((int)(Math.random() * 9.9999999E7D));
         var8.putString(var4);
         var8.putInt((int)(Math.random() * 9.9999999E7D));
         var8.putShort(Class3_Sub26.anInt2554);
         var8.putByte(var0);
         var8.putByte(var3);
         if(var1 != 10603) {
            h((byte)-43);
         }

         var8.putInt((int)(Math.random() * 9.9999999E7D));
         var8.putShort(var7);
         var8.putShort(var2);
         var8.putInt((int)(9.9999999E7D * Math.random()));
         var8.encRsa(Class3_Sub13_Sub14.aBigInteger3162, Class3_Sub13_Sub37.aBigInteger3441, -296);
         Class3_Sub13_Sub1.outputStream.pos = 0;
         Class3_Sub13_Sub1.outputStream.putByte(36);
         Class3_Sub13_Sub1.outputStream.putByte(var8.pos);
         Class3_Sub13_Sub1.outputStream.method753(var8.buf, 0, var8.pos, 115);
         Hashtable.anInt1711 = -3;
         Canvas_Sub1.anInt23 = 1;
         Class132.anInt1734 = 0;
         SpotAnimation.anInt548 = 0;
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "da.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null?"{...}":"null") + ',' + var5 + ',' + var7 + ')');
      }
   }

   final void add() {
	   this.uid |= Long.MIN_VALUE;
	   if(~this.getAddTime() == -1L) {
		   PlainTile.aClass13_1666.insertLast(this);
	   }
   }

   public static void f(int var0) {
      try {
         if(var0 == 3) {
            aClass94_3595 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "da.O(" + var0 + ')');
      }
   }

   InterfaceChangeNode(int var1, int var2) {
	   this.hash = (long)var1 << 32 | (long)var2;
   }

   static final void h(byte var0) {
      try {
         Class114.aClass93_1569.clearSoftReference();
         if(var0 != 3) {
            aBoolean3594 = false;
         }

         Class3_Sub15.aClass93_2428.clearSoftReference();
         Class47.aClass93_743.clearSoftReference();
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "da.E(" + var0 + ')');
      }
   }

}
