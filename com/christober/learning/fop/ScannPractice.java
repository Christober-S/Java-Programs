import java.util.Scanner;

public class ScannPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte by;
        short sh;
        int i;
        long l;
        float f;
        double d;
        char c;
        boolean b;

        System.out.println("Enter a byte: ");
        by = sc.nextByte();
        System.out.println("Enter a short: ");
        sh = sc.nextShort();
        System.out.println("Enter a int: ");
        i = sc.nextInt();
        System.out.println("Enter a long: ");
        l = sc.nextLong();
        System.out.println("Enter a float: ");
        f = sc.nextFloat();
        System.out.println("Enter a double: ");
        d = sc.nextDouble();
        System.out.println("Enter a char: ");
        c = sc.next().charAt(0);
        System.out.println("Enter a boolean: ");
        b = sc.nextBoolean();
        System.out.println("The entered byte value is "+by);
        System.out.println("The entered short value is " + sh);
        System.out.println("The entered int value is " + i);
        System.out.println("The entered long value is " + l);
        System.out.println("The entered float value is " + f);
        System.out.println("The entered double value is " + d);
        System.out.println("The entered char value is " + c);
        System.out.println("The entered boolean value is " + b);

    }
}
