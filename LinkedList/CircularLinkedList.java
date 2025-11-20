package LinkedList;

public class CircularLinkedList {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void printSinglyCircularLL(Node head){
        System.out.print(head.data+" ");

        Node temp = head.next;
        while(temp!=head){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(2);
        Node c = new Node(7);
        Node d = new Node(3);
        Node e = new Node(12);

        a.next = b;   // 5 -> 2 -> 7 -> 3 -> 12 -> 5
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = a;

        printSinglyCircularLL(a);
    }
}
