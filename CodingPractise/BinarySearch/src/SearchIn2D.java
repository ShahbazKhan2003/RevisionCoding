public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr =  {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 11;

        boolean ans = searchMatrix(arr , target);
        System.out.println(ans);
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int  n=matrix.length , m=matrix[0].length;

        if(n==0 || m==0){
            return false;
        }
        if(target > matrix[n-1][m-1] || target < matrix[0][0]){
            return false;
        }

        int i=0 , j=m-1;

        while(i<n && j>=0){
            if(target==matrix[i][j]){
                return true;
            }
            else if(target < matrix[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}
