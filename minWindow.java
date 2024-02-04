class Solution {
    public String minWindow(String s, String t) {
       int left = 0;
        int right = 0;

        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        int count = charMap.size();
        int len = Integer.MAX_VALUE;
        String ans = "";

        while (right < s.length()) {
            char charRight = s.charAt(right);
            if (charMap.containsKey(charRight)) {
                charMap.put(charRight, charMap.get(charRight) - 1);
                if (charMap.get(charRight) == 0) {
                    count--;
                }
            }

            while (count == 0) {
                int tempLen = right - left + 1;
                if (tempLen < len) {
                    len = tempLen;
                    ans = s.substring(left, right + 1);
                }

                char charLeft = s.charAt(left);
                if (charMap.containsKey(charLeft)) {
                    charMap.put(charLeft, charMap.get(charLeft) + 1);
                    if (charMap.get(charLeft) > 0) {
                        count++;
                    }
                }
                left++;
            }

            right++;
        }

        return ans;
    }
}
