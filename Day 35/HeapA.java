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

    // for descending sort

    public static void heapify(int arr[], int i, int size) {
        int left = 2*i+1;
        int right = 2*i+2;
        int minIdx = i;
        if(left < size && arr[left] < arr[minIdx]) {
            minIdx = left;
        }

        if(right < size && arr[right] < arr[minIdx]) {
            minIdx = right;
        }

        if(minIdx != i) {
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            heapify(arr, minIdx, size);
        }
    }

    public static void heapSort(int arr[]) {
        int n = arr.length;
        for(int i = n/2; i >= 0; i--) {
            heapify(arr, i, n);
        }

        for(int i = n-1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
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

        // for sorting : Ascending needs maxHeap; Descending needs minHeap

        int arr[] = {5,4,2,3,1,6};        
        heapSort(arr);
        System.out.print("Sorted array will be (descending) : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
