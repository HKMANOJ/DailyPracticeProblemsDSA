import java.util.ArrayList;

public class Solution {

	public static int findDuplicate(ArrayList<Integer> arr) {
      int answer=0;

 

    for(int i=0; i<arr.size();i++)

    {

        answer=answer^arr.get(i);

 

    }

        for(int i=1; i<arr.size();i++)

    {

        answer=answer^i;

 

    }

    return answer;

    }
}
