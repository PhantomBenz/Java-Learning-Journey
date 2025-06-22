// 2 pointer approach
// Find if any pair in a Sorted & Rotated ArrayList has a target sum
import java.util.*;
public class k_PairSum2 {
    public static int pivot(ArrayList<Integer> list){
        int start = 0;
        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i)>list.get(i+1)){
                return i+1;
            }
        }
        return start;
    }
    public static boolean pairsum(ArrayList<Integer> list, int target){
        int i = pivot(list), j = pivot(list)-1, n = list.size();
        while(i != j){                                   // TC is O(n)
            int sum = list.get(i) + list.get(j);
            if(sum == target){
                return true;
            }
            else if (sum < target){
                i = (i+1)%n;
            }
            else{
                j = (n+j-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairsum(list, 16));
    }
}
