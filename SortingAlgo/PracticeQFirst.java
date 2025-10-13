package SortingAlgo;

public class PracticeQFirst {
    // move all zeros to the end
    static void moveZeros(int[] arr){
        int length = arr.length-1;
        for(int i=0; i<=length; i++){
            for(int j=0; j<=length-1; j++){
                if( arr[j]==0 && arr[j+1]!=0 ){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Sort fruits in alphabetical order
    static void sortFruits(String[] arr){
        int length = arr.length-1;
        for(int i=0; i<=length; i++){
            int minIndex = i;
            for(int j=i+1; j<=length; j++){
                if( arr[j].compareTo(arr[minIndex]) < 0 ){
                    minIndex = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 6, 0, 9, 5, 0, 7};
        String[] fruits = {"kivi", "apple", "papaya", "mango", "banana"};
        moveZeros(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        sortFruits(fruits);
        System.out.println();
        for(int i=0; i<fruits.length; i++){
            System.out.print(fruits[i] + " ");
        }
    }
}
