public class StackLL {
    static class Node {
        public int data;
        public Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }    
    static class Stack {
        static Node head = null;

        public boolean isEmpty(){
            return head==null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int data = head.data;
            head = head.next;
            return data;
        }

        public int peek() {
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        s.peek();
    }
}
