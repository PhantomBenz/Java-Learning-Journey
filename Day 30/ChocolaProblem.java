import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {
    public static void main(String[] args) {
        Integer vertical_cuts[] = {2,1,3,1,4};
        Integer horizontal_cuts[] = {4,1,2};

        Arrays.sort(vertical_cuts, Collections.reverseOrder());
        Arrays.sort(horizontal_cuts, Collections.reverseOrder());
        
        int v = 0;
        int h = 0;
        int cost = 0;
        int hp = 1, vp = 1;
        while (v < vertical_cuts.length && h < horizontal_cuts.length) {
            if (vertical_cuts[v] > horizontal_cuts[h]) {
                cost += (vertical_cuts[v] * hp);
                v++;
                vp++;
            } else {
                cost += (horizontal_cuts[h] * vp);
                h++;
                hp++;
            }
        }

        while (v < vertical_cuts.length) {
            cost += vertical_cuts[v] * hp;
            v++;
        }
        while (h < horizontal_cuts.length) {
            cost += horizontal_cuts[h] * hp;
            h++;
        }
        System.out.println("Minimum cost to cut the chocolate is: " + cost);
    }
}
