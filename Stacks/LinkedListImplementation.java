package Stacks;

public class LinkedListImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static class StackLinkedList{
        Node head = null;
        int size = 0;

        void push(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is empty.");
                return -1;
            }
            int top = head.val;
            head = head.next;
            size--;
            return top;
        }
        
        int peek(){
            if(head==null){
                System.out.println("Stack is empty.");
                return -1;
            }
            return head.val;
        }

        int size(){
            return size;
        }

        void displayRec(Node h){
            if(h==null){
                return;
            }
            displayRec(h.next);
            System.out.print(h.val+" ");
        }
        
        void print(){
            displayRec(head);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        StackLinkedList st = new StackLinkedList();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.print();
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.print();
        System.out.println(st.size());
    }
}
