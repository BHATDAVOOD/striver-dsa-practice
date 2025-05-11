package basic_maths;

public class ExtractDigits {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Digits in " + number + ":");
        extractDigits(number);
    }
    public  static void extractDigits(int number){
        while(number > 0){
            int digit = number % 10; // Get the last digit
            System.out.print(digit + " ");
            number = number / 10; // Remove the last digit
        }
    }
}
