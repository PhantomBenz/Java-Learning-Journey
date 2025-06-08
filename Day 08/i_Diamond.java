//       *
//     * * *
//   * * * * *
// * * * * * * *
// * * * * * * *
//   * * * * * 
//     * * * 
//       *
public class i_Diamond {
    public static void main(String[] args) {
        Pattern(4);
    }
    public static void Pattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n+i-1; j++){
                System.out.print((i+j-1>=n) ? "* " : "  ");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n+i-1; j++){
                System.out.print((i+j-1>=n) ? "* " : "  ");
            }
            System.out.println();
        }
    }
}
