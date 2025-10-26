package BinarySearchAlgo;

public class FirstLastOccurance {
    static int firstOccurance(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int ans = -1;
        while( start<=end ){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                end = mid - 1;
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


    static int lastOccurance(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int ans = -1;
        while( start<=end ){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                start = mid + 1;
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
        int [] arr = {1, 1, 1, 2, 2, 3, 3, 5, 5, 6, 6, 8};
        int target = 2;
        System.out.println(firstOccurance(arr, target));
        System.out.println(lastOccurance(arr, target));
    }
}
