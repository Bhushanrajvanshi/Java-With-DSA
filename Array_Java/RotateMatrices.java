package Array_Java;
import java.util.Scanner;

public class RotateMatrices {

    static void PrintArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void TransposeInPlace(int[][] arr, int r, int c){
        for(int i=0; i<r; i++){
            for(int j=i+1; j<c; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // PrintArray(arr);
    }

    static void reverseArray(int[] arr){
        int i = 0, j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void Rotate(int[][] arr, int n){
        // transpose,
        // reverse each row transpose matrix,
        TransposeInPlace(arr, n, n);

        for(int i=0; i<n; i++){
            reverseArray(arr[i]);
        }
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        System.out.println("Enter the " + r * c + " elements the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("The original matrix is:");
        PrintArray(matrix);
        System.out.println("The transpose matrix is:");
        // TransposeInPlace(matrix, r, c);
        Rotate(matrix, c);
        PrintArray(matrix);
    }
}
