
//Initial Template for Java
import java.io.*;

public class Rotate_array {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            int k = Integer.parseInt(read.readLine());

            String input_line[] = read.readLine().trim().split("\\s+");
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            ob.rotate(a, k);

            for (int i = 0; i < n; i++)
                System.out.print(a[i] + " ");
            System.out.println();
        }
    }
}

class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length == 1 || k % nums.length == 0) {
            return;
        }

        k = k % nums.length;

        int tempA[] = new int[k];

        for (int i = nums.length - k, j = 0; i < nums.length; i++, j++) {
            tempA[j] = nums[i]; // store the last k elements to a temp array
        }

        for (int i = nums.length - 1 - k; i >= 0; i--) {
            nums[i + k] = nums[i]; // move the first length-k elements forward by k steps
        }

        for (int i = 0; i < tempA.length; i++) {
            nums[i] = tempA[i]; // replace the first k elements with the last k elements stored in the temp
                                // array
        }

    }
}