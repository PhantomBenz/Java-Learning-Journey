public class TrieA {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;
        int freq = 0;

        Node() {
            for(int i = 0; i < 26; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }    

    public static void insert(String word, Node root) {    // TC : O(L) ; L = largest word's len
        Node curr = root;
        for(int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key, Node root) {
        Node curr = root;
        for(int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i)-'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    // Word Break Problem
    public static Node root2 = new Node();

    public static boolean wordBreak(String key, Node root) {
        if(key.length() == 0) {
            return true;
        }
        for(int i = 1; i <= key.length(); i++) {
            if(search(key.substring(0, i),root) &&
                wordBreak(key.substring(i),root)){
                    return true;
            }
            key.substring(i);
        }

        return false;
    }

    // Prefix Problem
    public static void findPrefix(String ans, Node root) {
        if(root == null) {
            return;
        }
        if(root.freq == 1) {
            System.out.print(ans + " ");
            return;
        }
        for(int i = 0; i < root.children.length; i++) {
            if(root.children[i] != null) {
                findPrefix(ans + (char)(i+'a'), root.children[i]);
            }
        }
    }

    // startsWith Problem
    public static boolean startsWith(String prefix, Node root) {
        Node curr = root;
        for(int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i)-'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    // Count unique substings
    public static int countNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int count = 0;
        for(int i = 0; i < 26; i++) {
            if(root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        Node root1 = new Node();
        String words[] = {"the","a","there","their","any","thee"};
        for (String str : words) {
            insert(str, root1);
        }
        String key1 = "an";
        System.out.println("\"" + key1 + "\" in trie : " + search(key1,root1));

        // Word Break Problem
        Node root2 = new Node();
        String arra[] = {"i","like","sam","samsung","mobile","ice"};
        for (String str : arra) {
            insert(str, root2);
        }
        String key2 = "icelikemobile";
        System.out.println(key2 + " : " + wordBreak(key2, root2));

        // Prefix problem
        // Find shortest unique prefix for everyword in a given list.
        // Assume no word is prefix of another
        String arrb[] = {"zebra","dog","duck","dove"};
        Node root3 = new Node();
        for (String str : arrb) {
            insert(str, root3);
        }
        root3.freq = -1;
        findPrefix("", root3);
        System.out.println();

        /*
            startsWith Problem
            Create a function boolean startsWith(String prefix) for a trie.
            Retruns true if there is a previously inserted string word that has the prefix, and false otherwise.
        */
        Node root4 = new Node();
        String wordss[] = {"apple","app","mango","man","woman"};
        for (String str : wordss) {
            insert(str, root4);
        }
        String prefix = "ma";
        System.out.println("\"" + prefix + "\" prefix presence : " + startsWith(prefix, root4));

        /*
            Count Unique Substrings
            Given a string of length n of lowercase alphabet characters,
            we need to count total number of distinct substrings of this string.
        */
        Node root5 = new Node();
        String strs = "ababa";
        for(int i = 0; i < strs.length(); i++) {
            insert(strs.substring(i), root5);
        }
        System.out.println("Count of Unique substrings of \"" + strs + "\" = " + countNodes(root5));
    }
}
