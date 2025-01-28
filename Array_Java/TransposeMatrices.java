package Array_Java;
import java.util.Scanner;

public class TransposeMatrices {

    static void PrintArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] Transpose(int[][] arr, int r, int c){
        int[][] ans = new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }

    static void transposeInPlace(int[][] arr, int r, int c){
        if( r != c ) {
            System.out.println("Transpose is not possible");
            return;
        }

        for(int i=0; i<r; i++){
            for(int j=i+1; j<c; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("The original matrix is:");
        PrintArray(matrix);
        System.out.println("The transpose matrix is:");
        // int[][] transpose = Transpose(matrix, r, c);
        // PrintArray(transpose);
        transposeInPlace(matrix, r, c);
        PrintArray(matrix);
    }
}
