import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
public class HashMapJCF {
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();

        for(String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        for(String key: tickets.keySet()) {
            if(!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

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

        // Majority Element Problem
        /*
            Given an integer array of size n, find all the elements that appear more than n/3 times.
        */
        int arr[] = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< arr.length; i++) {

            // if(map.containsKey(arr[i])) {
            //     map.put(arr[i], map.get(arr[i])+1);
            // }
            // else {
            //     map.put(arr[i], 1);
            // }

            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for (Integer key : map.keySet()) {
            if(map.get(key) > arr.length/3) {
                System.out.println(key);
            }
        }
        System.out.println();

        // Valid Anagram Problem
        /*
            Given two string s and t, return true if t is an anagram of s, and false otherwise.
            An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase 
            typically using all the original letters exactly once.
        */

        String s = "earth", t = "heart";
        HashMap<Character, Integer> vhm = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            vhm.put(s.charAt(i), vhm.getOrDefault(s.charAt(i),0)+1);
        }
        boolean same = true;
        for(int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if(vhm.get(ch) != null) {
                if(vhm.get(ch) == 1) {
                    vhm.remove(ch);
                } else {
                    vhm.put(ch, vhm.get(ch)-1);
                }
            }
            else {
                same = false;
            }
        }
        same = same && vhm.isEmpty();
        System.out.println("s and t are anagram : " + same);
        System.out.println();


        // Find Itinerary from Tickets
        /*
            Given :
            "Lalitpur" -> "Pokhara"
            "Mumbai" -> "Kathmandu"
            "Biratnagar" -> "Lalitpur"
            "Kathmandu" -> "Biratnagar"

            Ans:
            "Mumbai" -> "Kathmandu" -> "Biratnagar" -> "Lalitpur" -> "Pokhara"
        */
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Lalitpur", "Pokhara");
        tickets.put("Mumbai", "Kathmandu");
        tickets.put("Biratnagar", "Lalitpur");
        tickets.put("Kathmandu", "Biratnagar");

        String start = getStart(tickets);
        System.out.print(start);
        for(int i = 0; i < tickets.size(); i++) {
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
        System.out.println();


        /*
            Largest subarray with 0 sum
            given:
                arr = {15,-2,2,-8,1,7,10,23}
            ans: 5 ;    {-2,2,-8,1,7}
        */
        LinkedHashMap<Integer, Integer> sum = new LinkedHashMap<>();
        int arrs[] = {15,-2,2,-8,1,7,10};
        int sums = 0;
        int len = 0;
        for(int i = 0; i < arrs.length; i++) {
            sums += arrs[i];
            if(sum.containsKey(sums)) {
                len = Math.max(len, i - sum.get(sums));
            }
            else {
                sum.put(sums, i);
            }
        }
        System.out.println("Largest subarray with sum 0 = " + len);
        System.out.println();


        sum.clear();
        int arrs2[] = {10,2,-2,-20,10};
        int k = -10;
        sums = 0;
        len = 0;
        sum.put(0, 1);
        
        for(int i = 0; i < arrs2.length; i++) {
            sums += arrs2[i];
            if(sum.containsKey(sums - k)) {
                len += sum.get(sums - k);
            }
            sum.put(sums, sum.getOrDefault(sums, 0)+1);
        }
        System.out.println("Largest subarray with " + k + " = " + len);
        System.out.println();
    }
}
