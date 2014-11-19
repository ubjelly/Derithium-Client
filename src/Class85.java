
final class Class85 {

   static boolean aBoolean1167 = false;
   static AnimationDefinition[] aClass142Array1168 = new AnimationDefinition[14];
   static float aFloat1169;
   static js5 aClass153_1171;
   static int anInt1174 = 99;

   static final int method1423(boolean var0, Buffer var1, jString var2) {
      try {
         if(var0) {
            method1426(17);
         }

         int var3 = var1.pos;
         byte[] var4 = var2.method1568(0);
         var1.putSmart(var4.length);
         var1.pos += Class3_Sub13_Sub9.aClass36_3112.method1015(var4.length, -81, var1.buf, var4, 0, var1.pos);
         return var1.pos + -var3;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "lg.A(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   static final AbstractIndexedSprite[] method1424(js5 var0, byte var1, int var2, int var3) {
      try {
         if(var1 != -12) {
            anInt1174 = 37;
         }

         return client.spriteExists(var0, var2, var3)?Class3_Sub13_Sub36.method343():null;
      } catch (RuntimeException var5) {
         throw Class44.method1067(var5, "lg.C(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void method1425(int var0) {
      Class3_Sub13_Sub35.anInt3419 = var0;

      for(int var1 = 0; var1 < jSocket.anInt1234; ++var1) {
         for(int var2 = 0; var2 < Class3_Sub13_Sub15.anInt3179; ++var2) {
            if(Class75_Sub2.groundTiles[var0][var1][var2] == null) {
               Class75_Sub2.groundTiles[var0][var1][var2] = new GroundTile(var0, var1, var2);
            }
         }
      }

   }

   public static void method1426(int var0) {
      try {
         aClass153_1171 = null;
         if(var0 != -25247) {
            aClass142Array1168 = (AnimationDefinition[])null;
         }

         aClass142Array1168 = null;
      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "lg.B(" + var0 + ')');
      }
   }

}
