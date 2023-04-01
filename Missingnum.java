import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Missingnum 
{
    public static void main(String[] args) 
    {
        int[] arr = {-10,1,2,5,8,-5,-3};
        List<Integer> missing = MissingNumber(arr);
        Collections.sort(missing);
        System.out.println("Missing numbers in the array = " + missing);
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
        for (int num : arr) {
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
