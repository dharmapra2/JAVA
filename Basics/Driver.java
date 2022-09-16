// package Basics;
// { Driver Code Starts
//Initial Template for Java
import java.io.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value");
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String str[] = read.readLine().trim().split(" ");
            
            int input[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                input[i] = Integer.parseInt(str[i]);
            }
            
            //int x = Integer.parseInt(read.readLine());
            Get obj = new Get();
            System.out.println(obj.sumElement(input, n));
            
        }
    }
} 


// } Driver Code Ends


//User function Template for Java


class Get
{
    public int sumElement(int arr[], int n)
    {
        // Your code here
        int sum=arr[0];
        for( int i=1;i<n;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}
