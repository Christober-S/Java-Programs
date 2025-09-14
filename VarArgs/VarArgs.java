package VarArgs;

public class VarArgs {
    public static void main(String[] args) {
        prints(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 3, 2, 3);
    }
    public static void prints(int...a){
        for(int i: a){
            System.out.print(i+" ");
        }
    }
}
