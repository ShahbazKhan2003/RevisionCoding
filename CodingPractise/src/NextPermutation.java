import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {2,1,5,4,3,0,0};
        int n = arr.length , pivot = -1;

        for(int i=n-2;i>=0;i--){
            if(arr[i] < arr[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot == -1){
            reverse(arr , 0);
        }
        else{
            for(int i=n-1;i>pivot;i--){
                if(arr[pivot] < arr[i]){
                    swap(arr , i , pivot);
                    break;
                }
            }
            reverse(arr, pivot+1);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] a , int i){
        int j = a.length-1;
        while (i < j){
            swap(a , i  ,j);
            i++;
            j--;
        }
    }
    public  static  void swap(int[] a , int i , int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
