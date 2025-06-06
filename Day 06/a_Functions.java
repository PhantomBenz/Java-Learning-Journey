import java.util.Scanner;
public class a_Functions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalculateSum(a, b); // a and b are arguments or actual parameters
        System.out.println(sum);
        sc.close();
    }

    public static int CalculateSum(int num1, int num2) { // num1 and num2 are parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }
}