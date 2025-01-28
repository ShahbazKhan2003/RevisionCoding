public class Atoi {
    public static void main(String[] args) {
        String s = "10-helper";
        int ans  = helper(s);
        System.out.println(ans);
    }
    public static int helper(String s){
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign  = 1 , idx =0;
       if(s.charAt(idx) == '-'){
           sign = -1;
           idx++;
       }
       else if(s.charAt(idx) == '+'){
           sign = 1;
           idx++;
       }

       int ans = 0;

       while(idx < s.length()){
           char ch = s.charAt(idx);
           if(!Character.isDigit(ch)) break;

           int dg = ch - '0';

           if(ans > (Integer.MAX_VALUE - dg) /10){
               return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
           }

           ans = ans *10 + dg;
           idx++;
       }
       return sign * ans;
    }
}
