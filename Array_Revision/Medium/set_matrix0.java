package Array_Revision.Medium;

public class set_matrix0 {
    // Brute Force Approach
    public static void brute(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;

        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if (matrix[i][j]==0) {
                    for(int k=0;k<col;k++) {
                        if (matrix[i][k]!=0) {
                            matrix[i][k]=-1;
                        }
                    }
                    for(int l=0;l<row;l++) {
                        if (matrix[l][j]!=0) {
                            matrix[l][j]=-1;
                        }
                    }
                }

            }
        }
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if (matrix[i][j]==-1) {
                    matrix[i][j]=0;
                }
            }
        }
    }

    // Optimal Approach
    public static void optimal(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;

        for(int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                    
                }
            }            
        }
    public static void main(String[] args) {
        int matrix[][]={{1,1,1},
                        {1,0,1},
                        {1,1,1}};
        brute(matrix);
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
