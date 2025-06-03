// print reverse of a number
import java.util.Scanner;
public class g_Problem5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int reverse = 0;
        for(int i=n; i > 0; i /=10){
            reverse = reverse * 10 + i % 10;
        }

        System.out.println("Reverse = " + reverse);

        sc.close();

    }
}
