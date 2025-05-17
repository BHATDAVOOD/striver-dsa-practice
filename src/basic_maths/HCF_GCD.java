package basic_maths;

public class HCF_GCD {
    public static void main(String[] args) {
        int num1=12;
        int num2=15;
        int result = findHighestCommonFactor(num1,num2);
        System.out.println("Highest common factor of "+num1+" and "+num2+" is "+result);
    }

    public static int findHighestCommonFactor(int num1,int num2){
        int hcf=1;
        for(int i=2;i<=Math.min(num1,num2);i++){
            if(num1%i==0 && num2%i==0){
                hcf=i;
            }
        }
        return hcf;
    }
}
