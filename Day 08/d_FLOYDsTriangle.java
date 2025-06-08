// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
public class d_FLOYDsTriangle {
    public static void main(String args[]){
        Pattern(5);
    }
    public static void Pattern(int n){
        int c = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(c++ + " ");
            }
            System.out.println();
        }
    }
}
