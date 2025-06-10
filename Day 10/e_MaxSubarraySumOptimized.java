public class e_MaxSubarraySumOptimized {
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        subarray(arr);
    }    
    public static void subarray(int arr[]){
        int sum, maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                maxsum = sum < maxsum ? maxsum : sum;
            }
        }
        System.out.println("Max Sum = " + maxsum);
    }
}
// O(n^2) = optimized than before