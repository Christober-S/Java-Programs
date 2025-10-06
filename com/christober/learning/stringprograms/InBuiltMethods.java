package com.christober.learning.stringprograms;
import java.util.Arrays;
public class InBuiltMethods {
    static void main(String[] args) {
//        1. toCharArray();
//        This method can be used convert the String into array of characters
        String str = "Hello World";
        char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));

//        2. length();
//        This method will return the length (no of characters).
        String str2 = "Hello World";
        System.out.println(str2.length());

//        3. charAt(index_value(num));
//        This method will return the character present in a particular index.
//        invalid index will through the StringIndexOutBoundException
        String str3 = "Hello World";
        System.out.println(str3.charAt(2));

//        4. equals();
//        This method can be used to compare Strings.
//        It returns true if all the characters in the two strings are same and same casing.
//        it returns false when the character in the two strings are not same.
        String str4 = "Hello World";
        String str5 = "Hello World";
        System.out.println(str4.equals(str5));

//        5. equalsIgnoreCase();
//        This method is used to compare the two string by ignoring the case sentivity of two string un like the equals();
        String str6 = "Hello World";
        String str7 = "HellO World";
        System.out.println(str6.equalsIgnoreCase(str7));

//        6. concat();
//        This method can be used to merge two strings.
        String str8 = "Chris";
        String str9 = "tober";
        System.out.println(str8.concat(str9));

//        7. toUpperCase();
//        This method will convert all the characters in string into uppercase
        String str10 = "chris";
        System.out.println(str10.toUpperCase());

//        8. toLowerCase();
//        This method will convert all the characters in string to lowercase
        String str11 = "CHRISTOBER";
        System.out.println(str11.toLowerCase());

//        9. isEmpty();
//        This method will return true if the string is null else it will return false.
        String str12 = "";
        String str13 = " ";
        System.out.println(str12.isEmpty());
        System.out.println(str13.isEmpty());

//        10. isBlank();
//        This method is used to check whether the given string is blank (empty or (" ")). no other character except space
        String str14 = " ";
        String str15 = "";
        System.out.println(str14.isBlank() && str15.isBlank());

//        11. replace('oldchar', 'newchar'); or replace("oldstring", newstring");
//        This method can be used to replace all the repetion of old characters with new character
        String str16 = "she sells sea shells on the sea shore";
        System.out.println(str16.replace('s', '@'));
        System.out.println(str16.replace("sea", "123"));

//        12. repeat(count);
//        This method will return the repeation of the given string for given count time.
        String str17 = "java ";
        System.out.println(str17.repeat(100));
//        System.out.println(str17.repeat(0)); // null
//        System.out.println(str17.repeat(-1)); //IllegalArgumentException

//        13. contains(string);
//        This method will return true if the given string is present in main string
//        This method will return false if the given string is not pre666sent in main string
        String str18 = "java ";
        System.out.println(str18.contains("av"));

        String s1 = "java";
        String s2 = "java";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

//        14. substring(start index);
//        substring(start index, end index)
//        This method
        String name = "Christober";
        System.out.println(name.substring(0, 3));

//        15. startswith(str);
//        This method checks wheather the main string starts with given string or not.
        System.out.println(name.startsWith("Ch"));

//        16. endswith(str);
//        This method checks wheather the main string ends with given string or not.
        System.out.println(name.endsWith("er"));

//        17. indexOf(char ch);
//        This method will return the index value of a given character
        System.out.println(name.indexOf('C'));

//        18. indexOf(String str);
//        This method will return the index value of a given string from the main string
        System.out.println(name.indexOf("Ch"));

//        19. indexOf(char ch, int from);
//        This method will return the index value of given character from starting from the given index.
        System.out.println(name.indexOf('e', 1));

//        20. indexOf(String str, int from);
//        This method will return the index value of given string from main string from starting from the given index.
        System.out.println(name.indexOf("ri", 1));

//        21. split(str);
//        This method can be used to divide the string based on the given character.
        String strs = "Java Is a Awsome Language";
        String arr[]  = strs.split(" ");
        System.out.println(Arrays.toString(arr));

//        22. lastIndexOf(char ch);
//        This method will return the index value of the last apperance of given character of the string.
        System.out.println(strs.lastIndexOf('a'));

//        23. lastIndexOf(String str);
//        This method will return the index value of the last apperance of given string of the main string
        System.out.println(strs.lastIndexOf("va"));

//        24. lastIndexOf(char ch, int end);
//        This method will return the index value of the last apperaance of character given string until the given last index
        System.out.println(strs.lastIndexOf('a', 12));

//        25. lastIndexOf(String str, int end);
//        This method will return the index value of the last apperaance of character given string until the given last index
        System.out.println(strs.lastIndexOf("va", 12));

//        26. valueOf(data);
//        This method will covert all the type of data into string format.
        System.out.println(String.valueOf('A'));
        System.out.println(String.valueOf("Chriso"));
        System.out.println(String.valueOf(false));
        int intArr[] = {1, 2, 3, 4, 5};
        char chArr [] = {'A', 'B', 'C', 'D'};
        System.out.println(String.valueOf(chArr));

    }
}