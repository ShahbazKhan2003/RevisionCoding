import java.util.HashSet;
import java.util.Set;

public class LongestConsSub {
    public static void main(String[] args) {
        int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
        if(nums.length == 0) System.out.println(0);
        Set<Integer> h = new HashSet<>();
        int max = 0;
        for(int i : nums) h.add(i);

        for(int it : h){
            if(!h.contains(it-1)){
                int curr = it;
                int count = 1;
                while(h.contains(curr+1)){
                    curr++;
                    count++;
                }
                max = Math.max(max , count);
            }
        }
        System.out.println(max);
    }
}
