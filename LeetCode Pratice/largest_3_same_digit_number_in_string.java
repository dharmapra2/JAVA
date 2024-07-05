/**
 * largest_3_same_digit_number_in_string
 */
public class largest_3_same_digit_number_in_string {

  public static void main(String[] args) {
    String str = "2300019";
    Innerlargest_3_same_digit_number_in_string sol = new Innerlargest_3_same_digit_number_in_string();
    System.out.println(sol.largestGoodInteger(str));
  }
}

/**
 * Innerlargest_3_same_digit_number_in_string
 */
class Innerlargest_3_same_digit_number_in_string {

  public String largestGoodInteger(String num) {
    int strlen = num.length();
    int largerNum = Integer.MIN_VALUE;

    for (int i = 2; i < strlen; i++) {
      char num1 = num.charAt(i - 2);
      char num2 = num.charAt(i - 1);
      char num3 = num.charAt(i);

      if ((num1 == num2) && (num2 == num3)) {
        largerNum = Math.max(largerNum, num3 - '0');
      }
    }
    return largerNum != Integer.MIN_VALUE
      ? Integer.toString(largerNum).repeat(3)
      : "";
  }
}
