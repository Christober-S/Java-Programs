package com.christober.factsaboutjava;

public class M1 {
    public static void main(String[] args) {
        m1(1);
        m1(2, 4);
        m1(3, 5, 5);
        m1(1,2, 3, 4, 5);
        m1(1,2, 3, 4, 5,4 ,5, 4, 2, 5);
    }
    public static void m1(int...a){
        System.out.println(a.length);
    }
}
