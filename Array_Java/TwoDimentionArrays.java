package Array_Java;
import java.util.Scanner;

public class TwoDimentionArrays {

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void addMatrix(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2) {
        if(  r1 != r2 || c1 != c2 ){
            System.out.println("Wrong input. Addition is not possible");
            return;
        }

        int sum[][] = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Sum of the matrices is: ");
        printArray(sum);
    }

    static void multiplyMatrix(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2) {
        if( c1 != r2 ){
            System.out.println("Wrong dimention. Multiplication is not possible");
            return;
        }

        int mul[][] = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                mul[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println("Product of the matrices is: ");
        printArray(mul);
    }



    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of rows: ");
       int r1 = sc.nextInt();
       System.out.println("Enter the number of columns: ");
       int c1 = sc.nextInt();

       int[][] arr = new int[r1][c1];

       System.out.println("Enter the " + r1 * c1 + " elements: ");
       for (int i = 0; i < r1; i++) {
           for (int j = 0; j < c1; j++) {
               arr[i][j] = sc.nextInt();
           }
           System.out.println();
       }

       System.out.println("Enter the number of rows: ");
       int r2 = sc.nextInt();
       System.out.println("Enter the number of columns: ");
       int c2 = sc.nextInt();

       int[][] arr2 = new int[r2][c2];

       System.out.println("Enter the " + r2 * c2 + " elements: ");
       for (int i = 0; i < r2; i++) {
           for (int j = 0; j < c2; j++) {
               arr2[i][j] = sc.nextInt();
           }
           System.out.println();
       }

       System.out.println("First Matrix is: ");
    //    printArray(arr);
       System.out.println("Second Matrix is: ");
    //    printArray(arr2);

    //    addMatrix(arr, r1, c1, arr2, r2, c2);
       multiplyMatrix(arr, r1, c1, arr2, r2, c2);

    }
}
