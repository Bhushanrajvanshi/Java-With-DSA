package Recursion_Java;

public class RecursiOnArray {
    static void printArray(int[] arr, int idx){
        if( idx==arr.length  ){
            return;
        }
        System.out.print(arr[idx]+ " ");
        printArray(arr, idx+1);
    }

    static int maxValue(int[] arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int smallAnswer = maxValue(arr, idx+1);
        return Math.max(smallAnswer, arr[idx]);
    }

    static int sumOfArray(int[] arr, int idx){
        if(idx==arr.length){
            return 0;
        }
        int smallAnswer = sumOfArray(arr, idx+1);
        return smallAnswer + arr[idx];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        printArray(arr, 0);
        System.out.println();
        System.out.println("Max Value is: "+maxValue(arr, 0));
        System.out.println("Sum of Array is: "+sumOfArray(arr, 0));
    }
}
