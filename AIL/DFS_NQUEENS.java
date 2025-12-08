public class DFS_NQUEENS {
    private int n;                 // Board size (n x n)
    private int[] board;           // board[i] = column position of queen in row i

    public DFS_NQUEENS(int n) {
        this.n = n;
        this.board = new int[n];
    }

    // Entry point
    public void solve() {
        dfs(0); // Start from row 0
    }

    // Depth First Search with Backtracking
    private void dfs(int row) {
        if (row == n) {
            printSolution();
            return;
        }

        // Try placing queen in each column of current row
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col)) {
                board[row] = col;  // Place queen
                dfs(row + 1);      // Move to next row (DFS)
                // Backtrack happens automatically when we return
            }
        }
    }

    // Check if placing a queen at (row, col) is safe
    private boolean isSafe(int row, int col) {
        for (int prevRow = 0; prevRow < row; prevRow++) {
            int prevCol = board[prevRow];
            // Check if same column or diagonal clash
            if (prevCol == col || Math.abs(prevCol - col) == Math.abs(prevRow - row)) {
                return false;
            }
        }
        return true;
    }

    // Print the board
    private void printSolution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Main method to run program
    public static void main(String[] args) {
        int n = 4; // Change to any value (e.g., 8 for 8-Queens)
        DFS_NQUEENS solver = new DFS_NQUEENS(n);
        solver.solve();
    }
}
