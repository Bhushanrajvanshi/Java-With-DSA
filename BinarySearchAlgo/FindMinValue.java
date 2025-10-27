package BinarySearchAlgo;

public class FindMinValue {
    static int findMinValueInRotedArray(int[] arr){
        int start = 0, end = arr.length-1;
        int ans = -1;
        while( start<=end ){
            int mid = start + (end-start)/2;
            if( arr[mid]<=arr[end] ){
                ans = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 1, 2, 3};
        int[] arr1 = {4, 5, 6, 1, 2, 3};
        System.out.println(findMinValueInRotedArray(arr));
        System.out.println(findMinValueInRotedArray(arr1));
    }
}
