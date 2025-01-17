// find the smallest in array then swap with first unsorted index

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 5, 12 , 22 , 43};

        int n = arr.length;

        for(int i=0;i<n;i++){
            int min = i;

            for(int j=i+1;j<n;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
