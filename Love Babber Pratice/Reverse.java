//Initial Template for Java

import java.io.*;

class Reverse {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String str = read.readLine();
            new Solution();
            System.out.println(Solution.reverseWord(str));
        }
    }
}// } Driver Code Ends

// User function Template for Java

class Solution {
    // Complete the function
    // str: input string
    public static String reverseWord(String str) {
        // Solution the string str
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }
}