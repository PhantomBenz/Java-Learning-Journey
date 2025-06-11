package Algorithms;

public class f_BubbleSort {
    public static void main(String[] args) {
        int arr[] = {2,1,5,3,9,7,8};
        sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void sort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] -= arr[j+1];
                }
            }
        }
    }
}
