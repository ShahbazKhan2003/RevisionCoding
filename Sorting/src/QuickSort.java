// 1. take pivot element & place in correct sorted place
// 2. smaller on the left , larger on the right

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4 , 1 , 3 , 9, 7};

        quickSort(arr , 0 , arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    public static int  partition(int[] arr , int low , int high){
        int i = low ,  j = high;
        int pivotEle = arr[low];

        while( i < j){

            while (i <= high && pivotEle >= arr[i]) i++;

            while (j >= low && pivotEle < arr[j]) j--;

            if( i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;

    }
    public static void quickSort(int[] arr , int low , int high){
        if(low < high){
            int partitionIdx = partition(arr , low , high);
            quickSort(arr ,  low , partitionIdx-1);
            quickSort(arr , partitionIdx+1 , high);
        }
    }
}
