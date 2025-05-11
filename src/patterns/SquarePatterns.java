package patterns;

import java.util.Scanner;

public class SquarePatterns {
    public static void main(String[] args) {

        // Run it for some test cases
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Test Cases");
        int t = sc.nextInt();
        int[] arr = new int[t];
        for(int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            squarePattern(arr[i]);
        }



        /*
         *  Points to Remember:
         * 1. Outer loop is used to print the number of rows.
         * 2. Inner loop is used to print the number of columns & connect them with the rows.
         * 3. Print everything inside the inner loop.
         * 4. Observe symmetry in the pattern (in some cases).
         * */
    }

        public static void squarePattern(int n) {
            for(int i =0; i<n; i++){
                for(int j =0; j<n;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
