package Array_Java;
import java.util.Scanner;

public class SpiralOrder {

    static void printMatrices(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrder(int[][] arr, int r, int c){
        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
        int totalElement = 0;

        while( totalElement<r*c ){
            // TopRow -> leftCol to rightCol
            for(int j=leftCol; j<=rightCol && totalElement<r*c; j++){
                System.out.print(arr[topRow][j]+ " ");
                totalElement++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for(int i=topRow; i<=bottomRow && totalElement<r*c; i++){
                System.out.print(arr[i][rightCol]+ " ");
                totalElement++;
            }
            rightCol--;

            // bottomRow -> bottomRow to topRow
            for(int j=rightCol; j>=leftCol && totalElement<r*c; j--){
                System.out.print(arr[bottomRow][j]+" ");
                totalElement++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for(int i=bottomRow; i>=topRow && totalElement<r*c; i--){
                System.out.print(arr[i][leftCol]+" ");
                totalElement++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter the "+ r*c +" Number Elements in matrix array:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Inputs Arrays:");
        printMatrices(matrix);
        System.out.println();
        printSpiralOrder(matrix, r, c);
    }
}
