package basic_maths;

public class Palindrome {
    public static void main(String[] args) {
        int number = 12321;
        System.out.println("Is " + number + " a palindrome? " + isPalindrome(number));
        number = 12345;
        System.out.println("Is " + number + " a palindrome? " + isPalindrome(number));
    }

    public static boolean isPalindrome(int number){
        int reversed = 0;
        int original = number; // Store the original number
        while(number > 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        return original == reversed;
    }
}
