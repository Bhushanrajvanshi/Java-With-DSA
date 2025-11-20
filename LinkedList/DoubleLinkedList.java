package LinkedList;

public class DoubleLinkedList {
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }

    static void printAll(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void pirntAllReverse(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }

    static void printAllWithRandom(Node random){
        Node temp = random;
        while(temp.prev!=null){
            temp = temp.prev;
        }

        // Now temp is at head and print the list
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node insertAtHead(Node head, int val){
        Node temp = new Node(val);
        temp.next = head;
        head.prev = temp;
        return temp;
    }

    public static Node insertAtTail(Node head, int val){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node t = new Node(val);
        temp.next = t;
        t.prev = temp;
        return head;
    }

    public static Node insertAtIdx(Node head, int idx, int val){
        Node temp = head;
        for(int i=1; i<idx; i++){
            temp = temp.next;
        }
        Node s = temp.next;
        Node t = new Node(val);
        temp.next = t;
        t.prev = temp;
        t.next = s;
        s.prev = t;
        return head;
    }

    public static Node deleteHead(Node head){
        head = head.next;
        head.prev = null;
        return head;
    }

    public static Node deleteTail(Node head){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.prev.next = null;
        return head;
    }

    public static Node deleteIdx(Node head, int idx){
        Node temp = head;
        for(int i=1; i<idx; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        printAll(a);
        // pirntAllReverse(e);
        // printAllWithRandom(c);

        // Node ans = insertAtHead(a, 29);
        // printAll(ans);

        // Node newAns = insertAtTail(a, 29);  
        // printAll(newAns);

        // Node newAns = insertAtIdx(a, 3, 29);  
        // printAll(newAns);

        // Node newAns = deleteHead(a);  
        // printAll(newAns);

        // Node newAns = deleteTail(a);  
        // printAll(newAns);

        Node newAns = deleteIdx(a, 3);  
        printAll(newAns);

    }
}
