public class UniqueValues {
    public static void main(String[] args) {
        String word = "SARAN";
        isUnique(word);
    }
    public static void isUnique(String str){
        boolean [] unique = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!unique[ch]){
                unique[ch] = true;
                System.out.print(ch+" ");
            }
        }
    }
}
