import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

final class jSocket implements Runnable {

   private int tnum = 0;
   private OutputStream outputStream;
   private InputStream inputStream;
   private byte[] buffer;
   static int anInt1234;
   private Socket socket;
   private int tcycle = 0;
   private SignlinkNode socketThread;
   static Class33 aClass33_1238;
   private Signlink signlink;
   private boolean closed = false;
   static Deque aClass61_1242 = new Deque();
   private boolean IOError = false;
   static int anInt1244 = -1;

	public final void run() {
		try {
			for(;;) {
				int off;
				int len;
				synchronized (this) {
					if (tcycle == tnum) {
						if (closed) {
							break;
						}
						try {
							this.wait();
						} catch (InterruptedException var9) {
							
						}
					}

					off = tcycle;
					if (tnum >= tcycle) {
						len = tnum - tcycle;
					} else {
						len = 5000 - tcycle;
					}
				}

				if(len > 0) {
					try {
						outputStream.write(buffer, off, len);
					} catch (IOException var8) {
						IOError = true;
					}
	
					tcycle = (len + tcycle) % 5000;
	
					try {
						if (tcycle == tnum) {
							outputStream.flush();
						}
					} catch (IOException var7) {
						IOError = true;
					}
				}
			}

			try {
				if (null != inputStream) {
					inputStream.close();
				}

				if (null != outputStream) {
					outputStream.close();
				}

				if (socket != null) {
					socket.close();
				}
			} catch (IOException var6) {
				;
			}

			buffer = null;
		} catch (Exception var11) {
			Class49.method1125((String) null, var11);
		}
	}

   static final void method1460(int var0, int var1, byte var2, int var3, int var4, int var5, int var6) {
      try {
         if(~(var5 - var4) <= ~Class101.anInt1425 && Class3_Sub28_Sub18.anInt3765 >= var5 - -var4 && Class159.anInt2020 <= -var4 + var1 && Class57.anInt902 >= var4 + var1) {
            Class3_Sub13_Sub2.method175(var6, var0, var1, true, var3, var4, var5);
         } else {
            UnderlayType.method2275(var3, (byte)109, var1, var4, var6, var0, var5);
         }

         if(var2 > -107) {
            anInt1244 = 89;
         }

      } catch (RuntimeException var8) {
         throw Class44.method1067(var8, "ma.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

	final void read(byte[] buf, int off, int len) throws IOException {
		if (!closed) {
			while (len > 0) {
				int avail = inputStream.read(buf, off, len);
				if (avail <= 0)
					throw new EOFException();
				len -= avail;
				off += avail;
			}
		}
	}

   final int read() throws IOException {
	   return !closed?inputStream.read():0;
   }

   public static void method1463(int var0) {
         aClass61_1242 = null;
         aClass33_1238 = null;
   }

	final void write(byte[] buf, int off, int len) throws IOException {
		if (!closed) {
			if (IOError) {
				IOError = false;
				throw new IOException();
			}
			if (buffer == null) {
				buffer = new byte[5000];
			}

			synchronized (this) {
				for (int id = 0; id < len; ++id) {
					buffer[tnum] = buf[off + id];
					tnum = (tnum + 1) % 5000;
					if (tnum == (tcycle + 4900) % 5000)
						throw new IOException();
				}

				if (null == socketThread) {
					socketThread = signlink.startThread(this, 3);
				}

				this.notifyAll();
			}
		}
	}

	protected final void finalize() {
		close();
	}

	final int available() throws IOException {
		return closed ? 0 : inputStream.available();
	}

	final void checkIOError() throws IOException {
		if (!closed) {
			if (IOError) {
				IOError = false;
				throw new IOException();
			}
		}
	}

	final void close() {
		if (!closed) {
			synchronized (this) {
				closed = true;
				notifyAll();
			}

			if (socketThread != null) {
				while (socketThread.status == 0) {
					Class3_Sub13_Sub34.sleep(1L);
				}

				if (-2 == ~socketThread.status) {
					try {
						((Thread) socketThread.value).join();
					} catch (InterruptedException var4) {
						;
					}
				}
			}

			socketThread = null;
		}
	}

   static final void pushMinimapPixels(int[] pixels, int pixel, int step, int z, int x, int y) {
      GroundTile groundTile = Class75_Sub2.groundTiles[z][x][y];
      if(groundTile != null) {
         PlainTile tile1 = groundTile.plainTile;
         if(tile1 != null) {
            int color = tile1.minimapColor;
            if(color != 0) {
               for(int loops = 0; loops < 4; ++loops) {
                  pixels[pixel] = color;
                  pixels[pixel + 1] = color;
                  pixels[pixel + 2] = color;
                  pixels[pixel + 3] = color;
                  pixel += step;
               }

            }
         } else {
            ShapedTile tile2 = groundTile.shapedTile;
            if(tile2 != null) {
               int var9 = tile2.shape;
               int var10 = tile2.rotation;
               int var11 = tile2.overlayMinimapColor;
               int var12 = tile2.underlayMinimapColor;
               int[] var13 = Class3_Sub13_Sub18.anIntArrayArray3215[var9];
               int[] var14 = Class162.anIntArrayArray2039[var10];
               int var15 = 0;
               if(var11 != 0) {
                  for(int var16 = 0; var16 < 4; ++var16) {
                     pixels[pixel] = var13[var14[var15++]] == 0?var11:var12;
                     pixels[pixel + 1] = var13[var14[var15++]] == 0?var11:var12;
                     pixels[pixel + 2] = var13[var14[var15++]] == 0?var11:var12;
                     pixels[pixel + 3] = var13[var14[var15++]] == 0?var11:var12;
                     pixel += step;
                  }
               } else {
                  for(int var16 = 0; var16 < 4; ++var16) {
                     if(var13[var14[var15++]] != 0) {
                        pixels[pixel] = var12;
                     }

                     if(var13[var14[var15++]] != 0) {
                        pixels[pixel + 1] = var12;
                     }

                     if(var13[var14[var15++]] != 0) {
                        pixels[pixel + 2] = var12;
                     }

                     if(var13[var14[var15++]] != 0) {
                        pixels[pixel + 3] = var12;
                     }

                     pixel += step;
                  }
               }

            }
         }
      }
   }

	jSocket(java.net.Socket s, Signlink sl) throws IOException {
		signlink = sl;
		socket = s;
		socket.setSoTimeout(30000);
		socket.setTcpNoDelay(true);
		inputStream = socket.getInputStream();
		outputStream = socket.getOutputStream();
	}

   static final void method1470(int var0, AnimationDefinition var1, int var2, int var3, boolean var4, int var5) {
      try {
         if(-51 < ~Class113.anInt1552) {
            if(var1.anIntArrayArray1867 != null && ~var5 > ~var1.anIntArrayArray1867.length && null != var1.anIntArrayArray1867[var5]) {
               int var6 = var1.anIntArrayArray1867[var5][0];
               int var7 = var6 >> 8;
               int var10;
               if(1 < var1.anIntArrayArray1867[var5].length) {
                  var10 = (int)((double)var1.anIntArrayArray1867[var5].length * Math.random());
                  if(0 < var10) {
                     var7 = var1.anIntArrayArray1867[var5][var10];
                  }
               }

               int var8 = var6 >> 5 & 7;
               int var9 = var6 & 31;
               if(~var9 != -1) {
                  if(0 != Class14.areaSoundsVolume) {
                     InventoryNode.anIntArray2550[Class113.anInt1552] = var7;
                     Class166.anIntArray2068[Class113.anInt1552] = var8;
                     int var11 = (-64 + var0) / 128;
                     var10 = (var3 + -64) / 128;
                     jString.anIntArray2157[Class113.anInt1552] = 0;
                     TextureLoader.aClass135Array2131[Class113.anInt1552] = null;
                     Class3_Sub13_Sub6.anIntArray3083[Class113.anInt1552] = var9 + (var10 << 16) + (var11 << 8);
                     if(var2 != 183921384) {
                        aClass33_1238 = (Class33)null;
                     }

                     ++Class113.anInt1552;
                  }
               } else {
                  if(var4) {
                     Class3_Sub13_Sub6.method199(var8, var7, 0, -799);
                  }

               }
            }
         }
      } catch (RuntimeException var12) {
         throw Class44.method1067(var12, "ma.C(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

}
