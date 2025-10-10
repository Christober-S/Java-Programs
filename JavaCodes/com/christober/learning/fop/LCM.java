import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        int max = 0;
        if (a > b){
            max = a;
        }
        else {
            max = b;
        }
        for (int i = max; i >= 1; i--) {
            if (max % a == 0 && max % b == 0){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
