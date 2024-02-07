class Solution {
    public String frequencySort(String s) {
       Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        } 
   PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        maxHeap.addAll(map.keySet());

        StringBuilder ans = new StringBuilder();

        while(!maxHeap.isEmpty()){
            char ch=maxHeap.remove();
            int count=map.get(ch);
            while(count!=0){
                ans.append(ch);
                count--;
            }
        }
        return ans.toString();
    }
}
