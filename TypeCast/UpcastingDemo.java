package TypeCast;
// File: UpcastingDemo.java
class Parent {
    String name = "Parent";

    void show() {
        System.out.println("Parent show()");
    }
}
class Child extends Parent {
    String name = "Child";

    @Override
    void show() {
        System.out.println("Child show()");
    }
}
public class UpcastingDemo {
    public static void main(String[] args) {
        Parent p = new Child();  // Upcasting
        p.show();                // Which method runs?
        System.out.println(p.name); // Which variable prints?
    }
}
