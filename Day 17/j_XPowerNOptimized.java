public class j_XPowerNOptimized {
    public static void main(String[] args) {
        System.out.println("2^10 = " + power(2, 10));
    }
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return power(x, n/2)*power(x,n/2);
        }
        else{
            return x * power(x,n/2)*power(x, n/2);
        }
    }
}
// Time Complexity = O(logn) || O( log base 2 (n) )