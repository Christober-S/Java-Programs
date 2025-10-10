package com.christober.learning.varargs;

public class FactsSum {
    public static void main(String[] args) {
//        System.out.println(strongNumber(143));
//        System.out.println(m1(m2(m3())));
        System.out.println(m4(m5()));
    }
    public static boolean strongNumber(int a){
        int num = a;
        int sum = 0;
        while(num!=0){
            int rem = num%10;
            sum += factorial(rem);
            num = num/10;
        }
        if(sum==a){
            return true;
        }
        else{
            return false;
        }
    }

    public static int factorial(int n){
        int factorial = 1;
        for (int i = 1; i<=n; i++){
            factorial *= i;
        }
        return factorial;
    }
    public static int m1(int n){
        return n+ 5;
    }
    public static int m2(int n){
        return m1(n * 2);
    }
    public static int m3(){
        return 10;
    }

    public static int m4(int a){
        if (a == 0){
            return 0;
        }
        else {
            return a + m4(a-1);
        }
    }

    public static int m5(){
        return 5;
    }

}
