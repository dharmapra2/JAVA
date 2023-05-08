import java.util.Arrays;

class matrix_sum_diagonal {

  public static void main(String[] args) {
    int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    Solution sol = new Solution();
    System.out.println(sol.diagonalSum(arr));
  }
}

class Solution {

  public int diagonalSum(int[][] mat) {
    System.out.println(Arrays.deepToString(mat));
    int len = mat.length, sum = 0;
    for (int i = 0; i < len; ++i) {
      sum += mat[i][i] + mat[i][len - i - 1];
    }
    if (len % 2 == 1) {
      sum -= mat[len / 2][len / 2];
    }
    System.gc();
    return sum;
  }
}
