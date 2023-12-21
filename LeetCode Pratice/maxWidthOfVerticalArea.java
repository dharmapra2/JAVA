import java.util.Arrays;

public class maxWidthOfVerticalArea {

  public static void main(String[] args) {
    int points[][] = {
      { 3, 1 },
      { 9, 0 },
      { 1, 0 },
      { 1, 4 },
      { 5, 3 },
      { 8, 8 },
    };
    System.out.println(new Solution().maxWidthOfVerticalArea(points));
  }
}

class Solution {

  public int maxWidthOfVerticalArea(int[][] points) {
    int len = points.length;
    int arr[] = new int[len];

    for (int i = 0; i < len; i++) {
      arr[i] = points[i][0];
    }
    Arrays.sort(arr);
    int maxWidth = 0;
    for (int i = 0; i < len; i++) {
      maxWidth = Math.max(maxWidth, arr[i] - arr[i - 1]);
    }
    return maxWidth;
  }
}
