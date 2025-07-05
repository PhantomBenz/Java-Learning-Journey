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
    }
}