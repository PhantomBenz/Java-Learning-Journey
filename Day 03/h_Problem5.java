// check if a student will Pass or Fail
import java.util.Scanner;
public class h_Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        System.out.println("Student is : " + (marks < 33 ? "Fail" : "Pass")); // if marks are less than 33, student fails else student passes

        sc.close();
    }
}
