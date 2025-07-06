import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
public class HashMapJCF {
    public static void main(String[] args) {
        // Create
        HashMap<String,Integer> hm = new HashMap<>();

        // Insert - TC : O(1)
        hm.put("Coffee", 50);               
        hm.put("Pizza", 150);
        hm.put("Burger", 130);
        System.out.println(hm);             // Data inserted are randomly sorted

        hm.put("Pizza", 200);
        System.out.println(hm);
        System.out.println();

        // Get - TC : O(1)
        System.out.println(hm.get("Pizza"));                    
        System.out.println(hm.get("Water"));
        System.out.println();

        // ContainsKey - TC : O(1)
        System.out.println(hm.containsKey("Coffee"));
        System.out.println(hm.containsKey("Water"));
        System.out.println();

        // Remove - TC : O(1)
        System.out.println(hm.remove("Coffee"));
        System.out.println(hm.remove("Water"));
        System.out.println(hm);
        System.out.println();

        // Size
        System.out.println(hm.size());
        System.out.println();

        // isEmpty
        System.out.println(hm.isEmpty());
        System.out.println();

        // clear
        hm.clear();
        System.out.println(hm.isEmpty());
        System.out.println();
        System.out.println();


        hm.put("Pizza", 200);
        hm.put("Coffee", 50);
        hm.put("Burger", 150);
        hm.put("MoMo", 130);
        hm.put("Chinese", 90);

        // Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        System.out.println();

        for (String k : keys) {
            System.out.println(k + " - Rs." + hm.get(k));
        }
        System.out.println();



        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        // sorted in linear order as input
        lhm.put("Coffee", 50);
        lhm.put("Pizza", 200);
        lhm.put("Burger", 150);

        System.out.println(lhm);
        System.out.println();

        TreeMap<String, Integer> thm = new TreeMap<>();
        // sorted in ascending order of key
        thm.put("Coffee", 50);
        thm.put("Pizza", 200);
        thm.put("Burger", 150);

        System.out.println(thm);
        System.out.println();
    }
}
