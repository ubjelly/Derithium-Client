
final class HintIcon {

   static int anInt1345;
   int anInt1346;
   int anInt1347;
   //static jString aClass94_1349 = jString.createJString("underlay");
   int anInt1350;
   int anInt1351;
   static int anInt1352;
   int anInt1353;
   static int loadingStage = 0;
   int anInt1355 = -1;
   int anInt1356;
   static int anInt1357 = 0;
   static int anInt1358 = 0;
   int anInt1359;
   int anInt1360;


   /*static final void method1587(Buffer var1) {
         label134:
         while(true) {
            if(~var1.buf.length < ~var1.pos) {
               boolean var18 = false;
               int var5 = 0;
               int var6 = 0;
               if(-2 == ~var1.getUByte()) {
                  var5 = var1.getUByte();
                  var18 = true;
                  var6 = var1.getUByte();
               }

               int var7 = var1.getUByte();
               int var8 = var1.getUByte();
               int var9 = -Class3_Sub13_Sub21.anInt3256 + 64 * var7;
               int var10 = -(var8 * 64) - (-Class2.anInt65 - -1) + Class108.anInt1460;
               int var11;
               int var12;
               if(-1 >= ~var9 && -63 + var10 >= 0 && Class23.anInt455 > var9 + 63 && var10 < Class108.anInt1460) {
                  var11 = var9 >> 6;
                  var12 = var10 >> 6;
                  int var13 = 0;

                  while(true) {
                     if(var13 >= 64) {
                        continue label134;
                     }

                     for(int var14 = 0; ~var14 > -65; ++var14) {
                        if(!var18 || ~(8 * var5) >= ~var13 && ~var13 > ~(8 * var5 - -8) && ~var14 <= ~(8 * var6) && var14 < var6 * 8 - -8) {
                           int var15 = var1.getUByte();
                           if(0 != var15) {
                              int var2;
                              if(1 == (1 & var15)) {
                                 var2 = var1.getUByte();
                                 if(Huffman.aByteArrayArrayArray640[var11][var12] == null) {
                                    Huffman.aByteArrayArrayArray640[var11][var12] = new byte[4096];
                                 }

                                 Huffman.aByteArrayArrayArray640[var11][var12][var13 + (-var14 + 63 << 6)] = (byte)var2;
                              }

                              if(2 == (var15 & 2)) {
                                 var2 = var1.getMidInt();
                                 if(null == Varp.anIntArrayArrayArray558[var11][var12]) {
                                    Varp.anIntArrayArrayArray558[var11][var12] = new int[4096];
                                 }

                                 Varp.anIntArrayArrayArray558[var11][var12][(-var14 + 63 << 6) + var13] = var2;
                              }

                              if(4 == (var15 & 4)) {
                                 var2 = var1.getMidInt();
                                 if(null == Class44.anIntArrayArrayArray720[var11][var12]) {
                                    Class44.anIntArrayArrayArray720[var11][var12] = new int[4096];
                                 }

                                 --var2;
                                 ObjectDefinition var3 = ObjectDefinition.list(var2);
                                 if(null != var3.anIntArray1524) {
                                    var3 = var3.method1685();
                                    if(var3 == null || 0 == ~var3.anInt1482) {
                                       continue;
                                    }
                                 }

                                 Class44.anIntArrayArrayArray720[var11][var12][(-var14 + 63 << 6) + var13] = 1 + var3.anInt1527;
                                 Class3_Sub23 var16 = new Class3_Sub23();
                                 var16.anInt2532 = var3.anInt1482;
                                 var16.anInt2531 = var9;
                                 var16.anInt2539 = var10;
                                 Class84.aClass61_1162.insertBack(var16);
                              }
                           }
                        }
                     }

                     ++var13;
                  }
               }

               var11 = 0;

               while(true) {
                  if(var11 >= (var18?64:4096)) {
                     continue label134;
                  }

                  var12 = var1.getUByte();
                  if(var12 != 0) {
                     if(~(var12 & 1) == -2) {
                        ++var1.pos;
                     }

                     if(2 == (var12 & 2)) {
                        var1.pos += 2;
                     }

                     if(4 == (var12 & 4)) {
                        var1.pos += 3;
                     }
                  }

                  ++var11;
               }
            }

            return;
         }
   }*/
   
   public static void method1588(byte var0) {
      try {
         if(var0 <= 38) {
            method1588((byte)-126);
         }

         //aClass94_1349 = null;
    } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "nc.B(" + var0 + ')');
      }
   }

}
