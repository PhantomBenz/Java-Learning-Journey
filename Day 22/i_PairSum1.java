// Brute Force
// Find if any pair in a sorted ArrayList has a target sum
import java.util.*;
public class i_PairSum1 {
    public static boolean pairsum(ArrayList<Integer> list, int target){
        for(int i = 0; i < list.size(); i++){                   // TC is O(n^2)
            for(int j = i+1; j < list.size(); j++){
                if(list.get(i)+list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pairsum(list, 5));
    }
}
