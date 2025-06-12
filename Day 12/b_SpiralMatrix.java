public class b_SpiralMatrix {
    public static void printmatrix(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            System.out.print("[");
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + "\t");  
            }
            System.out.println("]");
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int sr = 0, er = arr.length-1;
        int sc = 0, ec = arr[0].length-1;
        printmatrix(arr);
        while(sr<=er && sc<=ec){
            for(int j = sc; j <= ec; j++){
                System.out.print(arr[sr][j] + " ");
            }
            for(int i = sr+1; i <= er; i++){
                System.out.print(arr[i][ec] + " ");
            }
            for(int j = ec-1; j >= sr; j--){
                if(er == sr){ break; }
                System.out.print(arr[er][j] + " ");
            }
            for(int i = er-1; i > sr; i--){
                if(sc == ec){ break; }
                System.out.print(arr[i][sc] + " ");
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
        System.out.println();
    }
}
