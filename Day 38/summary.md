# Day 38 – Introduction to Graphs in Java

Today I learned the fundamentals of **Graphs**, their types, representations, and applications. I implemented a **Graph** using an **Adjacency List** (`GraphA.java`).

---

## 🔹 What Is a Graph?

* A **Graph** is a collection of **vertices** (nodes) and **edges** (connections) between them.
* Can model networks: social, transport, citation, web links, etc.

---

## 🔹 Types of Graphs (Based on Edges)

* **Directed vs Undirected**: Edges have direction or not.
* **Weighted vs Unweighted**: Edges carry weights (costs) or are unit.
* **Cyclic vs Acyclic**: Contains cycles or not (e.g., trees are acyclic undirected graphs).

---

## 🔹 Graph Representations

1. **Adjacency Matrix**: 2D array `adj[V][V]`, O(V²) space.
2. **Adjacency List**: Array of lists, `ArrayList<Edge>[] graph`, O(V + E) space.

### Adjacency List Implementation (`GraphA.java`)

```java
int V = 5;
@SuppressWarnings("unchecked")
ArrayList<Edge>[] graph = new ArrayList[V];
for (int i = 0; i < V; i++) {
    graph[i] = new ArrayList<>();
}
// Adding undirected, weighted edges:
graph[0].add(new Edge(0, 1, 5));
graph[1].add(new Edge(1, 0, 5));
graph[1].add(new Edge(1, 2, 1));
// ... (other edges) ...
```

* **Edge** class stores `src`, `dest`, and `wt`:

```java
static class Edge {
    int src, dest, wt;
    Edge(int s, int d, int w) {
        src = s; dest = d; wt = w;
    }
}
```

* **Traversal**: To list neighbors of vertex 2:

```java
for (Edge e : graph[2]) {
    System.out.println("2 has neighbor: " + e.dest + " with weight " + e.wt);
}
```

---

## 🔹 Graph Applications

* **Shortest Paths**: Dijkstra, Bellman–Ford, Floyd–Warshall.
* **Connectivity**: DFS/BFS to find components, cycles.
* **Minimum Spanning Tree**: Prim’s, Kruskal’s.
* **Topological Sorting**: In directed acyclic graphs (DAGs).
* **Network Flow**: Edmonds–Karp, Dinic’s algorithms.

---

## Key Takeaways

* Graphs generalize many structures: trees, lists, grids, networks.
* **Adjacency List** is the most space-efficient and common for sparse graphs.
* Edge class encapsulation simplifies weighted graph representation.
* Mastery of graph traversal and algorithms enables solving complex network problems.

---