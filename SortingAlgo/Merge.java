package SortingAlgo;

public class Merge {
    static void printArray(int[] arr){
        for(int Ans: arr){
            System.out.print(Ans+" ");
        }
    }

    static void mergeArray(int[] arr, int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        int i, j, k;
        for(i=0; i<n1; i++)  left[i]=arr[l+i];
        for(j=0; j<n2; j++)  right[j]=arr[mid+1+j];

        i = 0;
        j = 0;
        k = l;

        while( i<n1 && j<n2 ){
            if(left[i]<right[j]){
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while( i<n1 )
            arr[k++] = left[i++];
        while( j<n2 )
            arr[k++] = right[j++];
    }

    static void mergeSort(int[] arr, int left, int right){
        if( left>=right ) return;

        int mid = (left+right)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);

        mergeArray(arr, left, mid, right);
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 5, 2, 8, 6, 0};
        int length = arr.length;
        System.out.println("Before Sorting: ");
        printArray(arr);
        System.out.println("\nAfter Sorting: ");
        mergeSort(arr, 0, length-1);
        printArray(arr);
    }
}
