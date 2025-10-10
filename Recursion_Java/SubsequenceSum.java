package Recursion_Java;

public class SubsequenceSum {
    static void printSubsequencesInteger(int[] arr, int idx, int n, int sumAns) {
        if( idx>=n ){
            System.out.print(sumAns+" ");
            return;
        }

        printSubsequencesInteger(arr, idx+1, n, sumAns);
        printSubsequencesInteger(arr, idx+1, n, sumAns+arr[idx]);
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 5};
        printSubsequencesInteger(arr, 0, arr.length, 0);
    }
}
