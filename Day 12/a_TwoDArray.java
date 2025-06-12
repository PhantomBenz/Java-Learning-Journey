import java.util.Scanner;
public class a_TwoDArray {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];           // creation of array
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print("Enter value for " + i + " row " + j + " column : ");
                arr[i][j] = sc.nextInt();       // data manipulation
            }
        }
        for(int i = 0; i < 3; i++){
            System.out.print("[");
            for(int j = 0; j < 3; j++){
                System.out.print(arr[i][j] + " ");      // data display
            }
            System.out.println("]");
        }
        sc.close();
    }
}
