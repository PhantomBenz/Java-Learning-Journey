// 2 pointer approach
import java.util.*;
public class h_OptimizedG {
    public static int maxWater(ArrayList<Integer> water){
        int max = 0, i = 0, j = water.size()-1, lowBar = 0;
        while(i<j){                                         // TC is O(n)
            int w = j-i;
            if(water.get(i) > water.get(j)){
                lowBar = water.get(j);
                j--;
            }
            else{
                lowBar = water.get(i);
                i++;
            }
            max = Math.max(max, lowBar*w);
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> container = new ArrayList<>();
        container.add(1);
        container.add(8);
        container.add(6);
        container.add(2);
        container.add(5);
        container.add(4);
        container.add(8);
        container.add(3);
        container.add(7);
        System.out.println(maxWater(container));
    }
}