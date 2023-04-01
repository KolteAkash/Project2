import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Missingnum
{
    public static void main(String[] args) 
    {
        int[] arr = {7,5,6,1,4,2};
        int[] arr1 = {5,3,1,2};
        List<Integer> missingArr = MissingNumber(arr);
        List<Integer> missingArr1 = MissingNumber(arr1);

        Collections.sort(missingArr);
        Collections.sort(missingArr1);
        System.out.println("Missing numbers in array 1 = " + arr);
        System.out.println("Missing numbers in array 2 = " + arr1);
    }

    public static List<Integer> MissingNumber(int[] arr) 
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : arr) 
        {
            if (num > max) 
            {
                max = num;
            }
            if (num < min) 
            {
                min = num;
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) 
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> missing = new ArrayList<>();
        for (int i = min; i <= max; i++) 
        {
            if (!map.containsKey(i)) 
            {
                missing.add(i);
            }
        }

        return missing;
    }
}