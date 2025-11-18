package LinkedList;

public class reverseNodeList {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    static void printLinkedlist(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    static Node reverse(Node head){
        if( head.next==null ) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        printLinkedlist(a);
        System.out.println();
        Node ans = reverse(a);
        printLinkedlist(ans);
    }
}
