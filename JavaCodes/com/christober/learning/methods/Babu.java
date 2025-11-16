package christober.learning.methods;

public class Babu {
    {
        int a = 40;
        if(a%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
    static {
        int a = 49;
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Babu main = new Babu();
        System.out.println("Main");
    }
}
