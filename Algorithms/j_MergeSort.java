package Algorithms;

public class j_MergeSort {
    public static void printarray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        sort(arr,0,arr.length-1);
        printarray(arr);
    }
    public static void sort(int arr[], int si, int ei){
        if(si == ei || si > ei){
            return;
        }
        int mid = si+(ei-si)/2;
        sort(arr,si,mid);
        sort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int k = 0, i = si, j = mid+1;
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];
            }
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= ei){
            temp[k++] = arr[j++];
        }
        for(k=0, i=si; k < temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }
}
// Time Complexity : O(nlogn)
// Space Complexity : O(n)