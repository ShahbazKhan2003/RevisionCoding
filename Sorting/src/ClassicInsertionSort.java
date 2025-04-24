import java.util.Arrays;

public class ClassicInsertionSort{
    public static void main(String[] args) {
        int[] arr = {20 , 40 , 10 , 30};

        insertion(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void insertion(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j--];
            }
            arr[j+1] = key;
        }
    }
}