
final class Class86 {

   int anInt1175;
   private static jString aClass94_1176 = jString.createJString("Loading wordpack )2 ");
   int anInt1177;
   int anInt1178;
   int anInt1181;
   static CollisionMap[] collisionMap = new CollisionMap[4];
   static jString aClass94_1183 = aClass94_1176;
   int anInt1184;
   int anInt1185;
   static FileSystem referenceCache;
   float aFloat1187;
   static jString aClass94_1188 = jString.createJString("::rebuild");
   float aFloat1189;
   float aFloat1190;
   static int anInt1191;
   private static jString aClass94_1192 = jString.createJString("Examine");
   static Class3_Sub24_Sub4 aClass3_Sub24_Sub4_1193;
   static Hashtable aClass130_1194;
   static int anInt1195;
 static jString aClass94_1180 = aClass94_1192;

   static final void method1427(boolean var0, int var1) {
      try {
         if(-1 == var1 && !Class83.aBoolean1158) {
            SceneGraphNode.method1870(false);
         } else if(var1 != -1 && (AbstractTimer.anInt1691 != var1 || !VarBit.method1391(-1)) && Class9.musicVolume != 0 && !Class83.aBoolean1158) {
            Class151.method2099(true, var1, 0, Class75_Sub2.cacheIndex6, false, Class9.musicVolume, 2);
         }

         if(!var0) {
            aClass94_1192 = (jString)null;
         }

         AbstractTimer.anInt1691 = var1;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "li.B(" + var0 + ',' + var1 + ')');
      }
   }

   static final void method1428(int var0, int var2) {
         Class163_Sub1.variousSettings[var0] = var2;
         LongNode var3 = (LongNode) ClientScript.aClass130_3679.get((long)var0);
         if(var3 == null) {
            var3 = new LongNode(TimeUtil.currentTimeMillis() - -500L);
            ClientScript.aClass130_3679.put(var3, (long)var0);
         } else {
            var3.value = 500L + TimeUtil.currentTimeMillis();
         }
   }

   public static void method1429(byte var0) {
      try {
         aClass3_Sub24_Sub4_1193 = null;
         aClass94_1188 = null;
         collisionMap = null;
         aClass94_1192 = null;
         aClass94_1183 = null;
         aClass94_1176 = null;
         referenceCache = null;
         aClass130_1194 = null;
         aClass94_1180 = null;
         if(var0 != 53) {
            aClass3_Sub24_Sub4_1193 = (Class3_Sub24_Sub4)null;
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "li.C(" + var0 + ')');
      }
   }

   static final LDFont method1430(int var0, int var1) {
      try {
         if(var0 != -28922) {
            return (LDFont)null;
         } else {
            LDFont var2 = (LDFont)Class80.aClass93_1135.get((long)var1);
            if(var2 != null) {
               return var2;
            } else {
               byte[] var3 = js5.cacheIndex13.getFile(var1, 0);
               var2 = new LDFont(var3);
               var2.method697(Class3_Sub13_Sub22.aClass109Array3270, (int[])null);
               Class80.aClass93_1135.put(var2, (long)var1);
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw Class44.method1067(var4, "li.A(" + var0 + ',' + var1 + ')');
      }
   }

   public Class86() {
      try {
         this.anInt1177 = AtmosphereManager.screenColor;
         this.aFloat1189 = 1.2F;
         this.anInt1178 = -50;
         this.aFloat1187 = 1.1523438F;
         this.anInt1175 = AtmosphereManager.fogColor;
         this.anInt1181 = -60;
         this.aFloat1190 = 0.69921875F;
         this.anInt1184 = 0;
         this.anInt1185 = -50;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "li.<init>()");
      }
   }

   Class86(Buffer var1) {
	   int var2 = var1.getUByte();
	   if((var2 & 1) == 0) {
		   this.anInt1177 = AtmosphereManager.screenColor;
	   } else {
		   this.anInt1177 = var1.getInt();
	   }

	   if((2 & var2) == 0) {
		   this.aFloat1187 = 1.1523438F;
	   } else {
		   this.aFloat1187 = (float)var1.getUShort() / 256.0F;
	   }

	   if((var2 & 4) == 0) {
		   this.aFloat1190 = 0.69921875F;
	   } else {
		   this.aFloat1190 = (float)var1.getUShort() / 256.0F;
	   }

	   if((var2 & 8) == 0) {
		   this.aFloat1189 = 1.2F;
	   } else {
		   this.aFloat1189 = (float)var1.getUShort() / 256.0F;
	   }

	   if((16 & var2) == 0) {
		   this.anInt1178 = -50;
		   this.anInt1185 = -50;
		   this.anInt1181 = -60;
	   } else {
		   this.anInt1185 = var1.getShort();
		   this.anInt1181 = var1.getShort();
		   this.anInt1178 = var1.getShort();
	   }

	   if((32 & var2) == 0) {
		   this.anInt1175 = AtmosphereManager.fogColor;
	   } else {
		   this.anInt1175 = var1.getInt();
	   }

	   if((64 & var2) == 0) {
		   this.anInt1184 = 0;
	   } else {
		   this.anInt1184 = var1.getUShort();
	   }
	   
	  // System.out.println(anInt1177+":"+aFloat1187+":"+aFloat1190+":"+aFloat1189+":"+anInt1185+":"+anInt1181+":"+anInt1178+":"+anInt1175+":"+anInt1184);
	   
   }

}
