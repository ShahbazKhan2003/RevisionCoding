public class RotateString {
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        boolean ans = helper(s , goal);
        System.out.println(ans);
    }
    public static boolean helper(String s , String goal){
        int i=0 , n = s.length();
        if(n != goal.length()) return false;
        String sb = s;
        while(i < n-1){
            if(s.equals(goal)) return true;
            s = s.substring(1) + s.substring(0,1);
            i++;
        }
        return false;
    }
}
