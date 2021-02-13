// { Driver Code Starts
//Initial Template for Java
package Basics;
import java.io.*;
import java.util.*;

class Find_sum_of_divisors
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            int ans  = ob.sumOfDivisors(N);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int sumOfDivisors(int N){
        // code here
       int result=0;
        for(int i=1;i<=N;i=i+1){
            if(N%i==0){
                result=result+i;
            }
        }
        
        return result;
    }
}