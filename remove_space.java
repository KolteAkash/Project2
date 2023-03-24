public class remove_space 
{
    
        public static void main(String[] args) 
        {
            String str = " I Love India ";
            
            while (str.charAt(0) == ' ') 
            {
                str = str.substring(1);
            }
            
            while (str.charAt(str.length() - 1) == ' ') 
            {
                str = str.substring(0, str.length() - 1);
            }
            
            System.out.println("Output: \"" + str + "\"");
        }
    
}
