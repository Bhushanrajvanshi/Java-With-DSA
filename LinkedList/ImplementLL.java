package LinkedList;

public class ImplementLL {
    public static class  Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;

        int size = 0;
        public void insertAtEnd(int value){
            Node newNode = new Node(value);
            if( head==null ){
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
            size++;
        }

        public void insertAtStart(int value){
            Node newNode = new Node(value);
            if(head==null){
                // when list is empty, set both head and tail to new node
                // insertAtEnd(value);
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        public void insertAtAnywhere(int idx, int value){
            Node temp = new Node(value);
            Node t = head;
            if(idx==size) insertAtEnd(value);
            else if(idx==0) insertAtStart(value);
            else if(idx>size || idx<0){
                System.out.println("Invalid Index");
                return;
            }
            
            for(int i=1; i<idx; i++){
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;
            size++;
        }

        public void deleteAt(int idx){
            Node temp = head;
            for(int i=1; i<idx; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }

        int getValue(int idx){
            Node temp = head;
            if(idx>size || idx<0) return -1;
            for(int i=0; i<idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void displayLL(){
            Node current = head;
            while( current!=null ){
                System.out.print(current.data+" ");
                current = current.next;
            }
        }

        // int size(){
        //     int count = 0;
        //     Node current = head;
        //     while(current!=null){
        //         count++;
        //         current = current.next;
        //     }
        //     return count;
        // }
    }
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        list.insertAtEnd(8);
        list.insertAtEnd(20);
        list.insertAtStart(10);
        list.insertAtStart(15);
        list.insertAtAnywhere(2, 30);
        list.displayLL();
        System.out.println();
        System.out.println("Size of Linked List is: "+list.size);
        list.deleteAt(3);
        list.displayLL();
        System.out.println();
        System.out.println("Size of Linked List is: "+list.size);
        System.out.println(list.getValue(2));
        System.out.println(list.head.data);
        System.out.println(list.tail.data);   
    }
}
