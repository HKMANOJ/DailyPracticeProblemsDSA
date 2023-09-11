class Solution
{
                              //n=5
    public static boolean isLucky(int n)
    {
        // Your code here
            //Start with 2
        for(int i=2;i<=n;i++){
            if(n%i==0)return false;  //(5%2==0) no
            n=n-(n/i);               //n become=3 how (5-2)
        }
        return true;                 //after the itteration i become 3 and n become 3 3%3==0 so ans->false
    }
}
