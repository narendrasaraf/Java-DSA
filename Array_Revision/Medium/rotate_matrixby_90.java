package Array_Revision.Medium;

public class rotate_matrixby_90 {
    // Reverse each row
    public static void reverse(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;

        for(int i=0;i<row;i++) {
            int start=0;
            int end=col-1;
            while(start<end) {
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
        }
    }
    // Brute Force Approach
    public static int[][] brute(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int [][] result=new int[row][col];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                result[j][(row-1)-i]=matrix[i][j];
            }
        }
        return result;
    }    

    // Optimal Approach
    public static void optimal(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;

        for(int i=0;i<row;i++) {
            for(int j=i+1;j<col;j++) {
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
            }
        }
        reverse(matrix);
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        optimal(matrix);
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
