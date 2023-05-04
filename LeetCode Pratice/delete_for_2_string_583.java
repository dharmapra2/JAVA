import java.util.Arrays;

class delete_for_2_string_583 {

  public static void main(String[] args) {
    String text1 = "seea", text2 = "eat";
    Solution sol = new Solution();
    System.out.println(sol.minDistance(text1, text2));
  }
}

class Solution {

  public int minDistance(String text1, String text2) {
    int m = text1.length();
    int n = text2.length();
    int[][] memo = new int[m + 1][n + 1];

    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        if (text1.charAt(i - 1) != text2.charAt(j - 1)) {
          memo[i][j] = 1 + Math.min(memo[i - 1][j], memo[i][j - 1]);
        } else {
          memo[i][j] = memo[i - 1][j - 1];
        }
      }
    }
    System.out.println(Arrays.deepToString(memo));
    return memo[m][n];
  }
}
