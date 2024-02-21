import java.util.Arrays;

/**
 * https://leetcode.com/problems/furthest-building-you-can-reach/submissions/1178094096/?envType=daily-question&envId=2024-02-17
 * 
 * Need to complete this
 */
public class furthest_building_you_can_reach {

  public static void main(String[] args) {
    int arr[] = { 4, 2, 7, 6, 9, 14, 12 };
    int bricks = 5, ladders = 1;
    Innerfurthest_building_you_can_reach sol = new Innerfurthest_building_you_can_reach();
    System.out.println(sol.furthestBuilding(arr, bricks, ladders));
  }
}

/**
 * Innerfurthest_building_you_can_reach
 */
class Innerfurthest_building_you_can_reach {

  public int furthestBuilding(int[] heights, int bricks, int ladders) {
    int len = heights.length;
    int heightArr[] = new int[len - 1];
    for (int i = 1; i < len; i++) {
      int temp_cal = heights[i] - heights[i - 1];
      heightArr[i - 1] = temp_cal <= 0 ? 0 : temp_cal;
    }
    System.out.println(Arrays.toString(heightArr));
    int building = 0;
    for (int i = 0; i < len - 1; i++) {
      int temp_val = heightArr[i];

      if (temp_val <= bricks) {
        bricks -= temp_val;
        building++;
      } else if (ladders > 0) {
        ladders--;
        building++;
      } else {
        break;
      }
      System.out.printf(
        "item= %d, bricks=%d, ladders=%d\n",
        temp_val,
        bricks,
        ladders
      );
    }
    return building;
  }
}
