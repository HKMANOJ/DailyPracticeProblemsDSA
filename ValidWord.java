package leetcode;

public class ValidWord {
    public static boolean isValid(String word) {

        if(word.length()<3) return false;

        int vowels = 0;
        int consonants = 0;

        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                // Check for vowels (case-insensitive)
                if ("aeiouAEIOU".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (!Character.isDigit(c)) {
                return false; // Invalid character if not a letter or digit
            }
        }

        return vowels >= 1 && consonants >= 1;
    }

    public static void main(String[] args) {

        String word = "234Adas";

        System.out.println(isValid(word));

    }
}
