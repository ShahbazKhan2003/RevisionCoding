import java.util.Stack;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s = "(()())";
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){

            if(st.isEmpty()) st.push(ch);

            else{
                char top = st.peek();
                if(top != ch && st.size()>=2){
                    st.pop();
                    sb.append("()");
                }
                else if(top != ch && st.size()==1) st.pop();
                else st.add(ch);
            }
        }
        System.out.println(sb);
    }
}