// Given the weights and values of N items, put these items in a knapsack of capacity W 
// to get the maximum total value in the knapsack.

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void maximumValue(int value[], int weight[], int W) {
        double table[][] = new double[value.length][2];
        for(int i = 0; i < value.length; i++) {
            table[i][0] = i;
            table[i][1] = value[i]/(double)weight[i];
        }
        Arrays.sort(table, Comparator.comparingDouble(o -> o[1]));
        
        int capacity = W;
        int finalVal = 0;
        for(int i = table.length-1; i >= 0; i--) {
            int idx = (int)table[i][0];
            if(capacity>=weight[idx]) {
                finalVal += value[idx];
                capacity -= weight[idx];
            } else {
                finalVal += (table[i][1]*capacity);
                capacity = 0;
                break;
            }
        }  
        System.out.println("Final Value is " + finalVal);   
    }

    public static void main(String[] args) {
        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;
        maximumValue(value, weight, W);
    }
}
