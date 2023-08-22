import static java.lang.System.out;

import java.util.Arrays;

public class make_matrix_beautifull {

  public static void main(String[] args) {
    int[][] matrix = { { 4, 1, 1 }, { 1, 3, 5 }, { 4, 1, 5 } };
    int n = matrix[0].length;
    int[] maxRows = new int[n];
    int[] maxCols = new int[n];
    int maxSum = Integer.MIN_VALUE;

    /**
     * Calculate the maxsum and preserve max rows and cols values
     */
    for (int i = 0; i < n; i++) {
      int row = 0;
      int col = 0;
      for (int j = 0; j < n; j++) {
        int val = matrix[i][j];
        row += val;
        col += matrix[j][i];
      }
      maxRows[i] = row;
      maxCols[i] = col;
      maxSum = Math.max(maxSum, Math.max(row, col));
    }
    out.println(Arrays.deepToString(matrix));

    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int col = maxCols[j], row = maxRows[i];
        if (col == maxSum || row == maxSum) {
          continue;
        }
        int val = (col > row) ? (maxSum - col) : (maxSum - row);
        matrix[i][j] += val;
        maxCols[j] += val;
        maxRows[i] += val;
        count += val;
      }
    }

    out.println(Arrays.toString(maxRows));
    out.println(Arrays.toString(maxCols));
    out.println(count);
  }
}
