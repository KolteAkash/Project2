import java.util.Scanner;

public class MissingNumber1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a = sc.nextInt();
        int arr1[] = new int[a];
        int sum = 0;
        System.out.println("Enter the elements of array=");
        for (int i = 0; i < a; i++) 
        {
            arr1[i] = sc.nextInt();
            sum += arr1[i];
        }
        int missingNumber = MissingNumber(arr1);
        System.out.println("Missing number = " + missingNumber);
    }

    private static int MissingNumber(int[] arr1) 
    {
        int n = arr1.length + 1;
        int sum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int i = 0; i < arr1.length; i++) 
        {
            arrSum += arr1[i];
        }
        return sum - arrSum;
    }
}
