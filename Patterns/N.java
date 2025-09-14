package Patterns;

public class N {
    public static void main(String[] args) {
        int str = 9, spc = 0;
        for (int r = 1; r <=5 ; r++) {
            for (int i = 1; i<=spc; i++)
                System.out.print("  ");
            for (int j = 1; j<=str; j++)
                System.out.print(" * ");
            System.out.println();
            str -=2;
            spc ++;
        }

    }
}
