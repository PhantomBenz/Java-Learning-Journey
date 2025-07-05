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

    // Weakest Soldier Problem
    static class Row implements Comparable<Row> {
        int soldiers;
        int idx;

        public Row(int soldiers, int idx) {
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2) {
            if(this.soldiers == r2.soldiers) {
                return this.idx - r2.idx;
            }
            else {
                return this.soldiers - r2.soldiers;
            }
        }
    }

    // Sliding window problem
    static class Win implements Comparable<Win> {
        int data;
        int idx;
        public Win(int data, int idx) {
            this.data = data;
            this.idx = idx;
        }

        @Override
        public int compareTo(Win w2) {
            return this.data - w2.data;
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
        System.out.println("Total Cost = " + cost);
        System.out.println();

        /* Weakest Soldier
        We are given an mxn binary matrix of 1's(soldiers) and 0's(civilians). 
        Soldiers at front/left and civilians at back/right in each row.

        A row i is weaker than a row j if :
            - numbers of 1's (soldiers) in j > i
            - and index of j > i 
        */
        int army[][] = {
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0}
        };
        int ks = 2;
        PriorityQueue<Row> soldier = new PriorityQueue<>();
        for(int i = 0; i < army.length; i++) {
            int count = 0;
            for(int j = 0; j < army[0].length; j++) {
                count += army[i][j] == 1 ? 1 : 0;
            }
            soldier.add(new Row(count,i));
        }
        System.out.print("Weakest rows = ");
        for(int i = 0; i< ks; i++) {
            System.out.print("R"+ soldier.remove().idx + " ");
        }
        System.out.println();
        System.out.println();


        // Sliding Window Maximum           // O(nlogkw)
        int kw = 3;
        int window[] = {1,3,-1,-3,5,3,6,7};
        int result[] = new int[window.length-kw+1];
        PriorityQueue<Win> maxq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i = 0; i < k; i++) {
            maxq.add(new Win(window[i],i));
        }

        result[0] = maxq.peek().data;

        for(int i = kw; i < window.length; i++) {
            while(maxq.size() > 0 && maxq.peek().idx <= (i-kw)) {
                maxq.remove();
            }

            maxq.add(new Win(window[i], i));
            result[i-kw+1] = maxq.peek().data;
        }

        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}