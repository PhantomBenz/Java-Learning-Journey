import java.util.*;
public class f_MultiDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);

        mainlist.add(arr);
        
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(9);
        arr2.add(2);
        arr2.add(8);

        mainlist.add(arr2);

        // System.out.println(mainlist);

        for(int i = 0; i < mainlist.size(); i++){
            ArrayList<Integer> currlist = mainlist.get(i);
            for(int j = 0; j < currlist.size(); j++){
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }
    }
}
