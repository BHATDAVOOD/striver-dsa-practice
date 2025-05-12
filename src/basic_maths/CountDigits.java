package basic_maths;

public class CountDigits {
    public static void main(String[] args) {
        int number = 1;
        System.out.println("Number of digits in " + number + ": " + countDigits(number));
    }
    private static int countDigits(int number) {
        int count =0;
        while (number > 0) {
            number = number / 10; // Remove the last digit
            count++;
        }
        return count;
    }
}
