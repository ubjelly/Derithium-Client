
abstract class Entity extends SceneGraphNode {

   int anInt2753 = 0;
   private int anInt2754 = 0;
   int[] anIntArray2755 = new int[10];
   static int anInt2756;
   private int anInt2757 = 0;
   int anInt2758 = 0;
   int anInt2759;
   int anInt2760 = 0;
   int anInt2761 = 0;
   int anInt2762 = 0;
   int currentMoveAnimation = -1;
   static jString aClass94_2765 = jString.createJString(" ");
   private int anInt2766 = 0;
   int[] anIntArray2767 = new int[10];
   int[] anIntArray2768 = new int[4];
   boolean aBoolean2769 = false;
   int currentAnimationId = -1;
   int anInt2772 = -1;
   int anInt2773 = 0;
   static boolean aBoolean2774 = true;
   int hpRatio;
   int anInt2776 = -1;
   int anInt2777;
   int anInt2778 = 0;
   int anInt2779 = 32;
   int anInt2780 = 0;
   int anInt2781 = -1000;
   int anInt2782;
   private boolean aBoolean2783 = false;
   int anInt2784;
   int directionDegrees;
   int anInt2786 = 0;
   private int anInt2787 = 0;
   int anInt2788;
   int anInt2789 = 0;
   int anInt2790;
   int anInt2791 = 0;
   static Class93 aClass93_2792 = new Class93(64);
   int anInt2793 = -1;
   static int[] anIntArray2794 = new int[100];
   byte[] aByteArray2795 = new byte[10];
   Object anObject2796;
   int anInt2797 = 0;
   int anInt2798;
   int anInt2799;
   int anInt2800;
   ParticleEngine aClass127_Sub1_2801;
   int anInt2802 = 0;
   int anInt2803 = 0;
   private int anInt2804 = 0;
   int anInt2805 = 0;
   int turnDirection;
   private boolean aBoolean2807 = false;
   int anInt2808 = 0;
   Class145[] aClass145Array2809 = new Class145[12];
   boolean aBoolean2810 = false;
   int anInt2811 = 0;
   int anInt2812;
   int anInt2813 = 0;
   int anInt2814 = 100;
   int[] anIntArray2815 = new int[4];
   int walkQueueLocationIndex = 0;
   int anInt2817;
   int anInt2818;
   int anInt2819;
   int anInt2820 = -32768;
   int anInt2821 = 0;
   private int size = 1;
   int anInt2823;
   int anInt2824 = 0;
   jString aClass94_2825 = null;
   int anInt2826 = -1;
   private int anInt2827 = 0;
   int animationDelay = 0;
   int anInt2829;
   private int anInt2830 = 0;
   int anInt2831;
   int anInt2832 = 0;
   int anInt2833;
   private int anInt2834 = 0;
   int anInt2835;
   int[] anIntArray2836 = new int[4];
   int anInt2837 = 0;
   int anInt2838 = 0;
   static AbstractSprite[] aClass3_Sub28_Sub16Array2839;
   int anInt2840;
   static SubScript[] subScripts = new SubScript[50];
   int anInt2842 = -1;
   int idleAnimation = -1, turnAnimation = -1, walkAnimation = -1, turn180Animation = -1, turn90CWAnimation = -1,  turn90CCAnimation = -1, runAnimation = -1;

   boolean method1966(byte var1) {
      try {
         if(var1 != 17) {
            this.method1975();
         }

         return false;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "fe.L(" + var1 + ')');
      }
   }

   final void method1967(int var2, int var3, int var4, boolean var5) {
         if(~this.currentAnimationId != 0 && -2 == ~AnimationDefinition.list(this.currentAnimationId, false).anInt1850) {
            this.currentAnimationId = -1;
         }

         if(!var5) {
            int var6 = var3 + -this.anIntArray2767[0];
            int var7 = var4 + -this.anIntArray2755[0];
            if(~var6 <= 7 && 8 >= var6 && 7 >= ~var7 && ~var7 >= -9) {
               if(this.walkQueueLocationIndex < 9) {
                  ++this.walkQueueLocationIndex;
               }

               for(int var8 = this.walkQueueLocationIndex; ~var8 < -1; --var8) {
                  this.anIntArray2767[var8] = this.anIntArray2767[-1 + var8];
                  this.anIntArray2755[var8] = this.anIntArray2755[var8 + -1];
                  this.aByteArray2795[var8] = this.aByteArray2795[var8 - 1];
               }

               this.aByteArray2795[0] = 1;
               this.anIntArray2767[0] = var3;
               this.anIntArray2755[0] = var4;
               return;
            }
         }

         this.anInt2824 = 0;
         this.anIntArray2767[0] = var3;
         this.anIntArray2755[0] = var4;
         this.walkQueueLocationIndex = 0;
         this.anInt2811 = 0;
         this.anInt2829 = 64 * var2 + this.anIntArray2755[0] * 128;
         this.anInt2819 = var2 * 64 + 128 * this.anIntArray2767[0];

         if(HDToolkit.openGLEnabled && TextureLoader.selfPlayer == this) {
            Class3_Sub13_Sub14.method236((byte)64);
         }

   }

   final void method1968(int var1, byte var2, int var3) {
      try {
         int var4 = this.anIntArray2767[0];
         int var5 = this.anIntArray2755[0];
         if(0 == var3) {
            --var4;
            ++var5;
         }

         if(~this.currentAnimationId != 0 && 1 == AnimationDefinition.list(this.currentAnimationId, false).anInt1850) {
            this.currentAnimationId = -1;
         }
         
 	    if (anInt2842 != -1) {
 	    	SpotAnimation class215 = SpotAnimation.list(anInt2842);
	    	if (class215.aBoolean3047 && class215.anInt542 != -1 && (AnimationDefinition.list(class215.anInt542, false).anInt1850) == 1)
	    		anInt2842 = -1;
	    }

         if(-10 < ~this.walkQueueLocationIndex) {
            ++this.walkQueueLocationIndex;
         }

         int var6;
         for(var6 = this.walkQueueLocationIndex; -1 > ~var6; --var6) {
            this.anIntArray2767[var6] = this.anIntArray2767[-1 + var6];
            this.anIntArray2755[var6] = this.anIntArray2755[-1 + var6];
            this.aByteArray2795[var6] = this.aByteArray2795[-1 + var6];
         }

         if(-2 == ~var3) {
            ++var5;
         }

         this.aByteArray2795[0] = (byte)var1;
         if(2 == var3) {
            ++var5;
            ++var4;
         }

         if(-4 == ~var3) {
            --var4;
         }

         if(4 == var3) {
            ++var4;
         }

         if(5 == var3) {
            --var5;
            --var4;
         }

         if(var3 == 6) {
            --var5;
         }

         if(-8 == ~var3) {
            --var5;
            ++var4;
         }

         this.anIntArray2767[0] = var4;
         var6 = -106 / ((var2 - -10) / 40);
         this.anIntArray2755[0] = var5;
      } catch (RuntimeException var7) {
         throw Class44.method1067(var7, "fe.E(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

	final void method1969(AbstractModel var2, int var3) {
		Class3_Sub28_Sub9.anInt3623 = 0;
		Class3_Sub13_Sub16.anInt3198 = 0;
		Class3_Sub13_Sub9.anInt3111 = 0;
	}

   final void method1970(int var1, int var2, int var3, int var4) {
      try {
         if(var2 == -8) {
            for(int var5 = 0; -5 < ~var5; ++var5) {
               if(var3 >= this.anIntArray2768[var5]) {
            	  anIntArray2836[var5] = var4 * ((client.newHits && var4 > 0) ? 10 : 1);
				  if (client.newHits && var4 > 0) {
					  anIntArray2836[var5] += new java.util.Random().nextInt(9);
				  }
                  this.anIntArray2815[var5] = var1;
                  this.anIntArray2768[var5] = 70 + var3;
                  return;
               }
            }

         }
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "fe.G(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   final void method1971(AbstractModel var1) {
   }

   final void method1973(int var1) {
      try {
         if(var1 < -75) {
            this.walkQueueLocationIndex = 0;
            this.anInt2811 = 0;
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "fe.I(" + var1 + ')');
      }
   }

   public static void method1974(byte var0) {
      try {
         if(var0 > -101) {
            aClass3_Sub28_Sub16Array2839 = (AbstractSprite[])null;
         }

         subScripts = null;
         aClass94_2765 = null;
         aClass93_2792 = null;
         aClass3_Sub28_Sub16Array2839 = null;
         anIntArray2794 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "fe.K(" + var0 + ')');
      }
   }

   final int method1975() {
	   return (this.anInt2820 != -32768?-this.anInt2820:200);
   }

   final void setSize(int var1, int var2) {
	   this.size = var1;
   }

   int getSize() {
	   return this.size;
   }

}
