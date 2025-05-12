package basic_maths;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Original number: " + number);
        int reversed = reverseNumber(number);
        System.out.println("Reversed number: " + reversed);
    }

    private static int reverseNumber(int number){
        int reversed = 0;
        while (number>0){
            int digit = number%10;
            reversed = reversed * 10 + digit; // Shift the digits and add the last digit
            number  = number /10;
        }
        return reversed;
    }
}
