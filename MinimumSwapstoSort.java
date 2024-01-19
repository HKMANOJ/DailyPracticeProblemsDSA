class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int arr[])
    {
        int N=arr.length;
       int ans = 0; 
        int[] temp = Arrays.copyOfRange(arr, 0, N); 
        Arrays.sort(temp); 
        for (int i = 0; i < N; i++) { 
  
            // This is checking whether 
            // the current element is 
            // at the right place or not 
            if (arr[i] != temp[i]) { 
                ans++; 
  
                // Swap the current element 
                // with the right index 
                // so that arr[0] to arr[i] is sorted 
                swap(arr, i, indexOf(arr, temp[i])); 
            } 
        } 
        return ans; 
    } 
    public void swap(int[] arr, int i, int j) 
    { 
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
    } 
    public int indexOf(int[] arr, int ele) 
    { 
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] == ele) { 
                return i; 
            } 
        } 
        return -1; 
        
    }
}
