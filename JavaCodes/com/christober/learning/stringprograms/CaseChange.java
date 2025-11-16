package christober.learning.stringprograms;

public class CaseChange {
    //Convert the string char lowercase to uppercase and vice versa
    public static void main(String[] args) {
        String str = "Hello World!";
        String ans = "";
        char chr;
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
//                changedStr.append(Character.toLowerCase(ch));
                chr=Character.toLowerCase(ch);
                ans+=chr;
            } else if (Character.isLowerCase(ch)) {
//                changedStr.append(Character.toUpperCase(ch));
                chr=Character.toUpperCase(ch);
                ans+=chr;
            } else {
                ans+=ch;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("Changed String: " + ans);
    }
}
