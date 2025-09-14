import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String month = input.next();

        switch (month) {
            case "Jan", "Mar", "May", "Jul", "Aug", "Oct",  "Dec":
                System.out.println(31);
                break;
            case "Feb":
        }
    }
}
