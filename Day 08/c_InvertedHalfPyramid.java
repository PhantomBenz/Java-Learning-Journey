// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
public class c_InvertedHalfPyramid {
    public static void main(String[] args) {
        Pattern(5);
    }
    public static void Pattern(int n){
        for (int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
