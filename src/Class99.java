import java.awt.Frame;

final class Class99 {

   static short[] aShortArray1398;
   static Class33 aClass33_1399;
   static int anInt1400;
   static Class93 aClass93_1401 = new Class93(500);
   static jInterface aClass11_1402;
   static int anInt1403 = -1;


  /*static final void method1596(jString var0, boolean var2) {
         if(!var2) {
            try {
               StringNode.currentScreen.getAppletContext().showDocument(var0.method1547(StringNode.currentScreen.getCodeBase(), true), "_top");
            } catch (Exception var5) {
               ;
            }
         } else {
            if(HDToolkit.openGLEnabled && InterfaceChangeNode.aBoolean3594) {
               try {
                  JSUtils.getValue(Class38.gameSignlink.thisApplet, "openjs", new Object[]{var0.method1547(StringNode.currentScreen.getCodeBase(), true).toString()});
                  return;
               } catch (Throwable var6) {
                  ;
               }
            }

            try {
               StringNode.currentScreen.getAppletContext().showDocument(var0.method1547(StringNode.currentScreen.getCodeBase(), true), "_blank");
            } catch (Exception var4) {
               ;
            }
         }
   }*/

	static final Frame createFullscreenFrame(int requiredState, int refreshRate, int bitDepth, int height, int width, Signlink signlink) {
		if (!signlink.fullscreenImpExist()) {
			return null;
		} else {
			if (0 == bitDepth) {
				DisplayModeInformation[] modes = BufferedRequest.gatherDisplayModesInformation(signlink);
				if (null == modes) {
					return null;
				}

				boolean chosen = false;

				for (int mode = 0; mode < modes.length; ++mode) {
					if (width == modes[mode].width && height == modes[mode].height && (refreshRate == 0 || refreshRate == modes[mode].refreshRate) && (!chosen || modes[mode].bitDepth > bitDepth)) {
						bitDepth = modes[mode].bitDepth;
						chosen = true;
					}
				}

				if (!chosen) {
					return null;
				}
			}

			SignlinkNode node = signlink.createFullscreenFrame(refreshRate, bitDepth, height, width);

			while (0 == node.status) {
				Class3_Sub13_Sub34.sleep(10L);
			}

			Frame frame = (Frame) node.value;
			if (null != frame) {
				if (requiredState != node.status) {
					return frame;
				} else {
					UpdateServerNode.revertToResizable(frame, signlink);
					return null;
				}
			} else {
				return null;
			}
		}
	}

   public static void method1598(int var0) {
      try {
         if(var0 <= -106) {
            aShortArray1398 = null;
            aClass11_1402 = null;
            aClass93_1401 = null;
            aClass33_1399 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "nf.B(" + var0 + ')');
      }
   }

	static final int method1599(int var0, int var1, byte[] var2) {
		int var4 = -1;

		for (int var6 = var0; var1 > var6; ++var6) {
			var4 = var4 >>> 8 ^ Huffman.anIntArray634[255 & (var4 ^ var2[var6])];
		}

		var4 = ~var4;
		return var4;
	}

}
