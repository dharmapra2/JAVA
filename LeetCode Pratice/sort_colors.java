import java.util.Arrays;

/**
 * https://leetcode.com/problems/sort-colors/description/
 *
 * approach-1:-
 *    use any sorting algo
 *
 * approach-2:-
 *    count 1's, 2's & 0's.
 *    And then overwrite in array based on counts.
 *
 * approach-3:- (Use DNF algo)
 */
public class sort_colors {

  public static void main(String[] args) {
    int arr[] = { 2, 0, 2, 1, 1, 0 };
    Innersort_colors sol = new Innersort_colors();
    System.out.println(Arrays.toString(arr));
    sol.sortColors(arr);
    System.out.println(Arrays.toString(arr));
  }
}

/**
 * Innersort_colors
 */
class Innersort_colors {

  public void swapNo(int index1, int index2, int[] arr) {
    if (index1 != index2) {
      arr[index1] ^= arr[index2];
      arr[index2] ^= arr[index1];
      arr[index1] ^= arr[index2];
    }
  }

  public void sortColors(int[] nums) {
    int low = 0, mid = 0, high = nums.length - 1;
    while (mid <= high) {
      int temp_n1 = nums[mid];
      if (temp_n1 == 0) {
        swapNo(low, mid, nums);
        low++;
        mid++;
      } else if (temp_n1 == 2) {
        swapNo(high, mid, nums);
        high--;
      } else {
        mid++;
      }
    }
  }
}
