import java.util.HashMap;
import java.util.Scanner;
public class occurance 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) 
        {
            char ch = Character.toLowerCase(c);
            if (charCount.containsKey(ch)) 
            {
                int count = charCount.get(ch);
                charCount.put(ch, ++count);
            } else 
            {
                charCount.put(ch, 1);
            }
        }
        System.out.println(charCount);
    }

 
}
