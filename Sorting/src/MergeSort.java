// Divide and Merge

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,3,4};
        int n = arr.length;

        mergeSort(arr , 0 , n-1);

        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr , int low , int high){
        if(low >= high) return;

        int mid = (low+high)/2;
        mergeSort(arr, low , mid);
        mergeSort(arr, mid+1 , high);
        merge(arr , low , mid , high);
    }
    public static  void  merge(int[] arr , int low , int mid , int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high){
            if(arr[left] >= arr[right]){
                temp.add(arr[right]);
                right++;
            }
            else{
                temp.add(arr[left]);
                left++;
            }
        }
        while(left <= mid) {
            temp.add(arr[left++]);
        }
        while ((right<=high)){
            temp.add(arr[right++]);
        }

        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
    }
}
