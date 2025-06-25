public class DoublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head;
    public Node tail;
    public static int size=1;
    
    public void addFirst(int data){
        Node NewNode = new Node(data);
        if (head == null){
            head = tail = NewNode;
            return;
        }
        NewNode.next = head;
        head.prev = NewNode;
        size++;
        head = NewNode;
    }
    
    public void addLast(int data){
        Node NewNode = new Node(data);
        if (head == null){
            head = tail = NewNode;
            return;
        }
        tail.next = NewNode;
        NewNode.prev = tail;
        size++;
        tail = NewNode;
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size --;
            return val;
        }
        int data = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return data;
    }

    public int removeLast(){
        if(tail == null){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size --;
            return val;
        }
        Node temp = tail.prev;
        int data;
        data = tail.data;
        temp.next = null;
        tail = temp;
        size --;
        return data;
    }
    
    public void printList(){
        Node NewNode = head;
        while(NewNode != null){
            System.out.print(NewNode.data + "<->");
            NewNode = NewNode.next;
        }
        System.out.println("null");
    }
    
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String args[]){
        DoublyLL ll = new DoublyLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printList();
        ll.removeLast();
        ll.removeFirst();
        ll.printList();
        ll.addFirst(1);
        ll.addLast(5);
        ll.printList();
        ll.reverse();
        ll.printList();
    }
}
