/**
 * https://leetcode.com/problems/bitwise-and-of-numbers-range/description/?envType=daily-question&envId=2024-02-21
 * bitwise_and_of_numbers_range
 */
public class bitwise_and_of_numbers_range {

  public static void main(String[] args) {
    Innerbitwise_and_of_numbers_range sol = new Innerbitwise_and_of_numbers_range();
    System.out.println(sol.rangeBitwiseAnd_approach_2(5, 7));
  }
}

/**
 * Innerbitwise_and_of_numbers_range
 */
class Innerbitwise_and_of_numbers_range {

  public int rangeBitwiseAnd(int left, int right) {
    int shiftCount = 0;
    while (left > 0 && right > 0 && left != right) {
      shiftCount++;
      left >>= 1;
      right >>= 1;
      System.out.printf(
        "left= %d, right=%d, count=%d\n",
        left,
        right,
        shiftCount
      );
    }
    return left << shiftCount;
  }

  public int rangeBitwiseAnd_approach_2(int left, int right) {
    while (right > left) {
      right &= (right - 1);
      System.out.printf("left= %d, right=%d\n", left, right);
    }
    return right;
  }
}
