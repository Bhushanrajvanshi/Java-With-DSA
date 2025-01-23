package Array_Java;

public class BasicProgofArr {

    static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void reverseOfArray(int arr[]) {
        int length = arr.length;
        int[] arr1 = new int[length];

        int j = 0;

        // for(int i=length-1; i>=0; i--) {
        //     arr1[length-1-i] = arr[i];     
        // }


        // for(int i=length-1; i>=0; i--) {
        //     arr1[j++] = arr[i];
        // }


        int i = length-1;
        while (i>=0) {
            arr1[j++] = arr[i--];
        }

        System.out.println("Array after reverse is: ");
        PrintArray(arr1);
    }

    static void swapInArray(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverseOfArraywithoutexArr(int arr[]) {
        int j = 0, i = arr.length-1;

        while( i >= j ){
            swapInArray(arr, i, j);
            j++;
            i--;
        }
        System.out.println("After reverse array is: ");
        PrintArray(arr);
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }
    static void reverseInPlace(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n - 1);
        reverse(arr, 0, n-1);
        PrintArray(arr);
    }

    static int[] rotateArray(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        int ans[] = new int[n];
        int j = 0;

        for (int i=n - k; i<n; i++) {
            ans[j++] = arr[i];
        }
        for (int i=0; i<n - k; i++) {
            ans[j++] = arr[i];
        }
        PrintArray(ans);
        return ans;
    }



    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 3, 8, 5};
        // System.out.println("Array before reverse is: ");
        PrintArray(arr);
        // reverseOfArray(arr);
        // reverseOfArraywithoutexArr(arr);
        // rotateArray(arr, 7);
        reverseInPlace(arr, 2);
    }
}
