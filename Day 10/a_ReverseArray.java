public class a_ReverseArray {
    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int temp;
        int f = 0, l = arr.length-1;
        while(f<l){
            temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;
            f++;l--;
        }
        print(arr);
    }
}