// print sum of first n natural numbers
import java.util.Scanner;
public class d_Problem3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int counter =1, n,sum=0;
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        while(counter <= n){
            sum += counter;
            counter++; 
        }
        System.out.println("Sum = " + sum);

        sc.close();
    }
}
