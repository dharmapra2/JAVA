import java.util.Arrays;
import java.util.HashMap;

class find_flowers {

  public static void main(String[] args) {
    int[][] arr = { { 1, 6 }, { 3, 7 }, { 9, 12 }, { 4, 13 } };
    int[] people = { 2, 3, 7, 11 };
    int[] ans = new Solution().fullBloomFlowers(arr, people);
    System.out.println();
    System.out.println(Arrays.toString(ans));
  }
}

class Solution {

  private int findIndex(int[] arr, int target, boolean flag) {
    int left = 0;
    int right = arr.length;

    while (left < right) {
      int mid = left + (right - left) / 2;
      boolean cond = flag ? arr[mid] < target : arr[mid] <= target;
      if (cond) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    return left;
  }

  public int[] fullBloomFlowers(int[][] flowers, int[] people) {
    int psize = people.length, fsize = flowers.length;
    int count[] = new int[psize];
    int[] fstart = new int[fsize];
    int[] fend = new int[fsize];

    for (int i = 0; i < fsize; i++) {
      int t0 = flowers[i][0], t1 = flowers[i][1];
      fstart[i] = t0;
      fend[i] = t1;
    }
    // fkey.entrySet()
    Arrays.sort(fstart);
    Arrays.sort(fend);

    for (int i = 0; i < psize; i++) {
      int t = people[i];
      int started = findIndex(fstart, t, false);
      int ended = findIndex(fend, t, true);
      System.out.printf("\n ele= %d, s= %d, end= %d", t, started, ended);
      count[i] = started - ended;
    }

    return count;
  }
}
