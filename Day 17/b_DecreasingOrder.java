public class b_DecreasingOrder {
    public static void main(String[] args) {
        dec(9);
    }
    public static void dec(int n){
        if(n==1){
            System.out.println(1);
        }
        else{
            System.out.println(n);
            dec(n-1);
        }
    }
}
