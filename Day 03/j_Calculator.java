import java.util.Scanner;
public class j_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        double ans = 0;
        System.out.println("Enter the operation you want to perform (+,-,*,/,%): ");
        char op = sc.next().charAt(0);
        switch (op){
            case '+' :
                ans = a + b;
                break;  
            case '-' :
                ans = a - b;
                break;
            case '*' :
                ans = a * b;
                break;
            case '/' :  
                ans = a/b;
                break;
            case '%' :
                ans = a % b;
                break;
            default:
                System.out.println("Invalid Operator!!!");
        }
        System.out.println(a + " " + op + " " + b + " = " + ans);
        sc.close();
    }
}
