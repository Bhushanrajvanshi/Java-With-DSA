package LinkedList;

public class Basic {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);

        a.next = b;   // 5 -> 6 7 8 9 
        b.next = c;   // 5 -> 6 -> 7 8 9
        c.next = d;  // 5 -> 6 -> 7 -> 8 9
        d.next = e;  // 5 -> 6 -> 7 -> 8 -> 9

        System.out.println(b.data);
        System.out.println(b.next.data);
    }
}
