//         * * * * *
//       * * * * *
//     * * * * * 
//   * * * * *
// * * * * * 
public class g_SolidRhombus {
    public static void main(String[] args) {
        Pattern(5);
    }
    public static void Pattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*n - i; j++){
                System.out.print((i+j > n)? "* ": "  ");
            }
            System.out.println();
        }
    }
}
