/**
 * @url https://leetcode.com/problems/baseball-game/description/
 * @param {string[]} operations
 * @return {number}
 */
var calPoints = function (operations) {
  let arr = [];
  operations.forEach((element) => {
    switch (element) {
      case "D":
        arr.push(arr[arr.length - 1] * 2);
        break;
      case "C":
        arr.pop();
        break;
      case "+":
        arr.push((arr[arr.length - 1] ?? 0) + (arr[arr.length - 2] ?? 0));
        break;
      default:
        arr.push(+element);
        break;
    }
  });
  return arr.reduce((prev, curr) => curr + prev, 0);
};

console.log(calPoints(["5", "2", "C", "D", "+"]));
console.log(calPoints(["5", "-2", "4", "C", "D", "9", "+", "+"]));
console.log(calPoints(["1", "C"]));
