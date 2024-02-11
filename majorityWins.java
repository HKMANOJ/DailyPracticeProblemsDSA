class Solution {
    // Function to find element with more appearances between two elements in an
    // array.
    public int majorityWins(int arr[], int n, int x, int y) {
        // code here
        HashMap<Integer,Integer> map =new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
       
                int countx=map.getOrDefault(x,0);
                int county=map.getOrDefault(y,0);
               // if(countx == 0 ||county==0)return 0;
                if(countx>county || countx ==county && x<y )
                    return x;
                else if(county>countx || countx == county && x>y) 
                return y;
                else
        return x;
        
    }
}
