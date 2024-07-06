/**
 * https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/?envType=daily-question&envId=2024-05-01
 * @param {*} nums
 * @returns
 */

var findMaxK = function (nums) {
  nums = nums.sort((a, b) => a - b);
  let start = 0,
    end = nums.length - 1;
  while (start < end) {
    let temp_start = nums[start] * -1;
    if (temp_start == nums[end]) {
      return temp_start;
    } else if (temp_start > nums[end]) {
      start++;
    } else {
      end--;
    }
  }
  return -1;
};

const nums = [-1, -12, 2, -3, 3];
console.log(findMaxK(nums));
