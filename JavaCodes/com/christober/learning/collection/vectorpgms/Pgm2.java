package christober.learning.collection.vectorpgms;

import java.util.Arrays;
import java.util.Vector;

public class Pgm2 {
    static void main() {
        Vector<Integer> vector = new Vector<>(Arrays.asList(1, 2, 3, 2, 4, 1));
        System.out.println("Original Vector: " + vector);
        System.out.println(vector.capacity());
    }
}
