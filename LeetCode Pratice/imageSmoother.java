import java.util.Arrays;

/**
 * imageSmoother
 * https://leetcode.com/problems/image-smoother/?envType=daily-question&envId=2023-12-19
 */
public class imageSmoother {

  public static void main(String[] args) {
    int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    System.out.println(Arrays.deepToString(new Solution().imageSmoother(arr)));
  }
}

/* 
 * Example 1
 * input: 
 * [1] [2] [3] 
 * [4] [5] [6] 
 * [7] [8] [9] 
 * 
 * output:
 * [3] [3] [4]
 * [4] [5] [5]
 * [6] [6] [7]

 * Cell (0, 0) is smoothed to have a value of 3 because floor((1 + 2 + 4 + 5) / 4) = 3
 * Cell (0, 1) is smoothed to have a value of 4 because floor((1 + 2 + 3 + 4 + 5 + 6) / 6) = 3
 * Cell (0, 2) is smoothed to have a value of 4 because floor((2 + 3 + 5 + 6) / 4) = 4
 * Cell (1, 0) is smoothed to have a value of 4 because floor((1 + 2 + 4 + 5 + 7 + 8) / 6) = 4
 * Cell (1, 1) is smoothed to have a value of 5 because floor((1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9) / 9) = 5
 * Cell (1, 2) is smoothed to have a value of 5 because floor((2 + 3 + 5 + 6 + 8 + 9) / 6) = 5
 * Cell (2, 0) is smoothed to have a value of 6 because floor((4 + 5 + 7 + 8) / 4) = 6
 * Cell (2, 1) is smoothed to have a value of 6 because floor((4 + 5 + 6 + 7 + 8 + 9) / 6) = 6
 * Cell (2, 2) is smoothed to have a value of 7 because floor((5 + 6 + 8 + 9) / 4) = 7
 */
class Solution {

  static int m = 0, n = 0;
  static int output[][];

  public int[][] imageSmoother(int[][] img) {
    m = img.length;
    n = img[0].length;
    output = new int[m][n];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        output[i][j] = smoothPixel(img, i, j);
      }
    }

    return output;
  }

  private boolean isValidPixel(int row, int col) {
    return row >= 0 && row < m && col >= 0 && col < n;
  }

  private int smoothPixel(int[][] img, int row, int col) {
    int sum = 0;
    int count = 0;

    for (int i = row - 1; i <= row + 1; i++) {
      for (int j = col - 1; j <= col + 1; j++) {
        if (isValidPixel(i, j)) {
          sum += img[i][j];
          count++;
        }
      }
    }

    return sum / count;
  }
}
