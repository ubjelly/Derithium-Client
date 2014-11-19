import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

final class BufferedRequest extends Class3_Sub28_Sub10 {

   byte padding;
   static jString aClass94_4066 = jString.createJString("<br>");
   int blockPosition;
   js5Worker worker;
   static boolean aBoolean4068 = true;
   Buffer buffer;
   static GroundTile[][][] aClass3_Sub2ArrayArrayArray4070;
   static int anInt4073;
   static jString aClass94_4071 = jString.createJString(" from your friend list first)3");

   final int method586() {
	   return (buffer == null ? 0 : buffer.pos * 100 / (buffer.buf.length - padding));
   }

	static final DisplayModeInformation[] gatherDisplayModesInformation(Signlink var1) {
		if (!var1.fullscreenImpExist()) {
			return new DisplayModeInformation[0];
		} else {
			SignlinkNode node = var1.getDisplayModesInformation();

			while (node.status == 0) {
				Class3_Sub13_Sub34.sleep(10L);
			}

			if (node.status == 2) {
				return new DisplayModeInformation[0];
			} else {
				int[] data = (int[]) node.value;
				DisplayModeInformation[] information = new DisplayModeInformation[data.length >> 2];

				for (int id = 0; id < information.length; ++id) {
					DisplayModeInformation instance = new DisplayModeInformation();
					information[id] = instance;
					instance.width = data[id << 2];
					instance.height = data[(id << 2) + 1];
					instance.bitDepth = data[(id << 2) + 2];
					instance.refreshRate = data[(id << 2) + 3];
				}

				return information;
			}
		}
	}

   public static void method597(byte var0) {
      try {
         aClass3_Sub2ArrayArrayArray4070 = (GroundTile[][][])null;
         aClass94_4066 = null;
         if(var0 < 91) {
            aClass3_Sub2ArrayArrayArray4070 = (GroundTile[][][])((GroundTile[][][])null);
         }

         aClass94_4071 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "pm.O(" + var0 + ')');
      }
   }

   static final void method598(boolean replaceCanvas, int displayMode, boolean close, int var3, int width, int height) {
	   if(close) {
		   HDToolkit.close();
	   }

	   if(null != Class3_Sub13_Sub10.fullscreenFrame && (3 != displayMode || width != Class3_Sub13.fullscreenFrameWidth || height != Class3_Sub13_Sub5.fullscreenFrameHeight)) {
		   UpdateServerNode.revertToResizable(Class3_Sub13_Sub10.fullscreenFrame, Class38.gameSignlink);
		   Class3_Sub13_Sub10.fullscreenFrame = null;
	   }

	   if(3 == displayMode && null == Class3_Sub13_Sub10.fullscreenFrame) {
		   Class3_Sub13_Sub10.fullscreenFrame = Class99.createFullscreenFrame(2, 0, 0, height, width, Class38.gameSignlink);
		   if(null != Class3_Sub13_Sub10.fullscreenFrame) {
			   Class3_Sub13_Sub5.fullscreenFrameHeight = height;
			   Class3_Sub13.fullscreenFrameWidth = width;
			   Class119.writePreferences(Class38.gameSignlink);
		   }
	   }

         if(displayMode == 3 && Class3_Sub13_Sub10.fullscreenFrame == null) {
            method598(true, NodeSub.anInt2577, true, var3, -1, -1);
         } else {
            Object var7;
            if(null == Class3_Sub13_Sub10.fullscreenFrame) {
               if(null != Class3_Sub13_Sub7.resizableFrame) {
                  var7 = Class3_Sub13_Sub7.resizableFrame;
               } else {
                  var7 = Class38.gameSignlink.thisApplet;
               }
            } else {
               var7 = Class3_Sub13_Sub10.fullscreenFrame;
            }

            Class3_Sub9.anInt2334 = ((Container)var7).getSize().width;
            Class70.anInt1047 = ((Container)var7).getSize().height;
            Insets var8;
            if(Class3_Sub13_Sub7.resizableFrame == var7) {
               var8 = Class3_Sub13_Sub7.resizableFrame.getInsets();
               Class3_Sub9.anInt2334 -= var8.right + var8.left;
               Class70.anInt1047 -= var8.bottom + var8.top;
            }

            if(-3 >= ~displayMode) {
               Class23.canvasWid = Class3_Sub9.anInt2334;
               ItemPile.canvasHei = Class70.anInt1047;
               Class84.anInt1164 = 0;
               DisplayModeInformation.anInt1442 = 0;
            } else {
               DisplayModeInformation.anInt1442 = 0;
               Class84.anInt1164 = (Class3_Sub9.anInt2334 + -765) / 2;
               Class23.canvasWid = 765;
               ItemPile.canvasHei = 503;
            }

            if(!replaceCanvas) {
               if(HDToolkit.openGLEnabled) {
                  HDToolkit.method1854(Class23.canvasWid, ItemPile.canvasHei);
               }

               InvType.canvas.setSize(Class23.canvasWid, ItemPile.canvasHei);
               if(Class3_Sub13_Sub7.resizableFrame == var7) {
                  var8 = Class3_Sub13_Sub7.resizableFrame.getInsets();
                  InvType.canvas.setLocation(var8.left - -Class84.anInt1164, var8.top + DisplayModeInformation.anInt1442);
               } else {
                  InvType.canvas.setLocation(Class84.anInt1164, DisplayModeInformation.anInt1442);
               }
            } else {
               Class163_Sub1_Sub1.method2215(InvType.canvas, -9320);
               Hashtable.method1783(InvType.canvas);
               if(null != Class38.mouseWheelHandler) {
                  Class38.mouseWheelHandler.removeMouseWheel(InvType.canvas);
               }

               PlainTile.aClient1671.addCanvas();
               Class3_Sub13_Sub4.addKeyboardHandler(InvType.canvas);
               ItemDefinition.addMouseHandler(InvType.canvas);
               if(Class38.mouseWheelHandler != null) {
                  Class38.mouseWheelHandler.addMouseWheel(InvType.canvas);
               }
            }

            if(0 == displayMode && -1 > ~var3) {
               HDToolkit.method1834(InvType.canvas);
            }

            if(close && displayMode > 0) {
               InvType.canvas.setIgnoreRepaint(true);
               if(!GameShell.initOpenGL) {
                  Class32.method995();
                  Class164_Sub1.aClass158_3009 = null;
                  Class164_Sub1.aClass158_3009 = Class3_Sub13_Sub23_Sub1.createGraphicsBuffer(InvType.canvas, Class23.canvasWid, ItemPile.canvasHei);
                  GraphicsLD.resetPixels();
                  if(5 != Class143.gameState) {
                     client.drawTextOnScreen(Class3_Sub13_Sub23.aClass94_3282, false);
                  } else {
                     client.method406(true, client.getBoldFont());
                  }

                  try {
                     Graphics var11 = InvType.canvas.getGraphics();
                     Class164_Sub1.aClass158_3009.drawGraphics(var11, 0, 0);
                  } catch (Exception var9) {
                     ;
                  }

                  Class80.method1396();
                  if(-1 != ~var3) {
                     Class164_Sub1.aClass158_3009 = null;
                  } else {
                     Class164_Sub1.aClass158_3009 = Class3_Sub13_Sub23_Sub1.createGraphicsBuffer(InvType.canvas, 765, 503);
                  }

                  SignlinkNode var13 = Class38.gameSignlink.method1444(PlainTile.aClient1671.getClass());

                  while(var13.status == 0) {
                     Class3_Sub13_Sub34.sleep(100L);
                  }

                  if(1 == var13.status) {
                     GameShell.initOpenGL = true;
                  }
               }
               if(GameShell.initOpenGL) {
                  HDToolkit.startToolkit(InvType.canvas, 2 * GroundItem.antiAliasing);
               }
            }

            if(!HDToolkit.openGLEnabled && 0 < displayMode) {
               method598(true, 0, true, var3, -1, -1);
            } else {
               if(~displayMode < -1 && -1 == ~var3) {
                  Class17.aThread409.setPriority(5);
                  Class164_Sub1.aClass158_3009 = null;
                  LDModel.method1935();
                  ((TextureLoader)Rasterizer.anInterface2_838).method1619(200, -1);
                  if(DisplayModeInformation.aBoolean1441) {
                     Rasterizer.method1137(0.7F);
                  }

                  Class3_Sub13.method165(-7878);
               } else if(0 == displayMode && var3 > 0) {
                  Class17.aThread409.setPriority(1);
                  Class164_Sub1.aClass158_3009 = Class3_Sub13_Sub23_Sub1.createGraphicsBuffer(InvType.canvas, 765, 503);
                  LDModel.method1938();
                  ParticleEngine.method1756();
                  ((TextureLoader)Rasterizer.anInterface2_838).method1619(20, -1);
                  if(DisplayModeInformation.aBoolean1441) {
                     if(1 == Class3_Sub28_Sub10.brightness) {
                        Rasterizer.method1137(0.9F);
                     }

                     if(2 == Class3_Sub28_Sub10.brightness) {
                        Rasterizer.method1137(0.8F);
                     }

                     if(3 == Class3_Sub28_Sub10.brightness) {
                        Rasterizer.method1137(0.7F);
                     }

                     if(4 == Class3_Sub28_Sub10.brightness) {
                        Rasterizer.method1137(0.6F);
                     }
                  }

                  Class3_Sub11.method144();
                  Class3_Sub13.method165(-7878);
               }

               Class47.aBoolean742 = !Npc.visibleLevels();
               if(close) {
                  Class3_Sub20.method389(false);
               }

               if(~displayMode <= -3) {
                  Class3_Sub15.aBoolean2427 = true;
               } else {
                  Class3_Sub15.aBoolean2427 = false;
               }

               if(-1 != InvType.mainScreenInterface) {
                  Class124.method1746(true);
               }

               //if(null != Class3_Sub15.worldConnection && (~Class143.gameState == -31 || Class143.gameState == 25)) {
               //   Class3_Sub13_Sub8.method204();
               //}

               for(int var12 = 0; var12 < 100; ++var12) {
                  GroundItem.aBooleanArray3674[var12] = true;
               }

               Class3_Sub13_Sub10.fullRedraw = true;
            }
         }
   }

   final byte[] getBuffer(boolean var1) {
      try {
         if(!aBoolean3632 && ~buffer.pos <= ~(-padding + buffer.buf.length)) {
            if(var1) {
               method586();
            }

            return buffer.buf;
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "pm.E(" + var1 + ')');
      }
   }

}
