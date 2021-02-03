// { Driver Code Starts
//Initial Template for Java
package 30DAYS_CODE_gfg;
import java.io.*;
import java.util.*; 

 // } Driver Code Ends








//User function Template for Java

class Solution 
{ 
	static int maxCandy(int height[], int n) 
	{ 
	    // Your code goes here
	     int max = 0;
 
        // Check all possible pairs of buildings
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int current = (Math.min(height[i],
                                        height[j])
                               * (j - i - 1));
 
                // Maximum so far
                max = Math.max(max, current);
            }
        }
        return max;
	}
}



// { Driver Code Starts.
class gfg8{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int height[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                height[i] = sc.nextInt();
            }

            Solution ob = new Solution();
            System.out.println(ob.maxCandy(height,n));
            t--;
        }
	} 
} 

  // } Driver Code Ends