import java.util.*;
import java.util.LinkedList;
public class GraphC {
    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        int col[] = new int[graph.length];
        for(int i = 0; i < col.length; i++) {
            col[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < graph.length; i++) {
            if(col[i] == -1) {
                q.add(i);
                col[i] = 0;
                while(!q.isEmpty()) {
                    int curr = q.remove();
                    for(int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        if(col[e.dest] == -1) {
                            int next_col = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = next_col;
                            q.add(e.dest);
                        }
                        else if(col[e.dest] == col[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean isCycle(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++) {
            if(!vis[i]) {
                if(isCycleUtil(graph, i, vis, stack)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], boolean stack[]) {
        vis[curr] = true;
        stack[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(stack[e.dest]) {
                return true;
            }
            if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) {
                return true;
            }
        }
        return false;
    }

    // Topological Sort
    public static void topSort(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        
        for(int i = 0; i < graph.length; i++) {
            if(!vis[i]) {
                topSortUtil(graph, i, vis, s);
            }
        }

        while(!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
        System.out.println();
    }

    public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                topSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void main(String[] args) {
        // Bipartite Graph
        /*
            A Bipartite Graph is a graph whose vertices can be divided into two independent sets, 
            U and V such that every edge (u,v) either connects a vertex from U to V or a vetex from V to U.
            In other words, for every edge (u,v), either u belongs to U and v to V, or u belongs to V and v to U.
            We can say that there is no edge that connects vetices of same set.
        */
        // Acyclic graph - True
        // Even Cycle    - True
        // Odd  Cycle    - False
        /* 
                  0
                 / \
                1   2
                 \ /
                  3 
        */
        int V1 = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph1 = new ArrayList[V1];
        for(int i = 0; i < V1; i++) {
            graph1[i] = new ArrayList<>();
        }
        // 0 - vertex
        graph1[0].add(new Edge(0, 1, 1));
        graph1[0].add(new Edge(0, 2, 1));
        // 1 - vertex
        graph1[1].add(new Edge(1, 0, 1));
        graph1[1].add(new Edge(1, 3, 1));
        // 2 - vertex
        graph1[2].add(new Edge(2, 0, 1));
        graph1[2].add(new Edge(2, 3, 1));
        // 3 - vertex
        graph1[3].add(new Edge(3, 2, 1));
        graph1[3].add(new Edge(3, 1, 1));

        System.out.println("Graph is Bipartite : " + isBipartite(graph1));

        int V2 = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph2 = new ArrayList[V2];
        for(int i = 0; i < graph2.length; i++) {
            graph2[i] = new ArrayList<>();
        }
        graph2[0].add(new Edge(0, 2, 1));
        graph2[1].add(new Edge(1, 0, 1));
        graph2[2].add(new Edge(2, 3, 1));
        graph2[3].add(new Edge(3, 0, 1));
        /*
                      -->2 ---> 3
                     /         /
             1 ---> 0 <--------  
                         
        */
        System.out.println("Graph is cyclic : " + isCycle(graph2));

        topSort(graph2);
    }
}
