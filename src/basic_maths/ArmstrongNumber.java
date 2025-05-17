package basic_maths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 372;
        boolean result = isArmstrongNumber(number);
        if(result){
            System.out.println(number+" is an Armstrong Number");
        }else {
            System.out.println(number+" is not an Armstrong Number");
        }
    }
    public static boolean isArmstrongNumber(int number){
        int originalNumber = number;
        int finalNumber=0;
        while (number>0){
            int digit = number%10;
            finalNumber+=Math.pow(digit,3);
            number=number/10;
        }
        //System.out.println(finalNumber);
        return originalNumber==finalNumber;
    }
}
