import java.util.HashMap;
import java.util.Map;

public class CounttheNumberofGoodSubarrays {
    public static void main(String[] args) {
        int[] nums  = {3,1,4,3,2,2,4};
        int k = 2;

        long ans = countGood(nums , k);
        System.out.println(ans);
    }
    public static long countGood(int[] nums, int k) {
        long ans = 0;
        long pairs = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int i = 0 ;
        int n = nums.length;

        for(int j=0;j<n;j++){
            pairs += map.getOrDefault(nums[j] , 0);

            map.put(nums[j] , map.getOrDefault(nums[j] , 0)+1);

            while(pairs >= k ){
                ans += n - j;

                int val = nums[i++];
                map.put(val , map.get(val)-1);
                pairs -= map.get(val);
            }
        }
        return ans;
    }
}
