package Patterns;

public class E {
    public static void main(String[] args) {
        int value = 1;
        int n = 5;
        for (int i = 1; i <=n ; i++) {
            value = i % 2 == 0 ? 0 : 1;
            for (int j = 1; j <=i ; j++) {
                System.out.print(value+" ");
                value = value == 1 ? 0 : 1;
            }
            System.out.println();
        }
    }
}
