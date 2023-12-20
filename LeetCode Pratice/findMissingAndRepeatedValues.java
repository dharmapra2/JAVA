import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * findMissingAndRepeatedValues
 * https://leetcode.com/problems/find-missing-and-repeated-values/
 */
public class findMissingAndRepeatedValues {

  public static void main(String[] args) {
    int arr[][] = { { 1, 2 }, { 4, 4 } };
    System.out.println(
      Arrays.toString(
        new InnerfindMissingAndRepeatedValues()
          .findMissingAndRepeatedValues(arr)
      )
    );
  }
}

/**
 * InnerfindMissingAndRepeatedValues
 */
class InnerfindMissingAndRepeatedValues {

  public int[] findMissingAndRepeatedValues(int[][] grid) {
    int row = grid.length, col = grid[0].length;
    int end = row * col;
    int output[] = new int[2];
    int arr[] = new int[end];

    for (int i = 0; i < end; i++) {
      int element = grid[i % row][i / row];
      if (arr[element - 1] != 0) {
        arr[element - 1] = arr[element - 1] * -1;
        output[0] = element;
      } else {
        arr[element - 1] = element * -1;
      }
    }
    System.out.println(Arrays.toString(arr));
    for (int i = 0; i < end; i++) {
      int ele = arr[i];
      if (ele == 0) {
        output[1] = ++i;
        break;
      }
    }
    return output;
  }

  public int[] findRepeatedAndMissing(int[][] grid) {
    int row = grid.length;
    int col = grid[0].length;
    int end = row * col;

    int[] output = new int[2];
    int[] arr = new int[end];

    for (int i = 0; i < end; i++) {
      int element = grid[i % row][i / row];
      int index = Math.abs(element) - 1;

      // Use bitwise XOR to identify repeated occurrences
      if ((arr[index] & (1 << 31)) == 0) {
        arr[index] |= 1 << 31;
      } else {
        output[0] = Math.abs(element);
      }

      // Use bitwise XOR to find the missing number
      arr[index] ^= element;
    }

    for (int i = 0; i < end; i++) {
      if ((arr[i] & (1 << 31)) == 0) {
        output[1] = i + 1;
        break;
      }
    }

    return output;
  }
}
