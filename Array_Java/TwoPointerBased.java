package Array_Java;
import java.util.Scanner;

public class TwoPointerBased {

    
    static void majorityEle(int arr[]){  // it is a leetcode problem
        int n = arr.length;
        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    ans = arr[i];
                }
            }
        }
        System.out.println("Maor element in array is:");
        System.out.print(ans);
    }
    
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void swapArray(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr){
        int i = 0, j = arr.length-1;
        while (i < j){
            swapArray(arr, i, j);
            i++;
            j--;
        }
    }
    static void sortZeroAndOnes(int arr[]){
        int length = arr.length;
        int zerosCount = 0;

        for(int i=0; i<length; i++){
            if(arr[i]==0){
                zerosCount++;
            }
        }

        for(int i=0; i<length; i++){
            if(i<zerosCount){
                arr[i] = 0;
            } else{
                arr[i] = 1;
            }
        }

        // for(int i=0; i<zerosCount; i++){
        //     arr[i] = 0;
        // }
        // for(int i=zerosCount; i<length; i++){
        //     arr[i] = 1;
        // }
    }

    static void sortZeroAndOne(int arr[]){
        int length = arr.length;
        int left = 0, right = length-1;

        while(left<right){
            if(arr[left]==0){
                left++;
            } else if(arr[right]==1){
                right--;
            } else{
                swapArray(arr, left, right);
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }

    static void sortArrayByParity(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){

                swapArray(arr, left, right);

                left++;
                right--;
            }  

            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }  
    }

    static int[] sortSquaresArray(int arr[]){
        int n = arr.length;
        int left = 0, right = n-1;
        int ans[] = new int[n];
        int k = 0;

        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left]*arr[left];
                left++;
            } else{
                ans[k++] = arr[right]*arr[right];
                right--;
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int nums[] = new int[size];

        System.out.println("Enter the element " +size+ " of array");
        for(int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }


        // majorityEle(nums);

        printArray(nums);

        // sortZeroAndOnes(nums);
        // sortZeroAndOne(nums); 
        // sortArrayByParity(nums);
        
        int ans[] = sortSquaresArray(nums);
        reverse(ans);
        System.out.println();
        printArray(ans);   
    }
}
