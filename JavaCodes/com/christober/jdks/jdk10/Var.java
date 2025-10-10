package com.christober.jdks.jdk10;

public class Var {
    static void main() {
        for (var i = 0; i < 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        var age = 22;
        System.out.println("Age: "+age);
    }
}
