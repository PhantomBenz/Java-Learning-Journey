//         * * * * *
//       *       *
//     *       * 
//   *       *
// * * * * * 
public class h_HollowRhombus {
    public static void main(String[] args) {
        Pattern(5);
    }
    public static void Pattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*n - i; j++){
                if((i == 1 || i == n) && i+j>n) {
                    System.out.print("* "); // top and bottom edge
                }
                else if(i+j-1==n || i+j == 2*n){
                    System.out.print("* "); // left and right edge
                }
                else{
                    System.out.print("  "); // hollow section
                }
            }
            System.out.println();
        }
    }
}
