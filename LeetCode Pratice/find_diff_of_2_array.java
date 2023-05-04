import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class find_diff_of_2_array {

  public static void main(String[] args) {
    int nums1[] = { 1, 2, 3 };
    int nums2[] = { 2, 4, 6 };
    Solution sol = new Solution();
    List<List<Integer>> result = sol.findDifference2(nums1, nums2);
    System.out.println(result);
  }
}

class Solution {

  // Approach 1
  public List<List<Integer>> findDifference(int arr1[], int arr2[]) {
    List<Integer> diff1 = new ArrayList<>();
    List<Integer> diff2 = new ArrayList<>();
    Set<Integer> num1 = new HashSet<>();
    Set<Integer> num2 = new HashSet<>();
    for (int a : arr1) {
      num1.add(a);
    }
    for (int a : arr2) {
      num2.add(a);
    }
    for (int num : num1) {
      if (!num2.contains(num)) {
        diff1.add(num);
      }
    }
    for (int num : num2) {
      if (!num1.contains(num)) {
        diff2.add(num);
      }
    }

    List<List<Integer>> result = new ArrayList<>();
    result.add(diff1);
    result.add(diff2);
    System.gc();

    return result;
  }

  //   Approach 2
  public List<List<Integer>> findDifference2(int[] nums1, int[] nums2) {
    List<Integer> diff1 = getDifference(nums1, nums2);
    List<Integer> diff2 = getDifference(nums2, nums1);
    return Arrays.asList(diff1, diff2);
  }

  private List<Integer> getDifference(int[] nums1, int[] nums2) {
    List<Integer> difference = new ArrayList<>();
    boolean[] seen = new boolean[2001];

    for (int i : nums2) {
      seen[i + 1000] = true;
    }

    for (int i : nums1) {
      if (!seen[i + 1000]) {
        seen[i + 1000] = true;
        difference.add(i);
      }
    }
    System.gc();
    return difference;
  }
}
