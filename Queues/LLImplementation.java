package Queues;

public class LLImplementation {
    public static class Node {
        int val;
        Node next;
        Node (int val) {
            this.val = val;
        }
    }
    public static class LinkedListQueue {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int val){
            Node temp = new Node(val);
            if(size==0){
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            } else {
                return head.val;
            }
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            } else {
                int x = head.val;
                head = head.next;
                size--;
                return x;
            }
        }

        public boolean isEmpty(){
            return size==0;
        }

        public void printLLQueue(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        LinkedListQueue LLq = new LinkedListQueue();
        System.out.println(LLq.isEmpty());
        LLq.add(10);
        LLq.add(20);
        LLq.add(30);
        LLq.add(40);
        LLq.add(50);
        System.out.println(LLq.isEmpty());
        LLq.printLLQueue();
        System.out.println(LLq.peek());
        LLq.printLLQueue();
        System.out.println(LLq.remove());
        LLq.printLLQueue();
    }
}
