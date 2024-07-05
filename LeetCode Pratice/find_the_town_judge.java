import java.util.Arrays;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/find-the-town-judge/?envType=daily-question&envId=2024-02-22
 * find_the_town_judge
 */
public class find_the_town_judge {

  public static void main(String[] args) {
    int arr[][] = { { 1, 3 }, { 2, 3 }, { 3, 1 } };
    Innerfind_the_town_judge sol = new Innerfind_the_town_judge();
    System.out.println(sol.findJudge(arr.length, arr));
  }
}

/**
 * Innerfind_the_town_judge
 */
class Innerfind_the_town_judge {

  int findJudge(int n, int[][] trust) {
    int[] count = new int[n + 1];
    int num = -1;
    for (int i = 0; i < trust.length; i++) {
      int num1 = trust[i][0], num2 = trust[i][1];
      count[num1 - 1]--;
      count[num2 - 1]++;
      if (count[num1 - 1] == n - 1) {
        num = num1;
      } else if (count[num2 - 1] == n - 1) {
        num = num2;
      }
      System.out.printf(
        "num1= %d, num2= %d, Str=%s, n=%d\n",
        num1,
        num2,
        Arrays.toString(count),
        num
      );
    }
    return num;
  }
}
