package Algorithms;

public class g_SelectionSort {
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        sort(arr);
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int si = i;
            for(int j=i+1; j<arr.length;j++){
                si = arr[si] > arr[j] ? j:si;
            }
            int temp = arr[si];
            arr[si] = arr[i];
            arr[i] = temp;
        }
    }
}
