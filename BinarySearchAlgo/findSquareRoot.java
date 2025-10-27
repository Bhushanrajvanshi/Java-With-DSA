package BinarySearchAlgo;

public class findSquareRoot {
    static int findMinSquareValue(int num){
        int start = 0, end = num;
        int ans = -1;

        while( start<=end ){
            int mid = start + (end-start)/2;
            int value = mid*mid;
            if(value==num) return mid;

            if( value<=num ){
                ans = mid;
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int num = 24;
        System.out.println(findMinSquareValue(num));
    }
}
