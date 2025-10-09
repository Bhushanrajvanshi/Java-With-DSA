package Recursion_Java;

public class lastOccurrence {
    static int lastOccurrence(int[] arr, int idx, int target) {
        int n = arr.length;
        if (idx >= n) return -1;

        int smallAnswer = lastOccurrence(arr, idx + 1, target);
        if (smallAnswer != -1) return smallAnswer;

        if (arr[idx] == target) return idx;
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 1, 4, 6, 7};
        int target = 4;
        System.out.println(lastOccurrence(arr, 0, target));
    }
}
