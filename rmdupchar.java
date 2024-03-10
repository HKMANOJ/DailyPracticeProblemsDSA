   String removeDuplicates(String str) {
        HashMap<Character, Integer> HM=new HashMap<>();
        String ans="";
        for(int i=0; i<str.length(); i++){
            HM.put(str.charAt(i), HM.getOrDefault(str.charAt(i), 0)+1);
            // check char is greater than 1 or not
            if(HM.get(str.charAt(i))<=1){
                ans+=str.charAt(i);   
            }
        }
        return ans;
    }
////////////////////
class Solution {
    String removeDuplicates(String str) {
        int n=str.length();
           ArrayList<Character>arr=new ArrayList<>();
     for(int i=0;i<n;i++){
         if(!(arr.contains(str.charAt(i)))){
             arr.add(str.charAt(i));
         }
     }
     String st="";
     for(int i=0;i<arr.size();i++){
         st=st+arr.get(i);
     }
     return st;
    }
}
