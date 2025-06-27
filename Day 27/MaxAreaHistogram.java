// Given an array of integers heights representing the histogram's bar height where the width of each bar is 1,
// return the area of the largest rectangle in the histogram
import java.util.*;
public class MaxAreaHistogram {
    public static void leftSmall(int arr[], int left[]) {
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < arr.length; i++) {        // TC : O(n)
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                left[i] = -1;
            }
            else {
                left[i] = s.peek();
            }
            s.push(i);
        }
    }
    public static void rightSmall(int arr[], int right[]) {
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1; i >= 0; i--) {        // TC : O(n)
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                right[i] = arr.length;
            }
            else {
                right[i] = s.peek();
            }
            s.push(i);
        }
    }
    public static int maxArea(int arr[]) {
        int maxHeight = 0;
        int left[] = new int[arr.length], right[] = new int[arr.length];
        leftSmall(arr, left);
        rightSmall(arr, right);
        for(int i = 0; i < arr.length; i++) {
            maxHeight = Math.max(maxHeight, (right[i] - left[i]-1) * arr[i]);
        }
        return maxHeight;
    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        System.out.println(maxArea(arr));
    }
}
