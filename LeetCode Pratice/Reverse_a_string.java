// { Driver Code Starts
//Initial Template for Java
import java.io.*;
class Reverse_a_string
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            new Reverse();
            System.out.println(Reverse.reverseWord(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
      StringBuilder sb=new StringBuilder(str);  
    sb.reverse();  
    return sb.toString();  
    }
}