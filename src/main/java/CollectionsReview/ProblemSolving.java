package CollectionsReview;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProblemSolving
{
    public static void main(String[] args) {
        int[] num ={2,7,9,11};
        System.out.println(Arrays.toString(twoSum1(num, 9)));
        System.out.println(Arrays.toString(twoSum2(num,9)));
    }

    public static int[] twoSum1(int[]arr, int target)
    {

        for (int i =0; i < arr.length-1; i++) {
            for (int j =i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSum2 (int[]arr, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i< arr.length; i++)
        {
            int potentialMatch = target -arr[i];
            if (map.containsKey(potentialMatch))
                return new int[]{i, map.get(potentialMatch)};
            else map.put(arr[i],i);
        }
        return new int[]{};
    }
}
