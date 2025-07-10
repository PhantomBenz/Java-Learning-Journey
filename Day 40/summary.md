# Day 40 – Advanced Graph Algorithms in Java

Today I explored higher-level graph algorithms: **Bipartiteness checking**, **cycle detection in directed graphs**, and **Topological Sort** using adjacency lists (`GraphC.java`).

---

## 🔹 Graph Setup (`GraphC.java`)

```java
int V = 4;
@SuppressWarnings("unchecked")
ArrayList<Edge>[] graph = new ArrayList[V];
for (int i = 0; i < V; i++) graph[i] = new ArrayList<>();

static class Edge {
    int src, dest, wt;
    Edge(int s, int d, int w) { src = s; dest = d; wt = w; }
}
// Build edges for each test graph... (see main)
```

---

## 🔹 1. Bipartite Graph Check

Determines if vertices can be colored using two colors so that no edge connects same-colored vertices.

```java
public static boolean isBipartite(ArrayList<Edge>[] graph) {
    int col[] = new int[graph.length];
    Arrays.fill(col, -1);
    Queue<Integer> q = new LinkedList<>();

    for (int i = 0; i < graph.length; i++) {
        if (col[i] == -1) {
            q.add(i);
            col[i] = 0;
            while (!q.isEmpty()) {
                int curr = q.remove();
                for (Edge e : graph[curr]) {
                    if (col[e.dest] == -1) {
                        col[e.dest] = 1 - col[curr];
                        q.add(e.dest);
                    } else if (col[e.dest] == col[curr]) {
                        return false;
                    }
                }
            }
        }
    }
    return true;
}
```

* **Approach**: BFS-based coloring with two colors (0/1).
* **Time Complexity**: O(V + E).

---

## 🔹 2. Cycle Detection in Directed Graphs

Identifies cycles using DFS recursion stack tracking.

```java
public static boolean isCycle(ArrayList<Edge>[] graph) {
    boolean vis[] = new boolean[graph.length];
    boolean stack[] = new boolean[graph.length];
    for (int i = 0; i < graph.length; i++) {
        if (!vis[i] && isCycleUtil(graph, i, vis, stack))
            return true;
    }
    return false;
}

private static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], boolean stack[]) {
    vis[curr] = true;
    stack[curr] = true;

    for (Edge e : graph[curr]) {
        if (stack[e.dest]) return true;
        if (!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) return true;
    }
    stack[curr] = false;
    return false;
}
```

* **Approach**: DFS with a `stack[]` marking nodes in the current recursion path.
* **Detects** back-edges indicating cycles.
* **Time Complexity**: O(V + E).

---

## 🔹 3. Topological Sort (Directed Acyclic Graphs)

Outputs a linear ordering of vertices so that for every directed edge u→v, u comes before v.

```java
public static void topSort(ArrayList<Edge>[] graph) {
    boolean vis[] = new boolean[graph.length];
    Stack<Integer> stk = new Stack<>();

    for (int i = 0; i < graph.length; i++) {
        if (!vis[i]) topSortUtil(graph, i, vis, stk);
    }
    while (!stk.isEmpty()) System.out.print(stk.pop() + " ");
    System.out.println();
}

private static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], Stack<Integer> stk) {
    vis[curr] = true;
    for (Edge e : graph[curr]) {
        if (!vis[e.dest]) topSortUtil(graph, e.dest, vis, stk);
    }
    stk.push(curr);
}
```

* **Approach**: DFS post-order push onto stack.
* **Result**: Popping stack yields topological order.
* **Time Complexity**: O(V + E).

---

## Key Takeaways

* **Bipartite check** via BFS coloring detects odd-length cycles.
* **Directed cycle detection** uses recursion-stack tracking in DFS.
* **Topological sort** provides a valid linear ordering for DAGs, useful in scheduling and dependency resolution.
* Mastery of these algorithms enables solutions to complex graph problems like course scheduling, dependency graphs, and more.

---