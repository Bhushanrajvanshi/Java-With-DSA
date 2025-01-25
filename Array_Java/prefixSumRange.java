package Array_Java;
import java.util.Scanner;

public class prefixSumRange {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] prefixSum(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size+1];
        System.out.println("Enter the elements of array: ");
        for (int i = 1; i <= size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array is: ");
        printArray(arr);
        System.out.println();

        int ans[] = prefixSum(arr);

        System.out.println("Enter the number of queries: ");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("Enter the range l and r : ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            
            int sum = ans[r] - ans[l-1];
            System.out.println("Sum is: "+sum);
        }

        // System.out.println();
        // printArray(arr);
    }
}
