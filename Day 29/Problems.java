import java.util.*;
import java.util.LinkedList;
public class Problems {
    public static void nonRepeating(String str) {
        int freq[] = new int[26],n;
        Queue<Character> q = new LinkedList<>();
        for(int i = 0; i < str.length(); i++) {
            q.add(str.charAt(i));
            n = str.charAt(i) - 'a';
            freq[n]++;
            while(!q.isEmpty() && freq[q.peek()-'a'] > 1) {
                q.remove();
            }
            System.out.print(q.peek() + " ");
        }
        System.out.println();
    }

    public static void interleave(Queue<Integer> q) {
        Queue<Integer> qf = new LinkedList<>();
        int n = (q.size())/2;
        for(int i = 0; i < n; i++) {
            qf.add(q.remove());
        }
        while (!qf.isEmpty()) {
            q.add(qf.remove());
            q.add(q.remove());
        }
    }

    public static void reverse(Queue<Integer> q1) {
        Stack<Integer> s = new Stack<>();
        while(!q1.isEmpty()) {
            s.push(q1.remove());
        }
        while(!s.isEmpty()) {
            q1.add(s.pop());
        }
    }

    static class StackD {
        Deque<Integer> deque = new LinkedList<>();

        public boolean isEmpty() {
            if(deque.isEmpty()){
                return true;
            }
            return false;
        }

        public void push(int data) {
            deque.addFirst(data);
        }

        public void pop() {
            deque.removeFirst();
        }

        public int peek() {
            return deque.peekFirst();
        }
    }

    static class QueueD {
        Deque<Integer> deque = new LinkedList<>();

        public boolean isEmpty() {
            if(deque.isEmpty()){
                return true;
            }
            return false;
        }

        public void add(int data) {
            deque.addFirst(data);
        }

        public void remove() {
            deque.removeLast();
        }

        public int peek() {
            return deque.peekLast();
        }
    }

    public static void main(String[] args) {
        // Problem 1 : First Non-repeating letter in a stream of characters.
        nonRepeating("aabccxb");

        // Problem 2 : Interleave 2 Halves of a Queue (even length)
        // given : 1 2 3 4 5 6 7 8 9 10
        // final output : 1 6 2 7 3 8 4 9 5 10
        Queue<Integer> q = new LinkedList<>();
        q.add(1);q.add(2);q.add(3);q.add(4);q.add(5);q.add(6);q.add(7);q.add(8);q.add(9);q.add(10);
        interleave(q);
        System.out.println(q);

        // Problem 3 : Queue Reversal
        Queue<Integer> qr = new LinkedList<>();
        qr.add(1);qr.add(2);qr.add(3);qr.add(4);qr.add(5);
        reverse(qr);
        System.out.println(qr);

        // Problem 4 : Stack and Queue using Deque
        StackD s = new StackD();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
        System.out.println();
        QueueD queue = new QueueD();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        while(!queue.isEmpty()) {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
        System.out.println();
    }
}
