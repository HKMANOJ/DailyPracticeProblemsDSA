class Solution {
    public String removeKdigits(String num, int k) {
            Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int l = num.length();
        for(int i = 0; i < l; i++){
            char a = num.charAt(i);
            while(!st.isEmpty() && k > 0 && a < st.peek()){
                st.pop();
                k--;
            }
            st.push(a);  
        }

        //remove elements from right side
        while(!st.isEmpty()){
            if(k > 0){
                st.pop();
                k--;
            }
            else{
            sb.insert(0, st.pop());
            }
        }
        //remove leading zeros
        while(sb.length() > 0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }

        return (sb.length() == 0) ? "0" : sb.toString();
    }
    
}
