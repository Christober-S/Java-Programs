package Interface;

public class Son implements GrandFather , Father {
    @Override
    public void property() {
        System.out.println("Son Got Properties of GrandFather and Father");
    }
    static void main() {
        Son son = new Son();
        son.property();
    }
}
