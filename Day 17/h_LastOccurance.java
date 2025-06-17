public class h_LastOccurance {
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        System.out.println(key + " found at i = " + findKey(arr, arr.length-1, key));
    }
    public static int findKey(int arr[], int i, int key){
        if(i==-1){
            return i;
        }
        if(arr[i] == key){
            return i;
        }
        return findKey(arr, i-1, key);
    }
}
