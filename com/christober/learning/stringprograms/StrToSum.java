package com.christober.learning.stringprograms;

public class StrToSum {
    static void main() {
        String str = "123";
        var num = Integer.parseInt(str);
        int sum = 0;
        while (num!=0){
            sum += num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
