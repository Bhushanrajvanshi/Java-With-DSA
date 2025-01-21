package Array_Java;
import java.util.Scanner;

public class CountElement {
    static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void CountElement(int arr[], int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        System.out.println("The number of even elements is: " + count);
    }

    static int LastOccurance(int arr[], int num) {
        int count = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count = i;
                // break;
            }
        }
        return count;
    }

    static int StrictlyGreater(int arr[], int num) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if ( arr[i]>num) {
                count++;
            }
        }
        return count;
    }

    static boolean isSorted(int arr[]) {
         boolean check = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if ( arr[i]>arr[i+1] ){
                check = false;
            }
        }
        return check;
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


        // PrintArray(arr);
        // CountElement(arr, 2);
        // System.out.println("Last Occurance is: " + LastOccurance(arr, 2));
        // System.out.println("Strictly Greater is: " + StrictlyGreater(arr, 2));
        System.out.println("Sorted is: " + isSorted(arr));
    }
}
