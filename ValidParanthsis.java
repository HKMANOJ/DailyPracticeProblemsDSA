class Solution {
    public String minRemoveToMakeValid(String s) {
       Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                stack.push(i);
            }else if(ch == ')'){
                if(!stack.isEmpty() && s.charAt(stack.peek()) == '('){
                    stack.pop();
                }else{
                    stack.push(i);
                }
            }
        }
        while(!stack.isEmpty()){
            sb.deleteCharAt(stack.pop());
        }
        return sb.toString(); 
    }
}
