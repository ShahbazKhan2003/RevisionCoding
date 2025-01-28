import java.util.Arrays;

public class SumofBeautyofAllSubstrings {
    public static void main(String[] args) {
        String s = "aabcb";
        int n = s.length();
        int ans = 0;

        for(int i=0;i<n;i++){
            int[] freq = new int[26];
            int max = 0;
            for(int j=i;j<n;j++){
                int min = Integer.MAX_VALUE;
                freq[s.charAt(j) - 'a']++;
                max = Math.max(max , freq[s.charAt(j) - 'a']);

                for(int k=0;k<26;k++){
                    if(freq[k] > 0) min = Math.min(min ,freq[k]);
                }
                ans+=max-min;
            }
        }
        System.out.println(ans);
    }

}
