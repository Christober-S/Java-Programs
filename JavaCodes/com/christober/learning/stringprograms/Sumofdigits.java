package com.christober.learning.stringprograms;
import java.util.Scanner;
public class Sumofdigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str =new String (sc.nextLine());
        int sum=0;
        for(int i=0;i<=str.length()-1;i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                sum=sum+(ch-48);
            }
        }
        System.out.println(sum);
    }
}
