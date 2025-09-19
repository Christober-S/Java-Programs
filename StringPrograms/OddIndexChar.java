package StringPrograms;

public class OddIndexChar {
    static void main() {
        String str = "Christober";
        char [] ch =  str.toCharArray();
        System.out.println("The Odd Index Characters are: ");
        for (int i = 0; i < ch.length; i++) {
            if(i%2 !=0){
                System.out.print(ch[i]+" ");
            }
        }
    }
}
