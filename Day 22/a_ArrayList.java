import java.util.ArrayList;
public class a_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();   // String, Boolean, Integer, Float, Double, Long
        ArrayList<String> list2 = new ArrayList<>();

        // Add operation
        list.add(1);      // O(1)
        list.add(2);
        list.add(3);
        list2.add("abc");

        list.add(2, 9);  // O(n)

        System.out.println(list);
        System.out.println(list2);

        // Get operation   // O(1)
        int element = list.get(2);
        System.out.println(element);
 
        // Remove operation  // O(n)
        list.remove(2);
        System.out.println(list);

        // Set operation     // O(n)
        list.set(0, 10);
        System.out.println(list);

        // Contain? operation     // O(n)
        System.out.println(list.contains(2));
        System.out.println(list.contains(1));


        // Size of ArrayList
        System.out.println(list.size());
    }
}