// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining
public class g_TrappingRainwater {
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        rainwater(arr);
    }
    public static void rainwater(int arr[]){
        int l = arr.length-1;
        int water=0,leftmax[]=new int[l+1],rightmax[]=new int[l+1];
        leftmax[0] = arr[0];
        rightmax[l] = arr[l];
        for(int i = 1; i < l;i++){
            leftmax[i] = Math.max(arr[i], leftmax[i-1]);
            rightmax[l-i] = Math.max(rightmax[l-i+1], arr[l-i]);
        }
        for(int i = 1; i < l; i++){
            water += Math.min(leftmax[i], rightmax[i]) - arr[i];
        }
        System.out.println("Trapped water : " + water);
    }
}
