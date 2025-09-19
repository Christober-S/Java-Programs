package ExceptionHandling.Exceptions.Unchecked;
public class Main {
    static void main() {
        Main obj = new Main();
        obj.method1();
    }
    void method1() {
        method2();
    }
    void method2() {
        method3();
    }
    void method3() {
        int a = 3/0;
    }
}
