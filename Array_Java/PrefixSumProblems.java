package Array_Java;
import java.util.Scanner;

public class PrefixSumProblems {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int[] arr){
        int i = 0, j = arr.length-1;
        while (i <= j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static int[] prefixSumArray(int[] arr){
        int n = arr.length;
        int prefixSum[] = new int[n];
        prefixSum[0] = arr[0];
        for (int i=1; i<n; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        return prefixSum;
    }

    static int[] PrefixSum(int arr[]){
        int n = arr.length;
        for(int i=1; i<n; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("Array is: ");
        printArray(arr);
        System.out.println();
        // int ans [] = prefixSumArray(arr);
        int ans[] = PrefixSum(arr);

        System.out.println("Prefix Sum Array is: ");
        printArray(ans);
    }
}
