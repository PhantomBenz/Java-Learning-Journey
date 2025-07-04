import java.lang.reflect.Array;
import java.util.ArrayList;

public class BinarySearchTreeB {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void preorder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node createBalancedBST(int arr[], int s, int e) {
        if(s>e) {
            return null;
        }
        Node root = new Node(arr[(s+e)/2]);
        root.left = createBalancedBST(arr, s, (s+e)/2-1);
        root.right = createBalancedBST(arr, (s+e)/2+1, e);
        return root;
    }

    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if(root == null) {
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    public static Node convertToBalancedBST(Node root) {
        ArrayList<Integer> sortedarr = new ArrayList<>();
        getInorder(root, sortedarr);
        int arr[] = new int[sortedarr.size()];
        for(int i = 0; i < sortedarr.size(); i++) {     // or just create a new function createBalancedBST() for arraylist instead of array (overloading)
            arr[i] = sortedarr.get(i);
        }
        return createBalancedBST(arr, 0, arr.length-1);
    }

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxsizeBST = 0;
    public static Info largestBST(Node root) {
        if(root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.min(leftInfo.max, rightInfo.max));

        if(root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, min, max);
        }
        if(leftInfo.isBST && rightInfo.isBST) {
            maxsizeBST = Math.max(maxsizeBST, size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }

    public static Node createBalancedBST(ArrayList<Integer> arr, int s, int e) {
        if(s>e) {
            return null;
        }
        Node root = new Node(arr.get((s+e)/2));
        root.left = createBalancedBST(arr, s, (s+e)/2-1);
        root.right = createBalancedBST(arr, (s+e)/2+1, e);
        return root;
    }

    public static Node mergeBSTs(Node bst1, Node bst2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(bst1, arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(bst2, arr2);
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0, j = 0;
        while(i < arr1.size() && j < arr2.size()) {
            if(arr1.get(i) < arr2.get(j)) {
                arr.add(arr1.get(i));
                i++;
            }
            else {
                arr.add(arr2.get(j));
                j++;
            }
        }
        while(i < arr1.size()) {
            arr.add(arr1.get(i));
            i++;
        }
        while(j < arr2.size()) {
            arr.add(arr2.get(j));
            j++;
        }
        return createBalancedBST(arr, 0, arr.size()-1);
    }

    public static void main(String[] args) {
        int arr[] = {3,5,6,8,10,11,12};
        /*        root1 (expected)
                        8
                       / \
                      5   11
                     / \  / \
                    3  6 10 12
        */
        Node root = createBalancedBST(arr, 0, arr.length-1);
        preorder(root);
        System.out.println();

        Node root2 = new Node(5);
        root2.left = new Node(3);
        root2.left.left = new Node(2);
        root2.left.left.left = new Node(1);
        root2.right = new Node(6);
        root2.right.right = new Node(7);
        root2.right.right.right = new Node(10);

        /*         root2 (before)
                        5
                       / \
                      3   6
                     /     \
                    2       7
                   /         \
                  1           10
        */
        preorder(root2);
        System.out.println();
        root2 = convertToBalancedBST(root2);
        /*         root2 (after)
                        5
                       / \
                      2   7
                     / \ / \
                    1  3 6 10
        */
        preorder(root2);
        System.out.println();

        Node root3 = new Node(50);
        root3.left = new Node(30);
        root3.left.left = new Node(5);
        root3.left.right = new Node(20);
        root3.right = new Node(60);
        root3.right.left = new Node(45);
        root3.right.right = new Node(70);
        root3.right.right.left = new Node(65);
        root3.right.right.right = new Node(80);
        /*         root3  (not BST)
                        50
                       /  \
                     30    60
                    /  \   / \
                   5   20 45  70
                             /  \
                            65  80
                    expected size of BST = 5
        */
        largestBST(root3);
        System.out.println("Largest BST size = " + maxsizeBST);

        Node bst1 = new Node(2);
        bst1.left = new Node(1);
        bst1.right = new Node(4);

        Node bst2 = new Node(9);
        bst2.left = new Node(3);
        bst2.right = new Node(12);

        /*    bst1         bst2
                2           9
               / \         / \
              1   4       3   12
        */

        Node bts = mergeBSTs(bst1, bst2);
        /*           bts
                       3
                     /   \
                    1     9
                     \   / \
                      2 4  12
        */
        preorder(bts);
        System.out.println();
    }
}
