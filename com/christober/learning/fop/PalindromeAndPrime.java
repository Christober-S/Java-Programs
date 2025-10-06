public class PalindromeAndPrime {
    public static void main(String[] args) {
        int num = 1000;
        int palindrome = num;
        int rev = 0;
        while (palindrome != 0){
            int rem = palindrome % 10;
            rev = (rev*10)+rem;
            palindrome = palindrome / 10;
        }
        boolean prime = true;
            for (int i = 2; i < num/2; i++) {
                if (i % num == 0){
                    prime = false;
                }
            }
            if (rev == num && prime == true){
                System.out.println("Prime and Palindrome: " + num);
            }
            else {
                System.out.println("Not Prime and Palindrome: " + num);
            }

        }
    }

