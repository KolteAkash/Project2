import java.util.Arrays;
public class Missingnum 
{
	
	    public static void main(String[] args) {
	        int[] arr1 = {7, 5, 6, 1, 4, 2};
	        int[] arr2 = {5, 3, 1, 2};

	        System.out.println("Missing numbers in arr1:");
	        int[] missing1 = findMissingNumbers(arr1);
	        System.out.println(Arrays.toString(missing1));

	        System.out.println("Missing numbers in arr2:");
	        int[] missing2 = findMissingNumbers(arr2);
	        System.out.println(Arrays.toString(missing2));
	    }

	    public static int[] findMissingNumbers(int[] arr) {
	        Arrays.sort(arr);
	        int count = 0;

	        for (int i = 1; i < arr.length; i++) {
	            int diff = arr[i] - arr[i - 1];
	            if (diff > 1) {
	                count += diff - 1;
	            }
	        }

	        int[] missingNumbers = new int[count];
	        int index = 0;

	        for (int i = 1; i < arr.length; i++) {
	            int diff = arr[i] - arr[i - 1];
	            if (diff > 1) {
	                for (int j = arr[i - 1] + 1; j < arr[i]; j++) {
	                    missingNumbers[index++] = j;
	                }
	            }
	        }

	        return missingNumbers;
	    }
	}
