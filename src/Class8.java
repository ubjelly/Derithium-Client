
public class Class8 {

   static int anInt101;
   static int anInt104 = 0;
   static js5 aClass153_105;
   //static jString aClass94_106 = jString.createJString("showVideoAd");
   public static js5Worker[] aClass18_Sub1Array745 = new js5Worker[256];


   public static void method836(int var0) {
      try {
         aClass153_105 = null;
         if(var0 > -10) {
            method843(-80, (Buffer)null);
         }

         //aClass94_106 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "al.I(" + var0 + ')');
      }
   }

   static final void method840(ObjectDefinition var0, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
         int var9 = 3 & var3;
         int var10;
         int var11;
         if(-2 != ~var9 && -4 != ~var9) {
            var11 = var0.sizeY;
            var10 = var0.sizeX;
         } else {
            var10 = var0.sizeY;
            var11 = var0.sizeX;
         }

         int var14;
         int var15;
         if(-105 > ~(var7 - -var11)) {
            var15 = 1 + var7;
            var14 = var7;
         } else {
            var14 = var7 - -(var11 >> 1);
            var15 = var7 - -(1 + var11 >> 1);
         }

         int var16 = (var6 << 7) - -(var10 << 6);
         int var17 = (var7 << 7) + (var11 << 6);
         int var12;
         int var13;
         if(104 < var6 - -var10) {
            var12 = var6;
            var13 = var6 + 1;
         } else {
            var12 = var6 + (var10 >> 1);
            var13 = (var10 - -1 >> 1) + var6;
         }

         int[][] var18 = Class44.anIntArrayArrayArray723[var8];
         int var20 = 0;
         int var19 = var18[var12][var15] + var18[var12][var14] + var18[var13][var14] + var18[var13][var15] >> 2;
         int[][] var21;
         if(~var8 != -1) {
            var21 = Class44.anIntArrayArrayArray723[0];
            var20 = -(var21[var12][var15] + var21[var13][var14] + (var21[var12][var14] - -var21[var13][var15]) >> 2) + var19;
         }

         var21 = (int[][])null;
         if(3 > var8) {
            var21 = Class44.anIntArrayArrayArray723[1 + var8];
         }

         Class136 var22 = var0.method1696(var3, var16, var18, var5, var19, var21, false, (LDIndexedSprite)null, (byte)-69, true, var17);
         Class141.method2047(var22.aClass109_Sub1_1770, -var4 + var16, var20, var17 + -var2);
   }

   static final void method841(boolean var0) {
      try {
         SceneGraphNode.aClass11Array1836 = null;
         Class3_Sub13_Sub1.method171(-101, InvType.mainScreenInterface, 0, Class23.canvasWid, 0, -1, ItemPile.canvasHei, 0, 0);
         if(SceneGraphNode.aClass11Array1836 != null) {
            Class47.method1095(0, Class65943149.anInt1082, AbstractObjectCache.anInt3602, SceneGraphNode.aClass11Array1836, Class23.canvasWid, -1412584499, 0, ItemPile.canvasHei, (byte)73, PacketParser.aClass11_88.anInt292);
            SceneGraphNode.aClass11Array1836 = null;
         }

         if(!var0) {
            method844();
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "al.G(" + var0 + ')');
      }
   }

   static final js5Worker method842(boolean var0, boolean var1, boolean var2, int index) {
		FileSystem var5 = null;
		if (null != Class101.cacheFile) {
			var5 = new FileSystem(index, Class101.cacheFile, Class163_Sub2.indexFiles[index], 1000000);
		}

		//Buffer.aClass151_Sub1Array2601[var3] = Class151.aClass8_1936.method839(var3, Class86.referenceCache, var5);
		//if (var1) {
		//	Buffer.aClass151_Sub1Array2601[var3].method2101(true);
		//}

		return new js5Worker(var5, Class86.referenceCache, index, var0, var2, var1);//js5 class originaly
   }

   static final Class75_Sub1 method843(int var0, Buffer var1) {
      try {
         return var0 != -5232?(Class75_Sub1)null:new Class75_Sub1(var1.getShort(), var1.getShort(), var1.getShort(), var1.getShort(), var1.getMidInt(), var1.getUByte());
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "al.D(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

   static final void method844() {
         if(null == Class3_Sub13_Sub17.anIntArray3212 || null == Class75_Sub2.anIntArray2639) {
            Class3_Sub13_Sub17.anIntArray3212 = new int[256];
            Class75_Sub2.anIntArray2639 = new int[256];

            for(int var1 = 0; 256 > var1; ++var1) {
               double var2 = (double)var1 / 255.0D * 6.283185307179586D;
               Class3_Sub13_Sub17.anIntArray3212[var1] = (int)(Math.sin(var2) * 4096.0D);
               Class75_Sub2.anIntArray2639[var1] = (int)(4096.0D * Math.cos(var2));
            }
         }
   }

   static final void method845(boolean var0) {
         if(var0 == !Class139.aBoolean1827) {
            Class139.aBoolean1827 = var0;
            Class104.method1626((byte)-126);
         }
   }

   static final boolean method846(int var0, int var1, int var2) {
      int var3 = Class81.anIntArrayArrayArray1142[var0][var1][var2];
      if(var3 == -Class3_Sub28_Sub1.anInt3539) {
         return false;
      } else if(var3 == Class3_Sub28_Sub1.anInt3539) {
         return true;
      } else {
         int var4 = var1 << 7;
         int var5 = var2 << 7;
         if(Class3_Sub13_Sub37.method349(var4 + 1, Class44.anIntArrayArrayArray723[var0][var1][var2], var5 + 1) && Class3_Sub13_Sub37.method349(var4 + 128 - 1, Class44.anIntArrayArrayArray723[var0][var1 + 1][var2], var5 + 1) && Class3_Sub13_Sub37.method349(var4 + 128 - 1, Class44.anIntArrayArrayArray723[var0][var1 + 1][var2 + 1], var5 + 128 - 1) && Class3_Sub13_Sub37.method349(var4 + 1, Class44.anIntArrayArrayArray723[var0][var1][var2 + 1], var5 + 128 - 1)) {
            Class81.anIntArrayArrayArray1142[var0][var1][var2] = Class3_Sub28_Sub1.anInt3539;
            return true;
         } else {
            Class81.anIntArrayArrayArray1142[var0][var1][var2] = -Class3_Sub28_Sub1.anInt3539;
            return false;
         }
      }
   }

}
