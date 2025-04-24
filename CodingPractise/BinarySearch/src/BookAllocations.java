import java.util.ArrayList;
import java.util.List;

public class BookAllocations {
    public static void main(String[] args) {
        List<Integer> rand = new ArrayList<>();
        int[] arr = {12, 34, 67, 90};
        int k = 2;
        int st = 0 , end = 0;
        for(int i : arr) end +=i;
        int ans = -1;

        while( st <= end){
            int mid = st + (end-st)/2;

            if(helper(mid , arr , k)){
                ans = mid;
                end = mid-1;
            }else st = mid+1;
        }
        System.out.println(ans);
    }
    public static boolean helper(int mid , int[] arr , int k){
        if(k > arr.length) return  false;
        int student = 1 , sum =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > mid) return  false;
            if(sum + arr[i] > mid){
                student++;
                sum = arr[i];
                if(student > k) return false;
            }
            else sum += arr[i];
        }
        return true ;
    }
}
