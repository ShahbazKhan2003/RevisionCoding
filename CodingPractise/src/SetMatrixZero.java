import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int n = matrix.length , m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    helper( matrix , i  , j);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == Integer.MAX_VALUE) matrix[i][j] = 0;
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    public static void helper(int[][] matrix , int row ,  int col ){
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[row][i] !=0 )
                matrix[row][i] = Integer.MAX_VALUE;
        }
        for(int j=0;j<matrix.length;j++){
            if(matrix[j][col] != 0)
                matrix[j][col] = Integer.MAX_VALUE;
        }

    }
}
