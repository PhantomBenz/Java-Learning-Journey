import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueueA {
    static class Student implements Comparable<Student>{    // overriding 
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    // For nearby cars problem
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSq;
        public int idx;

        Point(int x, int y, int idx) {
            this.x = x;
            this.y = y;
            distSq = x*x + y*y;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distSq - p2.distSq;
        }
    }

    public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3);      // O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()) {
            System.out.print(pq.peek()+ " "); // O(1)
            pq.remove(); // O(logn)
        }
        System.out.println();

        PriorityQueue<Integer> pqr = new PriorityQueue<>(Comparator.reverseOrder());

        pqr.add(3);      // O(logn)
        pqr.add(4);
        pqr.add(1);
        pqr.add(7);

        while(!pqr.isEmpty()) {
            System.out.print(pqr.peek()+ " "); // O(1)
            pqr.remove(); // O(logn)
        }
        System.out.println();

        PriorityQueue<Student> pqs = new PriorityQueue<>();

        pqs.add(new Student("Sumoon", 867));      // O(logn)
        pqs.add(new Student("Asim", 175));
        pqs.add(new Student("Suhan", 470));
        pqs.add(new Student("Galij", 670));

        System.out.println();
        while(!pqs.isEmpty()) {
            System.out.println(pqs.peek().name + " -> " + pqs.peek().rank); // O(1)
            pqs.remove(); // O(logn)
        }
        System.out.println();


        // Nearby car problems
        int pts[][] = {{3,3}, {5,-1}, {-2,4}};
        int k = 2;
        PriorityQueue<Point> pqC = new PriorityQueue<>();
        for(int i = 0; i < pts.length; i++) {
            pqC.add(new Point(pts[i][0],pts[i][1],i));
        }

        for(int i = 0; i < k; i++) {
            System.out.print("C" + pqC.remove().idx + " ");
        }
        System.out.println();

        
        // Connect N Ropes Problem
        int cost = 0;
        PriorityQueue<Integer> ropes = new PriorityQueue<>();
        ropes.add(4);
        ropes.add(3);
        ropes.add(3);
        ropes.add(2);
        ropes.add(6);
        while(ropes.size()>1) {
            int min1 = ropes.remove();
            int min2 = ropes.remove();
            cost += min1 + min2;
            ropes.add(min1+min2);
        }
        System.out.println();
        System.out.println(cost);
    }
}