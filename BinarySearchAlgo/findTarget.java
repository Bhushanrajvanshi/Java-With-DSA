package BinarySearchAlgo;

public class findTarget {
    static int findTargetInSortedArray(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int ans = -1;
        while( start<=end ){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                return ans;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }


    static int findTargetByRecursion(int[] arr,int start, int end, int target){
        if( start>=end ) return -1;
        int mid = start + (end-start)/2;
        if (arr[mid]==target){
            return mid;
        } else if(arr[mid]>target){
            return findTargetByRecursion(arr, start, mid-1, target);
        } else {
            return findTargetByRecursion(arr, mid+1, end, target);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int length = arr.length-1;
        int target = 5;

        System.out.println(findTargetInSortedArray(arr, target));
        System.out.println(findTargetByRecursion(arr, 0, length, target));
    }
}
