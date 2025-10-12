package SortingAlgo;

public class Selection {
    static void selectionSort(int[] arr){
        int length = arr.length;
        for(int i=0; i<length-1; i++){
            int minIndex = i;
            for(int j=i+1; j<length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 7, 2, 8, 5};
        selectionSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
