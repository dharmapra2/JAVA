// { Driver Code Starts
//Initial Template for Java
package 30DAYS_CODE_gfg;
import java.io.*;
import java.util.*;
class Transfiguration
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transfigure (A, B));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    int transfigure (String A, String B)
    {
    	// Your code goes here.
    	int n=A.length()-1;int m=B.length()-1;
if(!Arrays.equals(A.chars().sorted().toArray(),B.chars().sorted().toArray()))
return -1;
int ans=0;
while(n>=0)
{
if(A.charAt(n)==B.charAt(m))
{
m--;
ans++;
}
n--;
}
return A.length()-ans;
    }
}