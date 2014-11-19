
final class Class3_Sub28_Sub11 extends NodeSub {

   private Hashtable aClass130_3636;
  // static jString aClass94_3637 = jString.createJString(")4p=");
   static boolean aBoolean3641 = false;
   static int anInt3642 = 0;
   static jString aClass94_3643 = jString.createJString("Loading fonts )2 ");
   static int anInt3644 = 0;
   static jString aClass94_3645 = jString.createJString(" is already on your friend list)3");


   static final int method599(int var0, js5 var1) {
	   int var2 = 0;
	   if(var1.method2144(Class154.anInt1966)) {
		   ++var2;
	   }

	   //if(var1.method2144(0, Class79.anInt1124)) {
	   //  ++var2;
	   //}

	   return var2;
   }

   final int method600(int var1, int var2, byte var3) {
      try {
         if(this.aClass130_3636 != null) {
            if(var3 != -29) {
               this.method604((jString)null, 110);
            }

            IntegerNode var4 = (IntegerNode)this.aClass130_3636.get((long)var1);
            return null == var4?var2:var4.value;
         } else {
            return var2;
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "lk.Q(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   private final void method601(Buffer var1, int var2, byte var3) {
      try {
         if(var3 < -2) {
            if(249 == var2) {
               int var4 = var1.getUByte();
               int var5;
               if(this.aClass130_3636 == null) {
                  var5 = Class95.method1585(var4);
                  this.aClass130_3636 = new Hashtable(var5);
               }

               for(var5 = 0; var4 > var5; ++var5) {
                  boolean var6 = 1 == var1.getUByte();
                  int var7 = var1.getMidInt();
                  Object var8;
                  if(!var6) {
                     var8 = new IntegerNode(var1.getInt());
                  } else {
                     var8 = new StringNode(var1.getString());
                  }

                  this.aClass130_3636.put((Node)var8, (long)var7);
               }
            }

         }
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "lk.P(" + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void method603(int var0, int var1, int var2, jInterface var3, boolean var4) {
      try {
         int var5 = var3.anInt168;
         int var6 = var3.anInt193;
         if(var1 != 13987) {
            client.method602(-115, 65, (js5)null);
         }

         if(-1 != ~var3.aByte304) {
            if(~var3.aByte304 != -2) {
               if(~var3.aByte304 == -3) {
                  var3.anInt168 = var3.width * var2 >> 14;
               } else if(var3.aByte304 == 3) {
                  if(~var3.type != -3) {
                     if(var3.type == 7) {
                        var3.anInt168 = 115 * var3.width + var3.invSpritePadX * (-1 + var3.width);
                     }
                  } else {
                     var3.anInt168 = var3.width * 32 - -((var3.width - 1) * var3.invSpritePadX);
                  }
               }
            } else {
               var3.anInt168 = var2 + -var3.width;
            }
         } else {
            var3.anInt168 = var3.width;
         }

         if(-1 == ~var3.aByte241) {
            var3.anInt193 = var3.height;
         } else if(var3.aByte241 == 1) {
            var3.anInt193 = -var3.height + var0;
         } else if(~var3.aByte241 == -3) {
            var3.anInt193 = var0 * var3.height >> 14;
         } else if(var3.aByte241 == 3) {
            if(~var3.type == -3) {
               var3.anInt193 = (var3.height + -1) * var3.invSpritePadY + var3.height * 32;
            } else if(~var3.type == -8) {
               var3.anInt193 = var3.height * 12 + (-1 + var3.height) * var3.invSpritePadY;
            }
         }

         if(-5 == ~var3.aByte304) {
            var3.anInt168 = var3.anInt216 * var3.anInt193 / var3.anInt160;
         }

         if(var3.aByte241 == 4) {
            var3.anInt193 = var3.anInt160 * var3.anInt168 / var3.anInt216;
         }

         if(LookupTable.qaoptestEnabled && (-1 != ~jInterface.getInterfaceClickMask(var3).clickMask || ~var3.type == -1)) {
            if(var3.anInt193 < 5 && 5 > var3.anInt168) {
               var3.anInt193 = 5;
               var3.anInt168 = 5;
            } else {
               if(~var3.anInt168 >= -1) {
                  var3.anInt168 = 5;
               }

               if(0 >= var3.anInt193) {
                  var3.anInt193 = 5;
               }
            }
         }

         if(1337 == var3.clientCode) {
            UnderlayType.aClass11_2091 = var3;
         }

         if(var4 && null != var3.anObjectArray235 && (~var5 != ~var3.anInt168 || var3.anInt193 != var6)) {
            InterfaceListener var7 = new InterfaceListener();
            var7.objectData = var3.anObjectArray235;
            var7.aClass11_2449 = var3;
            Class110.aClass61_1471.insertBack(var7);
         }

      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "lk.E(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ',' + var4 + ')');
      }
   }

   final jString method604(jString var1, int var3) {
         if(this.aClass130_3636 == null) {
            return var1;
         } else {
            StringNode var4 = (StringNode)this.aClass130_3636.get((long)var3);
            return null != var4?var4.value:var1;
         }
   }

   public static void method605(int var0) {
      try {
        //aClass94_3637 = null;
         aClass94_3643 = null;
         if(var0 != 221301966) {
            method603(-111, -64, -10, (jInterface)null, false);
         }

         aClass94_3645 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "lk.D(" + var0 + ')');
      }
   }

   static final void method606(int var0, Class3_Sub9 var1, int var2, int var3, int var4, int var5) {
      try {
         if(var5 > 44) {
            if(~var1.anInt2332 != 0 || var1.anIntArray2333 != null) {
               int var6 = 0;
               if(var1.anInt2321 < var0) {
                  var6 += -var1.anInt2321 + var0;
               } else if(var1.anInt2326 > var0) {
                  var6 += var1.anInt2326 - var0;
               }

               if(var1.anInt2307 >= var4) {
                  if(var4 < var1.anInt2308) {
                     var6 += -var4 + var1.anInt2308;
                  }
               } else {
                  var6 += -var1.anInt2307 + var4;
               }

               if(0 != var1.anInt2328 && ~var1.anInt2328 <= ~(var6 - 64) && 0 != Class14.areaSoundsVolume && var2 == var1.anInt2314) {
                  var6 -= 64;
                  if(var6 < 0) {
                     var6 = 0;
                  }

                  int var7 = (-var6 + var1.anInt2328) * Class14.areaSoundsVolume / var1.anInt2328;
                  if(var1.aClass3_Sub24_Sub1_2312 == null) {
                     if(-1 >= ~var1.anInt2332) {
                        Class135 var8 = Class135.method1811(AbstractMouseWheel.cacheIndex4, var1.anInt2332, 0);
                        if(null != var8) {
                           Class3_Sub12_Sub1 var9 = var8.method1812().method151(Class27.aClass157_524);
                           Class3_Sub24_Sub1 var10 = Class3_Sub24_Sub1.method437(var9, 100, var7);
                           var10.method429(-1);
                           Class3_Sub26.aClass3_Sub24_Sub2_2563.method457(var10);
                           var1.aClass3_Sub24_Sub1_2312 = var10;
                        }
                     }
                  } else {
                     var1.aClass3_Sub24_Sub1_2312.method419(var7);
                  }

                  if(null != var1.aClass3_Sub24_Sub1_2315) {
                     var1.aClass3_Sub24_Sub1_2315.method419(var7);
                     if(!var1.aClass3_Sub24_Sub1_2315.method82(0)) {
                        var1.aClass3_Sub24_Sub1_2315 = null;
                     }
                  } else if(var1.anIntArray2333 != null && ~(var1.anInt2316 -= var3) >= -1) {
                     int var13 = (int)((double)var1.anIntArray2333.length * Math.random());
                     Class135 var14 = Class135.method1811(AbstractMouseWheel.cacheIndex4, var1.anIntArray2333[var13], 0);
                     if(null != var14) {
                        Class3_Sub12_Sub1 var15 = var14.method1812().method151(Class27.aClass157_524);
                        Class3_Sub24_Sub1 var11 = Class3_Sub24_Sub1.method437(var15, 100, var7);
                        var11.method429(0);
                        Class3_Sub26.aClass3_Sub24_Sub2_2563.method457(var11);
                        var1.anInt2316 = (int)((double)(-var1.anInt2310 + var1.anInt2325) * Math.random()) + var1.anInt2310;
                        var1.aClass3_Sub24_Sub1_2315 = var11;
                     }
                  }

               } else {
                  if(null != var1.aClass3_Sub24_Sub1_2312) {
                     Class3_Sub26.aClass3_Sub24_Sub2_2563.method461(var1.aClass3_Sub24_Sub1_2312);
                     var1.aClass3_Sub24_Sub1_2312 = null;
                  }

                  if(var1.aClass3_Sub24_Sub1_2315 != null) {
                     Class3_Sub26.aClass3_Sub24_Sub2_2563.method461(var1.aClass3_Sub24_Sub1_2315);
                     var1.aClass3_Sub24_Sub1_2315 = null;
                  }

               }
            }
         }
      } catch (RuntimeException var12) {
         throw Class44.method1067(var12, "lk.O(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   final void method608(Buffer var2) {
         while(true) {
            int var3 = var2.getUByte();
            if(0 == var3) {
               return;
            }

            this.method601(var2, var3, (byte)-5);
         }
   }

}
