import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeB {
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

    static class Info {
        int diam;
        int ht;

        Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }
    
    static class BinaryTree {
        static int idx = -1;
        static Queue<Node> q = new LinkedList<>();
        public Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public void printPreorder(Node root) {  // O(n)
            if(root == null) {
                return;
            }
            System.out.print(root.data + " ");
            printPreorder(root.left);
            printPreorder(root.right);
        }

        public void printInorder(Node root) {
            if(root == null) {
                return;
            }
            printInorder(root.left);
            System.out.print(root.data + " ");
            printInorder(root.right);
        }

        public void printPostorder(Node root) {
            if(root == null) {
                return;
            }
            printPostorder(root.left);
            printPostorder(root.right);
            System.out.print(root.data + " ");
        }

        public void printLevelorder(Node root) {
            if(root == null) {
                return;
            }
            q.add(root);
            q.add(null);

            while(!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode == null) {
                    System.out.println();
                    if(q.isEmpty()) {
                        break;
                    }
                    else {
                        q.add(null);
                    }
                }
                else {
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if(currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        public int height(Node root) {
            if(root == null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh) + 1;
        }

        public int countNode(Node root) {
            if(root == null) {
                return 0;
            }
            int lc = countNode(root.left);
            int rc = countNode(root.right);
            return lc+rc+1;
        }

        public int sumNode(Node root) {
            if(root == null) {
                return 0;
            }
            int ls = sumNode(root.left);
            int rs = sumNode(root.right);
            return ls + rs + root.data;
        }

        public int diameter1(Node root) {   // TC : O(n^2)
            if(root == null) {
                return 0;
            }
            int ld = diameter1(root.left);
            int rd = diameter1(root.right);
            int lh = height(root.left);
            int rh = height(root.right);

            int sd = lh + rh + 1;

            return Math.max(ld, Math.max(rd, sd));
        }
    }

    public static Info diameter2(Node root) {   // TC : O(n)
        if(root == null) {
            return new Info(0,0);
        }

        Info li = diameter2(root.left);
        Info ri = diameter2(root.left);

        int diam = Math.max(li.diam,Math.max(li.ht+ri.ht+1, ri.diam));
        int ht = Math.max(li.ht,ri.ht) + 1;

        return new Info(diam,ht);
    }

    public static boolean isSubtree(Node root, Node subroot) {
        if(root == null) {
            return false;
        }
        if(root.data == subroot.data) {
            if(isIdentical(root, subroot)) {
                return true;
            }
        }
        boolean leftAns = isSubtree(root.left, subroot);
        boolean rightAns = isSubtree(root.right, subroot);

        return leftAns || rightAns;
    }

    public static boolean isIdentical(Node root, Node subroot) {
        if(root == null && subroot == null) {
            return true;
        }
        else if(root == null || subroot == null || root.data != subroot.data) {
            return false;
        }
        if(!isIdentical(root.left,subroot.left)) {
            return false;
        }  
        if(!isIdentical(root.right, subroot.right)){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};      // preorder of a binary tree

        /*
                 1
                / \
               2   3
              / \   \
             4   5   6

        */

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.print("Preorder : ");
        tree.printPreorder(root);
        System.out.print("\nInorder : ");
        tree.printInorder(root);
        System.out.print("\nPostorder : ");
        tree.printPostorder(root);
        System.out.println();
        System.out.println("Level order");
        tree.printLevelorder(root);
        System.out.println("Height of Tree: " + tree.height(root));
        System.out.println("Count of Nodes: " + tree.countNode(root));
        System.out.println("Sum of Nodes: " + tree.sumNode(root));
        System.out.println("(Approach 1) Diameter of Nodes: " + tree.diameter1(root));
        System.out.println("(Approach 2) Diameter of Nodes: " + diameter2(root).diam);

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);
        System.out.println("Subtree lies in tree : " + isSubtree(root, subroot));
    }
}
