// We are given an infinite supply of denominations [1,2,5,10,20,50,100,500,1000].
// Find min no. of coins/notes to make change for a value V.

import java.util.ArrayList;

public class Coins {
    public static void main(String[] args) {
        int money[] = {1,2,5,10,20,50,100,500,1000};
        int value = 590;
        System.out.println("For Rs." + value);
        int ans = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = money.length-1; i >= 0; i--) {
            while(value >= money[i]) {
                ans++;
                arr.add(money[i]);
                value -= money[i];
            }
            if(value == 0) {
                break;
            }
        }

        System.out.println("Minimum no. of coins/notes = " + ans);
        for(int i = 0; i < arr.size(); i++) {
            System.out.print("Rs."+arr.get(i) + " ");
        }
        System.out.println();
    }    
}
