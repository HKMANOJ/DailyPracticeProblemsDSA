package String;

import java.util.Stack;

public class StringGreat {
    public static String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch)){
                if(!st.isEmpty() && st.peek()==Character.toLowerCase(ch)){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }else{
                if(!st.isEmpty() && st.peek()==Character.toUpperCase(ch)){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(makeGood(s));
    }
}
