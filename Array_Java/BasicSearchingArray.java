package Array_Java;
import java.util.Scanner;

public class BasicSearchingArray {
    static void PrintArray(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int pairSum(int arr[], int num) {
        int length = arr.length;
        int ans = 0;
        for (int i=0; i<length; i++) {
            for (int j=i+1; j<length; j++) {
                if (arr[i] + arr[j] == num) {
                    ans++;
                }
            }
        }
        return ans;
    }

    static int TripletSum(int arr[], int num) {
        int length = arr.length;
        int ans = 0;
        for (int i=0; i<length; i++) {
            for (int j=i+1; j<length; j++) {
                for (int k=j+1; k<length; k++) {
                    if (arr[i] + arr[j] + arr[k] == num) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    static int uniqueNumber(int arr[]) {
        int length = arr.length;
        int ans = -1;
        for (int i=0; i<length; i++) {
           for(int j=i+1; j<length; j++) {
               if (arr[i] == arr[j]) {
                   arr[i] = -1;
                   arr[j] = -1;
               }
           }
        }

        for (int i=0; i<length; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

    static int firstLargest(int arr[]) {
        int length = arr.length;
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    static int secondLargest(int arr[]) {
        int max = firstLargest(arr);
        int length = arr.length;
        for(int i=0; i<length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = firstLargest(arr);
        return secondMax;
    }

    static int firstRepeatNum(int arr[]) {
        int length = arr.length;
        for(int i=0; i<length; i++) {
            for(int j=i+1; j<length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
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


        // System.out.println("Enter target sum value: ");
        // int target = sc.nextInt();


        // PrintArray(arr);
        // System.out.println("Pair of sum "+target+" is: "+pairSum(arr, target));
        // System.out.println("Triplet of sum "+target+" is: "+TripletSum(arr, target));
        // System.out.println("Unique number is: "+uniqueNumber(arr));
        
        // System.out.println("Second largest number is: "+secondLargest(arr));
        System.out.println("First repeat number is: "+firstRepeatNum(arr));

    }
}
