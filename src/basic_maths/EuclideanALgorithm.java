package basic_maths;

public class EuclideanALgorithm {
    public static void main(String[] args) {
        int num1=15;
        int num2=12;
        int result = findHighestCommonFactor(num1,num2);
        System.out.println("Highest common factor of "+num1+" and "+num2+" is "+result);
    }
    public static int findHighestCommonFactor(int num1,int num2){
        while (num1 > 0 && num2 > 0){
            if(num1>num2) num1=num1%num2;
            else num2 = num2%num1;
        }
        if(num1==0) return num2;
        return num1;
    }
}
