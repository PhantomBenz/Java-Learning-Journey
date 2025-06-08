// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
public class e_ZeroOneTriangle {
    public static void main(String[] args) {
        Pattern(5);
    }
    public static void Pattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print((i+j-1)%2+ " ");
            }
            System.out.println();
        }
    }
}
