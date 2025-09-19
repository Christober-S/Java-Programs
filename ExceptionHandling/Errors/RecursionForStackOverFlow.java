package ExceptionHandling.Errors;

public class RecursionForStackOverFlow {
    static void main() {
        System.out.println("main");
        RecursionForStackOverFlow obj = new RecursionForStackOverFlow();
        obj.main();
    }
}
