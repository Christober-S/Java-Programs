package com.christober.learning.fop;

public class Digits {
    public static void main(String[] args) {
        int num = 124;
        int count = 0;
        while (num > 0){
            count++;
            num = num / 10;
            ++count;
        }
        System.out.println(count);
    }
}
