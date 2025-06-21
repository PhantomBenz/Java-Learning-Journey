public class e_NKnights {
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
    }
    public static void solution(char arr[][], int r){
        // base case
        if(r == arr.length){
            printArray(arr);
            return;
        }
        // recursive case
        for(int i = 0; i < arr.length; i++){
            if(isSafe(arr,r,i)){
                arr[r][i] = 'K';
                solution(arr, r+1);
                arr[r][i] = '.';    
            }
        }
    }
    public static Boolean isSafe(char arr[][], int r, int c){
        // 2 left 1 up
        if(r>0 && c > 1 && arr[r-1][c-2] == 'K'){
            return false;
        }
        // 1left 2 up
        if(r>1 && c > 0 && arr[r-2][c-1] == 'K'){
            return false;
        }
        // 2 right 1 up
        if(r>0 && c < arr.length-2 && arr[r-1][c+2] == 'K'){
            return false;
        }
        // 1 right 2 up
        if(r>1 && c < arr.length-1 && arr[r-2][c+1] == 'K'){
            return false;
        }
        return true;
    }
}
