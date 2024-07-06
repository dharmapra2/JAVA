import java.util.Arrays;

/**
 * https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/?envType=daily-question&envId=2024-05-01
 * largest_positive_integer_that_exists_with_its_negative
 */
public class largest_positive_integer_that_exists_with_its_negative {

  public static void main(String[] args) {
    int[] nums = { -1, 2, -3, 3, -9 };
    Innerlargest_positive_integer_that_exists_with_its_negative sol = new Innerlargest_positive_integer_that_exists_with_its_negative();
    System.out.println(sol.findMaxK(nums));
  }
}

/**
 * Innerlargest_positive_integer_that_exists_with_its_negative
 */
class Innerlargest_positive_integer_that_exists_with_its_negative {

  public int findMaxK(int[] nums) {
    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));

    int start = 0, end = nums.length - 1;
    while (start < end) {
      int temp_start = nums[start] * -1;
      if (temp_start == nums[end]) {
        return temp_start;
      } else if (temp_start > nums[end]) {
        start++;
      } else {
        end--;
      }
    }
    System.out.println(end);
    return -1;
  }
}
