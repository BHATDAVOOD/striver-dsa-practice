package basic_maths;

public class PrintAllDivisors {
    public static void main(String[] args) {
        printAllDivisorsApproach1(36);
        System.out.println("\n===================================");
        printAllDivisorsApproach2(36);
    }

    // Time complexity O(n)
    public static void printAllDivisorsApproach1(int number){
        for(int i =1; i<number;i++){
            if(number%i==0){
                System.out.print(i+" ");
            }
        }
    }


    public static void printAllDivisorsApproach2(int number){
        double sqrt = Math.sqrt(number);
        for(int i = 1; i<= sqrt; i++){
            if(number%i==0){
                System.out.print(i+" ");
                if(number/i !=i){
                    System.out.print(number/i+" ");
                }
            }
        }
    }
}
