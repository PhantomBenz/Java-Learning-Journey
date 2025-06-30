// You are given n pairs of numbers. In every pair, the first number is always smaller than the second number.
// A pair (c,d) can comer after pair (a,b) if b<c.
// Find the longest chain which can be formed from a given set of pairs

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainOfPairs {        // O(nlogn)
    public static void main(String[] args) {
        int pairs[][] = {
            {5,24}, {39,60}, {5,28}, {27,40}, {50,90}
        };
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int chain = 0,l=0;
        for(int i = 0; i < pairs.length; i++) {
            if(pairs[i][0] >= l) {
                chain++;
                l = pairs[i][1];
            }
        }
        System.out.println(chain);
    }
}
