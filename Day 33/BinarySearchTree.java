public class BinarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }
        if(root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean searchKey(Node root, int k) {
        if(root == null) {
            return false;
        }
        if(root.data == k) {
            return true;
        }
        else if(root.data > k) {
            return searchKey(root.left, k);
        }
        else {
            return searchKey(root.right, k);
        }
    }

    public static Node deleteNode(Node root, int data) {
        if(root == null) { 
            return null;
        }
        else if(root.data < data) {
            root.left = deleteNode(root.left, data);
        }
        else if(root.data>data){
            root.right = deleteNode(root.right, data);
        }
        else{
            if(root.left == null && root.right == null) {
                return null;
            }
            else if(root.left == null) {
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printInRage(Node root, int min, int max) {
        if(root == null) {
            return;
        }
        if(root.data >= min && root.data <= max) {
            printInRage(root.left, min, max);
            System.out.print(root.data + " ");
            printInRage(root.right, min, max);
        }
        else if (root.data < min) {
            printInRage(root.left, min, max);
        }
        else {
            printInRage(root.right, min, max);
        }
    }

    public static void main(String[] args) {
        // Node root = new Node(4);
        // root.left = new Node(2);
        // root.left.left = new Node(1);
        // root.left.right = new Node(3);
        // root.right = new Node(5);
        // root.right.right = new Node(6);
        /*
                    4
                   / \
                  2   5
                 / \   \
                1   3   6
        */
        Node root = null;
        int value[] = {8,5,3,1,4,6,10,11,14};
        for(int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }
        inorder(root);
        System.out.println();
        int key = 7;
        System.out.println(key + " is present in BST : " + searchKey(root, key));

        root = deleteNode(root, 8);
        inorder(root);
        System.out.println();

        printInRage(root, 5, 12);
        System.out.println();
    }    
}
