package StringPrograms;

public class CharToString {
    static void main() {
        char ch [] = {'C', 'H', 'R', 'I', 'S'};
        System.out.println(String.valueOf(ch));

//        ----------------------------------
        String str = new String(ch);
        System.out.println(str);

//        ----------------------------------------
        String res = "";
        for (int i = 0; i < ch.length; i++) {
            res += ch[i];
        }
        System.out.println(res);
    }
}
