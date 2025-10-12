package SortingAlgo;

public class Bubble {
    static void bubbleSort(int[] arr){
        int length = arr.length;

        for(int i=0; i<length-1; i++){
            for(int j=0; j<length-1-i; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 7, 2, 8, 5};
        bubbleSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
