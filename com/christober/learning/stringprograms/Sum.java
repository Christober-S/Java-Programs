package com.christober.learning.stringprograms;
public class Sum {
    static void main() {
        String str = "123";
        int val = Integer.parseInt(str);
        int sum = 0;
        while(val>0){
            int digit = val % 10;
            sum  = sum + digit;
            val = val / 10;
        }
        System.out.println(sum);
    }
}
