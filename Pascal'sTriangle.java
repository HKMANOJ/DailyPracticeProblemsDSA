class Solution {
  //leetCode problem
    public List<List<Integer>> generate(int numRows) {
        //Initally Taking ListofList to store the answer
       List<List<Integer>> tria = new ArrayList<>(numRows);

       //treversing through loop
        for(int r = 0; r < numRows; r++){

            //here i am storeing the values 1for all
            List<Integer>cols = new ArrayList<>(Collections.nCopies(r+1, 1));

          
            for(int c = 1; c<r; c++){

                //here taking the above value example [1,1]
                //                                    [1,2,1]
                cols.set(c, tria.get(r-1).get(c-1) + tria.get(r-1).get(c));
            }
            //storing the ans to list
            tria.add(cols);
        }
        return tria;
    }
}

//////////////////////////////Normal method
public static void printPascal(int n)
{
// An auxiliary array to store generated pascal triangle values
int[][] arr = new int[n][n]; 
  
// Iterate through every line and print integer(s) in it
for (int i = 0; i < n; i++)
{
    // Every line has number of integers equal to line number
    for (int j = 0; j <= j; j++)
    {
    // First and last values in every row are 1
    if (i == j || j == 0)
        arr[i][j] = 1;
    else // Other values are sum of values just above and left of above
        arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
    System.out.print(arr[i][j]);
    }
    System.out.println("");
}
