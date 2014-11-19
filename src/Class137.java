
final class Class137 {

   static int anInt1781;
   static boolean safeRedraw = false;


   static final int method1817() {
	   return !Class65943149.aBoolean1084?(!Npc.visibleLevels()?1:(AbstractObjectCache.removeRoofs?2:1)):0;
   }

   static final void method1819(int var0, int var1, jInterface var2, byte var3, int var4, int var5, int var6, int var7) {
      try {

         if(!ProducingGraphicsBuffer.aBoolean2981) {
            Class19.anInt433 = 0;
         } else {
            Class19.anInt433 = 32;
         }

         ProducingGraphicsBuffer.aBoolean2981 = false;
         int var8;
         if(~Class3_Sub13_Sub5.anInt3069 != -1) {
            if(~var5 >= ~var4 && ~(var5 + 16) < ~var4 && var0 >= var6 && var6 - -16 > var0) {
               var2.anInt208 -= 4;
               Class20.refreshInterface(var2);
            } else if(var4 >= var5 && ~var4 > ~(16 + var5) && ~var0 <= ~(var1 + (var6 - 16)) && ~(var1 + var6) < ~var0) {
               var2.anInt208 += 4;
               Class20.refreshInterface(var2);
            } else if(~var4 <= ~(var5 - Class19.anInt433) && var4 < var5 + 16 + Class19.anInt433 && var0 >= 16 + var6 && var1 + var6 - 16 > var0) {
               var8 = var1 * (-32 + var1) / var7;
               if(8 > var8) {
                  var8 = 8;
               }

               int var10 = -32 + (var1 - var8);
               int var9 = -(var8 / 2) + -16 + -var6 + var0;
               var2.anInt208 = (-var1 + var7) * var9 / var10;
               Class20.refreshInterface(var2);
               ProducingGraphicsBuffer.aBoolean2981 = true;
            }
         }

         if(~Varp.anInt561 != -1) {
            var8 = var2.anInt168;
            if(~(-var8 + var5) >= ~var4 && ~var6 >= ~var0 && var4 < 16 + var5 && var1 + var6 >= var0) {
               var2.anInt208 += 45 * Varp.anInt561;
               Class20.refreshInterface(var2);
            }
         }

      } catch (RuntimeException var11) {
         throw Class44.method1067(var11, "tc.A(" + var0 + ',' + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }

}
