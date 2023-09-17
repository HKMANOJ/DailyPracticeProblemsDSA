class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        if(n == 1)
        return new long[]{1};
        if(n == 2)
        return new long[]{1,1};
      long[] answer = new long[n];
        answer[0] = 1;
        answer[1] = 1;
        
        for(int i=2;i<n;i++){
                 answer[i] = answer[i-1] + answer[i-2];
        }
        
        return answer;
    }
}
