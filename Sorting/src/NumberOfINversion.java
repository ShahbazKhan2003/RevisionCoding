import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfINversion {
    static  int count = 0;
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        mergeSort(arr , 0 , arr.length-1);
        System.out.println("[ount: "+ count);
        System.out.println(Arrays.toString(arr));
    }
    public static  void mergeSort(int[] arr , int low , int high){
        if(low>=high) return;
        int mid = (low+high)/2;
        mergeSort(arr , low , mid);
        mergeSort(arr , mid+1, high);
        merge(arr , low , mid , high);
    }
    public static void merge(int[] arr , int low , int mid , int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left <= mid && right<=high){
            if(arr[left] >= arr[right]){
                temp.add(arr[right]);
                count+=(mid-left+1);
                right++;
            }
            else {
                temp.add(arr[left]);
                left++;
            }
        }
        while(left<=mid){
            temp.add(arr[left++]);
        }
        while (right<=high){
            temp.add(arr[right++]);
        }

        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
    }

}
