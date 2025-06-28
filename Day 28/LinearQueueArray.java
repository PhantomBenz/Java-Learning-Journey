public class LinearQueueArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void add(int data) {                  // TC = O(1)
            if(rear == size-1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
            System.out.println(data + " is added.");
        }

        public int remove() {                        // TC = O(n)
            if(isEmpty()) {
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        public int peek() {                          // TC = O(1)
            if(isEmpty()) {
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(20);
        q.add(300);
        while(!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
