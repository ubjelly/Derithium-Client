import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.zip.CRC32;

public final class client extends GameShell {
	
	public static int indexCount = 26;

   static Hashtable interfaceRecentChanges = new Hashtable(16);
	static Deque aClass60_2164 = new Deque();
	static Buffer aClass3_Sub12_1667;
	static int js5ErrorCount;
	static Object anObject821 = new Object();
	static int anInt1465 = 0;
   static int anInt2195;
   private static jString aClass94_2198 = jString.createJString("cyan:");
   static jString mapback = jString.createJString("mapback");
   static int mapbackId = -1;
   static AbstractIndexedSprite mapbackSprte;
   static int mapscenesId = -1;
   static jString mapscene = jString.createJString("mapscene");
   static AbstractSprite[] mapscenes;
   static AbstractSprite infinitySymbol;
   static int infinitySymbolId = -1;
   static jString infinitySymbolString = jString.createJString("infinity");
   static AbstractSprite[] set_464, set_530, set_562, set_602;
   static int set_464_id, set_530_id, set_562_id, set_602_id;
   static AbstractSprite[] revision_images;
   static int revision_images_id;
   static int[] mapbackDest;
   static int[] mapbackSource;
   static Deque updateServerList = new Deque();
   static int[] compassDest;
   static int[] compassSource;
   static jString aClass94_2196 = aClass94_2198;
   static jString aClass94_2197 = aClass94_2198;
   static Class3_Sub11[][] aClass3_Sub11ArrayArray2199;
   static int[] anIntArray2200;
   public static boolean aBoolean2201;
   private static Font smallFont;
   private static Font boldFont;
   private static Font regularFont;
   public static js5Worker modelsCache602, skeletons602, skins602;
   public static int clientLoad = 464;
   public static boolean newHits = false, newMenus = false, newHealthbars = false, newMarkers = false, newKeys = true;
   public static boolean closed_revision_choosing = true;
   
   public static int getAnimationConfig(int id) {
	   if (clientLoad == 602) {
			return 33;
		} else if (clientLoad == 562) {
			return 27;
		} else if (clientLoad == 530) {
			return 30;
		}
		return 12;
	}
   
   public static int getGraphicConfig(int id) {
	   if (clientLoad == 602) {
			return 34;
		} else if (clientLoad == 562) {
			return 28;
		} else if (clientLoad == 530) {
			return 31;
		}
		return 13;
	}
   
   public static int getItemsConfig(int id) {
	   if (clientLoad == 602) {
			return 32;
		} else if (clientLoad == 562) {
			return 26;
		} else if (clientLoad == 530) {
			return 29;
		}
		return 10;
   }
   
   public static js5 getModelJs5(int id) {
	   boolean higher_revision = id > 25612;
	   if (clientLoad < 602) {
		   if (higher_revision) {
			   return modelsCache602;
		   }
	   }
	   return Class159.cacheIndex7;
   }
   
   public static int getNPCConfig(int id) {
		if (clientLoad > 464) {
			return 35;
		}
		return 9;
	}
   
   public static int getModelsIDX() {
	   if (clientLoad == 602) {
			return 24;
		} else if (clientLoad == 562) {
			return 18;
		} else if (clientLoad == 530) {
			return 21;
		}
		return 7;
	}

	public static int getSkinsIDX() {
		if (clientLoad == 602) {
			return 23;
		} else if (clientLoad == 562) {
			return 17;
		} else if (clientLoad == 530) {
			return 20;
		}
		return 1;
	}

	public static int getSkeletonsIDX() {
		if (clientLoad == 602) {
			return 22;
		} else if (clientLoad == 562) {
			return 16;
		} else if (clientLoad == 530) {
			return 19;
		}
		return 0;
	}

	static jString aClass94_405 = jString.createJString("Feb");

	static jString aClass94_404 = jString.createJString("Mar");

	static jString[] aClass94Array358 = new jString[]{client.aClass94_392, aClass94_405, aClass94_404, client.aClass94_401, client.aClass94_365, client.aClass94_385, client.aClass94_376, client.aClass94_363, client.aClass94_394, client.aClass94_391, client.aClass94_397, client.aClass94_388};

	static jString aClass94_401 = jString.createJString("Apr");

	static jString aClass94_397 = jString.createJString("Nov");

	static jString aClass94_392 = jString.createJString("Jan");

	static int anInt396;

	static jString aClass94_388 = jString.createJString("Dec");

	static int anInt384 = 0;

	//static byte[][][] aByteArrayArrayArray383;

	static jString aClass94_385 = jString.createJString("Jun");

	static jString aClass94_391 = jString.createJString("Oct");

	static jString aClass94_394 = jString.createJString("Sep");

	static jString aClass94_378 = null;

	//static jString aClass94_374 = client.aClass94_366;

	static jString aClass94_361 = jString.createJString("Discard");

	static jString aClass94_363 = jString.createJString("Aug");

	static jString aClass94_376 = jString.createJString("Jul");

	//static jString aClass94_366 = jString.createJString("Loaded world list data");
	static CRC32 aCRC32_377 = new CRC32();

	static jString aClass94_365 = jString.createJString("May");

	static volatile int anInt362 = 0;

	static int anInt377 = 0;

	static int anInt380;

	static int[] anIntArray356 = new int[]{1, 0, -1, 0};

   
   final void mainRedraw(int var1) {
      try {
         if(~Class143.gameState != -1001) {
            boolean var2 = Npc.method1988();
            if(var2 && Class83.aBoolean1158 && Class44_Sub1.aClass155_2627 != null) {
               Class44_Sub1.aClass155_2627.method2158();
            }

            if((30 == Class143.gameState || 10 == Class143.gameState) && (AnimationLoader.canvasReplaceRecommended || ~Class53.aLong866 != -1L && Class53.aLong866 < TimeUtil.currentTimeMillis())) {
               SceneGraphNode.method1862(AnimationLoader.canvasReplaceRecommended, Class83.getDisplayMode(), Class3_Sub13.fullscreenFrameWidth, Class3_Sub13_Sub5.fullscreenFrameHeight);
            }

            int var4;
            int var5;
            if(null == Class3_Sub13_Sub10.fullscreenFrame) {
               Object var3;
               if(Class3_Sub13_Sub10.fullscreenFrame != null) {
                  var3 = Class3_Sub13_Sub10.fullscreenFrame;
               } else if(Class3_Sub13_Sub7.resizableFrame != null) {
                  var3 = Class3_Sub13_Sub7.resizableFrame;
               } else {
                  var3 = Class38.gameSignlink.thisApplet;
               }

               var4 = ((Container)var3).getSize().width;
               var5 = ((Container)var3).getSize().height;
               if(var3 == Class3_Sub13_Sub7.resizableFrame) {
                  Insets var6 = Class3_Sub13_Sub7.resizableFrame.getInsets();
                  var4 -= var6.right + var6.left;
                  var5 -= var6.top + var6.bottom;
               }

               if(var4 != Class3_Sub9.anInt2334 || ~var5 != ~Class70.anInt1047) {
                  if(Signlink.osName.startsWith("mac")) {
                     Class3_Sub9.anInt2334 = var4;
                     Class70.anInt1047 = var5;
                  } else {
                     Class119.method1729();
                  }

                  Class53.aLong866 = TimeUtil.currentTimeMillis() + 500L;
               }
            }

            if(Class3_Sub13_Sub10.fullscreenFrame != null && !Class3_Sub13_Sub6.focus && (30 == Class143.gameState || 10 == Class143.gameState)) {
               SceneGraphNode.method1862(false, NodeSub.anInt2577, -1, -1);
            }

            boolean var10 = false;
            if(Class3_Sub13_Sub10.fullRedraw) {
               var10 = true;
               Class3_Sub13_Sub10.fullRedraw = false;
            }

            if(var10) {
               Class80.method1396();
            }

            if(HDToolkit.openGLEnabled) {
               for(var4 = 0; ~var4 > -101; ++var4) {
                  GroundItem.aBooleanArray3674[var4] = true;
               }
            }
            /*System.out.println("gamestate: " + Class143.gameState);
            if (!closed_revision_choosing && Class143.gameState == 5) {
        		Class80.drawScreen();
            } else */if(Class143.gameState == 0) {
               Class3_Sub28_Sub1.method533((Color)null, var10, TransformList.aClass94_2464, ClientScript.anInt3684);
            } else if(5 == Class143.gameState) {
            	client.method406(false, getBoldFont());
            } else if(10 != Class143.gameState) {
               if(25 != Class143.gameState && 28 != Class143.gameState) {
                  if(Class143.gameState == 30) {
                     Class49.method1127();
                  } else if(40 == Class143.gameState) {
                     client.drawTextOnScreen(client.method903(new jString[]{Class136.aClass94_1773, Buffer.aClass94_2598, Class154.aClass94_1959}), false);
                  }
               } else if(Class163_Sub2_Sub1.loadingScreenType != 1) {
                  if(Class163_Sub2_Sub1.loadingScreenType == 2) {
                     if(Class3_Sub5.anInt2275 < Class162.modelFetchCount) {
                        Class3_Sub5.anInt2275 = Class162.modelFetchCount;
                     }

                     var4 = (-Class162.modelFetchCount + Class3_Sub5.anInt2275) * 50 / Class3_Sub5.anInt2275 + 50;
                     client.drawTextOnScreen(client.method903(new jString[]{Class3_Sub13_Sub23.aClass94_3282, Class3_Sub13_Sub33.aClass94_3399, Class72.method1298(var4), Class10.aClass94_148}), false);
                  } else {
                     client.drawTextOnScreen(Class3_Sub13_Sub23.aClass94_3282, false);
                  }
               } else {
                  if(~StringNode.anInt2579 > ~Class3_Sub13_Sub24.anInt3293) {
                     StringNode.anInt2579 = Class3_Sub13_Sub24.anInt3293;
                  }

                  var4 = 50 * (StringNode.anInt2579 + -Class3_Sub13_Sub24.anInt3293) / StringNode.anInt2579;
                  client.drawTextOnScreen(client.method903(new jString[]{Class3_Sub13_Sub23.aClass94_3282, Class3_Sub13_Sub33.aClass94_3399, Class72.method1298(var4), Class10.aClass94_148}), false);
               }
            } else {
               TransformList.method381();
            }

            if(HDToolkit.openGLEnabled && -1 != ~Class143.gameState) {
               HDToolkit.method1826();

               for(var4 = 0; ~var4 > ~Class3_Sub28_Sub3.anInt3557; ++var4) {
                  Class163_Sub1_Sub1.aBooleanArray4008[var4] = false;
               }
            } else {
               Graphics var11;
               if((~Class143.gameState == -31 || 10 == Class143.gameState) && ~ClientScript.anInt3689 == -1 && !var10) {
                  try {
                     var11 = InvType.canvas.getGraphics();

                     for(var5 = 0; Class3_Sub28_Sub3.anInt3557 > var5; ++var5) {
                        if(Class163_Sub1_Sub1.aBooleanArray4008[var5]) {
                           Class164_Sub1.aClass158_3009.clip(var11, Class155.anIntArray1969[var5], Player.anIntArray3954[var5], Class3_Sub28_Sub18.anIntArray3768[var5], Entity.anIntArray2794[var5]);
                           Class163_Sub1_Sub1.aBooleanArray4008[var5] = false;
                        }
                     }
                  } catch (Exception var8) {
                     InvType.canvas.repaint();
                  }
               } else if(0 != Class143.gameState) {
                  try {
                     var11 = InvType.canvas.getGraphics();
                     Class164_Sub1.aClass158_3009.drawGraphics(var11, 0, 0);

                     for(var5 = 0; var5 < Class3_Sub28_Sub3.anInt3557; ++var5) {
                        Class163_Sub1_Sub1.aBooleanArray4008[var5] = false;
                     }
                  } catch (Exception var7) {
                     InvType.canvas.repaint();
                  }
               }
            }

            if(Class58.aBoolean913) {
               Class75_Sub3.method1346(26211);
            }

            if(jString.safeMode && 10 == Class143.gameState && 0 != ~InvType.mainScreenInterface) {
               jString.safeMode = false;
               Class119.writePreferences(Class38.gameSignlink);
            }

         }
      } catch (RuntimeException var9) {
         throw Class44.method1067(var9, "client.K(" + var1 + ')');
      }
   }

   static final jInterface method42(jInterface var0) {
      int var1 = jInterface.getInterfaceClickMask(var0).method94();
      if(var1 == 0) {
         return null;
      } else {
         for(int var2 = 0; var2 < var1; ++var2) {
            var0 = Class7.getInterface(var0.parent);
            if(var0 == null) {
               return null;
            }
         }

         return var0;
      }
   }

   public static void method43(boolean var0) {
      try {
         if(!var0) {
            aClass3_Sub11ArrayArray2199 = (Class3_Sub11[][])((Class3_Sub11[][])null);
         }

         anIntArray2200 = null;
         aClass94_2196 = null;
         aClass94_2198 = null;
         interfaceRecentChanges = null;
         aClass94_2197 = null;
         aClass3_Sub11ArrayArray2199 = (Class3_Sub11[][])null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "client.O(" + var0 + ')');
      }
   }

   final void method32(byte var1) {
      try {
         if(HDToolkit.openGLEnabled) {
            HDToolkit.close();
         }

         if(null != Class3_Sub13_Sub10.fullscreenFrame) {
            UpdateServerNode.revertToResizable(Class3_Sub13_Sub10.fullscreenFrame, Class38.gameSignlink);
            Class3_Sub13_Sub10.fullscreenFrame = null;
         }

         if(null != Class38.gameSignlink) {
            Class38.gameSignlink.method1442(getClass(), 0);
         }

         if(null != DisplayModeInformation.aClass67_1443) {
            DisplayModeInformation.aClass67_1443.aBoolean1015 = false;
         }

         DisplayModeInformation.aClass67_1443 = null;
         if(Class3_Sub15.worldConnection != null) {
            Class3_Sub15.worldConnection.close();
            Class3_Sub15.worldConnection = null;
         }

         Class163_Sub1_Sub1.method2215(InvType.canvas, -9320);
         Hashtable.method1783(InvType.canvas);
         if(null != Class38.mouseWheelHandler) {
            Class38.mouseWheelHandler.removeMouseWheel(InvType.canvas);
         }

         Class3_Sub13_Sub1.method167(0);
         MouseHandler.method2090(8);
         Class38.mouseWheelHandler = null;
         if(null != Class44_Sub1.aClass155_2627) {
            Class44_Sub1.aClass155_2627.method2163(false);
         }

         if(null != Class3_Sub21.aClass155_2491) {
            Class3_Sub21.aClass155_2491.method2163(false);
         }

         Class58.js5CacheWorker.method1254(false);
         Class3_Sub13_Sub14.aClass73_3159.method1304(3208);

         try {
            if(Class101.cacheFile != null) {
               Class101.cacheFile.method980(false);
            }

            if(var1 <= 20) {
               return;
            }

            if(Class163_Sub2.indexFiles != null) {
               for(int var2 = 0; var2 < Class163_Sub2.indexFiles.length; ++var2) {
                  if(null != Class163_Sub2.indexFiles[var2]) {
                     Class163_Sub2.indexFiles[var2].method980(false);
                  }
               }
            }

            if(null != Class114.aClass30_1572) {
               Class114.aClass30_1572.method980(false);
            }

            if(null != LookupTable.aClass30_1039) {
               LookupTable.aClass30_1039.method980(false);
            }
         } catch (IOException var3) {
            ;
         }

      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "client.F(" + var1 + ')');
      }
   }

   public final void init() {
      try {
         if(method29()) {
            ObjectDefinition.worldId = Integer.parseInt(getParameter("worldid"));
            Class44.modeWhere = Integer.parseInt(getParameter("modewhere"));
            if(0 > Class44.modeWhere || 1 < Class44.modeWhere) {
               Class44.modeWhere = 0;
            }

            Class3_Sub13_Sub13.modeWhat = Integer.parseInt(getParameter("modewhat"));
            if(~Class3_Sub13_Sub13.modeWhat > -1 || Class3_Sub13_Sub13.modeWhat > 2) {
               Class3_Sub13_Sub13.modeWhat = 0;
            }

            /*String var1 = getParameter("advertsuppressed");
            if(var1 != null && var1.equals("1")) {
               Class3_Sub28_Sub19.advertSuppressed = true;
            } else {
               Class3_Sub28_Sub19.advertSuppressed = false;
            }

            /*try {
               Class3_Sub20.language = Integer.parseInt(getParameter("lang"));
            } catch (Exception var10) {
               Class3_Sub20.language = 0;
            }*/

            /*String var2 = getParameter("objecttag");
            if(var2 != null && var2.equals("1")) {
               Class163_Sub2_Sub1.objectTag = true;
            } else {
               Class163_Sub2_Sub1.objectTag = false;
            }

            String var3 = getParameter("js");
            if(null != var3 && var3.equals("1")) {
               Class3_Sub28_Sub11.aBoolean3641 = true;
            } else {
               Class3_Sub28_Sub11.aBoolean3641 = false;
            }

            /*try {
               Class3_Sub26.anInt2554 = Integer.parseInt(getParameter("affid"));
            } catch (Exception var9) {
               Class3_Sub26.anInt2554 = 0;
            }*/

            /*Class163_Sub2.aClass94_2996 = GrandExchangeItem.aClass94_1745.method1573((byte)126, this);
            if(Class163_Sub2.aClass94_2996 == null) {
               Class163_Sub2.aClass94_2996 = GroundItem.aClass94_3672;
            }*/

            /*String var5 = getParameter("country");
            if(var5 != null) {
               try {
                  OverridedInterface.anInt2607 = Integer.parseInt(var5);
               } catch (Exception var8) {
                  OverridedInterface.anInt2607 = 0;
               }
            }*/

            /*String var6 = getParameter("haveie6");
            if(null != var6 && var6.equals("1")) {
               Class106.aBoolean1451 = true;
            } else {
               Class106.aBoolean1451 = false;
            }*/

            PlainTile.aClient1671 = this;
            method41(765, 32 + Class3_Sub13_Sub13.modeWhat, 464, 503);
         }
      } catch (RuntimeException var11) {
         throw Class44.method1067(var11, "client.init()");
      }
   }

   final void method39() {
         Class119.method1729();
         Class3_Sub13_Sub14.aClass73_3159 = new Class65943149();
         Class58.js5CacheWorker = new Js5CacheWorker();
         if(Class3_Sub13_Sub13.modeWhat != 0) {
            Class3_Sub6.aByteArrayArray2287 = new byte[50][];
         }
	
         InterfaceListener.anInt2451 = ObjectDefinition.worldId;
         AbstractObjectCache.method564(Class38.gameSignlink, 0);
         /*if(Class44.modeWhere != 0) {
            if(Class44.modeWhere == 1) {
               RuntimeException_Sub1.aString2121 = getCodeBase().getHost();
               Class53.anInt867 = ObjectDefinition.worldId + 50000;
               Class3_Sub28_Sub19.anInt3773 = 40000 + ObjectDefinition.worldId;
            } else if(Class44.modeWhere == 2) {
               RuntimeException_Sub1.aString2121 = "66.150.121.228";
               Class53.anInt867 = ObjectDefinition.worldId + '\uc350';
               Class3_Sub28_Sub19.anInt3773 = ObjectDefinition.worldId + '\u9c40';
            }
         } else {
            RuntimeException_Sub1.aString2121 = getCodeBase().getHost();
            Class53.anInt867 = 443;
            Class3_Sub28_Sub19.anInt3773 = '\uaa4a';
         }*/
         
         //RuntimeException_Sub1.aString2121 = "192.99.11.218";
         //RuntimeException_Sub1.aString2121 = "84.32.73.102";
         //RuntimeException_Sub1.aString2121 = "50.187.195.215";
//         RuntimeException_Sub1.serverIp = "127.0.0.1";
         RuntimeException_Sub1.serverIp = "50.187.195.215";
         Class53.anInt867 = 43594;
         Class3_Sub28_Sub19.anInt3773 = 43594;

         //if(1 != Class158.anInt2014) {
            Class15.aShortArrayArray344 = InvType.aShortArrayArray3654;
            CollisionMap.aShortArray1311 = Class3_Sub13_Sub28.aShortArray3349;
            Class101.aShortArrayArray1429 = Class20.aShortArrayArray435;
            InventoryNode.aShortArray2548 = Class164_Sub1.aShortArray3011;
         /*} else {
            Class101.aBoolean1419 = true;
            Class92.anInt1322 = 16777215;
            Class92.fogColor = 0;
            Class15.aShortArrayArray344 = Class118.aShortArrayArray1619;
            Class101.aShortArrayArray1429 = Class75_Sub1.aShortArrayArray2634;
            Class3_Sub25.aShortArray2548 = Class2.aShortArray63;
            CollisionMap.aShortArray1311 = GroundTile.aShortArray2219;
         }*/

         Class26.anInt506 = Class53.anInt867;
         Class162.anInt2036 = Class3_Sub28_Sub19.anInt3773;
         Class38_Sub1.aString2611 = RuntimeException_Sub1.serverIp;
         Class123.anInt1658 = Class3_Sub28_Sub19.anInt3773;
         Class3_Sub13_Sub38.aShortArray3455 = Class3_Sub13_Sub9.aShortArray3110 = Class136.aShortArray1779 = Class3_Sub13_Sub38.aShortArray3453 = new short[256];
         Class140_Sub6.anInt2894 = Class123.anInt1658;
         if(Signlink.anInt1214 == 3 && 2 != Class44.modeWhere) {
            InterfaceListener.anInt2451 = ObjectDefinition.worldId;
         }

         Class3_Sub22.synchronizeKeyCodes();
         Class3_Sub13_Sub4.addKeyboardHandler(InvType.canvas);
         ItemDefinition.addMouseHandler(InvType.canvas);
         Class38.mouseWheelHandler = Class21.createMouseWheel();
         if(null != Class38.mouseWheelHandler) {
            Class38.mouseWheelHandler.addMouseWheel(InvType.canvas);
         }

         Class163_Sub1.anInt2994 = Signlink.anInt1214;

         try {
            if(Class38.gameSignlink.aClass122_1198 != null) {
               Class101.cacheFile = new Class30(Class38.gameSignlink.aClass122_1198, 5200, 0);

               for(int var2 = 0; var2 < client.indexCount; ++var2) {
                  Class163_Sub2.indexFiles[var2] = new Class30(Class38.gameSignlink.aClass122Array1197[var2], 6000, 0);
               }

               Class114.aClass30_1572 = new Class30(Class38.gameSignlink.aClass122_1204, 6000, 0);
               Class86.referenceCache = new FileSystem(255, Class101.cacheFile, Class114.aClass30_1572, 500000);
               LookupTable.aClass30_1039 = new Class30(Class38.gameSignlink.aClass122_1207, 24, 0);
               Class38.gameSignlink.aClass122Array1197 = null;
               Class38.gameSignlink.aClass122_1204 = null;
               Class38.gameSignlink.aClass122_1207 = null;
               Class38.gameSignlink.aClass122_1198 = null;
            }
         } catch (IOException var3) {
            LookupTable.aClass30_1039 = null;
            Class101.cacheFile = null;
            Class114.aClass30_1572 = null;
            Class86.referenceCache = null;
         }

         Class167.aClass94_2083 = Class25.aClass94_485;
   }

   final void method33(int var1) {
      try {
         method43(true);
         jString.method1541(-8635);
         Class38.method1024();
         Class3_Sub28_Sub3.method542((byte)-46);
         Class131.method1792(0);
         GameShell.method26();
         HDToolkit.method1838();
         AbstractTimer.method1766(24241);
         AbstractGraphicsBuffer.method2181(false);
         Class67.method1257(25951);
         HintIcon.method1588((byte)106);
         Buffer.method767(0);
         jSocket.method1463(0);
         Js5CacheWorker.method1242();
         Class65943149.method1306(-16222);
         Class8.method836(-114);
         js5Worker.method2105(false);
         js5.method2119(100);
         Class30.method974(true);
         FileSystem.method1049(true);
         Class93.method1521(3101);
         Npc.method1983(-3);
         PacketBuffer.method808(1);
         CollisionMap.method1491((byte)-124);
         jInterface.method860(126);
         DisplayModeInformation.method1644((byte)121);
         Player.method1982((byte)121);
         Deque.method1217(0);
         AbstractSprite.method634();
         Hashtable.method1774(103);
         AbstractMouseWheel.method2081(0);
         ClanMember.method387(103);
         GrandExchangeItem.method1802(25);
         Class3_Sub24_Sub4.method491((byte)85);
         Class155.method2165(0);
         Class157.method2175();
         PlayerAppearance.method1168(8160);
         AnimationDefinition.method2057((byte)-108);
         Entity.method1974((byte)-116);
         GroundTile.method102(3353893);
         ObjectDefinition.method1687(-11);
         Class3_Sub4.method109();
         NpcDefinition.method1473((byte)103);
         OverridedInterface.method821(26971);
         ClickMaskNode.method91((byte)120);
         Node.method83();
         Queue.method875((byte)106);
         IsaacCipher.method1231(119);
         Class95.method1582(3);
         AnimationLoader.method558(-29679);
         Class145.method2071((byte)59);
         Class46.method1085(-1);
         Class132.method1800((byte)104);
         Class14.method886((byte)35);
         Class119.method1728(-14256);
         Class127.method1754(-79);
         Class17.method905(-24912);
         Class128.method1761((byte)-55);
         RuntimeException_Sub1.method2288(false);
         Class20.method908();
         Class167.method2262((byte)126);
         UpdateServerNode.method592((byte)38);
         BufferedRequest.method597((byte)108);
         Class99.method1598(-126);
         Class84.method1422((byte)24);
         AtmosphereManager.method1507();
         Class40.method1042(true);
         ModelBuilder.method1990();
         Class136.method1815((byte)-45);
         HDModel.method1915();
         ItemDefinition.method1111(3327);
         LDModel.method1948();
         KeyboardHandler.method2085(118);
         MouseHandler.method2088(true);
         Class23.method937(0);
         Class83.method1414();
         Class31.method987();
         Class15.method892(100);
         Canvas_Sub1.method53(0);
         Class162.method2205(-17413);
         Font.method689();
         Class85.method1426(-25247);
         Class3_Sub22.method399();
         Class78.method1369();
         Class3_Sub24_Sub3.method463(-28918);
         Class3_Sub15.method372(true);
         Class38_Sub1.method1032(false);
         Class33.method999();
         LightManager.method1274();
         Light.method1059();
         Class151.method2093(1);
         Class62.method1223(0);
         Class3_Sub28_Sub10.method588();
         Class143.method2063(0);
         GraphicsLD.method1333();
         PacketParser.method828(-90);
         Class49.method1130(99);
         Class3_Sub28_Sub9.method584(0);
         NodeSub.method521(-3);
         Class47.method1096((byte)89);
         UnderlayType.method2276(-2);
         Class139.method1858(-17124);
         OverlayType.method1606();
         IdentityKit.method943(-9893);
         Class3_Sub28_Sub11.method605(221301966);
         Class117.method1721();
         Class115.method1712();
         client.method896(true);
         SpotAnimation.method964(6);
         VarBit.method1388(true);
         Varp.method973((byte)62);
         InvType.method613();
         Class3_Sub28_Sub4.method547(-2951);
         Class7.method833((byte)126);
         Class3_Sub28_Sub1.method528(-1667);
         Class57.method1192();
         CursorType.method1181((byte)-118);
         Class2.method80();
         TextureLoader.method1612(-11565);
         Texture.method721(20413);
         Class3_Sub28_Sub18.method711(1);
         Rasterizer.method1155();
         Huffman.method1016((byte)127);
         Class1.method71((byte)-124);
         Class101.method1608((byte)110);
         Class53.method1169(false);
         Class44_Sub1.method1077(0);
         Class26.method960(31);
         Class88.method1457();
         SubScript.method1178((byte)-93);
         Class10.method853(0);
         InterfaceListener.method376(false);
         SceneGraphNode.method1860(0);
         Class86.method1429((byte)53);
         Class3_Sub11.method147();
         Class25.method954(128);
         Class113.method1703();
         Class70.method1284((byte)-87);
         Class19.method906((byte)112);
         Class12.method871((byte)115);
         Class72.method1296(1);
         PlainTile.method1751();
         ShapedTile.method1011();
         TransformList.method380(-29113);
         Class56.method1187(30351);
         Class58.method1193(-26723);
         Animation.method1595();
         Class123.method1743(false);
         Class3_Sub28_Sub21.method726();
         Class121.method1733(-17148);
         Class141.method2045();
         Class169.method2283();
         Class77.method1365(119);
         Class110.method1682(-82);
         LongNode.method120(1000);
         InterfaceChangeNode.f((int)3);
         InventoryNode.method510(-128);
         Class3_Sub9.method136(-3);
         ClientScript.method632(-30497);
         Class116.method1715();
         Class161.method2202(-196);
         Class81.method1402();
         GraphicsHD.method923();
         Class45.method1081((byte)81);
         Class140_Sub6.method2019(true);
         Class140_Sub2.method1954(0);
         Class107.method1646();
         ItemPile.method2030((byte)83);
         Class3_Sub5.method113((byte)-120);
         Class140_Sub3.method1958(2);
         Class124.method1744(true);
         Class80.method1394();
         StringNode.method735();
         Class134.method1806(3846);
         IntegerNode.method382();
         Class3_Sub21.method396(0);
         Canvas_Sub2.method59();
         Class108.method1660(13123);
         MillisTimer.method1771(14635);
         ProducingGraphicsBuffer.method2187(27316);
         FixedVertex.method1731(12881);
         Vertex.method1133((byte)81);
         LookupTable.method1283((byte)122);
         Class144.method2070((byte)67);
         Class105.method1641();
         Class9.method849(2);
         AbstractObjectCache.method563(3);
         RawObjectCache.method570(-119);
         Class118.method1726();
         Class3_Sub6.method118(2);
         Class166.method2255((byte)-128);
         Class155_Sub1.method2166();
         Class103.method1623();
         Class21.method911(26);
         Class154.method2145((byte)-69);
         Class125.method1748();
         Class112.method1700();
         Class104.method1630((byte)-113);
         Class65.method1238(-112);
         Class3_Sub14.method361();
         Class59.method1204();
         Class3_Sub13_Sub4.method187(false);
         Class159.method2197(true);
         smallFont = null;
         boldFont = null;
         regularFont = null;
         Class3_Sub13.method156(2);
         Class164.method2235(4);
         Class97.method1592((byte)102);
         Class114.method1704(65536);
         Class3_Sub10.method143();
         Class82.method1409(false);
         Class44.method1071((byte)-115);
         Class164_Sub2.method2245((byte)-74);
         Class164_Sub1.method2240(128);
         Class27.method962((byte)-67);
         Class3_Sub8.method131(-109);
         Class32.method994('\u93bd');
         Class60.method1206((byte)26);
         int var2 = 87 % ((68 - var1) / 49);
         Class3_Sub13_Sub22.method274(-2);
         Class3_Sub13_Sub11.method217(1);
         Class3_Sub13_Sub31.method317(7759444);
         Class3_Sub13_Sub29.method309(true);
         Class3_Sub13_Sub19.method261(-125);
         Class3_Sub13_Sub24.method288((byte)110);
         Class3_Sub13_Sub2.method172(11597);
         Class3_Sub13_Sub27.method296((byte)-107);
         Class3_Sub13_Sub39.method357(false);
         Class3_Sub13_Sub37.method348(48);
         Class3_Sub13_Sub20.method266(-1443422260);
         Class3_Sub13_Sub1.method168(-1771542303);
         Class3_Sub13_Sub30.method315(-15028);
         Class3_Sub13_Sub32.method321(-21136);
         Class3_Sub13_Sub16.method245(0);
         Class3_Sub13_Sub9.method209((byte)79);
         Class3_Sub13_Sub15.method241((byte)74);
         Class3_Sub13_Sub23_Sub1.method287(false);
         Class3_Sub13_Sub23.method277((byte)-41);
         Class3_Sub13_Sub18.method258(-97);
         Class3_Sub13_Sub13.method234();
         Class3_Sub13_Sub35.method337(2);
         Class3_Sub13_Sub17.method249();
         Class3_Sub13_Sub12.method227(true);
         Class3_Sub13_Sub34.method333((byte)-54);
         Class3_Sub13_Sub6.method197(1);
         Class3_Sub13_Sub7.method200((byte)122);
         Class3_Sub13_Sub25.method290(-9);
         Class3_Sub13_Sub33.method325(0);
         Class3_Sub13_Sub10.method211(1024);
         Class3_Sub13_Sub14.method238(9423);
         Class3_Sub13_Sub28.method300();
         Class3_Sub13_Sub3.method177((byte)119);
         Class3_Sub13_Sub26.method294((byte)30);
         Class3_Sub13_Sub36.method341((byte)85);
         Class3_Sub13_Sub21.method268((byte)-91);
         Class3_Sub13_Sub38.method351(-1);
         Class163_Sub2.method2218((byte)-83);
         Class163.method2208();
         Class163_Sub2_Sub1.method2225((byte)-120);
         Class163_Sub3.method2227((byte)37);
         Class163_Sub1_Sub1.method2213((byte)104);
         Class163_Sub1.method2212(false);
         GroundItem.method627((byte)-122);
         Class3_Sub28_Sub19.method717(109);
         Class3_Sub28_Sub2.method534(99);
         Class3_Sub23.method405(true);
         InputStream_Sub1.method61();
         OutputStream_Sub1.method67(true);
         Class3_Sub28_Sub8.method573(-11346);
         Class3_Sub20.method391();
         Class3_Sub26.method511((byte)121);
         Class75.method1334((byte)-115);
         Class75_Sub1.method1343(false);
         Class75_Sub3.method1348((byte)100);
         Class75_Sub4.method1350((byte)75);
         Class75_Sub2.method1345(-71);
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "client.C(" + var1 + ')');
      }

      if(GameShell.anInt12 != 0) {
         aBoolean2201 = true;
      }

   }

   private final void method46(boolean var1, int var2) {
      try {
         ++Class58.js5CacheWorker.failAttemps;
         Class17.js5ConnectionNode = null;
         if(!var1) {
            aClass3_Sub11ArrayArray2199 = (Class3_Sub11[][])((Class3_Sub11[][])null);
         }

         Class58.js5CacheWorker.anInt1010 = var2;
         InputStream_Sub1.js5Connection = null;
         PacketParser.js5Stage = 0;
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "client.P(" + var1 + ',' + var2 + ')');
      }
   }

   private final void method47(byte var1) {
      try {
         for(Class3_Sub23.anInt2537 = 0; UpdateServerNode.method591(83) && ~Class3_Sub23.anInt2537 > -129; ++Class3_Sub23.anInt2537) {
            GrandExchangeItem.anIntArray1755[Class3_Sub23.anInt2537] = Class3_Sub28_Sub9.anInt3624;
            FixedVertex.anIntArray1638[Class3_Sub23.anInt2537] = Class3_Sub13_Sub27.anInt3342;
         }

         ++DisplayModeInformation.anInt1446;
         if(-1 != InvType.mainScreenInterface) {
            SpotAnimation.method967(0, 0, 0, Class23.canvasWid, InvType.mainScreenInterface, 0, ItemPile.canvasHei);
         }

         ++Class3_Sub13_Sub17.anInt3213;
         if(HDToolkit.openGLEnabled) {
            int var2 = 19137023;

            label191:
            for(int var3 = 0; ~var3 > -32769; ++var3) {
               Npc var4 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var3];
               if(null != var4) {
                  byte var5 = var4.aClass90_3976.aByte1267;
                  if((var5 & 2) > 0 && -1 == ~var4.walkQueueLocationIndex && 10.0D > Math.random() * 1000.0D) {
                     int var6 = (int)Math.round(-1.0D + 2.0D * Math.random());
                     int var7 = (int)Math.round(Math.random() * 2.0D - 1.0D);
                     if(var6 != 0 || 0 != var7) {
                        var4.aByteArray2795[0] = 1;
                        var4.anIntArray2767[0] = var6 + (var4.anInt2819 >> -1913236345);
                        var4.anIntArray2755[0] = var7 + (var4.anInt2829 >> -173151257);
                        Class86.collisionMap[Class26.plane].method1502(var1 + 20850, var4.anInt2819 >> -649292601, var4.getSize(), false, 0, var4.getSize(), var4.anInt2829 >> 1442151015);
                        if(0 <= var4.anIntArray2767[0] && var4.anIntArray2767[0] <= 104 + -var4.getSize() && 0 <= var4.anIntArray2755[0] && var4.anIntArray2755[0] <= 104 - var4.getSize() && Class86.collisionMap[Class26.plane].method1500(-2, var4.anInt2829 >> 2135388679, var4.anIntArray2755[0], var4.anIntArray2767[0], var4.anInt2819 >> 627928135)) {
                           if(var4.getSize() > 1) {
                              for(int var8 = var4.anIntArray2767[0]; ~(var4.anIntArray2767[0] - -var4.getSize()) < ~var8; ++var8) {
                                 for(int var9 = var4.anIntArray2755[0]; var4.anIntArray2755[0] + var4.getSize() > var9; ++var9) {
                                    if((var2 & Class86.collisionMap[Class26.plane].collisionFlags[var8][var9]) != 0) {
                                       continue label191;
                                    }
                                 }
                              }
                           }

                           var4.walkQueueLocationIndex = 1;
                        }
                     }
                  }

                  CursorType.method1180((byte)-122, var4);
                  Class17.method904(65536, var4);
                  client.method900(var4, var1 ^ -11974);
                  Class86.collisionMap[Class26.plane].method1489(var4.anInt2819 >> -375465785, false, (byte)85, var4.anInt2829 >> 1678486439, var4.getSize(), var4.getSize());
               }
            }
         }

         if(var1 != 1) {
            aClass94_2196 = (jString)null;
         }

         if(!HDToolkit.openGLEnabled) {
            Buffer.method744(true);
         } else if(0 == Class3_Sub13_Sub25.loginStage && 0 == Canvas_Sub1.anInt23) {
            //if(GrandExchangeItem.anInt1753 != 2) {
            //   InterfaceChangeNode.d();
            //} else {
               InterfaceListener.method379(var1 ^ 1025);
            //}

            if(14 > Npc.renderX >> -1377844697 || Npc.renderX >> 2015386375 >= 90 || 14 > Class77.renderY >> -944239097 || -91 >= ~(Class77.renderY >> -1325288249)) {
               Class3_Sub13_Sub6.method195();
            }
         }

         while(true) {
            InterfaceListener var11 = (InterfaceListener)PacketParser.aClass61_82.popFront();
            jInterface var12;
            jInterface var13;
            if(var11 == null) {
               while(true) {
                  var11 = (InterfaceListener)Class65.aClass61_983.popFront();
                  if(null == var11) {
                     while(true) {
                        var11 = (InterfaceListener)Class110.aClass61_1471.popFront();
                        if(null == var11) {
                           if(Class56.aClass11_886 != null) {
                              PacketParser.method829(-1);
                           }

                           if(null != Class15.aClass64_351 && Class15.aClass64_351.status == 1) {
                              //if(null != Class15.aClass64_351.value) {
                              //Class99.method1596(Class3_Sub13_Sub24.aClass94_3295, jString.aBoolean2154);
                              //}

                              jString.aBoolean2154 = false;
                              Class3_Sub13_Sub24.aClass94_3295 = null;
                              Class15.aClass64_351 = null;
                           }

                           //if(Class44.loopCycle % 1500 == 0) {
                           //   Class72.method1293();
                           //}

                           return;
                        }

                        var12 = var11.aClass11_2449;
                        if(0 <= var12.anInt191) {
                           var13 = Class7.getInterface(var12.parent);
                           if(var13 == null || null == var13.aClass11Array262 || ~var13.aClass11Array262.length >= ~var12.anInt191 || var12 != var13.aClass11Array262[var12.anInt191]) {
                              continue;
                           }
                        }

                        Light.method1065(var11);
                     }
                  }

                  var12 = var11.aClass11_2449;
                  if(~var12.anInt191 <= -1) {
                     var13 = Class7.getInterface(var12.parent);
                     if(null == var13 || var13.aClass11Array262 == null || ~var12.anInt191 <= ~var13.aClass11Array262.length || var12 != var13.aClass11Array262[var12.anInt191]) {
                        continue;
                     }
                  }

                  Light.method1065(var11);
               }
            }

            var12 = var11.aClass11_2449;
            if(var12.anInt191 >= 0) {
               var13 = Class7.getInterface(var12.parent);
               if(null == var13 || null == var13.aClass11Array262 || ~var13.aClass11Array262.length >= ~var12.anInt191 || var12 != var13.aClass11Array262[var12.anInt191]) {
                  continue;
               }
            }

            Light.method1065(var11);
         }
      } catch (RuntimeException var10) {
         throw Class44.method1067(var10, "client.I(" + var1 + ')');
      }
   }

   private final void handleUpdateServer() {
       if(1000 != Class143.gameState) {
		   boolean var2 = Js5CacheWorker.processUpdateServer();
	
		   if(!var2) {
			   js5Connect(-31379);
		   }
       }
   }

   private final void js5Connect(int var1) {
		if (Js5CacheWorker.failAttemps >= 4) {
			if (Class143.gameState <= 5) {
				error("error_io");
				Class143.gameState = 1000;
				return;
			}
			Class3_Sub13_Sub5.retryDelay = 3000;
			Js5CacheWorker.failAttemps = 3;
		}
		if (Class3_Sub13_Sub5.retryDelay-- <= 0) {
			try {
				if (PacketParser.js5Stage == 0) {
					Class17.js5ConnectionNode = Class38.gameSignlink.startConnection(Class38_Sub1.aString2611, Class140_Sub6.anInt2894);
					PacketParser.js5Stage++;
				}
				if (PacketParser.js5Stage == 1) {
					if (Class17.js5ConnectionNode.status == 2) {
						js5Error(-1);
						return;
					}
					if (Class17.js5ConnectionNode.status == 1)
						PacketParser.js5Stage++;
				}
				if (PacketParser.js5Stage == 2) {
					InputStream_Sub1.js5Connection = new jSocket((Socket) Class17.js5ConnectionNode.value, Class38.gameSignlink);
					Buffer buffer = new Buffer(5);
					buffer.putByte(15);
					buffer.putInt(464);
					InputStream_Sub1.js5Connection.write(buffer.buf, 0, 5);
					PacketParser.js5Stage++;
					Class3_Sub13_Sub30.lastJs5ConnectionTime = TimeUtil.currentTimeMillis();
				}
				if (PacketParser.js5Stage == 3) {
					if (Class143.gameState == 0 || Class143.gameState == 5 || InputStream_Sub1.js5Connection.available() > 0) {
						int responce = InputStream_Sub1.js5Connection.read();
						if (responce != 0) {
							js5Error(responce);
							return;
						}
						PacketParser.js5Stage++;
					} else if ((TimeUtil.currentTimeMillis() - Class3_Sub13_Sub30.lastJs5ConnectionTime) > 30000L) {
						js5Error(-2);
						return;
					}
				}
				if (PacketParser.js5Stage == 4) {
					boolean var6 = ~Class143.gameState == -6 || -11 == ~Class143.gameState || Class143.gameState == 28;
					Js5CacheWorker.method1249(var6, InputStream_Sub1.js5Connection);
					InputStream_Sub1.js5Connection = null;
					Class17.js5ConnectionNode = null;
					PacketParser.js5Stage = 0;
					client.js5ErrorCount = 0;
				}
			} catch (IOException ioexception) {
				js5Error(-3);
			}
		}
  /*       if(~Class163_Sub2_Sub1.anInt4026 > ~Class58.js5CacheWorker.failAttemps) {
            Class3_Sub13_Sub5.retryDelay = 5 * 50 * (Class58.js5CacheWorker.failAttemps + -1);
            if(Class162.anInt2036 != Class140_Sub6.anInt2894) {
               Class140_Sub6.anInt2894 = Class162.anInt2036;
            } else {
               Class140_Sub6.anInt2894 = Class26.anInt506;
            }

            if(Class3_Sub13_Sub5.retryDelay > 3000) {
               Class3_Sub13_Sub5.retryDelay = 3000;
            }

            if(~Class58.js5CacheWorker.failAttemps <= -3 && Class58.js5CacheWorker.anInt1010 == 6) {
               error("js5connect_outofdate");
               Class143.gameState = 1000;
               return;
            }

            if(Class58.js5CacheWorker.failAttemps >= 4 && ~Class58.js5CacheWorker.anInt1010 == 0) {
               error("js5crc");
               Class143.gameState = 1000;
               return;
            }

            if(Class58.js5CacheWorker.failAttemps >= 4 && (Class143.gameState == 0 || -6 == ~Class143.gameState)) {
               if(~Class58.js5CacheWorker.anInt1010 != -8 && -10 != ~Class58.js5CacheWorker.anInt1010) {
                  if(Class58.js5CacheWorker.anInt1010 > 0) {
                     error("js5connect");
                  } else {
                     error("js5io");
                  }
               } else {
                  error("js5connect_full");
               }

               Class143.gameState = 1000;
               return;
            }
         }

         Class163_Sub2_Sub1.anInt4026 = Class58.js5CacheWorker.failAttemps;
         if(~Class3_Sub13_Sub5.retryDelay < -1) {
            --Class3_Sub13_Sub5.retryDelay;
         } else {
            try {
               if(~PacketParser.js5Stage == -1) {
                  Class17.js5ConnectionNode = Class38.gameSignlink.startConnection(Class38_Sub1.aString2611, Class140_Sub6.anInt2894);
                  ++PacketParser.js5Stage;
               }

               if(PacketParser.js5Stage == 1) {
                  if(2 == Class17.js5ConnectionNode.status) {
                     method46(true, 1000);
                     return;
                  }

                  if(~Class17.js5ConnectionNode.status == -2) {
                     ++PacketParser.js5Stage;
                  }
               }

               if(2 == PacketParser.js5Stage) {
                  InputStream_Sub1.js5Connection = new jSocket((Socket)Class17.js5ConnectionNode.value, Class38.gameSignlink);
                  Buffer var2 = new Buffer(5);
                  var2.putByte(15);
                  var2.putInt(464);
                  InputStream_Sub1.js5Connection.write(var2.buf, 0, 5);
                  ++PacketParser.js5Stage;
                  Class3_Sub13_Sub30.lastJs5ConnectionTime = TimeUtil.currentTimeMillis();
               }

               if(3 == PacketParser.js5Stage) {
                  if(-1 != ~Class143.gameState && ~Class143.gameState != -6 && 0 >= InputStream_Sub1.js5Connection.available()) {
                     if(~(TimeUtil.currentTimeMillis() + -Class3_Sub13_Sub30.lastJs5ConnectionTime) < -30001L) {
                        method46(true, 1001);
                        return;
                     }
                  } else {
                     int var5 = InputStream_Sub1.js5Connection.read();
                     if(-1 != ~var5) {
                        method46(true, var5);
                        return;
                     }

                     ++PacketParser.js5Stage;
                  }
               }

               if(-5 == ~PacketParser.js5Stage) {
                  boolean var6 = ~Class143.gameState == -6 || -11 == ~Class143.gameState || Class143.gameState == 28;
                  Class58.js5CacheWorker.method1249(!var6, InputStream_Sub1.js5Connection);
                  InputStream_Sub1.js5Connection = null;
                  Class17.js5ConnectionNode = null;
                  PacketParser.js5Stage = 0;
               }
            } catch (IOException var3) {
               method46(true, 1002);
            }

         }*/
   }
   
   private final void js5Error(int responce) {
	   PacketParser.js5Stage = 0;
	   Class17.js5ConnectionNode = null;
	   InputStream_Sub1.js5Connection = null;
		client.js5ErrorCount++;
		if (client.js5ErrorCount < 2 || responce != 7 && responce != 9) {
			if (client.js5ErrorCount >= 2 && responce == 6) {
				error("server_out_of_date");
				Class143.gameState = 1000;
			} else if (client.js5ErrorCount >= 4) {
				if (Class143.gameState > 5)
					Class3_Sub13_Sub5.retryDelay = 3000;
				else {
					error("server_offline");
					Class143.gameState = 1000;
				}
			}
		} else if (Class143.gameState > 5)
			Class3_Sub13_Sub5.retryDelay = 3000;
		else {
		    error("server_full");
		    Class143.gameState = 1000;
		}
   }

   /*public static final void main(String[] var0) {
      try {
         try {
            if(4 != var0.length) {
               Class3_Sub13_Sub23_Sub1.method283("argument count", (byte)38);
            }

            int var1 = -1;
            ObjectDefinition.worldId = Integer.parseInt(var0[0]);
            Class44.modeWhere = 2;
            if(!var0[1].equals("live")) {
               if(var0[1].equals("rc")) {
                  Class3_Sub13_Sub13.modeWhat = 1;
               } else if(!var0[1].equals("wip")) {
                  Class3_Sub13_Sub23_Sub1.method283("modewhat", (byte)38);
               } else {
                  Class3_Sub13_Sub13.modeWhat = 2;
               }
            } else {
               Class3_Sub13_Sub13.modeWhat = 0;
            }

            Class3_Sub28_Sub19.advertSuppressed = false;

            try {
               byte[] var2 = var0[2].getBytes("ISO-8859-1");
               var1 = Class3_Sub13_Sub16.method243(Class3_Sub13_Sub3.bufferToString(var2, 0, var2.length), (byte)13);
            } catch (Exception var3) {
               ;
            }

            if(-1 == var1) {
               if(!var0[2].equals("english")) {
                  if(var0[2].equals("german")) {
                     Class3_Sub20.language = 1;
                  } else {
                     Class3_Sub13_Sub23_Sub1.method283("language", (byte)38);
                  }
               } else {
                  Class3_Sub20.language = 0;
               }
            } else {
               Class3_Sub20.language = var1;
            }

            Node.method87(Class3_Sub20.language);
            Class163_Sub2_Sub1.objectTag = false;
            Class3_Sub28_Sub11.aBoolean3641 = false;

            OverridedInterface.anInt2607 = 0;
            Class106.aBoolean1451 = false;
            Class3_Sub26.anInt2554 = 0;
            Class163_Sub2.aClass94_2996 = Class3_Sub28_Sub14.aClass94_3672;
            client var6 = new client();
            OverlayTile.aClient1671 = var6;
            var6.method40(32 - -Class3_Sub13_Sub13.modeWhat, 464, false, 1024, "runescape", 768, client.indexCount);
            Class3_Sub13_Sub7.aFrame3092.setLocation(40, 40);
         } catch (Exception var4) {
            Class49.method1125((String)null, var4);
         }

      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "client.main(" + (var0 != null?"{...}":"null") + ')');
      }
   }*/

   static final void drawInterface(jInterface[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = 0; var8 < var0.length; ++var8) {
         jInterface var9 = var0[var8];
         if(var9 != null && var9.parent == var1 && (!var9.scriptedInterface || var9.type == 0 || var9.aBoolean195 || jInterface.getInterfaceClickMask(var9).clickMask != 0 || var9 == PacketParser.aClass11_88 || var9.clientCode == 1338) && (!var9.scriptedInterface || !jInterface.isComponentHidden(var9))) {
            int var10 = var9.anInt306 + var6;
            int var11 = var9.anInt210 + var7;
            int var12;
            int var13;
            int var14;
            int var15;
            if(var9.type == 2) {
               var12 = var2;
               var13 = var3;
               var14 = var4;
               var15 = var5;
            } else {
               int var16 = var10 + var9.anInt168;
               int var17 = var11 + var9.anInt193;
               if(var9.type == 9) {
                  ++var16;
                  ++var17;
               }

               var12 = var10 > var2?var10:var2;
               var13 = var11 > var3?var11:var3;
               var14 = var16 < var4?var16:var4;
               var15 = var17 < var5?var17:var5;
            }

            if(var9 == Class56.aClass11_886) {
               Class21.aBoolean440 = true;
               Class3_Sub15.anInt2421 = var10;
               GroundTile.anInt2218 = var11;
            }

            if(!var9.scriptedInterface || var12 < var14 && var13 < var15) {
               if(var9.type == 0) {
                  if(!var9.scriptedInterface && jInterface.isComponentHidden(var9) && Class107.aClass11_1453 != var9) {
                     continue;
                  }

                  if(var9.aBoolean219 && PlainTile.anInt1676 >= var12 && Hashtable.anInt1709 >= var13 && PlainTile.anInt1676 < var14 && Hashtable.anInt1709 < var15) {
                     for(InterfaceListener var27 = (InterfaceListener)Class110.aClass61_1471.getFirst(); var27 != null; var27 = (InterfaceListener)Class110.aClass61_1471.getNext()) {
                        if(var27.aBoolean2446) {
                           var27.unlink();
                           var27.aClass11_2449.aBoolean163 = false;
                        }
                     }

                     if(Class75_Sub3.anInt2658 == 0) {
                        Class56.aClass11_886 = null;
                        PacketParser.aClass11_88 = null;
                     }

                     //ClanMember.anInt2475 = 0;
                  }
               }

               if(var9.scriptedInterface) {
                  boolean var26;
                  if(PlainTile.anInt1676 >= var12 && Hashtable.anInt1709 >= var13 && PlainTile.anInt1676 < var14 && Hashtable.anInt1709 < var15) {
                     var26 = true;
                  } else {
                     var26 = false;
                  }

                  boolean var25 = false;
                  if(Class3_Sub13_Sub5.anInt3069 == 1 && var26) {
                     var25 = true;
                  }

                  boolean var18 = false;
                  if(Class3_Sub28_Sub11.anInt3644 == 1 && Class163_Sub1.anInt2993 >= var12 && Class38_Sub1.anInt2614 >= var13 && Class163_Sub1.anInt2993 < var14 && Class38_Sub1.anInt2614 < var15) {
                     var18 = true;
                  }

                  int var19;
                  int var21;
                  if(var9.aByteArray263 != null) {
                     for(var19 = 0; var19 < var9.aByteArray263.length; ++var19) {
                        if(!ObjectDefinition.aBooleanArray1490[var9.aByteArray263[var19]]) {
                           if(var9.anIntArray310 != null) {
                              var9.anIntArray310[var19] = 0;
                           }
                        } else if(var9.anIntArray310 == null || Class44.loopCycle >= var9.anIntArray310[var19]) {
                           byte var20 = var9.aByteArray231[var19];
                           if(var20 == 0 || ((var20 & 2) == 0 || ObjectDefinition.aBooleanArray1490[86]) && ((var20 & 1) == 0 || ObjectDefinition.aBooleanArray1490[82]) && ((var20 & 4) == 0 || ObjectDefinition.aBooleanArray1490[81])) {
                              OutputStream_Sub1.method66(GroundItem.aClass94_3672, -1, var19 + 1, var9.uid);
                              var21 = var9.anIntArray299[var19];
                              if(var9.anIntArray310 == null) {
                                 var9.anIntArray310 = new int[var9.aByteArray263.length];
                              }

                              if(var21 != 0) {
                                 var9.anIntArray310[var19] = Class44.loopCycle + var21;
                              } else {
                                 var9.anIntArray310[var19] = Integer.MAX_VALUE;
                              }
                           }
                        }
                     }
                  }

                  if(var18) {
                     InterfaceChangeNode.a(Class38_Sub1.anInt2614 - var11, Class163_Sub1.anInt2993 - var10, 97, var9);
                  }

                  if(Class56.aClass11_886 != null && Class56.aClass11_886 != var9 && var26 && jInterface.getInterfaceClickMask(var9).method98(false)) {
                     Class27.aClass11_526 = var9;
                  }

                  if(var9 == PacketParser.aClass11_88) {
                     Class85.aBoolean1167 = true;
                     Class3_Sub13_Sub13.anInt3156 = var10;
                     Class134.anInt1761 = var11;
                  }

                  if(var9.aBoolean195 || var9.clientCode != 0) {
                     InterfaceListener var30;
                     if(var26 && Varp.anInt561 != 0 && var9.anObjectArray183 != null) {
                        var30 = new InterfaceListener();
                        var30.aBoolean2446 = true;
                        var30.aClass11_2449 = var9;
                        var30.anInt2441 = Varp.anInt561;
                        var30.objectData = var9.anObjectArray183;
                        Class110.aClass61_1471.insertBack(var30);
                     }

                     if(Class56.aClass11_886 != null || Class67.aClass11_1017 != null || Class38_Sub1.aBoolean2615) {
                        var18 = false;
                        var25 = false;
                        var26 = false;
                     }

                     int var29;
                     if(var9.clientCode != 0) {
                        if(var9.clientCode == 1337) {
                           UnderlayType.aClass11_2091 = var9;
                           Class20.refreshInterface(var9);
                           continue;
                        }

                        if(var9.clientCode == 1338) {
                           if(var18) {
                              Class1.anInt56 = Class163_Sub1.anInt2993 - var10;
                              Class58.anInt916 = Class38_Sub1.anInt2614 - var11;
                           }
                           continue;
                        }
                        
                        /*if(var9.clientCode == 1400) {
                           Class3_Sub28_Sub3.aClass11_3551 = var9;
                           if(var18) {
                              if(ObjectDefinition.aBooleanArray1490[82] && Class3_Sub13_Sub26.anInt3320 >= 2) {
                                 var19 = (int)((double)(Class163_Sub1.anInt2993 - var10 - var9.anInt168 / 2) * 2.0D / (double)Class44.aFloat727);
                                 var29 = (int)((double)(Class38_Sub1.anInt2614 - var11 - var9.anInt193 / 2) * 2.0D / (double)Class44.aFloat727);
                                 var21 = Class3_Sub28_Sub1.anInt3536 + var19;
                                 int var32 = Class3_Sub4.anInt2251 + var29;
                                 int var23 = var21 + Class3_Sub13_Sub21.anInt3256;
                                 int var24 = Class108.anInt1460 - 1 - var32 + Class2.anInt65;
                                 Class30.method979(var23, var24, 0);
                                 Class3_Sub13_Sub19.method264();
                                 continue;
                              }

                              ClanMember.anInt2475 = 1;
                              Class144.anInt1881 = OverlayTile.anInt1676;
                              Class95.anInt1336 = Hashtable.anInt1709;
                              continue;
                           }

                           if(var25 && ClanMember.anInt2475 > 0) {
                              if(ClanMember.anInt2475 == 1 && (Class144.anInt1881 != OverlayTile.anInt1676 || Class95.anInt1336 != Hashtable.anInt1709)) {
                                 BufferedRequest.anInt4073 = Class3_Sub28_Sub1.anInt3536;
                                 Class38.anInt660 = Class3_Sub4.anInt2251;
                                 ClanMember.anInt2475 = 2;
                              }

                              if(ClanMember.anInt2475 == 2) {
                                 SubScript.method1175(BufferedRequest.anInt4073 + (int)((double)(Class144.anInt1881 - OverlayTile.anInt1676) * 2.0D / (double)Npc.aFloat3979));
                                 Class3_Sub13_Sub39.method354(Class38.anInt660 + (int)((double)(Class95.anInt1336 - Hashtable.anInt1709) * 2.0D / (double)Npc.aFloat3979));
                              }
                              continue;
                           }

                           ClanMember.anInt2475 = 0;
                           continue;
                        }*/

                        /*if(var9.clientCode == 1401) {
                           if(var25) {
                              Class3_Sub13_Sub17.method253(var9.anInt168, Hashtable.anInt1709 - var11, OverlayTile.anInt1676 - var10, var9.anInt193);
                           }
                           continue;
                        }*/

                        if(var9.clientCode == 1402) {
                           if(!HDToolkit.openGLEnabled) {
                              Class20.refreshInterface(var9);
                           }
                           continue;
                        }
                     }

                     if(!var9.aBoolean188 && var18) {
                        var9.aBoolean188 = true;
                        if(var9.anObjectArray165 != null) {
                           var30 = new InterfaceListener();
                           var30.aBoolean2446 = true;
                           var30.aClass11_2449 = var9;
                           var30.anInt2447 = Class163_Sub1.anInt2993 - var10;
                           var30.anInt2441 = Class38_Sub1.anInt2614 - var11;
                           var30.objectData = var9.anObjectArray165;
                           Class110.aClass61_1471.insertBack(var30);
                        }
                     }

                     if(var9.aBoolean188 && var25 && var9.anObjectArray170 != null) {
                        var30 = new InterfaceListener();
                        var30.aBoolean2446 = true;
                        var30.aClass11_2449 = var9;
                        var30.anInt2447 = PlainTile.anInt1676 - var10;
                        var30.anInt2441 = Hashtable.anInt1709 - var11;
                        var30.objectData = var9.anObjectArray170;
                        Class110.aClass61_1471.insertBack(var30);
                     }

                     if(var9.aBoolean188 && !var25) {
                        var9.aBoolean188 = false;
                        if(var9.anObjectArray239 != null) {
                           var30 = new InterfaceListener();
                           var30.aBoolean2446 = true;
                           var30.aClass11_2449 = var9;
                           var30.anInt2447 = PlainTile.anInt1676 - var10;
                           var30.anInt2441 = Hashtable.anInt1709 - var11;
                           var30.objectData = var9.anObjectArray239;
                           Class65.aClass61_983.insertBack(var30);
                        }
                     }

                     if(var25 && var9.anObjectArray180 != null) {
                        var30 = new InterfaceListener();
                        var30.aBoolean2446 = true;
                        var30.aClass11_2449 = var9;
                        var30.anInt2447 = PlainTile.anInt1676 - var10;
                        var30.anInt2441 = Hashtable.anInt1709 - var11;
                        var30.objectData = var9.anObjectArray180;
                        Class110.aClass61_1471.insertBack(var30);
                     }

                     if(!var9.aBoolean163 && var26) {
                        var9.aBoolean163 = true;
                        if(var9.anObjectArray248 != null) {
                           var30 = new InterfaceListener();
                           var30.aBoolean2446 = true;
                           var30.aClass11_2449 = var9;
                           var30.anInt2447 = PlainTile.anInt1676 - var10;
                           var30.anInt2441 = Hashtable.anInt1709 - var11;
                           var30.objectData = var9.anObjectArray248;
                           Class110.aClass61_1471.insertBack(var30);
                        }
                     }

                     if(var9.aBoolean163 && var26 && var9.anObjectArray276 != null) {
                        var30 = new InterfaceListener();
                        var30.aBoolean2446 = true;
                        var30.aClass11_2449 = var9;
                        var30.anInt2447 = PlainTile.anInt1676 - var10;
                        var30.anInt2441 = Hashtable.anInt1709 - var11;
                        var30.objectData = var9.anObjectArray276;
                        Class110.aClass61_1471.insertBack(var30);
                     }

                     if(var9.aBoolean163 && !var26) {
                        var9.aBoolean163 = false;
                        if(var9.anObjectArray281 != null) {
                           var30 = new InterfaceListener();
                           var30.aBoolean2446 = true;
                           var30.aClass11_2449 = var9;
                           var30.anInt2447 = PlainTile.anInt1676 - var10;
                           var30.anInt2441 = Hashtable.anInt1709 - var11;
                           var30.objectData = var9.anObjectArray281;
                           Class65.aClass61_983.insertBack(var30);
                        }
                     }

                     if(var9.anObjectArray269 != null) {
                        var30 = new InterfaceListener();
                        var30.aClass11_2449 = var9;
                        var30.objectData = var9.anObjectArray269;
                        PacketParser.aClass61_82.insertBack(var30);
                     }

                     InterfaceListener var22;
                     if(var9.anObjectArray161 != null && PacketParser.anInt87 > var9.anInt284) {
                        if(var9.anIntArray211 != null && PacketParser.anInt87 - var9.anInt284 <= 32) {
                           label531:
                           for(var19 = var9.anInt284; var19 < PacketParser.anInt87; ++var19) {
                              var29 = Npc.anIntArray3986[var19 & 31];

                              for(var21 = 0; var21 < var9.anIntArray211.length; ++var21) {
                                 if(var9.anIntArray211[var21] == var29) {
                                    var22 = new InterfaceListener();
                                    var22.aClass11_2449 = var9;
                                    var22.objectData = var9.anObjectArray161;
                                    Class110.aClass61_1471.insertBack(var22);
                                    break label531;
                                 }
                              }
                           }
                        } else {
                           var30 = new InterfaceListener();
                           var30.aClass11_2449 = var9;
                           var30.objectData = var9.anObjectArray161;
                           Class110.aClass61_1471.insertBack(var30);
                        }

                        var9.anInt284 = PacketParser.anInt87;
                     }

                     if(var9.anObjectArray221 != null && Class3_Sub9.anInt2317 > var9.anInt242) {
                        if(var9.anIntArray185 != null && Class3_Sub9.anInt2317 - var9.anInt242 <= 32) {
                           label512:
                           for(var19 = var9.anInt242; var19 < Class3_Sub9.anInt2317; ++var19) {
                              var29 = Class163_Sub2_Sub1.anIntArray4025[var19 & 31];

                              for(var21 = 0; var21 < var9.anIntArray185.length; ++var21) {
                                 if(var9.anIntArray185[var21] == var29) {
                                    var22 = new InterfaceListener();
                                    var22.aClass11_2449 = var9;
                                    var22.objectData = var9.anObjectArray221;
                                    Class110.aClass61_1471.insertBack(var22);
                                    break label512;
                                 }
                              }
                           }
                        } else {
                           var30 = new InterfaceListener();
                           var30.aClass11_2449 = var9;
                           var30.objectData = var9.anObjectArray221;
                           Class110.aClass61_1471.insertBack(var30);
                        }

                        var9.anInt242 = Class3_Sub9.anInt2317;
                     }

                     if(var9.anObjectArray282 != null && Huffman.anInt641 > var9.anInt213) {
                        if(var9.anIntArray286 != null && Huffman.anInt641 - var9.anInt213 <= 32) {
                           label493:
                           for(var19 = var9.anInt213; var19 < Huffman.anInt641; ++var19) {
                              var29 = Class44.anIntArray726[var19 & 31];

                              for(var21 = 0; var21 < var9.anIntArray286.length; ++var21) {
                                 if(var9.anIntArray286[var21] == var29) {
                                    var22 = new InterfaceListener();
                                    var22.aClass11_2449 = var9;
                                    var22.objectData = var9.anObjectArray282;
                                    Class110.aClass61_1471.insertBack(var22);
                                    break label493;
                                 }
                              }
                           }
                        } else {
                           var30 = new InterfaceListener();
                           var30.aClass11_2449 = var9;
                           var30.objectData = var9.anObjectArray282;
                           Class110.aClass61_1471.insertBack(var30);
                        }

                        var9.anInt213 = Huffman.anInt641;
                     }

                     if(var9.anObjectArray174 != null && Class62.anInt944 > var9.anInt255) {
                        if(var9.anIntArray175 != null && Class62.anInt944 - var9.anInt255 <= 32) {
                           label474:
                           for(var19 = var9.anInt255; var19 < Class62.anInt944; ++var19) {
                              var29 = Class3_Sub28_Sub4.anIntArray3565[var19 & 31];

                              for(var21 = 0; var21 < var9.anIntArray175.length; ++var21) {
                                 if(var9.anIntArray175[var21] == var29) {
                                    var22 = new InterfaceListener();
                                    var22.aClass11_2449 = var9;
                                    var22.objectData = var9.anObjectArray174;
                                    Class110.aClass61_1471.insertBack(var22);
                                    break label474;
                                 }
                              }
                           }
                        } else {
                           var30 = new InterfaceListener();
                           var30.aClass11_2449 = var9;
                           var30.objectData = var9.anObjectArray174;
                           Class110.aClass61_1471.insertBack(var30);
                        }

                        var9.anInt255 = Class62.anInt944;
                     }

                     if(var9.anObjectArray158 != null && Class49.anInt815 > var9.anInt311) {
                        if(var9.anIntArray274 != null && Class49.anInt815 - var9.anInt311 <= 32) {
                           label455:
                           for(var19 = var9.anInt311; var19 < Class49.anInt815; ++var19) {
                              var29 = Class3_Sub28_Sub19.anIntArray3780[var19 & 31];

                              for(var21 = 0; var21 < var9.anIntArray274.length; ++var21) {
                                 if(var9.anIntArray274[var21] == var29) {
                                    var22 = new InterfaceListener();
                                    var22.aClass11_2449 = var9;
                                    var22.objectData = var9.anObjectArray158;
                                    Class110.aClass61_1471.insertBack(var22);
                                    break label455;
                                 }
                              }
                           }
                        } else {
                           var30 = new InterfaceListener();
                           var30.aClass11_2449 = var9;
                           var30.objectData = var9.anObjectArray158;
                           Class110.aClass61_1471.insertBack(var30);
                        }

                        var9.anInt311 = Class49.anInt815;
                     }

                     if(IdentityKit.anInt472 > var9.anInt234 && var9.anObjectArray256 != null) {
                        var30 = new InterfaceListener();
                        var30.aClass11_2449 = var9;
                        var30.objectData = var9.anObjectArray256;
                        Class110.aClass61_1471.insertBack(var30);
                     }

                     if(Class110.anInt1472 > var9.anInt234 && var9.anObjectArray156 != null) {
                        var30 = new InterfaceListener();
                        var30.aClass11_2449 = var9;
                        var30.objectData = var9.anObjectArray156;
                        Class110.aClass61_1471.insertBack(var30);
                     }

                     if(Class167.anInt2087 > var9.anInt234 && var9.anObjectArray313 != null) {
                        var30 = new InterfaceListener();
                        var30.aClass11_2449 = var9;
                        var30.objectData = var9.anObjectArray313;
                        Class110.aClass61_1471.insertBack(var30);
                     }

                     if(Class121.anInt1642 > var9.anInt234 && var9.anObjectArray268 != null) {
                        var30 = new InterfaceListener();
                        var30.aClass11_2449 = var9;
                        var30.objectData = var9.anObjectArray268;
                        Class110.aClass61_1471.insertBack(var30);
                     }

                     if(Class140_Sub6.anInt2905 > var9.anInt234 && var9.anObjectArray315 != null) {
                        var30 = new InterfaceListener();
                        var30.aClass11_2449 = var9;
                        var30.objectData = var9.anObjectArray315;
                        Class110.aClass61_1471.insertBack(var30);
                     }

                     var9.anInt234 = Class3_Sub13_Sub17.anInt3213;
                     if(var9.keyPressedListener != null) {
                        for(var19 = 0; var19 < Class3_Sub23.anInt2537; ++var19) {
                           InterfaceListener var31 = new InterfaceListener();
                           var31.aClass11_2449 = var9;
                           var31.anInt2444 = GrandExchangeItem.anIntArray1755[var19];
                           var31.anInt2443 = FixedVertex.anIntArray1638[var19];
                           var31.objectData = var9.keyPressedListener;
                           Class110.aClass61_1471.insertBack(var31);
                        }
                     }

                     if(Class3_Sub28_Sub1.aBoolean3531 && var9.anObjectArray217 != null) {
                        var30 = new InterfaceListener();
                        var30.aClass11_2449 = var9;
                        var30.objectData = var9.anObjectArray217;
                        Class110.aClass61_1471.insertBack(var30);
                     }
                  }
               }

               if(!var9.scriptedInterface && Class56.aClass11_886 == null && Class67.aClass11_1017 == null && !Class38_Sub1.aBoolean2615) {
                  if((var9.mouseOverId >= 0 || var9.disabledMouseOverColor != 0) && PlainTile.anInt1676 >= var12 && Hashtable.anInt1709 >= var13 && PlainTile.anInt1676 < var14 && Hashtable.anInt1709 < var15) {
                     if(var9.mouseOverId >= 0) {
                        Class107.aClass11_1453 = var0[var9.mouseOverId];
                     } else {
                        Class107.aClass11_1453 = var9;
                     }
                  }

                  if(var9.type == 8 && PlainTile.anInt1676 >= var12 && Hashtable.anInt1709 >= var13 && PlainTile.anInt1676 < var14 && Hashtable.anInt1709 < var15) {
                     Class20.aClass11_439 = var9;
                  }

                  if(var9.maxScrollVertical > var9.anInt193) {
                     Class137.method1819(Hashtable.anInt1709, var9.anInt193, var9, (byte)-101, PlainTile.anInt1676, var10 + var9.anInt168, var11, var9.maxScrollVertical);
                  }
               }

               if(var9.type == 0) {
                  drawInterface(var0, var9.uid, var12, var13, var14, var15, var10 - var9.anInt247, var11 - var9.anInt208);
                  if(var9.aClass11Array262 != null) {
                     drawInterface(var9.aClass11Array262, var9.uid, var12, var13, var14, var15, var10 - var9.anInt247, var11 - var9.anInt208);
                  }

                  OverridedInterface var28 = (OverridedInterface)Class3_Sub13_Sub17.aClass130_3208.get((long)var9.uid);
                  if(var28 != null) {
                     SpotAnimation.method967(var10, var13, var11, var14, var28.uid, var12, var15);
                  }
               }
            }
         }
      }

   }

   public final void load() {
	   /*if(!jString.safeMode) {
		   while(Class3_Sub28_Sub10_Sub1.method591(107)) {
			   if(~Class3_Sub13_Sub27.anInt3342 == -116 || ~Class3_Sub13_Sub27.anInt3342 == -84) {
				   jString.safeMode = true;
			   }
		   }
	   }*/
	   //if (!closed_revision_choosing && Class143.gameState == 5) {
		//   Class108.load_title_screen(Class3_Sub13_Sub25.cacheIndex10);
   		//	return;
	   //}
       int var2;
	   int var3;
	   if(HintIcon.loadingStage == 0) {
		   Runtime var10 = Runtime.getRuntime();
		   var3 = (int)((var10.totalMemory() - var10.freeMemory()) / 1024L);
		   long var4 = TimeUtil.currentTimeMillis();
		   if(-1L == ~Class3_Sub13_Sub24.aLong3296) {
			   Class3_Sub13_Sub24.aLong3296 = var4;
		   }

		   if(var3 > 16384 && 5000L > -Class3_Sub13_Sub24.aLong3296 + var4) {
			   if(-CollisionMap.aLong1310 + var4 > 1000L) {
				   System.gc();
				   CollisionMap.aLong1310 = var4;
			   }

			   ClientScript.anInt3684 = 5;
			   TransformList.aClass94_2464 = Class3_Sub13_Sub23_Sub1.aClass94_4040;
		   } else {
			   TransformList.aClass94_2464 = jString.aClass94_2151;
			   HintIcon.loadingStage = 10;
			   ClientScript.anInt3684 = 5;
		   }
	   } else if(HintIcon.loadingStage == 10) {
		   LightManager.method1267(4, 104, 104);

		   for(var2 = 0; -5 < ~var2; ++var2) {
			   Class86.collisionMap[var2] = new CollisionMap(104, 104);
		   }

		   ClientScript.anInt3684 = 10;
		   HintIcon.loadingStage = 30;
		   TransformList.aClass94_2464 = Class3_Sub28_Sub10.aClass94_3629;
	   } else if(HintIcon.loadingStage == 30) {
		   //if(Class151.aClass8_1936 == null) {
		   //   Class151.aClass8_1936 = new Class8(Class58.js5CacheWorker, Class3_Sub13_Sub14.aClass73_3159);
		   //}

			Class75_Sub3.cacheIndex0 = Class8.method842(false, true, false, getSkeletonsIDX());
			Class3_Sub28_Sub19.cacheIndex1 = Class8.method842(false, true, false, getSkinsIDX());
			Class164.cacheIndex2 = Class8.method842(true, true, false, 2);
			Class140_Sub3.cacheIndex3 = Class8.method842(false, true, false, 3);
			AbstractMouseWheel.cacheIndex4 = Class8.method842(false, true, false, 4);
			Class3_Sub13_Sub6.cacheIndex5 = Class8.method842(false, true, false, 5);
			Class75_Sub2.cacheIndex6 = Class8.method842(false, false, false, 6);
			Class159.cacheIndex7 = Class8.method842(false, true, false, getModelsIDX());
			Class140_Sub6.cacheIndex8 = Class8.method842(false, true, false, 8);
			Class3_Sub13_Sub28.cacheIndex9 = Class8.method842(false, true, false, 9);
			Class3_Sub13_Sub25.cacheIndex10 = Class8.method842(false, true, false, 10);
			NodeSub.cacheIndex11 = Class8.method842(false, true, false, 11);
			ClickMaskNode.cacheIndex12 = Class8.method842(false, true, false, 12);
			js5.cacheIndex13 = Class8.method842(false, true, false, 13);
			ClanMember.cacheIndex14 = Class8.method842(false, false, false, 14);
			Npc.cacheIndex15 = Class8.method842(false, true, false, 15);
			/*
			 * skeletons562 = Class8.method842(false, true, true, 16, true);
			 * skins562 = Class8.method842(false, true, true, 17, true);
			 * modelsCache562 = Class8.method842(false, true, true, 18, true);
			 * skeletons530 = Class8.method842(false, true, true, 19, true);
			 * skins530 = Class8.method842(false, true, true, 20, true);
			 * modelsCache530 = Class8.method842(false, true, true, 21, true);
			 */
			if(client.clientLoad != 602) {
				skeletons602 = Class8.method842(false, true, false, 22);
				skins602 = Class8.method842(false, true, false, 23);
				modelsCache602 = Class8.method842(false, true, false, 24);
			}
			// modelsCache666 = Class8.method842(false, true, true, 28, true);
			Class97.aClass153_1376 = Class8.method842(true, true, false, 25);// clientLoad
																			// ==
																			// 666
																			// ?
																			// 29
																			// :
																			// 25,
																			// true);
			/*
			 * Class168.aClass153_2097 = Class8.method842(false, true, true, 16,
			 * true); Npc.aClass153_3993 = Class8.method842(false, true, true,
			 * 17, true); Class101.aClass153_1428 = Class8.method842(false,
			 * true, true, 18, true); Class100.aClass153_1410 =
			 * Class8.method842(false, true, true, 19, true);
			 * Class3_Sub13_Sub36.aClass153_3429 = Class8.method842(false, true,
			 * true, 20, true); Class70.aClass153_1058 = Class8.method842(false,
			 * true, true, 21, true); Class3_Sub22.aClass153_2528 =
			 * Class8.method842(false, true, true, 22, true);
			 * Class133.aClass153_1751 = Class8.method842(true, true, true, 23,
			 * true); Class140_Sub7.aClass153_2939 = Class8.method842(false,
			 * true, true, 24, true); Class3_Sub4.aClass153_2258 =
			 * Class8.method842(false, true, true, 25, true);
			 * Class132.aClass153_1735 = Class8.method842(false, true, true, 27,
			 * true);
			 */
			ClientScript.anInt3684 = 15;
			TransformList.aClass94_2464 = Class157.aClass94_1995;
			HintIcon.loadingStage = 40;
	   } else if(HintIcon.loadingStage == 40) {
		   int percent = 0;
           
           percent += Class75_Sub3.cacheIndex0.getReferenceTableCompletion() * 4 / 100;
           percent += Class3_Sub28_Sub19.cacheIndex1.getReferenceTableCompletion() * 4 / 100;
           percent += Class164.cacheIndex2.getReferenceTableCompletion() * 2 / 100;
           percent += Class140_Sub3.cacheIndex3.getReferenceTableCompletion() * 2 / 100;
           percent += AbstractMouseWheel.cacheIndex4.getReferenceTableCompletion() * 6 / 100;
           percent += Class3_Sub13_Sub6.cacheIndex5.getReferenceTableCompletion() * 4 / 100;
           percent += Class75_Sub2.cacheIndex6.getReferenceTableCompletion() * 2 / 100;
           percent += Class159.cacheIndex7.getReferenceTableCompletion() * 60 / 100;
           percent += Class140_Sub6.cacheIndex8.getReferenceTableCompletion() * 2 / 100;
           percent += Class3_Sub13_Sub28.cacheIndex9.getReferenceTableCompletion() * 2 / 100;
           percent += Class3_Sub13_Sub25.cacheIndex10.getReferenceTableCompletion() * 2 / 100;
           percent += NodeSub.cacheIndex11.getReferenceTableCompletion() * 2 / 100;
           percent += ClickMaskNode.cacheIndex12.getReferenceTableCompletion() * 2 / 100;
           percent += js5.cacheIndex13.getReferenceTableCompletion() * 2 / 100;
           percent += ClanMember.cacheIndex14.getReferenceTableCompletion() * 2 / 100;
           percent += Npc.cacheIndex15.getReferenceTableCompletion() * 2 / 100;
           

           //for(var3 = 0; var3 < client.indexCount; ++var3) {
           //    var2 += Buffer.aClass151_Sub1Array2601[var3].getReferenceTableCompletion(-61) * Class3_Sub13_Sub23.anIntArray3288[var3] / 100;
           //}
           //var2 = 100;
           
           if(percent != 100) {
        	   if(0 != percent) {
        		   TransformList.aClass94_2464 = client.method903(new jString[]{Class12.aClass94_327, Class72.method1298(percent), IdentityKit.aClass94_468});
        	   }
        	   
        	   ClientScript.anInt3684 = 20;
           } else {
        	   ClientScript.anInt3684 = 20;
        	   TransformList.aClass94_2464 = Class44_Sub1.aClass94_2624;
        	   Class39.loadMiscSprites(Class140_Sub6.cacheIndex8);
        	   Class97.loadTitleScreen(Class3_Sub13_Sub25.cacheIndex10);
        	   //Class3_Sub13_Sub13.loadRunes(Class140_Sub6.cacheIndex8);
        	   HintIcon.loadingStage = 45;
           }
	   }
	   if(HintIcon.loadingStage == 45) {
		   Class140_Sub3.method1959(256, 2, 22050, Class3_Sub13_Sub15.isStereo);
		   Class86.aClass3_Sub24_Sub4_1193 = new Class3_Sub24_Sub4();
		   Class86.aClass3_Sub24_Sub4_1193.method479((byte)98, 9, 128);
		   Class44_Sub1.aClass155_2627 = Class58.method1195(22050, Class38.gameSignlink, InvType.canvas, 0, 14);
		   Class44_Sub1.aClass155_2627.method2154(-116, Class86.aClass3_Sub24_Sub4_1193);
		   client.method897(Class86.aClass3_Sub24_Sub4_1193, Npc.cacheIndex15, ClanMember.cacheIndex14, AbstractMouseWheel.cacheIndex4);
		   Class3_Sub21.aClass155_2491 = Class58.method1195(2048, Class38.gameSignlink, InvType.canvas, 1, 14);
		   Class3_Sub26.aClass3_Sub24_Sub2_2563 = new Class3_Sub24_Sub2();
		   Class3_Sub21.aClass155_2491.method2154(-128, Class3_Sub26.aClass3_Sub24_Sub2_2563);
		   Class27.aClass157_524 = new Class157(22050, Class21.anInt443);//TODO fucking music disabled
		   KeyboardHandler.anInt1912 = -1;//Class75_Sub2.cacheIndex6.method2120(Class1.aClass94_53);
		   ClientScript.anInt3684 = 30;
		   HintIcon.loadingStage = 50;
		   TransformList.aClass94_2464 = Class131.aClass94_1731;
	   } else if(HintIcon.loadingStage == 50) {
           var2 = Class3_Sub13_Sub12.method228(Class140_Sub6.cacheIndex8, js5.cacheIndex13);
           var3 = RuntimeException_Sub1.method2286();
           if(~var2 <= ~var3) {
              TransformList.aClass94_2464 = Class143.aClass94_1879;
              ClientScript.anInt3684 = 35;
              HintIcon.loadingStage = 60;
              client.loadFonts(js5.cacheIndex13, 0, Class140_Sub6.cacheIndex8);
           } else {
              TransformList.aClass94_2464 = client.method903(new jString[]{Class3_Sub28_Sub11.aClass94_3643, Class72.method1298(100 * var2 / var3), IdentityKit.aClass94_468});
              ClientScript.anInt3684 = 35;
           }
	   } else if(HintIcon.loadingStage == 60) {
           var2 = Class3_Sub28_Sub11.method599(-20916, Class140_Sub6.cacheIndex8);
           var3 = CursorType.method1185();
           if(var3 <= var2) {
              TransformList.aClass94_2464 = Class3_Sub28_Sub4.aClass94_3575;
              HintIcon.loadingStage = 65;
              ClientScript.anInt3684 = 40;
           } else {
              TransformList.aClass94_2464 = client.method903(new jString[]{IdentityKit.aClass94_461, Class72.method1298(100 * var2 / var3), IdentityKit.aClass94_468});
              ClientScript.anInt3684 = 40;
           }
	   } else if(HintIcon.loadingStage == 65) {
           ClientScript.anInt3684 = 45;
           TransformList.aClass94_2464 = Class23.aClass94_459;
           Class117.setGameState(5);
           HintIcon.loadingStage = 70;
	   } else if(HintIcon.loadingStage == 70) {
           if(Class164.cacheIndex2.allGroupsExist()) {
              Class132.method1799((byte)96, Class164.cacheIndex2);
              ClientScript.method631(false, Class164.cacheIndex2);
              Class3_Sub28_Sub8.method575(Class164.cacheIndex2, -1);
              InterfaceListener.method375(3, Class159.cacheIndex7, Class164.cacheIndex2);
              Class108.method1661(2, Class164.cacheIndex2, Class159.cacheIndex7, true);
              ItemDefinition.method1103(Class159.cacheIndex7, Class164.cacheIndex2, false);
              SceneGraphNode.method1864(true, (byte)-126, OverlayType.aClass153_1410, Class157.aClass3_Sub28_Sub17_Sub1_2000, Class159.cacheIndex7);
              Varp.method969(Class164.cacheIndex2, 59);
              Class3_Sub20.method392(Class3_Sub28_Sub19.cacheIndex1, Class164.cacheIndex2, -77, Class75_Sub3.cacheIndex0);
              FileSystem.method1053((byte)-117, Class164.cacheIndex2);
              AbstractGraphicsBuffer.method2180(Class159.cacheIndex7, Class70.aClass153_1058);
              Class107.method1648(Class164.cacheIndex2, 255);
              StringNode.setupVarpJs5(Class164.cacheIndex2);
              Node.method89(js5.cacheIndex13, Class140_Sub6.cacheIndex8, Class140_Sub3.cacheIndex3, Class159.cacheIndex7);
              Class3_Sub13_Sub17.method250(2048, Class164.cacheIndex2);
              Class46.method1086(Class164.cacheIndex2, -6);
              Class3_Sub13_Sub8.method205(Class3_Sub4.aClass153_2258, ItemPile.aClass153_2939, new Class7());
              Class65.method1236(Class3_Sub4.aClass153_2258, ItemPile.aClass153_2939, -117);
              Class58.method1197(Class164.cacheIndex2, (byte)69);
              Class144.method2065((byte)-125, Class164.cacheIndex2, Class140_Sub6.cacheIndex8);
              Class107.method1645(Class164.cacheIndex2, Class140_Sub6.cacheIndex8, (byte)-67);
              ClientScript.anInt3684 = 50;
              TransformList.aClass94_2464 = Class3_Sub13_Sub12.aClass94_3142;
              Varp.method968(128);
              HintIcon.loadingStage = 80;
           } else {
              TransformList.aClass94_2464 = client.method903(new jString[]{Class3_Sub28_Sub2.aClass94_3546, Class72.method1298(Class164.cacheIndex2.getTotalCompletion()), IdentityKit.aClass94_468});
              ClientScript.anInt3684 = 50;
           }
	   } else if(HintIcon.loadingStage == 80) {
		   var2 = Class3_Sub4.method107(Class140_Sub6.cacheIndex8);
		   var3 = Class3_Sub13_Sub9.method208();
		   if(~var3 < ~var2) {
			   TransformList.aClass94_2464 = client.method903(new jString[]{Class3_Sub13_Sub38.aClass94_3445, Class72.method1298(var2 * 100 / var3), IdentityKit.aClass94_468});
			   ClientScript.anInt3684 = 60;
		   } else {
			   Class14.method887(21, Class140_Sub6.cacheIndex8);
			   HintIcon.loadingStage = 90;
			   ClientScript.anInt3684 = 60;
			   TransformList.aClass94_2464 = Hashtable.aClass94_1707;
		   }
	   } else if(HintIcon.loadingStage == 90) {
		   if(!Class97.aClass153_1376.allGroupsExist()) {
			   TransformList.aClass94_2464 = client.method903(new jString[]{Class145.aClass94_1892, Class72.method1298((byte)9), IdentityKit.aClass94_468});
			   ClientScript.anInt3684 = 70;
		   } else {
			   TextureLoader var8 = new TextureLoader(Class3_Sub13_Sub28.cacheIndex9, Class97.aClass153_1376, Class140_Sub6.cacheIndex8, 20, !Class25.lowMemoryTextures);
			   Rasterizer.method1140(var8);
			   if(~Class3_Sub28_Sub10.brightness == -2) {
				   Rasterizer.method1137(0.9F);
			   }
			   
			   if(2 == Class3_Sub28_Sub10.brightness) {
				   Rasterizer.method1137(0.8F);
			   }

			   if(Class3_Sub28_Sub10.brightness == 3) {
				   Rasterizer.method1137(0.7F);
			   }

			   if(~Class3_Sub28_Sub10.brightness == -5) {
				   Rasterizer.method1137(0.6F);
			   }

			   TransformList.aClass94_2464 = Class3_Sub13_Sub14.aClass94_3167;
			   HintIcon.loadingStage = 100;
			   ClientScript.anInt3684 = 70;
		   }
	   } else if(HintIcon.loadingStage == 100) {
		   if(Class3_Sub13_Sub25.cacheIndex10.allGroupsExist()) {
			   String url = Signlink.osArchRaw.contains("64") ? "http://www.paragon464.com/assets/lib/win64.zip" : "http://www.paragon464.com/assets/lib/win32.zip";
			   //new Downloader(url);
			   HintIcon.loadingStage = 110;
		   }
	   } else if(HintIcon.loadingStage == 110) {
           DisplayModeInformation.aClass67_1443 = new Class67();
           Class38.gameSignlink.startThread(DisplayModeInformation.aClass67_1443, 10);
           TransformList.aClass94_2464 = OverlayType.aClass94_1409;
           ClientScript.anInt3684 = 75;
           HintIcon.loadingStage = 120;
	   } else if(HintIcon.loadingStage == 120) {
		   if(Class3_Sub13_Sub25.cacheIndex10.method2125(GroundItem.aClass94_3672, Texture.aClass94_3792)) {
			   Huffman var9 = new Huffman(Class3_Sub13_Sub25.cacheIndex10.method2123(GroundItem.aClass94_3672, Texture.aClass94_3792));
			   Class1.method69(var9, 104);
			   TransformList.aClass94_2464 = Class117.aClass94_1615;
	           HintIcon.loadingStage = 130;
	           ClientScript.anInt3684 = 80;
		   } else {
			   TransformList.aClass94_2464 = client.method903(new jString[]{Class86.aClass94_1183, InputStream_Sub1.aClass94_37});
			   ClientScript.anInt3684 = 80;
		   }
	   } else if(HintIcon.loadingStage == 130) {
		   if(Class140_Sub3.cacheIndex3.allGroupsExist()) {
			   if(ClickMaskNode.cacheIndex12.allGroupsExist()) {
				   if(js5.cacheIndex13.allGroupsExist()) {
					   ClientScript.anInt3684 = 95;
					   TransformList.aClass94_2464 = Buffer.aClass94_2597;
					   HintIcon.loadingStage = 135;
				   } else {
					   TransformList.aClass94_2464 = client.method903(new jString[]{js5Worker.aClass94_2961, Class72.method1298(85 + (js5.cacheIndex13.getTotalCompletion() / 20)), IdentityKit.aClass94_468});
					   ClientScript.anInt3684 = 85;
				   }
			   } else {
				   TransformList.aClass94_2464 = client.method903(new jString[]{js5Worker.aClass94_2961, Class72.method1298(75 +(ClickMaskNode.cacheIndex12.getTotalCompletion() / 10)), IdentityKit.aClass94_468});
				   ClientScript.anInt3684 = 85;
			   }
		   } else {
			   TransformList.aClass94_2464 = client.method903(new jString[]{js5Worker.aClass94_2961, Class72.method1298(Class140_Sub3.cacheIndex3.getTotalCompletion() * 3 / 4), IdentityKit.aClass94_468});
			   ClientScript.anInt3684 = 85;
		   }	
	   } else if(135 == HintIcon.loadingStage) {
		   HintIcon.loadingStage = 140;
		   ClientScript.anInt3684 = 96;
	   } else if(HintIcon.loadingStage == 140) {
           Class3_Sub22.loginScreenInterfaceid = 601;//Class140_Sub3.aClass153_2727.method2120(Npc.aClass94_3992, (byte)-30);
           Class3_Sub13_Sub6.cacheIndex5.method2115(false, true);
           Class75_Sub2.cacheIndex6.method2115(true, true);
           Class140_Sub6.cacheIndex8.method2115(true, true);
           js5.cacheIndex13.method2115(true, true);
           Class3_Sub13_Sub25.cacheIndex10.method2115(true, true);
           Class140_Sub3.cacheIndex3.method2115(true, true);
           ClientScript.anInt3684 = 97;
           TransformList.aClass94_2464 = Class3_Sub5.aClass94_2267;
           HintIcon.loadingStage = 150;
           Class58.aBoolean913 = true;
	   } else if(HintIcon.loadingStage == 150) {
		   Class88.method1454();
		   /*if(jString.safeMode) {
			   Class3_Sub28_Sub9.anInt3622 = 0;
			   Class3_Sub28_Sub14.antiAliasing = 0;
			   NodeSub.anInt2577 = 0;
			   Class3_Sub20.anInt2488 = 0;
		   }*/

		   //jString.safeMode = true;
		   Class119.writePreferences(Class38.gameSignlink);
		   SceneGraphNode.method1862(false, NodeSub.anInt2577, -1, -1);
		   ClientScript.anInt3684 = 100;
		   HintIcon.loadingStage = 160;
		   TransformList.aClass94_2464 = NodeSub.aClass94_2576;
	   } else if(HintIcon.loadingStage == 160) {
		   Class3_Sub13_Sub11.method219(true);
		   if (Class59.hdEnabled) {
			   SceneGraphNode.method1862(false, 1, -1, -1);
		   }
	   }
   }

   final void mainLoop() {
		Class44.loopCycle++;// TODO mainloop
		if (Class44.loopCycle % 1000 == 1) {
			GregorianCalendar var2 = new GregorianCalendar();
			Class38_Sub1.randomSeed = var2.get(11) * 600 - (-(var2.get(12) * 10) + -(var2.get(13) / 6));
			Class3_Sub13_Sub7.tooltipRandomGenerator.setSeed((long) Class38_Sub1.randomSeed);
		}

		handleUpdateServer();
		handleRequests();

		StringNode.method728();
		Class58.method1194();
		Class32.method996();
		Class62.method1225();
		if (HDToolkit.openGLEnabled) {
			Class31.method990();
		}

		int var4;
		if (Class38.mouseWheelHandler != null) {
			var4 = Class38.mouseWheelHandler.getRotation();
			Varp.anInt561 = var4;
		}
		if (Class143.gameState != 0) {
			if (Class143.gameState == 5) {
				load();
				Class75_Sub4.method1355();
			} else if (Class143.gameState == 25 || Class143.gameState == 28) {
				Class40.rebuildMap();
			}
		} else {
			load();
			Class75_Sub4.method1355();
		}
		if (10 == Class143.gameState) {
			method47((byte) 1);
			Class3_Sub13_Sub21.method267((byte) 36);
			Class163_Sub1_Sub1.method2216((byte) 81);
			Class127.login((byte) -9);
		} else if (Class143.gameState == 30) {
			Class3_Sub13_Sub13.handleMainGame(true);
		} else if (Class143.gameState == 40) {
			Class127.login((byte) -9);
			if (~AbstractGraphicsBuffer.returnCode != 2) {
				if (AbstractGraphicsBuffer.returnCode == 15) {
					Class21.method912(false);
				} else if (AbstractGraphicsBuffer.returnCode != 2) {
					Class167.processLogout();
				}
			}
		}
		/*if (!closed_revision_choosing && Class143.gameState != 5) {
			System.out.println("HEREEEEEEEE");
			
		} else {
			handleSelectingScreen();
		}*/
   }
   
   static final void drawScreen() {
	try {
		//client.revision_images[0].drawSprite(0, 0);
		revision_images[1].drawFlippedSprite(263, 165);
		revision_images[2].drawFlippedSprite(263, 300);
		if (clientLoad == 464) {
			set_464[1].drawFlippedSprite(263, 215);
		} else {
			set_464[0].drawFlippedSprite(263, 215);
		}
		if (clientLoad == 530) {
			set_530[1].drawFlippedSprite(327, 215);
		} else {
			set_530[0].drawFlippedSprite(327, 215);
		}
		if (clientLoad == 562) {
			set_562[1].drawFlippedSprite(391, 215);
		} else {
			set_562[0].drawFlippedSprite(391, 215);
		}
		if (clientLoad == 602) {
			set_602[1].drawFlippedSprite(455, 215);
		} else {
			set_602[0].drawFlippedSprite(455, 215);
		}
		/*Graphics var5 = InvType.canvas.getGraphics();
		
		if (Class3_Sub13_Sub32.aFont3384 == null) {
			Class3_Sub13_Sub32.aFont3384 = new Font("Helvetica", 1, 20);
		}
		
		if (null == Class3_Sub14.selectionImage) {
			Class3_Sub14.selectionImage = InvType.canvas.createImage(765, 503);
		}

		Graphics var6 = Class3_Sub14.selectionImage.getGraphics();
		
		var6.setColor(Color.black);
		var6.fillRect(0, 0, 765, 503);
		
		var6.setColor(Color.gray);
		var6.drawRect(420, 77, 60, 35);
		var6.drawRect(440, 125, 60, 35);
		var6.drawRect(490, 175, 60, 35);
		var6.drawRect(343, 256, 100, 35);
		
		var6.setColor(Color.white);
		var6.setFont(Class3_Sub13_Sub32.aFont3384);
		var6.drawString("Continue", 350, 280);
		var6.drawString(""+Class59.hdEnabled, 448, 150);
		var6.drawString(""+client.clientLoad, 435, 102);
		var6.drawString(""+Class3_Sub26.forceTweeningEnabled, 503, 200);
		var6.drawString("HD enabled:", 300, 150);
		var6.drawString("Revision:", 300, 100);
		var6.drawString("Tweening enabled:", 300, 200);
		
		var5.drawImage(Class3_Sub14.selectionImage, 0, 0, null);*/
		
	} catch (Exception var10) {
		InvType.canvas.repaint();
	}
}

static final void method406(boolean var1, Font var2) {
		int var3;
		/*if (!client.closed_revision_choosing) {
			if (client.clientLoad == 464) {
				client.set_464[1].drawSprite(263, 215);
			} else {
				client.set_464[0].drawSprite(263, 215);
			}
			if (client.clientLoad == 530) {
				client.set_530[1].drawSprite(327, 215);
			} else {
				client.set_530[0].drawSprite(327, 215);
			}
			if (client.clientLoad == 562) {
				client.set_562[1].drawSprite(391, 215);
			} else {
				client.set_562[0].drawSprite(391, 215);
			}
			if (client.clientLoad == 602) {
				client.set_602[1].drawSprite(455, 215);
			} else {
				client.set_602[0].drawSprite(455, 215);
			}
			return;
		}*/
		if (HDToolkit.openGLEnabled || var1) {
			var3 = ItemPile.canvasHei;
			int var4 = var3 * 956 / 503;
			//Class40.aClass3_Sub28_Sub16_680.method639((Class23.canvasWid + -var4) / 2, 0, var4, var3);
			//AnimationDefinition.aClass109_1856.method1667(-(AnimationDefinition.aClass109_1856.anInt1461 / 2) + Class23.canvasWid / 2, 18);
		}
		var2.method699(Class25.aClass94_485, Class23.canvasWid / 2, ItemPile.canvasHei / 2 - 26, 16777215, -1);
		var3 = ItemPile.canvasHei / 2 + -18;
		if (HDToolkit.openGLEnabled) {
			GraphicsHD.drawRect(Class23.canvasWid / 2 - 152, var3, 304, 34, 9179409);
			GraphicsHD.drawRect(-151 + Class23.canvasWid / 2, var3 - -1, 302, 32, 0);
			GraphicsHD.fillRect(Class23.canvasWid / 2 - 150, var3 + 2, ClientScript.anInt3684 * 3, 30, 9179409);
			GraphicsHD.fillRect(Class23.canvasWid / 2 + -150 - -(3 * ClientScript.anInt3684), 2 + var3, 300 + -(3 * ClientScript.anInt3684), 30, 0);
		} else {
			GraphicsLD.drawRect(Class23.canvasWid / 2 + -152, var3, 304, 34, 9179409);
			GraphicsLD.drawRect(-151 + Class23.canvasWid / 2, var3 + 1, 302, 32, 0);
			GraphicsLD.fillRect(Class23.canvasWid / 2 + -150, var3 + 2, ClientScript.anInt3684 * 3, 30, 9179409);
			GraphicsLD.fillRect(3 * ClientScript.anInt3684 + -150 + Class23.canvasWid / 2, 2 + var3, -(3 * ClientScript.anInt3684) + 300, 30, 0);
		}

		var2.method699(TransformList.aClass94_2464, Class23.canvasWid / 2, 4 + ItemPile.canvasHei / 2, 16777215, -1);
   }

static final void handleSelectingScreen() {
	   int x = Class163_Sub1.anInt2993;
	   int y = Class38_Sub1.anInt2614;
	   //System.out.println("x: "+x+", y: " + y);
	   if(x >= 420 && y >= 77 && x <= 480 && y <= 110 && Class3_Sub28_Sub11.anInt3644 == 1) {
		   if(clientLoad == 464) {
			   clientLoad = 530;
		   } else if(clientLoad == 530) {
			   clientLoad = 562;
		   } else if(clientLoad == 562) {
			   clientLoad = 602;
		   } else if(clientLoad == 602) {
			   clientLoad = 464;
		   }
	   }
	   if(x >= 440 && y >= 124 && x <= 500 && y <= 160 && Class3_Sub28_Sub11.anInt3644 == 1) {
		   Class59.hdEnabled = !Class59.hdEnabled;
	   }
	   if(x >= 489 && y >= 174 && x <= 550 && y <= 209 && Class3_Sub28_Sub11.anInt3644 == 1) {
		   Class3_Sub26.forceTweeningEnabled = !Class3_Sub26.forceTweeningEnabled;
	   }
	   if(x >= 266 && y >= 302 && x <= 512 && y <= 342 && Class3_Sub28_Sub11.anInt3644 == 1) {
		  closed_revision_choosing = true;
		  for (int i = 0; i < revision_images.length; i++) {
			  revision_images[i].drawSprite(-1, -1);
			}
			for (int i = 0; i < set_464.length; i++) {
				set_464[i].drawSprite(-1, -1);
			}
			for (int i = 0; i < set_530.length; i++) {
				set_530[i].drawSprite(-1, -1);
			}
			for (int i = 0; i < set_562.length; i++) {
				set_562[i].drawSprite(-1, -1);
			}
			for (int i = 0; i < set_602.length; i++) {
				set_602[i].drawSprite(-1, -1);
			}
	   }
   }

static final void load_title_screen(js5 var0) {
	   if(!Class140_Sub2.titleScreenLoaded) {
           if(!HDToolkit.openGLEnabled) {
              GraphicsLD.resetPixels();
           } else {
              GraphicsHD.resetPixels();
           }
           if(Class3_Sub13_Sub25.cacheIndex10.method2144(Class154.anInt1966)) {
               LDSprite tempSprite = new LDSprite(Class3_Sub13_Sub25.cacheIndex10.getFile(0, Class154.anInt1966), InvType.canvas);
	           if(HDToolkit.openGLEnabled) {
	        	   Class40.aClass3_Sub28_Sub16_680 = new HDSprite(tempSprite);
	           } else
	        	   Class40.aClass3_Sub28_Sub16_680 = tempSprite;
	           
	           //Class40.aClass3_Sub28_Sub16_680 = Class75_Sub2.method1344(117, var0, Class154.anInt1966);
	           int var2 = ItemPile.canvasHei;
	           int var3 = var2 * 956 / 503;
	           Class40.aClass3_Sub28_Sub16_680.method639((Class23.canvasWid + -var3) / 2, 0, var3, var2);
           }
           //AnimationDefinition.aClass109_1856 = Class3_Sub28_Sub6.a(Class79.anInt1124, var0, true);//TODO logo
           //AnimationDefinition.aClass109_1856.method1667(Class23.canvasWid / 2 + -(AnimationDefinition.aClass109_1856.anInt1461 / 2), 18);
           Class140_Sub2.titleScreenLoaded = true;
        }
   }

public static void method896(boolean var0) {
      try {
         client.aClass94_388 = null;
         //client.aClass94_374 = null;
         client.aClass94_392 = null;
         client.aClass94_385 = null;
         client.aClass94_376 = null;
         client.aClass94_397 = null;
         client.anIntArray356 = null;
         //client.aClass94_366 = null;
         client.aClass94Array358 = null;
         client.aClass94_378 = null;
         client.aClass94_365 = null;
         client.aClass94_394 = null;
         if(!var0) {
            SpotAnimation.list(-109);
         }

         client.aClass94_361 = null;
         client.aClass94_391 = null;
         client.aClass94_401 = null;
         client.aClass94_405 = null;
         client.aClass94_363 = null;
         //client.aByteArrayArrayArray383 = (byte[][][])null;
         client.aClass94_404 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ck.A(" + var0 + ')');
      }
   }

static final boolean method897(Class3_Sub24_Sub4 var1, js5 var2, js5 var3, js5 var4) {
         Class124.aClass153_1661 = var2;
         Class40.aClass153_679 = var4;
         Texture.aClass153_3786 = var3;
         Class101.aClass3_Sub24_Sub4_1421 = var1;
         return true;
   }

static final void method900(Entity var0, int var1) {
      try {
         var0.aBoolean2810 = false;
         if(-1 != var0.currentMoveAnimation) {
        	 AnimationDefinition var2 = AnimationDefinition.list(var0.currentMoveAnimation, false);
            if(null != var2 && null != var2.frames) {
               ++var0.anInt2802;
               if(~var2.frames.length < ~var0.anInt2813 && var0.anInt2802 > var2.cycles[var0.anInt2813]) {
                  var0.anInt2802 = 1;
                  ++var0.anInt2813;
                  ++var0.anInt2793;
                  jSocket.method1470(var0.anInt2829, var2, 183921384, var0.anInt2819, var0 == TextureLoader.selfPlayer, var0.anInt2813);
               }

               if(~var0.anInt2813 <= ~var2.frames.length) {
                  var0.anInt2813 = 0;
                  /*
                   * if (arg1.aBoolean5198) {
							arg1.anInt5225 = arg1.method1326(4).method2454(
									(byte) 109);
							if (arg1.anInt5225 == -1) {
								arg1.aBoolean5198 = false;
								break;
							}
							class95 = Class125.method1404(-8192, arg1.anInt5225);
						}//TODO this
                   */
                  jSocket.method1470(var0.anInt2829, var2, 183921384, var0.anInt2819, TextureLoader.selfPlayer == var0, var0.anInt2813);
               }

               var0.anInt2793 = var0.anInt2813 + 1;
               if(~var0.anInt2793 <= ~var2.frames.length) {
                  var0.anInt2793 = 0;
               }
            } else {
            	//TODO missing boolean here to add  aBoolean5198 in entity
               var0.currentMoveAnimation = -1;
            }
         }

         int var6;
         if(var0.anInt2842 != -1 && ~Class44.loopCycle <= ~var0.anInt2759) {
            var6 = SpotAnimation.list(var0.anInt2842).anInt542;
            if(0 != ~var6) {
               AnimationDefinition var3 = AnimationDefinition.list(var6, false);
               if(var3 != null && var3.frames != null) {
                  if(0 > var0.anInt2805) {
                     var0.anInt2805 = 0;
                     jSocket.method1470(var0.anInt2829, var3, 183921384, var0.anInt2819, TextureLoader.selfPlayer == var0, 0);
                  }

                  ++var0.anInt2761;
                  if(var0.anInt2805 < var3.frames.length && ~var3.cycles[var0.anInt2805] > ~var0.anInt2761) {
                     ++var0.anInt2805;
                     var0.anInt2761 = 1;
                     jSocket.method1470(var0.anInt2829, var3, var1 ^ -183911469, var0.anInt2819, TextureLoader.selfPlayer == var0, var0.anInt2805);
                  }

                  if(var0.anInt2805 >= var3.frames.length) {
                     var0.anInt2842 = -1;
                  }

                  var0.anInt2826 = var0.anInt2805 + 1;
                  if(~var3.frames.length >= ~var0.anInt2826) {
                     var0.anInt2826 = -1;//TODO convert this graphics part class153_sub37 on 569
                  }
               } else {
                  var0.anInt2842 = -1;
               }
            } else {
               var0.anInt2842 = -1;
            }
         }

         if(~var0.currentAnimationId != 0 && -2 <= ~var0.animationDelay) {
        	 AnimationDefinition var2 = AnimationDefinition.list(var0.currentAnimationId, false);
            if(~var2.anInt1866 == -2 && var0.anInt2811 > 0 && ~Class44.loopCycle <= ~var0.anInt2800 && Class44.loopCycle > var0.anInt2790) {
               var0.animationDelay = 1;
               return;
            }
         }

         if(var1 == -11973) {
            if(~var0.currentAnimationId != 0 && -1 == ~var0.animationDelay) {
            	AnimationDefinition var2 = AnimationDefinition.list(var0.currentAnimationId, false);
               if(var2 != null && var2.frames != null) {
                  ++var0.anInt2760;
                  if(~var0.anInt2832 > ~var2.frames.length && var0.anInt2760 > var2.cycles[var0.anInt2832]) {
                     var0.anInt2760 = 1;
                     ++var0.anInt2832;
                     jSocket.method1470(var0.anInt2829, var2, 183921384, var0.anInt2819, var0 == TextureLoader.selfPlayer, var0.anInt2832);
                  }

                  if(var2.frames.length <= var0.anInt2832) {
                     var0.anInt2832 -= var2.anInt1865;
                     ++var0.anInt2773;
                     if(~var0.anInt2773 > ~var2.anInt1861) {
                        if(var0.anInt2832 >= 0 && ~var2.frames.length < ~var0.anInt2832) {
                           jSocket.method1470(var0.anInt2829, var2, var1 ^ -183911469, var0.anInt2819, TextureLoader.selfPlayer == var0, var0.anInt2832);
                        } else {
                           var0.currentAnimationId = -1;
                        }
                     } else {
                        var0.currentAnimationId = -1;
                     }
                  }

                  var0.anInt2776 = var0.anInt2832 + 1;
                  if(var0.anInt2776 >= var2.frames.length) {
                     var0.anInt2776 -= var2.anInt1865;
                     if(var2.anInt1861 > var0.anInt2773 + 1) {
                        if(0 > var0.anInt2776 || var0.anInt2776 >= var2.frames.length) {
                           var0.anInt2776 = -1;
                        }
                     } else {
                        var0.anInt2776 = -1;
                     }
                  }

                  var0.aBoolean2810 = var2.aBoolean1859;
               } else {
                  var0.currentAnimationId = -1;
               }
            }

            if(0 < var0.animationDelay) {
               --var0.animationDelay;
            }

            for(var6 = 0; var0.aClass145Array2809.length > var6; ++var6) {
               Class145 var7 = var0.aClass145Array2809[var6];
               if(null != var7) {
                  if(~var7.anInt1900 >= -1) {
                     AnimationDefinition var4 = AnimationDefinition.list(var7.anInt1890, false);
                     if(null != var4 && var4.frames != null) {
                        ++var7.anInt1897;
                        if(var7.anInt1893 < var4.frames.length && var7.anInt1897 > var4.cycles[var7.anInt1893]) {
                           ++var7.anInt1893;
                           var7.anInt1897 = 1;
                           jSocket.method1470(var0.anInt2829, var4, 183921384, var0.anInt2819, var0 == TextureLoader.selfPlayer, var7.anInt1893);
                        }

                        if(~var4.frames.length >= ~var7.anInt1893) {
                           ++var7.anInt1894;
                           var7.anInt1893 -= var4.anInt1865;
                           if(var4.anInt1861 > var7.anInt1894) {
                              if(-1 >= ~var7.anInt1893 && ~var7.anInt1893 > ~var4.frames.length) {
                                 jSocket.method1470(var0.anInt2829, var4, 183921384, var0.anInt2819, TextureLoader.selfPlayer == var0, var7.anInt1893);
                              } else {
                                 var0.aClass145Array2809[var6] = null;
                              }
                           } else {
                              var0.aClass145Array2809[var6] = null;
                           }
                        }

                        var7.anInt1891 = 1 + var7.anInt1893;
                        if(var4.frames.length <= var7.anInt1891) {
                           var7.anInt1891 -= var4.anInt1865;
                           if(1 + var7.anInt1894 < var4.anInt1861) {
                              if(-1 < ~var7.anInt1891 || var4.frames.length <= var7.anInt1891) {
                                 var7.anInt1891 = -1;
                              }
                           } else {
                              var7.anInt1891 = -1;
                           }
                        }
                     } else {
                        var0.aClass145Array2809[var6] = null;
                     }
                  } else {
                     --var7.anInt1900;
                  }
               }
            }

         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "ck.F(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
	}

	static final void method816(int i, FileSystem class28, js5Worker class18_sub1, int i_5_) {
		UpdateServerNode node = new UpdateServerNode();
		node.js5Worker = class18_sub1;
		node.fileSystem = class28;
		node.anInt1246 = i_5_;
		node.hash = (long) i;
		synchronized (client.updateServerList) {
			client.updateServerList.insertBack(node);
		}
		client.method568();
	}
	
    static final void method37(FileSystem class28, byte[] is, int i) {
    	UpdateServerNode node = new UpdateServerNode();
    	node.hash = (long) i;
    	node.buffer = is;
    	node.anInt1246 = 0;
    	node.fileSystem = class28;
    	synchronized (client.updateServerList) {
    		client.updateServerList.insertBack(node);
    	}
    	client.method568();
    }

	static final jString method903(jString[] var0) {
		if (-3 >= ~var0.length) {
			return Class67.method1261(0, var0.length, var0, 2774);
		} else {
			throw new IllegalArgumentException();
		}
	}

static final AbstractSprite method602(int var0, int var1, js5 var3) {
	   if(spriteExists(var3, var0, var1)) {
           return method1062();
        } else {
           return null;
        }
   }

static final AbstractSprite method1062() {
	   byte[] var2 = Class163_Sub1.spritePaletteIndicators[0];
       int var1 = ItemPile.spriteWidths[0] * Class3_Sub13_Sub6.spriteHeights[0];
       int[] var3 = new int[var1];
       for(int var4 = 0; ~var1 < ~var4; ++var4) {
          var3[var4] = Class3_Sub13_Sub38.spritePalette[ClientScript.method633(var2[var4], 255)];
       }
       Object var6;
       if(!HDToolkit.openGLEnabled) {
          var6 = new LDSprite(Class3_Sub15.spriteTrimWidth, GrandExchangeItem.spriteTrimHeight, Class164.spriteXOffsets[0], Buffer.spriteYOffsets[0], ItemPile.spriteWidths[0], Class3_Sub13_Sub6.spriteHeights[0], var3);
       } else {
          var6 = new HDSprite(Class3_Sub15.spriteTrimWidth, GrandExchangeItem.spriteTrimHeight, Class164.spriteXOffsets[0], Buffer.spriteYOffsets[0], ItemPile.spriteWidths[0], Class3_Sub13_Sub6.spriteHeights[0], var3);
       }
       resetSprites();
       return (AbstractSprite)var6;
   }

	static final Font constructFont(byte[] var1) {
		if (null != var1) {
			Object var2;
			if (!HDToolkit.openGLEnabled) {
				var2 = new LDFont(var1, Class164.spriteXOffsets, Buffer.spriteYOffsets, ItemPile.spriteWidths, Class3_Sub13_Sub6.spriteHeights, Class163_Sub1.spritePaletteIndicators);
			} else {
				var2 = new HDFont(var1, Class164.spriteXOffsets, Buffer.spriteYOffsets, ItemPile.spriteWidths, Class3_Sub13_Sub6.spriteHeights, Class163_Sub1.spritePaletteIndicators);
			}
			resetSprites();
			return (Font) var2;
		} else {
			return null;
		}
	}


static final void method75(int i, js5Worker class18_sub1, FileSystem class28) {
	byte[] is = null;
	synchronized (updateServerList) {
		for (UpdateServerNode class3_sub10 = (UpdateServerNode) updateServerList.getFirst(); class3_sub10 != null; class3_sub10 = (UpdateServerNode) updateServerList.getNext()) {
			if ((long) i == class3_sub10.hash
					&& class28 == class3_sub10.fileSystem
					&& class3_sub10.anInt1246 == 0) {
				is = class3_sub10.buffer;
				break;
			}
		}
	}
	if (is != null)
		class18_sub1.method596(is, true, i, class28);
	else {
		byte[] is_28_ = class28.get(i);
		class18_sub1.method596(is_28_, true, i, class28);
	}
}

static final void resetSprites() {
	   ItemPile.spriteWidths = null;
       Buffer.spriteYOffsets = null;
       Class3_Sub13_Sub6.spriteHeights = null;
       Class163_Sub1.spritePaletteIndicators = (byte[][])null;
       Class164.spriteXOffsets = null;
       Class3_Sub13_Sub38.spritePalette = null;
   }

	static final int method117(int i_0_, int i_1_) {
		long l = (long) ((i_0_ << 16) + i_1_);
		if (Js5CacheWorker.aClass3_Sub3_Sub13_128 == null || l != Js5CacheWorker.aClass3_Sub3_Sub13_128.hash)
			return 0;
		return 1 + ((Js5CacheWorker.aClass3_Sub12_1448.pos) * 99 / (-(Js5CacheWorker.aClass3_Sub3_Sub13_128.padding) + Js5CacheWorker.aClass3_Sub12_1448.buf.length));
	}

static final void method568() {
	synchronized (anObject821) {
		if (anInt1465 == 0)
			Class38.gameSignlink.startThread(new UpdateServerThread(), 5);
		anInt1465 = 600;
	}
}

	static final boolean spriteExists(js5 var0, int sub_id, int id) {
		byte[] var4 = var0.getFile(id, 0);
		if(var4 != null) {
			Class45.decodeSprites(var4);
			return true;
		} else {
			return false;
		}
	}

static final void loadFonts(js5 var0, int var1, js5 sprite_cache) {
      try {
    	 setSmallFont(fetchFont(0, HintIcon.anInt1352, sprite_cache, var0));
    	 //setSmallFont602(fetchFont(0, HintIcon.anInt1352, sprite_cache, var0, true));
         if(!HDToolkit.openGLEnabled) {
            Class157.aClass3_Sub28_Sub17_Sub1_2000 = (LDFont)getSmallFont();
         } else {
            Class157.aClass3_Sub28_Sub17_Sub1_2000 = Class70.method1287(HintIcon.anInt1352, 0, var0, sprite_cache, -1);
         }
         setRegularFont(fetchFont(var1, Class75_Sub2.anInt2643, sprite_cache, var0));
         //setRegularFont602(fetchFont(var1, Class75_Sub2.anInt2643, sprite_cache, var0, true));
         setBoldFont(fetchFont(0, Class3_Sub13_Sub11.anInt3132, sprite_cache, var0));
         //setBoldFont602(fetchFont(0, Class3_Sub13_Sub11.anInt3132, sprite_cache, var0, true));
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "hn.D(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + (sprite_cache != null?"{...}":"null") + ')');
      }
   }

	static final Font fetchFont(int index, int file, js5 var3, js5 var4) {
		if (!client.spriteExists(var3, 0, file)) {
			return null;
		}
		return client.constructFont(var4.getFile(file, 0));
	}

static final void drawTextOnScreen(jString var2, boolean var1) {
		byte var3 = 4;
		int var4 = var3 + 6;
		int var5 = var3 + 6;
		int var6 = getRegularFont().method680(var2, 250);
		int var7 = getRegularFont().method684(var2, 250) * 13;
		if (!HDToolkit.openGLEnabled) {
			GraphicsLD.fillRect(var4 - var3, -var3 + var5, var3 + var6 - -var3, var3 + var3 + var7, 0);
			GraphicsLD.drawRect(var4 + -var3, var5 - var3, var3 + var3 + var6, var3 + var3 + var7, 16777215);
		} else {
			GraphicsHD.fillRect(var4 - var3, -var3 + var5, var3 + var6 - -var3, var3 + var3 + var7, 0);
			GraphicsHD.drawRect(-var3 + var4, -var3 + var5, var6 + var3 - -var3, var3 + var7 + var3, 16777215);
		}

		getRegularFont().method676(var2, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
		Class75.method1340(var4 + -var3, var6 + (var3 - -var3), -var3 + var5, var3 + var7 + var3);
		if (var1) {
			if (HDToolkit.openGLEnabled) {
				HDToolkit.method1826();
			} else {
				try {
					Graphics var8 = InvType.canvas.getGraphics();
					Class164_Sub1.aClass158_3009.drawGraphics(var8, 0, 0);
				} catch (Exception var9) {
					InvType.canvas.repaint();
				}
			}
		} else {
			LookupTable.method1282(var4, var5, var7, var6);
		}
   }

	public static Font getSmallFont() {
		return smallFont;
	}
	
	static final void method665() {
		synchronized (anObject821) {
			if (anInt1465 != 0) {
				anInt1465 = 1;
				try {
					anObject821.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
	}
   
   public static void setSmallFont(Font font) {
	   smallFont = font;
   }

   public static Font getBoldFont() {
	   return boldFont;
   }
   
   public static void setBoldFont(Font font) {
	   boldFont = font;
   }
   
   public static Font getRegularFont() {
	   return regularFont;
   }
   
   public static void setRegularFont(Font font) {
	   regularFont = font;
   }
   
	static final void handleRequests() {
		for (;;) {
			UpdateServerNode node;
			synchronized (client.updateServerList) {
				node = (UpdateServerNode) client.aClass60_2164.popFront();
			}
			if (node == null)
				break;
			node.js5Worker.method596(node.buffer, false, (int) node.hash, node.fileSystem);
		}
	}
   
}
