package Algorithms;

public class k_QuickSort {
    public static void printarray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        sort(arr,0,arr.length-1);
        printarray(arr);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i=si-1,temp;
        for(int j = si; j < ei; j++){
            if (arr[j] <= pivot) {
                i++;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void sort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int pIdx = partition(arr, si, ei);
        sort(arr, si, pIdx-1);
        sort(arr, pIdx+1, ei);
    }
}
// worst case Time Complexity : O(n^2), when pivot is always smallest or largest
// best case Time Complexity : O(nlogn)
