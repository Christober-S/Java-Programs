public class Inits {
    static {
        System.out.println("Static block executed");
    }

    {
        System.out.println("Instance initializer block executed");
    }

    public static void main(String[] args) {

    }
}
