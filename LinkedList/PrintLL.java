package LinkedList;

public class PrintLL {
    public static class  Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    static void printLinkedList(Node head){
        while( head!=null ){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    static void printLinkedListRecursive(Node head){
        if(head==null) return;
        printLinkedListRecursive(head.next);
        System.out.print(head.data+" ");
    }

    static int size(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }

    public static void insertAtEnd(Node head, int value){
        Node temp = new Node(value);
        Node t = head;
        while(t.next!=null){
            t = t.next;
        }
        t.next = temp;
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


        insertAtEnd(e, 15);
        printLinkedList(a);
        System.out.println();
        printLinkedListRecursive(a);
        System.out.println();
        System.out.println("length of LinkedList is: "+size(a));
    }
}
