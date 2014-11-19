import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class BasicGraphicsBuffer extends AbstractGraphicsBuffer {

   private Component component;

   final void drawGraphics(Graphics graphics, int x, int y) {
	   graphics.drawImage(this.image, x, y, this.component);
   }

   final void init(Component component, int w, int h, boolean isRasterPremultiplied) {
      this.pixels = new int[w * h + 1];
      this.height = h;
      this.width = w;
      DataBufferInt var5 = new DataBufferInt(this.pixels, this.pixels.length);
      DirectColorModel var6 = new DirectColorModel(32, 16711680, '\uff00', 255);
      WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.width, this.height), var5, (Point)null);
      this.image = new BufferedImage(var6, var7, isRasterPremultiplied, new Hashtable());
      this.component = component;
      this.initCanvas();
   }

   final void clip(Graphics graphics, int x, int y, int w, int h) {
      Shape var7 = graphics.getClip();
      graphics.clipRect(x, y, w, h);
      graphics.drawImage(this.image, 0, 0, this.component);
      graphics.setClip(var7);
   }
}
