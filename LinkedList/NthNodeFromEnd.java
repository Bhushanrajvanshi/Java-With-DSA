package LinkedList;

public class NthNodeFromEnd {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    // First method to find Nth node from end
    public static Node NthNode(Node head, int n){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;
        temp = head;
        for(int i=1; i<m; i++){
            temp = temp.next;
        }
        return temp;
    }


    // Second method to find Nth node from end
    public static Node NthNode2(Node head, int n){
        Node fast = head;
        Node slow = head;
        for(int i=0; i<n; i++){
            fast = fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    // Delete Nth node from end
    public static Node deleteNthNode(Node head, int n){
        Node fast = head;
        Node slow = head;
        for(int i=0; i<n; i++){
            fast = fast.next;
        }
        if( fast==null ){
            head = head.next;
            return head;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    static void printAll(Node head){
        while( head!=null ){
            System.out.print(head.data+" ");
            head = head.next;
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

        printAll(a);
        System.out.println();

        // Node value = NthNode(a, 2);
        // System.out.println(value.data);

        // Node value2 = NthNode2(a, 2);
        // System.out.println(value2.data);

        Node ans = deleteNthNode(a, 5);
        printAll(ans);
    }
}
