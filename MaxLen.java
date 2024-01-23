class Solution {
    int n;  
     HashMap<String,Integer> map = new HashMap<>();
    public int maxLength(List<String> arr) {
     
            n=arr.size();
            return solve (arr,0,"");
 
    }
       public int solve(List<String> arr, int idx, String res){
        String key = res + ":" + idx;
        if(map.containsKey(key)) return map.get(key);
 
        if(idx == n) return res.length();
 
        char[] chr = arr.get(idx).toCharArray();
 
        HashSet<Character> set = new HashSet<>();
        boolean canConcatenate = true; // Check if the current string can be concatenated to res
        for(char ch : chr){
            if(set.contains(ch) || res.contains(String.valueOf(ch))){
                canConcatenate = false;
                break;
            }
            set.add(ch);
        }
 
        int takeIt = 0;
        if (canConcatenate) {
            takeIt = solve(arr, idx + 1, res + arr.get(idx));
        }
       
        int not = solve(arr, idx + 1, res);
        int ans = Math.max(takeIt, not);
        map.put(key, ans);
        return ans;
       }
}