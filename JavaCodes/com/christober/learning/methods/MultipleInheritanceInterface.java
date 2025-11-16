package christober.learning.methods;

public class MultipleInheritanceInterface implements Int1, Int2{
    public static void main(String[] args) {
        MultipleInheritanceInterface obj = new MultipleInheritanceInterface();
        obj.display();
    }

    @Override
    public void display() {
        System.out.println("Display method implementation");
    }
}
