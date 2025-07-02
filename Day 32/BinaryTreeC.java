import java.util.*;
import java.util.LinkedList;
public class BinaryTreeC {
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
        Node node;
        int hd;

        Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);
        while(!q.isEmpty()) {
            Info curr = q.remove();
            if(curr == null) {
                if(q.isEmpty()) {
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                if(!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }   
                if(curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
                if(curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }

            
        }
        for(int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void kLevel(Node root, int level, int k) {
        if(root == null) {
            return;
        }
        if(level == k) {
            System.out.print(root.data + " ");
        }
        kLevel(root.left, level+1, k);
        kLevel(root.right, level+1, k);
    }

    public static boolean getPath(ArrayList<Node> path, Node root, int data) {  // O(n)
        if(root == null) {
            return false;
        }
        path.add(root);
        if(root.data == data) {
            return true;
        }
        boolean foundleft = getPath(path, root.left, data);
        boolean foundright = getPath(path, root.right, data);

        if(foundleft || foundright) {
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }

    public static Node lowestCommonAnsestor1(Node root, int d1, int d2) {    // O(n)
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(path1, root, d1);
        getPath(path2, root, d2);
        int i = 0;
        for(; i < path1.size() && i < path2.size(); i++) {
            if(path1.get(i) != path2.get(i)) {
                break;
            }
        }
        Node lca = path1.get(i-1);
        return lca;
    }

    public static Node lowestCommonAnsestor2(Node root, int d1, int d2) {
        if(root == null || root.data == d1 || root.data == d2) {
            return root;
        }

        Node leftLca = lowestCommonAnsestor2(root.left, d1, d2);
        Node rightLca = lowestCommonAnsestor2(root.right, d1, d2);
        if(rightLca == null) {
            return leftLca;
        }
        if(leftLca == null) {
            return rightLca;
        }
        
        return root;
    }

    public static int distance(Node root, int d) {
        if(root == null) {
            return -1;
        }
        if(root.data == d) {
            return 0;
        }
        int leftDist = distance(root.left, d);
        int rightDist = distance(root.right, d);

        if(leftDist == -1 && rightDist == -1) {
            return -1;
        } 
        else if (leftDist == -1) {
            return rightDist+1;
        }
        else {
            return leftDist+1;
        }
    }

    public static int distanceBtnNodes(Node root, int d1, int d2) {
        Node lca = lowestCommonAnsestor2(root, d1, d2);
        int dist1=distance(lca, d1),dist2=distance(lca, d2);
        
        return dist1+dist2;
    }

    public static int kthAncestor(Node root, int d, int k) {
        if(root == null) {
            return -1;
        }
        if(root.data == d) {
            return 0;
        }
        int leftDist = kthAncestor(root.left, d, k);
        int rightDist = kthAncestor(root.right, d, k);

        if(leftDist == -1 && rightDist == -1) {
            return -1;
        } 

        int max = Math.max(leftDist, rightDist);
        if (max+1 == k) {
            System.out.println(root.data);
        }
        return max+1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        /*
                1
               / \
              2   3
             / \   \
            4   5   6
         */
        System.out.print("Nodes seen from top view : ");
        topView(root);
        int k = 3;
        System.out.print("Nodes in " + k + "th level : ");
        kLevel(root, 1, k);
        System.out.println();
        int d1 = 4, d2 = 6;
        System.out.println("(Appraoch 1)Lowest common ansestor of " + d1 + " and " + d2 + " = " + lowestCommonAnsestor1(root, d1, d2).data);
        System.out.println("(Appraoch 2)Lowest common ansestor of " + d1 + " and " + d2 + " = " + lowestCommonAnsestor2(root, d1, d2).data);
        System.out.println("Distance between " + d1 + " and " + d2 + " = " + distanceBtnNodes(root, d1, d2));
        int kth = 1;
        System.out.print(kth + "th ansestor of " + d1 + " = ");
        kthAncestor(root, d1, kth);
    }
}
