// For given n lines on x-axis, use 2 lines to form a container such that it holds maximum water
import java.util.*;
public class g_ContainerWithMostWater {
    public static int maxWater(ArrayList<Integer> water){
        int max = 0;
        for(int i = 0; i < water.size(); i++){
            for(int j = i+1; j < water.size(); j++){
                int lowBar = Math.min(water.get(i), water.get(j));
                max = Math.max(max, lowBar * (j-i));
            }
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
// TC is O(n^2)