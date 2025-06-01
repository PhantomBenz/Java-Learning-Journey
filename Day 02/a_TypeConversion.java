import java.util.Scanner;
public class a_TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float number = sc.nextInt(); // implicit type conversion from int to float
        // Read an integer input and store it in a float variable 
        // byte -> short -> int -> float -> long -> double
        System.out.println(number); 

        sc.close();
    }    
}
