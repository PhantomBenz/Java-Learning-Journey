import java.util.Scanner;
public class a_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[100];   // array creation

        number[0] = sc.nextInt();      // data entry in array

        System.out.println(number[0]); // data output in array

        number[0] = 20;                // data updation in array

        System.out.println(number[0]); // updated data output in array

        //number.length returns 100 for the above code

        sc.close();
    }
}