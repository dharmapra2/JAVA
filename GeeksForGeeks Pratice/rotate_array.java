import java.io.*;
import java.util.*;

public class rotate_array {

  public static void main(String[] args) throws Exception {
    int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
    new Solution().leftRotate(nums, nums.length, 2);
    System.out.println("final");
    for (int i : nums) {
      System.out.print(i + " ");
    }
  }
}

class Solution {

  void rev_array(int[] arr, int start, int end) {
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  void leftRotate(int arr[], int n, int d) {
    d = d & n - 1;
    rev_array(arr, 0, n - 1);
    rev_array(arr, 0, n - d - 1);
    rev_array(arr, n - d, n - 1);
  }
}
