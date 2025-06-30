// Given two arrays A and B of equal length n.Pair each element of array A to an element in array B,
// such that sum S of absolute differences of all the pairs is minimum.

import java.util.Arrays;

public class MinAbsoluteDifferencePairs {
    public static void main(String[] args) {
        int arr1[] = {4,1,8,7};
        int arr2[] = {2,3,6,5};
        int ans=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; i < arr1.length; i++) {
            ans += (int)Math.abs(arr1[i]-arr2[i]);
        }
        System.out.println(ans);
    }
}
