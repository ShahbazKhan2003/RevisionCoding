import java.util.HashMap;
import java.util.Map;

public class SubarrayWithCountK {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k = 2;

        Map<Integer,Integer> h = new HashMap<>();
        int curr = 0 , max = 0;

        for(int i=0;i<arr.length;i++){
            curr+=arr[i];

            if(curr == k) max++;

            int rem = curr - k;

            if(h.containsKey(rem)) max++;

            h.putIfAbsent(curr , i);
        }
        System.out.println(max);
    }
}
