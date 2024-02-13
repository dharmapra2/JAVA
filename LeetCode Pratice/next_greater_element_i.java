import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * next_greater_element_i
 * https://leetcode.com/problems/next-greater-element-i/
 */

public class next_greater_element_i {

  public static void main(String[] args) {
    int nums1[] = { 4, 1, 2 }, nums2[] = { 1, 3, 4, 2 };
    Innernext_greater_element_i sol = new Innernext_greater_element_i();
    System.out.println(Arrays.toString(sol.nextGreaterElement(nums1, nums2)));
  }
}

class Innernext_greater_element_i {

  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    /**
     * T.C:- O(len1+len2)
     * Using monotonic stack
     */
    int len1 = nums1.length, len2 = nums2.length;
    Stack<Integer> stack = new Stack<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = len2 - 1; i >= 0; i--) {
      int currEle = nums2[i];
      while (i < len2 && !stack.empty() && currEle > stack.peek()) {
        stack.pop();
      }
      map.put(currEle, !stack.isEmpty() ? stack.peek() : -1);
      stack.push(currEle);
    }
    int result[] = new int[len1];
    for (int i = 0; i < len1; i++) {
      int ele = nums1[i];
      result[i] = map.getOrDefault(ele, -1);
    }

    return result;
  }

  public int nextElement(int num, int nums[]) {
    int i = num + 1;
    while (i < nums.length) {
      if (nums[i] > nums[num]) {
        return nums[i];
      }
      i++;
    }
    return -1;
  }

  public int[] nextGreaterElement_2(int[] nums1, int[] nums2) {
    int m = nums1.length;
    int n = nums2.length;
    int result[] = new int[m];
    int mark[] = new int[10001];
    for (int i = 0; i < n; i++) {
      mark[nums2[i]] = i;
    }
    for (int i = 0; i < m; i++) {
      result[i] = nextElement(mark[nums1[i]], nums2);
    }
    return result;
  }
}
