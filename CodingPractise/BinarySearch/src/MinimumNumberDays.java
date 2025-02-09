import java.util.Arrays;

public class MinimumNumberDays {
    public static int minDays1(int[] arr, int m, int k) {
        int st = Arrays.stream(arr).min().getAsInt();
        int end = Arrays.stream(arr).max().getAsInt();
        int ans = Integer.MAX_VALUE;

        while (st <= end){
            int mid = st + (end - st)/2;

            if(helper(mid , arr , m ,k)){
                ans = Math.min(ans , mid);
                end = mid-1;
            }else st = mid+1;
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,10,2,9,3,8,4,7,5,6};
        int m = 4 , k = 2;
        //Linear Search
        int ans = minDays(arr , m , k);
        System.out.println(ans);
        //BinarySearch
        int ans1 = minDays1(arr , m , k);
        System.out.println(ans1);
    }
    public static int minDays(int[] arr, int m, int k) {
        int n = arr.length;
        if( m * k > n) return -1;
        int ans = Integer.MAX_VALUE;

        int max = Arrays.stream(arr).max().getAsInt();

        for(int i=9 ; i<=max;i++){
            if(helper(i , arr , m , k)) {
                return i;
            }
        }
        return -1;
    }
    public static boolean helper(int val , int[] arr , int m , int k){
        int count = 0 , adj = 0;
        for(int i=0;i<arr.length;i++){
            if( val >= arr[i]){
                adj++;
                if(adj == k){
                    count++;
                    if(count >= m) return true;
                }
                if(adj == k) adj=0;
            }
            else {
                adj = 0;
            }
        }
        return false;
    }
}
