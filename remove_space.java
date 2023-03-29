public class remove_space 
{
	public static void main(String[] args) 
    {  
        String str = " I Love India ";
        int len = str.length();
        int start = 0; 
        int end = len - 1;
                        
        while (start < len && str.startsWith(" ", start)) 
            {
                start++;
            }
                        
            while (end >=0 && str.startsWith(" ",end)) 
                {
                    end--;
                }
                        
                String result = (start <= end)? str.substring(start, end + 1) : "";
                System.out.println("Result: \"" + result + "\"");
    }
    
}
