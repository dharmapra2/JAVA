/**
 * @url https://leetcode.com/problems/number-of-senior-citizens/?envType=daily-question&envId=2024-08-01
 * @param {string[]} details
 * @return {number}
 */
var countSeniors = function (details) {
  let count = 0;
  details.forEach((element) => {
    let temp_age = +element.slice(-4, -2);
    temp_age > 60 ? count++ : null;
  });
  return count;
};

const details = ["7868190130M7522", "5303914400F9211", "9273338290F4010"];

console.log(countSeniors(details));
