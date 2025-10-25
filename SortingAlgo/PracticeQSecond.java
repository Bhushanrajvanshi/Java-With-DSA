package SortingAlgo;

public class PracticeQSecond {
    static void printArray(int[] arr){
        for(int Ans: arr){
            System.out.print(Ans+" ");
        }
    }

    // First Question 
    static void sortArray(int[] nums){
        int n = nums.length;
        if( n<=1 ) return;
        int x = -1, y = -1;

        for(int i=1; i<n; i++){
            if( nums[i-1]>nums[i] ){
                if( x==-1 ){
                    x = i-1;
                    y = i;
                } else {
                    y = i;
                }
            }
        }

        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }


    // Second Question
    static void sortPositiveNegative(int[] nums){
        int left = 0, right = nums.length-1;
        while( left<right ){
            while( nums[left]<0 ) left++;
            while( nums[right]>=0 ) right--; 
            if( left<right ){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {10, 5, 6, 7, 8, 9, 3};
        int[] nums1 = {-13, 20, 7, 0, -4, 11, -5, -15};
        sortArray(nums);
        printArray(nums);
        System.out.println();
        sortPositiveNegative(nums1);
        printArray(nums1);
    }
}
