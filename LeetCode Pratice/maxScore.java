import java.util.Arrays;

/**
 * maxScore
 *
 * https://leetcode.com/problems/maximum-score-after-splitting-a-string/description/?envType=daily-question&envId=2023-12-22
 */
public class maxScore {

  public static void main(String[] args) {
    String s = "00111";
    System.out.println(new InnermaxScore().approach_2(s));
  }
}

/**
 * InnermaxScore
 */
class InnermaxScore {

  public int approach_1(String s) {
    int max_score = 0;
    int count_zero = 0, len = s.length();
    for (int i = 0; i <= len - 2; i++) {
      if (s.charAt(i) == '0') {
        count_zero++;
      }
      int temp_count_ones = 0;
      int temp_i = i;
      while (++temp_i <= len - 1) {
        System.out.printf("temp_i= %d \t", temp_i);
        if (s.charAt(temp_i) == '1') {
          temp_count_ones++;
        }
      }
      System.out.printf(
        "i=%d, count_zero=%d,temp_count_ones=%d\n",
        i,
        count_zero,
        temp_count_ones
      );
      max_score = Math.max(max_score, temp_count_ones + count_zero);
    }
    return max_score;
  }

  public int approach_2(String s) {
    int max_score = 0;
    int count_zero = 0, len = s.length();
    int temp_count_ones = 0;
    int ones_arr[] = new int[len];
    for (int i = len - 1; i >= 0; i--) {
      if (s.charAt(i) == '1') {
        temp_count_ones++;
      }
      ones_arr[i] = temp_count_ones;
    }
    System.out.println(Arrays.toString(ones_arr));
    for (int i = 0; i <= len - 2; i++) {
      if (s.charAt(i) == '0') {
        count_zero++;
      }
      max_score = Math.max(max_score, ones_arr[i + 1] + count_zero);
    }
    return max_score;
  }
}
