//     *
//    **
//   ***
//  ****
// *****
public class b_InvertedAndRotatedHalfPyramid {
    public static void main(String args[]){
        Pattern(5);
    }
    public static void Pattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if (j+i>n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
