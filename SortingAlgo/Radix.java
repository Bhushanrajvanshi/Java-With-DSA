package SortingAlgo;

public class Radix {
    static int maxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static void countSort(int[] arr, int place){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for(int i=0; i<arr.length; i++){
            count[(arr[i]/place)%10]++;
        }

        for(int i=1; i<count.length; i++){
            count[i] += count[i-1];
        }

        for(int i=n-1; i>=0; i--){
            int idx = count[(arr[i]/place)%10] - 1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }

        for(int i=0; i<n; i++){
            arr[i] = output[i];
        }
    }

    static void radixSort(int[] arr){
        int max = maxValue(arr);
        for(int place=1; max/place>0; place*=10 ){
            countSort(arr, place);
        }
    }
    public static void main(String[] args) {
        int[] arr = {43, 453, 626, 894, 0, 3};
        radixSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
