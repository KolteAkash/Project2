public class occurance {
    public static void main(String args[])
    {
        
        String str = "india";
        int[] count = new int[128];
        for(int i=0;i<str.length();i++)
        {
            count[str.charAt(i)]++;
        
        }
        for(int i=65;i<128;i++)
        {
            if(count[i]!=0)
            {
                System.out.println((char)i +" = "+count[i]);
            }
        }
    }
        
}