package com.christober.learning.fop;
public class EvenIndexed {
    public static void main(String[] args) {
        String words = "Hello World";
        System.out.println("The characters in the even index are: ");
        for (int i = 0; i < words.length(); i++) {
            if (i % 2 == 0){
                System.out.print(words.charAt(i)+" ");
            }
        }
    }
}
