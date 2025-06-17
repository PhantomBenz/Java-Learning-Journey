public class g_FirstOccurance {
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 4;
        System.out.println(key + " was found at i = " + findKey(arr,0,key));
    }   
    public static int findKey(int arr[], int i, int k){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == k){
            return i;
        }
        return findKey(arr,i+1,k);
    }
}
