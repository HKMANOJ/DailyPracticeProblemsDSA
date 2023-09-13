lass Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
       int [] result= new int [n];
        Arrays.fill(result, 1);
        for(int i =1; i <n; i++){
            if (ratings[i]> ratings[i-1])
                result[i]=result[i-1]+1;
        }
        for(int i = n-2;i>=0; i--){
            if (ratings[i]> ratings[i+1])
                result[i]=Math.max(result[i+1]+1, result[i]);
        }
        int sum =0;
        for(int candy:result)
            sum+=candy;
        return sum;
    }
}
