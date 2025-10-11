package christober.learning.collection;
import java.util.*;
public class ZRemovalInString {
    static void main() {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Bazana");
        list.add("Cherry");
        list.add("Daze");
        list.add("Elderberry");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).contains("z") || list.get(i).contains("Z")){
                list.remove(i);
                i--; // Adjust index after removal
            }
        }
        System.out.println("After removing elements containing 'z' or 'Z':");
        System.out.println(list);
        System.out.println("Another way using removeIf():");
        list.add("Bazana");
        list.add("Daze");
        list.removeIf(s -> s.contains("z") || s.contains("Z"));
        System.out.println(list);
        System.out.println("Using Sub String:");
        list.add("Bazana");
        list.add("Daze");
        list.removeIf(s -> {
            String sub = s.toLowerCase();
            return sub.indexOf('z') != -1;
        });
        System.out.println(list);
    }
}
