package Algorithms;

public class b_BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        System.out.println(key + " is in index " + search(arr,key));
    }
    public static int search(int arr[], int k){
        int s = 0, l = arr.length-1, mid;
        while(s <= l){
            mid = (s+l)/2;
            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid] < k){
                s = mid;
            }
            else if(arr[mid] > k){
                l = mid;
            }
        }
        return -1;
    }
}

