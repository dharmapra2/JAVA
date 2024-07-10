/**
 * @link https://leetcode.com/problems/words-within-two-edits-of-dictionary/description/
 * @param {string[]} queries
 * @param {string[]} dictionary
 * @return {string[]}
 */
function difference(array1, array2) {
  const maxLength = Math.max(array1.length, array2.length);
  let differences = 0;

  for (let i = 0; i < maxLength; i++) {
    if (array1[i] !== array2[i]) {
      differences++;
      if (differences > 2) {
        break;
      }
    }
  }

  return differences;
}
var twoEditWords = function (queries, dictionary) {
  let result = [];
  for (let i = 0; i < queries.length; i++) {
    let chs = queries[i];
    for (let j = 0; j < dictionary.length; j++) {
      let inn_chs = dictionary[j];
      const diff_len = difference(chs, inn_chs);
      if (diff_len <= 2) {
        result.push(queries[i]);
        break;
      }
    }
  }
  return result;
};
const queries = ["word", "note", "ants", "wood"],
  dictionary = ["wood", "joke", "moat"];
console.log(twoEditWords(queries, dictionary));
