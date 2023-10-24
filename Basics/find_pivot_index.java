/**
 * Input: nums = [1,7,3,6,5,6]
 * Output: 3
 * Explanation:
 * The pivot index is 3.
 * Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
 * Right sum = nums[4] + nums[5] = 5 + 6 = 11
 */
public class find_pivot_index {

  public static void main(String[] args) {
    int arr[] = { 2, 1, -1 };
    System.out.println(new Solution().pivotIndex(arr));
  }
}

class Solution {

  public int pivotIndex(int[] nums) {
    int totalSum = 0, left = 0;
    // calculate the total sum
    for (int i : nums) {
      totalSum += i;
    }
    for (int i = 0; i < nums.length; i++) {
      if (i > 0) {
        left += nums[i - 1];
      }
      int right = totalSum - left - nums[i];
      System.out.printf("Left=%d, right=%d, total=%d\n", left, right, totalSum);
      if (left == right) {
        return i;
      }
    }

    return -1;
  }
}
