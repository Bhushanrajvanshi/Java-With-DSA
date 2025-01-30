package Array_Java;
import java.util.Scanner;

public class RectangleSum {

    static void printArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;

        for(int i=l1; i<=l2; i++){
            for(int j=r1; j<=r2; j++){
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    static void findPrefixSumMatrices(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
    //?   traverse horizontally to calculate rows-wise prefix sum
        for(int i=0; i<r; i++){
            for(int j=1; j<c; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }

    //!   traverse vertically to calculate columns-wise prefix sum
        for(int j=0; j<c; j++){
            for(int i=1; i<r; i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }

    static int findSumTwo(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;

        findPrefixSumMatrices(matrix);
        for(int i=l1; i<=l2; i++){
            if(r1>=1)
                sum += matrix[i][r2] - matrix[i][r1-1];
            else 
                sum += matrix[i][r2];
        }

        return sum;
    }

    static int findSumThree(int[][] matrix, int l1, int r1, int l2, int r2) {
        int ans = 0, sum = 0, up = 0, left = 0, leftup = 0;
        findPrefixSumMatrices(matrix);

        sum = matrix[l2][r2];
        if( r1>=1 ){
            left = matrix[l2][r1-1];
        }
        if( l1>=1 ){
            up = matrix[l1-1][r2];
        }
        if( l1>=1 && r1>=1 ){
            leftup = matrix[l1-1][r1-1];
        }

        ans = sum - up - left + leftup;

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        System.out.println("Enter the " + r * c + " elements the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Enter the rectangle boundries: l1 r1 l2 r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("The original matrix is:");
        printArray(matrix);
        System.out.println();
        System.out.println("Rectangle Sum is: " + findSum(matrix, l1, r1, l2, r2));
        // System.out.println("Rectangle Sum is: " + findSumTwo(matrix, l1, r1, l2, r2));  //! is not print with three prefix sum
        System.out.println("Rectangle Sum is: " + findSumThree(matrix, l1, r1, l2, r2));
    }
}
