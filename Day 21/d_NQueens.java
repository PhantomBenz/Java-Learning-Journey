// place N queens in an N x N chessboard such that no 2 queens can attack each other
public class d_NQueens {
    // static int count = 0;
    public static void printArray(char arr[][]){
        System.out.print(" _");
        for(int i = 0; i < arr.length; i++){
            System.out.print("___");
        }
        System.out.println("_");
        for(int i = 0; i < arr.length; i++){
            System.out.print("| ");
            for(int j = 0; j < arr.length; j++){
                if(arr[i][j] == '.'){
                    System.out.print(" ");
                }
                else{
                    System.out.print(arr[i][j]);
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
        System.out.print(" _");
        for(int i = 0; i < arr.length; i++){
            System.out.print("___");
        }
        System.out.println("_\n");
    }
    public static void main(String[] args) {
        int size = 4;
        char arr[][] = new char[size][size];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = '.';
            }
        }
        solution(arr,0);
        // System.out.println("count = " + count);
    }
    public static boolean solution(char arr[][], int r){
        // base case
        if(r == arr.length){
            printArray(arr);
            // count ++;
            return true;
        }
        // recursive case
        for(int i = 0; i < arr.length; i++){
            if(isSafe(arr,r,i)){
                arr[r][i] = 'Q';
                if(solution(arr, r+1)){
                    return true;            // comment this out for printing all solutions
                }
                arr[r][i] = '.';    
            }
        }
        return false;
    }
    public static Boolean isSafe(char arr[][], int r, int c){
        // vertical up
        for(int i = r-1; i >= 0; i--){
            if(arr[i][c] == 'Q'){
                return false;
            }
        }
        // diag left up
        for(int i = r-1, j = c-1; i >= 0 && j >= 0; i--, j--){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }
        // diag right up
        for(int i = r-1, j = c+1; i >= 0 && j < arr.length; i--, j++){
            if(arr[i][++c] == 'Q'){
                return false;
            }
        }
        return true;
    }
}
