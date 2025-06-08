public class a_HollowRectangle {
    public static void main(String args[]){
        Pattern(5);
    }
    public static void Pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i == 1 || i == 5 ){
                    System.out.print("* ");
                }
                else if(j == 1 || j == 5){
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