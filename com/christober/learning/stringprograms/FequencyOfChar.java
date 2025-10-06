package com.christober.learning.stringprograms;

public class FequencyOfChar {
    static void main() {
        int count = 0;
        char ch = 'a';
        String str = "abcdefaga";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println(count);
    }
}
