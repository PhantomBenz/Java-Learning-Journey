public class d_MaxSubarraySum {
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        subarray(arr);
    }    
    public static void subarray(int arr[]){
        int sum, maxsum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                sum = 0;
                System.out.print("(");
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                System.out.print(") = " + sum + "  ");
                maxsum = sum < maxsum ? maxsum : sum;
            }
            System.out.println();
        }
        System.out.println("Max Sum = " + maxsum);
    }
}
// O(n^3) : bad time complexity