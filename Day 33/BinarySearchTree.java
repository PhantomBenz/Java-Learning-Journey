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
        int value[] = {5,1,3,4,2,7};
        for(int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }
        inorder(root);
        System.out.println();
    }    
}
