// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class string_match {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            String A = sc.nextLine();
            String B = sc.nextLine();
            Solution ob = new Solution();
            System.out.println(ob.repeate_String_Match(A, B));
            t--;
        }
        sc.close();
    }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
    int repeate_String_Match(String A, String B) {
        // Your code goes here
        String s = A;
        int res = 1;

        while (s.length() <= A.length() * 2 + B.length()) {
            if (s.contains(B))
                return res;

            res++;
            s = s + A;
        }
        return -1;
    }
}
