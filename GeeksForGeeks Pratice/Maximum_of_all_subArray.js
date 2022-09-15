// 9 3
// 1 2 3 1 4 5 2 3 6

// 5 5
// 1 2 3 4 5

function max_of_subarrays(arr, n, k) {
  if (n == 1) {
    return arr;
  }
  let maxArr = [];
  let max = arr[0];
  for (let i = 1, j = 1; i < n; i++, j++) {
    if (arr[i] > max) {
      max = arr[i];
    }
    if (j >= k - 1) {
      maxArr.push(max);
    }
  }
  if (maxArr.length == 0) maxArr.push(max);
  return maxArr;
}
let arr = [10];
let k = 5;
// console.log(arr.slice(0, 3), arr);
console.log(max_of_subarrays(arr, arr.length, k));
