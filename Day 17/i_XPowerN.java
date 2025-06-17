public class i_XPowerN {
    public static void main(String[] args) {
        System.out.println("3^4 = " + power(3, 4));
    }
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * power(x, n-1);
    }
}
// Time Complexity = O(n)