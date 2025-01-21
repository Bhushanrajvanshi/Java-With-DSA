package Array_Java;

import java.util.Arrays;

public class ArrayReference {
        static void PrintArray(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Original Array is: ");
        PrintArray(arr); 

        // int[] arr1 = arr;  // Shallow Copy
        // int[] arr1 = arr.clone();    // Deep Copy
        // int[] arr1 = Arrays.copyOf(arr, arr.length);
        // int[] arr1 = Arrays.copyOfRange(arr, 0, arr.length);
        int[] arr1 = Arrays.copyOfRange(arr, 1, 4);

        System.out.println("Array 1 is: ");
        PrintArray(arr1);

        arr1[0] = 100;
        arr1[1] = 200;
        System.out.println("Modified Array 1 is: ");
        PrintArray(arr1);

        System.out.println("Original Array is: ");
        PrintArray(arr);
    }
}
