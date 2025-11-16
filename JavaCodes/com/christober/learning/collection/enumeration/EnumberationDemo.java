package christober.learning.collection.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumberationDemo {
    static void main() {
        Vector v = new Vector();
        for (int i = 0; i < 10; i++) {
            v.addElement(i);
        }
        System.out.println();
        Enumeration enumeration  = v.elements();
        while (enumeration.hasMoreElements()){
            Integer i = (Integer) enumeration.nextElement();
            if(i%2 ==0){
                System.out.print(i+" ");
            }
        }
    }
}
