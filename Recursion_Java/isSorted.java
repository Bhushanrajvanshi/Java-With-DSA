package Recursion_Java;

public class isSorted {
    static boolean isSortedArray(int[] arr, int idx){
        int n = arr.length;
        if( idx==n-1 ) return true;

        if(arr[idx] > arr[idx+1]) return false;

        return isSortedArray(arr, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 10};
        if(isSortedArray(arr, 0)){
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array Not Sorted");
        }
    }
}
