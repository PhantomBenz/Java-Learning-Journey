public class CircularQueueArray {
    static class Queue {
        static int arr[];
        static int rear,size,front;

        Queue(int data) {
            arr = new int[data];
            size = data;
            front = -1;
            rear = -1;
        }

        public boolean isEmpty() {
            if(rear==-1 && front==-1) {
                return true;
            }
            return false;
        }

        public boolean isFull() {
            if(front == (rear+1)%size) {
                return true;
            }
            return false;
        }

        public void add(int data) {
            if(isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if(rear==-1 && front==-1) {
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public int remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int data = arr[front];
            if(front == rear) {
                rear = front = -1;
            }
            else {
                front = (front+1)%size;
            }
            return data;
        }

        public int peek() {
            if(isEmpty()) {
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println((q.remove()));
        q.add(4);
        System.out.println((q.remove()));
        q.add(5);
        while(!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
