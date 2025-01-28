import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<int[]> ans = new ArrayList<>();

        helper(arr , ans , 0);

        for(int[] tot: ans){
            for(int i : tot){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void helper(int[] arr ,List<int[]> all,int idx){
        if(idx >= arr.length){
            all.add(arr.clone());
            return;
        }

        for(int i=idx;i<arr.length;i++){
            swap(arr , i , idx);
            helper(arr , all , idx+1);
            swap(arr , i , idx);
        }
    }
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
