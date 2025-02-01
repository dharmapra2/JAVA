/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * 
 * 
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * Example 1:
  - Input: s = "abcabcbb"
  - Output: 3
  - Explanation: The answer is "abc", with the length of 3.
 * Example 2:
  - Input: s = "bbbbb"
  - Output: 1
  - Explanation: The answer is "b", with the length of 1.
 * Example 3:
  - Input: s = "pwwkew"
  - Output: 3
  - Explanation: The answer is "wke", with the length of 3.
  - Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 */

var lengthOfLongestSubstring = function (s) {
  let longString = "";
  let maxLength = 0;
  for (let tempCh of s) {
    if (longString.includes(tempCh)) {
      let index = longString.indexOf(tempCh);
      console.log(`index : ${index}`);
      if (index >= 0) {
        longString = longString.slice(index + 1);
        console.log(`index longString : ${longString}`);

        longString += tempCh;
      } else {
        longString = tempCh;
      }
    } else {
      longString += tempCh;
    }
    maxLength = Math.max(longString.length, maxLength);
    console.log(longString.indexOf(tempCh), tempCh, longString);
  }
  return maxLength;
};

var lengthOfLongestSubstring_with_sliding_window = function (s) {
  let charIndexMap = new Map(); // Stores character and its last seen index
  let maxLength = 0;
  let left = 0; // Left boundary of the sliding window

  for (let right = 0; right < s.length; right++) {
    let tempCh = s[right];

    // If character is found in map and is within the current window
    if (charIndexMap.has(tempCh) && charIndexMap.get(tempCh) >= left) {
      left = charIndexMap.get(tempCh) + 1; // Move left pointer to avoid repetition
    }

    charIndexMap.set(tempCh, right); // Update character's latest index
    maxLength = Math.max(maxLength, right - left + 1); // Update max length
  }

  return maxLength;
};

// console.log(lengthOfLongestSubstring_with_sliding_window("abcabcbb"));
// console.log(lengthOfLongestSubstring_with_sliding_window("dvdf"));
console.log(lengthOfLongestSubstring_with_sliding_window("ohvhjdml"));
