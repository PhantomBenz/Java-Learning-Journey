public class a_Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        else {
            return n*fact(n-1);
        }
    }
}
