public class Practice {
    public static void main(String[] args) {
        int a = 19;
        int b = -4;

        int c = add(a, b);
        System.out.println(c);

        for (int i = 1; i <= b; i++) {
            a++;
        }
    }
    public static int add(int a, int b) {
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                a++;
            }
        } else {
            for (int i = 0; i > b; i--) {
                a--;
            }
        }
        return a;
    }

}
