// take input from user until user enters 0
import java.util.Scanner;
public class i_BreakStatement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        
        while(true) {
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            if(n == 0) {
                break; // Exit the loop if user enters 0
            }
            System.out.println("You entered: " + n);
        }

        System.out.println("Exited the loop.");

        sc.close();

    }
}
