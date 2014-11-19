import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

final class Class53 {

   static int anInt865 = -1;
   static long aLong866 = 0L;
   static int anInt867;

   public static void method1169(boolean var0) {
      try {
         if(var0) {
            method1170((byte)25, 28);
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "hi.C(" + var0 + ')');
      }
   }

   static final int method1170(byte var0, int var1) {
      try {
         int var2 = -77 / ((-34 - var0) / 52);
         return var1 >>> 8;
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "hi.E(" + var0 + ',' + var1 + ')');
      }
   }

   static final void method1171(int var0, int var1, int var2, int var3, int var4, jInterface var5, boolean var6) {
      try {
         int var7 = var3 * var3 + var4 * var4;
         if(-360001 <= ~var7) {
            int var8 = Math.min(var5.anInt168 / 2, var5.anInt193 / 2);
            if(var6) {
               anInt865 = -79;
            }

            if(var8 * var8 >= var7) {
               Class38_Sub1.method1030(var5, MillisTimer.aClass3_Sub28_Sub16Array2690[var0], var4, var3, var1, var2);
            } else {
               var8 -= 10;
               int var9 = 2047 & Class3_Sub13_Sub8.anInt3102 + SpotAnimation.cameraYaw;
               int var11 = Rasterizer.cosineTable[var9];
               int var10 = Rasterizer.sineTable[var9];
               var10 = var10 * 256 / (256 + Class164_Sub2.anInt3020);
               var11 = var11 * 256 / (Class164_Sub2.anInt3020 + 256);
               int var12 = var4 * var10 - -(var11 * var3) >> 16;
               int var13 = -(var10 * var3) + var4 * var11 >> 16;
               double var14 = Math.atan2((double)var12, (double)var13);
               int var16 = (int)(Math.sin(var14) * (double)var8);
               int var17 = (int)(Math.cos(var14) * (double)var8);
               if(HDToolkit.openGLEnabled) {
                  ((HDSprite)Class3_Sub13_Sub39.aClass3_Sub28_Sub16Array3458[var0]).method648(240, 240, (var5.anInt168 / 2 + var2 + var16) * 16, 16 * (-var17 + var5.anInt193 / 2 + var1), (int)(10430.378D * var14), 4096);
               } else {
                  ((LDSprite)Class3_Sub13_Sub39.aClass3_Sub28_Sub16Array3458[var0]).method660(-10 + var16 + var5.anInt168 / 2 + var2, -10 + var5.anInt193 / 2 + var1 + -var17, 20, 20, 15, 15, var14, 256);
               }
            }

         }
      } catch (RuntimeException var18) {
         throw Class44.method1067(var18, "hi.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null?"{...}":"null") + ',' + var6 + ')');
      }
   }

   static final String method1172(int var0, Throwable var1) throws IOException {
      String var2;
      if(var1 instanceof RuntimeException_Sub1) {
         RuntimeException_Sub1 var3 = (RuntimeException_Sub1)var1;
         var1 = var3.aThrowable2118;
         var2 = var3.aString2117 + " | ";
      } else {
         var2 = "";
      }

      StringWriter var13 = new StringWriter();
      PrintWriter var4 = new PrintWriter(var13);
      var1.printStackTrace(var4);
      var4.close();
      String var5 = var13.toString();
      BufferedReader var6 = new BufferedReader(new StringReader(var5));
      String var7 = var6.readLine();

      while(true) {
         String var8 = var6.readLine();
         if(var8 == null) {
            int var14 = -107 % ((var0 - 31) / 34);
            var2 = var2 + "| " + var7;
            return var2;
         }

         int var9 = var8.indexOf(40);
         int var10 = var8.indexOf(41, 1 + var9);
         String var11;
         if(0 == ~var9) {
            var11 = var8;
         } else {
            var11 = var8.substring(0, var9);
         }

         var11 = var11.trim();
         var11 = var11.substring(1 + var11.lastIndexOf(32));
         var11 = var11.substring(var11.lastIndexOf(9) + 1);
         var2 = var2 + var11;
         if(-1 != var9 && var10 != -1) {
            int var12 = var8.indexOf(".java:", var9);
            if(var12 >= 0) {
               var2 = var2 + var8.substring(5 + var12, var10);
            }
         }

         var2 = var2 + ' ';
      }
   }

   static final void method1173(Buffer var0, int var1) {
      try {
         int var2 = var0.getSmart();
         Class119.aClass26Array1627 = new Class26[var2];

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            Class119.aClass26Array1627[var3] = new Class26();
            Class119.aClass26Array1627[var3].anInt507 = var0.getSmart();
            Class119.aClass26Array1627[var3].aClass94_508 = var0.method761(105);
         }

         if(var1 > -10) {
            method1174((jInterface)null);
         }

         Class3_Sub13_Sub4.anInt3054 = var0.getSmart();
         OverlayType.anInt1416 = var0.getSmart();
         Class57.anInt906 = var0.getSmart();
         Class117.aClass44_Sub1Array1609 = new Class44_Sub1[-Class3_Sub13_Sub4.anInt3054 + OverlayType.anInt1416 + 1];

         for(var3 = 0; var3 < Class57.anInt906; ++var3) {
            int var4 = var0.getSmart();
            Class44_Sub1 var5 = Class117.aClass44_Sub1Array1609[var4] = new Class44_Sub1();
            var5.anInt721 = var0.getUByte();
            var5.anInt724 = var0.getInt();
            var5.anInt2621 = var4 - -Class3_Sub13_Sub4.anInt3054;
            var5.aClass94_2620 = var0.method761(98);
            var5.aClass94_2625 = var0.method761(79);
         }

         AbstractObjectCache.anInt3608 = var0.getInt();
         Class30.aBoolean579 = true;
      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "hi.B(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   static final jString method1174(jInterface var0) {
	   return ~jInterface.getInterfaceClickMask(var0).method101() != -1?(null != var0.selectedActionName && var0.selectedActionName.method1564().getLength() != 0?var0.selectedActionName:(LookupTable.qaoptestEnabled?RuntimeException_Sub1.aClass94_2116:null)):null;
   }

}
