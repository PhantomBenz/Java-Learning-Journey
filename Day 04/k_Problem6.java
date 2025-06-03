// check if a number is prime or not
import java.util.Scanner;
import java.lang.Math;
public class k_Problem6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        
        for(int i=2; i<=Math.sqrt(n) ; i++){
            if(n % i == 0){
                isPrime = false;
            }
        }

        System.out.println("The number is " + (isPrime ? "prime":"composite"));

        sc.close();
    }
}
