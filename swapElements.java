
class Solution
{
    public void swapElements(int[] arr, int n)
    {
        // Code here
        for(int i=2;i<n; i++){
            int tmp =arr[i];
            arr[i]= arr[i-2];
            arr[i-2]=tmp;
        }
    }
    
    
}
