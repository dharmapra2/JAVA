/**
 * https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class k_diff_pairs_in_an_array {

  public static void main(String[] args) {
    int arr[] = { 3, 1, 4, 1, 5 };
    Innerk_diff_pairs_in_an_array sol = new Innerk_diff_pairs_in_an_array();
    // System.out.println(sol.findPairs(arr, 2));
    System.out.println(sol.findPairs_2(arr, 2));
  }
}

/**
 * Innerk_diff_pairs_in_an_array
 */
class Innerk_diff_pairs_in_an_array {

  public int findPairs(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);

    int result = 0;
    for (int i : map.keySet()) {
      if (k > 0 && map.containsKey(i + k) || k == 0 && map.get(i) > 1) result++;
    }
    return result;
  }

  public int findPairs_2(int[] nums, int k) {
    Set<Integer> uniquePair = new HashSet<Integer>();
    Arrays.sort(nums);
    int n = nums.length;

    for (int i = 0; i < n - 1; i++) {
      if (Arrays.binarySearch(nums, i + 1, n, nums[i] + k) > 0) {
        uniquePair.add(nums[i]);
      }
    }
    return uniquePair.size();
  }

  /**
   * binarySearch0 is the internal method of java Array.class
   * @param a
   * @param fromIndex
   * @param toIndex
   * @param key
   * @return
   */
  private static int binarySearch0(
    int[] a,
    int fromIndex,
    int toIndex,
    int key
  ) {
    int low = fromIndex;
    int high = toIndex - 1;

    while (low <= high) {
      int mid = low + high >>> 1;
      int midVal = a[mid];
      if (midVal < key) {
        low = mid + 1;
      } else {
        if (midVal <= key) {
          return mid;
        }

        high = mid - 1;
      }
    }

    return -(low + 1);
  }
}
