package ExceptionHandling.Exceptions.Checked;

public class Main {
    static void main() {
        try{
            method1();
        }
        finally{
            System.out.println("finally");
        }
    }
    public static void method1() {
        method1();
    }
}
