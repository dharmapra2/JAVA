public class count_neg_in_matrix {

  public static void main(String[] args) {
    int[][] grid = {
      { 4, 3, 2, 1 },
      { 3, 2, 1, 1 },
      { 1, 1, 1, -2 },
      { 2, -3, -4, -5 },
    };
    System.out.println(new Solution().countNegatives(grid));
  }
}

class Solution {

  public int countNegatives(int[][] grid) {
    int i = 0;
    int j = grid[0].length - 1;
    int count = 0;

    while (i < grid.length && j >= 0) {
      if (grid[i][j] < 0) {
        count += (grid.length - i);
        j--;
      } else if (grid[i][j] >= 0) {
        i++;
      }
    }
    return count;
  }
}
