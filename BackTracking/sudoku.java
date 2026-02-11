package BackTracking;

public class sudoku {
    public static boolean sudokusolver(int sudoku[][],int row,int col) {
        // base case


        // Recuesive case
        int nextrow=row, nextcol=col+1;
        if(col+1==9) {
            nextrow=row+1;
            nextcol=0;
        }
        if (sudoku[row][col]!=0) {
            return sudokusolver(sudoku, nextrow, nextcol);
        }
        for(int num=1;num<=9;num++) {
            if(isSafe(sudoku,row,col,num)) {
                sudoku[row][col]=num;
                if(sudokusolver(sudoku,nextrow,nextcol)) {
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }
    public static boolean isSafe(int[][] sudoku,int row,int col,int num) {
        // Check row
        for(int j=0;j<9;j++) {
            if(sudoku[row][j]==num) {
                return false;
            }
        }
        // Check column
        for(int i=0;i<9;i++) {
            if(sudoku[i][col]==num) {
                return false;
            }
        }
        // Check 3x3 box
        int boxRow=row-row%3;
        int boxCol=col-col%3;
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(sudoku[boxRow+i][boxCol+j]==num) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void printSudoku(int[][] sudoku) {
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] sudoku = {
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        };

        System.out.println("Sudoku board initialized successfully!");
        if (sudokusolver(sudoku, 0, 0)) {
            System.out.println("Sudoku solved successfully!");
            printSudoku(sudoku);
        } else {
            System.out.println("No solution exists for the given Sudoku.");
        }
    }
}
