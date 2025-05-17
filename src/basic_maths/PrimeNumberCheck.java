package basic_maths;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        boolean result = checkIsNumberPrimeApproach1(number);
        if(result){
            System.out.println(number+" is a prime number");
        }else {
            System.out.println(number+" is a not prime number");
        }
        System.out.println("==================================");
        boolean returnValue = checkIsPrimeApproach2(number);
        if(returnValue){
            System.out.println(number+" is a prime number");
        }else {
            System.out.println(number+" is a not prime number");
        }
    }

    public static boolean checkIsNumberPrimeApproach1(int number){
        int counter=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                counter++;
            }
        }
        return counter==2;
    }

    public static boolean checkIsPrimeApproach2(int number){
        int counter=0;
        double sqrt = Math.sqrt(number);
        for(int i=1; i<=sqrt;i++){
            if(number%i==0){
                counter++;
                if(number/i != i){
                    counter++;
                }
            }
        }
        return counter==2;
    }
}
