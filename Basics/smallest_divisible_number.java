// { Driver Code Starts
//Initial Template for Java
import java.util.*;

public class smallest_divisible_number {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Solution2 g = new Solution2();
            System.out.println(Solution2.getSmallestDivNum(n));
        }
        sc.close();
    }
}

// } Driver Code Ends

// User function Template for Java

class Solution2 {
    public static long getSmallestDivNum(int n) {
        // code here
        long s = 1;

        for (long i = 2; i <= n; i++) {
            s = lcm(s, i);
        }

        return s;
    }

    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
}
