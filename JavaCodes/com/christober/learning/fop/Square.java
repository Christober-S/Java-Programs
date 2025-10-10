public class Square {
    public static void main(String[] args) {
        int num = 49;
        boolean square = false;
        for (int i = 0; i <= num/2; i++) {
            if (i * i == num) {
                square = true;
                break;
            }
        }
        if (square) {
            System.out.println("Perfect Square");
        }
        else {
            System.out.println("Not perfect Square");
        }
    }
}
