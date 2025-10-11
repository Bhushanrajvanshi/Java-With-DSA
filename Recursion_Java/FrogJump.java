package Recursion_Java;

public class FrogJump {
    static int minJumpsValue(int[] arr, int size, int idx) {
        if( idx==size-1 ) return 0;

        int option1 = minJumpsValue(arr, size, idx+1) + Math.abs(arr[idx+1]-arr[idx]);
        if( idx==size-2 ) return option1;

        int option2 = minJumpsValue(arr, size, idx+2) + Math.abs(arr[idx+2]-arr[idx]);

        return Math.min(option1, option2);
    }
    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 20};
        System.out.println(minJumpsValue(arr, arr.length, 0)); 
    }
}
