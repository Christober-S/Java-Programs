public class VowelsAndConsonants {
    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;

        String word = "Hello World";
        word = word.toLowerCase();
        for(char ch : word.toCharArray()){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'){
                vowels++;
            }
            else{
                consonants++;
            }
        }

        System.out.println("The Vowels are : "+vowels);
        System.out.println("The Consonants are : "+consonants);

    }
}
