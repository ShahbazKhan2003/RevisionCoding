import java.util.Arrays;

public class AggresiveCow {
    public static int binarySearch(int[] stalls , int k){
        int st = 0 , end = stalls[stalls.length-1] - stalls[0];
        int ans = 1;

        while(st <= end){
            int mid = st + (end -st)/2;

            if(helper(mid , stalls , k)){
                ans = mid;
                st = mid+1;
            }
            else end = mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 4, 9} ;
        int k = 3;
        Arrays.sort(arr);

        //linear search
        int ans = aggressiveCows(arr , k);
        System.out.println(ans);
        //binary search
        int ans1 = binarySearch(arr , k);
        System.out.println(ans1);
    }
    public static int aggressiveCows(int[] arr , int k){
        int end = arr[arr.length-1] ;
        for(int i=end;i>=1;i--){
            if(helper(i , arr , k)){
                return  i;
            }
        }
        return 1;
    }
    public static boolean helper(int val , int[] arr , int k){
        int cow = 1 , lastPlace = arr[0];
        for(int i=1;i<arr.length;i++){
           if(arr[i] - lastPlace >= val){
               cow++;
               if(cow >= k) return  true;
               lastPlace = arr[i];
           }
        }
        return false;
    }
}
