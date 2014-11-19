import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

final class MouseWheelHandler extends AbstractMouseWheel implements MouseWheelListener {

   private int rotation = 0;

   final void removeMouseWheel(Component var2) {
      var2.removeMouseWheelListener(this);
   }

   final synchronized int getRotation() {
      int var2 = this.rotation;
      this.rotation = 0;
      return var2;
   }

   public final synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      this.rotation += var1.getWheelRotation();
   }

   final void addMouseWheel(Component var1) {
	   var1.addMouseWheelListener(this);
   }

}
