package Stacks;

public class ArrayImplementation {
    public static class Stack{
        int[] arr = new int[5];
        int idx = 0;

        public void push(int data){
            if(idx==arr.length){
                System.out.println("Stack is full.");
                return;
            }
            arr[idx++] = data;
        }

        public int pop(){
            if(idx==0){
                System.out.println("Stack is empty.");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }

        public int peek(){
            if(idx==0){
                System.out.println("Stack is empty.");
                return -1;
            }
            return arr[idx-1];
        }
        public int size(){
            return idx;
        }

        public boolean isEmpty(){
            return idx==0;
        }

        public boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }
        public void print(){
            for(int i=0; i<idx; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }


        
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.isEmpty());
        st.push(4);
        System.out.println(st.isEmpty());
        st.push(8);
        st.push(9);
        st.push(10);
        st.push(11);
        st.print();
        System.out.println("Size of stack is "+st.size());
        // st.pop();
        st.print();
        // st.peek();
        // System.out.println(st.peek());
        st.push(12);

    }
}
