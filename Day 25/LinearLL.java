public class LinearLL {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
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
    
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = (fast.next).next;
        }
        return slow;
    }

    public Node merge(Node LLL, Node RLL){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(LLL != null && RLL != null){
            if(LLL.data <= RLL.data){
                temp.next = LLL;
                LLL = LLL.next;
            }
            else {
                temp.next = RLL;
                RLL = RLL.next;
            }
            temp = temp.next;
        }
        while(LLL != null){
            temp.next = LLL;
            LLL = LLL.next;
            temp = temp.next;
        }
        while(RLL != null){
            temp.next = RLL;
            RLL = RLL.next;
            temp = temp.next;
        }
        mergedLL = mergedLL.next;
        return mergedLL;
    }

    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid = findMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft, newRight);
    }

    public void zigZag(){
        // find mid
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //alt merge 
        while(left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {
        LinearLL ll = new LinearLL();
        ll.addFirst(1);;
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        // 5->4->3->2->1->null

        ll.printList();
        ll.head = ll.mergeSort(ll.head);    // TC : O(nlogn)
        ll.printList();

        // Zig-Zag LL
        ll.zigZag();
        ll.printList();
    }
}
