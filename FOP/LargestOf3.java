public class LargestOf3 {
    public static void main(String[] args) {
        int a = 304, b = 40, c = 30;

        if (a > b && a > c) {
            System.out.println("a is greatest: " + a);
        } else {
            if (b > c) {
                System.out.println("b is greatest: " + b);
            } else {
                System.out.println("c is greatest: " + c);
            }
        }
    }
}
