package SortingAlgo;

public class Count {
    static int maxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if( max<arr[i] ){
                max = arr[i];
            }
        }
        return max;
    }

    static void basicCountSort(int[] arr){
        int max = maxValue(arr);
        int[] count = new int[max+1];

        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int k = 0;
        for(int i=0; i<count.length; i++){
            for(int j=0; j<count[i]; j++){
                arr[k++] = i;
            }
        }
    }


    static void CountSort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];

        int max = maxValue(arr);
        int[] count = new int[max+1];

        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        for(int i=1; i<count.length; i++){
            count[i] += count[i-1];
        }

        for(int i=n-1; i>=0; i--){
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }

        for(int i=0; i<n; i++){
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 3, 7, 2, 6};
        // basicCountSort(arr);
        CountSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
