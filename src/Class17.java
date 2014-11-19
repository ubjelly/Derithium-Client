
final class Class17 {

   static TextureInterface anInterface2_408;
   static Thread aThread409;
   static int anInt410;
   static SignlinkNode js5ConnectionNode;

   public Class17() {
      new Class127();
   }

   static final void method904(int var0, Entity var1) {
      try {
         if(var1.anInt2779 != 0) {
            int var4;
            int var5;
            if(var1.anInt2772 != -1 && '\u8000' > var1.anInt2772) {
               Npc var3 = Class3_Sub13_Sub24.aClass140_Sub4_Sub2Array3292[var1.anInt2772];
               if(var3 != null) {
                  var5 = -var3.anInt2829 + var1.anInt2829;
                  var4 = -var3.anInt2819 + var1.anInt2819;
                  if(0 != var4 || 0 != var5) {
                     var1.turnDirection = (int)(Math.atan2((double)var4, (double)var5) * 325.949D) & 2047;
                  }
               }
            }

            int var6;
            int var9;
            if(var1.anInt2772 >= '\u8000') {
               var9 = -32768 + var1.anInt2772;
               if(~var9 == ~ClickMaskNode.anInt2211) {
                  var9 = 2047;
               }

               Player var10 = Class3_Sub13_Sub22.aClass140_Sub4_Sub1Array3269[var9];
               if(null != var10) {
                  var6 = -var10.anInt2829 + var1.anInt2829;
                  var5 = -var10.anInt2819 + var1.anInt2819;
                  if(var5 != 0 || var6 != 0) {
                     var1.turnDirection = (int)(Math.atan2((double)var5, (double)var6) * 325.949D) & 2047;
                  }
               }
            }

            if((0 != var1.anInt2786 || 0 != var1.anInt2762) && (var1.walkQueueLocationIndex == 0 || ~var1.anInt2824 < -1)) {
               var9 = var1.anInt2819 + -((-Class131.anInt1716 + (var1.anInt2786 - Class131.anInt1716)) * 64);
               var4 = -((-Class82.anInt1152 + (var1.anInt2762 - Class82.anInt1152)) * 64) + var1.anInt2829;
               if(~var9 != -1 || var4 != 0) {
                  var1.turnDirection = (int)(Math.atan2((double)var9, (double)var4) * 325.949D) & 2047;
               }

               var1.anInt2762 = 0;
               var1.anInt2786 = 0;
            }

            int direction = var1.turnDirection - var1.directionDegrees & 2047;
            if(-1 != ~direction) {
            	++var1.anInt2789;
            	boolean var11;
            	if(~direction < -1025) {
            		var1.directionDegrees -= var1.anInt2779;
            		var11 = true;
            		if(~direction > ~var1.anInt2779 || direction > -var1.anInt2779 + 2048) {
            			var1.directionDegrees = var1.turnDirection;
            			var11 = false;
            		}//TODO Finish

            		if(var1.idleAnimation == var1.currentMoveAnimation && (25 < var1.anInt2789 || var11)) {
            			//if(~var2.anInt367 != 0) {
            			//	var1.currentMoveAnimation = var2.anInt367;
            			//} else {
            				var1.currentMoveAnimation = var1.walkAnimation;
            			//}
            		}
            	} else {
            		var11 = true;
            		var1.directionDegrees += var1.anInt2779;
            		if(var1.anInt2779 > direction || ~direction < ~(2048 - var1.anInt2779)) {
            			var11 = false;
            			var1.directionDegrees = var1.turnDirection;
            		}
            		
            		if(var1.idleAnimation == var1.currentMoveAnimation && (25 < var1.anInt2789 || var11)) {
            			if(-1 == var1.turnAnimation) {
            				var1.currentMoveAnimation = var1.walkAnimation;
            			} else {
	            				var1.currentMoveAnimation = var1.turnAnimation;
            			}
                     }
                  }

                  var1.directionDegrees &= 2047;
            } else {
               var1.anInt2789 = 0;
               var1.anInt2821 = 0;
            }

            if(var0 != 65536) {
               method904(-93, (Entity)null);
            }

         }
      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "cm.A(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

   public static void method905(int var0) {
      try {
         anInterface2_408 = null;
         js5ConnectionNode = null;
         if(var0 != -24912) {
            js5ConnectionNode = (SignlinkNode)null;
         }

         aThread409 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "cm.B(" + var0 + ')');
      }
   }

}
