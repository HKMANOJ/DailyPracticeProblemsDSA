class Solution{
    static String findLargest(int N, int S){
        
        // code here
         if(S==0 && N!=1){
            return "-1";
        }
        // code here
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<N;i++){
            if(S >=9){
                sb.append(9);
                S-=9;
            }else{
                 sb.append(S);
                S=0;
            }
        }
        if(S>0){
            return "-1";
        }
        
        return sb.toString();
    }
}
