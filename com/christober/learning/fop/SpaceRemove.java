public class SpaceRemove {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        String word = "Hello World Java";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)!=' '){
                result.append(word.charAt(i));
            }
        }
        System.out.println(result.toString());
    }
}
