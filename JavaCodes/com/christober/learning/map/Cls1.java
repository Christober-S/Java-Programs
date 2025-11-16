package christober.learning.map;

import java.util.HashMap;

public class Cls1 {
    static void main() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        map.put(4,4);
        map.put(5,5);
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.remove(2));
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue(3));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
    }
}
