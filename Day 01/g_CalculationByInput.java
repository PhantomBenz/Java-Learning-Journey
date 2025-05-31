import java.util.*;
public class g_CalculationByInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
        int a = sc.nextInt(); // Read first integer input
        int b = sc.nextInt(); // Read second integer input
        int sum = a+b; // Calculate the sum of a and b
        int product = a*b; // Calculate the product of a and b
        System.out.println(sum); // Output the result
        System.out.println(product); // Output the product
        sc.close(); // Close the scanner to free resources
    }
}