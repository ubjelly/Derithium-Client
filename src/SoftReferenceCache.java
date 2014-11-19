import java.lang.ref.SoftReference;

final class SoftReferenceCache extends AbstractObjectCache {

   private SoftReference softReference;

   final Object get() {
      return this.softReference.get();
   }

   final boolean isSoftReference() {
      return true;
   }

   SoftReferenceCache(Object var1) {
      this.softReference = new SoftReference(var1);
   }
}
