/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class UpdateServerThread implements Runnable {
    
	public final void run() {
		try {
			for (;;) {
				UpdateServerNode class3_sub10;
				synchronized (client.updateServerList) {
					class3_sub10 = (UpdateServerNode) client.updateServerList.getFirst();
				}
				if (class3_sub10 == null) {
					Class3_Sub13_Sub34.sleep(100L);
					synchronized (client.anObject821) {
						if (client.anInt1465 <= 1) {
							client.anInt1465 = 0;
							client.anObject821.notifyAll();
						} else {
							client.anInt1465--;
							continue;
						}
						break;
					}
				}
				do {
					if (class3_sub10.anInt1246 != 0) {
						if (class3_sub10.anInt1246 != 1)
							break;
						class3_sub10.buffer = class3_sub10.fileSystem.get((int) class3_sub10.hash);
						synchronized (client.updateServerList) {
							client.aClass60_2164.insertBack(class3_sub10);
							break;
						}
					}
					class3_sub10.fileSystem.method1050((int)class3_sub10.hash, class3_sub10.buffer.length, class3_sub10.buffer);
					synchronized (client.updateServerList) {
						class3_sub10.unlink();
					}
				} while (false);
				synchronized (client.anObject821) {
					if (client.anInt1465 <= 1) {
						client.anInt1465 = 0;
						client.anObject821.notifyAll();
						break;
					}
					client.anInt1465 = 600;
				}
			}
		} catch (Exception exception) {
		}
    }
}
