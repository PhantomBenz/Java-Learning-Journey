# Day 37 – Tries (Prefix Trees) in Java

Today I learned about the **Trie** (prefix tree) data structure and implemented core operations—insert, search, prefix matching—plus solved advanced string‑based problems using Trie.

---

## 🔹 Trie Node Structure ([`TrieA.java`](./TrieA.java))

Each node stores:

* `children[26]`: pointers for lowercase letters `a–z`.
* `boolean eow`: marks end of a word.
* `int freq`: counts how many words pass through this node.

```java
static class Node {
    Node children[] = new Node[26];
    boolean eow = false;
    int freq = 0;

    Node() {
        for (int i = 0; i < 26; i++) children[i] = null;
        freq = 1;
    }
}
```

---

## 🔹 Insertion (O(L))

Inserts a word of length L, incrementing `freq` on existing nodes:

```java
public static void insert(String word, Node root) {
    Node curr = root;
    for (char ch : word.toCharArray()) {
        int idx = ch - 'a';
        if (curr.children[idx] == null)
            curr.children[idx] = new Node();
        else
            curr.children[idx].freq++;
        curr = curr.children[idx];
    }
    curr.eow = true;
}
```

---

## 🔹 Search & Prefix Checks (O(L))

### Exact Search

```java
public static boolean search(String key, Node root) {
    Node curr = root;
    for (char ch : key.toCharArray()) {
        int idx = ch - 'a';
        if (curr.children[idx] == null) return false;
        curr = curr.children[idx];
    }
    return curr.eow;
}
```

### startsWith (Prefix Exists)

```java
public static boolean startsWith(String prefix, Node root) {
    Node curr = root;
    for (char ch : prefix.toCharArray()) {
        int idx = ch - 'a';
        if (curr.children[idx] == null) return false;
        curr = curr.children[idx];
    }
    return true;
}
```

---

## 🔹 Advanced Trie Problems

### 1. Word Break (Recursive)

Checks if a string can be segmented into dictionary words:

```java
public static boolean wordBreak(String s, Node root) {
    if (s.isEmpty()) return true;
    for (int i = 1; i <= s.length(); i++) {
        if (search(s.substring(0, i), root) && wordBreak(s.substring(i), root))
            return true;
    }
    return false;
}
```

### 2. Shortest Unique Prefixes

Finds the minimal unique prefix for each word in a list:

```java
public static void findPrefix(String ans, Node root) {
    if (root == null) return;
    if (root.freq == 1) {
        System.out.print(ans + " ");
        return;
    }
    for (int i = 0; i < 26; i++) {
        if (root.children[i] != null)
            findPrefix(ans + (char)(i + 'a'), root.children[i]);
    }
}
```

### 3. Count Unique Substrings

By inserting all suffixes and counting nodes:

```java
public static int countNodes(Node root) {
    if (root == null) return 0;
    int count = 1; // count current node
    for (Node child : root.children)
        if (child != null) count += countNodes(child);
    return count;
}
```

---

## Programs Practiced

* `TrieA.java`: full implementation covering insert, search, `startsWith`, `wordBreak`, `findPrefix`, unique substring counting.

---

## Key Takeaways

* **Trie** provides O(L) time for prefix-based operations.
* `freq` counts at nodes enable **unique prefix** extraction.
* Recursive and backtracking approaches combine with Trie for **word breaking** and **substring** enumeration.

---
