import java.util.ArrayList;
import java.util.Collections;
// import java.util.*;
public class e_SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        System.out.println(list);
        Collections.sort(list);  // built-in sorting in ascending 
        System.out.println(list);

        // descending 
        Collections.sort(list, Collections.reverseOrder()); // Collections.reverseOrder() is a comparator - fn logic
        System.out.println(list);
    }
}
