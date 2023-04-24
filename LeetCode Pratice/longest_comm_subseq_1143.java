import java.util.Arrays;

class longest_comm_subseq_1143 {

  public static void main(String[] args) {
    String text1 = "abccc", text2 = "bbbdwef";
    Solution sol = new Solution();
    System.out.println(sol.longestCommonSubsequence(text1, text2));
  }
}

class Solution {

  private int[][] memo;

  // approach 2
  public int longestCommonSubsequence(String text1, String text2) {
    int m = text1.length();
    int n = text2.length();
    memo = new int[m + 1][n + 1];

    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
          memo[i][j] = 1 + memo[i - 1][j - 1];
        } else {
          memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]);
        }
      }
    }
    return memo[m][n];
  }

  //   Approach 1 (using recursion and memosization) here time limit excede
  //   public int longestCommonSubsequence(String text1, String text2) {
  //     int m = text1.length();
  //     int n = text2.length();
  //     memo = new int[m][n];

  //     int t = search(text1, text2, 0, 0);
  //     // System.out.println(Arrays.deepToString(memo));
  //     return t;
  //   }

  private int search(String s1, String s2, int i, int j) {
    if (i >= s1.length() || j >= s2.length()) {
      return 0;
    }
    if (memo[i][j] != -1) {
      return memo[i][j];
    }
    if (s1.charAt(i) == s2.charAt(j)) {
      return memo[i][j] = 1 + search(s1, s2, i + 1, j + 1);
    }
    return (
      memo[i][j] = Math.max(search(s1, s2, i + 1, j), search(s1, s2, i, j + 1))
    );
  }
}
/**
 * In this code, we first declare a LongestCommSubseq class with a main() method to run the program. Then, we declare a Solution class to solve the problem of finding the length of the longest common subsequence between two strings.
 * The Solution class has a private memo variable to store the results of the subproblems. In the longestCommonSubsequence() method, we initialize the memo array with zeros and call the search() method to solve the problem.
 * The search() method takes the two strings and two indices as input, and returns the length of the longest common subsequence between the substrings starting from the given indices.
 * Inside the search() method, we first check if we have already computed the result for the current indices using the memo array. If we have, we return the stored result.
 * Otherwise, we compute the result recursively by checking if the current characters of the two strings match or not. If they match, we add 1 to the result and move on to the next characters in both strings. If they do not match, we consider two options: either move to the next character in the first string or move to the next character in the second string, and take the maximum of the two.
 * After computing the result, we store it in the memo array and return it.
 * This implementation is more efficient than the original implementation because it uses memoization to avoid recomputing subproblems and updates the indices correctly in the recursive calls.
 */
