public class pattern_132 {

  public static void main(String[] args) {
    int nums[] = { 3, 1, 4, 2 };
    System.out.println(find132pattern(nums));
  }

  public static boolean find132pattern(int[] nums) {
    int size = nums.length;
    if (size <= 3) return false;
    int i = 0, j = 1, k = 2;
    while ((k < size) && (i < j) && (j < k)) {
      int tempI = nums[i];
      System.out.printf(" i= %d, k= %d, j= %d\n", tempI, nums[k], nums[j]);
      if ((tempI + 3) == nums[k] && (++tempI) == nums[j]) {
        return true;
      }
      i++;
      j++;
      k++;
    }
    return false;
  }
}
