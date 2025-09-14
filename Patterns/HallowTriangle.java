package Patterns;

public class HallowTriangle {
    public static void main(String[] args) {
        int a = 5, b = 5;
        for (int r = 1; r <=9 ; r++) {
            for (int c = 1; c <=9 ; c++) {
                if ( c == a || c == b){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            if (r<5){
                a++;b--;
            }
            else {
                a--;b++;
            }
        }
    }
}
