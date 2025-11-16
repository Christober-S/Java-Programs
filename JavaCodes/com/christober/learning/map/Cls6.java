package christober.learning.map;

public class Cls6 {
    //merge two maps, if keys are same , sum their values
    static void main() {
        java.util.HashMap<Integer, Integer> map1 = new java.util.HashMap<>();
        map1.put(1, 10);
        map1.put(2, 20);
        map1.put(3, 30);

        java.util.HashMap<Integer, Integer> map2 = new java.util.HashMap<>();
        map2.put(2, 200);
        map2.put(3, 300);
        map2.put(4, 400);

        for (java.util.Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            map1.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        System.out.println(map1);
    }
}
