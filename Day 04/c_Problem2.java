// print number form 1 to n
import java.util.Scanner;
public class c_Problem2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int counter = 1,n;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        while(counter <= n){
            System.out.println(counter);
            counter++;
        }
        sc.close();
    }
}
