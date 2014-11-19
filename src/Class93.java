
final class Class93 {

   static int anInt1325;
   static jString aClass94_1326 = jString.createJString(")2");
   private int anInt1327;
   static byte[][][] aByteArrayArrayArray1328;
   private Queue aClass13_1329 = new Queue();
   private int anInt1331;
   private Hashtable aClass130_1332;


   final void put(Object var2, long var3) {
	   this.remove(var3);
       if(-1 == ~this.anInt1327) {
          AbstractObjectCache var5 = (AbstractObjectCache)this.aClass13_1329.method877();
          var5.unlink();
          var5.unlinkSub();
       } else {
          --this.anInt1327;
       }

       RawObjectCache var7 = new RawObjectCache(var2);
       this.aClass130_1332.put(var7, var3);
       this.aClass13_1329.insertLast(var7);
       var7.uid = 0L;
   }

   static final void method1516(int var0, int var1) {
      try {
         InterfaceChangeNode var2 = Class3_Sub24_Sub3.putInterfaceChange(3, var0);
         var2.a();
         if(var1 < 87) {
            aClass94_1326 = (jString)null;
         }

      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "n.L(" + var0 + ',' + var1 + ')');
      }
   }

   static final void method1517(byte var0) {
      try {
         Class139.aFontMetrics1822 = null;
         Class3_Sub13_Sub32.aFont3384 = null;
         if(var0 != -118) {
            method1516(64, 82);
         }

         MillisTimer.anImage2695 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "n.J(" + var0 + ')');
      }
   }

	final void remove(long var1) {
		AbstractObjectCache var4 = (AbstractObjectCache) this.aClass130_1332.get(var1);
		if (null != var4) {
			var4.unlink();
			var4.unlinkSub();
			++this.anInt1327;
		}
	}

   static int method1519(int var0, int var1) {
      try {
         return var0 ^ var1;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "n.E(" + var0 + ',' + var1 + ')');
      }
   }

	final int size() {
		int var2 = 0;

		for (AbstractObjectCache var3 = (AbstractObjectCache) this.aClass13_1329.method876(); var3 != null; var3 = (AbstractObjectCache) this.aClass13_1329.method878()) {
			if (!var3.isSoftReference()) {
				++var2;
			}
		}

		return var2;
	}

   public static void method1521(int var0) {
      try {
         aByteArrayArrayArray1328 = (byte[][][])null;
         aClass94_1326 = null;
         if(var0 != 3101) {
            method1516(99, -14);
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "n.A(" + var0 + ')');
      }
   }

	final void method1522(int var2) {
		if (null != Texture.aClass118_3794) {
			for (AbstractObjectCache var3 = (AbstractObjectCache) this.aClass13_1329.method876(); null != var3; var3 = (AbstractObjectCache) this.aClass13_1329.method878()) {
				if (!var3.isSoftReference()) {
					if (++var3.uid > (long) var2) {
						AbstractObjectCache var4 = Texture.aClass118_3794.method1725(var3);
						this.aClass130_1332.put(var4, var3.hash);
						Class45.method1084(var3, var4);
						var3.unlink();
						var3.unlinkSub();
					}
				} else if (null == var3.get()) {
					var3.unlink();
					var3.unlinkSub();
					++this.anInt1327;
				}
			}
		}
	}

	final void clearSoftReference() {
		for (AbstractObjectCache var2 = (AbstractObjectCache) this.aClass13_1329.method876(); var2 != null; var2 = (AbstractObjectCache) this.aClass13_1329.method878()) {
			if (var2.isSoftReference()) {
				var2.unlink();
				var2.unlinkSub();
				++this.anInt1327;
			}
		}

	}

   final void clearAll() {
	   this.aClass13_1329.clear();
	   this.aClass130_1332.clear();
	   this.anInt1327 = this.anInt1331;
   }

   Class93(int var1) {
      try {
         this.anInt1331 = var1;

         int var2;
         for(var2 = 1; var2 + var2 < var1; var2 += var2) {
            ;
         }

         this.anInt1327 = var1;
         this.aClass130_1332 = new Hashtable(var2);
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "n.<init>(" + var1 + ')');
      }
   }

   static final void method1525(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = Class40.method1040(Class57.anInt902, var3, (byte)0, Class159.anInt2020);
         int var7 = Class40.method1040(Class57.anInt902, var5, (byte)0, Class159.anInt2020);
         int var8 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var4, (byte)0, Class101.anInt1425);
         if(var0 != 3074) {
            method1516(75, -7);
         }

         int var9 = Class40.method1040(Class3_Sub28_Sub18.anInt3765, var2, (byte)0, Class101.anInt1425);

         for(int var10 = var6; var10 <= var7; ++var10) {
            Class3_Sub13_Sub23_Sub1.method282(Class38.anIntArrayArray663[var10], var8, var9, var1);
         }

      } catch (RuntimeException var11) {
         throw Class44.method1067(var11, "n.I(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

	final Object get(long var1) {
		AbstractObjectCache var4 = (AbstractObjectCache) this.aClass130_1332.get(var1);
		if (null == var4) {
			return null;
		} else {
			Object var5 = var4.get();
			if (var5 != null) {
				if (var4.isSoftReference()) {
					RawObjectCache var6 = new RawObjectCache(var5);
					this.aClass130_1332.put(var6, var4.hash);
					this.aClass13_1329.insertLast(var6);
					var6.uid = 0L;
					var4.unlink();
					var4.unlinkSub();
				} else {
					this.aClass13_1329.insertLast(var4);
					var4.uid = 0L;
				}

				return var5;
			} else {
				var4.unlink();
				var4.unlinkSub();
				++this.anInt1327;
				return null;
			}
		}
	}

}
