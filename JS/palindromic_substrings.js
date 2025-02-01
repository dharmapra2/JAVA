/**
 * https://leetcode.com/problems/palindromic-substrings/
 * 
 * Given a string s, return the number of palindromic substrings in it.
 * 
 * A string is a palindrome when it reads the same backward as forward.
 * A substring is a contiguous sequence of characters within the string.
 * 
 * Example 1: 
    - Input: s = "abc" 
    - Output: 3 
    - Explanation: Three palindromic strings: "a", "b", "c". 
 * Example 2: 
    - Input: s = "aaa" 
    - Output: "6"
    - Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 *
 */

/**
 * @param {string} s
 * @return {string}
 */
var countSubstrings = function (s) {
  let strLen = s.length;
  if (strLen <= 1) return 1;

  let dp = Array.from({ length: strLen }, (_, index) => Array(strLen).fill(0));
  let count = 0;
  // Every single character is a palindrome
  for (let i = 0; i < strLen; i++) {
    dp[i][i] = 1;
    count++;
  }

  // Check for two-character palindromes
  for (let i = 0; i < strLen - 1; i++) {
    if (s[i] === s[i + 1]) {
      dp[i][i + 1] = 1;
      count++;
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
        count++;
      } else {
        dp[i][j] = 0;
      }
    }
  }

  return count;
};

// Test Cases
console.log(countSubstrings("babad")); // Output: "bab" or "aba"
console.log(countSubstrings("cbbd")); // Output: "bb"
console.log(countSubstrings("racecar")); // Output: "racecar"
console.log(countSubstrings("a")); // Output: "a"
console.log(countSubstrings("abcda")); // Output: "a"
console.log(countSubstrings("aaa")); // Output: "a"
