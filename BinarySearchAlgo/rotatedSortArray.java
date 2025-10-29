package BinarySearchAlgo;

public class rotatedSortArray {
    static int findValueInRotatedArray(int[] arr, int target){
        int start = 0, end = arr.length-1;
        while( start<=end ){
            int mid = start + (end-start)/2;
            if( arr[mid]==target ) return mid;

            if( arr[mid]<arr[end] ){
                if( arr[mid]<target && arr[end]>=target ){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            } else {
                if( arr[mid]>target && arr[start]<=target ){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 1, 2, 3};
        int target = 1;
        System.out.println(findValueInRotatedArray(arr, target));
    }
}
