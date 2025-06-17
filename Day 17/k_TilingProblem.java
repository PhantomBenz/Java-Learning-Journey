// Given a '2 x n' floor and tiles of size '2 x 1', 
// count the number of ways to tile the given board using the 2 x 1 tiles.
// (A tile can either be placed horizontally or vertically)
public class k_TilingProblem {
    public static void main(String[] args) {
        System.out.println(ways(5));
    }
    public static int ways(int n){
        if(n==0||n==1){
            return 1;
        }
        return ways(n-1) + ways(n-2);
    }
}
