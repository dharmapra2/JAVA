/**
 * @param {number[]} nums
 * @return {number}
 * @url https://leetcode.com/problems/longest-square-streak-in-an-array/description/?envType=daily-question&envId=2024-10-28
 */
var longestSquareStreak = function (nums) {
  // Sort nums to make finding sequences easier
  nums.sort((a, b) => a - b);
  let longestStreak = -1;

  // Set to store nums for quick lookup
  const numSet = new Set(nums);

  // Loop through each number to find possible square streaks
  for (let i = 0; i < nums.length; i++) {
    let current = nums[i];
    let streak = 1;

    // Continue finding squares in sequence
    while (numSet.has(current * current)) {
        current = current * current;
        streak++;
        console.log(`i: ${i}, current : ${current}, streak : ${streak}`);
    }

    // Update longest streak if the current streak is valid (length >= 2)
    if (streak >= 2) {
      longestStreak = Math.max(longestStreak, streak);
    }
  }

  return longestStreak;
};

const nums = [4, 3, 6, 16, 8, 2];
// const nums = [2, 3, 5, 6, 7];
const result = longestSquareStreak(nums);
console.log(result);
