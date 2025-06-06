public class d_Factorial {
    public static int CalculateFactorial(int n) {
        for (int i = n - 1; i > 0; i--) {
            n *= i; 
        }
        return n;
    }

    public static void main(String[] args) {
        int number = 5; 
        int factorial = CalculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
