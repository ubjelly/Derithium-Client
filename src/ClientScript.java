import java.io.UnsupportedEncodingException;
import java.util.Date;


final class ClientScript extends NodeSub {

   int anInt3678;
   static Hashtable aClass130_3679 = new Hashtable(16);
   int anInt3680;
   int anInt3682;
   int[] anIntArray3683;
   static int anInt3684 = 10;
   Hashtable[] aClass130Array3685;
   jString aClass94_3686;
   int anInt3687;
   jString[] instructionStringValues;
   static int anInt3689 = 0;
   int[] anIntArray3690;
   
   static int[] anIntArray3693 = new int[1000];
   static ClanMember[] clanMembers;
   static int renderZ2;
   static jString aClass94_3691 = jString.createJString("Members object");;

	static final int method630(int var1) {
	   return 127 & var1 >> 11;
   }

   static final void method631(boolean var0, js5 var1) {
      try {
         if(!var0) {
            AnimationLoader.aClass153_3580 = var1;
            SubScript.anInt869 = AnimationLoader.aClass153_3580.getChildCount(4);
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "qc.D(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

   public static void method632(int var0) {
      try {
         aClass94_3691 = null;
         clanMembers = null;
         aClass130_3679 = null;
         anIntArray3693 = null;
         if(var0 != -30497) {
            clanMembers = (ClanMember[])null;
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "qc.E(" + var0 + ')');
      }
   }

   static int method633(int var0, int var1) {
	   return var0 & var1;
   }

   static final ClientScript list(int var0) {
	   ClientScript var2 = (ClientScript)Class56.aClass47_885.method1092((long)var0, 1400);
	   if(var2 != null)
		   return var2;
	   byte[] var3 = ClickMaskNode.cacheIndex12.getFile(var0, 0);
	   if(var3 == null) {
		   return null;
	   }
	   var2 = new ClientScript();
	   
	   int i = 0;
			   
	   Buffer var4 = new Buffer(var3);
	   var4.pos = var4.buf.length - 12;
	   int var7 = var4.getInt();
	   var2.anInt3680 = var4.getUShort();
	   var2.anInt3687 = var4.getUShort();
	   var2.anInt3678 = var4.getUShort();
	   var2.anInt3682 = var4.getUShort();

	   var4.pos = 0;
	   var2.aClass94_3686 = var4.method750((byte)78);
	   var2.anIntArray3683 = new int[var7];
	   var2.instructionStringValues = new jString[var7];
	   var2.anIntArray3690 = new int[var7];

	   while ((var4.buf.length - 12 ^ 0xffffffff) < (var4.pos ^ 0xffffffff)) {
		   int var10 = var4.getUShort();
		   if(var10 != 3) {
			   if(var10 < 100 && 21 != var10 && -39 != ~var10 && 39 != var10) {
				   var2.anIntArray3690[i] = var4.getInt();
			   } else {
				   var2.anIntArray3690[i] = var4.getUByte();
			   }
		   } else {
			   var2.instructionStringValues[i] = var4.getString();
		   }
		   var2.anIntArray3683[i++] = var10;
	   }

	   Class56.aClass47_885.method1097(var2, (long)var0, (byte)-87);
	   return var2;
   }

static final void method1104(int i, InterfaceListener listener) {
	   Object objects[] = listener.objectData;
	   int scriptId = ((Integer) objects[0]).intValue();
	   ClientScript clientScript = list(scriptId);
	   if(null == clientScript)
		   return;
		Npc.subScriptPos = 0;
		int stringStackIndex = 0;
		int intStackIndex = 0;
		int opcodeIndex = -1;
		int intValues[] = clientScript.anIntArray3690;
		int opcodes[] = clientScript.anIntArray3683;
		PlainTile.intArguments = new int[clientScript.anInt3680 + 1];
		int k1 = 0;
		Class107.stringArguments = new jString[clientScript.anInt3687];
		int l1 = 0;
		for(int i2 = 1; ~i2 > ~objects.length; i2++)
		{
			if(objects[i2] instanceof Integer)
			{
				int k2 = ((Integer)objects[i2]).intValue();
				if(~k2 == 0x7ffffffe)
					k2 = listener.anInt2447;
				if(0x80000002 == k2)
					k2 = listener.anInt2441;
				if(0x7ffffffc == ~k2)
					k2 = null == listener.aClass11_2449 ? -1 : listener.aClass11_2449.uid;
				if(0x80000004 == k2)
					k2 = listener.anInt2445;
				if(0x7ffffffa == ~k2)
					k2 = null == listener.aClass11_2449 ? -1 : listener.aClass11_2449.anInt191;
				if(~k2 == 0x7ffffff9)
					k2 = null == listener.aClass11_2438 ? -1 : listener.aClass11_2438.uid;
				if(0x7ffffff8 == ~k2)
					k2 = listener.aClass11_2438 != null ? listener.aClass11_2438.anInt191 : -1;
				if(0x7ffffff7 == ~k2) {
					k2 = listener.anInt2444;
					//System.out.println("1:"+k2);
				}
				if(0x7ffffff6 == ~k2) {
					k2 = listener.anInt2443;
					//System.out.println("2:"+k2);
				}
				PlainTile.intArguments[k1++] = k2;
				continue;
			}
			if(!(objects[i2] instanceof jString))
				continue;
			jString class94 = (jString)objects[i2];
			if(class94.equals(jInterface.aClass94_209))
				class94 = listener.aClass94_2439;
			//try {
			Class107.stringArguments[l1++] = class94;
			//}catch(Exception e) {
			//	System.out.println(scriptId);
			//	e.printStackTrace();
			//}
		}

		int j2 = 0;
label0:
		do
		{
			j2++;
			if(i < j2)
				throw new RuntimeException("slow");
			int opcode = opcodes[++opcodeIndex];
			if (opcode < 100) {
				if (opcode == 0) {
					ItemPile.intStack[intStackIndex++] = intValues[opcodeIndex];
					continue;
				}
				if (opcode == 1) {
					int l2 = intValues[opcodeIndex];
					ItemPile.intStack[intStackIndex++] = Class163_Sub1.variousSettings[l2];
					continue;
				}
				if (opcode == 2) {
					int i3 = intValues[opcodeIndex];
					Class86.method1428(i3, ItemPile.intStack[--intStackIndex]);
					continue;
				}
				if (opcode == 3) {
					Node.stringStack[stringStackIndex++] = clientScript.instructionStringValues[opcodeIndex];
					continue;
				}
				if (opcode == 6) {
					opcodeIndex += intValues[opcodeIndex];
					continue;
				}
				if (opcode == 7) {
					intStackIndex -= 2;
					if (ItemPile.intStack[intStackIndex] != ItemPile.intStack[1 + intStackIndex])
						opcodeIndex += intValues[opcodeIndex];
					continue;
				}
				if (opcode == 8) {
					intStackIndex -= 2;
					if (~ItemPile.intStack[intStackIndex + 1] == ~ItemPile.intStack[intStackIndex])
						opcodeIndex += intValues[opcodeIndex];
					continue;
				}
				if (opcode == 9) {
					intStackIndex -= 2;
					if (~ItemPile.intStack[intStackIndex] > ~ItemPile.intStack[1 + intStackIndex])
						opcodeIndex += intValues[opcodeIndex];
					continue;
				}
				if (opcode == 10) {
					intStackIndex -= 2;
					if (ItemPile.intStack[intStackIndex - -1] < ItemPile.intStack[intStackIndex])
						opcodeIndex += intValues[opcodeIndex];
					continue;
				}
				if (opcode == 21) {
					if (-1 == ~Npc.subScriptPos)
						return;
					SubScript subScript = Entity.subScripts[--Npc.subScriptPos];
					clientScript = subScript.aClass3_Sub28_Sub15_874;
					PlainTile.intArguments = subScript.anIntArray870;
					opcodes = clientScript.anIntArray3683;
					opcodeIndex = subScript.anInt877;
					Class107.stringArguments = subScript.aClass94Array873;
					intValues = clientScript.anIntArray3690;
					continue;
				}
				if (opcode == 25) {
					int j3 = intValues[opcodeIndex];
					ItemPile.intStack[intStackIndex++] = NpcDefinition.method1484(0x3dd4def, j3);
					continue;
				}
				if (opcode == 27) {
					int k3 = intValues[opcodeIndex];
					Class3_Sub13_Sub29.method306(k3, false, ItemPile.intStack[--intStackIndex]);
					continue;
				}
				if (opcode == 31) {
					intStackIndex -= 2;
					if (~ItemPile.intStack[1 + intStackIndex] <= ~ItemPile.intStack[intStackIndex])
						opcodeIndex += intValues[opcodeIndex];
					continue;
				}
				if (opcode == 32) {
					intStackIndex -= 2;
					if (~ItemPile.intStack[intStackIndex] <= ~ItemPile.intStack[1 + intStackIndex])
						opcodeIndex += intValues[opcodeIndex];
					continue;
				}
				if (opcode == 33) {
					ItemPile.intStack[intStackIndex++] = PlainTile.intArguments[intValues[opcodeIndex]];
					continue;
				}
				if (opcode == 34) {
					PlainTile.intArguments[intValues[opcodeIndex]] = ItemPile.intStack[--intStackIndex];
					continue;
				}
				if (opcode == 35) {
					Node.stringStack[stringStackIndex++] = Class107.stringArguments[intValues[opcodeIndex]];
					continue;
				}
				if (opcode == 36) {
					Class107.stringArguments[intValues[opcodeIndex]] = Node.stringStack[--stringStackIndex];
					continue;
				}
				if (opcode == 37) {
					int l3 = intValues[opcodeIndex];
					stringStackIndex -= l3;
					jString class94_2 = Class67.method1261(stringStackIndex, l3, Node.stringStack, 2774);
					Node.stringStack[stringStackIndex++] = class94_2;
					continue;
				}
				if (opcode == 38) {
					intStackIndex--;
					continue;
				}
				if (opcode == 39) {
					stringStackIndex--;
					continue;
				}
				if (opcode == 40) {
					int i4 = intValues[opcodeIndex];
					ClientScript class3_sub28_sub15_1 = list(i4);
					try {
					int ai2[] = new int[class3_sub28_sub15_1.anInt3680];
					jString aclass94[] = new jString[class3_sub28_sub15_1.anInt3687];
					for (int l75 = 0; class3_sub28_sub15_1.anInt3678 > l75; l75++)
						ai2[l75] = ItemPile.intStack[l75 + (intStackIndex - class3_sub28_sub15_1.anInt3678)];

					for (int i76 = 0; class3_sub28_sub15_1.anInt3682 > i76; i76++)
						aclass94[i76] = Node.stringStack[i76 + -class3_sub28_sub15_1.anInt3682 + stringStackIndex];

					intStackIndex -= class3_sub28_sub15_1.anInt3678;
					stringStackIndex -= class3_sub28_sub15_1.anInt3682;
					SubScript class54_1 = new SubScript();
					class54_1.aClass94Array873 = Class107.stringArguments;
					class54_1.anIntArray870 = PlainTile.intArguments;
					class54_1.anInt877 = opcodeIndex;
					class54_1.aClass3_Sub28_Sub15_874 = clientScript;
					if (~Npc.subScriptPos <= ~Entity.subScripts.length)
						throw new RuntimeException();
					clientScript = class3_sub28_sub15_1;
					opcodeIndex = -1;
					Entity.subScripts[Npc.subScriptPos++] = class54_1;
					PlainTile.intArguments = ai2;
					intValues = clientScript.anIntArray3690;
					opcodes = clientScript.anIntArray3683;
					Class107.stringArguments = aclass94;
					} catch(Exception e) {
						System.out.println(opcode+":"+scriptId+":"+opcodeIndex+":"+stringStackIndex+":"+class3_sub28_sub15_1.anInt3678+":"+ItemPile.intStack[intStackIndex]);
						e.printStackTrace();
					}
					continue;
				}
				if (opcode == 42) {
					ItemPile.intStack[intStackIndex++] = NpcDefinition.anIntArray1277[intValues[opcodeIndex]];
					continue;
				}
				if (opcode == 43) {
					int j4 = intValues[opcodeIndex];
					NpcDefinition.anIntArray1277[j4] = ItemPile.intStack[--intStackIndex];
					PacketParser.method825((byte) 92, j4);
					continue;
				}
				if (opcode == 44) {
					int k4 = intValues[opcodeIndex] >> 16;
					int k5 = intValues[opcodeIndex] & 0xffff;
					int l43 = ItemPile.intStack[--intStackIndex];
					if (-1 < ~l43 || 5000 < l43)
						throw new RuntimeException();
					Class26.anIntArray509[k4] = l43;
					byte byte2 = -1;
					if (~k5 == -106)
						byte2 = 0;
					int j76 = 0;
					while (~l43 < ~j76) {
						Canvas_Sub1.anIntArrayArray20[k4][j76] = byte2;
						j76++;
					}
					continue;
				}
				if (opcode == 45) {
					int l4 = intValues[opcodeIndex];
					int l5 = ItemPile.intStack[--intStackIndex];
					if (0 > l5 || l5 >= Class26.anIntArray509[l4])
						throw new RuntimeException("script=" + scriptId);
					ItemPile.intStack[intStackIndex++] = Canvas_Sub1.anIntArrayArray20[l4][l5];
					continue;
				}
				if (opcode == 46) {
					int i5 = intValues[opcodeIndex];
					intStackIndex -= 2;
					int i6 = ItemPile.intStack[intStackIndex];
					if (~i6 > -1 || ~i6 <= ~Class26.anIntArray509[i5])
						throw new RuntimeException();
					Canvas_Sub1.anIntArrayArray20[i5][i6] = ItemPile.intStack[1 + intStackIndex];
					continue;
				}
				if (opcode == 47) {
					jString class94_1 = Class132.aClass94Array1739[intValues[opcodeIndex]];
					if (null == class94_1)
						class94_1 = ItemPile.aClass94_2928;
					Node.stringStack[stringStackIndex++] = class94_1;
					continue;
				}
				if (opcode == 48) {
					int j5 = intValues[opcodeIndex];
					Class132.aClass94Array1739[j5] = Node.stringStack[--stringStackIndex];
					Class49.method1126(-94, j5);
					continue;
				}
				if (opcode == 51) {
					Hashtable class130 = clientScript.aClass130Array3685[intValues[opcodeIndex]];
					IntegerNode class3_sub18 = (IntegerNode) class130.get(ItemPile.intStack[--intStackIndex]);
					if (null != class3_sub18)
						opcodeIndex += class3_sub18.value;
					continue;
				}
			}
			boolean flag;
			if (1 != intValues[opcodeIndex])
				flag = false;
			else
				flag = true;
			if (opcode < 300) {
				if (opcode == 100) {
					intStackIndex -= 3;
					int j6 = ItemPile.intStack[intStackIndex];
					int i44 = ItemPile.intStack[1 + intStackIndex];
					int k66 = ItemPile.intStack[2 + intStackIndex];
					if (i44 == 0)
						throw new RuntimeException();
					jInterface class11_21 = Class7.getInterface(j6);
					if (null == class11_21.aClass11Array262)
						class11_21.aClass11Array262 = new jInterface[k66 + 1];
					if (k66 >= class11_21.aClass11Array262.length) {
						jInterface aclass11[] = new jInterface[k66 + 1];
						for (int k81 = 0; ~k81 > ~class11_21.aClass11Array262.length; k81++)
							aclass11[k81] = class11_21.aClass11Array262[k81];

						class11_21.aClass11Array262 = aclass11;
					}
					if (0 < k66 && class11_21.aClass11Array262[-1 + k66] == null)
						throw new RuntimeException();
					// throw new RuntimeException("Gap at:" + (-1 + k66));
					jInterface class11_23 = new jInterface();
					class11_23.scriptedInterface = true;
					class11_23.anInt191 = k66;
					class11_23.parent = class11_23.uid = class11_21.uid;
					class11_23.type = i44;
					class11_21.aClass11Array262[k66] = class11_23;
					if (flag)
						Class164.aClass11_2055 = class11_23;
					else
						GrandExchangeItem.aClass11_1749 = class11_23;
					Class20.refreshInterface(class11_21);
					continue;
				}
				if (opcode == 101) {
					jInterface jInterface = flag ? Class164.aClass11_2055 : GrandExchangeItem.aClass11_1749;
					if (jInterface.anInt191 == -1)
						if (!flag)
							throw new RuntimeException();
						// throw new
						// RuntimeException("Tried to cc_delete static active-component!");
						else
							throw new RuntimeException();
					// throw new
					// RuntimeException("Tried to .cc_delete static .active-component!");
					jInterface class11_17 = Class7.getInterface(jInterface.uid);
					class11_17.aClass11Array262[jInterface.anInt191] = null;
					Class20.refreshInterface(class11_17);
					continue;
				}
				if (opcode == 102) {
					jInterface class11_1 = Class7.getInterface(ItemPile.intStack[--intStackIndex]);
					class11_1.aClass11Array262 = null;
					Class20.refreshInterface(class11_1);
					continue;
				}
				if (opcode == 200) {
					intStackIndex -= 2;
					int k6 = ItemPile.intStack[intStackIndex];
					int j44 = ItemPile.intStack[intStackIndex - -1];
					jInterface class11_19 = AbstractSprite.method638(k6, j44);
					if (null == class11_19 || j44 == -1) {
						ItemPile.intStack[intStackIndex++] = 0;
					} else {
						ItemPile.intStack[intStackIndex++] = 1;
						if (!flag)
							GrandExchangeItem.aClass11_1749 = class11_19;
						else
							Class164.aClass11_2055 = class11_19;
					}
					continue;
				}
				if (201 != opcode)
					break;
				int l6 = ItemPile.intStack[--intStackIndex];
				jInterface class11_18 = Class7.getInterface(l6);
				if (null != class11_18) {
					ItemPile.intStack[intStackIndex++] = 1;
					if (flag)
						Class164.aClass11_2055 = class11_18;
					else
						GrandExchangeItem.aClass11_1749 = class11_18;
				} else {
					ItemPile.intStack[intStackIndex++] = 0;
				}
				continue;
			} else if (opcode <= 500) {
				if (opcode == 403) {
					intStackIndex -= 2;
					int i66 = ItemPile.intStack[intStackIndex - -1];
					int j43 = ItemPile.intStack[intStackIndex];
					int k75 = 0;
					do {
						if (Class3_Sub26.anIntArray2559.length <= k75)
							break;
						if (j43 == Class3_Sub26.anIntArray2559[k75]) {
							TextureLoader.selfPlayer.playerAppearance.method1164(k75, i66, 0);
							continue label0;
						}
						k75++;
					} while (true);
					k75 = 0;
					do {
						if (~k75 <= ~Class3_Sub13_Sub19.anIntArray3228.length)
							continue label0;
						if (~j43 == ~Class3_Sub13_Sub19.anIntArray3228[k75]) {
							TextureLoader.selfPlayer.playerAppearance.method1164(k75, i66, 0);
							continue label0;
						}
						k75++;
					} while (true);
				}
				if (opcode == 404) {
					intStackIndex -= 2;
					int k43 = ItemPile.intStack[intStackIndex];
					int j66 = ItemPile.intStack[1 + intStackIndex];
					TextureLoader.selfPlayer.playerAppearance.method1162(k43, false, j66);
					continue;
				}
				if (opcode != 410)
					break;
				boolean flag2 = 0 != ItemPile.intStack[--intStackIndex];
				TextureLoader.selfPlayer.playerAppearance.method1159(flag2, true);
			} else if (opcode >= 1000 && opcode < 1100 || opcode >= 2000 && opcode < 2100) {
				jInterface class11_2;
				if (opcode < 2000) {
					class11_2 = flag ? Class164.aClass11_2055 : GrandExchangeItem.aClass11_1749;
				} else {
					class11_2 = Class7.getInterface(ItemPile.intStack[--intStackIndex]);
					opcode -= 1000;
				}
				if (opcode == 1000) {
					intStackIndex -= 2;
					class11_2.x = ItemPile.intStack[intStackIndex];
					class11_2.y = ItemPile.intStack[intStackIndex + 1];
					/*
					 * int l66 = Class140_Sub7.intStack[3 + intStackIndex];
					 * if(~l66 > -1) l66 = 0; else if(-6 > ~l66) l66 = 5; int
					 * k44 = Class140_Sub7.intStack[intStackIndex + 2]; if(k44
					 * >= 0) { if(~k44 < -6) k44 = 5; } else { k44 = 0; }
					 */
					class11_2.aByte162 = (byte) 0;
					class11_2.aByte273 = (byte) 0;
					Class20.refreshInterface(class11_2);
					Class3_Sub13_Sub12.method225(14, class11_2);
					if (~class11_2.anInt191 == 0)
						UnderlayType.method2280(2714, class11_2.uid);
					continue;
				}
				if (opcode == 1001) {
					intStackIndex -= 2;
					class11_2.width = ItemPile.intStack[intStackIndex];
					class11_2.height = ItemPile.intStack[1 + intStackIndex];
					class11_2.anInt184 = 0;
					class11_2.anInt312 = 0;
					/*
					 * int l44 = Class140_Sub7.intStack[intStackIndex + 2]; int
					 * i67 = Class140_Sub7.intStack[3 + intStackIndex]; if(-1 >=
					 * ~i67) { if(i67 > 4) i67 = 4; } else { i67 = 0; }
					 * class11_2.aByte241 = (byte)i67; if(~l44 > -1) l44 = 0;
					 * else if(~l44 < -5) l44 = 4; class11_2.aByte304 =
					 * (byte)l44;
					 */
					Class20.refreshInterface(class11_2);
					Class3_Sub13_Sub12.method225(14, class11_2);
					if (-1 == ~class11_2.type)
						js5Worker.method2104(class11_2, false, 32);
					continue;
				}
				if (opcode == 1003) {
					boolean flag3 = ~ItemPile.intStack[--intStackIndex] == -2;
					if (flag3 == (!class11_2.hidden)) {
						class11_2.hidden = flag3;
						Class20.refreshInterface(class11_2);
					}
					if (-1 == class11_2.anInt191)
						RawObjectCache.method569(-82, class11_2.uid);
					continue;
				}
				if (opcode == 1004) {
					intStackIndex -= 2;
					class11_2.anInt216 = ItemPile.intStack[intStackIndex];
					class11_2.anInt160 = ItemPile.intStack[intStackIndex - -1];
					Class20.refreshInterface(class11_2);
					Class3_Sub13_Sub12.method225(14, class11_2);
					if (class11_2.type == 0)
						js5Worker.method2104(class11_2, false, -127);
					continue;
				}
				if (opcode != 1005)
					break;
				class11_2.aBoolean219 = ItemPile.intStack[--intStackIndex] == 1;
				continue;
				// } else if((1100 > opcode || 1200 <= opcode) && (~opcode >
				// -2101 || 2200 <= opcode)) {
			} else if (opcode >= 1100 && opcode < 1200 || opcode >= 2100 && opcode < 2200) {
				jInterface class11_16;
				if (opcode < 2000) {
					class11_16 = flag ? Class164.aClass11_2055 : GrandExchangeItem.aClass11_1749;
				} else {
					opcode -= 1000;
					class11_16 = Class7.getInterface(ItemPile.intStack[--intStackIndex]);
				}
				if (opcode == 1100) {
					intStackIndex -= 2;
					class11_16.anInt247 = ItemPile.intStack[intStackIndex];
					if (~class11_16.anInt247 < ~(class11_16.maxScrollHorizontal + -class11_16.anInt168))
						class11_16.anInt247 = class11_16.maxScrollHorizontal + -class11_16.anInt168;
					if (~class11_16.anInt247 > -1)
						class11_16.anInt247 = 0;
					class11_16.anInt208 = ItemPile.intStack[intStackIndex + 1];
					if (class11_16.anInt208 > class11_16.maxScrollVertical + -class11_16.anInt193)
						class11_16.anInt208 = class11_16.maxScrollVertical + -class11_16.anInt193;
					if (~class11_16.anInt208 > -1)
						class11_16.anInt208 = 0;
					Class20.refreshInterface(class11_16);
					if (-1 == class11_16.anInt191)
						Class67.method1259(class11_16.uid, (byte) 109);
					continue;
				}
				if (opcode == 1101) {
					class11_16.disabledColor = ItemPile.intStack[--intStackIndex];
					Class20.refreshInterface(class11_16);
					if (0 == ~class11_16.anInt191)
						Canvas_Sub2.method56(class11_16.uid);
					continue;
				}
				if (opcode == 1102) {
					class11_16.filled = ItemPile.intStack[--intStackIndex] == 1;
					Class20.refreshInterface(class11_16);
					continue;
				}
				if (opcode == 1103) {
					class11_16.alpha = ItemPile.intStack[--intStackIndex];
					Class20.refreshInterface(class11_16);
					continue;
				}
				if (opcode == 1104) {
					class11_16.thickness = ItemPile.intStack[--intStackIndex];
					Class20.refreshInterface(class11_16);
					continue;
				}
				if (opcode == 1105) {
					class11_16.disabledSprite = ItemPile.intStack[--intStackIndex];
					Class20.refreshInterface(class11_16);
					continue;
				}
				if (opcode == 1106) {
					class11_16.rotatino = ItemPile.intStack[--intStackIndex];
					Class20.refreshInterface(class11_16);
					continue;
				}
				if (opcode == 1107) {
					class11_16.aBoolean186 = -2 == ~ItemPile.intStack[--intStackIndex];
					Class20.refreshInterface(class11_16);
					continue;
				}
				if (opcode == 1108) {
					class11_16.mediaTypeDisabled = 1;
					class11_16.mediaIdDisabled = ItemPile.intStack[--intStackIndex];
					Class20.refreshInterface(class11_16);
					if (~class11_16.anInt191 == 0)
						Class162.method2206(true, class11_16.uid);
					continue;
				}
				if (opcode == 1109) {
					intStackIndex -= 6;
					class11_16.anInt258 = ItemPile.intStack[intStackIndex];
					class11_16.anInt264 = ItemPile.intStack[intStackIndex + 1];
					class11_16.rotateX = ItemPile.intStack[2 + intStackIndex];
					class11_16.rotateY = ItemPile.intStack[intStackIndex - -3];
					class11_16.rotateZ = ItemPile.intStack[intStackIndex - -4];
					class11_16.zoom = ItemPile.intStack[5 + intStackIndex];
					Class20.refreshInterface(class11_16);
					if (~class11_16.anInt191 == 0) {
						Class3_Sub13_Sub19.method265(class11_16.uid);
						Class107.method1649(class11_16.uid, -106);
					}
					continue;
				}
				if (opcode == 1110) {
					int l65 = ItemPile.intStack[--intStackIndex];
					if (class11_16.disabledAnim != l65) {
						class11_16.disabledAnim = l65;
						class11_16.anInt283 = 0;
						class11_16.anInt267 = 0;
						class11_16.anInt260 = 1;
						Class20.refreshInterface(class11_16);
					}
					if (~class11_16.anInt191 == 0)
						Class108.method1657(class11_16.uid, -903);
					continue;
				}
				if (opcode == 1111) {
					class11_16.aBoolean181 = 1 == ItemPile.intStack[--intStackIndex];
					Class20.refreshInterface(class11_16);
					continue;
				}
				if (opcode == 1112) {
					jString class94_63 = Node.stringStack[--stringStackIndex];
					if (!class94_63.equals(class11_16.disabledText)) {
						class11_16.disabledText = class94_63;
						Class20.refreshInterface(class11_16);
					}
					if (0 == ~class11_16.anInt191)
						Class93.method1516(class11_16.uid, 91);
					continue;
				}
				if (opcode == 1113) {
					class11_16.font = ItemPile.intStack[--intStackIndex];
					Class20.refreshInterface(class11_16);
					continue;
				}
				if (opcode == 1114) {
					intStackIndex -= 3;
					class11_16.horizontalAlignment = ItemPile.intStack[intStackIndex];
					class11_16.verticalAlignment = ItemPile.intStack[1 + intStackIndex];
					class11_16.verticalSpacing = ItemPile.intStack[2 + intStackIndex];
					Class20.refreshInterface(class11_16);
					continue;
				}
				if (opcode == 1115) {
					class11_16.shaded = 1 == ItemPile.intStack[--intStackIndex];
					Class20.refreshInterface(class11_16);
					continue;
				}
				if (opcode == 1116) {
					class11_16.outline = ItemPile.intStack[--intStackIndex];
					Class20.refreshInterface(class11_16);
					continue;
				}
				if (opcode == 1117) {
					class11_16.shadow = ItemPile.intStack[--intStackIndex];
					Class20.refreshInterface(class11_16);
					continue;
				}
				if (opcode == 1118) {
					class11_16.flipVertical = ItemPile.intStack[--intStackIndex] == 1;
					Class20.refreshInterface(class11_16);
					continue;
				}
				if (opcode == 1119) {
					class11_16.flipHorizontal = -2 == ~ItemPile.intStack[--intStackIndex];
					Class20.refreshInterface(class11_16);
					continue;
				}
				if (opcode == 1120) {
					intStackIndex -= 2;
					class11_16.maxScrollHorizontal = ItemPile.intStack[intStackIndex];
					class11_16.maxScrollVertical = ItemPile.intStack[1 + intStackIndex];
					Class20.refreshInterface(class11_16);
					if (-1 == ~class11_16.type)
						js5Worker.method2104(class11_16, false, -116);
					continue;
				}
				if (opcode == 1121) {
					intStackIndex -= 2;
					class11_16.aShort293 = (short) ItemPile.intStack[intStackIndex];
					class11_16.aShort169 = (short) ItemPile.intStack[intStackIndex + 1];
					Class20.refreshInterface(class11_16);
					continue;
				}
				if (opcode == 1122) {
					class11_16.aBoolean157 = ~ItemPile.intStack[--intStackIndex] == -2;
					Class20.refreshInterface(class11_16);
					continue;
				}
				if (opcode != 1123)
					break;
				class11_16.zoom = ItemPile.intStack[--intStackIndex];
				Class20.refreshInterface(class11_16);
				if (0 == ~class11_16.anInt191)
					Class3_Sub13_Sub19.method265(class11_16.uid);
				continue;
			} else if (opcode >= 1200 && opcode < 1300 || opcode >= 2200 && opcode < 2300) {
				jInterface class11_15;
				if (opcode < 2000) {
					class11_15 = flag ? Class164.aClass11_2055 : GrandExchangeItem.aClass11_1749;
				} else {
					class11_15 = Class7.getInterface(ItemPile.intStack[--intStackIndex]);
					opcode -= 1000;
				}
				Class20.refreshInterface(class11_15);
				if (opcode == 1200 || opcode == 1205) {
					intStackIndex -= 2;
					int j75 = ItemPile.intStack[1 + intStackIndex];
					int k65 = ItemPile.intStack[intStackIndex];
					if (-1 == class11_15.anInt191) {
						MouseHandler.method2092(class11_15.uid);
						Class3_Sub13_Sub19.method265(class11_15.uid);
						Class107.method1649(class11_15.uid, -101);
					}
					if (-1 == k65) {
						class11_15.mediaIdDisabled = -1;
						class11_15.mediaTypeDisabled = 1;
						class11_15.anInt192 = -1;
					} else {
						class11_15.anInt192 = k65;
						class11_15.anInt271 = j75;
						ItemDefinition class48_4 = ItemDefinition.method1023(k65);
						class11_15.rotateZ = class48_4.anInt768;
						class11_15.anInt258 = class48_4.anInt792;
						class11_15.rotateX = class48_4.anInt786;
						class11_15.anInt264 = class48_4.anInt754;
						class11_15.rotateY = class48_4.anInt799;
						class11_15.zoom = class48_4.anInt810;
						if (class11_15.anInt184 > 0)
							class11_15.zoom = (class11_15.zoom * 32) / class11_15.anInt184;
						else if (class11_15.width > 0)
							class11_15.zoom = (class11_15.zoom * 32) / class11_15.width;
						if (1205 == opcode)
							class11_15.aBoolean227 = false;
						else
							class11_15.aBoolean227 = true;
					}
					continue;
				}
				if (opcode == 1201) {
					class11_15.mediaTypeDisabled = 2;
					class11_15.mediaIdDisabled = ItemPile.intStack[--intStackIndex];
					if (class11_15.anInt191 == -1)
						Class162.method2206(true, class11_15.uid);
					continue;
				}
				if (opcode == 1202) {
					class11_15.mediaTypeDisabled = 3;
					class11_15.mediaIdDisabled = TextureLoader.selfPlayer.playerAppearance.method1163(-24861);
					if (class11_15.anInt191 == -1)
						Class162.method2206(true, class11_15.uid);
					continue;
				}
				if (opcode == 1203) {
					class11_15.mediaTypeDisabled = 6;
					class11_15.mediaIdDisabled = ItemPile.intStack[--intStackIndex];
					if (~class11_15.anInt191 == 0)
						Class162.method2206(true, class11_15.uid);
					continue;
				}
				if (opcode != 1204)
					break;// TODO here
				class11_15.mediaTypeDisabled = 5;
				class11_15.mediaIdDisabled = ItemPile.intStack[--intStackIndex];
				if (~class11_15.anInt191 == 0)
					Class162.method2206(true, class11_15.uid);
				continue;
			} else if (opcode >= 1300 && opcode < 1400 || opcode >= 2300 && opcode < 2400) {
				jInterface class11_3;
				if (opcode < 2000) {
					class11_3 = flag ? Class164.aClass11_2055 : GrandExchangeItem.aClass11_1749;
				} else {
					opcode -= 1000;
					class11_3 = Class7.getInterface(ItemPile.intStack[--intStackIndex]);
				}
				if (opcode == 1300) {
					int i45 = ItemPile.intStack[--intStackIndex] + -1;
					if (0 > i45 || ~i45 < -10)
						stringStackIndex--;
					else
						class11_3.method857((byte) 112, Node.stringStack[--stringStackIndex], i45);
					continue;
				}
				if (opcode == 1301) {
					intStackIndex -= 2;
					int j67 = ItemPile.intStack[1 + intStackIndex];
					int j45 = ItemPile.intStack[intStackIndex];
					class11_3.aClass11_302 = AbstractSprite.method638(j45, j67);
					continue;
				}
				if (opcode == 1302) {
					class11_3.aBoolean200 = ~ItemPile.intStack[--intStackIndex] == -2;
					continue;
				}
				if (opcode == 1303) {
					class11_3.anInt214 = ItemPile.intStack[--intStackIndex];
					continue;
				}
				if (opcode == 1304) {
					class11_3.anInt179 = ItemPile.intStack[--intStackIndex];
					continue;
				}
				if (opcode == 1305) {
					class11_3.aClass94_277 = Node.stringStack[--stringStackIndex];
					continue;
				}
				if (opcode == 1306) {
					class11_3.selectedActionName = Node.stringStack[--stringStackIndex];
					continue;
				}
				if (opcode == 1307) {
					class11_3.niActions = null;
					continue;
				}
				if (opcode == 1308) {
					class11_3.anInt238 = ItemPile.intStack[--intStackIndex];
					class11_3.anInt266 = ItemPile.intStack[--intStackIndex];
					continue;
				}
				if (1309 != opcode)
					break;
				int k45 = ItemPile.intStack[--intStackIndex];
				int k67 = ItemPile.intStack[--intStackIndex];
				if (~k67 <= -2 && ~k67 >= -11)
					class11_3.method854(k67 + -1, k45, (byte) 43);
				continue;
			} else if (opcode >= 1400 && opcode < 1500 || opcode >= 2400 && opcode < 2500) {
				jInterface class11_14;
				if (opcode < 2000) {
					class11_14 = flag ? Class164.aClass11_2055 : GrandExchangeItem.aClass11_1749;
				} else {
					opcode -= 1000;
					class11_14 = Class7.getInterface(ItemPile.intStack[--intStackIndex]);
				}
				int ai3[] = null;
				jString class94_62 = Node.stringStack[--stringStackIndex];
				if (~class94_62.getLength() < -1 && -90 == ~class94_62.method1569(class94_62.getLength() + -1, (byte) -96)) {
					int i79 = ItemPile.intStack[--intStackIndex];
					if (i79 > 0) {
						ai3 = new int[i79];
						while (i79-- > 0)
							ai3[i79] = ItemPile.intStack[--intStackIndex];
					}
					class94_62 = class94_62.substring(class94_62.getLength() - 1, 0);
				}
				Object aobj1[] = new Object[class94_62.getLength() - -1];
				for (int i81 = -1 + aobj1.length; 1 <= i81; i81--)
					if (115 != class94_62.method1569(i81 + -1, (byte) -43))
						aobj1[i81] = new Integer(ItemPile.intStack[--intStackIndex]);
					else
						aobj1[i81] = Node.stringStack[--stringStackIndex];

				int j81 = ItemPile.intStack[--intStackIndex];
				if (~j81 == 0)
					aobj1 = null;
				else
					aobj1[0] = new Integer(j81);
				class11_14.aBoolean195 = true;
				if (opcode == 1400) {
					class11_14.anObjectArray165 = aobj1;
					continue;
				}
				if (opcode == 1401) {
					class11_14.anObjectArray180 = aobj1;
					continue;
				}
				if (opcode == 1402) {
					class11_14.anObjectArray239 = aobj1;
					continue;
				}
				if (opcode == 1403) {
					class11_14.anObjectArray248 = aobj1;
					continue;
				}
				if (opcode == 1404) {
					class11_14.anObjectArray281 = aobj1;
					continue;
				}
				if (opcode == 1405) {
					class11_14.anObjectArray295 = aobj1;
					continue;
				}
				if (opcode == 1406) {
					class11_14.anObjectArray303 = aobj1;
					continue;
				}
				if (opcode == 1407) {
					class11_14.anIntArray286 = ai3;
					class11_14.anObjectArray282 = aobj1;
					continue;
				}
				if (opcode == 1408) {
					class11_14.anObjectArray269 = aobj1;
					continue;
				}
				if (opcode == 1409) {
					class11_14.anObjectArray314 = aobj1;
					continue;
				}
				if (opcode == 1410) {
					class11_14.anObjectArray229 = aobj1;
					continue;
				} 
				if (opcode == 1411) {
					class11_14.anObjectArray170 = aobj1;
					continue;
				} 
				if (opcode == 1412) {
					class11_14.anObjectArray276 = aobj1;
					continue;
				} 
				if (opcode == 1414) {
					class11_14.anIntArray175 = ai3;
					class11_14.anObjectArray174 = aobj1;
					continue;
				} 
				if (opcode == 1415) {
					class11_14.anIntArray274 = ai3;
					class11_14.anObjectArray158 = aobj1;
					continue;
				} 
				if (opcode == 1416) {
					class11_14.anObjectArray203 = aobj1;
					continue;
				} 
				if (opcode == 1417) {
					class11_14.anObjectArray183 = aobj1;
					continue;
				} 
				if (opcode == 1418) {
					class11_14.anObjectArray256 = aobj1;
					continue;
				}
				if (opcode == 1419) {
					class11_14.keyPressedListener = aobj1;
					continue;
				}
				if (opcode == 1420) {
					class11_14.anObjectArray156 = aobj1;
					continue;
				}
				if (opcode == 1421) {
					class11_14.anObjectArray313 = aobj1;
					continue;
				}
				if (opcode == 1422) {
					class11_14.anObjectArray315 = aobj1;
					continue;
				} 
				if (opcode == 1423) {
					class11_14.anObjectArray206 = aobj1;
					continue;
				}
				if (opcode == 1424) {
					class11_14.anObjectArray176 = aobj1;
					continue;
				}
				if (opcode == 1425) {
					class11_14.anObjectArray268 = aobj1;
					continue;
				} 
				if (opcode == 1426) {
					class11_14.anObjectArray217 = aobj1;
					continue;
				} 
				if (opcode == 1427) {
					class11_14.anObjectArray235 = aobj1;
					continue;
				} 
				if (opcode == 1427) {
					class11_14.anObjectArray161 = aobj1;
					class11_14.anIntArray211 = ai3;
					continue;
				} 
				if (opcode != 1429)
					break;
				class11_14.anIntArray185 = ai3;
				class11_14.anObjectArray221 = aobj1;
				continue;
			} else if (opcode < 1600) {
				jInterface class11_4 = flag ? Class164.aClass11_2055 : GrandExchangeItem.aClass11_1749;
				if (opcode == 1500) {
					ItemPile.intStack[intStackIndex++] = class11_4.anInt306;
					continue;
				}
				if (opcode == 1501) {
					ItemPile.intStack[intStackIndex++] = class11_4.anInt210;
					continue;
				}
				if (opcode == 1502) {
					ItemPile.intStack[intStackIndex++] = class11_4.anInt168;
					continue;
				}
				if (opcode == 1503) {
					ItemPile.intStack[intStackIndex++] = class11_4.anInt193;
					continue;
				}
				if (opcode == 1504) {
					ItemPile.intStack[intStackIndex++] = class11_4.hidden ? 1 : 0;
					continue;
				}
				if (opcode != 1505)
					break;
				ItemPile.intStack[intStackIndex++] = class11_4.parent;
				continue;
			} else if (opcode < 1700) {
				jInterface class11_5 = flag ? Class164.aClass11_2055 : GrandExchangeItem.aClass11_1749;
				if (opcode == 1600) {
					ItemPile.intStack[intStackIndex++] = class11_5.anInt247;
					continue;
				}
				if (opcode == 1601) {
					ItemPile.intStack[intStackIndex++] = class11_5.anInt208;
					continue;
				}
				if (opcode == 1602) {
					Node.stringStack[stringStackIndex++] = class11_5.disabledText;
					continue;
				}
				if (opcode == 1603) {
					ItemPile.intStack[intStackIndex++] = class11_5.maxScrollHorizontal;
					continue;
				}
				if (opcode == 1604) {
					ItemPile.intStack[intStackIndex++] = class11_5.maxScrollVertical;
					continue;
				}
				if (opcode == 1605) {
					ItemPile.intStack[intStackIndex++] = class11_5.zoom;
					continue;
				}
				if (opcode == 1606) {
					ItemPile.intStack[intStackIndex++] = class11_5.rotateX;
					continue;
				}
				if (opcode == 1607) {
					ItemPile.intStack[intStackIndex++] = class11_5.rotateZ;
					continue;
				}
				if (opcode == 1608) {
					ItemPile.intStack[intStackIndex++] = class11_5.rotateY;
					continue;
				}
				if (opcode == 1609) {
					ItemPile.intStack[intStackIndex++] = class11_5.alpha;
					continue;
				}
				if (opcode == 1610) {
					ItemPile.intStack[intStackIndex++] = class11_5.anInt258;
					continue;
				}
				if (opcode == 1611) {
					ItemPile.intStack[intStackIndex++] = class11_5.anInt264;
					continue;
				}
				if (opcode != 1612)
					break;
				ItemPile.intStack[intStackIndex++] = class11_5.disabledSprite;
				continue;
			} else if (opcode < 1800) {
				jInterface class11_13 = flag ? Class164.aClass11_2055 : GrandExchangeItem.aClass11_1749;
				if (opcode == 1700) {
					ItemPile.intStack[intStackIndex++] = class11_13.anInt192;
					continue;
				}
				if (opcode == 1701) {
					if (~class11_13.anInt192 == 0)
						ItemPile.intStack[intStackIndex++] = 0;
					else
						ItemPile.intStack[intStackIndex++] = class11_13.anInt271;
					continue;
				}
				if (opcode != 1702)
					break;
				ItemPile.intStack[intStackIndex++] = class11_13.anInt191;
				continue;
			} else if (opcode < 1900) {
				jInterface class11_6 = flag ? Class164.aClass11_2055 : GrandExchangeItem.aClass11_1749;
				if (opcode == 1800) {
					ItemPile.intStack[intStackIndex++] = jInterface.getInterfaceClickMask(class11_6).method101();
					continue;
				}
				if (opcode == 1801) {
					int l45 = ItemPile.intStack[--intStackIndex];
					l45--;
					if (null == class11_6.niActions || ~l45 <= ~class11_6.niActions.length || null == class11_6.niActions[l45])
						Node.stringStack[stringStackIndex++] = Class3_Sub9.aClass94_2331;
					else
						Node.stringStack[stringStackIndex++] = class11_6.niActions[l45];
					continue;
				}
				if (opcode != 1802)
					break;
				if (null != class11_6.aClass94_277)
					Node.stringStack[stringStackIndex++] = class11_6.aClass94_277;
				else
					Node.stringStack[stringStackIndex++] = Class3_Sub9.aClass94_2331;
				continue;
			} else if (opcode < 2600) {
				jInterface class11_7 = Class7.getInterface(ItemPile.intStack[--intStackIndex]);
				if (opcode == 2500) {
					ItemPile.intStack[intStackIndex++] = class11_7.anInt306;
					continue;
				}
				if (opcode == 2501) {
					ItemPile.intStack[intStackIndex++] = class11_7.anInt210;
					continue;
				}
				if (opcode == 2502) {
					ItemPile.intStack[intStackIndex++] = class11_7.anInt168;
					continue;
				}
				if (opcode == 2503) {
					ItemPile.intStack[intStackIndex++] = class11_7.anInt193;
					continue;
				}
				if (opcode == 2504) {
					ItemPile.intStack[intStackIndex++] = class11_7.hidden ? 1 : 0;
					continue;
				}
				if (opcode != 2505)
					break;
				ItemPile.intStack[intStackIndex++] = class11_7.parent;
				continue;
			} else if (opcode < 2700) {
				jInterface class11_12 = Class7.getInterface(ItemPile.intStack[--intStackIndex]);
				if (opcode == 2600) {
					ItemPile.intStack[intStackIndex++] = class11_12.anInt247;
					continue;
				}
				if (opcode == 2601) {
					ItemPile.intStack[intStackIndex++] = class11_12.anInt208;
					continue;
				}
				if (opcode == 2602) {
					Node.stringStack[stringStackIndex++] = class11_12.disabledText;
					continue;
				}
				if (opcode == 2603) {
					ItemPile.intStack[intStackIndex++] = class11_12.maxScrollHorizontal;
					continue;
				}
				if (opcode == 2604) {
					ItemPile.intStack[intStackIndex++] = class11_12.maxScrollVertical;
					continue;
				}
				if (opcode == 2605) {
					ItemPile.intStack[intStackIndex++] = class11_12.zoom;
					continue;
				}
				if (opcode == 2606) {
					ItemPile.intStack[intStackIndex++] = class11_12.rotateX;
					continue;
				}
				if (opcode == 2607) {
					ItemPile.intStack[intStackIndex++] = class11_12.rotateZ;
					continue;
				}
				if (opcode == 2608) {
					ItemPile.intStack[intStackIndex++] = class11_12.rotateY;
					continue;
				}
				if (opcode == 2609) {
					ItemPile.intStack[intStackIndex++] = class11_12.alpha;
					continue;
				}
				if (opcode == 2610) {
					ItemPile.intStack[intStackIndex++] = class11_12.anInt258;
					continue;
				}
				if (opcode == 2611) {
					ItemPile.intStack[intStackIndex++] = class11_12.anInt264;
					continue;
				}
				if (opcode != 2612)
					break;
				ItemPile.intStack[intStackIndex++] = class11_12.disabledSprite;
				continue;
			} else if (opcode < 2800) {
				if (opcode == 2700) {
					jInterface class11_9 = Class7.getInterface(ItemPile.intStack[--intStackIndex]);
					ItemPile.intStack[intStackIndex++] = class11_9.anInt192;
					continue;
				}
				if (opcode == 2701) {
					jInterface class11_10 = Class7.getInterface(ItemPile.intStack[--intStackIndex]);
					if (-1 != class11_10.anInt192)
						ItemPile.intStack[intStackIndex++] = class11_10.anInt271;
					else
						ItemPile.intStack[intStackIndex++] = 0;
					continue;
				}
				if (opcode == 2702) {
					int l42 = ItemPile.intStack[--intStackIndex];
					OverridedInterface class3_sub31 = (OverridedInterface) Class3_Sub13_Sub17.aClass130_3208.get(l42);
					if (class3_sub31 == null)
						ItemPile.intStack[intStackIndex++] = 0;
					else
						ItemPile.intStack[intStackIndex++] = 1;
					continue;
				}
				if (opcode == 2703) {
					jInterface class11_11 = Class7.getInterface(ItemPile.intStack[--intStackIndex]);
					if (null == class11_11.aClass11Array262) {
						ItemPile.intStack[intStackIndex++] = 0;
					} else {
						int i65 = class11_11.aClass11Array262.length;
						int i75 = 0;
						do {
							if (class11_11.aClass11Array262.length <= i75)
								break;
							if (null == class11_11.aClass11Array262[i75]) {
								i65 = i75;
								break;
							}
							i75++;
						} while (true);
						ItemPile.intStack[intStackIndex++] = i65;
					}
					continue;
				}
				if (opcode != 2704 && 2705 != opcode)
					break;
				intStackIndex -= 2;
				int i43 = ItemPile.intStack[intStackIndex];
				int j65 = ItemPile.intStack[intStackIndex + 1];
				OverridedInterface class3_sub31_1 = (OverridedInterface) Class3_Sub13_Sub17.aClass130_3208.get(i43);
				if (class3_sub31_1 == null || class3_sub31_1.uid != j65)
					ItemPile.intStack[intStackIndex++] = 0;
				else
					ItemPile.intStack[intStackIndex++] = 1;
				continue;
			} else if (opcode < 2900) {
				jInterface class11_8 = Class7.getInterface(ItemPile.intStack[--intStackIndex]);
				if (opcode == 2800) {
					ItemPile.intStack[intStackIndex++] = jInterface.getInterfaceClickMask(class11_8).method101();
					continue;
				}
				if (opcode == 2801) {
					int l64 = ItemPile.intStack[--intStackIndex];
					l64--;
					if (class11_8.niActions != null && class11_8.niActions.length > l64 && null != class11_8.niActions[l64])
						Node.stringStack[stringStackIndex++] = class11_8.niActions[l64];
					else
						Node.stringStack[stringStackIndex++] = Class3_Sub9.aClass94_2331;
					continue;
				}
				if (opcode != 2802)
					break;
				if (class11_8.aClass94_277 != null)
					Node.stringStack[stringStackIndex++] = class11_8.aClass94_277;
				else
					Node.stringStack[stringStackIndex++] = Class3_Sub9.aClass94_2331;
				continue;
			} else if (opcode < 3200) {
				if (opcode == 3100) {
					jString class94_3 = Node.stringStack[--stringStackIndex];
					PacketBuffer.method805(Class3_Sub9.aClass94_2331, class94_3, 0);
					continue;
				}
				if (opcode == 3101) {
					intStackIndex -= 2;
					GroundItem.method628(0, ItemPile.intStack[intStackIndex - -1], ItemPile.intStack[intStackIndex], TextureLoader.selfPlayer);
					continue;
				}
				if (opcode == 3103) {
					Class3_Sub13_Sub19.method264();
					continue;
				}
				if (opcode == 3104) {
					jString class94_4 = Node.stringStack[--stringStackIndex];
					int i46 = 0;
					if (class94_4.method1543(82))
						i46 = class94_4.method1552((byte) -104);
					Class3_Sub13_Sub1.outputStream.putPacket(78);
					Class3_Sub13_Sub1.outputStream.putInt(i46);
					continue;
				}
				if (opcode == 3105) {
					jString class94_5 = Node.stringStack[--stringStackIndex];
					Class3_Sub13_Sub1.outputStream.putPacket(244);
					Class3_Sub13_Sub1.outputStream.putLong(class94_5.toLong());
					continue;
				}
				if (opcode == 3106) {
					jString class94_6 = Node.stringStack[--stringStackIndex];
					Class3_Sub13_Sub1.outputStream.putPacket(65);
					Class3_Sub13_Sub1.outputStream.putByte(1 + class94_6.getLength());
					Class3_Sub13_Sub1.outputStream.putString(class94_6);
					continue;
				}
				if (opcode == 3107) {
					int i7 = ItemPile.intStack[--intStackIndex];
					jString class94_44 = Node.stringStack[--stringStackIndex];
					Class166.method2258(i7, 0, class94_44);
					continue;
				}
				if (opcode == 3108) {
					intStackIndex -= 3;
					int j46 = ItemPile.intStack[intStackIndex - -1];
					int j7 = ItemPile.intStack[intStackIndex];
					int l67 = ItemPile.intStack[2 + intStackIndex];
					jInterface class11_22 = Class7.getInterface(l67);
					InterfaceChangeNode.a(j46, j7, 115, class11_22);
					continue;
				}
				if (opcode == 3109) {
					intStackIndex -= 2;
					int k7 = ItemPile.intStack[intStackIndex];
					jInterface class11_20 = flag ? Class164.aClass11_2055 : GrandExchangeItem.aClass11_1749;
					int k46 = ItemPile.intStack[1 + intStackIndex];
					InterfaceChangeNode.a(k46, k7, 79, class11_20);
					continue;
				}
				if (opcode != 3110)
					break;
				int l7 = ItemPile.intStack[--intStackIndex];
				Class3_Sub13_Sub1.outputStream.putPacket(111);
				Class3_Sub13_Sub1.outputStream.putShort(l7);
				continue;
			} else if (opcode < 3300) {
				if (opcode == 3200) {
					intStackIndex -= 3;
					Class3_Sub13_Sub6.method199(ItemPile.intStack[intStackIndex - -1], ItemPile.intStack[intStackIndex], ItemPile.intStack[intStackIndex + 2], -799);
					continue;
				}
				if (opcode == 3201) {
					Class86.method1427(true, ItemPile.intStack[--intStackIndex]);
					continue;
				}
				if (opcode != 3202)
					break;
				intStackIndex -= 2;
				Class167.method2266(ItemPile.intStack[1 + intStackIndex], ItemPile.intStack[intStackIndex], (byte) -1);
				continue;
			} else if (opcode < 3400) {
				if (opcode == 3300) {
					ItemPile.intStack[intStackIndex++] = Class44.loopCycle;
					continue;
				}
				if (opcode == 3301) {
					intStackIndex -= 2;
					int i8 = ItemPile.intStack[intStackIndex];
					int l46 = ItemPile.intStack[1 + intStackIndex];
					ItemPile.intStack[intStackIndex++] = jInterface.method861(i8, 89, l46);
					continue;
				}
				if (opcode == 3302) {
					intStackIndex -= 2;
					int i47 = ItemPile.intStack[intStackIndex + 1];
					int j8 = ItemPile.intStack[intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class12.method872(-1, j8, i47);
					continue;
				}
				if (opcode == 3303) {
					intStackIndex -= 2;
					int j47 = ItemPile.intStack[intStackIndex - -1];
					int k8 = ItemPile.intStack[intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class167.method2268(k8, j47);
					continue;
				}
				if (opcode == 3304) {
					int l8 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = InvType.list(l8).size;
					continue;
				}
				if (opcode == 3305) {
					int i9 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub15.currentStats[i9];
					continue;
				}
				if (opcode == 3306) {
					int j9 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class3_Sub20.maxStats[j9];
					continue;
				}
				if (opcode == 3307) {
					int k9 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = GrandExchangeItem.currentExp[k9];
					continue;
				}
				if (opcode == 3308) {
					int l9 = Class26.plane;
					int k47 = Class131.anInt1716 + (TextureLoader.selfPlayer.anInt2819 >> 7);
					int i68 = (TextureLoader.selfPlayer.anInt2829 >> 7) - -Class82.anInt1152;
					ItemPile.intStack[intStackIndex++] = (l9 << 28) - (-(k47 << 14) - i68);
					continue;
				}
				if (opcode == 3309) {
					int i10 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = method633(16383, i10 >> 14);
					continue;
				}
				if (opcode == 3310) {
					int j10 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = j10 >> 28;
					continue;
				}
				if (opcode == 3311) {
					int k10 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = method633(k10, 16383);
					continue;
				}
				if (opcode == 3312) {
					ItemPile.intStack[intStackIndex++] = Class2.allowMembers ? 1 : 0;
					continue;
				}
				if (opcode == 3313) {
					intStackIndex -= 2;
					int l10 = 32768 + ItemPile.intStack[intStackIndex];
					int l47 = ItemPile.intStack[intStackIndex - -1];
					ItemPile.intStack[intStackIndex++] = jInterface.method861(l10, 118, l47);
					continue;
				}
				if (opcode == 3314) {
					intStackIndex -= 2;
					int i11 = ItemPile.intStack[intStackIndex] - -32768;
					int i48 = ItemPile.intStack[1 + intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class12.method872(-1, i11, i48);
					continue;
				}
				if (opcode == 3315) {
					intStackIndex -= 2;
					int j11 = 32768 + ItemPile.intStack[intStackIndex];
					int j48 = ItemPile.intStack[1 + intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class167.method2268(j11, j48);
					continue;
				}
				if (opcode == 3316) {
					if (-3 < ~Class3_Sub13_Sub26.anInt3320)
						ItemPile.intStack[intStackIndex++] = 0;
					else
						ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub26.anInt3320;
					continue;
				}
				if (opcode == 3317) {
					ItemPile.intStack[intStackIndex++] = Class38_Sub1.systemUpdateCycle;
					continue;
				}
				if (opcode == 3318) {
					ItemPile.intStack[intStackIndex++] = InterfaceListener.anInt2451;
					continue;
				}
				if (opcode == 3321) {
					ItemPile.intStack[intStackIndex++] = Class9.energy;
					continue;
				}
				if (opcode == 3322) {
					ItemPile.intStack[intStackIndex++] = MouseHandler.weigth;
					continue;
				}
				if (opcode == 3323) {
					if (~Class3_Sub28_Sub19.anInt3775 <= -6 && -10 <= ~Class3_Sub28_Sub19.anInt3775)
						ItemPile.intStack[intStackIndex++] = 1;
					else
						ItemPile.intStack[intStackIndex++] = 0;
					continue;
				}
				if (opcode == 3324) {
					if (~Class3_Sub28_Sub19.anInt3775 > -6 || Class3_Sub28_Sub19.anInt3775 > 9)
						ItemPile.intStack[intStackIndex++] = 0;
					else
						ItemPile.intStack[intStackIndex++] = Class3_Sub28_Sub19.anInt3775;
					continue;
				}
				if (opcode == 3325) {
					ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub29.aBoolean3358 ? 1 : 0;
					continue;
				}
				if (opcode == 3326) {
					ItemPile.intStack[intStackIndex++] = TextureLoader.selfPlayer.combatLevel;
					continue;
				}
				if (opcode == 3327) {
					ItemPile.intStack[intStackIndex++] = TextureLoader.selfPlayer.playerAppearance.isFemale ? 1 : 0;
					continue;
				}
				if (opcode == 3328) {
					ItemPile.intStack[intStackIndex++] = !Class3_Sub15.aBoolean2433 || Class121.aBoolean1641 ? 0 : 1;
					continue;
				}
				if (opcode == 3329) {
					ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub14.aBoolean3166 ? 1 : 0;
					continue;
				}
				if (opcode == 3330) {
					int k11 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class44_Sub1.method1079(k11, (byte) -80);
					continue;
				}
				if (opcode == 3331) {
					intStackIndex -= 2;
					int k48 = ItemPile.intStack[1 + intStackIndex];
					int l11 = ItemPile.intStack[intStackIndex];
					ItemPile.intStack[intStackIndex++] = DisplayModeInformation.method1643(10131, false, l11, k48);
					continue;
				}
				if (opcode == 3332) {
					intStackIndex -= 2;
					int i12 = ItemPile.intStack[intStackIndex];
					int l48 = ItemPile.intStack[intStackIndex + 1];
					ItemPile.intStack[intStackIndex++] = DisplayModeInformation.method1643(10131, true, i12, l48);
					continue;
				}
				if (opcode == 3333) {
					ItemPile.intStack[intStackIndex++] = Class7.anInt2161;
					continue;
				}
				if (opcode == 3335) {
					ItemPile.intStack[intStackIndex++] = 0;
					continue;
				}
				if (opcode == 3336) {
					intStackIndex -= 4;
					int i49 = ItemPile.intStack[intStackIndex - -1];
					int j12 = ItemPile.intStack[intStackIndex];
					j12 += i49 << 14;
					int k76 = ItemPile.intStack[3 + intStackIndex];
					int j68 = ItemPile.intStack[2 + intStackIndex];
					j12 += j68 << 28;
					j12 += k76;
					ItemPile.intStack[intStackIndex++] = j12;
					continue;
				}
				if (opcode != 3337)
					break;
				ItemPile.intStack[intStackIndex++] = Class3_Sub26.anInt2554;
				continue;
			} else if (opcode < 3500) {
				if (opcode == 3400) {
					intStackIndex -= 2;
					int k12 = ItemPile.intStack[intStackIndex];
					int j49 = ItemPile.intStack[1 + intStackIndex];
					EnumType class3_sub28_sub13_1 = EnumType.list(k12);
					if (-116 != ~class3_sub28_sub13_1.anInt3658)
						;
					Node.stringStack[stringStackIndex++] = class3_sub28_sub13_1.method616(j49, (byte) 121);
					continue;
				}
				if (opcode == 3408) {
					intStackIndex -= 4;
					int l12 = ItemPile.intStack[intStackIndex];
					int k49 = ItemPile.intStack[1 + intStackIndex];
					int l76 = ItemPile.intStack[3 + intStackIndex];
					int k68 = ItemPile.intStack[intStackIndex - -2];
					EnumType class3_sub28_sub13_4 = EnumType.list(k68);
					if (class3_sub28_sub13_4.anInt3662 != l12 || ~class3_sub28_sub13_4.anInt3658 != ~k49)
						throw new RuntimeException();
					// throw new RuntimeException("C3408-1");
					if (-116 != ~k49)
						ItemPile.intStack[intStackIndex++] = class3_sub28_sub13_4.method620(0, l76);
					else
						Node.stringStack[stringStackIndex++] = class3_sub28_sub13_4.method616(l76, (byte) -25);
					continue;
				}
				if (opcode == 3409) {
					intStackIndex -= 3;
					int l49 = ItemPile.intStack[intStackIndex - -1];
					int l68 = ItemPile.intStack[intStackIndex + 2];
					int i13 = ItemPile.intStack[intStackIndex];
					if (0 == ~l49)
						throw new RuntimeException();
					// throw new RuntimeException("C3409-2");
					EnumType class3_sub28_sub13_3 = EnumType.list(l49);
					if (~class3_sub28_sub13_3.anInt3658 != ~i13)
						throw new RuntimeException();
					// throw new RuntimeException("C3409-1");
					ItemPile.intStack[intStackIndex++] = class3_sub28_sub13_3.method621(-8143, l68) ? 1 : 0;
					continue;
				}
				if (opcode == 3410) {
					int j13 = ItemPile.intStack[--intStackIndex];
					jString class94_45 = Node.stringStack[--stringStackIndex];
					if (j13 == -1)
						throw new RuntimeException();
					// throw new RuntimeException("C3410-2");
					EnumType class3_sub28_sub13_2 = EnumType.list(j13);
					if (-116 != ~class3_sub28_sub13_2.anInt3658)
						throw new RuntimeException();
					// throw new RuntimeException("C3410-1");
					ItemPile.intStack[intStackIndex++] = class3_sub28_sub13_2.method617(class94_45, 8729) ? 1 : 0;
					continue;
				}
				if (opcode != 3411)
					break;
				int k13 = ItemPile.intStack[--intStackIndex];
				EnumType class3_sub28_sub13 = EnumType.list(k13);
				ItemPile.intStack[intStackIndex++] = class3_sub28_sub13.aClass130_3663.method1781();
				continue;
			} else if (opcode < 3700) {
				if (opcode == 3600) {
					if (HintIcon.anInt1357 == 0)
						ItemPile.intStack[intStackIndex++] = -2;
					else if (HintIcon.anInt1357 != 1)
						ItemPile.intStack[intStackIndex++] = Class8.anInt104;
					else
						ItemPile.intStack[intStackIndex++] = -1;
					continue;
				}
				if (opcode == 3601) {
					int l13 = ItemPile.intStack[--intStackIndex];
					if (-3 != ~HintIcon.anInt1357 || ~l13 <= ~Class8.anInt104)
						Node.stringStack[stringStackIndex++] = Class3_Sub9.aClass94_2331;
					else
						Node.stringStack[stringStackIndex++] = Class70.aClass94Array1046[l13];
					continue;
				}
				if (opcode == 3602) {
					int i14 = ItemPile.intStack[--intStackIndex];
					if (-3 != ~HintIcon.anInt1357 || ~Class8.anInt104 >= ~i14)
						ItemPile.intStack[intStackIndex++] = 0;
					else
						ItemPile.intStack[intStackIndex++] = CursorType.anIntArray882[i14];
					continue;
				}
				if (opcode == 3603) {
					int j14 = ItemPile.intStack[--intStackIndex];
					if (2 == HintIcon.anInt1357 && Class8.anInt104 > j14)
						ItemPile.intStack[intStackIndex++] = Class57.anIntArray904[j14];
					else
						ItemPile.intStack[intStackIndex++] = 0;
					continue;
				}
				if (opcode == 3604) {
					int i50 = ItemPile.intStack[--intStackIndex];
					jString class94_7 = Node.stringStack[--stringStackIndex];
					OverlayType.method1605(class94_7, i50);
					continue;
				}
				if (opcode == 3605) {
					jString class94_8 = Node.stringStack[--stringStackIndex];
					Class163_Sub3.method2229(class94_8.toLong(), (byte) -91);
					continue;
				}
				if (opcode == 3606) {
					jString class94_9 = Node.stringStack[--stringStackIndex];
					Class3_Sub13_Sub27.method297(class94_9.toLong());
					continue;
				}
				if (opcode == 3607) {
					jString class94_10 = Node.stringStack[--stringStackIndex];
					Class81.method1399(32, class94_10.toLong());
					continue;
				}
				if (opcode == 3608) {
					jString class94_11 = Node.stringStack[--stringStackIndex];
					Class3_Sub13_Sub10.method212(class94_11.toLong(), 0);
					continue;
				}
				if (opcode == 3609) {
					jString class94_12 = Node.stringStack[--stringStackIndex];
					if (class94_12.method1558(Class3_Sub9.aClass94_2323, 0) || class94_12.method1558(Class3_Sub13_Sub16.aClass94_3190, 0))
						class94_12 = class94_12.method1556(7, (byte) -74);
					ItemPile.intStack[intStackIndex++] = SubScript.method1176(class94_12, (byte) -82) ? 1 : 0;
					continue;
				}
				if (opcode == 3610) {
					int k14 = ItemPile.intStack[--intStackIndex];
					if (~HintIcon.anInt1357 == -3 && Class8.anInt104 > k14)
						Node.stringStack[stringStackIndex++] = NodeSub.aClass94Array2566[k14];
					else
						Node.stringStack[stringStackIndex++] = Class3_Sub9.aClass94_2331;
					continue;
				}
				if (opcode == 3611) {
					if (jInterface.aClass94_251 != null)
						Node.stringStack[stringStackIndex++] = jInterface.aClass94_251.upperCase();
					else
						Node.stringStack[stringStackIndex++] = Class3_Sub9.aClass94_2331;
					continue;
				}
				if (opcode == 3612) {
					if (null != jInterface.aClass94_251)
						ItemPile.intStack[intStackIndex++] = NodeSub.anInt2572;
					else
						ItemPile.intStack[intStackIndex++] = 0;
					continue;
				}
				if (opcode == 3613) {
					int l14 = ItemPile.intStack[--intStackIndex];
					if (jInterface.aClass94_251 == null || ~NodeSub.anInt2572 >= ~l14)
						Node.stringStack[stringStackIndex++] = Class3_Sub9.aClass94_2331;
					else
						Node.stringStack[stringStackIndex++] = clanMembers[l14].name.upperCase();
					continue;
				}
				if (opcode == 3614) {
					int i15 = ItemPile.intStack[--intStackIndex];
					if (jInterface.aClass94_251 == null || i15 >= NodeSub.anInt2572)
						ItemPile.intStack[intStackIndex++] = 0;
					else
						ItemPile.intStack[intStackIndex++] = clanMembers[i15].anInt2478;
					continue;
				}
				if (opcode == 3615) {
					int j15 = ItemPile.intStack[--intStackIndex];
					if (null == jInterface.aClass94_251 || ~NodeSub.anInt2572 >= ~j15)
						ItemPile.intStack[intStackIndex++] = 0;
					else
						ItemPile.intStack[intStackIndex++] = clanMembers[j15].aByte2472;
					continue;
				}
				if (opcode == 3616) {
					ItemPile.intStack[intStackIndex++] = Player.aByte3953;
					continue;
				}
				if (opcode == 3617) {
					jString class94_13 = Node.stringStack[--stringStackIndex];
					DisplayModeInformation.method1642(class94_13);
					continue;
				}
				if (opcode == 3618) {
					ItemPile.intStack[intStackIndex++] = CollisionMap.aByte1308;
					continue;
				}
				if (opcode == 3619) {
					jString class94_14 = Node.stringStack[--stringStackIndex];
					Class3_Sub22.method400(class94_14.toLong());
					continue;
				}
				if (opcode == 3620) {
					Class77.method1368();
					continue;
				}
				if (opcode == 3621) {
					if (HintIcon.anInt1357 == 0)
						ItemPile.intStack[intStackIndex++] = -1;
					else
						ItemPile.intStack[intStackIndex++] = AnimationLoader.anInt3591;
					continue;
				}
				if (opcode == 3622) {
					int k15 = ItemPile.intStack[--intStackIndex];
					if (HintIcon.anInt1357 == 0 || AnimationLoader.anInt3591 <= k15)
						Node.stringStack[stringStackIndex++] = Class3_Sub9.aClass94_2331;
					else
						Node.stringStack[stringStackIndex++] = FileSystem.longToString(Class114.aLongArray1574[k15]).upperCase();
					continue;
				}
				if (opcode == 3623) {
					jString class94_15 = Node.stringStack[--stringStackIndex];
					if (class94_15.method1558(Class3_Sub9.aClass94_2323, 0) || class94_15.method1558(Class3_Sub13_Sub16.aClass94_3190, 0))
						class94_15 = class94_15.method1556(7, (byte) -74);
					ItemPile.intStack[intStackIndex++] = Class3_Sub24_Sub3.method467(class94_15, 0) ? 1 : 0;
					continue;
				}
				if (opcode == 3624) {
					int l15 = ItemPile.intStack[--intStackIndex];
					if (null != clanMembers && ~NodeSub.anInt2572 < ~l15 && clanMembers[l15].name.method1531(TextureLoader.selfPlayer.username))
						ItemPile.intStack[intStackIndex++] = 1;
					else
						ItemPile.intStack[intStackIndex++] = 0;
					continue;
				}
				if (opcode == 3625) {
					if (Class161.aClass94_2035 == null)
						Node.stringStack[stringStackIndex++] = Class3_Sub9.aClass94_2331;
					else
						Node.stringStack[stringStackIndex++] = Class161.aClass94_2035.upperCase();
					continue;
				}
				if (opcode == 3626) {
					int i16 = ItemPile.intStack[--intStackIndex];
					if (jInterface.aClass94_251 == null || ~NodeSub.anInt2572 >= ~i16)
						Node.stringStack[stringStackIndex++] = Class3_Sub9.aClass94_2331;
					else
						Node.stringStack[stringStackIndex++] = clanMembers[i16].aClass94_2473;
					continue;
				}
				if (opcode == 3627) {
					int j16 = ItemPile.intStack[--intStackIndex];
					if (HintIcon.anInt1357 != 2 || 0 > j16 || ~j16 <= ~Class8.anInt104)
						ItemPile.intStack[intStackIndex++] = 0;
					else
						ItemPile.intStack[intStackIndex++] = Node.aBooleanArray73[j16] ? 1 : 0;
					continue;
				}
				if (opcode == 3628) {
					jString class94_16 = Node.stringStack[--stringStackIndex];
					if (class94_16.method1558(Class3_Sub9.aClass94_2323, 0) || class94_16.method1558(Class3_Sub13_Sub16.aClass94_3190, 0))
						class94_16 = class94_16.method1556(7, (byte) -74);
					ItemPile.intStack[intStackIndex++] = PacketParser.method826(class94_16, -1);
					continue;
				}
				if (opcode != 3629)
					break;
				ItemPile.intStack[intStackIndex++] = OverridedInterface.anInt2607;
				continue;
			} else if (opcode < 4000) {
				if (opcode == 3903) {
					int k16 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub33.aClass133Array3393[k16].method1805((byte) -33);
					continue;
				}
				if (opcode == 3904) {
					int l16 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub33.aClass133Array3393[l16].anInt1752;
					continue;
				}
				if (opcode == 3905) {
					int i17 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub33.aClass133Array3393[i17].anInt1757;
					continue;
				}
				if (opcode == 3906) {
					int j17 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub33.aClass133Array3393[j17].anInt1747;
					continue;
				}
				if (opcode == 3907) {
					int k17 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub33.aClass133Array3393[k17].anInt1746;
					continue;
				}
				if (opcode == 3908) {
					int l17 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub33.aClass133Array3393[l17].anInt1750;
					continue;
				}
				if (opcode == 3910) {
					int i18 = ItemPile.intStack[--intStackIndex];
					int j50 = Class3_Sub13_Sub33.aClass133Array3393[i18].method1804(false);
					ItemPile.intStack[intStackIndex++] = -1 == ~j50 ? 1 : 0;
					continue;
				}
				if (opcode == 3911) {
					int j18 = ItemPile.intStack[--intStackIndex];
					int k50 = Class3_Sub13_Sub33.aClass133Array3393[j18].method1804(false);
					ItemPile.intStack[intStackIndex++] = ~k50 != -3 ? 0 : 1;
					continue;
				}
				if (opcode == 3912) {
					int k18 = ItemPile.intStack[--intStackIndex];
					int l50 = Class3_Sub13_Sub33.aClass133Array3393[k18].method1804(false);
					ItemPile.intStack[intStackIndex++] = ~l50 == -6 ? 1 : 0;
					continue;
				}
				if (opcode != 3913)
					break;
				int l18 = ItemPile.intStack[--intStackIndex];
				int i51 = Class3_Sub13_Sub33.aClass133Array3393[l18].method1804(false);
				ItemPile.intStack[intStackIndex++] = 1 == i51 ? 1 : 0;
				continue;
			} else if (opcode < 4100) {
				if (opcode == 4000) {
					intStackIndex -= 2;
					int i19 = ItemPile.intStack[intStackIndex];
					int j51 = ItemPile.intStack[intStackIndex - -1];
					ItemPile.intStack[intStackIndex++] = j51 + i19;
					continue;
				}
				if (opcode == 4001) {
					intStackIndex -= 2;
					int j19 = ItemPile.intStack[intStackIndex];
					int k51 = ItemPile.intStack[1 + intStackIndex];
					ItemPile.intStack[intStackIndex++] = j19 - k51;
					continue;
				}
				if (opcode == 4002) {
					intStackIndex -= 2;
					int k19 = ItemPile.intStack[intStackIndex];
					int l51 = ItemPile.intStack[1 + intStackIndex];
					ItemPile.intStack[intStackIndex++] = l51 * k19;
					continue;
				}
				if (opcode == 4003) {
					intStackIndex -= 2;
					int l19 = ItemPile.intStack[intStackIndex];
					int i52 = ItemPile.intStack[intStackIndex + 1];
					ItemPile.intStack[intStackIndex++] = l19 / i52;
					continue;
				}
				if (opcode == 4004) {
					int i20 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = (int) ((double) i20 * Math.random());
					continue;
				}
				if (opcode == 4005) {
					int j20 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = (int) (Math.random() * (double) (1 + j20));
					continue;
				}
				if (opcode == 4006) {
					intStackIndex -= 5;
					int k20 = ItemPile.intStack[intStackIndex];
					int j52 = ItemPile.intStack[intStackIndex - -1];
					int i77 = ItemPile.intStack[intStackIndex - -3];
					int i69 = ItemPile.intStack[2 + intStackIndex];
					int j79 = ItemPile.intStack[intStackIndex + 4];
					ItemPile.intStack[intStackIndex++] = ((-k20 + j52) * (j79 + -i69)) / (-i69 + i77) + k20;
					continue;
				}
				if (opcode == 4007) {
					intStackIndex -= 2;
					long l20 = ItemPile.intStack[intStackIndex];
					long l69 = ItemPile.intStack[intStackIndex + 1];
					ItemPile.intStack[intStackIndex++] = (int) ((l20 * l69) / 100L + l20);
					continue;
				}
				if (opcode == 4008) {
					intStackIndex -= 2;
					int i21 = ItemPile.intStack[intStackIndex];
					int k52 = ItemPile.intStack[1 + intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub29.method308(i21, 1 << k52);
					continue;
				}
				if (opcode == 4009) {
					intStackIndex -= 2;
					int j21 = ItemPile.intStack[intStackIndex];
					int l52 = ItemPile.intStack[1 + intStackIndex];
					ItemPile.intStack[intStackIndex++] = method633(-1 - (1 << l52), j21);
					continue;
				}
				if (opcode == 4010) {
					intStackIndex -= 2;
					int k21 = ItemPile.intStack[intStackIndex];
					int i53 = ItemPile.intStack[intStackIndex - -1];
					ItemPile.intStack[intStackIndex++] = method633(k21, 1 << i53) != 0 ? 1 : 0;
					continue;
				}
				if (opcode == 4011) {
					intStackIndex -= 2;
					int j53 = ItemPile.intStack[intStackIndex - -1];
					int l21 = ItemPile.intStack[intStackIndex];
					ItemPile.intStack[intStackIndex++] = l21 % j53;
					continue;
				}
				if (opcode == 4012) {
					intStackIndex -= 2;
					int k53 = ItemPile.intStack[intStackIndex + 1];
					int i22 = ItemPile.intStack[intStackIndex];
					if (0 != i22)
						ItemPile.intStack[intStackIndex++] = (int) Math.pow(i22, k53);
					else
						ItemPile.intStack[intStackIndex++] = 0;
					continue;
				}
				if (opcode == 4013) {
					intStackIndex -= 2;
					int l53 = ItemPile.intStack[intStackIndex - -1];
					int j22 = ItemPile.intStack[intStackIndex];
					if (-1 != ~j22) {
						if (~l53 == -1)
							ItemPile.intStack[intStackIndex++] = 0x7fffffff;
						else
							ItemPile.intStack[intStackIndex++] = (int) Math.pow(j22, 1.0D / (double) l53);
					} else {
						ItemPile.intStack[intStackIndex++] = 0;
					}
					continue;
				}
				if (opcode == 4014) {
					intStackIndex -= 2;
					int i54 = ItemPile.intStack[intStackIndex + 1];
					int k22 = ItemPile.intStack[intStackIndex];
					ItemPile.intStack[intStackIndex++] = method633(i54, k22);
					continue;
				}
				if (opcode == 4015) {
					intStackIndex -= 2;
					int l22 = ItemPile.intStack[intStackIndex];
					int j54 = ItemPile.intStack[intStackIndex + 1];
					ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub29.method308(l22, j54);
					continue;
				}
				if (opcode == 4016) {
					intStackIndex -= 2;
					int i23 = ItemPile.intStack[intStackIndex];
					int k54 = ItemPile.intStack[1 + intStackIndex];
					ItemPile.intStack[intStackIndex++] = ~i23 <= ~k54 ? k54 : i23;
					continue;
				}
				if (opcode == 4017) {
					intStackIndex -= 2;
					int l54 = ItemPile.intStack[1 + intStackIndex];
					int j23 = ItemPile.intStack[intStackIndex];
					ItemPile.intStack[intStackIndex++] = ~l54 > ~j23 ? j23 : l54;
					continue;
				}
				if (opcode != 4018)
					break;
				intStackIndex -= 3;
				long l23 = ItemPile.intStack[intStackIndex];
				long l70 = ItemPile.intStack[intStackIndex + 1];
				long l79 = ItemPile.intStack[2 + intStackIndex];
				ItemPile.intStack[intStackIndex++] = (int) ((l23 * l79) / l70);
				continue;
			} else if (opcode < 4200) {
				if (opcode == 4100) {
					jString class94_29 = Node.stringStack[--stringStackIndex];
					int k62 = ItemPile.intStack[--intStackIndex];
					Node.stringStack[stringStackIndex++] = client.method903(new jString[] { class94_29, Class72.method1298(k62) });
					continue;
				}
				if (opcode == 4101) {
					stringStackIndex -= 2;
					jString class94_57 = Node.stringStack[stringStackIndex + 1];
					jString class94_30 = Node.stringStack[stringStackIndex];
					Node.stringStack[stringStackIndex++] = client.method903(new jString[] { class94_30, class94_57 });
					continue;
				}
				if (opcode == 4102) {
					jString class94_31 = Node.stringStack[--stringStackIndex];
					int l62 = ItemPile.intStack[--intStackIndex];
					Node.stringStack[stringStackIndex++] = client.method903(new jString[] { class94_31, Deque.method1218(true, 127, l62) });
					continue;
				}
				if (opcode == 4103) {
					jString class94_32 = Node.stringStack[--stringStackIndex];
					Node.stringStack[stringStackIndex++] = class94_32.toLowerCase();
					continue;
				}
				if (opcode == 4104) {
					int l40 = ItemPile.intStack[--intStackIndex];
					long l63 = 0xec44e2dc00L + (long) l40 * 0x5265c00L;
					Class3_Sub28_Sub9.aCalendar3616.setTime(new Date(l63));
					int k78 = Class3_Sub28_Sub9.aCalendar3616.get(5);
					int k80 = Class3_Sub28_Sub9.aCalendar3616.get(2);
					int i82 = Class3_Sub28_Sub9.aCalendar3616.get(1);
					Node.stringStack[stringStackIndex++] = client.method903(new jString[] { Class72.method1298(k78), Class93.aClass94_1326, client.aClass94Array358[k80], Class93.aClass94_1326, Class72.method1298(i82) });
					continue;
				}
				if (opcode == 4105) {
					stringStackIndex -= 2;
					jString class94_58 = Node.stringStack[stringStackIndex + 1];
					jString class94_33 = Node.stringStack[stringStackIndex];
					if (TextureLoader.selfPlayer.playerAppearance == null || !TextureLoader.selfPlayer.playerAppearance.isFemale)
						Node.stringStack[stringStackIndex++] = class94_33;
					else
						Node.stringStack[stringStackIndex++] = class94_58;
					continue;
				}
				if (opcode == 4106) {
					int i41 = ItemPile.intStack[--intStackIndex];
					Node.stringStack[stringStackIndex++] = Class72.method1298(i41);
					continue;
				}
				if (opcode == 4107) {
					stringStackIndex -= 2;
					ItemPile.intStack[intStackIndex++] = Node.stringStack[stringStackIndex].method1546((byte) -63, Node.stringStack[stringStackIndex - -1]);
					continue;
				}
				if (opcode == 4108) {
					jString class94_34 = Node.stringStack[--stringStackIndex];
					intStackIndex -= 2;
					int l73 = ItemPile.intStack[intStackIndex - -1];
					int i63 = ItemPile.intStack[intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class86.method1430(-28922, l73).method684(class94_34, i63);
					continue;
				}
				if (opcode == 4109) {
					intStackIndex -= 2;
					jString class94_35 = Node.stringStack[--stringStackIndex];
					int i74 = ItemPile.intStack[1 + intStackIndex];
					int j63 = ItemPile.intStack[intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class86.method1430(-28922, i74).method680(class94_35, j63);
					continue;
				}
				if (opcode == 4110) {
					stringStackIndex -= 2;
					jString class94_36 = Node.stringStack[stringStackIndex];
					jString class94_59 = Node.stringStack[stringStackIndex - -1];
					if (1 == ItemPile.intStack[--intStackIndex])
						Node.stringStack[stringStackIndex++] = class94_36;
					else
						Node.stringStack[stringStackIndex++] = class94_59;
					continue;
				}
				if (opcode == 4111) {
					jString class94_37 = Node.stringStack[--stringStackIndex];
					Node.stringStack[stringStackIndex++] = Font.method686(class94_37);
					continue;
				}
				if (opcode == 4112) {
					int k63 = ItemPile.intStack[--intStackIndex];
					jString class94_38 = Node.stringStack[--stringStackIndex];
					if (~k63 == 0)
						throw new RuntimeException("null char");
					Node.stringStack[stringStackIndex++] = class94_38.method1548(k63);
					continue;
				}
				if (opcode == 4113) {
					int j41 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class164_Sub2.method2248(j41) ? 1 : 0;
					continue;
				}
				if (opcode == 4114) {
					int k41 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class44.method1066(k41) ? 1 : 0;
					continue;
				}
				if (opcode == 4115) {
					int l41 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class3_Sub24_Sub4.method487(l41, (byte) -85) ? 1 : 0;
					continue;
				}
				if (opcode == 4116) {
					int i42 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class3_Sub28_Sub3.method544(-49, i42) ? 1 : 0;
					continue;
				}
				if (opcode == 4117) {
					jString class94_39 = Node.stringStack[--stringStackIndex];
					if (class94_39 != null)
						ItemPile.intStack[intStackIndex++] = class94_39.getLength();
					else
						ItemPile.intStack[intStackIndex++] = 0;
					continue;
				}
				if (opcode == 4118) {
					intStackIndex -= 2;
					jString class94_40 = Node.stringStack[--stringStackIndex];
					int i64 = ItemPile.intStack[intStackIndex];
					int j74 = ItemPile.intStack[1 + intStackIndex];
					Node.stringStack[stringStackIndex++] = class94_40.substring(j74, i64);
					continue;
				}
				if (opcode == 4119) {
					jString class94_41 = Node.stringStack[--stringStackIndex];
					jString class94_60 = Class47.createBlankJString(class94_41.getLength());
					boolean flag9 = false;
					for (int l78 = 0; ~l78 > ~class94_41.getLength(); l78++) {
						int l80 = class94_41.method1569(l78, (byte) -40);
						if (l80 == 60) {
							flag9 = true;
							continue;
						}
						if (~l80 != -63) {
							if (!flag9)
								class94_60.method1572(l80, (byte) 125);
						} else {
							flag9 = false;
						}
					}

					class94_60.method1576((byte) 90);
					Node.stringStack[stringStackIndex++] = class94_60;
					continue;
				}
				if (opcode == 4120) {
					ItemPile.intStack[intStackIndex++] = 0;
					intStackIndex -= 2;
					jString class94_42 = Node.stringStack[--stringStackIndex];
					int j64 = ItemPile.intStack[intStackIndex];
					int k74 = ItemPile.intStack[1 + intStackIndex];
					ItemPile.intStack[intStackIndex++] = class94_42.method1555(j64, k74, 1536);
					continue;
				}
				if (opcode == 4121) {
					stringStackIndex -= 2;
					jString class94_43 = Node.stringStack[stringStackIndex];
					jString class94_61 = Node.stringStack[1 + stringStackIndex];
					int l74 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = class94_43.method1566(class94_61, l74, -1);
					continue;
				}
				if (opcode == 4122) {
					int j42 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub34.method332(2, j42);
					continue;
				}
				if (opcode == 4123) {
					int k42 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = RuntimeException_Sub1.method2287(k42, (byte) 59);
					continue;
				}
				if (opcode != 4124)
					break;
				boolean flag1 = ~ItemPile.intStack[--intStackIndex] != -1;
				int k64 = ItemPile.intStack[--intStackIndex];
				Node.stringStack[stringStackIndex++] = Class3_Sub23.method407(0, flag1, 0, k64, 2);
				continue;
			} else if (opcode < 4300) {
				if (opcode == 4200) {
					int k38 = ItemPile.intStack[--intStackIndex];
					Node.stringStack[stringStackIndex++] = ItemDefinition.method1023(k38).aClass94_770;
					continue;
				}
				if (opcode == 4201) {
					intStackIndex -= 2;
					int l38 = ItemPile.intStack[intStackIndex];
					int k61 = ItemPile.intStack[intStackIndex - -1];
					ItemDefinition class48_2 = ItemDefinition.method1023(l38);
					if (~k61 > -2 || k61 > 5 || class48_2.aClass94Array801[-1 + k61] == null)
						Node.stringStack[stringStackIndex++] = Class3_Sub9.aClass94_2331;
					else
						Node.stringStack[stringStackIndex++] = class48_2.aClass94Array801[k61 - 1];
					continue;
				}
				if (~opcode == -4203) {
					intStackIndex -= 2;
					int i39 = ItemPile.intStack[intStackIndex];
					int l61 = ItemPile.intStack[intStackIndex + 1];
					ItemDefinition class48_3 = ItemDefinition.method1023(i39);
					if (l61 >= 1 && ~l61 >= -6 && null != class48_3.aClass94Array783[l61 + -1])
						Node.stringStack[stringStackIndex++] = class48_3.aClass94Array783[-1 + l61];
					else
						Node.stringStack[stringStackIndex++] = Class3_Sub9.aClass94_2331;
					continue;
				}
				if (opcode == 4203) {
					int j39 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = ItemDefinition.method1023(j39).cost;
					continue;
				}
				if (~opcode == -4205) {
					int k39 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = ~ItemDefinition.method1023(k39).stackable == -2 ? 1 : 0;
					continue;
				}
				if (4205 == opcode) {
					int l39 = ItemPile.intStack[--intStackIndex];
					ItemDefinition class48 = ItemDefinition.method1023(l39);
					if (-1 == class48.anInt791 && -1 >= ~class48.anInt789)
						ItemPile.intStack[intStackIndex++] = class48.anInt789;
					else
						ItemPile.intStack[intStackIndex++] = l39;
					continue;
				}
				if (~opcode == -4207) {
					int i40 = ItemPile.intStack[--intStackIndex];
					ItemDefinition class48_1 = ItemDefinition.method1023(i40);
					if (0 <= class48_1.anInt791 && ~class48_1.anInt789 <= -1)
						ItemPile.intStack[intStackIndex++] = class48_1.anInt789;
					else
						ItemPile.intStack[intStackIndex++] = i40;
					continue;
				}
				if (-4208 == ~opcode) {
					int j40 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = ItemDefinition.method1023(j40).members ? 1 : 0;
					continue;
				}
				if (-4209 == ~opcode) {
					intStackIndex -= 2;
					int k40 = ItemPile.intStack[intStackIndex];
					int i62 = ItemPile.intStack[intStackIndex - -1];
					Class3_Sub28_Sub9 class3_sub28_sub9_3 = Deque.method1210(64, i62);
					if (class3_sub28_sub9_3.method585(0))
						Node.stringStack[stringStackIndex++] = ItemDefinition.method1023(k40).method1105(107, class3_sub28_sub9_3.aClass94_3619, i62);
					else
						ItemPile.intStack[intStackIndex++] = ItemDefinition.method1023(k40).method1115(class3_sub28_sub9_3.anInt3614, i62);
					continue;
				}
				if (4209 == opcode) {
					continue;
				}
				if (4210 == opcode) {
					jString class94_28 = Node.stringStack[--stringStackIndex];
					int j62 = ItemPile.intStack[--intStackIndex];
					NpcDefinition.method1480(-2 == ~j62, class94_28, 102);
					ItemPile.intStack[intStackIndex++] = Class62.anInt952;
					continue;
				}
				if (-4212 == ~opcode) {
					if (null == Class99.aShortArray1398 || Entity.anInt2756 >= Class62.anInt952)
						ItemPile.intStack[intStackIndex++] = -1;
					else
						ItemPile.intStack[intStackIndex++] = method633(Class99.aShortArray1398[Entity.anInt2756++], 65535);
					continue;
				}
				if (4212 != opcode)
					break;
				Entity.anInt2756 = 0;
				continue;
			} else if (opcode < 4400) {
				if (4300 != opcode)
					break;
				intStackIndex -= 2;
				int k23 = ItemPile.intStack[intStackIndex];
				int i55 = ItemPile.intStack[1 + intStackIndex];
				Class3_Sub28_Sub9 class3_sub28_sub9 = Deque.method1210(64, i55);
				if (!class3_sub28_sub9.method585(0))
					ItemPile.intStack[intStackIndex++] = NpcDefinition.list(k23).method1475(i55, class3_sub28_sub9.anInt3614);
				else
					Node.stringStack[stringStackIndex++] = NpcDefinition.list(k23).method1477(i55, class3_sub28_sub9.aClass94_3619, true);
				continue;
			} else if (opcode <= 4500) {//TODO here
				if (opcode != 4400)
					break;
				intStackIndex -= 2;
				int j61 = ItemPile.intStack[intStackIndex - -1];
				int j38 = ItemPile.intStack[intStackIndex];
				Class3_Sub28_Sub9 class3_sub28_sub9_2 = Deque.method1210(64, j61);
				if (!class3_sub28_sub9_2.method585(0))
					ItemPile.intStack[intStackIndex++] = ObjectDefinition.list(j38).method1691(class3_sub28_sub9_2.anInt3614, j61, (byte) 105);
				else
					Node.stringStack[stringStackIndex++] = ObjectDefinition.list(j38).method1698(class3_sub28_sub9_2.aClass94_3619, -23085, j61);
				continue;
			} else if (opcode <= 4600) {
				if (4500 != opcode)
					break;
				intStackIndex -= 2;
				int i38 = ItemPile.intStack[intStackIndex];
				int i61 = ItemPile.intStack[intStackIndex - -1];
				Class3_Sub28_Sub9 class3_sub28_sub9_1 = Deque.method1210(64, i61);
				if (!class3_sub28_sub9_1.method585(0))
					ItemPile.intStack[intStackIndex++] = Class72.method1292((byte) 94, i38).method600(i61, class3_sub28_sub9_1.anInt3614, (byte) -29);
				else
					Node.stringStack[stringStackIndex++] = Class72.method1292((byte) 31, i38).method604(class3_sub28_sub9_1.aClass94_3619, i61);
				continue;
			} else if (opcode < 5100) {
				if (opcode == 5000) {
					ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub8.anInt3101;
					continue;
				}
				if (opcode == 5001) {
					intStackIndex -= 3;
					Class3_Sub13_Sub8.anInt3101 = ItemPile.intStack[intStackIndex];
					IdentityKit.anInt467 = ItemPile.intStack[1 + intStackIndex];
					Class45.anInt734 = ItemPile.intStack[2 + intStackIndex];
					Class3_Sub13_Sub1.outputStream.putPacket(157);
					Class3_Sub13_Sub1.outputStream.putByte(Class3_Sub13_Sub8.anInt3101);
					Class3_Sub13_Sub1.outputStream.putByte(IdentityKit.anInt467);
					Class3_Sub13_Sub1.outputStream.putByte(Class45.anInt734);
					continue;
				}
				if (opcode == 5002) {
					jString class94_17 = Node.stringStack[--stringStackIndex];
					intStackIndex -= 2;
					int j55 = ItemPile.intStack[intStackIndex];
					int j69 = ItemPile.intStack[1 + intStackIndex];
					Class3_Sub13_Sub1.outputStream.putPacket(99);
					Class3_Sub13_Sub1.outputStream.putLong(class94_17.toLong());
					Class3_Sub13_Sub1.outputStream.putByte(j55 - 1);
					Class3_Sub13_Sub1.outputStream.putByte(j69);
					continue;
				}
				if (opcode == 5003) {
					jString class94_46 = null;
					int i24 = ItemPile.intStack[--intStackIndex];
					if (i24 < 100)
						class94_46 = StringNode.chatMessages[i24];
					if (class94_46 == null)
						class94_46 = Class3_Sub9.aClass94_2331;
					Node.stringStack[stringStackIndex++] = class94_46;
					continue;
				}
				if (-5005 == ~opcode) {
					int j24 = ItemPile.intStack[--intStackIndex];
					int k55 = -1;
					if (j24 < 100 && null != StringNode.chatMessages[j24])
						k55 = Class3_Sub13_Sub6.chatTypes[j24];
					ItemPile.intStack[intStackIndex++] = k55;
					continue;
				}
				if (opcode == 5005) {
					ItemPile.intStack[intStackIndex++] = IdentityKit.anInt467;
					continue;
				}
				if (opcode == 5008) {
					jString class94_18 = Node.stringStack[--stringStackIndex];
					if (class94_18.method1558(Class9.aClass94_132, 0))
						Class65943149.method1308(class94_18);
					else if (Class3_Sub13_Sub26.anInt3320 != 0 || (!Class3_Sub15.aBoolean2433 || Class121.aBoolean1641) && !Class3_Sub13_Sub14.aBoolean3166) {
						jString class94_47 = class94_18.toLowerCase();
						byte byte3 = 0;
						if (class94_47.method1558(Class3_Sub28_Sub2.aClass94_3548, 0)) {
							byte3 = 0;
							class94_18 = class94_18.method1556(Class3_Sub28_Sub2.aClass94_3548.getLength(), (byte) -74);
						} else if (!class94_47.method1558(Class3_Sub20.aClass94_2490, 0)) {
							if (!class94_47.method1558(ItemDefinition.aClass94_806, 0)) {
								if (class94_47.method1558(client.aClass94_2197, 0)) {
									byte3 = 3;
									class94_18 = class94_18.method1556(client.aClass94_2197.getLength(), (byte) -74);
								} else if (class94_47.method1558(Vertex.aClass94_833, 0)) {
									class94_18 = class94_18.method1556(Vertex.aClass94_833.getLength(), (byte) -74);
									byte3 = 4;
								} else if (class94_47.method1558(ClickMaskNode.aClass94_2214, 0)) {
									class94_18 = class94_18.method1556(ClickMaskNode.aClass94_2214.getLength(), (byte) -74);
									byte3 = 5;
								} else if (!class94_47.method1558(Class3_Sub13_Sub20.aClass94_3246, 0)) {
									if (!class94_47.method1558(Canvas_Sub2.aClass94_32, 0)) {
										if (class94_47.method1558(Npc.aClass94_3981, 0)) {
											class94_18 = class94_18.method1556(Npc.aClass94_3981.getLength(), (byte) -74);
											byte3 = 8;
										} else if (!class94_47.method1558(Class2.aClass94_60, 0)) {
											if (class94_47.method1558(Class154.aClass94_1961, 0)) {
												byte3 = 10;
												class94_18 = class94_18.method1556(Class154.aClass94_1961.getLength(), (byte) -74);
											} else if (!class94_47.method1558(Class163_Sub1.aClass94_2992, 0)) {
												if (0 != 0)
													if (class94_47.method1558(Class3_Sub28_Sub2.aClass94_3544, 0)) {
														byte3 = 0;
														class94_18 = class94_18.method1556(Class3_Sub28_Sub2.aClass94_3544.getLength(), (byte) -74);
													} else if (class94_47.method1558(Class3_Sub20.aClass94_2481, 0)) {
														class94_18 = class94_18.method1556(Class3_Sub20.aClass94_2481.getLength(), (byte) -74);
														byte3 = 1;
													} else if (class94_47.method1558(ItemDefinition.aClass94_809, 0)) {
														class94_18 = class94_18.method1556(ItemDefinition.aClass94_809.getLength(), (byte) -74);
														byte3 = 2;
													} else if (!class94_47.method1558(client.aClass94_2196, 0)) {
														if (!class94_47.method1558(Vertex.aClass94_825, 0)) {
															if (class94_47.method1558(ClickMaskNode.aClass94_2210, 0)) {
																byte3 = 5;
																class94_18 = class94_18.method1556(ClickMaskNode.aClass94_2210.getLength(), (byte) -74);
															} else if (class94_47.method1558(Class3_Sub13_Sub20.aClass94_3249, 0)) {
																class94_18 = class94_18.method1556(Class3_Sub13_Sub20.aClass94_3249.getLength(), (byte) -74);
																byte3 = 6;
															} else if (class94_47.method1558(Canvas_Sub2.aClass94_36, 0)) {
																byte3 = 7;
																class94_18 = class94_18.method1556(Canvas_Sub2.aClass94_36.getLength(), (byte) -74);
															} else if (class94_47.method1558(Npc.aClass94_3988, 0)) {
																byte3 = 8;
																class94_18 = class94_18.method1556(Npc.aClass94_3988.getLength(), (byte) -74);
															} else if (class94_47.method1558(Class2.aClass94_62, 0)) {
																byte3 = 9;
																class94_18 = class94_18.method1556(Class2.aClass94_62.getLength(), (byte) -74);
															} else if (class94_47.method1558(Class154.aClass94_1962, 0)) {
																class94_18 = class94_18.method1556(Class154.aClass94_1962.getLength(), (byte) -74);
																byte3 = 10;
															} else if (class94_47.method1558(Class163_Sub1.aClass94_2991, 0)) {
																class94_18 = class94_18.method1556(Class163_Sub1.aClass94_2991.getLength(), (byte) -74);
																byte3 = 11;
															}
														} else {
															class94_18 = class94_18.method1556(Vertex.aClass94_825.getLength(), (byte) -74);
															byte3 = 4;
														}
													} else {
														class94_18 = class94_18.method1556(client.aClass94_2196.getLength(), (byte) -74);
														byte3 = 3;
													}
											} else {
												class94_18 = class94_18.method1556(Class163_Sub1.aClass94_2992.getLength(), (byte) -74);
												byte3 = 11;
											}
										} else {
											byte3 = 9;
											class94_18 = class94_18.method1556(Class2.aClass94_60.getLength(), (byte) -74);
										}
									} else {
										byte3 = 7;
										class94_18 = class94_18.method1556(Canvas_Sub2.aClass94_32.getLength(), (byte) -74);
									}
								} else {
									byte3 = 6;
									class94_18 = class94_18.method1556(Class3_Sub13_Sub20.aClass94_3246.getLength(), (byte) -74);
								}
							} else {
								class94_18 = class94_18.method1556(ItemDefinition.aClass94_806.getLength(), (byte) -74);
								byte3 = 2;
							}
						} else {
							class94_18 = class94_18.method1556(Class3_Sub20.aClass94_2490.getLength(), (byte) -74);
							byte3 = 1;
						}
						byte byte4 = 0;
						class94_47 = class94_18.toLowerCase();
						if (class94_47.method1558(Class140_Sub3.aClass94_2740, 0)) {
							class94_18 = class94_18.method1556(Class140_Sub3.aClass94_2740.getLength(), (byte) -74);
							byte4 = 1;
						} else if (!class94_47.method1558(Class3_Sub13_Sub26.aClass94_3325, 0)) {
							if (!class94_47.method1558(Class128.aClass94_1689, 0)) {
								if (!class94_47.method1558(Class27.aClass94_528, 0)) {
									if (class94_47.method1558(SpotAnimation.aClass94_547, 0)) {
										byte4 = 5;
										class94_18 = class94_18.method1556(SpotAnimation.aClass94_547.getLength(), (byte) -74);
									} else if (0 != 0)
										if (!class94_47.method1558(Class140_Sub3.aClass94_2751, 0)) {
											if (!class94_47.method1558(Class3_Sub13_Sub26.aClass94_3333, 0)) {
												if (!class94_47.method1558(Class128.aClass94_1688, 0)) {
													if (!class94_47.method1558(Class27.aClass94_523, 0)) {
														if (class94_47.method1558(SpotAnimation.aClass94_551, 0)) {
															class94_18 = class94_18.method1556(SpotAnimation.aClass94_551.getLength(), (byte) -74);
															byte4 = 5;
														}
													} else {
														byte4 = 4;
														class94_18 = class94_18.method1556(Class27.aClass94_523.getLength(), (byte) -74);
													}
												} else {
													byte4 = 3;
													class94_18 = class94_18.method1556(Class128.aClass94_1688.getLength(), (byte) -74);
												}
											} else {
												byte4 = 2;
												class94_18 = class94_18.method1556(Class3_Sub13_Sub26.aClass94_3333.getLength(), (byte) -74);
											}
										} else {
											class94_18 = class94_18.method1556(Class140_Sub3.aClass94_2751.getLength(), (byte) -74);
											byte4 = 1;
										}
								} else {
									byte4 = 4;
									class94_18 = class94_18.method1556(Class27.aClass94_528.getLength(), (byte) -74);
								}
							} else {
								class94_18 = class94_18.method1556(Class128.aClass94_1689.getLength(), (byte) -74);
								byte4 = 3;
							}
						} else {
							byte4 = 2;
							class94_18 = class94_18.method1556(Class3_Sub13_Sub26.aClass94_3325.getLength(), (byte) -74);
						}
						Class3_Sub13_Sub1.outputStream.putPacket(115);
						Class3_Sub13_Sub1.outputStream.putByte(0);
						int k79 = Class3_Sub13_Sub1.outputStream.pos;
						Class3_Sub13_Sub1.outputStream.putByte(byte3);
						Class3_Sub13_Sub1.outputStream.putByte(byte4);
						Class85.method1423(false, Class3_Sub13_Sub1.outputStream, class94_18);
						Class3_Sub13_Sub1.outputStream.putSizedByte(-k79 + Class3_Sub13_Sub1.outputStream.pos);
					}
					continue;
				}
				if (opcode == 5009) {
					stringStackIndex -= 2;
					jString class94_48 = Node.stringStack[stringStackIndex + 1];
					jString class94_19 = Node.stringStack[stringStackIndex];
					if (~Class3_Sub13_Sub26.anInt3320 != -1 || (!Class3_Sub15.aBoolean2433 || Class121.aBoolean1641) && !Class3_Sub13_Sub14.aBoolean3166) {
						Class3_Sub13_Sub1.outputStream.putPacket(238);
						Class3_Sub13_Sub1.outputStream.putByte(0);
						int k69 = Class3_Sub13_Sub1.outputStream.pos;
						Class3_Sub13_Sub1.outputStream.putLong(class94_19.toLong());
						Class85.method1423(false, Class3_Sub13_Sub1.outputStream, class94_48);
						Class3_Sub13_Sub1.outputStream.putSizedByte(Class3_Sub13_Sub1.outputStream.pos - k69);
					}
					continue;
				}
				if (~opcode == -5011) {
					int k24 = ItemPile.intStack[--intStackIndex];
					jString class94_49 = null;
					if (~k24 > -101)
						class94_49 = Class3_Sub13_Sub19.chatNames[k24];
					if (null == class94_49)
						class94_49 = Class3_Sub9.aClass94_2331;
					Node.stringStack[stringStackIndex++] = class94_49;
					continue;
				}
				if (-5012 == ~opcode) {
					int l24 = ItemPile.intStack[--intStackIndex];
					jString class94_50 = null;
					if (l24 < 100)
						class94_50 = Class163_Sub3.chatClanName[l24];
					if (class94_50 == null)
						class94_50 = Class3_Sub9.aClass94_2331;
					Node.stringStack[stringStackIndex++] = class94_50;
					continue;
				}
				if (opcode == 5012) {
					int i25 = ItemPile.intStack[--intStackIndex];
					int l55 = -1;
					if (i25 < 100)
						l55 = SceneGraphNode.anIntArray1835[i25];
					ItemPile.intStack[intStackIndex++] = l55;
					continue;
				}
				if (opcode == 5015) {
					jString class94_20;
					if (TextureLoader.selfPlayer == null || null == TextureLoader.selfPlayer.username)
						class94_20 = GroundItem.aClass94_3675;
					else
						class94_20 = TextureLoader.selfPlayer.method1980(0);
					Node.stringStack[stringStackIndex++] = class94_20;
					continue;
				}
				if (opcode == 5016) {
					ItemPile.intStack[intStackIndex++] = Class45.anInt734;
					continue;
				}
				if (opcode == 5017) {
					ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub9.anInt3114;
					continue;
				}
				if (5050 == opcode) {
					int j25 = ItemPile.intStack[--intStackIndex];
					Node.stringStack[stringStackIndex++] = Class3_Sub13_Sub35.method336(j25, (byte) -54).aClass94_3538;
					continue;
				}
				if (-5052 == ~opcode) {
					int k25 = ItemPile.intStack[--intStackIndex];
					Class3_Sub28_Sub1 class3_sub28_sub1 = Class3_Sub13_Sub35.method336(k25, (byte) -54);
					if (class3_sub28_sub1.anIntArray3534 != null)
						ItemPile.intStack[intStackIndex++] = class3_sub28_sub1.anIntArray3534.length;
					else
						ItemPile.intStack[intStackIndex++] = 0;
					continue;
				}
				if (opcode == 5052) {
					intStackIndex -= 2;
					int l25 = ItemPile.intStack[intStackIndex];
					int i56 = ItemPile.intStack[intStackIndex - -1];
					Class3_Sub28_Sub1 class3_sub28_sub1_2 = Class3_Sub13_Sub35.method336(l25, (byte) -54);
					int j77 = class3_sub28_sub1_2.anIntArray3534[i56];
					ItemPile.intStack[intStackIndex++] = j77;
					continue;
				}
				if (~opcode == -5054) {
					int i26 = ItemPile.intStack[--intStackIndex];
					Class3_Sub28_Sub1 class3_sub28_sub1_1 = Class3_Sub13_Sub35.method336(i26, (byte) -54);
					if (class3_sub28_sub1_1.anIntArray3540 != null)
						ItemPile.intStack[intStackIndex++] = class3_sub28_sub1_1.anIntArray3540.length;
					else
						ItemPile.intStack[intStackIndex++] = 0;
					continue;
				}
				if (~opcode == -5055) {
					intStackIndex -= 2;
					int j56 = ItemPile.intStack[1 + intStackIndex];
					int j26 = ItemPile.intStack[intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub35.method336(j26, (byte) -54).anIntArray3540[j56];
					continue;
				}
				if (-5056 == ~opcode) {
					int k26 = ItemPile.intStack[--intStackIndex];
					Node.stringStack[stringStackIndex++] = StringNode.method733(k26).method554(-1);
					continue;
				}
				if (-5057 == ~opcode) {
					int l26 = ItemPile.intStack[--intStackIndex];
					Class3_Sub28_Sub4 class3_sub28_sub4 = StringNode.method733(l26);
					if (null != class3_sub28_sub4.anIntArray3567)
						ItemPile.intStack[intStackIndex++] = class3_sub28_sub4.anIntArray3567.length;
					else
						ItemPile.intStack[intStackIndex++] = 0;
					continue;
				}
				if (~opcode == -5058) {
					intStackIndex -= 2;
					int k56 = ItemPile.intStack[1 + intStackIndex];
					int i27 = ItemPile.intStack[intStackIndex];
					ItemPile.intStack[intStackIndex++] = StringNode.method733(i27).anIntArray3567[k56];
					continue;
				}
				if (opcode == 5058) {
					Class70.aClass10_1056 = new Class10();
					Class70.aClass10_1056.anInt149 = ItemPile.intStack[--intStackIndex];
					Class70.aClass10_1056.aClass3_Sub28_Sub4_151 = StringNode.method733(Class70.aClass10_1056.anInt149);
					Class70.aClass10_1056.anIntArray153 = new int[Class70.aClass10_1056.aClass3_Sub28_Sub4_151.method552(true)];
					continue;
				}
				if (5059 == opcode) {
					Class3_Sub13_Sub1.outputStream.putPacket(167);
					Class3_Sub13_Sub1.outputStream.putByte(0);
					int j27 = Class3_Sub13_Sub1.outputStream.pos;
					Class3_Sub13_Sub1.outputStream.putByte(0);
					Class3_Sub13_Sub1.outputStream.putShort(Class70.aClass10_1056.anInt149);
					Class70.aClass10_1056.aClass3_Sub28_Sub4_151.method545(Class3_Sub13_Sub1.outputStream, Class70.aClass10_1056.anIntArray153, false);
					Class3_Sub13_Sub1.outputStream.putSizedByte(-j27 + Class3_Sub13_Sub1.outputStream.pos);
					continue;
				}
				if (5060 == opcode) {
					jString class94_21 = Node.stringStack[--stringStackIndex];
					Class3_Sub13_Sub1.outputStream.putPacket(178);
					Class3_Sub13_Sub1.outputStream.putByte(0);
					int l56 = Class3_Sub13_Sub1.outputStream.pos;
					Class3_Sub13_Sub1.outputStream.putLong(class94_21.toLong());
					Class3_Sub13_Sub1.outputStream.putShort(Class70.aClass10_1056.anInt149);
					Class70.aClass10_1056.aClass3_Sub28_Sub4_151.method545(Class3_Sub13_Sub1.outputStream, Class70.aClass10_1056.anIntArray153, false);
					Class3_Sub13_Sub1.outputStream.putSizedByte(Class3_Sub13_Sub1.outputStream.pos + -l56);
					continue;
				}
				if (-5062 == ~opcode) {
					Class3_Sub13_Sub1.outputStream.putPacket(167);
					Class3_Sub13_Sub1.outputStream.putByte(0);
					int k27 = Class3_Sub13_Sub1.outputStream.pos;
					Class3_Sub13_Sub1.outputStream.putByte(1);
					Class3_Sub13_Sub1.outputStream.putShort(Class70.aClass10_1056.anInt149);
					Class70.aClass10_1056.aClass3_Sub28_Sub4_151.method545(Class3_Sub13_Sub1.outputStream, Class70.aClass10_1056.anIntArray153, false);
					Class3_Sub13_Sub1.outputStream.putSizedByte(-k27 + Class3_Sub13_Sub1.outputStream.pos);
					continue;
				}
				if (-5063 == ~opcode) {
					intStackIndex -= 2;
					int i57 = ItemPile.intStack[1 + intStackIndex];
					int l27 = ItemPile.intStack[intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub35.method336(l27, (byte) -54).anIntArray3535[i57];
					continue;
				}
				if (-5064 == ~opcode) {
					intStackIndex -= 2;
					int j57 = ItemPile.intStack[intStackIndex - -1];
					int i28 = ItemPile.intStack[intStackIndex];
					ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub35.method336(i28, (byte) -54).anIntArray3533[j57];
					continue;
				}
				if (5064 == opcode) {
					intStackIndex -= 2;
					int k57 = ItemPile.intStack[1 + intStackIndex];
					int j28 = ItemPile.intStack[intStackIndex];
					if (k57 != -1)
						ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub35.method336(j28, (byte) -54).method529((byte) 50, k57);
					else
						ItemPile.intStack[intStackIndex++] = -1;
					continue;
				}
				if (opcode == 5065) {
					intStackIndex -= 2;
					int k28 = ItemPile.intStack[intStackIndex];
					int l57 = ItemPile.intStack[intStackIndex + 1];
					if (l57 != -1)
						ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub35.method336(k28, (byte) -54).method526(l57, 0);
					else
						ItemPile.intStack[intStackIndex++] = -1;
					continue;
				}
				if (-5067 == ~opcode) {
					int l28 = ItemPile.intStack[--intStackIndex];
					ItemPile.intStack[intStackIndex++] = StringNode.method733(l28).method552(true);
					continue;
				}
				if (~opcode == -5068) {
					intStackIndex -= 2;
					int i58 = ItemPile.intStack[intStackIndex + 1];
					int i29 = ItemPile.intStack[intStackIndex];
					int i70 = StringNode.method733(i29).method550(49, i58);
					ItemPile.intStack[intStackIndex++] = i70;
					continue;
				}
				if (5068 == opcode) {
					intStackIndex -= 2;
					int j29 = ItemPile.intStack[intStackIndex];
					int j58 = ItemPile.intStack[1 + intStackIndex];
					Class70.aClass10_1056.anIntArray153[j29] = j58;
					continue;
				}
				if (~opcode == -5070) {
					intStackIndex -= 2;
					int k29 = ItemPile.intStack[intStackIndex];
					int k58 = ItemPile.intStack[intStackIndex + 1];
					Class70.aClass10_1056.anIntArray153[k29] = k58;
					continue;
				}
				if (opcode == 5070) {
					intStackIndex -= 3;
					int l29 = ItemPile.intStack[intStackIndex];
					int j70 = ItemPile.intStack[intStackIndex - -2];
					int l58 = ItemPile.intStack[intStackIndex + 1];
					Class3_Sub28_Sub4 class3_sub28_sub4_1 = StringNode.method733(l29);
					if (0 != class3_sub28_sub4_1.method550(73, l58))
						throw new RuntimeException("bad command");
					ItemPile.intStack[intStackIndex++] = class3_sub28_sub4_1.method549(-117, j70, l58);
					continue;
				}
				if (opcode == 5071) {
					jString class94_22 = Node.stringStack[--stringStackIndex];
					boolean flag4 = 1 == ItemPile.intStack[--intStackIndex];
					Class3_Sub28_Sub3.method541((byte) 123, flag4, class94_22);
					ItemPile.intStack[intStackIndex++] = Class62.anInt952;
					continue;
				}
				if (5072 == opcode) {
					if (Class99.aShortArray1398 == null || ~Entity.anInt2756 <= ~Class62.anInt952)
						ItemPile.intStack[intStackIndex++] = -1;
					else
						ItemPile.intStack[intStackIndex++] = method633(Class99.aShortArray1398[Entity.anInt2756++], 65535);
					continue;
				}
				if (opcode != 5073)
					break;
				Entity.anInt2756 = 0;
				continue;
			} else if (opcode < 5200) {
				if (5100 == opcode) {
					if (!ObjectDefinition.aBooleanArray1490[86])
						ItemPile.intStack[intStackIndex++] = 0;
					else
						ItemPile.intStack[intStackIndex++] = 1;
					continue;
				}
				if (5101 == opcode) {
					if (ObjectDefinition.aBooleanArray1490[82])
						ItemPile.intStack[intStackIndex++] = 1;
					else
						ItemPile.intStack[intStackIndex++] = 0;
					continue;
				}
				if (5102 != opcode)
					break;
				if (ObjectDefinition.aBooleanArray1490[81])
					ItemPile.intStack[intStackIndex++] = 1;
				else
					ItemPile.intStack[intStackIndex++] = 0;
				continue;
			/*} else if (opcode < 5300) {
				if (-5201 == ~opcode) {
					NpcDefinition.method1479(ItemPile.intStack[--intStackIndex], (byte) 56);
					continue;
				}
				if (5201 == opcode) {
					ItemPile.intStack[intStackIndex++] = Class3_Sub28_Sub8.method571(-109);
					continue;
				}
				if (opcode == 5202) {
					Class3_Sub24_Sub4.method503((byte) -53, ItemPile.intStack[--intStackIndex]);
					continue;
				}
				if (5203 == opcode) {
					Node.method84(Node.stringStack[--stringStackIndex]);
					continue;
				}
				if (5204 == opcode) {
					Node.stringStack[stringStackIndex - 1] = GameShell.method27(Node.stringStack[stringStackIndex - 1]);
					continue;
				}
				if (5205 == opcode) {
					Class3_Sub10.method138(Node.stringStack[--stringStackIndex], 0);
					continue;
				}
				if (~opcode == -5207) {
					int i30 = ItemPile.intStack[--intStackIndex];
					Class3_Sub28_Sub3 class3_sub28_sub3_4 = Queue.method884(0x3fff & i30 >> 0x36628f6e, (byte) 111, 0x3fff & i30);
					if (class3_sub28_sub3_4 != null)
						Node.stringStack[stringStackIndex++] = class3_sub28_sub3_4.aClass94_3561;
					else
						Node.stringStack[stringStackIndex++] = Class3_Sub9.aClass94_2331;
					continue;
				}
				if (~opcode == -5208) {
					Class3_Sub28_Sub3 class3_sub28_sub3 = Class3_Sub15.method371(2, Node.stringStack[--stringStackIndex]);
					if (null != class3_sub28_sub3 && class3_sub28_sub3.aClass94_3554 != null)
						Node.stringStack[stringStackIndex++] = class3_sub28_sub3.aClass94_3554;
					else
						Node.stringStack[stringStackIndex++] = Class3_Sub9.aClass94_2331;
					continue;
				}
				if (5208 == opcode) {
					ItemPile.intStack[intStackIndex++] = Class49.anInt817;
					ItemPile.intStack[intStackIndex++] = Class17.anInt410;
					continue;
				}
				if (5209 == opcode) {
					ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub21.anInt3256 + Class3_Sub28_Sub1.anInt3536;
					ItemPile.intStack[intStackIndex++] = Class2.anInt65 + -Class3_Sub4.anInt2251 + (-1 + Class108.anInt1460);
					continue;
				}
				if (~opcode == -5211) {
					Class3_Sub28_Sub3 class3_sub28_sub3_1 = NodeSub.method520((byte) -82);
					if (class3_sub28_sub3_1 == null) {
						ItemPile.intStack[intStackIndex++] = 0;
						ItemPile.intStack[intStackIndex++] = 0;
					} else {
						ItemPile.intStack[intStackIndex++] = class3_sub28_sub3_1.anInt3558 * 64;
						ItemPile.intStack[intStackIndex++] = 64 * class3_sub28_sub3_1.anInt3556;
					}
					continue;
				}
				if (opcode == 5211) {
					Class3_Sub28_Sub3 class3_sub28_sub3_2 = NodeSub.method520((byte) -121);
					if (class3_sub28_sub3_2 != null) {
						ItemPile.intStack[intStackIndex++] = class3_sub28_sub3_2.anInt3559 - class3_sub28_sub3_2.anInt3555;
						ItemPile.intStack[intStackIndex++] = -class3_sub28_sub3_2.anInt3562 + class3_sub28_sub3_2.anInt3549;
					} else {
						ItemPile.intStack[intStackIndex++] = 0;
						ItemPile.intStack[intStackIndex++] = 0;
					}
					continue;
				}
				if (~opcode == -5213) {
					int j30 = Class67.method1258((byte) -53);
					int k70 = 0;
					jString class94_51;
					if (~j30 != 0) {
						class94_51 = Class119.aClass131_1624.aClass94Array1721[j30];
						k70 = Class119.aClass131_1624.method1791(j30, 8);
					} else {
						class94_51 = Class3_Sub9.aClass94_2331;
					}
					class94_51 = class94_51.method1560(Entity.aClass94_2765, true, Class7.aClass94_2168);
					Node.stringStack[stringStackIndex++] = class94_51;
					ItemPile.intStack[intStackIndex++] = k70;
					continue;
				}
				if (opcode == 5213) {
					int i71 = 0;
					int k30 = Class3_Sub13_Sub17.method251(-1);
					jString class94_52;
					if (0 != ~k30) {
						class94_52 = Class119.aClass131_1624.aClass94Array1721[k30];
						i71 = Class119.aClass131_1624.method1791(k30, 8);
					} else {
						class94_52 = Class3_Sub9.aClass94_2331;
					}
					class94_52 = class94_52.method1560(Entity.aClass94_2765, true, Class7.aClass94_2168);
					Node.stringStack[stringStackIndex++] = class94_52;
					ItemPile.intStack[intStackIndex++] = i71;
					continue;
				}
				if (opcode == 5214) {
					int l30 = ItemPile.intStack[--intStackIndex];
					AbstractObjectCache.method565(0x3fff & l30 >> 0xa1b3276e, 0x3fff & l30);
					continue;
				}
				if (~opcode == -5216) {
					int i31 = ItemPile.intStack[--intStackIndex];
					jString class94_53 = Node.stringStack[--stringStackIndex];
					boolean flag10 = false;
					Queue queue = AbstractIndexedSprite.method1664(0x3fff & i31 >> 0xa4e408ae, 0x3fff & i31, (byte) -118);
					Class3_Sub28_Sub3 class3_sub28_sub3_5 = (Class3_Sub28_Sub3) queue.method876();
					do {
						if (class3_sub28_sub3_5 == null)
							break;
						if (class3_sub28_sub3_5.aClass94_3561.method1531(class94_53)) {
							flag10 = true;
							break;
						}
						class3_sub28_sub3_5 = (Class3_Sub28_Sub3) queue.method878();
					} while (true);
					if (!flag10)
						ItemPile.intStack[intStackIndex++] = 0;
					else
						ItemPile.intStack[intStackIndex++] = 1;
					continue;
				}
				if (-5217 == ~opcode) {
					int j31 = ItemPile.intStack[--intStackIndex];
					Class3_Sub13_Sub36.method344(j31, 4);
					continue;
				}
				if (-5218 == ~opcode) {
					int k31 = ItemPile.intStack[--intStackIndex];
					if (!Class3_Sub10.method140(k31, 20))
						ItemPile.intStack[intStackIndex++] = 0;
					else
						ItemPile.intStack[intStackIndex++] = 1;
					continue;
				}
				if (-5219 == ~opcode) {
					Class3_Sub28_Sub3 class3_sub28_sub3_3 = NodeSub.method520((byte) -124);
					if (null != class3_sub28_sub3_3)
						ItemPile.intStack[intStackIndex++] = class3_sub28_sub3_3.anInt3563;
					else
						ItemPile.intStack[intStackIndex++] = -1;
					continue;
				}
				if (~opcode == -5220) {
					Class21.method915(Node.stringStack[--stringStackIndex], -1);
					continue;
				}
				if (-5221 != ~opcode)
					break;
				ItemPile.intStack[intStackIndex++] = ~Class140_Sub3.anInt2737 != -101 ? 0 : 1;
				continue;*/
			} else if (opcode < 5400) {
				if (opcode == 5300) {
					intStackIndex -= 2;
					int i59 = ItemPile.intStack[1 + intStackIndex];
					int l31 = ItemPile.intStack[intStackIndex];
					SceneGraphNode.method1862(false, 3, l31, i59);
					ItemPile.intStack[intStackIndex++] = null != Class3_Sub13_Sub10.fullscreenFrame ? 1 : 0;
					continue;
				}
				if (-5302 == ~opcode) {
					if (null != Class3_Sub13_Sub10.fullscreenFrame)
						SceneGraphNode.method1862(false, NodeSub.anInt2577, -1, -1);
					continue;
				}
				if (5302 == opcode) {
					DisplayModeInformation aclass106[] = Node.method88((byte) 28);
					ItemPile.intStack[intStackIndex++] = aclass106.length;
					continue;
				}
				if (5303 == opcode) {
					int i32 = ItemPile.intStack[--intStackIndex];
					DisplayModeInformation aclass106_1[] = Node.method88((byte) 28);
					ItemPile.intStack[intStackIndex++] = aclass106_1[i32].width;
					ItemPile.intStack[intStackIndex++] = aclass106_1[i32].height;
					continue;
				}
				if (~opcode == -5306) {
					int j59 = Class3_Sub13_Sub5.fullscreenFrameHeight;
					int j32 = Class3_Sub13.fullscreenFrameWidth;
					int j71 = -1;
					DisplayModeInformation aclass106_2[] = Node.method88((byte) 28);
					int i80 = 0;
					do {
						if (aclass106_2.length <= i80)
							break;
						DisplayModeInformation displayModeInformation = aclass106_2[i80];
						if (j32 == displayModeInformation.width && displayModeInformation.height == j59) {
							j71 = i80;
							break;
						}
						i80++;
					} while (true);
					ItemPile.intStack[intStackIndex++] = j71;
					continue;
				}
				if (opcode == 5306) {
					ItemPile.intStack[intStackIndex++] = Class83.getDisplayMode();
					continue;
				}
				if (opcode == 5307) {
					int k32 = ItemPile.intStack[--intStackIndex];
					if (-1 < ~k32 || -3 > ~k32)
						k32 = 0;
					SceneGraphNode.method1862(false, k32, -1, -1);
					continue;
				}
				if (5308 == opcode) {
					ItemPile.intStack[intStackIndex++] = NodeSub.anInt2577;
					continue;
				}
				if (5309 != opcode)
					break;
				int l32 = ItemPile.intStack[--intStackIndex];
				if (~l32 > -1 || -3 > ~l32)
					l32 = 0;
				NodeSub.anInt2577 = l32;
				Class119.writePreferences(Class38.gameSignlink);
				continue;
			} else if (opcode < 5500) {
				if (-5401 == ~opcode) {
					stringStackIndex -= 2;
					jString class94_23 = Node.stringStack[stringStackIndex];
					jString class94_54 = Node.stringStack[stringStackIndex - -1];
					int k71 = ItemPile.intStack[--intStackIndex];
					Class3_Sub13_Sub1.outputStream.putPacket(117);
					Class3_Sub13_Sub1.outputStream.putByte(Class3_Sub13_Sub33.method326((byte) 39, class94_23) - (-Class3_Sub13_Sub33.method326((byte) 102, class94_54) + -1));
					Class3_Sub13_Sub1.outputStream.putString(class94_23);
					Class3_Sub13_Sub1.outputStream.putString(class94_54);
					Class3_Sub13_Sub1.outputStream.putByte(k71);
					continue;
				}
				if (opcode == 5401) {
					intStackIndex -= 2;
					Class3_Sub13_Sub38.aShortArray3455[ItemPile.intStack[intStackIndex]] = (short) Class56.method1186(0, ItemPile.intStack[intStackIndex + 1]);
					GameShell.method28();
					Buffer.method746((byte) -29);
					Class167.method2265(0);
					Class44_Sub1.method1076();
					Class47.method1093();
					continue;
				}
				if (~opcode == -5406) {
					intStackIndex -= 2;
					int i33 = ItemPile.intStack[intStackIndex];
					int k59 = ItemPile.intStack[1 + intStackIndex];
					if (i33 >= 0 && -3 < ~i33)
						Class58.anIntArrayArrayArray911[i33] = new int[k59 << 0x27e6541][4];
					continue;
				}
				if (~opcode == -5407) {
					intStackIndex -= 7;
					int j33 = ItemPile.intStack[intStackIndex];
					int l59 = ItemPile.intStack[1 + intStackIndex] << 0xee994ea1;
					int k77 = ItemPile.intStack[intStackIndex - -3];
					int l71 = ItemPile.intStack[2 + intStackIndex];
					int j80 = ItemPile.intStack[4 + intStackIndex];
					int j82 = ItemPile.intStack[6 + intStackIndex];
					int l81 = ItemPile.intStack[5 + intStackIndex];
					if (~j33 <= -1 && ~j33 > -3 && null != Class58.anIntArrayArrayArray911[j33] && ~l59 <= -1 && Class58.anIntArrayArrayArray911[j33].length > l59) {
						Class58.anIntArrayArrayArray911[j33][l59] = (new int[] { (method633(0xfffc3b9, l71) >> 0x5f43122e) * 128, k77, 128 * method633(l71, 16383), j82 });
						Class58.anIntArrayArrayArray911[j33][l59 + 1] = (new int[] { 128 * (method633(j80, 0xfffed27) >> 0xe3e5364e), l81, 128 * method633(j80, 16383) });
					}
					continue;
				}
				if (~opcode == -5408) {
					int k33 = Class58.anIntArrayArrayArray911[ItemPile.intStack[--intStackIndex]].length >> 0x2b932e01;
					ItemPile.intStack[intStackIndex++] = k33;
					continue;
				}
				/*if (-5412 == ~opcode) {
					if (Class3_Sub13_Sub10.aFrame3121 != null)
						SceneGraphNode.method1862(false, NodeSub.anInt2577, -1, -1);
					if (null == Class3_Sub13_Sub7.aFrame3092)
						Class99.method1596(jInterface.method856(), false);
					else
						System.exit(0);
					continue;
				}*/
				if (opcode == 5419) {
					jString class94_24 = Class3_Sub9.aClass94_2331;
					if (null != Class136.aClass64_1778) {
						class94_24 = Class108.method1653(Class136.aClass64_1778.integerData, 0);
						if (Class136.aClass64_1778.value != null) {
							byte abyte0[] = null;
							try {
								abyte0 = ((String) Class136.aClass64_1778.value).getBytes("ISO-8859-1");
							} catch (UnsupportedEncodingException e) {
								e.printStackTrace();
							}
							class94_24 = Class3_Sub13_Sub3.bufferToString(abyte0, 0, abyte0.length);
						}
					}
					Node.stringStack[stringStackIndex++] = class94_24;
					continue;
				}
				if (-5421 == ~opcode) {
					ItemPile.intStack[intStackIndex++] = Signlink.anInt1214 != 3 ? 0 : 1;
					continue;
				}
				/*if (opcode == 5421) {
					if (null != Class3_Sub13_Sub10.aFrame3121)
						SceneGraphNode.method1862(false, NodeSub.anInt2577, -1, -1);
					boolean flag5 = 1 == ItemPile.intStack[--intStackIndex];
					jString class94_25 = Node.stringStack[--stringStackIndex];
					jString class94_64 = client.method903(new jString[] { jInterface.method856(), class94_25 }, (byte) -71);
					if (null == Class3_Sub13_Sub7.aFrame3092 && (!flag5 || -4 == ~Signlink.anInt1214 || !Signlink.osName.startsWith("win") || Class106.aBoolean1451)) {
						Class99.method1596(class94_64, flag5);
					} else {
						jString.aBoolean2154 = flag5;
						Class3_Sub13_Sub24.aClass94_3295 = class94_64;
						try {
							Class15.aClass64_351 = Class38.gameSignlink.method1452(new String(class94_64.method1568(0), "ISO-8859-1"), true);
						} catch (UnsupportedEncodingException e) {
							e.printStackTrace();
						}
					}
					continue;
				}*/
				if (5422 == opcode) {
					int i72 = ItemPile.intStack[--intStackIndex];
					stringStackIndex -= 2;
					jString class94_55 = Node.stringStack[1 + stringStackIndex];
					jString class94_26 = Node.stringStack[stringStackIndex];
					if (-1 > ~class94_26.getLength()) {
						if (null == PacketBuffer.aClass94Array3802)
							PacketBuffer.aClass94Array3802 = new jString[Class3_Sub13_Sub18.anIntArray3218[0]];
						PacketBuffer.aClass94Array3802[i72] = class94_26;
					}
					if (~class94_55.getLength() < -1) {
						if (OutputStream_Sub1.aClass94Array45 == null)
							OutputStream_Sub1.aClass94Array45 = new jString[Class3_Sub13_Sub18.anIntArray3218[0]];
						OutputStream_Sub1.aClass94Array45[i72] = class94_55;
					}
					continue;
				}
				if (-5424 == ~opcode) {
					Node.stringStack[--stringStackIndex].method1549();
					continue;
				}
				if (5424 == opcode) {
					intStackIndex -= 11;
					InterfaceChangeNode.anInt3600 = ItemPile.intStack[intStackIndex];
					Class62.anInt963 = ItemPile.intStack[intStackIndex - -1];
					MouseHandler.anInt1926 = ItemPile.intStack[intStackIndex + 2];
					Class136.anInt1771 = ItemPile.intStack[3 + intStackIndex];
					Class26.anInt502 = ItemPile.intStack[4 + intStackIndex];
					Class99.anInt1400 = ItemPile.intStack[5 + intStackIndex];
					Class46.anInt739 = ItemPile.intStack[6 + intStackIndex];
					VarBit.anInt1126 = ItemPile.intStack[7 + intStackIndex];
					ItemPile.anInt2937 = ItemPile.intStack[8 + intStackIndex];
					Class3_Sub13_Sub28.anInt3351 = ItemPile.intStack[intStackIndex + 9];
					Class154.anInt1957 = ItemPile.intStack[10 + intStackIndex];
					Class140_Sub6.cacheIndex8.method2144(Class26.anInt502);
					Class140_Sub6.cacheIndex8.method2144(Class99.anInt1400);
					Class140_Sub6.cacheIndex8.method2144(Class46.anInt739);
					Class140_Sub6.cacheIndex8.method2144(VarBit.anInt1126);
					Class140_Sub6.cacheIndex8.method2144(ItemPile.anInt2937);
					js5.aBoolean1951 = true;
					continue;
				}
				if (~opcode == -5426) {
					Class3_Sub13.method165(-7878);
					js5.aBoolean1951 = false;
					continue;
				}
				if (-5427 == ~opcode) {
					Class161.anInt2027 = ItemPile.intStack[--intStackIndex];
					continue;
				}
				if (-5428 != ~opcode)
					break;
				intStackIndex -= 2;
				Class99.anInt1403 = ItemPile.intStack[intStackIndex];
				Class131.anInt1719 = ItemPile.intStack[intStackIndex + 1];
				continue;
			} else if (opcode < 5600) {
				if (5500 == opcode) {
					intStackIndex -= 4;
					int l33 = ItemPile.intStack[intStackIndex];
					int l77 = ItemPile.intStack[intStackIndex - -3];
					int j72 = ItemPile.intStack[intStackIndex - -2];
					int i60 = ItemPile.intStack[intStackIndex + 1];
					Class3_Sub20.method390(false, j72, i60, l77, (byte) -128, -Class82.anInt1152 + (0x3fff & l33), ((0xffffe30 & l33) >> 0x372f8c2e) - Class131.anInt1716);
					continue;
				}
				if (opcode == 5501) {
					intStackIndex -= 4;
					int j60 = ItemPile.intStack[1 + intStackIndex];
					int i34 = ItemPile.intStack[intStackIndex];
					int i78 = ItemPile.intStack[intStackIndex - -3];
					int k72 = ItemPile.intStack[intStackIndex + 2];
					Class164_Sub1.method2238(j60, (0x3fff & i34) - Class82.anInt1152, k72, -Class131.anInt1716 + ((0xffff221 & i34) >> 0xcd90732e), (byte) -21, i78);
					continue;
				}
				if (~opcode == -5503) {
					intStackIndex -= 6;
					int j34 = ItemPile.intStack[intStackIndex];
					if (~j34 <= -3)
						throw new RuntimeException();
					NpcDefinition.anInt1252 = j34;
					int k60 = ItemPile.intStack[intStackIndex - -1];
					if (~(Class58.anIntArrayArrayArray911[NpcDefinition.anInt1252].length >> 0x84afc601) >= ~(1 + k60))
						throw new RuntimeException();
					Class65943149.anInt1081 = k60;
					Class163_Sub2_Sub1.anInt4020 = 0;
					Class134.anInt1759 = ItemPile.intStack[intStackIndex + 2];
					Class3_Sub13.anInt2383 = ItemPile.intStack[intStackIndex + 3];
					int l72 = ItemPile.intStack[intStackIndex + 4];
					if (2 <= l72)
						throw new RuntimeException();
					LongNode.anInt2293 = l72;
					int j78 = ItemPile.intStack[5 + intStackIndex];
					if (Class58.anIntArrayArrayArray911[LongNode.anInt2293].length >> 0x4d73ee21 <= 1 + j78)
						throw new RuntimeException();
					Class39.anInt670 = j78;
					GrandExchangeItem.anInt1753 = 3;
					continue;
				}
				if (-5504 == ~opcode) {
					AnimationLoader.method560(-21556);
					continue;
				}
				if (5504 == opcode) {
					intStackIndex -= 2;
					Class3_Sub9.anInt2309 = ItemPile.intStack[intStackIndex];
					SpotAnimation.cameraYaw = ItemPile.intStack[intStackIndex + 1];
					if (GrandExchangeItem.anInt1753 == 2) {
						Class3_Sub13_Sub25.renderYaw = SpotAnimation.cameraYaw;
						Class139.renderPitch = Class3_Sub9.anInt2309;
					}
					Class47.method1098((byte) -74);
					continue;
				}
				if (opcode == 5505) {
					ItemPile.intStack[intStackIndex++] = Class3_Sub9.anInt2309;
					continue;
				}
				if (5506 != opcode)
					break;
				ItemPile.intStack[intStackIndex++] = SpotAnimation.cameraYaw;
				continue;
			} else if (opcode < 5700) {
				if (opcode == 5600) {
					stringStackIndex -= 2;
					jString class94_27 = Node.stringStack[stringStackIndex];
					jString class94_56 = Node.stringStack[stringStackIndex + 1];
					int k73 = ItemPile.intStack[--intStackIndex];
					if (-11 == ~Class143.gameState && ~Class3_Sub13_Sub31.anInt3375 == -1 && -1 == ~Class3_Sub13_Sub25.loginStage && ~Canvas_Sub1.anInt23 == -1 && -1 == ~Light.anInt692) {
						Class131.method1793(class94_27, class94_56, k73, (byte) -38);
					}
					continue;
				}
				if (-5602 == ~opcode) {
					Class110.method1681(-1);
					continue;
				}
				if (-5603 == ~opcode) {
					if (0 == Class3_Sub13_Sub25.loginStage)
						AbstractGraphicsBuffer.returnCode = -2;
					continue;
				}
				if (opcode == 5603) {
					intStackIndex -= 4;
					if (Class143.gameState == 10 && 0 == Class3_Sub13_Sub31.anInt3375 && -1 == ~Class3_Sub13_Sub25.loginStage && -1 == ~Canvas_Sub1.anInt23 && ~Light.anInt692 == -1)
						InterfaceListener.method377(ItemPile.intStack[intStackIndex - -2], ItemPile.intStack[intStackIndex + 3], ItemPile.intStack[intStackIndex], ItemPile.intStack[intStackIndex + 1], 1);
					continue;
				}
				if (~opcode == -5605) {
					stringStackIndex--;
					if (~Class143.gameState == -11 && Class3_Sub13_Sub31.anInt3375 == 0 && ~Class3_Sub13_Sub25.loginStage == -1 && -1 == ~Canvas_Sub1.anInt23 && ~Light.anInt692 == -1)
						Class40.method1041(Node.stringStack[stringStackIndex].toLong(), -28236);
					continue;
				}
				if (opcode == 5605) {
					intStackIndex -= 4;
					stringStackIndex -= 2;
					if (~Class143.gameState == -11 && 0 == Class3_Sub13_Sub31.anInt3375 && ~Class3_Sub13_Sub25.loginStage == -1 && Canvas_Sub1.anInt23 == 0 && Light.anInt692 == 0)
						InterfaceChangeNode.a(ItemPile.intStack[intStackIndex], 10603, ItemPile.intStack[intStackIndex - -3], ItemPile.intStack[1 + intStackIndex], Node.stringStack[1 + stringStackIndex], Node.stringStack[stringStackIndex].toLong(), ItemPile.intStack[2 + intStackIndex]);
					continue;
				}
				if (opcode == 5606) {
					if (Canvas_Sub1.anInt23 == 0)
						Hashtable.anInt1711 = -2;
					continue;
				}
				if (opcode == 5607) {
					ItemPile.intStack[intStackIndex++] = AbstractGraphicsBuffer.returnCode;
					continue;
				}
				if (opcode == 5608) {
					ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub34.anInt3413;
					continue;
				}
				if (5609 == opcode) {
					ItemPile.intStack[intStackIndex++] = Hashtable.anInt1711;
					continue;
				}
				if (opcode == 5610) {
					for (int l37 = 0; l37 < 5; l37++)
						Node.stringStack[stringStackIndex++] = Class3_Sub13_Sub33.aClass94Array3391.length <= l37 ? Class3_Sub9.aClass94_2331 : Class3_Sub13_Sub33.aClass94Array3391[l37].upperCase();

					Class3_Sub13_Sub33.aClass94Array3391 = null;
					continue;
				}
				if (opcode != 5611)
					break;
				ItemPile.intStack[intStackIndex++] = Class3_Sub26.anInt2561;
				continue;
			} else if (opcode < 6100) {
				if (opcode == 6001) {
					int k34 = ItemPile.intStack[--intStackIndex];
					if (-2 < ~k34)
						k34 = 1;
					if (-5 > ~k34)
						k34 = 4;
					Class3_Sub28_Sub10.brightness = k34;
					if (!HDToolkit.openGLEnabled || !DisplayModeInformation.aBoolean1441) {
						if (~Class3_Sub28_Sub10.brightness == -2)
							Rasterizer.method1137(0.9F);
						if (Class3_Sub28_Sub10.brightness == 2)
							Rasterizer.method1137(0.8F);
						if (3 == Class3_Sub28_Sub10.brightness)
							Rasterizer.method1137(0.7F);
						if (-5 == ~Class3_Sub28_Sub10.brightness)
							Rasterizer.method1137(0.6F);
					}
					if (HDToolkit.openGLEnabled) {
						Class3_Sub13_Sub14.method236((byte) 64);
						if (!DisplayModeInformation.aBoolean1441)
							Class84.method1417();
					}
					Buffer.method746((byte) -29);
					Class119.writePreferences(Class38.gameSignlink);
					Class140_Sub2.aBoolean2705 = false;
					continue;
				}
				if (opcode == 6002) {
					Class25.method957(96, 1 == ItemPile.intStack[--intStackIndex]);
					Class3_Sub10.method139(66);
					Class84.method1417();
					Buffer.method792(0x8c1111);
					Class119.writePreferences(Class38.gameSignlink);
					Class140_Sub2.aBoolean2705 = false;
					continue;
				}
				if (~opcode == -6004) {
					AbstractObjectCache.removeRoofs = ~ItemPile.intStack[--intStackIndex] == -2;
					Buffer.method792(0x8c1111);
					Class119.writePreferences(Class38.gameSignlink);
					Class140_Sub2.aBoolean2705 = false;
					continue;
				}
				if (~opcode == -6006) {
					KeyboardHandler.showGroundDecorations = -2 == ~ItemPile.intStack[--intStackIndex];
					Class84.method1417();
					Class119.writePreferences(Class38.gameSignlink);
					Class140_Sub2.aBoolean2705 = false;
					continue;
				}
				if (-6007 == ~opcode) {
					Class25.lowMemoryTextures = ItemPile.intStack[--intStackIndex] == 1;
					((TextureLoader) Rasterizer.anInterface2_838).method1616(!Class25.lowMemoryTextures, -17830);
					Class119.writePreferences(Class38.gameSignlink);
					Class140_Sub2.aBoolean2705 = false;
					continue;
				}
				if (-6008 == ~opcode) {
					jInterface.manyIdleAnimations = -2 == ~ItemPile.intStack[--intStackIndex];
					Class119.writePreferences(Class38.gameSignlink);
					Class140_Sub2.aBoolean2705 = false;
					continue;
				}
				if (~opcode == -6009) {
					Class44_Sub1.highDetailLights = ItemPile.intStack[--intStackIndex] == 1;
					Class119.writePreferences(Class38.gameSignlink);
					Class140_Sub2.aBoolean2705 = false;
					continue;
				}
				if (~opcode == -6010) {
					Class3_Sub13_Sub22.aBoolean3275 = -2 == ~ItemPile.intStack[--intStackIndex];
					Class119.writePreferences(Class38.gameSignlink);
					Class140_Sub2.aBoolean2705 = false;
					continue;
				}
				if (opcode == 6010) {
					Class140_Sub6.aBoolean2910 = 1 == ItemPile.intStack[--intStackIndex];
					Class119.writePreferences(Class38.gameSignlink);
					Class140_Sub2.aBoolean2705 = false;
					continue;
				}
				if (-6012 == ~opcode) {
					int l34 = ItemPile.intStack[--intStackIndex];
					if (-1 < ~l34 || l34 > 2)
						l34 = 0;
					Class80.anInt1137 = l34;
					Class119.writePreferences(Class38.gameSignlink);
					Class140_Sub2.aBoolean2705 = false;
					continue;
				}
				if (6012 == opcode) {
					if (HDToolkit.openGLEnabled)
						Class3_Sub28_Sub4.method551(0, 0);
					DisplayModeInformation.aBoolean1441 = -2 == ~ItemPile.intStack[--intStackIndex];
					if (HDToolkit.openGLEnabled && DisplayModeInformation.aBoolean1441) {
						Rasterizer.method1137(0.7F);
					} else {
						if (Class3_Sub28_Sub10.brightness == 1)
							Rasterizer.method1137(0.9F);
						if (-3 == ~Class3_Sub28_Sub10.brightness)
							Rasterizer.method1137(0.8F);
						if (Class3_Sub28_Sub10.brightness == 3)
							Rasterizer.method1137(0.7F);
						if (Class3_Sub28_Sub10.brightness == 4)
							Rasterizer.method1137(0.6F);
					}
					Class84.method1417();
					Class119.writePreferences(Class38.gameSignlink);
					Class140_Sub2.aBoolean2705 = false;
					continue;
				}
				if (-6015 == ~opcode) {
					Class128.aBoolean1685 = ItemPile.intStack[--intStackIndex] == 1;
					if (HDToolkit.openGLEnabled)
						Class84.method1417();
					Class119.writePreferences(Class38.gameSignlink);
					Class140_Sub2.aBoolean2705 = false;
					continue;
				}
				if (~opcode == -6016) {
					Class38.aBoolean661 = -2 == ~ItemPile.intStack[--intStackIndex];
					if (HDToolkit.openGLEnabled)
						Class3_Sub13_Sub14.method236((byte) 64);
					Class119.writePreferences(Class38.gameSignlink);
					Class140_Sub2.aBoolean2705 = false;
					continue;
				}
				if (6016 == opcode) {
					int i35 = ItemPile.intStack[--intStackIndex];
					if (HDToolkit.openGLEnabled)
						AnimationLoader.canvasReplaceRecommended = true;
					if (0 > i35 || -3 > ~i35)
						i35 = 0;
					GroundItem.antiAliasing = i35;
					continue;
				}
				if (-6018 == ~opcode) {
					Class3_Sub13_Sub15.isStereo = -2 == ~ItemPile.intStack[--intStackIndex];
					GameShell.method34();
					Class119.writePreferences(Class38.gameSignlink);
					Class140_Sub2.aBoolean2705 = false;
					continue;
				}
				if (~opcode == -6019) {
					int j35 = ItemPile.intStack[--intStackIndex];
					if (j35 < 0)
						j35 = 0;
					if (-128 > ~j35)
						j35 = 127;
					InterfaceListener.soundEffectsVolume = j35;
					Class119.writePreferences(Class38.gameSignlink);
					Class140_Sub2.aBoolean2705 = false;
					continue;
				}
				if (opcode == 6019) {
					int k35 = ItemPile.intStack[--intStackIndex];
					if (k35 < 0)
						k35 = 0;
					if (-256 > ~k35)
						k35 = 255;
					if (~k35 != ~Class9.musicVolume) {
						if (-1 == ~Class9.musicVolume && 0 != ~AbstractTimer.anInt1691) {
							Class70.method1285(Class75_Sub2.cacheIndex6, false, AbstractTimer.anInt1691, 0, false, k35);
							Class83.aBoolean1158 = false;
						} else if (-1 == ~k35) {
							SceneGraphNode.method1870(false);
							Class83.aBoolean1158 = false;
						} else {
							StringNode.method736(k35);
						}
						Class9.musicVolume = k35;
					}
					Class119.writePreferences(Class38.gameSignlink);
					Class140_Sub2.aBoolean2705 = false;
					continue;
				}
				if (-6021 == ~opcode) {
					int l35 = ItemPile.intStack[--intStackIndex];
					if (-1 < ~l35)
						l35 = 0;
					if (127 < l35)
						l35 = 127;
					Class14.areaSoundsVolume = l35;
					Class119.writePreferences(Class38.gameSignlink);
					Class140_Sub2.aBoolean2705 = false;
					continue;
				}
				if (opcode == 6021) {
					Class65943149.aBoolean1084 = ~ItemPile.intStack[--intStackIndex] == -2;
					Buffer.method792(0x8c1111);
					continue;
				}
				if (~opcode == -6024) {
					int i36 = ItemPile.intStack[--intStackIndex];
					if (0 > i36)
						i36 = 0;
					if (~i36 < -3)
						i36 = 2;
					boolean flag6 = false;
					if (96 > Class3_Sub24_Sub3.maxMemory) {
						flag6 = true;
						i36 = 0;
					}
					ParticleEngine.method1758(i36);
					Class119.writePreferences(Class38.gameSignlink);
					Class140_Sub2.aBoolean2705 = false;
					ItemPile.intStack[intStackIndex++] = flag6 ? 0 : 1;
					continue;
				}
				if (-6025 == ~opcode) {
					int j36 = ItemPile.intStack[--intStackIndex];
					if (j36 < 0 || 2 < j36)
						j36 = 0;
					Class3_Sub28_Sub9.anInt3622 = j36;
					Class119.writePreferences(Class38.gameSignlink);
					continue;
				}
				if (~opcode != -6029)
					break;
				Class163_Sub3.aBoolean3004 = ~ItemPile.intStack[--intStackIndex] != -1;
				Class119.writePreferences(Class38.gameSignlink);
				continue;
			} else if (opcode < 6200) {
				//System.out.println("setting = " + opcode);// TODO
				if (opcode == 6101) {
					ItemPile.intStack[intStackIndex++] = Class3_Sub28_Sub10.brightness;
					continue;
				}
				if (opcode == 6102) {
					// visible levels
					ItemPile.intStack[intStackIndex++] = Npc.visibleLevels() ? 1 : 0;
					continue;
				}
				if (6103 == opcode) {
					// remove roofs
					ItemPile.intStack[intStackIndex++] = AbstractObjectCache.removeRoofs ? 1 : 0;
					continue;
				}
				if (6105 == opcode) {
					ItemPile.intStack[intStackIndex++] = KeyboardHandler.showGroundDecorations ? 1 : 0;
					continue;
				}
				if (6106 == opcode) {
					ItemPile.intStack[intStackIndex++] = Class25.lowMemoryTextures ? 1 : 0;
					continue;
				}
				if (6107 == opcode) {
					ItemPile.intStack[intStackIndex++] = jInterface.manyIdleAnimations ? 1 : 0;
					continue;
				}
				if (opcode == 6108) {
					ItemPile.intStack[intStackIndex++] = Class44_Sub1.highDetailLights ? 1 : 0;
					continue;
				}
				if (6109 == opcode) {
					ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub22.aBoolean3275 ? 1 : 0;
					continue;
				}
				if (6110 == opcode) {
					ItemPile.intStack[intStackIndex++] = Class140_Sub6.aBoolean2910 ? 1 : 0;
					continue;
				}
				if (opcode == 6111) {
					ItemPile.intStack[intStackIndex++] = Class80.anInt1137;
					continue;
				}
				if (6112 == opcode) {
					ItemPile.intStack[intStackIndex++] = DisplayModeInformation.aBoolean1441 ? 1 : 0;
					continue;
				}
				if (6114 == opcode) {
					ItemPile.intStack[intStackIndex++] = Class128.aBoolean1685 ? 1 : 0;
					continue;
				}
				if (opcode == 6115) {
					ItemPile.intStack[intStackIndex++] = Class38.aBoolean661 ? 1 : 0;
					continue;
				}
				if (opcode == 6116) {
					ItemPile.intStack[intStackIndex++] = GroundItem.antiAliasing;
					continue;
				}
				if (6117 == opcode) {
					// isStereo
					ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub15.isStereo ? 1 : 0;
					continue;
				}
				if (opcode == 6118) {
					ItemPile.intStack[intStackIndex++] = InterfaceListener.soundEffectsVolume;
					continue;
				}
				if (6119 == opcode) {
					ItemPile.intStack[intStackIndex++] = Class9.musicVolume;
					continue;
				}
				if (6120 == opcode) {
					ItemPile.intStack[intStackIndex++] = Class14.areaSoundsVolume;
					continue;
				}
				if (6121 == opcode) {
					if (HDToolkit.openGLEnabled)
						ItemPile.intStack[intStackIndex++] = HDToolkit.aBoolean1809 ? 1 : 0;
					else
						ItemPile.intStack[intStackIndex++] = 0;
					continue;
				}
				if (opcode == 6123) {
					ItemPile.intStack[intStackIndex++] = ParticleEngine.method1757();
					continue;
				}
				if (6124 == opcode) {
					ItemPile.intStack[intStackIndex++] = Class3_Sub28_Sub9.anInt3622;
					continue;
				}
				if (opcode != 6128)
					break;
				ItemPile.intStack[intStackIndex++] = Class163_Sub3.aBoolean3004 ? 1 : 0;
				continue;
			} else if (opcode < 6300) {
				if (opcode == 6200) {
					intStackIndex -= 2;
					DisplayModeInformation.aShort1444 = (short) ItemPile.intStack[intStackIndex];
					if (0 >= DisplayModeInformation.aShort1444)
						DisplayModeInformation.aShort1444 = 256;
					Class3_Sub13_Sub3.aShort3052 = (short) ItemPile.intStack[1 + intStackIndex];
					if (~Class3_Sub13_Sub3.aShort3052 >= -1)
						Class3_Sub13_Sub3.aShort3052 = 205;
					continue;
				}
				if (-6202 == ~opcode) {
					intStackIndex -= 2;
					OutputStream_Sub1.aShort46 = (short) ItemPile.intStack[intStackIndex];
					if (~OutputStream_Sub1.aShort46 >= -1)
						OutputStream_Sub1.aShort46 = 256;
					ObjectDefinition.aShort1535 = (short) ItemPile.intStack[1 + intStackIndex];
					if (ObjectDefinition.aShort1535 <= 0)
						ObjectDefinition.aShort1535 = 320;
					continue;
				}
				if (-6203 == ~opcode) {
					intStackIndex -= 4;
					Class3_Sub13_Sub19.aShort3241 = (short) ItemPile.intStack[intStackIndex];
					if (~Class3_Sub13_Sub19.aShort3241 >= -1)
						Class3_Sub13_Sub19.aShort3241 = 1;
					PacketParser.aShort83 = (short) ItemPile.intStack[1 + intStackIndex];
					if (PacketParser.aShort83 > 0) {
						if (Class3_Sub13_Sub19.aShort3241 > PacketParser.aShort83)
							PacketParser.aShort83 = Class3_Sub13_Sub19.aShort3241;
					} else {
						PacketParser.aShort83 = 32767;
					}
					Class26.aShort505 = (short) ItemPile.intStack[2 + intStackIndex];
					if (-1 <= ~Class26.aShort505)
						Class26.aShort505 = 1;
					Class3_Sub13_Sub23_Sub1.aShort4038 = (short) ItemPile.intStack[intStackIndex - -3];
					if (Class3_Sub13_Sub23_Sub1.aShort4038 > 0) {
						if (~Class3_Sub13_Sub23_Sub1.aShort4038 > ~Class26.aShort505)
							Class3_Sub13_Sub23_Sub1.aShort4038 = Class26.aShort505;
					} else {
						Class3_Sub13_Sub23_Sub1.aShort4038 = 32767;
					}
					continue;
				}
				if (~opcode == -6204) {
					Class65.method1239(UnderlayType.aClass11_2091.anInt168, 81, 0, UnderlayType.aClass11_2091.anInt193, 0, false);
					ItemPile.intStack[intStackIndex++] = HintIcon.anInt1358;
					ItemPile.intStack[intStackIndex++] = Canvas_Sub2.anInt31;
					continue;
				}
				if (6204 == opcode) {
					ItemPile.intStack[intStackIndex++] = OutputStream_Sub1.aShort46;
					ItemPile.intStack[intStackIndex++] = ObjectDefinition.aShort1535;
					continue;
				}
				if (opcode != 6205)
					break;
				ItemPile.intStack[intStackIndex++] = DisplayModeInformation.aShort1444;
				ItemPile.intStack[intStackIndex++] = Class3_Sub13_Sub3.aShort3052;
				continue;
			} else if (opcode < 6400) {
				if (~opcode == -6301) {
					ItemPile.intStack[intStackIndex++] = (int) (TimeUtil.currentTimeMillis() / 60000L);
					continue;
				}
				if (-6302 == ~opcode) {
					ItemPile.intStack[intStackIndex++] = -11745 + (int) (TimeUtil.currentTimeMillis() / 0x5265c00L);
					continue;
				}
				if (opcode == 6302) {
					intStackIndex -= 3;
					int i73 = ItemPile.intStack[intStackIndex + 2];
					int l60 = ItemPile.intStack[intStackIndex - -1];
					int k36 = ItemPile.intStack[intStackIndex];
					Class3_Sub28_Sub9.aCalendar3616.clear();
					Class3_Sub28_Sub9.aCalendar3616.set(11, 12);
					Class3_Sub28_Sub9.aCalendar3616.set(i73, l60, k36);
					ItemPile.intStack[intStackIndex++] = -11745 + (int) (Class3_Sub28_Sub9.aCalendar3616.getTime().getTime() / 0x5265c00L);
					continue;
				}
				if (6303 == opcode) {
					Class3_Sub28_Sub9.aCalendar3616.clear();
					Class3_Sub28_Sub9.aCalendar3616.setTime(new Date(TimeUtil.currentTimeMillis()));
					ItemPile.intStack[intStackIndex++] = Class3_Sub28_Sub9.aCalendar3616.get(1);
					continue;
				}
				if (~opcode != -6305)
					break;
				boolean flag7 = true;
				int l36 = ItemPile.intStack[--intStackIndex];
				if (-1 >= ~l36) {
					if (l36 >= 1582) {
						if (~(l36 % 4) == -1) {
							if (-1 != ~(l36 % 100))
								flag7 = true;
							else if (0 != l36 % 400)
								flag7 = false;
						} else {
							flag7 = false;
						}
					} else {
						flag7 = l36 % 4 == 0;
					}
				} else {
					flag7 = ~((1 + l36) % 4) == -1;
				}
				ItemPile.intStack[intStackIndex++] = flag7 ? 1 : 0;
				continue;
			/*} else if (opcode < 6500) {
				if (6405 == opcode) {
					ItemPile.intStack[intStackIndex++] = Class47.method1088() ? 1 : 0;
					continue;
				}//advertisements
				if (~opcode != -6407)
					break;
				ItemPile.intStack[intStackIndex++] = Class159.method2194() ? 1 : 0;
				continue;*/
			} else if (opcode < 6600) {
				/*if (opcode == 6500) {
					if (-11 != ~Class143.gameState || ~Class3_Sub13_Sub31.anInt3375 != -1 || 0 != Class3_Sub13_Sub25.loginStage || 0 != Canvas_Sub1.anInt23)
						ItemPile.intStack[intStackIndex++] = 1;
					else
						ItemPile.intStack[intStackIndex++] = ~Class121.method1735() == 0 ? 0 : 1;
					continue;
				}*/
				if (-6502 == ~opcode) {
					Class44_Sub1 class44_sub1 = Class140_Sub2.method1953((byte) 124);
					if (class44_sub1 == null) {
						ItemPile.intStack[intStackIndex++] = -1;
						ItemPile.intStack[intStackIndex++] = 0;
						Node.stringStack[stringStackIndex++] = Class3_Sub9.aClass94_2331;
						ItemPile.intStack[intStackIndex++] = 0;
						Node.stringStack[stringStackIndex++] = Class3_Sub9.aClass94_2331;
						ItemPile.intStack[intStackIndex++] = 0;
					} else {
						ItemPile.intStack[intStackIndex++] = class44_sub1.anInt2621;
						ItemPile.intStack[intStackIndex++] = class44_sub1.anInt724;
						Node.stringStack[stringStackIndex++] = class44_sub1.aClass94_2620;
						Class26 class26 = class44_sub1.method1078(60);
						ItemPile.intStack[intStackIndex++] = class26.anInt507;
						Node.stringStack[stringStackIndex++] = class26.aClass94_508;
						ItemPile.intStack[intStackIndex++] = class44_sub1.anInt722;
					}
					continue;
				}
				if (~opcode == -6503) {
					Class44_Sub1 class44_sub1_1 = ItemDefinition.method1107(5422);
					if (null == class44_sub1_1) {
						ItemPile.intStack[intStackIndex++] = -1;
						ItemPile.intStack[intStackIndex++] = 0;
						Node.stringStack[stringStackIndex++] = Class3_Sub9.aClass94_2331;
						ItemPile.intStack[intStackIndex++] = 0;
						Node.stringStack[stringStackIndex++] = Class3_Sub9.aClass94_2331;
						ItemPile.intStack[intStackIndex++] = 0;
					} else {
						ItemPile.intStack[intStackIndex++] = class44_sub1_1.anInt2621;
						ItemPile.intStack[intStackIndex++] = class44_sub1_1.anInt724;
						Node.stringStack[stringStackIndex++] = class44_sub1_1.aClass94_2620;
						Class26 class26_1 = class44_sub1_1.method1078(70);
						ItemPile.intStack[intStackIndex++] = class26_1.anInt507;
						Node.stringStack[stringStackIndex++] = class26_1.aClass94_508;
						ItemPile.intStack[intStackIndex++] = class44_sub1_1.anInt722;
					}
					continue;
				}
				if (-6504 == ~opcode) {
					int i37 = ItemPile.intStack[--intStackIndex];
					if (~Class143.gameState != -11 || -1 != ~Class3_Sub13_Sub31.anInt3375 || Class3_Sub13_Sub25.loginStage != 0 || -1 != ~Canvas_Sub1.anInt23)
						ItemPile.intStack[intStackIndex++] = 0;
					else
						ItemPile.intStack[intStackIndex++] = Class104.method1627(i37, (byte) -7) ? 1 : 0;
					continue;
				}
				if (opcode == 6504) {
					jString.anInt2148 = ItemPile.intStack[--intStackIndex];
					Class119.writePreferences(Class38.gameSignlink);
					continue;
				}
				if (6505 == opcode) {
					ItemPile.intStack[intStackIndex++] = jString.anInt2148;
					continue;
				}
				if (~opcode == -6507) {
					int j37 = ItemPile.intStack[--intStackIndex];
					Class44_Sub1 class44_sub1_2 = Class3_Sub8.method130(120, j37);
					if (class44_sub1_2 != null) {
						ItemPile.intStack[intStackIndex++] = class44_sub1_2.anInt724;
						Node.stringStack[stringStackIndex++] = class44_sub1_2.aClass94_2620;
						Class26 class26_2 = class44_sub1_2.method1078(-87);
						ItemPile.intStack[intStackIndex++] = class26_2.anInt507;
						Node.stringStack[stringStackIndex++] = class26_2.aClass94_508;
						ItemPile.intStack[intStackIndex++] = class44_sub1_2.anInt722;
					} else {
						ItemPile.intStack[intStackIndex++] = -1;
						Node.stringStack[stringStackIndex++] = Class3_Sub9.aClass94_2331;
						ItemPile.intStack[intStackIndex++] = 0;
						Node.stringStack[stringStackIndex++] = Class3_Sub9.aClass94_2331;
						ItemPile.intStack[intStackIndex++] = 0;
					}
					continue;
				}
				if (~opcode != -6508)
					break;
				intStackIndex -= 4;
				int j73 = ItemPile.intStack[intStackIndex + 2];
				int k37 = ItemPile.intStack[intStackIndex];
				boolean flag11 = ~ItemPile.intStack[intStackIndex - -3] == -2;
				boolean flag8 = ItemPile.intStack[1 + intStackIndex] == 1;
				Class134.method1808(j73, flag8, (byte) 30, k37, flag11);
				continue;
			} else if (opcode < 6700) {
				if (6600 == opcode) {
					Class15.aBoolean346 = ItemPile.intStack[--intStackIndex] == 1;
					Class119.writePreferences(Class38.gameSignlink);
					continue;
				}
				if (opcode != 6601)
					break;
				ItemPile.intStack[intStackIndex++] = Class15.aBoolean346 ? 1 : 0;
				continue;
			} else {
				break;
			}
		} while(true);
		throw new IllegalStateException("s="+scriptId);
	}

}
