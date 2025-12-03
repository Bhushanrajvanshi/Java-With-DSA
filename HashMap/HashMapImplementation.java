package HashMap;

import java.util.*;

public class HashMapImplementation {
    public static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        // public static final int MAXIMUM_CAPACITY = 1 << 30;

        private class Node{
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;    // number of entries in the map
        private LinkedList<Node>[] buckets;   // array of buckets

        private void initBuckets(int N){
            buckets = new LinkedList[N];
            for(int i=0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunc(K key){
            int hashCode = key.hashCode();
            return Math.abs(hashCode) % buckets.length;
        }

        private int searchInBucket(LinkedList<Node> ll, K key){
            for(int i=0; i<ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                } 
            }
            return -1;
        }

        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }

        public int capacity(){
            return buckets.length;
        }

        public float loadFactor(){
            return (n*1.0f)/buckets.length;
        }

        private void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length * 2);
            n = 0;
            for(var bucket : oldBuckets){
                for(var node : bucket){
                    put(node.key, node.value);
                }
            }
        }

        public int size(){  //return the numbers entries of in Map
            return n;
        }

        public void put(K key, V value){   // Insert and Update
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int idxEle = searchInBucket(currBucket, key);
            if( idxEle==-1 ){
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            } else {
                Node currNode = currBucket.get(idxEle);
                currNode.value = value;
            }

            if(n>=(buckets.length * DEFAULT_LOAD_FACTOR)){
                rehash();
            }
        }

        public V get(K key){     
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int idxEle = searchInBucket(currBucket, key);
            if( idxEle!=-1 ){
                Node currNode = currBucket.get(idxEle);
                return currNode.value;
            } else {
                return null;
            }
        }

        public V remove(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int idxEle = searchInBucket(currBucket, key);
            if( idxEle!=-1 ){
                Node currNode = currBucket.get(idxEle);
                V val = currNode.value;
                currBucket.remove(idxEle);
                n--;
                return val;
            }
            return null;
        }
        
    }
    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        mp.put("a", 1);
        mp.put("b", 2);
        System.out.println(mp.capacity());
        System.out.println(mp.loadFactor());
        mp.put("c", 3);
        mp.put("d", 5);
        mp.put("d", 6);
        mp.put("d", 7);
        mp.put("d", 11);
        mp.put("d", 23);
        mp.put("d", 15);
        mp.put("d", 8);
        mp.put("d", 9);
        // System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));
        mp.put("b", 20);
        System.out.println(mp.get("b"));
        System.out.println("Size of HashMap is: "+mp.size());
        // System.out.println(mp.remove("a"));
        // System.out.println("Size of HashMap is: "+mp.size());
        // System.out.println(mp.get("x"));
        // System.out.println(mp.remove("z"));
        System.out.println(mp.capacity());
        System.out.println(mp.loadFactor());

    }
}
