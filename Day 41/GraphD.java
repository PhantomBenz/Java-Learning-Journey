import java.util.*;
import java.util.LinkedList;
public class GraphD {
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

    // using BFS
    public static void topSort(ArrayList<Edge>[] graph) {
        int indeg[] = new int[graph.length];
        calcIndeg(graph, indeg);
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < indeg.length; i++) {
            if(indeg[i] == 0) {
                q.add(i);
            }
        }

        while(!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for(int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void calcIndeg(ArrayList<Edge> graph[], int indeg[]) {
        for(int i = 0; i < graph.length; i++) {
            int v = i;
            for(int j = 0; j < graph[v].size(); j++) {
                Edge e = graph[v].get(j);
                indeg[e.dest]++;
            }
        }
    }

    // All Paths from Source to Target
    public static void paths(ArrayList<Edge> graph[], int s, int d, String path) {
        if(s == d) {
            System.out.println(path + d);
            return;
        }
        for(int i = 0; i < graph[s].size(); i++) {
            Edge e = graph[s].get(i);
            paths(graph,e.dest,d,path + s + " ");
        }
    }

    // Dijkstra's Algorithm
    /*
        Shortest paths from the source to all vertices (weighted graph)
    */
    static class Pair implements Comparable<Pair> {
        int n;
        int path;

        Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;
        }
    }

    public static void dijkstra(ArrayList<Edge>[] graph, int s) {
        int dist[] = new int[graph.length];
        for(int i = 0; i < graph.length; i++) {
            if(i != s) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[graph.length];
        pq.add(new Pair(s, 0));

        while(!pq.isEmpty()) {
            Pair curr =pq.remove();
            if(!vis[curr.n]) {
                vis[curr.n] = true;
            }

            for(int i = 0; i < graph[curr.n].size();i++) {
                Edge e = graph[curr.n].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if(dist[u]+wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }

        for(int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V1 = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph1 = new ArrayList[V1];
        for(int i = 0; i < graph1.length; i++) {
            graph1[i] = new ArrayList<>();
        }
        // 0 - vertex
        // 1 - vertex
        // 2 - vertex
        graph1[2].add(new Edge(2, 3, 1));
        // 3 - vertex
        graph1[3].add(new Edge(3, 1, 1));
        // 4 - vertex
        graph1[4].add(new Edge(4, 0, 1));
        graph1[4].add(new Edge(4, 1, 1));
        // 5 - vertex
        graph1[5].add(new Edge(5, 0, 1));
        graph1[5].add(new Edge(5, 2, 1));

        topSort(graph1);

        int V2 = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph2 = new ArrayList[V2];
        for(int i = 0; i < graph2.length; i++) {
            graph2[i] = new ArrayList<>();
        }
        // 0 - vertex
        graph2[0].add(new Edge(0, 3, 1));
        // 1 - vertex
        // 2 - vertex
        graph2[2].add(new Edge(2, 3, 1));
        // 3 - vertex
        graph2[3].add(new Edge(3, 1, 1));
        // 4 - vertex
        graph2[4].add(new Edge(4, 0, 1));
        graph2[4].add(new Edge(4, 1, 1));
        // 5 - vertex
        graph2[5].add(new Edge(5, 0, 1));
        graph2[5].add(new Edge(5, 2, 1));

        int src = 5, dest = 1;
        paths(graph2, src, dest, "");

        int V3 = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph3 = new ArrayList[V3];
        for(int i = 0; i < graph3.length; i++) {
            graph3[i] = new ArrayList<>();
        }
        // 0 - vertex
        graph3[0].add(new Edge(0, 1, 2));
        graph3[0].add(new Edge(0, 2, 4));
        // 1 - vertex
        graph3[1].add(new Edge(1, 2, 1));
        graph3[1].add(new Edge(1, 3, 7));
        // 2 - vertex
        graph3[2].add(new Edge(2, 4, 3));
        // 3 - vertex
        graph3[3].add(new Edge(3, 5, 1));
        // 4 - vertex
        graph3[4].add(new Edge(4, 3, 2));
        graph3[4].add(new Edge(4, 5, 5));
        // 5 - vertex

        int s3 = 0;
        dijkstra(graph3, s3);
    }
}
