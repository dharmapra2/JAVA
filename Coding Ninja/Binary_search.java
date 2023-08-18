public class Binary_search {

  public static int search(int[] nums, int target) {
    // n is the size of the array 'nums'
    int n = nums.length - 1;

    // Initialising two variables
    // 's' and 'e'
    int s = 0, e = n - 1;
    while (s <= e) {
      // Initializing the variable 'mid'
      int mid = (s + e) >> 1;

      // If the current index's value is equal to
      // target, we will return the current index
      if (nums[mid] == target) {
        return mid;
      }
      // If the value is greater than target,
      // we will decrease the value of 'e'
      else if (nums[mid] > target) {
        e = mid - 1;
      }
      // Otherwise, we will increase the value
      // of 's'
      else {
        s = mid + 1;
      }
    }

    // If we didn't find anything, we will return -1.
    return -1;
  }
}
