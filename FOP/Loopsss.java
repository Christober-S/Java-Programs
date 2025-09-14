public class Loopsss {
    public static void main(String[] args) {
        int n = 143;
        int ans = 0;
        do {
            int rem = n % 10;
            ans = ans + rem;
            n = n / 10;
        } while (n != 0);
        System.out.println(ans);
}
}
