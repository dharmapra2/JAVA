/**
 * buyTwoChoco
 * https://leetcode.com/problems/buy-two-chocolates/submissions/1123933608/?envType=daily-question&envId=2023-12-20
 */
public class buyTwoChoco {

  public static void main(String[] args) {
    int choco[] = { 1, 2, 2 };
    int money = 3;
    System.out.println(new Solution().buyChoco(choco, money));
  }
}

class Solution {

  public int buyChoco(int[] prices, int money) {
    int smallNum = Integer.MAX_VALUE;
    int secSmallNum = Integer.MAX_VALUE;

    for (int i : prices) {
      if (i <= smallNum) {
        secSmallNum = smallNum;
        smallNum = i;
        continue;
      }
      if (i <= secSmallNum) {
        secSmallNum = i;
      }
    }
    System.out.printf("smallNum: %d, secSmallNum: %d\n", smallNum, secSmallNum);
    int moneyLeft = money - (smallNum + secSmallNum);
    return moneyLeft >= 0 ? moneyLeft : money;
  }
}
