import java.util.Scanner;
import java.lang.Math;
public class b_PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for(int i=2; i<=range; i++){
            if(Prime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }
    public static boolean Prime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }
}
