import java.io.*;

public class Binary_Search {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            int target = Integer.parseInt(read.readLine());

            String input_line[] = read.readLine().trim().split("\\s+");
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            System.out.println(ob.search(a, target));
        }
    }
}

class Solution {
    public int search(int[] num, int target) {
        int l = 0, u = num.length - 1;
        while (l <= u) {
            int mid = (l + u) / 2;
            if (num[mid] == target) {
                return mid;
            } else if (num[mid] > target) {
                u = mid - 1;
            } else if (num[mid] < target) {
                l = mid + 1;
            }
        }
        return -1;
    }
}