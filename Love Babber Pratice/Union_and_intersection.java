//Initial Template for Java

import java.util.*;

class Union_and_intersection {
	public static void main(String[] args) {

		// Taking input using class Scanner
		Scanner sc = new Scanner(System.in);

		// Taking total count of testcases
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {

			int n, m;

			// taking size of array a
			n = sc.nextInt();

			// taking size of array b
			m = sc.nextInt();

			// Creating 2 array of size n and m
			int a[] = new int[n];
			int b[] = new int[m];

			// inserting elements to array a
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			// inserting elements to array b
			for (int i = 0; i < m; i++) {
				b[i] = sc.nextInt();
			}
			// calling doUnion method and printing the results
			System.out.println(Solution.doUnion(a, n, b, m));
		}
		sc.close();
	}
}// } Driver Code Ends

// User function Template for Java

class Solution {
	public static int doUnion(int a[], int n, int b[], int m) {
		// Your code here
		Set<Integer> arr = new LinkedHashSet<>();
		for (int a1 : a)
			arr.add(a1);
		for (int b1 : b)
			arr.add(b1);
		int len = arr.size();
		return len;
	}
}