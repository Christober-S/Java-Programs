package FlowOfProgram;

public class FlowExe {
    static {
        System.out.println("Static block executed");
    }
    {
        System.out.println("Initializer block executed");
    }
    FlowExe(){
        System.out.println("Constructor executed");
    }
    public static void main(String[] args) {
        System.out.println("Main method started");
    }
}
