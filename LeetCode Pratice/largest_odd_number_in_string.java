/**
 * largest_odd_number_in_string
 */
public class largest_odd_number_in_string {

  public static void main(String[] args) {
    String str = "57525534";
    Innerlargest_odd_number_in_string sol = new Innerlargest_odd_number_in_string();
    System.out.println(sol.largestOddNumber(str));
  }
}

/**
 * Innerlargest_odd_number_in_string
 */
class Innerlargest_odd_number_in_string {

  public String largestOddNumber(String s) {
    int strLen = s.length() - 1;

    for (int i = strLen; i >= 0; i--) {
      // Convert char to int correctly
      int temp_num = Character.getNumericValue(s.charAt(i));
      if ((temp_num & 1) == 1) {
        return s.substring(0, i + 1);
      }
    }

    return "";
  }
}
