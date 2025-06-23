public class a_LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size=1;

    public void addFirst(int data){
        Node NewNode = new Node(data);
        if (head == null){
            head = tail = NewNode;
            return;
        }
        NewNode.next = head;
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
        size++;
        tail = NewNode;
    }

    public void printList(){
        Node NewNode = head;
        while(NewNode != null){
            System.out.print(NewNode.data + "->");
            NewNode = NewNode.next;
        }
        System.out.println("null");
    }

    public void addMid(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node NewNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            i++;
            temp = temp.next;
        }
        NewNode.next = temp.next;
        size++;
        temp.next = NewNode;
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public int removeLast(){
        if(tail == null){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        Node temp = head;
        int data;
        while(temp.next!=tail){
            temp = temp.next;
        }
        data = tail.data;
        temp.next = null;
        tail = temp;
        size --;
        return data;
    }

    public int searchInteratively(int value){
        int i=0;
        Node temp = head;
        while(temp!=null){
            if(temp.data == value){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    public int helper(int key, Node head){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(key, head.next);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int searchRecursively(int key){
        return helper(key,head);
    }

    public void reverse(){
        Node next;
        Node prev = null;
        Node current = tail = head;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public int removeNthNodeFromEnd(int idx){
        if(idx == size){
            return removeFirst();
        }
        else if(idx == 1){
            return removeLast();
        }
        int i = 0, n = size - idx - 1;
        Node temp = head;
        while(i != n){
            temp = temp.next;
            i++;
        }
        int data = (temp.next).data;
        temp.next = (temp.next).next;
        size--;
        return data;
    }

    public static void main(String[] args) {
        a_LinkedList ll = new a_LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMid(2, 5);
        ll.addFirst(16);
        ll.addLast(50);
        ll.printList();
        System.out.println(ll.removeFirst());
        ll.printList();
        System.out.println(ll.removeLast());
        ll.printList();
        System.out.println("Size = " + size);
        System.out.println("5 is at index : " + ll.searchInteratively(5));
        System.out.println("4 is at index : " + ll.searchRecursively(4));
        System.out.println("10 is at index : " + ll.searchRecursively(10));
        ll.reverse();
        ll.printList();
        System.out.println("2nd last value removed is : " + ll.removeNthNodeFromEnd(2)); // considering last node's index is 1
        ll.printList();
    }    
}
