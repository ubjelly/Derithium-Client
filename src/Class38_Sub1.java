
final class Class38_Sub1 extends Class38 {

   static int[][][] anIntArrayArrayArray2609;
   static jString aClass94_2610 = jString.createJString(")1o");
   static String aString2611;
   static int anInt2612;
   static Class15 aClass15_2613;
   static int anInt2614 = 0;
   static boolean aBoolean2615 = false;
   static int systemUpdateCycle = 0;
   static int randomSeed;


   static final void method1030(jInterface var0, AbstractSprite map_flag, int var2, int var3, int var4, int var6) {
	   /*if(null != map_flag) {
		   int var9 = var3 * var3 - -(var2 * var2);
           int var7 = 2047 & Class3_Sub13_Sub8.anInt3102 + SpotAnimation.anInt531;
           int var8 = Math.max(var0.anInt168 / 2, var0.anInt193 / 2) - -10;
           if(var8 * var8 >= var9) {
              int var10 = Rasterizer.sineTable[var7];
              var10 = var10 * 256 / (Class164_Sub2.anInt3020 - -256);
              int var11 = Rasterizer.cosineTable[var7];
              var11 = 256 * var11 / (256 + Class164_Sub2.anInt3020);
              int var12 = var10 * var2 - -(var3 * var11) >> 16;
              int var13 = var11 * var2 + -(var3 * var10) >> 16;
              if(!HDToolkit.openGLEnabled) {
                 ((LDSprite)map_flag).method666(var0.anInt168 / 2 + var6 - -var12 + -(map_flag.trimWidth / 2), -(map_flag.trimHeight / 2) + var0.anInt193 / 2 + var4 + -var13, client.mapbackSource, client.mapbackDest);
              } else {
                 ((HDSprite)map_flag).method645(var0.anInt168 / 2 + var6 + var12 - map_flag.trimWidth / 2, var0.anInt193 / 2 + var4 - (var13 + map_flag.trimHeight / 2), (HDSprite)var0.method866((byte)-113, false));
              }

           }
        }*/
	   if(null != map_flag) {
		   int distance = var3 * var3 + var2 * var2;
		   int yaw = 0x7ff & Class3_Sub13_Sub8.anInt3102 + SpotAnimation.cameraYaw;
           if(distance <= 6400) {
        	   int sineYaw = Rasterizer.sineTable[yaw];
        	   sineYaw = sineYaw * 256 / (Class164_Sub2.anInt3020 + 256);
        	   int cosineYaw = Rasterizer.cosineTable[yaw];
        	   cosineYaw = 256 * cosineYaw / (256 + Class164_Sub2.anInt3020);
        	   int var12 = sineYaw * var2 + (var3 * cosineYaw) >> 16;
        	   int var13 = cosineYaw * var2 - (var3 * sineYaw) >> 16;
        	   if(!HDToolkit.openGLEnabled) {
        		   ((LDSprite)map_flag).method643((-(map_flag.trimWidth / 2) + (94 + var6)
							- -var12 - -4), -var13
							+ (83 + (var4 - map_flag.trimHeight / 2) + -4));
        		   //((LDSprite)map_flag).method643(var0.width / 2 + var6 + var12 - (map_flag.trimWidth / 2), -(map_flag.trimHeight / 2) + var0.height / 2 + var4 - var13);
        		   //System.out.println(var0.width / 2 + var6 + var12 - (map_flag.trimWidth / 2));
        		  // ((LDSprite)map_flag).method666(var0.anInt168 / 2 + var6 - -var12 + -(map_flag.trimWidth / 2), -(map_flag.trimHeight / 2) + var0.anInt193 / 2 + var4 + -var13, client.mapbackSource, client.mapbackDest);
        	   } else {
        		   ((HDSprite)map_flag).method643((-(map_flag.trimWidth / 2) + (94 + var6)
							- -var12 - -4), -var13
							+ (83 + (var4 - map_flag.trimHeight / 2) + -4));
        		  // ((HDSprite)map_flag).method645(var0.width / 2 + var6 + var12 - map_flag.trimWidth / 2, var0.height / 2 + var4 - (var13 + map_flag.trimHeight / 2), (HDSprite)var0.method866((byte)-113, false));
        	   }

           }
        }
   }

   static final int method1031(int var0, int var1) {
      try {
         if(var1 != 2) {
            aClass94_2610 = (jString)null;
         }

         return var0 >>> 7;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "em.C(" + var0 + ',' + var1 + ')');
      }
   }

   public static void method1032(boolean var0) {
      try {
         anIntArrayArrayArray2609 = (int[][][])null;
         aString2611 = null;
         aClass94_2610 = null;
         aClass15_2613 = null;
         if(var0) {
            method1032(true);
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "em.A(" + var0 + ')');
      }
   }

}
