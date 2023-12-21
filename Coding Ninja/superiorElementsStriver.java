import java.util.ArrayList;
import java.util.List;

/**
 * superiorElementsStriver
 */
public class superiorElementsStriver {

  public static void main(String[] args) {
    int[] arr = { 5,4,3 };
    System.out.println(new Solution().superiorElements(arr).toString());
  }
}

class Solution {

  public List<Integer> superiorElements(int[] a) {
    List<Integer> ele = new ArrayList<>();
    int maxEle = Integer.MIN_VALUE;
    for (int i = a.length - 1; i > 0; i--) {
      if (a[i] > maxEle) {
        maxEle = a[i];
        ele.add(maxEle);
      }
    }
    return ele;
  }
}
