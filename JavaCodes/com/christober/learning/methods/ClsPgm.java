package christober.learning.methods;

public class ClsPgm {
    // demonstrate constructor chaining in same class
    ClsPgm() {

        System.out.println("Default Constructor");
        this(10);
    }
    ClsPgm(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }
    public static void main(String[] args) {
        ClsPgm obj = new ClsPgm();
    }
}
