public class c_DiagonalSum {
    public static int sumD(int arr[][]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i][i];
            sum += (i!=arr[0].length-1-i)?arr[i][arr[0].length-1-i]:0;
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Sum of Diagonal : " + sumD(arr));
    }
}
