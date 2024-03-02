    public int firstElementKTime(int n, int k, int[] arr) { 
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            
        
        
              if(map.get(arr[i]) == k) {
                return arr[i];
            }
        } 
        return -1;
        
    }
