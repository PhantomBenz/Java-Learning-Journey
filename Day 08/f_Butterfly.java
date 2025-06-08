// *             *
// * *         * *
// * * *     * * *
// * * * * * * * *
// * * * * * * * *
// * * *     * * * 
// * *         * * 
// *             *
public class f_Butterfly {
    public static void main(String[] args) {
        Pattern(4);
    }
    public static void Pattern(int n) {
        for(int i = 1; i <= n; i++){                // for upper half
            for(int j = 1; j <= 2*n; j++){
                if(j<=i){
                    System.out.print("* ");         // left wing
                }
                else if((j+i) > 2*n){
                    System.out.print("* ");         // right wing
                }
                else{
                    System.out.print("  ");         // between the wings
                }
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){                // for lower half 
            for(int j = 2*n; j >= 1; j--){
                if(j<=i){
                    System.out.print("* ");         // left wing
                }
                else if((j+i) > 2*n){
                    System.out.print("* ");         // right wing
                }
                else{
                    System.out.print("  ");         // between the wings
                }
            }
            System.out.println();
        }
    }
}
