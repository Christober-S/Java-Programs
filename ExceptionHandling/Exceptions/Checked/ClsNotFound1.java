package ExceptionHandling.Exceptions.Checked;

public class ClsNotFound1 {
    static void main() throws ClassNotFoundException {
        method1();
    }
    static void method1 ()throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }
}
