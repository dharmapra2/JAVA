import java.io.*;
import java.lang.*;
import java.util.*;

class ncr {

  public static void main(String args[]) {
    int n = 4;
    int r = 3;

    Solution ob = new Solution();
    System.out.println(ob.search(new int[] { 5, 6, 7, 8, 9, 10, 1, 2, 3 }, 10));
  }
}

class Solution {

  int[][] dp;

  int nCr(int n, int r) {
    if (r > n) return 0;

    dp = new int[n + 1][r + 1];
    return calculateNCr(n, r);
  }

  int calculateNCr(int n, int r) {
    if (r == 0 || n == r) return 1;

    if (dp[n][r] != 0) return dp[n][r];

    int result = calculateNCr(n - 1, r - 1) + calculateNCr(n - 1, r);
    dp[n][r] = result;
    // System.out.println(Arrays.deepToString(dp));
    return result;
  }

  int search(int arr[], int key) {
    int found = -1;
    int l = 0, h = arr.length - 1;
    System.out.println(l + " =>" + h);

    while (l > h) {
      int mid = l + (l + h) / 2;
      if(arr[mid]==key)return key;
      else if (arr[mid] < arr[mid + 1]) {
        
      }
    }

    return found;
  }
}
