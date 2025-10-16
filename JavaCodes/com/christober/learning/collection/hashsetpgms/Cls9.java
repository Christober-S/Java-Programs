package christober.learning.collection.hashsetpgms;

public class Cls9 {
    //Create hashset to store  interger. add numer 10 to 50 (muliplse of 10). remove one number and print remaing elements
    static void main() {
        java.util.HashSet<Integer> numbers = new java.util.HashSet<>();
        for (int i = 10; i <= 50; i += 10) {
            numbers.add(i);
        }
        System.out.println("Original HashSet: " + numbers);
        numbers.remove(30);
        System.out.println("HashSet after removing 30: " + numbers);
    }
}
