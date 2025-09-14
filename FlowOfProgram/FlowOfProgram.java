package FlowOfProgram;

public class FlowOfProgram {
    static int a = 10;
    int b = 20;
    static {
        System.out.println("In static block");
        System.out.println(a);
    }
    {
        System.out.println("In instance block");
        System.out.println(b);
    }
    FlowOfProgram() {
        System.out.println("In constructor");
    }

    public static void main(String[] args) {
        System.out.println("In main method");
        FlowOfProgram f = new FlowOfProgram();
    }
}
