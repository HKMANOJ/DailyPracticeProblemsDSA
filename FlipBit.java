public class FlipBit {


        public static int maxOnes(int a[], int n) {
            // Your code goes here
            int count=0;
            int one=0;
            int max=0;
            for(int i=0;i<n;i++){
                if(a[i]==0){
                    count++;
                }else{
                    count--;
                    one++;
                    if(count<0)
                    {
                        count=0;
                    }
                }
                if(count>max){
                    max=count;
                }
            }

            return max+one;
        }

    public static void main(String[] args) {
       int N = 5;
       int A[] = {1, 0, 0, 1, 0};
        System.out.println(maxOnes(A,N));
    }
}
