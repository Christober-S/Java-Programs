import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your mark out of 100");
        int mark = input.nextInt();
        int grade = mark/10;
        switch (grade){
            case 9:
                System.out.println("Distinction");
                break;
            case 8:
                System.out.println("First Cls");
                break;
            case 7:
                System.out.println("Second Cls");
                break;
            case 6:
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
