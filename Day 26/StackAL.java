import java.util.ArrayList;
public class StackAL {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty(){
            return list.size() == 0;
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int data = list.get(list.size()-1);
            list.remove(list.size()-1);
            return data;
        }

        public int peek() {
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        System.out.println(s.peek());
    }
}
