import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class union_of_2_arr {

  public static void main(String[] args) throws Exception {
    int[] nums1 = { 1, 2, 3, 4, 5, 6, 7 };
    int[] nums2 = { 1, 2, 3, 4, 5, 6, 7 };
    System.out.println(
      //   Arrays.deepToString(
      new Solution().findUnion(nums1, nums2, nums1.length, nums2.length)
      //   )
    );
  }
}

class Solution {

  public ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
    Set<Integer> uniqueValues = new HashSet<Integer>();
    for (int i = 0; i < n; i++) {
      uniqueValues.add(arr1[i]);
    }
    for (int i = 0; i < m; i++) {
      uniqueValues.add(arr2[i]);
    }
    return new ArrayList<Integer>(uniqueValues);
  }
}
