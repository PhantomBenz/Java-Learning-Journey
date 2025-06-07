import java.util.Scanner;
public class c_BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long binary = sc.nextLong();
        long decimal = decimal(binary);
        System.out.println(binary + " : " + decimal);

        sc.close();
    }
    public static long decimal(long binary){
        long decimal = 0;
        int n=0;
        while(binary != 0){
            decimal += (binary % 10) * Math.pow(2,n);
            n++;
            binary /= 10;
        }
        return decimal;
    }
}
