// package 2DArrays;

public class diagonalsum {
    public static int sumdiagonal(int matrix[][]) {
        int sum=0;
        int n=matrix.length;
        // for(int i=0;i<matrix.length;i++) {
        //     for(int j=0;j<matrix[0].length;j++) {
        //         if (i==j) {
        //             sum= sum+ matrix[i][j];
        //         } 
        //         if (i+j==matrix.length-1) {
        //             sum=sum+matrix[i][j];
        //         }    
                
        //     }
        // }
        // return sum;
        for(int i=0;i<n;i++) {
            sum+=matrix[i][i];
            if(i!=n-i-1)
                sum+=matrix[i][n-i-1];
            // To avoid double counting the middle element in case of odd n
            if (n%2==1) {
                sum-=matrix[n/2][n/2];
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        System.out.println("Sum of diagonals is: "+sumdiagonal(matrix));
    }
}
