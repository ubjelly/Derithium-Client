import java.awt.Frame;

final class UpdateServerNode extends Class3_Sub28_Sub10 {

   private static jString aClass94_4055 = jString.createJString(" has logged in)3");
   FileSystem fileSystem;
   static jString aClass94_4057 = jString.createJString("Mem:");
   static jString aClass94_4058 = aClass94_4055;
   byte[] buffer;
   static Class25[] aClass25Array4060;
   js5Worker js5Worker;
   int anInt1246;
   static int anInt4062 = 0;
   static boolean aBoolean4063 = false;


   final byte[] getBuffer(boolean var1) {
      try {
         if(var1) {
            aBoolean4063 = true;
         }

         if(!this.aBoolean3632) {
            return this.buffer;
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "c.E(" + var1 + ')');
      }
   }

   static final boolean method591(int var0) {
      try {
         KeyboardHandler var1 = Class3_Sub13_Sub3.aClass148_3049;
         synchronized(var1) {
            if(~Class134.anInt1762 != ~Class3_Sub28_Sub9.anInt3620) {
               Class3_Sub28_Sub9.anInt3624 = AbstractTimer.anIntArray1693[Class3_Sub28_Sub9.anInt3620];
               Class3_Sub13_Sub27.anInt3342 = Class155.anIntArray1978[Class3_Sub28_Sub9.anInt3620];
               Class3_Sub28_Sub9.anInt3620 = 1 + Class3_Sub28_Sub9.anInt3620 & 127;
               if(var0 < 58) {
                  method591(68);
               }

               return true;
            } else {
               return false;
            }
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "c.F(" + var0 + ')');
      }
   }

   public static void method592(byte var0) {
      try {
         aClass25Array4060 = null;
         aClass94_4057 = null;
         if(var0 > 33) {
            aClass94_4058 = null;
            aClass94_4055 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "c.P(" + var0 + ')');
      }
   }

   static final void revertToResizable(Frame frame, Signlink signlink) {
	   while(true) {
		   SignlinkNode var3 = signlink.revertBackToResizable(frame);

		   while(0 == var3.status) {
			   Class3_Sub13_Sub34.sleep(10L);
            }

		   if(1 == var3.status) {
			   frame.setVisible(false);
			   frame.dispose();
			   return;
		   }

		   Class3_Sub13_Sub34.sleep(100L);
	   }
   }

   final int method586() {
	   return this.aBoolean3632 ? 0 : 100;
   }

   static final void method594(int var0, int var1) {
      try {
         if(var0 < 83) {
            method592((byte)122);
         }

         Class128.aClass93_1683.method1522(var1);
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "c.Q(" + var0 + ',' + var1 + ')');
      }
   }

	static final void method595(int var0) {
		FileSystem.aClass93_684.method1522(var0);
		Class163_Sub1.cursorCache.method1522(var0);
	}

}
