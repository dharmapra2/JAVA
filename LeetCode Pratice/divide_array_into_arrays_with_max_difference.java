import java.util.Arrays;

/**
 * divide_array_into_arrays_with_max_difference
 */
public class divide_array_into_arrays_with_max_difference {

  public static void main(String[] args) {
    // int arr[] = { 1, 3, 4, 8, 7, 9, 3, 5, 1 };
    int arr[] = { 4, 2, 9, 8, 2, 12, 7, 12, 10, 5, 8, 5, 5, 7, 9, 2, 5, 11 };
    Innerdivide_array_into_arrays_with_max_difference sol = new Innerdivide_array_into_arrays_with_max_difference();
    System.out.println(Arrays.deepToString(sol.divideArray(arr, 14)));
  }
}

/**
 * Innerdivide_array_into_arrays_with_max_difference
 */
class Innerdivide_array_into_arrays_with_max_difference {

  public int[][] divideArray(int[] nums, int k) {
    Arrays.sort(nums);
    int len = nums.length;
    int[][] result = new int[len / 3][3];
    System.out.println(Arrays.deepToString(result));
    for (int i = 0; i < len; i += 3) {
      int num1 = nums[i], num2 = nums[i + 1], num3 = nums[i + 2];
      if ((num3 - num1) <= k) {
        result[i / 3] = new int[] { num1, num2, num3 };
      } else {
        return new int[0][];
      }
    }
    return result;
  }
}