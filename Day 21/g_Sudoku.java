public class g_Sudoku {
    public static void main(String[] args) {
        int sudoku[][] = {{0, 0, 8, 0, 0, 0, 0, 0, 0},
                          {4, 9, 0, 1, 5, 7, 0, 0, 2},
                          {0, 0, 3, 0, 0, 4, 1, 9, 0},
                          {1, 8, 5, 0, 6, 0, 0, 2, 0},
                          {0, 0, 0, 0, 2, 0, 0, 6, 0},
                          {9, 6, 0, 4, 0, 5, 3, 0, 0},
                          {0, 3, 0, 0, 7, 2, 0, 0, 4},
                          {0, 4, 9, 0, 3, 0, 0, 5, 7},
                          {8, 2, 7, 0, 0, 9, 0, 1, 3}};
        if(sudokuSolver(sudoku)){
            printSudoku(sudoku);
        } else {
            System.out.println("No solution exists");
        };
    }
    public static boolean sudokuSolver(int sudoku[][]){
        for(int i = 0; i < sudoku.length; i++){
            for(int j = 0; j < sudoku[i].length; j++){
                if(sudoku[i][j] == 0){
                    for(int num = 1; num <= 9; num++){
                        if(isSafe(sudoku, i, j, num)){
                            sudoku[i][j] = num;
                            if(sudokuSolver(sudoku)){
                                return true;
                            }
                            sudoku[i][j] = 0; // backtrack
                        }
                    }
                    return false; // no valid number found
                }
            }
        }
        return true; // solved
    }
    public static boolean isSafe(int sudoku[][], int row, int col, int num){
        // Check row
        for(int j = 0; j < 9; j++){
            if(sudoku[row][j] == num){
                return false;
            }
        }
        // Check column
        for(int i = 0; i < 9; i++){
            if(sudoku[i][col] == num){
                return false;
            }
        }
        // Check 3x3 box
        int boxRowStart = (row / 3) * 3;
        int boxColStart = (col / 3) * 3;
        for(int i = boxRowStart; i < boxRowStart + 3; i++){
            for(int j = boxColStart; j < boxColStart + 3; j++){
                if(sudoku[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }
    public static void printSudoku(int sudoku[][]){
        System.out.println("Sudoku Solution:");
        for(int i = 0; i < sudoku.length; i++){
            for(int j = 0; j < sudoku[i].length; j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
}
