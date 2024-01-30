class Solution {
    public static int evalRPN(String[] tokens) {
        if(tokens.length == 1){ return Integer.parseInt(tokens[0]);}
        Stack<Integer> stack = new Stack<>();
        int total = 0;
        for(int i=0; i<tokens.length; i++){
            if(tokens[i].matches("-?\\d+")){
                stack.add(Integer.parseInt(tokens[i]));
            }else{
                int b = stack.pop(), a = stack.pop();
                switch(tokens[i]){
                    case "/": total = a/b; 
                    stack.add(a/b); break; 
                    case "*": total = a*b; 
                    stack.add(a*b); break;
                    case "-": total = a-b; 
                    stack.add(a-b); break;
                    case "+": total = a+b; 
                    stack.add(a+b); break;
                }
            }
        }
        return total;
    }
}
