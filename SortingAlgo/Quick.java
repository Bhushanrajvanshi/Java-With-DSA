package SortingAlgo;

public class Quick {
    static void printArray(int[] arr){
        int length = arr.length;
        for(int Ans: arr){
            System.out.print(Ans+" ");
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int start, int end){
        int pivot = arr[start];
        int count = 0;
        for(int i=start+1; i<=end; i++){
            if(arr[i] <= pivot ){
                count++;
            }
        }
        int pivotIdx = start + count;
        swap(arr, start, pivotIdx);
        int i=start, j=end;

        while( i<pivotIdx && j>pivotIdx ){
            while( arr[i]<=pivot )
                i++;
            while( arr[j]>pivot )
                j--;

            if( i<pivotIdx && j>pivotIdx ){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    static void quickSort(int[] arr, int start, int end){
        if( start>=end ) return;

        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot-1);
        quickSort(arr, pivot+1, end);
    }
    public static void main(String[] args) {
        int[] arr = {6, 2, 7, 1, 8, 3, 6};
        System.out.println("Before Sorting: ");
        printArray(arr);
        System.out.println("\nAfter Sorting: ");
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
