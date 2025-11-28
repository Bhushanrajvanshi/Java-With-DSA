package Queues;

public class CircularLinkedListImple {
    public static class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class CircularLinkedListQueue {
        Node head;
        Node tail;
        int size;
        public void add(int val){
            Node temp = new Node(val);
            if(size==0){
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            tail.next = head;
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            } else {
                int val = head.val;
                head = head.next;
                tail.next = head;
                size--;
                return val;
            }
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            } else {
                return head.val;
            }
        }

        public boolean isEmpty(){
            return size==0;
        }

        public void printAll(){
            Node temp = head;
            while(temp.next!=head){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println(temp.val);
        }
    }
    public static void main(String[] args) {
        CircularLinkedListQueue q = new CircularLinkedListQueue();
        System.out.println(q.isEmpty());
        q.add(2);
        q.add(4);
        q.add(6);
        q.add(8);
        q.add(9);
        q.printAll();
        System.out.println(q.isEmpty());
        System.out.println(q.remove());
        q.printAll();
        System.out.println(q.remove());
        q.printAll();
        System.out.println(q.peek());
    }
}
