import java.util.ArrayList;
public class d_SwapNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        int idx1 = 1, idx2 = 3;
        swap(list, idx1, idx2);
        System.out.println(list);
    }
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        // list.remove(idx1+1);
        list.set(idx2, temp);
        // list.remove(idx1+1);
    }
}
