import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public class FullscreenImp {

   private GraphicsDevice graphicsDevice;
   private DisplayMode displayMode;


   private void method917(Frame var1, byte var2) {
      boolean var3 = false;

      Field var4;
      boolean var5;
      try {
         var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
         var4.setAccessible(true);
         var5 = ((Boolean)var4.get(this.graphicsDevice)).booleanValue();
         if(var5) {
            var4.set(this.graphicsDevice, Boolean.FALSE);
            var3 = true;
         }
      } catch (Throwable var15) {
         ;
      }

      var5 = false;

      try {
         var5 = true;
         this.graphicsDevice.setFullScreenWindow(var1);
         if(var2 != -63) {
            this.setDisplayMode((Frame)null, -49, 27, -67, -112);
            var5 = false;
         } else {
            var5 = false;
         }
      } finally {
         if(var5 && var3) {
            try {
               Field var7 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
               var7.set(this.graphicsDevice, Boolean.TRUE);
            } catch (Throwable var13) {
               ;
            }
         }

      }

      if(var3) {
         try {
            var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            var4.set(this.graphicsDevice, Boolean.TRUE);
         } catch (Throwable var14) {
            ;
         }
      }

   }

   public void setDisplayMode(Frame frame, int width, int height, int bitDepth, int setRefreshRate) {
      this.displayMode = this.graphicsDevice.getDisplayMode();

      if(this.displayMode == null) {
         throw new NullPointerException();
      } else {
         frame.setUndecorated(true);
         frame.enableInputMethods(false);
         this.method917(frame, (byte)-63);
         if(setRefreshRate == 0) {
            int thisRefreshRate = this.displayMode.getRefreshRate();
            DisplayMode[] displayModes = this.graphicsDevice.getDisplayModes();
            boolean chosen = false;

            for(int modeId = 0; modeId < displayModes.length; ++modeId) {
               if(displayModes[modeId].getWidth() == width && displayModes[modeId].getHeight() == height && bitDepth == displayModes[modeId].getBitDepth()) {
                  int modeRefreshRate = displayModes[modeId].getRefreshRate();
                  if(!chosen || Math.abs(modeRefreshRate - thisRefreshRate) < Math.abs(setRefreshRate - thisRefreshRate)) {
                     chosen = true;
                     setRefreshRate = modeRefreshRate;
                  }
               }
            }

            if(!chosen) {
               setRefreshRate = thisRefreshRate;
            }
         }

         this.graphicsDevice.setDisplayMode(new DisplayMode(width, height, bitDepth, setRefreshRate));
      }
   }

	public int[] getDisplayModesInformation() {
		DisplayMode[] displayModes = this.graphicsDevice.getDisplayModes();
		int[] information = new int[displayModes.length << 2];

		for (int var4 = 0; var4 < displayModes.length; ++var4) {
			information[var4 << 2] = displayModes[var4].getWidth();
			information[(var4 << 2) + 1] = displayModes[var4].getHeight();
			information[(var4 << 2) + 2] = displayModes[var4].getBitDepth();
			information[(var4 << 2) + 3] = displayModes[var4].getRefreshRate();
		}

		return information;
	}

   public void revertBack() {
      if(this.displayMode != null) {
         this.graphicsDevice.setDisplayMode(this.displayMode);
         if(!this.graphicsDevice.getDisplayMode().equals(this.displayMode)) {
            throw new RuntimeException("Did not return to correct resolution!");
         }

         this.displayMode = null;
      }

      this.method917((Frame)null, (byte)-63);
   }

   public FullscreenImp() throws Exception {
      GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
      this.graphicsDevice = var1.getDefaultScreenDevice();
      if(!this.graphicsDevice.isFullScreenSupported()) {
         GraphicsDevice[] var2 = var1.getScreenDevices();
         GraphicsDevice[] var3 = var2;

         for(int var4 = 0; var3.length > var4; ++var4) {
            GraphicsDevice var5 = var3[var4];
            if(var5 != null && var5.isFullScreenSupported()) {
               this.graphicsDevice = var5;
               return;
            }
         }

         throw new Exception();
      }
   }
}
