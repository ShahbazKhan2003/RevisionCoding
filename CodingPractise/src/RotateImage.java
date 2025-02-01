import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int n = matrix.length ;
        for(int j=0;j<n;j++){
            reverseCol(matrix,j);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if( i != j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    public static void reverseCol(int[][] arr , int col){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i][col];
            arr[i][col] = arr[arr.length-i-1][col];
            arr[arr.length-i-1][col] = temp;
        }

    }
}
