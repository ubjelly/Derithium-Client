import java.util.Calendar;
import java.util.TimeZone;

final class AnimationLoader extends NodeSub {

   static js5 aClass153_3580;
   static Calendar aCalendar3581 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   static jString aClass94_3584 = jString.createJString("K");
   static jString aClass94_3586 = jString.createJString("K");
   static int[] anIntArray3587;
   Animation[] animations;
   static int anInt3589;
   static int anInt3590 = -1;
   static int anInt3591 = 0;
   static int[] anIntArray3592 = new int[256];
   static volatile boolean canvasReplaceRecommended = false;


   static final void method556(int var0, int var1, int var2, byte var3, int var4, int var5) {
      try {
         if(var3 < -93) {
            int var8 = var2 * var2;
            int var6 = 0;
            int var7 = var1;
            int var11 = var8 << 1;
            int var9 = var1 * var1;
            int var12 = var1 << 1;
            int var10 = var9 << 1;
            int var13 = var8 * (-var12 + 1) + var10;
            int var14 = -(var11 * (-1 + var12)) + var9;
            int var16 = var9 << 2;
            int var17 = var10 * ((var6 << 1) + 3);
            int var15 = var8 << 2;
            int var18 = ((var1 << 1) - 3) * var11;
            int var19 = var16 * (1 + var6);
            int var21;
            int var22;
            if(var5 >= Class159.anInt2020 && Class57.anInt902 >= var5) {
               var21 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var2 + var4, (byte)0, Class101.anInt1425);
               var22 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, -var2 + var4, (byte)0, Class101.anInt1425);
               Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var5], var22, var21, var0);
            }

            for(int var20 = var15 * (-1 + var1); 0 < var7; var20 -= var15) {
               --var7;
               if(-1 < ~var13) {
                  while(0 > var13) {
                     ++var6;
                     var13 += var17;
                     var14 += var19;
                     var19 += var16;
                     var17 += var16;
                  }
               }

               var21 = var5 - var7;
               if(var14 < 0) {
                  var14 += var19;
                  var13 += var17;
                  var17 += var16;
                  var19 += var16;
                  ++var6;
               }

               var14 += -var18;
               var18 -= var15;
               var13 += -var20;
               var22 = var7 + var5;
               if(~Class159.anInt2020 >= ~var22 && ~Class57.anInt902 <= ~var21) {
                  int var23 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var6 + var4, (byte)0, Class101.anInt1425);
                  int var24 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, -var6 + var4, (byte)0, Class101.anInt1425);
                  if(var21 >= Class159.anInt2020) {
                     Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var21], var24, var23, var0);
                  }

                  if(~Class57.anInt902 <= ~var22) {
                     Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var22], var24, var23, var0);
                  }
               }
            }

         }
      } catch (RuntimeException var25) {
         throw Class44.method1067(var25, "cl.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   static final long method557(int var0, int var1, int var2) {
      GroundTile var3 = Class75_Sub2.groundTiles[var0][var1][var2];
      if(var3 == null) {
         return 0L;
      } else {
         for(int var4 = 0; var4 < var3.anInt2223; ++var4) {
            Class25 var5 = var3.aClass25Array2221[var4];
            if((var5.aLong498 >> 29 & 3L) == 2L && var5.anInt483 == var1 && var5.anInt478 == var2) {
               return var5.aLong498;
            }
         }

         return 0L;
      }
   }

   public static void method558(int var0) {
      try {
         anIntArray3592 = null;
         aClass94_3586 = null;
         aClass153_3580 = null;
         anIntArray3587 = null;
         if(var0 != -29679) {
            method556(-76, 24, -17, (byte)-85, 58, -87);
         }
         aClass94_3584 = null;
         aCalendar3581 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "cl.B(" + var0 + ')');
      }
   }

   final boolean method559(int var2) {
	   return this.animations[var2].aBoolean1386;
   }

   static final void method560(int var0) {
      try {
         for(int var1 = 0; ~var1 > -6; ++var1) {
            Class104.aBooleanArray2169[var1] = false;
         }

         if(var0 != -21556) {
            method556(21, 1, 64, (byte)40, -34, -70);
         }

         Class75.anInt1105 = 0;
         Class163_Sub2_Sub1.anInt4014 = 0;
         NpcDefinition.anInt1252 = -1;
         LongNode.anInt2293 = -1;
         GrandExchangeItem.anInt1753 = 1;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "cl.A(" + var0 + ')');
      }
   }

   AnimationLoader(js5 var1, js5 var2, int var3, boolean var4, boolean new_header) {
	   Deque var5 = new Deque();
	   int var6 = var1.getChildCount(var3);
	   this.animations = new Animation[var6];
	   int[] var7 = var1.getChildEntries(var3);
	   int var8 = 0;
	   while(~var8 > ~var7.length) {
		   byte[] var9 = var1.getFile(var3, var7[var8]);
		   int var11 = 255 & var9[1] | (var9[0] & 255) << 8;
		   TransformList var12 = (TransformList)var5.getFirst();
		   TransformList var10 = null;
		   while(true) {
			   if(var12 != null) {
				   if(var12.id != var11) {
					   var12 = (TransformList)var5.getNext();
					   continue;
				   }
				   var10 = var12;
			   }
			   if(null == var10) {
				   if (client.clientLoad == 464 && !new_header) {
					   byte[] var13;// = //var2.method2138(var11);
	            	   if(!var4) {
	            		   var13 = var2.method2140(0, var11, 0);
	            	   } else {
	            		   var13 = var2.method2140(var11, 0, 0);
	            	   }
	            	   var10 = new TransformList(var11, var13, new_header);
	            	   var5.insertBack(var10);
				   } else {
					   byte[] var13 = var2.method2138(var11);
					   var10 = new TransformList(var11, var13, new_header);
	            	   var5.insertBack(var10);
				   }
			   }
			   this.animations[var7[var8]] = new Animation(var9, var10, new_header);
			   ++var8;
			   break;
		   }
	   }
   }

   final boolean method561(int var1) {
	   return this.animations[var1].aBoolean1382;
   }

	static final AnimationLoader list(int var0, int var1, boolean usenew) {
		AnimationLoader var2 = (AnimationLoader) Class159.aClass93_2016.get((long) var0);
		if (var2 != null)
			return var2;
		js5 skeletons = Class131.skeletonsFetcher;
		js5 skins = Class7.skinsFetcher;
		boolean new_decoding = skeletons.getFile(var0, 0) == null || usenew;
		if (client.clientLoad < 602) {
			if (new_decoding) {
				skins = client.skins602;
				skeletons = client.skeletons602;
			}
		}
		var2 = Class47.method1089(skeletons, false, skins, var0, new_decoding);
		if (null != var2) {
			Class159.aClass93_2016.put(var2, (long) var0);
		}
		return var2;
	}

}
