public class f_CheckArraySorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Sorted : " + sortedArray(arr,0));
    }
    public static boolean sortedArray(int arr[],int n){
        if(n == arr.length-1){
            return true;
        }
        if(arr[n] > arr[n+1]){
            return false;
        }
        return sortedArray(arr, n+1);
    }
}
