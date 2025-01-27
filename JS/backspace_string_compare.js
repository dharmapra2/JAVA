// https://leetcode.com/problems/backspace-string-compare/
/**
 * @description Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.  
 * Note that after backspacing an empty text, the text will continue empty.
 * 
 * Example 1: 
    - Input: s = "ab#c", t = "ad#c" 
    - Output: true 
    - Explanation: Both s and t become "ac". 
 * Example 2: 
    - Input: s = "ab##", t = "c#d#" 
    - Output: true 
    - Explanation: Both s and t become "". 
 * Example 3: 
    - Input: s = "a#c", t = "b" 
    - Output: false 
    - Explanation: s becomes "c" while t becomes "b".
 */

/**
 * here we'll do like stack DSA using array
 */

var backspaceCompare = function (s, t) {
  let temps = "";
  for (const temp of s) {
    if (temp == "#") {
      temps = temps.slice(0, -1);
    } else {
      temps += temp;
    }
  }
  let tempt = "";
  for (const temp of t) {
    if (temp == "#") {
      tempt = tempt.slice(0, -1);
    } else {
      tempt += temp;
    }
  }
  return temps == tempt;
};

var backspaceCompare_approach_2 = function (s, t) {
  const getNextValidCharIndex = (str, index) => {
    let backspaceCount = 0;
    while (index >= 0) {
      if (str[index] === "#") {
        // Keeps track of the backspaceCount to skip characters effectively.
        backspaceCount++;
      } else if (backspaceCount > 0) {
        // Skips characters that are invalid due to backspaces (#).
        backspaceCount--;
      } else {
        break;
      }
      index--;
    }
    return index;
  };

  let i = s.length - 1;
  let j = t.length - 1;

  while (i >= 0 || j >= 0) {
    i = getNextValidCharIndex(s, i);
    j = getNextValidCharIndex(t, j);

    if (i >= 0 && j >= 0 && s[i] !== t[j]) {
      return false;
    }

    if (i >= 0 !== j >= 0) {
      return false; // One string has characters left while the other doesn't
    }

    i--;
    j--;
  }

  return true;
};

let s = "ab#c",
  t = "ad#c";
console.log(backspaceCompare(s, t)); // true
console.log(backspaceCompare_approach_2("ab#c", "ad#c")); // true
console.log(backspaceCompare_approach_2("ab##", "c#d#")); // true
console.log(backspaceCompare_approach_2("ab##d", "c#d#r")); // false
console.log(backspaceCompare_approach_2("a#c", "b")); // false
