import java.util.Arrays;

/**
 * maxProductDifference
 * https://leetcode.com/problems/maximum-product-difference-between-two-pairs
 *
 */
public class maxProductDifference {

  public static void main(String[] args) {
    int nums[] = { 5, 6, 2, 7, 4 };
    InnermaxProductDifference in = new InnermaxProductDifference();
    // System.out.println(in.approach_1(nums));
    System.out.println(in.approach_2(nums));
  }
}

/**
 * InnermaxProductDifference
 */
class InnermaxProductDifference {

  public int approach_1(int[] nums) {
    Arrays.sort(nums);
    int len = nums.length;
    return (nums[len - 2] * nums[len - 1]) - (nums[0] * nums[1]);
  }

  public int approach_2(int[] nums) {
    int biggest = 0;
    int secondBiggest = 0;
    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;

    for (int num : nums) {
      if (num > biggest) {
        secondBiggest = biggest;
        biggest = num;
      } else {
        secondBiggest = Math.max(secondBiggest, num);
      }

      if (num < smallest) {
        secondSmallest = smallest;
        smallest = num;
      } else {
        secondSmallest = Math.min(secondSmallest, num);
      }
    }

    return biggest * secondBiggest - smallest * secondSmallest;
  }
}
