/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 * 
 * Given a string s, return the longest palindromic substring in s.
 * 
 * Example 1: 
    - Input: s = "babad" 
    - Output: "bab" 
    - Explanation: "aba" is also a valid answer. 
 * Example 2: 
    - Input: s = "cbbd" 
    - Output: "bb"
 *
 */

/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function (s) {
  let strLen = s.length;
  if (strLen <= 1) return s; // Base case: single-character strings are palindromes

  let dp = Array.from({ length: strLen }, (_, index) => Array(strLen).fill(0));
  let start = 0,
    maxLength = 1;

  // Every single character is a palindrome
  for (let i = 0; i < strLen; i++) {
    dp[i][i] = 1;
  }

  // Check for two-character palindromes
  for (let i = 0; i < strLen - 1; i++) {
    if (s[i] === s[i + 1]) {
      dp[i][i + 1] = 1;
      start = i;
      maxLength = 2;
    } else {
      dp[i][i + 1] = 0;
    }
  }

  // Fill DP table for substrings of length 3 and more
  for (let length = 3; length <= strLen; length++) {
    for (let i = 0; i <= strLen - length; i++) {
      let j = i + length - 1; // Ending index
      if (s[i] === s[j] && dp[i + 1][j - 1]) {
        dp[i][j] = 1;
        start = i;
        maxLength = length;
      } else {
        dp[i][j] = 0;
      }
    }
  }
  //   console.table(dp);

  return s.substring(start, start + maxLength);
};

// Test Cases
console.log(longestPalindrome("babad")); // Output: "bab" or "aba"
console.log(longestPalindrome("cbbd")); // Output: "bb"
console.log(longestPalindrome("racecar")); // Output: "racecar"
console.log(longestPalindrome("a")); // Output: "a"
console.log(longestPalindrome("abcda")); // Output: "a"

palindromic_substrings;
