import java.util.Scanner;
public class d_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long decimal = sc.nextLong();
        long binary = Binary(decimal);
        System.out.println(decimal + " : " + binary);
        sc.close();
    }
    public static long Binary(long decimal){
        long binary = 0;
        long remainder;
        int n=0;
        while(decimal != 0){
            remainder = decimal % 2;
            binary = binary + remainder * (long)Math.pow(10, n++);
            decimal /= 2;
        }
        return binary;
    }
}
