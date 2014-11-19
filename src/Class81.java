import java.awt.event.ActionEvent;
import java.io.IOException;

final class Class81 {

   static Queue aClass13_1139 = new Queue();
   static int[][][] anIntArrayArrayArray1142;

   static final void method1397(Buffer var0, boolean var1) {
      try {
         if(!var1) {
            anIntArrayArrayArray1142 = (int[][][])((int[][][])null);
         }

         byte[] var2 = new byte[24];
         if(null != LookupTable.aClass30_1039) {
            try {
               LookupTable.aClass30_1039.method984(-41, 0L);
               LookupTable.aClass30_1039.method982(false, var2);

               int var3;
               for(var3 = 0; -25 < ~var3 && ~var2[var3] == -1; ++var3) {
                  ;
               }

               if(-25 >= ~var3) {
                  throw new IOException();
               }
            } catch (Exception var5) {
               for(int var4 = 0; 24 > var4; ++var4) {
                  var2[var4] = -1;
               }
            }
         }

         var0.method753(var2, 0, 24, 88);
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "la.G(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   static final int method1398(int var0, Player var1) {
      try {
         if(var0 != 0) {
            method1397((Buffer)null, false);
         }

         int var2 = var1.anInt3963;
         if(~var1.idleAnimation == ~var1.currentMoveAnimation) {
            var2 = var1.anInt3952;//TODO FIXME finish from renders..
         //} else if(var1.runAnimation != var1.currentMoveAnimation && var1.currentMoveAnimation != var3.anInt386 && var1.currentMoveAnimation != var3.anInt375 && var3.anInt373 != var1.currentMoveAnimation) {
         //   if(~var1.currentMoveAnimation == ~var3.anInt398 || ~var1.currentMoveAnimation == ~var3.anInt372 || var1.currentMoveAnimation == var3.anInt379 || ~var1.currentMoveAnimation == ~var3.anInt406) {
         //      var2 = var1.anInt3966;
         //   }
         } else {
            var2 = var1.anInt3973;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "la.A(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

   static final void method1399(int var0, long var1) {
      try {
         if(var1 != 0L) {
            if(AnimationLoader.anInt3591 < 100) {
               int var3 = -103 / ((var0 - -20) / 41);
               jString var4 = FileSystem.longToString(var1).upperCase();

               int var5;
               for(var5 = 0; ~AnimationLoader.anInt3591 < ~var5; ++var5) {
                  if(Class114.aLongArray1574[var5] == var1) {
                     PacketBuffer.method805(GroundItem.aClass94_3672, client.method903(new jString[]{var4, Class3_Sub13_Sub25.aClass94_3311}), 0);
                     return;
                  }
               }

               for(var5 = 0; Class8.anInt104 > var5; ++var5) {
                  if(~Vertex.aLongArray826[var5] == ~var1) {
                     PacketBuffer.method805(GroundItem.aClass94_3672, client.method903(new jString[]{Class38.aClass94_666, var4, BufferedRequest.aClass94_4071}), 0);
                     return;
                  }
               }

               if(var4.equals(TextureLoader.selfPlayer.username)) {
                  PacketBuffer.method805(GroundItem.aClass94_3672, Class95.aClass94_1335, 0);
               } else {
                  ++Class3_Sub13_Sub22.anInt3267;
                  Class114.aLongArray1574[AnimationLoader.anInt3591] = var1;
                  Class3_Sub13_Sub27.aClass94Array3341[AnimationLoader.anInt3591++] = FileSystem.longToString(var1);
                  Class110.anInt1472 = Class3_Sub13_Sub17.anInt3213;
                  Class3_Sub13_Sub1.outputStream.putPacket(102);
                  Class3_Sub13_Sub1.outputStream.putString(var4);
               }
            } else {
               PacketBuffer.method805(GroundItem.aClass94_3672, Class144.aClass94_1884, 0);
            }
         }
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "la.B(" + var0 + ',' + var1 + ')');
      }
   }

   static final void processEventQueue(Signlink var0, Object var1) {
	   if(null != var0.eventQueue) {
		   for(int var3 = 0; var3 < 50 && null != var0.eventQueue.peekEvent(); ++var3) {
			   Class3_Sub13_Sub34.sleep(1L);
		   }

		   if(var1 != null) {
			   var0.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
		   }

	   }
   }

   public static void method1402() {
	   aClass13_1139 = null;
	   anIntArrayArrayArray1142 = (int[][][])null;
   }

	/*static final Class131 method1403(jString var1, js5 var2) {
		int var3 = var2.method2120(var1);
		if (var3 == -1) {
			return new Class131(0);
		} else {
			int[] var4 = var2.getChildEntries(var3);
			Class131 var5 = new Class131(var4.length);

			for (int var6 = 0; ~var6 > ~var5.anInt1720; ++var6) {
				Buffer var7 = new Buffer(var2.getFile(var3, var4[var6]));
				var5.aClass94Array1721[var6] = var7.getString();
				var5.aByteArray1730[var6] = var7.getByte();
				var5.aShortArray1727[var6] = (short) var7.getUShort();
				var5.aShortArray1718[var6] = (short) var7.getUShort();
				var5.anIntArray1725[var6] = var7.getInt();
			}

			return var5;
		}
	}*/

}
