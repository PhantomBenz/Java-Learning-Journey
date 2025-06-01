import java.util.Scanner;
public class b_TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int marks = (int) 99.99f; // Explicit type casting from float to int
        // marks <- 99 ; no roundoff occurs 
        System.out.println(marks);

        char ch = 'a';
        int character = (int) ch; // Explicit type casting from char to int
        // character <- 97 ; ASCII value of 'a' is 97
        System.out.println(character);

        sc.close();
    }
}
