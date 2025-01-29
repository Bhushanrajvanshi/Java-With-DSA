package Array_Java;
import java.util.Scanner;

public class SpiralOrderAdd {

    static void printTwoDArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] printSpiralOrder( int n ){
        int[][] arr = new int[n][n];
        int topRow = 0, bottomRow = n-1, leftCol = 0, rightCol = n-1;
        int current = 1;

        while( current<=n*n ){
            // TopRow -> leftCol to rightCol
            for(int j=leftCol; j<=rightCol && current<=n*n; j++){
                arr[topRow][j] = current++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for(int i=topRow; i<=bottomRow && current<=n*n; i++){
                arr[i][rightCol] = current++;
            }
            rightCol--;

            // bottomRow -> bottomRow to topRow
            for(int j=rightCol; j>=leftCol && current<=n*n; j--){
                arr[bottomRow][j] = current++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for(int i=bottomRow; i>=topRow && current<=n*n; i--){
                arr[i][leftCol] = current++;
            }
            leftCol++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a number:");
        int n = sc.nextInt();

        int[][] ans = printSpiralOrder(n);
        System.out.println();
        printTwoDArray(ans);
    }
}
