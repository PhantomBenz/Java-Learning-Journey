public class a_BacktrackingArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        backtrakingArray(0,arr);
        printArray(arr);
    }
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void backtrakingArray(int i, int arr[]){
        if(i == arr.length){
            printArray(arr);
            return;
        }
        arr[i] = i+1;
        backtrakingArray(i+1, arr);
        arr[i] -= 2;
        return;
    }
}
