package Algorithms;

public class h_InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void sort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int prev = i-1;
            int temp = arr[i];
            while(prev >= 0 && arr[prev]>temp){
                arr[prev+1] = arr[prev];
                prev --;
            }
            arr[prev+1] = temp;
        }
    }
}
