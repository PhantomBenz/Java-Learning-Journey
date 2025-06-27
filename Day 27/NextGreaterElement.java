// Next Greater Element
// The next greater element of some element x in an array is the first greater element
// that is to the right of x in the same array
// arr = [6,8,0,1,3]
// nextGreater = [8,-1,1,3,-1]
import java.util.*;
public class NextGreaterElement {
    public static void findNG(int arr[], int nextGreater[]) {
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1; i >= 0; i--) {        // TC : O(n)
            while(!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nextGreater[i] = -1;
            }
            else {
                nextGreater[i] = s.peek();
            }
            s.push(arr[i]);
        }
    }

    public static void printArray(int nextGreater[]) {
        for(int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int nextGreater[] = new int[arr.length];
        findNG(arr,nextGreater);
        printArray(nextGreater);
    }
}
