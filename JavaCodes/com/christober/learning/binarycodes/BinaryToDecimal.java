package christober.learning.binarycodes;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input binary number as a string
        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();
        int decimal = 0;  // result
        int power = 0;    // position index from right to left
        // Loop from last digit to first digit
        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i); // get each binary digit

            if (bit == '1') {
                decimal += Math.pow(2, power); // add corresponding 2^position
            }
            power++;
        }

        // Output result
        System.out.println("Decimal value: " + decimal);

        sc.close();
    }
}
