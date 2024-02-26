

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        List<String> list=new ArrayList<>();
        
        findsubsequences(s,"", list);
        Collections.sort(list);
        list.remove("");
        return list;
        
    }
     private static void findsubsequences(String s,
                                         String ans,List<String> list)
    {
        if (s.length() == 0) {
            list.add(ans);
            return;
        }
 
        // We add adding 1st character in string
        findsubsequences(s.substring(1), ans + s.charAt(0),list);
 
        // Not adding first character of the string
        // because the concept of subsequence either
        // character will present or not
        findsubsequences(s.substring(1), ans,list);
    }
}
