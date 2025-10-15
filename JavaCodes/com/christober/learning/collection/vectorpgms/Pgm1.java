package christober.learning.collection.vectorpgms;
import java.util.Vector;

public class Pgm1 {
    static void main() {
        Vector<Integer> vec = new Vector<>();
        vec.addElement(1);
        vec.addElement(2);
        vec.addElement(3);
        vec.addElement(2);
        vec.addElement(4);
        vec.addElement(1);
        System.out.println("Original Vector: " + vec);
        // Remove duplicates using a temporary buffer (aux vector)
        Vector<Integer> newVec = new Vector<>();
        for (Integer i : vec) {
            if (!newVec.contains(i)) {
                newVec.add(i);
            }
        }
        System.out.println(vec.capacity());
    }
}
