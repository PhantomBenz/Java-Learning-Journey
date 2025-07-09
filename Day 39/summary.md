# Day 39 – Graph Traversals & Components in Java

Today I delved deeper into **Graph** algorithms, implementing **Breadth-First Search (BFS)**, **Depth-First Search (DFS)**, **connectivity checks**, and **cycle detection** on an adjacency-list graph (`GraphB.java`).

---

## 🔹 Adjacency List Setup (`GraphB.java`)

```java
int V = 7;
@SuppressWarnings("unchecked")
ArrayList<Edge>[] graph = new ArrayList[V];
for (int i = 0; i < V; i++) graph[i] = new ArrayList<>();

// Adding undirected edges with weight=1
graph[0].add(new Edge(0, 1, 1)); graph[0].add(new Edge(0, 2, 1));
graph[1].add(new Edge(1, 0, 1)); graph[1].add(new Edge(1, 3, 1));
// ... (rest of edges) ...
```

`Edge` class:

```java
static class Edge {
    int src, dest, wt;
    Edge(int s, int d, int w) { src = s; dest = d; wt = w; }
}
```

---

## 🔹 Breadth-First Search (BFS)

* **Purpose**: Visit vertices in order of increasing distance from start.
* **Time**: O(V + E)

```java
public static void bfs(ArrayList<Edge>[] graph) {
    boolean vis[] = new boolean[graph.length];
    for (int i = 0; i < graph.length; i++) {
        if (!vis[i]) bfsUtil(graph, vis);
    }
    System.out.println();
}

private static void bfsUtil(ArrayList<Edge>[] graph, boolean vis[]) {
    Queue<Integer> q = new LinkedList<>();
    q.add(0);
    while (!q.isEmpty()) {
        int curr = q.remove();
        if (!vis[curr]) {
            System.out.print(curr + " ");
            vis[curr] = true;
            for (Edge e : graph[curr]) q.add(e.dest);
        }
    }
}
```

**Key Point**: Outer loop over `i` ensures disconnected components are also traversed.

---

## 🔹 Depth-First Search (DFS)

* **Purpose**: Explore as far as possible along each branch before backtracking.
* **Time**: O(V + E)

```java
public static void dfs(ArrayList<Edge>[] graph) {
    boolean vis[] = new boolean[graph.length];
    for (int i = 0; i < graph.length; i++) {
        if (!vis[i]) dfsUtil(graph, i, vis);
    }
    System.out.println();
}

private static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
    System.out.print(curr + " ");
    vis[curr] = true;
    for (Edge e : graph[curr]) {
        if (!vis[e.dest]) dfsUtil(graph, e.dest, vis);
    }
}
```

---

## 🔹 Path Existence & Cycle Detection

* **Has Path**: Determines if there is a route from `source` to `destination`

```java
public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean vis[]) {
    if (src == dest) return true;
    vis[src] = true;
    for (Edge e : graph[src]) {
        if (!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) return true;
    }
    return false;
}
```

* **Cycle Detection (Undirected)**: Uses DFS and tracks parent to detect a back-edge

```java
public static boolean detectCycle(ArrayList<Edge>[] graph) {
    boolean vis[] = new boolean[graph.length];
    for (int i = 0; i < graph.length; i++) {
        if (!vis[i] && detectCycleUtil(graph, vis, i, -1)) return true;
    }
    return false;
}

private static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int parent) {
    vis[curr] = true;
    for (Edge e : graph[curr]) {
        if (!vis[e.dest]) {
            if (detectCycleUtil(graph, vis, e.dest, curr)) return true;
        } else if (e.dest != parent) {
            return true;
        }
    }
    return false;
}
```

**Key Point**: Checking disconnected components and using `parent` avoids trivial backtracking.

---

## Key Takeaways

* Both **BFS** and **DFS** must handle disconnected graphs by iterating all vertices.
* **Path existence** via DFS allows early exit upon reaching destination.
* **Cycle detection** in undirected graphs leverages parent tracking to identify true cycles.
* Mastering these traversal and component algorithms lays groundwork for more advanced graph algorithms (shortest paths, MST, etc.).

---