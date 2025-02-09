import java.util.Arrays;

public class KokoEatingBanana {
    public static int minEatingSpeed1(int[] piles, int h) {
        int n = piles.length;
       int st = 0 , end = piles[n-1]+1;
       int ans = Integer.MAX_VALUE;

       while( st <= end){
           int mid = st + (end - st)/2;
           if(helper(mid , piles , h)){
               ans = Math.min(ans , mid);
               end = mid-1;
           }else st= mid+1;
       }
       return ans;
    }
    public static void main(String[] args) {
        int arr[]  = {30,11,23,4,20};
        int h = 5;
        Arrays.sort(arr);
        // Linear Search
        int ans = minEatingSpeed(arr , h);
        System.out.println(ans);
        //BinarySearh
        int bin = minEatingSpeed1(arr , h);
        System.out.println(bin);
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int ans = 0 , n = piles.length;
        for(int i=1;i<=piles[n-1];i++){
            if(helper( i , piles , h)) return i;
        }
        return 0;
    }
    public static boolean helper(int val , int[] piles , int h){
        int sum = 0;
        for(int i=0;i<piles.length;i++){
            sum+=Math.ceil((double) piles[i] / val);
            if(sum > h) return false;
        }
        return sum <= h;
    }
}