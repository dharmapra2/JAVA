/**
 *
 * https://leetcode.com/problems/reverse-prefix-of-word/?envType=daily-question&envId=2024-05-01
 */
(function (word, ch) {
  //   const word = "abxzcd",
  //     ch = "z";
  let indexOfCh = word.indexOf(ch) + 1;

  //   Method 1
  let reverseWord = word
    .slice(0, indexOfCh)
    .split("")
    .reverse()
    .join("")
    .concat(word.slice(indexOfCh));
  console.log(reverseWord);

  //   Method 2
  // Reverse the prefix directly
  let reversedPrefix = "";
  for (let i = indexOfCh - 1; i >= 0; i--) {
    reversedPrefix += word[i];
  }
  // Concatenate the reversed prefix with the rest of the word
  reverseWord = reversedPrefix + word.slice(indexOfCh);
  console.log(reverseWord);
})("abxzcd", "c");
