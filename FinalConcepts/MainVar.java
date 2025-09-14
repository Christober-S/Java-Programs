package FinalConcepts;

public class MainVar extends Var{
    public MainVar(int id) {
        super(id);
    }
    public static void main(String[] args) {
        Var var = new Var(89);
        System.out.println(var.getId());
    }
}
