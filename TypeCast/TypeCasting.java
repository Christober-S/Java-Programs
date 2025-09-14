package TypeCast;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char upper = sc.next().charAt(0);
        char lower = sc.next().charAt(0);

//        int lowercalc = upper + 32 ;
//        int uppercal = lower - 32 ;
//
//        char resultLower = (char)lowercalc;
//        char resultUpper = (char)uppercal;
        char resultLower = (char)(upper + 32);
        char resultUpper = (char)(lower - 32);
        System.out.println(upper+" "+resultLower);
        System.out.println(lower+" "+resultUpper);
    }
}
