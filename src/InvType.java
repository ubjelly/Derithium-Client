import java.awt.Canvas;

final class InvType extends NodeSub {

   int size = 0;
   static Canvas canvas;
   //static jString aClass94_3651 = jString.createJString("::mm");
   static int anInt3652;
   static jString aClass94_3653 = jString.createJString("Shift)2click disabled)3");
   static short[][] aShortArrayArray3654 = new short[][]{{(short)6798, (short)107, (short)10283, (short)16, (short)4797, (short)7744, (short)5799, (short)4634, (short)-31839, (short)22433, (short)2983, (short)-11343, (short)8, (short)5281, (short)10438, (short)3650, (short)-27322, (short)-21845, (short)200, (short)571, (short)908, (short)21830, (short)28946, (short)-15701, (short)-14010}, {(short)8741, (short)12, (short)-1506, (short)-22374, (short)7735, (short)8404, (short)1701, (short)-27106, (short)24094, (short)10153, (short)-8915, (short)4783, (short)1341, (short)16578, (short)-30533, (short)25239, (short)8, (short)5281, (short)10438, (short)3650, (short)-27322, (short)-21845, (short)200, (short)571, (short)908, (short)21830, (short)28946, (short)-15701, (short)-14010}, {(short)25238, (short)8742, (short)12, (short)-1506, (short)-22374, (short)7735, (short)8404, (short)1701, (short)-27106, (short)24094, (short)10153, (short)-8915, (short)4783, (short)1341, (short)16578, (short)-30533, (short)8, (short)5281, (short)10438, (short)3650, (short)-27322, (short)-21845, (short)200, (short)571, (short)908, (short)21830, (short)28946, (short)-15701, (short)-14010}, {(short)4626, (short)11146, (short)6439, (short)12, (short)4758, (short)10270}, {(short)4550, (short)4537, (short)5681, (short)5673, (short)5790, (short)6806, (short)8076, (short)4574}};
   static int mainScreenInterface = -1;


   static final boolean method609(jInterface var0) {
         if(null != var0.valueCompareTypes) {
            int var2 = 0;
            for(; ~var2 > ~var0.valueCompareTypes.length; ++var2) {
               int var3 = Class164_Sub2.method2247(var0, var2);
               int var4 = var0.requiredValues[var2];
               if(~var0.valueCompareTypes[var2] != -3) {
                  if(~var0.valueCompareTypes[var2] != -4) {
                     if(4 == var0.valueCompareTypes[var2]) {
                        if(~var3 == ~var4) {
                           return false;
                        }
                     } else if(~var4 != ~var3) {
                        return false;
                     }
                  } else if(var3 <= var4) {
                     return false;
                  }
               } else if(~var4 >= ~var3) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
   }

   final void method610(Buffer var1) {
	   while(true) {
		   int var3 = var1.getUByte();
		   if(0 == var3) {
			   return;
		   }

		   this.method614(var1, var3, false);
	   }
   }

   static final void appendChatMessage(int var1, jString var2, jString var3, jString var5) {

		for (int var6 = 99; var6 > 0; --var6) {
			Class3_Sub13_Sub6.chatTypes[var6] = Class3_Sub13_Sub6.chatTypes[var6 - 1];
			Class3_Sub13_Sub19.chatNames[var6] = Class3_Sub13_Sub19.chatNames[var6 - 1];
			StringNode.chatMessages[var6] = StringNode.chatMessages[var6 - 1];
			Class163_Sub3.chatClanName[var6] = Class163_Sub3.chatClanName[var6 - 1];
			SceneGraphNode.anIntArray1835[var6] = SceneGraphNode.anIntArray1835[var6 - 1];
		}

		++Class3_Sub13_Sub9.anInt3114;
		Class3_Sub13_Sub6.chatTypes[0] = var1;
		Class3_Sub13_Sub19.chatNames[0] = var5;
		IdentityKit.anInt472 = Class3_Sub13_Sub17.anInt3213;
		SceneGraphNode.anIntArray1835[0] = 0;//param
		StringNode.chatMessages[0] = var2;
		Class163_Sub3.chatClanName[0] = var3;
   }

   static final jString method612(long var0, byte var2) {
      try {
         return var2 <= 85?(jString)null:Class3_Sub13_Sub8.method207(10, false, 116, var0);
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "md.F(" + var0 + ',' + var2 + ')');
      }
   }

   public static void method613() {
	   canvas = null;
	   aClass94_3653 = null;
	   aShortArrayArray3654 = (short[][])null;
   }

   private final void method614(Buffer var1, int var2, boolean var3) {
      try {
         if(var3) {
            this.method610((Buffer)null);
         }

         if(~var2 == -3) {
            this.size = var1.getUShort();
         }

      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "md.A(" + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ')');
      }
   }

static final InvType list(int id) {
	   InvType var2 = (InvType)Class49.aClass47_818.method1092((long)id, 1400);
	   if(null != var2) {
		   return var2;
	   } else {
		   byte[] var3 = Class8.aClass153_105.getFile(5, id);
		   var2 = new InvType();
		   if(var3 != null) {
			   var2.method610(new Buffer(var3));
		   }

		   Class49.aClass47_818.method1097(var2, (long)id, (byte)58);
		   return var2;
	   }
   }

}
