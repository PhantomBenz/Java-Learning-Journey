public class f_KadanesAlgorithm {
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        subarray(arr);
    }    
    public static void subarray(int arr[]){
        int CS=0, maxsum=0;
        for(int i = 0; i < arr.length; i++){
            CS = Math.max(CS+arr[i],0);
            maxsum = (CS > maxsum) ? CS : maxsum;
        }
        System.out.println("Max sum = " + maxsum);
    }
}
// O(n) = good time complexity