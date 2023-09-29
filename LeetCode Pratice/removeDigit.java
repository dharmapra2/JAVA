/**
 *
 * https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/
 *
 * You are given a string number representing a positive integer and a *
 * character digit.
 * Return the resulting string after removing exactly one occurrence of digit
 * from number such that the value of the resulting string in decimal form is
 * maximized. The test cases are generated such that digit occurs at least
 * once in number.
 */

class removeDigit {

  public static void main(String[] args) {
    String str = args[0];
    char ch = args[1].charAt(0);
    System.out.println(new Solution().removeDigit(str, ch));
  }
}

class Solution {

  public String removeDigit(String number, char digit) {
    StringBuilder sb1 = new StringBuilder("0");
    int index = 0;
    while ((index = number.indexOf(digit, index)) >= 0) {
      StringBuilder sb = new StringBuilder(number);
      // System.out.printf("%d -> %s, \n", index, sb);
      if (sb.charAt(index) == digit) {
        sb.deleteCharAt(index);
        if (sb.compareTo(sb1) > 0) {
          sb1 = sb;
        }
      }
      index++;
    }
    return sb1.toString();
  }
}
/*

Example 1:

Input: number = "123", digit = "3"
Output: "12"
Explanation: There is only one '3' in "123". After removing '3', the result is "12".

Example 2:

Input: number = "1231", digit = "1"
Output: "231"
Explanation: We can remove the first '1' to get "231" or remove the second '1' to get "123".
Since 231 > 123, we return "231".

Example 3:

Input: number = "551", digit = "5"
Output: "51"
Explanation: We can remove either the first or second '5' from "551".
Both result in the string "51".

Example 4:

Input: number = "551", digit = "5"
Output: "51"

 * "2998589353917872714814599237991174513476623756395992135212546127959342974628712329595771672911914471"
 * "3"
 * 299858935397872714814599237991174513476623756395992135212546127959342974628712329595771672911914471
 * 299858935391787271481459923799117451347662375639599213521254612795934297462871229595771672911914471
 */
