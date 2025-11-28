package Queues;

public class CircularQueueArray {
    public static class CircularQueueImplementation {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[10];
        public void add(int val){
            if(size==arr.length){
                System.out.println("Queue is full!");
                return;
            }
            else if(size==0){
                front = rear = 0;
                arr[0] = val;
            }
            else if(rear<arr.length-1){
                arr[++rear] = val;
            }
            else if(rear==arr.length-1){
                rear = 0;
                arr[0] = val;
            }
            size++;
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue is full!");
                return -1;
            } else {
                int val = arr[front];
                if(front==arr.length-1) front = 0;
                else front++;
                size--;
                return val;
            }
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            } else {
                return arr[front];
            }
        }

        public boolean isEmpty(){
             if(size==0){
                return true;
            } else {
                return false;
            }
        }

        public void printQueue(){
            if(size==0){
                System.out.println("Queue is empty!");
                return;
            } else if( front<=rear ){
                for(int i=front; i<=rear; i++){
                    System.out.print(arr[i]+" ");
                }
            } else {
                for(int i=front; i<arr.length; i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0; i<=rear; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        CircularQueueImplementation q = new CircularQueueImplementation();
        System.out.println(q.isEmpty());
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q.isEmpty());
        q.printQueue();
        // q.remove();
        // q.remove();
        // q.remove();
        // q.printQueue();
        // q.add(25);
        // q.add(55);
        // q.printQueue();
        // System.out.println(q.isEmpty());
        // System.out.println(q.peek());
        // System.out.println(q.size);
    }
}
