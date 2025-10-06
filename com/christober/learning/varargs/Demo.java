package com.christober.learning.varargs;

public class Demo {
    public static void main(String[] args) {
        if (m1(34)){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
    public static boolean m1(int a){
        if (a%2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
