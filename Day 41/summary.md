# Day 41 – Advanced Graph Techniques in Java

Today I implemented **Kahn’s Topological Sort**, **All Paths from Source to Target**, and **Dijkstra’s Shortest Path** algorithm on weighted graphs using adjacency lists (`GraphD.java`).

---

## 🔹 Kahn’s Topological Sort (BFS-based)

Compute a topological ordering for a DAG by repeatedly removing nodes with zero in-degree.

```java
public static void topSort(ArrayList<Edge>[] graph) {
    int indeg[] = new int[graph.length];
    calcIndeg(graph, indeg);
    Queue<Integer> q = new LinkedList<>();

    // Enqueue all vertices with in-degree = 0
    for (int i = 0; i < indeg.length; i++) {
        if (indeg[i] == 0) q.add(i);
    }

    // Process until queue is empty
    while (!q.isEmpty()) {
        int curr = q.remove();
        System.out.print(curr + " ");

        // Decrease in-degree of neighbors
        for (Edge e : graph[curr]) {
            if (--indeg[e.dest] == 0) q.add(e.dest);
        }
    }
    System.out.println();
}

public static void calcIndeg(ArrayList<Edge>[] graph, int indeg[]) {
    for (int u = 0; u < graph.length; u++) {
        for (Edge e : graph[u]) {
            indeg[e.dest]++;
        }
    }
}
```

**Key Points**:

* Build an in-degree array,
* Use BFS queue to emit vertices in valid order.
* Runs in O(V + E).

---

## 🔹 All Paths from Source to Target (DFS)

Recursively enumerate every path from node `s` to `d` by backtracking.

```java
public static void paths(ArrayList<Edge>[] graph, int s, int d, String path) {
    if (s == d) {
        System.out.println(path + d);
        return;
    }
    for (Edge e : graph[s]) {
        paths(graph, e.dest, d, path + s + " ");
    }
}
```

**Usage**: Call `paths(graph, src, dest, "")` to print all routes.

---

## 🔹 Dijkstra’s Shortest Path

Find shortest distances from source `s` to all vertices in a weighted graph using a min-priority queue.

```java
static class Pair implements Comparable<Pair> {
    int node, dist;
    Pair(int n, int d) { node = n; dist = d; }
    public int compareTo(Pair o) { return this.dist - o.dist; }
}

public static void dijkstra(ArrayList<Edge>[] graph, int s) {
    int dist[] = new int[graph.length];
    Arrays.fill(dist, Integer.MAX_VALUE);
    dist[s] = 0;
    boolean vis[] = new boolean[graph.length];

    PriorityQueue<Pair> pq = new PriorityQueue<>();
    pq.add(new Pair(s, 0));

    while (!pq.isEmpty()) {
        Pair p = pq.remove();
        if (vis[p.node]) continue;
        vis[p.node] = true;

        for (Edge e : graph[p.node]) {
            if (dist[p.node] + e.wt < dist[e.dest]) {
                dist[e.dest] = dist[p.node] + e.wt;
                pq.add(new Pair(e.dest, dist[e.dest]));
            }
        }
    }

    // Output distances
    for (int d : dist) System.out.print(d + " ");
    System.out.println();
}
```

**Key Points**:

* Maintains distance array and visited set.
* Uses `Pair(node, dist)` in a min-heap for next closest vertex.
* Time: O((V+E) log V).

---