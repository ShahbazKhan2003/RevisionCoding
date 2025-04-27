import java.util.ArrayList;
import java.util.Arrays;

public class JobSequencing {
    public static void main(String[] args) {
        int[] deadline = {4, 1, 1, 1} ;
        int[] profit = {20 , 30 , 40 , 10};
        int n = profit.length;
        Integer[][] adj = new Integer[n][2];

        for(int i=0;i<n;i++){
            adj[i][0] = deadline[i];
            adj[i][1] = profit[i];
        }
        Arrays.sort(adj , (a , b) -> b[1] - a[1]);

        int maxD = -1;
        for(int i : deadline) maxD = Math.max(i , maxD);

        int[] deadlineCheck = new int[maxD+1];
        Arrays.fill(deadlineCheck , -1);
        int max = 0;
        int job = 0;

        for(int i=0;i<n;i++){
            for(int j = adj[i][0];j>0;j--){
                if(deadlineCheck[j] == -1){
                    max+= adj[i][1];
                    job++;
                    deadlineCheck[j] = i;
                    break;
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(job);
        ans.add(max);
        System.out.println(ans);
    }
}