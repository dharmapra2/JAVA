public class Single_ele_in_sorted_arr {

  public static void main(String[] args) {
    int nums[] = { 2, 3, 3, 4, 4, 5, 5 };
    Solution sol = new Solution();
    System.out.print(sol.singleNonDuplicate(nums));
  }
}

class Solution {

  public int singleNonDuplicate(int[] nums) {
    /** initializing pointers to the indices of array */
    int left = 0, right = nums.length - 1, mid = 0;
    while (left < right) {
      mid = (left + right) / 2;
      /** if mid is odd then substact it by 1 */
      if (mid % 2 == 1) {
        mid--;
      }
      /** compare mid element is not equal to it's right element,
            then single element must be on the left side of array. 
            so update right pointer to be the current mid index , otherwise update middle
            index plus 2 */
      if (nums[mid] != nums[mid + 1]) {
        right = mid;
      } else {
        left = mid + 2;
      }
    }
    return nums[left];
  }
}
