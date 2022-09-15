// 9 3
// 1 2 3 1 4 5 2 3 6

// 5 5
// 1 2 3 4 5

function max_of_subarrays(arr, n, k) {
  if (n == 1) {
    return arr;
  }
  let maxShift = n - k;
  let maxArr = [];
  for (let i = 0; i <= maxShift; i++) {
    let right = i + k;
    let maxNo = Math.max(...arr.slice(i, right));
    maxArr.push(maxNo);
  }
  return maxArr;
}
let arr = [1,6,3,6,345,67,34,6,367,36,345,456,456,567,235,5756,2345,234,4,2,5,35,67,3,6,3,43,1,6,3,6,345,67,34,6,367,36,345,456,456,567,235,5756,2345,234,4,2,5,35,67,3,6,3,43];
let k = 5;
// console.log(arr.slice(0, 3), arr);
console.log(max_of_subarrays(arr, arr.length, k));
