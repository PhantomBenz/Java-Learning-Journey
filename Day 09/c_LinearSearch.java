public class c_LinearSearch {
    public static int search(int arr[], int k){
        for(int i = 0; i <= arr.length; i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        int index = search(arr,key);
        System.out.println("Key is in index " + index);
    }
}
