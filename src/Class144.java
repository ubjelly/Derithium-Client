
public class Class144 {

   static int anInt1881 = 0;
   static jString aClass94_1885 = jString.createJString("cookiehost");
   static int anInt1887;
   private static jString aClass94_1888 = jString.createJString("Your ignore list is full)3 Max of 100 users)3");
   static jString aClass94_1884 = aClass94_1888;

   static final void method2065(byte var0, js5 var1, js5 var2) {
      try {
         Class3_Sub13_Sub19.aClass153_3227 = var1;
         if(var0 <= -103) {
            AnimationDefinition.aClass153_1852 = var2;
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "u.D(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   static final void method2067(boolean var0) {
      try {
         if(!var0) {
            for(Class3_Sub28_Sub2 var1 = (Class3_Sub28_Sub2)Class3_Sub13_Sub15.aClass61_3177.getFirst(); null != var1; var1 = (Class3_Sub28_Sub2)Class3_Sub13_Sub15.aClass61_3177.getNext()) {
               Class140_Sub2 var2 = var1.aClass140_Sub2_3545;
               if(~var2.anInt2717 == ~Class26.plane && !var2.aBoolean2718) {
                  if(~var2.anInt2703 >= ~Class44.loopCycle) {
                     var2.method1955(true, DisplayModeInformation.anInt1446);
                     if(!var2.aBoolean2718) {
                        Class20.method907(var2.anInt2717, var2.anInt2716, var2.anInt2710, var2.anInt2712, 60, var2, 0, -1L, false);
                     } else {
                        var1.unlink();
                     }
                  }
               } else {
                  var1.unlink();
               }
            }

         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "u.G(" + var0 + ')');
      }
   }

   static final void method2068(NpcDefinition var0, int var1, int var2, int var3, int var4) {
      try {
         if(Class3_Sub13_Sub34.anInt3415 < 400) {
            if(var0.anIntArray1292 != null) {
               var0 = var0.method1471((byte)66);
            }

            if(null != var0) {
               if(var0.aBoolean1270) {
                  if(var2 > -83) {
                     aClass94_1884 = (jString)null;
                  }

                  jString var5 = var0.aClass94_1273;
                  if(0 != var0.anInt1260) {
                     jString var6 = Class27.aClass94_525;
                     var5 = client.method903(new jString[]{var5, Class72.method1295(var0.anInt1260, (byte)-122, TextureLoader.selfPlayer.combatLevel), Class72.aClass94_1072, var6, Class72.method1298(var0.anInt1260), Class3_Sub9.aClass94_2335});
                  }

                  if(-2 == ~Class164_Sub1.anInt3012) {
                     SubScript.method1177((short)26, Class99.anInt1403, (long)var3, client.method903(new jString[]{client.aClass94_378, AbstractSprite.aClass94_3702, var5}), var1, Class3_Sub13_Sub32.aClass94_3388, var4);
                  } else if(!SceneGraphNode.aBoolean1837) {
                     jString[] var11 = var0.aClass94Array1259;
                     if(Class123.aBoolean1656) {
                        var11 = OverridedInterface.method822(19406, var11);
                     }

                     int var7;
                     if(var11 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                           if(var11[var7] != null && (!var11[var7].method1531(Class3_Sub13_Sub36.aClass94_3427))) {
                              byte var8 = 0;
                              if(var7 == 0) {
                                 var8 = 17;
                              }

                              if(-2 == ~var7) {
                                 var8 = 16;
                              }

                              int var9 = -1;
                              if(~var7 == -3) {
                                 var8 = 4;
                              }

                              if(var7 == 3) {
                                 var8 = 19;
                              }

                              if(var0.anInt1296 == var7) {
                                 var9 = var0.anInt1253;
                              }

                              if(~var7 == ~var0.anInt1289) {
                                 var9 = var0.anInt1278;
                              }

                              if(~var7 == -5) {
                                 var8 = 2;
                              }

                              SubScript.method1177(var8, var9, (long)var3, client.method903(new jString[]{Class132.aClass94_1738, var5}), var1, var11[var7], var4);
                           }
                        }
                     }

                     if(var11 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                           if(null != var11[var7] && var11[var7].method1531(Class3_Sub13_Sub36.aClass94_3427)) {
                              short var14 = 0;
                              if(var0.anInt1260 > TextureLoader.selfPlayer.combatLevel) {
                                 var14 = 2000;
                              }

                              short var13 = 0;
                              if(var7 == 0) {
                                 var13 = 17;
                              }

                              if(var7 == 1) {
                                 var13 = 16;
                              }

                              if(2 == var7) {
                                 var13 = 4;
                              }

                              if(3 == var7) {
                                 var13 = 19;
                              }

                              if(~var7 == -5) {
                                 var13 = 2;
                              }

                              if(0 != var13) {
                                 var13 += var14;
                              }

                              SubScript.method1177(var13, var0.anInt1298, (long)var3, client.method903(new jString[]{Class132.aClass94_1738, var5}), var1, var11[var7], var4);
                           }
                        }
                     }

                     SubScript.method1177((short)1007, Class131.anInt1719, (long)var3, client.method903(new jString[]{Class132.aClass94_1738, var5}), var1, Class86.aClass94_1180, var4);
                  } else {
                     //Class3_Sub28_Sub9 var12 = -1 == LookupTable.anInt1038?null:Deque.method1210(64, LookupTable.anInt1038);
                     //if(~(2 & Class164.anInt2051) != -1 && (var12 == null || var0.method1475(LookupTable.anInt1038, var12.anInt3614) != var12.anInt3614)) {
                	  if(~(2 & Class164.anInt2051) != -1) {
                        SubScript.method1177((short)45, anInt1887, (long)var3, client.method903(new jString[]{Class40.aClass94_676, AbstractSprite.aClass94_3702, var5}), var1, Class3_Sub28_Sub9.aClass94_3621, var4);
                     }
                  }

               }
            }
         }
      } catch (RuntimeException var10) {
         throw Class44.method1067(var10, "u.A(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   public static void method2070(byte var0) {
      try {
         aClass94_1884 = null;
         aClass94_1888 = null;
         if(var0 < 0) {
            anInt1881 = -60;
         }

         aClass94_1885 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "u.F(" + var0 + ')');
      }
   }

}
