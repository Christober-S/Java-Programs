package ArraysClass;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class ZeroBasedIndexingDemo {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};

        // --- Conceptual "address" math (pretend base=1000) ---
        int pretendBase = 1000;
        int elemSize = Integer.BYTES; // 4
        System.out.println("Conceptual offsets from base (bytes):");
        for (int i = 0; i < a.length; i++) {
            int byteOffset = i * elemSize; // 0, 4, 8, 12, ...
            System.out.printf("a[%d] = %d  at base + %d  (pretend address %d)%n",
                    i, a[i], byteOffset, pretendBase + byteOffset);
        }

        // --- Real contiguous behavior via ByteBuffer/IntBuffer ---
        // Allocate 5 ints worth of bytes, then view as an IntBuffer.
        ByteBuffer bytes = ByteBuffer.allocate(a.length * Integer.BYTES);
        IntBuffer ints = bytes.asIntBuffer();
        ints.put(a);

        System.out.println("\nByteBuffer view (index -> byte index -> value):");
        for (int i = 0; i < a.length; i++) {
            int posInBytes = i * Integer.BYTES;     // i * 4
            int valueViaBytes = bytes.getInt(posInBytes);
            System.out.printf("i=%d  -> byteIndex=%d -> %d%n", i, posInBytes, valueViaBytes);
        }

        // --- Loop ergonomics: [0, n) ---
        System.out.println("\nLoop over [0, n):");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("i=%d value=%d%n", i, a[i]);
        }
    }
}
