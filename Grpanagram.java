class Solution {
    public List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagramGroups = new HashMap<>();
       
        // Iterate through each word in the input array
        for (String word : words) {
            // Sort the characters in the word to create a key
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
           
           
            if (!anagramGroups.containsKey(key)) {
                anagramGroups.put(key, new ArrayList<>(List.of(word)));
            }
            // If key is already present, append the word to the existing list
            else {
                anagramGroups.get(key).add(word);
            }
        }
       
        // Convert map values to a list and return
        return new ArrayList<>(anagramGroups.values());
 
    }
}