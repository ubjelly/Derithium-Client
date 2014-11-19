
public class js5Worker extends js5 {
	
	static PacketBuffer aClass3_Sub30_Sub1_2942 = new PacketBuffer(5000);
	static jString aClass94_2951 = jString.createJString("k");
	static int[] anIntArray2952 = new int[128];
	static int anInt2958 = 0;
	static jString aClass94_2959 = jString.createJString("mapfunction");
	private static jString aClass94_2960 = jString.createJString("Loading interfaces )2 ");
	static jString aClass94_2961 = aClass94_2960;
	
	private boolean requestOnDemand = false;
	private FileSystem cacheFile;
	private volatile boolean[] validFile;
	private int anInt1338;
	private FileSystem referenceFile;
	private int ondemandCrc = -1;
	private int index;
	private volatile boolean aBoolean1343 = false;

	js5Worker(FileSystem class28, FileSystem class28_7_, int i, boolean clearOnUnpack,
			boolean clearOnUse, boolean onDemand) {
		super(null, clearOnUnpack, clearOnUse);
		cacheFile = class28;
		requestOnDemand = onDemand;
		referenceFile = class28_7_;
		index = i;
		Js5CacheWorker.method682(this, index);
	}
	
	public void method2131(int i) {
		Js5CacheWorker.method366(i, index);
	}

	public void setIndexCrc(int i_16_) {
		anInt1338 = i_16_;
		if (referenceFile != null)
			client.method75(index, this, referenceFile);
		else
			Js5CacheWorker.method164(true, this, anInt1338, (byte) 0,
					255, index);
	}
		
	private final void method594() {
		validFile = new boolean[groupBuffer.length];
		for (int i_0_ = 0; i_0_ < validFile.length; i_0_++)
			validFile[i_0_] = false;
		if (cacheFile == null)
			aBoolean1343 = true;
		else {
			ondemandCrc = -1;
			for (int i_1_ = 0; i_1_ < validFile.length; i_1_++) {
				if (aClass62_1949.groupFileCount[i_1_] > 0) {
					client.method816(i_1_, cacheFile, this, 1);
					ondemandCrc = i_1_;
				}
			}
			if (ondemandCrc == -1)
				aBoolean1343 = true;
		}
	}
	
	private final int method595(int i_2_) {
		if (groupBuffer[i_2_] != null)
			return 100;
		if (validFile[i_2_])
			return 100;
		int completion = client.method117(index, i_2_);
		return completion;
	}
	
	final int getTotalCompletion() {
		int i_115_ = 0;
		int i_116_ = 0;
		for (int fileId = 0; fileId < groupBuffer.length; fileId++) {
			if (aClass62_1949.groupFileCount[fileId] > 0) {
				i_115_ += 100;
				i_116_ += method595(fileId);
			}
		}
		if (i_115_ == 0)
			return 100;
		int i_118_ = i_116_ * 100 / i_115_;
		return i_118_;
	}
	
	final int getReferenceTableCompletion() {
		if (aBoolean1343)
			return 100;
		if (groupBuffer != null)
			return 99;
		int i_114_ = client.method117(255, index);
		if (i_114_ >= 100)
			i_114_ = 99;
		return i_114_;
	}
	
	final void method602(byte[] buffer, int i, boolean bool, boolean bool_119_) {
		if (bool) {
			if (aBoolean1343)
				throw new RuntimeException();
			if (referenceFile != null)
				client.method37(referenceFile, buffer, index);
			decode(buffer, anInt1338);
			method594();
		} else {
			buffer[buffer.length - 2] = (byte) (aClass62_1949.groupVersions[i] >> 8);
			buffer[buffer.length - 1] = (byte) aClass62_1949.groupVersions[i];
			if (cacheFile != null) {
				client.method37(cacheFile, buffer, i);
				validFile[i] = true;
			}
			if (bool_119_)
				groupBuffer[i] = buffer;
		}
	}
	
	final void requestDownload(int i_11_) {
		if (cacheFile == null || validFile == null
				|| !validFile[i_11_])
			Js5CacheWorker.method164(true, this, (aClass62_1949.groupCrcs[i_11_]),
					(byte) 2, index,
					i_11_);
		else
			client.method75(i_11_, this, cacheFile);
	}
	
	final void method596(byte[] buffer, boolean requestNeeded, int i_3_, FileSystem class28) {
		if (referenceFile == class28) {
			if (aBoolean1343)
				throw new RuntimeException();
			if (buffer == null)
				Js5CacheWorker.method164(true, this, anInt1338, (byte) 0,
						255, index);
			else {
				client.aCRC32_377.reset();
				client.aCRC32_377.update(buffer, 0, buffer.length);
				int i_4_ = (int) client.aCRC32_377.getValue();
				if (anInt1338 != i_4_)
					Js5CacheWorker.method164(true, this, anInt1338, (byte) 0,
							255, index);
				else {
					decode(buffer, anInt1338);
					method594();
				}
			}
		} else {
			if (!requestNeeded && i_3_ == ondemandCrc)
				aBoolean1343 = true;
			if (buffer == null || buffer.length <= 2) {
				validFile[i_3_] = false;
				if (requestOnDemand || requestNeeded)
					Js5CacheWorker.method164(requestNeeded, this, aClass62_1949.groupCrcs[i_3_], (byte) 2, index, i_3_);
			} else {
				client.aCRC32_377.reset();
				client.aCRC32_377.update(buffer, 0, buffer.length - 2);
				int i_5_ = (int) client.aCRC32_377.getValue();
				int i_6_ = ((buffer[buffer.length - 1] & 0xff) + ((buffer[buffer.length - 2] & 0xff) << 8));
				if (i_5_ != aClass62_1949.groupCrcs[i_3_] || aClass62_1949.groupVersions[i_3_] != i_6_) {
					validFile[i_3_] = false;
					if (requestOnDemand || requestNeeded)
						Js5CacheWorker.method164(requestNeeded, this, (aClass62_1949.groupCrcs[i_3_]), (byte) 2, index, i_3_);
				} else {
					validFile[i_3_] = true;
					if (requestNeeded)
						groupBuffer[i_3_] = buffer;
				}
			}
		}
	}
	
	  static final void method2100() {
		   SpotAnimation.aClass3_Sub30_Sub1_532.initBitAccess();
		   int var1 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(1);
		   if(0 != var1) {
			   int var2 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(2);
			   if(0 != var2) {
				   int var4;
				   int var5;
				   if(var2 == 1) {
					   var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(3);
					   TextureLoader.selfPlayer.method1968(1, (byte)-128, var4);
					   var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(1);
					   if(1 == var5) {
						   Class21.anIntArray441[Js5CacheWorker.anInt997++] = 2047;
					   }

	               } else if(2 != var2) {
	                  if(3 == var2) {
	                	  Class26.plane = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(2);
	                	  int var7 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(7);//TODO update vise versa
	                	  var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(1);
	                	  var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(7);//TODO update vise versa
	                	  int var6 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(1);
	                     if(~var6 == -2) {
	                        Class21.anIntArray441[Js5CacheWorker.anInt997++] = 2047;
	                     }

	                     TextureLoader.selfPlayer.method1981(var7, var5 == 1, var4);
	                  }
	               } else {
	                  //if(SpotAnimation.aClass3_Sub30_Sub1_532.method812((byte)-11, 1) == 1) {
	                     var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(3);
	                     TextureLoader.selfPlayer.method1968(2, (byte)-104, var4);
	                     var5 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(3);
	                     TextureLoader.selfPlayer.method1968(2, (byte)-126, var5);
	                  //} else {
	                 //    var4 = SpotAnimation.aClass3_Sub30_Sub1_532.method812((byte)-11, 3);
	                 //   Class102.aClass140_Sub4_Sub1_2141.method1968(0, (byte)-109, var4);
	                  //}

	                  var4 = SpotAnimation.aClass3_Sub30_Sub1_532.getBits(1);
	                  if(var4 == 1) {
	                     Class21.anIntArray441[Js5CacheWorker.anInt997++] = 2047;
	                  }

	               }
	            } else {
	               Class21.anIntArray441[Js5CacheWorker.anInt997++] = 2047;
	            }
	         }
	   }


	   static final boolean method2103(int var0, int var1) {
	      try {
	         return var1 >= -78?true:-199 == ~var0 || 230 == var0 || var0 == 156 || ~var0 == -141 || 223 == var0;
	      } catch (RuntimeException var3) {
	         throw Class44.method1067(var3, "bg.P(" + var0 + ',' + var1 + ')');
	      }
	   }

	   static final void method2104(jInterface var0, boolean var1, int var2) {
	      try {
	         int var3 = 57 % ((var2 - -58) / 47);
	         int var4 = var0.maxScrollHorizontal != 0?var0.maxScrollHorizontal:var0.anInt168;
	         int var5 = -1 != ~var0.maxScrollVertical?var0.maxScrollVertical:var0.anInt193;
	         AbstractGraphicsBuffer.method2183(var0.uid, var1, var4, 235, var5, SceneGraphNode.interfaceCache[var0.uid >> 16]);
	         if(var0.aClass11Array262 != null) {
	            AbstractGraphicsBuffer.method2183(var0.uid, var1, var4, 235, var5, var0.aClass11Array262);
	         }

	         OverridedInterface var6 = (OverridedInterface)Class3_Sub13_Sub17.aClass130_3208.get((long)var0.uid);
	         if(var6 != null) {
	            Class75_Sub4.method1352(var5, var1, -1, var6.uid, var4);
	         }

	      } catch (RuntimeException var7) {
	         throw Class44.method1067(var7, "bg.N(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + var2 + ')');
	      }
	   }

	   public static void method2105(boolean var0) {
	      try {
	         aClass94_2959 = null;
	         aClass94_2951 = null;
	         if(!var0) {
	            anIntArray2952 = null;
	            aClass3_Sub30_Sub1_2942 = null;
	            aClass94_2960 = null;
	            aClass94_2961 = null;
	         }
	      } catch (RuntimeException var2) {
	         throw Class44.method1067(var2, "bg.F(" + var0 + ')');
	      }
	   }
	  
}
