import java.util.*;
// import java.util.Comparator;
// import java.util.HashSet;
// import java.util.Iterator;
// import java.util.LinkedHashSet;
// import java.util.TreeSet;
public class HashSetJCF {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(4);
        set.add(2);
        set.add(2);
        set.add(1);
        System.out.println(set);

        if(set.contains(2)) {
            System.out.println("set contains 2");
        }
        if(set.contains(3)) {
            System.out.println("set contains 3");
        }

        set.remove(2);
        if(!set.contains(2)) {
            System.out.println("set doesnot contain 2");
        }

        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println();

        HashSet<String> cities = new HashSet<>();
        cities.add("Kathmandu");
        cities.add("Lalitpur");
        cities.add("Butwal");

        // Iterator<String> itr = cities.iterator();
        // while(itr.hasNext()) {
        //     System.out.println(itr.next());
        // }
        // System.out.println();

        for(String city : cities) {
            System.out.println(city);
        }
        System.out.println();

        System.out.println(cities);
        System.out.println();


        // performance:     LHS < HS    LHM < HM
        
        // Linked HashSet   -  FIFO     using doubly ll
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Kathmandu");
        lhs.add("Lalitpur");
        lhs.add("Butwal");
        System.out.println(lhs);
        System.out.println();

        // TreeSet          - Ascending    using Red Black Tree
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Kathmandu");
        ts.add("Lalitpur");
        ts.add("Butwal");
        System.out.println(ts);
        System.out.println();


        // Count distinct elements
        int nums[] = {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        System.out.println("Number of distinct elements are " + hs.size());
        System.out.println();


        // Union and Intersecton of 2 arrays
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        HashSet<Integer> ui = new HashSet<>();
        int i = 0, j = 0;
        while(i < arr1.length && j < arr2.length) {
            ui.add(arr1[i++]);
            ui.add(arr2[j++]);
        }
        while(i < arr1.length) {
            ui.add(arr1[i++]);
        }
        while(j < arr2.length) {
            ui.add(arr2[j++]);
        }
        System.out.println("union : " + ui.size());
        ui.clear();
        int count = 0;
        for(int itr = 0; itr < arr1.length; itr++) {
            ui.add(arr1[itr]);
        }
        for(int itr = 0; itr < arr2.length; itr++) {
            if(ui.contains(arr2[itr])) {
                count++;
                ui.remove(arr2[itr]);
            }
        }
        System.out.println("intersection : " + count);
        System.out.println();
    }
}
