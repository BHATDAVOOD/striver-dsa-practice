package patterns;

public class TrianglePatterns {
    public static void main(String[] args) {
//        trianglePattern(5);
//        System.out.println("----------------------------------");
//        trianglePattern2(5);
//        System.out.println("----------------------------------");
//        trianglePattern3(5);
//        System.out.println("----------------------------------");
//        trianglePattern4(5);
//        System.out.println("----------------------------------");
//        trianglePattern5(5);
//        System.out.println("----------------------------------");
//        trianglePattern6(5);
//        System.out.println("----------------------------------");
//        trianglePattern7(5);
//        System.out.println("----------------------------------");
//        trianglePattern8(5);
//        System.out.println("----------------------------------");
//        trianglePattern9(5);
//        System.out.println("----------------------------------");
//        trianglePattern9Approach2(5);
//        System.out.println("----------------------------------");
//        trianglePattern10(5);
//        System.out.println("----------------------------------");
//        trianglePattern11(5);
//        System.out.println("----------------------------------");
        trianglePattern12(5);
        System.out.println("----------------------------------");
        trianglePattern13(5);
        System.out.println("----------------------------------");
        trianglePattern14(5);
        System.out.println("----------------------------------");
        trianglePattern15(5);
    }
    private static void trianglePattern(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void trianglePattern2(int n) {
        for(int i =1; i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void trianglePattern3(int n) {
        for(int i =1; i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static void trianglePattern4(int n) {
        for(int i =0;i<n;i++){
            for(int j =n;j>i;j-- ){ // This can also be for(int j =0; j< n-i; j++)
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void trianglePattern5(int n) {
        for(int i = 1; i<=n;i++){
            for(int j = 1; j <= n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void trianglePattern6(int n) {
        for(int i =0;i<n;i++){
            for(int j=0; j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j =0; j<(2*i+1);j++) {
                System.out.print("*");
            }
            for(int j =0; j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void trianglePattern7(int n) {
        for(int i = n-1; i>=0; i--){
            // Spaces
            for(int j = 0; j < n-i-1;j++) {
                System.out.print(" ");
            }
            // Stars
            for(int j = 0; j < (2*i+1);j++) {
                System.out.print("*");
            }
            // Spaces
            for(int j = 0; j < n-i-1;j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void trianglePattern8(int n) {
        trianglePattern6(n);
        trianglePattern7(n);
    }

    public static void trianglePattern9(int n) {
        trianglePattern(n);
        for(int i=0; i<n;i++){
            for(int j = 0; j < n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void trianglePattern9Approach2(int n) {
        for(int i = 1; i<= (2*n)-1; i++) {
            int stars = i <=n ? i : 2*n  - i;
            for(int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void trianglePattern10(int n) {
        int start = 1;
        for(int i = 0; i<n;i++){
            start = i % 2 == 0 ? 1 : 0;
            for(int j = 0; j<=i;j++){
                System.out.print(start + " ");
                start = start == 1 ? 0 : 1;
            }
            System.out.println();
        }
    }

    public static void trianglePattern11(int n) {
        for (int i =1; i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(j);
            }
            for(int j =1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j = i; j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void trianglePattern12(int n) {
        int start = 1;
        for(int i =0; i< n ;i++){
            for(int j =0; j<=i;j++){
                System.out.print(start + " ");
                start += 1;
            }
            System.out.println();
        }
    }

    public static void trianglePattern13(int n) {
        for(int i=0; i<n;i++){
            for(char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void trianglePattern14(int n) {
        for(int i =0;i<n;i++){
            for(char ch = 'A'; ch <= 'A' + n - i - 1; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void trianglePattern15(int n) {
        char ch = 'A';
        for(int i =0;i<n;i++){
            for(int j = 0; j<=i;j++){
                System.out.print(ch + " ");
            }
            ch += 1;
            System.out.println();
        }
    }
}
