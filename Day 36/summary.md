# Day 36 – HashMaps & HashSets in Java

Today I practiced Java’s **HashMap** and **HashSet** (JCF) and implemented a custom hash map from scratch. I solved various common problems such as itinerary reconstruction, majority elements, anagram checking, and subarray sum queries.

---

## 🔹 Java JCF `HashMap` & `HashSet` ([`HashMapJCF.java`](./HashMapJCF.java), [`HashSetJCF.java`](./HashSetJCF.java))

### HashMap Basics

* **Creation & Insertion** (O(1) average):

  ```java
  HashMap<String, Integer> hm = new HashMap<>();
  hm.put("Coffee", 50);
  hm.put("Pizza", 150);
  ```
* **Update & Get** (O(1)):

  ```java
  hm.put("Pizza", 200);          // overwrite value
  int price = hm.get("Pizza");  // returns 200
  ```
* **Contains, Remove, Size, Clear** (O(1)):

  ```java
  hm.containsKey("Coffee");
  hm.remove("Burger");
  int n = hm.size();
  hm.clear();
  ```
* **Iteration over keys**:

  ```java
  for (String k : hm.keySet()) {
      System.out.println(k + " -> " + hm.get(k));
  }
  ```

### Variants: `LinkedHashMap` & `TreeMap`

* **`LinkedHashMap`** preserves insertion order.
* **`TreeMap`** sorts keys ascending.

### HashSet Basics

* **Creation & Add** (O(1)):

  ```java
  HashSet<Integer> set = new HashSet<>();
  set.add(1);
  set.add(4);
  ```
* **Contains & Remove** (O(1)):

  ```java
  set.contains(2);
  set.remove(2);
  ```
* **Iteration**:

  ```java
  for (String city : cities) System.out.println(city);
  ```
* **Variants**: `LinkedHashSet` (insertion order), `TreeSet` (sorted order).

---

## 🔹 Custom `HashMap` Implementation ([`HashMapCode.java`](./HashMapCode.java))

A simple **generic** hash map using **chaining** (array of linked lists) and **rehashing**:

```java
private int hashFunction(K key) {
    int hc = key.hashCode();
    return Math.abs(hc) % N;
}

public void put(K key, V value) {
    int bi = hashFunction(key);
    int di = SearchInLL(key, bi);
    if (di != -1) {
        buckets[bi].get(di).value = value; // update
    } else {
        buckets[bi].add(new Node(key, value));
        n++;
    }
    double lambda = (double)n / N;
    if (lambda > 2.0) rehash();
}
```

* **SearchInLL** finds index in bucket’s list.
* **Rehash** doubles bucket array size and reinserts all entries to reduce collisions.

---

## 🔹 Problem Solving with Hash Structures

### 1. **Find Itinerary from Tickets** (`getStart`)

Reverses the map to find the starting city:

```java
HashMap<String, String> revMap = new HashMap<>();
for (String src : tickets.keySet()) {
    revMap.put(tickets.get(src), src);
}
for (String src : tickets.keySet()) {
    if (!revMap.containsKey(src)) return src;
}
```

### 2. **Majority Element (> n/3)**

Counts frequencies with `getOrDefault`:

```java
for (int x : arr)
    map.put(x, map.getOrDefault(x, 0) + 1);
for (int key : map.keySet())
    if (map.get(key) > arr.length/3) System.out.println(key);
```

### 3. **Valid Anagram**

Builds and updates a frequency map:

```java
for (char ch : s.toCharArray())
    vhm.put(ch, vhm.getOrDefault(ch, 0) + 1);

for (char ch : t.toCharArray()) {
    if (vhm.get(ch) != null) {
        if (vhm.get(ch) == 1) vhm.remove(ch);
        else vhm.put(ch, vhm.get(ch) - 1);
    } else same = false;
}
same = same && vhm.isEmpty();
```

### 4. **Largest Subarray with Zero Sum**

Uses `LinkedHashMap` to track first occurrence of prefix sums:

```java
LinkedHashMap<Integer, Integer> sumIdx = new LinkedHashMap<>();
int sum = 0, len = 0;
for (int i = 0; i < arr.length; i++) {
    sum += arr[i];
    if (sumIdx.containsKey(sum))
        len = Math.max(len, i - sumIdx.get(sum));
    else sumIdx.put(sum, i);
}
```

### 5. **Subarray Sum Equals K (Count)**

Counts all subarrays summing to `k`:

```java
map.clear(); map.put(0, 1);
int count = 0, sum = 0;
for (int x : arr) {
    sum += x;
    if (map.containsKey(sum - k)) count += map.get(sum - k);
    map.put(sum, map.getOrDefault(sum, 0) + 1);
}
```

---

## Key Takeaways

* **HashMap/HashSet** offer O(1) average operations for insertion, lookup, and removal.
* **Custom hash map** deepens understanding of collision handling and resizing.
* **Frequency maps** and **prefix sums** solve many interview problems elegantly.
* Choosing the right hash variant (`LinkedHashMap`, `TreeMap`) affects order and performance.

---
