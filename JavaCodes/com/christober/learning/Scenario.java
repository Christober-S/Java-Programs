package christober.learning;

import christober.learning.varargs.Example;

final class Scenario implements Example {
    int a = 10;
    static {
        System.out.println("static block");
    }
    {
        System.out.println("non static block");
    }
    {
        a++;
    }
    Scenario(){
        System.out.println("constructor block");
    }
    static void main() {
        Scenario obj = new Scenario();
        Scenario obj2 = new Scenario();
        System.out.println(obj2.a);
        System.out.println("main block");
    }

    @Override
    public void run() {
        System.out.println("run block");
    }
}
