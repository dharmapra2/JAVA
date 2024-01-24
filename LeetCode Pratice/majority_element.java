import java.util.Arrays;

/**
 * https://leetcode.com/problems/majority-element/
 * majority_element
 * 
 * approaches:-
 * 1. with sorting tc:- O(n log n)
 * 2. Using Boyer-Moore Voting Algorithm 
 * 3. Using Boyer-Moore Voting Algorithm but including validation check which make it more efficient.
 */
public class majority_element {

  public static void main(String[] args) {
    // int arr[] = { 6, 6, 6, 7, 7 };
    int arr[] = { 3, 2, 3 };
    // int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
    Innermajority_element sol = new Innermajority_element();
    System.out.println(sol.majorityElement(arr));
  }
}

/**
 * Innermajority_element
 */
class Innermajority_element {

  int majorityElement(int[] nums) {
    int len = nums.length;
    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));
    int prev = nums[0], max = 0, count = 1, num = nums[0];
    for (int i = 1; i < len; i++) {
      int temp = nums[i];
      if (prev == temp) {
        int t = ++count - (len >> 1);
        max = Math.max(max, t);
        System.out.printf(
          "index= %d, prev= %d, t= %d, max=%d\n",
          i,
          prev,
          t,
          max
        );
        if (t >= max) {
          num = temp;
        }
      } else {
        prev = temp;
        count = 1;
      }
    }

    return num;
  }
}
