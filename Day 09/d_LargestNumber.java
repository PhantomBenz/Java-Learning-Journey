// import java.util.*;
public class d_LargestNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 3, 5};
        System.out.println(largest(arr));
    }
    public static int largest(int arr[]){
        int large = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            large = (large < arr[i]) ? arr[i] : large;
        }
        return large;
    }
}
