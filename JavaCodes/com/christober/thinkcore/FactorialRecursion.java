package christober.thinkcore;

public class FactorialRecursion {
    //Factorial using Recursion
    public static void main(String[] args) {
        int num = 5;
        int result = factorial(num);
        System.out.println("The factorial of " + num + " is: " + result);
    }

    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
