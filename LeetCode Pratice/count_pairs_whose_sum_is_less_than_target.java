import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class count_pairs_whose_sum_is_less_than_target {

  public static void main(String[] args) {
    // int arr[] = { -1, 1, 2, 3, 1 };
    int arr[] = { -6, 2, 5, -2, -7, -1, 3 };
    List<Integer> integerList = new ArrayList<>();
    for (int value : arr) {
      integerList.add(value);
    }

    // Access elements in the list
    System.out.println("Elements in the list:\t" + integerList.toString());

    // System.out.println(new Solution().countPairs(integerList, -2));
    System.out.println(new Solution().countPairs2(integerList, -2));
  }
}

class Solution {

  public int countPairs(List<Integer> nums, int target) {
    int count_pair = 0, len = nums.size();
    for (int i = 0; i < len; i++) {
      int num1 = nums.get(i);
      for (int j = i + 1; j < len; j++) {
        int num2 = nums.get(j);
        if ((num1 + num2) < target) {
          count_pair++;
        }
      }
    }

    return count_pair;
  }

  public int countPairs2(List<Integer> nums, int target) {
    Collections.sort(nums); // sort the vector nums
    int count = 0; // variable to store the count
    int left = 0; // variable to store the left
    int right = nums.size() - 1; // variable to store the right
    while (left < right) { // loop until left is less than right
      if (nums.get(left) + nums.get(right) < target) { // if nums[left] + nums[right] is less than target
        count += right - left; // update the count
        left++; // increment the left
      } else { // else
        right--; // decrement the right
      }
    }
    return count; // return the count
  }
}
