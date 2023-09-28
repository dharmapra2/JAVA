import java.util.Arrays;

class sort_arr_by_party {

  public static void main(String[] args) {
    int nums[] = { 3, 1, 2, 4, 5, 3, 2, 1, 3, 8, 45, 2, 23, 1, 9, 41, 12 };

    int prev = 0, next = nums.length - 1;
    int step = 0;
    System.out.printf("prev = %d, next =%d\n", prev, next);
    while (prev < next) {
      if ((nums[next] & 1) == 0 && (nums[prev] & 1) == 0) {
        prev++;
      } else if ((nums[next] & 1) == 0) {
        int temp = nums[next];
        nums[next] = nums[prev];
        nums[prev] = temp;
        next--;
        // by adding below prev incerement value it's getting O(n-3) which is similarly to O(n)
        prev++;
      } else if ((nums[next] & 1) != 0 && (nums[prev] & 1) != 0) {
        next--;
      } else if ((nums[next] & 1) != 0) {
        next--;
      }
      step++;
    }
    System.out.println(Arrays.toString(nums));
    System.out.println(step);
  }
}
/*
 * o/p [2,4,2,8,2,12,3,1,5,3,1,3,45,23,1,9,41]
 *
 * i/p:- [3,1,2,8,4]  o/p:- [2,8,4,3,1]
 *
 * it's time complexity is now O(n)
 */
