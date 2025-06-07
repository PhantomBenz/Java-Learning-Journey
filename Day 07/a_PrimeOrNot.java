import java.util.Scanner;
public class a_PrimeOrNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); 
        boolean isPrime = Prime(number);
        System.out.println(number + " is prime: " + isPrime);
        sc.close();
    }

    public static boolean Prime(int n) {
        for (int i = 2; i<= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }
}