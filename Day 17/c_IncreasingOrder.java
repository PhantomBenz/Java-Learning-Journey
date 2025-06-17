public class c_IncreasingOrder {
    public static void main(String[] args) {
        printInc(10);
        System.out.println();
    }
    public static void printInc(int n){
        if(n==1){
            System.out.print(1 + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }
}
