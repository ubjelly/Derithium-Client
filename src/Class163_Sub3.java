
final class Class163_Sub3 extends Class163 {

   static int[] anIntArray2999;
   //static jString aClass94_3000 = jString.createJString("; Max)2Age=");
   static jString[] chatClanName = new jString[100];
   static boolean aBoolean3004 = true;
   static byte[][] spriteAlphas;
   static jString aClass94_3006 = jString.createJString("<col=ff3000>");
   static int[] anIntArray3007 = new int[]{-1, -1, 1, 1};


   public static void method2227(byte var0) {
      try {
         aClass94_3006 = null;
         anIntArray3007 = null;
         chatClanName = null;
         if(var0 == 37) {
            spriteAlphas = (byte[][])null;
           //aClass94_3000 = null;
            anIntArray2999 = null;
         }
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "fb.A(" + var0 + ')');
      }
   }

   static final void method2228(byte var0) {
	   Js5CacheWorker.anInt997 = 0;
       Class139.anInt1829 = 0;
       js5Worker.method2100();
       Class140_Sub3.method1964(false);
       Class131.method1786();
       Canvas_Sub2.method58(-102);
       if(var0 <= -69) {
          int var1;
          for(var1 = 0; Class139.anInt1829 > var1; ++var1) {
             int var2 = LongNode.anIntArray2292[var1];
             if(Class44.loopCycle != Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var2].anInt2838) {
                if(0 < Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var2].anInt3969) {
                   Class162.method2203(Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var2], 8);
                }

                Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var2] = null;
             }
          }
          if(~Hashtable.anInt1704 != ~SpotAnimation.aClass3_Sub30_Sub1_532.pos) {
             throw new RuntimeException("gpp1 pos:" + SpotAnimation.aClass3_Sub30_Sub1_532.pos + " psize:" + Hashtable.anInt1704);
          } else {
             for(var1 = 0; var1 < Class159.anInt2022; ++var1) {
                if(null == Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[Class56.anIntArray887[var1]]) {
                   throw new RuntimeException("gpp2 pos:" + var1 + " size:" + Class159.anInt2022);
                }
             }
          }
       }
   }

   static final void method2229(long var0, byte var2) {
      try {
         if(-1L != ~var0) {
            if((100 > Class8.anInt104 || Class3_Sub13_Sub29.aBoolean3358) && ~Class8.anInt104 > -201) {
               jString var3 = FileSystem.longToString(var0).upperCase();
               if(var2 != -91) {
                  method2227((byte)22);
               }

               int var4;
               for(var4 = 0; Class8.anInt104 > var4; ++var4) {
                  if(~Vertex.aLongArray826[var4] == ~var0) {
                     PacketBuffer.method805(GroundItem.aClass94_3672, client.method903(new jString[]{var3, Class3_Sub28_Sub11.aClass94_3645}), 0);
                     return;
                  }
               }

               for(var4 = 0; ~AnimationLoader.anInt3591 < ~var4; ++var4) {
                  if(~var0 == ~Class114.aLongArray1574[var4]) {
                     PacketBuffer.method805(GroundItem.aClass94_3672, client.method903(new jString[]{Class38.aClass94_662, var3, GameShell.aClass94_4}), 0);
                     return;
                  }
               }

               if(var3.equals(TextureLoader.selfPlayer.username)) {
                  PacketBuffer.method805(GroundItem.aClass94_3672, Class62.aClass94_957, 0);
               } else {
                  Class70.aClass94Array1046[Class8.anInt104] = var3;
                  Vertex.aLongArray826[Class8.anInt104] = var0;
                  CursorType.anIntArray882[Class8.anInt104] = 0;
                  NodeSub.aClass94Array2566[Class8.anInt104] = GroundItem.aClass94_3672;
                  Class57.anIntArray904[Class8.anInt104] = 0;
                  Node.aBooleanArray73[Class8.anInt104] = false;
                  ++Class8.anInt104;
                  Class110.anInt1472 = Class3_Sub13_Sub17.anInt3213;
                  Class3_Sub13_Sub1.outputStream.putPacket(197);
                  Class3_Sub13_Sub1.outputStream.putString(var3);
               }
            } else {
               PacketBuffer.method805(GroundItem.aClass94_3672, Class163_Sub2_Sub1.aClass94_4024, 0);
            }
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "fb.C(" + var0 + ',' + var2 + ')');
      }
   }

}
