/**
maximum_avg_subarray
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

 */
public class maximum_avg_subarray {

  public static void main(String[] args) {
    int arr[] = { 1, 12, -5, -6, 50, 3 };
    int k = 6;

    System.out.println(new Solution().findMaxAverage(arr, k));
  }
}

class Solution {

  // approach 1
  public double findMaxAverage(int[] nums, int k) {
    int len = nums.length;
    double max = Double.MIN_VALUE;
    double sum = 0;

    for (int i = 0; i < k; i++) {
      sum += nums[i];
    }

    max = sum / k;

    for (int i = k; i < len; i++) {
      sum = sum - nums[i - k] + nums[i];
      max = Math.max(max, sum / k);
    }

    return max;
  }
}
