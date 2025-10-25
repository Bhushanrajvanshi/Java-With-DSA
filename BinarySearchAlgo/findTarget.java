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
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;

        System.out.println(findTargetInSortedArray(arr, target));
    }
}
