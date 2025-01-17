import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10, 5, 22 , 12 , 9};

        int n = arr.length;

        for(int i=1;i<n;i++){
            int j = i-1;

            while( j >= 0 && arr[j] > arr[j+1]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j]  = temp;
                j--;
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
