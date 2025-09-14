public class ProgramClass {
    public static void main(String[] args) {
        int a = 3;
        int b = 15;
        int c = 0;

        for (int i = 1; i<= a+b; i++){
            if (i % a == 0 && i %b == 0){
                c = i;
                break;
            }
        }
        System.out.println(c);
    }
}
