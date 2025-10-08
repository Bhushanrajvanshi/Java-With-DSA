package Recursion_Java;

import java.util.Scanner;

public class SearchingOnArray {
    static boolean searchElement(int[] arr, int target, int idx) {
        int n = arr.length;
        if(idx >= n) return false;
        if(arr[idx]==target) return true;
        return searchElement(arr, target, idx+1);
    }



    static void searchAllElementIndexs(int[] arr, int target, int idx){
        int n = arr.length;
        if(idx >= n) return;
        if(arr[idx]==target) System.out.print(idx+" ");
        searchAllElementIndexs(arr, target, idx+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the "+size +" elements of array: ");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int target = sc.nextInt();


        // if(searchElement(arr, target, 0)){
        //     System.out.println("YES!");
        // } else {
        //     System.out.println("Element not found!");
        // }


        searchAllElementIndexs(arr, target, 0);
    }
}
