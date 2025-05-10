public class MinimumEqualSum {
    public static void main(String[] args) {
        int nums1[] = {8,13,15,18,0,18,0,0,5,20,12,27,3,14,22,0};
        int nums2[] = {29,1,6,0,10,24,27,17,14,13,2,19,2,11};
        long ans = minSum(nums1 , nums2);
        System.out.println(ans);

    }
    public static long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0, cZ1 = 0;
        long sum2 = 0, cZ2 = 0;

        for (int i : nums1) {
            if (i == 0) cZ1++;
            sum1 += i;
        }

        for (int i : nums2) {
            if (i == 0) cZ2++;
            sum2 += i;
        }

        long minSum1 = sum1 + cZ1;
        long minSum2 = sum2 + cZ2;

        if (minSum1 > minSum2) {
            long diff = minSum1 - sum2;
            if (cZ2 == 0 || diff < cZ2) return -1;
            return minSum1;
        } else if (minSum2 > minSum1) {
            long diff = minSum2 - sum1;
            if (cZ1 == 0 || diff < cZ1) return -1;
            return minSum2;
        } else {
            return minSum1;
        }
    }
}
