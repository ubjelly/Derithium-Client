import java.awt.Component;

final class Hashtable {

   Node[] table;
   //static jString aClass94_1698 = jString.createJString("(R");
   static jString aClass94_1699 = jString.createJString(" )2> <col=ff9040>");
   int count;
   static boolean[] interfaceLoaded;
   static int anInt1704 = 0;
   static int anInt1705 = 0;
   private Node next;
   
   private long hash;
   static int anInt1709 = 0;
   static jString aClass94_1707 = jString.createJString("Loaded sprites");;
   static int anInt1711 = -2;
   static boolean[] aBooleanArray1712 = new boolean[100];
   private Node lastIterated;
   static jString aClass94_1714 = jString.createJString("<col=ff7000>");
   private int current = 0;


   static final void method1772(int var0, int var1, int var2, Npc var3) {
      try {
         if(var3.currentAnimationId == var1 && -1 != var1) {
            AnimationDefinition var4 = AnimationDefinition.list(var1, false);
            int var5 = var4.anInt1845;
            if(var5 == 1) {
               var3.anInt2776 = 1;
               var3.anInt2832 = 0;
               var3.anInt2760 = 0;
               var3.anInt2773 = 0;
               var3.animationDelay = var0;
               jSocket.method1470(var3.anInt2829, var4, 183921384, var3.anInt2819, false, var3.anInt2832);
            }

            if(-3 == ~var5) {
               var3.anInt2773 = 0;
            }
         } else if(~var1 == 0 || -1 == var3.currentAnimationId || AnimationDefinition.list(var1, false).anInt1857 >= AnimationDefinition.list(var3.currentAnimationId, false).anInt1857) {
            var3.anInt2760 = 0;
            var3.currentAnimationId = var1;
            var3.anInt2776 = 1;
            var3.anInt2773 = 0;
            var3.animationDelay = var0;
            var3.anInt2811 = var3.walkQueueLocationIndex;
            var3.anInt2832 = 0;
            if(var3.currentAnimationId != -1) {
               jSocket.method1470(var3.anInt2829, AnimationDefinition.list(var3.currentAnimationId, false), var2 + 183921345, var3.anInt2819, false, var3.anInt2832);
            }
         }

         if(var2 != 39) {
            anInt1711 = 41;
         }

      } catch (RuntimeException var6) {
         throw Class44.method1067(var6, "sc.J(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

	final void clear() {
		int var2 = 0;

		while (var2 < this.count) {
			Node var3 = this.table[var2];

			while (true) {
				Node var4 = var3.next;
				if (var3 == var4) {
					++var2;
					break;
				}

				var4.unlink();
			}
		}

		this.lastIterated = null;
		this.next = null;
	}

   public static void method1774(int var0) {
      try {
         //aClass94_1698 = null;
         aClass94_1707 = null;
         aBooleanArray1712 = null;
         interfaceLoaded = null;
         aClass94_1699 = null;
         aClass94_1714 = null;
         if(var0 <= 96) {
            method1783((Component)null);
         }

      } catch (RuntimeException var2) {
         throw Class44.method1067(var2, "sc.H(" + var0 + ')');
      }
   }

   static final void method1775() {
      for(int var0 = 0; var0 < Class3_Sub13_Sub5.anInt3070; ++var0) {
         Class25 var1 = AnimationDefinition.aClass25Array1868[var0];
         AbstractGraphicsBuffer.method2186(var1);
         AnimationDefinition.aClass25Array1868[var0] = null;
      }

      Class3_Sub13_Sub5.anInt3070 = 0;
   }

	final Node getFirst() {
		this.current = 0;
		return this.getNext();
	}

   static final Class3_Sub13 method1777(int var0, boolean var1) {
      try {
         if(-1 == ~var0) {
            return new Class3_Sub13_Sub22();
         } else if(-2 != ~var0) {
            if(2 != var0) {
               if(~var0 == -4) {
                  return new Class3_Sub13_Sub29();
               } else if(var0 != 4) {
                  if(var0 == 5) {
                     return new Class3_Sub13_Sub24();
                  } else if(var0 == 6) {
                     return new Class3_Sub13_Sub2();
                  } else if(var0 != 7) {
                     if(var0 != 8) {
                        if(9 != var0) {
                           if(10 == var0) {
                              return new Class3_Sub13_Sub37();
                           } else if(var0 != 11) {
                              if(-13 == ~var0) {
                                 return new Class3_Sub13_Sub1();
                              } else if(-14 != ~var0) {
                                 if(14 == var0) {
                                    return new Class3_Sub13_Sub32();
                                 } else if(~var0 != -16) {
                                    if(var0 == 16) {
                                       return new Class3_Sub13_Sub9();
                                    } else if(17 != var0) {
                                       if(~var0 == -19) {
                                          return new Class3_Sub13_Sub23_Sub1();
                                       } else if(-20 == ~var0) {
                                          return new Class3_Sub13_Sub18();
                                       } else if(~var0 == -21) {
                                          return new Class3_Sub13_Sub13();
                                       } else if(21 == var0) {
                                          return new Class3_Sub13_Sub5();
                                       } else if(22 != var0) {
                                          if(~var0 != -24) {
                                             if(24 != var0) {
                                                if(var0 != 25) {
                                                   if(~var0 != -27) {
                                                      if(27 != var0) {
                                                         if(-29 == ~var0) {
                                                            return new Class3_Sub13_Sub25();
                                                         } else if(-30 != ~var0) {
                                                            if(var0 != 30) {
                                                               if(31 != var0) {
                                                                  if(32 != var0) {
                                                                     if(33 == var0) {
                                                                        return new Class3_Sub13_Sub3();
                                                                     } else if(-35 == ~var0) {
                                                                        return new Class3_Sub13_Sub4();
                                                                     } else if(var0 == 35) {
                                                                        return new Class3_Sub13_Sub26();
                                                                     } else if(~var0 != -37) {
                                                                        if(var0 == 37) {
                                                                           return new Class3_Sub13_Sub21();
                                                                        } else if(38 != var0) {
                                                                           if(39 == var0) {
                                                                              return new Class3_Sub13_Sub23();
                                                                           } else {
                                                                              if(!var1) {
                                                                                 method1772(8, 6, 81, (Npc)null);
                                                                              }

                                                                              return null;
                                                                           }
                                                                        } else {
                                                                           return new Class3_Sub13_Sub38();
                                                                        }
                                                                     } else {
                                                                        return new Class3_Sub13_Sub36();
                                                                     }
                                                                  } else {
                                                                     return new Class3_Sub13_Sub28();
                                                                  }
                                                               } else {
                                                                  return new Class3_Sub13_Sub14();
                                                               }
                                                            } else {
                                                               return new Class3_Sub13_Sub10();
                                                            }
                                                         } else {
                                                            return new Class3_Sub13_Sub33();
                                                         }
                                                      } else {
                                                         return new Class3_Sub13_Sub7();
                                                      }
                                                   } else {
                                                      return new Class3_Sub13_Sub6();
                                                   }
                                                } else {
                                                   return new Class3_Sub13_Sub34();
                                                }
                                             } else {
                                                return new Class3_Sub13_Sub12();
                                             }
                                          } else {
                                             return new Class3_Sub13_Sub17();
                                          }
                                       } else {
                                          return new Class3_Sub13_Sub35();
                                       }
                                    } else {
                                       return new Class3_Sub13_Sub15();
                                    }
                                 } else {
                                    return new Class3_Sub13_Sub16();
                                 }
                              } else {
                                 return new Class3_Sub13_Sub30();
                              }
                           } else {
                              return new Class3_Sub13_Sub20();
                           }
                        } else {
                           return new Class3_Sub13_Sub8();
                        }
                     } else {
                        return new Class3_Sub13_Sub39();
                     }
                  } else {
                     return new Class3_Sub13_Sub27();
                  }
               } else {
                  return new Class3_Sub13_Sub19();
               }
            } else {
               return new Class3_Sub13_Sub31();
            }
         } else {
            return new Class3_Sub13_Sub11();
         }
      } catch (RuntimeException var3) {
         throw Class44.method1067(var3, "sc.I(" + var0 + ',' + var1 + ')');
      }
   }

	final Node getNext() {
		Node var2;
		if (-1 > ~this.current && this.lastIterated != this.table[this.current - 1]) {
			var2 = this.lastIterated;
			this.lastIterated = var2.next;
			return var2;
		} else {
			do {
				if (~this.current <= ~this.count) {
					return null;
				}

				var2 = this.table[this.current++].next;
			} while (this.table[this.current + -1] == var2);

			this.lastIterated = var2.next;
			return var2;
		}
	}

	final void put(Node var2, long var3) {
		if (null != var2.previous) {
			var2.unlink();
		}

		Node var5 = this.table[(int) (var3 & (long) (this.count - 1))];
		var2.next = var5;
		var2.hash = var3;
		var2.previous = var5.previous;
		var2.previous.next = var2;
		var2.next.previous = var2;
	}

	Hashtable(int var1) {
		this.table = new Node[var1];
		this.count = var1;

		for (int var2 = 0; var2 < var1; ++var2) {
			Node var3 = this.table[var2] = new Node();
			var3.previous = var3;
			var3.next = var3;
		}
	}

	final Node get(long var1) {
		this.hash = var1;
		Node var4 = this.table[(int) (var1 & (long) (-1 + this.count))];

		for (this.next = var4.next; var4 != this.next; this.next = this.next.next) {
			if (~var1 == ~this.next.hash) {
				Node var5 = this.next;
				this.next = this.next.next;
				return var5;
			}
		}

		this.next = null;
		return null;
	}

	final int method1781() {
		int var3 = 0;

		for (int var4 = 0; var4 < this.count; ++var4) {
			Node var5 = this.table[var4];

			for (Node var6 = var5.next; var6 != var5; ++var3) {
				var6 = var6.next;
			}
		}

		return var3;
	}

	final int method1782(Node[] var1) {
		int var3 = 0;

		for (int var4 = 0; var4 < this.count; ++var4) {
			Node var5 = this.table[var4];

			for (Node var6 = var5.next; var6 != var5; var6 = var6.next) {
				var1[var3++] = var6;
			}
		}

		return var3;
	}

   static final void method1783(Component var1) {
	   var1.removeMouseListener(RawObjectCache.mouseHandler);
	   var1.removeMouseMotionListener(RawObjectCache.mouseHandler);
	   var1.removeFocusListener(RawObjectCache.mouseHandler);
	   SpotAnimation.anInt549 = 0;
   }

	final Node method1784() {
		if (null != this.next) {
			Node var2 = this.table[(int) (this.hash & (long) (-1 + this.count))];

			while (var2 != this.next) {
				if (this.next.hash == this.hash) {
					Node var3 = this.next;
					this.next = this.next.next;
					return var3;
				}

				this.next = this.next.next;
			}

			this.next = null;
			return null;
		} else {
			return null;
		}
	}

   final int method1785() {
	   return this.count;
   }

}
