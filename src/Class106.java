
final class Class106 {

   static boolean aBoolean1441 = true;
   static int anInt1442 = 0;
   static Class67 aClass67_1443;
   static short aShort1444 = 256;
   //static jString aClass94_1445 = jString.createJString("Connected to update server");
   static int anInt1446 = 0;
   int anInt1447;
   int anInt1448;
   int anInt1449;
   int anInt1450;
   static boolean aBoolean1451 = false;


   static final void method1642(int var0, jString var1) {
      try {
         if(null != ClientScript.clanMembers) {
            if(var0 != 3803) {
               aClass67_1443 = (Class67)null;
            }

            long var3 = var1.toLong();
            int var2 = 0;
            if(var3 != 0L) {
               while(ClientScript.clanMembers.length > var2 && ~ClientScript.clanMembers[var2].hash != ~var3) {
                  ++var2;
               }

               if(var2 < ClientScript.clanMembers.length && null != ClientScript.clanMembers[var2]) {
                  Class3_Sub13_Sub1.outputStream.putPacket(162);
                  Class3_Sub13_Sub1.outputStream.putLong(ClientScript.clanMembers[var2].hash);
               }
            }
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "od.C(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

   static final int method1643(int var0, boolean var1, int var2, int var3) {
      try {
         if(var0 != 10131) {
            method1644((byte)95);
         }

         InventoryNode var4 = (InventoryNode)GroundTile.aClass130_2220.get((long)var2);
         if(null != var4) {
            int var5 = 0;

            for(int var6 = 0; ~var4.anIntArray2547.length < ~var6; ++var6) {
               if(var4.anIntArray2547[var6] >= 0 && Class3_Sub13_Sub23.anInt3287 > var4.anIntArray2547[var6]) {
                  ItemDefinition var7 = ItemDefinition.method1023(var4.anIntArray2547[var6]);
                  if(null != var7.aClass130_798) {
                     IntegerNode var8 = (IntegerNode)var7.aClass130_798.get((long)var3);
                     if(null != var8) {
                        if(var1) {
                           var5 += var4.anIntArray2551[var6] * var8.value;
                        } else {
                           var5 += var8.value;
                        }
                     }
                  }
               }
            }

            return var5;
         } else {
            return 0;
         }
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "od.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   public static void method1644(byte var0) {
      try {
         aClass67_1443 = null;
         if(var0 != 121) {
            aClass67_1443 = (Class67)null;
         }

         //aClass94_1445 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "od.A(" + var0 + ')');
      }
   }

}
