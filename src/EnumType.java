
final class EnumType extends NodeSub {

   static int anInt3657;
   int anInt3658;
   static int anInt3660 = 0;
   int anInt3662;
   Hashtable aClass130_3663;
   private jString aClass94_3664;
   static boolean visibleLevels = true;
   private Hashtable aClass130_3666;
   private int anInt3667;


   private final void method615(int var1, Buffer var2, byte var3) {
      try {
         if(var3 > -29) {
            anInt3657 = 70;
         }

         if(~var1 != -2) {
            if(~var1 == -3) {
               this.anInt3658 = var2.getUByte();
            } else if(3 != var1) {
               if(var1 != 4) {
                  if(5 == var1 || 6 == var1) {
                     int var4 = var2.getUShort();
                     this.aClass130_3663 = new Hashtable(Class95.method1585(var4));

                     for(int var5 = 0; var5 < var4; ++var5) {
                        int var6 = var2.getInt();
                        Object var7;
                        if(var1 == 5) {
                           var7 = new StringNode(var2.getString());
                        } else {
                           var7 = new IntegerNode(var2.getInt());
                        }

                        this.aClass130_3663.put((Node)var7, (long)var6);
                     }
                  }
               } else {
                  this.anInt3667 = var2.getInt();
               }
            } else {
               this.aClass94_3664 = var2.getString();
            }
         } else {
            this.anInt3662 = var2.getUByte();
         }

      } catch (RuntimeException var8) {
    	  var8.printStackTrace();
         throw Class44.method1067(var8, "ml.C(" + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

   final jString method616(int var1, byte var2) {
      try {
         int var3 = 10 / ((var2 - 68) / 50);
         if(null == this.aClass130_3663) {
            return this.aClass94_3664;
         } else {
            StringNode var4 = (StringNode)this.aClass130_3663.get((long)var1);
            return null == var4?this.aClass94_3664:var4.value;
         }
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "ml.S(" + var1 + ',' + var2 + ')');
      }
   }

   final boolean method617(jString var1, int var2) {
      try {
         if(null == this.aClass130_3663) {
            return false;
         } else {
            if(var2 != 8729) {
               this.method615(-97, (Buffer)null, (byte)-91);
            }

            if(null == this.aClass130_3666) {
               this.method618(0);
            }

            for(Class3_Sub10 var3 = (Class3_Sub10)this.aClass130_3666.get(var1.method1538()); var3 != null; var3 = (Class3_Sub10)this.aClass130_3666.method1784()) {
               if(var3.aClass94_2341.equals(var1)) {
                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "ml.F(" + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   private final void method618(int var1) {
      try {
         this.aClass130_3666 = new Hashtable(this.aClass130_3663.method1785());
         StringNode var2 = (StringNode)this.aClass130_3663.getFirst();
         if(var1 == 0) {
            while(var2 != null) {
               Class3_Sub10 var3 = new Class3_Sub10(var2.value, (int)var2.hash);
               this.aClass130_3666.put(var3, var2.value.method1538());
               var2 = (StringNode)this.aClass130_3663.getNext();
            }

         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "ml.O(" + var1 + ')');
      }
   }

   static final LDIndexedSprite[] method619(byte var0, int var1, js5 var2) {
      try {
         return ItemPile.method2029((byte)-119, var2, var1)?(var0 <= 52?(LDIndexedSprite[])null:LookupTable.method1281(0)):null;
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "ml.A(" + var0 + ',' + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   final int method620(int var1, int var2) {
      try {
         if(this.aClass130_3663 != null) {
            IntegerNode var3 = (IntegerNode)this.aClass130_3663.get((long)var2);
            return var3 != null?var3.value:this.anInt3667;
         } else {
            return this.anInt3667;
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "ml.E(" + var1 + ',' + var2 + ')');
      }
   }

   final boolean method621(int var1, int var2) {
      try {
         if(null != this.aClass130_3663) {
            if(this.aClass130_3666 == null) {
               this.method622(109);
            }

            if(var1 != -8143) {
               method619((byte)68, -100, (js5)null);
            }

            IntegerNode var3 = (IntegerNode)this.aClass130_3666.get((long)var2);
            return var3 != null;
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "ml.B(" + var1 + ',' + var2 + ')');
      }
   }

   private final void method622(int var1) {
      try {
         this.aClass130_3666 = new Hashtable(this.aClass130_3663.method1785());
         int var3 = -48 % ((26 - var1) / 58);

         for(IntegerNode var2 = (IntegerNode)this.aClass130_3663.getFirst(); null != var2; var2 = (IntegerNode)this.aClass130_3663.getNext()) {
            IntegerNode var4 = new IntegerNode((int)var2.hash);
            this.aClass130_3666.put(var4, (long)var2.value);
         }

      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "ml.D(" + var1 + ')');
      }
   }

   static final byte[] method623(byte[] var1) {
		Buffer buffer = new Buffer(var1);
		int compressionType = buffer.getUByte();
		int length = buffer.getInt();
		if (0 <= length && (-1 == ~Class75.anInt1108 || ~Class75.anInt1108 <= ~length)) {
			if (-1 == ~compressionType) {
				byte[] var8 = new byte[length];
				buffer.getBytes(var8, 0, length);
				return var8;
			} else {
				int decompressedLength = buffer.getInt();
				if (0 <= decompressedLength && (Class75.anInt1108 == 0 || ~Class75.anInt1108 <= ~decompressedLength)) {
					byte[] var6 = new byte[decompressedLength];
					if (compressionType != 1) {
						Class3_Sub22.aClass49_2505.method1128(var6, buffer, false);
					} else {
						Class105.method1640(var6, decompressedLength, var1, length, 9);
					}
					return var6;
				} else {
					throw new RuntimeException();
				}
			}
		} else {
			throw new RuntimeException();
		}
   }

   final void method625(Buffer var1, int var2) {
      try {
         while(true) {
            int var3 = var1.getUByte();
            if(-1 == ~var3) {
               var3 = 68 % ((-84 - var2) / 35);
               return;
            }

            this.method615(var3, var1, (byte)-84);
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "ml.Q(" + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

   static final EnumType list(int id) {
	   EnumType var2 = (EnumType)MillisTimer.aClass47_2686.method1092((long)id, 1400);
	   if(var2 != null) {
		   return var2;
	   } else {
		   byte[] var3 = Class45.aClass153_731.getFile(8, id);
		   var2 = new EnumType();

		   if(null != var3) {
			   var2.method625(new Buffer(var3), -122);
		   }

		   MillisTimer.aClass47_2686.method1097(var2, (long)id, (byte)-115);
		   return var2;
	   }
   }

public EnumType() {
      this.aClass94_3664 = Class47.aClass94_750;
   }

}
