package SortingAlgo;

public class Insertion {
    static void insertionSort(int[] arr) {
        int length = arr.length;
        for(int i=1; i<length; i++){
            int j = i;
            while( j>0 && arr[j] < arr[j-1] ){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 7, 3, 8, 5};
        insertionSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
