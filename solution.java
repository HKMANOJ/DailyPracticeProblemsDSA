public class Solution {
    public int minimumLength(String s) {
        return deleteSimilarEnds(s, 0, s.length() - 1);
    }

    // Deletes similar ends and returns remaining length
    private int deleteSimilarEnds(String s, int begin, int end) {
        // The ends differ or meet in the middle
        if (begin >= end || s.charAt(begin) != s.charAt(end)) {
            return end - begin + 1;
        } else {
            char c = s.charAt(begin);

            // Delete consecutive occurrences of c from prefix
            while (begin <= end && s.charAt(begin) == c) {
                begin++;
            }

            // Delete consecutive occurrences of c from suffix
            while (end > begin && s.charAt(end) == c) {
                end--;
            }

            return deleteSimilarEnds(s, begin, end);
        }
    }
}