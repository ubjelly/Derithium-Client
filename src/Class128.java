
final class Class128 {

   static int anInt1682 = 1;
   static Class93 aClass93_1683 = new Class93(64);
   private NodeSub[] aClass3_Sub28Array1684;
   static boolean aBoolean1685 = true;
   private static jString aClass94_1686 = jString.createJString("shake:");
   static jString aClass94_1687 = jString.createJString("(Z");
   static jString aClass94_1688 = aClass94_1686;
   static jString aClass94_1689 = aClass94_1686;


   static final void spawnGroundItem(int y, int x) {
         Deque var3 = Class3_Sub13_Sub22.aClass61ArrayArrayArray3273[Class26.plane][x][y];
         if(var3 != null) {
               int var4 = -99999999;
               GroundItem var5 = null;

               GroundItem var6;
               for(var6 = (GroundItem)var3.getFirst(); null != var6; var6 = (GroundItem)var3.getNext()) {
                  ItemDefinition var7 = ItemDefinition.method1023(var6.aClass140_Sub7_3676.id);
                  int var8 = var7.cost;
                  if(var7.stackable == 1) {
                     var8 *= 1 + var6.aClass140_Sub7_3676.amount;
                  }

                  if(var4 < var8) {
                     var4 = var8;
                     var5 = var6;
                  }
               }

               if(null != var5) {
                  var3.insertFront(var5);
                  ItemPile var12 = null;
                  ItemPile var14 = null;

                  for(var6 = (GroundItem)var3.getFirst(); var6 != null; var6 = (GroundItem)var3.getNext()) {
                     ItemPile var9 = var6.aClass140_Sub7_3676;
                     if(~var9.id != ~var5.aClass140_Sub7_3676.id) {
                        if(null == var12) {
                           var12 = var9;
                        }

                        if(~var9.id != ~var12.id && null == var14) {
                           var14 = var9;
                        }
                     }
                  }

                  long var13 = (long)(1610612736 + (y << 7) + x);
                  Class3_Sub13_Sub10.method213(Class26.plane, x, y, Class121.method1736(Class26.plane, 1, 64 + 128 * x, 64 + y * 128), var5.aClass140_Sub7_3676, var13, var12, var14);
               } else {
                  ObjectDefinition.method1688(Class26.plane, x, y);
               }
         } else {
            ObjectDefinition.method1688(Class26.plane, x, y);
         }
   }

   public static void method1761(byte var0) {
      try {
         aClass94_1688 = null;
         aClass94_1686 = null;
         aClass94_1689 = null;
         aClass94_1687 = null;
         if(var0 < -46) {
            aClass93_1683 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "rm.C(" + var0 + ')');
      }
   }

   static final void sleep(long var0) {
	   try {
		   Thread.sleep(var0);
	   } catch (InterruptedException var4) {
		   ;
	   }
   }

   static final AbstractModel method1763(boolean var0, int var1, int var2, int var3, int var4, AbstractModel var5, int var6) {
      try {
         long var7 = (long)var3;
         AbstractModel var9 = (AbstractModel)Deque.aClass93_939.get(var7);
         if(var9 == null) {
            ModelBuilder var10 = ModelBuilder.get(client.getModelJs5(var3), var3, 0);
            if(var10 == null) {
               return null;
            }

            var9 = var10.convert(64, 768, -50, -10, -50);
            Deque.aClass93_939.put(var9, var7);
         }

         int var17 = var5.method1884();
         int var11 = var5.method1883();
         int var12 = var5.method1898();
         int var13 = var5.method1872();
         var9 = var9.method1882(var0, true, true);
         if(var1 != 0) {
            var9.method1876(var1);
         }

         int var15;
         if(HDToolkit.openGLEnabled) {
            HDModel var14 = (HDModel)var9;
            if(var6 != Class121.method1736(Class26.plane, 1, var4 + var17, var2 + var12) || var6 != Class121.method1736(Class26.plane, 1, var4 - -var11, var13 + var2)) {
               for(var15 = 0; ~var15 > ~var14.vertexCount; ++var15) {
                  var14.yVertices[var15] += Class121.method1736(Class26.plane, 1, var14.xVertices[var15] + var4, var14.zVertices[var15] + var2) - var6;
               }

               var14.aClass121_3839.aBoolean1640 = false;
               var14.aClass6_3835.calculated = false;
            }
         } else {
            LDModel var18 = (LDModel)var9;
            if(var6 != Class121.method1736(Class26.plane, 1, var17 + var4, var12 + var2) || var6 != Class121.method1736(Class26.plane, 1, var4 - -var11, var13 + var2)) {
               for(var15 = 0; var18.anInt3891 > var15; ++var15) {
                  var18.anIntArray3883[var15] += Class121.method1736(Class26.plane, 1, var4 + var18.anIntArray3885[var15], var18.anIntArray3895[var15] + var2) - var6;
               }

               var18.aBoolean3897 = false;
            }
         }

         return var9;
      } catch (RuntimeException var16) {
         throw Class44.method1067(var16, "rm.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null?"{...}":"null") + ',' + var6 + ')');
      }
   }

   static final void method1764(int var0, int var1, int var2) {
      for(int var3 = 0; var3 < TransformList.anInt2456; ++var3) {
         for(int var4 = 0; var4 < jSocket.anInt1234; ++var4) {
            for(int var5 = 0; var5 < Class3_Sub13_Sub15.anInt3179; ++var5) {
               GroundTile var6 = Class75_Sub2.groundTiles[var3][var4][var5];
               if(var6 != null) {
                  Class70 var7 = var6.aClass70_2234;
                  if(var7 != null && var7.aClass140_1049.method1865()) {
                     Class3_Sub13_Sub10.method214(var7.aClass140_1049, var3, var4, var5, 1, 1);
                     if(var7.aClass140_1052 != null && var7.aClass140_1052.method1865()) {
                        Class3_Sub13_Sub10.method214(var7.aClass140_1052, var3, var4, var5, 1, 1);
                        var7.aClass140_1049.method1866(var7.aClass140_1052, 0, 0, 0, false);
                        var7.aClass140_1052 = var7.aClass140_1052.method1861(var0, var1, var2);
                     }

                     var7.aClass140_1049 = var7.aClass140_1049.method1861(var0, var1, var2);
                  }

                  for(int var8 = 0; var8 < var6.anInt2223; ++var8) {
                     Class25 var9 = var6.aClass25Array2221[var8];
                     if(var9 != null && var9.aClass140_479.method1865()) {
                        Class3_Sub13_Sub10.method214(var9.aClass140_479, var3, var4, var5, var9.anInt495 - var9.anInt483 + 1, var9.anInt481 - var9.anInt478 + 1);
                        var9.aClass140_479 = var9.aClass140_479.method1861(var0, var1, var2);
                     }
                  }

                  Class12 var10 = var6.aClass12_2230;
                  if(var10 != null && var10.aClass140_320.method1865()) {
                     Class155.method2162(var10.aClass140_320, var3, var4, var5);
                     var10.aClass140_320 = var10.aClass140_320.method1861(var0, var1, var2);
                  }
               }
            }
         }
      }

   }

   Class128(int var1) {
      try {
         this.aClass3_Sub28Array1684 = new NodeSub[var1];

         for(int var2 = 0; ~var2 > ~var1; ++var2) {
            NodeSub var3 = this.aClass3_Sub28Array1684[var2] = new NodeSub();
            var3.previousSub = var3;
            var3.nextSub = var3;
         }

      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "rm.<init>(" + var1 + ')');
      }
   }

}
