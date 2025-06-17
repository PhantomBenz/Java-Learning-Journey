public class e_Fibonacci {
    public static void main(String[] args) {
        for(int i=0; i<29; i++){
            System.out.print(fibo(i) + " ");
        }
        System.out.println();
    }
    public static int fibo(int n){
        if(n==0||n==1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
