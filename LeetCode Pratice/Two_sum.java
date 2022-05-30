import java.io.*;

public class Two_sum {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());

            String input_line[] = read.readLine().trim().split("\\s+");
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = Integer.parseInt(input_line[i]);
            Solution ob = new Solution();
            int arr[] = new int[2];
            arr = ob.twoSum(a, target);
            for (int a1 : arr) {
                System.out.print(a1);
            }
        }
        System.out.println();
    }
}

class Solution {
    public int[] twoSum(int[] num, int target) {
        int n[] = new int[2];
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    n[0] = i + 1;
                    n[1] = j + 1;
                    return n;
                }
            }
        }
        return n;
    }
}