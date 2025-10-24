package SortingAlgo;

import java.util.ArrayList;
import java.util.Collections;

public class Bucket {
    static void BucketSort(float[] arr){
        int n = arr.length;

        ArrayList<Float>[] buckets = new ArrayList[n];
        // Initialize the buckets
        for(int i=0; i<n; i++){
            buckets[i] = new ArrayList<Float>();
        }

        // Put array elements in different buckets
        for(int i=0; i<n; i++){
            int bucketIndex = (int) arr[i] * n;
            buckets[bucketIndex].add(arr[i]);
        }

        // Sort each bucket
        for(int i=0; i<buckets.length; i++){
            Collections.sort(buckets[i]);
        }

        // Get merge all buckets into the sorted array
        int index = 0;
        for(int i=0; i<buckets.length; i++){
            ArrayList<Float> currBucket = buckets[i];
            for(int j=0; j<currBucket.size(); j++){
                arr[index++] = currBucket.get(j);
            }
        }

    }
    public static void main(String[] args) {
        float[] arr = {0.5f, 0.4f, 0.6f, 0.2f, 0.7f};
        BucketSort(arr);
        for(float i : arr) System.out.print(i + " "); 
    }
}
