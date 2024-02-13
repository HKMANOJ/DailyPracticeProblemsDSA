class Solution {
    public String firstPalindrome(String[] words) {
                for (String s : words) {
            String reversed = new StringBuilder(s).reverse().toString();

            if (s.equals(reversed)) {
                return s;
            }
        }
        return "";
    }
}
//////////
class Solution {
    private boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        
        while (start <= end) {
            // Return false if the characters are not the same.
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            
            start++;
            end--;
        }
        
        return true;
    }
    
    public String firstPalindrome(String[] words) {
        for (String s : words) {
            if (isPalindrome(s)) {
                return s;
            }
        }
        
        return "";
    }
}
