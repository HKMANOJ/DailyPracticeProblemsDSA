

class Solution {
    String printLargest(int n, String[] arr) {
        
              Arrays.sort(arr, new Comparator<String>() {
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });
     StringBuilder s = new StringBuilder();
     for(String str:arr)
     s.append(str);
       return s.toString();
    }
}
