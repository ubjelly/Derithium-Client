import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class FileOnDisk {

   private File file;
   private RandomAccessFile randomAccessFile;

   public final void seek(long var2) throws IOException {
      randomAccessFile.seek(var2);
   }

   protected void finalize() throws Throwable {
      if(randomAccessFile != null) {
         System.out.println("Warning! fileondisk " + file + " not closed correctly using close(). Auto-closing instead. ");
         close();
      }
   }

   public final void write(byte[] var2, int var4, int var3) throws IOException {
	   randomAccessFile.write(var2, var4, var3);
   }

   public final int read(byte[] buf, int off, int len) throws IOException {
      return randomAccessFile.read(buf, off, len);
   }

   public final void close() throws IOException {
      if(randomAccessFile != null) {
         randomAccessFile.close();
         randomAccessFile = null;
      }
   }

   public final long getLength() {
		try {
			return randomAccessFile.length();
		} catch (IOException e) {
			return 0;
		}
	}

   public final File getFile() {
      return file;
   }

   public FileOnDisk(File var1, String var2) throws IOException {
      randomAccessFile = new RandomAccessFile(var1, var2);
      file = var1;
      int var5 = randomAccessFile.read();
      if(~var5 != 0 && !var2.equals("r")) {
         randomAccessFile.seek(0L);
         randomAccessFile.write(var5);
      }

      randomAccessFile.seek(0L);
   }
}
