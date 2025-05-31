import java.util.Scanner; // or import java.util.*; for all utilities
public class f_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc is the Scanner object

        // String input = sc.next(); 
        // Read a single word input from the user before the space

        // System.out.println(input); 
        // Output the input string

        String name = sc.nextLine(); // Read the entire line of input word

        System.out.println(name); // Output the entire line of input

        int number = sc.nextInt(); // Read an integer input from the user

        System.out.println(number);

        float price = sc.nextFloat(); // Read a float input from the user
        System.out.println(price);
        sc.close(); // Close the scanner to free resources
    }
}
