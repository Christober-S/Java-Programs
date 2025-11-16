package christober.learning.stringprograms;

public class Pgm2 {
    //Container which has odd number iterate without using for loop
    public static void main(String[] args) {
        String str = "Christober";
        int i = 0;
        StringBuilder oddChars = new StringBuilder();

        while (i < str.length()) {
            if (i % 2 == 0) {
                oddChars.append(str.charAt(i));
            }
            i++;
        }

        System.out.println("Original String: " + str);
        System.out.println("Characters at Odd Positions: " + oddChars.toString());
    }
}
