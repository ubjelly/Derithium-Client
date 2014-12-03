import java.awt.Component;
import java.io.IOException;
import java.net.Socket;

final class Class163_Sub1_Sub1 extends Class163_Sub1 {

   static byte[] aByteArray4005 = new byte[]{(byte)95, (byte)97, (byte)98, (byte)99, (byte)100, (byte)101, (byte)102, (byte)103, (byte)104, (byte)105, (byte)106, (byte)107, (byte)108, (byte)109, (byte)110, (byte)111, (byte)112, (byte)113, (byte)114, (byte)115, (byte)116, (byte)117, (byte)118, (byte)119, (byte)120, (byte)121, (byte)122, (byte)48, (byte)49, (byte)50, (byte)51, (byte)52, (byte)53, (byte)54, (byte)55, (byte)56, (byte)57};
   static int anInt4006;
   static jString aClass94_4007 = jString.createJString(":");
   static boolean[] aBooleanArray4008 = new boolean[100];
   static int[] anIntArray4009 = new int[5];
   static int[][] anIntArrayArray4010 = new int[104][104];

   public static void method2213(byte var0) {
      try {
         anIntArray4009 = null;
         aByteArray4005 = null;
         aBooleanArray4008 = null;
         if(var0 != 104) {
            aClass94_4007 = (jString)null;
         }

         aClass94_4007 = null;
         anIntArrayArray4010 = (int[][])null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "ch.F(" + var0 + ')');
      }
   }

	static final void method2214(int var0) {
		if (!Npc.visibleLevels() && Class140_Sub3.anInt2745 != Class26.plane) {
			Class65943149.method1301(Class26.plane, LongNode.anInt2294, AbstractObjectCache.anInt3606, TextureLoader.selfPlayer.anIntArray2755[0], false, TextureLoader.selfPlayer.anIntArray2767[0], true);
		} else {
			if (Class26.plane != Class58.anInt909 || Class44.forceRefresh) {
				Class58.anInt909 = Class26.plane;
				ClanMember.method385(Class26.plane);
				Buffer.method792(var0 + 9179409);
				Class44.forceRefresh = false;
			}

		}
	}

   static final void method2215(Component var0, int var1) {
      try {
         if(var1 == -9320) {
            var0.removeKeyListener(Class3_Sub13_Sub3.aClass148_3049);
            var0.removeFocusListener(Class3_Sub13_Sub3.aClass148_3049);
            Class3_Sub13.anInt2384 = -1;
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "ch.G(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   static final void method2216(byte var0) {
      try {
         if(var0 != 81) {
            method2215((Component)null, 14);
         }

         if(~Class3_Sub13_Sub31.anInt3375 != -1) {
            try {
               if(1500 < ++GroundTile.anInt2246) {
                  if(null != Class3_Sub15.worldConnection) {
                     Class3_Sub15.worldConnection.close();
                     Class3_Sub15.worldConnection = null;
                  }

                  if(1 <= Class117.anInt1616) {
                     AbstractGraphicsBuffer.returnCode = -5;
                     Class3_Sub13_Sub31.anInt3375 = 0;
                     return;
                  }

                  GroundTile.anInt2246 = 0;
                  ++Class117.anInt1616;
                  Class3_Sub13_Sub31.anInt3375 = 1;
                  if(Class123.anInt1658 == Class3_Sub28_Sub19.anInt3773) {
                     Class123.anInt1658 = Class53.anInt867;
                  } else {
                     Class123.anInt1658 = Class3_Sub28_Sub19.anInt3773;
                  }
               }

               if(~Class3_Sub13_Sub31.anInt3375 == -2) {
                  Class3_Sub9.aClass64_2318 = Class38.gameSignlink.startConnection(RuntimeException_Sub1.serverIp, Class123.anInt1658);
                  Class3_Sub13_Sub31.anInt3375 = 2;
               }

               int var1;
               if(-3 == ~Class3_Sub13_Sub31.anInt3375) {
                  if(~Class3_Sub9.aClass64_2318.status == -3) {
                     throw new IOException();
                  }

                  if(1 != Class3_Sub9.aClass64_2318.status) {
                     return;
                  }

                  Class3_Sub15.worldConnection = new jSocket((Socket)Class3_Sub9.aClass64_2318.value, Class38.gameSignlink);
                  Class3_Sub9.aClass64_2318 = null;
                  Class3_Sub15.worldConnection.write(Class3_Sub13_Sub1.outputStream.buf, 0, Class3_Sub13_Sub1.outputStream.pos);
                  if(Class44_Sub1.aClass155_2627 != null) {
                     Class44_Sub1.aClass155_2627.method2159();
                  }

                  if(null != Class3_Sub21.aClass155_2491) {
                     Class3_Sub21.aClass155_2491.method2159();
                  }

                  var1 = Class3_Sub15.worldConnection.read();
                  if(Class44_Sub1.aClass155_2627 != null) {
                     Class44_Sub1.aClass155_2627.method2159();
                  }

                  if(Class3_Sub21.aClass155_2491 != null) {
                     Class3_Sub21.aClass155_2491.method2159();
                  }

                  if(-102 != ~var1) {
                     AbstractGraphicsBuffer.returnCode = var1;
                     Class3_Sub13_Sub31.anInt3375 = 0;
                     Class3_Sub15.worldConnection.close();
                     Class3_Sub15.worldConnection = null;
                     return;
                  }

                  Class3_Sub13_Sub31.anInt3375 = 3;
               }

               if(~Class3_Sub13_Sub31.anInt3375 == -4) {
                  if(~Class3_Sub15.worldConnection.available() > -3) {
                     return;
                  }

                  var1 = Class3_Sub15.worldConnection.read() << 8 | Class3_Sub15.worldConnection.read();
                  Class104.method1627(var1, (byte)-16);
                  if(InterfaceListener.anInt2451 == -1) {
                     Class3_Sub13_Sub31.anInt3375 = 0;
                     AbstractGraphicsBuffer.returnCode = 6;
                     Class3_Sub15.worldConnection.close();
                     Class3_Sub15.worldConnection = null;
                     return;
                  }

                  Class3_Sub13_Sub31.anInt3375 = 0;
                  Class3_Sub15.worldConnection.close();
                  Class3_Sub15.worldConnection = null;
                  IdentityKit.method951(0);
                  return;
               }
            } catch (IOException var2) {
               if(null != Class3_Sub15.worldConnection) {
                  Class3_Sub15.worldConnection.close();
                  Class3_Sub15.worldConnection = null;
               }

               if(Class117.anInt1616 < 1) {
                  if(Class123.anInt1658 != Class3_Sub28_Sub19.anInt3773) {
                     Class123.anInt1658 = Class3_Sub28_Sub19.anInt3773;
                  } else {
                     Class123.anInt1658 = Class53.anInt867;
                  }

                  Class3_Sub13_Sub31.anInt3375 = 1;
                  GroundTile.anInt2246 = 0;
                  ++Class117.anInt1616;
               } else {
                  AbstractGraphicsBuffer.returnCode = -4;
                  Class3_Sub13_Sub31.anInt3375 = 0;
               }
            }

         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "ch.D(" + var0 + ')');
      }
   }

}
