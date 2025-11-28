package Queues;

public class ArrayImplementation {
    public static class QueueArry {
        int r = -1;
        int f = -1;
        int size = 0;
        int[] arr = new int[10];

        public void add(int val){
            if(size==arr.length-1){
                System.out.println("Queue is full!");
                return;
            }
            if( r==-1 && f==-1 ){
                r = f = 0;
                arr[r] = val;
            } else {
                arr[++r] = val;
            }
            size++;
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            int val = arr[f++];
            size--;
            return val;
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[f];
        }

        public boolean isEmpty(){
            return size==0;
        }

        public void printQueue(){
            for (int i = f; i <= r; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        QueueArry q = new QueueArry();
        System.out.println(q.isEmpty());
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.printQueue();
        q.remove();
        q.remove();
        q.remove();
        q.printQueue();
        q.add(25);
        q.add(55);
        q.printQueue();
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        System.out.println(q.size);
    }
}
