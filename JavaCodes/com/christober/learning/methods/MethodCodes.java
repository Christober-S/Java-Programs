package christober.learning.methods;

public class MethodCodes {
    public void main() {

    }
    static void m1(){
        MethodCodes obj1 = new MethodCodes();
        MethodCodes obj2 = new MethodCodes();
        MethodCodes obj3 = new MethodCodes();
        obj2.m2();

    }
    void m2(){
        m1();
        m1();
        m1();
        m2();
    }
}
