import java.util.ArrayList;
public class HeapA {
    static class MinHeap {//for MaxHeap change the < to > where arr.get()'s are compared and also change min to max for convention
        ArrayList<Integer> arr = new ArrayList<>();

        private void heapify(int i) {
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;     // here name

            if(left < arr.size() && arr.get(left) < arr.get(minIdx)) {  // here sign and name
                minIdx = left;
            }

            if(right < arr.size() && arr.get(right) < arr.get(minIdx)) {  // here sign and name
                minIdx = right;
            }

            if(minIdx != i) {       // here name
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public void add(int data) {
            arr.add(data);

            int x = arr.size()-1;
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(par)) {      // O(logn)      // here sign
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x = par;
                par = (x-1)/2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        public int remove() {
            int data = arr.get(0);

            //step1 - swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //step2 - delete last
            arr.remove(arr.size()-1);

            //step3 - heapify
            heapify(0);

            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        MinHeap h = new MinHeap();
    //     h.add(2);
    //     h.add(3);
    //     h.add(4);
    //     h.add(5);
    //     h.add(10);
    //     h.add(1);
    //     System.out.println(h.peek());
    //     System.out.println(h.remove());
    //     System.out.println(h.peek());

        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()) {
            System.out.print(h.peek() + " ");
            h.remove();
        }
        System.out.println();
    }
}
